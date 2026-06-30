package wu1;

/* loaded from: classes13.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f531194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f531195e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f531196f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wu1.c f531197g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wu1.a f531198h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String str, int i17, wu1.c cVar, wu1.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f531195e = str;
        this.f531196f = i17;
        this.f531197g = cVar;
        this.f531198h = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new wu1.b(this.f531195e, this.f531196f, this.f531197g, this.f531198h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((wu1.b) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f531194d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ScreenRecord.Main", "thread try connect to server " + this.f531195e + ':' + this.f531196f);
            xu1.b bVar = this.f531197g.f531199a;
            java.lang.String str = this.f531195e;
            int i18 = this.f531196f;
            this.f531194d = 1;
            bVar.getClass();
            java.lang.Object g17 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392101a, new xu1.a(bVar, str, i18, null), this);
            if (g17 != aVar) {
                g17 = f0Var;
            }
            if (g17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Socket:");
        sb6.append(this.f531197g.f531199a.f538722b);
        sb6.append("status:");
        java.net.Socket socket = this.f531197g.f531199a.f538722b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(socket);
        sb6.append(socket.isConnected());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ScreenRecord.Main", sb6.toString());
        java.net.Socket socket2 = this.f531197g.f531199a.f538722b;
        if (socket2 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(socket2);
            if (socket2.isConnected()) {
                wu1.c cVar = this.f531197g;
                java.net.Socket socket3 = cVar.f531199a.f538722b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(socket3);
                yu1.c cVar2 = (yu1.c) cVar.f531200b;
                cVar2.getClass();
                java.io.InputStream inputStream = socket3.getInputStream();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inputStream, "getInputStream(...)");
                java.io.Reader inputStreamReader = new java.io.InputStreamReader(inputStream, r26.c.f450398a);
                cVar2.f547379c = inputStreamReader instanceof java.io.BufferedReader ? (java.io.BufferedReader) inputStreamReader : new java.io.BufferedReader(inputStreamReader, 8192);
                cVar2.f547378b = true;
                p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, null, null, new yu1.a(cVar2, null), 3, null);
                zu1.a aVar2 = (zu1.a) cVar.f531201c;
                aVar2.getClass();
                aVar2.f557222b = socket3.getOutputStream();
                aVar2.f557223c = socket3;
                aVar2.f557221a = true;
                wu1.c cVar3 = this.f531197g;
                yu1.d dVar = cVar3.f531200b;
                java.util.List handlers = cVar3.f531204f;
                yu1.c cVar4 = (yu1.c) dVar;
                cVar4.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handlers, "handlers");
                ((java.util.ArrayList) cVar4.f547377a).addAll(handlers);
            }
        }
        wu1.a aVar3 = this.f531198h;
        xu1.c errCode = this.f531197g.f531199a.f538721a;
        tu1.l lVar = (tu1.l) aVar3;
        lVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errCode, "errCode");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenCastManager", "realExecuteTcpConnect " + lVar.f503637a.f391649d + " result=" + errCode);
        tu1.o oVar = lVar.f503638b;
        if (!oVar.f503662t) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenCastManager", "realExecuteTcpConnect canceled baceuse tcpAllowConnectingFlag is false");
            wu1.c cVar5 = lVar.f503638b.f503659q;
            if (cVar5 != null) {
                cVar5.a();
            }
        } else if (errCode == xu1.c.f538725f) {
            oVar.f503660r = errCode;
            ((ku5.t0) ku5.t0.f394148d).B(new tu1.j(lVar.f503638b, errCode));
        } else if (lVar.f503637a.f391649d < lVar.f503639c.size() - 1) {
            p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2 = lVar.f503637a;
            int i19 = f0Var2.f391649d + 1;
            f0Var2.f391649d = i19;
            tu1.o.c(lVar.f503638b, i19, (java.lang.String) lVar.f503639c.get(i19), lVar.f503640d, lVar);
        } else {
            lVar.f503638b.f503660r = xu1.c.f538728i;
            ((ku5.t0) ku5.t0.f394148d).B(new tu1.k(lVar.f503638b));
        }
        return f0Var;
    }
}
