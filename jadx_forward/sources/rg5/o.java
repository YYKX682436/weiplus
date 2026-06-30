package rg5;

/* loaded from: classes8.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f476794a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.C21357x5e7365bb f476795b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f476796c;

    /* renamed from: d, reason: collision with root package name */
    public p012xc85e97e9.p093xedfae76a.k0 f476797d;

    /* renamed from: e, reason: collision with root package name */
    public p012xc85e97e9.p093xedfae76a.k0 f476798e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f476799f;

    /* renamed from: g, reason: collision with root package name */
    public p012xc85e97e9.p093xedfae76a.k0 f476800g;

    /* renamed from: h, reason: collision with root package name */
    public final rg5.h f476801h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f476802i;

    /* renamed from: j, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.C21363x65d29512 f476803j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f476804k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f476805l;

    public o(android.content.Context context, com.p314xaae8f345.mm.ui.C21357x5e7365bb findMoreFriendsUI) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(findMoreFriendsUI, "findMoreFriendsUI");
        this.f476794a = context;
        this.f476795b = findMoreFriendsUI;
        this.f476799f = true;
        this.f476801h = new rg5.h(this);
        this.f476802i = jz5.h.b(rg5.i.f476788d);
        this.f476804k = this.f476796c;
        this.f476805l = "";
    }

    public final void a() {
        com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb = this.f476795b;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var = c21357x5e7365bb.f278189w;
        if (h0Var != null) {
            h0Var.m("find_friends_by_finder_live_above_look", true);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var2 = c21357x5e7365bb.f278189w;
        if (h0Var2 != null) {
            h0Var2.m("find_friends_by_finder_live", true);
        }
    }

    public final java.lang.String b() {
        return this.f476796c ? "find_friends_by_finder_live_above_look" : "find_friends_by_finder_live";
    }

    public final r45.f03 c() {
        r45.f03 I0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().I0("LiveMentionEntrance");
        if (I0 == null || I0.f455421e <= 0) {
            return null;
        }
        return I0;
    }

    public final void d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a aVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar2;
        r45.wo1 wo1Var;
        r45.f03 f03Var;
        boolean z17 = false;
        int i17 = (aVar == null || (f03Var = aVar.f186861b) == null) ? 0 : f03Var.f455420d;
        boolean E = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().E();
        boolean z18 = this.f476795b.F;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveEntryPreferenceMgr", "handleDataPreload: showType=" + i17 + " result=" + aVar);
        if (i17 != 6) {
            sq2.g gVar = (sq2.g) ((ys5.f) i95.n0.c(ys5.f.class));
            gVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("FinderLiveEntrance");
            java.lang.String str = null;
            r45.xs2 xs2Var = L0 != null ? L0.N : null;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gVar.f492887i, L0 != null ? L0.f65880x11c19d58 : null)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkRedDotChangeClearNewEntranceCache: clear preload cache, lastCacheTipsId=");
                sb6.append(gVar.f492887i);
                sb6.append(", currRedDotId=");
                sb6.append(L0 != null ? L0.f65880x11c19d58 : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyRefreshServiceImp", sb6.toString());
                cq2.q qVar = cq2.q.f302961a;
                qVar.b("checkRedDotChangeClearNewEntranceCache");
                if (xs2Var != null && (wo1Var = (r45.wo1) xs2Var.m75936x14adae67(30)) != null) {
                    qVar.h("redDotChange", wo1Var);
                }
            }
            gVar.f492887i = L0 != null ? L0.f65880x11c19d58 : null;
            j(E);
            boolean Bi = ((sq2.g) ((ys5.f) i95.n0.c(ys5.f.class))).Bi();
            sq2.g gVar2 = (sq2.g) ((ys5.f) i95.n0.c(ys5.f.class));
            boolean z19 = !android.text.TextUtils.isEmpty(gVar2.f492886h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gVar2.f492886h, (aVar == null || (jbVar2 = aVar.f186862c) == null) ? null : jbVar2.f65880x11c19d58);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveEntryPreferenceMgr", "isPreloadImmediately enablePreloadImmediately=" + Bi + " alreadyTriggerPreload=" + z19);
            if (Bi && !z19) {
                z17 = true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveEntryPreferenceMgr", "handleDataPreload isEnableShowFinderLiveEntranceRedDot=" + E + " isInFinderEntrance=" + z18 + " isPreloadImmediately=" + z17);
            if (E) {
                if (z18 || z17) {
                    boolean Ai = ((sq2.g) ((ys5.f) i95.n0.c(ys5.f.class))).Ai("redDotChange");
                    if (z17 && Ai) {
                        ys5.f fVar = (ys5.f) i95.n0.c(ys5.f.class);
                        if (aVar != null && (jbVar = aVar.f186862c) != null) {
                            str = jbVar.f65880x11c19d58;
                        }
                        if (str == null) {
                            str = "";
                        }
                        ((sq2.g) fVar).f492886h = str;
                    }
                }
            }
        }
    }

    public final boolean e() {
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
            a();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveEntryPreferenceMgr", "updateFinderLiveEntry return for isTeenMode.");
            return false;
        }
        if (!(!this.f476795b.P0(9007199254740992L))) {
            a();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveEntryPreferenceMgr", "updateFinderLiveEntry return for enableFinderLiveEntry");
            return false;
        }
        if (((c92.h) ((yy2.e) i95.n0.c(yy2.e.class))).Ai()) {
            return true;
        }
        a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveEntryPreferenceMgr", "updateFinderLiveEntry return for isEnableFindLive");
        return false;
    }

    public final void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveEntryPreferenceMgr", "onCreate");
        this.f476801h.m43071x58998cd();
        g();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveEntryPreferenceMgr", "global observeRedDotRcv");
        rg5.l lVar = new rg5.l(this);
        this.f476800g = lVar;
        ((c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class))).Ri(this.f476795b, lVar);
    }

    public final void g() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveEntryPreferenceMgr", "global removeObserveRedDotRcv");
        p012xc85e97e9.p093xedfae76a.k0 k0Var = this.f476800g;
        if (k0Var != null) {
            ((c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.M.mo522xb5bdeb7a(k0Var);
        }
        this.f476800g = null;
    }

    public final void h(int i17) {
        zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
        r45.f03 I0 = nk6.I0("LiveMentionEntrance");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = nk6.L0("LiveMentionEntrance");
        if (I0 == null || L0 == null) {
            return;
        }
        java.lang.String str = L0.f65874xb5f7102a.f470023h;
        java.lang.String str2 = str == null ? "" : str;
        rg5.g[] gVarArr = rg5.g.f476786d;
        if (i17 == 1 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, this.f476805l)) {
            return;
        }
        ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).Ri("1", L0, I0, i17, "", 0, 0, 0);
        this.f476805l = str2;
    }

    public final void i() {
        boolean z17 = this.f476796c;
        com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb = this.f476795b;
        if (z17) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var = c21357x5e7365bb.f278189w;
            if (h0Var != null) {
                h0Var.m("find_friends_by_finder_live_above_look", false);
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var2 = c21357x5e7365bb.f278189w;
            if (h0Var2 != null) {
                h0Var2.m("find_friends_by_finder_live", true);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var3 = c21357x5e7365bb.f278189w;
        if (h0Var3 != null) {
            h0Var3.m("find_friends_by_finder_live_above_look", true);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var4 = c21357x5e7365bb.f278189w;
        if (h0Var4 != null) {
            h0Var4.m("find_friends_by_finder_live", false);
        }
    }

    public final void j(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#startPreloadTargetPage-new enableShowLiveEntranceRedDot=");
        sb6.append(z17);
        sb6.append(" isInFindEntrance=");
        com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb = this.f476795b;
        sb6.append(c21357x5e7365bb.F);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveEntryPreferenceMgr", sb6.toString());
        if (z17 && c21357x5e7365bb.F) {
            if (!((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).lk()) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_context_id", com.p314xaae8f345.mm.ui.p2731xc84c5534.e0.a());
                ((v40.w) ((uc.p) i95.n0.c(uc.p.class))).getClass();
                nq2.d dVar = nq2.d.f420513a;
                if (c92.g.f121271a.b()) {
                    dVar.j(intent);
                    return;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("NearbyPreloadManager", "startPreloadInFinderLiveEntry return for not isEnableFindLive.");
                    return;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveEntryPreferenceMgr", "#startPreloadTargetPage-new go in");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("FinderLiveEntrance");
            if (L0 != null) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("#startPreloadTargetPage-new pre_load=");
                r45.xs2 xs2Var = L0.N;
                sb7.append(xs2Var.m75939xb282bd08(17));
                sb7.append(" object_id=");
                sb7.append(xs2Var.m75942xfb822ef2(3));
                sb7.append(", ");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveEntryPreferenceMgr", sb7.toString());
                int m75939xb282bd08 = xs2Var.m75939xb282bd08(13);
                long m75942xfb822ef2 = xs2Var.m75942xfb822ef2(3);
                if (m75939xb282bd08 == 1) {
                    ((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).getClass();
                    dp2.e.f323725a.c(null, m75942xfb822ef2, "", true, 325, null);
                }
            }
        }
    }
}
