package com.tencent.mm.network;

/* loaded from: classes12.dex */
public abstract class q extends android.os.Binder implements com.tencent.mm.network.r {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f72123d = 0;

    public q() {
        attachInterface(this, "com.tencent.mm.network.IAccInfo_AIDL");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        boolean contains;
        if (i17 >= 1 && i17 <= 16777215) {
            parcel.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
        }
        if (i17 == 1598968902) {
            parcel2.writeString("com.tencent.mm.network.IAccInfo_AIDL");
            return true;
        }
        r0 = 0;
        r0 = 0;
        r0 = 0;
        r0 = 0;
        int i19 = 0;
        switch (i17) {
            case 1:
                ((com.tencent.mm.network.AccInfo) this).reset();
                parcel2.writeNoException();
                return true;
            case 2:
                ((com.tencent.mm.network.AccInfo) this).E(parcel.createByteArray(), parcel.createByteArray(), parcel.createByteArray(), parcel.readInt(), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 3:
                ((com.tencent.mm.network.AccInfo) this).a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 4:
                ((com.tencent.mm.network.AccInfo) this).f71895e = parcel.readString();
                parcel2.writeNoException();
                return true;
            case 5:
                ((com.tencent.mm.network.AccInfo) this).U1(parcel.createByteArray());
                parcel2.writeNoException();
                return true;
            case 6:
                ((com.tencent.mm.network.AccInfo) this).f71904q = parcel.createByteArray();
                parcel2.writeNoException();
                return true;
            case 7:
                java.lang.String str = ((com.tencent.mm.network.AccInfo) this).f71895e;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 8:
                byte[] r17 = ((com.tencent.mm.network.AccInfo) this).r(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeByteArray(r17);
                return true;
            case 9:
                byte[] bArr = ((com.tencent.mm.network.AccInfo) this).f71900m;
                parcel2.writeNoException();
                parcel2.writeByteArray(bArr);
                return true;
            case 10:
                byte[] bArr2 = ((com.tencent.mm.network.AccInfo) this).f71904q;
                parcel2.writeNoException();
                parcel2.writeByteArray(bArr2);
                return true;
            case 11:
                int i27 = ((com.tencent.mm.network.AccInfo) this).f71902o;
                parcel2.writeNoException();
                parcel2.writeInt(i27);
                return true;
            case 12:
                boolean isLogin = ((com.tencent.mm.network.AccInfo) this).isLogin();
                parcel2.writeNoException();
                parcel2.writeInt(isLogin ? 1 : 0);
                return true;
            case 13:
                ((com.tencent.mm.network.AccInfo) this).l1(parcel.readString(), parcel.createByteArray());
                parcel2.writeNoException();
                return true;
            case 14:
                byte[] v17 = ((com.tencent.mm.network.AccInfo) this).v(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(v17);
                return true;
            case 15:
                ((com.tencent.mm.network.AccInfo) this).I0(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 16:
                boolean z17 = ((com.tencent.mm.network.AccInfo) this).f71905r;
                parcel2.writeNoException();
                parcel2.writeInt(z17 ? 1 : 0);
                return true;
            case 17:
                java.lang.String str2 = ((com.tencent.mm.network.AccInfo) this).f71906s;
                parcel2.writeNoException();
                parcel2.writeString(str2);
                return true;
            case 18:
                ((com.tencent.mm.network.AccInfo) this).f71906s = parcel.readString();
                parcel2.writeNoException();
                return true;
            case 19:
                ((com.tencent.mm.network.AccInfo) this).v0(parcel.readInt() != 0 ? com.tencent.mm.network.AccInfo.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 20:
                ((com.tencent.mm.network.AccInfo) this).d(parcel.readInt(), parcel.createByteArray());
                parcel2.writeNoException();
                return true;
            case 21:
                ((com.tencent.mm.network.AccInfo) this).R1(parcel.readInt(), parcel.createByteArray(), parcel.createByteArray(), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 22:
                byte[] createByteArray = parcel.createByteArray();
                com.tencent.mm.network.AccInfo accInfo = (com.tencent.mm.network.AccInfo) this;
                synchronized (accInfo.A) {
                    accInfo.A.add(new java.lang.String(createByteArray));
                }
                parcel2.writeNoException();
                return true;
            case 23:
                byte[] createByteArray2 = parcel.createByteArray();
                com.tencent.mm.network.AccInfo accInfo2 = (com.tencent.mm.network.AccInfo) this;
                synchronized (accInfo2.A) {
                    contains = accInfo2.A.contains(new java.lang.String(createByteArray2));
                }
                parcel2.writeNoException();
                parcel2.writeInt(contains ? 1 : 0);
                return true;
            case 24:
                byte[] f07 = ((com.tencent.mm.network.AccInfo) this).f0(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(f07);
                return true;
            case 25:
                byte[] L0 = ((com.tencent.mm.network.AccInfo) this).L0(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(L0);
                return true;
            case 26:
                byte[] c17 = ((com.tencent.mm.network.AccInfo) this).c1(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(c17);
                return true;
            case 27:
                boolean x17 = ((com.tencent.mm.network.AccInfo) this).x(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(x17 ? 1 : 0);
                return true;
            case 28:
                ((com.tencent.mm.network.AccInfo) this).i0();
                parcel2.writeNoException();
                return true;
            case 29:
                com.tencent.mm.network.AccInfo accInfo3 = (com.tencent.mm.network.AccInfo) this;
                com.tencent.mars.xlog.Log.i("MicroMsg.AccInfo", "clearAxHost");
                accInfo3.f71910w.clear();
                accInfo3.C.clear();
                parcel2.writeNoException();
                return true;
            case 30:
                java.lang.String readString = parcel.readString();
                com.tencent.mm.network.AccInfo accInfo4 = (com.tencent.mm.network.AccInfo) this;
                if (accInfo4.x(readString)) {
                    byte[] c18 = accInfo4.c1(readString);
                    byte[] L02 = accInfo4.L0(readString);
                    if (c18 != null && c18.length > 0 && L02 != null && L02.length > 0) {
                        i19 = 1;
                    }
                }
                parcel2.writeNoException();
                parcel2.writeInt(i19);
                return true;
            case 31:
                com.tencent.mars.xlog.Log.i("MicroMsg.AccInfo", "cleanMainHostAlgo");
                ((com.tencent.mm.network.AccInfo) this).B.clear();
                parcel2.writeNoException();
                return true;
            case 32:
                ((com.tencent.mm.network.AccInfo) this).e(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 33:
                int O = ((com.tencent.mm.network.AccInfo) this).O(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(O);
                return true;
            case 34:
                int U0 = ((com.tencent.mm.network.AccInfo) this).U0(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(U0);
                return true;
            case 35:
                byte[] bArr3 = ((com.tencent.mm.network.AccInfo) this).f71907t;
                parcel2.writeNoException();
                parcel2.writeByteArray(bArr3);
                return true;
            case 36:
                byte[] bArr4 = ((com.tencent.mm.network.AccInfo) this).f71908u;
                parcel2.writeNoException();
                parcel2.writeByteArray(bArr4);
                return true;
            case 37:
                ((com.tencent.mm.network.AccInfo) this).f71907t = parcel.createByteArray();
                parcel2.writeNoException();
                return true;
            case 38:
                ((com.tencent.mm.network.AccInfo) this).f71908u = parcel.createByteArray();
                parcel2.writeNoException();
                return true;
            case 39:
                byte[] bArr5 = ((com.tencent.mm.network.AccInfo) this).f71901n;
                parcel2.writeNoException();
                parcel2.writeByteArray(bArr5);
                return true;
            default:
                return super.onTransact(i17, parcel, parcel2, i18);
        }
    }
}
