package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class b6 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.n0 f266488d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266489e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266490f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266491g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266492h;

    public b6(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.n0 n0Var, java.lang.String str, nw4.y2 y2Var, java.lang.String str2) {
        this.f266492h = c1Var;
        this.f266488d = n0Var;
        this.f266489e = str;
        this.f266490f = y2Var;
        this.f266491g = str2;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.bj().i(this.f266488d);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.bj().f(this.f266489e);
        this.f266492h.i5(this.f266490f, this.f266491g + ":fail", null);
    }
}
