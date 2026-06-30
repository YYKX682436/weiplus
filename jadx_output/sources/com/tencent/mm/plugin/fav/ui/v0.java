package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class v0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavCleanUI f101479d;

    public v0(com.tencent.mm.plugin.fav.ui.FavCleanUI favCleanUI) {
        this.f101479d = favCleanUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        long m17 = this.f101479d.f100307e.m();
        java.util.List k17 = this.f101479d.f100307e.k(true);
        o72.x1.I0(o72.x1.b0() - m17);
        if (k17.isEmpty()) {
            return;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.util.LinkedList linkedList = (java.util.LinkedList) k17;
        g0Var.d(14110, java.lang.Integer.valueOf(this.f101479d.f100316q), java.lang.Integer.valueOf(linkedList.size()), java.lang.Integer.valueOf((int) ((m17 * 1.0d) / 1024.0d)));
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.fav.ui.u0(this, k17, db5.e1.Q(this.f101479d.getContext(), "", this.f101479d.getString(com.tencent.mm.R.string.c_l), true, false, null)));
        g0Var.d(11125, java.lang.Integer.valueOf(linkedList.size()), 3);
    }
}
