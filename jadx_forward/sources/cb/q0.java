package cb;

/* loaded from: classes13.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Messenger f121707a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p176xb6135e39.p271xde6bf207.iid.zzi f121708b;

    public q0(android.os.IBinder iBinder) {
        java.lang.String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f121707a = new android.os.Messenger(iBinder);
            this.f121708b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f121708b = new com.p176xb6135e39.p271xde6bf207.iid.zzi(iBinder);
            this.f121707a = null;
        } else {
            java.lang.String valueOf = java.lang.String.valueOf(interfaceDescriptor);
            if (valueOf.length() != 0) {
                "Invalid interface descriptor: ".concat(valueOf);
            }
            throw new android.os.RemoteException();
        }
    }
}
