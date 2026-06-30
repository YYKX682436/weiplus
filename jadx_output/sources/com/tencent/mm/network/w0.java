package com.tencent.mm.network;

/* loaded from: classes12.dex */
public abstract class w0 extends android.os.Binder implements com.tencent.mm.network.z0 {
    public w0() {
        attachInterface(this, "com.tencent.mm.network.IReqResp_AIDL");
    }

    public static com.tencent.mm.network.z0 d(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.mm.network.IReqResp_AIDL");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof com.tencent.mm.network.z0)) ? new com.tencent.mm.network.x0(iBinder) : (com.tencent.mm.network.z0) queryLocalInterface;
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
        com.tencent.mm.network.r rVar = null;
        switch (i17) {
            case 1:
                ((com.tencent.mm.modelbase.v2) this).S6(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 2:
                int type = ((com.tencent.mm.modelbase.v2) this).getType();
                parcel2.writeNoException();
                parcel2.writeInt(type);
                return true;
            case 3:
                java.lang.String uri = ((com.tencent.mm.modelbase.v2) this).getUri();
                parcel2.writeNoException();
                parcel2.writeString(uri);
                return true;
            case 4:
                o45.kg kgVar = ((com.tencent.mm.modelbase.v2) this).f70830g;
                parcel2.writeNoException();
                parcel2.writeStrongInterface(kgVar);
                return true;
            case 5:
                o45.hg hgVar = ((com.tencent.mm.modelbase.v2) this).f70829f;
                parcel2.writeNoException();
                parcel2.writeStrongInterface(hgVar);
                return true;
            case 6:
                ((com.tencent.mm.modelbase.v2) this).Bg(com.tencent.mm.network.j0.d(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 7:
                int o27 = ((com.tencent.mm.modelbase.v2) this).o2();
                parcel2.writeNoException();
                parcel2.writeInt(o27);
                return true;
            case 8:
                boolean isUserCmd = ((com.tencent.mm.modelbase.v2) this).f70827d.getIsUserCmd();
                parcel2.writeNoException();
                parcel2.writeInt(isUserCmd ? 1 : 0);
                return true;
            case 9:
                int options = ((com.tencent.mm.modelbase.v2) this).f70827d.getOptions();
                parcel2.writeNoException();
                parcel2.writeInt(options);
                return true;
            case 10:
                ((com.tencent.mm.modelbase.v2) this).f70827d.setConnectionInfo(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                ((com.tencent.mm.modelbase.v2) this).G2(com.tencent.mm.network.j0.d(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 12:
                android.os.IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.tencent.mm.network.IAccInfo_AIDL");
                    rVar = (queryLocalInterface == null || !(queryLocalInterface instanceof com.tencent.mm.network.r)) ? new com.tencent.mm.network.p(readStrongBinder) : (com.tencent.mm.network.r) queryLocalInterface;
                }
                ((com.tencent.mm.modelbase.v2) this).Re(rVar, com.tencent.mm.network.j0.d(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 13:
                int Zc = ((com.tencent.mm.modelbase.v2) this).Zc();
                parcel2.writeNoException();
                parcel2.writeInt(Zc);
                return true;
            case 14:
                int timeOut = ((com.tencent.mm.modelbase.v2) this).f70827d.getTimeOut();
                parcel2.writeNoException();
                parcel2.writeInt(timeOut);
                return true;
            case 15:
                boolean isSingleSession = ((com.tencent.mm.modelbase.v2) this).isSingleSession();
                parcel2.writeNoException();
                parcel2.writeInt(isSingleSession ? 1 : 0);
                return true;
            case 16:
                ((com.tencent.mm.modelbase.v2) this).setSingleSession(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean isLongPolling = ((com.tencent.mm.modelbase.v2) this).f70827d.getIsLongPolling();
                parcel2.writeNoException();
                parcel2.writeInt(isLongPolling ? 1 : 0);
                return true;
            case 18:
                boolean keepAlive = ((com.tencent.mm.modelbase.v2) this).f70827d.keepAlive();
                parcel2.writeNoException();
                parcel2.writeInt(keepAlive ? 1 : 0);
                return true;
            case 19:
                int longPollingTimeout = ((com.tencent.mm.modelbase.v2) this).f70827d.getLongPollingTimeout();
                parcel2.writeNoException();
                parcel2.writeInt(longPollingTimeout);
                return true;
            case 20:
                int newExtFlags = ((com.tencent.mm.modelbase.v2) this).getNewExtFlags();
                parcel2.writeNoException();
                parcel2.writeInt(newExtFlags);
                return true;
            case 21:
                byte[] transHeader = ((com.tencent.mm.modelbase.v2) this).getTransHeader();
                parcel2.writeNoException();
                parcel2.writeByteArray(transHeader);
                return true;
            case 22:
                java.lang.String vh6 = ((com.tencent.mm.modelbase.v2) this).vh();
                parcel2.writeNoException();
                parcel2.writeString(vh6);
                return true;
            case 23:
                java.lang.String s76 = ((com.tencent.mm.modelbase.v2) this).s7();
                parcel2.writeNoException();
                parcel2.writeString(s76);
                return true;
            case 24:
                ((com.tencent.mm.modelbase.v2) this).setEncryptAlgo(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 25:
                int encryptAlgo = ((com.tencent.mm.modelbase.v2) this).f70827d.getEncryptAlgo();
                parcel2.writeNoException();
                parcel2.writeInt(encryptAlgo);
                return true;
            case 26:
                ((com.tencent.mm.modelbase.v2) this).setReqHost(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 27:
                java.lang.String reqHost = ((com.tencent.mm.modelbase.v2) this).f70827d.getReqHost();
                parcel2.writeNoException();
                parcel2.writeString(reqHost);
                return true;
            case 28:
                ((com.tencent.mm.modelbase.v2) this).f70827d.setNewDNSBusinessType(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 29:
                int newDNSBusinessType = ((com.tencent.mm.modelbase.v2) this).f70827d.getNewDNSBusinessType();
                parcel2.writeNoException();
                parcel2.writeInt(newDNSBusinessType);
                return true;
            case 30:
                com.tencent.mm.network.ReqInfo Qc = ((com.tencent.mm.modelbase.v2) this).Qc();
                parcel2.writeNoException();
                com.tencent.mm.network.y0.a(parcel2, Qc, 1);
                return true;
            case 31:
                com.tencent.mm.network.ReqInfo Ag = ((com.tencent.mm.modelbase.v2) this).Ag(parcel.readInt());
                parcel2.writeNoException();
                com.tencent.mm.network.y0.a(parcel2, Ag, 1);
                return true;
            case 32:
                com.tencent.mm.network.RespInfo of6 = ((com.tencent.mm.modelbase.v2) this).of(parcel.createByteArray());
                parcel2.writeNoException();
                com.tencent.mm.network.y0.a(parcel2, of6, 1);
                return true;
            case 33:
                com.tencent.mm.network.ReqToBufRes g96 = ((com.tencent.mm.modelbase.v2) this).g9(parcel.readInt(), parcel.createByteArray(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.createByteArray(), parcel.createByteArray(), parcel.createByteArray(), parcel.readInt(), parcel.readInt() != 0, parcel.createByteArray(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
                parcel2.writeNoException();
                com.tencent.mm.network.y0.a(parcel2, g96, 1);
                return true;
            case 34:
                com.tencent.mm.network.BufToRespRes Cc = ((com.tencent.mm.modelbase.v2) this).Cc(parcel.readInt(), parcel.createByteArray());
                parcel2.writeNoException();
                com.tencent.mm.network.y0.a(parcel2, Cc, 1);
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
                ((com.tencent.mm.modelbase.v2) this).wa(hashMap);
                parcel2.writeNoException();
                return true;
            case 36:
                int ordinal = ((com.tencent.mm.modelbase.v2) this).f70827d.bindCellularStrategy().ordinal();
                parcel2.writeNoException();
                parcel2.writeInt(ordinal);
                return true;
            case 37:
                int readInt2 = parcel.readInt();
                com.tencent.mm.modelbase.v2 v2Var = (com.tencent.mm.modelbase.v2) this;
                java.util.HashMap hashMap2 = new java.util.HashMap();
                for (com.tencent.mars.stn.StnManager.Task.EBindCellularStrategy eBindCellularStrategy : com.tencent.mars.stn.StnManager.Task.EBindCellularStrategy.values()) {
                    hashMap2.put(java.lang.Integer.valueOf(eBindCellularStrategy.ordinal()), eBindCellularStrategy);
                }
                v2Var.f70827d.setBindCellularStrategy((com.tencent.mars.stn.StnManager.Task.EBindCellularStrategy) hashMap2.get(java.lang.Integer.valueOf(readInt2)));
                parcel2.writeNoException();
                return true;
            case 38:
                ((com.tencent.mm.modelbase.y2) ((com.tencent.mm.modelbase.v2) this).f70830g).Y7(parcel.createByteArray(), parcel.createByteArray(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i17, parcel, parcel2, i18);
        }
    }
}
