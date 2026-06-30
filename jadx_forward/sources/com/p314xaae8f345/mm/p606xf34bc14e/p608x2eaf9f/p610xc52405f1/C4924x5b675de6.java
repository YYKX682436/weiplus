package com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\"\u0010\u000f\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0010\u001a\u00020\u0002H\u0016¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/accessibility/core/provider/SeekbarCaller;", "Lcom/tencent/mm/accessibility/core/provider/Provider;", "", "action", "", "isScrollAction", "Landroid/view/View;", "view", "Landroid/view/accessibility/AccessibilityNodeInfo;", "nodeInfo", "Ljz5/f0;", "dealNodeInfo", "host", "Landroid/os/Bundle;", "args", "dealOnAction", "getAuthority", "<init>", "()V", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.accessibility.core.provider.SeekbarCaller */
/* loaded from: classes14.dex */
public final class C4924x5b675de6 extends com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.AbstractC4922xc8fe6a11 {

    /* renamed from: $stable */
    public static final int f21208x3b2de05f = 0;

    /* renamed from: INSTANCE */
    public static final com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4924x5b675de6 f21209x4fbc8495 = new com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4924x5b675de6();

    private C4924x5b675de6() {
    }

    /* renamed from: isScrollAction */
    private final boolean m42659x86f235ad(int action) {
        return action == 8192 || action == 4096;
    }

    @Override // com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.AbstractC4922xc8fe6a11
    /* renamed from: dealNodeInfo */
    public void mo42598x2317ea5c(android.view.View view, android.view.accessibility.AccessibilityNodeInfo nodeInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nodeInfo, "nodeInfo");
        com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.C4853x7e4b6695 m42517xe172022e = com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4876xaa469f58.f21085x4fbc8495.m42517xe172022e(view);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m42517xe172022e != null ? m42517xe172022e.getViewType() : null, android.widget.SeekBar.class.getName())) {
            nodeInfo.addAction(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            nodeInfo.addAction(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
            nodeInfo.setClassName(android.widget.SeekBar.class.getName());
        }
    }

    @Override // com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.AbstractC4922xc8fe6a11
    /* renamed from: dealOnAction */
    public void mo9974x1a508981(android.view.View host, int i17, android.os.Bundle bundle) {
        jz5.l lVar;
        yz5.l lVar2;
        jz5.l lVar3;
        yz5.l lVar4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.C4853x7e4b6695 m42517xe172022e = com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4876xaa469f58.f21085x4fbc8495.m42517xe172022e(host);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m42517xe172022e != null ? m42517xe172022e.getViewType() : null, android.widget.SeekBar.class.getName()) && m42659x86f235ad(i17)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            m42652x1456a638(host, new com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4925x9b8f7c4c(host, h0Var));
            if (i17 == 8192 && (lVar3 = (jz5.l) h0Var.f391656d) != null && (lVar4 = (yz5.l) lVar3.f384367e) != null) {
                lVar4.mo146xb9724478(host);
            }
            if (i17 != 4096 || (lVar = (jz5.l) h0Var.f391656d) == null || (lVar2 = (yz5.l) lVar.f384366d) == null) {
                return;
            }
            lVar2.mo146xb9724478(host);
        }
    }

    @Override // com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.AbstractC4922xc8fe6a11
    /* renamed from: getAuthority */
    public int mo9976x5761788d() {
        return 9;
    }
}
