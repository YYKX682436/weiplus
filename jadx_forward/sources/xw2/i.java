package xw2;

/* loaded from: classes2.dex */
public final class i implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xw2.s f539228d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f539229e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f539230f;

    public i(xw2.s sVar, int i17, int i18) {
        this.f539228d = sVar;
        this.f539229e = i17;
        this.f539230f = i18;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/base/PagerRowView$PageAdapter$onBindViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        xw2.s sVar = this.f539228d;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h00) sVar.m176119xa0ab20ce()).getClass();
        java.util.List list = (java.util.List) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bh.f215413d).mo144003x754a37bb();
        int i17 = this.f539229e;
        int i18 = this.f539230f;
        java.lang.Object b17 = xw2.s.b(sVar, list, i17, i18);
        if (b17 == null) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/finder/view/base/PagerRowView$PageAdapter$onBindViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        xw2.u m176119xa0ab20ce = sVar.m176119xa0ab20ce();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h00 h00Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h00) m176119xa0ab20ce;
        h00Var.getClass();
        h00Var.U6(view, (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.lz) b17, i17, i18);
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/view/base/PagerRowView$PageAdapter$onBindViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
