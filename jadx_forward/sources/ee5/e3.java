package ee5;

/* loaded from: classes9.dex */
public final class e3 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements tj5.w, tj5.n {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 f333401d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f333402e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f333403f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f333404g;

    /* renamed from: h, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f333405h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f333402e = "";
        this.f333403f = "";
        this.f333404g = true;
    }

    @Override // tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiSearchViewUIC", "onEditTextChange: " + str2 + ", " + str + ", " + oVar);
        if (!(str == null || str.length() == 0)) {
            if (oVar == tj5.o.UserInput) {
                java.lang.String p17 = o13.n.p(str);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f333403f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f333403f, p17)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiSearchViewUIC", "Same query %s %s", this.f333403f, p17);
                    return;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(p17);
                this.f333403f = p17;
                p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f333405h;
                if (r2Var != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                }
                this.f333405h = pf5.e.m158343xd39de650(this, null, null, new ee5.c3(p17, this, null), 3, null);
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiSearchViewUIC", "dealClearText");
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.f333405h;
        if (r2Var2 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
        }
        this.f333403f = "";
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f435481a;
        ((ee5.a3) zVar.a(activity).a(ee5.a3.class)).P6(0);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
        ((ee5.q3) zVar.a(activity2).a(ee5.q3.class)).T6(8);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity3 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity3, "activity");
        ((ee5.z) zVar.a(activity3).a(ee5.z.class)).X6("");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity4 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity4, "activity");
        ee5.h0 h0Var = (ee5.h0) zVar.a(activity4).a(ee5.h0.class);
        h0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiItemAllResultUIC", "clear text");
        h0Var.Q6();
        if (h0Var.f333429e != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(h0Var.f333429e);
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var3 = h0Var.f333442u;
        if (r2Var3 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var3, null, 1, null);
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var4 = h0Var.F;
        if (r2Var4 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var4, null, 1, null);
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var5 = h0Var.f333445x;
        if (r2Var5 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var5, null, 1, null);
        }
        ce5.d dVar = h0Var.f333444w;
        dVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoadMoreImageDataModel", "reset");
        dVar.f122345a = null;
        p3325xe03a0797.p3326xc267989b.r2 r2Var6 = dVar.f122347c;
        if (r2Var6 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var6, null, 1, null);
        }
    }

    @Override // tj5.n
    public boolean G0() {
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 m80997xdc5215a6;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiSearchViewUIC", "onSearchKeyDown");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085).mo48674x36654fab();
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb92 = this.f333401d;
        if (c22482x50bddb92 == null || (m80997xdc5215a6 = c22482x50bddb92.m80997xdc5215a6()) == null) {
            return false;
        }
        m80997xdc5215a6.d();
        return false;
    }

    public final void O6() {
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 m80997xdc5215a6;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiSearchViewUIC", "hideKB");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085).mo48674x36654fab();
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb92 = this.f333401d;
        if (c22482x50bddb92 == null || (m80997xdc5215a6 = c22482x50bddb92.m80997xdc5215a6()) == null) {
            return;
        }
        m80997xdc5215a6.d();
    }

    @Override // tj5.n
    public void U1(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiSearchViewUIC", "onEditTextFocusChange");
    }

    @Override // tj5.n
    public void o3(int i17, tj5.x xVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiSearchViewUIC", "onTagClick");
    }

    @Override // tj5.w
    /* renamed from: onClickBackBtn */
    public void mo56568x81ab18cc(android.view.View view) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiSearchViewUIC", "onClickBackBtn");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085).mo48674x36654fab();
        m158354x19263085().finish();
    }

    @Override // tj5.n
    /* renamed from: onClickClearTextBtn */
    public void mo56570x81f2906b(android.view.View view) {
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 m80997xdc5215a6;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiSearchViewUIC", "onClickClearTextBtn");
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb92 = this.f333401d;
        if (c22482x50bddb92 != null && (m80997xdc5215a6 = c22482x50bddb92.m80997xdc5215a6()) != null) {
            m80997xdc5215a6.m();
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085).mo26063x7b383410();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        this.f333402e = m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572082y8);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiSearchViewUIC", "initSearchView");
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb92 = new com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92((android.content.Context) m158354x19263085(), false);
        this.f333401d = c22482x50bddb92;
        c22482x50bddb92.m81002xcd6a5043(this);
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb922 = this.f333401d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22482x50bddb922);
        c22482x50bddb922.m80997xdc5215a6().m80989x764b0e09(this.f333402e);
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb923 = this.f333401d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22482x50bddb923);
        c22482x50bddb923.m80997xdc5215a6().g();
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb924 = this.f333401d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22482x50bddb924);
        c22482x50bddb924.m80997xdc5215a6().m80988xce28f7ee(this);
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb925 = this.f333401d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22482x50bddb925);
        c22482x50bddb925.m80997xdc5215a6().m80980x55355581(false);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085).mo2533x106ab264();
        if (mo2533x106ab264 == null) {
            return;
        }
        mo2533x106ab264.y(this.f333401d);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        if (this.f333404g) {
            com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb92 = this.f333401d;
            if (c22482x50bddb92 != null) {
                c22482x50bddb92.postDelayed(new ee5.d3(this), 128L);
            }
            this.f333404g = false;
        }
    }
}
