package fo5;

/* loaded from: classes11.dex */
public final class n2 extends qz5.l implements yz5.p {
    public n2(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new fo5.n2(interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        fo5.n2 n2Var = new fo5.n2((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        n2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.p2845xc516c4b6.p2883xcfa97743.C25218x782e0ab3 c25218x782e0ab3;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.Launcher", "resetDeviceInfo");
        fo5.s0 s0Var = fo5.q2.f346604d.c().f346679c;
        if (s0Var != null && (c25218x782e0ab3 = s0Var.f346646e) != null) {
            c25218x782e0ab3.m93325x98b40f0(0L, fo5.i2.f346536d);
            c25218x782e0ab3.m93329xea5712e1(false, fo5.j2.f346540d);
            c25218x782e0ab3.m93328xf78cea16(0L, fo5.k2.f346546d);
            c25218x782e0ab3.m93327x24073364(0L, fo5.l2.f346554d);
            c25218x782e0ab3.m93326x84c7bf61(0L, fo5.m2.f346561d);
        }
        return jz5.f0.f384359a;
    }
}
