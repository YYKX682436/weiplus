package zl2;

/* loaded from: classes3.dex */
public final class g1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk2.e f555312d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f555313e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(gk2.e eVar, yz5.a aVar) {
        super(2);
        this.f555312d = eVar;
        this.f555313e = aVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        r45.xn1 xn1Var = (r45.xn1) obj2;
        if (((java.lang.Boolean) obj).booleanValue()) {
            ((mm2.c1) this.f555312d.a(mm2.c1.class)).t8(xn1Var != null ? xn1Var.m75941xfb821914(11) : null);
        }
        yz5.a aVar = this.f555313e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        return jz5.f0.f384359a;
    }
}
