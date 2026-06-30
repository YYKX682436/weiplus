package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class l6 implements hx4.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ db5.g4 f267168a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267169b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f267170c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f267171d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 f267172e;

    public l6(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 c6Var, db5.g4 g4Var, java.lang.String str, boolean z17, boolean z18) {
        this.f267172e = c6Var;
        this.f267168a = g4Var;
        this.f267169b = str;
        this.f267170c = z17;
        this.f267171d = z18;
    }

    @Override // hx4.v
    public void a(android.graphics.drawable.Drawable drawable) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 c6Var = this.f267172e;
        c6Var.f265582f.f367235c = drawable;
        if (drawable == null || (k0Var = c6Var.f265577J) == null || !k0Var.i()) {
            return;
        }
        this.f267172e.i(this.f267168a, this.f267169b, drawable, null, this.f267170c, this.f267171d);
    }
}
