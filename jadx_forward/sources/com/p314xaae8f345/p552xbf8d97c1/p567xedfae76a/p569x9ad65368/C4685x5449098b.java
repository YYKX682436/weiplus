package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u0011\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0001J\u0019\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0001J\u0011\u0010\f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0001R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"com/tencent/matrix/lifecycle/supervisor/ProcessSupervisor$AppStagedBackgroundOwner", "Lcom/tencent/matrix/lifecycle/IBackgroundStatefulOwner;", "Lcom/tencent/matrix/lifecycle/IStatefulOwner;", "", "active", "Lcom/tencent/matrix/lifecycle/k;", "observer", "Ljz5/f0;", "observeForever", "Landroidx/lifecycle/y;", "lifecycleOwner", "observeWithLifecycle", "removeObserver", "Lcom/tencent/matrix/lifecycle/MultiSourceStatefulOwner;", "delegate", "Lcom/tencent/matrix/lifecycle/MultiSourceStatefulOwner;", "<init>", "(Lcom/tencent/matrix/lifecycle/MultiSourceStatefulOwner;)V", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor$AppStagedBackgroundOwner */
/* loaded from: classes12.dex */
final class C4685x5449098b implements com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4660x9028c9b0, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4662x21f4acfe {
    private final com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.C4665xfc64bc93 delegate;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"com/tencent/matrix/lifecycle/supervisor/ProcessSupervisor$AppStagedBackgroundOwner$1", "Lcom/tencent/matrix/lifecycle/MultiSourceStatefulOwner;", "Lcom/tencent/matrix/lifecycle/j;", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor$AppStagedBackgroundOwner$1, reason: invalid class name */
    /* loaded from: classes12.dex */
    public static final class AnonymousClass1 extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.C4665xfc64bc93 implements com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.j {

        /* renamed from: this$0 */
        final /* synthetic */ com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0 f19982xcbdd23aa;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0 d0Var, yz5.l lVar, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4662x21f4acfe[] interfaceC4662x21f4acfeArr) {
            super(lVar, interfaceC4662x21f4acfeArr);
            this.f19982xcbdd23aa = d0Var;
        }

        @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.j
        /* renamed from: serial */
        public boolean mo40995xca01fdf4() {
            return true;
        }
    }

    public C4685x5449098b() {
        this(null, 1, null);
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4660x9028c9b0, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4662x21f4acfe, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.l
    /* renamed from: active */
    public boolean mo40960xab2f7f06() {
        return this.delegate.mo40960xab2f7f06();
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4660x9028c9b0
    /* renamed from: addLifecycleCallback */
    public void mo40962x40b15f2e(p012xc85e97e9.p093xedfae76a.y lifecycleOwner, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.i callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleOwner, "lifecycleOwner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        throw null;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4660x9028c9b0
    /* renamed from: isBackground */
    public boolean mo40965x320351f8() {
        return mo40960xab2f7f06();
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4660x9028c9b0, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4662x21f4acfe
    /* renamed from: observeForever */
    public void mo40966xc74540ab(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        this.delegate.mo40966xc74540ab(observer);
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4660x9028c9b0, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4662x21f4acfe
    /* renamed from: observeWithLifecycle */
    public void mo40967x96d2e188(p012xc85e97e9.p093xedfae76a.y lifecycleOwner, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleOwner, "lifecycleOwner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        this.delegate.mo40967x96d2e188(lifecycleOwner, observer);
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4660x9028c9b0
    /* renamed from: removeLifecycleCallback */
    public void mo40969xa01141ab(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.i callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        throw null;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4660x9028c9b0, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4662x21f4acfe
    /* renamed from: removeObserver */
    public void mo40970xb5bdeb7a(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        this.delegate.mo40970xb5bdeb7a(observer);
    }

    public C4685x5449098b(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.C4665xfc64bc93 delegate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        this.delegate = delegate;
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

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C4685x5449098b(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.C4665xfc64bc93 r5, int r6, p3321xbce91901.jvm.p3324x21ffc6bd.i r7) {
        /*
            r4 = this;
            r7 = 1
            r6 = r6 & r7
            if (r6 == 0) goto L35
            com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor$AppStagedBackgroundOwner$1 r5 = new com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor$AppStagedBackgroundOwner$1
            com.tencent.matrix.lifecycle.supervisor.d0 r6 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134367k
            com.tencent.matrix.lifecycle.s0 r0 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.s0.f134323d
            r1 = 2
            com.tencent.matrix.lifecycle.IStatefulOwner[] r1 = new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4662x21f4acfe[r1]
            r6.getClass()
            com.tencent.matrix.lifecycle.IBackgroundStatefulOwner r2 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134364h
            java.lang.String r3 = "$this$shadow"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r3)
            com.tencent.matrix.lifecycle.StatefulOwnerKt$shadow$1 r3 = new com.tencent.matrix.lifecycle.StatefulOwnerKt$shadow$1
            r3.<init>(r2, r7, r7)
            r2 = 0
            r1[r2] = r3
            com.tencent.matrix.lifecycle.IBackgroundStatefulOwner r2 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134365i
            java.lang.String r3 = "$this$reverse"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r3)
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4685x5449098b.<init>(com.tencent.matrix.lifecycle.MultiSourceStatefulOwner, int, kotlin.jvm.internal.i):void");
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
