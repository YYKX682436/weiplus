package com.tencent.maas.model.time;

/* loaded from: classes5.dex */
public class MJTime implements java.lang.Cloneable {
    private static final int FlicksPerMillisecond = 1411200;
    public static final int FlicksPerSecond = 1411200000;
    private final long flicks;
    private final com.tencent.maas.model.time.MJTime.MJTimeType type;
    public static final com.tencent.maas.model.time.MJTime ZeroTime = new com.tencent.maas.model.time.MJTime(0);
    public static final com.tencent.maas.model.time.MJTime InvalidTime = new com.tencent.maas.model.time.MJTime();
    public static final com.tencent.maas.model.time.MJTime PositiveInfinityTime = new com.tencent.maas.model.time.MJTime(com.tencent.maas.model.time.MJTime.MJTimeType.POSITIVEINFINITY);
    public static final com.tencent.maas.model.time.MJTime NegativeInfinityTime = new com.tencent.maas.model.time.MJTime(com.tencent.maas.model.time.MJTime.MJTimeType.NEGATIVEINFINITY);
    private static final int[][] LUTOfCompareResultsByType = {new int[]{2, -1, -1, 1}, new int[]{1, 0, 1, 1}, new int[]{1, -1, 0, 1}, new int[]{-1, -1, -1, 0}};

    /* renamed from: com.tencent.maas.model.time.MJTime$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$maas$model$time$MJTime$MJTimeType;

        static {
            int[] iArr = new int[com.tencent.maas.model.time.MJTime.MJTimeType.values().length];
            $SwitchMap$com$tencent$maas$model$time$MJTime$MJTimeType = iArr;
            try {
                iArr[com.tencent.maas.model.time.MJTime.MJTimeType.NUMERIC.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$maas$model$time$MJTime$MJTimeType[com.tencent.maas.model.time.MJTime.MJTimeType.INVALID.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$maas$model$time$MJTime$MJTimeType[com.tencent.maas.model.time.MJTime.MJTimeType.POSITIVEINFINITY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$tencent$maas$model$time$MJTime$MJTimeType[com.tencent.maas.model.time.MJTime.MJTimeType.NEGATIVEINFINITY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes5.dex */
    public enum MJTimeType {
        NUMERIC(0),
        INVALID(1),
        POSITIVEINFINITY(2),
        NEGATIVEINFINITY(3);

        private final int value;

        MJTimeType(int i17) {
            this.value = i17;
        }

        public int getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public java.lang.String toString() {
            int i17 = this.value;
            return "MJTimeType{value=" + (i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? com.eclipsesource.mmv8.Platform.UNKNOWN : "NEGATIVEINFINITY" : "POSITIVEINFINITY" : "INVALID" : "NUMERIC") + '}';
        }
    }

    public MJTime() {
        this(0L, com.tencent.maas.model.time.MJTime.MJTimeType.INVALID);
    }

    public static com.tencent.maas.model.time.MJTime fromMicroseconds(long j17) {
        return fromTimeValueAndScale(j17, 1000000);
    }

    public static com.tencent.maas.model.time.MJTime fromMilliseconds(long j17) {
        return fromTimeValueAndScale(j17, 1000);
    }

    public static com.tencent.maas.model.time.MJTime fromNanoseconds(long j17) {
        return fromTimeValueAndScale(j17, 1000000000);
    }

    public static com.tencent.maas.model.time.MJTime fromSeconds(double d17) {
        return java.lang.Double.valueOf(d17).isNaN() ? InvalidTime : !java.lang.Double.valueOf(d17).isInfinite() ? new com.tencent.maas.model.time.MJTime(java.lang.Math.round(d17 * 1.4112E9d)) : d17 > 0.0d ? PositiveInfinityTime : NegativeInfinityTime;
    }

    public static com.tencent.maas.model.time.MJTime fromTimeValueAndScale(long j17, int i17) {
        long j18 = i17;
        long j19 = j17 / j18;
        long j27 = (j17 % j18) * 1411200000;
        long j28 = j27 / j18;
        if ((j27 % j18) * 2 >= j18) {
            j28++;
        }
        return new com.tencent.maas.model.time.MJTime((j19 * 1411200000) + j28);
    }

    public static com.tencent.maas.model.time.MJTime max(com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTime mJTime2) {
        return mJTime.bigThan(mJTime2) ? mJTime : mJTime2;
    }

    public static com.tencent.maas.model.time.MJTime min(com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTime mJTime2) {
        return mJTime.smallThan(mJTime2) ? mJTime : mJTime2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if (r7 != 4) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        return com.tencent.maas.model.time.MJTime.InvalidTime;
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
    public com.tencent.maas.model.time.MJTime add(com.tencent.maas.model.time.MJTime r7) {
        /*
            r6 = this;
            int[] r0 = com.tencent.maas.model.time.MJTime.AnonymousClass1.$SwitchMap$com$tencent$maas$model$time$MJTime$MJTimeType
            com.tencent.maas.model.time.MJTime$MJTimeType r1 = r6.type
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
            com.tencent.maas.model.time.MJTime$MJTimeType r1 = r7.type
            int r1 = r1.ordinal()
            r1 = r0[r1]
            if (r1 == r5) goto L43
            if (r1 == r4) goto L40
            if (r1 == r3) goto L43
            if (r1 == r2) goto L40
        L27:
            com.tencent.maas.model.time.MJTime$MJTimeType r7 = r7.type
            int r7 = r7.ordinal()
            r7 = r0[r7]
            if (r7 == r5) goto L3d
            if (r7 == r4) goto L3a
            if (r7 == r3) goto L3a
            if (r7 == r2) goto L3d
        L37:
            com.tencent.maas.model.time.MJTime r7 = com.tencent.maas.model.time.MJTime.InvalidTime
            return r7
        L3a:
            com.tencent.maas.model.time.MJTime r7 = com.tencent.maas.model.time.MJTime.InvalidTime
            return r7
        L3d:
            com.tencent.maas.model.time.MJTime r7 = com.tencent.maas.model.time.MJTime.NegativeInfinityTime
            return r7
        L40:
            com.tencent.maas.model.time.MJTime r7 = com.tencent.maas.model.time.MJTime.InvalidTime
            return r7
        L43:
            com.tencent.maas.model.time.MJTime r7 = com.tencent.maas.model.time.MJTime.PositiveInfinityTime
            return r7
        L46:
            com.tencent.maas.model.time.MJTime$MJTimeType r1 = r7.type
            int r1 = r1.ordinal()
            r0 = r0[r1]
            if (r0 == r5) goto L62
            if (r0 == r4) goto L5f
            if (r0 == r3) goto L5c
            if (r0 == r2) goto L59
        L56:
            com.tencent.maas.model.time.MJTime r7 = com.tencent.maas.model.time.MJTime.InvalidTime
            return r7
        L59:
            com.tencent.maas.model.time.MJTime r7 = com.tencent.maas.model.time.MJTime.NegativeInfinityTime
            return r7
        L5c:
            com.tencent.maas.model.time.MJTime r7 = com.tencent.maas.model.time.MJTime.PositiveInfinityTime
            return r7
        L5f:
            com.tencent.maas.model.time.MJTime r7 = com.tencent.maas.model.time.MJTime.InvalidTime
            return r7
        L62:
            com.tencent.maas.model.time.MJTime r0 = new com.tencent.maas.model.time.MJTime
            long r1 = r6.flicks
            long r3 = r7.flicks
            long r1 = r1 + r3
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.model.time.MJTime.add(com.tencent.maas.model.time.MJTime):com.tencent.maas.model.time.MJTime");
    }

    public boolean bigThan(com.tencent.maas.model.time.MJTime mJTime) {
        return compare(mJTime) > 0;
    }

    public int compare(com.tencent.maas.model.time.MJTime mJTime) {
        int i17 = LUTOfCompareResultsByType[this.type.getValue()][mJTime.type.getValue()];
        return i17 == 2 ? java.lang.Long.compare(this.flicks, mJTime.flicks) : i17;
    }

    public com.tencent.maas.model.time.MJTime divide(double d17) {
        if (java.lang.Double.isNaN(d17)) {
            return InvalidTime;
        }
        if (java.lang.Double.isFinite(d17)) {
            if (d17 == 0.0d) {
                return InvalidTime;
            }
            int i17 = com.tencent.maas.model.time.MJTime.AnonymousClass1.$SwitchMap$com$tencent$maas$model$time$MJTime$MJTimeType[this.type.ordinal()];
            if (i17 == 1) {
                return new com.tencent.maas.model.time.MJTime(java.lang.Math.round(this.flicks / d17));
            }
            if (i17 == 2) {
                return InvalidTime;
            }
            if (i17 == 3) {
                if (d17 > 0.0d) {
                    return PositiveInfinityTime;
                }
                return NegativeInfinityTime;
            }
            if (i17 == 4) {
                if (d17 > 0.0d) {
                    return NegativeInfinityTime;
                }
                return PositiveInfinityTime;
            }
        }
        int i18 = com.tencent.maas.model.time.MJTime.AnonymousClass1.$SwitchMap$com$tencent$maas$model$time$MJTime$MJTimeType[this.type.ordinal()];
        if (i18 == 1) {
            return ZeroTime;
        }
        if (i18 == 2) {
            return InvalidTime;
        }
        if (i18 == 3) {
            return InvalidTime;
        }
        if (i18 != 4) {
            return InvalidTime;
        }
        return InvalidTime;
    }

    public boolean equalsTo(com.tencent.maas.model.time.MJTime mJTime) {
        return compare(mJTime) == 0;
    }

    public long getFlicks() {
        return this.flicks;
    }

    public com.tencent.maas.model.time.MJTime.MJTimeType getType() {
        return this.type;
    }

    public boolean isNegative() {
        return (isNumeric() && this.flicks < 0) || this.type == com.tencent.maas.model.time.MJTime.MJTimeType.NEGATIVEINFINITY;
    }

    public boolean isNegativeInfinity() {
        return this.type == com.tencent.maas.model.time.MJTime.MJTimeType.NEGATIVEINFINITY;
    }

    public boolean isNumeric() {
        return this.type == com.tencent.maas.model.time.MJTime.MJTimeType.NUMERIC;
    }

    public boolean isPositive() {
        return (isNumeric() && this.flicks > 0) || this.type == com.tencent.maas.model.time.MJTime.MJTimeType.POSITIVEINFINITY;
    }

    public boolean isPositiveInfinity() {
        return this.type == com.tencent.maas.model.time.MJTime.MJTimeType.POSITIVEINFINITY;
    }

    public boolean isValid() {
        return this.type != com.tencent.maas.model.time.MJTime.MJTimeType.INVALID;
    }

    public com.tencent.maas.model.time.MJTime multi(double d17) {
        if (java.lang.Double.isNaN(d17)) {
            return InvalidTime;
        }
        if (java.lang.Double.isFinite(d17)) {
            int i17 = com.tencent.maas.model.time.MJTime.AnonymousClass1.$SwitchMap$com$tencent$maas$model$time$MJTime$MJTimeType[this.type.ordinal()];
            if (i17 == 1) {
                return new com.tencent.maas.model.time.MJTime(java.lang.Math.round(this.flicks * d17));
            }
            if (i17 == 2) {
                return InvalidTime;
            }
            if (i17 == 3) {
                return PositiveInfinityTime;
            }
            if (i17 == 4) {
                return NegativeInfinityTime;
            }
        }
        if (d17 > 0.0d) {
            int i18 = com.tencent.maas.model.time.MJTime.AnonymousClass1.$SwitchMap$com$tencent$maas$model$time$MJTime$MJTimeType[this.type.ordinal()];
            if (i18 == 1) {
                return PositiveInfinityTime;
            }
            if (i18 == 2) {
                return InvalidTime;
            }
            if (i18 == 3) {
                return PositiveInfinityTime;
            }
            if (i18 == 4) {
                return NegativeInfinityTime;
            }
        } else {
            int i19 = com.tencent.maas.model.time.MJTime.AnonymousClass1.$SwitchMap$com$tencent$maas$model$time$MJTime$MJTimeType[this.type.ordinal()];
            if (i19 == 1) {
                return NegativeInfinityTime;
            }
            if (i19 == 2) {
                return InvalidTime;
            }
            if (i19 == 3) {
                return NegativeInfinityTime;
            }
            if (i19 == 4) {
                return PositiveInfinityTime;
            }
        }
        return InvalidTime;
    }

    public boolean smallThan(com.tencent.maas.model.time.MJTime mJTime) {
        return compare(mJTime) < 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1 != 4) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.maas.model.time.MJTime sub(com.tencent.maas.model.time.MJTime r7) {
        /*
            r6 = this;
            int[] r0 = com.tencent.maas.model.time.MJTime.AnonymousClass1.$SwitchMap$com$tencent$maas$model$time$MJTime$MJTimeType
            com.tencent.maas.model.time.MJTime$MJTimeType r1 = r6.type
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
            com.tencent.maas.model.time.MJTime$MJTimeType r1 = r7.type
            int r1 = r1.ordinal()
            r1 = r0[r1]
            if (r1 == r5) goto L43
            if (r1 == r4) goto L40
            if (r1 == r3) goto L40
            if (r1 == r2) goto L40
        L27:
            com.tencent.maas.model.time.MJTime$MJTimeType r7 = r7.type
            int r7 = r7.ordinal()
            r7 = r0[r7]
            if (r7 == r5) goto L3d
            if (r7 == r4) goto L3a
            if (r7 == r3) goto L3a
            if (r7 == r2) goto L3a
        L37:
            com.tencent.maas.model.time.MJTime r7 = com.tencent.maas.model.time.MJTime.InvalidTime
            return r7
        L3a:
            com.tencent.maas.model.time.MJTime r7 = com.tencent.maas.model.time.MJTime.InvalidTime
            return r7
        L3d:
            com.tencent.maas.model.time.MJTime r7 = com.tencent.maas.model.time.MJTime.NegativeInfinityTime
            return r7
        L40:
            com.tencent.maas.model.time.MJTime r7 = com.tencent.maas.model.time.MJTime.InvalidTime
            return r7
        L43:
            com.tencent.maas.model.time.MJTime r7 = com.tencent.maas.model.time.MJTime.PositiveInfinityTime
            return r7
        L46:
            com.tencent.maas.model.time.MJTime$MJTimeType r1 = r7.type
            int r1 = r1.ordinal()
            r0 = r0[r1]
            if (r0 == r5) goto L62
            if (r0 == r4) goto L5f
            if (r0 == r3) goto L5c
            if (r0 == r2) goto L59
        L56:
            com.tencent.maas.model.time.MJTime r7 = com.tencent.maas.model.time.MJTime.InvalidTime
            return r7
        L59:
            com.tencent.maas.model.time.MJTime r7 = com.tencent.maas.model.time.MJTime.PositiveInfinityTime
            return r7
        L5c:
            com.tencent.maas.model.time.MJTime r7 = com.tencent.maas.model.time.MJTime.NegativeInfinityTime
            return r7
        L5f:
            com.tencent.maas.model.time.MJTime r7 = com.tencent.maas.model.time.MJTime.InvalidTime
            return r7
        L62:
            com.tencent.maas.model.time.MJTime r0 = new com.tencent.maas.model.time.MJTime
            long r1 = r6.flicks
            long r3 = r7.flicks
            long r1 = r1 - r3
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.model.time.MJTime.sub(com.tencent.maas.model.time.MJTime):com.tencent.maas.model.time.MJTime");
    }

    public double toMilliseconds() {
        int i17 = com.tencent.maas.model.time.MJTime.AnonymousClass1.$SwitchMap$com$tencent$maas$model$time$MJTime$MJTimeType[this.type.ordinal()];
        if (i17 == 1) {
            long j17 = this.flicks;
            return (j17 / 1411200) + ((j17 % 1411200) / 1411200.0d);
        }
        if (i17 != 3) {
            return i17 != 4 ? Double.NaN : Double.NEGATIVE_INFINITY;
        }
        return Double.POSITIVE_INFINITY;
    }

    public double toSeconds() {
        int i17 = com.tencent.maas.model.time.MJTime.AnonymousClass1.$SwitchMap$com$tencent$maas$model$time$MJTime$MJTimeType[this.type.ordinal()];
        if (i17 == 1) {
            long j17 = this.flicks;
            return (j17 / 1411200000) + ((j17 % 1411200000) / 1.4112E9d);
        }
        if (i17 != 3) {
            return i17 != 4 ? Double.NaN : Double.NEGATIVE_INFINITY;
        }
        return Double.POSITIVE_INFINITY;
    }

    public java.lang.String toString() {
        return "MJTime{flicks=" + this.flicks + ", type=" + this.type.toString() + '}';
    }

    public long toUs() {
        return (long) (toSeconds() * 1000000.0d);
    }

    public MJTime(long j17) {
        this(j17, com.tencent.maas.model.time.MJTime.MJTimeType.NUMERIC);
    }

    public MJTime(com.tencent.maas.model.time.MJTime.MJTimeType mJTimeType) {
        this(0L, mJTimeType);
    }

    public MJTime(long j17, com.tencent.maas.model.time.MJTime.MJTimeType mJTimeType) {
        this.flicks = j17;
        this.type = mJTimeType;
    }

    public com.tencent.maas.model.time.MJTime divide(long j17) {
        if (j17 == 0) {
            return InvalidTime;
        }
        int i17 = com.tencent.maas.model.time.MJTime.AnonymousClass1.$SwitchMap$com$tencent$maas$model$time$MJTime$MJTimeType[this.type.ordinal()];
        if (i17 == 1) {
            return new com.tencent.maas.model.time.MJTime(this.flicks / j17);
        }
        if (i17 == 2) {
            return InvalidTime;
        }
        if (i17 == 3) {
            if (j17 > 0) {
                return PositiveInfinityTime;
            }
            return NegativeInfinityTime;
        }
        if (i17 != 4) {
            return InvalidTime;
        }
        if (j17 > 0) {
            return NegativeInfinityTime;
        }
        return PositiveInfinityTime;
    }

    public com.tencent.maas.model.time.MJTime multi(long j17) {
        int i17 = com.tencent.maas.model.time.MJTime.AnonymousClass1.$SwitchMap$com$tencent$maas$model$time$MJTime$MJTimeType[this.type.ordinal()];
        if (i17 == 1) {
            return new com.tencent.maas.model.time.MJTime(this.flicks * j17);
        }
        if (i17 == 2) {
            return InvalidTime;
        }
        if (i17 == 3) {
            if (j17 > 0) {
                return PositiveInfinityTime;
            }
            if (j17 == 0) {
                return InvalidTime;
            }
            return NegativeInfinityTime;
        }
        if (i17 != 4) {
            return InvalidTime;
        }
        if (j17 > 0) {
            return NegativeInfinityTime;
        }
        if (j17 == 0) {
            return InvalidTime;
        }
        return PositiveInfinityTime;
    }
}
