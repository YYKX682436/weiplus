package mm1;

/* loaded from: classes14.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final jz5.g f410194a = jz5.h.b(mm1.e.f410188d);

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f410195b = jz5.h.b(mm1.f.f410192d);

    public static final boolean a(android.media.AudioManager audioManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioManager, "<this>");
        if (!((java.lang.Boolean) ((jz5.n) f410195b).mo141623x754a37bb()).booleanValue()) {
            if (android.os.Build.VERSION.SDK_INT < 31) {
                return audioManager.isBluetoothScoOn();
            }
            android.media.AudioDeviceInfo audioDeviceInfo = mm1.d.f410180a;
            android.media.AudioDeviceInfo audioDeviceInfo2 = mm1.d.f410180a;
            return audioDeviceInfo2 != null && audioDeviceInfo2.getType() == 7;
        }
        pm1.o oVar = pm1.e.f438347e.a().f438349a;
        java.lang.Boolean bool = oVar.f438364c;
        if (bool != null) {
            bool.booleanValue();
            ((ku5.t0) ku5.t0.f394148d).h(new pm1.h(oVar), oVar.f438362a);
            return bool.booleanValue();
        }
        android.media.AudioManager audioManager2 = oVar.f438368g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioManager2, "audioManager");
        boolean isBluetoothScoOn = audioManager2.isBluetoothScoOn();
        oVar.f438364c = java.lang.Boolean.valueOf(isBluetoothScoOn);
        return isBluetoothScoOn;
    }

    public static final boolean b(android.media.AudioManager audioManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioManager, "<this>");
        if (!((java.lang.Boolean) ((jz5.n) f410195b).mo141623x754a37bb()).booleanValue()) {
            if (android.os.Build.VERSION.SDK_INT < 31) {
                return audioManager.isSpeakerphoneOn();
            }
            android.media.AudioDeviceInfo audioDeviceInfo = mm1.d.f410180a;
            android.media.AudioDeviceInfo audioDeviceInfo2 = mm1.d.f410180a;
            return audioDeviceInfo2 != null && audioDeviceInfo2.getType() == 2;
        }
        pm1.o oVar = pm1.e.f438347e.a().f438349a;
        java.lang.Boolean bool = oVar.f438363b;
        if (bool != null) {
            bool.booleanValue();
            ((ku5.t0) ku5.t0.f394148d).h(new pm1.j(oVar), oVar.f438362a);
            return bool.booleanValue();
        }
        android.media.AudioManager audioManager2 = oVar.f438368g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioManager2, "audioManager");
        boolean isSpeakerphoneOn = audioManager2.isSpeakerphoneOn();
        oVar.f438363b = java.lang.Boolean.valueOf(isSpeakerphoneOn);
        return isSpeakerphoneOn;
    }
}
