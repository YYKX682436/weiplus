package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes11.dex */
public class u8 extends com.p314xaae8f345.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public int[] f155777o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f155778p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.s8 f155779q;

    public u8(android.content.Context context, com.p314xaae8f345.mm.ui.y9 y9Var) {
        super(context, new r61.e0());
        this.f294144h = y9Var;
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        r61.e0 e0Var = (r61.e0) obj;
        if (e0Var == null) {
            e0Var = new r61.e0();
        }
        e0Var.a(cursor);
        return e0Var;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.t8 t8Var;
        r61.e0 e0Var = (r61.e0) getItem(i17);
        if (view == null) {
            t8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.t8();
            view2 = android.view.View.inflate(this.f294141e, com.p314xaae8f345.mm.R.C30864xbddafb2a.aam, null);
            t8Var.f155751b = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.cfv);
            t8Var.f155750a = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.ldg);
            t8Var.f155752c = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.ldb);
            t8Var.f155753d = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.ldc);
            t8Var.f155754e = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.lde);
            t8Var.f155755f = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.ldj);
            view2.setTag(t8Var);
        } else {
            view2 = view;
            t8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.t8) view.getTag();
        }
        android.widget.TextView textView = t8Var.f155750a;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = this.f294141e;
        java.lang.String str = e0Var.f474376b;
        if (str == null) {
            str = "";
        }
        float textSize = t8Var.f155750a.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str, textSize));
        t8Var.f155754e.setVisibility(8);
        t8Var.f155755f.setVisibility(0);
        int i18 = this.f155777o[i17];
        if (i18 == 0) {
            if (e0Var.f474378d != 102) {
                com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
                java.lang.String str2 = e0Var.f474379e;
                if (str2 == null) {
                    str2 = "";
                }
                if (!Bi.h(str2)) {
                    t8Var.f155752c.setVisibility(8);
                    t8Var.f155753d.setVisibility(0);
                }
            }
            if (e0Var.f474378d == 102) {
                t8Var.f155752c.setVisibility(8);
                t8Var.f155753d.setVisibility(8);
                t8Var.f155755f.setVisibility(8);
            } else {
                t8Var.f155752c.setVisibility(0);
                t8Var.f155752c.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ffb);
                t8Var.f155752c.setTextColor(this.f294141e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560143c5));
                t8Var.f155753d.setVisibility(8);
            }
        } else if (i18 == 2) {
            t8Var.f155753d.setVisibility(8);
            t8Var.f155752c.setVisibility(0);
            t8Var.f155752c.setText(com.p314xaae8f345.mm.R.C30867xcad56011.fff);
            t8Var.f155752c.setTextColor(this.f294141e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560144c6));
        }
        kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
        java.lang.String str3 = "" + e0Var.f474375a;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) c0Var).getClass();
        android.graphics.Bitmap a17 = com.p314xaae8f345.mm.p943x351df9c2.g.a(str3 + "@fb");
        if (a17 == null) {
            t8Var.f155751b.setImageDrawable(i65.a.i(this.f294141e, com.p314xaae8f345.mm.R.raw.f78922x61de8d17));
        } else {
            t8Var.f155751b.setImageBitmap(a17);
        }
        return view2;
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void o() {
        q();
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void q() {
        r61.f0 Bi = m61.k.Bi();
        java.lang.String str = this.f155778p;
        Bi.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (str != null && str.length() > 0) {
            sb6.append(" where ( ");
            sb6.append("facebookfriend.fbname like '%" + str + "%' or ");
            sb6.append("facebookfriend.nickname like '%" + str + "%' or ");
            sb6.append("facebookfriend.username like '%" + str + "%' ) ");
        }
        s(Bi.f474402d.B("select facebookfriend.fbid,facebookfriend.fbname,facebookfriend.fbimgkey,facebookfriend.status,facebookfriend.username,facebookfriend.nickname,facebookfriend.nicknamepyinitial,facebookfriend.nicknamequanpin,facebookfriend.sex,facebookfriend.personalcard,facebookfriend.province,facebookfriend.city,facebookfriend.signature,facebookfriend.alias,facebookfriend.type,facebookfriend.email from facebookfriend  " + sb6.toString() + " order by  case when status = 100 then 0  when status = 102 then 3  when status = 101 then 1 else 2 end  , nicknamepyinitial", null));
        this.f155777o = new int[getCount()];
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.s8 s8Var = this.f155779q;
        if (s8Var != null && this.f155778p != null) {
            int count = j().getCount();
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11449xcdfa582e activityC11449xcdfa582e = ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.a9) s8Var).f155248a;
            if (count > 0) {
                activityC11449xcdfa582e.f154988h.setVisibility(8);
            } else {
                activityC11449xcdfa582e.f154988h.setVisibility(0);
            }
        }
        notifyDataSetChanged();
    }
}
