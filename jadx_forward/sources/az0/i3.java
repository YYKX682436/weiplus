package az0;

/* loaded from: classes5.dex */
public final class i3 extends qz5.l implements yz5.p {
    public i3(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new az0.i3(interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return new az0.i3((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasManager", "new material manager on thread: " + java.lang.Thread.currentThread().getName());
        com.p314xaae8f345.p457x3304c6.p476x11d36527.C4105x45a51929 l17 = az0.i5.f97090a.q().l(new android.os.Handler(android.os.Looper.getMainLooper()));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "newMaterialManager(...)");
        return new az0.k5(l17);
    }
}
