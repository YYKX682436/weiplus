package qc3;

/* loaded from: classes7.dex */
public class a implements qc3.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f443043d;

    public a(android.os.IBinder iBinder) {
        this.f443043d = iBinder;
    }

    @Override // qc3.c
    public void B8(int i17, int i18, int i19, int i27, int i28, int i29) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.core.api.IMBClient");
            obtain.writeInt(i17);
            obtain.writeInt(i18);
            obtain.writeInt(i19);
            obtain.writeInt(i27);
            obtain.writeInt(i28);
            obtain.writeInt(i29);
            this.f443043d.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // qc3.c
    public void Bi(int i17, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.core.api.IMBClient");
            obtain.writeInt(i17);
            obtain.writeFloatArray(fArr);
            obtain.writeFloatArray(fArr2);
            obtain.writeFloatArray(fArr3);
            obtain.writeFloatArray(fArr4);
            this.f443043d.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // qc3.c
    public void C3(int i17, int i18, int i19, int i27, int i28, int i29) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.core.api.IMBClient");
            obtain.writeInt(i17);
            obtain.writeInt(i18);
            obtain.writeInt(i19);
            obtain.writeInt(i27);
            obtain.writeInt(i28);
            obtain.writeInt(i29);
            this.f443043d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // qc3.c
    public void Da(boolean z17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.core.api.IMBClient");
            obtain.writeInt(z17 ? 1 : 0);
            this.f443043d.transact(11, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // qc3.c
    public void F2(int i17, java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.core.api.IMBClient");
            obtain.writeInt(i17);
            obtain.writeString(str);
            this.f443043d.transact(14, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // qc3.c
    public void K3(int i17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.core.api.IMBClient");
            obtain.writeInt(i17);
            this.f443043d.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // qc3.c
    public void Ke(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.core.api.IMBClient");
            obtain.writeString(str);
            this.f443043d.transact(12, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // qc3.c
    public void Oe() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.core.api.IMBClient");
            this.f443043d.transact(15, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f443043d;
    }

    @Override // qc3.c
    public void c(int i17, boolean z17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.core.api.IMBClient");
            obtain.writeInt(i17);
            obtain.writeInt(z17 ? 1 : 0);
            this.f443043d.transact(5, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // qc3.c
    public void h(java.lang.String str, java.lang.String str2) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.core.api.IMBClient");
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f443043d.transact(13, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // qc3.c
    public java.lang.String ih(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.core.api.IMBClient");
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            this.f443043d.transact(9, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // qc3.c
    public void j6(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.core.api.IMBClient");
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeInt(i17);
            this.f443043d.transact(10, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // qc3.c
    public void n() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.core.api.IMBClient");
            this.f443043d.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // qc3.c
    /* renamed from: onCreated */
    public void mo159828x8cf48009() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.core.api.IMBClient");
            this.f443043d.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // qc3.c
    /* renamed from: onDestroy */
    public void mo159829xac79a11b() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.core.api.IMBClient");
            this.f443043d.transact(8, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
