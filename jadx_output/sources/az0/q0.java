package az0;

/* loaded from: classes16.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.f2 f15821d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.frame.VideoFrame f15822e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15823f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f15824g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.z f15825h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f15826i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f15827m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(az0.f2 f2Var, com.tencent.maas.camstudio.frame.VideoFrame videoFrame, java.lang.String str, boolean z17, com.tencent.maas.camstudio.z zVar, boolean z18, boolean z19) {
        super(1);
        this.f15821d = f2Var;
        this.f15822e = videoFrame;
        this.f15823f = str;
        this.f15824g = z17;
        this.f15825h = zVar;
        this.f15826i = z18;
        this.f15827m = z19;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yz5.l it = (yz5.l) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f15821d.f15460d.m(this.f15822e, this.f15823f, this.f15824g, this.f15825h, this.f15826i, this.f15827m, new az0.i1(it));
        return jz5.f0.f302826a;
    }
}
