package vh0;

/* loaded from: classes7.dex */
public class w0 implements vh0.y0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f518524d;

    public w0(android.os.IBinder iBinder) {
        this.f518524d = iBinder;
    }

    @Override // vh0.y0
    public void Ah(java.lang.String str, long j17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.feature.yuanbao.IPCChattingUICallback");
            obtain.writeString(str);
            obtain.writeLong(j17);
            this.f518524d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f518524d;
    }

    @Override // vh0.y0
    /* renamed from: onCancel */
    public void mo172110x3d6f0539() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.feature.yuanbao.IPCChattingUICallback");
            this.f518524d.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
