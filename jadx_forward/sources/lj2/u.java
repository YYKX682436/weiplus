package lj2;

/* loaded from: classes3.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lj2.c0 f400486d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(lj2.c0 c0Var) {
        super(2);
        this.f400486d = c0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        lj2.c0 c0Var = this.f400486d;
        if (intValue != 2) {
            qo0.c cVar = c0Var.f400369g;
            if (cVar != null) {
                qo0.c.a(cVar, qo0.b.f446974y4, null, 2, null);
            }
        } else if (intValue2 == 3) {
            qo0.c cVar2 = c0Var.f400369g;
            if (cVar2 != null) {
                qo0.c.a(cVar2, qo0.b.I3, null, 2, null);
            }
        } else {
            qo0.c cVar3 = c0Var.f400369g;
            if (cVar3 != null) {
                qo0.c.a(cVar3, qo0.b.H3, null, 2, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
