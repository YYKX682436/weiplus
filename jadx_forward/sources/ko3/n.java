package ko3;

/* loaded from: classes13.dex */
public abstract class n extends android.os.Binder {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f391523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ko3.u f391524e;

    public n(ko3.u uVar, android.os.IBinder iBinder) {
        this.f391524e = uVar;
        this.f391523d = iBinder;
    }

    @Override // android.os.Binder, android.os.IBinder
    public void dump(java.io.FileDescriptor fileDescriptor, java.lang.String[] strArr) {
        try {
            this.f391523d.dump(fileDescriptor, strArr);
        } catch (android.os.RemoteException unused) {
        }
    }

    @Override // android.os.Binder, android.os.IBinder
    public void dumpAsync(java.io.FileDescriptor fileDescriptor, java.lang.String[] strArr) {
        try {
            this.f391523d.dumpAsync(fileDescriptor, strArr);
        } catch (android.os.RemoteException unused) {
        }
    }

    @Override // android.os.Binder, android.os.IBinder
    public java.lang.String getInterfaceDescriptor() {
        try {
            return this.f391523d.getInterfaceDescriptor();
        } catch (android.os.RemoteException unused) {
            return "<failure>";
        }
    }

    @Override // android.os.Binder, android.os.IBinder
    public boolean isBinderAlive() {
        return this.f391523d.isBinderAlive();
    }

    @Override // android.os.Binder, android.os.IBinder
    public void linkToDeath(android.os.IBinder.DeathRecipient deathRecipient, int i17) {
        try {
            this.f391523d.linkToDeath(deathRecipient, i17);
        } catch (android.os.RemoteException unused) {
            deathRecipient.binderDied();
        }
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        android.os.IBinder iBinder = this.f391523d;
        try {
            if (iBinder.isBinderAlive()) {
                return iBinder.transact(i17, parcel, parcel2, i18);
            }
            return false;
        } catch (android.os.RemoteException e17) {
            throw e17;
        } catch (java.lang.Throwable th6) {
            ko3.u.d(this.f391524e, th6);
            return false;
        }
    }

    @Override // android.os.Binder, android.os.IBinder
    public boolean pingBinder() {
        return this.f391523d.pingBinder();
    }

    @Override // android.os.Binder, android.os.IBinder
    public android.os.IInterface queryLocalInterface(java.lang.String str) {
        return null;
    }

    @Override // android.os.Binder, android.os.IBinder
    public boolean unlinkToDeath(android.os.IBinder.DeathRecipient deathRecipient, int i17) {
        return this.f391523d.unlinkToDeath(deathRecipient, i17);
    }
}
