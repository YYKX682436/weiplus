package xm2;

/* loaded from: classes14.dex */
public final class e extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f536737d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f536738e;

    /* renamed from: f, reason: collision with root package name */
    public final ym2.c f536739f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f536740g;

    public e(java.util.List flattenedItems, java.lang.Object obj, ym2.c adapter, yz5.l itemSelectionHandler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flattenedItems, "flattenedItems");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemSelectionHandler, "itemSelectionHandler");
        this.f536737d = flattenedItems;
        this.f536738e = obj;
        this.f536739f = adapter;
        this.f536740g = itemSelectionHandler;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f536737d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        if (this.f536737d.get(i17) != null) {
            xm2.d[] dVarArr = xm2.d.f536736d;
            return 0;
        }
        xm2.d[] dVarArr2 = xm2.d.f536736d;
        return 1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        lo0.b bVar;
        xm2.h holder = (xm2.h) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = this.f536737d.get(i17);
        if (obj == null) {
            return;
        }
        xm2.c cVar = holder instanceof xm2.c ? (xm2.c) holder : null;
        if (cVar == null) {
            return;
        }
        zm2.b bVar2 = (zm2.b) this.f536739f.a(obj);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cVar.f536735p, bVar2)) {
            zm2.b bVar3 = cVar.f536735p;
            if (bVar3 != null && (bVar = bVar3.f555694c) != null) {
                bVar.c(cVar);
            }
            cVar.f536735p = bVar2;
            if (!(bVar2 == null)) {
                int i18 = bVar2.f555693b;
                java.lang.Integer num = cVar.f536733n;
                if (num == null || num.intValue() != i18) {
                    cVar.f536733n = java.lang.Integer.valueOf(i18);
                    android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
                    gradientDrawable.setColor(i18);
                    android.view.View view = cVar.f536728f;
                    gradientDrawable.setCornerRadius(i65.a.b(view.getContext(), 12));
                    view.setBackground(gradientDrawable);
                }
                zl2.r4 r4Var = zl2.r4.f555483a;
                int i19 = cVar.f536734o;
                android.graphics.Bitmap u27 = r4Var.u2(bVar2.f555696e, i19, i19);
                boolean z17 = u27 != null;
                android.widget.ImageView imageView = cVar.f536729g;
                if (z17) {
                    imageView.setImageBitmap(u27);
                } else {
                    imageView.setImageURI(null);
                }
                cVar.f536730h.setText(bVar2.f555692a);
                cVar.i(bVar2);
                lo0.b bVar4 = bVar2.f555694c;
                if (bVar4 != null && bVar4.b()) {
                    android.view.View view2 = cVar.f536732m;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyFineTuningControlPanelWidget$ItemViewHolder", "setItem", "(Lcom/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/items/FinderLiveBeautyFineTuningControlPanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyFineTuningControlPanelWidget$ItemViewHolder", "setItem", "(Lcom/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/items/FinderLiveBeautyFineTuningControlPanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    bVar4.a(cVar);
                } else {
                    android.view.View view3 = cVar.f536732m;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyFineTuningControlPanelWidget$ItemViewHolder", "setItem", "(Lcom/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/items/FinderLiveBeautyFineTuningControlPanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyFineTuningControlPanelWidget$ItemViewHolder", "setItem", "(Lcom/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/items/FinderLiveBeautyFineTuningControlPanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        cVar.j(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, this.f536738e));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        xm2.d[] dVarArr = xm2.d.f536736d;
        if (i17 == 0) {
            android.content.Context context = parent.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            return new xm2.c(context, this.f536740g);
        }
        if (i17 == 1) {
            android.content.Context context2 = parent.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            return new xm2.g(context2);
        }
        throw new java.lang.IllegalArgumentException("Unsupported view type " + i17 + '.');
    }
}
