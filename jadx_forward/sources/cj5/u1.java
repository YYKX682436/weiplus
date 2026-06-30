package cj5;

/* loaded from: classes.dex */
public final class u1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f123780d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cj5.l2 f123781e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(java.util.List list, cj5.l2 l2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f123780d = list;
        this.f123781e = l2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new cj5.u1(this.f123780d, this.f123781e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        cj5.u1 u1Var = (cj5.u1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        u1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        wi5.n0 n0Var;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactMainRecycleViewUIC", "handleMsgFoldClick() lifecycleScope launchUI submitInsert");
        java.util.List list = this.f123780d;
        if (list != null) {
            cj5.l2 l2Var = this.f123781e;
            j75.f Q6 = l2Var.Q6();
            if (Q6 != null && (n0Var = (wi5.n0) Q6.mo140437x75286adb()) != null) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((ri5.j) it.next()).f477660x = n0Var.e();
                }
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k17 = l2Var.Y6().k();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getSelectContactRv(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe a17 = xm3.u0.a(k17);
            if (a17 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe.p(a17, list, false, 2, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
