package com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/accessibility/core/provider/TextViewSpannedModifier;", "Lcom/tencent/mm/accessibility/core/provider/Provider;", "Landroid/view/View;", "view", "Landroid/text/style/ClickableSpan;", "getIfOnlyClickableSpan", "Landroid/view/accessibility/AccessibilityEvent;", "event", "Ljz5/f0;", "dealAccEvent", "", "getAuthority", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.accessibility.core.provider.TextViewSpannedModifier */
/* loaded from: classes14.dex */
public final class C4929x7340d208 extends com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.AbstractC4922xc8fe6a11 {

    /* renamed from: $stable */
    public static final int f21224x3b2de05f = 0;

    /* renamed from: INSTANCE */
    public static final com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4929x7340d208 f21225x4fbc8495 = new com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4929x7340d208();
    public static final java.lang.String TAG = "MicroMsg.Acc.TextViewSpannedModifier";

    private C4929x7340d208() {
    }

    /* renamed from: getIfOnlyClickableSpan */
    private final android.text.style.ClickableSpan m42676x931b62d(android.view.View view) {
        java.lang.CharSequence a17;
        boolean z17 = view instanceof com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc;
        if (!z17 && !(view instanceof android.widget.TextView)) {
            return null;
        }
        if (!(view instanceof android.widget.TextView)) {
            if (z17) {
                a17 = ((com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) view).a();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
            }
            return null;
        }
        a17 = ((android.widget.TextView) view).getText();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
        if (!(a17 instanceof android.text.Spanned)) {
            m42654xbe97959d(TAG, view, "TextViewSpannedModifier," + ((java.lang.Object) a17) + " type wrong:" + a17.getClass() + ' ');
            return null;
        }
        android.text.style.ClickableSpan[] clickableSpanArr = (android.text.style.ClickableSpan[]) ((android.text.Spanned) a17).getSpans(0, a17.length(), android.text.style.ClickableSpan.class);
        if (clickableSpanArr.length == 1 && clickableSpanArr[0] != null) {
            m42654xbe97959d(TAG, view, "TextViewSpannedModifier," + ((java.lang.Object) a17) + " success get Span");
            android.text.style.ClickableSpan clickableSpan = clickableSpanArr[0];
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(clickableSpan, "null cannot be cast to non-null type android.text.style.ClickableSpan");
            return clickableSpan;
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.AbstractC4922xc8fe6a11
    /* renamed from: dealAccEvent */
    public void mo42597x5e7a6725(android.view.View view, android.view.accessibility.AccessibilityEvent event) {
        android.text.style.ClickableSpan m42676x931b62d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (event.getEventType() == 1 && com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4966x1d004c03.f21354x4fbc8495.m42850xa56c1dd1() && (m42676x931b62d = m42676x931b62d(view)) != null) {
            m42676x931b62d.onClick(view);
        }
    }

    @Override // com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.AbstractC4922xc8fe6a11
    /* renamed from: getAuthority */
    public int mo9976x5761788d() {
        return 4;
    }
}
