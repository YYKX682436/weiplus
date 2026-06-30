package com.tencent.mm.network;

/* loaded from: classes13.dex */
public abstract class g0 extends android.os.Binder implements com.tencent.mm.network.h0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f71986d = 0;

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
            int Wh = ((com.tencent.mm.network.a3) this).Wh();
            parcel2.writeNoException();
            parcel2.writeInt(Wh);
        } else if (i17 == 2) {
            ((com.tencent.mm.network.a3) this).q5(com.tencent.mm.network.r0.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
            parcel2.writeInt(1);
        } else if (i17 == 3) {
            try {
                i19 = ((com.tencent.mm.network.a3) this).f71965g.unregister(com.tencent.mm.network.r0.asInterface(parcel.readStrongBinder()));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetworkEvent", "removeListener %s", e17);
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.NetworkEvent", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                i19 = 0;
            }
            parcel2.writeNoException();
            parcel2.writeInt(i19);
        } else if (i17 == 4) {
            ((com.tencent.mm.network.a3) this).f71965g.kill();
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
