package com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Ljz5/f0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig$getStartView$1 */
/* loaded from: classes14.dex */
public final class C4840x1900e923 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: $hasFound */
    final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f20913xe0a2412c;

    /* renamed from: $target */
    final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f20914x3bdec6b5;

    /* renamed from: this$0 */
    final /* synthetic */ com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.AbstractViewTreeObserverOnGlobalLayoutListenerC4836x37397ddf f20915xcbdd23aa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4840x1900e923(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.AbstractViewTreeObserverOnGlobalLayoutListenerC4836x37397ddf abstractViewTreeObserverOnGlobalLayoutListenerC4836x37397ddf, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(1);
        this.f20913xe0a2412c = c0Var;
        this.f20915xcbdd23aa = abstractViewTreeObserverOnGlobalLayoutListenerC4836x37397ddf;
        this.f20914x3bdec6b5 = h0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ java.lang.Object mo146xb9724478(java.lang.Object obj) {
        m42306xb9724478((android.view.View) obj);
        return jz5.f0.f384359a;
    }

    /* renamed from: invoke */
    public final void m42306xb9724478(android.view.View it) {
        java.lang.Integer m42233x2ee31f5b;
        java.lang.Integer m42233x2ee31f5b2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (this.f20913xe0a2412c.f391645d) {
            return;
        }
        java.util.List<java.lang.Integer> list = this.f20915xcbdd23aa.m42273xcf0dea96().get(java.lang.Integer.valueOf(it.getId()));
        if (list != null) {
            com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.AbstractViewTreeObserverOnGlobalLayoutListenerC4836x37397ddf abstractViewTreeObserverOnGlobalLayoutListenerC4836x37397ddf = this.f20915xcbdd23aa;
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f20914x3bdec6b5;
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f20913xe0a2412c;
            java.util.Iterator<T> it6 = list.iterator();
            if (it6.hasNext()) {
                int intValue = ((java.lang.Number) it6.next()).intValue();
                m42233x2ee31f5b2 = abstractViewTreeObserverOnGlobalLayoutListenerC4836x37397ddf.m42233x2ee31f5b(it);
                if (m42233x2ee31f5b2 != null && m42233x2ee31f5b2.intValue() == intValue) {
                    h0Var.f391656d = it;
                    c0Var.f391645d = true;
                    return;
                }
                return;
            }
        }
        int id6 = it.getId();
        java.lang.Integer startViewId = this.f20915xcbdd23aa.getStartViewId();
        if (startViewId != null && id6 == startViewId.intValue()) {
            m42233x2ee31f5b = this.f20915xcbdd23aa.m42233x2ee31f5b(it);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m42233x2ee31f5b, this.f20915xcbdd23aa.getStartViewLayoutId())) {
                this.f20914x3bdec6b5.f391656d = it;
                this.f20913xe0a2412c.f391645d = true;
            }
        }
    }
}
