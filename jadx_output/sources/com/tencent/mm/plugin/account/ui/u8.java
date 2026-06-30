package com.tencent.mm.plugin.account.ui;

/* loaded from: classes11.dex */
public class u8 extends com.tencent.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public int[] f74244o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f74245p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.account.ui.s8 f74246q;

    public u8(android.content.Context context, com.tencent.mm.ui.y9 y9Var) {
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
        com.tencent.mm.plugin.account.ui.t8 t8Var;
        r61.e0 e0Var = (r61.e0) getItem(i17);
        if (view == null) {
            t8Var = new com.tencent.mm.plugin.account.ui.t8();
            view2 = android.view.View.inflate(this.f212608e, com.tencent.mm.R.layout.aam, null);
            t8Var.f74218b = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.cfv);
            t8Var.f74217a = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.ldg);
            t8Var.f74219c = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.ldb);
            t8Var.f74220d = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.ldc);
            t8Var.f74221e = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.lde);
            t8Var.f74222f = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.ldj);
            view2.setTag(t8Var);
        } else {
            view2 = view;
            t8Var = (com.tencent.mm.plugin.account.ui.t8) view.getTag();
        }
        android.widget.TextView textView = t8Var.f74217a;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = this.f212608e;
        java.lang.String str = e0Var.f392843b;
        if (str == null) {
            str = "";
        }
        float textSize = t8Var.f74217a.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize));
        t8Var.f74221e.setVisibility(8);
        t8Var.f74222f.setVisibility(0);
        int i18 = this.f74244o[i17];
        if (i18 == 0) {
            if (e0Var.f392845d != 102) {
                com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
                java.lang.String str2 = e0Var.f392846e;
                if (str2 == null) {
                    str2 = "";
                }
                if (!Bi.h(str2)) {
                    t8Var.f74219c.setVisibility(8);
                    t8Var.f74220d.setVisibility(0);
                }
            }
            if (e0Var.f392845d == 102) {
                t8Var.f74219c.setVisibility(8);
                t8Var.f74220d.setVisibility(8);
                t8Var.f74222f.setVisibility(8);
            } else {
                t8Var.f74219c.setVisibility(0);
                t8Var.f74219c.setText(com.tencent.mm.R.string.ffb);
                t8Var.f74219c.setTextColor(this.f212608e.getResources().getColor(com.tencent.mm.R.color.f478610c5));
                t8Var.f74220d.setVisibility(8);
            }
        } else if (i18 == 2) {
            t8Var.f74220d.setVisibility(8);
            t8Var.f74219c.setVisibility(0);
            t8Var.f74219c.setText(com.tencent.mm.R.string.fff);
            t8Var.f74219c.setTextColor(this.f212608e.getResources().getColor(com.tencent.mm.R.color.f478611c6));
        }
        kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
        java.lang.String str3 = "" + e0Var.f392842a;
        ((com.tencent.mm.feature.avatar.w) c0Var).getClass();
        android.graphics.Bitmap a17 = com.tencent.mm.modelavatar.g.a(str3 + "@fb");
        if (a17 == null) {
            t8Var.f74218b.setImageDrawable(i65.a.i(this.f212608e, com.tencent.mm.R.raw.default_avatar));
        } else {
            t8Var.f74218b.setImageBitmap(a17);
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
        java.lang.String str = this.f74245p;
        Bi.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (str != null && str.length() > 0) {
            sb6.append(" where ( ");
            sb6.append("facebookfriend.fbname like '%" + str + "%' or ");
            sb6.append("facebookfriend.nickname like '%" + str + "%' or ");
            sb6.append("facebookfriend.username like '%" + str + "%' ) ");
        }
        s(Bi.f392869d.B("select facebookfriend.fbid,facebookfriend.fbname,facebookfriend.fbimgkey,facebookfriend.status,facebookfriend.username,facebookfriend.nickname,facebookfriend.nicknamepyinitial,facebookfriend.nicknamequanpin,facebookfriend.sex,facebookfriend.personalcard,facebookfriend.province,facebookfriend.city,facebookfriend.signature,facebookfriend.alias,facebookfriend.type,facebookfriend.email from facebookfriend  " + sb6.toString() + " order by  case when status = 100 then 0  when status = 102 then 3  when status = 101 then 1 else 2 end  , nicknamepyinitial", null));
        this.f74244o = new int[getCount()];
        com.tencent.mm.plugin.account.ui.s8 s8Var = this.f74246q;
        if (s8Var != null && this.f74245p != null) {
            int count = j().getCount();
            com.tencent.mm.plugin.account.ui.MMFBFriendUI mMFBFriendUI = ((com.tencent.mm.plugin.account.ui.a9) s8Var).f73715a;
            if (count > 0) {
                mMFBFriendUI.f73455h.setVisibility(8);
            } else {
                mMFBFriendUI.f73455h.setVisibility(0);
            }
        }
        notifyDataSetChanged();
    }
}
