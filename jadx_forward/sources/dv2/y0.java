package dv2;

/* loaded from: classes2.dex */
public final class y0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dv2.a1 f325507d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1616x70e39459.C14928x5c34302c f325508e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f325509f;

    public y0(dv2.a1 a1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1616x70e39459.C14928x5c34302c c14928x5c34302c, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var) {
        this.f325507d = a1Var;
        this.f325508e = c14928x5c34302c;
        this.f325509f = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/uic/FinderPostRedPackCoverUIC$showRedPackCoverDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1616x70e39459.C14928x5c34302c c14928x5c34302c = this.f325508e;
        dv2.a1 a1Var = this.f325507d;
        int O6 = dv2.a1.O6(a1Var, c14928x5c34302c);
        if (O6 >= 0 && O6 < a1Var.f325340e.size()) {
            java.lang.Object obj = a1Var.f325340e.get(O6);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            r45.m66 m66Var = (r45.m66) obj;
            aw2.n nVar = a1Var.f325343h;
            if (nVar != null) {
                nVar.c(m66Var, true);
            }
            this.f325509f.q();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/uic/FinderPostRedPackCoverUIC$showRedPackCoverDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
