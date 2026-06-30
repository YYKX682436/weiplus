package com.p176xb6135e39.p177xcca8366f.gms.iid;

/* loaded from: classes13.dex */
final class zzy {

    /* renamed from: zzab */
    final android.os.Messenger f6165x394b61;

    /* renamed from: zzcj */
    final com.p176xb6135e39.p177xcca8366f.gms.iid.C2050x1d7bb855 f6166x394ba7;

    public zzy(android.os.IBinder iBinder) {
        java.lang.String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f6165x394b61 = new android.os.Messenger(iBinder);
            this.f6166x394ba7 = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f6166x394ba7 = new com.p176xb6135e39.p177xcca8366f.gms.iid.C2050x1d7bb855(iBinder);
            this.f6165x394b61 = null;
        } else {
            java.lang.String valueOf = java.lang.String.valueOf(interfaceDescriptor);
            if (valueOf.length() != 0) {
                "Invalid interface descriptor: ".concat(valueOf);
            }
            throw new android.os.RemoteException();
        }
    }
}
