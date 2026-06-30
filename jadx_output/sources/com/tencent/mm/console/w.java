package com.tencent.mm.console;

/* loaded from: classes11.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f64849d;

    public w(android.content.Context context) {
        this.f64849d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Iterable<com.tencent.mm.vfs.x1> s17 = com.tencent.mm.vfs.w6.s(lp0.b.g0(), false);
        if (s17 != null) {
            for (com.tencent.mm.vfs.x1 x1Var : s17) {
                if (x1Var != null) {
                    x1Var.a();
                }
            }
        }
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.console.a(this));
    }
}
