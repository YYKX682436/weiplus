package v42;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final w42.b f514765a = new w42.a();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f514766b;

    /* JADX WARN: Removed duplicated region for block: B:13:0x006c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b() {
        /*
            r5 = this;
            r5.<init>()
            w42.a r0 = new w42.a
            r0.<init>()
            r5.f514765a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.f514766b = r0
            y42.a r1 = new y42.a
            r1.<init>()
            r0.add(r1)
            y42.c r1 = new y42.c
            r1.<init>()
            r0.add(r1)
            y42.b r1 = new y42.b
            r1.<init>()
            r0.add(r1)
            java.util.Iterator r0 = r0.iterator()
        L2d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L84
            java.lang.Object r1 = r0.next()
            x42.a r1 = (x42.a) r1
            w42.b r2 = r5.f514765a
            w42.a r2 = (w42.a) r2
            com.eclipsesource.mmv8.V8 r3 = r2.f524422a
            if (r3 == 0) goto L69
            boolean r3 = r3.mo16335xafdb8087()
            if (r3 != 0) goto L69
            if (r1 != 0) goto L4a
            goto L69
        L4a:
            com.eclipsesource.mmv8.V8 r2 = r2.f524422a     // Catch: java.lang.Throwable -> L55
            java.lang.String r3 = r1.a()     // Catch: java.lang.Throwable -> L55
            r2.mo16337x1af320a6(r1, r3)     // Catch: java.lang.Throwable -> L55
            r2 = 1
            goto L6a
        L55:
            r2 = move-exception
            java.lang.String r3 = r1.a()
            java.lang.String r2 = r2.getMessage()
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r2}
            java.lang.String r3 = "EdgeComputingJSScriptEngine"
            java.lang.String r4 = "[EdgeComputingJSScriptEngine] registerJsApi fail, jsApi : %s, msg : %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r4, r2)
        L69:
            r2 = 0
        L6a:
            if (r2 != 0) goto L2d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "[EdgeComputingScriptService] registerJsApi fail, jsApi : "
            r2.<init>(r3)
            java.lang.String r1 = r1.a()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "EdgeComputingScriptService"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r1)
            goto L2d
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v42.b.<init>():void");
    }

    public void a() {
        w42.b bVar = this.f514765a;
        if (bVar != null) {
            w42.a aVar = (w42.a) bVar;
            com.p159x477cd522.p160x333422.V8 v86 = aVar.f524422a;
            if (v86 != null && !v86.mo16335xafdb8087()) {
                try {
                    aVar.f524422a.m16256x41012807(true);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EdgeComputingJSScriptEngine", "[EdgeComputingJSScriptEngine] release throw Throwable : " + th6.getMessage());
                }
            }
            aVar.f524422a = null;
        }
        java.util.List list = this.f514766b;
        if (((java.util.ArrayList) list).size() > 0) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                ((x42.a) it.next()).mo174984x41012807();
            }
            ((java.util.ArrayList) list).clear();
        }
    }
}
