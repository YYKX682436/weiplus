package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes3.dex */
public final class qd extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        if (m158359x1e885992().getIntExtra("finder_jump_type", 0) == 1) {
            try {
                java.lang.String stringExtra = m158359x1e885992().getStringExtra("finder_jump_data");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                java.lang.String str = stringExtra;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.nd ndVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.nd.f190103a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.nd.f190106d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pd(this);
                boolean booleanExtra = m158359x1e885992().getBooleanExtra("is_from_app_brand", false);
                zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
                if (b6Var != null) {
                    ((c61.l7) b6Var).Zk(m158354x19263085(), str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.nd.f190104b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.nd.f190105c, booleanExtra);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(pf5.o.TAG, e17, "reserveChannelsLive exception", new java.lang.Object[0]);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.nd ndVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.nd.f190103a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.nd.f190105c.a(-1);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.nd.f190103a.a();
    }
}
