package com.p3270x373cac.p3271x6232374;

/* renamed from: com.vivo.libra.ILibraSdk */
/* loaded from: classes13.dex */
public interface InterfaceC28080x7e7a078f extends android.os.IInterface {

    /* renamed from: com.vivo.libra.ILibraSdk$Proxy */
    /* loaded from: classes13.dex */
    public static final class Proxy implements com.p3270x373cac.p3271x6232374.InterfaceC28080x7e7a078f {

        /* renamed from: DESCRIPTOR */
        private static final java.lang.String f65805xf04ebf6f = "metric_sdk_server";
        private static final java.lang.String TAG = "libra_sdk";

        /* renamed from: sProxy */
        private static com.p3270x373cac.p3271x6232374.InterfaceC28080x7e7a078f.Proxy f65806xc8da29bb;

        /* renamed from: mRemote */
        private android.os.IBinder f65809x17b71f13;

        /* renamed from: mHashCode */
        private java.lang.String f65807x2dcb53a8 = null;

        /* renamed from: mSupports */
        private final java.util.Map<java.lang.String, java.lang.String> f65810xc1db2211 = new java.util.HashMap();

        /* renamed from: mLibraDeathRecipient */
        private final com.p3270x373cac.p3271x6232374.InterfaceC28080x7e7a078f.Proxy.LibraDeathRecipient f65808xf2764ec = new com.p3270x373cac.p3271x6232374.InterfaceC28080x7e7a078f.Proxy.LibraDeathRecipient();

        /* renamed from: mTryRun */
        private final java.lang.Runnable f65811x1bdd099d = new java.lang.Runnable() { // from class: com.vivo.libra.ILibraSdk$Proxy$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p3270x373cac.p3271x6232374.InterfaceC28080x7e7a078f.Proxy.this.m122356xf383bbdc();
            }
        };

        /* renamed from: com.vivo.libra.ILibraSdk$Proxy$LibraDeathRecipient */
        /* loaded from: classes13.dex */
        public final class LibraDeathRecipient implements android.os.IBinder.DeathRecipient {
            private LibraDeathRecipient() {
            }

            @Override // android.os.IBinder.DeathRecipient
            public void binderDied() {
                com.p3270x373cac.p3271x6232374.InterfaceC28080x7e7a078f.Proxy.this.f65809x17b71f13.unlinkToDeath(this, 0);
                new android.os.Handler().postDelayed(com.p3270x373cac.p3271x6232374.InterfaceC28080x7e7a078f.Proxy.this.f65811x1bdd099d, 1000L);
            }
        }

        public Proxy(android.os.IBinder iBinder) {
            this.f65809x17b71f13 = iBinder;
        }

        /* renamed from: asInterfaces */
        public static com.p3270x373cac.p3271x6232374.InterfaceC28080x7e7a078f m122354xe4960c2c() {
            com.p3270x373cac.p3271x6232374.InterfaceC28080x7e7a078f.Proxy proxy;
            android.os.IBinder m122355x72a6408d;
            synchronized (f65805xf04ebf6f) {
                if (f65806xc8da29bb == null && (m122355x72a6408d = m122355x72a6408d(f65805xf04ebf6f)) != null) {
                    f65806xc8da29bb = new com.p3270x373cac.p3271x6232374.InterfaceC28080x7e7a078f.Proxy(m122355x72a6408d);
                }
                proxy = f65806xc8da29bb;
            }
            return proxy;
        }

        /* renamed from: checkService */
        private static android.os.IBinder m122355x72a6408d(java.lang.String str) {
            try {
                return (android.os.IBinder) java.lang.Class.forName("android.os.ServiceManager").getMethod("checkService", java.lang.String.class).invoke(null, str);
            } catch (java.lang.Exception e17) {
                e17.getMessage();
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: tryReconnect */
        public boolean m122356xf383bbdc() {
            android.os.IBinder m122355x72a6408d = m122355x72a6408d(f65805xf04ebf6f);
            if (m122355x72a6408d == null) {
                return false;
            }
            this.f65809x17b71f13 = m122355x72a6408d;
            return mo122349x28e6dcf7(this.f65807x2dcb53a8);
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this.f65809x17b71f13;
        }

        @Override // com.p3270x373cac.p3271x6232374.InterfaceC28080x7e7a078f
        /* renamed from: checkPermission */
        public boolean mo122349x28e6dcf7(java.lang.String str) {
            android.os.Parcel obtain = android.os.Parcel.obtain();
            android.os.Parcel obtain2 = android.os.Parcel.obtain();
            try {
                obtain.writeString(str);
                this.f65809x17b71f13.transact(4, obtain, obtain2, 0);
                obtain2.readException();
                boolean readBoolean = obtain2.readBoolean();
                if (readBoolean) {
                    this.f65807x2dcb53a8 = str;
                    this.f65809x17b71f13.linkToDeath(this.f65808xf2764ec, 0);
                    java.lang.String[] createStringArray = obtain2.createStringArray();
                    if (createStringArray != null && createStringArray.length > 0) {
                        for (java.lang.String str2 : createStringArray) {
                            this.f65810xc1db2211.put(str2, str2);
                        }
                        java.util.Objects.toString(this.f65810xc1db2211.keySet());
                    }
                }
                return readBoolean;
            } catch (android.os.RemoteException unused) {
                m122356xf383bbdc();
                return false;
            } finally {
                obtain.recycle();
                obtain2.recycle();
            }
        }

        @Override // com.p3270x373cac.p3271x6232374.InterfaceC28080x7e7a078f
        /* renamed from: getIntResult */
        public int mo122350xfc45ce36(java.lang.String str) {
            int mo122350xfc45ce36;
            if (!this.f65810xc1db2211.containsKey(str)) {
                return -2740;
            }
            android.os.Parcel obtain = android.os.Parcel.obtain();
            android.os.Parcel obtain2 = android.os.Parcel.obtain();
            try {
                try {
                    obtain.writeString(str);
                    this.f65809x17b71f13.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    mo122350xfc45ce36 = obtain2.readInt();
                } catch (android.os.RemoteException unused) {
                    if (m122356xf383bbdc()) {
                        mo122350xfc45ce36 = mo122350xfc45ce36(str);
                    }
                    return -2740;
                } catch (java.lang.Exception unused2) {
                    return -2740;
                }
                return mo122350xfc45ce36;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Override // com.p3270x373cac.p3271x6232374.InterfaceC28080x7e7a078f
        /* renamed from: hasFun */
        public boolean mo122351xb7044485(java.lang.String str) {
            if (str == null) {
                return false;
            }
            return this.f65810xc1db2211.containsKey(str);
        }
    }

    /* renamed from: checkPermission */
    boolean mo122349x28e6dcf7(java.lang.String str);

    /* renamed from: getIntResult */
    int mo122350xfc45ce36(java.lang.String str);

    /* renamed from: hasFun */
    boolean mo122351xb7044485(java.lang.String str);
}
