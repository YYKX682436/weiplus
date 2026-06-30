package com.tencent.mm.accessibility.core.provider;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Ljz5/f0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class DisableChildModifier$dealOnViewInflateAsync$1 extends kotlin.jvm.internal.q implements yz5.l {
    final /* synthetic */ android.view.View $view;

    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Ljz5/f0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.accessibility.core.provider.DisableChildModifier$dealOnViewInflateAsync$1$1, reason: invalid class name */
    /* loaded from: classes14.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.q implements yz5.l {
        final /* synthetic */ android.view.View $view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(android.view.View view) {
            super(1);
            this.$view = view;
        }

        @Override // yz5.l
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            invoke((android.view.View) obj);
            return jz5.f0.f302826a;
        }

        public final void invoke(android.view.View it) {
            kotlin.jvm.internal.o.g(it, "it");
            com.tencent.mm.accessibility.base.ViewTag tagData = com.tencent.mm.accessibility.core.ViewTagManager.INSTANCE.getTagData(it);
            if (tagData != null) {
                tagData.setDisableFocusFlag(java.lang.Boolean.TRUE);
            }
            com.tencent.mm.accessibility.core.provider.DisableChildModifier.INSTANCE.logMsg(com.tencent.mm.accessibility.core.provider.DisableChildModifier.TAG, this.$view, "success set tag_acc_disable_flag on child" + com.tencent.mm.accessibility.uitl.IdUtil.INSTANCE.getName(this.$view.getId()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisableChildModifier$dealOnViewInflateAsync$1(android.view.View view) {
        super(1);
        this.$view = view;
    }

    @Override // yz5.l
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        invoke((android.view.View) obj);
        return jz5.f0.f302826a;
    }

    public final void invoke(android.view.View it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.accessibility.core.provider.DisableChildModifier disableChildModifier = com.tencent.mm.accessibility.core.provider.DisableChildModifier.INSTANCE;
        android.view.View view = this.$view;
        disableChildModifier.visitChild(view, new com.tencent.mm.accessibility.core.provider.DisableChildModifier$dealOnViewInflateAsync$1.AnonymousClass1(view));
    }
}
