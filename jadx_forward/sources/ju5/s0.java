package ju5;

/* loaded from: classes15.dex */
public class s0 implements hu5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ju5.u0 f383682a;

    public s0(ju5.u0 u0Var) {
        this.f383682a = u0Var;
    }

    @Override // hu5.a
    public void a(int i17, java.lang.String str) {
        ju5.u0 u0Var = this.f383682a;
        zt5.h.f("Soter.TaskPrepareAuthKey", "soter: auth key %s generate failed. errcode: %d, errmsg: %s", u0Var.f383689c, java.lang.Integer.valueOf(i17), str);
        u0Var.h(u0Var.f383689c, 0);
        u0Var.b(new eu5.c(i17, str));
    }

    @Override // hu5.a
    /* renamed from: onSuccess */
    public void mo134170xe05b4124() {
        zt5.h.c("Soter.TaskPrepareAuthKey", "soter: auth key generate successfully. start upload", new java.lang.Object[0]);
        ju5.u0 u0Var = this.f383682a;
        if (u0Var.f383691e != null) {
            u0Var.h(u0Var.f383689c, 2);
        } else {
            u0Var.h(u0Var.f383689c, 0);
        }
        zt5.r e17 = wt5.a.e(u0Var.f383689c);
        if (e17 == null) {
            zt5.h.b("Soter.TaskPrepareAuthKey", "soter: auth key model is null even after generation. fatal error", new java.lang.Object[0]);
            wt5.a.s(u0Var.f383689c, false);
            u0Var.b(new eu5.c(1006, "auth key model is null even after generation."));
            return;
        }
        iu5.e eVar = u0Var.f383691e;
        if (eVar == null) {
            zt5.h.a("Soter.TaskPrepareAuthKey", "soter: not provide network wrapper instance. please check if it is what you want. we treat it as normal", new java.lang.Object[0]);
            u0Var.b(new eu5.c(0, "treat as normal because you do not provide the net wrapper", e17));
        } else {
            eVar.j(new iu5.c(e17.f557152g, e17.f557150e));
            eVar.B(new ju5.t0(u0Var, e17));
            eVar.x();
        }
    }
}
