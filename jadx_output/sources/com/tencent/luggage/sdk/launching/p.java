package com.tencent.luggage.sdk.launching;

/* loaded from: classes7.dex */
public enum p {
    LEGACY(0),
    PRE_RENDER(1),
    HEADLESS(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f47624d;

    p(int i17) {
        this.f47624d = i17;
    }

    public static com.tencent.luggage.sdk.launching.p i(android.os.Parcel parcel) {
        int readInt = parcel.readInt();
        for (com.tencent.luggage.sdk.launching.p pVar : values()) {
            if (readInt == pVar.ordinal()) {
                return pVar;
            }
        }
        com.tencent.mars.xlog.Log.e("Luggage.WxaColdStartMode", "readFromParcel get unrecognized ordinal %d", java.lang.Integer.valueOf(readInt));
        return LEGACY;
    }

    public void a(r45.y50 y50Var) {
        y50Var.f390798e = false;
        y50Var.f390800g = 0;
        if (PRE_RENDER == this) {
            y50Var.f390798e = true;
        } else if (HEADLESS == this) {
            y50Var.f390800g = 1;
        }
    }

    public boolean h() {
        return this == PRE_RENDER || this == HEADLESS;
    }
}
