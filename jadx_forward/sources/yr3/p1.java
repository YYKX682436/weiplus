package yr3;

/* loaded from: classes11.dex */
public final class p1 extends yr3.a {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f546513f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f546514g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f546515h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f546516i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f546517m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(android.view.View itemView, wr3.i outAdapter, r45.l5 baseInfo) {
        super(itemView, outAdapter, baseInfo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outAdapter, "outAdapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseInfo, "baseInfo");
        this.f546513f = itemView.getContext();
        this.f546514g = (android.widget.TextView) itemView.findViewById(com.p314xaae8f345.mm.R.id.dyx);
        this.f546515h = (android.widget.TextView) itemView.findViewById(com.p314xaae8f345.mm.R.id.dyw);
        this.f546516i = (android.widget.ImageView) itemView.findViewById(com.p314xaae8f345.mm.R.id.dys);
        this.f546517m = itemView.findViewById(com.p314xaae8f345.mm.R.id.f567756uo2);
    }

    @Override // yr3.a
    public void i(yr3.c dataModel, int i17, wr3.n0 itemStatus, boolean z17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataModel, "dataModel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemStatus, "itemStatus");
        r45.s5 s5Var = dataModel.f546268c;
        r45.o5 o5Var = dataModel.f546267b;
        wr3.n0 n0Var = wr3.n0.f530376g;
        android.view.View view = this.f546517m;
        if (itemStatus == n0Var) {
            a84.y0.p(view, true);
        } else {
            a84.y0.p(view, false);
        }
        yr3.w wVar = yr3.w.f546592a;
        android.content.Context context = this.f546513f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        wr3.i iVar = this.f546248d;
        android.view.View itemView = this.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        wVar.j(context, iVar, itemView, s5Var, o5Var, this.f546249e, (r29 & 64) != 0 ? 0 : i17, itemStatus, z17, i18, (r29 & 1024) != 0 ? sr3.a.f493362e : null, (r29 & 2048) != 0 ? false : false);
        android.view.View itemView2 = this.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView2, "itemView");
        wVar.g(itemView2, i17);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String str = o5Var.f463446d;
        ((ke0.e) xVar).getClass();
        this.f546514g.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str));
        boolean b17 = x51.t1.b(o5Var.A);
        android.widget.TextView textView = this.f546515h;
        if (b17) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(o5Var.A);
        }
        n11.a.b().h(x51.t1.b(o5Var.f463454n) ? o5Var.f463453m : o5Var.f463454n, this.f546516i, wVar.d());
        fq1.e.h(fq1.e.f347040a, this.f546516i, i65.a.b(context, 2), false, false, 12, null);
    }
}
