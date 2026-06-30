package com.tencent.mm.accessibility.base;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class MMBaseAccessibilityConfig$mockInflateAsync$1 extends kotlin.jvm.internal.q implements yz5.a {
    final /* synthetic */ android.view.View $root;
    final /* synthetic */ com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig this$0;

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig$mockInflateAsync$1$1, reason: invalid class name */
    /* loaded from: classes14.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.q implements yz5.a {
        final /* synthetic */ android.view.View $root;
        final /* synthetic */ com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig mMBaseAccessibilityConfig, android.view.View view) {
            super(0);
            this.this$0 = mMBaseAccessibilityConfig;
            this.$root = view;
        }

        @Override // yz5.a
        public /* bridge */ /* synthetic */ java.lang.Object invoke() {
            m49invoke();
            return jz5.f0.f302826a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m49invoke() {
            this.this$0.mockInflateCore(this.$root);
            com.tencent.mm.accessibility.base.ViewTag tagData = com.tencent.mm.accessibility.core.ViewTagManager.INSTANCE.getTagData(this.$root);
            if (tagData == null) {
                return;
            }
            tagData.setHavenInflate(java.lang.Boolean.TRUE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MMBaseAccessibilityConfig$mockInflateAsync$1(com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig mMBaseAccessibilityConfig, android.view.View view) {
        super(0);
        this.this$0 = mMBaseAccessibilityConfig;
        this.$root = view;
    }

    @Override // yz5.a
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        m48invoke();
        return jz5.f0.f302826a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m48invoke() {
        pm0.v.P(com.tencent.mm.accessibility.base.ConstantsAccessibility.THREAD_TAG, false, new com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig$mockInflateAsync$1.AnonymousClass1(this.this$0, this.$root), 200L);
        com.tencent.mars.xlog.Log.i(com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.TAG, "mockInflate start in " + this.this$0.getClass().getName() + " :Root->" + com.tencent.mm.accessibility.uitl.IdUtil.INSTANCE.getName(this.$root.getId()));
    }
}
