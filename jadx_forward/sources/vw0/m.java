package vw0;

/* loaded from: classes5.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p900x854b442e.C10952x561633cd f522337d;

    public m(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p900x854b442e.C10952x561633cd c10952x561633cd) {
        this.f522337d = c10952x561633cd;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 m47169x323f418d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/SetContentDescView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p900x854b442e.C10952x561633cd c10952x561633cd = this.f522337d;
        m47169x323f418d = c10952x561633cd.m47169x323f418d();
        if (m47169x323f418d == null) {
            yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/SetContentDescView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        rw0.b bVar = c10952x561633cd.f150865d;
        if (bVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            bVar.C0(view, m47169x323f418d);
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/SetContentDescView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
