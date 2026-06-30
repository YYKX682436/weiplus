package e23;

/* loaded from: classes12.dex */
public class o0 extends u13.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p0 f328455b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(e23.p0 p0Var) {
        super(p0Var);
        this.f328455b = p0Var;
    }

    @Override // u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... objArr) {
        int i17;
        e23.p0 p0Var = (e23.p0) gVar;
        e23.n0 n0Var = (e23.n0) eVar;
        android.view.View view = n0Var.f328440a;
        e23.p0 p0Var2 = this.f328455b;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.j(view, p0Var2.f505294d);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(n0Var.f328442c, p0Var.f328460s, null);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.c(p0Var.f328462u, n0Var.f328444e, i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561161b3) * i65.a.m(context));
        if (e23.p0.A) {
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.c(p0Var.f328463v, n0Var.f328445f, i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561161b3) * i65.a.m(context));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.c(p0Var.f328464w, n0Var.f328447h, i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561321f9) * i65.a.m(context));
        android.widget.TextView textView = n0Var.f328446g;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.widget.ImageView imageView = n0Var.f328448i;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        if (c01.e2.R(p0Var.f328460s)) {
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.c(((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).aj(context, p0Var.f328461t), n0Var.f328443d, i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia) * i65.a.m(context));
        } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(p0Var.f328460s) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(p0Var.f328460s)) {
            gm0.j1.i();
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(p0Var.f328460s, true);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).fj(n17.Q0(), n17.G0()))) {
                p0Var2.f328465x = "@" + ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).fj(n17.Q0(), n17.G0());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.c(p0Var.f328461t, n0Var.f328443d, i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia) * i65.a.m(context));
            dm.u8 Di = ((l41.b2) ((j41.y) i95.n0.c(j41.y.class))).Di(p0Var.f328460s);
            android.widget.ImageView imageView2 = n0Var.f328448i;
            if (imageView2 == null || Di == null || !((i17 = Di.f68600x1c5d3c28) == 2 || i17 == 3 || i17 == 4)) {
                com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.c(p0Var2.f328465x, n0Var.f328446g, i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561386h2) * i65.a.m(context));
            } else {
                imageView2.setVisibility(0);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.c(p0Var.f328461t, n0Var.f328443d, i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia) * i65.a.m(context));
        }
        if (n0Var.f328449j != null) {
            if (!((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).Di(p0Var2.f328460s)) {
                n0Var.f328449j.setVisibility(8);
                return;
            }
            n0Var.f328449j.setVisibility(0);
            p0Var2.f328465x = "";
            java.lang.String Vi = ((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).Vi(p0Var2.f328460s);
            java.lang.String Ui = ((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).Ui(p0Var2.f328460s);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Vi) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Ui)) {
                p0Var2.f328465x = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).fj(Vi, Ui);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p0Var2.f328465x)) {
                return;
            }
            if ("3552365301".equals(Vi)) {
                p0Var2.f328465x = "@" + p0Var2.f328465x;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.c(p0Var2.f328465x, n0Var.f328446g, i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561386h2) * i65.a.m(context));
        }
    }

    @Override // u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate;
        e23.n0 n0Var = this.f328455b.f328467z;
        if (e23.p0.A) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSMessageDataItem", "fts multi_msg_show_details enabled");
            inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.efh, viewGroup, false);
            n0Var.f328441b = inflate.findViewById(com.p314xaae8f345.mm.R.id.mem);
            n0Var.f328445f = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.rte);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSMessageDataItem", "fts multi_msg_show_details disabled");
            inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bcg, viewGroup, false);
        }
        n0Var.f328442c = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a_4);
        n0Var.f328443d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kbq);
        n0Var.f328444e = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.jue);
        n0Var.f328447h = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.o7z);
        n0Var.f328446g = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.hhi);
        n0Var.f328440a = inflate.findViewById(com.p314xaae8f345.mm.R.id.d0v);
        n0Var.f328448i = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.hhr);
        n0Var.f328449j = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.spk);
        inflate.setTag(n0Var);
        return inflate;
    }

    @Override // u13.f
    public boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... objArr) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).hj(this.f328455b.f505291a).b(context, view, gVar, objArr);
    }
}
