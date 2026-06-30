package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes11.dex */
public final class pb implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14024xae8cf4a6 f191950d;

    public pb(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14024xae8cf4a6 activityC14024xae8cf4a6) {
        this.f191950d = activityC14024xae8cf4a6;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        java.util.ArrayList arrayList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14024xae8cf4a6.T;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select_contact_step100,selectRoom:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14024xae8cf4a6 activityC14024xae8cf4a6 = this.f191950d;
        java.util.ArrayList arrayList2 = activityC14024xae8cf4a6.E;
        sb6.append(arrayList2);
        sb6.append(", selectUser:");
        java.util.ArrayList arrayList3 = activityC14024xae8cf4a6.G;
        sb6.append(arrayList3);
        sb6.append(", selectAllContact:");
        java.util.ArrayList arrayList4 = activityC14024xae8cf4a6.C;
        sb6.append(arrayList4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePostSelectContactUI", sb6.toString());
        boolean booleanExtra = activityC14024xae8cf4a6.getIntent().getBooleanExtra("KEY_PARAMS_IS_FROM_QR_CODE", false);
        java.lang.String stringExtra = activityC14024xae8cf4a6.getIntent().getStringExtra("KEY_PARAMS_QR_CODE_URL");
        if (booleanExtra) {
            activityC14024xae8cf4a6.m78500x43e00957(1, false);
            java.util.Iterator it6 = arrayList3.iterator();
            while (true) {
                boolean hasNext = it6.hasNext();
                arrayList = activityC14024xae8cf4a6.H;
                if (!hasNext) {
                    break;
                }
                java.lang.String str = (java.lang.String) it6.next();
                r45.oy5 oy5Var = new r45.oy5();
                oy5Var.set(0, str);
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
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
            pq5.g l17 = new ek2.u2(stringExtra, activityC14024xae8cf4a6.F, arrayList).l();
            l17.K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ob(activityC14024xae8cf4a6));
            l17.f(activityC14024xae8cf4a6);
        } else {
            android.content.Intent intent = new android.content.Intent();
            r45.re2 re2Var = new r45.re2();
            re2Var.m75941xfb821914(2).addAll(arrayList4);
            re2Var.m75941xfb821914(0).addAll(arrayList2);
            re2Var.m75941xfb821914(1).addAll(arrayList3);
            intent.putExtra("KEY_PARAMS_WHITE_LIST", re2Var.mo14344x5f01b1f6());
            activityC14024xae8cf4a6.setResult(-1, intent);
            activityC14024xae8cf4a6.finish();
            activityC14024xae8cf4a6.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559410e1);
            activityC14024xae8cf4a6.x7();
            activityC14024xae8cf4a6.b7().notifyDataSetChanged();
        }
        return true;
    }
}
