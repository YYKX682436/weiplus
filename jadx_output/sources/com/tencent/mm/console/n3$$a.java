package com.tencent.mm.console;

/* loaded from: classes7.dex */
public final /* synthetic */ class n3$$a implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.OPENGL_HOOK_DUMP", "OPENGL_HOOK_DUMP begin");
        java.lang.String str = com.tencent.mm.sdk.platformtools.x2.f193071a.getExternalCacheDir() + "/Diagnostic";
        java.lang.String str2 = str + "/" + android.os.Process.myPid() + "_opengl_dump.txt";
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str3 = a17.f213279f;
        if (str3 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(str2);
        com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
        com.tencent.mm.vfs.z2 m17 = b3Var.m(a17, null);
        if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
            com.tencent.mm.vfs.z2 m18 = b3Var.m(a17, m17);
            if (m18.a()) {
                m18.f213266a.r(m18.f213267b);
            }
        }
        if (r6Var.m()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OPENGL_HOOK_DUMP", "delete openGL dumpFile result = " + r6Var.l());
        }
        try {
            r6Var.k();
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.OPENGL_HOOK_DUMP", e17, "openGL dumpFile createNewFile failed.", new java.lang.Object[0]);
        }
        oi.h hVar = oi.h.f345567e;
        hVar.getClass();
        java.io.File file = new java.io.File(str2);
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
        } catch (java.io.IOException unused) {
        }
        try {
            java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(file)));
            try {
                bufferedWriter.write(hVar.b());
                bufferedWriter.close();
            } finally {
            }
        } catch (java.io.IOException unused2) {
        }
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(com.tencent.mm.vfs.w6.E(str2)));
            while (true) {
                try {
                    java.lang.String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.OPENGL_HOOK_DUMP", readLine);
                    }
                } finally {
                }
            }
            bufferedReader.close();
        } catch (java.io.IOException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Shell", e18, "", new java.lang.Object[0]);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.OPENGL_HOOK_DUMP", "OPENGL_HOOK_DUMP success: file path = " + str2 + ", cost = " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
    }
}
