package ut2;

/* loaded from: classes3.dex */
public final class x3 extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut2.a4 f512685d;

    public x3(ut2.a4 a4Var) {
        this.f512685d = a4Var;
        mo63036x52d2f021(i65.a.d(a4Var.f512352a.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560057a5), i65.a.d(a4Var.f512352a.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.ahd));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        bw5.q30 q30Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelEmptyHolder$setPresentDesc$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        st2.h1 h1Var = this.f512685d.f512353b;
        r45.dv1 dv1Var = ((mm2.f6) h1Var.f493868f.a(mm2.f6.class)).P;
        if (dv1Var != null && (q30Var = (bw5.q30) dv1Var.m75936x14adae67(41)) != null) {
            bw5.x7 x7Var = q30Var.f113453g[3] ? q30Var.f113452f : new bw5.x7();
            if (x7Var != null) {
                i95.m c17 = i95.n0.c(pq.q.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                android.content.Context context = h1Var.h().getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                pq.q.Lb((pq.q) c17, new pq.a(context), x7Var, null, 4, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelEmptyHolder$setPresentDesc$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }
}
