package com.hihonor.easygo.callback;

/* loaded from: classes8.dex */
public interface IEasyGoCallback extends android.os.IInterface {

    /* loaded from: classes8.dex */
    public static class Default implements com.hihonor.easygo.callback.IEasyGoCallback {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // com.hihonor.easygo.callback.IEasyGoCallback
        public void callback(int i17, android.os.Bundle bundle) {
        }
    }

    /* loaded from: classes13.dex */
    public static abstract class Stub extends android.os.Binder implements com.hihonor.easygo.callback.IEasyGoCallback {
        private static final java.lang.String DESCRIPTOR = "com.hihonor.easygo.callback.IEasyGoCallback";
        static final int TRANSACTION_callback = 1;

        /* loaded from: classes13.dex */
        public static class Proxy implements com.hihonor.easygo.callback.IEasyGoCallback {
            public static com.hihonor.easygo.callback.IEasyGoCallback sDefaultImpl;
            private android.os.IBinder mRemote;

            public Proxy(android.os.IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.hihonor.easygo.callback.IEasyGoCallback
            public void callback(int i17, android.os.Bundle bundle) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.hihonor.easygo.callback.IEasyGoCallback.Stub.DESCRIPTOR);
                    obtain.writeInt(i17);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || com.hihonor.easygo.callback.IEasyGoCallback.Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        com.hihonor.easygo.callback.IEasyGoCallback.Stub.getDefaultImpl().callback(i17, bundle);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public java.lang.String getInterfaceDescriptor() {
                return com.hihonor.easygo.callback.IEasyGoCallback.Stub.DESCRIPTOR;
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static com.hihonor.easygo.callback.IEasyGoCallback asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof com.hihonor.easygo.callback.IEasyGoCallback)) ? new com.hihonor.easygo.callback.IEasyGoCallback.Stub.Proxy(iBinder) : (com.hihonor.easygo.callback.IEasyGoCallback) queryLocalInterface;
        }

        public static com.hihonor.easygo.callback.IEasyGoCallback getDefaultImpl() {
            return com.hihonor.easygo.callback.IEasyGoCallback.Stub.Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(com.hihonor.easygo.callback.IEasyGoCallback iEasyGoCallback) {
            if (com.hihonor.easygo.callback.IEasyGoCallback.Stub.Proxy.sDefaultImpl != null || iEasyGoCallback == null) {
                return false;
            }
            com.hihonor.easygo.callback.IEasyGoCallback.Stub.Proxy.sDefaultImpl = iEasyGoCallback;
            return true;
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
            if (i17 != 1) {
                if (i17 != 1598968902) {
                    return super.onTransact(i17, parcel, parcel2, i18);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            callback(parcel.readInt(), parcel.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }
    }

    void callback(int i17, android.os.Bundle bundle);
}
