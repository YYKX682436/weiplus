package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes8.dex */
public final class a0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.d0 f268626d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 f268627e;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.d0 d0Var, com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 c19775x58fd37b3) {
        this.f268626d = d0Var;
        this.f268627e = c19775x58fd37b3;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.d0 d0Var = this.f268626d;
        android.content.Context d17 = d0Var.d();
        android.app.Activity activity = d17 instanceof android.app.Activity ? (android.app.Activity) d17 : null;
        boolean z17 = false;
        if (activity != null && activity.isFinishing()) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        g4Var.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.q1 q1Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.s1.f263505a;
        if (qk.ka.a()) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 c19775x58fd37b3 = this.f268627e;
            if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.d0.a(d0Var, c19775x58fd37b3, 44) && d0Var.c(6)) {
                g4Var.l(6, d0Var.d().getString(com.p314xaae8f345.mm.R.C30867xcad56011.la_), com.p314xaae8f345.mm.R.raw.f80145xebd70552, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.d0.b(d0Var, c19775x58fd37b3, 44));
            }
        }
        java.util.Iterator it = d0Var.f268686k.iterator();
        while (it.hasNext()) {
            g4Var.v((android.view.MenuItem) it.next());
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = d0Var.f268676a;
        if (k0Var != null) {
            k0Var.j();
        }
    }
}
