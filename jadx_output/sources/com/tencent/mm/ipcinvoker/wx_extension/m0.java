package com.tencent.mm.ipcinvoker.wx_extension;

/* loaded from: classes13.dex */
public class m0 implements com.tencent.mm.ipcinvoker.extension.a {
    @Override // com.tencent.mm.ipcinvoker.extension.a
    public boolean a(java.lang.Object obj) {
        return obj instanceof android.os.Parcel;
    }

    @Override // com.tencent.mm.ipcinvoker.extension.a
    public java.lang.Object b(android.os.Parcel parcel) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.setDataPosition(0);
        int readInt = parcel.readInt();
        obtain.appendFrom(parcel, parcel.dataPosition(), readInt);
        parcel.setDataPosition(parcel.dataPosition() + readInt);
        obtain.setDataPosition(0);
        return obtain;
    }

    @Override // com.tencent.mm.ipcinvoker.extension.a
    public void c(java.lang.Object obj, android.os.Parcel parcel) {
        android.os.Parcel parcel2 = (android.os.Parcel) obj;
        parcel2.setDataPosition(0);
        parcel.writeInt(parcel2.dataSize());
        parcel.appendFrom(parcel2, 0, parcel2.dataSize());
    }

    @Override // com.tencent.mm.ipcinvoker.extension.a
    public java.lang.String getName() {
        return com.tencent.mm.ipcinvoker.wx_extension.m0.class.getName();
    }
}
