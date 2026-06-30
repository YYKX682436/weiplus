package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.lbs;

/* renamed from: com.tencent.mm.pluginsdk.model.lbs.Location */
/* loaded from: classes15.dex */
public class C19621x752a03d5 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.lbs.C19621x752a03d5> f38829x681a0c0c = new f35.a();

    /* renamed from: d, reason: collision with root package name */
    public float f270899d;

    /* renamed from: e, reason: collision with root package name */
    public float f270900e;

    /* renamed from: f, reason: collision with root package name */
    public int f270901f;

    /* renamed from: g, reason: collision with root package name */
    public int f270902g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f270903h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f270904i;

    public C19621x752a03d5(float f17, float f18, int i17, int i18, java.lang.String str, java.lang.String str2) {
        this.f270899d = f17;
        this.f270900e = f18;
        this.f270901f = i17;
        this.f270902g = i18;
        this.f270903h = str;
        this.f270904i = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeFloat(this.f270899d);
        parcel.writeFloat(this.f270900e);
        parcel.writeInt(this.f270901f);
        parcel.writeInt(this.f270902g);
        parcel.writeString(this.f270903h);
        parcel.writeString(this.f270904i);
    }
}
