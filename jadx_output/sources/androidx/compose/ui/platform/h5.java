package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class h5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f10579d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f10580e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f10581f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.b4 f10582g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y f10583h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 f10584i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f10585m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(kotlin.jvm.internal.h0 h0Var, n0.b4 b4Var, androidx.lifecycle.y yVar, androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2, android.view.View view, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f10581f = h0Var;
        this.f10582g = b4Var;
        this.f10583h = yVar;
        this.f10584i = windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2;
        this.f10585m = view;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        androidx.compose.ui.platform.h5 h5Var = new androidx.compose.ui.platform.h5(this.f10581f, this.f10582g, this.f10583h, this.f10584i, this.f10585m, continuation);
        h5Var.f10580e = obj;
        return h5Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((androidx.compose.ui.platform.h5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ae  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r14.f10579d
            jz5.f0 r2 = jz5.f0.f302826a
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 r3 = r14.f10584i
            androidx.lifecycle.y r4 = r14.f10583h
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L24
            if (r1 != r5) goto L1c
            java.lang.Object r0 = r14.f10580e
            kotlinx.coroutines.r2 r0 = (kotlinx.coroutines.r2) r0
            kotlin.ResultKt.throwOnFailure(r15)     // Catch: java.lang.Throwable -> L19
            goto L98
        L19:
            r15 = move-exception
            goto Lac
        L1c:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L24:
            kotlin.ResultKt.throwOnFailure(r15)
            java.lang.Object r15 = r14.f10580e
            r7 = r15
            kotlinx.coroutines.y0 r7 = (kotlinx.coroutines.y0) r7
            kotlin.jvm.internal.h0 r15 = r14.f10581f     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r15 = r15.f310123d     // Catch: java.lang.Throwable -> Laa
            androidx.compose.ui.platform.o3 r15 = (androidx.compose.ui.platform.o3) r15     // Catch: java.lang.Throwable -> Laa
            if (r15 == 0) goto L6a
            android.view.View r1 = r14.f10585m     // Catch: java.lang.Throwable -> Laa
            android.content.Context r1 = r1.getContext()     // Catch: java.lang.Throwable -> Laa
            android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r8 = "context.applicationContext"
            kotlin.jvm.internal.o.f(r1, r8)     // Catch: java.lang.Throwable -> Laa
            kotlinx.coroutines.flow.f3 r1 = androidx.compose.ui.platform.k5.a(r1)     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r8 = r1.getValue()     // Catch: java.lang.Throwable -> Laa
            java.lang.Number r8 = (java.lang.Number) r8     // Catch: java.lang.Throwable -> Laa
            float r8 = r8.floatValue()     // Catch: java.lang.Throwable -> Laa
            n0.v2 r9 = r15.f10676d     // Catch: java.lang.Throwable -> Laa
            java.lang.Float r8 = java.lang.Float.valueOf(r8)     // Catch: java.lang.Throwable -> Laa
            n0.q4 r9 = (n0.q4) r9     // Catch: java.lang.Throwable -> Laa
            r9.setValue(r8)     // Catch: java.lang.Throwable -> Laa
            r8 = 0
            r9 = 0
            androidx.compose.ui.platform.g5 r10 = new androidx.compose.ui.platform.g5     // Catch: java.lang.Throwable -> Laa
            r10.<init>(r1, r15, r6)     // Catch: java.lang.Throwable -> Laa
            r11 = 3
            r12 = 0
            kotlinx.coroutines.r2 r15 = kotlinx.coroutines.l.d(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> Laa
            goto L6b
        L6a:
            r15 = r6
        L6b:
            n0.b4 r1 = r14.f10582g     // Catch: java.lang.Throwable -> La5
            r14.f10580e = r15     // Catch: java.lang.Throwable -> La5
            r14.f10579d = r5     // Catch: java.lang.Throwable -> La5
            r1.getClass()     // Catch: java.lang.Throwable -> La5
            n0.z3 r7 = new n0.z3     // Catch: java.lang.Throwable -> La5
            r7.<init>(r1, r6)     // Catch: java.lang.Throwable -> La5
            oz5.l r8 = r14.getContext()     // Catch: java.lang.Throwable -> La5
            n0.r2 r8 = n0.s2.a(r8)     // Catch: java.lang.Throwable -> La5
            n0.x3 r9 = new n0.x3     // Catch: java.lang.Throwable -> La5
            r9.<init>(r1, r7, r8, r6)     // Catch: java.lang.Throwable -> La5
            n0.h r1 = r1.f333444a     // Catch: java.lang.Throwable -> La5
            java.lang.Object r1 = kotlinx.coroutines.l.g(r1, r9, r14)     // Catch: java.lang.Throwable -> La5
            if (r1 != r0) goto L8f
            goto L90
        L8f:
            r1 = r2
        L90:
            if (r1 != r0) goto L93
            goto L94
        L93:
            r1 = r2
        L94:
            if (r1 != r0) goto L97
            return r0
        L97:
            r0 = r15
        L98:
            if (r0 == 0) goto L9d
            kotlinx.coroutines.p2.a(r0, r6, r5, r6)
        L9d:
            androidx.lifecycle.o r15 = r4.mo133getLifecycle()
            r15.c(r3)
            return r2
        La5:
            r0 = move-exception
            r13 = r0
            r0 = r15
            r15 = r13
            goto Lac
        Laa:
            r15 = move-exception
            r0 = r6
        Lac:
            if (r0 == 0) goto Lb1
            kotlinx.coroutines.p2.a(r0, r6, r5, r6)
        Lb1:
            androidx.lifecycle.o r0 = r4.mo133getLifecycle()
            r0.c(r3)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.h5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
