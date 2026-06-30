package gl;

/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f354266a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f354267b;

    public final void a() {
        java.util.List<android.media.AudioDeviceInfo> availableCommunicationDevices;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        android.media.AudioManager audioManager = (android.media.AudioManager) b3.l.m9714xac92a5d0(context, android.media.AudioManager.class);
        if (fp.h.a(31)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VoIPMP.AudioEarpieceTypeRouteStrategy", "API Level Below S");
            return;
        }
        if (audioManager == null || (availableCommunicationDevices = audioManager.getAvailableCommunicationDevices()) == null) {
            return;
        }
        this.f354266a = false;
        this.f354267b = false;
        java.util.Iterator<android.media.AudioDeviceInfo> it = availableCommunicationDevices.iterator();
        while (it.hasNext()) {
            int type = it.next().getType();
            if (type == 1) {
                this.f354266a = true;
            } else if (type != 2 && type != 3 && type != 4 && type != 7 && type != 8 && type != 11 && type != 22 && type != 24) {
                this.f354267b = true;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VoIPMP.AudioEarpieceTypeRouteStrategy", "mHasEarpiece: " + this.f354266a + " mHasUndefinedDevices: " + this.f354267b);
    }
}
