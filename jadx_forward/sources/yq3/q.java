package yq3;

/* loaded from: classes11.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yq3.v f546050d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(yq3.v vVar) {
        super(1);
        this.f546050d = vVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String value = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        yq3.v vVar = this.f546050d;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = vVar.f546068f;
        if (z3Var != null) {
            z3Var.d3(value);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.ya yaVar = vVar.f546069g;
        if (yaVar != null) {
            yaVar.f66690xbe857eff = value;
        }
        return jz5.f0.f384359a;
    }
}
