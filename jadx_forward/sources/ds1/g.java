package ds1;

/* loaded from: classes7.dex */
public final class g implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r f324372a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ds1.j f324373b;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r rVar, ds1.j jVar) {
        this.f324372a = rVar;
        this.f324373b = jVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.s
    public final void a(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameWebPrefetcherJsEngineInterceptor", "[game-web-prefetch] handleException, message : %s\n, stackTrace : %s", str, str2);
        java.lang.String format = java.lang.String.format("try {WxGameJsCoreBridge.invokeError(\"%s\");} catch(e) {console.log(e);}", java.util.Arrays.copyOf(new java.lang.Object[]{u46.k.a("exception : " + str + " ; stack : " + str2)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebPrefetcherJsEngineInterceptor", "[game-web-prefetch] handleException, js = %s", format);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n) this.f324372a).mo14660x738236e6(format, null);
        ds1.j jVar = this.f324373b;
        mu4.x0 x0Var = jVar.f324381e;
        mu4.j0 j0Var = new mu4.j0();
        java.lang.String str3 = str + '\t' + str2;
        jx3.f.INSTANCE.d(20821, jVar.f324383g, jVar.f324384h, str3 != null ? r26.i0.u(str3, ',', '.', false, 4, null) : null);
        x0Var.a(j0Var);
        jVar.f324382f.a(new mu4.a0());
    }
}
