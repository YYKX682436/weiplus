package az0;

/* loaded from: classes5.dex */
public final class v5 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f97498d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4069xbe747ef4 f97499e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f97500f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4069xbe747ef4 c4069xbe747ef4, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
        this.f97499e = c4069xbe747ef4;
        this.f97500f = c0Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        az0.v5 v5Var = new az0.v5(this.f97499e, this.f97500f, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3);
        v5Var.f97498d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f384359a;
        v5Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.Throwable th6 = (java.lang.Throwable) this.f97498d;
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_maas_export_disable_export_retry, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasAlbumTemplateGlobalConfig", "disableExportRetry " + fj6);
        if (!(!fj6)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasMovieSessionManager", "export: disable retry");
            throw th6;
        }
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4069xbe747ef4 c4069xbe747ef4 = this.f97499e;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c4069xbe747ef4.m33189xfd6e75c2(), "VideoEncoderAMCHardware")) {
            throw th6;
        }
        this.f97500f.f391645d = true;
        c4069xbe747ef4.f129647i = "VideoEncoderVCodec";
        return jz5.f0.f384359a;
    }
}
