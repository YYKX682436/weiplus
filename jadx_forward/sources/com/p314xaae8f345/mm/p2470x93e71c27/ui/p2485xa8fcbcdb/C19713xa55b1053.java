package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb;

/* renamed from: com.tencent.mm.pluginsdk.ui.preference.SnsPreference */
/* loaded from: classes4.dex */
public final class C19713xa55b1053 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb implements com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.s {
    public final java.lang.String L;
    public android.widget.LinearLayout M;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22636xb1ac8c07 N;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22636xb1ac8c07 P;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22636xb1ac8c07 Q;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22636xb1ac8c07 R;
    public android.widget.ImageView S;
    public android.widget.ImageView T;
    public android.widget.ImageView U;
    public android.widget.ImageView V;
    public com.p314xaae8f345.mm.p2621x8fb0427b.s7 W;
    public final int X;
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf Y;
    public final java.util.List Z;

    /* renamed from: p0, reason: collision with root package name */
    public final y35.e0 f272605p0;

    /* renamed from: x0, reason: collision with root package name */
    public android.view.View f272606x0;

    public C19713xa55b1053(android.content.Context context) {
        this(context, null);
        this.Y = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
    }

    public void M(java.lang.String str) {
        if (str == null) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str, true);
        com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var = com.p314xaae8f345.mm.p2621x8fb0427b.s7.f276836g;
        if (n17 != null && ((int) n17.E2) > 0 && n17.r2()) {
            this.W = s7Var;
        } else if (str.equals(c01.z1.r())) {
            this.W = s7Var;
        } else {
            this.W = com.p314xaae8f345.mm.p2621x8fb0427b.s7.f276837h;
        }
        ((ku5.t0) ku5.t0.f394148d).g(new y35.d0(this, str));
    }

    public void N(java.util.List list) {
        if (this.M != null) {
            if (list.isEmpty()) {
                this.M.setVisibility(8);
            } else {
                this.M.setVisibility(0);
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22636xb1ac8c07 c22636xb1ac8c07 = this.N;
        if (c22636xb1ac8c07 != null) {
            c22636xb1ac8c07.m81425x8d516947(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw);
            this.N.setVisibility(8);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22636xb1ac8c07 c22636xb1ac8c072 = this.P;
        if (c22636xb1ac8c072 != null) {
            c22636xb1ac8c072.m81425x8d516947(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw);
            this.P.setVisibility(8);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22636xb1ac8c07 c22636xb1ac8c073 = this.Q;
        if (c22636xb1ac8c073 != null) {
            c22636xb1ac8c073.m81425x8d516947(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw);
            this.Q.setVisibility(8);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22636xb1ac8c07 c22636xb1ac8c074 = this.R;
        if (c22636xb1ac8c074 != null) {
            c22636xb1ac8c074.m81425x8d516947(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw);
            this.R.setVisibility(8);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22636xb1ac8c07 c22636xb1ac8c075 = this.N;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.Y;
        if (c22636xb1ac8c075 != null && list.size() >= 1) {
            this.N.setVisibility(0);
            if (fp.i.b()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1) p94.w0.d()).e0((r45.jj4) list.get(0), this.N, abstractActivityC21394xb3d2c0cf.hashCode(), this.W);
                this.S.setVisibility(((r45.jj4) list.get(0)).f459389e == 6 ? 0 : 8);
            } else {
                this.N.m81425x8d516947(com.p314xaae8f345.mm.R.C30861xcebc809e.bkq);
                this.S.setVisibility(8);
            }
        }
        if (this.P != null && list.size() >= 2) {
            this.P.setVisibility(0);
            if (fp.i.b()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1) p94.w0.d()).e0((r45.jj4) list.get(1), this.P, abstractActivityC21394xb3d2c0cf.hashCode(), this.W);
                this.T.setVisibility(((r45.jj4) list.get(1)).f459389e == 6 ? 0 : 8);
            } else {
                this.P.m81425x8d516947(com.p314xaae8f345.mm.R.C30861xcebc809e.bkq);
            }
        }
        if (this.Q != null && list.size() >= 3) {
            this.Q.setVisibility(0);
            if (fp.i.b()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1) p94.w0.d()).e0((r45.jj4) list.get(2), this.Q, abstractActivityC21394xb3d2c0cf.hashCode(), this.W);
                this.U.setVisibility(((r45.jj4) list.get(2)).f459389e == 6 ? 0 : 8);
            } else {
                this.Q.m81425x8d516947(com.p314xaae8f345.mm.R.C30861xcebc809e.bkq);
            }
        }
        if (this.R == null || list.size() < 4) {
            return;
        }
        this.R.setVisibility(0);
        if (!fp.i.b()) {
            this.R.m81425x8d516947(com.p314xaae8f345.mm.R.C30861xcebc809e.bkq);
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1) p94.w0.d()).e0((r45.jj4) list.get(3), this.R, abstractActivityC21394xb3d2c0cf.hashCode(), this.W);
            this.V.setVisibility(((r45.jj4) list.get(3)).f459389e == 6 ? 0 : 8);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        this.M = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.u3y);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22636xb1ac8c07 c22636xb1ac8c07 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22636xb1ac8c07) view.findViewById(com.p314xaae8f345.mm.R.id.h9p);
        this.N = c22636xb1ac8c07;
        int i17 = this.X;
        c22636xb1ac8c07.m81420x52b5721c(i17);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22636xb1ac8c07 c22636xb1ac8c072 = this.N;
        y35.e0 e0Var = this.f272605p0;
        c22636xb1ac8c072.mo46895x706225d7(e0Var);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22636xb1ac8c07 c22636xb1ac8c073 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22636xb1ac8c07) view.findViewById(com.p314xaae8f345.mm.R.id.h9q);
        this.P = c22636xb1ac8c073;
        c22636xb1ac8c073.m81420x52b5721c(i17);
        this.P.mo46895x706225d7(e0Var);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22636xb1ac8c07 c22636xb1ac8c074 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22636xb1ac8c07) view.findViewById(com.p314xaae8f345.mm.R.id.h9r);
        this.Q = c22636xb1ac8c074;
        c22636xb1ac8c074.m81420x52b5721c(i17);
        this.Q.mo46895x706225d7(e0Var);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22636xb1ac8c07 c22636xb1ac8c075 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22636xb1ac8c07) view.findViewById(com.p314xaae8f345.mm.R.id.h9s);
        this.R = c22636xb1ac8c075;
        c22636xb1ac8c075.m81420x52b5721c(i17);
        this.R.mo46895x706225d7(e0Var);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f564453rt);
        java.lang.String str = this.L;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        android.content.Context context = this.f279303d;
        if (!K0) {
            textView.setText(str);
            com.p314xaae8f345.mm.ui.fk.b(textView);
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561319f7);
            textView.setLayoutParams(layoutParams);
        }
        this.S = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.nat);
        this.T = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.nau);
        this.U = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.nav);
        this.V = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.naw);
        this.S.setVisibility(8);
        this.T.setVisibility(8);
        this.U.setVisibility(8);
        this.V.setVisibility(8);
        java.util.List list = this.Z;
        N(list);
        if (list == null) {
            return;
        }
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hng, java.lang.Integer.valueOf(((java.util.LinkedList) list).size()));
        if (str == null) {
            view.setContentDescription(string);
            return;
        }
        view.setContentDescription(str + string);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        if (this.f272606x0 == null) {
            android.view.View u17 = super.u(viewGroup);
            android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) this.f279303d.getSystemService("layout_inflater");
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.p314xaae8f345.mm.R.id.cgi);
            viewGroup2.removeAllViews();
            layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bz_, viewGroup2);
            this.f272606x0 = u17;
        }
        return this.f272606x0;
    }

    public C19713xa55b1053(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.Y = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
    }

    public C19713xa55b1053(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = "";
        this.M = null;
        this.N = null;
        this.P = null;
        this.Q = null;
        this.R = null;
        this.S = null;
        this.T = null;
        this.U = null;
        this.V = null;
        this.X = 255;
        this.Z = new java.util.LinkedList();
        this.f272605p0 = new y35.e0();
        this.Y = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
        this.L = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bhd);
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
    }
}
