package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes7.dex */
public final class y3 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f268207d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f268208e;

    public y3(int i17, nw4.k kVar, int i18, boolean z17, int i19) {
        this.f268207d = kVar;
        this.f268208e = z17;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        int i17;
        int i18;
        nw4.k kVar = this.f268207d;
        g4Var.h(2147483646, kVar.f422393a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hr_), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7, kVar.f422393a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
        g4Var.h(2147483645, kVar.f422393a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hra), com.p314xaae8f345.mm.R.raw.f78691x7ae93edb, 0);
        if (this.f268208e) {
            boolean Ui = ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Ui();
            boolean Ai = ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Ai();
            int i19 = Ui ? com.p314xaae8f345.mm.R.C30867xcad56011.pau : com.p314xaae8f345.mm.R.C30867xcad56011.oco;
            if (Ai) {
                i17 = com.p314xaae8f345.mm.R.raw.f80845xb4becfce;
                i18 = com.p314xaae8f345.mm.R.C30859x5a72f63.f77716xe690c4ac;
            } else {
                i17 = com.p314xaae8f345.mm.R.raw.f81157xf44dbecb;
                i18 = com.p314xaae8f345.mm.R.C30859x5a72f63.f77788x5ac80f24;
            }
            g4Var.h(2147483644, kVar.f422393a.getString(i19), i17, kVar.f422393a.getResources().getColor(i18));
        }
    }
}
