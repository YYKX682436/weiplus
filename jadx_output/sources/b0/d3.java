package b0;

/* loaded from: classes14.dex */
public abstract class d3 {

    /* renamed from: a, reason: collision with root package name */
    public static final b0.p2 f16262a = new b0.r2();

    /* renamed from: b, reason: collision with root package name */
    public static final t1.f f16263b = t1.c.a(b0.q2.f16482d);

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x003f -> B:10:0x0042). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(p1.c r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof b0.s2
            if (r0 == 0) goto L13
            r0 = r6
            b0.s2 r0 = (b0.s2) r0
            int r1 = r0.f16515f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16515f = r1
            goto L18
        L13:
            b0.s2 r0 = new b0.s2
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f16514e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f16515f
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.f16513d
            p1.c r5 = (p1.c) r5
            kotlin.ResultKt.throwOnFailure(r6)
            goto L42
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.ResultKt.throwOnFailure(r6)
        L36:
            r0.f16513d = r5
            r0.f16515f = r3
            r6 = 0
            java.lang.Object r6 = p1.b.a(r5, r6, r0, r3, r6)
            if (r6 != r1) goto L42
            goto L4f
        L42:
            p1.l r6 = (p1.l) r6
            int r2 = r6.f350844c
            r4 = 6
            if (r2 != r4) goto L4b
            r2 = r3
            goto L4c
        L4b:
            r2 = 0
        L4c:
            if (r2 == 0) goto L36
            r1 = r6
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.d3.a(p1.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final z0.t b(z0.t tVar, b0.f3 state, b0.y1 orientation, b0.c2 c2Var, boolean z17, boolean z18, b0.q1 q1Var, c0.o oVar) {
        kotlin.jvm.internal.o.g(tVar, "<this>");
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(orientation, "orientation");
        boolean z19 = androidx.compose.ui.platform.f3.f10562a;
        return z0.m.a(tVar, androidx.compose.ui.platform.e3.f10553d, new b0.a3(c2Var, orientation, state, z18, oVar, q1Var, z17));
    }
}
