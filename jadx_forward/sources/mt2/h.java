package mt2;

/* loaded from: classes2.dex */
public final class h extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860 {
    public boolean A;

    /* renamed from: v, reason: collision with root package name */
    public final int f412817v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f412818w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f412819x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f412820y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.C14951x18cbc2ca f412821z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f412817v = m158359x1e885992().getIntExtra("request_type", 0);
        this.f412818w = jz5.h.b(new mt2.g(this));
        this.f412819x = jz5.h.b(new mt2.f(this));
        this.f412820y = jz5.h.b(new mt2.e(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860
    public void V6() {
        if (f7().size() <= 1 || this.A) {
            com.p314xaae8f345.mm.p2776x373aa5.C22785xca931918 h17 = c7().h();
            if (h17 != null) {
                h17.setVisibility(8);
            }
        } else {
            com.p314xaae8f345.mm.p2776x373aa5.C22785xca931918 h18 = c7().h();
            if (h18 != null) {
                h18.setVisibility(0);
            }
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22785xca931918 h19 = c7().h();
        boolean z17 = h19 != null && h19.getVisibility() == 0;
        jz5.g gVar = this.f412820y;
        jz5.g gVar2 = this.f412819x;
        if (z17) {
            ((android.widget.TextView) ((jz5.n) gVar2).mo141623x754a37bb()).setVisibility(8);
            android.view.View view = (android.view.View) ((jz5.n) gVar).mo141623x754a37bb();
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/component/FinderMixSearchTabUIC", "checkTabLayoutVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/search/component/FinderMixSearchTabUIC", "checkTabLayoutVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        ((android.widget.TextView) ((jz5.n) gVar2).mo141623x754a37bb()).setVisibility(0);
        android.view.View view2 = (android.view.View) ((jz5.n) gVar).mo141623x754a37bb();
        if (view2 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/component/FinderMixSearchTabUIC", "checkTabLayoutVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/search/component/FinderMixSearchTabUIC", "checkTabLayoutVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.InterfaceC15438xf4a73b57 W6() {
        return new mt2.a(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        super.mo450x3e5a77bb(bundle);
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = this.f215192h;
        if (c1190x18d3c3fe instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78) c1190x18d3c3fe).m62442xecae6946(true);
        }
        V6();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f412817v = m158359x1e885992().getIntExtra("request_type", 0);
        this.f412818w = jz5.h.b(new mt2.g(this));
        this.f412819x = jz5.h.b(new mt2.f(this));
        this.f412820y = jz5.h.b(new mt2.e(this));
    }
}
