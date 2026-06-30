package c1;

/* loaded from: classes14.dex */
public final class d0 {

    /* renamed from: b, reason: collision with root package name */
    public static final c1.d0 f37733b = new c1.d0();

    /* renamed from: a, reason: collision with root package name */
    public final o0.i f37734a = new o0.i(new c1.h0[16], 0);

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        if (r11.h(r9) < r11.h(r10)) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r13 = this;
            o0.i r0 = r13.f37734a
            boolean r1 = r0.j()
            if (r1 == 0) goto L94
            int r1 = r0.f341852f
            if (r1 <= 0) goto L93
            java.lang.Object[] r0 = r0.f341850d
            r2 = 0
            r3 = r2
        L10:
            r4 = r0[r3]
            c1.h0 r4 = (c1.h0) r4
            o0.i r4 = r4.f37743e
            int r5 = r4.f341852f
            r6 = 0
            if (r5 <= 0) goto L8a
            java.lang.Object[] r4 = r4.f341850d
            r7 = r2
        L1e:
            r8 = r4[r7]
            c1.p r8 = (c1.p) r8
            if (r6 == 0) goto L85
            u1.c1 r9 = r6.f37775q
            if (r9 == 0) goto L85
            u1.w r9 = r9.f423554h
            if (r9 != 0) goto L2d
            goto L85
        L2d:
            u1.c1 r10 = r8.f37775q
            if (r10 == 0) goto L86
            u1.w r10 = r10.f423554h
            if (r10 != 0) goto L36
            goto L86
        L36:
            int r11 = r9.f423690n
            int r12 = r10.f423690n
            if (r11 <= r12) goto L44
            u1.w r9 = r9.p()
            kotlin.jvm.internal.o.d(r9)
            goto L36
        L44:
            int r11 = r10.f423690n
            int r12 = r9.f423690n
            if (r11 <= r12) goto L52
            u1.w r10 = r10.p()
            kotlin.jvm.internal.o.d(r10)
            goto L44
        L52:
            u1.w r11 = r9.p()
            u1.w r12 = r10.p()
            boolean r11 = kotlin.jvm.internal.o.b(r11, r12)
            if (r11 != 0) goto L6f
            u1.w r9 = r9.p()
            kotlin.jvm.internal.o.d(r9)
            u1.w r10 = r10.p()
            kotlin.jvm.internal.o.d(r10)
            goto L52
        L6f:
            u1.w r11 = r9.p()
            kotlin.jvm.internal.o.d(r11)
            o0.i r11 = r11.r()
            int r9 = r11.h(r9)
            int r10 = r11.h(r10)
            if (r9 >= r10) goto L85
            goto L86
        L85:
            r6 = r8
        L86:
            int r7 = r7 + 1
            if (r7 < r5) goto L1e
        L8a:
            if (r6 == 0) goto L8f
            c1.k0.f(r6)
        L8f:
            int r3 = r3 + 1
            if (r3 < r1) goto L10
        L93:
            return
        L94:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.d0.a():void");
    }
}
