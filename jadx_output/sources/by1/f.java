package by1;

/* loaded from: classes2.dex */
public class f extends by1.d {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Object f36361b;

    /* renamed from: c, reason: collision with root package name */
    public long f36362c;

    /* renamed from: d, reason: collision with root package name */
    public kotlinx.coroutines.f1 f36363d;

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object f(by1.f r4, kotlin.coroutines.Continuation r5) {
        /*
            boolean r0 = r5 instanceof by1.e
            if (r0 == 0) goto L13
            r0 = r5
            by1.e r0 = (by1.e) r0
            int r1 = r0.f36360g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36360g = r1
            goto L18
        L13:
            by1.e r0 = new by1.e
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f36358e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f36360g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.f36357d
            by1.f r4 = (by1.f) r4
            kotlin.ResultKt.throwOnFailure(r5)
            goto L47
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.ResultKt.throwOnFailure(r5)
            kotlinx.coroutines.f1 r5 = r4.f36363d
            if (r5 == 0) goto L47
            r0.f36357d = r4
            r0.f36360g = r3
            kotlinx.coroutines.c3 r5 = (kotlinx.coroutines.c3) r5
            java.lang.Object r5 = r5.C(r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            boolean r5 = r4.d()
            if (r5 == 0) goto L50
            java.lang.Object r4 = r4.f36361b
            goto L54
        L50:
            r4.a(r3)
            r4 = 0
        L54:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: by1.f.f(by1.f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // by1.d
    public java.lang.Object a(boolean z17) {
        java.lang.Object obj = this.f36361b;
        if (z17 && obj != null) {
            kotlin.jvm.internal.o.d(obj);
            e(obj);
        }
        this.f36361b = null;
        return obj;
    }

    @Override // by1.d
    public java.lang.Object b(kotlin.coroutines.Continuation continuation) {
        return f(this, continuation);
    }

    @Override // by1.d
    public void c(java.lang.Object obj, long j17) {
        this.f36361b = obj;
        this.f36362c = j17;
    }

    public boolean d() {
        return true;
    }

    public void e(java.lang.Object obj) {
    }
}
