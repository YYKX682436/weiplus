package com.tencent.mm.accessibility.core.area;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "invoke", "(Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AreaProvider$findConfigRect$1 extends kotlin.jvm.internal.q implements yz5.l {
    final /* synthetic */ kotlin.jvm.internal.h0 $res;
    final /* synthetic */ android.view.View $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AreaProvider$findConfigRect$1(android.view.View view, kotlin.jvm.internal.h0 h0Var) {
        super(1);
        this.$view = view;
        this.$res = h0Var;
    }

    @Override // yz5.l
    public final java.lang.Boolean invoke(com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig it) {
        android.view.View findRoot$plugin_autoaccessibility_release;
        int px6;
        int px7;
        int px8;
        int px9;
        kotlin.jvm.internal.o.g(it, "it");
        java.util.Map<java.lang.Integer, int[]> map = it.getViewRootAreaMap$plugin_autoaccessibility_release().get(java.lang.Integer.valueOf(this.$view.getId()));
        if (map != null && (findRoot$plugin_autoaccessibility_release = it.findRoot$plugin_autoaccessibility_release(this.$view, kz5.n0.S0(map.keySet()))) != null) {
            int[] iArr = map.get(java.lang.Integer.valueOf(findRoot$plugin_autoaccessibility_release.getId()));
            if (iArr == null && (iArr = map.get(com.tencent.mm.accessibility.core.area.AreaProvider.INSTANCE.getLayoutId(findRoot$plugin_autoaccessibility_release))) == null) {
                return java.lang.Boolean.FALSE;
            }
            kotlin.jvm.internal.h0 h0Var = this.$res;
            java.lang.Object clone = iArr.clone();
            int[] iArr2 = (int[]) clone;
            com.tencent.mm.accessibility.core.area.AreaProvider areaProvider = com.tencent.mm.accessibility.core.area.AreaProvider.INSTANCE;
            px6 = areaProvider.getPx(iArr2[0]);
            iArr2[0] = px6;
            px7 = areaProvider.getPx(iArr2[1]);
            iArr2[1] = px7;
            px8 = areaProvider.getPx(iArr2[2]);
            iArr2[2] = px8;
            px9 = areaProvider.getPx(iArr2[3]);
            iArr2[3] = px9;
            h0Var.f310123d = clone;
            return java.lang.Boolean.TRUE;
        }
        return java.lang.Boolean.FALSE;
    }
}
