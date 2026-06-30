package com.tencent.mm.mm_compose;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R*\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078\u0014@RX\u0094\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/mm_compose/MMComposeView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Lkotlin/Function0;", "Ljz5/f0;", "content", "setContent", "(Lyz5/p;)V", "", "<set-?>", "o", "Z", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "getShouldCreateCompositionOnAttachedToWindow$annotations", "()V", "shouldCreateCompositionOnAttachedToWindow", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "compose-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class MMComposeView extends androidx.compose.ui.platform.AbstractComposeView {

    /* renamed from: n, reason: collision with root package name */
    public final n0.v2 f70361n;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public boolean shouldCreateCompositionOnAttachedToWindow;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f70363p;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.Canvas f70364q;

    /* renamed from: r, reason: collision with root package name */
    public int f70365r;

    public /* synthetic */ MMComposeView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, kotlin.jvm.internal.i iVar) {
        this(context, (i17 & 2) != 0 ? null : attributeSet);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void a(n0.o oVar, int i17) {
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-447956736);
        java.lang.Object obj = n0.e1.f333492a;
        yz5.p pVar = (yz5.p) ((n0.q4) this.f70361n).getValue();
        if (pVar != null) {
            pVar.invoke(y0Var, 0);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new rz0.b(this, i17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
    
        if (r6 != null) goto L35;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void dispatchDraw(android.graphics.Canvas r10) {
        /*
            r9 = this;
            java.lang.String r0 = "canvas"
            kotlin.jvm.internal.o.g(r10, r0)
            boolean r0 = r9.f70363p
            if (r0 == 0) goto L8a
            android.graphics.Canvas r0 = r9.f70364q
            boolean r0 = kotlin.jvm.internal.o.b(r10, r0)
            r1 = 1
            if (r0 == 0) goto L14
            goto L87
        L14:
            int r0 = r9.f70365r
            r2 = 10
            r3 = 0
            if (r0 <= r2) goto L1d
            goto L86
        L1d:
            android.graphics.Canvas r2 = r9.f70364q
            java.lang.String r4 = "drawNoChildren"
            java.lang.String r5 = "getStackTrace(...)"
            r6 = 0
            if (r2 != 0) goto L4f
            int r0 = r0 + r1
            r9.f70365r = r0
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            kotlin.jvm.internal.o.f(r0, r5)
            int r2 = r0.length
            r5 = r3
        L37:
            if (r5 >= r2) goto L4a
            r7 = r0[r5]
            java.lang.String r8 = r7.getMethodName()
            boolean r8 = kotlin.jvm.internal.o.b(r8, r4)
            if (r8 == 0) goto L47
            r6 = r7
            goto L4a
        L47:
            int r5 = r5 + 1
            goto L37
        L4a:
            if (r6 == 0) goto L86
            r9.f70364q = r10
            goto L87
        L4f:
            boolean r0 = r10.isHardwareAccelerated()
            if (r0 == 0) goto L58
            r9.f70365r = r3
            goto L86
        L58:
            int r0 = r9.f70365r
            int r0 = r0 + r1
            r9.f70365r = r0
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            kotlin.jvm.internal.o.f(r0, r5)
            int r2 = r0.length
            r5 = r3
        L6b:
            if (r5 >= r2) goto L7d
            r7 = r0[r5]
            java.lang.String r8 = r7.getMethodName()
            boolean r8 = kotlin.jvm.internal.o.b(r8, r4)
            if (r8 == 0) goto L7a
            goto L7e
        L7a:
            int r5 = r5 + 1
            goto L6b
        L7d:
            r7 = r6
        L7e:
            if (r7 == 0) goto L83
            r9.f70364q = r10
            r6 = r7
        L83:
            if (r6 == 0) goto L86
            goto L87
        L86:
            r1 = r3
        L87:
            if (r1 == 0) goto L8a
            return
        L8a:
            super.dispatchDraw(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mm_compose.MMComposeView.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public final void setContent(yz5.p content) {
        kotlin.jvm.internal.o.g(content, "content");
        this.shouldCreateCompositionOnAttachedToWindow = true;
        ((n0.q4) this.f70361n).setValue(content);
        if (isAttachedToWindow()) {
            c();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MMComposeView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.f70361n = n0.s4.c(null, null, 2, null);
        java.lang.String BRAND = android.os.Build.BRAND;
        kotlin.jvm.internal.o.f(BRAND, "BRAND");
        this.f70363p = r26.n0.B(BRAND, "vivo", false);
    }
}
