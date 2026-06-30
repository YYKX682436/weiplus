package s82;

/* loaded from: classes9.dex */
public class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s82.c0 f486264d;

    public a0(s82.c0 c0Var) {
        this.f486264d = c0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        long j17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/listitem/FavMusicMvListItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean b17 = fp.i.b();
        s82.c0 c0Var = this.f486264d;
        if (!b17) {
            db5.t7.k(c0Var.f486272c.f182917a, null);
            yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/listitem/FavMusicMvListItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (view.getTag() instanceof o72.r2) {
            o72.r2 r2Var = (o72.r2) view.getTag();
            r45.jq0 jq0Var = r2Var.f67640x5ab01132.f452495d;
            r45.gp0 J2 = o72.x1.J(r2Var);
            if (J2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavBaseListItem", "data item is null");
                yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/listitem/FavMusicMvListItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (!o72.x1.k0(J2)) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.SessionMusic.k(view.getContext(), null)) {
                    yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/listitem/FavMusicMvListItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                int E = o72.x1.E(r2Var);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavBaseListItem", "favTingType = " + E);
                if (!o72.x1.F() || E == o72.x1.f425054g) {
                    str3 = "(Landroid/view/View;)V";
                    str4 = "onClick";
                    j17 = 9;
                    java.lang.String str5 = jq0Var.f459583w;
                    java.lang.Boolean bool = java.lang.Boolean.TRUE;
                    bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
                    o72.x1.u0(J2, str5, bool, 1500, r2Var.f67643xc8a07680 + "", java.lang.Boolean.FALSE, null, null);
                } else {
                    java.lang.String str6 = jq0Var.f459583w;
                    java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                    bw5.ar0 ar0Var2 = bw5.ar0.TingScene_UnDefined;
                    str3 = "(Landroid/view/View;)V";
                    str4 = "onClick";
                    j17 = 9;
                    o72.x1.v0(J2, str6, bool2, 1500, r2Var.f67643xc8a07680 + "", E);
                }
                s82.c0.l(c0Var, (android.widget.ImageView) view);
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6773x3bf523d8 c6773x3bf523d8 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6773x3bf523d8();
                c6773x3bf523d8.f140989j = 1L;
                c6773x3bf523d8.f140990k = j17;
                ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
                zy2.oc.b(c6773x3bf523d8);
                str = str3;
                str2 = str4;
                yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/listitem/FavMusicMvListItem$1", "android/view/View$OnClickListener", str2, str);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavBaseListItem", "same song, do release");
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6773x3bf523d8 c6773x3bf523d82 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6773x3bf523d8();
            c6773x3bf523d82.f140989j = 2L;
            c6773x3bf523d82.f140990k = 9L;
            ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
            zy2.oc.b(c6773x3bf523d82);
            ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).pj();
            s82.c0.l(c0Var, null);
        }
        str = "(Landroid/view/View;)V";
        str2 = "onClick";
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/listitem/FavMusicMvListItem$1", "android/view/View$OnClickListener", str2, str);
    }
}
