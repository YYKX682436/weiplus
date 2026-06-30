package cg2;

/* loaded from: classes5.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cg2.q f41127d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cg2.r f41128e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cg2.w f41129f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wp.i f41130g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f41131h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f41132i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(cg2.q qVar, cg2.r rVar, cg2.w wVar, wp.i iVar, boolean z17, java.lang.Runnable runnable) {
        super(0);
        this.f41127d = qVar;
        this.f41128e = rVar;
        this.f41129f = wVar;
        this.f41130g = iVar;
        this.f41131h = z17;
        this.f41132i = runnable;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("LiveFeedCenterDanmakuRender", "[actualRecycleDanmaku] with " + this.f41127d + ", " + this.f41128e);
        super/*yp.p*/.h(this.f41130g, this.f41131h, this.f41132i);
        return jz5.f0.f302826a;
    }
}
