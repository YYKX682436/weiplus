package qv0;

/* loaded from: classes5.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qv0.f f448458d;

    public d(qv0.f fVar) {
        this.f448458d = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/toolbar/BaseNormalToolbarPanel$initToolbarListener$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        qv0.f fVar = this.f448458d;
        if (fVar.F(view)) {
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q.a(fVar, false, true, 1, null);
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/toolbar/BaseNormalToolbarPanel$initToolbarListener$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
