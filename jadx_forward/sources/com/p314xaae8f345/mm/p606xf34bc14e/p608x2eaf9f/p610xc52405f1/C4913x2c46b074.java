package com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "config", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "invoke", "(Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.mm.accessibility.core.provider.DisableFocusModifier$needDisFocus$needDisFocus$1 */
/* loaded from: classes14.dex */
public final class C4913x2c46b074 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: $view */
    final /* synthetic */ android.view.View f21187x23288c9;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4913x2c46b074(android.view.View view) {
        super(1);
        this.f21187x23288c9 = view;
    }

    @Override // yz5.l
    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final java.lang.Boolean mo146xb9724478(com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.AbstractViewTreeObserverOnGlobalLayoutListenerC4836x37397ddf config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        java.util.List<java.lang.Integer> list = config.m42261xf51b884a().get(java.lang.Integer.valueOf(this.f21187x23288c9.getId()));
        if (list == null) {
            return java.lang.Boolean.FALSE;
        }
        return java.lang.Boolean.valueOf(config.m42254x811f1304(this.f21187x23288c9, list) != null);
    }
}
