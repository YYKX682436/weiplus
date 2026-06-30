package yw3;

/* loaded from: classes11.dex */
public final class n2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f548355d;

    /* renamed from: e, reason: collision with root package name */
    public int f548356e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterWeUIDemoUI f548357f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterWeUIDemoUI repairerFlutterWeUIDemoUI, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f548357f = repairerFlutterWeUIDemoUI;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yw3.n2(this.f548357f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yw3.n2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pi0.l1 l1Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f548356e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            pi0.q Ui = ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ui();
            if (this.f548357f.e != null) {
                return f0Var;
            }
            l1Var = new pi0.l1(Ui, "flutter_magic_brush_demo", null, false, null, 28, null);
            this.f548355d = l1Var;
            this.f548356e = 1;
            if (l1Var.o("/", null, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l1Var = (pi0.l1) this.f548355d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.h5) ((jc3.d0) i95.n0.c(jc3.d0.class))).getClass();
        dq0.q qVar = new dq0.q(false);
        cd3.c cVar = new cd3.c(qVar);
        ((dq0.c0) ((dq0.i) i95.n0.c(dq0.i.class))).Ai("MagicSclDemo", cVar);
        i95.m c17 = i95.n0.c(dq0.i.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        l1Var.a(kz5.n0.S0(kz5.p1.d(qVar, cVar, c17)));
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 c10716x931597c6 = new com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6(0, 0, null, false, false, false, null, 0, false, false, false, null, 4095, null);
        com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterWeUIDemoUI repairerFlutterWeUIDemoUI = this.f548357f;
        this.f548355d = null;
        this.f548356e = 2;
        return pi0.l1.v(l1Var, repairerFlutterWeUIDemoUI, c10716x931597c6, null, null, null, this, 28, null) == aVar ? aVar : f0Var;
    }
}
