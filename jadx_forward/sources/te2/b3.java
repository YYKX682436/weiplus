package te2;

/* loaded from: classes3.dex */
public final class b3 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f499427d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14687x69fe4f21.Presenter f499428e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f499427d = "FinderLiveChargeAnchorIncomeUIC";
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570406ap4;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        java.lang.String str = this.f499427d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onCreate");
        if (m158354x19263085() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085).m78583x85ccfe01(8);
        }
        m80379x76847179().getWindow().addFlags(2097280);
        m80379x76847179().getWindow().addFlags(67108864);
        m80379x76847179().getWindow().clearFlags(67108864);
        m80379x76847179().getWindow().getDecorView().setSystemUiVisibility(1792);
        m80379x76847179().getWindow().addFlags(Integer.MIN_VALUE);
        m80379x76847179().getWindow().setStatusBarColor(0);
        m80379x76847179().getWindow().setNavigationBarColor(0);
        m80379x76847179().getWindow().setFormat(-3);
        m80379x76847179().getWindow().setSoftInputMode(51);
        long longExtra = m158354x19263085().getIntent().getLongExtra("KEY_LIVE_ID", 0L);
        long longExtra2 = m158354x19263085().getIntent().getLongExtra("KEY_OBJECT_ID", 0L);
        java.lang.String stringExtra = m158354x19263085().getIntent().getStringExtra("KEY_OBJECT_NONCE_ID");
        java.lang.String str2 = stringExtra == null ? "" : stringExtra;
        java.lang.String stringExtra2 = m158354x19263085().getIntent().getStringExtra("KEY_SESSION_ID");
        java.lang.String str3 = stringExtra2 != null ? stringExtra2 : "";
        boolean booleanExtra = m158354x19263085().getIntent().getBooleanExtra("KEY_IF_USE_NEW_VALUE", false);
        if (longExtra == 0 || longExtra2 == 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "onCreate: error parameter liveId = " + longExtra + ", objectId = " + longExtra2 + ", objectNonceId = " + str2 + ", sessionId:" + str3);
            m158354x19263085().finish();
            return;
        }
        this.f499428e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14687x69fe4f21.Presenter(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13872x6961ca6f(longExtra, longExtra2, str2, 1, java.lang.Boolean.valueOf(booleanExtra)));
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630852, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x192630852;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14687x69fe4f21.Presenter presenter = this.f499428e;
        if (presenter == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14687x69fe4f21.ViewCallback viewCallback = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14687x69fe4f21.ViewCallback(abstractActivityC21394xb3d2c0cf, presenter);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14687x69fe4f21.Presenter presenter2 = this.f499428e;
        if (presenter2 != null) {
            presenter2.c(viewCallback);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f499427d, "onDestroy");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14687x69fe4f21.Presenter presenter = this.f499428e;
        if (presenter != null) {
            if (presenter != null) {
                presenter.mo979x3f5eee52();
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
                throw null;
            }
        }
    }
}
