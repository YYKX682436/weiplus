package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.util.SetPwdInfo */
/* loaded from: classes9.dex */
public class C19089x1d7f0ae9 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19089x1d7f0ae9> f38669x681a0c0c = new zs4.r();

    /* renamed from: d, reason: collision with root package name */
    public int f261045d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f261046e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f261047f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f261048g;

    public C19089x1d7f0ae9() {
        this.f261047f = "";
        this.f261048g = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f261045d);
        parcel.writeString(this.f261046e);
        parcel.writeString(this.f261047f);
        parcel.writeString(this.f261048g);
    }

    public C19089x1d7f0ae9(android.os.Parcel parcel) {
        this.f261047f = "";
        this.f261048g = "";
        this.f261045d = parcel.readInt();
        this.f261046e = parcel.readString();
        this.f261047f = parcel.readString();
        this.f261048g = parcel.readString();
    }
}
