package rn2;

/* loaded from: classes15.dex */
public final class q2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn2.t2 f479358d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(rn2.t2 t2Var) {
        super(2);
        this.f479358d = t2Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.EnumC24416x82f1a476 action = (com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.EnumC24416x82f1a476) obj;
        r45.h32 h32Var = (r45.h32) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        if (action != com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.EnumC24416x82f1a476.f43669x24a738) {
            rn2.t2 t2Var = this.f479358d;
            rn2.f fVar = t2Var.f479387f;
            if (fVar != null) {
                rn2.c1 c1Var = (rn2.c1) fVar;
                c1Var.f479207q = h32Var;
                c1Var.g(c1Var.f479201h, true);
            }
            t2Var.w();
        }
        return jz5.f0.f384359a;
    }
}
