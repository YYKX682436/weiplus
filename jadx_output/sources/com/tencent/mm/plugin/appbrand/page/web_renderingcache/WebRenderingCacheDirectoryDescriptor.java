package com.tencent.mm.plugin.appbrand.page.web_renderingcache;

/* loaded from: classes7.dex */
public class WebRenderingCacheDirectoryDescriptor implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.page.web_renderingcache.WebRenderingCacheDirectoryDescriptor> CREATOR = new ri1.h();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f87233d;

    public WebRenderingCacheDirectoryDescriptor(android.os.Parcel parcel) {
        this.f87233d = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f87233d);
    }
}
