package mm1;

/* loaded from: classes14.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static volatile android.media.AudioDeviceInfo f410180a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile int f410181b;

    static {
        android.media.AudioManager audioManager = (android.media.AudioManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(android.media.AudioManager.class);
        mm1.b bVar = mm1.b.f410167a;
        mm1.c cVar = mm1.c.f410176a;
        ku5.f p17 = ((ku5.t0) ku5.t0.f394148d).p("audio_device_manager");
        f410180a = audioManager.getCommunicationDevice();
        audioManager.addOnCommunicationDeviceChangedListener(p17, bVar);
        f410181b = audioManager.getMode();
        audioManager.addOnModeChangedListener(p17, cVar);
    }
}
