package yw3;

/* loaded from: classes11.dex */
public final class o1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f548364d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f548365e;

    /* renamed from: f, reason: collision with root package name */
    public int f548366f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterHybridNavigatorDemoUI f548367g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f548368h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterHybridNavigatorDemoUI repairerFlutterHybridNavigatorDemoUI, java.lang.Class cls, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f548367g = repairerFlutterHybridNavigatorDemoUI;
        this.f548368h = cls;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yw3.o1(this.f548367g, this.f548368h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yw3.o1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pi0.l1 l1Var;
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 c10716x931597c6;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f548366f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            l1Var = new pi0.l1(((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ui(), "leak_monitor", null, false, null, 28, null);
            c10716x931597c6 = new com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6(0, 0, null, false, false, false, null, 0, false, false, false, null, 4095, null);
            c10716x931597c6.f149658o = false;
            c10716x931597c6.f149650d = 1;
            c10716x931597c6.f149651e = -1;
            this.f548364d = l1Var;
            this.f548365e = c10716x931597c6;
            this.f548366f = 1;
            if (l1Var.o("/", null, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 c10716x931597c62 = (com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6) this.f548365e;
            pi0.l1 l1Var2 = (pi0.l1) this.f548364d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            c10716x931597c6 = c10716x931597c62;
            l1Var = l1Var2;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = this.f548367g.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        java.lang.Class cls = this.f548368h;
        this.f548364d = null;
        this.f548365e = null;
        this.f548366f = 2;
        if (pi0.l1.v(l1Var, mo55332x76847179, c10716x931597c6, cls, null, null, this, 24, null) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
