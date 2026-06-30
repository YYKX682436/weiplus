package h41;

/* loaded from: classes14.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h41.x f360363d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(h41.x xVar) {
        super(2);
        this.f360363d = xVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String text = (java.lang.String) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.a aVar = this.f360363d.f360417a;
        if (aVar != null) {
            aVar.J1(text, intValue);
        }
        return jz5.f0.f384359a;
    }
}
