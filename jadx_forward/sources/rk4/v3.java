package rk4;

/* loaded from: classes11.dex */
public final class v3 extends rk4.x3 {

    /* renamed from: e, reason: collision with root package name */
    public final pi0.l1 f478553e;

    public v3(pi0.l1 l1Var, bw5.l20 l20Var) {
        this.f478553e = l1Var;
    }

    @Override // rk4.x3
    public void a(w71.t0 t0Var, java.util.Map map, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(t0Var);
        bw5.j20 Pa = t0Var.Pa();
        if (this.f478553e == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("no engine found, handlerId: ");
            sb6.append(Pa.f110308h[1] ? Pa.f110304d : "");
            java.lang.String sb7 = sb6.toString();
            int i17 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PlatformHybridRouter", sb7, null);
        } else {
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new rk4.u3(this, Pa, map, null), 3, null);
        }
        bw5.k20 k20Var = new bw5.k20();
        k20Var.f110741d = Pa.f110308h[1] ? Pa.f110304d : "";
        k20Var.f110742e[1] = true;
        if (lVar != null) {
            lVar.mo146xb9724478(k20Var);
        }
    }

    @Override // w71.r0
    public java.lang.String r() {
        return "java";
    }
}
