package az0;

/* loaded from: classes16.dex */
public final class ga extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.frame.VideoFrame f15508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15509e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f15510f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.z f15511g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f15512h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f15513i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga(com.tencent.maas.camstudio.frame.VideoFrame videoFrame, java.lang.String str, boolean z17, com.tencent.maas.camstudio.z zVar, boolean z18, boolean z19) {
        super(2);
        this.f15508d = videoFrame;
        this.f15509e = str;
        this.f15510f = z17;
        this.f15511g = zVar;
        this.f15512h = z18;
        this.f15513i = z19;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.maas.camstudio.MJCamoSession camoSession = (com.tencent.maas.camstudio.MJCamoSession) obj;
        yz5.l cb6 = (yz5.l) obj2;
        kotlin.jvm.internal.o.g(camoSession, "camoSession");
        kotlin.jvm.internal.o.g(cb6, "cb");
        camoSession.o(this.f15508d, this.f15509e, this.f15510f, this.f15511g, this.f15512h, this.f15513i, new az0.za(cb6));
        return jz5.f0.f302826a;
    }
}
