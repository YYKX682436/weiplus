package kp;

/* loaded from: classes7.dex */
public final class h1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f392286d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f392287e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f392287e = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new kp.h1(this.f392287e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((kp.h1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f392286d;
        if (i17 != 0 && i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        do {
            java.lang.String str = this.f392287e;
            try {
                java.util.Enumeration<java.net.InetAddress> inetAddresses = java.net.NetworkInterface.getByName(str).getInetAddresses();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inetAddresses);
                while (inetAddresses.hasMoreElements()) {
                    java.net.InetAddress nextElement = inetAddresses.nextElement();
                    if (nextElement instanceof java.net.Inet4Address) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WiFiDirectService", "p2p ip dispatched: " + ((java.net.Inet4Address) nextElement).getHostAddress() + " (Interface: " + str + ')');
                        return java.lang.Boolean.TRUE;
                    }
                }
            } catch (java.net.SocketException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WiFiDirectService", "Fail to get p2p ip: " + e17);
            }
            this.f392286d = 1;
        } while (p3325xe03a0797.p3326xc267989b.k1.b(200L, this) != aVar);
        return aVar;
    }
}
