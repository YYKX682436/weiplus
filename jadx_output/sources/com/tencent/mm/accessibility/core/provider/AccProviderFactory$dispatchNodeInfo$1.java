package com.tencent.mm.accessibility.core.provider;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class AccProviderFactory$dispatchNodeInfo$1 extends kotlin.jvm.internal.q implements yz5.a {
    final /* synthetic */ android.view.accessibility.AccessibilityNodeInfo $nodeInfo;
    final /* synthetic */ android.view.View $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccProviderFactory$dispatchNodeInfo$1(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super(0);
        this.$view = view;
        this.$nodeInfo = accessibilityNodeInfo;
    }

    @Override // yz5.a
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        m55invoke();
        return jz5.f0.f302826a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m55invoke() {
        java.util.List<com.tencent.mm.accessibility.core.provider.Provider> list;
        list = com.tencent.mm.accessibility.core.provider.AccProviderFactory.providers;
        android.view.View view = this.$view;
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = this.$nodeInfo;
        for (com.tencent.mm.accessibility.core.provider.Provider provider : list) {
            if ((provider.getAuthority() & 1) == 1) {
                provider.dealNodeInfo(view, accessibilityNodeInfo);
            }
        }
    }
}
