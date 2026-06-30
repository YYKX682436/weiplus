package com.tencent.mm.console;

/* loaded from: classes7.dex */
public class u3 implements com.tencent.mm.console.h5 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        java.io.BufferedWriter bufferedWriter;
        if (!z65.c.a() && !com.tencent.mm.sdk.platformtools.s9.f192974b) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "not coolassist or monkey env, disable dump maps cmd.");
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("process_suffix");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            if (!com.tencent.mm.sdk.platformtools.x2.n()) {
                return;
            }
        } else if (!stringExtra.startsWith(":")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "DUMP_MAPS bad process suffix: %s", stringExtra);
            return;
        } else if (!bm5.f1.a().endsWith(stringExtra)) {
            return;
        }
        java.lang.String stringExtra2 = intent.getStringExtra("dump_maps_file_name");
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(lp0.b.D() + "hprofs");
        if (!r6Var.m()) {
            r6Var.J();
        }
        java.lang.String format = java.lang.String.format("%s/%s", r6Var, stringExtra2);
        java.lang.String format2 = java.lang.String.format("/proc/%s/maps", java.lang.Integer.valueOf(android.os.Process.myPid()));
        com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "dumpmaps input:%s , out:%s", format2, format);
        ?? r27 = 0;
        r27 = 0;
        r27 = 0;
        r27 = 0;
        r27 = 0;
        try {
            try {
                bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(com.tencent.mm.vfs.w6.K(format, false)));
                try {
                    java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(com.tencent.mm.vfs.w6.E(format2)));
                    while (true) {
                        try {
                            java.lang.String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            int length = readLine.length();
                            bufferedWriter.write(readLine, 0, length);
                            bufferedWriter.newLine();
                            r27 = length;
                        } catch (java.lang.Exception e17) {
                            e = e17;
                            r27 = bufferedReader;
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Shell", e, "ERROR when reading maps", new java.lang.Object[0]);
                            if (r27 != 0) {
                                try {
                                    r27.close();
                                } catch (java.io.IOException unused) {
                                }
                            }
                            if (bufferedWriter == null) {
                                return;
                            }
                            bufferedWriter.close();
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            r27 = bufferedReader;
                            if (r27 != 0) {
                                try {
                                    r27.close();
                                } catch (java.io.IOException unused2) {
                                }
                            }
                            if (bufferedWriter == null) {
                                throw th;
                            }
                            try {
                                bufferedWriter.close();
                                throw th;
                            } catch (java.io.IOException unused3) {
                                throw th;
                            }
                        }
                    }
                    bufferedWriter.flush();
                    try {
                        bufferedReader.close();
                    } catch (java.io.IOException unused4) {
                    }
                } catch (java.lang.Exception e18) {
                    e = e18;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
        } catch (java.lang.Exception e19) {
            e = e19;
            bufferedWriter = null;
        } catch (java.lang.Throwable th8) {
            th = th8;
            bufferedWriter = null;
        }
        try {
            bufferedWriter.close();
        } catch (java.io.IOException unused5) {
        }
    }
}
