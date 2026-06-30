package b0;

/* loaded from: classes14.dex */
public abstract class d4 {

    /* renamed from: a, reason: collision with root package name */
    public static final yz5.q f16264a = new b0.n3(null);

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004e A[LOOP:0: B:11:0x004c->B:12:0x004e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072 A[EDGE_INSN: B:28:0x0072->B:21:0x0072 BREAK  A[LOOP:1: B:15:0x0061->B:18:0x006f], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x003f -> B:10:0x0042). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(p1.c r8, kotlin.coroutines.Continuation r9) {
        /*
            boolean r0 = r9 instanceof b0.q3
            if (r0 == 0) goto L13
            r0 = r9
            b0.q3 r0 = (b0.q3) r0
            int r1 = r0.f16485f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16485f = r1
            goto L18
        L13:
            b0.q3 r0 = new b0.q3
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f16484e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f16485f
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r8 = r0.f16483d
            p1.c r8 = (p1.c) r8
            kotlin.ResultKt.throwOnFailure(r9)
            goto L42
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            kotlin.ResultKt.throwOnFailure(r9)
        L36:
            r0.f16483d = r8
            r0.f16485f = r3
            r9 = 0
            java.lang.Object r9 = p1.b.a(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L42
            goto L76
        L42:
            p1.l r9 = (p1.l) r9
            java.util.List r2 = r9.f350842a
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L4c:
            if (r6 >= r4) goto L5a
            java.lang.Object r7 = r2.get(r6)
            p1.s r7 = (p1.s) r7
            r7.a()
            int r6 = r6 + 1
            goto L4c
        L5a:
            java.util.List r9 = r9.f350842a
            int r2 = r9.size()
            r4 = r5
        L61:
            if (r4 >= r2) goto L72
            java.lang.Object r6 = r9.get(r4)
            p1.s r6 = (p1.s) r6
            boolean r6 = r6.f350882d
            if (r6 == 0) goto L6f
            r5 = r3
            goto L72
        L6f:
            int r4 = r4 + 1
            goto L61
        L72:
            if (r5 != 0) goto L36
            jz5.f0 r1 = jz5.f0.f302826a
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.d4.a(p1.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static java.lang.Object b(p1.c cVar, boolean z17, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        return c(cVar, p1.n.Main, z17, continuation);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x004d -> B:10:0x0050). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(p1.c r10, p1.n r11, boolean r12, kotlin.coroutines.Continuation r13) {
        /*
            boolean r0 = r13 instanceof b0.o3
            if (r0 == 0) goto L13
            r0 = r13
            b0.o3 r0 = (b0.o3) r0
            int r1 = r0.f16465h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16465h = r1
            goto L18
        L13:
            b0.o3 r0 = new b0.o3
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f16464g
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f16465h
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            boolean r10 = r0.f16463f
            java.lang.Object r11 = r0.f16462e
            p1.n r11 = (p1.n) r11
            java.lang.Object r12 = r0.f16461d
            p1.c r12 = (p1.c) r12
            kotlin.ResultKt.throwOnFailure(r13)
            r9 = r12
            r12 = r10
            r10 = r9
            goto L50
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3c:
            kotlin.ResultKt.throwOnFailure(r13)
        L3f:
            r0.f16461d = r10
            r0.f16462e = r11
            r0.f16463f = r12
            r0.f16465h = r3
            p1.o0 r10 = (p1.o0) r10
            java.lang.Object r13 = r10.b(r11, r0)
            if (r13 != r1) goto L50
            return r1
        L50:
            p1.l r13 = (p1.l) r13
            java.util.List r2 = r13.f350842a
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L5a:
            if (r6 >= r4) goto L86
            java.lang.Object r7 = r2.get(r6)
            p1.s r7 = (p1.s) r7
            if (r12 == 0) goto L7b
            java.lang.String r8 = "<this>"
            kotlin.jvm.internal.o.g(r7, r8)
            boolean r8 = r7.b()
            if (r8 != 0) goto L79
            boolean r8 = r7.f350885g
            if (r8 != 0) goto L79
            boolean r7 = r7.f350882d
            if (r7 == 0) goto L79
            r7 = r3
            goto L7f
        L79:
            r7 = r5
            goto L7f
        L7b:
            boolean r7 = p1.m.a(r7)
        L7f:
            if (r7 != 0) goto L83
            r2 = r5
            goto L87
        L83:
            int r6 = r6 + 1
            goto L5a
        L86:
            r2 = r3
        L87:
            if (r2 == 0) goto L3f
            java.util.List r10 = r13.f350842a
            java.lang.Object r10 = r10.get(r5)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.d4.c(p1.c, p1.n, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final java.lang.Object d(p1.a0 a0Var, yz5.q qVar, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        java.lang.Object b17 = b0.u1.b(a0Var, new b0.u3(new b0.h2(a0Var), qVar, lVar, null), continuation);
        return b17 == pz5.a.f359186d ? b17 : jz5.f0.f302826a;
    }

    public static java.lang.Object e(p1.a0 a0Var, yz5.l lVar, yz5.l lVar2, yz5.q qVar, yz5.l lVar3, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj) {
        yz5.l lVar4 = (i17 & 1) != 0 ? null : lVar;
        yz5.l lVar5 = (i17 & 2) != 0 ? null : lVar2;
        if ((i17 & 4) != 0) {
            qVar = f16264a;
        }
        java.lang.Object f17 = kotlinx.coroutines.z0.f(new b0.b4(a0Var, qVar, lVar5, lVar4, (i17 & 8) != 0 ? null : lVar3, null), continuation);
        return f17 == pz5.a.f359186d ? f17 : jz5.f0.f302826a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x006f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00bb -> B:11:0x00be). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(p1.c r13, kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.d4.f(p1.c, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
