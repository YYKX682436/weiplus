package com.tencent.mm.accessibility.base;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Ljz5/f0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class MMBaseAccessibilityConfig$onDestroy$1 extends kotlin.jvm.internal.q implements yz5.l {
    final /* synthetic */ com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MMBaseAccessibilityConfig$onDestroy$1(com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig mMBaseAccessibilityConfig) {
        super(1);
        this.this$0 = mMBaseAccessibilityConfig;
    }

    @Override // yz5.l
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        invoke((android.view.View) obj);
        return jz5.f0.f302826a;
    }

    public final void invoke(android.view.View it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.this$0.setOnHierarchyChangeListener(it instanceof android.view.ViewGroup ? (android.view.ViewGroup) it : null, null);
    }
}
