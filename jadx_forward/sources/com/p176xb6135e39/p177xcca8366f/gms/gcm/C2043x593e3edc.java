package com.p176xb6135e39.p177xcca8366f.gms.gcm;

/* renamed from: com.google.android.gms.gcm.PendingCallback */
/* loaded from: classes13.dex */
public class C2043x593e3edc implements android.os.Parcelable, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1924xbc23c1ff {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.gcm.C2043x593e3edc> f6056x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.gcm.zzj();

    /* renamed from: zzal */
    final android.os.IBinder f6057x394b6b;

    public C2043x593e3edc(android.os.Parcel parcel) {
        this.f6057x394b6b = parcel.readStrongBinder();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeStrongBinder(this.f6057x394b6b);
    }
}
