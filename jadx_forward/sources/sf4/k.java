package sf4;

/* loaded from: classes4.dex */
public final class k extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f489046e;

    /* renamed from: g, reason: collision with root package name */
    public int f489048g;

    /* renamed from: h, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.y2 f489049h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18493x6cdc7fd6 f489050i;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f489045d = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public int f489047f = -1;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18493x6cdc7fd6 c18493x6cdc7fd6) {
        this.f489050i = c18493x6cdc7fd6;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.y2 y2Var = new p012xc85e97e9.p103xe821e364.p104xd1075a44.y2();
        this.f489049h = y2Var;
        y2Var.e(0, 2);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f489045d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        sf4.k2 holder = (sf4.k2) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.util.ArrayList arrayList = this.f489045d;
        java.lang.Object obj = arrayList.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        pf4.x xVar = holder.f489055e;
        xVar.getClass();
        java.util.ArrayList arrayList2 = xVar.f435441f;
        arrayList2.clear();
        arrayList2.addAll((java.util.List) obj);
        xVar.f435442g = this.f489050i.isActive;
        xVar.m8146xced61ae5();
        java.lang.Object obj2 = arrayList.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18492x194e0ecc c18492x194e0ecc = holder.f489056f;
        c18492x194e0ecc.a((java.util.List) obj2);
        yz5.l lVar = this.f489046e;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Integer.valueOf(i17));
        }
        int i18 = i17 == this.f489047f ? this.f489048g : 0;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = holder.f489054d;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList3.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(c1163xf1deaba4, arrayList3.toArray(), "com/tencent/mm/plugin/story/ui/view/gallery/GalleryRecyclerView$VerticalAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/story/ui/view/gallery/VerticalViewHolder;I)V", "Undefined", "scrollToPosition", "(I)V");
        c1163xf1deaba4.a1(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/story/ui/view/gallery/GalleryRecyclerView$VerticalAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/story/ui/view/gallery/VerticalViewHolder;I)V", "Undefined", "scrollToPosition", "(I)V");
        c18492x194e0ecc.m71477xf579a34a(i18);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cwn, parent, false);
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
        layoutParams.width = parent.getWidth();
        layoutParams.height = parent.getHeight();
        inflate.setLayoutParams(layoutParams);
        sf4.k2 k2Var = new sf4.k2(inflate, parent.getWidth(), parent.getHeight());
        k2Var.f489054d.m7971xa810ec34(this.f489049h);
        return k2Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onViewAttachedToWindow */
    public void mo8160xd8bfd53(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        sf4.k2 holder = (sf4.k2) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.mo8160xd8bfd53(holder);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = holder.f489054d;
        if (c1163xf1deaba4.getChildCount() > 0) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 w07 = c1163xf1deaba4.w0(c1163xf1deaba4.getChildAt(0));
            if (w07 instanceof pf4.y) {
                ((pf4.y) w07).i();
            }
        }
    }
}
