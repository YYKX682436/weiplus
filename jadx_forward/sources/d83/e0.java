package d83;

/* loaded from: classes15.dex */
public final class e0 {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f308492b;

    /* renamed from: f, reason: collision with root package name */
    public static com.p314xaae8f345.p342x5fa53e3.C2950xf0971ac1 f308496f;

    /* renamed from: a, reason: collision with root package name */
    public static final d83.e0 f308491a = new d83.e0();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f308493c = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public static p3325xe03a0797.p3326xc267989b.y0 f308494d = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f308495e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f308497g = jz5.h.b(d83.d0.f308488d);

    /* renamed from: h, reason: collision with root package name */
    public static final d83.y f308498h = new d83.y();

    public final void a() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.p542x3306d5.C4436xdd79435b.m37513xd8c8aba1();
        fp.d0.n("ilink2");
        fp.d0.n("ilink_network");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkInitMgr", "initILink, process:" + bm5.f1.a());
        java.lang.String c17 = com.p314xaae8f345.mm.vfs.q7.c("ILinkCache");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkInitMgr", "initILink dir: %s", c17);
        int m40535xf2ceb016 = com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016();
        com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3057xbf13c783 enumC3057xbf13c783 = m40535xf2ceb016 != 0 ? m40535xf2ceb016 != 1 ? m40535xf2ceb016 != 2 ? m40535xf2ceb016 != 3 ? m40535xf2ceb016 != 4 ? m40535xf2ceb016 != 5 ? com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3057xbf13c783.kIlinkLogLevelNone : com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3057xbf13c783.kIlinkLogLevelFatal : com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3057xbf13c783.kIlinkLogLevelError : com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3057xbf13c783.kIlinkLogLevelWarn : com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3057xbf13c783.kIlinkLogLevelInfo : com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3057xbf13c783.kIlinkLogLevelDebug : com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3057xbf13c783.kIlinkLogLevelVerbose;
        com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.EnumC3016xcc5c11c4 enumC3016xcc5c11c4 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b || com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c || z65.c.a()) ? com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.EnumC3016xcc5c11c4.kIlinkLogModeSync : com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.EnumC3016xcc5c11c4.kIlinkLogModeAsync;
        com.p314xaae8f345.p342x5fa53e3.C2958x76e037ec.m22120x9cf0d20b().m22123x316510(com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3015x1492d723.m23068x3136c9db().m23094x534d5c42(enumC3057xbf13c783).m23090xbbcf4fd1(true).m23095xc5999845(enumC3016xcc5c11c4).m23091xcba6d112(false).m23092x1bdefc5d(false).m23089x4df6bc30(false).m23069x59bc66e());
        com.p314xaae8f345.p342x5fa53e3.C2958x76e037ec.m22120x9cf0d20b().m22124x34264a("", null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkInitMgr", "WeChatEnvironment = false " + com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b + ' ' + com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c + ' ' + z65.c.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkInitMgr", "XLOG level = " + com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() + ", ZLOG level = " + enumC3057xbf13c783 + " mode = " + enumC3016xcc5c11c4);
        com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3069x6b463e81 m24558x74dac979 = com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3069x6b463e81.m24531x3136c9db().m24562x7e47deaf(c17).m24558x74dac979(o45.wf.f424562g);
        java.lang.String str = wo.q.f529313a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "DEVICE_TYPE(...)");
        byte[] bytes = str.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        com.p314xaae8f345.p342x5fa53e3.C2952xf0b8386c.m22101x9cf0d20b().m22107x316510(m24558x74dac979.m24568xdf94bed8(new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bytes, 0, bytes.length)).m24560x973934cc(bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2537x5fa53e3.C20334x50287934())).m24561x4f31a59a(false).m24532x59bc66e());
        com.p314xaae8f345.mm.app.w.INSTANCE.a(f308498h);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1782x5fa53e3.p1783xd8ddcc92.a) ((jz5.n) f308497g).mo141623x754a37bb()).a();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ILinkInitMgr", "initILink: mainProcess, set cloud proxy callback");
            com.p314xaae8f345.p342x5fa53e3.C2950xf0971ac1 m22105x47be5917 = com.p314xaae8f345.p342x5fa53e3.C2952xf0b8386c.m22101x9cf0d20b().m22105x47be5917();
            f308496f = m22105x47be5917;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m22105x47be5917);
            m22105x47be5917.m22065xaf3f8342("wechat");
            com.p314xaae8f345.p342x5fa53e3.C2950xf0971ac1 c2950xf0971ac1 = f308496f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c2950xf0971ac1);
            c2950xf0971ac1.m22075x84f5428d("ILinkInitMgr.initILink", d83.b0.f308485a);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkInitMgr", "finished init ilink cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }
}
