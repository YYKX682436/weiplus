package fs1;

/* loaded from: classes7.dex */
public final class j implements sd.h {

    /* renamed from: d, reason: collision with root package name */
    public static final fs1.j f347824d = new fs1.j();

    /* renamed from: e, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r f347825e = null;

    /* renamed from: f, reason: collision with root package name */
    public static od.l f347826f = null;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f347827g = "";

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f347828h = "";

    public static final java.lang.Object a(fs1.j jVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        jVar.getClass();
        android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        int a17 = ((b17.y - com.p314xaae8f345.mm.ui.bl.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) - com.p314xaae8f345.mm.ui.bl.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) - com.p314xaae8f345.mm.ui.bl.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        float g17 = i65.a.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        java.lang.String m40061x1de3608b = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40061x1de3608b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        java.lang.String e17 = ik1.f.e("game_jscore_system_info.js");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e17);
        java.lang.String valueOf = java.lang.String.valueOf(b17.x);
        java.lang.String valueOf2 = java.lang.String.valueOf(a17);
        java.lang.String valueOf3 = java.lang.String.valueOf(b17.x);
        java.lang.String valueOf4 = java.lang.String.valueOf(b17.y);
        java.lang.String valueOf5 = java.lang.String.valueOf(g17);
        java.lang.String str = android.os.Build.BRAND;
        java.lang.String m17 = wo.w0.m();
        java.lang.String format = java.lang.String.format("0x%08X", java.util.Arrays.copyOf(new java.lang.Object[]{new java.lang.Integer(o45.wf.f424562g)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        java.lang.String format2 = java.lang.String.format(e17, java.util.Arrays.copyOf(new java.lang.Object[]{valueOf, valueOf2, valueOf3, valueOf4, valueOf5, m40061x1de3608b, str, m17, format, "Android-" + android.os.Build.VERSION.SDK_INT, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.ui.bk.C())}, 12));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
        java.lang.Object b18 = jVar.b(format2, fs1.i.f347823d, interfaceC29045xdcb5ca57);
        return b18 == pz5.a.f440719d ? b18 : jz5.f0.f384359a;
    }

    @Override // od.p
    /* renamed from: addJavascriptInterface */
    public void mo32257x74041feb(java.lang.Object obj, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r rVar = f347825e;
        if (rVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n) rVar).mo14658x74041feb(obj, str);
        }
    }

    public final java.lang.Object b(java.lang.String str, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r rVar = f347825e;
        if (rVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n) rVar).mo14660x738236e6(str, new fs1.b(lVar, nVar));
        }
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f440719d;
        return a17;
    }

    @Override // sd.h
    /* renamed from: destroy */
    public void mo130332x5cd39ffa() {
        f347826f = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r rVar = f347825e;
        if (rVar != null) {
            rVar.mo14659x5cd39ffa();
        }
    }

    @Override // od.p
    /* renamed from: evaluateJavascript */
    public void mo32260x738236e6(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r rVar = f347825e;
        if (rVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n) rVar).mo14660x738236e6(str, valueCallback);
        }
    }

    @Override // od.p
    /* renamed from: getContext */
    public android.content.Context mo32261x76847179() {
        return null;
    }

    @Override // od.p
    /* renamed from: getUserAgent */
    public java.lang.String mo32054x11fd7f44() {
        return ik1.l0.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, hy4.w.f367733f.a(), lu4.m.f402974d.a());
    }

    @Override // sd.h
    /* renamed from: injectInitScript */
    public void mo130333xb7489a6c() {
    }
}
