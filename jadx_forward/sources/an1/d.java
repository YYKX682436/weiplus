package an1;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final an1.d f90371a = new an1.d();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f90372b;

    public final boolean a(android.media.AudioManager audioManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioManager, "audioManager");
        boolean isWiredHeadsetOn = audioManager.isWiredHeadsetOn();
        if (isWiredHeadsetOn || !fp.h.c(23)) {
            return isWiredHeadsetOn;
        }
        if (fp.h.c(23)) {
            android.media.AudioDeviceInfo[] devices = audioManager.getDevices(3);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(128);
            sb6.append("isWireHeadsetPluggedNew, deviceInfo type: ");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(devices);
            for (android.media.AudioDeviceInfo audioDeviceInfo : devices) {
                sb6.append(audioDeviceInfo.getType());
                sb6.append(',');
                if (audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HeadSetPlugUtil", sb6.toString());
                    return true;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HeadSetPlugUtil", sb6.toString());
        }
        return false;
    }
}
