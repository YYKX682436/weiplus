package com.p314xaae8f345.mm.p971x6de15a2e;

/* loaded from: classes13.dex */
public abstract class g0 extends android.os.Binder implements com.p314xaae8f345.mm.p971x6de15a2e.h0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f153519d = 0;

    public g0() {
        attachInterface(this, "com.tencent.mm.network.INetworkEvent_AIDL");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        int i19;
        if (i17 >= 1 && i17 <= 16777215) {
            parcel.enforceInterface("com.tencent.mm.network.INetworkEvent_AIDL");
        }
        if (i17 == 1598968902) {
            parcel2.writeString("com.tencent.mm.network.INetworkEvent_AIDL");
            return true;
        }
        if (i17 == 1) {
            int Wh = ((com.p314xaae8f345.mm.p971x6de15a2e.a3) this).Wh();
            parcel2.writeNoException();
            parcel2.writeInt(Wh);
        } else if (i17 == 2) {
            ((com.p314xaae8f345.mm.p971x6de15a2e.a3) this).q5(com.p314xaae8f345.mm.p971x6de15a2e.r0.m48355xbd0d1927(parcel.readStrongBinder()));
            parcel2.writeNoException();
            parcel2.writeInt(1);
        } else if (i17 == 3) {
            try {
                i19 = ((com.p314xaae8f345.mm.p971x6de15a2e.a3) this).f153498g.unregister(com.p314xaae8f345.mm.p971x6de15a2e.r0.m48355xbd0d1927(parcel.readStrongBinder()));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetworkEvent", "removeListener %s", e17);
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetworkEvent", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                i19 = 0;
            }
            parcel2.writeNoException();
            parcel2.writeInt(i19);
        } else if (i17 == 4) {
            ((com.p314xaae8f345.mm.p971x6de15a2e.a3) this).f153498g.kill();
            parcel2.writeNoException();
        } else {
            if (i17 != 5) {
                return super.onTransact(i17, parcel, parcel2, i18);
            }
            parcel2.writeNoException();
            parcel2.writeLong(0L);
        }
        return true;
    }
}
