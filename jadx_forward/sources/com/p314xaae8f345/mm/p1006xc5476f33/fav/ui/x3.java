package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class x3 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseBooleanArray f183128d = new android.util.SparseBooleanArray();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13568x82804f7e f183129e;

    public x3(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13568x82804f7e activityC13568x82804f7e, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.n3 n3Var) {
        this.f183129e = activityC13568x82804f7e;
    }

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z3 z3Var, android.graphics.Bitmap bitmap, java.lang.String str) {
        z3Var.f183177d.setVisibility(8);
        z3Var.f183178e.setVisibility(8);
        z3Var.f183176c.setVisibility(8);
        android.view.View view = z3Var.f183174a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ImageAdapter", "dealSuc", "(Lcom/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ViewHolder;Landroid/graphics/Bitmap;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ImageAdapter", "dealSuc", "(Lcom/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ViewHolder;Landroid/graphics/Bitmap;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        z3Var.f183179f.setVisibility(8);
        f(z3Var, bitmap, str);
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.r getItem(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13568x82804f7e activityC13568x82804f7e = this.f183129e;
        if (i17 < activityC13568x82804f7e.f181893g.size()) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.r) activityC13568x82804f7e.f181893g.get(i17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavImgGalleryUI", "get item fail, position %d error", java.lang.Integer.valueOf(i17));
        return null;
    }

    public final android.graphics.Bitmap d(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.r rVar) {
        android.graphics.Bitmap u17;
        return (rVar == null || (u17 = rVar.u()) == null) ? bp.b.m10969xb866ec1c(this.f183129e.getResources(), com.p314xaae8f345.mm.R.raw.f78994x211254f4, null) : u17;
    }

    public final void f(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z3 z3Var, android.graphics.Bitmap bitmap, java.lang.String str) {
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13568x82804f7e activityC13568x82804f7e = this.f183129e;
        int width = z3Var.f183175b.getWidth();
        int height = z3Var.f183175b.getHeight();
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
        z3Var.f183175b.setImageMatrix(matrix);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = z3Var.f183175b;
        int width6 = bitmap.getWidth();
        int height6 = bitmap.getHeight();
        c21524xecd57b9a.f279184o = width6;
        c21524xecd57b9a.f279185p = height6;
        z3Var.f183175b.m79201x4cf4f0ef(true);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            z3Var.f183175b.setImageBitmap(bitmap);
            return;
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.gif.k kVar = new com.p314xaae8f345.mm.p1006xc5476f33.gif.k(str);
            z3Var.f183175b.m79196x703a2ac0(kVar);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a2 = z3Var.f183175b;
            int B = i65.a.B(activityC13568x82804f7e.mo55332x76847179());
            c21524xecd57b9a2.f279191u = i65.a.k(activityC13568x82804f7e.mo55332x76847179());
            c21524xecd57b9a2.f279190t = B;
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a3 = z3Var.f183175b;
            int intrinsicWidth = kVar.getIntrinsicWidth();
            int intrinsicHeight = kVar.getIntrinsicHeight();
            c21524xecd57b9a3.f279184o = intrinsicWidth;
            c21524xecd57b9a3.f279185p = intrinsicHeight;
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a4 = z3Var.f183175b;
            if (c21524xecd57b9a4.f279186p0 && (obj = c21524xecd57b9a4.f279195x0) != null) {
                ((og5.e) obj).start();
            }
            z3Var.f183175b.h();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavImgGalleryUI", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            z3Var.f183175b.setImageBitmap(bitmap);
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f183129e.f181893g.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z3 z3Var;
        android.view.View view2;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13568x82804f7e activityC13568x82804f7e = this.f183129e;
        if (view == null) {
            z3Var = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z3(activityC13568x82804f7e, null);
            view2 = android.view.View.inflate(activityC13568x82804f7e.mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.ab8, null);
            z3Var.f183174a = view2.findViewById(com.p314xaae8f345.mm.R.id.h9e);
            z3Var.f183175b = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a) view2.findViewById(com.p314xaae8f345.mm.R.id.h88);
            z3Var.f183177d = (android.widget.ProgressBar) view2.findViewById(com.p314xaae8f345.mm.R.id.d4_);
            z3Var.f183176c = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.f568828o70);
            z3Var.f183178e = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.d4a);
            z3Var.f183179f = (android.widget.LinearLayout) view2.findViewById(com.p314xaae8f345.mm.R.id.du_);
            ((android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.dua)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.c_q);
            view2.setTag(z3Var);
        } else {
            z3Var = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z3) view.getTag();
            view2 = view;
        }
        view2.setLayoutParams(new android.widget.Gallery.LayoutParams(-1, -1));
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.r item = getItem(i17);
        android.util.SparseBooleanArray sparseBooleanArray = this.f183128d;
        boolean z17 = sparseBooleanArray.get(i17, true);
        sparseBooleanArray.put(i17, false);
        android.graphics.Bitmap d17 = item.d(z17);
        if (item.p() != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavImgGalleryUI", "index %d item favid %d, localid %d, itemStatus %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(item.o()), java.lang.Long.valueOf(item.s()), java.lang.Integer.valueOf(item.r()));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavImgGalleryUI", "item dataId %s, item data url %s, key %s, fullsize %d, thumb url %s, key %s, thumb size %d", item.i(), item.f(), item.e(), java.lang.Long.valueOf(item.q()), item.h(), item.g(), java.lang.Long.valueOf(item.v()));
        if (d17 != null) {
            activityC13568x82804f7e.m78501x43e00957(true);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.c(item.j())) {
                a(z3Var, d17, item.j());
            } else {
                a(z3Var, d17, "");
            }
            return view2;
        }
        activityC13568x82804f7e.m78501x43e00957(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavImgGalleryUI", "get big image fail");
        o72.e2 Xf = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Xf(item.i());
        if (Xf != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavImgGalleryUI", "fav cdnInfo status %d", java.lang.Integer.valueOf(Xf.f67093x10a0fed7));
            z3Var.f183177d.setVisibility(0);
            z3Var.f183178e.setVisibility(0);
            z3Var.f183176c.setVisibility(0);
            android.view.View view3 = z3Var.f183174a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ImageAdapter", "dealDownloading", "(Lcom/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ViewHolder;Lcom/tencent/mm/plugin/fav/ui/gallery/FavImgDataItem;Lcom/tencent/mm/plugin/fav/api/FavCdnInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ImageAdapter", "dealDownloading", "(Lcom/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ViewHolder;Lcom/tencent/mm/plugin/fav/ui/gallery/FavImgDataItem;Lcom/tencent/mm/plugin/fav/api/FavCdnInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            z3Var.f183176c.setImageBitmap(d(item));
            int i18 = Xf.f67094xeb1a61d6 > 0 ? ((Xf.f67090x90a9378 * 100) / r1) - 1 : 0;
            int i19 = i18 >= 0 ? i18 : 0;
            z3Var.f183177d.setProgress(i19);
            z3Var.f183178e.setText(i19 + "%");
            return view2;
        }
        z3Var.f183179f.setVisibility(8);
        if (item.o() < 0) {
            z3Var.f183177d.setVisibility(0);
            z3Var.f183178e.setVisibility(0);
            z3Var.f183176c.setVisibility(0);
            android.view.View view4 = z3Var.f183174a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ImageAdapter", "dealFailed", "(Lcom/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ViewHolder;Lcom/tencent/mm/plugin/fav/ui/gallery/FavImgDataItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ImageAdapter", "dealFailed", "(Lcom/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ViewHolder;Lcom/tencent/mm/plugin/fav/ui/gallery/FavImgDataItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            z3Var.f183176c.setImageBitmap(d(item));
            z3Var.f183177d.setProgress(0);
            z3Var.f183178e.setText("0%");
        } else {
            z3Var.f183177d.setVisibility(8);
            z3Var.f183178e.setVisibility(8);
            z3Var.f183176c.setVisibility(8);
            android.view.View view5 = z3Var.f183174a;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ImageAdapter", "dealFailed", "(Lcom/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ViewHolder;Lcom/tencent/mm/plugin/fav/ui/gallery/FavImgDataItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ImageAdapter", "dealFailed", "(Lcom/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ViewHolder;Lcom/tencent/mm/plugin/fav/ui/gallery/FavImgDataItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (item.l() != 0) {
                z3Var.f183179f.setVisibility(0);
            }
            f(z3Var, d(item), "");
        }
        return view2;
    }
}
