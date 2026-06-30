package com.p314xaae8f345.mm.p971x6de15a2e;

/* loaded from: classes12.dex */
public class x0 implements com.p314xaae8f345.mm.p971x6de15a2e.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f153697d;

    public x0(android.os.IBinder iBinder) {
        this.f153697d = iBinder;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.z0
    public com.p314xaae8f345.mm.p971x6de15a2e.C11181xa473aa4c Ag(int i17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
            obtain.writeInt(i17);
            this.f153697d.transact(31, obtain, obtain2, 0);
            obtain2.readException();
            return (com.p314xaae8f345.mm.p971x6de15a2e.C11181xa473aa4c) com.p314xaae8f345.mm.p971x6de15a2e.y0.b(obtain2, com.p314xaae8f345.mm.p971x6de15a2e.C11181xa473aa4c.f32684x681a0c0c);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.z0
    public void Bg(com.p314xaae8f345.mm.p971x6de15a2e.k0 k0Var, int i17, int i18) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
            obtain.writeStrongInterface(k0Var);
            obtain.writeInt(i17);
            obtain.writeInt(i18);
            this.f153697d.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.z0
    public com.p314xaae8f345.mm.p971x6de15a2e.C11179xb34d72a2 Cc(int i17, byte[] bArr) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
            obtain.writeInt(i17);
            obtain.writeByteArray(bArr);
            this.f153697d.transact(34, obtain, obtain2, 0);
            obtain2.readException();
            return (com.p314xaae8f345.mm.p971x6de15a2e.C11179xb34d72a2) com.p314xaae8f345.mm.p971x6de15a2e.y0.b(obtain2, com.p314xaae8f345.mm.p971x6de15a2e.C11179xb34d72a2.f32588x681a0c0c);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.z0
    public void G2(com.p314xaae8f345.mm.p971x6de15a2e.k0 k0Var, int i17, int i18, java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
            obtain.writeStrongInterface(k0Var);
            obtain.writeInt(i17);
            obtain.writeInt(i18);
            obtain.writeString(str);
            this.f153697d.transact(11, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.z0
    public com.p314xaae8f345.mm.p971x6de15a2e.C11181xa473aa4c Qc() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
            this.f153697d.transact(30, obtain, obtain2, 0);
            obtain2.readException();
            return (com.p314xaae8f345.mm.p971x6de15a2e.C11181xa473aa4c) com.p314xaae8f345.mm.p971x6de15a2e.y0.b(obtain2, com.p314xaae8f345.mm.p971x6de15a2e.C11181xa473aa4c.f32684x681a0c0c);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.z0
    public void Re(com.p314xaae8f345.mm.p971x6de15a2e.r rVar, com.p314xaae8f345.mm.p971x6de15a2e.k0 k0Var, int i17, int i18) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
            obtain.writeStrongInterface(rVar);
            obtain.writeStrongInterface(k0Var);
            obtain.writeInt(i17);
            obtain.writeInt(i18);
            this.f153697d.transact(12, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.z0
    public void S6(int i17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
            obtain.writeInt(i17);
            this.f153697d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.z0
    public int Zc() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
            this.f153697d.transact(13, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f153697d;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.z0
    public com.p314xaae8f345.mm.p971x6de15a2e.C11182x1668226 g9(int i17, byte[] bArr, java.lang.String str, int i18, int i19, int i27, int i28, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i29, boolean z17, byte[] bArr5, boolean z18, int i37, boolean z19, boolean z27, boolean z28) {
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
                this.f153697d.transact(33, obtain, obtain2, 0);
                obtain2.readException();
                com.p314xaae8f345.mm.p971x6de15a2e.C11182x1668226 c11182x1668226 = (com.p314xaae8f345.mm.p971x6de15a2e.C11182x1668226) com.p314xaae8f345.mm.p971x6de15a2e.y0.b(obtain2, com.p314xaae8f345.mm.p971x6de15a2e.C11182x1668226.f32685x681a0c0c);
                obtain2.recycle();
                obtain.recycle();
                return c11182x1668226;
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

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.z0
    /* renamed from: getNewExtFlags */
    public int mo48048xb6805570() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
            this.f153697d.transact(20, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.z0
    /* renamed from: getReqObj */
    public o45.hg mo48049x2d63726f() {
        o45.hg fgVar;
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
            this.f153697d.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            android.os.IBinder readStrongBinder = obtain2.readStrongBinder();
            int i17 = o45.gg.f424466d;
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

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.z0
    /* renamed from: getRespObj */
    public o45.kg mo48050x7f35c2d1() {
        o45.kg jgVar;
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
            this.f153697d.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            android.os.IBinder readStrongBinder = obtain2.readStrongBinder();
            int i17 = o45.ig.f424486d;
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

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.z0
    /* renamed from: getTransHeader */
    public byte[] mo48051x2ee16a1f() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
            this.f153697d.transact(21, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createByteArray();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.z0
    /* renamed from: getType */
    public int mo48052xfb85f7b0() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
            this.f153697d.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.z0
    /* renamed from: getUri */
    public java.lang.String mo48053xb5887636() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
            this.f153697d.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.z0
    /* renamed from: isSingleSession */
    public boolean mo48054x74080c24() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
            this.f153697d.transact(15, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.z0
    public int o2() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
            this.f153697d.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.z0
    public com.p314xaae8f345.mm.p971x6de15a2e.C11183xef8030be of(byte[] bArr) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
            obtain.writeByteArray(bArr);
            this.f153697d.transact(32, obtain, obtain2, 0);
            obtain2.readException();
            return (com.p314xaae8f345.mm.p971x6de15a2e.C11183xef8030be) com.p314xaae8f345.mm.p971x6de15a2e.y0.b(obtain2, com.p314xaae8f345.mm.p971x6de15a2e.C11183xef8030be.f32686x681a0c0c);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.z0
    public java.lang.String s7() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
            this.f153697d.transact(23, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.z0
    /* renamed from: setEncryptAlgo */
    public void mo48055x85346096(int i17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
            obtain.writeInt(i17);
            this.f153697d.transact(24, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.z0
    /* renamed from: setReqHost */
    public void mo48056xf2792ca4(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
            obtain.writeString(str);
            this.f153697d.transact(26, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.z0
    /* renamed from: setSingleSession */
    public void mo48057x42fed7ec(boolean z17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
            obtain.writeInt(z17 ? 1 : 0);
            this.f153697d.transact(16, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.z0
    public java.lang.String vh() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
            this.f153697d.transact(22, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.z0
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
            this.f153697d.transact(35, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
