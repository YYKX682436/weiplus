package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes11.dex */
public final class pb implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSelectContactUI f110417d;

    public pb(com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSelectContactUI finderLivePostSelectContactUI) {
        this.f110417d = finderLivePostSelectContactUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.o.g(it, "it");
        int i17 = com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSelectContactUI.T;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select_contact_step100,selectRoom:");
        com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSelectContactUI finderLivePostSelectContactUI = this.f110417d;
        java.util.ArrayList arrayList2 = finderLivePostSelectContactUI.E;
        sb6.append(arrayList2);
        sb6.append(", selectUser:");
        java.util.ArrayList arrayList3 = finderLivePostSelectContactUI.G;
        sb6.append(arrayList3);
        sb6.append(", selectAllContact:");
        java.util.ArrayList arrayList4 = finderLivePostSelectContactUI.C;
        sb6.append(arrayList4);
        com.tencent.mars.xlog.Log.i("FinderLivePostSelectContactUI", sb6.toString());
        boolean booleanExtra = finderLivePostSelectContactUI.getIntent().getBooleanExtra("KEY_PARAMS_IS_FROM_QR_CODE", false);
        java.lang.String stringExtra = finderLivePostSelectContactUI.getIntent().getStringExtra("KEY_PARAMS_QR_CODE_URL");
        if (booleanExtra) {
            finderLivePostSelectContactUI.enableOptionMenu(1, false);
            java.util.Iterator it6 = arrayList3.iterator();
            while (true) {
                boolean hasNext = it6.hasNext();
                arrayList = finderLivePostSelectContactUI.H;
                if (!hasNext) {
                    break;
                }
                java.lang.String str = (java.lang.String) it6.next();
                r45.oy5 oy5Var = new r45.oy5();
                oy5Var.set(0, str);
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
                if (n17 != null) {
                    java.lang.String d17 = n17.d1();
                    if (!(d17 == null || d17.length() == 0)) {
                        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                        java.lang.String d18 = n17.d1();
                        ((sg3.a) v0Var).getClass();
                        oy5Var.set(1, c01.a2.c(n17, d18));
                    }
                }
                arrayList.add(oy5Var);
            }
            pq5.g l17 = new ek2.u2(stringExtra, finderLivePostSelectContactUI.F, arrayList).l();
            l17.K(new com.tencent.mm.plugin.finder.feed.ui.ob(finderLivePostSelectContactUI));
            l17.f(finderLivePostSelectContactUI);
        } else {
            android.content.Intent intent = new android.content.Intent();
            r45.re2 re2Var = new r45.re2();
            re2Var.getList(2).addAll(arrayList4);
            re2Var.getList(0).addAll(arrayList2);
            re2Var.getList(1).addAll(arrayList3);
            intent.putExtra("KEY_PARAMS_WHITE_LIST", re2Var.toByteArray());
            finderLivePostSelectContactUI.setResult(-1, intent);
            finderLivePostSelectContactUI.finish();
            finderLivePostSelectContactUI.overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477877e1);
            finderLivePostSelectContactUI.x7();
            finderLivePostSelectContactUI.b7().notifyDataSetChanged();
        }
        return true;
    }
}
