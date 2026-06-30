package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes4.dex */
public final class qd extends zd4.m {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd(java.lang.ref.WeakReference uiWeakRef) {
        super(uiWeakRef);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiWeakRef, "uiWeakRef");
    }

    public final void a(android.content.Context context, java.lang.String str, boolean z17) {
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
        e4Var.b(z17 ? com.p314xaae8f345.mm.R.raw.f78821xb211a201 : com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
        e4Var.f293309c = str;
        e4Var.f293312f = true;
        e4Var.f293311e = false;
        e4Var.f293315i = new ca4.o(context, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.pd.f255710d);
        e4Var.c();
    }

    @Override // zd4.m, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        super.mo815x76e0bfae(i17, i18, str, m1Var);
        java.lang.Object obj = this.f553171d.get();
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18655x563a1fc7 activityC18655x563a1fc7 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18655x563a1fc7 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18655x563a1fc7) obj : null;
        if (activityC18655x563a1fc7 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "[onSceneEnd] activity null");
            return;
        }
        if (m1Var != null && m1Var.mo808xfb85f7b0() == 5293) {
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18655x563a1fc7.f255188J;
            if (((java.lang.Boolean) ((jz5.n) activityC18655x563a1fc7.F).mo141623x754a37bb()).booleanValue()) {
                activityC18655x563a1fc7.l7();
                java.lang.String stringExtra = activityC18655x563a1fc7.getIntent().getStringExtra("KEY_EDIT_VISIBILITY_FEED_ID");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                long longExtra = activityC18655x563a1fc7.getIntent().getLongExtra("KEY_EDIT_VISIBILITY_FROM_SCENE", 0L);
                if (i17 == 0 && i18 == 0) {
                    java.lang.String string = activityC18655x563a1fc7.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572119z7);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                    a(activityC18655x563a1fc7, string, true);
                    ((we0.w1) ((bi4.a1) i95.n0.c(bi4.a1.class))).wi(stringExtra, 1, longExtra);
                } else {
                    java.lang.String string2 = activityC18655x563a1fc7.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j_d);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                    a(activityC18655x563a1fc7, string2, false);
                    ((we0.w1) ((bi4.a1) i95.n0.c(bi4.a1.class))).wi(stringExtra, 0, longExtra);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateInTransform", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            activityC18655x563a1fc7.f252220u = false;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateInTransform", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        }
    }
}
