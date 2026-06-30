package com.google.android.gms.iid;

/* loaded from: classes13.dex */
final class zzy {
    final android.os.Messenger zzab;
    final com.google.android.gms.iid.MessengerCompat zzcj;

    public zzy(android.os.IBinder iBinder) {
        java.lang.String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.zzab = new android.os.Messenger(iBinder);
            this.zzcj = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.zzcj = new com.google.android.gms.iid.MessengerCompat(iBinder);
            this.zzab = null;
        } else {
            java.lang.String valueOf = java.lang.String.valueOf(interfaceDescriptor);
            if (valueOf.length() != 0) {
                "Invalid interface descriptor: ".concat(valueOf);
            }
            throw new android.os.RemoteException();
        }
    }
}
