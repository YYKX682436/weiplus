package b93;

/* loaded from: classes16.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final b93.l f18596a = new b93.l();

    public static void a(b93.l lVar, int i17, int i18, int i19, int i27, int i28, int i29, java.lang.Object obj) {
        if ((i29 & 4) != 0) {
            i19 = 0;
        }
        if ((i29 & 8) != 0) {
            i27 = 0;
        }
        if ((i29 & 16) != 0) {
            i28 = 0;
        }
        lVar.getClass();
        com.tencent.mm.autogen.mmdata.rpt.ContactTagManagementReportStruct contactTagManagementReportStruct = new com.tencent.mm.autogen.mmdata.rpt.ContactTagManagementReportStruct();
        contactTagManagementReportStruct.f55748d = i17;
        contactTagManagementReportStruct.f55749e = i18;
        contactTagManagementReportStruct.f55750f = i19;
        contactTagManagementReportStruct.f55751g = i27;
        contactTagManagementReportStruct.f55752h = i28;
        contactTagManagementReportStruct.k();
        java.lang.String n17 = contactTagManagementReportStruct.n();
        kotlin.jvm.internal.o.f(n17, "toShowString(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.LabelReporter", "report%s %s", 24176, r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " ", false));
    }
}
