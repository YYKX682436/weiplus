package com.p314xaae8f345.p3210x3857dc.sys;

/* loaded from: classes13.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3210x3857dc.e1 f302097d;

    public n(com.p314xaae8f345.p3210x3857dc.e1 e1Var) {
        this.f302097d = e1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.p314xaae8f345.p3210x3857dc.sys.o.a();
            by5.c4.f("SysWebFactory.PreIniter", "preInit, enforce main looper & finish init");
            com.p314xaae8f345.p3210x3857dc.sys.o.f302098a = true;
            com.p314xaae8f345.p3210x3857dc.e1 e1Var = this.f302097d;
            if (e1Var != null) {
                e1Var.a();
            }
        } catch (java.lang.Throwable th6) {
            by5.c4.d("SysWebFactory.PreIniter", "ensureSystemWebViewGlobalLooper error", th6);
            by5.s0.e(577L, 233L, 1L);
        }
    }
}
