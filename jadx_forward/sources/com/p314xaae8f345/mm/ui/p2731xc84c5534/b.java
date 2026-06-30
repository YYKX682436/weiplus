package com.p314xaae8f345.mm.ui.p2731xc84c5534;

/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2731xc84c5534.b f291152a = new com.p314xaae8f345.mm.ui.p2731xc84c5534.b();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f291153b = new java.util.LinkedHashSet();

    public final long a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, java.lang.String str2, boolean z17) {
        if (z17) {
            r45.gp0 n17 = bt3.g2.n(str, str2);
            if (n17 != null) {
                return n17.R;
            }
            return 0L;
        }
        v05.b bVar = new v05.b();
        java.lang.String U1 = f9Var.U1();
        if (U1 == null) {
            U1 = "";
        }
        bVar.m126728xdc93280d(U1);
        v05.a aVar = (v05.a) bVar.m75936x14adae67(bVar.f513848e + 8);
        if (aVar != null) {
            return aVar.m75942xfb822ef2(aVar.f449897d + 0);
        }
        return 0L;
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5, int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.File.FilePreviewReportHelper", "reportFileBubbleSent: " + i17 + ", sendTaskId: " + str);
        java.util.Set set = f291153b;
        if (str != null) {
            if (set.contains(str + '_' + i17)) {
                return;
            }
        }
        if (c16564xb55e1d5 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.File.FilePreviewReportHelper", "reportFileBubbleSent msgIdTalker is null");
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = pt0.f0.f439742b1.k(c16564xb55e1d5.a(), c16564xb55e1d5.f231013d);
        if (k17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.File.FilePreviewReportHelper", "reportFileBubbleSent msg is null");
            return;
        }
        java.lang.String b17 = sc5.g.f488105a.b(k17);
        if (b17.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.File.FilePreviewReportHelper", "reportFileBubbleSent fileExt is empty");
            return;
        }
        if (str != null) {
            set.add(str + '_' + i17);
        }
        com.p314xaae8f345.mm.ui.p2731xc84c5534.o oVar = new com.p314xaae8f345.mm.ui.p2731xc84c5534.o(k17, b17, "", a(k17, null, null, false));
        com.p314xaae8f345.mm.ui.p2731xc84c5534.e.f291161e.getClass();
        com.p314xaae8f345.mm.ui.p2731xc84c5534.e eVar = (com.p314xaae8f345.mm.ui.p2731xc84c5534.e) ((java.util.LinkedHashMap) com.p314xaae8f345.mm.ui.p2731xc84c5534.e.f291162f).get(java.lang.Integer.valueOf(i17));
        if (eVar == null) {
            eVar = com.p314xaae8f345.mm.ui.p2731xc84c5534.e.f291163g;
        }
        oVar.f291250l = eVar;
        com.p314xaae8f345.mm.ui.p2731xc84c5534.d0.f291159a.d(com.p314xaae8f345.mm.ui.p2731xc84c5534.p.f291252d, oVar);
        if (i17 != 3 || str == null) {
            return;
        }
        set.removeIf(new com.p314xaae8f345.mm.ui.p2731xc84c5534.a(str));
    }

    public final void c(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, java.lang.String str2, int i17, boolean z17, boolean z18) {
        java.lang.String b17;
        r45.gp0 n17;
        if (f9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FilePreviewHelper", "reportFileDownloadButtonEvent msgInfo is null");
            return;
        }
        if (z17) {
            sc5.g gVar = sc5.g.f488105a;
            b17 = (str == null || str2 == null || (n17 = bt3.g2.n(str, str2)) == null) ? null : n17.K;
        } else {
            b17 = sc5.g.f488105a.b(f9Var);
        }
        long a17 = a(f9Var, str, str2, z17);
        if (b17 == null) {
            b17 = "";
        }
        com.p314xaae8f345.mm.ui.p2731xc84c5534.o oVar = new com.p314xaae8f345.mm.ui.p2731xc84c5534.o(f9Var, b17, null, a17, 4, null);
        oVar.f291251m = z18;
        if (!z18) {
            com.p314xaae8f345.mm.ui.p2731xc84c5534.l.f291217e.getClass();
            com.p314xaae8f345.mm.ui.p2731xc84c5534.l lVar = (com.p314xaae8f345.mm.ui.p2731xc84c5534.l) ((java.util.LinkedHashMap) com.p314xaae8f345.mm.ui.p2731xc84c5534.l.f291218f).get(java.lang.Integer.valueOf(i17));
            if (lVar == null) {
                lVar = com.p314xaae8f345.mm.ui.p2731xc84c5534.l.f291219g;
            }
            oVar.f291245g = lVar;
        }
        com.p314xaae8f345.mm.ui.p2731xc84c5534.d0.f291159a.d(com.p314xaae8f345.mm.ui.p2731xc84c5534.p.f291258m, oVar);
    }

    public final void d(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        java.lang.String b17 = sc5.g.f488105a.b(msgInfo);
        if (b17.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.File.FilePreviewReportHelper", "reportFilePreview fileExt is empty");
            return;
        }
        com.p314xaae8f345.mm.ui.p2731xc84c5534.o oVar = new com.p314xaae8f345.mm.ui.p2731xc84c5534.o(msgInfo, b17, "", a(msgInfo, null, null, false));
        oVar.f291248j = z17 ? com.p314xaae8f345.mm.ui.p2731xc84c5534.c.f291156g : com.p314xaae8f345.mm.ui.p2731xc84c5534.c.f291155f;
        com.p314xaae8f345.mm.ui.p2731xc84c5534.d0.f291159a.d(com.p314xaae8f345.mm.ui.p2731xc84c5534.p.f291261p, oVar);
    }

    public final void e(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, java.lang.String str, java.lang.String str2, boolean z17) {
        java.lang.String b17;
        r45.gp0 n17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        if (z17) {
            sc5.g gVar = sc5.g.f488105a;
            b17 = (str == null || str2 == null || (n17 = bt3.g2.n(str, str2)) == null) ? null : n17.K;
        } else {
            b17 = sc5.g.f488105a.b(msg);
        }
        long a17 = a(msg, str, str2, z17);
        if (b17 == null) {
            b17 = "";
        }
        com.p314xaae8f345.mm.ui.p2731xc84c5534.o oVar = new com.p314xaae8f345.mm.ui.p2731xc84c5534.o(msg, b17, null, a17, 4, null);
        oVar.f291243e = te5.h.f500182a.c() ? com.p314xaae8f345.mm.ui.p2731xc84c5534.g.f291172e : com.p314xaae8f345.mm.ui.p2731xc84c5534.g.f291173f;
        com.p314xaae8f345.mm.ui.p2731xc84c5534.d0.f291159a.d(com.p314xaae8f345.mm.ui.p2731xc84c5534.p.f291254f, oVar);
    }
}
