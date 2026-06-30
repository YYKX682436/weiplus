package com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e;

/* loaded from: classes12.dex */
public class w implements java.lang.Runnable {
    public w(com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.x xVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        java.io.File[] listFiles;
        xi.k kVar = xi.k.f536194e;
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (kVar.b().exists() && kVar.b().isDirectory() && (listFiles = kVar.b().listFiles(new xi.f(kVar, currentTimeMillis))) != null) {
                for (java.io.File file : listFiles) {
                    if (file.exists()) {
                        oj.j.c("Matrix.HprofFileManager", "expired: " + file.getAbsolutePath(), new java.lang.Object[0]);
                        file.delete();
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.HprofFileManager", th6, "", new java.lang.Object[0]);
        }
    }
}
