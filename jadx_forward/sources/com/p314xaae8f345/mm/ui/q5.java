package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class q5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f291073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f291074e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.s5 f291075f;

    public q5(com.p314xaae8f345.mm.ui.s5 s5Var, android.graphics.Bitmap bitmap, int i17) {
        this.f291075f = s5Var;
        this.f291073d = bitmap;
        this.f291074e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.s5 s5Var = this.f291075f;
        s5Var.f291308j.E = true;
        s5Var.f291302d.R(this.f291073d);
        int i17 = s5Var.f291303e;
        if (i17 == 3) {
            s5Var.f291308j.r1(s5Var.f291302d, 8, 8, 8, false, 0, 0, 0, s5Var.f291299a);
        } else if (i17 == 4) {
            s5Var.f291308j.r1(s5Var.f291302d, 8, 8, 0, false, 0, 0, 0, s5Var.f291299a);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "gamelog.reddot, finder, update, download entrance image success, msgId:%d, showType:%d", java.lang.Long.valueOf(s5Var.f291304f), java.lang.Integer.valueOf(s5Var.f291303e));
        s5Var.f291308j.n1(s5Var.f291304f, s5Var.f291303e, s5Var.f291305g, s5Var.f291306h);
        if (this.f291074e == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(858L, 13L, 1L, false);
        }
    }
}
