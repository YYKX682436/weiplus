package com.tencent.mm.api;

/* loaded from: classes4.dex */
public class QueryImageData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.api.QueryImageData> CREATOR = new qk.q9();

    /* renamed from: d, reason: collision with root package name */
    public final long f53203d;

    /* renamed from: e, reason: collision with root package name */
    public final long f53204e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f53205f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f53206g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f53207h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f53208i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f53209m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f53210n;

    public QueryImageData(android.os.Parcel parcel) {
        this.f53207h = "";
        this.f53208i = "";
        this.f53209m = "";
        this.f53210n = "";
        this.f53203d = parcel.readLong();
        this.f53204e = parcel.readLong();
        this.f53205f = parcel.readString();
        this.f53206g = parcel.readString();
        this.f53207h = parcel.readString();
        this.f53208i = parcel.readString();
        this.f53209m = parcel.readString();
        this.f53210n = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f53203d);
        parcel.writeLong(this.f53204e);
        parcel.writeString(this.f53205f);
        parcel.writeString(this.f53206g);
        parcel.writeString(this.f53207h);
        parcel.writeString(this.f53208i);
        parcel.writeString(this.f53209m);
        parcel.writeString(this.f53210n);
    }

    public QueryImageData(long j17, long j18, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f53207h = "";
        this.f53208i = "";
        this.f53209m = "";
        this.f53210n = "";
        this.f53203d = j18;
        this.f53204e = j17;
        this.f53205f = str2;
        this.f53206g = str3;
        this.f53210n = str;
    }

    public QueryImageData(long j17, long j18, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        this.f53210n = "";
        this.f53203d = j18;
        this.f53204e = j17;
        this.f53205f = str2;
        this.f53206g = str3;
        this.f53207h = str4;
        this.f53208i = str5;
        this.f53209m = str6;
        this.f53210n = str;
    }
}
