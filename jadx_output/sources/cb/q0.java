package cb;

/* loaded from: classes13.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Messenger f40174a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.firebase.iid.zzi f40175b;

    public q0(android.os.IBinder iBinder) {
        java.lang.String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f40174a = new android.os.Messenger(iBinder);
            this.f40175b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f40175b = new com.google.firebase.iid.zzi(iBinder);
            this.f40174a = null;
        } else {
            java.lang.String valueOf = java.lang.String.valueOf(interfaceDescriptor);
            if (valueOf.length() != 0) {
                "Invalid interface descriptor: ".concat(valueOf);
            }
            throw new android.os.RemoteException();
        }
    }
}
