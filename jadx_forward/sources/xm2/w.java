package xm2;

/* loaded from: classes14.dex */
public final class w extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f536805d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f536806e;

    /* renamed from: f, reason: collision with root package name */
    public final ym2.c f536807f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f536808g;

    public w(java.util.List items, java.lang.Object obj, ym2.c adapter, yz5.l itemSelectionHandler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemSelectionHandler, "itemSelectionHandler");
        this.f536805d = items;
        this.f536806e = obj;
        this.f536807f = adapter;
        this.f536808g = itemSelectionHandler;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f536805d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        lo0.b bVar;
        xm2.v holder = (xm2.v) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = this.f536805d.get(i17);
        zm2.d dVar = (zm2.d) this.f536807f.a(obj);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(holder.f536804m, dVar)) {
            zm2.d dVar2 = holder.f536804m;
            if (dVar2 != null && (bVar = dVar2.f555694c) != null) {
                bVar.c(holder);
            }
            holder.f536804m = dVar;
            if (!(dVar == null)) {
                int i18 = dVar.f555693b;
                java.lang.Integer num = holder.f536803i;
                if (num == null || num.intValue() != i18) {
                    holder.f536803i = java.lang.Integer.valueOf(i18);
                    android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
                    gradientDrawable.setColor(i18);
                    android.view.View view = holder.f536800f;
                    gradientDrawable.setCornerRadius(i65.a.b(view.getContext(), 12));
                    view.setBackground(gradientDrawable);
                }
                holder.f536801g.setText(dVar.f555692a);
                lo0.b bVar2 = dVar.f555694c;
                if (bVar2 != null && bVar2.b()) {
                    android.view.View view2 = holder.f536802h;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautySingleLevelControlPanelWidget$ItemViewHolder", "setItem", "(Lcom/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/items/FinderLiveBeautySingleLevelControlPanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautySingleLevelControlPanelWidget$ItemViewHolder", "setItem", "(Lcom/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/items/FinderLiveBeautySingleLevelControlPanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    bVar2.a(holder);
                } else {
                    android.view.View view3 = holder.f536802h;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautySingleLevelControlPanelWidget$ItemViewHolder", "setItem", "(Lcom/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/items/FinderLiveBeautySingleLevelControlPanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautySingleLevelControlPanelWidget$ItemViewHolder", "setItem", "(Lcom/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/items/FinderLiveBeautySingleLevelControlPanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        holder.i(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, this.f536806e));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.content.Context context = parent.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return new xm2.v(context, this.f536808g);
    }
}
