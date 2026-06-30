package com.tencent.mm.accessibility.core.providerdebuged;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\f"}, d2 = {"Lcom/tencent/mm/accessibility/core/providerdebuged/TextLinespaceShower;", "Lcom/tencent/mm/accessibility/core/provider/Provider;", "Landroid/view/View;", "view", "Landroid/view/accessibility/AccessibilityNodeInfo;", "nodeInfo", "Ljz5/f0;", "dealNodeInfo", "", "getAuthority", "<init>", "()V", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class TextLinespaceShower extends com.tencent.mm.accessibility.core.provider.Provider {
    public static final int $stable = 0;
    public static final com.tencent.mm.accessibility.core.providerdebuged.TextLinespaceShower INSTANCE = new com.tencent.mm.accessibility.core.providerdebuged.TextLinespaceShower();

    private TextLinespaceShower() {
    }

    @Override // com.tencent.mm.accessibility.core.provider.Provider
    public void dealNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo nodeInfo) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(nodeInfo, "nodeInfo");
        if (view instanceof android.widget.TextView) {
            android.widget.TextView textView = (android.widget.TextView) view;
            nodeInfo.getExtras().putInt("MM_lineCount", textView.getLineCount());
            nodeInfo.getExtras().putFloat("MM_lineSpacingMultiplier", textView.getLineSpacingMultiplier());
        } else if (view instanceof com.tencent.neattextview.textview.view.NeatTextView) {
            com.tencent.neattextview.textview.view.NeatTextView neatTextView = (com.tencent.neattextview.textview.view.NeatTextView) view;
            nodeInfo.getExtras().putInt("MM_lineCount", neatTextView.getLineCount());
            nodeInfo.getExtras().putFloat("MM_lineSpacingMultiplier", neatTextView.getWrappedTextView().getLineSpacingMultiplier());
        } else if (view instanceof com.tencent.mm.kiss.widget.textview.StaticTextView) {
            com.tencent.mm.kiss.widget.textview.StaticTextView staticTextView = (com.tencent.mm.kiss.widget.textview.StaticTextView) view;
            nodeInfo.getExtras().putInt("MM_lineCount", staticTextView.getLineCount());
            nodeInfo.getExtras().putFloat("MM_lineSpacingMultiplier", staticTextView.getLineSpacingMultiplier());
        }
    }

    @Override // com.tencent.mm.accessibility.core.provider.Provider
    public int getAuthority() {
        return com.tencent.mm.accessibility.uitl.AccUtil.INSTANCE.isEnableShowTextLinespace() ? 1 : 0;
    }
}
