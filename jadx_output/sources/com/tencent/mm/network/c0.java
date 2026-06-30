package com.tencent.mm.network;

/* loaded from: classes12.dex */
public class c0 implements com.tencent.mm.network.e0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f71972d;

    public c0(android.os.IBinder iBinder) {
        this.f71972d = iBinder;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f71972d;
    }

    @Override // com.tencent.mm.network.e0
    public void networkAnalysisCallBack(int i17, int i18, boolean z17, java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.INetworkDiagnoseCallback_AIDL");
            obtain.writeInt(i17);
            obtain.writeInt(i18);
            obtain.writeInt(z17 ? 1 : 0);
            obtain.writeString(str);
            this.f71972d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
