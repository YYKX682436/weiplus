package a0;

/* loaded from: classes14.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e1.r f128d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f129e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f130f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g1.j f131g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e1.r rVar, long j17, long j18, g1.j jVar) {
        super(1);
        this.f128d = rVar;
        this.f129e = j17;
        this.f130f = j18;
        this.f131g = jVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        g1.f onDrawWithContent = (g1.f) obj;
        kotlin.jvm.internal.o.g(onDrawWithContent, "$this$onDrawWithContent");
        ((u1.o0) onDrawWithContent).b();
        g1.h.g(onDrawWithContent, this.f128d, this.f129e, this.f130f, 0.0f, this.f131g, null, 0, 104, null);
        return jz5.f0.f302826a;
    }
}
