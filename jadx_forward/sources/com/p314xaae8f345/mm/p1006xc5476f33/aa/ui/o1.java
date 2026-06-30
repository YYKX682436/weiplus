package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes11.dex */
public class o1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11344x4cd4d8d8 f154287d;

    public o1(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11344x4cd4d8d8 activityC11344x4cd4d8d8) {
        this.f154287d = activityC11344x4cd4d8d8;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11344x4cd4d8d8 activityC11344x4cd4d8d8 = this.f154287d;
        if (activityC11344x4cd4d8d8.I.size() > activityC11344x4cd4d8d8.f154004J) {
            db5.e1.s(activityC11344x4cd4d8d8.mo55332x76847179(), activityC11344x4cd4d8d8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_s, java.lang.Long.valueOf(activityC11344x4cd4d8d8.f154004J)), "");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.d(13721, 2, 8);
            g0Var.d(13722, 3);
            return true;
        }
        if (activityC11344x4cd4d8d8.I.size() < 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13721, 2, 9);
            return true;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (activityC11344x4cd4d8d8.A7()) {
            linkedList.addAll(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11344x4cd4d8d8.w7(activityC11344x4cd4d8d8));
        } else {
            linkedList.addAll(activityC11344x4cd4d8d8.I);
        }
        activityC11344x4cd4d8d8.setResult(-1, activityC11344x4cd4d8d8.getIntent().putExtra("Select_Contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(linkedList, ",")));
        activityC11344x4cd4d8d8.finish();
        activityC11344x4cd4d8d8.mo48674x36654fab();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13721, 2, 8);
        return true;
    }
}
