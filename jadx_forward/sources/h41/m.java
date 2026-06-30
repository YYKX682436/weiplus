package h41;

/* loaded from: classes14.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h41.x f360360d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(h41.x xVar) {
        super(3);
        this.f360360d = xVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String content = (java.lang.String) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) obj3).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.a aVar = this.f360360d.f360417a;
        if (aVar != null) {
            aVar.S0(content, booleanValue, booleanValue2);
        }
        return jz5.f0.f384359a;
    }
}
