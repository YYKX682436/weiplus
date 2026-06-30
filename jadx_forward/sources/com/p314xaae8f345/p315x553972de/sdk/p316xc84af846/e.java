package com.p314xaae8f345.p315x553972de.sdk.p316xc84af846;

/* loaded from: classes13.dex */
public abstract class e extends android.os.Binder implements com.p314xaae8f345.p315x553972de.sdk.p316xc84af846.f {

    /* renamed from: DESCRIPTOR */
    private static final java.lang.String f9798xf04ebf6f = "com.tencent.assistant.sdk.SDKActionCallback";

    /* renamed from: TRANSACTION_onActionResult */
    static final int f9799x4740b113 = 1;

    public e() {
        attachInterface(this, f9798xf04ebf6f);
    }

    /* renamed from: asInterface */
    public static com.p314xaae8f345.p315x553972de.sdk.p316xc84af846.f m21512xbd0d1927(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(f9798xf04ebf6f);
        return (queryLocalInterface == null || !(queryLocalInterface instanceof com.p314xaae8f345.p315x553972de.sdk.p316xc84af846.f)) ? new com.p314xaae8f345.p315x553972de.sdk.p316xc84af846.d(iBinder) : (com.p314xaae8f345.p315x553972de.sdk.p316xc84af846.f) queryLocalInterface;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 == 1) {
            parcel.enforceInterface(f9798xf04ebf6f);
            mo21513xcc9ebd72(parcel.createByteArray());
            return true;
        }
        if (i17 != 1598968902) {
            return super.onTransact(i17, parcel, parcel2, i18);
        }
        parcel2.writeString(f9798xf04ebf6f);
        return true;
    }
}
