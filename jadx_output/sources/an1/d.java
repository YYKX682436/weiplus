package an1;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final an1.d f8838a = new an1.d();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f8839b;

    public final boolean a(android.media.AudioManager audioManager) {
        kotlin.jvm.internal.o.g(audioManager, "audioManager");
        boolean isWiredHeadsetOn = audioManager.isWiredHeadsetOn();
        if (isWiredHeadsetOn || !fp.h.c(23)) {
            return isWiredHeadsetOn;
        }
        if (fp.h.c(23)) {
            android.media.AudioDeviceInfo[] devices = audioManager.getDevices(3);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(128);
            sb6.append("isWireHeadsetPluggedNew, deviceInfo type: ");
            kotlin.jvm.internal.o.d(devices);
            for (android.media.AudioDeviceInfo audioDeviceInfo : devices) {
                sb6.append(audioDeviceInfo.getType());
                sb6.append(',');
                if (audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 11) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.HeadSetPlugUtil", sb6.toString());
                    return true;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.HeadSetPlugUtil", sb6.toString());
        }
        return false;
    }
}
