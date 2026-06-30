package xc2;

/* loaded from: classes2.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f534690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p093xedfae76a.j0 f534691e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xc2.k0 f534692f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, p012xc85e97e9.p093xedfae76a.j0 j0Var, xc2.k0 k0Var) {
        super(1);
        this.f534690d = c14994x9b99c079;
        this.f534691e = j0Var;
        this.f534692f = k0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.h61 resp = (r45.h61) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f534690d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedGlobalJumperUIC", "requestHelpPromotionInfo success ".concat(pm0.v.u(c14994x9b99c079.m59251x5db1b11())));
        this.f534691e.mo7808x76db6cb1((r45.fm2) resp.m75936x14adae67(1));
        this.f534692f.f534724x.remove(java.lang.Long.valueOf(c14994x9b99c079.m59251x5db1b11()));
        return jz5.f0.f384359a;
    }
}
