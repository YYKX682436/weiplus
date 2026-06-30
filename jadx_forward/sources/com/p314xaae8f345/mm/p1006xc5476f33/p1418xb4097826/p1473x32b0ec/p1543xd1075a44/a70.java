package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class a70 implements eg2.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.u70 f199273a;

    public a70(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.u70 u70Var) {
        this.f199273a = u70Var;
    }

    public void a() {
        android.view.View S6;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLivePostCoverWidget", "cover needs enhance");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.u70 u70Var = this.f199273a;
        if (u70Var.e7()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sl slVar = u70Var.f201488n;
            if ((slVar != null && slVar.isShowing()) || (S6 = u70Var.S6(com.p314xaae8f345.mm.R.id.f566298fg5)) == null) {
                return;
            }
            if (!S6.isShown()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLivePostCoverWidget", "showEnhanceBubble: skip, coverLayout is not visible");
                return;
            }
            if (u70Var.f201490p) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLivePostCoverWidget", "showEnhanceBubble: skip, bubble already shown");
                return;
            }
            java.lang.String d76 = u70Var.d7();
            eg2.s0 s0Var = u70Var.f201489o;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d76, s0Var != null ? s0Var.f334165i : null)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showEnhanceBubble: skip, cover url mismatch, current=");
                sb6.append(d76);
                sb6.append(", checking=");
                eg2.s0 s0Var2 = u70Var.f201489o;
                sb6.append(s0Var2 != null ? s0Var2.f334165i : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLivePostCoverWidget", sb6.toString());
                return;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_PREVIOUS_COVER_ENHANCE_GUIDE_CNT_INT_SYNC;
            int r17 = c17.r(u3Var, 0);
            ae2.in inVar = ae2.in.f85221a;
            int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85330k8).mo141623x754a37bb()).r()).intValue();
            if (r17 >= intValue) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLivePostCoverWidget", "showEnhanceBubble: skip, guideCnt=" + r17 + " >= guideLimit=" + intValue);
                return;
            }
            u70Var.f201490p = true;
            u70Var.h7(te2.k3.f499695e);
            int i17 = r17 + 1;
            gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(i17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLivePostCoverWidget", "showEnhanceBubble: guideCnt=" + i17 + '/' + intValue);
            android.content.res.Resources resources = u70Var.O6().getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
            int i18 = u70Var.O6().getResources().getDisplayMetrics().widthPixels;
            int dimensionPixelSize3 = resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561266dq);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sl slVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sl(u70Var.O6());
            java.lang.String string = u70Var.O6().getString(com.p314xaae8f345.mm.R.C30867xcad56011.orw);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            slVar2.c(string);
            slVar2.f201341l = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.kl.f200378e;
            slVar2.f201344o = true;
            int i19 = i18 - (dimensionPixelSize3 * 2);
            android.widget.TextView textView = slVar2.f201331b;
            textView.setMaxWidth(i19);
            slVar2.f201333d = S6;
            slVar2.setOutsideTouchable(true);
            slVar2.setFocusable(true);
            textView.setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
            slVar2.f201338i = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.s70(u70Var);
            slVar2.f201337h = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t70(u70Var);
            slVar2.b();
            slVar2.d(u70Var.f201491q);
            u70Var.f201488n = slVar2;
        }
    }
}
