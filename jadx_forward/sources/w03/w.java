package w03;

/* loaded from: classes8.dex */
public final class w implements z41.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15554x67783102 f523451a;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15554x67783102 activityC15554x67783102) {
        this.f523451a = activityC15554x67783102;
    }

    @Override // z41.b
    public final void a(z41.a aVar, z41.a aVar2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15554x67783102 activityC15554x67783102 = this.f523451a;
        if (aVar2 == activityC15554x67783102.f218856y) {
            return;
        }
        int i17 = android.provider.Settings.System.getInt(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver(), "accelerometer_rotation", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MegaVideoFlutterActivity", "accRotation=" + i17);
        if (i17 == 0) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar2);
        activityC15554x67783102.f218856y = aVar2;
        android.graphics.Bitmap bitmap = com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15554x67783102.B;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MegaVideoFlutterActivity", "onOrientationsChange currentOrientation=" + aVar2);
        int i18 = w03.v.f523450a[aVar2.ordinal()];
        if (i18 == 1) {
            activityC15554x67783102.setRequestedOrientation(0);
            return;
        }
        if (i18 == 2) {
            activityC15554x67783102.setRequestedOrientation(8);
        } else if (i18 == 3 && !((java.lang.Boolean) ((jz5.n) activityC15554x67783102.f218852u).mo141623x754a37bb()).booleanValue()) {
            activityC15554x67783102.setRequestedOrientation(1);
        }
    }
}
