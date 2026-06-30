package com.p314xaae8f345.mm.vfs;

/* loaded from: classes7.dex */
public abstract class z3 {
    public static boolean a(java.lang.String str, java.lang.String str2) {
        try {
            android.system.Os.rename(str, str2);
            return true;
        } catch (android.system.ErrnoException e17) {
            if (e17.errno == android.system.OsConstants.EXDEV) {
                return false;
            }
            if (e17.errno == android.system.OsConstants.ENOENT) {
                throw new java.io.FileNotFoundException("Cannot move file " + str + " to " + str2 + ": " + e17.getMessage());
            }
            throw new java.io.IOException("Cannot move file " + str + " to " + str2 + ": " + e17.getMessage());
        } catch (java.lang.RuntimeException e18) {
            throw new java.io.IOException("Cannot move file " + str + " to " + str2 + ": " + e18.getMessage(), e18);
        }
    }
}
