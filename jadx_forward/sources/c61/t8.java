package c61;

@j95.b
/* loaded from: classes8.dex */
public final class t8 extends i95.w implements zy2.ca {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f120837d = "FinderRedDotExportService";

    /* renamed from: e, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.g f120838e;

    public static final void mj(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        i95.m c17 = i95.n0.c(zy2.b6.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ya2.t1 t1Var = new ya2.t1(null, null, null, null, null, 31, null);
        t1Var.f542079i = gVar;
        ((c61.l7) ((zy2.b6) c17)).P.f(826259965, 11, null, t1Var);
    }

    public void Ai(java.lang.String str, java.lang.String str2) {
        i95.m c17 = i95.n0.c(c61.l7.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.fa nk6 = ((c61.l7) c17).nk();
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar : nk6.f(24, str == null ? g92.b.f351302e.y4(null) : str)) {
            nk6.g0(jbVar, "FinderMyTab", false, str);
            if (str2 != null) {
                nk6.g0(jbVar, str2, false, str);
            }
        }
    }

    public void Bi(android.content.Context context, com.p314xaae8f345.mm.p2495xc50a8b8b.g activityCustomInfo, java.lang.String showInfoPath, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityCustomInfo, "activityCustomInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(showInfoPath, "showInfoPath");
        r45.um4 um4Var = new r45.um4();
        um4Var.m75932x347fbd55(activityCustomInfo.g());
        java.lang.String m75945x2fec8307 = um4Var.m75945x2fec8307(0);
        java.lang.String m75945x2fec83072 = um4Var.m75945x2fec8307(1);
        if (m75945x2fec8307 != null && m75945x2fec83072 != null) {
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            int m75939xb282bd08 = um4Var.m75939xb282bd08(2);
            cq.k1.a();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            java.lang.Boolean bool = (java.lang.Boolean) ((nb2.a) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.M4).mo141623x754a37bb()).r();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ActivityRouter", "enter we app appId:" + m75945x2fec8307 + ",enterPath:" + m75945x2fec83072 + ",scene:" + m75939xb282bd08 + ",sceneNote:");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m75945x2fec8307)) {
                l81.b1 b1Var = new l81.b1();
                b1Var.f398545a = m75945x2fec8307;
                b1Var.f398555f = m75945x2fec83072;
                b1Var.f398565k = m75939xb282bd08;
                b1Var.f398567l = "";
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE)) {
                    b1Var.f398549c = 2;
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(context, b1Var);
            }
        }
        i95.m c18 = i95.n0.c(c61.t8.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        ((c61.t8) c18).Ai(str, showInfoPath);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public p012xc85e97e9.p093xedfae76a.j0 Di(java.lang.String redDotPath) {
        p012xc85e97e9.p093xedfae76a.j0 j0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(redDotPath, "redDotPath");
        switch (redDotPath.hashCode()) {
            case -1746544006:
                if (redDotPath.equals("Search.MentionEntrance")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa aaVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186886a;
                    j0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.B0;
                    break;
                }
                j0Var = null;
                break;
            case -807512522:
                if (redDotPath.equals("Search.Mention.Bubble")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa aaVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186886a;
                    j0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.C0;
                    break;
                }
                j0Var = null;
                break;
            case -272525474:
                if (redDotPath.equals("Search.ZhuGe.PersonalCenter.PublicMsg.LikeTab")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa aaVar3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186886a;
                    j0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.I0;
                    break;
                }
                j0Var = null;
                break;
            case 150802492:
                if (redDotPath.equals("Search.Entrance")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa aaVar4 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186886a;
                    j0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.A0;
                    break;
                }
                j0Var = null;
                break;
            case 202744104:
                if (redDotPath.equals("Search.ZhuGe.PersonalCenter.PrivateMsg")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa aaVar5 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186886a;
                    j0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.E0;
                    break;
                }
                j0Var = null;
                break;
            case 821223662:
                if (redDotPath.equals("Search.ZhuGe.PersonalCenter.PublicMsg")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa aaVar6 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186886a;
                    j0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.H0;
                    break;
                }
                j0Var = null;
                break;
            case 1036264708:
                if (redDotPath.equals("Search.ZhuGe.PersonalCenter.PublicMsg.FollowTab")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa aaVar7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186886a;
                    j0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.K0;
                    break;
                }
                j0Var = null;
                break;
            case 1434833444:
                if (redDotPath.equals("Search.ZhuGe.PersonalCenter")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa aaVar8 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186886a;
                    j0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.D0;
                    break;
                }
                j0Var = null;
                break;
            case 1799485066:
                if (redDotPath.equals("Search.ZhuGe.PersonalCenter.PrivateMsg.ValueTab")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa aaVar9 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186886a;
                    j0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.G0;
                    break;
                }
                j0Var = null;
                break;
            case 1923683716:
                if (redDotPath.equals("Search.ZhuGe.PersonalCenter.PublicMsg.ValueTab")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa aaVar10 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186886a;
                    j0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.J0;
                    break;
                }
                j0Var = null;
                break;
            case 1940225432:
                if (redDotPath.equals("Search.ZhuGe.PersonalCenter.PrivateMsg.LikeTab")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa aaVar11 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186886a;
                    j0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.F0;
                    break;
                }
                j0Var = null;
                break;
            default:
                j0Var = null;
                break;
        }
        try {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(j0Var, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.tencent.mm.plugin.finder.extension.reddot.BaseRedDotResult>");
            return j0Var;
        } catch (java.lang.ClassCastException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f120837d, e17, "findWebSearchRedDotLiveData", new java.lang.Object[0]);
            return null;
        }
    }

    public void Ni(p012xc85e97e9.p093xedfae76a.y owner, p012xc85e97e9.p093xedfae76a.k0 observer, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        if (z17) {
            p012xc85e97e9.p093xedfae76a.j0 j0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ca.f186979a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ca.f186979a.mo522xb5bdeb7a(observer);
        } else {
            p012xc85e97e9.p093xedfae76a.j0 j0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ca.f186979a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ca.f186979a.mo7806x9d92d11c(owner, observer);
        }
    }

    public void Ri(p012xc85e97e9.p093xedfae76a.y owner, p012xc85e97e9.p093xedfae76a.k0 observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa aaVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186886a;
        p012xc85e97e9.p093xedfae76a.j0 j0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.M;
        j0Var.mo7806x9d92d11c(owner, observer);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9 z9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9) j0Var.mo3195x754a37bb();
        if (z9Var != null) {
            observer.mo525x7bb163d5(z9Var);
        }
    }

    public boolean Ui() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0 aj0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0.f207973a;
        return ((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70.f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70.f209965a, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a, "是否修复20411曝光上报", e42.c0.clicfg_finder_render_view_fix_20411_report, java.lang.Boolean.FALSE, false, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.vh0.f209731d, 8, null)).booleanValue();
    }

    public synchronized zy2.ka Vi(boolean z17) {
        if (!z17) {
            if (this.f120838e != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.g gVar = this.f120838e;
                if (gVar != null) {
                    return gVar;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderRedDotManagerOnTab");
                throw null;
            }
        }
        this.f120838e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.g();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.g gVar2 = this.f120838e;
        if (gVar2 != null) {
            return gVar2;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderRedDotManagerOnTab");
        throw null;
    }

    public r45.wy2 Zi() {
        i95.m c17 = i95.n0.c(zy2.b6.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.s7.f184071a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            return r45.wy2.kFinderSyncMyTabFinderEntranceType_None;
        }
        i95.m c18 = i95.n0.c(tk.o.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        return ((ox.g) ((tk.o) c18)).Bi() ? r45.wy2.kFinderSyncMyTabFinderEntranceType_FinderBizPhoto : r45.wy2.kFinderSyncMyTabFinderEntranceType_FinderBiz;
    }

    public boolean aj() {
        boolean z17 = !((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el() || ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
        boolean z18 = (c01.z1.j() & 34359738368L) != 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f120837d, "isEnableShowDiscovery  isEnable:true isNotShowFinder:" + z17 + " isFinderClose:" + z18);
        return (z17 || z18) ? false : true;
    }

    public p012xc85e97e9.p093xedfae76a.k0 bj(yz5.l onChange) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onChange, "onChange");
        return new c61.r8(onChange);
    }

    public void cj(p012xc85e97e9.p093xedfae76a.k0 observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        if (((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).Ri()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa aaVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186886a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9 z9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186927u0.mo3195x754a37bb();
            if (z9Var != null) {
                observer.mo525x7bb163d5(z9Var);
            }
        }
    }

    public void fj(p012xc85e97e9.p093xedfae76a.k0 observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        if (((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).Ri()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa aaVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186886a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9 z9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186931w0.mo3195x754a37bb();
            if (z9Var != null) {
                observer.mo525x7bb163d5(z9Var);
            }
        }
    }

    public void hj(p012xc85e97e9.p093xedfae76a.k0 observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        if (((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).Ri()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa aaVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186886a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9 z9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186935y0.mo3195x754a37bb();
            if (z9Var != null) {
                observer.mo525x7bb163d5(z9Var);
            }
        }
    }

    public void ij(p012xc85e97e9.p093xedfae76a.y owner, p012xc85e97e9.p093xedfae76a.k0 observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        if (((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).Ri()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa aaVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186886a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186927u0.mo7806x9d92d11c(owner, observer);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186929v0.mo7806x9d92d11c(owner, observer);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186931w0.mo7806x9d92d11c(owner, observer);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186933x0.mo7806x9d92d11c(owner, observer);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186935y0.mo7806x9d92d11c(owner, observer);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186937z0.mo7806x9d92d11c(owner, observer);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186925t0.mo7806x9d92d11c(owner, observer);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186893d0.mo7806x9d92d11c(owner, observer);
        }
    }

    public void nj(r45.wy2 type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        pm0.v.K(null, new c61.s8(type, this));
    }

    public void wi(java.lang.String path, java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        ((c61.l7) i95.n0.c(c61.l7.class)).nk().T(path, username);
    }
}
