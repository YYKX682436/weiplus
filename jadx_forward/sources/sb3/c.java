package sb3;

/* loaded from: classes13.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final android.media.SoundPool f486968a;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f486971d = false;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Hashtable f486969b = new java.util.Hashtable();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f486970c = new java.util.HashMap();

    public c(int i17, int i18) {
        this.f486968a = new android.media.SoundPool(i17, i18, 0);
    }

    public void a(java.lang.String str) {
        int intValue;
        if (((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Zi()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AsyncSoundPool", "do not play: system is mute");
            return;
        }
        java.util.Hashtable hashtable = this.f486969b;
        if (!hashtable.containsKey(str) || (intValue = ((java.lang.Integer) hashtable.get(str)).intValue()) < 0) {
            return;
        }
        java.util.Map map = this.f486970c;
        if (((java.util.HashMap) map).containsKey(java.lang.Integer.valueOf(intValue))) {
            if (((java.lang.Boolean) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(intValue))).booleanValue()) {
                this.f486968a.play(intValue, 1.0f, 1.0f, 0, 0, 1.0f);
            }
        }
    }
}
