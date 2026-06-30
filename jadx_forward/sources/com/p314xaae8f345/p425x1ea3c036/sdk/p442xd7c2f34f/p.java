package com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f;

/* loaded from: classes7.dex */
public enum p {
    LEGACY(0),
    PRE_RENDER(1),
    HEADLESS(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f129157d;

    p(int i17) {
        this.f129157d = i17;
    }

    public static com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.p i(android.os.Parcel parcel) {
        int readInt = parcel.readInt();
        for (com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.p pVar : m32218xcee59d22()) {
            if (readInt == pVar.ordinal()) {
                return pVar;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WxaColdStartMode", "readFromParcel get unrecognized ordinal %d", java.lang.Integer.valueOf(readInt));
        return LEGACY;
    }

    public void a(r45.y50 y50Var) {
        y50Var.f472331e = false;
        y50Var.f472333g = 0;
        if (PRE_RENDER == this) {
            y50Var.f472331e = true;
        } else if (HEADLESS == this) {
            y50Var.f472333g = 1;
        }
    }

    public boolean h() {
        return this == PRE_RENDER || this == HEADLESS;
    }
}
