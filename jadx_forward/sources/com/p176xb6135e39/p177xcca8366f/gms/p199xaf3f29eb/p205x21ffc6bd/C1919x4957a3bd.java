package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd;

@java.lang.Deprecated
/* renamed from: com.google.android.gms.common.internal.LibraryVersion */
/* loaded from: classes13.dex */
public class C1919x4957a3bd {
    private static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1912xa544641d zza = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1912xa544641d("LibraryVersion", "");
    private static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1919x4957a3bd zzb = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1919x4957a3bd();
    private final java.util.concurrent.ConcurrentHashMap zzc = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: getInstance */
    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1919x4957a3bd m18185x9cf0d20b() {
        return zzb;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    @java.lang.Deprecated
    /* renamed from: getVersion */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String m18186x52c258a2(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "LibraryVersion"
            java.lang.String r1 = "Failed to get app version for libraryName: "
            java.lang.String r2 = "Please provide a valid libraryName"
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18209xec737762(r9, r2)
            java.util.concurrent.ConcurrentHashMap r2 = r8.zzc
            boolean r2 = r2.containsKey(r9)
            if (r2 == 0) goto L1a
            java.util.concurrent.ConcurrentHashMap r0 = r8.zzc
            java.lang.Object r9 = r0.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            return r9
        L1a:
            java.util.Properties r2 = new java.util.Properties
            r2.<init>()
            r3 = 0
            java.lang.String r4 = "/%s.properties"
            java.lang.Object[] r5 = new java.lang.Object[]{r9}     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
            java.lang.String r4 = java.lang.String.format(r4, r5)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
            java.lang.Class<com.google.android.gms.common.internal.LibraryVersion> r5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1919x4957a3bd.class
            java.io.InputStream r4 = r5.getResourceAsStream(r4)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
            if (r4 == 0) goto L55
            r2.load(r4)     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            java.lang.String r5 = "version"
            java.lang.String r3 = r2.getProperty(r5, r3)     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            com.google.android.gms.common.internal.GmsLogger r2 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1919x4957a3bd.zza     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            r5.<init>()     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            r5.append(r9)     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            java.lang.String r6 = " version is "
            r5.append(r6)     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            r5.append(r3)     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            r2.v(r0, r5)     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            goto L87
        L55:
            com.google.android.gms.common.internal.GmsLogger r2 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1919x4957a3bd.zza     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            r5.append(r9)     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            r2.w(r0, r5)     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            goto L87
        L67:
            r9 = move-exception
            r3 = r4
            goto L9d
        L6a:
            r2 = move-exception
            r7 = r4
            r4 = r3
            r3 = r7
            goto L73
        L6f:
            r9 = move-exception
            goto L9d
        L71:
            r2 = move-exception
            r4 = r3
        L73:
            com.google.android.gms.common.internal.GmsLogger r5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1919x4957a3bd.zza     // Catch: java.lang.Throwable -> L6f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L6f
            r6.append(r9)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L6f
            r5.e(r0, r1, r2)     // Catch: java.lang.Throwable -> L6f
            r7 = r4
            r4 = r3
            r3 = r7
        L87:
            if (r4 == 0) goto L8c
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2001xa159df2b.m18580xd71209a9(r4)
        L8c:
            if (r3 != 0) goto L97
            com.google.android.gms.common.internal.GmsLogger r1 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1919x4957a3bd.zza
            java.lang.String r2 = ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used"
            r1.d(r0, r2)
            java.lang.String r3 = "UNKNOWN"
        L97:
            java.util.concurrent.ConcurrentHashMap r0 = r8.zzc
            r0.put(r9, r3)
            return r3
        L9d:
            if (r3 == 0) goto La2
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2001xa159df2b.m18580xd71209a9(r3)
        La2:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1919x4957a3bd.m18186x52c258a2(java.lang.String):java.lang.String");
    }
}
