package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.g2 f213221d;

    public b2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.g2 g2Var) {
        this.f213221d = g2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.g2 g2Var;
        boolean booleanValue = ((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.K().r()).booleanValue();
        kz5.p0 p0Var = kz5.p0.f395529d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.g2 g2Var2 = this.f213221d;
        if (booleanValue) {
            long j17 = g2Var2.f213664c;
            java.lang.String str = g2Var2.f213665d;
            int i17 = g2Var2.f213667f;
            java.lang.String m75945x2fec8307 = g2Var2.f213668g.m75945x2fec8307(3);
            java.lang.String str2 = m75945x2fec8307 == null ? "" : m75945x2fec8307;
            java.lang.String m75945x2fec83072 = g2Var2.f213668g.m75945x2fec8307(4);
            new db2.n(1, p0Var, j17, str, i17, str2, m75945x2fec83072 == null ? "" : m75945x2fec83072, null, null, 384, null).l();
            g2Var = g2Var2;
        } else {
            int i18 = 1;
            long j18 = g2Var2.f213664c;
            java.lang.String str3 = g2Var2.f213665d;
            int i19 = g2Var2.f213667f;
            java.lang.String m75945x2fec83073 = g2Var2.f213668g.m75945x2fec8307(3);
            java.lang.String str4 = m75945x2fec83073 == null ? "" : m75945x2fec83073;
            java.lang.String m75945x2fec83074 = g2Var2.f213668g.m75945x2fec8307(4);
            g2Var = g2Var2;
            gm0.j1.d().g(new db2.j5(i18, p0Var, j18, str3, i19, str4, m75945x2fec83074 == null ? "" : m75945x2fec83074, null, null, 384, null));
        }
        android.content.Context context = g2Var.f213663b;
        db5.t7.h(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572834cp3));
        g2Var.f213670i = 1;
        g2Var.dismiss();
    }
}
