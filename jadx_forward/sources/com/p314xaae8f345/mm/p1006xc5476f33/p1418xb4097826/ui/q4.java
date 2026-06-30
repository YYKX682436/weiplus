package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes10.dex */
public final class q4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15026xb84ce7c3 f211253d;

    public q4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15026xb84ce7c3 activityC15026xb84ce7c3) {
        this.f211253d = activityC15026xb84ce7c3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int D1;
        int D12;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderCropAvatarUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15026xb84ce7c3 activityC15026xb84ce7c3 = this.f211253d;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(activityC15026xb84ce7c3.G, 300L);
        e60.g1 g1Var = new e60.g1();
        int i17 = activityC15026xb84ce7c3.f210094z;
        boolean z17 = true;
        if (i17 == 1) {
            g1Var.f331236g = ((java.lang.Number) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209347m).mo141623x754a37bb()).intValue();
            java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("FinderHeadCompressPicLevel");
            if (d17 != null && d17.length() != 0) {
                z17 = false;
            }
            if (z17) {
                D12 = 90;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderConfig", "FinderHeadCompressPicLevel=" + d17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d17);
                D12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(r26.n0.u0(d17).toString(), 0);
            }
            g1Var.f331235f = D12;
            g1Var.f331234e = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209365n;
            g1Var.f331233d = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209383o;
        } else if (i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            java.lang.String d18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("FinderProfileBgImgCompressPicLevel");
            if (d18 != null && d18.length() != 0) {
                z17 = false;
            }
            if (z17) {
                D1 = 70;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderConfig", "FinderProfileBgImgCompressPicLevel=" + d18);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d18);
                D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(r26.n0.u0(d18).toString(), 0);
            }
            g1Var.f331235f = D1;
            g1Var.f331234e = t70Var.x();
            g1Var.f331233d = t70Var.w();
        }
        g1Var.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183676l);
        java.lang.String str = activityC15026xb84ce7c3.f210090v;
        if (str == null) {
            str = "default_finder_crop_photo.tmp";
        }
        g1Var.f331231b = str;
        java.lang.String str2 = g1Var.f331230a + g1Var.f331231b;
        ot5.g.c(activityC15026xb84ce7c3.f210088t, "resultPath=" + str2 + " size: " + (com.p314xaae8f345.mm.vfs.w6.k(activityC15026xb84ce7c3.f210089u) / 1024));
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.C15652xb39b5f9d c15652xb39b5f9d = activityC15026xb84ce7c3.f210091w;
        if (c15652xb39b5f9d == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("roundCropLayout");
            throw null;
        }
        d33.t0 m63699xe90535c1 = c15652xb39b5f9d.m63699xe90535c1();
        ((d60.y) ((e60.j1) i95.n0.c(e60.j1.class))).getClass();
        z23.h hVar = new z23.h(g1Var);
        java.lang.String str3 = activityC15026xb84ce7c3.f210089u;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
        android.graphics.Matrix matrix = m63699xe90535c1.f307809d;
        android.graphics.Matrix matrix2 = m63699xe90535c1.f307808c;
        matrix.set(matrix2);
        android.graphics.Rect rect = m63699xe90535c1.f307811f;
        matrix.postTranslate(0.0f, -rect.top);
        java.util.Objects.toString(matrix2);
        java.util.Objects.toString(matrix);
        java.util.Objects.toString(rect);
        e60.i1.a(hVar, str3, 1, matrix, m63699xe90535c1.f307811f, m63699xe90535c1.f307814i, m63699xe90535c1.f307813h, 0, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p4(activityC15026xb84ce7c3, str2), 128, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderCropAvatarUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
