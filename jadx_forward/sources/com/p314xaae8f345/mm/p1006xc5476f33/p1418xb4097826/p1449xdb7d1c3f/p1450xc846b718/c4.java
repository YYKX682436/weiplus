package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class c4 {

    /* renamed from: a, reason: collision with root package name */
    public final zy2.fa f186971a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f186972b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f186973c;

    public c4(zy2.fa redDotManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(redDotManager, "redDotManager");
        this.f186971a = redDotManager;
        this.f186972b = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.b4.f186950d);
        this.f186973c = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a4(this));
    }

    public static final void e(java.lang.StringBuilder sb6) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotExposeHandler", "[onRedDotExposureEventCallProcess] " + ((java.lang.Object) sb6));
    }

    public final synchronized void a(java.lang.String path, java.lang.String tipsUuid, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb redDotCtrlInfo) {
        r45.q40 q40Var;
        r45.q40 q40Var2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipsUuid, "tipsUuid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(redDotCtrlInfo, "redDotCtrlInfo");
        r45.f03 I0 = redDotCtrlInfo.I0(path);
        if (I0 != null) {
            r45.q40 q40Var3 = I0.f455430q;
            if (q40Var3 == null) {
                q40Var3 = new r45.q40();
            }
            I0.f455430q = q40Var3;
            long c17 = c01.id.c();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.y3 y3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.y3) c().get(path);
            if (y3Var != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(y3Var.f187560d, tipsUuid)) {
                if (y3Var.f187561e > 0 && (q40Var2 = I0.f455430q) != null) {
                    q40Var2.f465196n = (long) java.lang.Math.ceil((c17 - r11) / 1000.0d);
                }
                if (y3Var.f187562f > 0 && (q40Var = I0.f455430q) != null) {
                    q40Var.f465197o = (long) java.lang.Math.ceil((c17 - r11) / 1000.0d);
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[fillExposeInfo] path=");
                sb6.append(path);
                sb6.append(", tipsUuid=");
                sb6.append(tipsUuid);
                sb6.append(", exposeTimeInfo: ");
                sb6.append(y3Var);
                sb6.append(", currentTime: ");
                sb6.append(c17);
                sb6.append(", expose_interval=");
                r45.q40 q40Var4 = I0.f455430q;
                sb6.append(q40Var4 != null ? java.lang.Long.valueOf(q40Var4.f465196n) : null);
                sb6.append(", last_expose_interval=");
                r45.q40 q40Var5 = I0.f455430q;
                sb6.append(q40Var5 != null ? java.lang.Long.valueOf(q40Var5.f465197o) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotExposeHandler", sb6.toString());
                r7 = jz5.f0.f384359a;
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[fillExposeInfo] path=");
            sb7.append(path);
            sb7.append(", tipsUuid=");
            sb7.append(tipsUuid);
            sb7.append(", exposeTimeInfo: ");
            sb7.append(y3Var);
            sb7.append(", info_uuid: ");
            sb7.append(y3Var != null ? y3Var.f187560d : null);
            sb7.append(", currentTime: ");
            sb7.append(c17);
            sb7.append(", expose_interval=");
            r45.q40 q40Var6 = I0.f455430q;
            sb7.append(q40Var6 != null ? java.lang.Long.valueOf(q40Var6.f465196n) : null);
            sb7.append(", last_expose_interval=");
            r45.q40 q40Var7 = I0.f455430q;
            sb7.append(q40Var7 != null ? java.lang.Long.valueOf(q40Var7.f465197o) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotExposeHandler", sb7.toString());
            return;
        }
        if (r7 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotExposeHandler", "fillExposeInfo path=" + path + ",tipsUuid=" + tipsUuid + ", show_info not found! paths in ctrl_info: " + redDotCtrlInfo.J0());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008b, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r6.f187560d, r5) != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r20, java.lang.String r21, zy2.na r22) {
        /*
            Method dump skipped, instructions count: 741
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.c4.b(boolean, java.lang.String, zy2.na):void");
    }

    public final java.util.concurrent.ConcurrentHashMap c() {
        return (java.util.concurrent.ConcurrentHashMap) ((jz5.n) this.f186973c).mo141623x754a37bb();
    }

    public final void d(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5893x481fedbf c5893x481fedbf) {
        java.lang.StringBuilder sb6;
        am.jq jqVar = c5893x481fedbf.f136201g;
        if (jqVar.f88595a == 2) {
            java.lang.Object obj = jqVar.f88599e.get("show_path");
            java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
            if ((str == null || str.length() == 0) || !((java.util.List) ((jz5.n) this.f186972b).mo141623x754a37bb()).contains(str)) {
                return;
            }
            java.lang.Object obj2 = jqVar.f88599e.get("tips_uuid");
            java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("tabId=" + jqVar.f88595a + ",eventId=" + jqVar.f88596b + ",entryKey=" + jqVar.f88597c + ",redDotId=" + jqVar.f88598d + ",show_path=" + str + ",tipsUuid=" + str2 + ' ');
            if (str2 == null || str2.length() == 0) {
                sb6 = sb7;
            } else {
                long c17 = c01.id.c();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.y3 y3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.y3) c().get(str);
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jqVar.f88596b, "findmorefriendsui_red_dot_exp")) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(y3Var != null ? y3Var.f187560d : null, str2)) {
                        y3Var.f187562f = c17;
                        sb7.append("info is exist, update lastExposeTime=" + c17 + ", tipsUuid=" + str2);
                        sb6 = sb7;
                    } else {
                        c().put(str, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.y3(str2, c17, c17, -1L, 0L));
                        sb6 = sb7;
                        sb6.append("info not match, info: " + y3Var + ", lastExposeTime=" + c17 + ", tipsUuid=" + str2);
                    }
                    f();
                } else {
                    java.lang.String str3 = str2;
                    sb6 = sb7;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jqVar.f88596b, "findmorefriendsui_red_dot_unexp")) {
                        if (y3Var == null) {
                            sb6.append("not cache path=" + str);
                            e(sb6);
                            return;
                        }
                        java.lang.String str4 = y3Var.f187560d;
                        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str4, str3)) {
                            sb6.append(jqVar.f88597c + ' ' + str + " tipsUuid=" + str3 + " unexpose, cache uuid=" + str4 + " not match");
                            e(sb6);
                            return;
                        }
                        long j17 = y3Var.f187562f;
                        if (j17 <= 0) {
                            sb6.append(jqVar.f88597c + " unexpose,but expose time=" + y3Var.f187562f);
                            e(sb6);
                            return;
                        }
                        y3Var.f187563g = c17;
                        long j18 = c17 - j17;
                        long j19 = y3Var.f187564h + j18;
                        sb6.append(jqVar.f88597c + " unexpose, last expose time=" + y3Var.f187562f + ", currentExposureDuration=" + j18 + ", accumulate=" + j19);
                        y3Var.f187564h = j19;
                        f();
                    }
                }
            }
            e(sb6);
        }
    }

    public final void f() {
        java.lang.Object m143895xf1229813;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            java.lang.String g17 = new com.p176xb6135e39.p280x308fcb.i().g(c());
            if (g17 == null) {
                g17 = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.y6 y6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.y6) ((jz5.n) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x2) this.f186971a).f187514i).mo141623x754a37bb();
            y6Var.getClass();
            y6Var.f187567a.D("KEY_FINDER_RED_DOT_EXPOSE_TIME_INFO_MAP", g17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotExposeHandler", "[updateExposeTimeInfoMap] json= ".concat(g17));
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.RedDotExposeHandler", m143898xd4a2fc34, "[updateExposeTimeInfoMap] failed!", new java.lang.Object[0]);
        }
    }
}
