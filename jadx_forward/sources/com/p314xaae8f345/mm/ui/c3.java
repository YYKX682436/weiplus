package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class c3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.f3 f279605d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.k3 f279606e;

    public c3(com.p314xaae8f345.mm.ui.k3 k3Var, com.p314xaae8f345.mm.ui.f3 f3Var) {
        this.f279606e = k3Var;
        this.f279605d = f3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f279606e.f290550d, "select db count: %d", java.lang.Integer.valueOf(this.f279605d.a()));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.b3(this));
    }
}
