package com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.p796x5c6729a;

/* renamed from: com.tencent.mm.ipcinvoker.extension.event.WrapperParcelable */
/* loaded from: classes7.dex */
class C10749x58c4adb6 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.p796x5c6729a.C10749x58c4adb6> f29255x681a0c0c = new com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.p796x5c6729a.a();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f149883d;

    public C10749x58c4adb6(com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.p796x5c6729a.a aVar) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.a b17;
        java.lang.Object obj = this.f149883d;
        if (obj == null || (b17 = com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.c.b(obj)) == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(1);
        parcel.writeString(b17.mo46195xfb82e301());
        b17.c(this.f149883d, parcel);
    }
}
