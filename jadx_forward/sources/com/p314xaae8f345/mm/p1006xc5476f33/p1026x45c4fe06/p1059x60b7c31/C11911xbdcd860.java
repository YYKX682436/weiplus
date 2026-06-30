package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.EventLocationBackgroundStateChanged */
/* loaded from: classes7.dex */
public class C11911xbdcd860 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11911xbdcd860> f33646x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.o1();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f160020d;

    public C11911xbdcd860(boolean z17) {
        this.f160020d = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeByte(this.f160020d ? (byte) 1 : (byte) 0);
    }

    public C11911xbdcd860(android.os.Parcel parcel) {
        this.f160020d = parcel.readByte() != 0;
    }
}
