package com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui;

/* loaded from: classes11.dex */
public final class e0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ug3.k f269536d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.k0 f269537e;

    public e0(ug3.k kVar, com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.k0 k0Var) {
        this.f269536d = kVar;
        this.f269537e = k0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        r45.l44 l44Var = r45.l44.kKeepLoggedInDisabled;
        ug3.k kVar = this.f269536d;
        ug3.i.I(kVar, l44Var);
        kVar.N = false;
        this.f269537e.F.setChecked(!r1.isChecked());
    }
}
