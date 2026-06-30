package com.p314xaae8f345.tav.p2959x5befac44;

/* renamed from: com.tencent.tav.decoder.AudioMixer */
/* loaded from: classes15.dex */
public class C25757xd228d1f3 {

    /* renamed from: OUTPUT_CHANNEL_COUNT */
    public static final int f47986x5bbd7d5 = 1;

    /* renamed from: OUTPUT_SAMPLE_RATE */
    public static final int f47987x31a00017 = 44100;

    /* renamed from: SIGNED_SHORT_LIMIT */
    private static final int f47988xc6928555 = 32768;
    private static final java.lang.String TAG = "AudioMixer";

    /* renamed from: UNSIGNED_SHORT_MAX */
    private static final int f47989x5ea93a17 = 65535;

    /* renamed from: _hellAccFlag_ */
    private byte f47990x7f11beae;

    /* renamed from: cachedByteBuffer */
    private java.nio.ByteBuffer f47991x2f5d962a;

    /* renamed from: cachedMergedBuffer */
    private java.nio.ByteBuffer f47992x34ef44ce;

    /* renamed from: cachedMergedBytes */
    private short[] f47993xd02ac61d;

    /* renamed from: destAudioChannelCount */
    private int f47994x82ef8640;

    /* renamed from: destAudioSampleRate */
    private int f47995xc324d71e;

    /* renamed from: emptyAudioBuffer */
    private java.nio.ByteBuffer f47996x29242429;

    /* renamed from: nativeContext */
    private long f47997xffae8598;

    /* renamed from: pcmEncoding */
    private int f47998x2771c84d;

    /* renamed from: resampleBuffer */
    private short[] f47999x9834e83d;

    /* renamed from: sampleBuffer */
    private short[] f48000xe9bf8e8a;

    /* renamed from: sampleFactor */
    private float f48001xef77f399;

    /* renamed from: singleChannel */
    private boolean f48002xa883af9b;

    /* renamed from: srcNumChannels */
    private int f48003x244e60f2;

    /* renamed from: srcSampleRate */
    private int f48004xa5c1deae;

    static {
        if (com.p314xaae8f345.tav.C25631xd106c456.m96104xe6c221cf()) {
            return;
        }
        try {
            java.lang.System.out.println("loadlibrary : tav start");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("tav");
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/tav/decoder/AudioMixer", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/tav/decoder/AudioMixer", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            com.p314xaae8f345.tav.C25631xd106c456.m96106x16e18707(true);
            java.lang.System.out.println("loadlibrary : tav end");
        } catch (java.lang.Throwable unused) {
        }
    }

    public C25757xd228d1f3() {
        this(44100, 1);
    }

    /* renamed from: downRemix */
    private short[] m97418x4ccb87c7(short[] sArr) {
        java.nio.ShortBuffer wrap = java.nio.ShortBuffer.wrap(sArr);
        java.nio.ShortBuffer allocate = java.nio.ShortBuffer.allocate(sArr.length);
        m97426x4ccb87c7(wrap, allocate);
        return allocate.array();
    }

    /* renamed from: getCachedSampleBuffer */
    private short[] m97419x9fe9e2c2(int i17) {
        short[] sArr = this.f48000xe9bf8e8a;
        if (sArr != null && sArr.length >= i17) {
            return sArr;
        }
        short[] sArr2 = new short[i17];
        this.f48000xe9bf8e8a = sArr2;
        return sArr2;
    }

    /* renamed from: getResampleLength */
    private int m97420x96ff5bd9(int i17) {
        int i18 = (int) (i17 * this.f48001xef77f399);
        return i18 % 2 == 1 ? i18 - 1 : i18;
    }

    /* renamed from: nativeRelease */
    private native void m97421x7f877f0(long j17);

    /* renamed from: nativeSetup */
    private native long m97422x67b070a6(int i17, int i18);

    /* renamed from: readShortFromStream */
    private native void m97423xfc01a0f0(long j17, short[] sArr);

    /* renamed from: resample */
    private short[] m97424xeae2d19d(short[] sArr, int i17) {
        float f17 = this.f48001xef77f399;
        if (f17 == 1.0f) {
            return sArr;
        }
        if (java.lang.Float.compare(f17, 0.5f) == 0) {
            return m97418x4ccb87c7(sArr);
        }
        int m97420x96ff5bd9 = m97420x96ff5bd9(i17);
        short[] sArr2 = this.f47999x9834e83d;
        if (sArr2 == null || sArr2.length < m97420x96ff5bd9) {
            sArr2 = new short[m97420x96ff5bd9];
            this.f47999x9834e83d = sArr2;
        }
        float f18 = 1.0f / this.f48001xef77f399;
        int i18 = 0;
        if (this.f48002xa883af9b) {
            while (i18 < m97420x96ff5bd9) {
                short s17 = sArr[(int) (i18 * f18)];
                sArr2[i18 + 1] = s17;
                sArr2[i18] = s17;
                i18 += 2;
            }
        } else {
            while (i18 < m97420x96ff5bd9) {
                int i19 = ((int) (i18 * 0.5d * f18)) * 2;
                sArr2[i18] = sArr[i19];
                sArr2[i18 + 1] = sArr[i19 + 1];
                i18 += 2;
            }
        }
        return sArr2;
    }

    /* renamed from: writeShortToStream */
    private native int m97425x39acc8d8(long j17, short[] sArr, int i17, float f17, float f18, float f19);

    /* renamed from: finalize */
    public void m97427xd764dc1e() {
        m97431x41012807();
    }

    /* renamed from: getDestAudioChannelCount */
    public int m97428x8e9b588a() {
        return this.f47994x82ef8640;
    }

    /* renamed from: mergeSamples */
    public java.nio.ByteBuffer m97429x435184b1(java.nio.ShortBuffer shortBuffer, java.nio.ShortBuffer shortBuffer2) {
        java.nio.ByteBuffer byteBuffer = this.f47992x34ef44ce;
        if (byteBuffer == null || byteBuffer.capacity() < shortBuffer.limit() * 2) {
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(shortBuffer.limit() * 2);
            this.f47992x34ef44ce = allocate;
            allocate.order(shortBuffer.order());
        } else {
            this.f47992x34ef44ce.clear();
        }
        short[] sArr = this.f47993xd02ac61d;
        if (sArr == null || sArr.length < shortBuffer.limit() * 2) {
            this.f47993xd02ac61d = new short[shortBuffer.limit() * 2];
        }
        java.nio.ShortBuffer asShortBuffer = this.f47992x34ef44ce.asShortBuffer();
        short[] sArr2 = this.f47993xd02ac61d;
        int min = java.lang.Math.min(shortBuffer.limit(), shortBuffer2.limit());
        for (int i17 = 0; i17 < min; i17++) {
            int i18 = shortBuffer.get(i17) + shortBuffer2.get(i17);
            int i19 = -32768;
            if (i18 >= -32768) {
                i19 = 32767;
                if (i18 <= 32767) {
                    sArr2[i17] = (short) i18;
                }
            }
            i18 = i19;
            sArr2[i17] = (short) i18;
        }
        asShortBuffer.put(sArr2, 0, min);
        if (min < shortBuffer.limit()) {
            shortBuffer.position(min);
            asShortBuffer.put(shortBuffer);
        }
        this.f47992x34ef44ce.position(0);
        this.f47992x34ef44ce.limit(shortBuffer.limit() * 2);
        return this.f47992x34ef44ce;
    }

    /* renamed from: processBytes */
    public java.nio.ByteBuffer m97430x753a5f3c(java.nio.ByteBuffer byteBuffer, float f17, float f18, float f19) {
        int limit;
        short[] m97419x9fe9e2c2;
        java.nio.ByteBuffer allocate;
        if (f17 == 1.0f && f18 == 1.0f && f19 == 1.0f && this.f48001xef77f399 == 1.0f) {
            return byteBuffer;
        }
        int i17 = this.f47998x2771c84d;
        if (i17 == 2) {
            java.nio.ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            limit = asShortBuffer.limit();
            m97419x9fe9e2c2 = m97419x9fe9e2c2(limit);
            asShortBuffer.get(m97419x9fe9e2c2, 0, limit);
        } else {
            if (i17 != 3) {
                return byteBuffer;
            }
            limit = byteBuffer.limit();
            byteBuffer.get(new byte[limit], 0, limit);
            m97419x9fe9e2c2 = m97419x9fe9e2c2(limit);
            for (int i18 = 0; i18 < limit; i18++) {
                m97419x9fe9e2c2[i18] = r2[i18];
            }
        }
        short[] m97424xeae2d19d = m97424xeae2d19d(m97419x9fe9e2c2, limit);
        int m97420x96ff5bd9 = m97420x96ff5bd9(limit);
        if (f18 == 0.0f) {
            m97420x96ff5bd9 = (int) (m97420x96ff5bd9 / f17);
        } else if (f17 != 1.0f || f18 != 1.0f || f19 != 1.0f) {
            m97420x96ff5bd9 = m97425x39acc8d8(this.f47997xffae8598, m97424xeae2d19d, m97420x96ff5bd9 / this.f47994x82ef8640, f17, f18, f19) * this.f47994x82ef8640;
            m97424xeae2d19d = m97419x9fe9e2c2(m97420x96ff5bd9);
            m97423xfc01a0f0(this.f47997xffae8598, m97424xeae2d19d);
        }
        if (f18 == 0.0f) {
            java.nio.ByteBuffer byteBuffer2 = this.f47996x29242429;
            if (byteBuffer2 == null || byteBuffer2.limit() < m97420x96ff5bd9 * 2) {
                int i19 = m97420x96ff5bd9 * 2;
                java.nio.ByteBuffer allocate2 = java.nio.ByteBuffer.allocate(i19);
                this.f47996x29242429 = allocate2;
                allocate2.order(byteBuffer.order());
                this.f47996x29242429.put(new byte[i19]);
            }
            allocate = this.f47996x29242429;
        } else {
            java.nio.ByteBuffer byteBuffer3 = this.f47991x2f5d962a;
            if (byteBuffer3 == null || byteBuffer3.capacity() < m97420x96ff5bd9 * 2) {
                allocate = java.nio.ByteBuffer.allocate(m97420x96ff5bd9 * 2);
                this.f47991x2f5d962a = allocate;
                allocate.order(byteBuffer.order());
            } else {
                allocate = this.f47991x2f5d962a;
                allocate.clear();
            }
            allocate.asShortBuffer().put(m97424xeae2d19d, 0, m97420x96ff5bd9);
        }
        allocate.position(0);
        allocate.limit(m97420x96ff5bd9 * 2);
        return allocate;
    }

    /* renamed from: release */
    public final void m97431x41012807() {
        m97421x7f877f0(this.f47997xffae8598);
        this.f47997xffae8598 = 0L;
    }

    /* renamed from: setAudioInfo */
    public void m97432x66f3cb62(int i17, int i18, int i19) {
        this.f48004xa5c1deae = i17;
        this.f48003x244e60f2 = i18;
        this.f48001xef77f399 = (this.f47995xc324d71e * this.f47994x82ef8640) / ((i17 * i18) * 1.0f);
        this.f48002xa883af9b = i18 == 1;
        this.f47998x2771c84d = i19;
    }

    public C25757xd228d1f3(int i17, int i18) {
        this.f48004xa5c1deae = 44100;
        this.f48003x244e60f2 = 1;
        this.f47995xc324d71e = i17;
        this.f47994x82ef8640 = i18;
        this.f47997xffae8598 = m97422x67b070a6(i17, i18);
        this.f48001xef77f399 = 1.0f;
        this.f48002xa883af9b = i18 == 1;
        this.f47998x2771c84d = 2;
    }

    /* renamed from: downRemix */
    public void m97426x4ccb87c7(java.nio.ShortBuffer shortBuffer, java.nio.ShortBuffer shortBuffer2) {
        int min = java.lang.Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i17 = 0; i17 < min; i17++) {
            int i18 = ((shortBuffer.get() + 32768) + (shortBuffer.get() + 32768)) / 2;
            if (i18 >= 65536) {
                i18 = -1;
            }
            shortBuffer2.put((short) (i18 - 32768));
        }
    }
}
