package pm1;

/* loaded from: classes14.dex */
public final class o extends android.media.AudioDeviceCallback implements android.media.AudioManager.OnCommunicationDeviceChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f438362a = "AudioDeviceCache";

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Boolean f438363b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Boolean f438364c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Boolean f438365d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Boolean f438366e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Boolean f438367f;

    /* renamed from: g, reason: collision with root package name */
    public final android.media.AudioManager f438368g;

    public o() {
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.f438368g = (android.media.AudioManager) systemService;
        ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable() { // from class: pm1.f
            @Override // java.lang.Runnable
            public final void run() {
                pm1.o.this.a();
            }
        }, "AudioDeviceCache");
    }

    public final void a() {
        android.media.AudioManager audioManager = this.f438368g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioManager, "audioManager");
        this.f438363b = java.lang.Boolean.valueOf(audioManager.isSpeakerphoneOn());
        android.media.AudioManager audioManager2 = this.f438368g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioManager2, "audioManager");
        this.f438364c = java.lang.Boolean.valueOf(audioManager2.isBluetoothScoOn());
        android.media.AudioManager audioManager3 = this.f438368g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioManager3, "audioManager");
        this.f438365d = java.lang.Boolean.valueOf(audioManager3.isBluetoothA2dpOn());
        an1.d dVar = an1.d.f90371a;
        android.media.AudioManager audioManager4 = this.f438368g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioManager4, "audioManager");
        this.f438366e = java.lang.Boolean.valueOf(audioManager4.isWiredHeadsetOn());
        this.f438367f = java.lang.Boolean.valueOf(dVar.a(this.f438368g));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AudioDeviceCache", "update cache: speakerOn=" + this.f438363b + ", BTSocOn=" + this.f438364c + ", BTA2dpOn=" + this.f438365d + ", wiredHeadsetOn=" + this.f438366e + ", headsetPlugged=" + this.f438367f);
    }

    @Override // android.media.AudioDeviceCallback
    public void onAudioDevicesAdded(android.media.AudioDeviceInfo[] audioDeviceInfoArr) {
        ((ku5.t0) ku5.t0.f394148d).A(this.f438362a);
        ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable() { // from class: pm1.l
            @Override // java.lang.Runnable
            public final void run() {
                pm1.o.this.a();
            }
        }, this.f438362a);
    }

    @Override // android.media.AudioDeviceCallback
    public void onAudioDevicesRemoved(android.media.AudioDeviceInfo[] audioDeviceInfoArr) {
        ((ku5.t0) ku5.t0.f394148d).A(this.f438362a);
        ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable() { // from class: pm1.m
            @Override // java.lang.Runnable
            public final void run() {
                pm1.o.this.a();
            }
        }, this.f438362a);
    }

    @Override // android.media.AudioManager.OnCommunicationDeviceChangedListener
    public void onCommunicationDeviceChanged(android.media.AudioDeviceInfo audioDeviceInfo) {
        ((ku5.t0) ku5.t0.f394148d).A(this.f438362a);
        ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable() { // from class: pm1.n
            @Override // java.lang.Runnable
            public final void run() {
                pm1.o.this.a();
            }
        }, this.f438362a);
    }
}
