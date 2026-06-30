package zo1;

/* loaded from: classes5.dex */
public final class a1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f556075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e f556076e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ po1.d f556077f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e activityC12868xd8a7d79e, po1.d dVar) {
        super(2);
        this.f556075d = u3Var;
        this.f556076e = activityC12868xd8a7d79e;
        this.f556077f = dVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        long longValue = ((java.lang.Number) obj2).longValue();
        ((ku5.t0) ku5.t0.f394148d).B(new zo1.z0(this.f556075d, this.f556076e, this.f556077f, intValue, longValue));
        if (intValue == 0) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g k17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a.k(longValue);
            if (k17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CreatePackageUI", "Fail to get pkg by id=" + longValue);
            } else {
                qo1.j1.f447056a.g(k17);
            }
        }
        return jz5.f0.f384359a;
    }
}
