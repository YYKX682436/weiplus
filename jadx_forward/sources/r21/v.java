package r21;

/* loaded from: classes11.dex */
public abstract class v {
    public static void a(long j17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FMessageLogic", "clearFMsgAndFConvByTalker, rowId: %d, talker: %s", java.lang.Long.valueOf(j17), str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FMessageLogic", "clearFMsgAndFConvByTalker, delete fconversation, ret = " + r21.w.wi().D0(j17, str));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FMessageLogic", "clearFMsgAndFConvByTalker, delete fmsginfo, ret = " + r21.w.Ai().D0(str));
    }

    public static long b(java.lang.String str, long j17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.p7 W0;
        long j18 = (str == null || (W0 = r21.w.Ai().W0(str)) == null) ? 0L : W0.f66487xac3be4e + 1;
        long j19 = j17 * 1000;
        return j18 > j19 ? j18 : j19;
    }
}
