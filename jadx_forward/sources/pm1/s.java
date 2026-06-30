package pm1;

/* loaded from: classes14.dex */
public final class s implements android.media.AudioManager.OnModeChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Integer f438372a;

    /* renamed from: b, reason: collision with root package name */
    public final android.media.AudioManager f438373b;

    public s() {
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.f438373b = (android.media.AudioManager) systemService;
        ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable() { // from class: pm1.p
            @Override // java.lang.Runnable
            public final void run() {
                pm1.s.this.a();
            }
        }, "AudioMiscCache");
    }

    public final void a() {
        this.f438372a = java.lang.Integer.valueOf(this.f438373b.getMode());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AudioMiscCache", "update audio: mode=" + this.f438372a);
    }

    @Override // android.media.AudioManager.OnModeChangedListener
    public void onModeChanged(int i17) {
        ((ku5.t0) ku5.t0.f394148d).A("AudioMiscCache");
        ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable() { // from class: pm1.r
            @Override // java.lang.Runnable
            public final void run() {
                pm1.s.this.a();
            }
        }, "AudioMiscCache");
    }
}
