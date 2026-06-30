package com.tencent.mm.accessibility.core.provider;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "invoke", "(Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CallbackCaller$dealNodeInfo$1 extends kotlin.jvm.internal.q implements yz5.l {
    final /* synthetic */ android.view.accessibility.AccessibilityNodeInfo $nodeInfo;
    final /* synthetic */ android.view.View $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallbackCaller$dealNodeInfo$1(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super(1);
        this.$view = view;
        this.$nodeInfo = accessibilityNodeInfo;
    }

    @Override // yz5.l
    public final java.lang.Boolean invoke(com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig it) {
        java.lang.String str;
        android.os.Handler handler;
        java.lang.Runnable runnable;
        android.os.Handler handler2;
        java.lang.Runnable runnable2;
        kotlin.jvm.internal.o.g(it, "it");
        java.util.Map<java.lang.Integer, yz5.l> map = it.getViewRootCallbackMap$plugin_autoaccessibility_release().get(java.lang.Integer.valueOf(this.$view.getId()));
        if (map == null) {
            return java.lang.Boolean.FALSE;
        }
        android.view.View findRoot$plugin_autoaccessibility_release = it.findRoot$plugin_autoaccessibility_release(this.$view, kz5.n0.S0(map.keySet()));
        yz5.l lVar = map.get(findRoot$plugin_autoaccessibility_release != null ? java.lang.Integer.valueOf(findRoot$plugin_autoaccessibility_release.getId()) : null);
        if (lVar == null) {
            lVar = map.get(com.tencent.mm.accessibility.core.provider.CallbackCaller.INSTANCE.getLayoutId(this.$view));
        }
        if (lVar != null && (str = (java.lang.String) lVar.invoke(this.$view)) != null) {
            android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = this.$nodeInfo;
            handler = com.tencent.mm.accessibility.core.provider.CallbackCaller.handler;
            runnable = com.tencent.mm.accessibility.core.provider.CallbackCaller.clearTask;
            handler.removeCallbacks(runnable);
            accessibilityNodeInfo.setContentDescription(str);
            handler2 = com.tencent.mm.accessibility.core.provider.CallbackCaller.handler;
            runnable2 = com.tencent.mm.accessibility.core.provider.CallbackCaller.clearTask;
            handler2.postDelayed(runnable2, 500L);
            return java.lang.Boolean.TRUE;
        }
        return java.lang.Boolean.FALSE;
    }
}
