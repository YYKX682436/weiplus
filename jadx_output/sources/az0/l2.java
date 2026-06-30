package az0;

/* loaded from: classes5.dex */
public final class l2 {

    /* renamed from: a, reason: collision with root package name */
    public static final az0.l2 f15656a = new az0.l2();

    /* renamed from: b, reason: collision with root package name */
    public static final kotlinx.coroutines.y0 f15657b;

    /* renamed from: c, reason: collision with root package name */
    public static kotlinx.coroutines.r2 f15658c;

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f15659d;

    static {
        ((d83.u) ((e70.z) i95.n0.c(e70.z.class))).Di();
        f15657b = kotlinx.coroutines.z0.b();
        f15659d = jz5.h.b(az0.k2.f15624d);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof az0.g2
            if (r0 == 0) goto L13
            r0 = r11
            az0.g2 r0 = (az0.g2) r0
            int r1 = r0.f15493f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15493f = r1
            goto L18
        L13:
            az0.g2 r0 = new az0.g2
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f15491d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f15493f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.throwOnFailure(r11)
            goto L59
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L2f:
            kotlin.ResultKt.throwOnFailure(r11)
            kotlinx.coroutines.r2 r11 = az0.l2.f15658c
            r2 = 0
            if (r11 != 0) goto L49
            kotlinx.coroutines.y0 r4 = az0.l2.f15657b
            kotlinx.coroutines.p0 r5 = kotlinx.coroutines.q1.f310570c
            r6 = 0
            az0.h2 r7 = new az0.h2
            r7.<init>(r2)
            r8 = 2
            r9 = 0
            kotlinx.coroutines.r2 r11 = kotlinx.coroutines.l.d(r4, r5, r6, r7, r8, r9)
            az0.l2.f15658c = r11
        L49:
            kotlinx.coroutines.p0 r11 = kotlinx.coroutines.q1.f310570c
            az0.i2 r4 = new az0.i2
            r4.<init>(r2)
            r0.f15493f = r3
            java.lang.Object r11 = kotlinx.coroutines.l.g(r11, r4, r0)
            if (r11 != r1) goto L59
            return r1
        L59:
            cz0.y r11 = cz0.y.f224969a
            java.util.concurrent.locks.ReentrantLock r0 = cz0.y.f224973e
            r0.lock()
            boolean r11 = r11.i()     // Catch: java.lang.Throwable -> L6c
            r0.unlock()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            return r11
        L6c:
            r11 = move-exception
            r0.unlock()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.l2.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
