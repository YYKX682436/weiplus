package com.tencent.mm.plugin.account.ui;

/* loaded from: classes11.dex */
public class b3 extends com.tencent.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f73738o;

    /* renamed from: p, reason: collision with root package name */
    public boolean[] f73739p;

    public b3(android.content.Context context, com.tencent.mm.ui.y9 y9Var) {
        super(context, new r61.e0());
        this.f212611h = y9Var;
    }

    @Override // com.tencent.mm.ui.z9
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
        com.tencent.mm.plugin.account.ui.a3 a3Var;
        r61.e0 e0Var = (r61.e0) getItem(i17);
        if (view == null) {
            a3Var = new com.tencent.mm.plugin.account.ui.a3();
            view2 = android.view.View.inflate(this.f212608e, com.tencent.mm.R.layout.aan, null);
            a3Var.f73707b = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.cfv);
            a3Var.f73706a = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.ldg);
            a3Var.f73708c = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.f485366hf0);
            a3Var.f73709d = (android.widget.CheckBox) view2.findViewById(com.tencent.mm.R.id.hfe);
            view2.setTag(a3Var);
        } else {
            view2 = view;
            a3Var = (com.tencent.mm.plugin.account.ui.a3) view.getTag();
        }
        android.widget.TextView textView = a3Var.f73706a;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = this.f212608e;
        java.lang.String str = e0Var.f392843b;
        if (str == null) {
            str = "";
        }
        float textSize = a3Var.f73706a.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize));
        kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
        java.lang.String str2 = "" + e0Var.f392842a;
        ((com.tencent.mm.feature.avatar.w) c0Var).getClass();
        android.graphics.Bitmap a17 = com.tencent.mm.modelavatar.g.a(str2 + "@fb");
        if (a17 == null) {
            a3Var.f73707b.setImageDrawable(i65.a.i(this.f212608e, com.tencent.mm.R.raw.default_avatar));
        } else {
            a3Var.f73707b.setImageBitmap(a17);
        }
        a3Var.f73709d.setChecked(this.f73739p[i17]);
        if (m61.k.Ni().m0(java.lang.Long.toString(e0Var.f392842a))) {
            a3Var.f73708c.setVisibility(0);
        } else {
            a3Var.f73708c.setVisibility(8);
        }
        return view2;
    }

    @Override // com.tencent.mm.ui.z9
    public void o() {
        q();
    }

    @Override // com.tencent.mm.ui.z9
    public void q() {
        r61.f0 Bi = m61.k.Bi();
        java.lang.String str = this.f73738o;
        Bi.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" where facebookfriend.status = 102 ");
        if (str != null && str.length() > 0) {
            sb6.append(" and ( ");
            sb6.append("facebookfriend.fbname like '%" + str + "%' or ");
            sb6.append("facebookfriend.nickname like '%" + str + "%' or ");
            sb6.append("facebookfriend.username like '%" + str + "%' ) ");
        }
        s(Bi.f392869d.B("select facebookfriend.fbid,facebookfriend.fbname,facebookfriend.fbimgkey,facebookfriend.status,facebookfriend.username,facebookfriend.nickname,facebookfriend.nicknamepyinitial,facebookfriend.nicknamequanpin,facebookfriend.sex,facebookfriend.personalcard,facebookfriend.province,facebookfriend.city,facebookfriend.signature,facebookfriend.alias,facebookfriend.type,facebookfriend.email from facebookfriend  " + sb6.toString() + " order by  case when status = 100 then 0  when status = 102 then 3  when status = 101 then 1 else 2 end  , nicknamepyinitial", null));
        int[] iArr = new int[getCount()];
        this.f73739p = new boolean[getCount()];
        notifyDataSetChanged();
    }

    public long[] t() {
        int i17 = 0;
        for (boolean z17 : this.f73739p) {
            if (z17) {
                i17++;
            }
        }
        long[] jArr = new long[i17];
        int i18 = 0;
        for (int i19 = 0; i19 < getCount(); i19++) {
            if (this.f73739p[i19]) {
                jArr[i18] = ((r61.e0) getItem(i19)).f392842a;
                i18++;
            }
        }
        return jArr;
    }
}
