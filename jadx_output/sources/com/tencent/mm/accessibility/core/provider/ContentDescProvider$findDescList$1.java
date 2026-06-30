package com.tencent.mm.accessibility.core.provider;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "invoke", "(Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ContentDescProvider$findDescList$1 extends kotlin.jvm.internal.q implements yz5.l {
    final /* synthetic */ android.view.View[] $outRootView;
    final /* synthetic */ kotlin.jvm.internal.h0 $res;
    final /* synthetic */ android.view.View $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentDescProvider$findDescList$1(android.view.View view, android.view.View[] viewArr, kotlin.jvm.internal.h0 h0Var) {
        super(1);
        this.$view = view;
        this.$outRootView = viewArr;
        this.$res = h0Var;
    }

    @Override // yz5.l
    public final java.lang.Boolean invoke(com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig it) {
        android.view.View findRoot$plugin_autoaccessibility_release;
        kotlin.jvm.internal.o.g(it, "it");
        java.util.Map<java.lang.Integer, java.lang.Object> map = it.getViewRootDescMap$plugin_autoaccessibility_release().get(java.lang.Integer.valueOf(this.$view.getId()));
        if (map != null && (findRoot$plugin_autoaccessibility_release = it.findRoot$plugin_autoaccessibility_release(this.$view, kz5.n0.S0(map.keySet()))) != null) {
            this.$outRootView[0] = findRoot$plugin_autoaccessibility_release;
            kotlin.jvm.internal.h0 h0Var = this.$res;
            java.lang.Object obj = map.get(java.lang.Integer.valueOf(findRoot$plugin_autoaccessibility_release.getId()));
            if (obj == null) {
                obj = map.get(com.tencent.mm.accessibility.core.provider.ContentDescProvider.INSTANCE.getLayoutId(findRoot$plugin_autoaccessibility_release));
            }
            h0Var.f310123d = obj;
            com.tencent.mm.accessibility.core.provider.ContentDescProvider contentDescProvider = com.tencent.mm.accessibility.core.provider.ContentDescProvider.INSTANCE;
            com.tencent.mm.accessibility.core.provider.ContentDescProvider.curConfigName = it.getClass().getName();
            return java.lang.Boolean.TRUE;
        }
        return java.lang.Boolean.FALSE;
    }
}
