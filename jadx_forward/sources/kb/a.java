package kb;

/* loaded from: classes15.dex */
public class a implements kb.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f387717d;

    public a(android.os.IBinder iBinder) {
        this.f387717d = iBinder;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f387717d;
    }

    public java.lang.String d(java.util.Map map) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.hihonor.wallet.sdk.ISmartcardOpenService");
            obtain.writeMap(map);
            this.f387717d.transact(7, obtain, obtain2, 0);
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
            obtain.writeInterfaceToken("com.hihonor.wallet.sdk.ISmartcardOpenService");
            obtain.writeMap(map);
            this.f387717d.transact(6, obtain, obtain2, 0);
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
            obtain.writeInterfaceToken("com.hihonor.wallet.sdk.ISmartcardOpenService");
            this.f387717d.transact(11, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public java.lang.String k(java.util.Map map) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.hihonor.wallet.sdk.ISmartcardOpenService");
            obtain.writeMap(map);
            this.f387717d.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public java.lang.String l() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.hihonor.wallet.sdk.ISmartcardOpenService");
            this.f387717d.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public java.lang.String p(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.hihonor.wallet.sdk.ISmartcardOpenService");
            obtain.writeString(str);
            obtain.writeInt(i17);
            obtain.writeString(str2);
            obtain.writeString(str3);
            this.f387717d.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public java.lang.String w(java.util.Map map) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.hihonor.wallet.sdk.ISmartcardOpenService");
            obtain.writeMap(map);
            this.f387717d.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
