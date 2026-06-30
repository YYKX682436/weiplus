package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public enum ef {
    None("", 0),
    Gradient("heat", 2),
    Aggregation("honey", 3),
    ArcLine("arcline", 4),
    GLModel("model", 5),
    Trail("trail", 6),
    Scatter("scatter", 7);


    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f49245h;

    /* renamed from: i, reason: collision with root package name */
    private final int f49246i;

    ef(java.lang.String str, int i17) {
        this.f49245h = str;
        this.f49246i = i17;
    }

    public static com.tencent.mapsdk.internal.ef a(int i17) {
        for (com.tencent.mapsdk.internal.ef efVar : values()) {
            if (efVar.f49246i == i17) {
                return efVar;
            }
        }
        return None;
    }

    private static com.tencent.mapsdk.internal.ef b(java.lang.String str) {
        for (com.tencent.mapsdk.internal.ef efVar : values()) {
            if (efVar.a(str)) {
                return efVar;
            }
        }
        return None;
    }

    private boolean b(int i17) {
        return this.f49246i == i17;
    }

    public final boolean a(java.lang.String str) {
        return this.f49245h.equals(str);
    }

    private java.lang.String a() {
        return this.f49245h;
    }
}
