package com.p314xaae8f345.mm.p2802xd031a825.ui;

/* loaded from: classes9.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f295778a;

    /* renamed from: b, reason: collision with root package name */
    public android.graphics.Bitmap f295779b = null;

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.Bitmap f295780c = null;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f295781d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f295782e = "";

    /* renamed from: f, reason: collision with root package name */
    public boolean f295783f = true;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f295784g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public db5.d5 f295785h = null;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f295786i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.ImageView f295787j;

    /* renamed from: k, reason: collision with root package name */
    public android.view.View f295788k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.ImageView f295789l;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21519xe6b698c8 f295790m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.ViewGroup f295791n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f295792o;

    public w(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, boolean z17) {
        this.f295792o = false;
        this.f295778a = abstractActivityC21394xb3d2c0cf;
        this.f295792o = z17;
    }

    public void a() {
        android.view.View inflate;
        if (this.f295785h != null) {
            return;
        }
        if (this.f295792o) {
            inflate = android.view.View.inflate(this.f295778a, com.p314xaae8f345.mm.R.C30864xbddafb2a.d7f, null);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21519xe6b698c8 c21519xe6b698c8 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21519xe6b698c8) inflate.findViewById(com.p314xaae8f345.mm.R.id.oxk);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21519xe6b698c8 c21519xe6b698c82 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21519xe6b698c8) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567391jc2);
            c21519xe6b698c82.m79149xb2d4819c(true);
            c21519xe6b698c82.m79148x63b4dfab(1);
            this.f295791n = (android.view.ViewGroup) inflate.findViewById(com.p314xaae8f345.mm.R.id.kzg);
            android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.kzf);
            findViewById.setImportantForAccessibility(4);
            findViewById.setOnClickListener(new com.p314xaae8f345.mm.p2802xd031a825.ui.q(this));
            c21519xe6b698c82.setOnClickListener(new com.p314xaae8f345.mm.p2802xd031a825.ui.r(this, findViewById, c21519xe6b698c8));
            ((android.view.ViewGroup) inflate.findViewById(com.p314xaae8f345.mm.R.id.jc9)).setContentDescription(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.hdu) + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.hdv));
        } else {
            inflate = android.view.View.inflate(this.f295778a, com.p314xaae8f345.mm.R.C30864xbddafb2a.d7i, null);
            inflate.setOnClickListener(new com.p314xaae8f345.mm.p2802xd031a825.ui.s(this));
        }
        this.f295786i = inflate.findViewById(com.p314xaae8f345.mm.R.id.kzi);
        this.f295787j = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kzh);
        this.f295788k = inflate.findViewById(com.p314xaae8f345.mm.R.id.kze);
        this.f295789l = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kzd);
        this.f295790m = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21519xe6b698c8) inflate.findViewById(com.p314xaae8f345.mm.R.id.oxl);
        db5.d5 d5Var = new db5.d5(inflate, -1, -1, true);
        this.f295785h = d5Var;
        d5Var.setClippingEnabled(false);
        this.f295785h.update();
        this.f295785h.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(16777215));
        this.f295785h.setOnDismissListener(new com.p314xaae8f345.mm.p2802xd031a825.ui.t(this));
    }

    public void b() {
        db5.d5 d5Var = this.f295785h;
        if (d5Var != null && d5Var.isShowing()) {
            this.f295785h.dismiss();
        }
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.n0(this.f295781d);
        java.util.ArrayList arrayList = this.f295784g;
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o0(arrayList);
        arrayList.clear();
        this.f295778a = null;
    }

    public void c(android.view.View view, boolean z17) {
        this.f295783f = z17;
        db5.d5 d5Var = this.f295785h;
        if (d5Var == null || d5Var.isShowing()) {
            return;
        }
        this.f295785h.showAtLocation(view.getRootView(), 17, 0, 0);
        this.f295785h.setFocusable(true);
        this.f295785h.setTouchable(true);
        this.f295785h.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(16777215));
        this.f295785h.setOutsideTouchable(true);
        if (this.f295783f) {
            android.view.ViewGroup viewGroup = this.f295791n;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
                this.f295791n.post(new com.p314xaae8f345.mm.p2802xd031a825.ui.u(this));
            }
        } else {
            android.view.ViewGroup viewGroup2 = this.f295791n;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
            }
        }
        d();
        this.f295778a.getWindow().addFlags(1024);
    }

    public final void d() {
        if (this.f295783f) {
            android.graphics.Bitmap bitmap = this.f295781d;
            android.graphics.Bitmap bitmap2 = this.f295780c;
            if (bitmap2 != null) {
                java.util.regex.Pattern pattern = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f295755a;
                android.graphics.Matrix matrix = new android.graphics.Matrix();
                matrix.reset();
                matrix.setRotate(90.0f, bitmap2.getWidth() / 2, bitmap2.getHeight() / 2);
                int width = bitmap2.getWidth();
                int height = bitmap2.getHeight();
                zj0.a aVar = new zj0.a();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                aVar.c(java.lang.Boolean.TRUE);
                aVar.c(matrix);
                aVar.c(java.lang.Integer.valueOf(height));
                aVar.c(java.lang.Integer.valueOf(width));
                aVar.c(0);
                aVar.c(0);
                aVar.c(bitmap2);
                java.lang.Object obj = new java.lang.Object();
                yj0.a.d(obj, aVar.b(), "com/tencent/mm/wallet_core/ui/WalletBaseUtil", com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37665xf880c7f2, "(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
                yj0.a.e(obj, createBitmap, "com/tencent/mm/wallet_core/ui/WalletBaseUtil", com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37665xf880c7f2, "(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
                this.f295781d = createBitmap;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflinePopupWindow", "updatePopWindowContent mRoateBmp != null");
            } else {
                this.f295781d = null;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OfflinePopupWindow", "updatePopWindowContent mRoateBmp == null");
            }
            this.f295789l.setImageBitmap(this.f295781d);
            java.util.ArrayList arrayList = this.f295784g;
            arrayList.add(0, bitmap);
            if (arrayList.size() >= 2) {
                for (int size = arrayList.size() - 1; size > 1; size--) {
                    com.p314xaae8f345.mm.p2802xd031a825.ui.r1.n0((android.graphics.Bitmap) arrayList.remove(size));
                }
            }
            android.view.View view = this.f295786i;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/wallet_core/ui/OfflinePopupWindow", "updatePopWindowContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/wallet_core/ui/OfflinePopupWindow", "updatePopWindowContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f295788k;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/wallet_core/ui/OfflinePopupWindow", "updatePopWindowContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/wallet_core/ui/OfflinePopupWindow", "updatePopWindowContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21519xe6b698c8 c21519xe6b698c8 = this.f295790m;
            java.lang.String str = this.f295782e;
            java.util.regex.Pattern pattern2 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f295755a;
            java.lang.String str2 = "";
            if (!android.text.TextUtils.isEmpty(str)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                int length = str.length() / 4;
                int length2 = str.length() % 4;
                sb6.append(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.a(str.substring(0, length2), ""));
                for (int i17 = 0; i17 < 4; i17++) {
                    sb6.append(" ");
                }
                java.lang.String substring = str.substring(length2);
                int i18 = 0;
                while (i18 < length) {
                    int i19 = i18 + 1;
                    int min = java.lang.Math.min(i19 * 4, substring.length());
                    if (min + 4 > substring.length()) {
                        min = substring.length();
                    }
                    int i27 = i18 * 4;
                    sb6.append(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.a(substring.substring(i27, min), ""));
                    if (min - i27 == 4 && i18 != length - 1) {
                        for (int i28 = 0; i28 < 4; i28++) {
                            sb6.append(" ");
                        }
                    }
                    i18 = i19;
                }
                str2 = sb6.toString();
            }
            c21519xe6b698c8.m79150x765074af(str2);
            this.f295790m.setContentDescription(this.f295782e);
        } else {
            this.f295787j.setImageBitmap(this.f295779b);
            if (this.f295779b != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OfflinePopupWindow", "updatePopWindowContent mQRCodeBmp != null");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflinePopupWindow", "updatePopWindowContent mQRCodeBmp == null");
            }
            android.view.View view3 = this.f295786i;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/wallet_core/ui/OfflinePopupWindow", "updatePopWindowContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/wallet_core/ui/OfflinePopupWindow", "updatePopWindowContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = this.f295788k;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view4, arrayList5.toArray(), "com/tencent/mm/wallet_core/ui/OfflinePopupWindow", "updatePopWindowContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/wallet_core/ui/OfflinePopupWindow", "updatePopWindowContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f295787j.postDelayed(new com.p314xaae8f345.mm.p2802xd031a825.ui.v(this), 500L);
        }
        this.f295785h.update();
    }
}
