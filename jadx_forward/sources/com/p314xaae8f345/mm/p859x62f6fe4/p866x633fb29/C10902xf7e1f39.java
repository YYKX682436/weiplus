package com.p314xaae8f345.mm.p859x62f6fe4.p866x633fb29;

/* renamed from: com.tencent.mm.media.model.AppBrandMediaSource */
/* loaded from: classes7.dex */
public class C10902xf7e1f39 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p859x62f6fe4.p866x633fb29.C10902xf7e1f39> f29740x681a0c0c = new ks0.a();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f150465d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f150466e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f150467f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f150468g;

    public C10902xf7e1f39() {
        this.f150465d = "";
        this.f150466e = "";
        this.f150467f = "";
        this.f150468g = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f150465d);
        parcel.writeString(this.f150466e);
        parcel.writeString(this.f150467f);
        parcel.writeString(this.f150468g);
    }

    public C10902xf7e1f39(android.os.Parcel parcel) {
        this.f150465d = "";
        this.f150466e = "";
        this.f150467f = "";
        this.f150468g = "";
        this.f150465d = parcel.readString();
        this.f150466e = parcel.readString();
        this.f150467f = parcel.readString();
        this.f150468g = parcel.readString();
    }
}
