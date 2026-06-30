package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes15.dex */
public class z2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.a3 f287811d;

    public z2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.a3 a3Var) {
        this.f287811d = a3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.a3 a3Var = this.f287811d;
        com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 c16077xb54fe366 = a3Var.f279894f;
        if (c16077xb54fe366 != null) {
            c16077xb54fe366.clearAnimation();
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21614x5c06ae16 c21614x5c06ae16 = a3Var.f279895g;
            com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 c16077xb54fe3662 = a3Var.f279894f;
            if (c16077xb54fe3662 == null) {
                c21614x5c06ae16.getClass();
                return;
            }
            java.util.List list = c21614x5c06ae16.f279724e;
            if (list != null) {
                int i17 = c21614x5c06ae16.f279725f - 1;
                c21614x5c06ae16.f279725f = i17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingAnimFrame", "remove view counter--: [%s]. %s", java.lang.Integer.valueOf(i17), c16077xb54fe3662);
                c16077xb54fe3662.t();
                c16077xb54fe3662.clearAnimation();
                c21614x5c06ae16.f279723d.removeView(c16077xb54fe3662);
                ((java.util.ArrayList) list).remove(c16077xb54fe3662);
                if (c21614x5c06ae16.f279725f <= 0) {
                    c21614x5c06ae16.f279725f = 0;
                }
            }
        }
    }
}
