package ah4;

/* loaded from: classes13.dex */
public abstract class e extends android.os.Binder implements com.tencent.mm.plugin.talkroom.component.ILiveConEngineCallback_AIDL {
    public e() {
        attachInterface(this, "com.tencent.mm.plugin.talkroom.component.ILiveConEngineCallback_AIDL");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // com.tencent.mm.plugin.talkroom.component.ILiveConEngineCallback_AIDL
    public abstract /* synthetic */ void keep_OnError(int i17);

    @Override // com.tencent.mm.plugin.talkroom.component.ILiveConEngineCallback_AIDL
    public abstract /* synthetic */ void keep_OnOpenSuccess();

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 >= 1 && i17 <= 16777215) {
            parcel.enforceInterface("com.tencent.mm.plugin.talkroom.component.ILiveConEngineCallback_AIDL");
        }
        if (i17 == 1598968902) {
            parcel2.writeString("com.tencent.mm.plugin.talkroom.component.ILiveConEngineCallback_AIDL");
            return true;
        }
        if (i17 == 1) {
            keep_OnOpenSuccess();
            parcel2.writeNoException();
        } else {
            if (i17 != 2) {
                return super.onTransact(i17, parcel, parcel2, i18);
            }
            keep_OnError(parcel.readInt());
            parcel2.writeNoException();
        }
        return true;
    }
}
