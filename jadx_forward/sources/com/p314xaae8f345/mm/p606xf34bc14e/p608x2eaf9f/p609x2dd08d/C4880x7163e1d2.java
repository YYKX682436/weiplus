package com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "invoke", "(Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.mm.accessibility.core.area.AreaProvider$findConfigRect$1 */
/* loaded from: classes14.dex */
public final class C4880x7163e1d2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: $res */
    final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f21092x1215fc;

    /* renamed from: $view */
    final /* synthetic */ android.view.View f21093x23288c9;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4880x7163e1d2(android.view.View view, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(1);
        this.f21093x23288c9 = view;
        this.f21092x1215fc = h0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final java.lang.Boolean mo146xb9724478(com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.AbstractViewTreeObserverOnGlobalLayoutListenerC4836x37397ddf it) {
        android.view.View m42254x811f1304;
        int m42524x5db1bfe;
        int m42524x5db1bfe2;
        int m42524x5db1bfe3;
        int m42524x5db1bfe4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.util.Map<java.lang.Integer, int[]> map = it.m42277x3dee13ed().get(java.lang.Integer.valueOf(this.f21093x23288c9.getId()));
        if (map != null && (m42254x811f1304 = it.m42254x811f1304(this.f21093x23288c9, kz5.n0.S0(map.keySet()))) != null) {
            int[] iArr = map.get(java.lang.Integer.valueOf(m42254x811f1304.getId()));
            if (iArr == null && (iArr = map.get(com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4879x99d8b1be.f21091x4fbc8495.m42653x2ee31f5b(m42254x811f1304))) == null) {
                return java.lang.Boolean.FALSE;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f21092x1215fc;
            java.lang.Object clone = iArr.clone();
            int[] iArr2 = (int[]) clone;
            com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4879x99d8b1be c4879x99d8b1be = com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4879x99d8b1be.f21091x4fbc8495;
            m42524x5db1bfe = c4879x99d8b1be.m42524x5db1bfe(iArr2[0]);
            iArr2[0] = m42524x5db1bfe;
            m42524x5db1bfe2 = c4879x99d8b1be.m42524x5db1bfe(iArr2[1]);
            iArr2[1] = m42524x5db1bfe2;
            m42524x5db1bfe3 = c4879x99d8b1be.m42524x5db1bfe(iArr2[2]);
            iArr2[2] = m42524x5db1bfe3;
            m42524x5db1bfe4 = c4879x99d8b1be.m42524x5db1bfe(iArr2[3]);
            iArr2[3] = m42524x5db1bfe4;
            h0Var.f391656d = clone;
            return java.lang.Boolean.TRUE;
        }
        return java.lang.Boolean.FALSE;
    }
}
