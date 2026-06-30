package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public final class k6 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.C21357x5e7365bb f290566a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f290567b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f290568c;

    /* renamed from: d, reason: collision with root package name */
    public final e75.a f290569d;

    public k6(com.p314xaae8f345.mm.ui.C21357x5e7365bb findMoreFriendsUI) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(findMoreFriendsUI, "findMoreFriendsUI");
        this.f290566a = findMoreFriendsUI;
        this.f290569d = new com.p314xaae8f345.mm.ui.i6(this);
    }

    public static final r45.f03 a(com.p314xaae8f345.mm.ui.k6 k6Var, boolean z17, boolean z18, zy2.fa faVar, r45.pm6 pm6Var) {
        r45.f03 I0;
        k6Var.getClass();
        r45.f03 f03Var = null;
        if (z17) {
            r45.f03 I02 = faVar.I0("NewLife.MentionEntrance");
            if (I02 != null) {
                int i17 = I02.f455421e;
                if (i17 > 0) {
                    pm6Var.f464719d += i17;
                }
                f03Var = I02;
            }
            r45.f03 I03 = faVar.I0("NewLife.OfficialMsgEntrance");
            if (I03 != null) {
                int i18 = I03.f455421e;
                if (i18 > 0) {
                    pm6Var.f464719d += i18;
                }
                f03Var = I03;
            }
        }
        if (!z18 || (I0 = faVar.I0("K1k.MentionEntrance")) == null) {
            return f03Var;
        }
        int i19 = I0.f455421e;
        if (i19 > 0) {
            pm6Var.f464719d += i19;
        }
        return I0;
    }

    public final boolean b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar, r45.f03 f03Var, r45.qn6 qn6Var) {
        return jbVar != null && f03Var != null && ((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).Ai() && (qn6Var == null || ((long) jbVar.N.m75939xb282bd08(5)) * 1000 >= qn6Var.f465657r);
    }

    public final void c(com.p314xaae8f345.mm.ui.C21446xfcab30d8 preference) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preference, "preference");
        int i17 = ra0.y.f475014g1;
        j75.f Ni = ((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).Ni();
        if (Ni == null) {
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.ui.j6(this, preference));
            return;
        }
        Ni.m3(this.f290566a, this.f290569d);
        Ni.B3(new sa0.a());
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_topstory_reddot_check_disable, false);
        if (this.f290568c || fj6) {
            return;
        }
        this.f290568c = true;
        if (((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("NewLife.Entrance") != null) {
            Ni.B3(new sa0.i(null, false, null, "FindMoreTopStoryRedLogic init", 7, null));
        }
    }

    public final void d(com.p314xaae8f345.mm.ui.C21446xfcab30d8 preference) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preference, "preference");
        e(preference, false, false, null, null, null, null, null, null, "", new r45.pm6(), "", this.f290566a.f278186t.f501994g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x01f7, code lost:
    
        if (r14 <= 4) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:183:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0640 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0210 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0211  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(com.p314xaae8f345.mm.ui.C21446xfcab30d8 r40, boolean r41, boolean r42, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb r43, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb r44, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb r45, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb r46, r45.f03 r47, r45.f03 r48, java.lang.String r49, r45.pm6 r50, java.lang.String r51, boolean r52) {
        /*
            Method dump skipped, instructions count: 2072
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.k6.e(com.tencent.mm.ui.TopStoryIconViewTipPreference, boolean, boolean, com.tencent.mm.plugin.finder.extension.reddot.jb, com.tencent.mm.plugin.finder.extension.reddot.jb, com.tencent.mm.plugin.finder.extension.reddot.jb, com.tencent.mm.plugin.finder.extension.reddot.jb, r45.f03, r45.f03, java.lang.String, r45.pm6, java.lang.String, boolean):void");
    }
}
