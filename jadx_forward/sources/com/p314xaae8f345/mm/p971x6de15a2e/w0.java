package com.p314xaae8f345.mm.p971x6de15a2e;

/* loaded from: classes12.dex */
public abstract class w0 extends android.os.Binder implements com.p314xaae8f345.mm.p971x6de15a2e.z0 {
    public w0() {
        attachInterface(this, "com.tencent.mm.network.IReqResp_AIDL");
    }

    public static com.p314xaae8f345.mm.p971x6de15a2e.z0 d(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.mm.network.IReqResp_AIDL");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof com.p314xaae8f345.mm.p971x6de15a2e.z0)) ? new com.p314xaae8f345.mm.p971x6de15a2e.x0(iBinder) : (com.p314xaae8f345.mm.p971x6de15a2e.z0) queryLocalInterface;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, final android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 >= 1 && i17 <= 16777215) {
            parcel.enforceInterface("com.tencent.mm.network.IReqResp_AIDL");
        }
        if (i17 == 1598968902) {
            parcel2.writeString("com.tencent.mm.network.IReqResp_AIDL");
            return true;
        }
        com.p314xaae8f345.mm.p971x6de15a2e.r rVar = null;
        switch (i17) {
            case 1:
                ((com.p314xaae8f345.mm.p944x882e457a.v2) this).S6(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 2:
                int mo48052xfb85f7b0 = ((com.p314xaae8f345.mm.p944x882e457a.v2) this).mo48052xfb85f7b0();
                parcel2.writeNoException();
                parcel2.writeInt(mo48052xfb85f7b0);
                return true;
            case 3:
                java.lang.String mo48053xb5887636 = ((com.p314xaae8f345.mm.p944x882e457a.v2) this).mo48053xb5887636();
                parcel2.writeNoException();
                parcel2.writeString(mo48053xb5887636);
                return true;
            case 4:
                o45.kg kgVar = ((com.p314xaae8f345.mm.p944x882e457a.v2) this).f152363g;
                parcel2.writeNoException();
                parcel2.writeStrongInterface(kgVar);
                return true;
            case 5:
                o45.hg hgVar = ((com.p314xaae8f345.mm.p944x882e457a.v2) this).f152362f;
                parcel2.writeNoException();
                parcel2.writeStrongInterface(hgVar);
                return true;
            case 6:
                ((com.p314xaae8f345.mm.p944x882e457a.v2) this).Bg(com.p314xaae8f345.mm.p971x6de15a2e.j0.d(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 7:
                int o27 = ((com.p314xaae8f345.mm.p944x882e457a.v2) this).o2();
                parcel2.writeNoException();
                parcel2.writeInt(o27);
                return true;
            case 8:
                boolean mo47974xd4193e2f = ((com.p314xaae8f345.mm.p944x882e457a.v2) this).f152360d.mo47974xd4193e2f();
                parcel2.writeNoException();
                parcel2.writeInt(mo47974xd4193e2f ? 1 : 0);
                return true;
            case 9:
                int mo14486xf353c268 = ((com.p314xaae8f345.mm.p944x882e457a.v2) this).f152360d.mo14486xf353c268();
                parcel2.writeNoException();
                parcel2.writeInt(mo14486xf353c268);
                return true;
            case 10:
                ((com.p314xaae8f345.mm.p944x882e457a.v2) this).f152360d.mo47984x23eedae(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                ((com.p314xaae8f345.mm.p944x882e457a.v2) this).G2(com.p314xaae8f345.mm.p971x6de15a2e.j0.d(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 12:
                android.os.IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.tencent.mm.network.IAccInfo_AIDL");
                    rVar = (queryLocalInterface == null || !(queryLocalInterface instanceof com.p314xaae8f345.mm.p971x6de15a2e.r)) ? new com.p314xaae8f345.mm.p971x6de15a2e.p(readStrongBinder) : (com.p314xaae8f345.mm.p971x6de15a2e.r) queryLocalInterface;
                }
                ((com.p314xaae8f345.mm.p944x882e457a.v2) this).Re(rVar, com.p314xaae8f345.mm.p971x6de15a2e.j0.d(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 13:
                int Zc = ((com.p314xaae8f345.mm.p944x882e457a.v2) this).Zc();
                parcel2.writeNoException();
                parcel2.writeInt(Zc);
                return true;
            case 14:
                int mo47980xef7c110b = ((com.p314xaae8f345.mm.p944x882e457a.v2) this).f152360d.mo47980xef7c110b();
                parcel2.writeNoException();
                parcel2.writeInt(mo47980xef7c110b);
                return true;
            case 15:
                boolean mo48054x74080c24 = ((com.p314xaae8f345.mm.p944x882e457a.v2) this).mo48054x74080c24();
                parcel2.writeNoException();
                parcel2.writeInt(mo48054x74080c24 ? 1 : 0);
                return true;
            case 16:
                ((com.p314xaae8f345.mm.p944x882e457a.v2) this).mo48057x42fed7ec(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean mo47973xf2299a67 = ((com.p314xaae8f345.mm.p944x882e457a.v2) this).f152360d.mo47973xf2299a67();
                parcel2.writeNoException();
                parcel2.writeInt(mo47973xf2299a67 ? 1 : 0);
                return true;
            case 18:
                boolean mo47982x962be848 = ((com.p314xaae8f345.mm.p944x882e457a.v2) this).f152360d.mo47982x962be848();
                parcel2.writeNoException();
                parcel2.writeInt(mo47982x962be848 ? 1 : 0);
                return true;
            case 19:
                int mo47975xe6182bb0 = ((com.p314xaae8f345.mm.p944x882e457a.v2) this).f152360d.mo47975xe6182bb0();
                parcel2.writeNoException();
                parcel2.writeInt(mo47975xe6182bb0);
                return true;
            case 20:
                int mo48048xb6805570 = ((com.p314xaae8f345.mm.p944x882e457a.v2) this).mo48048xb6805570();
                parcel2.writeNoException();
                parcel2.writeInt(mo48048xb6805570);
                return true;
            case 21:
                byte[] mo48051x2ee16a1f = ((com.p314xaae8f345.mm.p944x882e457a.v2) this).mo48051x2ee16a1f();
                parcel2.writeNoException();
                parcel2.writeByteArray(mo48051x2ee16a1f);
                return true;
            case 22:
                java.lang.String vh6 = ((com.p314xaae8f345.mm.p944x882e457a.v2) this).vh();
                parcel2.writeNoException();
                parcel2.writeString(vh6);
                return true;
            case 23:
                java.lang.String s76 = ((com.p314xaae8f345.mm.p944x882e457a.v2) this).s7();
                parcel2.writeNoException();
                parcel2.writeString(s76);
                return true;
            case 24:
                ((com.p314xaae8f345.mm.p944x882e457a.v2) this).mo48055x85346096(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 25:
                int mo47972xeeceed22 = ((com.p314xaae8f345.mm.p944x882e457a.v2) this).f152360d.mo47972xeeceed22();
                parcel2.writeNoException();
                parcel2.writeInt(mo47972xeeceed22);
                return true;
            case 26:
                ((com.p314xaae8f345.mm.p944x882e457a.v2) this).mo48056xf2792ca4(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 27:
                java.lang.String mo47978x7f07df30 = ((com.p314xaae8f345.mm.p944x882e457a.v2) this).f152360d.mo47978x7f07df30();
                parcel2.writeNoException();
                parcel2.writeString(mo47978x7f07df30);
                return true;
            case 28:
                ((com.p314xaae8f345.mm.p944x882e457a.v2) this).f152360d.mo47987xb512c125(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 29:
                int mo47976x1de73f19 = ((com.p314xaae8f345.mm.p944x882e457a.v2) this).f152360d.mo47976x1de73f19();
                parcel2.writeNoException();
                parcel2.writeInt(mo47976x1de73f19);
                return true;
            case 30:
                com.p314xaae8f345.mm.p971x6de15a2e.C11181xa473aa4c Qc = ((com.p314xaae8f345.mm.p944x882e457a.v2) this).Qc();
                parcel2.writeNoException();
                com.p314xaae8f345.mm.p971x6de15a2e.y0.a(parcel2, Qc, 1);
                return true;
            case 31:
                com.p314xaae8f345.mm.p971x6de15a2e.C11181xa473aa4c Ag = ((com.p314xaae8f345.mm.p944x882e457a.v2) this).Ag(parcel.readInt());
                parcel2.writeNoException();
                com.p314xaae8f345.mm.p971x6de15a2e.y0.a(parcel2, Ag, 1);
                return true;
            case 32:
                com.p314xaae8f345.mm.p971x6de15a2e.C11183xef8030be of6 = ((com.p314xaae8f345.mm.p944x882e457a.v2) this).of(parcel.createByteArray());
                parcel2.writeNoException();
                com.p314xaae8f345.mm.p971x6de15a2e.y0.a(parcel2, of6, 1);
                return true;
            case 33:
                com.p314xaae8f345.mm.p971x6de15a2e.C11182x1668226 g96 = ((com.p314xaae8f345.mm.p944x882e457a.v2) this).g9(parcel.readInt(), parcel.createByteArray(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.createByteArray(), parcel.createByteArray(), parcel.createByteArray(), parcel.readInt(), parcel.readInt() != 0, parcel.createByteArray(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
                parcel2.writeNoException();
                com.p314xaae8f345.mm.p971x6de15a2e.y0.a(parcel2, g96, 1);
                return true;
            case 34:
                com.p314xaae8f345.mm.p971x6de15a2e.C11179xb34d72a2 Cc = ((com.p314xaae8f345.mm.p944x882e457a.v2) this).Cc(parcel.readInt(), parcel.createByteArray());
                parcel2.writeNoException();
                com.p314xaae8f345.mm.p971x6de15a2e.y0.a(parcel2, Cc, 1);
                return true;
            case 35:
                int readInt = parcel.readInt();
                final java.util.Map hashMap = readInt >= 0 ? new java.util.HashMap() : null;
                java.util.stream.IntStream.range(0, readInt).forEach(new java.util.function.IntConsumer() { // from class: com.tencent.mm.network.w0$$a
                    @Override // java.util.function.IntConsumer
                    public final void accept(int i19) {
                        android.os.Parcel parcel3 = parcel;
                        hashMap.put(parcel3.readString(), parcel3.readString());
                    }
                });
                ((com.p314xaae8f345.mm.p944x882e457a.v2) this).wa(hashMap);
                parcel2.writeNoException();
                return true;
            case 36:
                int ordinal = ((com.p314xaae8f345.mm.p944x882e457a.v2) this).f152360d.mo47971xbed9255a().ordinal();
                parcel2.writeNoException();
                parcel2.writeInt(ordinal);
                return true;
            case 37:
                int readInt2 = parcel.readInt();
                com.p314xaae8f345.mm.p944x882e457a.v2 v2Var = (com.p314xaae8f345.mm.p944x882e457a.v2) this;
                java.util.HashMap hashMap2 = new java.util.HashMap();
                for (com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.Task.EBindCellularStrategy eBindCellularStrategy : com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.Task.EBindCellularStrategy.m40481xcee59d22()) {
                    hashMap2.put(java.lang.Integer.valueOf(eBindCellularStrategy.ordinal()), eBindCellularStrategy);
                }
                v2Var.f152360d.mo47983xe6f810dc((com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.Task.EBindCellularStrategy) hashMap2.get(java.lang.Integer.valueOf(readInt2)));
                parcel2.writeNoException();
                return true;
            case 38:
                ((com.p314xaae8f345.mm.p944x882e457a.y2) ((com.p314xaae8f345.mm.p944x882e457a.v2) this).f152363g).Y7(parcel.createByteArray(), parcel.createByteArray(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i17, parcel, parcel2, i18);
        }
    }
}
