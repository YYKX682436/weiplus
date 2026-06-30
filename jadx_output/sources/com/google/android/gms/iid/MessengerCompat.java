package com.google.android.gms.iid;

/* loaded from: classes13.dex */
public class MessengerCompat implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.iid.MessengerCompat> CREATOR = new com.google.android.gms.iid.zzq();
    private android.os.Messenger zzab;
    private com.google.android.gms.iid.zzl zzby;

    public MessengerCompat(android.os.IBinder iBinder) {
        this.zzab = new android.os.Messenger(iBinder);
    }

    private final android.os.IBinder getBinder() {
        android.os.Messenger messenger = this.zzab;
        return messenger != null ? messenger.getBinder() : this.zzby.asBinder();
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
            return getBinder().equals(((com.google.android.gms.iid.MessengerCompat) obj).getBinder());
        } catch (java.lang.ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return getBinder().hashCode();
    }

    public final void send(android.os.Message message) {
        android.os.Messenger messenger = this.zzab;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.zzby.send(message);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        android.os.Messenger messenger = this.zzab;
        parcel.writeStrongBinder(messenger != null ? messenger.getBinder() : this.zzby.asBinder());
    }
}
