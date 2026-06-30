package im2;

/* loaded from: classes3.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f374015d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(im2.z3 z3Var) {
        super(1);
        this.f374015d = z3Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.h32 it = (r45.h32) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        im2.z3 z3Var = this.f374015d;
        java.lang.String str = z3Var.f374168d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("originSendType:");
        r45.vw4 vw4Var = z3Var.f374199x0;
        sb6.append(vw4Var != null ? java.lang.Integer.valueOf(vw4Var.f470157d) : null);
        sb6.append(" change send Type to: ");
        sb6.append(it.m75939xb282bd08(18));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        r45.vw4 vw4Var2 = z3Var.f374199x0;
        if (!(vw4Var2 != null && it.m75939xb282bd08(18) == vw4Var2.f470157d)) {
            z3Var.w7(r45.vw4.a(it.m75939xb282bd08(18)));
            z3Var.f374185m2 = true;
            z3Var.R6();
        }
        return jz5.f0.f384359a;
    }
}
