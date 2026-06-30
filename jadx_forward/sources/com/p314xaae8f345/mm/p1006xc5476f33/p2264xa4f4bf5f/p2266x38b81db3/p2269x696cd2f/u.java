package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f;

/* loaded from: classes11.dex */
public final class u extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f254907e;

    /* renamed from: f, reason: collision with root package name */
    public final int f254908f;

    /* renamed from: g, reason: collision with root package name */
    public final int f254909g;

    /* renamed from: h, reason: collision with root package name */
    public final int f254910h;

    /* renamed from: i, reason: collision with root package name */
    public final int f254911i;

    /* renamed from: m, reason: collision with root package name */
    public final float f254912m;

    /* renamed from: n, reason: collision with root package name */
    public final android.content.Context f254913n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.m0 f254914o;

    public u(android.content.Context activity) {
        int i17;
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        int i19 = 0;
        if (valueOf != null) {
            i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(valueOf.intValue());
        } else {
            i17 = 0;
        }
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30860x5b28f31.f561253dd);
        if (valueOf2 != null) {
            i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(valueOf2.intValue());
        } else {
            i18 = 0;
        }
        this.f254908f = i18;
        this.f254909g = i17;
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        if (valueOf3 != null) {
            i19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(valueOf3.intValue());
        }
        this.f254910h = i19;
        this.f254911i = com.p314xaae8f345.mm.ui.bh.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).f278668a;
        this.f254912m = 1.3f;
        this.f254913n = activity;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dop;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.d item = (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.d) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onBindViewHolder] username = ");
        java.lang.String userName = item.f254798e;
        sb6.append(userName);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.SquareSameTopicFriendItemConvert", sb6.toString());
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(userName, "arrow@name");
        int i19 = this.f254908f;
        int i27 = this.f254911i;
        if (b17) {
            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.hy7);
            if (relativeLayout != null) {
                relativeLayout.removeAllViews();
                android.content.Context context = relativeLayout.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18645xc7db3eec c18645xc7db3eec = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18645xc7db3eec(context, null, 0, 6, null);
                android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(i27 - i19, -2);
                relativeLayout.addView(c18645xc7db3eec, layoutParams);
                layoutParams.addRule(13, -1);
                relativeLayout.setLayoutParams(layoutParams);
                c18645xc7db3eec.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.s(item, this));
                c18645xc7db3eec.m71851xd7274436(item.f254801h);
                return;
            }
            return;
        }
        mj4.h hVar = item.f254800g;
        if (hVar != null) {
            android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.hy7);
            relativeLayout2.removeAllViews();
            android.content.Context context2 = holder.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            bi4.k1 k1Var = new bi4.k1();
            k1Var.e(true);
            k1Var.f(true);
            k1Var.q(true);
            int i28 = 0;
            k1Var.j(false);
            k1Var.f102598e = false;
            k1Var.f102600g = 12;
            k1Var.r(true);
            k1Var.d(false);
            k1Var.i(false);
            k1Var.c(true);
            k1Var.g(false);
            k1Var.h(true);
            k1Var.o(true);
            k1Var.n(true);
            k1Var.m(true);
            k1Var.f102597d |= 1024;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.m0 m0Var = this.f254914o;
            android.content.Context context3 = this.f254913n;
            if (m0Var == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.m0 m0Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.m0(context3, k1Var);
                this.f254914o = m0Var2;
                m0Var2.K = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.r(context2);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.m0 m0Var3 = this.f254914o;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m0Var3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context3, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context3 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.od odVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.od) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context3).a(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.od.class);
            odVar.getClass();
            ((java.util.HashSet) odVar.f255685d).add(m0Var3);
            int i29 = (((i27 - i19) - this.f254909g) - this.f254910h) / 2;
            relativeLayout2.setTag("status_avatar_".concat(userName));
            android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(i29, (int) (i29 * this.f254912m));
            layoutParams2.addRule(13, -1);
            android.view.View view = m0Var3.f255599f;
            relativeLayout2.addView(view, layoutParams2);
            bi4.p0.U2(m0Var3, item.f254798e, item.f254800g, null, 4, null);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
            if (valueOf != null) {
                i28 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(valueOf.intValue());
            }
            relativeLayout2.setOutlineProvider(new bk4.f2(i28));
            relativeLayout2.setClipToOutline(true);
            view.setTag("status_avatar_".concat(userName));
            m0Var3.f255596J = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.t(holder, item, view, this);
            mj4.k kVar = (mj4.k) hVar;
            si4.a.k(ai4.m0.f86706a.G(), kVar.o(), kVar.l(), false, 4, null);
            qj4.s.m(qj4.s.f445491a, this.f254913n, 1L, null, item.f254800g, 0L, 0L, 0L, 0L, null, null, 12L, 1012, null);
        }
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
