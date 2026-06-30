package com.tencent.matrix.lifecycle.owners;

@kotlin.Metadata(d1 = {"\u0000)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\b\u0006*\u0001\u0010\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R*\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/tencent/matrix/lifecycle/owners/ProcessExplicitBackgroundOwner;", "Lcom/tencent/matrix/lifecycle/StatefulOwner;", "Lcom/tencent/matrix/lifecycle/IBackgroundStatefulOwner;", "", "active", "", "TAG", "Ljava/lang/String;", "", "value", "maxCheckInterval", "J", "getMaxCheckInterval", "()J", "setMaxCheckInterval", "(J)V", "com/tencent/matrix/lifecycle/owners/s", "checkTask", "Lcom/tencent/matrix/lifecycle/owners/s;", "<init>", "()V", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class ProcessExplicitBackgroundOwner extends com.tencent.matrix.lifecycle.StatefulOwner implements com.tencent.matrix.lifecycle.IBackgroundStatefulOwner {
    public static final com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner INSTANCE;
    private static final java.lang.String TAG = "Matrix.background.Explicit";
    private static final com.tencent.matrix.lifecycle.owners.s checkTask;
    private static long maxCheckInterval;

    @kotlin.Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"com/tencent/matrix/lifecycle/owners/ProcessExplicitBackgroundOwner$1", "Lcom/tencent/matrix/lifecycle/ImmutableMultiSourceStatefulOwner;", "Lcom/tencent/matrix/lifecycle/j;", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner$1, reason: invalid class name */
    /* loaded from: classes12.dex */
    public static final class AnonymousClass1 extends com.tencent.matrix.lifecycle.ImmutableMultiSourceStatefulOwner implements com.tencent.matrix.lifecycle.j {
        public AnonymousClass1(yz5.l lVar, com.tencent.matrix.lifecycle.IStatefulOwner[] iStatefulOwnerArr) {
            super(lVar, iStatefulOwnerArr);
        }

        @Override // com.tencent.matrix.lifecycle.j
        public boolean serial() {
            return true;
        }
    }

    static {
        com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner processExplicitBackgroundOwner = new com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner();
        INSTANCE = processExplicitBackgroundOwner;
        long j17 = com.tencent.matrix.lifecycle.owners.n.f52764a;
        maxCheckInterval = j17;
        checkTask = new com.tencent.matrix.lifecycle.owners.s(processExplicitBackgroundOwner, TAG, j17);
        int i17 = com.tencent.matrix.lifecycle.u0.f52901a;
        new com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner.AnonymousClass1(com.tencent.matrix.lifecycle.t0.f52900d, new com.tencent.matrix.lifecycle.IStatefulOwner[]{com.tencent.matrix.lifecycle.owners.ProcessUIStartedStateOwner.INSTANCE, com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner.INSTANCE, com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner.INSTANCE}).observeForever(new com.tencent.matrix.lifecycle.owners.o());
    }

    private ProcessExplicitBackgroundOwner() {
        super(false, 1, null);
    }

    @Override // com.tencent.matrix.lifecycle.StatefulOwner, com.tencent.matrix.lifecycle.IStatefulOwner, com.tencent.matrix.lifecycle.l
    public boolean active() {
        if (com.tencent.matrix.lifecycle.owners.ProcessUIStartedStateOwner.INSTANCE.active()) {
            turnOff();
            return false;
        }
        checkTask.b();
        return super.active();
    }

    @Override // com.tencent.matrix.lifecycle.IBackgroundStatefulOwner
    public void addLifecycleCallback(androidx.lifecycle.y lifecycleOwner, com.tencent.matrix.lifecycle.i callback) {
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        kotlin.jvm.internal.o.g(callback, "callback");
        throw null;
    }

    public final long getMaxCheckInterval() {
        return maxCheckInterval;
    }

    @Override // com.tencent.matrix.lifecycle.IBackgroundStatefulOwner
    public boolean isBackground() {
        return active();
    }

    @Override // com.tencent.matrix.lifecycle.IBackgroundStatefulOwner
    public void removeLifecycleCallback(com.tencent.matrix.lifecycle.i callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        throw null;
    }

    public final void setMaxCheckInterval(long j17) {
        if (j17 < java.util.concurrent.TimeUnit.SECONDS.toMillis(10L)) {
            throw new java.lang.IllegalArgumentException("interval should NOT be less than 10s");
        }
        maxCheckInterval = j17;
        oj.j.c(TAG, "set max check interval as " + j17, new java.lang.Object[0]);
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
