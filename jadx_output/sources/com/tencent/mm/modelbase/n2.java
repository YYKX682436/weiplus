package com.tencent.mm.modelbase;

/* loaded from: classes12.dex */
public class n2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f70705d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f70706e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.o2 f70707f;

    public n2(com.tencent.mm.modelbase.o2 o2Var, boolean z17, boolean z18) {
        this.f70707f = o2Var;
        this.f70705d = z17;
        this.f70706e = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.modelbase.o2 o2Var = this.f70707f;
        o2Var.f70725d.f70754m.I("push process's network haven't callback in 5.5min!!!! cancelStatus:" + this.f70705d + " hasCallbackStatus:" + this.f70706e);
        java.lang.Object[] objArr = new java.lang.Object[2];
        com.tencent.mm.modelbase.m1 m1Var = o2Var.f70725d.f70752h;
        objArr[0] = java.lang.Integer.valueOf(m1Var == null ? 0 : m1Var.hashCode());
        com.tencent.mm.modelbase.m1 m1Var2 = o2Var.f70725d.f70752h;
        objArr[1] = java.lang.Integer.valueOf(m1Var2 != null ? m1Var2.getType() : 0);
        com.tencent.mars.xlog.Log.w("MicroMsg.RemoteOnGYNetEnd", "time exceed, force to callback . kill push fin. hash:%d type:%d", objArr);
    }
}
