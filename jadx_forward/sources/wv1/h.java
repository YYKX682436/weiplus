package wv1;

/* loaded from: classes12.dex */
public class h extends wv1.e {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f531475f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f531476g;

    @Override // wv1.a
    public int h() {
        return 3;
    }

    @Override // wv1.a
    public void k(android.view.View view, wv1.a aVar) {
        xv1.d.d(((com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.a) this.f531462a).f177056d.mo54478x76847179(), view, aVar);
    }

    @Override // wv1.e
    public java.lang.String m() {
        if (this.f531476g == null) {
            tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f531463b;
            this.f531476g = ((k90.b) u0Var).tj(f9Var, f9Var.z0(), false);
        }
        return this.f531476g;
    }

    @Override // wv1.e, wv1.a
    /* renamed from: n */
    public void j(wv1.o oVar, int i17, wv1.a aVar) {
        super.j(oVar, i17, aVar);
        android.view.View view = oVar.f531497i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGridVideo", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGridVideo", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = oVar.f531498m;
        textView.setVisibility(0);
        if (this.f531475f == null) {
            wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
            java.lang.String z07 = this.f531463b.z0();
            ((vf0.y1) x1Var).getClass();
            this.f531475f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.u(t21.d3.h(z07).f496548m);
        }
        java.lang.String str = this.f531475f;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
    }
}
