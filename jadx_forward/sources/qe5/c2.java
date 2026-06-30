package qe5;

/* loaded from: classes12.dex */
public final class c2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe5.f2 f443615d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(qe5.f2 f2Var) {
        super(1);
        this.f443615d = f2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.o2 o2Var;
        kd5.e state = (kd5.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        kd5.j jVar = (kd5.j) state.a(kd5.j.class);
        qe5.f2 f2Var = this.f443615d;
        if (jVar != null) {
            f2Var.X6(jVar.f388431b);
        }
        if (((kd5.k) state.a(kd5.k.class)) != null && f2Var.f443640g) {
            f2Var.V6();
        }
        kd5.l lVar = (kd5.l) state.a(kd5.l.class);
        if (lVar != null) {
            if (!f2Var.f443640g || (o2Var = f2Var.f443638e) == null) {
                ((ht.a) ((jt.v) i95.n0.c(jt.v.class))).Di(f2Var.m158354x19263085(), lVar.f388432b, lVar.f388435e, lVar.f388433c, lVar.f388434d);
            } else {
                ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.u0) o2Var).n(f2Var.m80379x76847179());
            }
            f2Var.W6(false);
        }
        return jz5.f0.f384359a;
    }
}
