package jd3;

/* loaded from: classes.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jd3.g f380710d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(jd3.g gVar) {
        super(2);
        this.f380710d = gVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String errMsg = (java.lang.String) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        jd3.g gVar = this.f380710d;
        if (intValue == 0) {
            gVar.s().mo146xb9724478(gVar.k());
        } else {
            gVar.s().mo146xb9724478(gVar.h(intValue, errMsg));
        }
        return jz5.f0.f384359a;
    }
}
