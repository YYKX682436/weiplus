package c13;

/* loaded from: classes8.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f119464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f119465e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(java.lang.String str, boolean z17) {
        super(2);
        this.f119464d = str;
        this.f119465e = z17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Map paramsBuilder = (java.util.Map) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e) obj, "<anonymous parameter 0>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paramsBuilder, "paramsBuilder");
        paramsBuilder.put("TalkerUsername", this.f119464d);
        java.lang.String r17 = c01.z1.r();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getUsernameFromUserInfo(...)");
        paramsBuilder.put("MyUserName", r17);
        paramsBuilder.put("IsVideoMode", java.lang.Boolean.valueOf(this.f119465e));
        paramsBuilder.put("HadShowAudioMenu", java.lang.Boolean.TRUE);
        return jz5.f0.f384359a;
    }
}
