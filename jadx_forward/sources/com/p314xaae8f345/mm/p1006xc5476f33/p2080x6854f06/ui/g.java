package com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui;

/* loaded from: classes11.dex */
public class g extends com.p314xaae8f345.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f243797o;

    /* renamed from: p, reason: collision with root package name */
    public int f243798p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.qa f243799q;

    /* renamed from: r, reason: collision with root package name */
    public db5.f6 f243800r;

    /* renamed from: s, reason: collision with root package name */
    public db5.b6 f243801s;

    /* renamed from: t, reason: collision with root package name */
    public db5.e6 f243802t;

    /* renamed from: u, reason: collision with root package name */
    public final db5.c6 f243803u;

    public g(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.qa qaVar, int i17) {
        super(context, new com.p314xaae8f345.mm.p2621x8fb0427b.pa());
        this.f243798p = -1;
        this.f243803u = com.p314xaae8f345.mm.ui.p2642x2e06d1.C21514xd47fe41f.m79111x6b320260();
        this.f243797o = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
        this.f243798p = i17;
        this.f243799q = qaVar;
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        com.p314xaae8f345.mm.p2621x8fb0427b.pa paVar = (com.p314xaae8f345.mm.p2621x8fb0427b.pa) obj;
        if (paVar == null) {
            paVar = new com.p314xaae8f345.mm.p2621x8fb0427b.pa();
        }
        paVar.mo9015xbf5d97fd(cursor);
        return paVar;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.f fVar;
        android.view.View view2;
        com.p314xaae8f345.mm.p2621x8fb0427b.pa paVar = (com.p314xaae8f345.mm.p2621x8fb0427b.pa) getItem(i17);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f243797o;
        if (view == null) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21514xd47fe41f c21514xd47fe41f = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21514xd47fe41f) android.view.View.inflate(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569727k4, null);
            fVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.f();
            android.view.View inflate = android.view.View.inflate(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30864xbddafb2a.chi, null);
            fVar.f243793c = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.cfv);
            fVar.f243791a = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.d0q);
            fVar.f243792b = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.m_4);
            fVar.f243794d = c21514xd47fe41f.findViewById(com.p314xaae8f345.mm.R.id.f568491n04);
            c21514xd47fe41f.m79117x76516a27(inflate);
            c21514xd47fe41f.m79116x616bb32a(this.f243800r);
            c21514xd47fe41f.m79113xa7358307(this.f243801s);
            c21514xd47fe41f.m79114x25d846c(this.f243803u);
            c21514xd47fe41f.m79112xae17c85(false);
            c21514xd47fe41f.setTag(fVar);
            view2 = c21514xd47fe41f;
        } else {
            fVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.f) view.getTag();
            view2 = view;
        }
        fVar.f243794d.setTag(java.lang.Long.valueOf(paVar.f66546x29d4cc45));
        fVar.f243794d.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.e(this));
        com.p314xaae8f345.mm.p2621x8fb0427b.e9 f17 = com.p314xaae8f345.mm.p2621x8fb0427b.e9.f(paVar.f66538xad49e234);
        android.widget.TextView textView = fVar.f243791a;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String b17 = f17.b();
        float textSize = fVar.f243791a.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(abstractActivityC21394xb3d2c0cf, b17, textSize));
        fVar.f243792b.setText(paVar.f66542x7236dff2);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(fVar.f243793c, paVar.f66543x49f69af2, null);
        return view2;
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void o() {
        q();
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void q() {
        int i17 = this.f243798p;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SELECT * FROM ");
        com.p314xaae8f345.mm.p2621x8fb0427b.qa qaVar = this.f243799q;
        sb6.append(qaVar.mo145255x88e404c3());
        sb6.append(" where isSend = 0 ORDER BY createtime desc LIMIT ");
        sb6.append(i17);
        s(qaVar.f276784d.B(sb6.toString(), null));
        notifyDataSetChanged();
    }
}
