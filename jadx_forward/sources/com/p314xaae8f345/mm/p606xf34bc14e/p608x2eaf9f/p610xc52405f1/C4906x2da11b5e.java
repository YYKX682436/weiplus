package com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "invoke", "(Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.mm.accessibility.core.provider.ContentDescProvider$findDescList$1 */
/* loaded from: classes14.dex */
public final class C4906x2da11b5e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: $outRootView */
    final /* synthetic */ android.view.View[] f21169x72a11571;

    /* renamed from: $res */
    final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f21170x1215fc;

    /* renamed from: $view */
    final /* synthetic */ android.view.View f21171x23288c9;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4906x2da11b5e(android.view.View view, android.view.View[] viewArr, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(1);
        this.f21171x23288c9 = view;
        this.f21169x72a11571 = viewArr;
        this.f21170x1215fc = h0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final java.lang.Boolean mo146xb9724478(com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.AbstractViewTreeObserverOnGlobalLayoutListenerC4836x37397ddf it) {
        android.view.View m42254x811f1304;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.util.Map<java.lang.Integer, java.lang.Object> map = it.m42280x880f8ff1().get(java.lang.Integer.valueOf(this.f21171x23288c9.getId()));
        if (map != null && (m42254x811f1304 = it.m42254x811f1304(this.f21171x23288c9, kz5.n0.S0(map.keySet()))) != null) {
            this.f21169x72a11571[0] = m42254x811f1304;
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f21170x1215fc;
            java.lang.Object obj = map.get(java.lang.Integer.valueOf(m42254x811f1304.getId()));
            if (obj == null) {
                obj = map.get(com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4905x2808aa9b.f21166x4fbc8495.m42653x2ee31f5b(m42254x811f1304));
            }
            h0Var.f391656d = obj;
            com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4905x2808aa9b c4905x2808aa9b = com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4905x2808aa9b.f21166x4fbc8495;
            com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4905x2808aa9b.curConfigName = it.getClass().getName();
            return java.lang.Boolean.TRUE;
        }
        return java.lang.Boolean.FALSE;
    }
}
