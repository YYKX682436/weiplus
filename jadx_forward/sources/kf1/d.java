package kf1;

/* loaded from: classes15.dex */
public class d extends kf1.a {

    /* renamed from: e, reason: collision with root package name */
    public xl.d f388702e;

    /* renamed from: f, reason: collision with root package name */
    public kf1.g f388703f;

    /* renamed from: g, reason: collision with root package name */
    public long f388704g;

    /* renamed from: h, reason: collision with root package name */
    public int f388705h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Runnable f388706i = new kf1.b(this);

    public jf1.c d() {
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DefaultLuggageRecorder", "pauseRecord");
        xl.d dVar = this.f388702e;
        if (dVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DefaultLuggageRecorder", "mRecorderPcm is null, err");
            return new jf1.c("may be not start", new java.lang.Object[0]);
        }
        boolean z18 = true;
        xl.g gVar = dVar.f536612a;
        if (gVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecorderPcm", "pauseRecord fail, recorder is null, return");
            z17 = true;
        } else {
            z17 = false;
        }
        if (!z17) {
            if (gVar.f536625a == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecorderPcm", "mAudioRecord is null, return");
            } else {
                z18 = false;
            }
            if (!z18) {
                gVar.f536631g = false;
            }
        }
        int currentTimeMillis = (int) (this.f388705h + (java.lang.System.currentTimeMillis() - this.f388704g));
        this.f388705h = currentTimeMillis;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DefaultLuggageRecorder", "pauseRecordTime mRecordingTime:%d mLastStartTime:%d", java.lang.Integer.valueOf(currentTimeMillis), java.lang.Long.valueOf(this.f388704g));
        ik1.h0.a().mo50300x3fa464aa(this.f388706i);
        a();
        return jf1.c.f380883d;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jf1.c e(kf1.g r15) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kf1.d.e(kf1.g):jf1.c");
    }

    public jf1.c f() {
        boolean z17;
        boolean z18;
        xl.d dVar = this.f388702e;
        boolean z19 = false;
        if (dVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DefaultLuggageRecorder", "mRecorderPcm is null, err");
            return new jf1.c("may be not start", new java.lang.Object[0]);
        }
        if (dVar.f536612a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecorderPcm", "stopRecord fail, recorder is null, return");
            z17 = true;
        } else {
            z17 = false;
        }
        if (!z17) {
            xl.g gVar = dVar.f536612a;
            if (gVar.f536625a == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecorderPcm", "mAudioRecord is null, return");
                z18 = true;
            } else {
                z18 = false;
            }
            if (!z18) {
                gVar.f536631g = false;
                try {
                    gVar.f536625a.stop();
                    synchronized (gVar) {
                        android.media.AudioRecord audioRecord = gVar.f536625a;
                        if (audioRecord != null) {
                            audioRecord.setRecordPositionUpdateListener(null);
                            gVar.f536625a.release();
                            gVar.f536625a = null;
                        }
                    }
                    z19 = true;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.RecorderPcm", "", e17);
                }
            }
            synchronized (dVar.f536616e) {
                kh1.e eVar = dVar.f536613b;
                if (eVar != null) {
                    eVar.mo51971x5d03b04();
                    dVar.f536613b.mo51970x5a5ddf8();
                    dVar.f536613b = null;
                }
            }
            synchronized (dVar) {
                xl.g gVar2 = dVar.f536612a;
                synchronized (gVar2) {
                    android.media.AudioRecord audioRecord2 = gVar2.f536625a;
                    if (audioRecord2 != null) {
                        audioRecord2.setRecordPositionUpdateListener(null);
                        gVar2.f536625a.release();
                        gVar2.f536625a = null;
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecorderPcm", "stopRecord:%b", java.lang.Boolean.valueOf(z19));
        }
        java.lang.String str = this.f388703f.f388709a;
        int i17 = this.f388705h;
        int k17 = (int) com.p314xaae8f345.mm.vfs.w6.k(str);
        c(str, i17, k17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DefaultLuggageRecorder", "stopRecord() filePath:%s duration:%d fileSize:%d", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(k17));
        mo142548x41012807();
        return jf1.c.f380883d;
    }

    /* renamed from: release */
    public synchronized void mo142548x41012807() {
        this.f388703f = null;
        xl.d dVar = this.f388702e;
        if (dVar != null) {
            synchronized (dVar) {
                xl.g gVar = dVar.f536612a;
                synchronized (gVar) {
                    android.media.AudioRecord audioRecord = gVar.f536625a;
                    if (audioRecord != null) {
                        audioRecord.setRecordPositionUpdateListener(null);
                        gVar.f536625a.release();
                        gVar.f536625a = null;
                    }
                }
            }
            this.f388702e = null;
        }
    }
}
