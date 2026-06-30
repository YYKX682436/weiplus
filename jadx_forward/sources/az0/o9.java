package az0;

/* loaded from: classes16.dex */
public final class o9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f97312d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4084x74642117 f97313e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3978x9b06196b f97314f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o9(java.lang.String str, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4084x74642117 c4084x74642117, com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3978x9b06196b c3978x9b06196b) {
        super(2);
        this.f97312d = str;
        this.f97313e = c4084x74642117;
        this.f97314f = c3978x9b06196b;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 camSession = (com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944) obj;
        yz5.l cb6 = (yz5.l) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(camSession, "camSession");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cb6, "cb");
        az0.x8 x8Var = new az0.x8(cb6);
        camSession.Z(this.f97312d, this.f97313e, this.f97314f, x8Var);
        return jz5.f0.f384359a;
    }
}
