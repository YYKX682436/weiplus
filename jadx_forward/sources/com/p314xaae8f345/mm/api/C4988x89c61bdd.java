package com.p314xaae8f345.mm.api;

/* renamed from: com.tencent.mm.api.QueryImageData */
/* loaded from: classes4.dex */
public class C4988x89c61bdd implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.api.C4988x89c61bdd> f21398x681a0c0c = new qk.q9();

    /* renamed from: d, reason: collision with root package name */
    public final long f134736d;

    /* renamed from: e, reason: collision with root package name */
    public final long f134737e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f134738f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f134739g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f134740h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f134741i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f134742m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f134743n;

    public C4988x89c61bdd(android.os.Parcel parcel) {
        this.f134740h = "";
        this.f134741i = "";
        this.f134742m = "";
        this.f134743n = "";
        this.f134736d = parcel.readLong();
        this.f134737e = parcel.readLong();
        this.f134738f = parcel.readString();
        this.f134739g = parcel.readString();
        this.f134740h = parcel.readString();
        this.f134741i = parcel.readString();
        this.f134742m = parcel.readString();
        this.f134743n = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f134736d);
        parcel.writeLong(this.f134737e);
        parcel.writeString(this.f134738f);
        parcel.writeString(this.f134739g);
        parcel.writeString(this.f134740h);
        parcel.writeString(this.f134741i);
        parcel.writeString(this.f134742m);
        parcel.writeString(this.f134743n);
    }

    public C4988x89c61bdd(long j17, long j18, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f134740h = "";
        this.f134741i = "";
        this.f134742m = "";
        this.f134743n = "";
        this.f134736d = j18;
        this.f134737e = j17;
        this.f134738f = str2;
        this.f134739g = str3;
        this.f134743n = str;
    }

    public C4988x89c61bdd(long j17, long j18, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        this.f134743n = "";
        this.f134736d = j18;
        this.f134737e = j17;
        this.f134738f = str2;
        this.f134739g = str3;
        this.f134740h = str4;
        this.f134741i = str5;
        this.f134742m = str6;
        this.f134743n = str;
    }
}
