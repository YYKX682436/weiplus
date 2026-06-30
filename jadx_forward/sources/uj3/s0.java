package uj3;

/* loaded from: classes14.dex */
public final class s0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.v0 f509879d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yj3.g f509880e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(uj3.v0 v0Var, yj3.g gVar) {
        super(3);
        this.f509879d = v0Var;
        this.f509880e = gVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.nio.ByteBuffer data = (java.nio.ByteBuffer) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 m168155xc62d6cc8 = this.f509879d.m168155xc62d6cc8();
        if (m168155xc62d6cc8 != null) {
            m168155xc62d6cc8.mo50293x3498a0(new uj3.r0(this.f509880e, data, intValue, intValue2));
        }
        return jz5.f0.f384359a;
    }
}
