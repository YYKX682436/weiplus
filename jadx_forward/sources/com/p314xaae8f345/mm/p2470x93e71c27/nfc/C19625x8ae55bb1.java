package com.p314xaae8f345.mm.p2470x93e71c27.nfc;

/* renamed from: com.tencent.mm.pluginsdk.nfc.NfcAID */
/* loaded from: classes5.dex */
public class C19625x8ae55bb1 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p2470x93e71c27.nfc.C19625x8ae55bb1> f38830x681a0c0c = new h35.a();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f271044d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f271045e;

    public C19625x8ae55bb1(android.os.Parcel parcel) {
        this.f271044d = null;
        this.f271045e = null;
        this.f271044d = parcel.readString();
        this.f271045e = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f271044d);
        parcel.writeString(this.f271045e);
    }
}
