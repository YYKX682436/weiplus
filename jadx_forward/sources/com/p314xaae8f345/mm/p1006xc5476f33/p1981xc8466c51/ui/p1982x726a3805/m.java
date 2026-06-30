package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805;

/* loaded from: classes12.dex */
public class m implements com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.f0 f237070a;

    /* renamed from: b, reason: collision with root package name */
    public int f237071b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f237072c;

    /* renamed from: f, reason: collision with root package name */
    public final kd0.p2 f237075f;

    /* renamed from: k, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f237080k;

    /* renamed from: d, reason: collision with root package name */
    public int f237073d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f237074e = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public int f237076g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f237077h = -1;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View.OnClickListener f237078i = new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.c(this);

    /* renamed from: j, reason: collision with root package name */
    public final android.view.View.OnLongClickListener f237079j = new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.i(this);

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.f0 f0Var, android.widget.ListView listView) {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7>(a0Var) { // from class: com.tencent.mm.plugin.record.ui.viewWrappers.ImageViewWrapper$6
            {
                this.f39173x3fe91575 = 812146647;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be7) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be72 = c5886xd11a0be7;
                java.lang.String str = c5886xd11a0be72.f136194g.f87901a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.l lVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.l(null);
                lVar.f237068a = c5886xd11a0be72;
                com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.m mVar = com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.m.this;
                ((java.util.HashMap) mVar.f237074e).put(str, lVar);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = mVar.f237072c;
                if (k0Var == null || !k0Var.i()) {
                    return true;
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.i) mVar.f237079j).onLongClick(null);
                return true;
            }
        };
        this.f237080k = abstractC20980x9b9ad01d;
        this.f237070a = f0Var;
        abstractC20980x9b9ad01d.mo48813x58998cd();
        kd0.x2 x2Var = (kd0.x2) i95.n0.c(kd0.x2.class);
        android.content.Context context = listView.getContext();
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.b bVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.b(this);
        ((jd0.q2) x2Var).getClass();
        this.f237075f = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636(context, bVar);
    }

    public static void c(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.m mVar, android.content.Intent intent, android.view.View view) {
        int i17;
        int i18;
        mVar.getClass();
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
            i18 = view.getWidth();
            i17 = view.getHeight();
        } else {
            i17 = 0;
            i18 = 0;
        }
        intent.putExtra("img_gallery_left", iArr[0]);
        intent.putExtra("img_gallery_top", iArr[1]);
        intent.putExtra("img_gallery_width", i18);
        intent.putExtra("img_gallery_height", i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.g0
    public android.view.View a(android.content.Context context) {
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.ccz, null);
        int a17 = ((context == null || !(context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf)) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDisplayMetrics() : ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).m78734x1800569e().getDisplayMetrics()).widthPixels - com.p314xaae8f345.mm.ui.zk.a(context, 80);
        this.f237073d = a17;
        int max = java.lang.Math.max(a17, 0);
        this.f237073d = max;
        if (max == 0) {
            this.f237073d = com.p314xaae8f345.mm.ui.zk.a(context, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e);
        }
        this.f237071b = this.f237073d;
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.g0
    public void b(android.view.View view, int i17, et3.b bVar, java.lang.Object obj) {
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.lp8);
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) view.findViewById(com.p314xaae8f345.mm.R.id.imb);
        imageView.setTag(bVar);
        imageView.setOnClickListener(this.f237078i);
        if (bVar.f338127e == 1) {
            imageView.setOnLongClickListener(this.f237079j);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.d0 d0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.d0();
        int i18 = bVar.f338127e;
        if (i18 == 0) {
            d0Var.f236901b = bVar.f338125c;
            d0Var.f236902c = bVar.f338133k;
        } else if (i18 == 1) {
            d0Var.f236901b = bVar.f338124b.f67645x88be67a1;
        }
        d0Var.f236900a = bVar.f338123a;
        d0Var.f236904e = true;
        d0Var.f236903d = this.f237073d;
        android.graphics.Bitmap b17 = this.f237070a.b(d0Var);
        if (b17 != null) {
            java.lang.String str = d0Var.f236900a.T;
            d(imageView, progressBar, b17, true, 0, bVar.f338123a.T);
        } else {
            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.k(this, bVar, imageView, progressBar));
        }
    }

    public final void d(android.widget.ImageView imageView, android.widget.ProgressBar progressBar, android.graphics.Bitmap bitmap, boolean z17, int i17, java.lang.String str) {
        int f17;
        int i18;
        int f18;
        int i19;
        float height;
        int width;
        android.graphics.Bitmap bitmap2 = bitmap;
        if (!((et3.b) imageView.getTag()).f338123a.T.equals(str)) {
            imageView.getTag();
            return;
        }
        if (bitmap2 == null) {
            android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            int i27 = this.f237073d;
            layoutParams.height = i27;
            layoutParams.width = i27;
            imageView.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560023b);
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562680lw);
            progressBar.setVisibility(0);
            return;
        }
        progressBar.setVisibility(8);
        bitmap.getWidth();
        bitmap.getHeight();
        imageView.getWidth();
        imageView.getHeight();
        android.view.ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        int width2 = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        if (height2 >= width2) {
            float f19 = height2 / width2;
            if (z17) {
                i18 = this.f237073d;
                height = bitmap.getHeight() * i18;
                width = bitmap.getWidth();
                f17 = (int) (height / width);
            } else {
                if (f19 > 2.5d) {
                    int height3 = (bitmap.getHeight() - ((int) (bitmap.getWidth() * 2.5f))) / 2;
                    int width3 = bitmap.getWidth();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Integer.valueOf((int) (bitmap.getWidth() * 2.5f)));
                    arrayList.add(java.lang.Integer.valueOf(width3));
                    arrayList.add(java.lang.Integer.valueOf(height3));
                    arrayList.add(0);
                    arrayList.add(bitmap2);
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/record/ui/viewWrappers/ImageViewWrapper", "updateView", "(Landroid/widget/ImageView;Landroid/widget/ProgressBar;Landroid/graphics/Bitmap;ZILjava/lang/String;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                    android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), ((java.lang.Integer) arrayList.get(3)).intValue(), ((java.lang.Integer) arrayList.get(4)).intValue());
                    yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/record/ui/viewWrappers/ImageViewWrapper", "updateView", "(Landroid/widget/ImageView;Landroid/widget/ProgressBar;Landroid/graphics/Bitmap;ZILjava/lang/String;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                    bitmap2 = createBitmap;
                    f19 = 2.5f;
                }
                if (f19 <= 2.0f) {
                    i19 = i65.a.f(imageView.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561126a3);
                    f18 = (int) (i19 / f19);
                    int i28 = f18;
                    f17 = i19;
                    i18 = i28;
                } else {
                    i18 = i65.a.f(imageView.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561128a5);
                    f17 = (int) (i18 * f19);
                }
            }
        } else {
            float f27 = width2 / height2;
            if (f27 > 2.33f) {
                int width4 = (bitmap.getWidth() - ((int) (bitmap.getHeight() * 2.33f))) / 2;
                int height4 = bitmap.getHeight();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(java.lang.Integer.valueOf(height4));
                arrayList2.add(java.lang.Integer.valueOf((int) (bitmap.getHeight() * 2.33f)));
                arrayList2.add(0);
                arrayList2.add(java.lang.Integer.valueOf(width4));
                arrayList2.add(bitmap2);
                java.lang.Object obj2 = new java.lang.Object();
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/plugin/record/ui/viewWrappers/ImageViewWrapper", "updateView", "(Landroid/widget/ImageView;Landroid/widget/ProgressBar;Landroid/graphics/Bitmap;ZILjava/lang/String;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue(), ((java.lang.Integer) arrayList2.get(2)).intValue(), ((java.lang.Integer) arrayList2.get(3)).intValue(), ((java.lang.Integer) arrayList2.get(4)).intValue());
                yj0.a.e(obj2, createBitmap2, "com/tencent/mm/plugin/record/ui/viewWrappers/ImageViewWrapper", "updateView", "(Landroid/widget/ImageView;Landroid/widget/ProgressBar;Landroid/graphics/Bitmap;ZILjava/lang/String;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                bitmap2 = createBitmap2;
            }
            if (z17) {
                i18 = this.f237073d;
                height = bitmap2.getHeight() * i18;
                width = bitmap2.getWidth();
                f17 = (int) (height / width);
            } else if (f27 <= 2.0f) {
                f18 = i65.a.f(imageView.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561126a3);
                i19 = (int) (f18 / f27);
                int i282 = f18;
                f17 = i19;
                i18 = i282;
            } else {
                f17 = i65.a.f(imageView.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561128a5);
                i18 = (int) (f17 * f27);
            }
        }
        layoutParams2.width = i18;
        layoutParams2.height = f17;
        imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        imageView.setImageBitmap(bitmap2);
        imageView.setBackgroundResource(0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.g0
    /* renamed from: destroy */
    public void mo67872x5cd39ffa() {
        this.f237080k.mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.g0
    /* renamed from: pause */
    public void mo67873x65825f6() {
    }
}
