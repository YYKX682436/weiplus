package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class i0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.m0 f95025d;

    public i0(com.tencent.mm.plugin.card.ui.m0 m0Var) {
        this.f95025d = m0Var;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        int i17 = 0;
        while (true) {
            com.tencent.mm.plugin.card.ui.m0 m0Var = this.f95025d;
            if (i17 >= m0Var.f95074d.S.size()) {
                return;
            }
            if ("menu_func_delete".equals(m0Var.f95074d.Q.get(java.lang.Integer.valueOf(i17)))) {
                g4Var.d(i17, m0Var.f95074d.f94936e.getResources().getColor(com.tencent.mm.R.color.f478532ac), (java.lang.CharSequence) m0Var.f95074d.S.get(i17));
            } else {
                g4Var.f(i17, (java.lang.CharSequence) m0Var.f95074d.S.get(i17));
            }
            i17++;
        }
    }
}
