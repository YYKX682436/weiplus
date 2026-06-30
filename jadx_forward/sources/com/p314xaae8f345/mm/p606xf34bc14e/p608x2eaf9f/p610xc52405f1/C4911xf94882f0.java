package com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "invoke", "(Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.mm.accessibility.core.provider.DisableChildModifier$needDisFocusChild$1 */
/* loaded from: classes14.dex */
public final class C4911xf94882f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: $callback */
    final /* synthetic */ yz5.l f21182xcf5bbc69;

    /* renamed from: $view */
    final /* synthetic */ android.view.View f21183x23288c9;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4911xf94882f0(android.view.View view, yz5.l lVar) {
        super(1);
        this.f21183x23288c9 = view;
        this.f21182xcf5bbc69 = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final java.lang.Boolean mo146xb9724478(com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.AbstractViewTreeObserverOnGlobalLayoutListenerC4836x37397ddf it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.util.List<java.lang.Integer> list = it.m42262x71ee3074().get(java.lang.Integer.valueOf(this.f21183x23288c9.getId()));
        if (list == null) {
            return java.lang.Boolean.FALSE;
        }
        com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4909x95d1ba2b.f21178x4fbc8495.m42654xbe97959d(com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4909x95d1ba2b.TAG, this.f21183x23288c9, "find rootIds, prepare findRoot");
        if (it.m42254x811f1304(this.f21183x23288c9, list) != null) {
            this.f21182xcf5bbc69.mo146xb9724478(this.f21183x23288c9);
        }
        return java.lang.Boolean.TRUE;
    }
}
