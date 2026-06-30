package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes3.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.o0 f183953a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.o0();

    public final boolean a(gk2.e eVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eVar, "<this>");
        ae2.in inVar = ae2.in.f85221a;
        boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.R5).mo141623x754a37bb()).r()).intValue() == 1;
        boolean z18 = z17 || ((java.lang.Boolean) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.e0) eVar.a(mm2.e0.class)).f410499f).mo144003x754a37bb()).booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BoxCommon", "svr enable:" + ((java.lang.Boolean) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.e0) eVar.a(mm2.e0.class)).f410499f).mo144003x754a37bb()).booleanValue() + ", local enable:" + z17);
        return z18;
    }

    public final java.lang.String b(r45.qn qnVar) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qnVar, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hashCode:");
        sb6.append(qnVar.hashCode());
        sb6.append(", liveId:");
        sb6.append(pm0.v.u(qnVar.f465636f));
        sb6.append(", boxId:");
        r45.qm1 qm1Var = qnVar.f465634d;
        java.lang.String str2 = null;
        sb6.append(qm1Var != null ? qm1Var.m75945x2fec8307(1) : null);
        sb6.append(", lastEnterTimeStamp:");
        sb6.append(qnVar.f465638h);
        sb6.append(", dataSize:");
        sb6.append(qnVar.f465637g.size());
        sb6.append(", lastBuffer:");
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = qnVar.f465635e;
        if (gVar != null) {
            try {
                str = android.util.Base64.encodeToString(gVar.g(), 2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "encodeToString(...)");
            } catch (java.lang.Throwable unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder", "ByteString encode failed.");
                str = "";
            }
            str2 = str;
        }
        sb6.append(str2);
        sb6.append('}');
        return sb6.toString();
    }

    public final void c(java.lang.String tag, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "str");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, "mainFlowLog ".concat(str));
    }

    public final void d(java.lang.String tag, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "str");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, "memDataLog ".concat(str));
    }

    public final void e(java.lang.String tag, int i17, gk2.e buContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        ae2.in inVar = ae2.in.f85221a;
        boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.R5).mo141623x754a37bb()).r()).intValue() == 1;
        boolean z18 = pm0.v.z(i17, 16);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BoxCommon", "setBoxEnableByFlag tag:" + tag + ", flag:" + i17 + ", enable:" + z18);
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.e0) buContext.a(mm2.e0.class)).f410499f).k(java.lang.Boolean.valueOf(z17 || z18));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BoxCommon", "[commentHeightChange] setBoxEnableByFlag change");
        ((mm2.x4) buContext.a(mm2.x4.class)).B.mo7808x76db6cb1(null);
    }
}
