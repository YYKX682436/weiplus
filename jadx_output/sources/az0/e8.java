package az0;

/* loaded from: classes16.dex */
public final class e8 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.frame.VideoFrame f15441d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15442e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f15443f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.z f15444g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f15445h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f15446i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8(com.tencent.maas.camstudio.frame.VideoFrame videoFrame, java.lang.String str, boolean z17, com.tencent.maas.camstudio.z zVar, boolean z18, boolean z19) {
        super(2);
        this.f15441d = videoFrame;
        this.f15442e = str;
        this.f15443f = z17;
        this.f15444g = zVar;
        this.f15445h = z18;
        this.f15446i = z19;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.maas.camstudio.MJCamSession camSession = (com.tencent.maas.camstudio.MJCamSession) obj;
        yz5.l cb6 = (yz5.l) obj2;
        kotlin.jvm.internal.o.g(camSession, "camSession");
        kotlin.jvm.internal.o.g(cb6, "cb");
        camSession.m(this.f15441d, this.f15442e, this.f15443f, this.f15444g, this.f15445h, this.f15446i, new az0.x8(cb6));
        return jz5.f0.f302826a;
    }
}
