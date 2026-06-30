package com.tencent.mm.accessibility.core.provider;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/accessibility/core/provider/DisableFocusModifier;", "Lcom/tencent/mm/accessibility/core/provider/Provider;", "Landroid/view/View;", "view", "", "needDisFocus", "needDisFocusByCondition", "Landroid/view/accessibility/AccessibilityNodeInfo;", "nodeInfo", "Ljz5/f0;", "dealNodeInfo", "", "getAuthority", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class DisableFocusModifier extends com.tencent.mm.accessibility.core.provider.Provider {
    public static final int $stable = 0;
    public static final com.tencent.mm.accessibility.core.provider.DisableFocusModifier INSTANCE;
    public static final java.lang.String TAG = "MicroMsg.Acc.DisableFocusModifier";

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "", "view", "Landroid/view/View;", "config", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.mm.accessibility.core.provider.DisableFocusModifier$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.q implements yz5.p {
        public static final com.tencent.mm.accessibility.core.provider.DisableFocusModifier.AnonymousClass1 INSTANCE = new com.tencent.mm.accessibility.core.provider.DisableFocusModifier.AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // yz5.p
        public final java.util.List<java.lang.Integer> invoke(android.view.View view, com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig config) {
            kotlin.jvm.internal.o.g(view, "view");
            kotlin.jvm.internal.o.g(config, "config");
            return config.getDisFocusViewRootMap$plugin_autoaccessibility_release().get(java.lang.Integer.valueOf(view.getId()));
        }
    }

    static {
        com.tencent.mm.accessibility.core.provider.DisableFocusModifier disableFocusModifier = new com.tencent.mm.accessibility.core.provider.DisableFocusModifier();
        INSTANCE = disableFocusModifier;
        disableFocusModifier.addRootIdMapper$plugin_autoaccessibility_release(com.tencent.mm.accessibility.core.provider.DisableFocusModifier.AnonymousClass1.INSTANCE);
    }

    private DisableFocusModifier() {
    }

    private final boolean needDisFocus(android.view.View view) {
        return getConfig(view, new com.tencent.mm.accessibility.core.provider.DisableFocusModifier$needDisFocus$needDisFocus$1(view));
    }

    private final boolean needDisFocusByCondition(android.view.View view) {
        return getConfig(view, new com.tencent.mm.accessibility.core.provider.DisableFocusModifier$needDisFocusByCondition$needDisFocus$1(view));
    }

    @Override // com.tencent.mm.accessibility.core.provider.Provider
    public void dealNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo nodeInfo) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(nodeInfo, "nodeInfo");
        if (needDisFocus(view)) {
            logMsg(TAG, view, "default disable success");
            view.setImportantForAccessibility(2);
        } else if (needDisFocusByCondition(view)) {
            logMsg(TAG, view, "disable by condition success ");
            com.tencent.mm.accessibility.base.MapExpandKt.disable(nodeInfo);
        }
    }

    @Override // com.tencent.mm.accessibility.core.provider.Provider
    public int getAuthority() {
        return com.tencent.mm.accessibility.uitl.AccUtil.INSTANCE.isAccessibilityEnabled() ? 1 : 0;
    }
}
