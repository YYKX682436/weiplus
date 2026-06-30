package com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "invoke", "(Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.mm.accessibility.core.provider.PreFocusModifier$dealNodeInfo$1 */
/* loaded from: classes14.dex */
public final class C4920xf4a39981 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: $nodeInfo */
    final /* synthetic */ android.view.accessibility.AccessibilityNodeInfo f21198x1c8b51f4;

    /* renamed from: $view */
    final /* synthetic */ android.view.View f21199x23288c9;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4920xf4a39981(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super(1);
        this.f21199x23288c9 = view;
        this.f21198x1c8b51f4 = accessibilityNodeInfo;
    }

    @Override // yz5.l
    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final java.lang.Boolean mo146xb9724478(com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.AbstractViewTreeObserverOnGlobalLayoutListenerC4836x37397ddf it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (!it.m42278xd255c125().containsKey(java.lang.Integer.valueOf(this.f21199x23288c9.getId())) && !it.m42280x880f8ff1().containsKey(java.lang.Integer.valueOf(this.f21199x23288c9.getId())) && !it.m42274xf0db2445().containsKey(java.lang.Integer.valueOf(this.f21199x23288c9.getId())) && !it.m42258xc5784d2d().containsKey(java.lang.Integer.valueOf(this.f21199x23288c9.getId()))) {
            java.lang.Integer startViewId = it.getStartViewId();
            int id6 = this.f21199x23288c9.getId();
            if (startViewId == null || startViewId.intValue() != id6) {
                return java.lang.Boolean.FALSE;
            }
        }
        this.f21198x1c8b51f4.setFocusable(true);
        return java.lang.Boolean.TRUE;
    }
}
