package ju0;

/* loaded from: classes5.dex */
public final class b extends eb5.d {

    /* renamed from: g, reason: collision with root package name */
    public int f383213g;

    @Override // eb5.d
    public android.view.View B(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.content.Context context = parent.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return new com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p883x90995feb.p884x373aa5.C10928xc73f1ab3(context);
    }

    @Override // eb5.d
    /* renamed from: y */
    public void mo864xe5e2e48d(eb5.e viewWrapper, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewWrapper, "viewWrapper");
        super.mo864xe5e2e48d(viewWrapper, i17);
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p883x90995feb.p884x373aa5.C10928xc73f1ab3 c10928xc73f1ab3 = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p883x90995feb.p884x373aa5.C10928xc73f1ab3) viewWrapper.f332457n;
        zu0.a aVar = ((ku0.a) x(i17)).f393593a;
        if (aVar.f557194a.m33754xb600079() == qg.a.Unknown) {
            c10928xc73f1ab3.getPlusView().setVisibility(0);
            c10928xc73f1ab3.getImageView().setImageDrawable(null);
            c10928xc73f1ab3.getImageView().setBackgroundColor(b3.l.m9702x7444d5ad(c10928xc73f1ab3.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560047w));
            android.view.View selectedView = c10928xc73f1ab3.getSelectedView();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(selectedView, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/image_composing/adapter/ImageListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/ui/base/adapter/ViewWrapper;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            selectedView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(selectedView, "com/tencent/mm/mj_publisher/finder/image_composing/adapter/ImageListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/ui/base/adapter/ViewWrapper;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        c10928xc73f1ab3.getPlusView().setVisibility(8);
        c10928xc73f1ab3.getImageView().setBackgroundColor(b3.l.m9702x7444d5ad(c10928xc73f1ab3.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        java.lang.String m33753x8dc9649f = aVar.f557194a.m33753x8dc9649f();
        i95.m c17 = i95.n0.c(zy2.b6.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ya2.l.f542035a.h(m33753x8dc9649f, c10928xc73f1ab3.getImageView(), mn2.f1.B);
        android.view.View selectedView2 = c10928xc73f1ab3.getSelectedView();
        int i18 = i17 == this.f383213g ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(selectedView2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/image_composing/adapter/ImageListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/ui/base/adapter/ViewWrapper;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        selectedView2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(selectedView2, "com/tencent/mm/mj_publisher/finder/image_composing/adapter/ImageListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/ui/base/adapter/ViewWrapper;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // eb5.d, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: z */
    public void mo8157xe5e2e48d(eb5.e holder, int i17, java.util.List payloads) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        if (payloads.isEmpty()) {
            mo864xe5e2e48d(holder, i17);
        }
    }
}
