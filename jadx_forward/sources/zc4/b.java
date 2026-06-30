package zc4;

/* loaded from: classes4.dex */
public final class b extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final xc4.p f552966d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f552967e;

    public /* synthetic */ b(xc4.p pVar, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(pVar, (i17 & 2) != 0 ? true : z17);
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSameContent", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        zc4.b other = (zc4.b) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSameContent", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        xc4.p pVar = other.f552966d;
        boolean z17 = false;
        if (pVar.mo133058x3172ed()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSameContent", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        } else {
            xc4.p pVar2 = this.f552966d;
            if (pVar2.m125472x5c5a33d4(pVar) && ca4.z0.t0(pVar2.y0()).equals(ca4.z0.t0(pVar.y0())) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(pVar2.W0(), pVar.W0())) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getForceUpdateFlag", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
                long j17 = pVar2.S1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getForceUpdateFlag", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getForceUpdateFlag", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
                long j18 = pVar.S1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getForceUpdateFlag", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
                if (j17 == j18) {
                    z17 = true;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSameContent", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSameContent", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        return z17;
    }

    @Override // xm3.a
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clone", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        java.lang.Object mo14053x5a5dd5d = super.mo14053x5a5dd5d();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clone", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        return mo14053x5a5dd5d;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("compareTo", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        zc4.b other = (zc4.b) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("compareTo", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        xc4.p pVar = other.f552966d;
        int m125473x3fdd41df = pVar.m125473x3fdd41df();
        xc4.p pVar2 = this.f552966d;
        int i17 = m125473x3fdd41df != pVar2.m125473x3fdd41df() ? p3321xbce91901.jvm.p3324x21ffc6bd.o.i(pVar.m125473x3fdd41df(), pVar2.m125473x3fdd41df()) : pVar.a1().compareTo(pVar2.a1());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compareTo", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compareTo", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        return i17;
    }

    @Override // xm3.a
    /* renamed from: equals */
    public boolean mo148314xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        if (!(obj instanceof zc4.b)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
            return false;
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(v(), ((zc4.b) obj).v());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        return b17;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:56:0x00a3. Please report as an issue. */
    @Override // xm3.a, in5.c
    public int h() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemType", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
        xc4.p info = this.f552966d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        if (info instanceof xc4.a) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
            i17 = 100;
        } else if (info instanceof h94.c) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
            i17 = 98;
        } else {
            if (info.mo133058x3172ed()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
            } else if (this.f552967e && info.m175348xf9b3b2c7() && !pc4.d.f434943a.F()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                i17 = 7;
            } else {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 h17 = info.h1();
                r45.a90 a90Var = h17.f39014x86965dde;
                int i18 = a90Var.f451370e;
                if (i18 != 1) {
                    int i19 = 2;
                    if (i18 != 2) {
                        i19 = 3;
                        if (i18 != 3) {
                            int i27 = 9;
                            if (i18 != 4) {
                                if (i18 != 5 && i18 != 9) {
                                    i27 = 10;
                                    if (i18 != 10 && i18 != 17 && i18 != 26) {
                                        if (i18 != 34) {
                                            if (i18 != 101 && i18 != 22 && i18 != 23 && i18 != 41) {
                                                if (i18 == 42) {
                                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                                                } else if (i18 != 58) {
                                                    if (i18 != 59) {
                                                        switch (i18) {
                                                            case 12:
                                                            case 13:
                                                            case 14:
                                                                break;
                                                            case 15:
                                                                if (!pc4.d.f434943a.d(info.h1())) {
                                                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                                                                    break;
                                                                } else {
                                                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                                                                    i17 = 13;
                                                                    break;
                                                                }
                                                            default:
                                                                switch (i18) {
                                                                    case 28:
                                                                        break;
                                                                    case 29:
                                                                    case 30:
                                                                        break;
                                                                    default:
                                                                        switch (i18) {
                                                                            default:
                                                                                switch (i18) {
                                                                                    case 44:
                                                                                    case 46:
                                                                                    case com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject.f33159x41d5d4eb /* 49 */:
                                                                                    case 51:
                                                                                    case 52:
                                                                                    case 53:
                                                                                    case 55:
                                                                                    case 56:
                                                                                        break;
                                                                                    case 45:
                                                                                        break;
                                                                                    case 47:
                                                                                        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                                                                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                                                                                        if (!je4.g.d(context, h17)) {
                                                                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                                                                                            i17 = 4;
                                                                                            break;
                                                                                        } else {
                                                                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                                                                                            break;
                                                                                        }
                                                                                    case 48:
                                                                                        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                                                                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                                                                                        if (!je4.g.d(context2, h17)) {
                                                                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                                                                                            i17 = 4;
                                                                                            break;
                                                                                        } else {
                                                                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                                                                                            i17 = i27;
                                                                                            break;
                                                                                        }
                                                                                    case 50:
                                                                                        break;
                                                                                    case 54:
                                                                                        break;
                                                                                    default:
                                                                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                                                                                        break;
                                                                                }
                                                                            case 36:
                                                                            case 37:
                                                                            case 38:
                                                                            case 39:
                                                                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                                                                                i17 = 4;
                                                                                break;
                                                                        }
                                                                }
                                                        }
                                                    }
                                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                                                    i17 = 5;
                                                }
                                                i17 = 8;
                                            }
                                        }
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                                        i17 = 6;
                                    }
                                }
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                                i17 = 4;
                            } else {
                                r45.y8 y8Var = h17.f39012x33e0f24f;
                                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("wx5aa333606550dfd5", y8Var != null ? y8Var.f472379d : null)) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                                    i17 = 8;
                                } else {
                                    if ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_new_music_type_flag, bm5.h0.RepairerConfig_Mv_CardDownLevel_Int, 0) == 1 ? 1 : 0) == 0) {
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                                        i17 = i27;
                                    } else {
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                                        i17 = 4;
                                    }
                                }
                            }
                        } else {
                            r45.hh4 hh4Var = info.h1().f39014x86965dde.f451376n;
                            if (pc4.d.f434943a.a()) {
                                if (hh4Var != null && hh4Var.f457682d == 8) {
                                    r10 = 1;
                                }
                                if (r10 != 0 && hh4Var.f457693r > 0 && info.h1().f39014x86965dde.f451373h.size() > 1) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                                    i17 = 12;
                                }
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                            i17 = 4;
                        }
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                    }
                    i17 = i19;
                }
                r10 = a90Var.f451373h.size() != 1 ? 1 : 0;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                i17 = r10;
            }
            i17 = 99;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemType", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        return i17;
    }

    public final xc4.p n() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getInfo", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInfo", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        return this.f552966d;
    }

    /* renamed from: toString */
    public java.lang.String m178673x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        java.lang.String m175349x9616526c = this.f552966d.m175349x9616526c();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        return m175349x9616526c;
    }

    @Override // xm3.d
    public java.lang.String v() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUniqueId", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        xc4.p pVar = this.f552966d;
        java.lang.String str = (pVar.mo133058x3172ed() ? "ad_table_" : "sns_table_") + '_' + pVar.U0();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUniqueId", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        return str;
    }

    public b(xc4.p info, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        this.f552966d = info;
        this.f552967e = z17;
    }
}
