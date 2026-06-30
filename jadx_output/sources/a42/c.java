package a42;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final a42.c f1200a = new a42.c();

    public final void a(int i17, int i18, java.lang.String infoSourceName, int i19, int i27, java.lang.String viewedUser) {
        kotlin.jvm.internal.o.g(infoSourceName, "infoSourceName");
        kotlin.jvm.internal.o.g(viewedUser, "viewedUser");
        com.tencent.mm.autogen.mmdata.rpt.WeSportFinderStruct weSportFinderStruct = new com.tencent.mm.autogen.mmdata.rpt.WeSportFinderStruct();
        weSportFinderStruct.f62922h = i27;
        weSportFinderStruct.f62921g = i19;
        weSportFinderStruct.f62919e = i18;
        weSportFinderStruct.f62920f = weSportFinderStruct.b("infoSourceName", infoSourceName, true);
        weSportFinderStruct.f62918d = i17;
        weSportFinderStruct.f62923i = weSportFinderStruct.b("viewedUser", viewedUser, true);
        weSportFinderStruct.k();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(weSportFinderStruct.g());
        java.lang.String n17 = weSportFinderStruct.n();
        kotlin.jvm.internal.o.f(n17, "toShowString(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.SportReporter", "report%s %s", valueOf, r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " ", false));
    }
}
