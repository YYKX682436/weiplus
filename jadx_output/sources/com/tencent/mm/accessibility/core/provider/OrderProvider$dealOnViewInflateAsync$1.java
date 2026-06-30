package com.tencent.mm.accessibility.core.provider;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "invoke", "(Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OrderProvider$dealOnViewInflateAsync$1 extends kotlin.jvm.internal.q implements yz5.l {
    final /* synthetic */ android.view.View $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderProvider$dealOnViewInflateAsync$1(android.view.View view) {
        super(1);
        this.$view = view;
    }

    @Override // yz5.l
    public final java.lang.Boolean invoke(com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig it) {
        boolean z17;
        int[] iArr;
        kotlin.jvm.internal.o.g(it, "it");
        int[] iArr2 = it.getGlobalTraversalMap$plugin_autoaccessibility_release().get(java.lang.Integer.valueOf(this.$view.getId()));
        boolean z18 = true;
        if (iArr2 != null) {
            android.view.View view = this.$view;
            view.setAccessibilityTraversalBefore(iArr2[0]);
            view.setAccessibilityTraversalAfter(iArr2[1]);
            com.tencent.mm.accessibility.core.provider.OrderProvider orderProvider = com.tencent.mm.accessibility.core.provider.OrderProvider.INSTANCE;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("success set globalTraversal, before:");
            com.tencent.mm.accessibility.uitl.IdUtil idUtil = com.tencent.mm.accessibility.uitl.IdUtil.INSTANCE;
            sb6.append(idUtil.getName(iArr2[0]));
            sb6.append(" after:");
            sb6.append(idUtil.getName(iArr2[1]));
            orderProvider.logMsg(com.tencent.mm.accessibility.core.provider.OrderProvider.TAG, view, sb6.toString());
            z17 = true;
        } else {
            z17 = false;
        }
        java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, int[]>> localTraversalMap$plugin_autoaccessibility_release = it.getLocalTraversalMap$plugin_autoaccessibility_release();
        com.tencent.mm.accessibility.core.provider.OrderProvider orderProvider2 = com.tencent.mm.accessibility.core.provider.OrderProvider.INSTANCE;
        java.util.Map<java.lang.Integer, int[]> map = localTraversalMap$plugin_autoaccessibility_release.get(orderProvider2.getLayoutId(this.$view));
        if (map == null || (iArr = map.get(java.lang.Integer.valueOf(this.$view.getId()))) == null) {
            z18 = z17;
        } else {
            android.view.View view2 = this.$view;
            view2.setAccessibilityTraversalBefore(iArr[0]);
            view2.setAccessibilityTraversalAfter(iArr[1]);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("success set localTraversal, before:");
            com.tencent.mm.accessibility.uitl.IdUtil idUtil2 = com.tencent.mm.accessibility.uitl.IdUtil.INSTANCE;
            sb7.append(idUtil2.getName(iArr[0]));
            sb7.append(" after:");
            sb7.append(idUtil2.getName(iArr[1]));
            orderProvider2.logMsg(com.tencent.mm.accessibility.core.provider.OrderProvider.TAG, view2, sb7.toString());
        }
        return java.lang.Boolean.valueOf(z18);
    }
}
