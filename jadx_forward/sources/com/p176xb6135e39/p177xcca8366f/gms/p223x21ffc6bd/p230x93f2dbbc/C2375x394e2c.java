package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzxd */
/* loaded from: classes13.dex */
public final class C2375x394e2c {

    /* renamed from: zzbnx */
    private static final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2376x394e2d f7197x6f0266c;

    /* renamed from: zzbny */
    private static final int f7198x6f0266d;

    /* renamed from: com.google.android.gms.internal.measurement.zzxd$zza */
    /* loaded from: classes13.dex */
    public static final class zza extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2376x394e2d {
        @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2376x394e2d
        public final void zza(java.lang.Throwable th6, java.io.PrintStream printStream) {
            th6.printStackTrace(printStream);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0064  */
    static {
        /*
            r0 = 1
            java.lang.Integer r1 = m19362x394d91()     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L15
            int r2 = r1.intValue()     // Catch: java.lang.Throwable -> L2a
            r3 = 19
            if (r2 < r3) goto L15
            com.google.android.gms.internal.measurement.zzxi r2 = new com.google.android.gms.internal.measurement.zzxi     // Catch: java.lang.Throwable -> L2a
            r2.<init>()     // Catch: java.lang.Throwable -> L2a
            goto L5f
        L15:
            java.lang.String r2 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"
            boolean r2 = java.lang.Boolean.getBoolean(r2)     // Catch: java.lang.Throwable -> L2a
            r2 = r2 ^ r0
            if (r2 == 0) goto L24
            com.google.android.gms.internal.measurement.zzxh r2 = new com.google.android.gms.internal.measurement.zzxh     // Catch: java.lang.Throwable -> L2a
            r2.<init>()     // Catch: java.lang.Throwable -> L2a
            goto L5f
        L24:
            com.google.android.gms.internal.measurement.zzxd$zza r2 = new com.google.android.gms.internal.measurement.zzxd$zza     // Catch: java.lang.Throwable -> L2a
            r2.<init>()     // Catch: java.lang.Throwable -> L2a
            goto L5f
        L2a:
            r2 = move-exception
            goto L2e
        L2c:
            r2 = move-exception
            r1 = 0
        L2e:
            java.io.PrintStream r3 = java.lang.System.err
            java.lang.Class<com.google.android.gms.internal.measurement.zzxd$zza> r4 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2375x394e2c.zza.class
            java.lang.String r4 = r4.getName()
            int r5 = r4.length()
            int r5 = r5 + 132
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "An error has occured when initializing the try-with-resources desuguring strategy. The default strategy "
            r6.append(r5)
            r6.append(r4)
            java.lang.String r4 = "will be used. The error is: "
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r3.println(r4)
            java.io.PrintStream r3 = java.lang.System.err
            r2.printStackTrace(r3)
            com.google.android.gms.internal.measurement.zzxd$zza r2 = new com.google.android.gms.internal.measurement.zzxd$zza
            r2.<init>()
        L5f:
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2375x394e2c.f7197x6f0266c = r2
            if (r1 != 0) goto L64
            goto L68
        L64:
            int r0 = r1.intValue()
        L68:
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2375x394e2c.f7198x6f0266d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2375x394e2c.m19361x8c160ea9():void");
    }

    public static void zza(java.lang.Throwable th6, java.io.PrintStream printStream) {
        f7197x6f0266c.zza(th6, printStream);
    }

    /* renamed from: zzsd */
    private static java.lang.Integer m19362x394d91() {
        try {
            return (java.lang.Integer) java.lang.Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (java.lang.Exception e17) {
            java.lang.System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e17.printStackTrace(java.lang.System.err);
            return null;
        }
    }
}
