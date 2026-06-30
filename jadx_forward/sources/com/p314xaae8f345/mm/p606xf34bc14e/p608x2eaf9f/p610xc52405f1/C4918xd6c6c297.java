package com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "invoke", "(Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.mm.accessibility.core.provider.OrderProvider$dealOnViewInflateAsync$1 */
/* loaded from: classes14.dex */
public final class C4918xd6c6c297 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: $view */
    final /* synthetic */ android.view.View f21194x23288c9;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4918xd6c6c297(android.view.View view) {
        super(1);
        this.f21194x23288c9 = view;
    }

    @Override // yz5.l
    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final java.lang.Boolean mo146xb9724478(com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.AbstractViewTreeObserverOnGlobalLayoutListenerC4836x37397ddf it) {
        boolean z17;
        int[] iArr;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        int[] iArr2 = it.m42264xf4d73fc8().get(java.lang.Integer.valueOf(this.f21194x23288c9.getId()));
        boolean z18 = true;
        if (iArr2 != null) {
            android.view.View view = this.f21194x23288c9;
            view.setAccessibilityTraversalBefore(iArr2[0]);
            view.setAccessibilityTraversalAfter(iArr2[1]);
            com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4917x6151f33f c4917x6151f33f = com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4917x6151f33f.f21193x4fbc8495;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("success set globalTraversal, before:");
            com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4968x823b57dd c4968x823b57dd = com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4968x823b57dd.f21368x4fbc8495;
            sb6.append(c4968x823b57dd.m42859xfb82e301(iArr2[0]));
            sb6.append(" after:");
            sb6.append(c4968x823b57dd.m42859xfb82e301(iArr2[1]));
            c4917x6151f33f.m42654xbe97959d(com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4917x6151f33f.TAG, view, sb6.toString());
            z17 = true;
        } else {
            z17 = false;
        }
        java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, int[]>> m42267xc295be2c = it.m42267xc295be2c();
        com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4917x6151f33f c4917x6151f33f2 = com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4917x6151f33f.f21193x4fbc8495;
        java.util.Map<java.lang.Integer, int[]> map = m42267xc295be2c.get(c4917x6151f33f2.m42653x2ee31f5b(this.f21194x23288c9));
        if (map == null || (iArr = map.get(java.lang.Integer.valueOf(this.f21194x23288c9.getId()))) == null) {
            z18 = z17;
        } else {
            android.view.View view2 = this.f21194x23288c9;
            view2.setAccessibilityTraversalBefore(iArr[0]);
            view2.setAccessibilityTraversalAfter(iArr[1]);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("success set localTraversal, before:");
            com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4968x823b57dd c4968x823b57dd2 = com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4968x823b57dd.f21368x4fbc8495;
            sb7.append(c4968x823b57dd2.m42859xfb82e301(iArr[0]));
            sb7.append(" after:");
            sb7.append(c4968x823b57dd2.m42859xfb82e301(iArr[1]));
            c4917x6151f33f2.m42654xbe97959d(com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4917x6151f33f.TAG, view2, sb7.toString());
        }
        return java.lang.Boolean.valueOf(z18);
    }
}
