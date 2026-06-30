package az0;

/* loaded from: classes5.dex */
public final class g9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.s9 f97039d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f97040e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9(az0.s9 s9Var, yz5.l lVar) {
        super(2);
        this.f97039d = s9Var;
        this.f97040e = lVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 camSession = (com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944) obj;
        yz5.l cb6 = (yz5.l) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(camSession, "camSession");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cb6, "cb");
        camSession.P(new az0.f9(this.f97039d, this.f97040e, cb6));
        return jz5.f0.f384359a;
    }
}
