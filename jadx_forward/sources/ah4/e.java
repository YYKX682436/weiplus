package ah4;

/* loaded from: classes13.dex */
public abstract class e extends android.os.Binder implements com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.p2255xac8f1cfd.InterfaceC18546xdab69d9b {
    public e() {
        attachInterface(this, "com.tencent.mm.plugin.talkroom.component.ILiveConEngineCallback_AIDL");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.p2255xac8f1cfd.InterfaceC18546xdab69d9b
    /* renamed from: keep_OnError */
    public abstract /* synthetic */ void mo2061xd3b7bc8f(int i17);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.p2255xac8f1cfd.InterfaceC18546xdab69d9b
    /* renamed from: keep_OnOpenSuccess */
    public abstract /* synthetic */ void mo2062xecfe93a0();

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
            mo2062xecfe93a0();
            parcel2.writeNoException();
        } else {
            if (i17 != 2) {
                return super.onTransact(i17, parcel, parcel2, i18);
            }
            mo2061xd3b7bc8f(parcel.readInt());
            parcel2.writeNoException();
        }
        return true;
    }
}
