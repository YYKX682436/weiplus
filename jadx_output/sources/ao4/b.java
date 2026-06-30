package ao4;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public k6.a f12557a;

    /* renamed from: b, reason: collision with root package name */
    public android.os.Vibrator f12558b;

    /* renamed from: c, reason: collision with root package name */
    public int f12559c;

    public final void a(ey3.a vibrateInfo, bo4.a aVar) {
        boolean fj6;
        kotlin.jvm.internal.o.g(vibrateInfo, "vibrateInfo");
        if (!fp.h.c(26) || vibrateInfo.f257603a == null || vibrateInfo.f257604b == null) {
            return;
        }
        if (co4.c.a()) {
            fj6 = false;
        } else {
            fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_ringtone_voip_can_vibrate, true);
        }
        if (fj6) {
            com.tencent.mars.xlog.Log.i("MircoMsg.VibrateServiceHelper", "init vibrate service use aac haptic" + hashCode());
            k6.a b17 = k6.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
            if (b17 != null) {
                java.lang.String str = vibrateInfo.f257603a;
                java.lang.String str2 = vibrateInfo.f257604b;
                if (str != null && str2 != null) {
                    p6.f fVar = b17.f304477a;
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
            this.f12557a = b17;
        }
    }

    public final void b() {
        if (!fp.h.c(26) || this.f12557a == null) {
            com.tencent.mars.xlog.Log.i("MircoMsg.VibrateServiceHelper", "start vibrate service use default");
            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("vibrator");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
            this.f12558b = (android.os.Vibrator) systemService;
            if (!fp.h.c(26)) {
                android.os.Vibrator vibrator = this.f12558b;
                if (vibrator != null) {
                    vibrator.vibrate(new long[]{1000, 1000, 1000, 1000}, 0);
                    return;
                }
                return;
            }
            android.media.AudioAttributes build = new android.media.AudioAttributes.Builder().setUsage(6).build();
            android.os.Vibrator vibrator2 = this.f12558b;
            if (vibrator2 != null) {
                vibrator2.vibrate(android.os.VibrationEffect.createWaveform(new long[]{1000, 1000, 1000, 1000}, 0), build);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MircoMsg.VibrateServiceHelper", "start vibrate service use aac haptic " + this.f12557a);
        try {
            k6.a aVar = this.f12557a;
            if (aVar != null) {
                p6.f fVar = aVar.f304477a;
                com.tencent.mars.xlog.Log.i("MircoMsg.VibrateServiceHelper", "do vibrate use aac haptic  " + this.f12557a);
                if (fVar != null) {
                    fVar.prepare();
                }
                if (fVar != null) {
                    fVar.b(true);
                }
                if (fVar == null) {
                    return;
                }
                fVar.start();
            }
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MircoMsg.VibrateServiceHelper", "error on haptic vibrate ");
        }
    }

    public final void c() {
        com.tencent.mars.xlog.Log.i("MircoMsg.VibrateServiceHelper", "do stop vibrate service");
        k6.a aVar = this.f12557a;
        if (aVar != null) {
            com.tencent.mars.xlog.Log.i("MircoMsg.VibrateServiceHelper", "do stop vibrate service " + aVar);
            p6.f fVar = aVar.f304477a;
            if (fVar != null) {
                fVar.pause();
            }
            if (fVar != null) {
                fVar.c();
            }
            if (fVar != null) {
                fVar.release();
            }
        }
        android.os.Vibrator vibrator = this.f12558b;
        if (vibrator != null) {
            vibrator.cancel();
        }
    }
}
