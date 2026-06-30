package az0;

/* loaded from: classes16.dex */
public final class na extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f97285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p461x3a6d265.q f97286e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p461x3a6d265.u f97287f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na(java.lang.String str, com.p314xaae8f345.p457x3304c6.p461x3a6d265.q qVar, com.p314xaae8f345.p457x3304c6.p461x3a6d265.u uVar) {
        super(2);
        this.f97285d = str;
        this.f97286e = qVar;
        this.f97287f = uVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 camoSession = (com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19) obj;
        yz5.l cb6 = (yz5.l) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(camoSession, "camoSession");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cb6, "cb");
        az0.xa xaVar = new az0.xa(cb6);
        camoSession.F(this.f97285d, this.f97286e, this.f97287f, xaVar);
        return jz5.f0.f384359a;
    }
}
