package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes12.dex */
public class n2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f152238d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f152239e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.o2 f152240f;

    public n2(com.p314xaae8f345.mm.p944x882e457a.o2 o2Var, boolean z17, boolean z18) {
        this.f152240f = o2Var;
        this.f152238d = z17;
        this.f152239e = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p944x882e457a.o2 o2Var = this.f152240f;
        o2Var.f152258d.f152287m.I("push process's network haven't callback in 5.5min!!!! cancelStatus:" + this.f152238d + " hasCallbackStatus:" + this.f152239e);
        java.lang.Object[] objArr = new java.lang.Object[2];
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = o2Var.f152258d.f152285h;
        objArr[0] = java.lang.Integer.valueOf(m1Var == null ? 0 : m1Var.hashCode());
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var2 = o2Var.f152258d.f152285h;
        objArr[1] = java.lang.Integer.valueOf(m1Var2 != null ? m1Var2.mo808xfb85f7b0() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RemoteOnGYNetEnd", "time exceed, force to callback . kill push fin. hash:%d type:%d", objArr);
    }
}
