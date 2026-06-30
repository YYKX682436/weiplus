package na2;

/* loaded from: classes2.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ na2.k f417497d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f417498e;

    public j(na2.k kVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f417497d = kVar;
        this.f417498e = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/postplay/uic/FinderPostPlayHeaderUIC$initViews$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("toggleFavorite: currentFavStatus=");
        na2.k kVar = this.f417497d;
        sb6.append(kVar.f417503n);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostPlayNewHeaderUIC", sb6.toString());
        int i17 = kVar.f417503n;
        if (i17 == 1) {
            kVar.V6(2);
            new db2.i0(kVar.f417504o, 1).l();
        } else if (i17 == 2) {
            kVar.V6(1);
            new db2.i0(kVar.f417504o, 2).l();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2 d2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = kVar.m158354x19263085();
        java.util.Map map = (java.util.Map) this.f417498e.f391656d;
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("shoot_status", java.lang.Integer.valueOf(kVar.f417503n));
        android.widget.TextView textView = kVar.f417499g;
        lVarArr[1] = new jz5.l("cluster_name", textView != null ? textView.getText() : null);
        android.widget.TextView textView2 = kVar.f417500h;
        lVarArr[2] = new jz5.l("cluster_reason_recommendation", textView2 != null ? textView2.getText() : null);
        d2Var.h(m158354x19263085, "cluster_shoot", "view_clk", false, kz5.c1.m(map, kz5.c1.k(lVarArr)));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/postplay/uic/FinderPostPlayHeaderUIC$initViews$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
