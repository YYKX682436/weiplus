package lb;

/* loaded from: classes15.dex */
public class j implements lb.l {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f399195d;

    public j(android.os.IBinder iBinder) {
        this.f399195d = iBinder;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f399195d;
    }

    public java.lang.String d(java.util.Map map) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.huawei.nfc.sdk.service.IHwTransitOpenService");
            obtain.writeMap(map);
            this.f399195d.transact(10, obtain, obtain2, 0);
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
            obtain.writeInterfaceToken("com.huawei.nfc.sdk.service.IHwTransitOpenService");
            obtain.writeMap(map);
            this.f399195d.transact(8, obtain, obtain2, 0);
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
            obtain.writeInterfaceToken("com.huawei.nfc.sdk.service.IHwTransitOpenService");
            obtain.writeMap(map);
            this.f399195d.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public java.lang.String j(java.util.Map map) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.huawei.nfc.sdk.service.IHwTransitOpenService");
            obtain.writeMap(map);
            this.f399195d.transact(4, obtain, obtain2, 0);
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
            obtain.writeInterfaceToken("com.huawei.nfc.sdk.service.IHwTransitOpenService");
            obtain.writeMap(map);
            this.f399195d.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public java.lang.String l(java.lang.String str, int i17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.huawei.nfc.sdk.service.IHwTransitOpenService");
            obtain.writeString(str);
            obtain.writeInt(i17);
            this.f399195d.transact(6, obtain, obtain2, 0);
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
            obtain.writeInterfaceToken("com.huawei.nfc.sdk.service.IHwTransitOpenService");
            obtain.writeMap(map);
            this.f399195d.transact(5, obtain, obtain2, 0);
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
            obtain.writeInterfaceToken("com.huawei.nfc.sdk.service.IHwTransitOpenService");
            obtain.writeMap(map);
            this.f399195d.transact(9, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
