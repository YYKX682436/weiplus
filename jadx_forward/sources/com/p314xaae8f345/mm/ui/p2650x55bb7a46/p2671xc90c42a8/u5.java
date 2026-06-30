package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public class u5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f284033d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.b6 f284034e;

    public u5(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.b6 b6Var, int i17) {
        this.f284034e = b6Var;
        this.f284033d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.b6 b6Var = this.f284034e;
        if (b6Var.f284076f == null || b6Var.f283672s.get()) {
            return;
        }
        b6Var.f284076f.A(false, this.f284033d);
    }
}
