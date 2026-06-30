package ko3;

/* loaded from: classes13.dex */
public final class t implements android.os.IBinder {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Class f391530d;

    /* renamed from: e, reason: collision with root package name */
    public ko3.s f391531e = null;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f391532f = null;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ko3.u f391533g;

    public t(ko3.u uVar, java.lang.Class cls) {
        this.f391533g = uVar;
        this.f391530d = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object[] a(java.lang.Class[] clsArr) {
        int length = clsArr.length;
        java.lang.Object[] objArr = new java.lang.Object[length];
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.Class cls = clsArr[i17];
            if (cls.isPrimitive()) {
                if (java.lang.Boolean.TYPE.isAssignableFrom(cls)) {
                    objArr[i17] = java.lang.Boolean.FALSE;
                } else {
                    objArr[i17] = 0;
                }
            } else if (java.lang.Number.class.isAssignableFrom(cls)) {
                objArr[i17] = 0;
            } else if (java.lang.Character.class.isAssignableFrom(cls)) {
                objArr[i17] = (char) 0;
            } else if (java.lang.Boolean.class.isAssignableFrom(cls)) {
                objArr[i17] = java.lang.Boolean.FALSE;
            } else {
                objArr[i17] = null;
            }
        }
        return objArr;
    }

    @Override // android.os.IBinder
    public void dump(java.io.FileDescriptor fileDescriptor, java.lang.String[] strArr) {
    }

    @Override // android.os.IBinder
    public void dumpAsync(java.io.FileDescriptor fileDescriptor, java.lang.String[] strArr) {
    }

    @Override // android.os.IBinder
    public java.lang.String getInterfaceDescriptor() {
        return null;
    }

    @Override // android.os.IBinder
    public boolean isBinderAlive() {
        return false;
    }

    @Override // android.os.IBinder
    public void linkToDeath(android.os.IBinder.DeathRecipient deathRecipient, int i17) {
    }

    @Override // android.os.IBinder
    public boolean pingBinder() {
        return false;
    }

    @Override // android.os.IBinder
    public android.os.IInterface queryLocalInterface(java.lang.String str) {
        return null;
    }

    @Override // android.os.IBinder
    public boolean transact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        synchronized (this) {
            ko3.s sVar = this.f391531e;
            if (sVar != null) {
                sVar.put(i17, this.f391532f);
            }
        }
        return false;
    }

    @Override // android.os.IBinder
    public boolean unlinkToDeath(android.os.IBinder.DeathRecipient deathRecipient, int i17) {
        return false;
    }
}
