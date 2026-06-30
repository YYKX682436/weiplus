package c81;

/* loaded from: classes8.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f39655a = null;

    public final com.tencent.mm.sdk.platformtools.o4 a() {
        int n17 = j62.e.g().n();
        if (n17 == 0) {
            return null;
        }
        java.lang.String str = n17 + "_WxExptAiMMKV";
        if (!com.tencent.mm.sdk.platformtools.t8.D0(this.f39655a, str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AiMMKV", "%s get mmkv change uin old[%s] new[%s]", hashCode() + "", this.f39655a, str);
            this.f39655a = str;
        }
        return com.tencent.mm.sdk.platformtools.o4.M(this.f39655a);
    }

    public com.tencent.mm.autogen.mmdata.rpt.CalendarStatisticsStruct b(java.lang.String str) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        int a17 = a81.a.a(java.lang.System.currentTimeMillis());
        c81.b wi6 = c81.b.wi();
        wi6.requireAccountInitialized();
        com.tencent.mm.sdk.platformtools.o4 a18 = wi6.f39656d.a();
        java.lang.String string = a18 != null ? a18.getString(str, "") : "";
        com.tencent.mm.autogen.mmdata.rpt.CalendarStatisticsStruct calendarStatisticsStruct = !com.tencent.mm.sdk.platformtools.t8.K0(string) ? new com.tencent.mm.autogen.mmdata.rpt.CalendarStatisticsStruct(string) : null;
        if (calendarStatisticsStruct != null && calendarStatisticsStruct.f55495d == a17) {
            return calendarStatisticsStruct;
        }
        com.tencent.mm.autogen.mmdata.rpt.CalendarStatisticsStruct calendarStatisticsStruct2 = new com.tencent.mm.autogen.mmdata.rpt.CalendarStatisticsStruct();
        calendarStatisticsStruct2.f55495d = a17;
        return calendarStatisticsStruct2;
    }

    public void c(java.lang.String str, long j17) {
        com.tencent.mm.sdk.platformtools.o4 a17 = a();
        if (a17 == null) {
            return;
        }
        a17.putLong(str, j17);
    }
}
