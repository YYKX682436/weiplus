package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class ko extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final int f185381e;

    /* renamed from: f, reason: collision with root package name */
    public final int f185382f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.ViewOutlineProvider f185383g;

    public ko(boolean z17, tu2.b itemViewConfig, int i17, int i18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((i19 & 2) != 0 ? new tu2.b() : itemViewConfig, "itemViewConfig");
        this.f185381e = i17;
        this.f185382f = i18;
        this.f185383g = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.jo();
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.aif;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        jo2.g item = (jo2.g) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.e0c);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.o_w);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ote);
        android.view.ViewGroup.LayoutParams layoutParams = p17.getLayoutParams();
        int i19 = this.f185381e;
        layoutParams.width = i19;
        layoutParams.height = this.f185382f;
        p17.setLayoutParams(layoutParams);
        android.content.Context context = holder.f374654e;
        boolean z18 = item.f382420e;
        java.lang.String string = z18 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.en9) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.en_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        android.view.ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        layoutParams2.width = i19;
        textView.setLayoutParams(layoutParams2);
        textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.emy, string, java.lang.String.valueOf(item.f382419d)));
        long j17 = item.f382423h;
        if (j17 != 0) {
            android.view.ViewGroup.LayoutParams layoutParams3 = textView2.getLayoutParams();
            layoutParams3.width = i19;
            textView2.setLayoutParams(layoutParams3);
            textView2.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m8j, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.k(context, j17 * 1000)));
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
        if (z18) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(holder.f3639x46306858, "remaining_live_playback");
        } else {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(holder.f3639x46306858, "remaining_video");
        }
        android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.ckl);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p18, "getView(...)");
        android.view.View p19 = holder.p(com.p314xaae8f345.mm.R.id.ckm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p19, "getView(...)");
        java.util.ArrayList<android.widget.ImageView> d17 = kz5.c0.d(p18, p19);
        for (android.widget.ImageView imageView : d17) {
            imageView.setOutlineProvider(this.f185383g);
            imageView.setClipToOutline(true);
        }
        d17.add(0, holder.p(com.p314xaae8f345.mm.R.id.ckk));
        java.util.LinkedList linkedList = item.f382422g;
        if (linkedList != null) {
            int i27 = 0;
            for (java.lang.Object obj : linkedList) {
                int i28 = i27 + 1;
                if (i27 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.lc5 lc5Var = (r45.lc5) obj;
                mn2.q3 q3Var = new mn2.q3(lc5Var.f460838d + "?token=" + lc5Var.f460839e, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f);
                mn2.g1 g1Var = mn2.g1.f411508a;
                vo0.d e17 = g1Var.e();
                java.lang.Object obj2 = d17.get(i27);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                e17.c(q3Var, (android.widget.ImageView) obj2, g1Var.h(mn2.f1.B));
                i27 = i28;
            }
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(holder.f3639x46306858, 40, 25496);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view = holder.f3639x46306858;
        jz5.l[] lVarArr = new jz5.l[6];
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        eo2.b bVar = (eo2.b) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(eo2.b.class);
        lVarArr[0] = new jz5.l("member_inlet_source", java.lang.Integer.valueOf(bVar != null ? bVar.f337091d : 0));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e18 = iyVar.e(context);
        lVarArr[1] = new jz5.l("comment_scene", e18 != null ? java.lang.Integer.valueOf(e18.f216913n) : null);
        lVarArr[2] = new jz5.l("finder_username", item.f382421f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e19 = iyVar.e(context);
        lVarArr[3] = new jz5.l("finder_tab_context_id", e19 != null ? e19.f216919r : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e27 = iyVar.e(context);
        lVarArr[4] = new jz5.l("finder_context_id", e27 != null ? e27.f216915p : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e28 = iyVar.e(context);
        lVarArr[5] = new jz5.l("behaviour_session_id", e28 != null ? e28.f216918q : null);
        ((cy1.a) rVar).gk(view, kz5.c1.k(lVarArr));
    }
}
