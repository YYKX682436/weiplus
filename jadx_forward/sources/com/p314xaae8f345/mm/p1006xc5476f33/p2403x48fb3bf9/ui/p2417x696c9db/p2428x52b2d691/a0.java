package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes8.dex */
public final class a0 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.r1 f267462d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267463e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267464f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f267465g;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.r1 r1Var, nw4.k kVar, nw4.y2 y2Var, java.util.HashMap hashMap) {
        this.f267462d = r1Var;
        this.f267463e = kVar;
        this.f267464f = y2Var;
        this.f267465g = hashMap;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.r1 r1Var = this.f267462d;
        if (r1Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m1) r1Var).O("dismiss");
        }
        nw4.g gVar = this.f267463e.f422396d;
        nw4.y2 y2Var = this.f267464f;
        gVar.e(y2Var.f422546c, y2Var.f422552i + ":dismiss", this.f267465g);
    }
}
