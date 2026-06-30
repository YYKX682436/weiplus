package com.tencent.mm.accessibility.core.provider;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "invoke", "(Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TypeModifier$dealNodeInfo$1 extends kotlin.jvm.internal.q implements yz5.l {
    final /* synthetic */ android.view.accessibility.AccessibilityNodeInfo $nodeInfo;
    final /* synthetic */ android.view.View $view;

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.tencent.mm.accessibility.type.ViewType.values().length];
            try {
                iArr[com.tencent.mm.accessibility.type.ViewType.Button.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.tencent.mm.accessibility.type.ViewType.TextView.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.tencent.mm.accessibility.type.ViewType.SeekBar.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.tencent.mm.accessibility.type.ViewType.CheckBox.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.tencent.mm.accessibility.type.ViewType.EditText.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypeModifier$dealNodeInfo$1(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super(1);
        this.$view = view;
        this.$nodeInfo = accessibilityNodeInfo;
    }

    @Override // yz5.l
    public final java.lang.Boolean invoke(com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.util.Map<java.lang.Integer, com.tencent.mm.accessibility.type.ViewType> map = it.getTypeMap$plugin_autoaccessibility_release().get(java.lang.Integer.valueOf(this.$view.getId()));
        if (map == null) {
            return java.lang.Boolean.FALSE;
        }
        android.view.View findRoot$plugin_autoaccessibility_release = it.findRoot$plugin_autoaccessibility_release(this.$view, kz5.n0.S0(map.keySet()));
        jz5.f0 f0Var = null;
        com.tencent.mm.accessibility.type.ViewType viewType = map.get(findRoot$plugin_autoaccessibility_release != null ? java.lang.Integer.valueOf(findRoot$plugin_autoaccessibility_release.getId()) : null);
        if (viewType == null) {
            viewType = map.get(com.tencent.mm.accessibility.core.provider.TypeModifier.INSTANCE.getLayoutId(this.$view));
        }
        if (viewType != null) {
            android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = this.$nodeInfo;
            int i17 = com.tencent.mm.accessibility.core.provider.TypeModifier$dealNodeInfo$1.WhenMappings.$EnumSwitchMapping$0[viewType.ordinal()];
            if (i17 == 1) {
                accessibilityNodeInfo.setClassName(android.widget.Button.class.getName());
            } else if (i17 == 2) {
                accessibilityNodeInfo.setClassName(android.widget.TextView.class.getName());
            } else if (i17 == 3) {
                accessibilityNodeInfo.setClassName(android.widget.SeekBar.class.getName());
            } else if (i17 == 4) {
                accessibilityNodeInfo.setClassName(android.widget.CheckBox.class.getName());
            } else {
                if (i17 != 5) {
                    return java.lang.Boolean.FALSE;
                }
                accessibilityNodeInfo.setClassName(android.widget.EditText.class.getName());
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mm.accessibility.core.provider.TypeModifier.INSTANCE.logMsg(com.tencent.mm.accessibility.core.provider.TypeModifier.TAG, this.$view, "findRoot success but not found Type?");
            return java.lang.Boolean.FALSE;
        }
        com.tencent.mm.accessibility.base.ViewTag tagData = com.tencent.mm.accessibility.core.ViewTagManager.INSTANCE.getTagData(this.$view);
        if (tagData != null) {
            tagData.setViewType(this.$nodeInfo.getClassName());
        }
        return java.lang.Boolean.TRUE;
    }
}
