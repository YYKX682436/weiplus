package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes11.dex */
public class b3 extends com.p314xaae8f345.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f155271o;

    /* renamed from: p, reason: collision with root package name */
    public boolean[] f155272p;

    public b3(android.content.Context context, com.p314xaae8f345.mm.ui.y9 y9Var) {
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.a3 a3Var;
        r61.e0 e0Var = (r61.e0) getItem(i17);
        if (view == null) {
            a3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.a3();
            view2 = android.view.View.inflate(this.f294141e, com.p314xaae8f345.mm.R.C30864xbddafb2a.aan, null);
            a3Var.f155240b = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.cfv);
            a3Var.f155239a = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.ldg);
            a3Var.f155241c = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.f566899hf0);
            a3Var.f155242d = (android.widget.CheckBox) view2.findViewById(com.p314xaae8f345.mm.R.id.hfe);
            view2.setTag(a3Var);
        } else {
            view2 = view;
            a3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.a3) view.getTag();
        }
        android.widget.TextView textView = a3Var.f155239a;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = this.f294141e;
        java.lang.String str = e0Var.f474376b;
        if (str == null) {
            str = "";
        }
        float textSize = a3Var.f155239a.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str, textSize));
        kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
        java.lang.String str2 = "" + e0Var.f474375a;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) c0Var).getClass();
        android.graphics.Bitmap a17 = com.p314xaae8f345.mm.p943x351df9c2.g.a(str2 + "@fb");
        if (a17 == null) {
            a3Var.f155240b.setImageDrawable(i65.a.i(this.f294141e, com.p314xaae8f345.mm.R.raw.f78922x61de8d17));
        } else {
            a3Var.f155240b.setImageBitmap(a17);
        }
        a3Var.f155242d.setChecked(this.f155272p[i17]);
        if (m61.k.Ni().m0(java.lang.Long.toString(e0Var.f474375a))) {
            a3Var.f155241c.setVisibility(0);
        } else {
            a3Var.f155241c.setVisibility(8);
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
        java.lang.String str = this.f155271o;
        Bi.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" where facebookfriend.status = 102 ");
        if (str != null && str.length() > 0) {
            sb6.append(" and ( ");
            sb6.append("facebookfriend.fbname like '%" + str + "%' or ");
            sb6.append("facebookfriend.nickname like '%" + str + "%' or ");
            sb6.append("facebookfriend.username like '%" + str + "%' ) ");
        }
        s(Bi.f474402d.B("select facebookfriend.fbid,facebookfriend.fbname,facebookfriend.fbimgkey,facebookfriend.status,facebookfriend.username,facebookfriend.nickname,facebookfriend.nicknamepyinitial,facebookfriend.nicknamequanpin,facebookfriend.sex,facebookfriend.personalcard,facebookfriend.province,facebookfriend.city,facebookfriend.signature,facebookfriend.alias,facebookfriend.type,facebookfriend.email from facebookfriend  " + sb6.toString() + " order by  case when status = 100 then 0  when status = 102 then 3  when status = 101 then 1 else 2 end  , nicknamepyinitial", null));
        int[] iArr = new int[getCount()];
        this.f155272p = new boolean[getCount()];
        notifyDataSetChanged();
    }

    public long[] t() {
        int i17 = 0;
        for (boolean z17 : this.f155272p) {
            if (z17) {
                i17++;
            }
        }
        long[] jArr = new long[i17];
        int i18 = 0;
        for (int i19 = 0; i19 < getCount(); i19++) {
            if (this.f155272p[i19]) {
                jArr[i18] = ((r61.e0) getItem(i19)).f474375a;
                i18++;
            }
        }
        return jArr;
    }
}
