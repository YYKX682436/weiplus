package o45;

/* loaded from: classes12.dex */
public abstract class ji {

    /* renamed from: a, reason: collision with root package name */
    public static final java.nio.charset.Charset f424505a = java.nio.charset.Charset.forName(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);

    public static boolean a() {
        try {
            return j62.e.g().l("clicfg_synccheck_3", false, true, true);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSyncCheck", "synccheck3 useSyncCheck3 failed: " + e17.getMessage());
            return false;
        }
    }
}
