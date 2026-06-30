package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class w5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21357x5e7365bb f292742d;

    public w5(com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb) {
        this.f292742d = c21357x5e7365bb;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb = this.f292742d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "status %d (%d), extStatus %d (%d), pluginFlag %d (%d)", java.lang.Integer.valueOf(c21357x5e7365bb.N), java.lang.Integer.valueOf(c01.z1.p()), java.lang.Long.valueOf(c21357x5e7365bb.P), java.lang.Long.valueOf(c01.z1.j()), java.lang.Integer.valueOf(c21357x5e7365bb.Q), java.lang.Integer.valueOf(c01.z1.n()));
        c21357x5e7365bb.P = c01.z1.j();
        c21357x5e7365bb.N = c01.z1.p();
        c21357x5e7365bb.Q = c01.z1.n();
        c21357x5e7365bb.R = c01.z1.h();
        c21357x5e7365bb.D1();
    }
}
