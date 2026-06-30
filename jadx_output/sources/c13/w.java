package c13;

/* loaded from: classes8.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f37931d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f37932e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(java.lang.String str, boolean z17) {
        super(2);
        this.f37931d = str;
        this.f37932e = z17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Map paramsBuilder = (java.util.Map) obj2;
        kotlin.jvm.internal.o.g((io.flutter.embedding.engine.FlutterEngine) obj, "<anonymous parameter 0>");
        kotlin.jvm.internal.o.g(paramsBuilder, "paramsBuilder");
        paramsBuilder.put("TalkerUsername", this.f37931d);
        java.lang.String r17 = c01.z1.r();
        kotlin.jvm.internal.o.f(r17, "getUsernameFromUserInfo(...)");
        paramsBuilder.put("MyUserName", r17);
        paramsBuilder.put("IsVideoMode", java.lang.Boolean.valueOf(this.f37932e));
        paramsBuilder.put("HadShowAudioMenu", java.lang.Boolean.TRUE);
        return jz5.f0.f302826a;
    }
}
