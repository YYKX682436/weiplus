package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd;

/* loaded from: classes2.dex */
public final class s extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements zy2.p5 {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f183260d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.api.p1420xac8f1cfd.C13638xb683e9ec f183261e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f183262f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f183263g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f183264h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.g f183265i;

    /* renamed from: m, reason: collision with root package name */
    public r45.zn5 f183266m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f183267n;

    /* renamed from: o, reason: collision with root package name */
    public int f183268o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f183269p;

    /* renamed from: q, reason: collision with root package name */
    public r45.hr5 f183270q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f183265i = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.g();
        this.f183270q = new r45.hr5();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo2273x9d4787cb(i17, i18, intent);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.lang.String e17 = xy2.c.e(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewLife.FinderAccountSwitchUICForNewLife", "onActivityResult, requestCode:" + i17 + ", resultCode:" + i18 + " curFinderUserName:" + e17);
        if (i17 == 702) {
            if (i18 == -1) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ((c61.ub) i95.n0.c(c61.ub.class))).hj(m158354x19263085(), intent, 11103);
            }
        } else if (i17 == 11103 || i17 == 11104) {
            if (e17 == null || r26.n0.N(e17)) {
                return;
            }
            ((nn3.f) ((ra0.x) i95.n0.c(ra0.x.class))).Ni("create_new_profile_succ", null, kz5.b1.e(new jz5.l("profile_finderusername", e17)), false);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.api.p1420xac8f1cfd.C13638xb683e9ec c13638xb683e9ec = this.f183261e;
        if (!(c13638xb683e9ec != null && c13638xb683e9ec.q())) {
            return super.mo2274xbdc3c5dc();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.api.p1420xac8f1cfd.C13638xb683e9ec c13638xb683e9ec2 = this.f183261e;
        if (c13638xb683e9ec2 != null) {
            com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22821xbaee45b5.o(c13638xb683e9ec2, false, 1, null);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        java.util.Objects.toString(bundle);
        this.f183260d = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.e7x);
        android.widget.TextView textView = (android.widget.TextView) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.e7z);
        com.p314xaae8f345.mm.ui.bk.s0(textView != null ? textView.getPaint() : null);
        android.view.View view = this.f183260d;
        if (view != null) {
            view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.q(this));
        }
        r45.hr5 hr5Var = new r45.hr5();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349();
        this.f183270q = hr5Var;
        this.f183267n = xy2.c.e(m80379x76847179());
        this.f183262f = g92.b.f351302e.W1(true);
        this.f183268o = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("FinderMultiUserQuota", 2);
        this.f183266m = null;
        this.f183269p = false;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[refreshAccountSwitch] curUserName:");
        sb6.append(this.f183267n);
        sb6.append(" account.size:");
        java.util.List list = this.f183262f;
        sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        sb6.append(" isCreateShow:");
        sb6.append(this.f183269p);
        sb6.append(' ');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewLife.FinderAccountSwitchUICForNewLife", sb6.toString());
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        super.mo2287xc39f8281();
        if (m158354x19263085().isFinishing()) {
            g92.b.f351302e.P0("", "selfCenterClear");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f183265i = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.g();
        this.f183270q = new r45.hr5();
    }
}
