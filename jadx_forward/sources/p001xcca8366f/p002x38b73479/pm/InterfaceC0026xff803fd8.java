package p001xcca8366f.p002x38b73479.pm;

/* renamed from: android.content.pm.IPackageStatsObserver */
/* loaded from: classes15.dex */
public interface InterfaceC0026xff803fd8 extends android.os.IInterface {

    /* renamed from: android.content.pm.IPackageStatsObserver$Stub */
    /* loaded from: classes15.dex */
    public static abstract class Stub extends android.os.Binder implements p001xcca8366f.p002x38b73479.pm.InterfaceC0026xff803fd8 {

        /* renamed from: DESCRIPTOR */
        private static final java.lang.String f57xf04ebf6f = "IPackageStatsObserver";

        /* renamed from: TRANSACTION_onGetStatsCompleted */
        static final int f58x807d642 = 1;

        /* renamed from: android.content.pm.IPackageStatsObserver$Stub$Proxy */
        /* loaded from: classes15.dex */
        public static class Proxy implements p001xcca8366f.p002x38b73479.pm.InterfaceC0026xff803fd8 {

            /* renamed from: mRemote */
            private android.os.IBinder f59x17b71f13;

            public Proxy(android.os.IBinder iBinder) {
                this.f59x17b71f13 = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.f59x17b71f13;
            }

            /* renamed from: getInterfaceDescriptor */
            public java.lang.String m2431x19238652() {
                return p001xcca8366f.p002x38b73479.pm.InterfaceC0026xff803fd8.Stub.f57xf04ebf6f;
            }

            @Override // p001xcca8366f.p002x38b73479.pm.InterfaceC0026xff803fd8
            /* renamed from: onGetStatsCompleted */
            public void mo2429x49adad43(android.content.pm.PackageStats packageStats, boolean z17) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(p001xcca8366f.p002x38b73479.pm.InterfaceC0026xff803fd8.Stub.f57xf04ebf6f);
                    if (packageStats != null) {
                        obtain.writeInt(1);
                        packageStats.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(z17 ? 1 : 0);
                    this.f59x17b71f13.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, f57xf04ebf6f);
        }

        /* renamed from: asInterface */
        public static p001xcca8366f.p002x38b73479.pm.InterfaceC0026xff803fd8 m2430xbd0d1927(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(f57xf04ebf6f);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof p001xcca8366f.p002x38b73479.pm.InterfaceC0026xff803fd8)) ? new p001xcca8366f.p002x38b73479.pm.InterfaceC0026xff803fd8.Stub.Proxy(iBinder) : (p001xcca8366f.p002x38b73479.pm.InterfaceC0026xff803fd8) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
            if (i17 == 1) {
                parcel.enforceInterface(f57xf04ebf6f);
                mo2429x49adad43(parcel.readInt() != 0 ? (android.content.pm.PackageStats) android.content.pm.PackageStats.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
                return true;
            }
            if (i17 != 1598968902) {
                return super.onTransact(i17, parcel, parcel2, i18);
            }
            parcel2.writeString(f57xf04ebf6f);
            return true;
        }
    }

    /* renamed from: onGetStatsCompleted */
    void mo2429x49adad43(android.content.pm.PackageStats packageStats, boolean z17);
}
