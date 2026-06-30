package hg2;

/* loaded from: classes3.dex */
public abstract class s {
    public static final void a(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var, p3325xe03a0797.p3326xc267989b.y0 scope, dk2.zf zfVar) {
        gk2.e m57654xd7793f26;
        java.lang.String a17;
        java.lang.String k17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        if (k0Var == null || (m57654xd7793f26 = k0Var.m57654xd7793f26()) == null) {
            return;
        }
        java.lang.String str = (zfVar == null || (k17 = zfVar.k()) == null) ? "" : k17;
        java.lang.String str2 = (zfVar == null || (a17 = zfVar.a()) == null) ? "" : a17;
        r45.eu0 eu0Var = ((mm2.f6) m57654xd7793f26.a(mm2.f6.class)).V;
        if (eu0Var != null) {
            p3325xe03a0797.p3326xc267989b.l.d(scope, null, null, new hg2.o(m57654xd7793f26, context, k0Var, eu0Var, str2, str, null), 3, null);
        }
    }

    public static final void b(dk2.vf vfVar, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vfVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlashSaleInfoLocal", "open flash sale dialog");
        int e17 = c01.id.e();
        int i17 = vfVar.f315784b;
        if (e17 > i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FlashSaleInfoLocal", "try open flash sale after expiration, currentTime = " + e17 + ", expireTime = " + i17);
            return;
        }
        if (k0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlashSaleInfoLocal", "plugin layout is null");
            return;
        }
        r45.av1 av1Var = new r45.av1();
        av1Var.set(1, db2.t4.f309704a.a(6211));
        av1Var.set(2, java.lang.Long.valueOf(((mm2.e1) k0Var.m57635xbba4bfc0(mm2.e1.class)).f410516m));
        av1Var.set(3, java.lang.Long.valueOf(((mm2.e1) k0Var.m57635xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0)));
        av1Var.set(4, ((mm2.e1) k0Var.m57635xbba4bfc0(mm2.e1.class)).f410525v);
        r45.mq1 mq1Var = vfVar.f315786d;
        av1Var.set(5, java.lang.Long.valueOf(mq1Var != null ? mq1Var.m75942xfb822ef2(0) : 0L));
        av1Var.set(11, 1);
        av1Var.set(7, ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Mj());
        av1Var.d().l().K(new hg2.r(context, vfVar, k0Var));
    }
}
