package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class n2 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.g1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f272029a;

    public n2(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33) {
        this.f272029a = c19666xfd6e2f33;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.g1
    public void a(int i17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f272029a;
        if (c19666xfd6e2f33.f271515f2 == null) {
            c19666xfd6e2f33.q0();
        }
        int i18 = c19666xfd6e2f33.f271632y2;
        c19666xfd6e2f33.f271538j2 = i18 + i17;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19678x1ab789dd c19678x1ab789dd = c19666xfd6e2f33.f271515f2;
        if (c19678x1ab789dd != null) {
            c19678x1ab789dd.f271657f = i18 + i17;
            for (int i19 = 0; i19 < c19678x1ab789dd.getChildCount(); i19++) {
                android.view.View childAt = c19678x1ab789dd.getChildAt(i19);
                if (childAt != c19678x1ab789dd.f271663o) {
                    childAt.setTranslationY(-r1);
                }
            }
            c19678x1ab789dd.c(false, false);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.g1
    public void b(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatFooter", "finished sliding emoji panel, expanded = %s", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f272029a;
        c19666xfd6e2f33.X0(c19666xfd6e2f33.m75453x591f0b97());
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = c19666xfd6e2f33.f271514f;
        if (abstractC19636xc6b37291 != null) {
            abstractC19636xc6b37291.mo75332x1639a62(z17);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.g1
    public void c(int i17, int i18, int i19, int i27) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.g1
    public void d() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19678x1ab789dd c19678x1ab789dd;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f272029a;
        c19666xfd6e2f33.f271515f2.getHeight();
        int i17 = c19666xfd6e2f33.f271617w2;
        c19666xfd6e2f33.G.getMeasuredHeight();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.h1 h1Var = c19666xfd6e2f33.f271532i;
        if (h1Var == null || (c19678x1ab789dd = c19666xfd6e2f33.f271515f2) == null || c19666xfd6e2f33.G == null) {
            return;
        }
        ((ym5.f0) h1Var).b(c19678x1ab789dd.getHeight(), c19666xfd6e2f33.f271617w2, c19666xfd6e2f33.G.getMeasuredHeight());
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.g1
    public void e(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.g1
    public void f(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatFooter", "start sliding emoji panel, expanded = %s", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f272029a;
        c19666xfd6e2f33.X0(c19666xfd6e2f33.m75453x591f0b97());
    }
}
