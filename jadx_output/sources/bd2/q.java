package bd2;

/* loaded from: classes2.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f19279d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f19280e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f19281f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f19282g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f19283h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(android.content.Context context, long j17, java.lang.String str, java.lang.String str2, boolean z17) {
        super(0);
        this.f19279d = context;
        this.f19280e = j17;
        this.f19281f = str;
        this.f19282g = str2;
        this.f19283h = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bd2.r rVar = bd2.r.f19284a;
        rVar.d(this.f19279d, this.f19280e, true);
        rVar.c(this.f19279d, this.f19280e, this.f19281f, this.f19282g, java.lang.Boolean.valueOf(this.f19283h), null);
        return jz5.f0.f302826a;
    }
}
