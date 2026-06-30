package yx0;

/* loaded from: classes5.dex */
public final class u5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f549221d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f549222e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(yx0.b8 b8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f549222e = b8Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yx0.u5(this.f549222e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.u5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f549221d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            ((yy0.k8) ((pp0.q0) i95.n0.c(pp0.q0.class))).getClass();
            az0.i5 i5Var = az0.i5.f97090a;
            if (!(az0.i5.f97093d == az0.x2.f97572f && az0.i5.f97096g)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingCorePlugin", "reportMaasCoreWillStartUp");
                pp0.l0 l0Var = (pp0.l0) i95.n0.c(pp0.l0.class);
                pp0.m0 m0Var = (pp0.m0) i95.n0.c(pp0.m0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m0Var);
                pp0.m0.n3(m0Var, "mjpublisher_maas_core_start_up", null, 2, null);
                jz5.l[] lVarArr = new jz5.l[2];
                yy0.m7 m7Var = (yy0.m7) l0Var;
                lVarArr[0] = new jz5.l("mj_publisher_session_id", m7Var.Ri());
                lVarArr[1] = new jz5.l("is_first_init", m7Var.aj() ? "1" : "0");
                pp0.m0.V8(m0Var, kz5.c1.k(lVarArr), "mjpublisher_maas_core_start_up", null, 4, null);
            }
            pp0.q0 q0Var = (pp0.q0) i95.n0.c(pp0.q0.class);
            yx0.t5 t5Var = yx0.t5.f549192d;
            ((yy0.k8) q0Var).getClass();
            az0.i5.s(az0.i5.f97090a, true, t5Var, false, 4, null);
            yx0.b8 b8Var = this.f549222e;
            this.f549221d = 1;
            java.util.concurrent.locks.ReentrantLock reentrantLock = yx0.b8.f548704c2;
            b8Var.getClass();
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            obj = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, new yx0.h2(b8Var, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return obj;
    }
}
