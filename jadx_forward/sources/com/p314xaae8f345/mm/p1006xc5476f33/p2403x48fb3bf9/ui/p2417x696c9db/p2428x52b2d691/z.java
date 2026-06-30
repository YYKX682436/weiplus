package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes8.dex */
public final class z implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.r1 f268225d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f268226e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f268227f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f268228g;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.r1 r1Var, nw4.k kVar, nw4.y2 y2Var, java.util.HashMap hashMap) {
        this.f268225d = r1Var;
        this.f268226e = kVar;
        this.f268227f = y2Var;
        this.f268228g = hashMap;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.r1 r1Var = this.f268225d;
        if (r1Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m1) r1Var).O("cancelled");
        }
        nw4.g gVar = this.f268226e.f422396d;
        nw4.y2 y2Var = this.f268227f;
        gVar.e(y2Var.f422546c, y2Var.f422552i + ":cancelled", this.f268228g);
    }
}
