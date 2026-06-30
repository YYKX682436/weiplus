package com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061;

/* loaded from: classes13.dex */
public class m0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.a {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.a
    public boolean a(java.lang.Object obj) {
        return obj instanceof android.os.Parcel;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.a
    public java.lang.Object b(android.os.Parcel parcel) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.setDataPosition(0);
        int readInt = parcel.readInt();
        obtain.appendFrom(parcel, parcel.dataPosition(), readInt);
        parcel.setDataPosition(parcel.dataPosition() + readInt);
        obtain.setDataPosition(0);
        return obtain;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.a
    public void c(java.lang.Object obj, android.os.Parcel parcel) {
        android.os.Parcel parcel2 = (android.os.Parcel) obj;
        parcel2.setDataPosition(0);
        parcel.writeInt(parcel2.dataSize());
        parcel.appendFrom(parcel2, 0, parcel2.dataSize());
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.a
    /* renamed from: getName */
    public java.lang.String mo46195xfb82e301() {
        return com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.m0.class.getName();
    }
}
