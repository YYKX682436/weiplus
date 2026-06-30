package zo1;

/* loaded from: classes5.dex */
public final class u4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f556318d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f556319e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e f556320f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(long j17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e activityC12873xf94c39e) {
        super(0);
        this.f556318d = j17;
        this.f556319e = k3Var;
        this.f556320f = activityC12873xf94c39e;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("On animation end, do real delete for pkgId=");
        long j17 = this.f556318d;
        sb6.append(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectPackageUI", sb6.toString());
        this.f556319e.m8206x3c5056b8(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e activityC12873xf94c39e = this.f556320f;
        activityC12873xf94c39e.f174402h.z(j17);
        if (activityC12873xf94c39e.f174402h.mo1894x7e414b06() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e.Z6(activityC12873xf94c39e, true);
        }
        return jz5.f0.f384359a;
    }
}
