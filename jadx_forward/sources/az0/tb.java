package az0;

/* loaded from: classes16.dex */
public final class tb extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f97456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4084x74642117 f97457e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3978x9b06196b f97458f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb(java.lang.String str, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4084x74642117 c4084x74642117, com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3978x9b06196b c3978x9b06196b) {
        super(2);
        this.f97456d = str;
        this.f97457e = c4084x74642117;
        this.f97458f = c3978x9b06196b;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 camoSession = (com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19) obj;
        yz5.l cb6 = (yz5.l) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(camoSession, "camoSession");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cb6, "cb");
        az0.za zaVar = new az0.za(cb6);
        camoSession.s0(this.f97456d, this.f97457e, this.f97458f, zaVar);
        return jz5.f0.f384359a;
    }
}
