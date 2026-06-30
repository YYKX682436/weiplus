package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1553x1523d749.p1555x373fe494;

/* loaded from: classes3.dex */
public final class b extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1553x1523d749.p1555x373fe494.g f202367d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
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
        int intExtra = m158354x19263085().getIntent().getIntExtra("KEY_LOTTERY_HISTORY_SCENE", 0);
        long longExtra = m158354x19263085().getIntent().getLongExtra("KEY_LOTTERY_HISTORY_LIVE_ID", 0L);
        long longExtra2 = m158354x19263085().getIntent().getLongExtra("KEY_LOTTERY_HISTORY_OBJECT_ID", 0L);
        java.lang.String stringExtra = m158354x19263085().getIntent().getStringExtra("KEY_LOTTERY_HISTORY_OBJECT_NONCE_ID");
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.lang.String stringExtra2 = m158354x19263085().getIntent().getStringExtra("KEY_LIVE_ANCHOR_USERNAME");
        java.lang.String str = stringExtra;
        this.f202367d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1553x1523d749.p1555x373fe494.g(intExtra, longExtra, longExtra2, str, stringExtra2 == null ? "" : stringExtra2, m158354x19263085().getIntent().getByteArrayExtra("KEY_LIVE_COOKIES"), m158354x19263085().getIntent().getIntExtra("KEY_LOTTERY_HISTORY_SOURCE", 0), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13868x9104670(intExtra, longExtra, longExtra2, str));
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1553x1523d749.p1555x373fe494.g gVar = this.f202367d;
        if (gVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1553x1523d749.p1555x373fe494.h hVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1553x1523d749.p1555x373fe494.h(abstractActivityC21394xb3d2c0cf, gVar, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1553x1523d749.p1555x373fe494.g gVar2 = this.f202367d;
        if (gVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        gVar2.g(hVar);
        java.lang.String stringExtra3 = m158354x19263085().getIntent().getStringExtra("KEY_CUSTOM_TITLE");
        java.lang.String str2 = stringExtra3 != null ? stringExtra3 : "";
        if (str2.length() > 0) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630852, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x192630852).mo54450xbf7c1df6(str2);
        } else {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630853 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630853, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x192630853).mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.nuc);
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630854 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630854, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x192630854).mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1553x1523d749.p1555x373fe494.a(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1553x1523d749.p1555x373fe494.g gVar = this.f202367d;
        if (gVar != null) {
            if (gVar != null) {
                gVar.mo979x3f5eee52();
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
                throw null;
            }
        }
    }
}
