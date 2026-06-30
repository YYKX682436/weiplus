package com.tencent.mm.accessibility.core.provider;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "invoke", "(Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ClickConductionProvider$dealAccEvent$1 extends kotlin.jvm.internal.q implements yz5.l {
    final /* synthetic */ android.view.View $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickConductionProvider$dealAccEvent$1(android.view.View view) {
        super(1);
        this.$view = view;
    }

    @Override // yz5.l
    public final java.lang.Boolean invoke(com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig it) {
        android.view.View findRoot$plugin_autoaccessibility_release;
        kotlin.jvm.internal.o.g(it, "it");
        java.util.Map<java.lang.Integer, jz5.l> map = it.getClickViewRootTargetMap$plugin_autoaccessibility_release().get(java.lang.Integer.valueOf(this.$view.getId()));
        if (map != null && (findRoot$plugin_autoaccessibility_release = it.findRoot$plugin_autoaccessibility_release(this.$view, kz5.n0.S0(map.keySet()))) != null) {
            jz5.l lVar = map.get(java.lang.Integer.valueOf(findRoot$plugin_autoaccessibility_release.getId()));
            if (lVar == null && (lVar = map.get(com.tencent.mm.accessibility.core.provider.ClickConductionProvider.INSTANCE.getLayoutId(findRoot$plugin_autoaccessibility_release))) == null) {
                return java.lang.Boolean.FALSE;
            }
            com.tencent.mm.accessibility.core.provider.ClickConductionProvider.INSTANCE.logMsg(com.tencent.mm.accessibility.core.provider.ClickConductionProvider.TAG, this.$view, "success Found data, perform Click");
            if (((java.lang.Boolean) ((yz5.l) lVar.f302834e).invoke(this.$view)).booleanValue()) {
                android.view.View findViewById = findRoot$plugin_autoaccessibility_release.findViewById(((java.lang.Number) lVar.f302833d).intValue());
                if (findViewById == null) {
                    return java.lang.Boolean.FALSE;
                }
                findViewById.performClick();
            }
            return java.lang.Boolean.TRUE;
        }
        return java.lang.Boolean.FALSE;
    }
}
