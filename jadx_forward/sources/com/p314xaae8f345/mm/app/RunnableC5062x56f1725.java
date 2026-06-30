package com.p314xaae8f345.mm.app;

/* renamed from: com.tencent.mm.app.a4$$x */
/* loaded from: classes11.dex */
public final /* synthetic */ class RunnableC5062x56f1725 implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        java.io.File[] listFiles;
        java.io.BufferedInputStream bufferedInputStream;
        int length;
        byte[] bArr;
        int read;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMCrashReporter", "reportPreviousAnr");
        java.io.File file = new java.io.File(new java.io.File(new java.io.File(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getFilesDir(), com.p314xaae8f345.mm.app.C4999x403c3a42.f134755c), "history"), bm5.f1.a());
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            for (java.io.File file2 : listFiles) {
                java.lang.String name = file2.getName();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMCrashReporter", "reportPreviousAnr, fileName = " + name);
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (file2.exists()) {
                    try {
                        bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(file2));
                        try {
                            length = (int) file2.length();
                            bArr = new byte[length];
                            read = bufferedInputStream.read(bArr);
                        } finally {
                            break;
                        }
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e17, "", new java.lang.Object[0]);
                    }
                    if (read != length) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Util", "readFromFile error, size is not equal, path = %s, file length is %d, count is %d", file2.getAbsolutePath(), java.lang.Integer.valueOf(length), java.lang.Integer.valueOf(read));
                        bufferedInputStream.close();
                    } else {
                        bufferedInputStream.close();
                        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
                        long parseLong = java.lang.Long.parseLong(name);
                        com.p314xaae8f345.mm.app.w wVar = com.p314xaae8f345.mm.app.w.INSTANCE;
                        java.lang.String h17 = wVar.h();
                        java.lang.String str2 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134252a;
                        jx3.f.INSTANCE.d(19664, str, h17, 20, java.lang.Integer.valueOf((!com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134272u || wVar.f135422n) ? 1 : 0), bm5.f1.a(), k35.m1.d(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f, parseLong / 1000), com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e, "", 0, 0, 1, 0, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g, "", 0, 0, 0, "", "", "", "", "", 0, 1, "", com.p314xaae8f345.mm.app.a4.f());
                        file2.delete();
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Util", "readFromFile error, file is not exit, path = %s", file2.getAbsolutePath());
                }
                bArr = null;
                java.lang.String str3 = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
                long parseLong2 = java.lang.Long.parseLong(name);
                com.p314xaae8f345.mm.app.w wVar2 = com.p314xaae8f345.mm.app.w.INSTANCE;
                java.lang.String h172 = wVar2.h();
                java.lang.String str22 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134252a;
                jx3.f.INSTANCE.d(19664, str3, h172, 20, java.lang.Integer.valueOf((!com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134272u || wVar2.f135422n) ? 1 : 0), bm5.f1.a(), k35.m1.d(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f, parseLong2 / 1000), com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e, "", 0, 0, 1, 0, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g, "", 0, 0, 0, "", "", "", "", "", 0, 1, "", com.p314xaae8f345.mm.app.a4.f());
                file2.delete();
            }
        }
    }
}
