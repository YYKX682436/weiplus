package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes5.dex */
public final class m3 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f145887d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.a3 f145888e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p648x55baa833.ui.j3 f145889f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f145890g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f145891h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f145892i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var, android.view.View itemView, com.p314xaae8f345.mm.p648x55baa833.ui.j3 j3Var) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f145887d = context;
        this.f145888e = a3Var;
        this.f145889f = j3Var;
        this.f145890g = (android.widget.ImageView) itemView.findViewById(com.p314xaae8f345.mm.R.id.q7h);
        this.f145891h = (android.widget.TextView) itemView.findViewById(com.p314xaae8f345.mm.R.id.cem);
        this.f145892i = (android.widget.TextView) itemView.findViewById(com.p314xaae8f345.mm.R.id.q_b);
    }

    public static final java.lang.String i(com.p314xaae8f345.mm.p648x55baa833.ui.m3 m3Var, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        java.lang.String z07;
        m3Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(z3Var);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z3Var.w0())) {
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = m3Var.f145888e;
            z07 = a3Var != null ? a3Var.z0(z3Var.d1()) : null;
            if (z07 == null) {
                z07 = "";
            }
        } else {
            z07 = z3Var.w0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(z07);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07)) {
            z07 = z3Var.f2();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(z07, "getDisplayNick(...)");
        }
        if (z3Var.r2()) {
            return z07;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.ya z08 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(z3Var.d1());
        if (z08 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z08.f66692x4854b29d)) {
            return z07;
        }
        java.lang.String str = z08.f66692x4854b29d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getConRemark(...)");
        return str;
    }
}
