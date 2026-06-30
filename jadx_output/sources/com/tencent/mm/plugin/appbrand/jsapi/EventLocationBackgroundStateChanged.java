package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class EventLocationBackgroundStateChanged implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.EventLocationBackgroundStateChanged> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.o1();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f78487d;

    public EventLocationBackgroundStateChanged(boolean z17) {
        this.f78487d = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeByte(this.f78487d ? (byte) 1 : (byte) 0);
    }

    public EventLocationBackgroundStateChanged(android.os.Parcel parcel) {
        this.f78487d = parcel.readByte() != 0;
    }
}
