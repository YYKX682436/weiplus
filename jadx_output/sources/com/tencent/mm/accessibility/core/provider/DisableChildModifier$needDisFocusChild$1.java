package com.tencent.mm.accessibility.core.provider;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "invoke", "(Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DisableChildModifier$needDisFocusChild$1 extends kotlin.jvm.internal.q implements yz5.l {
    final /* synthetic */ yz5.l $callback;
    final /* synthetic */ android.view.View $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisableChildModifier$needDisFocusChild$1(android.view.View view, yz5.l lVar) {
        super(1);
        this.$view = view;
        this.$callback = lVar;
    }

    @Override // yz5.l
    public final java.lang.Boolean invoke(com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.util.List<java.lang.Integer> list = it.getDisableChildViewRootMap$plugin_autoaccessibility_release().get(java.lang.Integer.valueOf(this.$view.getId()));
        if (list == null) {
            return java.lang.Boolean.FALSE;
        }
        com.tencent.mm.accessibility.core.provider.DisableChildModifier.INSTANCE.logMsg(com.tencent.mm.accessibility.core.provider.DisableChildModifier.TAG, this.$view, "find rootIds, prepare findRoot");
        if (it.findRoot$plugin_autoaccessibility_release(this.$view, list) != null) {
            this.$callback.invoke(this.$view);
        }
        return java.lang.Boolean.TRUE;
    }
}
