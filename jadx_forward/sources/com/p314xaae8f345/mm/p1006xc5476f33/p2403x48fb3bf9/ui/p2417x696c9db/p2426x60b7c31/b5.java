package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class b5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm.t3 f266483d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266484e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266485f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266486g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266487h;

    public b5(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, dm.t3 t3Var, java.lang.String str, java.lang.String str2, nw4.y2 y2Var) {
        this.f266487h = c1Var;
        this.f266483d = t3Var;
        this.f266484e = str;
        this.f266485f = str2;
        this.f266486g = y2Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14217, this.f266483d.f68404x28d45f97, 6, this.f266484e, this.f266485f, 3);
        dialogInterface.dismiss();
        this.f266487h.i5(this.f266486g, "doResumeDownloadTask:fail_network_not_wifi", null);
    }
}
