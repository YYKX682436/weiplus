package c61;

@j95.b
/* loaded from: classes8.dex */
public final class t8 extends i95.w implements zy2.ca {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f39304d = "FinderRedDotExportService";

    /* renamed from: e, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.finder.extension.reddot.g f39305e;

    public static final void mj(com.tencent.mm.protobuf.g gVar) {
        i95.m c17 = i95.n0.c(zy2.b6.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ya2.t1 t1Var = new ya2.t1(null, null, null, null, null, 31, null);
        t1Var.f460546i = gVar;
        ((c61.l7) ((zy2.b6) c17)).P.f(826259965, 11, null, t1Var);
    }

    public void Ai(java.lang.String str, java.lang.String str2) {
        i95.m c17 = i95.n0.c(c61.l7.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.fa nk6 = ((c61.l7) c17).nk();
        for (com.tencent.mm.plugin.finder.extension.reddot.jb jbVar : nk6.f(24, str == null ? g92.b.f269769e.y4(null) : str)) {
            nk6.g0(jbVar, "FinderMyTab", false, str);
            if (str2 != null) {
                nk6.g0(jbVar, str2, false, str);
            }
        }
    }

    public void Bi(android.content.Context context, com.tencent.mm.protobuf.g activityCustomInfo, java.lang.String showInfoPath, java.lang.String str) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(activityCustomInfo, "activityCustomInfo");
        kotlin.jvm.internal.o.g(showInfoPath, "showInfoPath");
        r45.um4 um4Var = new r45.um4();
        um4Var.fromProtobuf(activityCustomInfo.g());
        java.lang.String string = um4Var.getString(0);
        java.lang.String string2 = um4Var.getString(1);
        if (string != null && string2 != null) {
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            int integer = um4Var.getInteger(2);
            cq.k1.a();
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            java.lang.Boolean bool = (java.lang.Boolean) ((nb2.a) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.M4).getValue()).r();
            com.tencent.mars.xlog.Log.i("Finder.ActivityRouter", "enter we app appId:" + string + ",enterPath:" + string2 + ",scene:" + integer + ",sceneNote:");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                l81.b1 b1Var = new l81.b1();
                b1Var.f317012a = string;
                b1Var.f317022f = string2;
                b1Var.f317032k = integer;
                b1Var.f317034l = "";
                if (kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE)) {
                    b1Var.f317016c = 2;
                }
                ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(context, b1Var);
            }
        }
        i95.m c18 = i95.n0.c(c61.t8.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        ((c61.t8) c18).Ai(str, showInfoPath);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public androidx.lifecycle.j0 Di(java.lang.String redDotPath) {
        androidx.lifecycle.j0 j0Var;
        kotlin.jvm.internal.o.g(redDotPath, "redDotPath");
        switch (redDotPath.hashCode()) {
            case -1746544006:
                if (redDotPath.equals("Search.MentionEntrance")) {
                    com.tencent.mm.plugin.finder.extension.reddot.aa aaVar = com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a;
                    j0Var = com.tencent.mm.plugin.finder.extension.reddot.aa.B0;
                    break;
                }
                j0Var = null;
                break;
            case -807512522:
                if (redDotPath.equals("Search.Mention.Bubble")) {
                    com.tencent.mm.plugin.finder.extension.reddot.aa aaVar2 = com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a;
                    j0Var = com.tencent.mm.plugin.finder.extension.reddot.aa.C0;
                    break;
                }
                j0Var = null;
                break;
            case -272525474:
                if (redDotPath.equals("Search.ZhuGe.PersonalCenter.PublicMsg.LikeTab")) {
                    com.tencent.mm.plugin.finder.extension.reddot.aa aaVar3 = com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a;
                    j0Var = com.tencent.mm.plugin.finder.extension.reddot.aa.I0;
                    break;
                }
                j0Var = null;
                break;
            case 150802492:
                if (redDotPath.equals("Search.Entrance")) {
                    com.tencent.mm.plugin.finder.extension.reddot.aa aaVar4 = com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a;
                    j0Var = com.tencent.mm.plugin.finder.extension.reddot.aa.A0;
                    break;
                }
                j0Var = null;
                break;
            case 202744104:
                if (redDotPath.equals("Search.ZhuGe.PersonalCenter.PrivateMsg")) {
                    com.tencent.mm.plugin.finder.extension.reddot.aa aaVar5 = com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a;
                    j0Var = com.tencent.mm.plugin.finder.extension.reddot.aa.E0;
                    break;
                }
                j0Var = null;
                break;
            case 821223662:
                if (redDotPath.equals("Search.ZhuGe.PersonalCenter.PublicMsg")) {
                    com.tencent.mm.plugin.finder.extension.reddot.aa aaVar6 = com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a;
                    j0Var = com.tencent.mm.plugin.finder.extension.reddot.aa.H0;
                    break;
                }
                j0Var = null;
                break;
            case 1036264708:
                if (redDotPath.equals("Search.ZhuGe.PersonalCenter.PublicMsg.FollowTab")) {
                    com.tencent.mm.plugin.finder.extension.reddot.aa aaVar7 = com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a;
                    j0Var = com.tencent.mm.plugin.finder.extension.reddot.aa.K0;
                    break;
                }
                j0Var = null;
                break;
            case 1434833444:
                if (redDotPath.equals("Search.ZhuGe.PersonalCenter")) {
                    com.tencent.mm.plugin.finder.extension.reddot.aa aaVar8 = com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a;
                    j0Var = com.tencent.mm.plugin.finder.extension.reddot.aa.D0;
                    break;
                }
                j0Var = null;
                break;
            case 1799485066:
                if (redDotPath.equals("Search.ZhuGe.PersonalCenter.PrivateMsg.ValueTab")) {
                    com.tencent.mm.plugin.finder.extension.reddot.aa aaVar9 = com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a;
                    j0Var = com.tencent.mm.plugin.finder.extension.reddot.aa.G0;
                    break;
                }
                j0Var = null;
                break;
            case 1923683716:
                if (redDotPath.equals("Search.ZhuGe.PersonalCenter.PublicMsg.ValueTab")) {
                    com.tencent.mm.plugin.finder.extension.reddot.aa aaVar10 = com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a;
                    j0Var = com.tencent.mm.plugin.finder.extension.reddot.aa.J0;
                    break;
                }
                j0Var = null;
                break;
            case 1940225432:
                if (redDotPath.equals("Search.ZhuGe.PersonalCenter.PrivateMsg.LikeTab")) {
                    com.tencent.mm.plugin.finder.extension.reddot.aa aaVar11 = com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a;
                    j0Var = com.tencent.mm.plugin.finder.extension.reddot.aa.F0;
                    break;
                }
                j0Var = null;
                break;
            default:
                j0Var = null;
                break;
        }
        try {
            kotlin.jvm.internal.o.e(j0Var, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.tencent.mm.plugin.finder.extension.reddot.BaseRedDotResult>");
            return j0Var;
        } catch (java.lang.ClassCastException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f39304d, e17, "findWebSearchRedDotLiveData", new java.lang.Object[0]);
            return null;
        }
    }

    public void Ni(androidx.lifecycle.y owner, androidx.lifecycle.k0 observer, boolean z17) {
        kotlin.jvm.internal.o.g(owner, "owner");
        kotlin.jvm.internal.o.g(observer, "observer");
        if (z17) {
            androidx.lifecycle.j0 j0Var = com.tencent.mm.plugin.finder.extension.reddot.ca.f105446a;
            com.tencent.mm.plugin.finder.extension.reddot.ca.f105446a.removeObserver(observer);
        } else {
            androidx.lifecycle.j0 j0Var2 = com.tencent.mm.plugin.finder.extension.reddot.ca.f105446a;
            com.tencent.mm.plugin.finder.extension.reddot.ca.f105446a.observe(owner, observer);
        }
    }

    public void Ri(androidx.lifecycle.y owner, androidx.lifecycle.k0 observer) {
        kotlin.jvm.internal.o.g(owner, "owner");
        kotlin.jvm.internal.o.g(observer, "observer");
        com.tencent.mm.plugin.finder.extension.reddot.aa aaVar = com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a;
        androidx.lifecycle.j0 j0Var = com.tencent.mm.plugin.finder.extension.reddot.aa.M;
        j0Var.observe(owner, observer);
        com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var = (com.tencent.mm.plugin.finder.extension.reddot.z9) j0Var.getValue();
        if (z9Var != null) {
            observer.onChanged(z9Var);
        }
    }

    public boolean Ui() {
        com.tencent.mm.plugin.finder.storage.aj0 aj0Var = com.tencent.mm.plugin.finder.storage.aj0.f126440a;
        return ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.z70.f(com.tencent.mm.plugin.finder.storage.z70.f128432a, com.tencent.mm.plugin.finder.storage.t70.f127590a, "是否修复20411曝光上报", e42.c0.clicfg_finder_render_view_fix_20411_report, java.lang.Boolean.FALSE, false, com.tencent.mm.plugin.finder.storage.vh0.f128198d, 8, null)).booleanValue();
    }

    public synchronized zy2.ka Vi(boolean z17) {
        if (!z17) {
            if (this.f39305e != null) {
                com.tencent.mm.plugin.finder.extension.reddot.g gVar = this.f39305e;
                if (gVar != null) {
                    return gVar;
                }
                kotlin.jvm.internal.o.o("finderRedDotManagerOnTab");
                throw null;
            }
        }
        this.f39305e = new com.tencent.mm.plugin.finder.extension.reddot.g();
        com.tencent.mm.plugin.finder.extension.reddot.g gVar2 = this.f39305e;
        if (gVar2 != null) {
            return gVar2;
        }
        kotlin.jvm.internal.o.o("finderRedDotManagerOnTab");
        throw null;
    }

    public r45.wy2 Zi() {
        i95.m c17 = i95.n0.c(zy2.b6.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        if (!com.tencent.mm.plugin.finder.assist.s7.f102538a.b(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            return r45.wy2.kFinderSyncMyTabFinderEntranceType_None;
        }
        i95.m c18 = i95.n0.c(tk.o.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        return ((ox.g) ((tk.o) c18)).Bi() ? r45.wy2.kFinderSyncMyTabFinderEntranceType_FinderBizPhoto : r45.wy2.kFinderSyncMyTabFinderEntranceType_FinderBiz;
    }

    public boolean aj() {
        boolean z17 = !((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el() || ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
        boolean z18 = (c01.z1.j() & 34359738368L) != 0;
        com.tencent.mars.xlog.Log.i(this.f39304d, "isEnableShowDiscovery  isEnable:true isNotShowFinder:" + z17 + " isFinderClose:" + z18);
        return (z17 || z18) ? false : true;
    }

    public androidx.lifecycle.k0 bj(yz5.l onChange) {
        kotlin.jvm.internal.o.g(onChange, "onChange");
        return new c61.r8(onChange);
    }

    public void cj(androidx.lifecycle.k0 observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
        if (((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).Ri()) {
            com.tencent.mm.plugin.finder.extension.reddot.aa aaVar = com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a;
            com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var = (com.tencent.mm.plugin.finder.extension.reddot.z9) com.tencent.mm.plugin.finder.extension.reddot.aa.f105394u0.getValue();
            if (z9Var != null) {
                observer.onChanged(z9Var);
            }
        }
    }

    public void fj(androidx.lifecycle.k0 observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
        if (((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).Ri()) {
            com.tencent.mm.plugin.finder.extension.reddot.aa aaVar = com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a;
            com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var = (com.tencent.mm.plugin.finder.extension.reddot.z9) com.tencent.mm.plugin.finder.extension.reddot.aa.f105398w0.getValue();
            if (z9Var != null) {
                observer.onChanged(z9Var);
            }
        }
    }

    public void hj(androidx.lifecycle.k0 observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
        if (((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).Ri()) {
            com.tencent.mm.plugin.finder.extension.reddot.aa aaVar = com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a;
            com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var = (com.tencent.mm.plugin.finder.extension.reddot.z9) com.tencent.mm.plugin.finder.extension.reddot.aa.f105402y0.getValue();
            if (z9Var != null) {
                observer.onChanged(z9Var);
            }
        }
    }

    public void ij(androidx.lifecycle.y owner, androidx.lifecycle.k0 observer) {
        kotlin.jvm.internal.o.g(owner, "owner");
        kotlin.jvm.internal.o.g(observer, "observer");
        if (((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).Ri()) {
            com.tencent.mm.plugin.finder.extension.reddot.aa aaVar = com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a;
            com.tencent.mm.plugin.finder.extension.reddot.aa.f105394u0.observe(owner, observer);
            com.tencent.mm.plugin.finder.extension.reddot.aa.f105396v0.observe(owner, observer);
            com.tencent.mm.plugin.finder.extension.reddot.aa.f105398w0.observe(owner, observer);
            com.tencent.mm.plugin.finder.extension.reddot.aa.f105400x0.observe(owner, observer);
            com.tencent.mm.plugin.finder.extension.reddot.aa.f105402y0.observe(owner, observer);
            com.tencent.mm.plugin.finder.extension.reddot.aa.f105404z0.observe(owner, observer);
            com.tencent.mm.plugin.finder.extension.reddot.aa.f105392t0.observe(owner, observer);
            com.tencent.mm.plugin.finder.extension.reddot.aa.f105360d0.observe(owner, observer);
        }
    }

    public void nj(r45.wy2 type) {
        kotlin.jvm.internal.o.g(type, "type");
        pm0.v.K(null, new c61.s8(type, this));
    }

    public void wi(java.lang.String path, java.lang.String username) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(username, "username");
        ((c61.l7) i95.n0.c(c61.l7.class)).nk().T(path, username);
    }
}
