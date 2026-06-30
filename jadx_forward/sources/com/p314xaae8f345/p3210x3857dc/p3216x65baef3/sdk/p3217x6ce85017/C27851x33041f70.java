package com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.p3217x6ce85017;

/* renamed from: com.tencent.xweb.pinus.sdk.library_loader.LegacyLinker */
/* loaded from: classes13.dex */
public class C27851x33041f70 extends com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.p3217x6ce85017.AbstractC27852x87ab9247 {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f61169x7118e671 = false;
    private static final java.lang.String TAG = "LegacyLinker";

    /* renamed from: nativeAddZipArchivePath */
    private static native boolean m120469xd839a1d0(java.lang.String str);

    /* renamed from: nativeCreateMemoryFile */
    private static native int m120470x2c4b670(java.lang.String str);

    /* renamed from: nativeCreateSharedRelro */
    private static native boolean m120471x2199713e(java.lang.String str, long j17, com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.p3217x6ce85017.AbstractC27852x87ab9247.LibInfo libInfo);

    /* renamed from: nativeLoadLibrary */
    private static native boolean m120472xc4e2fc5e(java.lang.String str, long j17, com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.p3217x6ce85017.AbstractC27852x87ab9247.LibInfo libInfo);

    /* renamed from: nativeLoadLibraryByFd */
    private static native boolean m120473x68516cf3(java.lang.String str, long j17, int i17, boolean z17);

    /* renamed from: nativeUseSharedRelro */
    private static native boolean m120474xb89fff21(java.lang.String str, com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.p3217x6ce85017.AbstractC27852x87ab9247.LibInfo libInfo);

    /* renamed from: useSharedRelrosLocked */
    private static void m120475xd86ce2f3(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.p3217x6ce85017.AbstractC27852x87ab9247.LibInfo libInfo) {
        java.lang.String str = libInfo.f301987d;
        if (m120474xb89fff21(str, libInfo)) {
            by5.c4.f(TAG, java.lang.String.format("Using shared RELRO section for %s", str));
        } else {
            by5.c4.g(TAG, java.lang.String.format("Could not use shared RELRO section for %s", str));
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.p3217x6ce85017.AbstractC27852x87ab9247
    /* renamed from: createMemroyFile */
    public int mo120476x7caf581f(java.lang.String str) {
        m120487x73c43e60();
        return m120470x2c4b670(str);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.p3217x6ce85017.AbstractC27852x87ab9247
    /* renamed from: loadLibraryByFdImplLocked */
    public void mo120477x81cfd6f4(java.lang.String str, boolean z17, int i17, boolean z18) {
        m120487x73c43e60();
        if (m120473x68516cf3(str, z17 ? this.f61177xf9195470 : 0L, i17, z18)) {
            this.f61180xbec81024 = 3;
            return;
        }
        java.lang.String str2 = "Unable to load library: " + str;
        by5.c4.c(TAG, str2);
        throw new java.lang.UnsatisfiedLinkError(str2);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.p3217x6ce85017.AbstractC27852x87ab9247
    /* renamed from: loadLibraryImplLocked */
    public void mo120478x2ad1201f(java.lang.String str, boolean z17) {
        m120487x73c43e60();
        boolean z18 = this.f61178x14196d39;
        long j17 = z17 ? this.f61177xf9195470 : 0L;
        com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.p3217x6ce85017.AbstractC27852x87ab9247.LibInfo libInfo = new com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.p3217x6ce85017.AbstractC27852x87ab9247.LibInfo();
        if (!m120472xc4e2fc5e(str, j17, libInfo)) {
            java.lang.String str2 = "Unable to load library: " + str;
            by5.c4.c(TAG, str2);
            throw new java.lang.UnsatisfiedLinkError(str2);
        }
        libInfo.f301987d = str;
        if (z18) {
            if (m120471x2199713e(str, this.f61177xf9195470, libInfo)) {
                by5.c4.f(TAG, java.lang.String.format("Created shared RELRO for %s at %x: %s", str, java.lang.Long.valueOf(this.f61177xf9195470), libInfo));
            } else {
                by5.c4.g(TAG, java.lang.String.format("Could not create shared RELRO for %s at %x", str, java.lang.Long.valueOf(this.f61177xf9195470)));
                libInfo.f301992i = -1;
            }
            this.f61179xa7ee63a6 = libInfo;
            m120475xd86ce2f3(libInfo);
            this.f61180xbec81024 = 2;
            return;
        }
        if (!this.f61181xcca0fee9) {
            this.f61180xbec81024 = 3;
            return;
        }
        m120494xad72c740();
        m120475xd86ce2f3(this.f61179xa7ee63a6);
        com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.p3217x6ce85017.AbstractC27852x87ab9247.LibInfo libInfo2 = this.f61179xa7ee63a6;
        int i17 = libInfo2.f301992i;
        if (i17 >= 0) {
            android.os.ParcelFileDescriptor adoptFd = android.os.ParcelFileDescriptor.adoptFd(i17);
            if (adoptFd != null) {
                try {
                    adoptFd.close();
                } catch (java.io.IOException unused) {
                }
            }
            libInfo2.f301992i = -1;
        }
        this.f61179xa7ee63a6 = null;
        this.f61180xbec81024 = 3;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.p3217x6ce85017.AbstractC27852x87ab9247
    /* renamed from: setApkFilePath */
    public void mo120479x8ba06c3b(java.lang.String str) {
        synchronized (com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.p3217x6ce85017.AbstractC27852x87ab9247.f61174x678c83e) {
            m120487x73c43e60();
            m120469xd839a1d0(str);
        }
    }
}
