package com.p314xaae8f345.mm.p971x6de15a2e;

/* loaded from: classes12.dex */
public abstract class q extends android.os.Binder implements com.p314xaae8f345.mm.p971x6de15a2e.r {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f153656d = 0;

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
                ((com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af) this).mo9866x6761d4f();
                parcel2.writeNoException();
                return true;
            case 2:
                ((com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af) this).E(parcel.createByteArray(), parcel.createByteArray(), parcel.createByteArray(), parcel.readInt(), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 3:
                ((com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af) this).a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 4:
                ((com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af) this).f153428e = parcel.readString();
                parcel2.writeNoException();
                return true;
            case 5:
                ((com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af) this).U1(parcel.createByteArray());
                parcel2.writeNoException();
                return true;
            case 6:
                ((com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af) this).f153437q = parcel.createByteArray();
                parcel2.writeNoException();
                return true;
            case 7:
                java.lang.String str = ((com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af) this).f153428e;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 8:
                byte[] r17 = ((com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af) this).r(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeByteArray(r17);
                return true;
            case 9:
                byte[] bArr = ((com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af) this).f153433m;
                parcel2.writeNoException();
                parcel2.writeByteArray(bArr);
                return true;
            case 10:
                byte[] bArr2 = ((com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af) this).f153437q;
                parcel2.writeNoException();
                parcel2.writeByteArray(bArr2);
                return true;
            case 11:
                int i27 = ((com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af) this).f153435o;
                parcel2.writeNoException();
                parcel2.writeInt(i27);
                return true;
            case 12:
                boolean mo9865x7b0e9c5f = ((com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af) this).mo9865x7b0e9c5f();
                parcel2.writeNoException();
                parcel2.writeInt(mo9865x7b0e9c5f ? 1 : 0);
                return true;
            case 13:
                ((com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af) this).l1(parcel.readString(), parcel.createByteArray());
                parcel2.writeNoException();
                return true;
            case 14:
                byte[] v17 = ((com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af) this).v(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(v17);
                return true;
            case 15:
                ((com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af) this).I0(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 16:
                boolean z17 = ((com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af) this).f153438r;
                parcel2.writeNoException();
                parcel2.writeInt(z17 ? 1 : 0);
                return true;
            case 17:
                java.lang.String str2 = ((com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af) this).f153439s;
                parcel2.writeNoException();
                parcel2.writeString(str2);
                return true;
            case 18:
                ((com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af) this).f153439s = parcel.readString();
                parcel2.writeNoException();
                return true;
            case 19:
                ((com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af) this).v0(parcel.readInt() != 0 ? com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af.f32586x681a0c0c.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 20:
                ((com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af) this).d(parcel.readInt(), parcel.createByteArray());
                parcel2.writeNoException();
                return true;
            case 21:
                ((com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af) this).R1(parcel.readInt(), parcel.createByteArray(), parcel.createByteArray(), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 22:
                byte[] createByteArray = parcel.createByteArray();
                com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af binderC11173x1cfac0af = (com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af) this;
                synchronized (binderC11173x1cfac0af.A) {
                    binderC11173x1cfac0af.A.add(new java.lang.String(createByteArray));
                }
                parcel2.writeNoException();
                return true;
            case 23:
                byte[] createByteArray2 = parcel.createByteArray();
                com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af binderC11173x1cfac0af2 = (com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af) this;
                synchronized (binderC11173x1cfac0af2.A) {
                    contains = binderC11173x1cfac0af2.A.contains(new java.lang.String(createByteArray2));
                }
                parcel2.writeNoException();
                parcel2.writeInt(contains ? 1 : 0);
                return true;
            case 24:
                byte[] f07 = ((com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af) this).f0(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(f07);
                return true;
            case 25:
                byte[] L0 = ((com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af) this).L0(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(L0);
                return true;
            case 26:
                byte[] c17 = ((com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af) this).c1(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(c17);
                return true;
            case 27:
                boolean x17 = ((com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af) this).x(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(x17 ? 1 : 0);
                return true;
            case 28:
                ((com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af) this).i0();
                parcel2.writeNoException();
                return true;
            case 29:
                com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af binderC11173x1cfac0af3 = (com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af) this;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccInfo", "clearAxHost");
                binderC11173x1cfac0af3.f153443w.clear();
                binderC11173x1cfac0af3.C.clear();
                parcel2.writeNoException();
                return true;
            case 30:
                java.lang.String readString = parcel.readString();
                com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af binderC11173x1cfac0af4 = (com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af) this;
                if (binderC11173x1cfac0af4.x(readString)) {
                    byte[] c18 = binderC11173x1cfac0af4.c1(readString);
                    byte[] L02 = binderC11173x1cfac0af4.L0(readString);
                    if (c18 != null && c18.length > 0 && L02 != null && L02.length > 0) {
                        i19 = 1;
                    }
                }
                parcel2.writeNoException();
                parcel2.writeInt(i19);
                return true;
            case 31:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccInfo", "cleanMainHostAlgo");
                ((com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af) this).B.clear();
                parcel2.writeNoException();
                return true;
            case 32:
                ((com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af) this).e(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 33:
                int O = ((com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af) this).O(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(O);
                return true;
            case 34:
                int U0 = ((com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af) this).U0(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(U0);
                return true;
            case 35:
                byte[] bArr3 = ((com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af) this).f153440t;
                parcel2.writeNoException();
                parcel2.writeByteArray(bArr3);
                return true;
            case 36:
                byte[] bArr4 = ((com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af) this).f153441u;
                parcel2.writeNoException();
                parcel2.writeByteArray(bArr4);
                return true;
            case 37:
                ((com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af) this).f153440t = parcel.createByteArray();
                parcel2.writeNoException();
                return true;
            case 38:
                ((com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af) this).f153441u = parcel.createByteArray();
                parcel2.writeNoException();
                return true;
            case 39:
                byte[] bArr5 = ((com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af) this).f153434n;
                parcel2.writeNoException();
                parcel2.writeByteArray(bArr5);
                return true;
            default:
                return super.onTransact(i17, parcel, parcel2, i18);
        }
    }
}
