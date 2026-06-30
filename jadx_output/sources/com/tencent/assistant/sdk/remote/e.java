package com.tencent.assistant.sdk.remote;

/* loaded from: classes13.dex */
public abstract class e extends android.os.Binder implements com.tencent.assistant.sdk.remote.f {
    private static final java.lang.String DESCRIPTOR = "com.tencent.assistant.sdk.SDKActionCallback";
    static final int TRANSACTION_onActionResult = 1;

    public e() {
        attachInterface(this, DESCRIPTOR);
    }

    public static com.tencent.assistant.sdk.remote.f asInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
        return (queryLocalInterface == null || !(queryLocalInterface instanceof com.tencent.assistant.sdk.remote.f)) ? new com.tencent.assistant.sdk.remote.d(iBinder) : (com.tencent.assistant.sdk.remote.f) queryLocalInterface;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 == 1) {
            parcel.enforceInterface(DESCRIPTOR);
            onActionResult(parcel.createByteArray());
            return true;
        }
        if (i17 != 1598968902) {
            return super.onTransact(i17, parcel, parcel2, i18);
        }
        parcel2.writeString(DESCRIPTOR);
        return true;
    }
}
