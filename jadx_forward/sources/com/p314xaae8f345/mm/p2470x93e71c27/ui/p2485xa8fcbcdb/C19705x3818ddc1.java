package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb;

/* renamed from: com.tencent.mm.pluginsdk.ui.preference.FinderPreference */
/* loaded from: classes3.dex */
public final class C19705x3818ddc1 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public java.lang.String L;
    public final java.util.List M;
    public final java.util.List N;
    public android.view.View P;
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf Q;
    public r45.nw6 R;
    public boolean S;
    public android.view.View T;

    public C19705x3818ddc1(android.content.Context context) {
        this(context, null);
        this.Q = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void M() {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19705x3818ddc1.M():void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        java.util.List list = this.M;
        ((java.util.LinkedList) list).clear();
        ((java.util.LinkedList) list).add((android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.h9p));
        ((java.util.LinkedList) list).add((android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.h9q));
        ((java.util.LinkedList) list).add((android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.h9r));
        ((java.util.LinkedList) list).add((android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.h9s));
        java.util.List list2 = this.N;
        ((java.util.LinkedList) list2).clear();
        ((java.util.LinkedList) list2).add((android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.r_g));
        ((java.util.LinkedList) list2).add((android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.r_h));
        ((java.util.LinkedList) list2).add((android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.r_i));
        ((java.util.LinkedList) list2).add((android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.r_j));
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f564453rt);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.L)) {
            textView.setText(this.L);
            com.p314xaae8f345.mm.ui.fk.b(textView);
            android.content.Context context = this.f279303d;
            textView.setTextSize(0, i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561383gz));
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561319f7);
            textView.setLayoutParams(layoutParams);
        }
        this.P = view.findViewById(com.p314xaae8f345.mm.R.id.f564423qy);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.fuv);
        android.widget.TextView textView3 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565966qj3);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.e_c);
        r45.nw6 nw6Var = this.R;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.Q;
        if (nw6Var != null && nw6Var.m75939xb282bd08(1) == 0) {
            int size = this.R.m75941xfb821914(2).size();
            int size2 = this.R.m75941xfb821914(6).size();
            if (size > 0 || size2 > 0) {
                ((android.widget.LinearLayout.LayoutParams) ((android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.m38)).getLayoutParams()).topMargin = i65.a.b(abstractActivityC21394xb3d2c0cf, 19);
            } else {
                android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) textView.getLayoutParams();
                layoutParams2.topMargin = i65.a.b(abstractActivityC21394xb3d2c0cf, 0);
                layoutParams2.gravity = 16;
            }
        }
        for (int i17 = 0; i17 < ((java.util.LinkedList) list).size(); i17++) {
            ((android.widget.ImageView) ((java.util.LinkedList) list).get(i17)).getLayoutParams().height = i65.a.b(abstractActivityC21394xb3d2c0cf, 48);
        }
        for (int i18 = 0; i18 < ((java.util.LinkedList) list2).size(); i18++) {
            ((android.widget.ImageView) ((java.util.LinkedList) list2).get(i18)).getLayoutParams().height = i65.a.b(abstractActivityC21394xb3d2c0cf, 12);
        }
        r45.nw6 nw6Var2 = this.R;
        if (nw6Var2 != null && ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) nw6Var2.m75936x14adae67(0)) != null) {
            textView2.setText(((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) this.R.m75936x14adae67(0)).m76184x8010e5e4());
            textView2.setVisibility(0);
            if (((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) this.R.m75936x14adae67(0)).m76160xd133dfec() != null && ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) this.R.m75936x14adae67(0)).m76160xd133dfec().m76029xad9975ba() != null && ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) this.R.m75936x14adae67(0)).m76160xd133dfec().m76029xad9975ba().length() > 0) {
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                ya2.m1.f542044a.c(imageView, ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) this.R.m75936x14adae67(0)).m76160xd133dfec(), 1);
                textView3.setText(((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) this.R.m75936x14adae67(0)).m76160xd133dfec().m76029xad9975ba());
                textView3.setVisibility(0);
                float B = i65.a.B(abstractActivityC21394xb3d2c0cf) - i65.a.b(abstractActivityC21394xb3d2c0cf, 148);
                float measureText = textView2.getPaint().measureText(((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) this.R.m75936x14adae67(0)).m76184x8010e5e4());
                float measureText2 = textView3.getPaint().measureText(((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) this.R.m75936x14adae67(0)).m76160xd133dfec().m76029xad9975ba());
                float f17 = B / 2.0f;
                if (measureText >= f17 && measureText2 >= f17) {
                    int i19 = (int) f17;
                    textView2.setMaxWidth(i19);
                    textView3.setMaxWidth(i19);
                } else if (measureText > measureText2) {
                    textView2.setMaxWidth((int) (B - measureText2));
                } else if (imageView.getVisibility() == 0) {
                    textView3.setMaxWidth((int) ((B - measureText) - i65.a.b(abstractActivityC21394xb3d2c0cf, 24)));
                } else {
                    textView3.setMaxWidth((int) (B - measureText));
                }
            }
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        hashMap.put("finder_tab_context_id", b52.b.c());
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        hashMap.put("finder_context_id", b52.b.b());
        ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
        hashMap.put("comment_scene", a52.a.f83117l);
        if (((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) this.R.m75936x14adae67(0)) != null) {
            hashMap.put("author_finder_username", ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) this.R.m75936x14adae67(0)).m76197x6c03c64c());
            if (((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) this.R.m75936x14adae67(0)).m76160xd133dfec() != null) {
                hashMap.put("authentication_type", ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) this.R.m75936x14adae67(0)).m76160xd133dfec().m76029xad9975ba());
            }
        }
        hashMap.put("display_style", 1);
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.Tj(view, 40, 1, false);
        cy1.a aVar2 = (cy1.a) aVar.ik(view, 40, 25496);
        aVar2.pk(view, "wx_business_card_sph_inlet");
        aVar2.gk(view, hashMap);
        M();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        if (this.T == null) {
            android.view.View u17 = super.u(viewGroup);
            android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) this.f279303d.getSystemService("layout_inflater");
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.p314xaae8f345.mm.R.id.cgi);
            viewGroup2.removeAllViews();
            layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bze, viewGroup2);
            this.T = u17;
        }
        return this.T;
    }

    public C19705x3818ddc1(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.Q = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
    }

    public C19705x3818ddc1(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = "";
        this.M = new java.util.LinkedList();
        this.N = new java.util.LinkedList();
        this.R = null;
        this.S = false;
        this.Q = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
        this.L = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cfj);
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
    }
}
