package com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8;

/* renamed from: com.tencent.shadow.dynamic.host.PpsController */
/* loaded from: classes13.dex */
public class C25555x6636ee4f {

    /* renamed from: VERSION */
    public static final int f46751x3fc0a8b8 = 1;

    /* renamed from: mRemote */
    private final android.os.IBinder f46752x17b71f13;

    public C25555x6636ee4f(android.os.IBinder iBinder) {
        this.f46752x17b71f13 = iBinder;
    }

    /* renamed from: asBinder */
    public android.os.IBinder m95625x9659a07c() {
        return this.f46752x17b71f13;
    }

    /* renamed from: checkPpsId */
    public com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25556x1f85ac25 m95626xe045fac6(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.BinderC25554x1edf1dd.f46736xf04ebf6f);
            obtain.writeString(str);
            this.f46752x17b71f13.transact(10, obtain, obtain2, 0);
            obtain2.readException();
            return new com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25556x1f85ac25(obtain2);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: exit */
    public void m95627x2fb91e() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.BinderC25554x1edf1dd.f46736xf04ebf6f);
            this.f46752x17b71f13.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: getPluginLoader */
    public android.os.IBinder m95628xba82ab9c() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.BinderC25554x1edf1dd.f46736xf04ebf6f);
            this.f46752x17b71f13.transact(6, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readStrongBinder();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: getPpsStatus */
    public com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25556x1f85ac25 m95629xa780fd8f() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.BinderC25554x1edf1dd.f46736xf04ebf6f);
            this.f46752x17b71f13.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            return new com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25556x1f85ac25(obtain2);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: initCrashHandlerByFd */
    public void m95630x31bc40e8(android.os.ParcelFileDescriptor parcelFileDescriptor, android.os.ParcelFileDescriptor parcelFileDescriptor2) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.BinderC25554x1edf1dd.f46736xf04ebf6f);
            if (parcelFileDescriptor != null) {
                obtain.writeInt(1);
                parcelFileDescriptor.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (parcelFileDescriptor2 != null) {
                obtain.writeInt(1);
                parcelFileDescriptor2.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f46752x17b71f13.transact(9, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: isBinderAlive */
    public java.lang.Boolean m95631xcc2229b9() {
        return java.lang.Boolean.valueOf(this.f46752x17b71f13.isBinderAlive());
    }

    /* renamed from: loadPluginLoader */
    public void m95632x4340092c(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.BinderC25554x1edf1dd.f46736xf04ebf6f);
            obtain.writeString(str);
            this.f46752x17b71f13.transact(2, obtain, obtain2, 0);
            int readInt = obtain2.readInt();
            if (readInt == 1) {
                throw com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25536x34648872.f46684x681a0c0c.createFromParcel(obtain2);
            }
            if (readInt == 0) {
                return;
            }
            throw new java.lang.RuntimeException("不认识的Code==" + readInt);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: loadPluginLoaderByApk */
    public void m95633x6f4ce479(java.lang.String str, com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25507x83693462 c25507x83693462, android.os.ParcelFileDescriptor parcelFileDescriptor) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.BinderC25554x1edf1dd.f46736xf04ebf6f);
            obtain.writeString(str);
            obtain.writeInt(c25507x83693462 != null ? 1 : 0);
            if (c25507x83693462 != null) {
                c25507x83693462.writeToParcel(obtain, 0);
            }
            obtain.writeInt(parcelFileDescriptor != null ? 1 : 0);
            if (parcelFileDescriptor != null) {
                parcelFileDescriptor.writeToParcel(obtain, 0);
            }
            this.f46752x17b71f13.transact(8, obtain, obtain2, 0);
            int readInt = obtain2.readInt();
            if (readInt == 1) {
                throw com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25536x34648872.f46684x681a0c0c.createFromParcel(obtain2);
            }
            if (readInt == 0) {
                return;
            }
            throw new java.lang.RuntimeException("不认识的Code==" + readInt);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: loadRuntime */
    public void m95634x3de17412(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.BinderC25554x1edf1dd.f46736xf04ebf6f);
            obtain.writeString(str);
            this.f46752x17b71f13.transact(1, obtain, obtain2, 0);
            int readInt = obtain2.readInt();
            if (readInt == 1) {
                throw com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25536x34648872.f46684x681a0c0c.createFromParcel(obtain2);
            }
            if (readInt == 0) {
                return;
            }
            throw new java.lang.RuntimeException("不认识的Code==" + readInt);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: setHostOpenedFds */
    public void m95635xf3653042(java.util.Map<java.lang.String, android.os.ParcelFileDescriptor> map) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.BinderC25554x1edf1dd.f46736xf04ebf6f);
            obtain.writeInt(map.size());
            for (java.util.Map.Entry<java.lang.String, android.os.ParcelFileDescriptor> entry : map.entrySet()) {
                obtain.writeString(entry.getKey());
                entry.getValue().writeToParcel(obtain, 0);
            }
            this.f46752x17b71f13.transact(11, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: setSystemService */
    public void m95636x3f690c44(android.os.IBinder iBinder) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.BinderC25554x1edf1dd.f46736xf04ebf6f);
            obtain.writeStrongBinder(iBinder);
            this.f46752x17b71f13.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: setUuidManager */
    public void m95637x1b5ad5b0(android.os.IBinder iBinder) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.BinderC25554x1edf1dd.f46736xf04ebf6f);
            obtain.writeStrongBinder(iBinder);
            this.f46752x17b71f13.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
