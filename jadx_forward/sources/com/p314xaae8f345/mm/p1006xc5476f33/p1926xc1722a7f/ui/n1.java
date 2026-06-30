package com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui;

/* loaded from: classes11.dex */
public class n1 extends com.p314xaae8f345.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f233719o;

    /* renamed from: p, reason: collision with root package name */
    public int f233720p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.u8 f233721q;

    /* renamed from: r, reason: collision with root package name */
    public db5.f6 f233722r;

    /* renamed from: s, reason: collision with root package name */
    public db5.b6 f233723s;

    /* renamed from: t, reason: collision with root package name */
    public db5.e6 f233724t;

    /* renamed from: u, reason: collision with root package name */
    public final db5.c6 f233725u;

    public n1(com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16726x80180cff activityC16726x80180cff, android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.u8 u8Var, int i17) {
        super(context, new com.p314xaae8f345.mm.p2621x8fb0427b.t8());
        this.f233720p = -1;
        this.f233725u = com.p314xaae8f345.mm.ui.p2642x2e06d1.C21514xd47fe41f.m79111x6b320260();
        this.f233719o = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
        this.f233720p = i17;
        this.f233721q = u8Var;
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        com.p314xaae8f345.mm.p2621x8fb0427b.t8 t8Var = (com.p314xaae8f345.mm.p2621x8fb0427b.t8) obj;
        if (t8Var == null) {
            t8Var = new com.p314xaae8f345.mm.p2621x8fb0427b.t8();
        }
        t8Var.mo9015xbf5d97fd(cursor);
        return t8Var;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.m1 m1Var;
        com.p314xaae8f345.mm.p2621x8fb0427b.t8 t8Var = (com.p314xaae8f345.mm.p2621x8fb0427b.t8) getItem(i17);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f233719o;
        if (view == null) {
            m1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.m1(this);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21514xd47fe41f c21514xd47fe41f = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21514xd47fe41f) android.view.View.inflate(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569727k4, null);
            android.view.View inflate = android.view.View.inflate(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30864xbddafb2a.chi, null);
            m1Var.f233716c = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.cfv);
            m1Var.f233714a = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.d0q);
            m1Var.f233715b = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.m_4);
            m1Var.f233717d = c21514xd47fe41f.findViewById(com.p314xaae8f345.mm.R.id.f568491n04);
            c21514xd47fe41f.m79117x76516a27(inflate);
            c21514xd47fe41f.m79116x616bb32a(this.f233722r);
            c21514xd47fe41f.m79113xa7358307(this.f233723s);
            c21514xd47fe41f.m79114x25d846c(this.f233725u);
            c21514xd47fe41f.m79112xae17c85(false);
            c21514xd47fe41f.setTag(m1Var);
            view2 = c21514xd47fe41f;
        } else {
            view2 = view;
            m1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.m1) view.getTag();
        }
        java.lang.String str = t8Var.f66509x225ba391 != 0 ? com.p314xaae8f345.mm.p2621x8fb0427b.e9.f(t8Var.f66507xad49e234).f275394c : t8Var.f66518x114ef53e;
        android.widget.TextView textView = m1Var.f233714a;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        float textSize = m1Var.f233714a.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(abstractActivityC21394xb3d2c0cf, str, textSize));
        android.widget.TextView textView2 = m1Var.f233715b;
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String str2 = t8Var.f66512x7236dff2;
        float textSize2 = m1Var.f233715b.getTextSize();
        ((ke0.e) xVar2).getClass();
        textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(abstractActivityC21394xb3d2c0cf, str2, textSize2));
        m1Var.f233717d.setTag(java.lang.Long.valueOf(t8Var.f66517x29d4cc45));
        m1Var.f233717d.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.l1(this));
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(m1Var.f233716c, t8Var.f66514x49f69af2, null);
        return view2;
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void o() {
        q();
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void q() {
        boolean c17 = m25.a.c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u8 u8Var = this.f233721q;
        if (c17) {
            int i17 = this.f233720p;
            s(u8Var.f277798d.B("SELECT a.* FROM (" + ("SELECT sayhiencryptuser,max(createtime) createtime FROM " + u8Var.mo145255x88e404c3() + " where isSend = 0 GROUP BY sayhiencryptuser LIMIT " + i17) + ") b left join " + u8Var.mo145255x88e404c3() + " a on b.sayhiencryptuser=a.sayhiencryptuser and b.createtime=a.createtime where a.isSend = 0 ORDER BY a.createtime desc LIMIT " + i17, null));
        } else {
            s(u8Var.f277798d.B("SELECT * FROM " + u8Var.mo145255x88e404c3() + " where isSend = 0 ORDER BY createtime desc LIMIT " + this.f233720p, null));
        }
        notifyDataSetChanged();
    }
}
