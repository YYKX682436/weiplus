package com.tencent.mm.accessibility.core.provider;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\"\u0010\u000f\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0010\u001a\u00020\u0002H\u0016¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/accessibility/core/provider/SeekbarCaller;", "Lcom/tencent/mm/accessibility/core/provider/Provider;", "", "action", "", "isScrollAction", "Landroid/view/View;", "view", "Landroid/view/accessibility/AccessibilityNodeInfo;", "nodeInfo", "Ljz5/f0;", "dealNodeInfo", "host", "Landroid/os/Bundle;", "args", "dealOnAction", "getAuthority", "<init>", "()V", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class SeekbarCaller extends com.tencent.mm.accessibility.core.provider.Provider {
    public static final int $stable = 0;
    public static final com.tencent.mm.accessibility.core.provider.SeekbarCaller INSTANCE = new com.tencent.mm.accessibility.core.provider.SeekbarCaller();

    private SeekbarCaller() {
    }

    private final boolean isScrollAction(int action) {
        return action == 8192 || action == 4096;
    }

    @Override // com.tencent.mm.accessibility.core.provider.Provider
    public void dealNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo nodeInfo) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(nodeInfo, "nodeInfo");
        com.tencent.mm.accessibility.base.ViewTag tagData = com.tencent.mm.accessibility.core.ViewTagManager.INSTANCE.getTagData(view);
        if (kotlin.jvm.internal.o.b(tagData != null ? tagData.getViewType() : null, android.widget.SeekBar.class.getName())) {
            nodeInfo.addAction(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            nodeInfo.addAction(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
            nodeInfo.setClassName(android.widget.SeekBar.class.getName());
        }
    }

    @Override // com.tencent.mm.accessibility.core.provider.Provider
    public void dealOnAction(android.view.View host, int i17, android.os.Bundle bundle) {
        jz5.l lVar;
        yz5.l lVar2;
        jz5.l lVar3;
        yz5.l lVar4;
        kotlin.jvm.internal.o.g(host, "host");
        com.tencent.mm.accessibility.base.ViewTag tagData = com.tencent.mm.accessibility.core.ViewTagManager.INSTANCE.getTagData(host);
        if (kotlin.jvm.internal.o.b(tagData != null ? tagData.getViewType() : null, android.widget.SeekBar.class.getName()) && isScrollAction(i17)) {
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            getConfig(host, new com.tencent.mm.accessibility.core.provider.SeekbarCaller$dealOnAction$1(host, h0Var));
            if (i17 == 8192 && (lVar3 = (jz5.l) h0Var.f310123d) != null && (lVar4 = (yz5.l) lVar3.f302834e) != null) {
                lVar4.invoke(host);
            }
            if (i17 != 4096 || (lVar = (jz5.l) h0Var.f310123d) == null || (lVar2 = (yz5.l) lVar.f302833d) == null) {
                return;
            }
            lVar2.invoke(host);
        }
    }

    @Override // com.tencent.mm.accessibility.core.provider.Provider
    public int getAuthority() {
        return 9;
    }
}
