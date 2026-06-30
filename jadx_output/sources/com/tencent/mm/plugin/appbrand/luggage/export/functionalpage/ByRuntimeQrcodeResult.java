package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage;

/* loaded from: classes7.dex */
public class ByRuntimeQrcodeResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.ByRuntimeQrcodeResult> CREATOR = new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.a();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f85553d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f85554e;

    public ByRuntimeQrcodeResult(java.lang.String str, java.lang.String str2) {
        this.f85553d = str;
        this.f85554e = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f85553d);
        parcel.writeString(this.f85554e);
    }

    public ByRuntimeQrcodeResult(android.os.Parcel parcel) {
        this.f85553d = parcel.readString();
        this.f85554e = parcel.readString();
    }
}
