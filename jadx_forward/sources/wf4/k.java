package wf4;

/* loaded from: classes.dex */
public abstract class k {
    public static final void a(boolean z17, java.lang.String str) {
        if (z17) {
            try {
                com.p314xaae8f345.mm.vfs.w6.h(str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExtTranslateVoiceEventListenerKtHelper", "cleanUpTempFile deleted: " + str);
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ExtTranslateVoiceEventListenerKtHelper", "cleanUpTempFile failed to delete: " + str);
            }
        }
    }

    public static final boolean b() {
        return j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20067x654ccc98()) == 1;
    }
}
