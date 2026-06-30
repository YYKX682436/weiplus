package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052;

/* renamed from: com.tencent.mm.plugin.webview.modeltools.NFCIPCHelper$NFCEventTransfer */
/* loaded from: classes8.dex */
class C19294x4afbb13f implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.C19294x4afbb13f> f38733x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.u();

    /* renamed from: d, reason: collision with root package name */
    public final int f264763d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f264764e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f264765f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f264766g;

    /* renamed from: h, reason: collision with root package name */
    public android.os.Bundle f264767h;

    public C19294x4afbb13f(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5159xfddea0d4 c5159xfddea0d4) {
        am.o oVar = c5159xfddea0d4.f135508g;
        this.f264763d = oVar.f89026a;
        this.f264764e = oVar.f89028c;
        this.f264765f = oVar.f89029d;
        this.f264766g = oVar.f89030e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f264763d);
        parcel.writeString(this.f264764e);
        parcel.writeByte(this.f264765f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f264766g ? (byte) 1 : (byte) 0);
        parcel.writeBundle(this.f264767h);
    }

    public C19294x4afbb13f(android.os.Parcel parcel) {
        this.f264763d = parcel.readInt();
        this.f264764e = parcel.readString();
        this.f264765f = parcel.readByte() != 0;
        this.f264766g = parcel.readByte() != 0;
        this.f264767h = parcel.readBundle(getClass().getClassLoader());
    }
}
