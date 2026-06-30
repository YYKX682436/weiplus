package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes12.dex */
public class x implements com.p314xaae8f345.mm.sdk.p2603x2137b148.g6 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f224594d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224595e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224596f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f224597g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224598h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.c0 f224599i;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.c0 c0Var, java.lang.String str, java.lang.String str2, android.widget.ImageView imageView, java.lang.String str3) {
        this.f224599i = c0Var;
        this.f224595e = str;
        this.f224596f = str2;
        this.f224597g = imageView;
        this.f224598h = str3;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.g6
    public boolean a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.c0 c0Var = this.f224599i;
        android.graphics.Bitmap d17 = t83.c.d(c0Var.f224302d, this.f224595e, false);
        if (d17 != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = c0Var.f224300b;
            java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(d17);
            java.lang.String str = this.f224596f;
            r2Var.put(str, weakReference);
            this.f224594d = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.c0.a(c0Var, this.f224597g, str, d17);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.g6
    public boolean b() {
        if (this.f224594d) {
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.c0 c0Var = this.f224599i;
        c0Var.getClass();
        java.lang.String str = this.f224595e;
        java.lang.String str2 = this.f224598h;
        c0Var.f224299a.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.y(c0Var, str2, this.f224597g, com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.c0.b(str, str2)));
        return true;
    }
}
