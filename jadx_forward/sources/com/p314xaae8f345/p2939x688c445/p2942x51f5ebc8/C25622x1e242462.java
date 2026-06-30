package com.p314xaae8f345.p2939x688c445.p2942x51f5ebc8;

/* renamed from: com.tencent.soter.soterserver.SoterExtraParam */
/* loaded from: classes11.dex */
public class C25622x1e242462 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p2939x688c445.p2942x51f5ebc8.C25622x1e242462> f47019x681a0c0c = new bu5.f();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f296861d;

    public C25622x1e242462(android.os.Parcel parcel) {
        this.f296861d = parcel.readValue(getClass().getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeValue(this.f296861d);
    }
}
