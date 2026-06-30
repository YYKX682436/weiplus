package b8;

/* loaded from: classes15.dex */
public class a implements b8.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f99771d;

    public a(android.os.IBinder iBinder) {
        this.f99771d = iBinder;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f99771d;
    }

    public java.lang.String d(java.util.Map map) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.finshell.wallet.nfc.transit.IPostPayOpenService");
            obtain.writeMap(map);
            this.f99771d.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public java.lang.String e(java.util.Map map) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.finshell.wallet.nfc.transit.IPostPayOpenService");
            obtain.writeMap(map);
            this.f99771d.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public java.lang.String g(java.util.Map map) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.finshell.wallet.nfc.transit.IPostPayOpenService");
            obtain.writeMap(map);
            this.f99771d.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public java.lang.String j() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.finshell.wallet.nfc.transit.IPostPayOpenService");
            this.f99771d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public java.lang.String k() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.finshell.wallet.nfc.transit.IPostPayOpenService");
            this.f99771d.transact(8, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public java.lang.String l(java.util.Map map) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.finshell.wallet.nfc.transit.IPostPayOpenService");
            obtain.writeMap(map);
            this.f99771d.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public java.lang.String p(java.util.Map map) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.finshell.wallet.nfc.transit.IPostPayOpenService");
            obtain.writeMap(map);
            this.f99771d.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
