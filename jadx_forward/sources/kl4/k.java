package kl4;

/* loaded from: classes13.dex */
public final class k extends jm4.z {

    /* renamed from: f, reason: collision with root package name */
    public jm4.x f390456f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f390457g;

    /* renamed from: i, reason: collision with root package name */
    public java.util.concurrent.CountDownLatch f390459i;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f390454d = "AudioPostProcessPlugin";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f390455e = "MicroMsg.TingPlatformAudioDecoder";

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f390458h = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Object f390460m = new java.lang.Object();

    /* renamed from: n, reason: collision with root package name */
    public final kl4.h f390461n = new kl4.h(0, 1, null);

    public static final void a(kl4.k kVar, java.lang.String str) {
        android.media.MediaExtractor mediaExtractor;
        boolean z17;
        long currentTimeMillis;
        int d17;
        bw5.y1 y1Var;
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        int m43235xb06291ee;
        kl4.h hVar = kVar.f390461n;
        java.lang.String str2 = kVar.f390454d;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = kVar.f390458h;
        android.media.MediaExtractor mediaExtractor2 = new android.media.MediaExtractor();
        try {
            currentTimeMillis = java.lang.System.currentTimeMillis();
            mediaExtractor2.setDataSource(str);
            d17 = kVar.d(mediaExtractor2);
        } catch (java.lang.Exception e17) {
            e = e17;
            mediaExtractor = mediaExtractor2;
        } catch (java.lang.Throwable th6) {
            th = th6;
            mediaExtractor = mediaExtractor2;
        }
        if (d17 >= 0 && atomicBoolean.get()) {
            mediaExtractor2.selectTrack(d17);
            android.media.MediaFormat trackFormat = mediaExtractor2.getTrackFormat(d17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(trackFormat, "getTrackFormat(...)");
            int integer = trackFormat.getInteger("sample-rate");
            int integer2 = trackFormat.getInteger("channel-count");
            mediaExtractor = mediaExtractor2;
            try {
                int i17 = (int) trackFormat.getLong("durationUs");
                y1Var = new bw5.y1();
                y1Var.f116838e = integer;
                boolean[] zArr = y1Var.f116841h;
                zArr[2] = true;
                y1Var.f116839f = integer2;
                zArr[3] = true;
                y1Var.f116837d = bw5.x1.PCMFormatS16LE;
                zArr[1] = true;
                y1Var.f116840g = true;
                zArr[4] = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "decodeAudioFile trackIndex " + d17 + ", filePath " + str + ", sampleRate " + integer + ", channelCount " + integer2 + ", duration " + i17);
                byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                m43235xb06291ee = com.p314xaae8f345.mm.p630x58d9bd6.mix.jni.C5141x59f24b9c.m43235xb06291ee(integer, integer2, 2, str, new kl4.i(kVar, byteArrayOutputStream, ((((integer * integer2) * 2) * 20) / 1000) * 10, y1Var));
                long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDecodeData result = ");
                sb6.append(m43235xb06291ee);
                sb6.append(", decode time = ");
                sb6.append(currentTimeMillis2);
                sb6.append(" ms, outputStream size = ");
                sb6.append(byteArrayOutputStream.size());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
            } catch (java.lang.Exception e18) {
                e = e18;
                z17 = false;
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str2, e, "decode: exception occurred", new java.lang.Object[0]);
                    mediaExtractor.release();
                    atomicBoolean.set(z17);
                    return;
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    mediaExtractor.release();
                    atomicBoolean.set(z17);
                    throw th;
                }
            } catch (java.lang.Throwable th8) {
                th = th8;
                z17 = false;
                mediaExtractor.release();
                atomicBoolean.set(z17);
                throw th;
            }
            if (m43235xb06291ee != 0) {
                atomicBoolean.set(false);
            } else if (atomicBoolean.get()) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                com.p314xaae8f345.p3118xeeebfacc.C26831x7765d788 a17 = hVar.a(byteArray.length, byteArray);
                try {
                    try {
                        jm4.x xVar = kVar.f390456f;
                        if (xVar != null) {
                            ((jm4.y) xVar).a(a17, y1Var, false);
                        }
                        hVar.b(a17);
                    } catch (java.lang.Exception e19) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, "audio decode last frame callback error: " + e19.getMessage());
                        hVar.b(a17);
                    }
                    z17 = false;
                    mediaExtractor.release();
                    atomicBoolean.set(z17);
                    return;
                } catch (java.lang.Throwable th9) {
                    hVar.b(a17);
                    throw th9;
                }
            }
            mediaExtractor.release();
            atomicBoolean.set(false);
        }
        mediaExtractor = mediaExtractor2;
        mediaExtractor.release();
        atomicBoolean.set(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (r26.i0.y(r3, "audio/", false) == true) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(android.media.MediaExtractor r6) {
        /*
            r5 = this;
            int r0 = r6.getTrackCount()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L2b
            android.media.MediaFormat r3 = r6.getTrackFormat(r2)
            java.lang.String r4 = "getTrackFormat(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r4)
            java.lang.String r4 = "mime"
            java.lang.String r3 = r3.getString(r4)
            if (r3 == 0) goto L24
            java.lang.String r4 = "audio/"
            boolean r3 = r26.i0.y(r3, r4, r1)
            r4 = 1
            if (r3 != r4) goto L24
            goto L25
        L24:
            r4 = r1
        L25:
            if (r4 == 0) goto L28
            return r2
        L28:
            int r2 = r2 + 1
            goto L6
        L2b:
            r6 = -1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kl4.k.d(android.media.MediaExtractor):int");
    }
}
