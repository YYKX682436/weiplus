package com.p314xaae8f345.p3106xb8dca993.p3107x649df65;

/* loaded from: classes8.dex */
public interface i extends android.os.IInterface {

    /* loaded from: classes8.dex */
    public static abstract class a extends android.os.Binder implements com.p314xaae8f345.p3106xb8dca993.p3107x649df65.i {
        public a() {
            attachInterface(this, "com.hihonor.cloudservice.oaid.IOAIDCallBack");
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
            if (i17 == 1) {
                parcel.enforceInterface("com.hihonor.cloudservice.oaid.IOAIDCallBack");
                a(parcel.readInt(), parcel.readLong(), parcel.readInt() != 0, parcel.readFloat(), parcel.readDouble(), parcel.readString());
                if (parcel2 != null) {
                    parcel2.writeNoException();
                }
                return true;
            }
            if (i17 == 2) {
                parcel.enforceInterface("com.hihonor.cloudservice.oaid.IOAIDCallBack");
                a(parcel.readInt(), parcel.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcel) : null);
                if (parcel2 != null) {
                    parcel2.writeNoException();
                }
                return true;
            }
            if (i17 == 1598968902) {
                parcel.enforceInterface("com.hihonor.cloudservice.oaid.IOAIDCallBack");
                return true;
            }
            try {
                return super.onTransact(i17, parcel, parcel2, i18);
            } catch (android.os.RemoteException e17) {
                com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.a("honor onTransact exception." + e17.toString());
                return false;
            }
        }
    }

    void a(int i17, long j17, boolean z17, float f17, double d17, java.lang.String str);

    void a(int i17, android.os.Bundle bundle);
}
