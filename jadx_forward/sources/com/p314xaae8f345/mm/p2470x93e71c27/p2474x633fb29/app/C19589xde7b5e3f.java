package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* renamed from: com.tencent.mm.pluginsdk.model.app.ReportUtil$ReportArgs */
/* loaded from: classes9.dex */
public class C19589xde7b5e3f implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.C19589xde7b5e3f> f38828x681a0c0c = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.l5();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f270318d;

    /* renamed from: e, reason: collision with root package name */
    public int f270319e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f270320f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f270321g;

    /* renamed from: h, reason: collision with root package name */
    public int f270322h;

    public C19589xde7b5e3f(android.os.Parcel parcel, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k5 k5Var) {
        this.f270318d = parcel.readString();
        this.f270319e = parcel.readInt();
        this.f270320f = parcel.readString();
        this.f270321g = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f270318d);
        parcel.writeInt(this.f270319e);
        parcel.writeString(this.f270320f);
        parcel.writeString(this.f270321g);
    }
}
