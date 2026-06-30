package id2;

/* loaded from: classes.dex */
public final class r3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.u3 f372314d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f372315e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f372316f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f372317g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f372318h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(id2.u3 u3Var, android.content.Context context, long j17, long j18, yz5.l lVar) {
        super(1);
        this.f372314d = u3Var;
        this.f372315e = context;
        this.f372316f = j17;
        this.f372317g = j18;
        this.f372318h = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePersonalCente", "onReplayCancelCallBack triggered with isEnabled=" + booleanValue);
        if (booleanValue) {
            id2.u3 u3Var = this.f372314d;
            android.content.Context context = this.f372315e;
            long j17 = this.f372316f;
            p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(u3Var.m158354x19263085()), null, null, new id2.p2(context, j17, new id2.q3(u3Var, context, j17, this.f372317g, this.f372318h), null), 3, null);
        }
        return jz5.f0.f384359a;
    }
}
