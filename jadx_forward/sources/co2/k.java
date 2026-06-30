package co2;

/* loaded from: classes2.dex */
public final class k extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f125325d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f125326e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f125327f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f125328g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f125329h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f125330i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f125331m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f125325d = "Finder.MegaVideo.SeeLaterDetailUIC";
        this.f125326e = jz5.h.b(new co2.h(activity));
        this.f125327f = jz5.h.b(new co2.g(this));
        this.f125328g = jz5.h.b(new co2.f(this));
        this.f125329h = jz5.h.b(new co2.e(this));
        this.f125330i = jz5.h.b(new co2.j(this));
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1562x28550ec7.C14445x62c29b8c O6() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1562x28550ec7.C14445x62c29b8c) ((jz5.n) this.f125329h).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f P6() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f) ((jz5.n) this.f125327f).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dj8;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        android.view.View view;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4;
        android.view.View view2;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e42;
        vn2.u0 u0Var = vn2.u0.f519920a;
        jz5.l lVar = vn2.u0.f519925f;
        java.lang.String str = this.f125325d;
        if (lVar != null && ((java.lang.Number) lVar.f384366d).longValue() == m158359x1e885992().getLongExtra("key_see_later_data_key", 0L)) {
            java.util.AbstractCollection m56388xcaeb60d0 = O6().m56388xcaeb60d0();
            java.lang.Object obj = lVar.f384367e;
            m56388xcaeb60d0.addAll((java.util.Collection) obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "get cache data size=" + ((java.util.List) obj).size());
            vn2.u0.f519925f = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13922x2e8bf6c7.m56397xe61f0140(O6(), (co2.i) ((jz5.n) this.f125330i).mo141623x754a37bb(), false, 2, null);
        int size = O6().m56388xcaeb60d0().size();
        u0Var.l(str, "initView data list size=" + size);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) ((jz5.n) this.f125328g).mo141623x754a37bb();
        c22849x81a93d25.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(m158354x19263085()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.k kVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.k(O6().m56388xcaeb60d0(), false, null);
        kVar.f374638o = new co2.a(this, c22849x81a93d25);
        kVar.f374637n = new co2.b(this);
        c22849x81a93d25.mo7960x6cab2c8d(kVar);
        ym5.a1.g(c22849x81a93d25, new co2.c(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f P6 = P6();
        on5.d m82929x3feb4d92 = P6.m82929x3feb4d92();
        if (m82929x3feb4d92 != null && (view2 = m82929x3feb4d92.getView()) != null && (c22627xa933f8e42 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4) view2.findViewById(com.p314xaae8f345.mm.R.id.f568121lr5)) != null) {
            c22627xa933f8e42.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.akq);
        }
        on5.c m82923x19404fcc = P6.m82923x19404fcc();
        if (m82923x19404fcc != null && (view = m82923x19404fcc.getView()) != null && (c22627xa933f8e4 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4) view.findViewById(com.p314xaae8f345.mm.R.id.ilh)) != null) {
            c22627xa933f8e4.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.akq);
        }
        P6.m82945xba09cf09(new co2.d(this));
        if (size <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122.m56345x587162dc(O6(), false, 1, null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        O6().m56401x31d4943c((co2.i) ((jz5.n) this.f125330i).mo141623x754a37bb());
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        if (this.f125331m) {
            ((co2.i) ((jz5.n) this.f125330i).mo141623x754a37bb()).mo56048x7bb163d5();
        }
        this.f125331m = false;
    }
}
