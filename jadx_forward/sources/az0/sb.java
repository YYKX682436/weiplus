package az0;

/* loaded from: classes16.dex */
public final class sb extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.xb f97434d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f97435e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4015x3370f4b9 f97436f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb(az0.xb xbVar, yz5.l lVar, com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4015x3370f4b9 c4015x3370f4b9) {
        super(2);
        this.f97434d = xbVar;
        this.f97435e = lVar;
        this.f97436f = c4015x3370f4b9;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 camoSession = (com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19) obj;
        yz5.l cb6 = (yz5.l) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(camoSession, "camoSession");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cb6, "cb");
        az0.xb.O0(this.f97434d, this.f97435e);
        camoSession.r0(this.f97436f, new az0.rb(cb6, camoSession));
        return jz5.f0.f384359a;
    }
}
