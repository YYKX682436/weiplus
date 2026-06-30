package ao4;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public k6.a f94090a;

    /* renamed from: b, reason: collision with root package name */
    public android.os.Vibrator f94091b;

    /* renamed from: c, reason: collision with root package name */
    public int f94092c;

    public final void a(ey3.a vibrateInfo, bo4.a aVar) {
        boolean fj6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vibrateInfo, "vibrateInfo");
        if (!fp.h.c(26) || vibrateInfo.f339136a == null || vibrateInfo.f339137b == null) {
            return;
        }
        if (co4.c.a()) {
            fj6 = false;
        } else {
            fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_ringtone_voip_can_vibrate, true);
        }
        if (fj6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.VibrateServiceHelper", "init vibrate service use aac haptic" + hashCode());
            k6.a b17 = k6.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            if (b17 != null) {
                java.lang.String str = vibrateInfo.f339136a;
                java.lang.String str2 = vibrateInfo.f339137b;
                if (str != null && str2 != null) {
                    p6.f fVar = b17.f386010a;
                    if (aVar == null) {
                        java.io.File file = new java.io.File(co4.c.e(str, str2, true));
                        if (fVar != null) {
                            fVar.d(file, 255, 50, null);
                        }
                    } else {
                        java.io.File file2 = new java.io.File(co4.c.e(str, str2, true));
                        ao4.a aVar2 = new ao4.a(aVar);
                        if (fVar != null) {
                            fVar.d(file2, 255, 50, aVar2);
                        }
                    }
                }
            } else {
                b17 = null;
            }
            this.f94090a = b17;
        }
    }

    public final void b() {
        if (!fp.h.c(26) || this.f94090a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.VibrateServiceHelper", "start vibrate service use default");
            java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("vibrator");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
            this.f94091b = (android.os.Vibrator) systemService;
            if (!fp.h.c(26)) {
                android.os.Vibrator vibrator = this.f94091b;
                if (vibrator != null) {
                    vibrator.vibrate(new long[]{1000, 1000, 1000, 1000}, 0);
                    return;
                }
                return;
            }
            android.media.AudioAttributes build = new android.media.AudioAttributes.Builder().setUsage(6).build();
            android.os.Vibrator vibrator2 = this.f94091b;
            if (vibrator2 != null) {
                vibrator2.vibrate(android.os.VibrationEffect.createWaveform(new long[]{1000, 1000, 1000, 1000}, 0), build);
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.VibrateServiceHelper", "start vibrate service use aac haptic " + this.f94090a);
        try {
            k6.a aVar = this.f94090a;
            if (aVar != null) {
                p6.f fVar = aVar.f386010a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.VibrateServiceHelper", "do vibrate use aac haptic  " + this.f94090a);
                if (fVar != null) {
                    fVar.mo157876xed060d07();
                }
                if (fVar != null) {
                    fVar.b(true);
                }
                if (fVar == null) {
                    return;
                }
                fVar.mo157879x68ac462();
            }
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MircoMsg.VibrateServiceHelper", "error on haptic vibrate ");
        }
    }

    public final void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.VibrateServiceHelper", "do stop vibrate service");
        k6.a aVar = this.f94090a;
        if (aVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.VibrateServiceHelper", "do stop vibrate service " + aVar);
            p6.f fVar = aVar.f386010a;
            if (fVar != null) {
                fVar.mo157875x65825f6();
            }
            if (fVar != null) {
                fVar.c();
            }
            if (fVar != null) {
                fVar.mo157877x41012807();
            }
        }
        android.os.Vibrator vibrator = this.f94091b;
        if (vibrator != null) {
            vibrator.cancel();
        }
    }
}
