package fv1;

/* loaded from: classes8.dex */
public class d implements fv1.f {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f348504d;

    public d(android.os.IBinder iBinder) {
        this.f348504d = iBinder;
    }

    @Override // fv1.f
    public void L2(java.lang.String str, int i17, int i18, java.lang.String str2) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadServiceCallback");
            obtain.writeString(str);
            obtain.writeInt(i17);
            obtain.writeInt(i18);
            obtain.writeString(str2);
            this.f348504d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // fv1.f
    public void Ue(java.lang.String str, long j17, long j18) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadServiceCallback");
            obtain.writeString(str);
            obtain.writeLong(j17);
            obtain.writeLong(j18);
            this.f348504d.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f348504d;
    }
}
