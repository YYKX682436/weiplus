package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class o8 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.yt5 f239397d;

    public o8(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.p8 p8Var, r45.yt5 yt5Var) {
        this.f239397d = yt5Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceUI", "onMenuItemClick");
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        try {
            m27539xaf65a0fc.mo27555xc6c7e3f0("route_info", this.f239397d.mo14344x5f01b1f6());
            ((h45.q) i95.n0.c(h45.q.class)).mo24837xef221a95("commonRoute", m27539xaf65a0fc, new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.n8(this));
            return true;
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemittanceUI", "exception: %s", e17);
            return true;
        }
    }
}
