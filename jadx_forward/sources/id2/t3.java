package id2;

/* loaded from: classes.dex */
public final class t3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.u3 f372336d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f372337e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f372338f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f372339g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f372340h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f372341i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f372342m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(id2.u3 u3Var, android.content.Context context, long j17, long j18, boolean z17, boolean z18, boolean z19) {
        super(1);
        this.f372336d = u3Var;
        this.f372337e = context;
        this.f372338f = j17;
        this.f372339g = j18;
        this.f372340h = z17;
        this.f372341i = z18;
        this.f372342m = z19;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePersonalCente", "set auto replay gen");
            id2.u3 u3Var = this.f372336d;
            android.content.Context context = this.f372337e;
            id2.u3.Q6(u3Var, context, this.f372338f, this.f372339g, this.f372340h, this.f372341i, this.f372342m, true, new id2.s3(u3Var, context));
        }
        return jz5.f0.f384359a;
    }
}
