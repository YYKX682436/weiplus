package ny2;

/* loaded from: classes.dex */
public final class h extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f422964d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f422965e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f422966f;

    /* renamed from: g, reason: collision with root package name */
    public ky2.w f422967g;

    /* renamed from: h, reason: collision with root package name */
    public long f422968h;

    /* renamed from: i, reason: collision with root package name */
    public long f422969i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f422970m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d9 f422971n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f422964d = "FinderLiveAnchorEditVoteUIC";
        this.f422965e = jz5.h.b(new ny2.g(activity));
        this.f422966f = jz5.h.b(new ny2.a(activity));
        this.f422970m = "";
        this.f422971n = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a9.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d9.f183626f, m80379x76847179(), m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9y), 500L, null, 8, null);
    }

    public final android.widget.TextView O6() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f422966f).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.TextView) mo141623x754a37bb;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.alo;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        this.f422967g = new ky2.w(m158354x19263085());
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f422965e).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) mo141623x754a37bb;
        c22849x81a93d25.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(m158354x19263085()));
        c22849x81a93d25.mo7960x6cab2c8d(this.f422967g);
        com.p314xaae8f345.mm.ui.fk.a(O6());
        ky2.w wVar = this.f422967g;
        if (wVar != null) {
            wVar.f395128r = new ny2.b(this);
        }
        if (wVar != null) {
            wVar.f395127q = new ny2.c(c22849x81a93d25);
        }
        O6().setOnClickListener(new ny2.f(this));
        this.f422968h = m158359x1e885992().getLongExtra("finderlivecreateparamliveid", 0L);
        this.f422969i = m158359x1e885992().getLongExtra("finderlivecreateparamobjectid", 0L);
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("finderlivecreateparamnonceobjectid");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f422970m = stringExtra;
        ky2.w wVar2 = this.f422967g;
        if (wVar2 != null) {
            ky2.r rVar = new ky2.r("", new ky2.s(false, 0, null, 7, null), 0);
            java.util.List list = wVar2.f395118e;
            list.add(rVar);
            list.add(new ky2.r("", new ky2.s(false, 0, null, 7, null), 2));
            list.add(new ky2.r("", new ky2.s(false, 0, null, 7, null), 2));
            list.add(new ky2.r("", new ky2.s(false, 0, null, 7, null), 1));
            wVar2.m8146xced61ae5();
            wVar2.f395124n = true;
        }
    }
}
