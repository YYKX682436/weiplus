package yr3;

/* loaded from: classes11.dex */
public final class k0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final wr3.t0 f546427d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f546428e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f546429f;

    /* renamed from: g, reason: collision with root package name */
    public final int f546430g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f546431h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f546432i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f546433m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f546434n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f546435o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f546436p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f546437q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View f546438r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.TextView f546439s;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 f546440t;

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 f546441u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.TextView f546442v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View f546443w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(wr3.t0 adapter, android.view.View itemView) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f546427d = adapter;
        this.f546428e = "FeaturedMsgSingleTextViewHolder";
        this.f546429f = adapter.f530412m;
        this.f546430g = 5;
        this.f546431h = (android.widget.TextView) itemView.findViewById(com.p314xaae8f345.mm.R.id.cb9);
        this.f546432i = (android.widget.ImageView) itemView.findViewById(com.p314xaae8f345.mm.R.id.syb);
        this.f546433m = itemView.findViewById(com.p314xaae8f345.mm.R.id.f565411cb1);
        this.f546434n = itemView.findViewById(com.p314xaae8f345.mm.R.id.t_g);
        this.f546435o = (android.widget.TextView) itemView.findViewById(com.p314xaae8f345.mm.R.id.t_m);
        this.f546436p = itemView.findViewById(com.p314xaae8f345.mm.R.id.t_s);
        this.f546437q = itemView.findViewById(com.p314xaae8f345.mm.R.id.syc);
        this.f546438r = itemView.findViewById(com.p314xaae8f345.mm.R.id.cbi);
        this.f546439s = (android.widget.TextView) itemView.findViewById(com.p314xaae8f345.mm.R.id.cbk);
        this.f546440t = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) itemView.findViewById(com.p314xaae8f345.mm.R.id.rds);
        this.f546441u = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) itemView.findViewById(com.p314xaae8f345.mm.R.id.aro);
        this.f546442v = (android.widget.TextView) itemView.findViewById(com.p314xaae8f345.mm.R.id.arp);
        this.f546443w = itemView.findViewById(com.p314xaae8f345.mm.R.id.f567756uo2);
    }

    public final void i(java.lang.String str, r45.s5 s5Var, java.lang.String str2, wr3.n0 n0Var, boolean z17, int i17) {
        int i18;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039;
        com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc c23001x9d3a0bdc;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d690392 = this.f546441u;
        android.text.SpannableString nj6 = ((ke0.e) xVar).nj(c22624x85d690392.getContext(), str, (int) c22624x85d690392.m84164x40077844());
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        android.content.Context context = this.f546429f;
        android.text.SpannableString i19 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str2);
        c22624x85d690392.m84175x8dd5167d(Integer.MAX_VALUE);
        c22624x85d690392.b(nj6);
        c22624x85d690392.m84182x42191760(i65.a.b(context, 5));
        boolean z18 = str2 == null || str2.length() == 0;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d690393 = this.f546440t;
        if (z18) {
            c22624x85d690393.setVisibility(8);
            c22624x85d690392.m84177x53cacfd7(i65.a.b(context, 70));
        } else {
            c22624x85d690393.setVisibility(0);
            c22624x85d690393.b(i19);
            c22624x85d690393.m84162x74f59ea8().setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            c22624x85d690393.m84162x74f59ea8().setStrokeWidth(0.8f);
            c22624x85d690392.m84177x53cacfd7(0);
        }
        int B = i65.a.B(context) - i65.a.b(context, 72);
        ks5.a i27 = c22624x85d690392.i(B, Integer.MAX_VALUE);
        ks5.a i28 = c22624x85d690393.i(B, Integer.MAX_VALUE);
        int i29 = i27 != null ? ((com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2839xbddafb2a.C23000xc9450414) i27).L : 0;
        int i37 = i28 != null ? ((com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2839xbddafb2a.C23000xc9450414) i28).L : 0;
        int i38 = i29 + i37;
        android.widget.TextView textView = this.f546442v;
        int i39 = this.f546430g;
        if (i38 > i39) {
            c22624x85d690392.m84175x8dd5167d(i39 - i37);
            textView.setVisibility(0);
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.m79);
            if (s5Var.f467042d.f472324e == 1 || s5Var.f467047i == null) {
                i18 = i38;
                c22624x85d69039 = c22624x85d690393;
                c23001x9d3a0bdc = c22624x85d690392;
            } else {
                yr3.w wVar = yr3.w.f546592a;
                android.content.Context context2 = this.f546429f;
                wr3.t0 t0Var = this.f546427d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
                java.lang.Object obj = s5Var.f467047i.f464287e.get(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                r45.l5 BaseInfo = s5Var.f467047i.f464286d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(BaseInfo, "BaseInfo");
                i18 = i38;
                c22624x85d69039 = c22624x85d690393;
                c23001x9d3a0bdc = c22624x85d690392;
                wVar.j(context2, t0Var, textView, s5Var, (r45.o5) obj, BaseInfo, (r29 & 64) != 0 ? 0 : m8188xa86cd69f(), n0Var, z17, i17, (r29 & 1024) != 0 ? sr3.a.f493362e : null, (r29 & 2048) != 0 ? false : false);
            }
        } else {
            i18 = i38;
            c22624x85d69039 = c22624x85d690393;
            c23001x9d3a0bdc = c22624x85d690392;
            c23001x9d3a0bdc.m84175x8dd5167d(Integer.MAX_VALUE);
            textView.setVisibility(8);
        }
        android.view.ViewGroup.LayoutParams layoutParams = c23001x9d3a0bdc.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
        android.view.ViewGroup.LayoutParams layoutParams3 = c22624x85d69039.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) layoutParams3;
        int i47 = i18 <= 2 ? 17 : 19;
        layoutParams2.gravity = i47;
        layoutParams4.gravity = i47;
        c23001x9d3a0bdc.setLayoutParams(layoutParams2);
        com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc c23001x9d3a0bdc2 = c22624x85d69039;
        c23001x9d3a0bdc2.setLayoutParams(layoutParams4);
        c23001x9d3a0bdc.m84184x4ee3c29f(i47);
        c23001x9d3a0bdc2.m84184x4ee3c29f(i47);
    }
}
