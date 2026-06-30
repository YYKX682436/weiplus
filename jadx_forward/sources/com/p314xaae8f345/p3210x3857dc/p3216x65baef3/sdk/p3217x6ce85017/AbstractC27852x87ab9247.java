package com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.p3217x6ce85017;

/* renamed from: com.tencent.xweb.pinus.sdk.library_loader.Linker */
/* loaded from: classes13.dex */
public abstract class AbstractC27852x87ab9247 {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f61170x7118e671 = false;

    /* renamed from: DEBUG */
    protected static final boolean f61171x3de9e33 = true;

    /* renamed from: EXTRA_LINKER_SHARED_RELROS */
    public static final java.lang.String f61172xdaa3048e = "org.chromium.base.android.linker.shared_relros";

    /* renamed from: LINKER_JNI_LIBRARY */
    protected static final java.lang.String f61173xc6817c9 = "xweb_linker";
    private static final java.lang.String TAG = "Linker";

    /* renamed from: sLock */
    protected static final java.lang.Object f61174x678c83e = new java.lang.Object();

    /* renamed from: sSingleton */
    private static com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.p3217x6ce85017.AbstractC27852x87ab9247 f61175xdb5b68d8;

    /* renamed from: _hellAccFlag_ */
    private byte f61176x7f11beae;

    /* renamed from: mLibInfo */
    protected com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.p3217x6ce85017.AbstractC27852x87ab9247.LibInfo f61179xa7ee63a6;

    /* renamed from: mWaitForSharedRelros */
    protected boolean f61181xcca0fee9;

    /* renamed from: mInBrowserProcess */
    protected boolean f61178x14196d39 = true;

    /* renamed from: mBaseLoadAddress */
    protected long f61177xf9195470 = -1;

    /* renamed from: mState */
    protected int f61180xbec81024 = 0;

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.p3217x6ce85017.AbstractC27852x87ab9247 m120481x9cf0d20b() {
        com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.p3217x6ce85017.AbstractC27852x87ab9247 abstractC27852x87ab9247;
        synchronized (f61174x678c83e) {
            if (f61175xdb5b68d8 == null) {
                f61175xdb5b68d8 = new com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.p3217x6ce85017.C27851x33041f70();
            }
            abstractC27852x87ab9247 = f61175xdb5b68d8;
        }
        return abstractC27852x87ab9247;
    }

    /* renamed from: getRandomBaseLoadAddress */
    public static long m120482x870e4ba4() {
        long m120484x9a85aadb = m120484x9a85aadb();
        by5.c4.f(TAG, java.lang.String.format("Random native base load address: 0x%x", java.lang.Long.valueOf(m120484x9a85aadb)));
        return m120484x9a85aadb;
    }

    /* renamed from: loadLinkerJniLibraryLocked */
    private void m120483xce69d0cd() {
        by5.c4.f(TAG, java.lang.String.format("Loading lib%s.so", f61173xc6817c9));
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(f61173xc6817c9);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/xweb/pinus/sdk/library_loader/Linker", "loadLinkerJniLibraryLocked", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/xweb/pinus/sdk/library_loader/Linker", "loadLinkerJniLibraryLocked", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        } catch (java.lang.UnsatisfiedLinkError unused) {
        }
    }

    /* renamed from: nativeGetRandomBaseLoadAddress */
    private static native long m120484x9a85aadb();

    /* renamed from: setupBaseLoadAddressLocked */
    private void m120485xe31f0f8a() {
        if (this.f61177xf9195470 == -1) {
            long m120482x870e4ba4 = m120482x870e4ba4();
            this.f61177xf9195470 = m120482x870e4ba4;
            if (m120482x870e4ba4 == 0) {
                by5.c4.g(TAG, "Disabling shared RELROs due address space pressure");
                this.f61181xcca0fee9 = false;
            }
        }
    }

    /* renamed from: createMemroyFile */
    public abstract int mo120476x7caf581f(java.lang.String str);

    /* renamed from: disableSharedRelros */
    public final void m120486x3d7ce26a() {
        by5.c4.f(TAG, "disableSharedRelros() called");
        synchronized (f61174x678c83e) {
            this.f61178x14196d39 = false;
            m120487x73c43e60();
            this.f61181xcca0fee9 = false;
        }
    }

    /* renamed from: ensureInitializedLocked */
    public final void m120487x73c43e60() {
        if (this.f61180xbec81024 != 0) {
            return;
        }
        m120483xce69d0cd();
        if (this.f61178x14196d39) {
            m120485xe31f0f8a();
        }
        this.f61180xbec81024 = 1;
    }

    /* renamed from: getBaseLoadAddress */
    public final long m120488xdccf667() {
        long j17;
        synchronized (f61174x678c83e) {
            m120487x73c43e60();
            m120485xe31f0f8a();
            by5.c4.f(TAG, java.lang.String.format("getBaseLoadAddress() returns 0x%x", java.lang.Long.valueOf(this.f61177xf9195470)));
            j17 = this.f61177xf9195470;
        }
        return j17;
    }

    /* renamed from: getSharedRelros */
    public final android.os.Bundle m120489x206b19d8() {
        synchronized (f61174x678c83e) {
            if (this.f61180xbec81024 != 2) {
                by5.c4.f(TAG, "getSharedRelros() = null");
                return null;
            }
            com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.p3217x6ce85017.AbstractC27852x87ab9247.LibInfo libInfo = this.f61179xa7ee63a6;
            libInfo.getClass();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("libinfo", libInfo);
            by5.c4.f(TAG, java.lang.String.format("getSharedRelros() = %s", bundle.toString()));
            return bundle;
        }
    }

    /* renamed from: initServiceProcess */
    public final void m120490xbd65ff2a(long j17) {
        by5.c4.f(TAG, java.lang.String.format("initServiceProcess(0x%x) called", java.lang.Long.valueOf(j17)));
        synchronized (f61174x678c83e) {
            m120487x73c43e60();
            this.f61178x14196d39 = false;
            this.f61181xcca0fee9 = true;
            this.f61177xf9195470 = j17;
        }
    }

    /* renamed from: loadLibrary */
    public final void m120491xeb57c8f5(java.lang.String str, boolean z17) {
        by5.c4.f(TAG, java.lang.String.format("loadLibrary: %s", str));
        synchronized (f61174x678c83e) {
            mo120478x2ad1201f(str, z17);
        }
    }

    /* renamed from: loadLibraryByFd */
    public final void m120492x77d0160a(java.lang.String str, boolean z17, int i17, boolean z18) {
        by5.c4.f(TAG, java.lang.String.format("loadLibrary: %s, fd: %d", str, java.lang.Integer.valueOf(i17)));
        synchronized (f61174x678c83e) {
            mo120477x81cfd6f4(str, z17, i17, z18);
        }
    }

    /* renamed from: loadLibraryByFdImplLocked */
    public abstract void mo120477x81cfd6f4(java.lang.String str, boolean z17, int i17, boolean z18);

    /* renamed from: loadLibraryImplLocked */
    public abstract void mo120478x2ad1201f(java.lang.String str, boolean z17);

    /* renamed from: provideSharedRelros */
    public final void m120493x6efbc0a3(android.os.Bundle bundle) {
        by5.c4.f(TAG, java.lang.String.format("provideSharedRelros() called with %s", bundle));
        java.lang.Object obj = f61174x678c83e;
        synchronized (obj) {
            this.f61179xa7ee63a6 = (com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.p3217x6ce85017.AbstractC27852x87ab9247.LibInfo) bundle.getParcelable("libinfo");
            obj.notifyAll();
        }
    }

    /* renamed from: setApkFilePath */
    public void mo120479x8ba06c3b(java.lang.String str) {
    }

    /* renamed from: waitForSharedRelrosLocked */
    public final void m120494xad72c740() {
        by5.c4.f(TAG, "waitForSharedRelros() called");
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        while (this.f61179xa7ee63a6 == null) {
            try {
                f61174x678c83e.wait();
            } catch (java.lang.InterruptedException unused) {
            }
        }
        by5.c4.f(TAG, java.lang.String.format("Time to wait for shared RELRO: %d ms", java.lang.Long.valueOf(android.os.SystemClock.uptimeMillis() - uptimeMillis)));
    }

    /* renamed from: com.tencent.xweb.pinus.sdk.library_loader.Linker$LibInfo */
    /* loaded from: classes12.dex */
    public static class LibInfo implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.p3217x6ce85017.AbstractC27852x87ab9247.LibInfo> f61182x681a0c0c = new com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.p3217x6ce85017.a();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f301987d;

        /* renamed from: e, reason: collision with root package name */
        public final long f301988e;

        /* renamed from: f, reason: collision with root package name */
        public final long f301989f;

        /* renamed from: g, reason: collision with root package name */
        public final long f301990g;

        /* renamed from: h, reason: collision with root package name */
        public final long f301991h;

        /* renamed from: i, reason: collision with root package name */
        public int f301992i;

        public LibInfo() {
            this.f301992i = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f301987d);
            parcel.writeLong(this.f301988e);
            parcel.writeLong(this.f301989f);
            parcel.writeLong(this.f301990g);
            parcel.writeLong(this.f301991h);
            parcel.writeInt(this.f301992i >= 0 ? 1 : 0);
            int i18 = this.f301992i;
            if (i18 >= 0) {
                try {
                    android.os.ParcelFileDescriptor fromFd = android.os.ParcelFileDescriptor.fromFd(i18);
                    fromFd.writeToParcel(parcel, 0);
                    fromFd.close();
                } catch (java.io.IOException e17) {
                    by5.c4.d(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.p3217x6ce85017.AbstractC27852x87ab9247.TAG, "Can't write LibInfo file descriptor to parcel", e17);
                }
            }
        }

        public LibInfo(android.os.Parcel parcel) {
            this.f301992i = -1;
            this.f301987d = parcel.readString();
            this.f301988e = parcel.readLong();
            this.f301989f = parcel.readLong();
            this.f301990g = parcel.readLong();
            this.f301991h = parcel.readLong();
            if (parcel.readInt() != 0) {
                android.os.ParcelFileDescriptor parcelFileDescriptor = (android.os.ParcelFileDescriptor) android.os.ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
                if (parcelFileDescriptor != null) {
                    this.f301992i = parcelFileDescriptor.detachFd();
                    return;
                }
                return;
            }
            this.f301992i = -1;
        }
    }
}
