package com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd;

/* renamed from: com.tencent.maas.model.time.MJTime */
/* loaded from: classes5.dex */
public class C4128x879fba0a implements java.lang.Cloneable {

    /* renamed from: FlicksPerMillisecond */
    private static final int f16092x847da12c = 1411200;

    /* renamed from: FlicksPerSecond */
    public static final int f16093x14b53ae9 = 1411200000;

    /* renamed from: flicks */
    private final long f16099xb43175c8;

    /* renamed from: type */
    private final com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.MJTimeType f16100x368f3a;

    /* renamed from: ZeroTime */
    public static final com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f16098x2ccb95b5 = new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a(0);

    /* renamed from: InvalidTime */
    public static final com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f16094x2a998d44 = new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a();

    /* renamed from: PositiveInfinityTime */
    public static final com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f16097xacdfd1ce = new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.MJTimeType.POSITIVEINFINITY);

    /* renamed from: NegativeInfinityTime */
    public static final com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f16096x18ceca0a = new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.MJTimeType.NEGATIVEINFINITY);

    /* renamed from: LUTOfCompareResultsByType */
    private static final int[][] f16095xfd9ce524 = {new int[]{2, -1, -1, 1}, new int[]{1, 0, 1, 1}, new int[]{1, -1, 0, 1}, new int[]{-1, -1, -1, 0}};

    /* renamed from: com.tencent.maas.model.time.MJTime$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$com$tencent$maas$model$time$MJTime$MJTimeType */
        static final /* synthetic */ int[] f16101xa6b5d03e;

        static {
            int[] iArr = new int[com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.MJTimeType.m33994xcee59d22().length];
            f16101xa6b5d03e = iArr;
            try {
                iArr[com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.MJTimeType.NUMERIC.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f16101xa6b5d03e[com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.MJTimeType.INVALID.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f16101xa6b5d03e[com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.MJTimeType.POSITIVEINFINITY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f16101xa6b5d03e[com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.MJTimeType.NEGATIVEINFINITY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: com.tencent.maas.model.time.MJTime$MJTimeType */
    /* loaded from: classes5.dex */
    public enum MJTimeType {
        NUMERIC(0),
        INVALID(1),
        POSITIVEINFINITY(2),
        NEGATIVEINFINITY(3);


        /* renamed from: value */
        private final int f16107x6ac9171;

        MJTimeType(int i17) {
            this.f16107x6ac9171 = i17;
        }

        /* renamed from: getValue */
        public int m33995x754a37bb() {
            return this.f16107x6ac9171;
        }

        @Override // java.lang.Enum
        public java.lang.String toString() {
            int i17 = this.f16107x6ac9171;
            return "MJTimeType{value=" + (i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a : "NEGATIVEINFINITY" : "POSITIVEINFINITY" : "INVALID" : "NUMERIC") + '}';
        }
    }

    public C4128x879fba0a() {
        this(0L, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.MJTimeType.INVALID);
    }

    /* renamed from: fromMicroseconds */
    public static com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33966xc1f3e405(long j17) {
        return m33970x2f5ce5ed(j17, 1000000);
    }

    /* renamed from: fromMilliseconds */
    public static com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33967x6fa736dc(long j17) {
        return m33970x2f5ce5ed(j17, 1000);
    }

    /* renamed from: fromNanoseconds */
    public static com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33968x369d1f41(long j17) {
        return m33970x2f5ce5ed(j17, 1000000000);
    }

    /* renamed from: fromSeconds */
    public static com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33969x7905b775(double d17) {
        return java.lang.Double.valueOf(d17).isNaN() ? f16094x2a998d44 : !java.lang.Double.valueOf(d17).isInfinite() ? new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a(java.lang.Math.round(d17 * 1.4112E9d)) : d17 > 0.0d ? f16097xacdfd1ce : f16096x18ceca0a;
    }

    /* renamed from: fromTimeValueAndScale */
    public static com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33970x2f5ce5ed(long j17, int i17) {
        long j18 = i17;
        long j19 = j17 / j18;
        long j27 = (j17 % j18) * 1411200000;
        long j28 = j27 / j18;
        if ((j27 % j18) * 2 >= j18) {
            j28++;
        }
        return new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a((j19 * 1411200000) + j28);
    }

    public static com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a max(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a2) {
        return c4128x879fba0a.m33971xf922bec1(c4128x879fba0a2) ? c4128x879fba0a : c4128x879fba0a2;
    }

    public static com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a min(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a2) {
        return c4128x879fba0a.m33986x9f3f7b48(c4128x879fba0a2) ? c4128x879fba0a : c4128x879fba0a2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if (r7 != 4) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        return com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0025, code lost:
    
        if (r1 != 4) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1 != 4) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a add(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a r7) {
        /*
            r6 = this;
            int[] r0 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.AnonymousClass1.f16101xa6b5d03e
            com.tencent.maas.model.time.MJTime$MJTimeType r1 = r6.f16100x368f3a
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == r5) goto L46
            if (r1 == r4) goto L56
            if (r1 == r3) goto L17
            if (r1 == r2) goto L27
            goto L37
        L17:
            com.tencent.maas.model.time.MJTime$MJTimeType r1 = r7.f16100x368f3a
            int r1 = r1.ordinal()
            r1 = r0[r1]
            if (r1 == r5) goto L43
            if (r1 == r4) goto L40
            if (r1 == r3) goto L43
            if (r1 == r2) goto L40
        L27:
            com.tencent.maas.model.time.MJTime$MJTimeType r7 = r7.f16100x368f3a
            int r7 = r7.ordinal()
            r7 = r0[r7]
            if (r7 == r5) goto L3d
            if (r7 == r4) goto L3a
            if (r7 == r3) goto L3a
            if (r7 == r2) goto L3d
        L37:
            com.tencent.maas.model.time.MJTime r7 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44
            return r7
        L3a:
            com.tencent.maas.model.time.MJTime r7 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44
            return r7
        L3d:
            com.tencent.maas.model.time.MJTime r7 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16096x18ceca0a
            return r7
        L40:
            com.tencent.maas.model.time.MJTime r7 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44
            return r7
        L43:
            com.tencent.maas.model.time.MJTime r7 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16097xacdfd1ce
            return r7
        L46:
            com.tencent.maas.model.time.MJTime$MJTimeType r1 = r7.f16100x368f3a
            int r1 = r1.ordinal()
            r0 = r0[r1]
            if (r0 == r5) goto L62
            if (r0 == r4) goto L5f
            if (r0 == r3) goto L5c
            if (r0 == r2) goto L59
        L56:
            com.tencent.maas.model.time.MJTime r7 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44
            return r7
        L59:
            com.tencent.maas.model.time.MJTime r7 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16096x18ceca0a
            return r7
        L5c:
            com.tencent.maas.model.time.MJTime r7 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16097xacdfd1ce
            return r7
        L5f:
            com.tencent.maas.model.time.MJTime r7 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44
            return r7
        L62:
            com.tencent.maas.model.time.MJTime r0 = new com.tencent.maas.model.time.MJTime
            long r1 = r6.f16099xb43175c8
            long r3 = r7.f16099xb43175c8
            long r1 = r1 + r3
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.add(com.tencent.maas.model.time.MJTime):com.tencent.maas.model.time.MJTime");
    }

    /* renamed from: bigThan */
    public boolean m33971xf922bec1(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a) {
        return m33972x38a73ce5(c4128x879fba0a) > 0;
    }

    /* renamed from: compare */
    public int m33972x38a73ce5(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a) {
        int i17 = f16095xfd9ce524[this.f16100x368f3a.m33995x754a37bb()][c4128x879fba0a.f16100x368f3a.m33995x754a37bb()];
        return i17 == 2 ? java.lang.Long.compare(this.f16099xb43175c8, c4128x879fba0a.f16099xb43175c8) : i17;
    }

    /* renamed from: divide */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33973xb0a37c79(double d17) {
        if (java.lang.Double.isNaN(d17)) {
            return f16094x2a998d44;
        }
        if (java.lang.Double.isFinite(d17)) {
            if (d17 == 0.0d) {
                return f16094x2a998d44;
            }
            int i17 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.AnonymousClass1.f16101xa6b5d03e[this.f16100x368f3a.ordinal()];
            if (i17 == 1) {
                return new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a(java.lang.Math.round(this.f16099xb43175c8 / d17));
            }
            if (i17 == 2) {
                return f16094x2a998d44;
            }
            if (i17 == 3) {
                if (d17 > 0.0d) {
                    return f16097xacdfd1ce;
                }
                return f16096x18ceca0a;
            }
            if (i17 == 4) {
                if (d17 > 0.0d) {
                    return f16096x18ceca0a;
                }
                return f16097xacdfd1ce;
            }
        }
        int i18 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.AnonymousClass1.f16101xa6b5d03e[this.f16100x368f3a.ordinal()];
        if (i18 == 1) {
            return f16098x2ccb95b5;
        }
        if (i18 == 2) {
            return f16094x2a998d44;
        }
        if (i18 == 3) {
            return f16094x2a998d44;
        }
        if (i18 != 4) {
            return f16094x2a998d44;
        }
        return f16094x2a998d44;
    }

    /* renamed from: equalsTo */
    public boolean m33975x22a7969a(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a) {
        return m33972x38a73ce5(c4128x879fba0a) == 0;
    }

    /* renamed from: getFlicks */
    public long m33976x194898be() {
        return this.f16099xb43175c8;
    }

    /* renamed from: getType */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.MJTimeType m33977xfb85f7b0() {
        return this.f16100x368f3a;
    }

    /* renamed from: isNegative */
    public boolean m33978x79eb37f() {
        return (m33980x66356283() && this.f16099xb43175c8 < 0) || this.f16100x368f3a == com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.MJTimeType.NEGATIVEINFINITY;
    }

    /* renamed from: isNegativeInfinity */
    public boolean m33979xff5b92c7() {
        return this.f16100x368f3a == com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.MJTimeType.NEGATIVEINFINITY;
    }

    /* renamed from: isNumeric */
    public boolean m33980x66356283() {
        return this.f16100x368f3a == com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.MJTimeType.NUMERIC;
    }

    /* renamed from: isPositive */
    public boolean m33981xfd4a4143() {
        return (m33980x66356283() && this.f16099xb43175c8 > 0) || this.f16100x368f3a == com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.MJTimeType.POSITIVEINFINITY;
    }

    /* renamed from: isPositiveInfinity */
    public boolean m33982x4f8f1c8b() {
        return this.f16100x368f3a == com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.MJTimeType.POSITIVEINFINITY;
    }

    /* renamed from: isValid */
    public boolean m33983x7b953cf2() {
        return this.f16100x368f3a != com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.MJTimeType.INVALID;
    }

    /* renamed from: multi */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33984x636d539(double d17) {
        if (java.lang.Double.isNaN(d17)) {
            return f16094x2a998d44;
        }
        if (java.lang.Double.isFinite(d17)) {
            int i17 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.AnonymousClass1.f16101xa6b5d03e[this.f16100x368f3a.ordinal()];
            if (i17 == 1) {
                return new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a(java.lang.Math.round(this.f16099xb43175c8 * d17));
            }
            if (i17 == 2) {
                return f16094x2a998d44;
            }
            if (i17 == 3) {
                return f16097xacdfd1ce;
            }
            if (i17 == 4) {
                return f16096x18ceca0a;
            }
        }
        if (d17 > 0.0d) {
            int i18 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.AnonymousClass1.f16101xa6b5d03e[this.f16100x368f3a.ordinal()];
            if (i18 == 1) {
                return f16097xacdfd1ce;
            }
            if (i18 == 2) {
                return f16094x2a998d44;
            }
            if (i18 == 3) {
                return f16097xacdfd1ce;
            }
            if (i18 == 4) {
                return f16096x18ceca0a;
            }
        } else {
            int i19 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.AnonymousClass1.f16101xa6b5d03e[this.f16100x368f3a.ordinal()];
            if (i19 == 1) {
                return f16096x18ceca0a;
            }
            if (i19 == 2) {
                return f16094x2a998d44;
            }
            if (i19 == 3) {
                return f16096x18ceca0a;
            }
            if (i19 == 4) {
                return f16097xacdfd1ce;
            }
        }
        return f16094x2a998d44;
    }

    /* renamed from: smallThan */
    public boolean m33986x9f3f7b48(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a) {
        return m33972x38a73ce5(c4128x879fba0a) < 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1 != 4) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a sub(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a r7) {
        /*
            r6 = this;
            int[] r0 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.AnonymousClass1.f16101xa6b5d03e
            com.tencent.maas.model.time.MJTime$MJTimeType r1 = r6.f16100x368f3a
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == r5) goto L46
            if (r1 == r4) goto L56
            if (r1 == r3) goto L17
            if (r1 == r2) goto L27
            goto L37
        L17:
            com.tencent.maas.model.time.MJTime$MJTimeType r1 = r7.f16100x368f3a
            int r1 = r1.ordinal()
            r1 = r0[r1]
            if (r1 == r5) goto L43
            if (r1 == r4) goto L40
            if (r1 == r3) goto L40
            if (r1 == r2) goto L40
        L27:
            com.tencent.maas.model.time.MJTime$MJTimeType r7 = r7.f16100x368f3a
            int r7 = r7.ordinal()
            r7 = r0[r7]
            if (r7 == r5) goto L3d
            if (r7 == r4) goto L3a
            if (r7 == r3) goto L3a
            if (r7 == r2) goto L3a
        L37:
            com.tencent.maas.model.time.MJTime r7 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44
            return r7
        L3a:
            com.tencent.maas.model.time.MJTime r7 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44
            return r7
        L3d:
            com.tencent.maas.model.time.MJTime r7 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16096x18ceca0a
            return r7
        L40:
            com.tencent.maas.model.time.MJTime r7 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44
            return r7
        L43:
            com.tencent.maas.model.time.MJTime r7 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16097xacdfd1ce
            return r7
        L46:
            com.tencent.maas.model.time.MJTime$MJTimeType r1 = r7.f16100x368f3a
            int r1 = r1.ordinal()
            r0 = r0[r1]
            if (r0 == r5) goto L62
            if (r0 == r4) goto L5f
            if (r0 == r3) goto L5c
            if (r0 == r2) goto L59
        L56:
            com.tencent.maas.model.time.MJTime r7 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44
            return r7
        L59:
            com.tencent.maas.model.time.MJTime r7 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16097xacdfd1ce
            return r7
        L5c:
            com.tencent.maas.model.time.MJTime r7 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16096x18ceca0a
            return r7
        L5f:
            com.tencent.maas.model.time.MJTime r7 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44
            return r7
        L62:
            com.tencent.maas.model.time.MJTime r0 = new com.tencent.maas.model.time.MJTime
            long r1 = r6.f16099xb43175c8
            long r3 = r7.f16099xb43175c8
            long r1 = r1 - r3
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.sub(com.tencent.maas.model.time.MJTime):com.tencent.maas.model.time.MJTime");
    }

    /* renamed from: toMilliseconds */
    public double m33987xd22e7c2d() {
        int i17 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.AnonymousClass1.f16101xa6b5d03e[this.f16100x368f3a.ordinal()];
        if (i17 == 1) {
            long j17 = this.f16099xb43175c8;
            return (j17 / 1411200) + ((j17 % 1411200) / 1411200.0d);
        }
        if (i17 != 3) {
            return i17 != 4 ? Double.NaN : Double.NEGATIVE_INFINITY;
        }
        return Double.POSITIVE_INFINITY;
    }

    /* renamed from: toSeconds */
    public double m33988x124aa384() {
        int i17 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.AnonymousClass1.f16101xa6b5d03e[this.f16100x368f3a.ordinal()];
        if (i17 == 1) {
            long j17 = this.f16099xb43175c8;
            return (j17 / 1411200000) + ((j17 % 1411200000) / 1.4112E9d);
        }
        if (i17 != 3) {
            return i17 != 4 ? Double.NaN : Double.NEGATIVE_INFINITY;
        }
        return Double.POSITIVE_INFINITY;
    }

    /* renamed from: toString */
    public java.lang.String m33989x9616526c() {
        return "MJTime{flicks=" + this.f16099xb43175c8 + ", type=" + this.f16100x368f3a.toString() + '}';
    }

    /* renamed from: toUs */
    public long m33990x366679() {
        return (long) (m33988x124aa384() * 1000000.0d);
    }

    public C4128x879fba0a(long j17) {
        this(j17, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.MJTimeType.NUMERIC);
    }

    public C4128x879fba0a(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.MJTimeType mJTimeType) {
        this(0L, mJTimeType);
    }

    public C4128x879fba0a(long j17, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.MJTimeType mJTimeType) {
        this.f16099xb43175c8 = j17;
        this.f16100x368f3a = mJTimeType;
    }

    /* renamed from: divide */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33974xb0a37c79(long j17) {
        if (j17 == 0) {
            return f16094x2a998d44;
        }
        int i17 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.AnonymousClass1.f16101xa6b5d03e[this.f16100x368f3a.ordinal()];
        if (i17 == 1) {
            return new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a(this.f16099xb43175c8 / j17);
        }
        if (i17 == 2) {
            return f16094x2a998d44;
        }
        if (i17 == 3) {
            if (j17 > 0) {
                return f16097xacdfd1ce;
            }
            return f16096x18ceca0a;
        }
        if (i17 != 4) {
            return f16094x2a998d44;
        }
        if (j17 > 0) {
            return f16096x18ceca0a;
        }
        return f16097xacdfd1ce;
    }

    /* renamed from: multi */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33985x636d539(long j17) {
        int i17 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.AnonymousClass1.f16101xa6b5d03e[this.f16100x368f3a.ordinal()];
        if (i17 == 1) {
            return new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a(this.f16099xb43175c8 * j17);
        }
        if (i17 == 2) {
            return f16094x2a998d44;
        }
        if (i17 == 3) {
            if (j17 > 0) {
                return f16097xacdfd1ce;
            }
            if (j17 == 0) {
                return f16094x2a998d44;
            }
            return f16096x18ceca0a;
        }
        if (i17 != 4) {
            return f16094x2a998d44;
        }
        if (j17 > 0) {
            return f16096x18ceca0a;
        }
        if (j17 == 0) {
            return f16094x2a998d44;
        }
        return f16097xacdfd1ce;
    }
}
