package pk2;

/* loaded from: classes3.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437173d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f437174e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v65.n f437175f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f437176g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f437177h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(pk2.o9 o9Var, long j17, v65.n nVar, yz5.l lVar, boolean z17) {
        super(2);
        this.f437173d = o9Var;
        this.f437174e = j17;
        this.f437175f = nVar;
        this.f437176g = lVar;
        this.f437177h = z17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f437173d.f437605a, "modifyAnchorStatusFlagLong: succ=" + booleanValue + ", flag=" + this.f437174e);
        if (booleanValue) {
            pm0.v.X(new pk2.c(this.f437176g, this.f437177h));
        }
        this.f437175f.a(java.lang.Boolean.valueOf(booleanValue));
        return jz5.f0.f384359a;
    }
}
