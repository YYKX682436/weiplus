package oj;

/* loaded from: classes12.dex */
public final class h0 {
    public h0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4724x85953be0 a(int i17) {
        java.io.BufferedReader bufferedReader;
        java.util.Map map = kz5.q0.f395534d;
        try {
            java.io.Reader inputStreamReader = new java.io.InputStreamReader(new java.io.FileInputStream(new java.io.File("/proc/" + i17 + "/status")), r26.c.f450398a);
            bufferedReader = inputStreamReader instanceof java.io.BufferedReader ? (java.io.BufferedReader) inputStreamReader : new java.io.BufferedReader(inputStreamReader, 8192);
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.MemoryInfoFactory", th6, "", new java.lang.Object[0]);
        }
        try {
            q26.n m17 = q26.h0.m(vz5.v.b(bufferedReader), oj.f0.f427233d);
            java.util.Map linkedHashMap = new java.util.LinkedHashMap();
            q26.j jVar = new q26.j((q26.k) m17);
            while (jVar.hasNext()) {
                jz5.l lVar = (jz5.l) jVar.next();
                linkedHashMap.put(lVar.f384366d, lVar.f384367e);
            }
            int size = linkedHashMap.size();
            if (size == 0) {
                linkedHashMap = map;
            } else if (size == 1) {
                linkedHashMap = kz5.b1.f(linkedHashMap);
            }
            vz5.b.a(bufferedReader, null);
            map = linkedHashMap;
            com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4724x85953be0 c4724x85953be0 = new com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4724x85953be0("default", -1L, -1L, -1L, -1L, -1L, -1, -1);
            try {
                oj.g0 g0Var = oj.g0.f427238d;
                java.lang.String str = (java.lang.String) map.get("State");
                if (str == null) {
                    str = com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
                }
                java.lang.String b17 = r26.b0.b(str);
                long a17 = g0Var.a(map, "FDSize");
                long a18 = g0Var.a(map, "VmSize");
                long a19 = g0Var.a(map, "VmRSS");
                long a27 = g0Var.a(map, "VmSwap");
                long a28 = g0Var.a(map, "Threads");
                oj.h0 h0Var = com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4724x85953be0.f134659o;
                return new com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4724x85953be0(b17, a17, a18, a19, a27, a28, h0Var.b(i17), h0Var.c(i17));
            } catch (java.lang.Throwable th7) {
                oj.j.d("Matrix.MemoryInfoFactory", th7, "", new java.lang.Object[0]);
                return c4724x85953be0;
            }
        } finally {
        }
    }

    public final int b(int i17) {
        try {
            java.io.Reader inputStreamReader = new java.io.InputStreamReader(new java.io.FileInputStream(new java.io.File("/proc/" + i17 + "/oom_adj")), r26.c.f450398a);
            java.io.BufferedReader bufferedReader = inputStreamReader instanceof java.io.BufferedReader ? (java.io.BufferedReader) inputStreamReader : new java.io.BufferedReader(inputStreamReader, 8192);
            try {
                int parseInt = java.lang.Integer.parseInt((java.lang.String) q26.h0.k(vz5.v.b(bufferedReader)));
                vz5.b.a(bufferedReader, null);
                return parseInt;
            } finally {
            }
        } catch (java.lang.Throwable unused) {
            return Integer.MAX_VALUE;
        }
    }

    public final int c(int i17) {
        try {
            java.io.Reader inputStreamReader = new java.io.InputStreamReader(new java.io.FileInputStream(new java.io.File("/proc/" + i17 + "/oom_score_adj")), r26.c.f450398a);
            java.io.BufferedReader bufferedReader = inputStreamReader instanceof java.io.BufferedReader ? (java.io.BufferedReader) inputStreamReader : new java.io.BufferedReader(inputStreamReader, 8192);
            try {
                int parseInt = java.lang.Integer.parseInt((java.lang.String) q26.h0.k(vz5.v.b(bufferedReader)));
                vz5.b.a(bufferedReader, null);
                return parseInt;
            } finally {
            }
        } catch (java.lang.Throwable unused) {
            return Integer.MAX_VALUE;
        }
    }
}
