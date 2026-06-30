package pm1;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final pm1.d f438347e = new pm1.d(null);

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f438348f = jz5.h.b(pm1.c.f438346d);

    /* renamed from: a, reason: collision with root package name */
    public final pm1.o f438349a;

    /* renamed from: b, reason: collision with root package name */
    public final pm1.w f438350b;

    /* renamed from: c, reason: collision with root package name */
    public final pm1.s f438351c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f438352d;

    public e() {
        boolean z17;
        pm1.o oVar = new pm1.o();
        this.f438349a = oVar;
        pm1.w wVar = new pm1.w();
        this.f438350b = wVar;
        pm1.s sVar = new pm1.s();
        this.f438351c = sVar;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.Object systemService = context.getSystemService("audio");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        android.media.AudioManager audioManager = (android.media.AudioManager) systemService;
        audioManager.addOnCommunicationDeviceChangedListener(pm1.a.f438344d, oVar);
        audioManager.addOnModeChangedListener(pm1.b.f438345d, sVar);
        try {
            z17 = true;
            context.getContentResolver().registerContentObserver(android.provider.Settings.System.CONTENT_URI, true, wVar);
        } catch (java.lang.SecurityException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AudioCache", jz5.a.b(e17));
            z17 = false;
        }
        this.f438352d = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AudioCache", "AudioCache is enable, audioVolumeCacheAvailable=" + z17);
    }
}
