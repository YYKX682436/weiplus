package com.tencent.liteav.base.util;

/* loaded from: classes14.dex */
public enum k {
    NORMAL(0),
    ROTATION_90(90),
    ROTATION_180(180),
    ROTATION_270(270);


    /* renamed from: e, reason: collision with root package name */
    private static final com.tencent.liteav.base.util.k[] f46446e = values();
    public final int mValue;

    k(int i17) {
        this.mValue = i17;
    }

    public static com.tencent.liteav.base.util.k a(int i17) {
        for (com.tencent.liteav.base.util.k kVar : f46446e) {
            if (kVar.mValue == i17) {
                return kVar;
            }
        }
        return NORMAL;
    }

    public static boolean b(int i17) {
        return i17 == 0 || i17 == 90 || i17 == 180 || i17 == 270;
    }

    public static int a(com.tencent.liteav.base.util.k kVar) {
        if (kVar != null) {
            return kVar.mValue;
        }
        return NORMAL.mValue;
    }
}
