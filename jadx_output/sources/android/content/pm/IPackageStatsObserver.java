package android.content.pm;

/* loaded from: classes15.dex */
public interface IPackageStatsObserver extends android.os.IInterface {

    /* loaded from: classes15.dex */
    public static abstract class Stub extends android.os.Binder implements android.content.pm.IPackageStatsObserver {
        private static final java.lang.String DESCRIPTOR = "IPackageStatsObserver";
        static final int TRANSACTION_onGetStatsCompleted = 1;

        /* loaded from: classes15.dex */
        public static class Proxy implements android.content.pm.IPackageStatsObserver {
            private android.os.IBinder mRemote;

            public Proxy(android.os.IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            public java.lang.String getInterfaceDescriptor() {
                return android.content.pm.IPackageStatsObserver.Stub.DESCRIPTOR;
            }

            @Override // android.content.pm.IPackageStatsObserver
            public void onGetStatsCompleted(android.content.pm.PackageStats packageStats, boolean z17) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.content.pm.IPackageStatsObserver.Stub.DESCRIPTOR);
                    if (packageStats != null) {
                        obtain.writeInt(1);
                        packageStats.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(z17 ? 1 : 0);
                    this.mRemote.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static android.content.pm.IPackageStatsObserver asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof android.content.pm.IPackageStatsObserver)) ? new android.content.pm.IPackageStatsObserver.Stub.Proxy(iBinder) : (android.content.pm.IPackageStatsObserver) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
            if (i17 == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onGetStatsCompleted(parcel.readInt() != 0 ? (android.content.pm.PackageStats) android.content.pm.PackageStats.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
                return true;
            }
            if (i17 != 1598968902) {
                return super.onTransact(i17, parcel, parcel2, i18);
            }
            parcel2.writeString(DESCRIPTOR);
            return true;
        }
    }

    void onGetStatsCompleted(android.content.pm.PackageStats packageStats, boolean z17);
}
