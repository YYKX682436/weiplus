package xv0;

/* loaded from: classes5.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xv0.g f538912d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xv0.a f538913e;

    public d(xv0.g gVar, xv0.a aVar) {
        this.f538912d = gVar;
        this.f538913e = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/subpanels/color/ColorAdjPanel$setupViews$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xv0.g gVar = this.f538912d;
        xv0.a aVar = gVar.T;
        xv0.a aVar2 = this.f538913e;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar, aVar2)) {
            android.view.ViewGroup viewGroup = gVar.M;
            if (viewGroup == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("seekbarContainer");
                throw null;
            }
            viewGroup.setVisibility(0);
            android.view.ViewGroup viewGroup2 = gVar.M;
            if (viewGroup2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("seekbarContainer");
                throw null;
            }
            viewGroup2.setEnabled(true);
            xv0.a aVar3 = gVar.T;
            if (aVar3 != null) {
                aVar3.f538904b.setSelected(false);
            }
            aVar2.f538904b.setSelected(true);
            gVar.T = aVar2;
            gVar.L(aVar2.f538906d);
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10956x6271c3cc c10956x6271c3cc = gVar.N;
            if (c10956x6271c3cc == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("seekbar");
                throw null;
            }
            c10956x6271c3cc.m47185x3ae760af(aVar2.f538906d);
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10956x6271c3cc c10956x6271c3cc2 = gVar.N;
            if (c10956x6271c3cc2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("seekbar");
                throw null;
            }
            c10956x6271c3cc2.m47179xb2e597().clear();
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10956x6271c3cc c10956x6271c3cc3 = gVar.N;
            if (c10956x6271c3cc3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("seekbar");
                throw null;
            }
            c10956x6271c3cc3.m47179xb2e597().add(new xv0.c(aVar2, gVar));
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/subpanels/color/ColorAdjPanel$setupViews$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
