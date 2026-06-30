package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class s0 extends com.p314xaae8f345.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f288696o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f288697p;

    /* renamed from: q, reason: collision with root package name */
    public bb5.g f288698q;

    /* renamed from: r, reason: collision with root package name */
    public bb5.e f288699r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.b0 f288700s;

    public s0(android.content.Context context, java.lang.String str) {
        super(context, new com.p314xaae8f345.mm.p2621x8fb0427b.z3());
        this.f288696o = null;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21514xd47fe41f.m79111x6b320260();
        this.f288698q = null;
        this.f288699r = null;
        this.f288697p = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
        this.f288696o = str;
        this.f288698q = new bb5.g(15, new com.p314xaae8f345.mm.ui.p2690x38b72420.p0(this));
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        com.p314xaae8f345.mm.p2621x8fb0427b.e8 q17 = c01.d9.b().q();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = com.p314xaae8f345.mm.p2621x8fb0427b.z3.M2;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 L = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) q17).L(cursor.getString(cursor.getColumnIndex(dm.i4.f66875xa013b0d5)));
        if (L != null) {
            return L;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
        z3Var.mo9015xbf5d97fd(cursor);
        ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).s0(z3Var, false);
        return z3Var;
    }

    @Override // com.p314xaae8f345.mm.ui.z9, android.widget.Adapter
    public int getCount() {
        return j().getCount();
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.r0 r0Var;
        android.view.View view2;
        if (this.f288699r == null) {
            this.f288699r = new com.p314xaae8f345.mm.ui.p2690x38b72420.q0(this);
        }
        bb5.g gVar = this.f288698q;
        if (gVar != null) {
            gVar.b(i17, this.f288699r);
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f288697p;
        if (view == null) {
            view2 = android.view.View.inflate(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569932s9, null);
            r0Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.r0();
            r0Var.f288681b = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.cfx);
            r0Var.f288680a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21522xf5a6e956) view2.findViewById(com.p314xaae8f345.mm.R.id.cfu);
            r0Var.f288682c = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.f565447cg1);
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) view2.findViewById(com.p314xaae8f345.mm.R.id.f565446cg0);
            r0Var.f288683d = viewGroup2;
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
            layoutParams.height = (int) (i65.a.f(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30860x5b28f31.f561146ao) * i65.a.A(abstractActivityC21394xb3d2c0cf));
            r0Var.f288683d.setLayoutParams(layoutParams);
            view2.setTag(r0Var);
        } else {
            r0Var = (com.p314xaae8f345.mm.ui.p2690x38b72420.r0) view.getTag();
            view2 = view;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) getItem(i17 - 1);
        int W0 = z3Var == null ? -1 : z3Var.W0();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) getItem(i17);
        if (i17 == 0) {
            java.lang.String t17 = t(z3Var2, i17);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(t17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatroomContactAdapter", "get display show head return null, user[%s] pos[%d]", z3Var2.d1(), java.lang.Integer.valueOf(i17));
                r0Var.f288681b.setVisibility(8);
            } else {
                r0Var.f288681b.setVisibility(0);
                r0Var.f288681b.setText(t17);
                r0Var.f288681b.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            }
            if (getItem(i17 + 1) == null) {
                r0Var.f288683d.setBackgroundResource(0);
            }
        } else if (i17 <= 0 || z3Var2.W0() == W0) {
            r0Var.f288681b.setVisibility(8);
            u(r0Var, i17, W0);
        } else {
            java.lang.String t18 = t(z3Var2, i17);
            r0Var.f288683d.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562839q2);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(t18)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatroomContactAdapter", "get display show head return null, user[%s] pos[%d]", z3Var2.d1(), java.lang.Integer.valueOf(i17));
                r0Var.f288681b.setVisibility(8);
            } else {
                r0Var.f288681b.setVisibility(0);
                r0Var.f288681b.setText(t18);
                if (z3Var2.W0() == 32) {
                    r0Var.f288681b.setCompoundDrawablesWithIntrinsicBounds(com.p314xaae8f345.mm.R.C30861xcebc809e.bk6, 0, 0, 0);
                    r0Var.f288681b.setCompoundDrawablePadding(2);
                } else {
                    r0Var.f288681b.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                }
            }
            u(r0Var, i17, W0);
        }
        r0Var.f288682c.setTextColor(i65.a.e(abstractActivityC21394xb3d2c0cf, !c01.e2.D(z3Var2.d1()) ? com.p314xaae8f345.mm.R.C30859x5a72f63.f560946yk : com.p314xaae8f345.mm.R.C30859x5a72f63.f560947yl));
        android.widget.ImageView imageView = (android.widget.ImageView) r0Var.f288680a.m79176xc2a54588();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, z3Var2.d1(), null);
        if (imageView.getDrawable() instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.a0) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.a0 a0Var = (com.p314xaae8f345.mm.p2470x93e71c27.ui.a0) imageView.getDrawable();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.b0 b0Var = this.f288700s;
            if (b0Var != null) {
                b0Var.f271437e.add(new java.lang.ref.WeakReference(a0Var));
            }
        }
        r0Var.f288680a.m79178xd0b5cd2c(null);
        try {
            if (c01.e2.R(z3Var2.d1())) {
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                java.lang.String d17 = z3Var2.d1();
                ((sg3.a) v0Var).getClass();
                android.text.SpannableString bj6 = ((ke0.e) xVar).bj(abstractActivityC21394xb3d2c0cf, c01.a2.e(d17), (int) r0Var.f288682c.getTextSize());
                j41.b0 b0Var2 = (j41.b0) i95.n0.c(j41.b0.class);
                android.widget.TextView textView = r0Var.f288682c;
                l41.q2 q2Var = (l41.q2) b0Var2;
                q2Var.getClass();
                if (textView instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21473x5d116ff) {
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.C21473x5d116ff c21473x5d116ff = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21473x5d116ff) textView;
                    c21473x5d116ff.m78881x600eea91(q2Var.f397441f);
                    c21473x5d116ff.b(bj6, " ", -1, (int) textView.getTextSize());
                } else {
                    textView.setText(((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).aj(abstractActivityC21394xb3d2c0cf, bj6));
                }
            } else {
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
                java.lang.String d18 = z3Var2.d1();
                ((sg3.a) v0Var2).getClass();
                r0Var.f288682c.setText(((ke0.e) xVar2).bj(abstractActivityC21394xb3d2c0cf, c01.a2.e(d18), (int) r0Var.f288682c.getTextSize()));
            }
        } catch (java.lang.Exception unused) {
            r0Var.f288682c.setText("");
        }
        return view2;
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void o() {
        q();
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public synchronized void q() {
        android.database.Cursor y17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).y(this.f288696o, "", null, null, false, false);
        c();
        s(y17);
        notifyDataSetChanged();
    }

    public java.lang.String t(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, int i17) {
        return z3Var.W0() == 31 ? "" : z3Var.W0() == 43 ? this.f288697p.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4y) : java.lang.String.valueOf((char) z3Var.W0());
    }

    public final void u(com.p314xaae8f345.mm.ui.p2690x38b72420.r0 r0Var, int i17, int i18) {
        int i19 = i17 + 1;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) getItem(i19);
        if (z3Var == null || !(z3Var.W0() == i18 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(t(z3Var, i19)))) {
            r0Var.f288683d.setBackgroundResource(0);
        }
    }
}
