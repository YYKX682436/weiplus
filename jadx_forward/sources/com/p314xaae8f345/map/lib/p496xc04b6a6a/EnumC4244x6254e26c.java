package com.p314xaae8f345.map.lib.p496xc04b6a6a;

/* renamed from: com.tencent.map.lib.models.DownloadPriority */
/* loaded from: classes13.dex */
public enum EnumC4244x6254e26c {
    NONE(-1),
    HIGH(0),
    MIDDLE(1),
    LOW(2);


    /* renamed from: mValue */
    private final int f16439xbee9dd04;

    /* renamed from: com.tencent.map.lib.models.DownloadPriority$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f130207a;

        static {
            int[] iArr = new int[com.p314xaae8f345.map.lib.p496xc04b6a6a.EnumC4244x6254e26c.m35288xcee59d22().length];
            f130207a = iArr;
            try {
                iArr[com.p314xaae8f345.map.lib.p496xc04b6a6a.EnumC4244x6254e26c.HIGH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f130207a[com.p314xaae8f345.map.lib.p496xc04b6a6a.EnumC4244x6254e26c.LOW.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f130207a[com.p314xaae8f345.map.lib.p496xc04b6a6a.EnumC4244x6254e26c.MIDDLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    EnumC4244x6254e26c(int i17) {
        this.f16439xbee9dd04 = i17;
    }

    public static com.p314xaae8f345.map.lib.p496xc04b6a6a.EnumC4244x6254e26c get(int i17) {
        for (com.p314xaae8f345.map.lib.p496xc04b6a6a.EnumC4244x6254e26c enumC4244x6254e26c : m35288xcee59d22()) {
            if (enumC4244x6254e26c.f16439xbee9dd04 == i17) {
                return enumC4244x6254e26c;
            }
        }
        return NONE;
    }

    /* renamed from: getThreadPriority */
    public static int m35286x909a0ec4(int i17) {
        int i18 = com.p314xaae8f345.map.lib.p496xc04b6a6a.EnumC4244x6254e26c.AnonymousClass1.f130207a[get(i17).ordinal()];
        if (i18 != 1) {
            return i18 != 2 ? 5 : 1;
        }
        return 10;
    }

    /* renamed from: getValue */
    public final int m35289x754a37bb() {
        return this.f16439xbee9dd04;
    }
}
