package com.p314xaae8f345.mm.ui.p2722x33325c.sdk;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.ui.mmfb.sdk.LoginMethodHandler */
/* loaded from: classes13.dex */
public abstract class AbstractC22456xe50d9e60 implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public java.util.Map f290721d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2722x33325c.sdk.C22455x96068474 f290722e;

    public AbstractC22456xe50d9e60(com.p314xaae8f345.mm.ui.p2722x33325c.sdk.C22455x96068474 c22455x96068474) {
        this.f290722e = c22455x96068474;
    }

    public static void a(android.os.Parcel parcel, java.util.Map map) {
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (java.util.Map.Entry entry : map.entrySet()) {
            parcel.writeString((java.lang.String) entry.getKey());
            parcel.writeString((java.lang.String) entry.getValue());
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        a(parcel, this.f290721d);
    }

    public AbstractC22456xe50d9e60(android.os.Parcel parcel) {
        java.util.HashMap hashMap;
        int readInt = parcel.readInt();
        if (readInt < 0) {
            hashMap = null;
        } else {
            java.util.HashMap hashMap2 = new java.util.HashMap();
            for (int i17 = 0; i17 < readInt; i17++) {
                hashMap2.put(parcel.readString(), parcel.readString());
            }
            hashMap = hashMap2;
        }
        this.f290721d = hashMap;
    }
}
