package pm1;

/* loaded from: classes14.dex */
public final class w extends android.database.ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f438379a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f438380b;

    /* renamed from: c, reason: collision with root package name */
    public final android.media.AudioManager f438381c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f438382d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f438383e;

    public w() {
        super(null);
        this.f438379a = "AudioVolumeCache";
        this.f438380b = new int[]{0, 1, 2, 3, 4, 5, 8, 10};
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.f438381c = (android.media.AudioManager) systemService;
        this.f438382d = new java.util.HashMap();
        this.f438383e = new java.util.HashMap();
        ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable() { // from class: pm1.t
            @Override // java.lang.Runnable
            public final void run() {
                pm1.w.this.b();
            }
        }, "AudioVolumeCache");
    }

    public final int a(int i17, java.util.HashMap hashMap) {
        java.lang.Integer num = (java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(i17));
        if (num != null) {
            ((ku5.t0) ku5.t0.f394148d).h(new pm1.u(hashMap, this, i17), this.f438379a);
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        boolean z17 = hashMap == this.f438382d;
        android.media.AudioManager audioManager = this.f438381c;
        int streamMaxVolume = z17 ? audioManager.getStreamMaxVolume(i17) : audioManager.getStreamVolume(i17);
        hashMap.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(streamMaxVolume));
        return streamMaxVolume;
    }

    public final void b() {
        for (int i17 : this.f438380b) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            java.util.HashMap hashMap = this.f438383e;
            android.media.AudioManager audioManager = this.f438381c;
            hashMap.put(valueOf, java.lang.Integer.valueOf(audioManager.getStreamVolume(i17)));
            this.f438382d.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(audioManager.getStreamMaxVolume(i17)));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AudioVolumeCache", "update audio volume");
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z17) {
        ((ku5.t0) ku5.t0.f394148d).A(this.f438379a);
        ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable() { // from class: pm1.v
            @Override // java.lang.Runnable
            public final void run() {
                pm1.w.this.b();
            }
        }, this.f438379a);
    }
}
