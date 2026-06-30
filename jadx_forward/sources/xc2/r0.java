package xc2;

/* loaded from: classes.dex */
public abstract class r0 {
    /* JADX WARN: Removed duplicated region for block: B:19:0x001d A[Catch: Exception -> 0x0012, TryCatch #0 {Exception -> 0x0012, blocks: (B:21:0x0009, B:5:0x0017, B:6:0x0022, B:7:0x002a, B:9:0x0030, B:11:0x0044, B:19:0x001d), top: B:20:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0017 A[Catch: Exception -> 0x0012, TryCatch #0 {Exception -> 0x0012, blocks: (B:21:0x0009, B:5:0x0017, B:6:0x0022, B:7:0x002a, B:9:0x0030, B:11:0x0044, B:19:0x001d), top: B:20:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[Catch: Exception -> 0x0012, LOOP:0: B:7:0x002a->B:9:0x0030, LOOP_END, TryCatch #0 {Exception -> 0x0012, blocks: (B:21:0x0009, B:5:0x0017, B:6:0x0022, B:7:0x002a, B:9:0x0030, B:11:0x0044, B:19:0x001d), top: B:20:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String a(java.lang.String r5, java.util.Map r6) {
        /*
            java.lang.String r0 = "params"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            xc2.q0 r0 = xc2.q0.f534805d
            if (r5 == 0) goto L14
            int r1 = r5.length()     // Catch: java.lang.Exception -> L12
            if (r1 != 0) goto L10
            goto L14
        L10:
            r1 = 0
            goto L15
        L12:
            r1 = move-exception
            goto L4c
        L14:
            r1 = 1
        L15:
            if (r1 != 0) goto L1d
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L12
            r1.<init>(r5)     // Catch: java.lang.Exception -> L12
            goto L22
        L1d:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L12
            r1.<init>()     // Catch: java.lang.Exception -> L12
        L22:
            java.util.Set r2 = r6.entrySet()     // Catch: java.lang.Exception -> L12
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> L12
        L2a:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Exception -> L12
            if (r3 == 0) goto L44
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Exception -> L12
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Exception -> L12
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Exception -> L12
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L12
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Exception -> L12
            r1.put(r4, r3)     // Catch: java.lang.Exception -> L12
            goto L2a
        L44:
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L12
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1)     // Catch: java.lang.Exception -> L12
            goto L6a
        L4c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "appendToJson error: "
            r2.<init>(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "JsonExt"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r1)
            java.lang.Object r5 = r0.mo149xb9724478(r5, r6)
            r1 = r5
            java.lang.String r1 = (java.lang.String) r1
        L6a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: xc2.r0.a(java.lang.String, java.util.Map):java.lang.String");
    }
}
