package com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f;

/* renamed from: com.tencent.mm.ipcinvoker.extension.XIPCInvoker$WrapperParcelable */
/* loaded from: classes7.dex */
public class C10747xff81be48 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.C10747xff81be48> f29253x681a0c0c = new com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.k();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f149876d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f149877e;

    public C10747xff81be48(com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.f fVar) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.a b17;
        parcel.writeString(this.f149876d);
        java.lang.Object obj = this.f149877e;
        if (obj == null || (b17 = com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.c.b(obj)) == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeString(b17.mo46195xfb82e301());
        b17.c(this.f149877e, parcel);
    }

    public C10747xff81be48(java.lang.String str, java.lang.Object obj) {
        this.f149876d = str;
        this.f149877e = obj;
    }
}
