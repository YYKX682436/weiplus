package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes11.dex */
public class n6 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13572xe5ee659d f182824d;

    public n6(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13572xe5ee659d activityC13572xe5ee659d) {
        this.f182824d = activityC13572xe5ee659d;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13572xe5ee659d activityC13572xe5ee659d = this.f182824d;
        if (activityC13572xe5ee659d.f181956p) {
            activityC13572xe5ee659d.T6();
            return true;
        }
        java.util.ArrayList<java.lang.String> m79122xe175c322 = activityC13572xe5ee659d.f181950g.m79122xe175c322();
        java.lang.String trim = activityC13572xe5ee659d.f181950g.m79118xdb574fcd().trim();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(trim)) {
            m79122xe175c322.remove(trim);
            m79122xe175c322.add(trim);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTagEditUI", "[onMenuItemClick] tagList = " + m79122xe175c322);
        int intExtra = activityC13572xe5ee659d.getIntent().getIntExtra("key_fav_scene", 1);
        boolean z17 = activityC13572xe5ee659d.f181958r;
        java.util.ArrayList arrayList = activityC13572xe5ee659d.f181957q;
        boolean z18 = z17 && arrayList.size() == 0;
        boolean z19 = !activityC13572xe5ee659d.f181958r && activityC13572xe5ee659d.f181947d == null;
        if (z18 || z19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavTagEditUI", "[modTags] error return; mulitAddTagError = " + z18 + ", singleAddTagError = " + z19);
        } else {
            o72.r2 r2Var = activityC13572xe5ee659d.f181947d;
            if (r2Var != null && r2Var.f67643xc8a07680 == -1 && o72.x1.G()) {
                o72.r2 F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(activityC13572xe5ee659d.f181947d.f67645x88be67a1);
                int i17 = F.f67643xc8a07680;
                if (i17 == -1) {
                    v65.i.b(((t72.l) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).uj()).Y6(), null, new t72.j(new java.util.HashSet(m79122xe175c322), F.f67645x88be67a1, null), 1, null);
                } else {
                    activityC13572xe5ee659d.f181947d.f67643xc8a07680 = i17;
                }
            }
            if (o72.x1.G()) {
                if (activityC13572xe5ee659d.f181958r) {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(activityC13572xe5ee659d, "", "", true, false, null);
                    if (Q != null) {
                        Q.show();
                    }
                    gm0.j1.e().j(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.k6(activityC13572xe5ee659d, m79122xe175c322, Q));
                } else {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q2 = db5.e1.Q(activityC13572xe5ee659d, "", "", true, false, null);
                    if (Q2 != null) {
                        Q2.show();
                    }
                    gm0.j1.e().j(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.i6(activityC13572xe5ee659d, m79122xe175c322, Q2));
                }
                jx3.f.INSTANCE.d(29434, 7, 1);
            } else {
                if (activityC13572xe5ee659d.f181958r) {
                    for (int i18 = 0; i18 < arrayList.size(); i18++) {
                        o72.r2 r2Var2 = (o72.r2) arrayList.get(i18);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(r2Var2.f67653xef67d413.f466629e);
                        for (int i19 = 0; i19 < m79122xe175c322.size(); i19++) {
                            java.lang.String str = m79122xe175c322.get(i19);
                            if (!arrayList2.contains(str)) {
                                arrayList2.add(str);
                            }
                        }
                        java.util.Set T0 = r2Var2.T0(arrayList2);
                        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().mo9952xce0038c9(r2Var2, dm.i4.f66867x2a5c95c7);
                        o72.x1.R0(r2Var2);
                        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).tj().g(T0);
                        o72.x1.o0(r2Var2, intExtra);
                    }
                } else {
                    java.util.Set T02 = activityC13572xe5ee659d.f181947d.T0(m79122xe175c322);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().mo9952xce0038c9(activityC13572xe5ee659d.f181947d, dm.i4.f66867x2a5c95c7);
                    o72.x1.R0(activityC13572xe5ee659d.f181947d);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).tj().g(T02);
                    o72.x1.o0(activityC13572xe5ee659d.f181947d, intExtra);
                }
                jx3.f.INSTANCE.d(29434, 7, 0);
                java.util.ArrayList arrayList3 = new java.util.ArrayList(m79122xe175c322);
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5429x765899ef c5429x765899ef = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5429x765899ef();
                c5429x765899ef.f135773g.f89805a = arrayList3;
                c5429x765899ef.e();
            }
        }
        android.content.Intent intent = new android.content.Intent();
        if (activityC13572xe5ee659d.getIntent().getBooleanExtra("key_fav_need_show_tips", false)) {
            intent.putExtra("key_fav_need_show_tips", true);
            activityC13572xe5ee659d.setResult(-1, intent);
        }
        activityC13572xe5ee659d.finish();
        activityC13572xe5ee659d.mo48674x36654fab();
        return true;
    }
}
