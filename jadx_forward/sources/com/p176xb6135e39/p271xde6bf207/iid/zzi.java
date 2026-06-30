package com.p176xb6135e39.p271xde6bf207.iid;

/* loaded from: classes13.dex */
public class zzi implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p271xde6bf207.iid.zzi> f7865x681a0c0c = new cb.a0();

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Messenger f126195d;

    public zzi(android.os.IBinder iBinder) {
        this.f126195d = new android.os.Messenger(iBinder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m20464xb2c87fbf(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            android.os.Messenger messenger = this.f126195d;
            messenger.getClass();
            android.os.IBinder binder = messenger.getBinder();
            android.os.Messenger messenger2 = ((com.p176xb6135e39.p271xde6bf207.iid.zzi) obj).f126195d;
            messenger2.getClass();
            return binder.equals(messenger2.getBinder());
        } catch (java.lang.ClassCastException unused) {
            return false;
        }
    }

    /* renamed from: hashCode */
    public int m20465x8cdac1b() {
        android.os.Messenger messenger = this.f126195d;
        messenger.getClass();
        return messenger.getBinder().hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        android.os.Messenger messenger = this.f126195d;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
