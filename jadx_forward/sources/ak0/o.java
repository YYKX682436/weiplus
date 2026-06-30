package ak0;

/* loaded from: classes12.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static volatile ak0.a f87075a;

    /* renamed from: b, reason: collision with root package name */
    public static android.content.Context f87076b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentLinkedQueue f87077c = new java.util.concurrent.ConcurrentLinkedQueue();

    public static android.content.Context a() {
        android.content.Context context = f87076b;
        if (context != null) {
            return context;
        }
        throw new java.lang.IllegalStateException("Helper context is not initialized");
    }

    public static ak0.a b() {
        ak0.a aVar = f87075a;
        if (aVar != null) {
            return aVar;
        }
        throw new java.lang.IllegalStateException("Helper is not initialized");
    }

    public static java.io.File c() {
        java.lang.String a17;
        java.lang.String m104684x2e62bb27;
        java.io.File file;
        ak0.x xVar = (ak0.x) b();
        java.lang.Object[] objArr = xVar.f87091i;
        java.lang.Object obj = objArr[0];
        java.lang.Object obj2 = ak0.x.f87082l;
        if (obj != obj2) {
            return (java.io.File) obj;
        }
        synchronized (objArr) {
            java.lang.Object obj3 = xVar.f87091i[0];
            if (obj3 != obj2) {
                return (java.io.File) obj3;
            }
            java.io.File m104679xac1dbbfb = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104679xac1dbbfb(xVar.f87083a.m104434x367a4c1a());
            if (m104679xac1dbbfb != null && (a17 = xVar.a()) != null && (m104684x2e62bb27 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104684x2e62bb27(a17)) != null) {
                file = new java.io.File(m104679xac1dbbfb, m104684x2e62bb27);
                xVar.f87091i[0] = file;
                return file;
            }
            file = null;
            xVar.f87091i[0] = file;
            return file;
        }
    }

    public static java.lang.String d() {
        java.lang.String str;
        ak0.x xVar = (ak0.x) b();
        java.lang.Object[] objArr = xVar.f87090h;
        java.lang.Object obj = objArr[0];
        java.lang.Object obj2 = ak0.x.f87082l;
        if (obj != obj2) {
            return (java.lang.String) obj;
        }
        synchronized (objArr) {
            java.lang.Object obj3 = xVar.f87090h[0];
            if (obj3 != obj2) {
                str = (java.lang.String) obj3;
            } else {
                str = (java.lang.String) xVar.b().get(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55696xe7860e3c);
                xVar.f87090h[0] = str;
            }
        }
        return str;
    }

    public static java.lang.String e() {
        java.lang.String str;
        ak0.x xVar = (ak0.x) b();
        java.lang.Object[] objArr = xVar.f87089g;
        java.lang.Object obj = objArr[0];
        java.lang.Object obj2 = ak0.x.f87082l;
        if (obj != obj2) {
            return (java.lang.String) obj;
        }
        synchronized (objArr) {
            java.lang.Object obj3 = xVar.f87089g[0];
            if (obj3 != obj2) {
                str = (java.lang.String) obj3;
            } else {
                str = (java.lang.String) xVar.b().get("patch.rev");
                xVar.f87089g[0] = str;
            }
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean f() {
        /*
            ak0.a r0 = b()
            ak0.x r0 = (ak0.x) r0
            int[] r1 = r0.f87086d
            r2 = 0
            r3 = r1[r2]
            r4 = 1
            r5 = -1
            if (r3 == r5) goto L13
            if (r3 != r4) goto L3b
            r2 = r4
            goto L3b
        L13:
            monitor-enter(r1)
            int[] r3 = r0.f87086d     // Catch: java.lang.Throwable -> L3c
            r3 = r3[r2]     // Catch: java.lang.Throwable -> L3c
            if (r3 == r5) goto L1f
            if (r3 != r4) goto L1d
            r2 = r4
        L1d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3c
            goto L3b
        L1f:
            com.tencent.tinker.entry.ApplicationLike r3 = r0.f87083a     // Catch: java.lang.Throwable -> L3c
            android.content.Intent r3 = r3.m104443xced0bce()     // Catch: java.lang.Throwable -> L3c
            if (r3 != 0) goto L28
            goto L30
        L28:
            int r3 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.m104650xc7992e6f(r3)     // Catch: java.lang.Throwable -> L3c
            if (r3 != 0) goto L30
            r3 = r4
            goto L31
        L30:
            r3 = r2
        L31:
            int[] r0 = r0.f87086d     // Catch: java.lang.Throwable -> L3c
            if (r3 == 0) goto L36
            goto L37
        L36:
            r4 = r2
        L37:
            r0[r2] = r4     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3c
            r2 = r3
        L3b:
            return r2
        L3c:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ak0.o.f():boolean");
    }

    public static boolean g() {
        ak0.x xVar = (ak0.x) b();
        int[] iArr = xVar.f87084b;
        int i17 = iArr[0];
        int i18 = 1;
        if (i17 != -1) {
            return i17 == 1;
        }
        synchronized (iArr) {
            int i19 = xVar.f87084b[0];
            if (i19 != -1) {
                return i19 == 1;
            }
            com.p314xaae8f345.p3076xcbed6b1f.p3078x5c30872.AbstractC26587x7a37b8e7 abstractC26587x7a37b8e7 = xVar.f87083a;
            boolean z17 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104747x96001e18(abstractC26587x7a37b8e7.m104441x4986f572()) && com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104746x7b8798c1(abstractC26587x7a37b8e7.m104434x367a4c1a());
            int[] iArr2 = xVar.f87084b;
            if (!z17) {
                i18 = 0;
            }
            iArr2[0] = i18;
            return z17;
        }
    }
}
