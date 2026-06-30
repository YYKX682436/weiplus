package s82;

/* loaded from: classes9.dex */
public final class r0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra f486366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s82.s0 f486367e;

    public r0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra raVar, s82.s0 s0Var) {
        this.f486366d = raVar;
        this.f486367e = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View v17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        s82.s0 s0Var;
        long j17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/listitem/FavTingMusicListItem$musicController$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        if (!fp.i.b()) {
            db5.t7.k(this.f486366d.f182917a, null);
            yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/listitem/FavTingMusicListItem$musicController$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (v17.getTag() instanceof o72.r2) {
            java.lang.Object tag = v17.getTag();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.fav.api.FavItemInfo");
            o72.r2 r2Var = (o72.r2) tag;
            r45.jq0 jq0Var = r2Var.f67640x5ab01132.f452495d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jq0Var, "getSourceItem(...)");
            r45.gp0 J2 = o72.x1.J(r2Var);
            if (J2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavTingMusicListItem", "data item is null");
                yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/listitem/FavTingMusicListItem$musicController$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            java.lang.String str5 = jq0Var.f459583w;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            java.lang.String m13170xcc16feb8 = o72.x1.Z(J2, str5, bool).d().m13170xcc16feb8();
            boolean k07 = o72.x1.k0(J2);
            s82.s0 s0Var2 = this.f486367e;
            if (!k07) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.SessionMusic.k(v17.getContext(), null)) {
                    yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/listitem/FavTingMusicListItem$musicController$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                int E = o72.x1.E(r2Var);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTingMusicListItem", "fav ting type = " + E);
                if (!o72.x1.F() || E == o72.x1.f425054g) {
                    str3 = "(Landroid/view/View;)V";
                    str4 = "onClick";
                    s0Var = s0Var2;
                    j17 = 9;
                    java.lang.String str6 = jq0Var.f459583w;
                    bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
                    o72.x1.u0(J2, str6, bool, 1500, java.lang.String.valueOf(r2Var.f67643xc8a07680), java.lang.Boolean.FALSE, null, null);
                } else {
                    java.lang.String str7 = jq0Var.f459583w;
                    bw5.ar0 ar0Var2 = bw5.ar0.TingScene_UnDefined;
                    s0Var = s0Var2;
                    str3 = "(Landroid/view/View;)V";
                    str4 = "onClick";
                    j17 = 9;
                    o72.x1.v0(J2, str7, bool, 1500, r2Var.f67643xc8a07680 + "", E);
                }
                s82.s0.l(s0Var, (android.widget.ImageView) v17);
                i95.m c17 = i95.n0.c(qk.k6.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                if (qk.k6.w4((qk.k6) c17, m13170xcc16feb8, null, null, 6, null) != qk.p9.f445846e) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6773x3bf523d8 c6773x3bf523d8 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6773x3bf523d8();
                    c6773x3bf523d8.f140989j = 1L;
                    c6773x3bf523d8.f140990k = j17;
                    ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
                    zy2.oc.b(c6773x3bf523d8);
                }
                str = str3;
                str2 = str4;
                yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/listitem/FavTingMusicListItem$musicController$1", "android/view/View$OnClickListener", str2, str);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTingMusicListItem", "same song, do release");
            i95.m c18 = i95.n0.c(qk.k6.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            if (qk.k6.w4((qk.k6) c18, m13170xcc16feb8, null, null, 6, null) != qk.p9.f445846e) {
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6773x3bf523d8 c6773x3bf523d82 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6773x3bf523d8();
                c6773x3bf523d82.f140989j = 2L;
                c6773x3bf523d82.f140990k = 9L;
                ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
                zy2.oc.b(c6773x3bf523d82);
            }
            i95.m c19 = i95.n0.c(qk.k6.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
            qk.k6.Xg((qk.k6) c19, null, m13170xcc16feb8, null, null, 13, null);
            s82.s0.l(s0Var2, null);
        }
        str = "(Landroid/view/View;)V";
        str2 = "onClick";
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/listitem/FavTingMusicListItem$musicController$1", "android/view/View$OnClickListener", str2, str);
    }
}
