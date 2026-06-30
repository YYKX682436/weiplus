package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class x3 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseBooleanArray f101595d = new android.util.SparseBooleanArray();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavImgGalleryUI f101596e;

    public x3(com.tencent.mm.plugin.fav.ui.FavImgGalleryUI favImgGalleryUI, com.tencent.mm.plugin.fav.ui.n3 n3Var) {
        this.f101596e = favImgGalleryUI;
    }

    public final void a(com.tencent.mm.plugin.fav.ui.z3 z3Var, android.graphics.Bitmap bitmap, java.lang.String str) {
        z3Var.f101644d.setVisibility(8);
        z3Var.f101645e.setVisibility(8);
        z3Var.f101643c.setVisibility(8);
        android.view.View view = z3Var.f101641a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ImageAdapter", "dealSuc", "(Lcom/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ViewHolder;Landroid/graphics/Bitmap;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ImageAdapter", "dealSuc", "(Lcom/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ViewHolder;Landroid/graphics/Bitmap;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        z3Var.f101646f.setVisibility(8);
        f(z3Var, bitmap, str);
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.plugin.fav.ui.gallery.r getItem(int i17) {
        com.tencent.mm.plugin.fav.ui.FavImgGalleryUI favImgGalleryUI = this.f101596e;
        if (i17 < favImgGalleryUI.f100360g.size()) {
            return (com.tencent.mm.plugin.fav.ui.gallery.r) favImgGalleryUI.f100360g.get(i17);
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.FavImgGalleryUI", "get item fail, position %d error", java.lang.Integer.valueOf(i17));
        return null;
    }

    public final android.graphics.Bitmap d(com.tencent.mm.plugin.fav.ui.gallery.r rVar) {
        android.graphics.Bitmap u17;
        return (rVar == null || (u17 = rVar.u()) == null) ? bp.b.decodeResource(this.f101596e.getResources(), com.tencent.mm.R.raw.download_image_icon, null) : u17;
    }

    public final void f(com.tencent.mm.plugin.fav.ui.z3 z3Var, android.graphics.Bitmap bitmap, java.lang.String str) {
        java.lang.Object obj;
        com.tencent.mm.plugin.fav.ui.FavImgGalleryUI favImgGalleryUI = this.f101596e;
        int width = z3Var.f101642b.getWidth();
        int height = z3Var.f101642b.getHeight();
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.reset();
        float width2 = bitmap.getWidth() / bitmap.getHeight();
        float f17 = 1.0f;
        if (bitmap.getHeight() / bitmap.getWidth() >= 2.0f && bitmap.getHeight() >= 480) {
            float f18 = width;
            float width3 = f18 / bitmap.getWidth();
            if (bitmap.getWidth() / f18 > 1.0d) {
                matrix.postScale(width3, width3);
                bitmap.getHeight();
                matrix.postTranslate((f18 - (bitmap.getWidth() * width3)) / 2.0f, 0.0f);
            } else {
                matrix.postScale(1.0f, 1.0f);
                matrix.postTranslate((width - bitmap.getWidth()) / 2, 0.0f);
            }
        } else if (width2 < 2.0f || bitmap.getWidth() < 480) {
            float f19 = width;
            float width4 = f19 / bitmap.getWidth();
            float f27 = height;
            float height2 = f27 / bitmap.getHeight();
            if (width4 >= height2) {
                width4 = height2;
            }
            float width5 = bitmap.getWidth() / f19;
            float height3 = bitmap.getHeight() / f27;
            if (width5 <= height3) {
                width5 = height3;
            }
            if (width5 > 1.0d) {
                matrix.postScale(width4, width4);
                f17 = width4;
            }
            matrix.postTranslate((f19 - (bitmap.getWidth() * f17)) / 2.0f, (f27 - (bitmap.getHeight() * f17)) / 2.0f);
        } else {
            float height4 = bitmap.getHeight() / 480.0f;
            float height5 = 480.0f / bitmap.getHeight();
            if (height4 > 1.0d) {
                matrix.postScale(height4, height5);
                matrix.postTranslate(0.0f, (height - 480) / 2);
            } else {
                matrix.postScale(1.0f, 1.0f);
                matrix.postTranslate(0.0f, (height - bitmap.getHeight()) / 2);
            }
        }
        z3Var.f101642b.setImageMatrix(matrix);
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = z3Var.f101642b;
        int width6 = bitmap.getWidth();
        int height6 = bitmap.getHeight();
        multiTouchImageView.f197651o = width6;
        multiTouchImageView.f197652p = height6;
        z3Var.f101642b.setMaxZoomDoubleTab(true);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            z3Var.f101642b.setImageBitmap(bitmap);
            return;
        }
        try {
            com.tencent.mm.plugin.gif.k kVar = new com.tencent.mm.plugin.gif.k(str);
            z3Var.f101642b.setGifDrawable(kVar);
            com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView2 = z3Var.f101642b;
            int B = i65.a.B(favImgGalleryUI.getContext());
            multiTouchImageView2.f197658u = i65.a.k(favImgGalleryUI.getContext());
            multiTouchImageView2.f197657t = B;
            com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView3 = z3Var.f101642b;
            int intrinsicWidth = kVar.getIntrinsicWidth();
            int intrinsicHeight = kVar.getIntrinsicHeight();
            multiTouchImageView3.f197651o = intrinsicWidth;
            multiTouchImageView3.f197652p = intrinsicHeight;
            com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView4 = z3Var.f101642b;
            if (multiTouchImageView4.f197653p0 && (obj = multiTouchImageView4.f197662x0) != null) {
                ((og5.e) obj).start();
            }
            z3Var.f101642b.h();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavImgGalleryUI", com.tencent.mm.sdk.platformtools.z3.c(e17));
            z3Var.f101642b.setImageBitmap(bitmap);
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f101596e.f100360g.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.fav.ui.z3 z3Var;
        android.view.View view2;
        com.tencent.mm.plugin.fav.ui.FavImgGalleryUI favImgGalleryUI = this.f101596e;
        if (view == null) {
            z3Var = new com.tencent.mm.plugin.fav.ui.z3(favImgGalleryUI, null);
            view2 = android.view.View.inflate(favImgGalleryUI.getContext(), com.tencent.mm.R.layout.ab8, null);
            z3Var.f101641a = view2.findViewById(com.tencent.mm.R.id.h9e);
            z3Var.f101642b = (com.tencent.mm.ui.base.MultiTouchImageView) view2.findViewById(com.tencent.mm.R.id.h88);
            z3Var.f101644d = (android.widget.ProgressBar) view2.findViewById(com.tencent.mm.R.id.d4_);
            z3Var.f101643c = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.f487295o70);
            z3Var.f101645e = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.d4a);
            z3Var.f101646f = (android.widget.LinearLayout) view2.findViewById(com.tencent.mm.R.id.du_);
            ((android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.dua)).setText(com.tencent.mm.R.string.c_q);
            view2.setTag(z3Var);
        } else {
            z3Var = (com.tencent.mm.plugin.fav.ui.z3) view.getTag();
            view2 = view;
        }
        view2.setLayoutParams(new android.widget.Gallery.LayoutParams(-1, -1));
        com.tencent.mm.plugin.fav.ui.gallery.r item = getItem(i17);
        android.util.SparseBooleanArray sparseBooleanArray = this.f101595d;
        boolean z17 = sparseBooleanArray.get(i17, true);
        sparseBooleanArray.put(i17, false);
        android.graphics.Bitmap d17 = item.d(z17);
        if (item.p() != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavImgGalleryUI", "index %d item favid %d, localid %d, itemStatus %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(item.o()), java.lang.Long.valueOf(item.s()), java.lang.Integer.valueOf(item.r()));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FavImgGalleryUI", "item dataId %s, item data url %s, key %s, fullsize %d, thumb url %s, key %s, thumb size %d", item.i(), item.f(), item.e(), java.lang.Long.valueOf(item.q()), item.h(), item.g(), java.lang.Long.valueOf(item.v()));
        if (d17 != null) {
            favImgGalleryUI.enableOptionMenu(true);
            if (com.tencent.mm.sdk.platformtools.y1.c(item.j())) {
                a(z3Var, d17, item.j());
            } else {
                a(z3Var, d17, "");
            }
            return view2;
        }
        favImgGalleryUI.enableOptionMenu(false);
        com.tencent.mars.xlog.Log.w("MicroMsg.FavImgGalleryUI", "get big image fail");
        o72.e2 Xf = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Xf(item.i());
        if (Xf != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavImgGalleryUI", "fav cdnInfo status %d", java.lang.Integer.valueOf(Xf.field_status));
            z3Var.f101644d.setVisibility(0);
            z3Var.f101645e.setVisibility(0);
            z3Var.f101643c.setVisibility(0);
            android.view.View view3 = z3Var.f101641a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ImageAdapter", "dealDownloading", "(Lcom/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ViewHolder;Lcom/tencent/mm/plugin/fav/ui/gallery/FavImgDataItem;Lcom/tencent/mm/plugin/fav/api/FavCdnInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ImageAdapter", "dealDownloading", "(Lcom/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ViewHolder;Lcom/tencent/mm/plugin/fav/ui/gallery/FavImgDataItem;Lcom/tencent/mm/plugin/fav/api/FavCdnInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            z3Var.f101643c.setImageBitmap(d(item));
            int i18 = Xf.field_totalLen > 0 ? ((Xf.field_offset * 100) / r1) - 1 : 0;
            int i19 = i18 >= 0 ? i18 : 0;
            z3Var.f101644d.setProgress(i19);
            z3Var.f101645e.setText(i19 + "%");
            return view2;
        }
        z3Var.f101646f.setVisibility(8);
        if (item.o() < 0) {
            z3Var.f101644d.setVisibility(0);
            z3Var.f101645e.setVisibility(0);
            z3Var.f101643c.setVisibility(0);
            android.view.View view4 = z3Var.f101641a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ImageAdapter", "dealFailed", "(Lcom/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ViewHolder;Lcom/tencent/mm/plugin/fav/ui/gallery/FavImgDataItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ImageAdapter", "dealFailed", "(Lcom/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ViewHolder;Lcom/tencent/mm/plugin/fav/ui/gallery/FavImgDataItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            z3Var.f101643c.setImageBitmap(d(item));
            z3Var.f101644d.setProgress(0);
            z3Var.f101645e.setText("0%");
        } else {
            z3Var.f101644d.setVisibility(8);
            z3Var.f101645e.setVisibility(8);
            z3Var.f101643c.setVisibility(8);
            android.view.View view5 = z3Var.f101641a;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ImageAdapter", "dealFailed", "(Lcom/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ViewHolder;Lcom/tencent/mm/plugin/fav/ui/gallery/FavImgDataItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ImageAdapter", "dealFailed", "(Lcom/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ViewHolder;Lcom/tencent/mm/plugin/fav/ui/gallery/FavImgDataItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (item.l() != 0) {
                z3Var.f101646f.setVisibility(0);
            }
            f(z3Var, d(item), "");
        }
        return view2;
    }
}
