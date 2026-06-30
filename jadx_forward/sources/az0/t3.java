package az0;

/* loaded from: classes5.dex */
public final class t3 extends qz5.l implements yz5.p {
    public t3(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new az0.t3(interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return new az0.t3((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasManager", "new cam session on thread: " + java.lang.Thread.currentThread().getName());
        az0.i5 i5Var = az0.i5.f97090a;
        boolean z17 = ((h62.d) i5Var.p()).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2545xe20e94ff.p2547xabf495af.C20433x4226f6b6()) == 1;
        boolean z18 = ((h62.d) i5Var.p()).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2545xe20e94ff.p2547xabf495af.C20432x318d26db()) == 1;
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 h17 = (z17 || z18) ? i5Var.q().h(new android.os.Handler(android.os.Looper.getMainLooper()), az0.i5.a(i5Var), new com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4009xba3b408b(z17, z18)) : i5Var.q().g(new android.os.Handler(android.os.Looper.getMainLooper()), az0.i5.a(i5Var));
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4016x48c9106d f17 = i5Var.q().f(new android.os.Handler(android.os.Looper.getMainLooper()));
        if (h17 == null || f17 == null) {
            return null;
        }
        return new az0.f2(h17, f17);
    }
}
