package id2;

/* loaded from: classes.dex */
public final class p3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.u3 f372268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f372269e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f372270f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f372271g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ km2.b f372272h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f372273i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(id2.u3 u3Var, android.content.Context context, long j17, long j18, km2.b bVar, yz5.l lVar) {
        super(4);
        this.f372268d = u3Var;
        this.f372269e = context;
        this.f372270f = j17;
        this.f372271g = j18;
        this.f372272h = bVar;
        this.f372273i = lVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        java.lang.String path = (java.lang.String) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) obj3).booleanValue();
        boolean booleanValue3 = ((java.lang.Boolean) obj4).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePersonalCente", "genCallback triggered with path: " + path + ", needGenHighLight: " + booleanValue + ", isChecked: " + booleanValue2 + ", onlyMember: " + booleanValue3);
        p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(this.f372268d.m158354x19263085()), null, null, new id2.o3(this.f372268d, path, this.f372269e, this.f372270f, this.f372271g, booleanValue2, booleanValue3, booleanValue, this.f372272h, this.f372273i, null), 3, null);
        return jz5.f0.f384359a;
    }
}
