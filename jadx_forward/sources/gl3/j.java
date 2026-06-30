package gl3;

/* loaded from: classes13.dex */
public abstract class j {
    public static boolean a(java.lang.String str) {
        b21.v c17 = gl3.e.c(gl3.h.b(str));
        if (c17 != null) {
            return gl3.i.b(str) && gl3.i.c(str) > 0 && c17.f98905e == 1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.IndexBitMgr", "isQQAudioCacheValid pMusic is null!'");
        return false;
    }
}
