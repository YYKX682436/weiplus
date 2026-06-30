package sb2;

/* loaded from: classes3.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f486956d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf f486957e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f486958f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.content.Intent intent, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf zfVar, in5.s0 s0Var) {
        super(3);
        this.f486956d = intent;
        this.f486957e = zfVar;
        this.f486958f = s0Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.content.Intent it = (android.content.Intent) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((ug5.v) obj2, "<anonymous parameter 1>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.content.Intent intent = this.f486956d;
        intent.putExtras(it);
        in5.s0 s0Var = this.f486958f;
        java.lang.Object obj4 = s0Var.f374658i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj4, "getAssociatedObject(...)");
        this.f486957e.S1((so2.j5) obj4, s0Var, booleanValue, intent);
        return jz5.f0.f384359a;
    }
}
