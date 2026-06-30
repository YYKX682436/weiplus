package com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "invoke", "(Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.mm.accessibility.core.provider.SeekbarCaller$dealOnAction$1 */
/* loaded from: classes14.dex */
public final class C4925x9b8f7c4c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: $host */
    final /* synthetic */ android.view.View f21210x22c43cc;

    /* renamed from: $pair */
    final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f21211x22fb0fe;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4925x9b8f7c4c(android.view.View view, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(1);
        this.f21210x22c43cc = view;
        this.f21211x22fb0fe = h0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final java.lang.Boolean mo146xb9724478(com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.AbstractViewTreeObserverOnGlobalLayoutListenerC4836x37397ddf it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.util.Map<java.lang.Integer, jz5.l> map = it.m42282x3f16f305().get(java.lang.Integer.valueOf(this.f21210x22c43cc.getId()));
        if (map == null) {
            return java.lang.Boolean.FALSE;
        }
        android.view.View m42254x811f1304 = it.m42254x811f1304(this.f21210x22c43cc, kz5.n0.S0(map.keySet()));
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f21211x22fb0fe;
        jz5.l lVar = map.get(m42254x811f1304 != null ? java.lang.Integer.valueOf(m42254x811f1304.getId()) : null);
        if (lVar == null && (lVar = map.get(com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4924x5b675de6.f21209x4fbc8495.m42653x2ee31f5b(this.f21210x22c43cc))) == null) {
            return java.lang.Boolean.FALSE;
        }
        h0Var.f391656d = lVar;
        return java.lang.Boolean.TRUE;
    }
}
