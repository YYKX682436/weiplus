package io3;

/* loaded from: classes13.dex */
public class c implements io3.d {

    /* renamed from: d, reason: collision with root package name */
    public static final ot5.i f375033d = new io3.a();

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f375034a = new io3.b(this, "NormsgSensorEngineWorker");

    /* renamed from: b, reason: collision with root package name */
    public final io3.e f375035b = new io3.e(this);

    /* renamed from: c, reason: collision with root package name */
    public final io3.h f375036c = new io3.h();

    public void a(android.os.Message message) {
        int i17 = message.what;
        io3.e eVar = this.f375035b;
        io3.h hVar = this.f375036c;
        switch (i17) {
            case 1:
                jo3.b bVar = (jo3.b) message.obj;
                int i18 = message.arg1;
                this.f375034a.mo50303x856b99f0(6);
                java.lang.String str = bVar.f382427c;
                hVar.getClass();
                com.p314xaae8f345.mm.p975xc206bf10.k.k(str, i18, bVar.f382425a);
                if (hVar.f375050a) {
                    com.p314xaae8f345.mm.p975xc206bf10.k.h();
                }
                java.util.Iterator it = ((java.util.ArrayList) hVar.f375051b).iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p975xc206bf10.k.b(((java.lang.Integer) it.next()).intValue());
                }
                java.util.Iterator it6 = ((java.util.ArrayList) hVar.f375052c).iterator();
                while (it6.hasNext()) {
                    com.p314xaae8f345.mm.p975xc206bf10.k.a(((java.lang.Integer) it6.next()).intValue());
                }
                if (eVar.f375037d.get()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NormsgSensorEngine", "SensorListener is already started");
                    return;
                }
                java.util.HashMap hashMap = (java.util.HashMap) eVar.f375039f;
                hashMap.clear();
                android.os.HandlerThread handlerThread = new android.os.HandlerThread("NSL");
                eVar.f375041h = handlerThread;
                handlerThread.start();
                eVar.f375042i = new android.os.Handler(eVar.f375041h.getLooper());
                int[] iArr = jo3.b.f382424d;
                int i19 = 0;
                while (true) {
                    io3.d dVar = eVar.f375038e;
                    if (i19 >= 5) {
                        boolean isEmpty = hashMap.isEmpty();
                        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = eVar.f375037d;
                        if (!isEmpty) {
                            atomicBoolean.set(true);
                            return;
                        }
                        ((io3.c) dVar).b(3, 0);
                        atomicBoolean.set(false);
                        android.os.HandlerThread handlerThread2 = eVar.f375041h;
                        if (handlerThread2 != null) {
                            handlerThread2.quit();
                            return;
                        }
                        return;
                    }
                    int i27 = iArr[i19];
                    if (jo3.a.a(i27) == 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NormsgSensorListener", "Unknown sensor type " + i27);
                    } else {
                        android.hardware.SensorManager sensorManager = eVar.f375040g;
                        android.hardware.Sensor defaultSensor = sensorManager.getDefaultSensor(i27);
                        int a17 = jo3.a.a(i27);
                        if (defaultSensor == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NormsgSensorListener", "Device has no sensor " + a17);
                            ((io3.c) dVar).b(1, a17);
                        } else {
                            hashMap.put(java.lang.Integer.valueOf(a17), new io3.f(defaultSensor));
                            if (!sensorManager.registerListener(eVar, defaultSensor, 0, eVar.f375042i)) {
                                ((io3.c) dVar).b(2, a17);
                            }
                        }
                    }
                    i19++;
                }
            case 2:
                int i28 = message.arg1;
                java.util.List list = (java.util.List) message.obj;
                if (list == null || list.isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NormsgSensorEngine", "Sensor buffer is empty");
                    return;
                }
                hVar.getClass();
                if (list.isEmpty()) {
                    return;
                }
                com.p314xaae8f345.mm.p975xc206bf10.k.f(i28, list);
                return;
            case 3:
                java.lang.String str2 = (java.lang.String) message.obj;
                hVar.getClass();
                if (com.p314xaae8f345.mm.p975xc206bf10.k.j(str2)) {
                    d(str2);
                    return;
                }
                int d17 = com.p314xaae8f345.mm.p975xc206bf10.k.d(str2);
                if (d17 < 0) {
                    return;
                }
                com.p314xaae8f345.mm.p975xc206bf10.k.i(str2);
                c(4, 0, str2, d17 > 0 ? (d17 * 20) + 2000 : 0);
                return;
            case 4:
                d((java.lang.String) message.obj);
                return;
            case 5:
                java.lang.String str3 = (java.lang.String) message.obj;
                hVar.getClass();
                com.p314xaae8f345.mm.p975xc206bf10.k.l(str3);
                if (com.p314xaae8f345.mm.p975xc206bf10.k.e()) {
                    return;
                }
                c(6, 0, null, 0L);
                return;
            case 6:
                if (eVar.f375037d.get()) {
                    java.util.HashMap hashMap2 = (java.util.HashMap) eVar.f375039f;
                    java.util.Iterator it7 = hashMap2.values().iterator();
                    while (it7.hasNext()) {
                        eVar.f375040g.unregisterListener(eVar, ((io3.f) it7.next()).f375043a);
                    }
                    eVar.f375037d.set(false);
                    hashMap2.clear();
                    android.os.HandlerThread handlerThread3 = eVar.f375041h;
                    if (handlerThread3 != null) {
                        handlerThread3.quit();
                    }
                }
                hVar.f375050a = false;
                ((java.util.ArrayList) hVar.f375051b).clear();
                ((java.util.ArrayList) hVar.f375052c).clear();
                com.p314xaae8f345.mm.p975xc206bf10.k.g();
                return;
            default:
                return;
        }
    }

    public void b(int i17, int i18) {
        io3.h hVar = this.f375036c;
        if (i17 == 1) {
            ((java.util.ArrayList) hVar.f375052c).add(java.lang.Integer.valueOf(i18));
            com.p314xaae8f345.mm.p975xc206bf10.k.a(i18);
            return;
        }
        if (i17 == 2) {
            ((java.util.ArrayList) hVar.f375051b).add(java.lang.Integer.valueOf(i18));
            com.p314xaae8f345.mm.p975xc206bf10.k.b(i18);
            return;
        }
        if (i17 == 3) {
            hVar.f375050a = true;
            com.p314xaae8f345.mm.p975xc206bf10.k.h();
        }
    }

    public final void c(int i17, int i18, java.lang.Object obj, long j17) {
        try {
            android.os.Message obtain = android.os.Message.obtain();
            obtain.what = i17;
            obtain.arg1 = i18;
            obtain.obj = obj;
            this.f375034a.mo50311x7ab51103(obtain, j17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NormsgSensorEngine", "Send msg error: %s" + th6.getMessage());
        }
    }

    public final void d(java.lang.String str) {
        io3.h hVar = this.f375036c;
        hVar.getClass();
        byte[] c17 = com.p314xaae8f345.mm.p975xc206bf10.k.c(str);
        if (c17 != null) {
            w04.l.INSTANCE.me(str, c17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NormsgSensorEngine", "Can't get encrypted sensor data: " + str);
        }
        hVar.getClass();
        com.p314xaae8f345.mm.p975xc206bf10.k.l(str);
        if (com.p314xaae8f345.mm.p975xc206bf10.k.e()) {
            return;
        }
        c(6, 0, null, 0L);
    }
}
