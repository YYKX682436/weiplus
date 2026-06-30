package xm2;

/* loaded from: classes14.dex */
public final class p extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f536777d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f536778e;

    /* renamed from: f, reason: collision with root package name */
    public final ym2.c f536779f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f536780g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.l f536781h;

    public p(java.util.List items, java.lang.Object obj, ym2.c adapter, yz5.l itemSelectionHandler, yz5.l itemFineTuningHandler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemSelectionHandler, "itemSelectionHandler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemFineTuningHandler, "itemFineTuningHandler");
        this.f536777d = items;
        this.f536778e = obj;
        this.f536779f = adapter;
        this.f536780g = itemSelectionHandler;
        this.f536781h = itemFineTuningHandler;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f536777d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        lo0.f fVar;
        lo0.b bVar;
        xm2.o holder = (xm2.o) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = this.f536777d.get(i17);
        zm2.c cVar = (zm2.c) this.f536779f.a(obj);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(holder.f536776q, cVar)) {
            zm2.c cVar2 = holder.f536776q;
            if (cVar2 != null && (bVar = cVar2.f555694c) != null) {
                bVar.c(holder);
            }
            zm2.c cVar3 = holder.f536776q;
            if (cVar3 != null && (fVar = cVar3.f555703f) != null) {
                kz5.h0.B(fVar.f401522e, new lo0.e(holder));
            }
            holder.f536776q = cVar;
            if (!(cVar == null)) {
                int i18 = cVar.f555693b;
                java.lang.Integer num = holder.f536775p;
                if (num == null || num.intValue() != i18) {
                    holder.f536775p = java.lang.Integer.valueOf(i18);
                    android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
                    gradientDrawable.setColor(i18);
                    android.view.View view = holder.f536769g;
                    gradientDrawable.setCornerRadius(i65.a.b(view.getContext(), 12));
                    view.setBackground(gradientDrawable);
                }
                holder.f536770h.setText(cVar.f555692a);
                lo0.b bVar2 = cVar.f555694c;
                if (bVar2 != null && bVar2.b()) {
                    android.view.View view2 = holder.f536773n;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyPresetControlPanelWidget$ItemViewHolder", "setItem", "(Lcom/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/items/FinderLiveBeautyPresetControlPanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyPresetControlPanelWidget$ItemViewHolder", "setItem", "(Lcom/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/items/FinderLiveBeautyPresetControlPanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    bVar2.a(holder);
                } else {
                    android.view.View view3 = holder.f536773n;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyPresetControlPanelWidget$ItemViewHolder", "setItem", "(Lcom/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/items/FinderLiveBeautyPresetControlPanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyPresetControlPanelWidget$ItemViewHolder", "setItem", "(Lcom/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/items/FinderLiveBeautyPresetControlPanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                lo0.f fVar2 = cVar.f555703f;
                if (fVar2.a()) {
                    android.view.View view4 = holder.f536774o;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(0);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyPresetControlPanelWidget$ItemViewHolder", "setItem", "(Lcom/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/items/FinderLiveBeautyPresetControlPanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyPresetControlPanelWidget$ItemViewHolder", "setItem", "(Lcom/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/items/FinderLiveBeautyPresetControlPanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    ((java.util.ArrayList) fVar2.f401522e).add(new java.lang.ref.WeakReference(holder));
                } else {
                    android.view.View view5 = holder.f536774o;
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyPresetControlPanelWidget$ItemViewHolder", "setItem", "(Lcom/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/items/FinderLiveBeautyPresetControlPanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view5, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyPresetControlPanelWidget$ItemViewHolder", "setItem", "(Lcom/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/items/FinderLiveBeautyPresetControlPanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        holder.i(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, this.f536778e));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.content.Context context = parent.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return new xm2.o(context, this.f536780g, this.f536781h);
    }
}
