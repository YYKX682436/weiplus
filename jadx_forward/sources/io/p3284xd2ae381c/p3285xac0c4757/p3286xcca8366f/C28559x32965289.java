package io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f;

/* renamed from: io.flutter.embedding.android.KeyData */
/* loaded from: classes15.dex */
public class C28559x32965289 {

    /* renamed from: BYTES_PER_FIELD */
    private static final int f70680xe0def024 = 8;

    /* renamed from: CHANNEL */
    public static final java.lang.String f70681x56d708e3 = "flutter/keydata";

    /* renamed from: FIELD_COUNT */
    private static final int f70682xdfded94a = 6;
    private static final java.lang.String TAG = "KeyData";

    /* renamed from: character */
    java.lang.String f70683x5d3bbb29;

    /* renamed from: deviceType */
    io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28559x32965289.DeviceType f70684x2e9006b0;

    /* renamed from: logicalKey */
    long f70685x85282196;

    /* renamed from: physicalKey */
    long f70686x814b0208;

    /* renamed from: synthesized */
    boolean f70687x514a757a;

    /* renamed from: timestamp */
    long f70688x3492916;

    /* renamed from: type */
    io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28559x32965289.Type f70689x368f3a;

    /* renamed from: io.flutter.embedding.android.KeyData$DeviceType */
    /* loaded from: classes15.dex */
    public enum DeviceType {
        kKeyboard(0),
        kDirectionalPad(1),
        kGamepad(2),
        kJoystick(3),
        kHdmi(4);


        /* renamed from: value */
        private final long f70696x6ac9171;

        DeviceType(long j17) {
            this.f70696x6ac9171 = j17;
        }

        /* renamed from: fromLong */
        public static io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28559x32965289.DeviceType m137304xb5cc6d46(long j17) {
            int i17 = (int) j17;
            if (i17 == 0) {
                return kKeyboard;
            }
            if (i17 == 1) {
                return kDirectionalPad;
            }
            if (i17 == 2) {
                return kGamepad;
            }
            if (i17 == 3) {
                return kJoystick;
            }
            if (i17 == 4) {
                return kHdmi;
            }
            throw new java.lang.AssertionError("Unexpected DeviceType value");
        }

        /* renamed from: getValue */
        public long m137307x754a37bb() {
            return this.f70696x6ac9171;
        }
    }

    /* renamed from: io.flutter.embedding.android.KeyData$Type */
    /* loaded from: classes15.dex */
    public enum Type {
        kDown(0),
        kUp(1),
        kRepeat(2);


        /* renamed from: value */
        private long f70700x6ac9171;

        Type(long j17) {
            this.f70700x6ac9171 = j17;
        }

        /* renamed from: fromLong */
        public static io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28559x32965289.Type m137310xb5cc6d46(long j17) {
            int i17 = (int) j17;
            if (i17 == 0) {
                return kDown;
            }
            if (i17 == 1) {
                return kUp;
            }
            if (i17 == 2) {
                return kRepeat;
            }
            throw new java.lang.AssertionError("Unexpected Type value");
        }

        /* renamed from: getValue */
        public long m137313x754a37bb() {
            return this.f70700x6ac9171;
        }
    }

    public C28559x32965289() {
    }

    public C28559x32965289(java.nio.ByteBuffer byteBuffer) {
        long j17 = byteBuffer.getLong();
        this.f70688x3492916 = byteBuffer.getLong();
        this.f70689x368f3a = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28559x32965289.Type.m137310xb5cc6d46(byteBuffer.getLong());
        this.f70686x814b0208 = byteBuffer.getLong();
        this.f70685x85282196 = byteBuffer.getLong();
        this.f70687x514a757a = byteBuffer.getLong() != 0;
        this.f70684x2e9006b0 = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28559x32965289.DeviceType.m137304xb5cc6d46(byteBuffer.getLong());
        if (byteBuffer.remaining() == j17) {
            this.f70683x5d3bbb29 = null;
            if (j17 != 0) {
                int i17 = (int) j17;
                byte[] bArr = new byte[i17];
                byteBuffer.get(bArr, 0, i17);
                try {
                    this.f70683x5d3bbb29 = new java.lang.String(bArr, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                    return;
                } catch (java.io.UnsupportedEncodingException unused) {
                    throw new java.lang.AssertionError("UTF-8 unsupported");
                }
            }
            return;
        }
        throw new java.lang.AssertionError(java.lang.String.format("Unexpected char length: charSize is %d while buffer has position %d, capacity %d, limit %d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(byteBuffer.position()), java.lang.Integer.valueOf(byteBuffer.capacity()), java.lang.Integer.valueOf(byteBuffer.limit())));
    }

    /* renamed from: toBytes */
    public java.nio.ByteBuffer m137301xb99796b0() {
        try {
            java.lang.String str = this.f70683x5d3bbb29;
            byte[] bytes = str == null ? null : str.getBytes(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            int length = bytes == null ? 0 : bytes.length;
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(length + 56);
            allocateDirect.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong(length);
            allocateDirect.putLong(this.f70688x3492916);
            allocateDirect.putLong(this.f70689x368f3a.m137313x754a37bb());
            allocateDirect.putLong(this.f70686x814b0208);
            allocateDirect.putLong(this.f70685x85282196);
            allocateDirect.putLong(this.f70687x514a757a ? 1L : 0L);
            allocateDirect.putLong(this.f70684x2e9006b0.m137307x754a37bb());
            if (bytes != null) {
                allocateDirect.put(bytes);
            }
            return allocateDirect;
        } catch (java.io.UnsupportedEncodingException unused) {
            throw new java.lang.AssertionError("UTF-8 not supported");
        }
    }
}
