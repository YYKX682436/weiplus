package com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15;

/* loaded from: classes13.dex */
final class zzc extends dalvik.system.PathClassLoader {
    public zzc(java.lang.String str, java.lang.ClassLoader classLoader) {
        super(str, classLoader);
    }

    @Override // java.lang.ClassLoader
    public final java.lang.Class loadClass(java.lang.String str, boolean z17) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (java.lang.ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z17);
    }
}
