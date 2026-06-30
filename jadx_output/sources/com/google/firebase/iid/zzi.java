package com.google.firebase.iid;

/* loaded from: classes13.dex */
public class zzi implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.firebase.iid.zzi> CREATOR = new cb.a0();

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Messenger f44662d;

    public zzi(android.os.IBinder iBinder) {
        this.f44662d = new android.os.Messenger(iBinder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            android.os.Messenger messenger = this.f44662d;
            messenger.getClass();
            android.os.IBinder binder = messenger.getBinder();
            android.os.Messenger messenger2 = ((com.google.firebase.iid.zzi) obj).f44662d;
            messenger2.getClass();
            return binder.equals(messenger2.getBinder());
        } catch (java.lang.ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        android.os.Messenger messenger = this.f44662d;
        messenger.getClass();
        return messenger.getBinder().hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        android.os.Messenger messenger = this.f44662d;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
