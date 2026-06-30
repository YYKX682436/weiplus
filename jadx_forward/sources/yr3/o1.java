package yr3;

/* loaded from: classes11.dex */
public final class o1 extends yr3.a {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f546499f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f546500g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f546501h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f546502i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f546503m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f546504n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(android.view.View itemView, wr3.i outAdapter, r45.l5 baseInfo) {
        super(itemView, outAdapter, baseInfo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outAdapter, "outAdapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseInfo, "baseInfo");
        this.f546499f = itemView.getContext();
        this.f546500g = (android.widget.TextView) itemView.findViewById(com.p314xaae8f345.mm.R.id.dyx);
        this.f546501h = (android.widget.TextView) itemView.findViewById(com.p314xaae8f345.mm.R.id.dyw);
        this.f546502i = (android.widget.ImageView) itemView.findViewById(com.p314xaae8f345.mm.R.id.dys);
        this.f546503m = (android.widget.TextView) itemView.findViewById(com.p314xaae8f345.mm.R.id.kvn);
        this.f546504n = itemView.findViewById(com.p314xaae8f345.mm.R.id.f567756uo2);
    }

    @Override // yr3.a
    public void i(yr3.c dataModel, int i17, wr3.n0 itemStatus, boolean z17, int i18) {
        int i19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataModel, "dataModel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemStatus, "itemStatus");
        r45.s5 s5Var = dataModel.f546268c;
        r45.o5 o5Var = dataModel.f546267b;
        wr3.n0 n0Var = wr3.n0.f530376g;
        android.view.View view = this.f546504n;
        if (itemStatus == n0Var) {
            a84.y0.p(view, true);
        } else {
            a84.y0.p(view, false);
        }
        yr3.w wVar = yr3.w.f546592a;
        android.content.Context context = this.f546499f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        wr3.i iVar = this.f546248d;
        android.view.View itemView = this.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        wVar.j(context, iVar, itemView, s5Var, o5Var, this.f546249e, (r29 & 64) != 0 ? 0 : i17, itemStatus, z17, i18, (r29 & 1024) != 0 ? sr3.a.f493362e : null, (r29 & 2048) != 0 ? false : false);
        android.view.View itemView2 = this.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView2, "itemView");
        wVar.g(itemView2, i17);
        this.f546500g.setText(o5Var.f463446d);
        boolean b17 = x51.t1.b(o5Var.A);
        android.widget.TextView textView = this.f546501h;
        if (b17) {
            textView.setVisibility(8);
            i19 = 0;
        } else {
            i19 = 0;
            textView.setVisibility(0);
            textView.setText(o5Var.A);
        }
        int i27 = o5Var.H;
        android.widget.TextView textView2 = this.f546503m;
        if (i27 > 1) {
            textView2.setVisibility(i19);
            textView2.setText(java.lang.String.valueOf(o5Var.H));
        } else {
            textView2.setVisibility(8);
            textView2.setText("");
        }
        n11.a.b().h(x51.t1.b(o5Var.f463454n) ? o5Var.f463453m : o5Var.f463454n, this.f546502i, wVar.d());
        fq1.e.h(fq1.e.f347040a, this.f546502i, i65.a.b(context, 2), false, false, 12, null);
    }
}
