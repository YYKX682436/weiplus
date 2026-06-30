package com.p166x1da19ac6.p168x5890096f;

/* renamed from: com.facebook.soloader.SysUtil$LollipopSysdeps */
/* loaded from: classes12.dex */
final class C1552xea3b7391 {
    /* renamed from: fallocateIfSupported */
    public static void m16735xad95626e(java.io.FileDescriptor fileDescriptor, long j17) {
        int i17;
        try {
            android.system.Os.posix_fallocate(fileDescriptor, 0L, j17);
        } catch (android.system.ErrnoException e17) {
            if (e17.errno != android.system.OsConstants.EOPNOTSUPP && (i17 = e17.errno) != android.system.OsConstants.ENOSYS && i17 != android.system.OsConstants.EINVAL) {
                throw new java.io.IOException(e17.toString(), e17);
            }
        }
    }

    /* renamed from: getSupportedAbis */
    public static java.lang.String[] m16736xa0da9323() {
        java.lang.String[] strArr = android.os.Build.SUPPORTED_ABIS;
        java.util.TreeSet treeSet = new java.util.TreeSet();
        try {
            if (m16737x79bd3a85()) {
                treeSet.add("arm64-v8a");
                treeSet.add("x86_64");
            } else {
                treeSet.add("armeabi-v7a");
                treeSet.add("x86");
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.String str : strArr) {
                if (treeSet.contains(str)) {
                    arrayList.add(str);
                }
            }
            return (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
        } catch (android.system.ErrnoException e17) {
            java.lang.String.format("Could not read /proc/self/exe. Falling back to default ABI list: %s. errno: %d Err msg: %s", java.util.Arrays.toString(strArr), java.lang.Integer.valueOf(e17.errno), e17.getMessage());
            return android.os.Build.SUPPORTED_ABIS;
        }
    }

    /* renamed from: is64Bit */
    public static boolean m16737x79bd3a85() {
        return android.system.Os.readlink("/proc/self/exe").contains("64");
    }
}
