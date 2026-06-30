package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\b\u0006*\u0001\u0010\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R*\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/tencent/matrix/lifecycle/owners/ProcessExplicitBackgroundOwner;", "Lcom/tencent/matrix/lifecycle/StatefulOwner;", "Lcom/tencent/matrix/lifecycle/IBackgroundStatefulOwner;", "", "active", "", "TAG", "Ljava/lang/String;", "", "value", "maxCheckInterval", "J", "getMaxCheckInterval", "()J", "setMaxCheckInterval", "(J)V", "com/tencent/matrix/lifecycle/owners/s", "checkTask", "Lcom/tencent/matrix/lifecycle/owners/s;", "<init>", "()V", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner */
/* loaded from: classes12.dex */
public final class C4673x87f0d602 extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.C4666xb9b62ea7 implements com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4660x9028c9b0 {

    /* renamed from: INSTANCE */
    public static final com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4673x87f0d602 f19955x4fbc8495;
    private static final java.lang.String TAG = "Matrix.background.Explicit";
    private static final com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.s checkTask;
    private static long maxCheckInterval;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"com/tencent/matrix/lifecycle/owners/ProcessExplicitBackgroundOwner$1", "Lcom/tencent/matrix/lifecycle/ImmutableMultiSourceStatefulOwner;", "Lcom/tencent/matrix/lifecycle/j;", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner$1, reason: invalid class name */
    /* loaded from: classes12.dex */
    public static final class AnonymousClass1 extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.C4663xe8a96ff5 implements com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.j {
        public AnonymousClass1(yz5.l lVar, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4662x21f4acfe[] interfaceC4662x21f4acfeArr) {
            super(lVar, interfaceC4662x21f4acfeArr);
        }

        @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.j
        /* renamed from: serial */
        public boolean mo40995xca01fdf4() {
            return true;
        }
    }

    static {
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4673x87f0d602 c4673x87f0d602 = new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4673x87f0d602();
        f19955x4fbc8495 = c4673x87f0d602;
        long j17 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.n.f134297a;
        maxCheckInterval = j17;
        checkTask = new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.s(c4673x87f0d602, TAG, j17);
        int i17 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.u0.f134434a;
        new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4673x87f0d602.AnonymousClass1(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.t0.f134433d, new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4662x21f4acfe[]{com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4679x33de8120.f19966x4fbc8495, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4669x11d5b5db.f19940x4fbc8495, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4670x2e7549c9.f19946x4fbc8495}).mo40966xc74540ab(new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.o());
    }

    private C4673x87f0d602() {
        super(false, 1, null);
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.C4666xb9b62ea7, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4662x21f4acfe, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.l
    /* renamed from: active */
    public boolean mo40960xab2f7f06() {
        if (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4679x33de8120.f19966x4fbc8495.mo40960xab2f7f06()) {
            m40992xc67387b2();
            return false;
        }
        checkTask.b();
        return super.mo40960xab2f7f06();
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4660x9028c9b0
    /* renamed from: addLifecycleCallback */
    public void mo40962x40b15f2e(p012xc85e97e9.p093xedfae76a.y lifecycleOwner, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.i callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleOwner, "lifecycleOwner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        throw null;
    }

    /* renamed from: getMaxCheckInterval */
    public final long m41045x80997a5f() {
        return maxCheckInterval;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4660x9028c9b0
    /* renamed from: isBackground */
    public boolean mo40965x320351f8() {
        return mo40960xab2f7f06();
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4660x9028c9b0
    /* renamed from: removeLifecycleCallback */
    public void mo40969xa01141ab(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.i callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        throw null;
    }

    /* renamed from: setMaxCheckInterval */
    public final void m41046x24960f6b(long j17) {
        if (j17 < java.util.concurrent.TimeUnit.SECONDS.toMillis(10L)) {
            throw new java.lang.IllegalArgumentException("interval should NOT be less than 10s");
        }
        maxCheckInterval = j17;
        oj.j.c(TAG, "set max check interval as " + j17, new java.lang.Object[0]);
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4660x9028c9b0
    /* renamed from: addLifecycleCallback */
    public void mo40964x40b15f2e(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.i callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        throw null;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4660x9028c9b0
    /* renamed from: removeLifecycleCallback */
    public void mo40968xa01141ab(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.b.c(this, callback);
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4660x9028c9b0
    /* renamed from: addLifecycleCallback */
    public void mo40961x40b15f2e(p012xc85e97e9.p093xedfae76a.y lifecycleOwner, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleOwner, "lifecycleOwner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.b.a(this, lifecycleOwner, callback);
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4660x9028c9b0
    /* renamed from: addLifecycleCallback */
    public void mo40963x40b15f2e(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.b.b(this, callback);
    }
}
