package com.tencent.mm.network;

/* loaded from: classes12.dex */
public class x0 implements com.tencent.mm.network.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f72164d;

    public x0(android.os.IBinder iBinder) {
        this.f72164d = iBinder;
    }

    @Override // com.tencent.mm.network.z0
    public com.tencent.mm.network.ReqInfo Ag(int i17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
            obtain.writeInt(i17);
            this.f72164d.transact(31, obtain, obtain2, 0);
            obtain2.readException();
            return (com.tencent.mm.network.ReqInfo) com.tencent.mm.network.y0.b(obtain2, com.tencent.mm.network.ReqInfo.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.z0
    public void Bg(com.tencent.mm.network.k0 k0Var, int i17, int i18) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
            obtain.writeStrongInterface(k0Var);
            obtain.writeInt(i17);
            obtain.writeInt(i18);
            this.f72164d.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.z0
    public com.tencent.mm.network.BufToRespRes Cc(int i17, byte[] bArr) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
            obtain.writeInt(i17);
            obtain.writeByteArray(bArr);
            this.f72164d.transact(34, obtain, obtain2, 0);
            obtain2.readException();
            return (com.tencent.mm.network.BufToRespRes) com.tencent.mm.network.y0.b(obtain2, com.tencent.mm.network.BufToRespRes.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.z0
    public void G2(com.tencent.mm.network.k0 k0Var, int i17, int i18, java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
            obtain.writeStrongInterface(k0Var);
            obtain.writeInt(i17);
            obtain.writeInt(i18);
            obtain.writeString(str);
            this.f72164d.transact(11, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.z0
    public com.tencent.mm.network.ReqInfo Qc() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
            this.f72164d.transact(30, obtain, obtain2, 0);
            obtain2.readException();
            return (com.tencent.mm.network.ReqInfo) com.tencent.mm.network.y0.b(obtain2, com.tencent.mm.network.ReqInfo.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.z0
    public void Re(com.tencent.mm.network.r rVar, com.tencent.mm.network.k0 k0Var, int i17, int i18) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
            obtain.writeStrongInterface(rVar);
            obtain.writeStrongInterface(k0Var);
            obtain.writeInt(i17);
            obtain.writeInt(i18);
            this.f72164d.transact(12, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.z0
    public void S6(int i17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
            obtain.writeInt(i17);
            this.f72164d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.z0
    public int Zc() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
            this.f72164d.transact(13, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f72164d;
    }

    @Override // com.tencent.mm.network.z0
    public com.tencent.mm.network.ReqToBufRes g9(int i17, byte[] bArr, java.lang.String str, int i18, int i19, int i27, int i28, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i29, boolean z17, byte[] bArr5, boolean z18, int i37, boolean z19, boolean z27, boolean z28) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
            obtain.writeInt(i17);
            obtain.writeByteArray(bArr);
            obtain.writeString(str);
            obtain.writeInt(i18);
            obtain.writeInt(i19);
            obtain.writeInt(i27);
            obtain.writeInt(i28);
            obtain.writeByteArray(bArr2);
            obtain.writeByteArray(bArr3);
            obtain.writeByteArray(bArr4);
            obtain.writeInt(i29);
            int i38 = 1;
            obtain.writeInt(z17 ? 1 : 0);
            obtain.writeByteArray(bArr5);
            obtain.writeInt(z18 ? 1 : 0);
            obtain.writeInt(i37);
            obtain.writeInt(z19 ? 1 : 0);
            obtain.writeInt(z27 ? 1 : 0);
            if (!z28) {
                i38 = 0;
            }
            obtain.writeInt(i38);
            try {
                this.f72164d.transact(33, obtain, obtain2, 0);
                obtain2.readException();
                com.tencent.mm.network.ReqToBufRes reqToBufRes = (com.tencent.mm.network.ReqToBufRes) com.tencent.mm.network.y0.b(obtain2, com.tencent.mm.network.ReqToBufRes.CREATOR);
                obtain2.recycle();
                obtain.recycle();
                return reqToBufRes;
            } catch (java.lang.Throwable th6) {
                th = th6;
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    @Override // com.tencent.mm.network.z0
    public int getNewExtFlags() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
            this.f72164d.transact(20, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.z0
    public o45.hg getReqObj() {
        o45.hg fgVar;
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
            this.f72164d.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            android.os.IBinder readStrongBinder = obtain2.readStrongBinder();
            int i17 = o45.gg.f342933d;
            if (readStrongBinder == null) {
                fgVar = null;
            } else {
                android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
                fgVar = (queryLocalInterface == null || !(queryLocalInterface instanceof o45.hg)) ? new o45.fg(readStrongBinder) : (o45.hg) queryLocalInterface;
            }
            return fgVar;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.z0
    public o45.kg getRespObj() {
        o45.kg jgVar;
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
            this.f72164d.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            android.os.IBinder readStrongBinder = obtain2.readStrongBinder();
            int i17 = o45.ig.f342953d;
            if (readStrongBinder == null) {
                jgVar = null;
            } else {
                android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
                jgVar = (queryLocalInterface == null || !(queryLocalInterface instanceof o45.kg)) ? new o45.jg(readStrongBinder) : (o45.kg) queryLocalInterface;
            }
            return jgVar;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.z0
    public byte[] getTransHeader() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
            this.f72164d.transact(21, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createByteArray();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.z0
    public int getType() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
            this.f72164d.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.z0
    public java.lang.String getUri() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
            this.f72164d.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.z0
    public boolean isSingleSession() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
            this.f72164d.transact(15, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.z0
    public int o2() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
            this.f72164d.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.z0
    public com.tencent.mm.network.RespInfo of(byte[] bArr) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
            obtain.writeByteArray(bArr);
            this.f72164d.transact(32, obtain, obtain2, 0);
            obtain2.readException();
            return (com.tencent.mm.network.RespInfo) com.tencent.mm.network.y0.b(obtain2, com.tencent.mm.network.RespInfo.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.z0
    public java.lang.String s7() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
            this.f72164d.transact(23, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.z0
    public void setEncryptAlgo(int i17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
            obtain.writeInt(i17);
            this.f72164d.transact(24, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.z0
    public void setReqHost(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
            obtain.writeString(str);
            this.f72164d.transact(26, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.z0
    public void setSingleSession(boolean z17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
            obtain.writeInt(z17 ? 1 : 0);
            this.f72164d.transact(16, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.z0
    public java.lang.String vh() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
            this.f72164d.transact(22, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.z0
    public void wa(java.util.Map map) {
        final android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
            if (map == null) {
                obtain.writeInt(-1);
            } else {
                obtain.writeInt(map.size());
                map.forEach(new java.util.function.BiConsumer() { // from class: com.tencent.mm.network.x0$$a
                    @Override // java.util.function.BiConsumer
                    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                        android.os.Parcel parcel = obtain;
                        parcel.writeString((java.lang.String) obj);
                        parcel.writeString((java.lang.String) obj2);
                    }
                });
            }
            this.f72164d.transact(35, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
