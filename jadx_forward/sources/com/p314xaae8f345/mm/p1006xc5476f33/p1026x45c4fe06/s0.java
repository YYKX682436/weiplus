package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes3.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.s0 f169971a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.s0();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f169972b = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.n0.f167550d);

    public final void a(java.lang.String appId, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7024x8fa42fff c7024x8fa42fff = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7024x8fa42fff();
        c7024x8fa42fff.f143411d = c7024x8fa42fff.b("appid", appId, true);
        c7024x8fa42fff.f143412e = i17;
        c7024x8fa42fff.f143413f = i18;
        c7024x8fa42fff.k();
    }

    public final void b(android.content.Context context, java.lang.String str, int i17, android.graphics.Bitmap bitmap, yz5.a aVar) {
        java.lang.CharSequence charSequence;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m0 m0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m0) ((java.util.List) ((jz5.n) f169972b).mo141623x754a37bb()).get(i17);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(context, m0Var.f167215d, 0, false);
        z2Var.i(com.p314xaae8f345.mm.R.C30864xbddafb2a.ali);
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) z2Var.f293591g.findViewById(com.p314xaae8f345.mm.R.id.f566734gw0);
        boolean z17 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20312x2c4cd02()) == 1;
        c22789xd23e9a9b.o(z17);
        java.lang.String str2 = m0Var.f167213b;
        if (z17) {
            com.p314xaae8f345.mm.rfx.C20942x379cf5ee m77390x243906 = com.p314xaae8f345.mm.rfx.C20942x379cf5ee.m77390x243906(context.getAssets(), str2);
            if (bitmap != null) {
                m77390x243906.m77407x1a429707(0, com.p314xaae8f345.mm.rfx.C20945xbc2db729.m77439xd9d5e999(bitmap));
            }
            c22789xd23e9a9b.mo82566x3e3ac3e8(m77390x243906);
        } else {
            org.p3363xbe4143f1.C29690xfae77312 m154715x243906 = org.p3363xbe4143f1.C29690xfae77312.m154715x243906(context.getAssets(), str2);
            if (bitmap != null) {
                m154715x243906.m154734x1a429707(0, org.p3363xbe4143f1.C29693x6232de85.m154757xd9d5e999(bitmap));
            }
            c22789xd23e9a9b.mo82568x3e3ac3e8(m154715x243906);
        }
        c22789xd23e9a9b.m82583xcde73672(m0Var.f167214c);
        c22789xd23e9a9b.g();
        ((android.widget.TextView) z2Var.f293591g.findViewById(com.p314xaae8f345.mm.R.id.r__)).setText(m0Var.f167212a);
        java.lang.CharSequence charSequence2 = m0Var.f167216e;
        if (charSequence2 != null) {
            z2Var.y(charSequence2);
            z2Var.x(1);
            z2Var.F = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o0(z2Var, aVar, str, i17);
        }
        java.lang.CharSequence charSequence3 = m0Var.f167217f;
        if (charSequence3 != null && (charSequence = m0Var.f167218g) != null) {
            z2Var.m(charSequence3, charSequence);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p0 p0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p0(z2Var, aVar, str, i17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.q0 q0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.q0(context, aVar, str, i17);
            z2Var.D = p0Var;
            z2Var.E = q0Var;
        }
        z2Var.C();
        if (str == null) {
            str = "";
        }
        a(str, i17, 2);
    }
}
