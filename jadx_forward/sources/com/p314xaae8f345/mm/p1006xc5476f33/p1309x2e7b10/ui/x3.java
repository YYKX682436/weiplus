package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes15.dex */
public class x3 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f176970a;

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.Bitmap f176972c;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f176973d;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f176976g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f176977h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f176978i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.TextView f176979j;

    /* renamed from: k, reason: collision with root package name */
    public android.view.View f176980k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.ImageView f176981l;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21519xe6b698c8 f176982m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21519xe6b698c8 f176983n;

    /* renamed from: q, reason: collision with root package name */
    public tt1.j f176986q;

    /* renamed from: b, reason: collision with root package name */
    public boolean f176971b = true;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f176974e = null;

    /* renamed from: f, reason: collision with root package name */
    public db5.d5 f176975f = null;

    /* renamed from: o, reason: collision with root package name */
    public float f176984o = 0.0f;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f176985p = new java.util.ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f176987r = "";

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View.OnClickListener f176988s = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.u3(this);

    public x3(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        this.f176970a = abstractActivityC21394xb3d2c0cf;
    }

    public void a(android.view.View view, boolean z17) {
        if (this.f176984o < 0.8f) {
            android.view.WindowManager.LayoutParams attributes = this.f176970a.getWindow().getAttributes();
            attributes.screenBrightness = 0.8f;
            this.f176970a.getWindow().setAttributes(attributes);
        }
        this.f176971b = z17;
        db5.d5 d5Var = this.f176975f;
        if (d5Var == null || d5Var.isShowing()) {
            return;
        }
        this.f176975f.showAtLocation(view.getRootView(), 17, 0, 0);
        this.f176975f.setFocusable(true);
        this.f176975f.setTouchable(true);
        this.f176975f.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(16777215));
        this.f176975f.setOutsideTouchable(true);
        boolean z18 = this.f176971b;
        android.view.View.OnClickListener onClickListener = this.f176988s;
        java.lang.String str = "";
        if (z18) {
            this.f176981l.setOnClickListener(onClickListener);
            android.graphics.Bitmap bitmap = this.f176974e;
            android.graphics.Bitmap bitmap2 = this.f176973d;
            if (bitmap2 != null) {
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
                yj0.a.d(obj, aVar.b(), "com/tencent/mm/plugin/card/util/CardUtil", com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37665xf880c7f2, "(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
                yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/card/util/CardUtil", com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37665xf880c7f2, "(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
                this.f176974e = createBitmap;
            } else {
                this.f176974e = null;
            }
            this.f176981l.setImageBitmap(this.f176974e);
            java.util.ArrayList arrayList = this.f176985p;
            arrayList.add(0, bitmap);
            if (arrayList.size() > 2) {
                for (int size = arrayList.size() - 1; size > 1; size--) {
                    lu1.a0.F((android.graphics.Bitmap) arrayList.remove(size));
                }
            }
            android.view.View view2 = this.f176976g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/CardPopupWindow", "showPopupWindow", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/card/ui/CardPopupWindow", "showPopupWindow", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.f176980k;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/card/ui/CardPopupWindow", "showPopupWindow", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/card/ui/CardPopupWindow", "showPopupWindow", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.lang.String str2 = this.f176986q.i0().f466722o;
            if (this.f176986q.s0().f470089p0 == null || !this.f176986q.s0().f470089p0.f454959d) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176986q.i0().C)) {
                    str = this.f176986q.i0().C;
                } else if (!this.f176986q.N()) {
                    str = str2;
                } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176987r)) {
                    str = this.f176987r;
                }
            }
            if (android.text.TextUtils.isEmpty(str) || str.length() > 40) {
                this.f176982m.setVisibility(8);
            } else {
                this.f176982m.m79150x765074af(lu1.g0.a(4, str, true));
                if (this.f176986q.m()) {
                    this.f176982m.setVisibility(0);
                } else {
                    this.f176982m.setVisibility(8);
                }
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176986q.s0().f470091q)) {
                this.f176983n.setVisibility(8);
            } else {
                this.f176983n.m79150x765074af(this.f176986q.s0().f470091q);
                this.f176983n.setVisibility(0);
            }
        } else {
            this.f176977h.setOnClickListener(onClickListener);
            this.f176977h.setImageBitmap(this.f176972c);
            java.lang.String str3 = this.f176986q.i0().f466722o;
            if (this.f176986q.s0().f470089p0 == null || !this.f176986q.s0().f470089p0.f454959d) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176986q.i0().C)) {
                    str = this.f176986q.i0().C;
                } else if (!this.f176986q.N()) {
                    str = str3;
                } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176987r)) {
                    str = this.f176987r;
                }
            }
            if (android.text.TextUtils.isEmpty(str) || str.length() > 40) {
                this.f176978i.setVisibility(8);
            } else {
                this.f176978i.setText(lu1.g0.a(4, str, true));
                if (this.f176986q.m()) {
                    this.f176978i.setVisibility(0);
                } else {
                    this.f176978i.setVisibility(8);
                }
            }
            if (android.text.TextUtils.isEmpty(this.f176986q.s0().f470091q)) {
                this.f176979j.setVisibility(8);
            } else {
                this.f176979j.setText(this.f176986q.s0().f470091q);
                this.f176979j.setVisibility(0);
            }
            android.view.View view4 = this.f176976g;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/card/ui/CardPopupWindow", "showPopupWindow", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/card/ui/CardPopupWindow", "showPopupWindow", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view5 = this.f176980k;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/card/ui/CardPopupWindow", "showPopupWindow", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/card/ui/CardPopupWindow", "showPopupWindow", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f176975f.update();
    }
}
