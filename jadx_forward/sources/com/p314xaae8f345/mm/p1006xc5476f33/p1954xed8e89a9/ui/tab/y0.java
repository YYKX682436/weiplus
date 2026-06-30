package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes11.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 f236231d;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 m0Var) {
        this.f236231d = m0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 m0Var = this.f236231d;
        m0Var.k(4, null);
        if (m0Var.f235989h.getIntent().getIntExtra("Kdel_from", -1) == 1) {
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(67108864);
            ((c34.b0) ((yd0.j) i95.n0.c(yd0.j.class))).wi(m0Var.f235989h, intent, false);
        }
        ((c01.k7) c01.n8.a()).e(m0Var.f235992n.d1());
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s4 s4Var = m0Var.f235997s;
        if (s4Var.j().getVisibility() == 0) {
            s4Var.j().setVisibility(8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ContactWidgetTabBizHeaderView", "unFocus, followMoreView dismiss");
        }
        m0Var.f235997s.z();
    }
}
