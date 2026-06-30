package com.tencent.mm.accessibility.core.provider;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J$\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0014\u0010\u0012\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/accessibility/core/provider/DisableChildModifier;", "Lcom/tencent/mm/accessibility/core/provider/Provider;", "Landroid/view/View;", "root", "Lkotlin/Function1;", "Ljz5/f0;", "visitor", "visitChild", "view", "callback", "needDisFocusChild", "Landroid/view/accessibility/AccessibilityNodeInfo;", "nodeInfo", "dealNodeInfo", "dealOnViewInflateAsync", "", "getAuthority", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class DisableChildModifier extends com.tencent.mm.accessibility.core.provider.Provider {
    public static final int $stable = 0;
    public static final com.tencent.mm.accessibility.core.provider.DisableChildModifier INSTANCE;
    public static final java.lang.String TAG = "MicroMsg.Acc.DisableChildModifier";

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "", "view", "Landroid/view/View;", "config", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.mm.accessibility.core.provider.DisableChildModifier$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.q implements yz5.p {
        public static final com.tencent.mm.accessibility.core.provider.DisableChildModifier.AnonymousClass1 INSTANCE = new com.tencent.mm.accessibility.core.provider.DisableChildModifier.AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // yz5.p
        public final java.util.List<java.lang.Integer> invoke(android.view.View view, com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig config) {
            kotlin.jvm.internal.o.g(view, "view");
            kotlin.jvm.internal.o.g(config, "config");
            return config.getDisableChildViewRootMap$plugin_autoaccessibility_release().get(java.lang.Integer.valueOf(view.getId()));
        }
    }

    static {
        com.tencent.mm.accessibility.core.provider.DisableChildModifier disableChildModifier = new com.tencent.mm.accessibility.core.provider.DisableChildModifier();
        INSTANCE = disableChildModifier;
        disableChildModifier.addRootIdMapper$plugin_autoaccessibility_release(com.tencent.mm.accessibility.core.provider.DisableChildModifier.AnonymousClass1.INSTANCE);
    }

    private DisableChildModifier() {
    }

    private final void needDisFocusChild(android.view.View view, yz5.l lVar) {
        getConfig(view, new com.tencent.mm.accessibility.core.provider.DisableChildModifier$needDisFocusChild$1(view, lVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void visitChild(android.view.View view, yz5.l lVar) {
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = viewGroup.getChildAt(i17);
                kotlin.jvm.internal.o.d(childAt);
                lVar.invoke(childAt);
                visitChild(childAt, lVar);
            }
        }
    }

    @Override // com.tencent.mm.accessibility.core.provider.Provider
    public void dealNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo nodeInfo) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(nodeInfo, "nodeInfo");
        com.tencent.mm.accessibility.base.ViewTag tagData = com.tencent.mm.accessibility.core.ViewTagManager.INSTANCE.getTagData(view);
        if (tagData != null ? kotlin.jvm.internal.o.b(tagData.getDisableFocusFlag(), java.lang.Boolean.TRUE) : false) {
            nodeInfo.setVisibleToUser(false);
            view.setImportantForAccessibility(4);
        }
    }

    @Override // com.tencent.mm.accessibility.core.provider.Provider
    public void dealOnViewInflateAsync(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        needDisFocusChild(view, new com.tencent.mm.accessibility.core.provider.DisableChildModifier$dealOnViewInflateAsync$1(view));
    }

    @Override // com.tencent.mm.accessibility.core.provider.Provider
    public int getAuthority() {
        return (com.tencent.mm.accessibility.uitl.AccUtil.INSTANCE.isAccessibilityEnabled() ? 1 : 0) | 2;
    }
}
