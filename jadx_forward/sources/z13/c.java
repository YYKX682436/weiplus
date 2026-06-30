package z13;

/* loaded from: classes12.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f550926d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f550927e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.Boolean bool, java.lang.Boolean bool2) {
        super(1);
        this.f550926d = bool;
        this.f550927e = bool2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View view;
        android.view.View view2;
        android.view.View view3;
        e23.b1 newDataItem = (e23.b1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newDataItem, "newDataItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSAISearchManagerUIC", "[aisearch] dataItem created, adjusting header visibility");
        boolean booleanValue = this.f550926d.booleanValue();
        int i17 = com.p314xaae8f345.mm.R.id.t4c;
        if (booleanValue) {
            android.view.View view4 = null;
            if (this.f550927e.booleanValue()) {
                em.m0 m0Var = newDataItem.o().f328499a;
                if (m0Var != null && (view3 = m0Var.f336122a) != null) {
                    view4 = view3.findViewById(com.p314xaae8f345.mm.R.id.f568138uy4);
                }
                if (view4 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    android.view.View view5 = view4;
                    yj0.a.d(view5, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/item/FTSRelevantSearchDataItem", "hideRelevantSearchHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view5, "com/tencent/mm/plugin/fts/ui/item/FTSRelevantSearchDataItem", "hideRelevantSearchHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View view6 = newDataItem.f328321v;
                if (view6 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view6, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/item/FTSRelevantSearchDataItem", "hideRelevantSearchHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view6.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view6, "com/tencent/mm/plugin/fts/ui/item/FTSRelevantSearchDataItem", "hideRelevantSearchHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                em.m0 m0Var2 = newDataItem.o().f328499a;
                if (m0Var2 != null && (view2 = m0Var2.f336122a) != null) {
                    view4 = view2.findViewById(com.p314xaae8f345.mm.R.id.t4c);
                }
                if (view4 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    android.view.View view7 = view4;
                    yj0.a.d(view7, arrayList3.toArray(), "com/tencent/mm/plugin/fts/ui/item/FTSRelevantSearchDataItem", "hideDivideView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view7, "com/tencent/mm/plugin/fts/ui/item/FTSRelevantSearchDataItem", "hideDivideView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        } else {
            em.m0 m0Var3 = newDataItem.o().f328499a;
            if (m0Var3 != null && (view = m0Var3.f336122a) != null) {
                android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.f568138uy4);
                if (findViewById != null) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                    arrayList4.add(0);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/plugin/fts/ui/item/FTSRelevantSearchDataItem", "showRelevantSearchHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/fts/ui/item/FTSRelevantSearchDataItem", "showRelevantSearchHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    i17 = com.p314xaae8f345.mm.R.id.t4c;
                }
                android.view.View findViewById2 = view.findViewById(i17);
                if (findViewById2 != null) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                    arrayList5.add(0);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(findViewById2, arrayList5.toArray(), "com/tencent/mm/plugin/fts/ui/item/FTSRelevantSearchDataItem", "showRelevantSearchHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/fts/ui/item/FTSRelevantSearchDataItem", "showRelevantSearchHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            android.view.View view8 = newDataItem.f328321v;
            if (view8 != null) {
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
                arrayList6.add(8);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view8, arrayList6.toArray(), "com/tencent/mm/plugin/fts/ui/item/FTSRelevantSearchDataItem", "showRelevantSearchHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view8, "com/tencent/mm/plugin/fts/ui/item/FTSRelevantSearchDataItem", "showRelevantSearchHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return jz5.f0.f384359a;
    }
}
