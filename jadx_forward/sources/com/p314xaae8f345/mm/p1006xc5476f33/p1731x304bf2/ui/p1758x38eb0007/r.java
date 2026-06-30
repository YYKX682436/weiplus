package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007;

/* loaded from: classes8.dex */
public class r extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final int f223152d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.c1 f223153e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f223154f;

    /* renamed from: g, reason: collision with root package name */
    public int f223155g;

    public r(android.content.Context context, int i17, boolean z17) {
        super(context);
        this.f223152d = i17;
        this.f223154f = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bh9, (android.view.ViewGroup) this, false);
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().f1(2) == 0 || !z17) {
            addView(this.f223154f);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.c1 c1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.c1(getContext(), i17);
        this.f223153e = c1Var;
        c1Var.m64818x93cf8f70(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.q(this));
        addView(this.f223153e, new android.widget.FrameLayout.LayoutParams(-1, -1));
    }

    public void a() {
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().f1(2) == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.c1 c1Var = this.f223153e;
            if (c1Var != null && indexOfChild(c1Var) >= 0) {
                removeView(this.f223153e);
            }
            android.view.View view = this.f223154f;
            if (view == null || indexOfChild(view) >= 0) {
                return;
            }
            addView(this.f223154f);
        }
    }

    /* renamed from: setNewMessageCount */
    public void m64819x6e7f4646(int i17) {
        this.f223155g = i17;
    }
}
