package com.tencent.mm.app;

/* loaded from: classes12.dex */
public class h6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.u6 f53440d;

    public h6(com.tencent.mm.app.u6 u6Var) {
        this.f53440d = u6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.app.u6 u6Var = this.f53440d;
        if (u6Var.d(false) == 0) {
            u6Var.f53839s = false;
        }
    }
}
