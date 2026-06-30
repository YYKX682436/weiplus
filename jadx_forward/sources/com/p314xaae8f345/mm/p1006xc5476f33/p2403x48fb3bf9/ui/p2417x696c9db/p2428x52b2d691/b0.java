package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes8.dex */
public final class b0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.r1 f267485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267486e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267487f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f267488g;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.r1 r1Var, nw4.k kVar, nw4.y2 y2Var, java.util.HashMap hashMap) {
        this.f267485d = r1Var;
        this.f267486e = kVar;
        this.f267487f = y2Var;
        this.f267488g = hashMap;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.r1 r1Var = this.f267485d;
        if (r1Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m1) r1Var).O("ok");
        }
        nw4.g gVar = this.f267486e.f422396d;
        nw4.y2 y2Var = this.f267487f;
        gVar.e(y2Var.f422546c, y2Var.f422552i + ":ok", this.f267488g);
    }
}
