package cl;

/* loaded from: classes7.dex */
public class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl.j1 f42650d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f42651e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f42652f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f42653g;

    public h1(cl.q0 q0Var, cl.j1 j1Var, java.util.ArrayList arrayList, java.lang.String str) {
        this.f42653g = q0Var;
        this.f42650d = j1Var;
        this.f42651e = arrayList;
        this.f42652f = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r8 = this;
            java.lang.String r0 = r8.f42652f
            java.util.ArrayList r1 = r8.f42651e
            cl.q0 r2 = r8.f42653g
            r3 = 0
            cl.j1 r4 = r8.f42650d
            if (r4 == 0) goto L45
            cl.k1 r5 = new cl.k1
            r5.<init>()
            long r6 = java.lang.System.currentTimeMillis()
            r5.f42675a = r6
            com.eclipsesource.mmv8.V8Context r2 = r2.f()     // Catch: java.lang.Throwable -> L2c com.eclipsesource.mmv8.V8RuntimeException -> L2e
            java.lang.Object r0 = r2.batchExecuteScripts(r1, r0, r5)     // Catch: java.lang.Throwable -> L2c com.eclipsesource.mmv8.V8RuntimeException -> L2e
            cl.k1.a(r5)
            if (r0 != 0) goto L24
            goto L28
        L24:
            java.lang.String r3 = r0.toString()
        L28:
            r4.a(r3, r5)
            goto L4c
        L2c:
            r0 = move-exception
            goto L36
        L2e:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()     // Catch: java.lang.Throwable -> L2c
            throw r0     // Catch: java.lang.Throwable -> L34
        L34:
            r0 = move-exception
            goto L37
        L36:
            r1 = r3
        L37:
            cl.k1.a(r5)
            if (r1 != 0) goto L3d
            goto L41
        L3d:
            java.lang.String r3 = r1.toString()
        L41:
            r4.a(r3, r5)
            throw r0
        L45:
            com.eclipsesource.mmv8.V8Context r2 = r2.f()
            r2.batchExecuteScripts(r1, r0, r3)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cl.h1.run():void");
    }
}
