package yr3;

/* loaded from: classes11.dex */
public final class n1 extends yr3.a {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f546488f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f546489g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 f546490h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f546491i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f546492m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f546493n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(android.view.View itemView, wr3.i outAdapter, r45.l5 baseInfo) {
        super(itemView, outAdapter, baseInfo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outAdapter, "outAdapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseInfo, "baseInfo");
        this.f546488f = "SmallLiveViewHolder";
        this.f546489g = itemView.getContext();
        this.f546490h = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) itemView.findViewById(com.p314xaae8f345.mm.R.id.dyv);
        this.f546491i = (android.widget.TextView) itemView.findViewById(com.p314xaae8f345.mm.R.id.dyw);
        this.f546492m = (android.widget.ImageView) itemView.findViewById(com.p314xaae8f345.mm.R.id.dys);
        this.f546493n = itemView.findViewById(com.p314xaae8f345.mm.R.id.f567756uo2);
    }

    @Override // yr3.a
    public void i(yr3.c dataModel, int i17, wr3.n0 itemStatus, boolean z17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataModel, "dataModel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemStatus, "itemStatus");
        r45.o5 o5Var = dataModel.f546267b;
        if (o5Var.P == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f546488f, "detailInfo.finder_live == null");
            return;
        }
        wr3.n0 n0Var = wr3.n0.f530376g;
        android.view.View view = this.f546493n;
        if (itemStatus == n0Var) {
            a84.y0.p(view, true);
        } else {
            a84.y0.p(view, false);
        }
        r45.u5 finder_live = o5Var.P;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finder_live, "finder_live");
        boolean z18 = (x51.t1.b(o5Var.f463454n) || x51.t1.b(o5Var.L)) ? false : true;
        yr3.w wVar = yr3.w.f546592a;
        android.view.View itemView = this.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        wVar.g(itemView, i17);
        r45.nw1 g17 = ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).g(finder_live.f468564f);
        java.lang.String str = z18 ? o5Var.f463446d : finder_live.f468567i;
        eq1.h hVar = eq1.h.f337345a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = this.f546490h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22624x85d69039);
        hVar.k(g17, c22624x85d69039, str);
        c22624x85d69039.setTag(com.p314xaae8f345.mm.R.id.bph, finder_live.f468564f);
        hVar.f(finder_live.f468563e, finder_live.f468564f, new yr3.l1(this, finder_live, str));
        n11.a.b().h(z18 ? o5Var.f463454n : finder_live.f468573r.f466079d, this.f546492m, wVar.d());
        fq1.e.h(fq1.e.f347040a, this.f546492m, i65.a.b(this.f546489g, 2), false, false, 12, null);
        this.f3639x46306858.setOnClickListener(new yr3.m1(finder_live, this));
    }
}
