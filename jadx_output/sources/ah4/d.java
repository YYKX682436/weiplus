package ah4;

/* loaded from: classes13.dex */
public class d implements com.tencent.mm.plugin.talkroom.component.ILiveConEngineCallback_AIDL {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f4999d;

    public d(android.os.IBinder iBinder) {
        this.f4999d = iBinder;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f4999d;
    }

    @Override // com.tencent.mm.plugin.talkroom.component.ILiveConEngineCallback_AIDL
    public void keep_OnError(int i17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.ILiveConEngineCallback_AIDL");
            obtain.writeInt(i17);
            this.f4999d.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.plugin.talkroom.component.ILiveConEngineCallback_AIDL
    public void keep_OnOpenSuccess() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.ILiveConEngineCallback_AIDL");
            this.f4999d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
