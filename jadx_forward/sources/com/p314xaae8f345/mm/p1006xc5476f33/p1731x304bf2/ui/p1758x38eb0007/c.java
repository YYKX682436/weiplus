package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007;

/* loaded from: classes8.dex */
public class c extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final int f223061d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.t0 f223062e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f223063f;

    /* renamed from: g, reason: collision with root package name */
    public int f223064g;

    public c(android.content.Context context, int i17, boolean z17) {
        super(context);
        this.f223061d = i17;
        this.f223063f = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bh9, (android.view.ViewGroup) this, false);
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().f1(1) == 0 || !z17) {
            addView(this.f223063f);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.t0 t0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.t0(getContext(), i17);
        this.f223062e = t0Var;
        t0Var.m64820x93cf8f70(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.a(this));
        addView(this.f223062e, new android.widget.FrameLayout.LayoutParams(-1, -1));
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GAME_NOT_DISTURB_GUIDANCE_COUNT_INT;
        int q17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) c17.m(u3Var, 0));
        if (q17 > 0) {
            return;
        }
        gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(q17 + 1));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(getContext(), 2, 0, true);
        z2Var.y(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fmq));
        z2Var.x(1);
        z2Var.F = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.b(this, z2Var);
        z2Var.j(android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bh_, (android.view.ViewGroup) null));
        z2Var.C();
    }

    public void a() {
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().f1(1) == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.t0 t0Var = this.f223062e;
            if (t0Var != null && indexOfChild(t0Var) >= 0) {
                removeView(this.f223062e);
            }
            android.view.View view = this.f223063f;
            if (view == null || indexOfChild(view) >= 0) {
                return;
            }
            addView(this.f223063f);
        }
    }

    /* renamed from: setNewMessageCount */
    public void m64817x6e7f4646(int i17) {
        this.f223064g = i17;
    }
}
