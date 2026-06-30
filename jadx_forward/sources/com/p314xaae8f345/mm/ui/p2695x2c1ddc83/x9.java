package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class x9 {

    /* renamed from: a, reason: collision with root package name */
    public android.widget.ListView f289772a;

    /* renamed from: b, reason: collision with root package name */
    public yf5.j0 f289773b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5 f289774c;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f289776e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Runnable f289777f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f289775d = false;

    /* renamed from: g, reason: collision with root package name */
    public int f289778g = -1;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.b0 f289779h = new com.p314xaae8f345.mm.p2470x93e71c27.ui.b0(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.u9(this));

    public static void a(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.x9 x9Var, int i17) {
        x9Var.getClass();
        if (i17 < 0) {
            i17 = 300;
        }
        x9Var.b();
        if (x9Var.f289776e == null) {
            x9Var.f289776e = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("pre load mainui avatar");
        }
        x9Var.f289775d = false;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = x9Var.f289776e;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.w9 w9Var = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.w9(x9Var);
        x9Var.f289777f = w9Var;
        n3Var.mo50297x7c4d7ca2(w9Var, i17);
    }

    public final void b() {
        java.lang.Runnable runnable;
        if (!this.f289775d) {
            this.f289775d = true;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f289776e;
        if (n3Var != null && (runnable = this.f289777f) != null) {
            n3Var.mo50300x3fa464aa(runnable);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var2 = this.f289776e;
        if (n3Var2 != null) {
            n3Var2.mo50299x35224f();
            this.f289776e = null;
        }
    }
}
