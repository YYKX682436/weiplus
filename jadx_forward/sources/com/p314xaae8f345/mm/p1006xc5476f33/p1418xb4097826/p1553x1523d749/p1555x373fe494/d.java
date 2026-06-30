package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1553x1523d749.p1555x373fe494;

/* loaded from: classes3.dex */
public final class d extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1553x1523d749.p1555x373fe494.n f202369d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.att;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        long longExtra = m158354x19263085().getIntent().getLongExtra("KEY_LOTTERY_HISTORY_LIVE_ID", 0L);
        long longExtra2 = m158354x19263085().getIntent().getLongExtra("KEY_LOTTERY_HISTORY_OBJECT_ID", 0L);
        java.lang.String stringExtra = m158354x19263085().getIntent().getStringExtra("KEY_LOTTERY_HISTORY_OBJECT_NONCE_ID");
        java.lang.String str = stringExtra == null ? "" : stringExtra;
        int intExtra = m158354x19263085().getIntent().getIntExtra("KEY_SCENE", 0);
        java.lang.String stringExtra2 = m158354x19263085().getIntent().getStringExtra("KEY_LOTTERY_ID");
        java.lang.String str2 = stringExtra2 == null ? "" : stringExtra2;
        if (longExtra == 0 || longExtra2 == 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            m158354x19263085().finish();
            return;
        }
        this.f202369d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1553x1523d749.p1555x373fe494.n(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13869x297bc248(str2, longExtra, longExtra2, str, intExtra));
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1553x1523d749.p1555x373fe494.n nVar = this.f202369d;
        if (nVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1553x1523d749.p1555x373fe494.o oVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1553x1523d749.p1555x373fe494.o(abstractActivityC21394xb3d2c0cf, nVar, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1553x1523d749.p1555x373fe494.n nVar2 = this.f202369d;
        if (nVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        nVar2.g(oVar);
        boolean booleanExtra = m158359x1e885992().getBooleanExtra("KEY_SHOW_SETTING_TITLE", false);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630852, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x192630852).mo56582xbf7c1df6(booleanExtra ? com.p314xaae8f345.mm.R.C30867xcad56011.dxo : com.p314xaae8f345.mm.R.C30867xcad56011.dxl);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630853 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630853, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x192630853).mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1553x1523d749.p1555x373fe494.c(this));
        m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.f78247x6673c8a8).setBackgroundColor(m158354x19263085().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1553x1523d749.p1555x373fe494.n nVar = this.f202369d;
        if (nVar != null) {
            if (nVar != null) {
                nVar.mo979x3f5eee52();
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
                throw null;
            }
        }
    }
}
