package com.p314xaae8f345.mm.ui.p2722x33325c.sdk;

/* renamed from: com.tencent.mm.ui.mmfb.sdk.CustomTabLoginMethodHandler */
/* loaded from: classes13.dex */
public class C22454x642d6fa4 extends com.p314xaae8f345.mm.ui.p2722x33325c.sdk.AbstractC22457x4b1c0c94 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.ui.p2722x33325c.sdk.C22454x642d6fa4> f39603x681a0c0c = new com.p314xaae8f345.mm.ui.p2722x33325c.sdk.e();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f290697f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f290698g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f290699h;

    public C22454x642d6fa4(com.p314xaae8f345.mm.ui.p2722x33325c.sdk.C22455x96068474 c22455x96068474) {
        super(c22455x96068474);
        this.f290699h = "";
        this.f290698g = new java.math.BigInteger(100, new java.util.Random()).toString(32);
        this.f290699h = "fb290293790992170://authorize";
    }

    public static java.util.Map b(android.os.Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int i17 = 0; i17 < readInt; i17++) {
            hashMap.put(parcel.readString(), parcel.readString());
        }
        return hashMap;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.ui.p2722x33325c.sdk.AbstractC22456xe50d9e60, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeString(this.f290698g);
    }

    public C22454x642d6fa4(android.os.Parcel parcel) {
        super(parcel);
        this.f290699h = "";
        this.f290698g = parcel.readString();
    }
}
