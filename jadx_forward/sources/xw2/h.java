package xw2;

/* loaded from: classes2.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xw2.s f539225d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f539226e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f539227f;

    public h(xw2.s sVar, int i17, int i18) {
        this.f539225d = sVar;
        this.f539226e = i17;
        this.f539227f = i18;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/base/PagerRowView$PageAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xw2.s sVar = this.f539225d;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h00) sVar.m176119xa0ab20ce()).getClass();
        java.util.List list = (java.util.List) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bh.f215413d).mo144003x754a37bb();
        int i17 = this.f539226e;
        int i18 = this.f539227f;
        java.lang.Object b17 = xw2.s.b(sVar, list, i17, i18);
        if (b17 == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/view/base/PagerRowView$PageAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        xw2.u m176119xa0ab20ce = sVar.m176119xa0ab20ce();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h00 h00Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h00) m176119xa0ab20ce;
        h00Var.getClass();
        h00Var.T6(view, (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.lz) b17, i17, i18);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/base/PagerRowView$PageAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
