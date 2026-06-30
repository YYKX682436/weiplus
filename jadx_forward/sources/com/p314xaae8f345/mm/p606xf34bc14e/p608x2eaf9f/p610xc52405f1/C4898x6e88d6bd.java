package com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "invoke", "(Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.mm.accessibility.core.provider.CallbackCaller$dealNodeInfo$1 */
/* loaded from: classes14.dex */
public final class C4898x6e88d6bd extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: $nodeInfo */
    final /* synthetic */ android.view.accessibility.AccessibilityNodeInfo f21149x1c8b51f4;

    /* renamed from: $view */
    final /* synthetic */ android.view.View f21150x23288c9;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4898x6e88d6bd(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super(1);
        this.f21150x23288c9 = view;
        this.f21149x1c8b51f4 = accessibilityNodeInfo;
    }

    @Override // yz5.l
    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final java.lang.Boolean mo146xb9724478(com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.AbstractViewTreeObserverOnGlobalLayoutListenerC4836x37397ddf it) {
        java.lang.String str;
        android.os.Handler handler;
        java.lang.Runnable runnable;
        android.os.Handler handler2;
        java.lang.Runnable runnable2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.util.Map<java.lang.Integer, yz5.l> map = it.m42278xd255c125().get(java.lang.Integer.valueOf(this.f21150x23288c9.getId()));
        if (map == null) {
            return java.lang.Boolean.FALSE;
        }
        android.view.View m42254x811f1304 = it.m42254x811f1304(this.f21150x23288c9, kz5.n0.S0(map.keySet()));
        yz5.l lVar = map.get(m42254x811f1304 != null ? java.lang.Integer.valueOf(m42254x811f1304.getId()) : null);
        if (lVar == null) {
            lVar = map.get(com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4896xfe573850.f21143x4fbc8495.m42653x2ee31f5b(this.f21150x23288c9));
        }
        if (lVar != null && (str = (java.lang.String) lVar.mo146xb9724478(this.f21150x23288c9)) != null) {
            android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = this.f21149x1c8b51f4;
            handler = com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4896xfe573850.handler;
            runnable = com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4896xfe573850.clearTask;
            handler.removeCallbacks(runnable);
            accessibilityNodeInfo.setContentDescription(str);
            handler2 = com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4896xfe573850.handler;
            runnable2 = com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4896xfe573850.clearTask;
            handler2.postDelayed(runnable2, 500L);
            return java.lang.Boolean.TRUE;
        }
        return java.lang.Boolean.FALSE;
    }
}
