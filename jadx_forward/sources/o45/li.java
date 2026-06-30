package o45;

/* loaded from: classes12.dex */
public abstract class li extends android.os.Binder implements o45.mi {
    public li() {
        attachInterface(this, "com.tencent.mm.protocal.MMSyncCheckCoder_AIDL");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        byte[] mo13852xc3d7db06;
        long j17;
        if (i17 >= 1 && i17 <= 16777215) {
            parcel.enforceInterface("com.tencent.mm.protocal.MMSyncCheckCoder_AIDL");
        }
        if (i17 == 1598968902) {
            parcel2.writeString("com.tencent.mm.protocal.MMSyncCheckCoder_AIDL");
            return true;
        }
        if (i17 == 1) {
            gm0.r rVar = (gm0.r) this;
            byte[] bArr = null;
            if (gm0.j1.a()) {
                boolean a17 = o45.ji.a();
                w11.b2 b2Var = w11.c2.f523524a;
                if (a17) {
                    o45.fi fiVar = new o45.fi();
                    gm0.j1.i();
                    fiVar.f424462d = gm0.j1.b().h() & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
                    fiVar.f424459a = b2Var.a();
                    fiVar.f424460b = o45.a.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                    fiVar.f424461c = o45.a.b();
                    try {
                        mo13852xc3d7db06 = fiVar.mo13852xc3d7db06();
                        rVar.f354803d = fiVar.f424463e;
                    } catch (java.lang.Exception e17) {
                        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MMKernel.CoreNetwork", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                    }
                } else {
                    o45.gi giVar = new o45.gi();
                    gm0.j1.i();
                    giVar.f424471d = gm0.j1.b().h();
                    giVar.f424468a = b2Var.a();
                    giVar.f424469b = o45.a.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                    giVar.f424470c = o45.a.b();
                    try {
                        mo13852xc3d7db06 = giVar.mo13852xc3d7db06();
                        rVar.f354803d = giVar.f424472e;
                    } catch (java.lang.Exception e18) {
                        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MMKernel.CoreNetwork", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e18));
                    }
                }
                bArr = mo13852xc3d7db06;
            }
            parcel2.writeNoException();
            parcel2.writeByteArray(bArr);
        } else if (i17 == 2) {
            byte[] bArr2 = ((gm0.r) this).f354803d;
            parcel2.writeNoException();
            parcel2.writeByteArray(bArr2);
        } else {
            if (i17 != 3) {
                return super.onTransact(i17, parcel, parcel2, i18);
            }
            byte[] createByteArray = parcel.createByteArray();
            int i19 = 0;
            if (o45.ji.a()) {
                o45.hi hiVar = new o45.hi();
                try {
                    hiVar.mo13863x347f4535(createByteArray);
                    j17 = hiVar.f424480a;
                } catch (java.lang.Exception e19) {
                    boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MMKernel.CoreNetwork", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e19));
                }
            } else {
                o45.ii iiVar = new o45.ii();
                try {
                    iiVar.mo13863x347f4535(createByteArray);
                    j17 = iiVar.f424494a;
                } catch (java.lang.Exception e27) {
                    boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MMKernel.CoreNetwork", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e27));
                }
            }
            i19 = (int) j17;
            parcel2.writeNoException();
            parcel2.writeInt(i19);
        }
        return true;
    }
}
