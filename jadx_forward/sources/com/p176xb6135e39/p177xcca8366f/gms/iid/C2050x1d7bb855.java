package com.p176xb6135e39.p177xcca8366f.gms.iid;

/* renamed from: com.google.android.gms.iid.MessengerCompat */
/* loaded from: classes13.dex */
public class C2050x1d7bb855 implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1924xbc23c1ff {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.iid.C2050x1d7bb855> f6104x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.iid.zzq();

    /* renamed from: zzab */
    private android.os.Messenger f6105x394b61;

    /* renamed from: zzby */
    private com.p176xb6135e39.p177xcca8366f.gms.iid.zzl f6106x394b97;

    public C2050x1d7bb855(android.os.IBinder iBinder) {
        this.f6105x394b61 = new android.os.Messenger(iBinder);
    }

    /* renamed from: getBinder */
    private final android.os.IBinder m18766x124d38a0() {
        android.os.Messenger messenger = this.f6105x394b61;
        return messenger != null ? messenger.getBinder() : this.f6106x394b97.asBinder();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m18767xb2c87fbf(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return m18766x124d38a0().equals(((com.p176xb6135e39.p177xcca8366f.gms.iid.C2050x1d7bb855) obj).m18766x124d38a0());
        } catch (java.lang.ClassCastException unused) {
            return false;
        }
    }

    /* renamed from: hashCode */
    public int m18768x8cdac1b() {
        return m18766x124d38a0().hashCode();
    }

    /* renamed from: send */
    public final void m18769x35cf88(android.os.Message message) {
        android.os.Messenger messenger = this.f6105x394b61;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f6106x394b97.mo18774x35cf88(message);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        android.os.Messenger messenger = this.f6105x394b61;
        parcel.writeStrongBinder(messenger != null ? messenger.getBinder() : this.f6106x394b97.asBinder());
    }
}
