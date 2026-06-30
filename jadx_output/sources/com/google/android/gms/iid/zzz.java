package com.google.android.gms.iid;

/* loaded from: classes13.dex */
abstract class zzz<T> {
    final int what;
    final int zzck;
    final com.google.android.gms.tasks.TaskCompletionSource<T> zzcl = new com.google.android.gms.tasks.TaskCompletionSource<>();
    final android.os.Bundle zzcm;

    public zzz(int i17, int i18, android.os.Bundle bundle) {
        this.zzck = i17;
        this.what = i18;
        this.zzcm = bundle;
    }

    public java.lang.String toString() {
        int i17 = this.what;
        int i18 = this.zzck;
        zzu();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(55);
        sb6.append("Request { what=");
        sb6.append(i17);
        sb6.append(" id=");
        sb6.append(i18);
        sb6.append(" oneWay=false}");
        return sb6.toString();
    }

    public final void zzd(com.google.android.gms.iid.zzaa zzaaVar) {
        if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
            new java.lang.StringBuilder(java.lang.String.valueOf(this).length() + 14 + java.lang.String.valueOf(zzaaVar).length());
        }
        this.zzcl.setException(zzaaVar);
    }

    public abstract void zzh(android.os.Bundle bundle);

    public abstract boolean zzu();
}
