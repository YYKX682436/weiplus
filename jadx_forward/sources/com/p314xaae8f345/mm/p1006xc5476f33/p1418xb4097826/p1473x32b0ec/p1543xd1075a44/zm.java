package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class zm extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 {
    public final java.lang.String H;
    public android.widget.TextView I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.ImageView f202113J;
    public android.widget.TextView K;
    public android.widget.TextView L;
    public android.widget.TextView M;
    public r45.wg7 N;
    public boolean P;
    public java.lang.Integer Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm(android.content.Context context) {
        super(context, false, null, -1.0f, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.H = "FinderLiveLikeRecommendGuidePanel";
        this.N = r45.wg7.MMFinderLiveLikeSource_RealnameLikeBubble;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int A() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570446do0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int D() {
        return 8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int J() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void N(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        this.I = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.kb_);
        this.f202113J = (android.widget.ImageView) rootView.findViewById(com.p314xaae8f345.mm.R.id.a9m);
        this.K = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.khs);
        this.L = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.obc);
        this.M = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.b5d);
        android.widget.TextView textView = this.K;
        if (textView != null) {
            com.p314xaae8f345.mm.ui.fk.a(textView);
        }
        android.widget.TextView textView2 = this.L;
        if (textView2 != null) {
            com.p314xaae8f345.mm.ui.fk.a(textView2);
        }
        android.widget.TextView textView3 = this.M;
        if (textView3 != null) {
            com.p314xaae8f345.mm.ui.fk.a(textView3);
        }
        android.widget.TextView textView4 = this.I;
        if (textView4 != null) {
            com.p314xaae8f345.mm.ui.fk.a(textView4);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void S() {
        df2.cn cnVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb44;
        super.S();
        dk2.ef efVar = dk2.ef.f314905a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = dk2.ef.f314904J;
        if (c14197x319b1b9e == null || (cnVar = (df2.cn) c14197x319b1b9e.m56798x25fe639c(df2.cn.class)) == null || (c14227x4262fb44 = cnVar.f311431v) == null) {
            return;
        }
        c14227x4262fb44.mo7808x76db6cb1(new jz5.l(java.lang.Boolean.valueOf(!this.P), this.N));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void V(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 e0Var, boolean z17, int i17) {
        df2.cn cnVar;
        super.V(e0Var, z17, i17);
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_SHOW_LIKE_RECOMMEND_ROLE_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        android.widget.TextView textView = this.K;
        if (textView != null) {
            textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.xm(this));
        }
        android.widget.TextView textView2 = this.M;
        if (textView2 != null) {
            textView2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ym(this));
        }
        android.widget.TextView textView3 = this.I;
        if (textView3 != null) {
            java.lang.String l17 = c01.z1.l();
            if (!(!(l17.length() == 0))) {
                l17 = null;
            }
            if (l17 == null) {
                l17 = c01.z1.r();
            }
            textView3.setText(l17);
        }
        ng5.a.a(this.f202113J, c01.z1.r());
        e0(3);
        dk2.ef efVar = dk2.ef.f314905a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = dk2.ef.f314904J;
        if (c14197x319b1b9e == null || (cnVar = (df2.cn) c14197x319b1b9e.m56798x25fe639c(df2.cn.class)) == null) {
            return;
        }
        cnVar.t7(120, 40, null);
    }

    public final void e0(int i17) {
        df2.cn cnVar;
        df2.cn cnVar2;
        r45.wg7 wg7Var = this.N;
        if (wg7Var == r45.wg7.MMFinderLiveLikeSource_RealnameLikeBubble) {
            dk2.ef efVar = dk2.ef.f314905a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = dk2.ef.f314904J;
            if (c14197x319b1b9e == null || (cnVar2 = (df2.cn) c14197x319b1b9e.m56798x25fe639c(df2.cn.class)) == null) {
                return;
            }
            cnVar2.s7(i17, this.Q);
            return;
        }
        if (wg7Var == r45.wg7.MMFinderLiveLikeSource_ForwardRealnameLikeButton) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("element", 7);
            jSONObject.put("type", i17);
            dk2.ef efVar2 = dk2.ef.f314905a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e2 = dk2.ef.f314904J;
            jSONObject.put("friend_wx_username", (c14197x319b1b9e2 == null || (cnVar = (df2.cn) c14197x319b1b9e2.m56798x25fe639c(df2.cn.class)) == null) ? null : cnVar.o7());
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0.hj((ml2.r0) c17, ml2.b4.P1, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public boolean w() {
        return true;
    }
}
