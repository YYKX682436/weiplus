package com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "invoke", "(Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.mm.accessibility.core.provider.ClickConductionProvider$dealAccEvent$1 */
/* loaded from: classes14.dex */
public final class C4903x5e4b6c19 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: $view */
    final /* synthetic */ android.view.View f21163x23288c9;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4903x5e4b6c19(android.view.View view) {
        super(1);
        this.f21163x23288c9 = view;
    }

    @Override // yz5.l
    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final java.lang.Boolean mo146xb9724478(com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.AbstractViewTreeObserverOnGlobalLayoutListenerC4836x37397ddf it) {
        android.view.View m42254x811f1304;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.util.Map<java.lang.Integer, jz5.l> map = it.m42258xc5784d2d().get(java.lang.Integer.valueOf(this.f21163x23288c9.getId()));
        if (map != null && (m42254x811f1304 = it.m42254x811f1304(this.f21163x23288c9, kz5.n0.S0(map.keySet()))) != null) {
            jz5.l lVar = map.get(java.lang.Integer.valueOf(m42254x811f1304.getId()));
            if (lVar == null && (lVar = map.get(com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4902xc1baa5dd.f21162x4fbc8495.m42653x2ee31f5b(m42254x811f1304))) == null) {
                return java.lang.Boolean.FALSE;
            }
            com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4902xc1baa5dd.f21162x4fbc8495.m42654xbe97959d(com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4902xc1baa5dd.TAG, this.f21163x23288c9, "success Found data, perform Click");
            if (((java.lang.Boolean) ((yz5.l) lVar.f384367e).mo146xb9724478(this.f21163x23288c9)).booleanValue()) {
                android.view.View findViewById = m42254x811f1304.findViewById(((java.lang.Number) lVar.f384366d).intValue());
                if (findViewById == null) {
                    return java.lang.Boolean.FALSE;
                }
                findViewById.performClick();
            }
            return java.lang.Boolean.TRUE;
        }
        return java.lang.Boolean.FALSE;
    }
}
