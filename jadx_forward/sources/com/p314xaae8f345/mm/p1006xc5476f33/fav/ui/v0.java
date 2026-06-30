package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class v0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13563x72179722 f183012d;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13563x72179722 activityC13563x72179722) {
        this.f183012d = activityC13563x72179722;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        long m17 = this.f183012d.f181840e.m();
        java.util.List k17 = this.f183012d.f181840e.k(true);
        o72.x1.I0(o72.x1.b0() - m17);
        if (k17.isEmpty()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.util.LinkedList linkedList = (java.util.LinkedList) k17;
        g0Var.d(14110, java.lang.Integer.valueOf(this.f183012d.f181849q), java.lang.Integer.valueOf(linkedList.size()), java.lang.Integer.valueOf((int) ((m17 * 1.0d) / 1024.0d)));
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u0(this, k17, db5.e1.Q(this.f183012d.mo55332x76847179(), "", this.f183012d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_l), true, false, null)));
        g0Var.d(11125, java.lang.Integer.valueOf(linkedList.size()), 3);
    }
}
