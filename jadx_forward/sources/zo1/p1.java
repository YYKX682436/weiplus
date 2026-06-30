package zo1;

/* loaded from: classes5.dex */
public final class p1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f556261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f556262e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e f556263f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f556264g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, yz5.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e activityC12868xd8a7d79e, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var) {
        super(1);
        this.f556261d = h0Var;
        this.f556262e = aVar;
        this.f556263f = activityC12868xd8a7d79e;
        this.f556264g = u3Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreatePackageUI", "auto bind result=" + booleanValue + ", device=" + this.f556261d.f391656d);
        this.f556262e.mo152xb9724478();
        if (booleanValue) {
            ((ku5.t0) ku5.t0.f394148d).g(new zo1.n1(this.f556263f, this.f556261d, this.f556264g));
        } else {
            nf.e.f(new zo1.o1(this.f556263f, this.f556264g));
        }
        return jz5.f0.f384359a;
    }
}
