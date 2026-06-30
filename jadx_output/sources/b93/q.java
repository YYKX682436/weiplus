package b93;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final b93.q f18605a = new b93.q();

    public final void a(int i17, int i18, int i19, int i27, java.lang.String sessionId, java.lang.String selectedContainerOp, int i28, int i29, int i37, int i38) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(selectedContainerOp, "selectedContainerOp");
        com.tencent.mm.autogen.mmdata.rpt.MultiSelectContactsReportStruct multiSelectContactsReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MultiSelectContactsReportStruct();
        multiSelectContactsReportStruct.f59354d = i17;
        multiSelectContactsReportStruct.f59355e = i18;
        multiSelectContactsReportStruct.f59356f = i19;
        multiSelectContactsReportStruct.f59357g = i27;
        multiSelectContactsReportStruct.f59358h = multiSelectContactsReportStruct.b("friend_selector_page_sessionid", sessionId, true);
        multiSelectContactsReportStruct.f59359i = multiSelectContactsReportStruct.b("selected_container_op", r26.i0.u(selectedContainerOp, ',', ' ', false, 4, null), true);
        multiSelectContactsReportStruct.f59360j = i28;
        multiSelectContactsReportStruct.f59361k = i29;
        multiSelectContactsReportStruct.f59362l = i37;
        multiSelectContactsReportStruct.f59363m = i38;
        multiSelectContactsReportStruct.k();
        java.lang.String n17 = multiSelectContactsReportStruct.n();
        kotlin.jvm.internal.o.f(n17, "toShowString(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactReporter", "report%s %s", 29308, r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " ", false));
    }
}
