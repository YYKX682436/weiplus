package com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f;

/* loaded from: classes4.dex */
public class d implements com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.a {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.a
    public boolean a(java.lang.Object obj) {
        return obj instanceof android.os.Parcelable;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.a
    public java.lang.Object b(android.os.Parcel parcel) {
        return parcel.readParcelable(com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.d.class.getClassLoader());
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.a
    public void c(java.lang.Object obj, android.os.Parcel parcel) {
        parcel.writeParcelable((android.os.Parcelable) obj, 0);
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.a
    /* renamed from: getName */
    public java.lang.String mo46195xfb82e301() {
        return com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.d.class.getName();
    }
}
