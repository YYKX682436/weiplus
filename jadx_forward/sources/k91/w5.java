package k91;

/* loaded from: classes7.dex */
public class w5 {

    /* renamed from: a, reason: collision with root package name */
    public static final android.net.Uri f387345a = android.net.Uri.parse("content://" + rf.a.f476139a + "/WxaAttributesTable");

    /* renamed from: b, reason: collision with root package name */
    public static final k91.w5 f387346b = new k91.w5();

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        if (r12.moveToFirst() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        r1 = new k91.v5();
        r1.mo9015xbf5d97fd(r12);
        r0.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
    
        if (r12.moveToNext() != false) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List a(java.util.List r11, java.lang.String... r12) {
        /*
            r10 = this;
            if (r11 == 0) goto L9f
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto La
            goto L9f
        La:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r11)
            r1 = 0
            r2 = r1
        L11:
            int r3 = r0.size()
            if (r2 >= r3) goto L2d
            java.util.Locale r3 = java.util.Locale.ENGLISH
            java.lang.Object r4 = r0.get(r2)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r5 = "'%s'"
            java.lang.String r3 = java.lang.String.format(r3, r5, r4)
            r0.set(r2, r3)
            int r2 = r2 + 1
            goto L11
        L2d:
            java.lang.String r2 = ","
            java.lang.String r0 = u46.l.h(r0, r2)
            r2 = 0
            android.content.Context r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a     // Catch: java.lang.Throwable -> L8a
            android.content.ContentResolver r4 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L8a
            android.net.Uri r5 = k91.w5.f387345a     // Catch: java.lang.Throwable -> L8a
            int r3 = r12.length     // Catch: java.lang.Throwable -> L8a
            if (r3 > 0) goto L41
            r6 = r2
            goto L42
        L41:
            r6 = r12
        L42:
            java.util.Locale r12 = java.util.Locale.ENGLISH     // Catch: java.lang.Throwable -> L8a
            java.lang.String r3 = "%s in (%s)"
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L8a
            java.lang.String r8 = "appId"
            r7[r1] = r8     // Catch: java.lang.Throwable -> L8a
            r1 = 1
            r7[r1] = r0     // Catch: java.lang.Throwable -> L8a
            java.lang.String r7 = java.lang.String.format(r12, r3, r7)     // Catch: java.lang.Throwable -> L8a
            r8 = 0
            r9 = 0
            android.database.Cursor r12 = r4.query(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L8a
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch: java.lang.Throwable -> L7e
            r0.<init>()     // Catch: java.lang.Throwable -> L7e
            if (r12 == 0) goto L78
            boolean r1 = r12.moveToFirst()     // Catch: java.lang.Throwable -> L7e
            if (r1 == 0) goto L78
        L67:
            k91.v5 r1 = new k91.v5     // Catch: java.lang.Throwable -> L7e
            r1.<init>()     // Catch: java.lang.Throwable -> L7e
            r1.mo9015xbf5d97fd(r12)     // Catch: java.lang.Throwable -> L7e
            r0.add(r1)     // Catch: java.lang.Throwable -> L7e
            boolean r1 = r12.moveToNext()     // Catch: java.lang.Throwable -> L7e
            if (r1 != 0) goto L67
        L78:
            if (r12 == 0) goto L7d
            r12.close()     // Catch: java.lang.Throwable -> L8a
        L7d:
            return r0
        L7e:
            r0 = move-exception
            if (r12 == 0) goto L89
            r12.close()     // Catch: java.lang.Throwable -> L85
            goto L89
        L85:
            r12 = move-exception
            r0.addSuppressed(r12)     // Catch: java.lang.Throwable -> L8a
        L89:
            throw r0     // Catch: java.lang.Throwable -> L8a
        L8a:
            r12 = move-exception
            int r11 = r11.size()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Object[] r11 = new java.lang.Object[]{r11, r12}
            java.lang.String r12 = "Luggage.WxaAttrsContentResolver"
            java.lang.String r0 = "batchQueryWithAppIds appIdList.size:%d, t=%s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r12, r0, r11)
            return r2
        L9f:
            java.util.List r11 = java.util.Collections.emptyList()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: k91.w5.a(java.util.List, java.lang.String[]):java.util.List");
    }

    public k91.v5 b(java.lang.String str, java.lang.String... strArr) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        k91.v5 c17 = c(null, java.lang.String.format("%s=?", "appId"), new java.lang.String[]{str});
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WxaAttrsContentResolver", "queryWithAppId appId:%s, cost:%dms, columns:%s", str, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), java.util.Arrays.toString(strArr));
        return c17;
    }

    public final k91.v5 c(java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2) {
        android.database.Cursor query = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver().query(f387345a, strArr, str, strArr2, null);
        k91.v5 v5Var = null;
        if (query == null) {
            return null;
        }
        if (!query.isClosed() && query.moveToFirst()) {
            v5Var = new k91.v5();
            v5Var.mo9015xbf5d97fd(query);
        }
        query.close();
        return v5Var;
    }
}
