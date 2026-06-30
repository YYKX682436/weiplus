package com.tencent.mm.plugin.appbrand.jsapi.profile;

/* loaded from: classes7.dex */
public final class z implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.plugin.appbrand.jsapi.profile.b0 b0Var;
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.mm.plugin.appbrand.jsapi.profile.a0 a0Var = com.tencent.mm.plugin.appbrand.jsapi.profile.b0.f82774e;
        int readInt = parcel.readInt();
        a0Var.getClass();
        com.tencent.mm.plugin.appbrand.jsapi.profile.b0[] values = com.tencent.mm.plugin.appbrand.jsapi.profile.b0.values();
        int length = values.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                b0Var = null;
                break;
            }
            b0Var = values[i17];
            if (readInt == b0Var.f82780d) {
                break;
            }
            i17++;
        }
        if (b0Var == null) {
            b0Var = com.tencent.mm.plugin.appbrand.jsapi.profile.b0.f82777h;
        }
        return new com.tencent.mm.plugin.appbrand.jsapi.profile.JumpToProfileResult(b0Var, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.profile.JumpToProfileResult[i17];
    }
}
