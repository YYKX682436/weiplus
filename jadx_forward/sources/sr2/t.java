package sr2;

/* loaded from: classes8.dex */
public final class t implements mv2.w0 {

    /* renamed from: d, reason: collision with root package name */
    public static final sr2.t f493251d = new sr2.t();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f493252e = new java.util.LinkedHashMap();

    @Override // mv2.w0
    /* renamed from: onPostErr */
    public void mo56114x385435c6(long j17, boolean z17) {
        java.util.LinkedList linkedList;
        r45.x80 x80Var;
        r45.qy3 qy3Var;
        r45.x80 x80Var2;
        r45.qy3 qy3Var2;
        r45.x80 x80Var3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0 ad0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207935a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.N).mo141623x754a37bb()).r()).booleanValue()) {
            cu2.t tVar = cu2.u.f303974a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f17 = tVar.f(j17);
            if (f17 != null) {
                if (f17.m59277xa8f45ee4().m75933x41a8a7f2(26)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostRemindManager", "[onPostFailed] has show red dot, localId:" + j17);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostRemindManager", "[onPostFailed] localId:" + j17);
                    i95.m c17 = i95.n0.c(zy2.b6.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    zy2.fa nk6 = ((c61.l7) ((zy2.b6) c17)).nk();
                    nk6.N("FinderEntrance");
                    nk6.N("FinderMentionEntrance");
                    i95.m c18 = i95.n0.c(zy2.b6.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                    zy2.fa nk7 = ((c61.l7) ((zy2.b6) c18)).nk();
                    r45.vs2 vs2Var = new r45.vs2();
                    vs2Var.f470019d = 10031000;
                    vs2Var.f470038z = 1;
                    vs2Var.f470020e = 1051;
                    vs2Var.f470029q = g92.b.f351302e.T0();
                    vs2Var.f470024i = 86400;
                    long nanoTime = java.lang.System.nanoTime();
                    vs2Var.f470023h = "tipsid_local_post_fail_" + nanoTime;
                    vs2Var.f470036x = "tipsuuid_local_post_fail_" + nanoTime;
                    java.util.LinkedList linkedList2 = vs2Var.f470022g;
                    if (linkedList2 == null) {
                        linkedList2 = new java.util.LinkedList();
                    }
                    vs2Var.f470022g = linkedList2;
                    r45.f03 f03Var = new r45.f03();
                    vs2Var.f470022g.add(f03Var);
                    f03Var.f455432s = 1;
                    f03Var.f455425i = "FinderEntrance";
                    f03Var.f455424h = 1;
                    f03Var.f455420d = 999;
                    f03Var.f455433t = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.O).mo141623x754a37bb()).r()).intValue();
                    f03Var.f455434u = 2;
                    r45.ya0 ya0Var = new r45.ya0();
                    f03Var.B = ya0Var;
                    f03Var.f455427n = 1;
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19795xce8b809e c19795xce8b809e = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19795xce8b809e();
                    c19795xce8b809e.set(11, java.lang.Long.valueOf(j17));
                    f03Var.f455428o = hc2.b.a(c19795xce8b809e);
                    r45.fz2 fz2Var = new r45.fz2();
                    ya0Var.f472451d = fz2Var;
                    java.util.LinkedList linkedList3 = fz2Var.f456274d;
                    if (linkedList3 == null) {
                        linkedList3 = new java.util.LinkedList();
                    }
                    fz2Var.f456274d = linkedList3;
                    r45.cp5 cp5Var = new r45.cp5();
                    cp5Var.f453301d = 3;
                    r45.ap5 ap5Var = new r45.ap5();
                    cp5Var.f453302e = ap5Var;
                    ap5Var.f451709d = new r45.x80();
                    r45.ap5 ap5Var2 = cp5Var.f453302e;
                    r45.x80 x80Var4 = ap5Var2 != null ? ap5Var2.f451709d : null;
                    if (x80Var4 != null) {
                        x80Var4.f471387e = new r45.qy3();
                    }
                    r45.ap5 ap5Var3 = cp5Var.f453302e;
                    r45.qy3 qy3Var3 = (ap5Var3 == null || (x80Var3 = ap5Var3.f451709d) == null) ? null : x80Var3.f471387e;
                    if (qy3Var3 != null) {
                        qy3Var3.f465885e = new r45.xy3();
                    }
                    r45.ap5 ap5Var4 = cp5Var.f453302e;
                    r45.xy3 xy3Var = (ap5Var4 == null || (x80Var2 = ap5Var4.f451709d) == null || (qy3Var2 = x80Var2.f471387e) == null) ? null : qy3Var2.f465885e;
                    if (xy3Var != null) {
                        xy3Var.f472126d = "http://dldir1v6.qq.com/weixin/checkresupdate/exclamation_mark_circle_0ce603e151ef47e492018465f5733fec.png";
                    }
                    r45.xy3 xy3Var2 = (ap5Var4 == null || (x80Var = ap5Var4.f451709d) == null || (qy3Var = x80Var.f471387e) == null) ? null : qy3Var.f465885e;
                    if (xy3Var2 != null) {
                        xy3Var2.f472127e = "http://dldir1v6.qq.com/weixin/checkresupdate/exclamation_mark_circle_0ce603e151ef47e492018465f5733fec.png";
                    }
                    r45.yo5 yo5Var = new r45.yo5();
                    cp5Var.f453303f = yo5Var;
                    yo5Var.f472795e = new r45.lp();
                    r45.yo5 yo5Var2 = cp5Var.f453303f;
                    r45.lp lpVar = yo5Var2 != null ? yo5Var2.f472795e : null;
                    if (lpVar != null) {
                        r45.uy3 uy3Var = new r45.uy3();
                        uy3Var.f469267d = 24;
                        uy3Var.f469268e = 24;
                        lpVar.f461224m = uy3Var;
                    }
                    r45.fz2 fz2Var2 = ya0Var.f472451d;
                    if (fz2Var2 != null && (linkedList = fz2Var2.f456274d) != null) {
                        linkedList.add(cp5Var);
                    }
                    r45.dz2 dz2Var = new r45.dz2();
                    java.util.LinkedList m75941xfb821914 = dz2Var.m75941xfb821914(0);
                    if (m75941xfb821914 == null) {
                        m75941xfb821914 = new java.util.LinkedList();
                    }
                    dz2Var.set(0, m75941xfb821914);
                    r45.gz2 gz2Var = new r45.gz2();
                    gz2Var.set(0, vs2Var);
                    dz2Var.m75941xfb821914(0).add(gz2Var);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x2) nk7).e1(dz2Var, "FinderPostRemindManager");
                    f17.m59277xa8f45ee4().set(26, java.lang.Boolean.TRUE);
                    tVar.l(f17);
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostRemindManager", "[onPostFailed] disable show red dot, localId:" + j17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostRemindManager", "[onPostEnd] localId:" + j17);
    }
}
