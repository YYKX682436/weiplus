package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes15.dex */
public class i0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.m0 f176558d;

    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.m0 m0Var) {
        this.f176558d = m0Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        int i17 = 0;
        while (true) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.m0 m0Var = this.f176558d;
            if (i17 >= m0Var.f176607d.S.size()) {
                return;
            }
            if ("menu_func_delete".equals(m0Var.f176607d.Q.get(java.lang.Integer.valueOf(i17)))) {
                g4Var.d(i17, m0Var.f176607d.f176469e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac), (java.lang.CharSequence) m0Var.f176607d.S.get(i17));
            } else {
                g4Var.f(i17, (java.lang.CharSequence) m0Var.f176607d.S.get(i17));
            }
            i17++;
        }
    }
}
