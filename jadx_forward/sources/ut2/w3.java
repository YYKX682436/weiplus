package ut2;

/* loaded from: classes3.dex */
public final class w3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut2.a4 f512675d;

    public w3(ut2.a4 a4Var) {
        this.f512675d = a4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        jz5.f0 f0Var;
        java.lang.String str;
        r45.l11 l11Var;
        bw5.x7 x7Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelEmptyHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ut2.a4 a4Var = this.f512675d;
        st2.h1 h1Var = a4Var.f512353b;
        r45.dv1 dv1Var = ((mm2.f6) h1Var.f493868f.a(mm2.f6.class)).P;
        if (dv1Var == null || (l11Var = (r45.l11) dv1Var.m75936x14adae67(27)) == null || (x7Var = (bw5.x7) l11Var.m75936x14adae67(2)) == null) {
            f0Var = null;
        } else {
            i95.m c17 = i95.n0.c(pq.q.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            android.content.Context context = h1Var.h().getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pq.q.Lb((pq.q) c17, new pq.a(context), x7Var, null, 4, null);
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var != null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelEmptyHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        st2.h1 h1Var2 = a4Var.f512353b;
        h1Var2.getClass();
        dk2.ef efVar = dk2.ef.f314905a;
        mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
        if (e1Var != null) {
            r45.hx0 hx0Var = new r45.hx0();
            hx0Var.set(0, 110);
            az2.c cVar = az2.f.f97658d;
            android.view.ViewGroup viewGroup = h1Var2.f493866d;
            android.content.Context context2 = viewGroup.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            az2.f a17 = az2.c.a(cVar, context2, viewGroup.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), 500L, null, 8, null);
            a17.a();
            dk2.xf xfVar = h1Var2.f493869g;
            if (xfVar != null) {
                android.content.Context context3 = viewGroup.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context3;
                long m75942xfb822ef2 = e1Var.f410521r.m75942xfb822ef2(0);
                long j17 = e1Var.f410516m;
                mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
                if (c1Var == null || (str = c1Var.f410385o) == null) {
                    str = "";
                }
                ((dk2.r4) xfVar).a0(abstractActivityC21394xb3d2c0cf, m75942xfb822ef2, j17, str, hx0Var, new st2.f(a17, h1Var2));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelEmptyHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
