package com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "config", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "invoke", "(Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.mm.accessibility.core.provider.Provider$preFindRoot$1 */
/* loaded from: classes14.dex */
public final class C4923xc8fcf9b8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: $view */
    final /* synthetic */ android.view.View f21206x23288c9;

    /* renamed from: this$0 */
    final /* synthetic */ com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.AbstractC4922xc8fe6a11 f21207xcbdd23aa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4923xc8fcf9b8(com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.AbstractC4922xc8fe6a11 abstractC4922xc8fe6a11, android.view.View view) {
        super(1);
        this.f21207xcbdd23aa = abstractC4922xc8fe6a11;
        this.f21206x23288c9 = view;
    }

    @Override // yz5.l
    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final java.lang.Boolean mo146xb9724478(com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.AbstractViewTreeObserverOnGlobalLayoutListenerC4836x37397ddf config) {
        java.util.List list;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        list = this.f21207xcbdd23aa.mappers;
        android.view.View view = this.f21206x23288c9;
        java.util.ArrayList<java.util.List<java.lang.Integer>> arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.util.List list2 = (java.util.List) ((yz5.p) it.next()).mo149xb9724478(view, config);
            if (list2 != null) {
                arrayList.add(list2);
            }
        }
        android.view.View view2 = this.f21206x23288c9;
        while (true) {
            boolean z17 = false;
            for (java.util.List<java.lang.Integer> list3 : arrayList) {
                if (!z17) {
                    if (config.m42254x811f1304(view2, list3) != null) {
                        z17 = true;
                    }
                }
            }
            return java.lang.Boolean.valueOf(z17);
        }
    }
}
