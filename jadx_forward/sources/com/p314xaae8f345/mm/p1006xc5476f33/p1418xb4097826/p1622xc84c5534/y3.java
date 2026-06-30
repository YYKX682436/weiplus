package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public final class y3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y3 f207005a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y3();

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y3 y3Var, r45.qt2 qt2Var, int i17, long j17, int i18, int i19, java.lang.String wording, java.lang.Integer num, java.lang.String str, int i27, java.lang.Object obj) {
        java.lang.Integer num2 = (i27 & 64) != 0 ? null : num;
        java.lang.String str2 = (i27 & 128) != 0 ? "" : str;
        y3Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wording, "wording");
        if (qt2Var != null) {
            boolean Dk = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Dk();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderShareReporter.report21673, sessionId = ");
            sb6.append(qt2Var.m75945x2fec8307(0));
            sb6.append(", clickTabContextId = ");
            sb6.append(qt2Var.m75945x2fec8307(2));
            sb6.append(", contextId = ");
            sb6.append(qt2Var.m75945x2fec8307(1));
            sb6.append(", commentScene = ");
            sb6.append(qt2Var.m75939xb282bd08(5));
            sb6.append(", eventCode = ");
            sb6.append(i17);
            sb6.append(", eventTime = ");
            sb6.append(j17);
            sb6.append(", index = ");
            sb6.append(i18);
            sb6.append(", jumpType=");
            sb6.append(i19);
            sb6.append(", entranceStatus=");
            sb6.append(Dk ? 1 : 0);
            sb6.append(", wording=");
            sb6.append(wording);
            sb6.append(", frilikecnt=");
            sb6.append(num2 == null ? "null" : num2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareReporter", sb6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(21673, qt2Var.m75945x2fec8307(0), qt2Var.m75945x2fec8307(2), qt2Var.m75945x2fec8307(1), java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5)), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(Dk ? 1 : 0), wording, num2, str2);
        }
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y3 y3Var, android.content.Context context, int i17, java.lang.String str, int i18, java.lang.Object obj) {
        if ((i18 & 4) != 0) {
            str = "";
        }
        java.lang.String position = str;
        y3Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(position, "position");
        long c17 = c01.id.c();
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareReporter", "FinderShareReporter.report21856, sessionId = " + V6.m75945x2fec8307(0) + ", clickTabContextId = " + V6.m75945x2fec8307(2) + ", contextId = " + V6.m75945x2fec8307(1) + ", commentScene = " + V6.m75939xb282bd08(5) + ", eventCode = " + i17 + ", eventTime = " + c17 + ", position = " + position);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(21856, V6.m75945x2fec8307(0), V6.m75945x2fec8307(2), V6.m75945x2fec8307(1), java.lang.Integer.valueOf(V6.m75939xb282bd08(5)), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(c17), position);
    }
}
