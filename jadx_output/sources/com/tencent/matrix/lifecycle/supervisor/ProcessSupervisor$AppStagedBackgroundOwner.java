package com.tencent.matrix.lifecycle.supervisor;

@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u0011\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0001J\u0019\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0001J\u0011\u0010\f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0001R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"com/tencent/matrix/lifecycle/supervisor/ProcessSupervisor$AppStagedBackgroundOwner", "Lcom/tencent/matrix/lifecycle/IBackgroundStatefulOwner;", "Lcom/tencent/matrix/lifecycle/IStatefulOwner;", "", "active", "Lcom/tencent/matrix/lifecycle/k;", "observer", "Ljz5/f0;", "observeForever", "Landroidx/lifecycle/y;", "lifecycleOwner", "observeWithLifecycle", "removeObserver", "Lcom/tencent/matrix/lifecycle/MultiSourceStatefulOwner;", "delegate", "Lcom/tencent/matrix/lifecycle/MultiSourceStatefulOwner;", "<init>", "(Lcom/tencent/matrix/lifecycle/MultiSourceStatefulOwner;)V", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
final class ProcessSupervisor$AppStagedBackgroundOwner implements com.tencent.matrix.lifecycle.IBackgroundStatefulOwner, com.tencent.matrix.lifecycle.IStatefulOwner {
    private final com.tencent.matrix.lifecycle.MultiSourceStatefulOwner delegate;

    @kotlin.Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"com/tencent/matrix/lifecycle/supervisor/ProcessSupervisor$AppStagedBackgroundOwner$1", "Lcom/tencent/matrix/lifecycle/MultiSourceStatefulOwner;", "Lcom/tencent/matrix/lifecycle/j;", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor$AppStagedBackgroundOwner$1, reason: invalid class name */
    /* loaded from: classes12.dex */
    public static final class AnonymousClass1 extends com.tencent.matrix.lifecycle.MultiSourceStatefulOwner implements com.tencent.matrix.lifecycle.j {
        final /* synthetic */ com.tencent.matrix.lifecycle.supervisor.d0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(com.tencent.matrix.lifecycle.supervisor.d0 d0Var, yz5.l lVar, com.tencent.matrix.lifecycle.IStatefulOwner[] iStatefulOwnerArr) {
            super(lVar, iStatefulOwnerArr);
            this.this$0 = d0Var;
        }

        @Override // com.tencent.matrix.lifecycle.j
        public boolean serial() {
            return true;
        }
    }

    public ProcessSupervisor$AppStagedBackgroundOwner() {
        this(null, 1, null);
    }

    @Override // com.tencent.matrix.lifecycle.IBackgroundStatefulOwner, com.tencent.matrix.lifecycle.IStatefulOwner, com.tencent.matrix.lifecycle.l
    public boolean active() {
        return this.delegate.active();
    }

    @Override // com.tencent.matrix.lifecycle.IBackgroundStatefulOwner
    public void addLifecycleCallback(androidx.lifecycle.y lifecycleOwner, com.tencent.matrix.lifecycle.i callback) {
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        kotlin.jvm.internal.o.g(callback, "callback");
        throw null;
    }

    @Override // com.tencent.matrix.lifecycle.IBackgroundStatefulOwner
    public boolean isBackground() {
        return active();
    }

    @Override // com.tencent.matrix.lifecycle.IBackgroundStatefulOwner, com.tencent.matrix.lifecycle.IStatefulOwner
    public void observeForever(com.tencent.matrix.lifecycle.k observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
        this.delegate.observeForever(observer);
    }

    @Override // com.tencent.matrix.lifecycle.IBackgroundStatefulOwner, com.tencent.matrix.lifecycle.IStatefulOwner
    public void observeWithLifecycle(androidx.lifecycle.y lifecycleOwner, com.tencent.matrix.lifecycle.k observer) {
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        kotlin.jvm.internal.o.g(observer, "observer");
        this.delegate.observeWithLifecycle(lifecycleOwner, observer);
    }

    @Override // com.tencent.matrix.lifecycle.IBackgroundStatefulOwner
    public void removeLifecycleCallback(com.tencent.matrix.lifecycle.i callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        throw null;
    }

    @Override // com.tencent.matrix.lifecycle.IBackgroundStatefulOwner, com.tencent.matrix.lifecycle.IStatefulOwner
    public void removeObserver(com.tencent.matrix.lifecycle.k observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
        this.delegate.removeObserver(observer);
    }

    public ProcessSupervisor$AppStagedBackgroundOwner(com.tencent.matrix.lifecycle.MultiSourceStatefulOwner delegate) {
        kotlin.jvm.internal.o.g(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // com.tencent.matrix.lifecycle.IBackgroundStatefulOwner
    public void addLifecycleCallback(com.tencent.matrix.lifecycle.i callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        throw null;
    }

    @Override // com.tencent.matrix.lifecycle.IBackgroundStatefulOwner
    public void removeLifecycleCallback(com.tencent.matrix.lifecycle.g callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.matrix.lifecycle.b.c(this, callback);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ProcessSupervisor$AppStagedBackgroundOwner(com.tencent.matrix.lifecycle.MultiSourceStatefulOwner r5, int r6, kotlin.jvm.internal.i r7) {
        /*
            r4 = this;
            r7 = 1
            r6 = r6 & r7
            if (r6 == 0) goto L35
            com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor$AppStagedBackgroundOwner$1 r5 = new com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor$AppStagedBackgroundOwner$1
            com.tencent.matrix.lifecycle.supervisor.d0 r6 = com.tencent.matrix.lifecycle.supervisor.d0.f52834k
            com.tencent.matrix.lifecycle.s0 r0 = com.tencent.matrix.lifecycle.s0.f52790d
            r1 = 2
            com.tencent.matrix.lifecycle.IStatefulOwner[] r1 = new com.tencent.matrix.lifecycle.IStatefulOwner[r1]
            r6.getClass()
            com.tencent.matrix.lifecycle.IBackgroundStatefulOwner r2 = com.tencent.matrix.lifecycle.supervisor.d0.f52831h
            java.lang.String r3 = "$this$shadow"
            kotlin.jvm.internal.o.g(r2, r3)
            com.tencent.matrix.lifecycle.StatefulOwnerKt$shadow$1 r3 = new com.tencent.matrix.lifecycle.StatefulOwnerKt$shadow$1
            r3.<init>(r2, r7, r7)
            r2 = 0
            r1[r2] = r3
            com.tencent.matrix.lifecycle.IBackgroundStatefulOwner r2 = com.tencent.matrix.lifecycle.supervisor.d0.f52832i
            java.lang.String r3 = "$this$reverse"
            kotlin.jvm.internal.o.g(r2, r3)
            com.tencent.matrix.lifecycle.StatefulOwnerKt$reverse$1 r3 = new com.tencent.matrix.lifecycle.StatefulOwnerKt$reverse$1
            r3.<init>(r2)
            com.tencent.matrix.lifecycle.StatefulOwnerKt$shadow$1 r2 = new com.tencent.matrix.lifecycle.StatefulOwnerKt$shadow$1
            r2.<init>(r3, r7, r7)
            r1[r7] = r2
            r5.<init>(r6, r0, r1)
        L35:
            r4.<init>(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor$AppStagedBackgroundOwner.<init>(com.tencent.matrix.lifecycle.MultiSourceStatefulOwner, int, kotlin.jvm.internal.i):void");
    }

    @Override // com.tencent.matrix.lifecycle.IBackgroundStatefulOwner
    public void addLifecycleCallback(androidx.lifecycle.y lifecycleOwner, com.tencent.matrix.lifecycle.g callback) {
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.matrix.lifecycle.b.a(this, lifecycleOwner, callback);
    }

    @Override // com.tencent.matrix.lifecycle.IBackgroundStatefulOwner
    public void addLifecycleCallback(com.tencent.matrix.lifecycle.g callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.matrix.lifecycle.b.b(this, callback);
    }
}
