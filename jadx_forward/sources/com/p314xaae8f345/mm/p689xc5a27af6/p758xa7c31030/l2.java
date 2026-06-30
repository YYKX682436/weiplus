package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030;

/* loaded from: classes12.dex */
public class l2 implements java.lang.Runnable {
    public l2(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.m2 m2Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        ob0.s3 g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.b0.B.g();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = sp3.d.f492840a;
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.performance.Utils", e17, "", new java.lang.Object[0]);
        }
        java.lang.Object[] array = hashSet.toArray();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ob0.s3[] s3VarArr = g17.C;
        if (s3VarArr != null && s3VarArr.length > 0) {
            sb6.append("allProcess:");
            for (ob0.s3 s3Var : g17.C) {
                sb6.append(s3Var.f425477a);
                sb6.append("-");
                sb6.append(s3Var.f425478b);
                sb6.append("-pss:");
                sb6.append(s3Var.f425501y);
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.a0.h(32, g17.f425492p - g17.f425493q, g17.f425490n, g17.f425481e, g17.f425501y, g17.A, sb6.toString(), i17, -2L, -2L, -1L, g17.f425500x.totalMem, "", "", "", "", g17.f425502z, g17.f425483g, null);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
    }
}
