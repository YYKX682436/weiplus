package com.p314xaae8f345.mm.p669x38b6e557;

/* renamed from: com.tencent.mm.console.n3$$a */
/* loaded from: classes7.dex */
public final /* synthetic */ class RunnableC10409x625d43c implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OPENGL_HOOK_DUMP", "OPENGL_HOOK_DUMP begin");
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getExternalCacheDir() + "/Diagnostic";
        java.lang.String str2 = str + "/" + android.os.Process.myPid() + "_opengl_dump.txt";
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str3 = a17.f294812f;
        if (str3 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(str2);
        com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
        com.p314xaae8f345.mm.vfs.z2 m17 = b3Var.m(a17, null);
        if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
            com.p314xaae8f345.mm.vfs.z2 m18 = b3Var.m(a17, m17);
            if (m18.a()) {
                m18.f294799a.r(m18.f294800b);
            }
        }
        if (r6Var.m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OPENGL_HOOK_DUMP", "delete openGL dumpFile result = " + r6Var.l());
        }
        try {
            r6Var.k();
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.OPENGL_HOOK_DUMP", e17, "openGL dumpFile createNewFile failed.", new java.lang.Object[0]);
        }
        oi.h hVar = oi.h.f427100e;
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
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(com.p314xaae8f345.mm.vfs.w6.E(str2)));
            while (true) {
                try {
                    java.lang.String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OPENGL_HOOK_DUMP", readLine);
                    }
                } finally {
                }
            }
            bufferedReader.close();
        } catch (java.io.IOException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Shell", e18, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OPENGL_HOOK_DUMP", "OPENGL_HOOK_DUMP success: file path = " + str2 + ", cost = " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
    }
}
