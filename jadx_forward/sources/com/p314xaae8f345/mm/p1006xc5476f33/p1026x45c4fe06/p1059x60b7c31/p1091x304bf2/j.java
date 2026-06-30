package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1091x304bf2;

/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1091x304bf2.j f162793a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1091x304bf2.j();

    public final void a(java.lang.String tag, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, k91.z zVar, java.lang.Integer num, int i17, int i18, int i19) {
        java.lang.String icon;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        if (e9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(tag, "invoke env is empty");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = e9Var.t3();
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(i17, t37.n0());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        if (zVar != null) {
            try {
                java.lang.String text = zVar.f387373b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(text, "text");
                java.lang.String format = java.lang.String.format(text, java.util.Arrays.copyOf(new java.lang.Object[]{t37.n0()}, 1));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                string = format;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(tag, "invoke, string format error: " + e17);
            }
            icon = zVar.f387372a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(icon, "icon");
        } else {
            icon = "";
        }
        java.lang.String str = icon;
        mi1.o0.f408185a.b(t37, new mi1.r1(string, str, str, str.length() > 0 ? null : num, i18, true, 0, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1091x304bf2.i(e9Var, i19), 64, null), -1, null);
    }
}
