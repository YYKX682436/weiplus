package com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e;

/* loaded from: classes12.dex */
public abstract class t {
    public static final void a(java.io.File file) {
        if (file.isDirectory()) {
            return;
        }
        if (!file.exists()) {
            file.mkdirs();
            return;
        }
        throw new java.lang.IllegalStateException("Path " + file.getAbsolutePath() + " is pointed to an existing element but it is not a directory.");
    }

    public static final void b(java.lang.String str) {
        oj.j.c("Matrix.MemoryUtil", str, new java.lang.Object[0]);
    }
}
