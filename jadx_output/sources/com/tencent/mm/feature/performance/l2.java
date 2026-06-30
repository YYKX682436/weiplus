package com.tencent.mm.feature.performance;

/* loaded from: classes12.dex */
public class l2 implements java.lang.Runnable {
    public l2(com.tencent.mm.feature.performance.m2 m2Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        ob0.s3 g17 = com.tencent.mm.plugin.performance.watchdogs.b0.B.g();
        com.tencent.mm.sdk.platformtools.o4 o4Var = sp3.d.f411307a;
        java.util.HashSet hashSet = new java.util.HashSet();
        int i17 = -1;
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream("/proc/self/maps")));
            while (true) {
                try {
                    java.lang.String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    if (readLine.endsWith(".so") && readLine.contains("com.tencent.mm")) {
                        hashSet.add(readLine.split("/")[r0.length - 1]);
                    }
                } finally {
                }
            }
            bufferedReader.close();
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.performance.Utils", e17, "", new java.lang.Object[0]);
        }
        java.lang.Object[] array = hashSet.toArray();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ob0.s3[] s3VarArr = g17.C;
        if (s3VarArr != null && s3VarArr.length > 0) {
            sb6.append("allProcess:");
            for (ob0.s3 s3Var : g17.C) {
                sb6.append(s3Var.f343944a);
                sb6.append("-");
                sb6.append(s3Var.f343945b);
                sb6.append("-pss:");
                sb6.append(s3Var.f343968y);
                sb6.append(";");
            }
        }
        if (array != null && (i17 = array.length) > 0) {
            sb6.append("loaded so:");
            for (java.lang.Object obj : array) {
                sb6.append(obj);
                sb6.append(";");
            }
        }
        com.tencent.mm.plugin.performance.watchdogs.a0.h(32, g17.f343959p - g17.f343960q, g17.f343957n, g17.f343948e, g17.f343968y, g17.A, sb6.toString(), i17, -2L, -2L, -1L, g17.f343967x.totalMem, "", "", "", "", g17.f343969z, g17.f343950g, null);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
    }
}
