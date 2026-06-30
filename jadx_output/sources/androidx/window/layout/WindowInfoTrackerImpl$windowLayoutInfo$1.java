package androidx.window.layout;

@qz5.f(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", f = "WindowInfoTrackerImpl.kt", l = {54, 55}, m = "invokeSuspend")
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/k;", "Landroidx/window/layout/WindowLayoutInfo;", "Ljz5/f0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes14.dex */
public final class WindowInfoTrackerImpl$windowLayoutInfo$1 extends qz5.l implements yz5.p {
    final /* synthetic */ android.app.Activity $activity;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;
    final /* synthetic */ androidx.window.layout.WindowInfoTrackerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInfoTrackerImpl$windowLayoutInfo$1(androidx.window.layout.WindowInfoTrackerImpl windowInfoTrackerImpl, android.app.Activity activity, kotlin.coroutines.Continuation<? super androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = windowInfoTrackerImpl;
        this.$activity = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invokeSuspend$lambda-0, reason: not valid java name */
    public static final void m11invokeSuspend$lambda0(u26.w wVar, androidx.window.layout.WindowLayoutInfo info) {
        kotlin.jvm.internal.o.f(info, "info");
        wVar.e(info);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation<jz5.f0> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1 windowInfoTrackerImpl$windowLayoutInfo$1 = new androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1(this.this$0, this.$activity, continuation);
        windowInfoTrackerImpl$windowLayoutInfo$1.L$0 = obj;
        return windowInfoTrackerImpl$windowLayoutInfo$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086 A[Catch: all -> 0x00ad, TRY_LEAVE, TryCatch #1 {all -> 0x00ad, blocks: (B:11:0x006a, B:16:0x007e, B:18:0x0086), top: B:10:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Type inference failed for: r1v10, types: [u26.y] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x009e -> B:10:0x006a). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r9.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3c
            if (r1 == r3) goto L26
            if (r1 != r2) goto L1e
            java.lang.Object r1 = r9.L$2
            u26.y r1 = (u26.y) r1
            java.lang.Object r4 = r9.L$1
            m3.a r4 = (m3.a) r4
            java.lang.Object r5 = r9.L$0
            kotlinx.coroutines.flow.k r5 = (kotlinx.coroutines.flow.k) r5
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L39
            r10 = r5
            r5 = r1
            goto L69
        L1e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L26:
            java.lang.Object r1 = r9.L$2
            u26.y r1 = (u26.y) r1
            java.lang.Object r4 = r9.L$1
            m3.a r4 = (m3.a) r4
            java.lang.Object r5 = r9.L$0
            kotlinx.coroutines.flow.k r5 = (kotlinx.coroutines.flow.k) r5
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L39
            r6 = r5
            r5 = r1
            r1 = r9
            goto L7e
        L39:
            r10 = move-exception
            goto Laf
        L3c:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.Object r10 = r9.L$0
            kotlinx.coroutines.flow.k r10 = (kotlinx.coroutines.flow.k) r10
            u26.u r1 = u26.u.DROP_OLDEST
            r4 = 4
            r5 = 10
            r6 = 0
            u26.w r1 = u26.z.a(r5, r1, r6, r4, r6)
            androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1$$a r4 = new androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1$$a
            r4.<init>()
            androidx.window.layout.WindowInfoTrackerImpl r5 = r9.this$0
            androidx.window.layout.WindowBackend r5 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r5)
            android.app.Activity r6 = r9.$activity
            j4.e$$a r7 = new j4.e$$a
            r7.<init>()
            r5.registerLayoutChangeCallback(r6, r7, r4)
            u26.k r1 = (u26.k) r1     // Catch: java.lang.Throwable -> L39
            u26.a r5 = new u26.a     // Catch: java.lang.Throwable -> L39
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L39
        L69:
            r1 = r9
        L6a:
            r1.L$0 = r10     // Catch: java.lang.Throwable -> Lad
            r1.L$1 = r4     // Catch: java.lang.Throwable -> Lad
            r1.L$2 = r5     // Catch: java.lang.Throwable -> Lad
            r1.label = r3     // Catch: java.lang.Throwable -> Lad
            u26.a r5 = (u26.a) r5     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r6 = r5.a(r1)     // Catch: java.lang.Throwable -> Lad
            if (r6 != r0) goto L7b
            return r0
        L7b:
            r8 = r6
            r6 = r10
            r10 = r8
        L7e:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> Lad
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> Lad
            if (r10 == 0) goto La1
            r10 = r5
            u26.a r10 = (u26.a) r10     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r5 = r10.b()     // Catch: java.lang.Throwable -> Lad
            androidx.window.layout.WindowLayoutInfo r5 = (androidx.window.layout.WindowLayoutInfo) r5     // Catch: java.lang.Throwable -> Lad
            r1.L$0 = r6     // Catch: java.lang.Throwable -> Lad
            r1.L$1 = r4     // Catch: java.lang.Throwable -> Lad
            r1.L$2 = r10     // Catch: java.lang.Throwable -> Lad
            r1.label = r2     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r5 = r6.emit(r5, r1)     // Catch: java.lang.Throwable -> Lad
            if (r5 != r0) goto L9e
            return r0
        L9e:
            r5 = r10
            r10 = r6
            goto L6a
        La1:
            androidx.window.layout.WindowInfoTrackerImpl r10 = r1.this$0
            androidx.window.layout.WindowBackend r10 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r10)
            r10.unregisterLayoutChangeCallback(r4)
            jz5.f0 r10 = jz5.f0.f302826a
            return r10
        Lad:
            r10 = move-exception
            goto Lb0
        Laf:
            r1 = r9
        Lb0:
            androidx.window.layout.WindowInfoTrackerImpl r0 = r1.this$0
            androidx.window.layout.WindowBackend r0 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r0)
            r0.unregisterLayoutChangeCallback(r4)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // yz5.p
    public final java.lang.Object invoke(kotlinx.coroutines.flow.k kVar, kotlin.coroutines.Continuation<? super jz5.f0> continuation) {
        return ((androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1) create(kVar, continuation)).invokeSuspend(jz5.f0.f302826a);
    }
}
