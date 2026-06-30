package vw0;

/* loaded from: classes5.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p900x854b442e.C10951xedb68d8b f522306d;

    public f(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p900x854b442e.C10951xedb68d8b c10951xedb68d8b) {
        this.f522306d = c10951xedb68d8b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p900x854b442e.C10951xedb68d8b.f150852s;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p900x854b442e.C10951xedb68d8b c10951xedb68d8b = this.f522306d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0(c10951xedb68d8b.getContext());
        i0Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.m_d);
        i0Var.f(com.p314xaae8f345.mm.R.C30867xcad56011.m_c);
        int color = j65.q.a(c10951xedb68d8b.getContext()).getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.acu, null);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = i0Var.f293354b;
        aVar.W = color;
        aVar.E = new vw0.i(c10951xedb68d8b);
        i0Var.e(com.p314xaae8f345.mm.R.C30867xcad56011.apj);
        i0Var.h();
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
