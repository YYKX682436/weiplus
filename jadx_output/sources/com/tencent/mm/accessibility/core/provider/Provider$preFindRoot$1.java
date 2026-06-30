package com.tencent.mm.accessibility.core.provider;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "config", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "invoke", "(Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class Provider$preFindRoot$1 extends kotlin.jvm.internal.q implements yz5.l {
    final /* synthetic */ android.view.View $view;
    final /* synthetic */ com.tencent.mm.accessibility.core.provider.Provider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Provider$preFindRoot$1(com.tencent.mm.accessibility.core.provider.Provider provider, android.view.View view) {
        super(1);
        this.this$0 = provider;
        this.$view = view;
    }

    @Override // yz5.l
    public final java.lang.Boolean invoke(com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig config) {
        java.util.List list;
        kotlin.jvm.internal.o.g(config, "config");
        list = this.this$0.mappers;
        android.view.View view = this.$view;
        java.util.ArrayList<java.util.List<java.lang.Integer>> arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.util.List list2 = (java.util.List) ((yz5.p) it.next()).invoke(view, config);
            if (list2 != null) {
                arrayList.add(list2);
            }
        }
        android.view.View view2 = this.$view;
        while (true) {
            boolean z17 = false;
            for (java.util.List<java.lang.Integer> list3 : arrayList) {
                if (!z17) {
                    if (config.findRoot$plugin_autoaccessibility_release(view2, list3) != null) {
                        z17 = true;
                    }
                }
            }
            return java.lang.Boolean.valueOf(z17);
        }
    }
}
