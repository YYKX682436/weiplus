package com.tencent.mm.accessibility.core.provider;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/accessibility/core/provider/TypeModifier;", "Lcom/tencent/mm/accessibility/core/provider/Provider;", "Landroid/view/View;", "view", "Landroid/view/accessibility/AccessibilityNodeInfo;", "nodeInfo", "Ljz5/f0;", "dealNodeInfo", "", "getAuthority", "", "TAG", "Ljava/lang/String;", "BUTTON_CLASS", "TEXTVIEW_CLASS", "<init>", "()V", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class TypeModifier extends com.tencent.mm.accessibility.core.provider.Provider {
    public static final int $stable = 0;
    public static final java.lang.String BUTTON_CLASS = "android.widget.Button";
    public static final com.tencent.mm.accessibility.core.provider.TypeModifier INSTANCE;
    public static final java.lang.String TAG = "MicroMsg.Acc.TypeModifier";
    public static final java.lang.String TEXTVIEW_CLASS = "android.widget.TextView";

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "", "view", "Landroid/view/View;", "config", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.mm.accessibility.core.provider.TypeModifier$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.q implements yz5.p {
        public static final com.tencent.mm.accessibility.core.provider.TypeModifier.AnonymousClass1 INSTANCE = new com.tencent.mm.accessibility.core.provider.TypeModifier.AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // yz5.p
        public final java.util.List<java.lang.Integer> invoke(android.view.View view, com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig config) {
            java.util.Set<java.lang.Integer> keySet;
            kotlin.jvm.internal.o.g(view, "view");
            kotlin.jvm.internal.o.g(config, "config");
            java.util.Map<java.lang.Integer, com.tencent.mm.accessibility.type.ViewType> map = config.getTypeMap$plugin_autoaccessibility_release().get(java.lang.Integer.valueOf(view.getId()));
            if (map == null || (keySet = map.keySet()) == null) {
                return null;
            }
            return kz5.n0.S0(keySet);
        }
    }

    static {
        com.tencent.mm.accessibility.core.provider.TypeModifier typeModifier = new com.tencent.mm.accessibility.core.provider.TypeModifier();
        INSTANCE = typeModifier;
        typeModifier.addRootIdMapper$plugin_autoaccessibility_release(com.tencent.mm.accessibility.core.provider.TypeModifier.AnonymousClass1.INSTANCE);
    }

    private TypeModifier() {
    }

    @Override // com.tencent.mm.accessibility.core.provider.Provider
    public void dealNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo nodeInfo) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(nodeInfo, "nodeInfo");
        getConfig(view, new com.tencent.mm.accessibility.core.provider.TypeModifier$dealNodeInfo$1(view, nodeInfo));
    }

    @Override // com.tencent.mm.accessibility.core.provider.Provider
    public int getAuthority() {
        return 1;
    }
}
