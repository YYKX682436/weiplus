package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public class h6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f283786d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.c6 f283787e;

    public h6(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.c6 c6Var, int i17) {
        this.f283787e = c6Var;
        this.f283786d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.c6 c6Var = this.f283787e;
        if (c6Var.f284076f == null || c6Var.f283685t.get()) {
            return;
        }
        c6Var.f284076f.A(false, this.f283786d);
    }
}
