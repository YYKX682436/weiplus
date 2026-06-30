package com.tencent.map.lib.models;

/* loaded from: classes13.dex */
public enum DownloadPriority {
    NONE(-1),
    HIGH(0),
    MIDDLE(1),
    LOW(2);

    private final int mValue;

    /* renamed from: com.tencent.map.lib.models.DownloadPriority$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f48674a;

        static {
            int[] iArr = new int[com.tencent.map.lib.models.DownloadPriority.values().length];
            f48674a = iArr;
            try {
                iArr[com.tencent.map.lib.models.DownloadPriority.HIGH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f48674a[com.tencent.map.lib.models.DownloadPriority.LOW.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f48674a[com.tencent.map.lib.models.DownloadPriority.MIDDLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    DownloadPriority(int i17) {
        this.mValue = i17;
    }

    public static com.tencent.map.lib.models.DownloadPriority get(int i17) {
        for (com.tencent.map.lib.models.DownloadPriority downloadPriority : values()) {
            if (downloadPriority.mValue == i17) {
                return downloadPriority;
            }
        }
        return NONE;
    }

    public static int getThreadPriority(int i17) {
        int i18 = com.tencent.map.lib.models.DownloadPriority.AnonymousClass1.f48674a[get(i17).ordinal()];
        if (i18 != 1) {
            return i18 != 2 ? 5 : 1;
        }
        return 10;
    }

    public final int getValue() {
        return this.mValue;
    }
}
