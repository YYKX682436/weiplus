package com.tencent.mm.accessibility.core.provider;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class AccProviderFactory$onInflateRootAsync$1 extends kotlin.jvm.internal.q implements yz5.a {
    final /* synthetic */ java.lang.ref.WeakReference<android.view.View> $rootWrapper;

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.accessibility.core.provider.AccProviderFactory$onInflateRootAsync$1$1, reason: invalid class name */
    /* loaded from: classes14.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.q implements yz5.a {
        final /* synthetic */ java.lang.ref.WeakReference<android.view.View> $rootWrapper;

        @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Ljz5/f0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.tencent.mm.accessibility.core.provider.AccProviderFactory$onInflateRootAsync$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes14.dex */
        public static final class C00441 extends kotlin.jvm.internal.q implements yz5.l {
            public static final com.tencent.mm.accessibility.core.provider.AccProviderFactory$onInflateRootAsync$1.AnonymousClass1.C00441 INSTANCE = new com.tencent.mm.accessibility.core.provider.AccProviderFactory$onInflateRootAsync$1.AnonymousClass1.C00441();

            public C00441() {
                super(1);
            }

            @Override // yz5.l
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((android.view.View) obj);
                return jz5.f0.f302826a;
            }

            public final void invoke(android.view.View it) {
                boolean needDelegateTouch;
                kotlin.jvm.internal.o.g(it, "it");
                if (com.tencent.mm.accessibility.base.MapExpandKt.canDelegateOnInflate(it)) {
                    com.tencent.mm.accessibility.uitl.AccNodeUtil.INSTANCE.checkDelegate(it);
                }
                com.tencent.mm.accessibility.core.provider.AccProviderFactory accProviderFactory = com.tencent.mm.accessibility.core.provider.AccProviderFactory.INSTANCE;
                needDelegateTouch = accProviderFactory.needDelegateTouch(it);
                if (needDelegateTouch) {
                    com.tencent.mm.accessibility.uitl.AccNodeUtil.INSTANCE.doDelegateTouch(it);
                }
                accProviderFactory.onMockInflate(it);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(java.lang.ref.WeakReference<android.view.View> weakReference) {
            super(0);
            this.$rootWrapper = weakReference;
        }

        @Override // yz5.a
        public /* bridge */ /* synthetic */ java.lang.Object invoke() {
            m60invoke();
            return jz5.f0.f302826a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m60invoke() {
            android.view.View view = this.$rootWrapper.get();
            if (view != null) {
                com.tencent.mm.accessibility.base.MapExpandKt.visitChild(view, com.tencent.mm.accessibility.core.provider.AccProviderFactory$onInflateRootAsync$1.AnonymousClass1.C00441.INSTANCE);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccProviderFactory$onInflateRootAsync$1(java.lang.ref.WeakReference<android.view.View> weakReference) {
        super(0);
        this.$rootWrapper = weakReference;
    }

    @Override // yz5.a
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        m59invoke();
        return jz5.f0.f302826a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m59invoke() {
        pm0.v.P(com.tencent.mm.accessibility.base.ConstantsAccessibility.THREAD_TAG, false, new com.tencent.mm.accessibility.core.provider.AccProviderFactory$onInflateRootAsync$1.AnonymousClass1(this.$rootWrapper), 200L);
    }
}
