package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class m6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.g4 f267216d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.Drawable f267217e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267218f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f267219g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 f267220h;

    public m6(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 c6Var, db5.g4 g4Var, android.graphics.drawable.Drawable drawable, java.lang.String str, boolean z17) {
        this.f267220h = c6Var;
        this.f267216d = g4Var;
        this.f267217e = drawable;
        this.f267218f = str;
        this.f267219g = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 c6Var = this.f267220h;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = c6Var.f265577J;
        if (k0Var == null || !k0Var.i()) {
            return;
        }
        int max = java.lang.Math.max(0, this.f267216d.y(7));
        if (this.f267220h.o(this.f267216d, max, this.f267217e, this.f267218f, this.f267219g)) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = c6Var.f265577J;
            int size = k0Var2.L.size();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.l1 l1Var = k0Var2.f293401l1;
            if (l1Var == null || max < 0 || max >= size) {
                return;
            }
            l1Var.m8149x8b456734(max);
        }
    }
}
