package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752;

/* loaded from: classes12.dex */
public class f0 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseBooleanArray f182449d = new android.util.SparseBooleanArray();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.ActivityC13597x28c5d1bd f182450e;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.ActivityC13597x28c5d1bd activityC13597x28c5d1bd, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.v vVar) {
        this.f182450e = activityC13597x28c5d1bd;
    }

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.g0 g0Var, android.graphics.Bitmap bitmap, java.lang.String str) {
        g0Var.f182460d.setVisibility(8);
        g0Var.f182461e.setVisibility(8);
        g0Var.f182459c.setVisibility(8);
        android.view.View view = g0Var.f182457a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ImageAdapter", "dealSuc", "(Lcom/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ViewHolder;Landroid/graphics/Bitmap;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ImageAdapter", "dealSuc", "(Lcom/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ViewHolder;Landroid/graphics/Bitmap;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        g0Var.f182462f.setVisibility(8);
        f(g0Var, bitmap, str);
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.r getItem(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.ActivityC13597x28c5d1bd activityC13597x28c5d1bd = this.f182450e;
        if (i17 < activityC13597x28c5d1bd.f182407h.size()) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.r) activityC13597x28c5d1bd.f182407h.get(i17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavMediaGalleryUI", "get item fail, position %d error", java.lang.Integer.valueOf(i17));
        return null;
    }

    public final android.graphics.Bitmap d(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.r rVar) {
        android.graphics.Bitmap u17;
        return (rVar == null || (u17 = rVar.u()) == null) ? bp.b.m10969xb866ec1c(this.f182450e.getResources(), com.p314xaae8f345.mm.R.raw.f78994x211254f4, null) : u17;
    }

    public final void f(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.g0 g0Var, android.graphics.Bitmap bitmap, java.lang.String str) {
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.ActivityC13597x28c5d1bd activityC13597x28c5d1bd = this.f182450e;
        int width = g0Var.f182458b.getWidth();
        int height = g0Var.f182458b.getHeight();
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
        g0Var.f182458b.setImageMatrix(matrix);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = g0Var.f182458b;
        int width6 = bitmap.getWidth();
        int height6 = bitmap.getHeight();
        c21524xecd57b9a.f279184o = width6;
        c21524xecd57b9a.f279185p = height6;
        g0Var.f182458b.m79201x4cf4f0ef(true);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            g0Var.f182458b.setImageBitmap(bitmap);
            return;
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.gif.k kVar = new com.p314xaae8f345.mm.p1006xc5476f33.gif.k(str);
            g0Var.f182458b.m79196x703a2ac0(kVar);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a2 = g0Var.f182458b;
            int B = i65.a.B(activityC13597x28c5d1bd.mo55332x76847179());
            c21524xecd57b9a2.f279191u = i65.a.k(activityC13597x28c5d1bd.mo55332x76847179());
            c21524xecd57b9a2.f279190t = B;
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a3 = g0Var.f182458b;
            int intrinsicWidth = kVar.getIntrinsicWidth();
            int intrinsicHeight = kVar.getIntrinsicHeight();
            c21524xecd57b9a3.f279184o = intrinsicWidth;
            c21524xecd57b9a3.f279185p = intrinsicHeight;
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a4 = g0Var.f182458b;
            if (c21524xecd57b9a4.f279186p0 && (obj = c21524xecd57b9a4.f279195x0) != null) {
                ((og5.e) obj).start();
            }
            g0Var.f182458b.h();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavMediaGalleryUI", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            g0Var.f182458b.setImageBitmap(bitmap);
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f182450e.f182407h.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.ActivityC13597x28c5d1bd activityC13597x28c5d1bd = this.f182450e;
        if (i17 > activityC13597x28c5d1bd.f182407h.size()) {
            return 2;
        }
        return ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.r) activityC13597x28c5d1bd.f182407h.get(i17)).k();
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.g0 g0Var;
        android.view.View view3;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.r item = getItem(i17);
        java.util.Objects.toString(view);
        java.util.Objects.toString(viewGroup);
        item.k();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.ActivityC13597x28c5d1bd activityC13597x28c5d1bd = this.f182450e;
        int i19 = activityC13597x28c5d1bd.f182403d;
        if (i19 != i17 && java.lang.Math.abs(i19 - i17) > 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavMediaGalleryUI", "getView not selected, " + activityC13597x28c5d1bd.f182403d + ", " + i17);
            if (view != null) {
                return view;
            }
            if (item.k() == 15 || item.k() == 4) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505(activityC13597x28c5d1bd.mo55332x76847179(), null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.g0 g0Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.g0(activityC13597x28c5d1bd, null);
            android.view.View inflate = android.view.View.inflate(activityC13597x28c5d1bd.mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.ab8, null);
            g0Var2.f182457a = inflate.findViewById(com.p314xaae8f345.mm.R.id.h9e);
            g0Var2.f182458b = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a) inflate.findViewById(com.p314xaae8f345.mm.R.id.h88);
            g0Var2.f182460d = (android.widget.ProgressBar) inflate.findViewById(com.p314xaae8f345.mm.R.id.d4_);
            g0Var2.f182459c = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568828o70);
            g0Var2.f182461e = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.d4a);
            g0Var2.f182462f = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.du_);
            ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.dua)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.c_q);
            inflate.setTag(g0Var2);
            return inflate;
        }
        if (item.k() == 15 || item.k() == 4) {
            if (view == null) {
                view2 = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505(activityC13597x28c5d1bd.mo55332x76847179(), null);
                ((java.util.ArrayList) activityC13597x28c5d1bd.f182410n).add(view2);
            } else {
                view2 = view;
            }
            java.lang.String j17 = item.j();
            java.util.HashMap hashMap = activityC13597x28c5d1bd.f182411o;
            java.util.List list = (java.util.List) hashMap.get(j17);
            if (list == null) {
                list = new java.util.ArrayList();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505 viewOnClickListenerC13625xe5fb4505 = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505) view2;
            list.add(viewOnClickListenerC13625xe5fb4505);
            hashMap.put(j17, list);
            viewOnClickListenerC13625xe5fb4505.f183104i.setVisibility(8);
            viewOnClickListenerC13625xe5fb4505.m55407x6c4ebec7(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.e0(this));
            if (com.p314xaae8f345.mm.vfs.w6.j(j17)) {
                viewOnClickListenerC13625xe5fb4505.m55413xab2cf483(j17);
            } else {
                java.lang.String i27 = item.i();
                o72.e2 Xf = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Xf(i27);
                if (Xf == null || (i18 = Xf.f67093x10a0fed7) != 1) {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(item.f()) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(item.e())) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavMediaGalleryUI", "getView, no video, cdn data invalid");
                        viewOnClickListenerC13625xe5fb4505.j(j17, false, i27);
                        viewOnClickListenerC13625xe5fb4505.f183104i.setVisibility(0);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavMediaGalleryUI", "getView, no video, start download, dataId:%s", i27);
                        item.y();
                        viewOnClickListenerC13625xe5fb4505.j(j17, true, i27);
                    }
                } else if (i18 == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavMediaGalleryUI", "getView, no video but downloading, dataId:%s", i27);
                    viewOnClickListenerC13625xe5fb4505.j(j17, true, i27);
                }
            }
            java.lang.String w17 = item.w();
            if (com.p314xaae8f345.mm.vfs.w6.j(w17)) {
                viewOnClickListenerC13625xe5fb4505.m55412xab04b759(w17);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavMediaGalleryUI", "getView, no thumb, start download, path:%s", w17);
                item.y();
            }
            viewOnClickListenerC13625xe5fb4505.m55414x5981726b(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.CONTAIN);
            return view2;
        }
        if (view == null) {
            g0Var = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.g0(activityC13597x28c5d1bd, null);
            view3 = android.view.View.inflate(activityC13597x28c5d1bd.mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.ab8, null);
            g0Var.f182457a = view3.findViewById(com.p314xaae8f345.mm.R.id.h9e);
            g0Var.f182458b = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a) view3.findViewById(com.p314xaae8f345.mm.R.id.h88);
            g0Var.f182460d = (android.widget.ProgressBar) view3.findViewById(com.p314xaae8f345.mm.R.id.d4_);
            g0Var.f182459c = (android.widget.ImageView) view3.findViewById(com.p314xaae8f345.mm.R.id.f568828o70);
            g0Var.f182461e = (android.widget.TextView) view3.findViewById(com.p314xaae8f345.mm.R.id.d4a);
            g0Var.f182462f = (android.widget.LinearLayout) view3.findViewById(com.p314xaae8f345.mm.R.id.du_);
            ((android.widget.TextView) view3.findViewById(com.p314xaae8f345.mm.R.id.dua)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.c_q);
            view3.setTag(g0Var);
        } else {
            g0Var = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.g0) view.getTag();
            view3 = view;
        }
        view3.setLayoutParams(new android.widget.Gallery.LayoutParams(-1, -1));
        android.util.SparseBooleanArray sparseBooleanArray = this.f182449d;
        boolean z17 = sparseBooleanArray.get(i17, true);
        sparseBooleanArray.put(i17, false);
        android.graphics.Bitmap d17 = item.d(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavMediaGalleryUI", "index %d item favid %d, localid %d, itemStatus %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(item.o()), java.lang.Long.valueOf(item.s()), java.lang.Integer.valueOf(item.r()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavMediaGalleryUI", "item dataId %s, item data url %s, key %s, fullsize %d, thumb url %s, key %s, thumb size %d", item.i(), item.f(), item.e(), java.lang.Long.valueOf(item.q()), item.h(), item.g(), java.lang.Long.valueOf(item.v()));
        if (d17 != null || !item.x()) {
            activityC13597x28c5d1bd.m78501x43e00957(true);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.c(item.j())) {
                a(g0Var, d17, item.j());
            } else {
                a(g0Var, d17, "");
            }
            return view3;
        }
        activityC13597x28c5d1bd.m78501x43e00957(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavMediaGalleryUI", "get big image fail");
        o72.e2 Xf2 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Xf(item.i());
        if (Xf2 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavMediaGalleryUI", "fav cdnInfo status %d", java.lang.Integer.valueOf(Xf2.f67093x10a0fed7));
            g0Var.f182460d.setVisibility(0);
            g0Var.f182461e.setVisibility(0);
            g0Var.f182459c.setVisibility(0);
            android.view.View view4 = g0Var.f182457a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ImageAdapter", "dealDownloading", "(Lcom/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ViewHolder;Lcom/tencent/mm/plugin/fav/ui/gallery/FavImgDataItem;Lcom/tencent/mm/plugin/fav/api/FavCdnInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ImageAdapter", "dealDownloading", "(Lcom/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ViewHolder;Lcom/tencent/mm/plugin/fav/ui/gallery/FavImgDataItem;Lcom/tencent/mm/plugin/fav/api/FavCdnInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            g0Var.f182459c.setImageBitmap(d(item));
            int i28 = Xf2.f67094xeb1a61d6 > 0 ? ((Xf2.f67090x90a9378 * 100) / r1) - 1 : 0;
            int i29 = i28 >= 0 ? i28 : 0;
            g0Var.f182460d.setProgress(i29);
            g0Var.f182461e.setText(i29 + "%");
            return view3;
        }
        g0Var.f182462f.setVisibility(8);
        if (item.o() < 0) {
            g0Var.f182460d.setVisibility(0);
            g0Var.f182461e.setVisibility(0);
            g0Var.f182459c.setVisibility(0);
            android.view.View view5 = g0Var.f182457a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view5, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ImageAdapter", "dealFailed", "(Lcom/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ViewHolder;Lcom/tencent/mm/plugin/fav/ui/gallery/FavImgDataItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ImageAdapter", "dealFailed", "(Lcom/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ViewHolder;Lcom/tencent/mm/plugin/fav/ui/gallery/FavImgDataItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            g0Var.f182459c.setImageBitmap(d(item));
            g0Var.f182460d.setProgress(0);
            g0Var.f182461e.setText("0%");
        } else {
            g0Var.f182460d.setVisibility(8);
            g0Var.f182461e.setVisibility(8);
            g0Var.f182459c.setVisibility(8);
            android.view.View view6 = g0Var.f182457a;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view6, arrayList3.toArray(), "com/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ImageAdapter", "dealFailed", "(Lcom/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ViewHolder;Lcom/tencent/mm/plugin/fav/ui/gallery/FavImgDataItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ImageAdapter", "dealFailed", "(Lcom/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ViewHolder;Lcom/tencent/mm/plugin/fav/ui/gallery/FavImgDataItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (item.l() != 0) {
                g0Var.f182462f.setVisibility(0);
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
