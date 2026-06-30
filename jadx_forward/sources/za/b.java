package za;

/* loaded from: classes13.dex */
public class b implements za.a {

    /* renamed from: b, reason: collision with root package name */
    public static volatile za.a f552396b;

    /* renamed from: a, reason: collision with root package name */
    public final com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb f552397a;

    public b(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb c2413x7b7e6fb) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2413x7b7e6fb);
        this.f552397a = c2413x7b7e6fb;
        new java.util.concurrent.ConcurrentHashMap();
    }

    /* renamed from: getInstance */
    public static za.a m178601x9cf0d20b(android.content.Context context) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(context);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(context.getApplicationContext());
        if (f552396b == null) {
            synchronized (za.a.class) {
                if (f552396b == null) {
                    f552396b = new za.b(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.m19464x9cf0d20b(context));
                }
            }
        }
        return f552396b;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* renamed from: logEvent */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m178602x769949b6(java.lang.String r5, java.lang.String r6, android.os.Bundle r7) {
        /*
            r4 = this;
            if (r7 != 0) goto L7
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
        L7:
            java.util.List r0 = ab.b.f84226b
            boolean r0 = r0.contains(r5)
            r1 = 1
            r0 = r0 ^ r1
            if (r0 != 0) goto L21
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r6 = r5.length()
            if (r6 == 0) goto L20
            java.lang.String r6 = "Origin not allowed : "
            r6.concat(r5)
        L20:
            return
        L21:
            java.util.List r0 = ab.b.f84225a
            boolean r0 = r0.contains(r6)
            r2 = 0
            if (r0 == 0) goto L2b
            goto L43
        L2b:
            java.util.List r0 = ab.b.f84227c
            java.util.Iterator r0 = r0.iterator()
        L31:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L45
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r7.containsKey(r3)
            if (r3 == 0) goto L31
        L43:
            r0 = r2
            goto L46
        L45:
            r0 = r1
        L46:
            if (r0 != 0) goto L49
            return
        L49:
            java.lang.String r0 = "_cmp"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L52
            goto L94
        L52:
            java.util.List r0 = ab.b.f84226b
            boolean r0 = r0.contains(r5)
            r0 = r0 ^ r1
            if (r0 != 0) goto L5c
            goto L88
        L5c:
            java.util.List r0 = ab.b.f84227c
            java.util.Iterator r0 = r0.iterator()
        L62:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L75
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r7.containsKey(r3)
            if (r3 == 0) goto L62
            goto L88
        L75:
            r5.getClass()
            java.lang.String r0 = "fcm"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L8d
            java.lang.String r0 = "fdl"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L8a
        L88:
            r1 = r2
            goto L94
        L8a:
            java.lang.String r0 = "fdl_integration"
            goto L8f
        L8d:
            java.lang.String r0 = "fcm_integration"
        L8f:
            java.lang.String r2 = "_cis"
            r7.putString(r2, r0)
        L94:
            if (r1 != 0) goto L97
            return
        L97:
            com.google.android.gms.measurement.AppMeasurement r0 = r4.f552397a
            r0.m19486xdfc15e93(r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: za.b.m178602x769949b6(java.lang.String, java.lang.String, android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    /* renamed from: setUserProperty */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m178603x2e43c042(java.lang.String r4, java.lang.String r5, java.lang.Object r6) {
        /*
            r3 = this;
            java.util.List r0 = ab.b.f84226b
            boolean r0 = r0.contains(r4)
            r1 = 1
            r0 = r0 ^ r1
            if (r0 != 0) goto L1a
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r5 = r4.length()
            if (r5 == 0) goto L19
            java.lang.String r5 = "Origin not allowed : "
            r5.concat(r4)
        L19:
            return
        L1a:
            java.util.List r0 = ab.b.f84228d
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L23
            goto L3b
        L23:
            java.util.List r0 = ab.b.f84229e
            java.util.Iterator r0 = r0.iterator()
        L29:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r5.matches(r2)
            if (r2 == 0) goto L29
        L3b:
            r1 = 0
        L3c:
            if (r1 != 0) goto L4e
            java.lang.String r4 = java.lang.String.valueOf(r5)
            int r5 = r4.length()
            if (r5 == 0) goto L4d
            java.lang.String r5 = "User Property not allowed : "
            r5.concat(r4)
        L4d:
            return
        L4e:
            java.lang.String r0 = "_ce1"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L5e
            java.lang.String r0 = "_ce2"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L7a
        L5e:
            java.lang.String r0 = "fcm"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L7a
            java.lang.String r0 = "frc"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L7a
            int r4 = r5.length()
            if (r4 == 0) goto L79
            java.lang.String r4 = "User Property not allowed for this origin: "
            r4.concat(r5)
        L79:
            return
        L7a:
            com.google.android.gms.measurement.AppMeasurement r0 = r3.f552397a
            r0.m19496xee02891f(r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: za.b.m178603x2e43c042(java.lang.String, java.lang.String, java.lang.Object):void");
    }
}
