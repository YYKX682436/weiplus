package qg3;

/* loaded from: classes2.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qg3.k f444365d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(qg3.k kVar) {
        super(2);
        this.f444365d = kVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String errMsg = (java.lang.String) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        this.f444365d.P0(intValue, errMsg);
        return jz5.f0.f384359a;
    }
}
