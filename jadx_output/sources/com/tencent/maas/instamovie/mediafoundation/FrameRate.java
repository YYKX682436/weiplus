package com.tencent.maas.instamovie.mediafoundation;

/* loaded from: classes5.dex */
public class FrameRate {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.maas.instamovie.mediafoundation.FrameRate f48193b = new com.tencent.maas.instamovie.mediafoundation.FrameRate(com.tencent.maas.instamovie.mediafoundation.FrameRate.FrameRateType.FRAMERATE_15);

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.maas.instamovie.mediafoundation.FrameRate f48194c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.maas.instamovie.mediafoundation.FrameRate f48195d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.maas.instamovie.mediafoundation.FrameRate f48196e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.maas.instamovie.mediafoundation.FrameRate f48197f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.maas.instamovie.mediafoundation.FrameRate f48198g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.maas.instamovie.mediafoundation.FrameRate f48199h;

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.instamovie.mediafoundation.FrameRate.FrameRateType f48200a;

    /* loaded from: classes5.dex */
    public enum FrameRateType {
        FRAMERATE_15(0),
        /* JADX INFO: Fake field, exist only in values array */
        FRAMERATE_23_976(1),
        FRMAERATE_24(2),
        FRMAERATE_25(3),
        /* JADX INFO: Fake field, exist only in values array */
        FRAMERATE_29_97(4),
        FRAMERATE_30(5),
        FRAMERATE_48(6),
        FRAMERATE_50(7),
        FRAMERATE_60(8),
        /* JADX INFO: Fake field, exist only in values array */
        FRMAERATE_120(9),
        /* JADX INFO: Fake field, exist only in values array */
        FRAMERATE_240(10);


        /* renamed from: o, reason: collision with root package name */
        public static final java.util.Map f48208o = new java.util.HashMap();

        /* renamed from: d, reason: collision with root package name */
        public final int f48210d;

        static {
            for (com.tencent.maas.instamovie.mediafoundation.FrameRate.FrameRateType frameRateType : values()) {
                ((java.util.HashMap) f48208o).put(java.lang.Integer.valueOf(frameRateType.f48210d), frameRateType);
            }
        }

        FrameRateType(int i17) {
            this.f48210d = i17;
        }

        public int getTypeId() {
            return this.f48210d;
        }
    }

    static {
        com.tencent.maas.instamovie.mediafoundation.FrameRate.FrameRateType frameRateType = com.tencent.maas.instamovie.mediafoundation.FrameRate.FrameRateType.FRAMERATE_15;
        f48194c = new com.tencent.maas.instamovie.mediafoundation.FrameRate(com.tencent.maas.instamovie.mediafoundation.FrameRate.FrameRateType.FRMAERATE_24);
        f48195d = new com.tencent.maas.instamovie.mediafoundation.FrameRate(com.tencent.maas.instamovie.mediafoundation.FrameRate.FrameRateType.FRMAERATE_25);
        com.tencent.maas.instamovie.mediafoundation.FrameRate.FrameRateType frameRateType2 = com.tencent.maas.instamovie.mediafoundation.FrameRate.FrameRateType.FRAMERATE_15;
        f48196e = new com.tencent.maas.instamovie.mediafoundation.FrameRate(com.tencent.maas.instamovie.mediafoundation.FrameRate.FrameRateType.FRAMERATE_30);
        f48197f = new com.tencent.maas.instamovie.mediafoundation.FrameRate(com.tencent.maas.instamovie.mediafoundation.FrameRate.FrameRateType.FRAMERATE_48);
        f48198g = new com.tencent.maas.instamovie.mediafoundation.FrameRate(com.tencent.maas.instamovie.mediafoundation.FrameRate.FrameRateType.FRAMERATE_50);
        f48199h = new com.tencent.maas.instamovie.mediafoundation.FrameRate(com.tencent.maas.instamovie.mediafoundation.FrameRate.FrameRateType.FRAMERATE_60);
        com.tencent.maas.instamovie.mediafoundation.FrameRate.FrameRateType frameRateType3 = com.tencent.maas.instamovie.mediafoundation.FrameRate.FrameRateType.FRAMERATE_15;
        com.tencent.maas.instamovie.mediafoundation.FrameRate.FrameRateType frameRateType4 = com.tencent.maas.instamovie.mediafoundation.FrameRate.FrameRateType.FRAMERATE_15;
    }

    public FrameRate(com.tencent.maas.instamovie.mediafoundation.FrameRate.FrameRateType frameRateType) {
        this.f48200a = frameRateType;
    }

    private float getNumericValue() {
        return Float.NaN;
    }

    private int getTypeId() {
        return this.f48200a.getTypeId();
    }

    public com.tencent.maas.instamovie.mediafoundation.FrameRate.FrameRateType getType() {
        return this.f48200a;
    }
}
