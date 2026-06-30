package xu1;

/* loaded from: classes13.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xu1.b f538718d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f538719e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f538720f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(xu1.b bVar, java.lang.String str, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f538718d = bVar;
        this.f538719e = str;
        this.f538720f = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xu1.a(this.f538718d, this.f538719e, this.f538720f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        xu1.a aVar = (xu1.a) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        aVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.String str = this.f538719e;
        int i17 = this.f538720f;
        xu1.b bVar = this.f538718d;
        xu1.c cVar = bVar.f538721a;
        if (cVar == xu1.c.f538723d || cVar == xu1.c.f538727h || cVar == xu1.c.f538726g) {
            try {
                bVar.f538721a = xu1.c.f538724e;
                java.net.Socket socket = bVar.f538722b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(socket);
                socket.connect(new java.net.InetSocketAddress(str, i17), 2000);
                bVar.f538721a = xu1.c.f538725f;
            } catch (java.net.SocketTimeoutException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("client_connection", "connection timeout", e17);
                bVar.f538721a = xu1.c.f538726g;
                bVar.f538722b = new java.net.Socket();
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("client_connection", "Fail connection", e18);
                bVar.f538721a = xu1.c.f538727h;
                bVar.f538722b = new java.net.Socket();
            }
        }
        return jz5.f0.f384359a;
    }
}
