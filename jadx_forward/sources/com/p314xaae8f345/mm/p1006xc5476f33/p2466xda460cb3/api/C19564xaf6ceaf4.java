package com.p314xaae8f345.mm.p1006xc5476f33.p2466xda460cb3.api;

/* renamed from: com.tencent.mm.plugin.wxpaysdk.api.ResendMsgInfo */
/* loaded from: classes.dex */
public class C19564xaf6ceaf4 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2466xda460cb3.api.C19564xaf6ceaf4> f38800x681a0c0c = new o05.m();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f270123d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f270124e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f270125f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f270126g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f270127h;

    public C19564xaf6ceaf4(android.os.Parcel parcel) {
        this.f270123d = parcel.readString();
        this.f270124e = parcel.readString();
        this.f270125f = parcel.readString();
        this.f270126g = parcel.readString();
        this.f270127h = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m75020x9616526c() {
        return "ResendMsgInfo{title='" + this.f270123d + "', pic='" + this.f270124e + "', description='" + this.f270125f + "', left_button_wording='" + this.f270126g + "', right_button_wording='" + this.f270127h + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f270123d);
        parcel.writeString(this.f270124e);
        parcel.writeString(this.f270125f);
        parcel.writeString(this.f270126g);
        parcel.writeString(this.f270127h);
    }
}
