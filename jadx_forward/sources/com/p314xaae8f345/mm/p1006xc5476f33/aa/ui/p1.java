package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes11.dex */
public class p1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.r1 f154298d;

    public p1(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.r1 r1Var) {
        this.f154298d = r1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.r1 r1Var = this.f154298d;
        long size = r1Var.f154316d.I.size();
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11344x4cd4d8d8 activityC11344x4cd4d8d8 = r1Var.f154316d;
        if (size > activityC11344x4cd4d8d8.f154004J) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC11344x4cd4d8d8.mo55332x76847179();
            com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11344x4cd4d8d8 activityC11344x4cd4d8d82 = r1Var.f154316d;
            db5.e1.s(mo55332x76847179, activityC11344x4cd4d8d82.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_s, java.lang.Long.valueOf(activityC11344x4cd4d8d82.f154004J)), "");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13722, 3);
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (r1Var.f154316d.A7()) {
            linkedList.addAll(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11344x4cd4d8d8.w7(r1Var.f154316d));
        } else {
            linkedList.addAll(r1Var.f154316d.I);
        }
        java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(linkedList, ",");
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11344x4cd4d8d8 activityC11344x4cd4d8d83 = r1Var.f154316d;
        activityC11344x4cd4d8d83.setResult(-1, activityC11344x4cd4d8d83.getIntent().putExtra("Select_Contact", c17));
        r1Var.f154316d.finish();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13721, 2, 11);
    }
}
