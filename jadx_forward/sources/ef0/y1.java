package ef0;

/* loaded from: classes12.dex */
public final class y1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.l80 f333892d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(bw5.l80 l80Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f333892d = l80Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ef0.y1(this.f333892d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ef0.y1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        if0.a0 a0Var = if0.a0.f372545a;
        java.lang.String m12386x5000ed37 = this.f333892d.m12386x5000ed37();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m12386x5000ed37, "getFilePath(...)");
        int e17 = a0Var.e();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = if0.a0.f372546b;
        if (e17 != 2 && o4Var.f(a0Var.a(m12386x5000ed37))) {
            java.lang.String u17 = o4Var.u(a0Var.a(m12386x5000ed37), "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingLocalFileUtil", "getAuthor cacheResult " + u17);
            return u17;
        }
        gp.d dVar = new gp.d();
        try {
            try {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                dVar.setDataSource(m12386x5000ed37);
                java.lang.String extractMetadata = dVar.extractMetadata(2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingLocalFileUtil", "getAuthor artist " + extractMetadata + ", cost " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
                o4Var.D(a0Var.a(m12386x5000ed37), extractMetadata);
                return extractMetadata;
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingLocalFileUtil", "getAuthor ex " + e18.getMessage());
                dVar.release();
                return null;
            }
        } finally {
            dVar.release();
        }
    }
}
