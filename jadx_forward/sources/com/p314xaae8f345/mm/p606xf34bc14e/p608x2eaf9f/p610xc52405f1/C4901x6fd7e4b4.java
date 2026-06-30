package com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "invoke", "(Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.mm.accessibility.core.provider.CheckableModifier$dealNodeInfo$1 */
/* loaded from: classes14.dex */
public final class C4901x6fd7e4b4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: $nodeInfo */
    final /* synthetic */ android.view.accessibility.AccessibilityNodeInfo f21159x1c8b51f4;

    /* renamed from: $view */
    final /* synthetic */ android.view.View f21160x23288c9;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4901x6fd7e4b4(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super(1);
        this.f21160x23288c9 = view;
        this.f21159x1c8b51f4 = accessibilityNodeInfo;
    }

    @Override // yz5.l
    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final java.lang.Boolean mo146xb9724478(com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.AbstractViewTreeObserverOnGlobalLayoutListenerC4836x37397ddf it) {
        android.os.Handler handler;
        java.lang.Runnable runnable;
        yz5.l lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.util.Map<java.lang.Integer, jz5.l> map = it.m42279x365b2d6d().get(java.lang.Integer.valueOf(this.f21160x23288c9.getId()));
        if (map == null) {
            return java.lang.Boolean.FALSE;
        }
        android.view.View m42254x811f1304 = it.m42254x811f1304(this.f21160x23288c9, kz5.n0.S0(map.keySet()));
        jz5.l lVar2 = map.get(m42254x811f1304 != null ? java.lang.Integer.valueOf(m42254x811f1304.getId()) : null);
        if (lVar2 == null) {
            lVar2 = map.get(com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4899x93d2db39.f21153x4fbc8495.m42653x2ee31f5b(this.f21160x23288c9));
        }
        boolean z17 = false;
        if (lVar2 != null && (lVar = (yz5.l) lVar2.f384367e) != null && ((java.lang.Boolean) lVar.mo146xb9724478(this.f21160x23288c9)).booleanValue()) {
            z17 = true;
        }
        if (z17) {
            java.lang.Object mo146xb9724478 = ((yz5.l) lVar2.f384366d).mo146xb9724478(this.f21160x23288c9);
            android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = this.f21159x1c8b51f4;
            boolean booleanValue = ((java.lang.Boolean) mo146xb9724478).booleanValue();
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(booleanValue);
            handler = com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4899x93d2db39.handler;
            runnable = com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4899x93d2db39.clearTask;
            handler.postDelayed(runnable, 500L);
            return java.lang.Boolean.TRUE;
        }
        return java.lang.Boolean.FALSE;
    }
}
