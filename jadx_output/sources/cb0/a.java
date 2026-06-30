package cb0;

/* loaded from: classes11.dex */
public abstract class a {
    public static final void a(int i17, int i18, int i19) {
        com.tencent.mm.autogen.mmdata.rpt.OpenIMOpenServiceForOtherLogStruct openIMOpenServiceForOtherLogStruct = new com.tencent.mm.autogen.mmdata.rpt.OpenIMOpenServiceForOtherLogStruct();
        openIMOpenServiceForOtherLogStruct.f59787d = i17;
        openIMOpenServiceForOtherLogStruct.f59788e = i18;
        openIMOpenServiceForOtherLogStruct.f59789f = i19;
        openIMOpenServiceForOtherLogStruct.f59790g = 1L;
        openIMOpenServiceForOtherLogStruct.k();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(openIMOpenServiceForOtherLogStruct.g());
        java.lang.String n17 = openIMOpenServiceForOtherLogStruct.n();
        kotlin.jvm.internal.o.f(n17, "toShowString(...)");
        com.tencent.mars.xlog.Log.i("OpenIMJumpProfileReporter", "report%s %s", valueOf, r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " ", false));
    }
}
