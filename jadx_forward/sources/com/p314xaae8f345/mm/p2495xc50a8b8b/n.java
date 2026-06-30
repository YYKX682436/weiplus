package com.p314xaae8f345.mm.p2495xc50a8b8b;

/* loaded from: classes11.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static int f273705a = 1048576;

    /* renamed from: b, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p2495xc50a8b8b.l f273706b;

    public static final void a(java.lang.String message, java.lang.Throwable throwable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(throwable, "throwable");
        if (f273706b != null) {
            java.lang.String message2 = message + ": \n" + com.p314xaae8f345.mm.p2495xc50a8b8b.p.a(throwable);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message2, "message");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SerializeTelemetryHelper.PB", message2);
        }
    }

    public static final void b(java.util.Map params, byte[] bArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        if (f273706b != null) {
            java.lang.String valueOf = java.lang.String.valueOf(ri.l0.a(params));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SerializeTelemetryHelper.PB", valueOf);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6423x452b9f7c c6423x452b9f7c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6423x452b9f7c();
            c6423x452b9f7c.f137646e = 2662L;
            c6423x452b9f7c.p("PB.22");
            c6423x452b9f7c.f137648g = oj.d.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).f427215d;
            c6423x452b9f7c.s((java.lang.String) params.get("compute_size"));
            c6423x452b9f7c.t((java.lang.String) params.get("initial_size"));
            c6423x452b9f7c.r(valueOf);
            c6423x452b9f7c.k();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e A[Catch: all -> 0x000b, TryCatch #0 {all -> 0x000b, blocks: (B:23:0x0002, B:7:0x001d, B:9:0x002e, B:10:0x0031, B:3:0x000f, B:5:0x0018), top: B:22:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(byte[] r4, java.lang.Integer r5) {
        /*
            if (r5 == 0) goto Ld
            int r0 = r5.intValue()     // Catch: java.lang.Throwable -> Lb
            int r1 = com.p314xaae8f345.mm.p2495xc50a8b8b.n.f273705a     // Catch: java.lang.Throwable -> Lb
            if (r0 >= r1) goto L1d
            goto Ld
        Lb:
            r4 = move-exception
            goto L64
        Ld:
            if (r4 == 0) goto L15
            int r0 = r4.length     // Catch: java.lang.Throwable -> Lb
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lb
            goto L16
        L15:
            r0 = 0
        L16:
            if (r0 == 0) goto L69
            int r0 = r4.length     // Catch: java.lang.Throwable -> Lb
            int r1 = com.p314xaae8f345.mm.p2495xc50a8b8b.n.f273705a     // Catch: java.lang.Throwable -> Lb
            if (r0 < r1) goto L69
        L1d:
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lb
            r0.<init>()     // Catch: java.lang.Throwable -> Lb
            java.lang.String r1 = "version"
            java.lang.String r2 = "PB.20251013"
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r1 = "initial_size"
            if (r4 == 0) goto L30
            int r2 = r4.length     // Catch: java.lang.Throwable -> Lb
            goto L31
        L30:
            r2 = -1
        L31:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb
            r3.<init>()     // Catch: java.lang.Throwable -> Lb
            r3.append(r2)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> Lb
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r1 = "compute_size"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb
            r2.<init>()     // Catch: java.lang.Throwable -> Lb
            r2.append(r5)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> Lb
            r0.put(r1, r5)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r5 = "stack"
            java.lang.Throwable r1 = new java.lang.Throwable     // Catch: java.lang.Throwable -> Lb
            r1.<init>()     // Catch: java.lang.Throwable -> Lb
            java.lang.String r1 = com.p314xaae8f345.mm.p2495xc50a8b8b.p.a(r1)     // Catch: java.lang.Throwable -> Lb
            r0.put(r5, r1)     // Catch: java.lang.Throwable -> Lb
            b(r0, r4)     // Catch: java.lang.Throwable -> Lb
            goto L69
        L64:
            java.lang.String r5 = "report err"
            a(r5, r4)
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2495xc50a8b8b.n.c(byte[], java.lang.Integer):void");
    }
}
