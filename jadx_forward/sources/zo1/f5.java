package zo1;

/* loaded from: classes5.dex */
public final class f5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f556144d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e f556145e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f556146f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f556147g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e activityC12873xf94c39e, int i17, long j17) {
        super(2);
        this.f556144d = u3Var;
        this.f556145e = activityC12873xf94c39e;
        this.f556146f = i17;
        this.f556147g = j17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g) obj2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Change option complete. error=");
        sb6.append(intValue);
        sb6.append(", newPkg=");
        sb6.append(gVar != null ? java.lang.Integer.valueOf(gVar.hashCode()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectPackageUI", sb6.toString());
        pm0.v.X(new zo1.e5(this.f556144d, intValue, gVar, this.f556145e, this.f556146f, this.f556147g));
        return jz5.f0.f384359a;
    }
}
