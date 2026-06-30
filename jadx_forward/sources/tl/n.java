package tl;

/* loaded from: classes12.dex */
public class n implements tl.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tl.t f501594a;

    public n(tl.t tVar) {
        this.f501594a = tVar;
    }

    @Override // tl.c
    public void a(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAudioRecorder", "onRecError state = %s detailState = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new tl.m(this));
    }

    @Override // tl.c
    public void b(byte[] data, int i17) {
        boolean z17;
        boolean z18;
        to.c cVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAudioRecorder", "onRecPcmDataReady, markStop: %s", java.lang.Boolean.valueOf(this.f501594a.f501664k));
        tl.t tVar = this.f501594a;
        if (tVar.f501671r == tl.s.STOPPED && !tVar.f501664k) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMAudioRecorder", "recorder has been stopped");
            return;
        }
        java.lang.Integer[] numArr = wl.a.f528517a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        int i18 = wl.a.f528519c + 1;
        wl.a.f528519c = i18;
        if (i18 % 200 == 0 && i17 != 0) {
            int i19 = i17 / 2;
            short[] sArr = new short[i19];
            for (int i27 = 0; i27 < i19; i27++) {
                int i28 = i27 * 2;
                sArr[i27] = (short) (((data[i28 + 1] & 255) << 8) | (data[i28] & 255));
            }
            double d17 = 0.0d;
            for (int i29 = 0; i29 < i19; i29++) {
                short s17 = sArr[i29];
                d17 += s17 * s17;
            }
            double sqrt = java.lang.Math.sqrt(d17 / i19);
            if (sqrt < 50.0d) {
                java.lang.Integer[] numArr2 = wl.a.f528517a;
                numArr2[0] = java.lang.Integer.valueOf(numArr2[0].intValue() + 1);
            } else if (sqrt < 300.0d) {
                java.lang.Integer[] numArr3 = wl.a.f528517a;
                numArr3[1] = java.lang.Integer.valueOf(numArr3[1].intValue() + 1);
            } else if (sqrt < 2000.0d) {
                java.lang.Integer[] numArr4 = wl.a.f528517a;
                numArr4[2] = java.lang.Integer.valueOf(numArr4[2].intValue() + 1);
            } else {
                java.lang.Integer[] numArr5 = wl.a.f528517a;
                numArr5[3] = java.lang.Integer.valueOf(numArr5[3].intValue() + 1);
            }
            wl.a.f528518b++;
        }
        java.lang.Object obj = tl.t.f501653y;
        synchronized (obj) {
            z17 = this.f501594a.f501664k;
        }
        if (z17) {
            synchronized (tl.t.f501652x) {
                if (this.f501594a.f501669p != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAudioRecorder", "do stop pcm recorder, last frame data: %s, read: %s", data, java.lang.Integer.valueOf(i17));
                    this.f501594a.f501669p.l();
                    tl.t tVar2 = this.f501594a;
                    tVar2.f501669p.f501705y = null;
                    tVar2.f501669p = null;
                    z18 = true;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAudioRecorder", "stop now, but recorder is null");
                    z18 = false;
                }
            }
            synchronized (obj) {
                this.f501594a.f501664k = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAudioRecorder", "stop finish notify");
                try {
                    obj.notifyAll();
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMAudioRecorder", e17, "", new java.lang.Object[0]);
                }
            }
        } else {
            z18 = false;
        }
        long j17 = this.f501594a.f501662i;
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
        long j18 = this.f501594a.f501661h;
        if (j18 > 0 && currentTimeMillis > j18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMAudioRecorder", "Stop now ! expire duration ms:" + currentTimeMillis);
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new tl.k(this));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAudioRecorder", "read :" + i17 + " time: " + this.f501594a.f501674u.a() + " dataReadedCnt: " + this.f501594a.f501663j);
        if (i17 < 0) {
            if (this.f501594a.f501671r == tl.s.STOPPED) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMAudioRecorder", "recorder has been stopped");
                return;
            } else {
                new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new tl.l(this));
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAudioRecorder", "publish SceneVoiceRcdDataEvent, buf.len %d, len: %d.", java.lang.Integer.valueOf(data.length), java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5976xd9495943 c5976xd9495943 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5976xd9495943();
        c5976xd9495943.f136273g.f88032a = java.util.Arrays.copyOf(data, data.length);
        c5976xd9495943.f136273g.f88033b = i17;
        c5976xd9495943.e();
        tl.t tVar3 = this.f501594a;
        tVar3.f501663j += i17;
        synchronized (tVar3.f501656c) {
            tl.t tVar4 = this.f501594a;
            if (tVar4.f501659f == null && (((cVar = tVar4.f501670q) == to.c.PCM || cVar == to.c.SILK) && tVar4.f501660g != null && tVar4.f501667n)) {
                tVar4.f501659f = new n21.f();
                tl.t tVar5 = this.f501594a;
                tVar5.f501659f.c(tVar5.f501665l, 1, 16);
            }
            n21.f fVar = this.f501594a.f501659f;
            if (fVar != null) {
                java.util.concurrent.BlockingQueue blockingQueue = fVar.f415785e;
                ((java.util.concurrent.ArrayBlockingQueue) blockingQueue).size();
                if (data.length > 0) {
                    ((java.util.concurrent.ArrayBlockingQueue) blockingQueue).add(new tl.h0(data, data.length));
                }
            }
            tl.t tVar6 = this.f501594a;
            if (tVar6.f501670q == to.c.SILK) {
                if (tVar6.f501657d == null) {
                    tVar6.f501657d = new yl.g(tVar6.f501665l, tVar6.f501666m);
                    tl.t tVar7 = this.f501594a;
                    tVar7.f501657d.b(tVar7.f501655b);
                }
                c(data, i17);
                this.f501594a.f501657d.g(data, i17, z18);
                return;
            }
            if (tVar6.f501665l == 16000) {
                int i37 = i17 % 4;
                if (i37 != 0) {
                    i17 -= i37;
                }
                if (i17 <= 0) {
                    data = null;
                } else {
                    int i38 = i17 / 2;
                    byte[] bArr = new byte[i38];
                    for (int i39 = 0; i39 < i38; i39 += 2) {
                        int i47 = i39 * 2;
                        bArr[i39] = data[i47];
                        bArr[i39 + 1] = data[i47 + 1];
                    }
                    data = bArr;
                }
                i17 = data.length;
            }
            c(data, i17);
        }
    }

    public final void c(byte[] bArr, int i17) {
        for (int i18 = 0; i18 < i17 / 2; i18++) {
            int i19 = i18 * 2;
            short s17 = (short) ((bArr[i19 + 1] << 8) | (bArr[i19] & 255));
            tl.t tVar = this.f501594a;
            if (s17 > tVar.f501654a) {
                tVar.f501654a = s17;
            }
        }
    }
}
