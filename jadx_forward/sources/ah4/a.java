package ah4;

/* loaded from: classes13.dex */
public class a implements ah4.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f86511d;

    public a(android.os.IBinder iBinder) {
        this.f86511d = iBinder;
    }

    @Override // ah4.c
    public byte[] C1(int[] iArr, java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
            obtain.writeInt(iArr.length);
            obtain.writeString(str);
            this.f86511d.transact(6, obtain, obtain2, 0);
            obtain2.readException();
            byte[] createByteArray = obtain2.createByteArray();
            obtain2.readIntArray(iArr);
            return createByteArray;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // ah4.c
    public int E5(com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.p2255xac8f1cfd.InterfaceC18546xdab69d9b interfaceC18546xdab69d9b, int i17, int i18, int i19, long j17, int[] iArr, int[] iArr2, int i27, java.lang.String[] strArr) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
            obtain.writeStrongInterface(interfaceC18546xdab69d9b);
            obtain.writeInt(i17);
            obtain.writeInt(i18);
            obtain.writeInt(i19);
            obtain.writeLong(j17);
            obtain.writeIntArray(iArr);
            obtain.writeIntArray(iArr2);
            obtain.writeInt(i27);
            obtain.writeStringArray(strArr);
            this.f86511d.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // ah4.c
    public int F8() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
            this.f86511d.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // ah4.c
    public ah4.k H4() {
        ah4.k iVar;
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
            this.f86511d.transact(8, obtain, obtain2, 0);
            obtain2.readException();
            android.os.IBinder readStrongBinder = obtain2.readStrongBinder();
            int i17 = ah4.j.f86535d;
            if (readStrongBinder == null) {
                iVar = null;
            } else {
                android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.tencent.mm.plugin.talkroom.component.IMicRecoder_AIDL");
                iVar = (queryLocalInterface == null || !(queryLocalInterface instanceof ah4.k)) ? new ah4.i(readStrongBinder) : (ah4.k) queryLocalInterface;
            }
            return iVar;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // ah4.c
    public int I7() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
            this.f86511d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // ah4.c
    public int Nh() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
            this.f86511d.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // ah4.c
    public ah4.n Pb(ah4.h hVar) {
        ah4.n lVar;
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
            obtain.writeStrongInterface(hVar);
            this.f86511d.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            android.os.IBinder readStrongBinder = obtain2.readStrongBinder();
            int i17 = ah4.m.f86537d;
            if (readStrongBinder == null) {
                lVar = null;
            } else {
                android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.tencent.mm.plugin.talkroom.component.ITalkRoomPlayer_AIDL");
                lVar = (queryLocalInterface == null || !(queryLocalInterface instanceof ah4.n)) ? new ah4.l(readStrongBinder) : (ah4.n) queryLocalInterface;
            }
            return lVar;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f86511d;
    }

    @Override // ah4.c
    public int yh(int i17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
            obtain.writeInt(i17);
            this.f86511d.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
