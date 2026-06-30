package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public class f0 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseBooleanArray f100916d = new android.util.SparseBooleanArray();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI f100917e;

    public f0(com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI favMediaGalleryUI, com.tencent.mm.plugin.fav.ui.gallery.v vVar) {
        this.f100917e = favMediaGalleryUI;
    }

    public final void a(com.tencent.mm.plugin.fav.ui.gallery.g0 g0Var, android.graphics.Bitmap bitmap, java.lang.String str) {
        g0Var.f100927d.setVisibility(8);
        g0Var.f100928e.setVisibility(8);
        g0Var.f100926c.setVisibility(8);
        android.view.View view = g0Var.f100924a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ImageAdapter", "dealSuc", "(Lcom/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ViewHolder;Landroid/graphics/Bitmap;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ImageAdapter", "dealSuc", "(Lcom/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ViewHolder;Landroid/graphics/Bitmap;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        g0Var.f100929f.setVisibility(8);
        f(g0Var, bitmap, str);
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.plugin.fav.ui.gallery.r getItem(int i17) {
        com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI favMediaGalleryUI = this.f100917e;
        if (i17 < favMediaGalleryUI.f100874h.size()) {
            return (com.tencent.mm.plugin.fav.ui.gallery.r) favMediaGalleryUI.f100874h.get(i17);
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.FavMediaGalleryUI", "get item fail, position %d error", java.lang.Integer.valueOf(i17));
        return null;
    }

    public final android.graphics.Bitmap d(com.tencent.mm.plugin.fav.ui.gallery.r rVar) {
        android.graphics.Bitmap u17;
        return (rVar == null || (u17 = rVar.u()) == null) ? bp.b.decodeResource(this.f100917e.getResources(), com.tencent.mm.R.raw.download_image_icon, null) : u17;
    }

    public final void f(com.tencent.mm.plugin.fav.ui.gallery.g0 g0Var, android.graphics.Bitmap bitmap, java.lang.String str) {
        java.lang.Object obj;
        com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI favMediaGalleryUI = this.f100917e;
        int width = g0Var.f100925b.getWidth();
        int height = g0Var.f100925b.getHeight();
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
        g0Var.f100925b.setImageMatrix(matrix);
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = g0Var.f100925b;
        int width6 = bitmap.getWidth();
        int height6 = bitmap.getHeight();
        multiTouchImageView.f197651o = width6;
        multiTouchImageView.f197652p = height6;
        g0Var.f100925b.setMaxZoomDoubleTab(true);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            g0Var.f100925b.setImageBitmap(bitmap);
            return;
        }
        try {
            com.tencent.mm.plugin.gif.k kVar = new com.tencent.mm.plugin.gif.k(str);
            g0Var.f100925b.setGifDrawable(kVar);
            com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView2 = g0Var.f100925b;
            int B = i65.a.B(favMediaGalleryUI.getContext());
            multiTouchImageView2.f197658u = i65.a.k(favMediaGalleryUI.getContext());
            multiTouchImageView2.f197657t = B;
            com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView3 = g0Var.f100925b;
            int intrinsicWidth = kVar.getIntrinsicWidth();
            int intrinsicHeight = kVar.getIntrinsicHeight();
            multiTouchImageView3.f197651o = intrinsicWidth;
            multiTouchImageView3.f197652p = intrinsicHeight;
            com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView4 = g0Var.f100925b;
            if (multiTouchImageView4.f197653p0 && (obj = multiTouchImageView4.f197662x0) != null) {
                ((og5.e) obj).start();
            }
            g0Var.f100925b.h();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavMediaGalleryUI", com.tencent.mm.sdk.platformtools.z3.c(e17));
            g0Var.f100925b.setImageBitmap(bitmap);
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f100917e.f100874h.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI favMediaGalleryUI = this.f100917e;
        if (i17 > favMediaGalleryUI.f100874h.size()) {
            return 2;
        }
        return ((com.tencent.mm.plugin.fav.ui.gallery.r) favMediaGalleryUI.f100874h.get(i17)).k();
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        int i18;
        com.tencent.mm.plugin.fav.ui.gallery.g0 g0Var;
        android.view.View view3;
        com.tencent.mm.plugin.fav.ui.gallery.r item = getItem(i17);
        java.util.Objects.toString(view);
        java.util.Objects.toString(viewGroup);
        item.k();
        com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI favMediaGalleryUI = this.f100917e;
        int i19 = favMediaGalleryUI.f100870d;
        if (i19 != i17 && java.lang.Math.abs(i19 - i17) > 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavMediaGalleryUI", "getView not selected, " + favMediaGalleryUI.f100870d + ", " + i17);
            if (view != null) {
                return view;
            }
            if (item.k() == 15 || item.k() == 4) {
                return new com.tencent.mm.plugin.fav.ui.widget.FavVideoView(favMediaGalleryUI.getContext(), null);
            }
            com.tencent.mm.plugin.fav.ui.gallery.g0 g0Var2 = new com.tencent.mm.plugin.fav.ui.gallery.g0(favMediaGalleryUI, null);
            android.view.View inflate = android.view.View.inflate(favMediaGalleryUI.getContext(), com.tencent.mm.R.layout.ab8, null);
            g0Var2.f100924a = inflate.findViewById(com.tencent.mm.R.id.h9e);
            g0Var2.f100925b = (com.tencent.mm.ui.base.MultiTouchImageView) inflate.findViewById(com.tencent.mm.R.id.h88);
            g0Var2.f100927d = (android.widget.ProgressBar) inflate.findViewById(com.tencent.mm.R.id.d4_);
            g0Var2.f100926c = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.f487295o70);
            g0Var2.f100928e = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.d4a);
            g0Var2.f100929f = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.du_);
            ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.dua)).setText(com.tencent.mm.R.string.c_q);
            inflate.setTag(g0Var2);
            return inflate;
        }
        if (item.k() == 15 || item.k() == 4) {
            if (view == null) {
                view2 = new com.tencent.mm.plugin.fav.ui.widget.FavVideoView(favMediaGalleryUI.getContext(), null);
                ((java.util.ArrayList) favMediaGalleryUI.f100877n).add(view2);
            } else {
                view2 = view;
            }
            java.lang.String j17 = item.j();
            java.util.HashMap hashMap = favMediaGalleryUI.f100878o;
            java.util.List list = (java.util.List) hashMap.get(j17);
            if (list == null) {
                list = new java.util.ArrayList();
            }
            com.tencent.mm.plugin.fav.ui.widget.FavVideoView favVideoView = (com.tencent.mm.plugin.fav.ui.widget.FavVideoView) view2;
            list.add(favVideoView);
            hashMap.put(j17, list);
            favVideoView.f101571i.setVisibility(8);
            favVideoView.setCallback(new com.tencent.mm.plugin.fav.ui.gallery.e0(this));
            if (com.tencent.mm.vfs.w6.j(j17)) {
                favVideoView.setVideoData(j17);
            } else {
                java.lang.String i27 = item.i();
                o72.e2 Xf = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Xf(i27);
                if (Xf == null || (i18 = Xf.field_status) != 1) {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(item.f()) || com.tencent.mm.sdk.platformtools.t8.K0(item.e())) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.FavMediaGalleryUI", "getView, no video, cdn data invalid");
                        favVideoView.j(j17, false, i27);
                        favVideoView.f101571i.setVisibility(0);
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.FavMediaGalleryUI", "getView, no video, start download, dataId:%s", i27);
                        item.y();
                        favVideoView.j(j17, true, i27);
                    }
                } else if (i18 == 1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FavMediaGalleryUI", "getView, no video but downloading, dataId:%s", i27);
                    favVideoView.j(j17, true, i27);
                }
            }
            java.lang.String w17 = item.w();
            if (com.tencent.mm.vfs.w6.j(w17)) {
                favVideoView.setThumbView(w17);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.FavMediaGalleryUI", "getView, no thumb, start download, path:%s", w17);
                item.y();
            }
            favVideoView.setVideoScaleType(com.tencent.mm.pluginsdk.ui.e1.CONTAIN);
            return view2;
        }
        if (view == null) {
            g0Var = new com.tencent.mm.plugin.fav.ui.gallery.g0(favMediaGalleryUI, null);
            view3 = android.view.View.inflate(favMediaGalleryUI.getContext(), com.tencent.mm.R.layout.ab8, null);
            g0Var.f100924a = view3.findViewById(com.tencent.mm.R.id.h9e);
            g0Var.f100925b = (com.tencent.mm.ui.base.MultiTouchImageView) view3.findViewById(com.tencent.mm.R.id.h88);
            g0Var.f100927d = (android.widget.ProgressBar) view3.findViewById(com.tencent.mm.R.id.d4_);
            g0Var.f100926c = (android.widget.ImageView) view3.findViewById(com.tencent.mm.R.id.f487295o70);
            g0Var.f100928e = (android.widget.TextView) view3.findViewById(com.tencent.mm.R.id.d4a);
            g0Var.f100929f = (android.widget.LinearLayout) view3.findViewById(com.tencent.mm.R.id.du_);
            ((android.widget.TextView) view3.findViewById(com.tencent.mm.R.id.dua)).setText(com.tencent.mm.R.string.c_q);
            view3.setTag(g0Var);
        } else {
            g0Var = (com.tencent.mm.plugin.fav.ui.gallery.g0) view.getTag();
            view3 = view;
        }
        view3.setLayoutParams(new android.widget.Gallery.LayoutParams(-1, -1));
        android.util.SparseBooleanArray sparseBooleanArray = this.f100916d;
        boolean z17 = sparseBooleanArray.get(i17, true);
        sparseBooleanArray.put(i17, false);
        android.graphics.Bitmap d17 = item.d(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavMediaGalleryUI", "index %d item favid %d, localid %d, itemStatus %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(item.o()), java.lang.Long.valueOf(item.s()), java.lang.Integer.valueOf(item.r()));
        com.tencent.mars.xlog.Log.i("MicroMsg.FavMediaGalleryUI", "item dataId %s, item data url %s, key %s, fullsize %d, thumb url %s, key %s, thumb size %d", item.i(), item.f(), item.e(), java.lang.Long.valueOf(item.q()), item.h(), item.g(), java.lang.Long.valueOf(item.v()));
        if (d17 != null || !item.x()) {
            favMediaGalleryUI.enableOptionMenu(true);
            if (com.tencent.mm.sdk.platformtools.y1.c(item.j())) {
                a(g0Var, d17, item.j());
            } else {
                a(g0Var, d17, "");
            }
            return view3;
        }
        favMediaGalleryUI.enableOptionMenu(false);
        com.tencent.mars.xlog.Log.w("MicroMsg.FavMediaGalleryUI", "get big image fail");
        o72.e2 Xf2 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Xf(item.i());
        if (Xf2 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavMediaGalleryUI", "fav cdnInfo status %d", java.lang.Integer.valueOf(Xf2.field_status));
            g0Var.f100927d.setVisibility(0);
            g0Var.f100928e.setVisibility(0);
            g0Var.f100926c.setVisibility(0);
            android.view.View view4 = g0Var.f100924a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ImageAdapter", "dealDownloading", "(Lcom/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ViewHolder;Lcom/tencent/mm/plugin/fav/ui/gallery/FavImgDataItem;Lcom/tencent/mm/plugin/fav/api/FavCdnInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ImageAdapter", "dealDownloading", "(Lcom/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ViewHolder;Lcom/tencent/mm/plugin/fav/ui/gallery/FavImgDataItem;Lcom/tencent/mm/plugin/fav/api/FavCdnInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            g0Var.f100926c.setImageBitmap(d(item));
            int i28 = Xf2.field_totalLen > 0 ? ((Xf2.field_offset * 100) / r1) - 1 : 0;
            int i29 = i28 >= 0 ? i28 : 0;
            g0Var.f100927d.setProgress(i29);
            g0Var.f100928e.setText(i29 + "%");
            return view3;
        }
        g0Var.f100929f.setVisibility(8);
        if (item.o() < 0) {
            g0Var.f100927d.setVisibility(0);
            g0Var.f100928e.setVisibility(0);
            g0Var.f100926c.setVisibility(0);
            android.view.View view5 = g0Var.f100924a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view5, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ImageAdapter", "dealFailed", "(Lcom/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ViewHolder;Lcom/tencent/mm/plugin/fav/ui/gallery/FavImgDataItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ImageAdapter", "dealFailed", "(Lcom/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ViewHolder;Lcom/tencent/mm/plugin/fav/ui/gallery/FavImgDataItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            g0Var.f100926c.setImageBitmap(d(item));
            g0Var.f100927d.setProgress(0);
            g0Var.f100928e.setText("0%");
        } else {
            g0Var.f100927d.setVisibility(8);
            g0Var.f100928e.setVisibility(8);
            g0Var.f100926c.setVisibility(8);
            android.view.View view6 = g0Var.f100924a;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view6, arrayList3.toArray(), "com/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ImageAdapter", "dealFailed", "(Lcom/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ViewHolder;Lcom/tencent/mm/plugin/fav/ui/gallery/FavImgDataItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ImageAdapter", "dealFailed", "(Lcom/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ViewHolder;Lcom/tencent/mm/plugin/fav/ui/gallery/FavImgDataItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (item.l() != 0) {
                g0Var.f100929f.setVisibility(0);
            }
            f(g0Var, d(item), "");
        }
        return view3;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }
}
