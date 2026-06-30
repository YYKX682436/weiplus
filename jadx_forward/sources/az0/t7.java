package az0;

/* loaded from: classes16.dex */
public final class t7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f97451d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(java.lang.String str) {
        super(2);
        this.f97451d = str;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 camSession = (com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944) obj;
        yz5.l cb6 = (yz5.l) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(camSession, "camSession");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cb6, "cb");
        camSession.e(this.f97451d, new az0.x8(cb6));
        return jz5.f0.f384359a;
    }
}
