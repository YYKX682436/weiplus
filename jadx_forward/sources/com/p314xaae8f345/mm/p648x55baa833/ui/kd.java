package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes12.dex */
public class kd extends android.widget.BaseAdapter {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.a3 f145818e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f145819f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f145820g;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea f145825o;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f145817d = new java.lang.String(java.lang.Character.toChars(91));

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f145821h = new java.util.ArrayList(0);

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f145822i = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f145823m = false;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashMap f145824n = new java.util.HashMap();

    public kd(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea activityC10372xd653ffea, android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var, java.lang.String str, java.lang.String str2) {
        this.f145825o = activityC10372xd653ffea;
        this.f145820g = null;
        this.f145818e = a3Var;
        this.f145820g = str2;
        this.f145819f = context;
    }

    public final java.lang.String a(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        java.lang.String z07;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z3Var.w0())) {
            java.lang.String d17 = z3Var.d1();
            this.f145825o.getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = this.f145818e;
            z07 = a3Var == null ? null : a3Var.z0(d17);
        } else {
            z07 = z3Var.w0();
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07)) {
            z07 = z3Var.f2();
        }
        if (z3Var.r2()) {
            return z07;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.ya z08 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(z3Var.d1());
        return (z08 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z08.f66692x4854b29d)) ? z07 : z08.f66692x4854b29d;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p648x55baa833.ui.bd getItem(int i17) {
        if (this.f145822i.size() > i17) {
            return (com.p314xaae8f345.mm.p648x55baa833.ui.bd) this.f145822i.get(i17);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.f145822i == null || this.f145823m) {
            return 0;
        }
        return this.f145822i.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p648x55baa833.ui.ld ldVar;
        android.view.View view2;
        android.content.Context context = this.f145819f;
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea activityC10372xd653ffea = this.f145825o;
        if (view == null) {
            view2 = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.cjw, null);
            ldVar = new com.p314xaae8f345.mm.p648x55baa833.ui.ld();
            ldVar.f145852g = (android.widget.LinearLayout) view2.findViewById(com.p314xaae8f345.mm.R.id.f566911hh0);
            ldVar.f145847b = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21522xf5a6e956) view2.findViewById(com.p314xaae8f345.mm.R.id.mjo);
            ldVar.f145848c = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21473x5d116ff) view2.findViewById(com.p314xaae8f345.mm.R.id.mjq);
            ldVar.f145848c = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.mjq);
            ldVar.f145850e = (android.widget.ImageButton) view2.findViewById(com.p314xaae8f345.mm.R.id.f565037b16);
            ldVar.f145851f = (android.widget.LinearLayout) view2.findViewById(com.p314xaae8f345.mm.R.id.b17);
            android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
            ldVar.f145848c.setMaxWidth((windowManager.getDefaultDisplay().getWidth() * 2) / 3);
            android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.mjp);
            ldVar.f145849d = textView;
            textView.setMaxWidth((windowManager.getDefaultDisplay().getWidth() * 2) / 3);
            ldVar.f145853h = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view2.findViewById(com.p314xaae8f345.mm.R.id.smq);
            view2.setTag(ldVar);
            com.p314xaae8f345.mm.p648x55baa833.ui.bd item = getItem(i17);
            if (item != null) {
                if (activityC10372xd653ffea.f145514q.contains(item.f145592a.d1())) {
                    ldVar.f145850e.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562789oo);
                    ldVar.f145852g.setTag(com.p314xaae8f345.mm.R.id.cec, java.lang.Boolean.FALSE);
                } else {
                    ldVar.f145850e.setImageResource(com.p314xaae8f345.mm.R.raw.f78834xa20f9397);
                    ldVar.f145852g.setTag(com.p314xaae8f345.mm.R.id.cec, java.lang.Boolean.TRUE);
                }
            }
            activityC10372xd653ffea.getClass();
            if (activityC10372xd653ffea instanceof com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10369x3b98011d) {
                ldVar.f145853h.setVisibility(0);
                ldVar.f145853h.setClickable(true);
            } else {
                ldVar.f145853h.setVisibility(8);
                ldVar.f145853h.setClickable(false);
            }
            ldVar.f145850e.setOnClickListener(new com.p314xaae8f345.mm.p648x55baa833.ui.fd(this, ldVar));
            ldVar.f145851f.setOnClickListener(new com.p314xaae8f345.mm.p648x55baa833.ui.gd(this, view2, ldVar));
            ldVar.f145853h.setOnClickListener(new com.p314xaae8f345.mm.p648x55baa833.ui.hd(this));
            view2.setOnClickListener(new com.p314xaae8f345.mm.p648x55baa833.ui.id(this));
        } else {
            ldVar = (com.p314xaae8f345.mm.p648x55baa833.ui.ld) view.getTag();
            view2 = view;
        }
        com.p314xaae8f345.mm.p648x55baa833.ui.bd item2 = getItem(i17);
        ldVar.f145851f.setTag(java.lang.Integer.valueOf(i17));
        ldVar.f145853h.setTag(java.lang.Integer.valueOf(i17));
        if (item2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SelectMemberAdapter", "null == item! position:%s, count:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(getCount()));
            return view2;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = item2.f145592a;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai((android.widget.ImageView) ldVar.f145847b.m79176xc2a54588(), z3Var.d1(), null);
        if (z3Var.f1() == 0) {
            ldVar.f145847b.m79178xd0b5cd2c(null);
        } else if (c01.n8.b() != null) {
            java.lang.String b17 = ((xf4.d) c01.n8.b()).b(z3Var.f1(), false);
            if (b17 != null) {
                ((qv.y) ((rv.b3) i95.n0.c(rv.b3.class))).getClass();
                ldVar.f145847b.b(r01.y1.a(b17, 1.5f), db5.r8.SUBSCRIPT_DRAWABLE_DIRECTION_BOTTOM_RIGHT);
            } else {
                ldVar.f145847b.m79178xd0b5cd2c(null);
            }
        } else {
            ldVar.f145847b.m79178xd0b5cd2c(null);
        }
        java.lang.String a17 = a(z3Var);
        view2.setTag(com.p314xaae8f345.mm.R.id.vcb, a17);
        java.lang.String str = z3Var.r2() ? z3Var.f318122y1 : "";
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            ldVar.f145849d.setVisibility(8);
            ldVar.f145849d.setText("");
        } else {
            ldVar.f145849d.setVisibility(0);
            android.widget.TextView textView2 = ldVar.f145849d;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            float textSize = ldVar.f145849d.getTextSize();
            ((ke0.e) xVar).getClass();
            textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str, textSize));
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(z3Var.d1())) {
            ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).ij(this.f145819f, ldVar.f145848c, a17, z3Var.Q0(), z3Var.G0(), (int) ldVar.f145848c.getTextSize());
        } else {
            android.widget.TextView textView3 = ldVar.f145848c;
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            float textSize2 = ldVar.f145848c.getTextSize();
            ((ke0.e) xVar2).getClass();
            textView3.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, a17, textSize2));
        }
        if (activityC10372xd653ffea.X6()) {
            ldVar.f145850e.setVisibility(0);
            ldVar.f145851f.setVisibility(0);
            if (activityC10372xd653ffea.V6().contains(z3Var.d1())) {
                ldVar.f145851f.setEnabled(false);
                ldVar.f145850e.setEnabled(false);
                ldVar.f145850e.setImageResource(com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.R.raw.f78844x4a24e2e : com.p314xaae8f345.mm.R.raw.f78843x2ecb5687);
            } else {
                ldVar.f145851f.setEnabled(true);
                ldVar.f145850e.setEnabled(true);
                if (activityC10372xd653ffea.f145514q.contains(item2.f145592a.d1())) {
                    ldVar.f145850e.setImageResource(com.p314xaae8f345.mm.R.raw.f78834xa20f9397);
                    ldVar.f145852g.setTag(com.p314xaae8f345.mm.R.id.cec, java.lang.Boolean.TRUE);
                } else {
                    ldVar.f145850e.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562789oo);
                    ldVar.f145852g.setTag(com.p314xaae8f345.mm.R.id.cec, java.lang.Boolean.FALSE);
                }
            }
        } else {
            ldVar.f145850e.setVisibility(8);
            ldVar.f145851f.setVisibility(8);
        }
        ldVar.f145846a = item2;
        ldVar.f145854i = i17;
        return view2;
    }
}
