package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes7.dex */
public class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f77772d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.b47 f77773e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.debugger.l2 f77774f;

    public i2(com.tencent.mm.plugin.appbrand.debugger.l2 l2Var, int i17, r45.b47 b47Var) {
        this.f77774f = l2Var;
        this.f77772d = i17;
        this.f77773e = b47Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.debugger.l2.a(this.f77774f, "cmdId " + this.f77772d + ", errCode " + this.f77773e.f370527d);
    }
}
