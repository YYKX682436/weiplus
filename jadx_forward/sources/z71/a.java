package z71;

/* loaded from: classes14.dex */
public abstract class a {
    public static boolean a(com.p314xaae8f345.mm.p2493x1bc889d6.C19766x8c90e3ec c19766x8c90e3ec) {
        android.content.Intent registerReceiver = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AiDeviceData", "get battery charge intent is null");
            return false;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        boolean z17 = intExtra == 2 || intExtra == 5;
        int intExtra2 = registerReceiver.getIntExtra(ya.b.f77487x44fa364, -1);
        int intExtra3 = registerReceiver.getIntExtra("scale", -1);
        if (intExtra2 >= 0 && intExtra3 > 0) {
            c19766x8c90e3ec.f38863x6ac9171 = (intExtra2 * 1.0f) / (intExtra3 * 1.0f);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiDeviceData", "get battery charge and level charging[%b] level[%f]", java.lang.Boolean.valueOf(z17), java.lang.Float.valueOf(c19766x8c90e3ec.f38863x6ac9171));
        return z17;
    }

    public static int b() {
        android.content.Intent registerReceiver = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AiDeviceData", "get battery charge intent is null");
            return -1;
        }
        int intExtra = registerReceiver.getIntExtra(ya.b.f77487x44fa364, -1);
        int intExtra2 = registerReceiver.getIntExtra("scale", -1);
        if (intExtra < 0 || intExtra2 <= 0) {
            return -1;
        }
        return (int) (((intExtra * 1.0f) / (intExtra2 * 1.0f)) * 100.0f);
    }

    public static int c() {
        boolean isWiredHeadsetOn;
        xm1.h hVar = (xm1.h) ((bv.a) ((cv.s0) i95.n0.c(cv.s0.class))).wi();
        if (hVar.e()) {
            pm1.o oVar = pm1.e.f438347e.a().f438349a;
            java.lang.Boolean bool = oVar.f438366e;
            if (bool != null) {
                bool.booleanValue();
                ((ku5.t0) ku5.t0.f394148d).h(new pm1.k(oVar), oVar.f438362a);
                isWiredHeadsetOn = bool.booleanValue();
            } else {
                android.media.AudioManager audioManager = oVar.f438368g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioManager, "audioManager");
                boolean isWiredHeadsetOn2 = audioManager.isWiredHeadsetOn();
                oVar.f438366e = java.lang.Boolean.valueOf(isWiredHeadsetOn2);
                isWiredHeadsetOn = isWiredHeadsetOn2;
            }
        } else {
            isWiredHeadsetOn = hVar.c().isWiredHeadsetOn();
        }
        int i17 = isWiredHeadsetOn ? 3 : hVar.j() ? 4 : hVar.n() ? 1 : 2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiDeviceData", "get current audio mode [%d]", java.lang.Integer.valueOf(i17));
        return i17;
    }
}
