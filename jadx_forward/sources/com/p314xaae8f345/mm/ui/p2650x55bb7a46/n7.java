package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class n7 extends com.p314xaae8f345.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f283544o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f283545p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f283546q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f283547r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.l7 f283548s;

    public n7(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, java.lang.String str2, boolean z17) {
        super(context, f9Var);
        this.f283544o = str;
        this.f283545p = str2;
        this.f283547r = z17;
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) obj;
        if (f9Var == null) {
            f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        }
        f9Var.mo9015xbf5d97fd(cursor);
        return f9Var;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.m7 m7Var;
        if (view == null) {
            view = android.view.View.inflate(this.f294141e, com.p314xaae8f345.mm.R.C30864xbddafb2a.cit, null);
            m7Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.m7(null);
            m7Var.f283482a = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.a_4);
            m7Var.f283483b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.kbq);
            m7Var.f283484c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.otg);
            m7Var.f283485d = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.jue);
            view.setTag(m7Var);
        } else {
            m7Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.m7) view.getTag();
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) getItem(i17);
        if (f9Var != null) {
            if (this.f283547r && f9Var.A0() == 0) {
                java.lang.String j17 = f9Var.j();
                java.lang.String s17 = c01.w9.s(j17);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s17)) {
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(m7Var.f283482a, s17, null);
                    android.widget.TextView textView = m7Var.f283483b;
                    le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                    android.content.Context context = this.f294141e;
                    ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                    java.lang.String e17 = c01.a2.e(s17);
                    float textSize = m7Var.f283483b.getTextSize();
                    ((ke0.e) xVar).getClass();
                    textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, e17, textSize));
                }
                m7Var.f283484c.setText(t(f9Var));
                java.lang.String u17 = c01.w9.u(j17);
                android.widget.TextView textView2 = m7Var.f283485d;
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context2 = this.f294141e;
                float textSize2 = m7Var.f283485d.getTextSize();
                ((ke0.e) xVar2).getClass();
                textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context2, u17, textSize2));
            } else {
                android.widget.ImageView imageView = m7Var.f283482a;
                int A0 = f9Var.A0();
                java.lang.String str = this.f283545p;
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, A0 == 1 ? str : this.f283544o, null);
                android.widget.TextView textView3 = m7Var.f283483b;
                le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context3 = this.f294141e;
                tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                if (f9Var.A0() != 1) {
                    str = this.f283544o;
                }
                ((sg3.a) v0Var).getClass();
                java.lang.String e18 = c01.a2.e(str);
                float textSize3 = m7Var.f283483b.getTextSize();
                ((ke0.e) xVar3).getClass();
                textView3.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context3, e18, textSize3));
                m7Var.f283484c.setText(t(f9Var));
                android.widget.TextView textView4 = m7Var.f283485d;
                le0.x xVar4 = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context4 = this.f294141e;
                java.lang.String j18 = f9Var.j();
                float textSize4 = m7Var.f283485d.getTextSize();
                ((ke0.e) xVar4).getClass();
                textView4.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context4, j18, textSize4));
            }
        }
        return view;
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void o() {
        c();
        q();
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void q() {
        android.database.Cursor B;
        xg3.m0 u17 = c01.d9.b().u();
        final java.lang.String str = this.f283544o;
        final java.lang.String str2 = this.f283546q;
        final com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.g9) u17;
        final java.lang.String X8 = g9Var.X8(str);
        if (g9Var.Da(X8)) {
            B = ot0.c3.l().c("getCursorByFilter", new yz5.a() { // from class: com.tencent.mm.storage.g9$$x6
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return ot0.z2.f430355a.Q(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str, str2, 1L);
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$y6
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var2.getClass();
                    return g9Var2.f275522r.B(("SELECT * FROM " + X8 + " WHERE" + g9Var2.Z8(str) + "AND content LIKE '%" + str2 + "%' AND type = 1") + " ORDER BY createTime DESC", null);
                }
            });
        } else if (g9Var.Pb(X8)) {
            B = ot0.z2.f430355a.Q(g9Var.f275522r, X8, str, str2, 1L);
        } else {
            B = g9Var.f275522r.B(("SELECT * FROM " + X8 + " WHERE" + g9Var.Z8(str) + "AND content LIKE '%" + str2 + "%' AND type = 1") + " ORDER BY createTime DESC", null);
        }
        s(B);
        if (this.f283548s != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f283546q)) {
            this.f283548s.a(getCount());
        }
        notifyDataSetChanged();
    }

    public java.lang.CharSequence t(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        return f9Var.mo78012x3fdd41df() == com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697 ? "" : k35.m1.f(this.f294141e, f9Var.mo78012x3fdd41df(), true, false);
    }
}
