package yw3;

/* loaded from: classes11.dex */
public final class p2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f548378d;

    /* renamed from: e, reason: collision with root package name */
    public int f548379e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterWeUIDemoUI f548380f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterWeUIDemoUI repairerFlutterWeUIDemoUI, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f548380f = repairerFlutterWeUIDemoUI;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yw3.p2(this.f548380f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yw3.p2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pi0.l1 l1Var;
        pi0.l1 l1Var2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f548379e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterWeUIDemoUI repairerFlutterWeUIDemoUI = this.f548380f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            pi0.q Ui = ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ui();
            if (repairerFlutterWeUIDemoUI.e != null) {
                return f0Var;
            }
            l1Var = new pi0.l1(Ui, "flutter_demo", null, false, null, 28, null);
            this.f548378d = l1Var;
            this.f548379e = 1;
            if (l1Var.o("view_demo_activity", null, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l1Var2 = (pi0.l1) this.f548378d;
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                repairerFlutterWeUIDemoUI.e = l1Var2;
                l1Var2.b(repairerFlutterWeUIDemoUI);
                return f0Var;
            }
            l1Var = (pi0.l1) this.f548378d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        pi0.l1 l1Var3 = l1Var;
        l1Var3.a(kz5.b0.c(new yw3.m(repairerFlutterWeUIDemoUI, l1Var3)));
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 c10716x931597c6 = new com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6(0, 0, null, false, false, false, null, 0, false, false, false, null, 4095, null);
        c10716x931597c6.f149651e = -1;
        com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterWeUIDemoUI repairerFlutterWeUIDemoUI2 = this.f548380f;
        this.f548378d = l1Var3;
        this.f548379e = 2;
        if (pi0.l1.v(l1Var3, repairerFlutterWeUIDemoUI2, c10716x931597c6, null, null, null, this, 28, null) == aVar) {
            return aVar;
        }
        l1Var2 = l1Var3;
        repairerFlutterWeUIDemoUI.e = l1Var2;
        l1Var2.b(repairerFlutterWeUIDemoUI);
        return f0Var;
    }
}
