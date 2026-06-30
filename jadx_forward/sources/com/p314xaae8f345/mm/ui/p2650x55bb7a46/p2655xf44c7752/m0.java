package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes9.dex */
public final class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.C21744x29417dbc f282719d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f282720e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f282721f;

    public m0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.C21744x29417dbc c21744x29417dbc, android.view.View view, float f17) {
        this.f282719d = c21744x29417dbc;
        this.f282720e = view;
        this.f282721f = f17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        f0Var.f391649d = 4;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.C21744x29417dbc c21744x29417dbc = this.f282719d;
        android.content.Context mo7438x76847179 = c21744x29417dbc.mo7438x76847179();
        float f17 = this.f282721f;
        android.view.View view = this.f282720e;
        if (mo7438x76847179 != null) {
            f0Var.f391649d = (int) (((view.getWidth() / f17) + 2) / 98);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d(c21744x29417dbc.mo7438x76847179(), f0Var.f391649d);
        c1161x57298f5d.B = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k0(c21744x29417dbc, f0Var);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = c21744x29417dbc.f282080p;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.i(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.l0(c1161x57298f5d, c21744x29417dbc));
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = c21744x29417dbc.f282080p;
        if (c1163xf1deaba42 != null) {
            c1163xf1deaba42.mo7967x900dcbe1(c1161x57298f5d);
        }
        float width = view.getWidth() / f17;
        float height = view.getHeight() / f17;
        float f18 = (2 + width) / 98;
        float f19 = ((12 + height) / 76) + 1;
        float f27 = f18 * f19;
        int i17 = ((int) (f27 / 50)) + 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiHistoryListFragment", "djq :: width: " + width + " | height: " + height + " | row: " + f18 + " | col: " + f19 + " | totalCount: " + f27 + " | batch:" + i17);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.h0 h0Var = c21744x29417dbc.f282083s;
        if (h0Var != null) {
            h0Var.f283772h = i17;
        }
        if (h0Var != null) {
            h0Var.c();
        }
    }
}
