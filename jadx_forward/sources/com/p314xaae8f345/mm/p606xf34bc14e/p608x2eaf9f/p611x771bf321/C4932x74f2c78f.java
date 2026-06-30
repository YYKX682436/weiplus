package com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p611x771bf321;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\f"}, d2 = {"Lcom/tencent/mm/accessibility/core/providerdebuged/TextLinespaceShower;", "Lcom/tencent/mm/accessibility/core/provider/Provider;", "Landroid/view/View;", "view", "Landroid/view/accessibility/AccessibilityNodeInfo;", "nodeInfo", "Ljz5/f0;", "dealNodeInfo", "", "getAuthority", "<init>", "()V", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.accessibility.core.providerdebuged.TextLinespaceShower */
/* loaded from: classes14.dex */
public final class C4932x74f2c78f extends com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.AbstractC4922xc8fe6a11 {

    /* renamed from: $stable */
    public static final int f21234x3b2de05f = 0;

    /* renamed from: INSTANCE */
    public static final com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p611x771bf321.C4932x74f2c78f f21235x4fbc8495 = new com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p611x771bf321.C4932x74f2c78f();

    private C4932x74f2c78f() {
    }

    @Override // com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.AbstractC4922xc8fe6a11
    /* renamed from: dealNodeInfo */
    public void mo42598x2317ea5c(android.view.View view, android.view.accessibility.AccessibilityNodeInfo nodeInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nodeInfo, "nodeInfo");
        if (view instanceof android.widget.TextView) {
            android.widget.TextView textView = (android.widget.TextView) view;
            nodeInfo.getExtras().putInt("MM_lineCount", textView.getLineCount());
            nodeInfo.getExtras().putFloat("MM_lineSpacingMultiplier", textView.getLineSpacingMultiplier());
        } else if (view instanceof com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) {
            com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc c23001x9d3a0bdc = (com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) view;
            nodeInfo.getExtras().putInt("MM_lineCount", c23001x9d3a0bdc.m84154x92d2fac5());
            nodeInfo.getExtras().putFloat("MM_lineSpacingMultiplier", c23001x9d3a0bdc.m84165x334dfae1().getLineSpacingMultiplier());
        } else if (view instanceof com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152.C10808xd74620) {
            com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152.C10808xd74620 c10808xd74620 = (com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152.C10808xd74620) view;
            nodeInfo.getExtras().putInt("MM_lineCount", c10808xd74620.m46322x92d2fac5());
            nodeInfo.getExtras().putFloat("MM_lineSpacingMultiplier", c10808xd74620.m46325x5274cf1a());
        }
    }

    @Override // com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.AbstractC4922xc8fe6a11
    /* renamed from: getAuthority */
    public int mo9976x5761788d() {
        return com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4966x1d004c03.f21354x4fbc8495.m42848x914c5b1b() ? 1 : 0;
    }
}
