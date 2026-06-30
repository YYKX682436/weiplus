package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class c4 {

    /* renamed from: a, reason: collision with root package name */
    public final zy2.fa f105438a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f105439b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f105440c;

    public c4(zy2.fa redDotManager) {
        kotlin.jvm.internal.o.g(redDotManager, "redDotManager");
        this.f105438a = redDotManager;
        this.f105439b = jz5.h.b(com.tencent.mm.plugin.finder.extension.reddot.b4.f105417d);
        this.f105440c = jz5.h.b(new com.tencent.mm.plugin.finder.extension.reddot.a4(this));
    }

    public static final void e(java.lang.StringBuilder sb6) {
        com.tencent.mars.xlog.Log.i("Finder.RedDotExposeHandler", "[onRedDotExposureEventCallProcess] " + ((java.lang.Object) sb6));
    }

    public final synchronized void a(java.lang.String path, java.lang.String tipsUuid, com.tencent.mm.plugin.finder.extension.reddot.jb redDotCtrlInfo) {
        r45.q40 q40Var;
        r45.q40 q40Var2;
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(tipsUuid, "tipsUuid");
        kotlin.jvm.internal.o.g(redDotCtrlInfo, "redDotCtrlInfo");
        r45.f03 I0 = redDotCtrlInfo.I0(path);
        if (I0 != null) {
            r45.q40 q40Var3 = I0.f373897q;
            if (q40Var3 == null) {
                q40Var3 = new r45.q40();
            }
            I0.f373897q = q40Var3;
            long c17 = c01.id.c();
            com.tencent.mm.plugin.finder.extension.reddot.y3 y3Var = (com.tencent.mm.plugin.finder.extension.reddot.y3) c().get(path);
            if (y3Var != null && kotlin.jvm.internal.o.b(y3Var.f106027d, tipsUuid)) {
                if (y3Var.f106028e > 0 && (q40Var2 = I0.f373897q) != null) {
                    q40Var2.f383663n = (long) java.lang.Math.ceil((c17 - r11) / 1000.0d);
                }
                if (y3Var.f106029f > 0 && (q40Var = I0.f373897q) != null) {
                    q40Var.f383664o = (long) java.lang.Math.ceil((c17 - r11) / 1000.0d);
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
                r45.q40 q40Var4 = I0.f373897q;
                sb6.append(q40Var4 != null ? java.lang.Long.valueOf(q40Var4.f383663n) : null);
                sb6.append(", last_expose_interval=");
                r45.q40 q40Var5 = I0.f373897q;
                sb6.append(q40Var5 != null ? java.lang.Long.valueOf(q40Var5.f383664o) : null);
                com.tencent.mars.xlog.Log.i("Finder.RedDotExposeHandler", sb6.toString());
                r7 = jz5.f0.f302826a;
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[fillExposeInfo] path=");
            sb7.append(path);
            sb7.append(", tipsUuid=");
            sb7.append(tipsUuid);
            sb7.append(", exposeTimeInfo: ");
            sb7.append(y3Var);
            sb7.append(", info_uuid: ");
            sb7.append(y3Var != null ? y3Var.f106027d : null);
            sb7.append(", currentTime: ");
            sb7.append(c17);
            sb7.append(", expose_interval=");
            r45.q40 q40Var6 = I0.f373897q;
            sb7.append(q40Var6 != null ? java.lang.Long.valueOf(q40Var6.f383663n) : null);
            sb7.append(", last_expose_interval=");
            r45.q40 q40Var7 = I0.f373897q;
            sb7.append(q40Var7 != null ? java.lang.Long.valueOf(q40Var7.f383664o) : null);
            com.tencent.mars.xlog.Log.i("Finder.RedDotExposeHandler", sb7.toString());
            return;
        }
        if (r7 == null) {
            com.tencent.mars.xlog.Log.i("Finder.RedDotExposeHandler", "fillExposeInfo path=" + path + ",tipsUuid=" + tipsUuid + ", show_info not found! paths in ctrl_info: " + redDotCtrlInfo.J0());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008b, code lost:
    
        if (kotlin.jvm.internal.o.b(r6.f106027d, r5) != false) goto L28;
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.c4.b(boolean, java.lang.String, zy2.na):void");
    }

    public final java.util.concurrent.ConcurrentHashMap c() {
        return (java.util.concurrent.ConcurrentHashMap) ((jz5.n) this.f105440c).getValue();
    }

    public final void d(com.tencent.mm.autogen.events.RedDotExposureEventEvent redDotExposureEventEvent) {
        java.lang.StringBuilder sb6;
        am.jq jqVar = redDotExposureEventEvent.f54668g;
        if (jqVar.f7062a == 2) {
            java.lang.Object obj = jqVar.f7066e.get("show_path");
            java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
            if ((str == null || str.length() == 0) || !((java.util.List) ((jz5.n) this.f105439b).getValue()).contains(str)) {
                return;
            }
            java.lang.Object obj2 = jqVar.f7066e.get("tips_uuid");
            java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("tabId=" + jqVar.f7062a + ",eventId=" + jqVar.f7063b + ",entryKey=" + jqVar.f7064c + ",redDotId=" + jqVar.f7065d + ",show_path=" + str + ",tipsUuid=" + str2 + ' ');
            if (str2 == null || str2.length() == 0) {
                sb6 = sb7;
            } else {
                long c17 = c01.id.c();
                com.tencent.mm.plugin.finder.extension.reddot.y3 y3Var = (com.tencent.mm.plugin.finder.extension.reddot.y3) c().get(str);
                if (kotlin.jvm.internal.o.b(jqVar.f7063b, "findmorefriendsui_red_dot_exp")) {
                    if (kotlin.jvm.internal.o.b(y3Var != null ? y3Var.f106027d : null, str2)) {
                        y3Var.f106029f = c17;
                        sb7.append("info is exist, update lastExposeTime=" + c17 + ", tipsUuid=" + str2);
                        sb6 = sb7;
                    } else {
                        c().put(str, new com.tencent.mm.plugin.finder.extension.reddot.y3(str2, c17, c17, -1L, 0L));
                        sb6 = sb7;
                        sb6.append("info not match, info: " + y3Var + ", lastExposeTime=" + c17 + ", tipsUuid=" + str2);
                    }
                    f();
                } else {
                    java.lang.String str3 = str2;
                    sb6 = sb7;
                    if (kotlin.jvm.internal.o.b(jqVar.f7063b, "findmorefriendsui_red_dot_unexp")) {
                        if (y3Var == null) {
                            sb6.append("not cache path=" + str);
                            e(sb6);
                            return;
                        }
                        java.lang.String str4 = y3Var.f106027d;
                        if (!kotlin.jvm.internal.o.b(str4, str3)) {
                            sb6.append(jqVar.f7064c + ' ' + str + " tipsUuid=" + str3 + " unexpose, cache uuid=" + str4 + " not match");
                            e(sb6);
                            return;
                        }
                        long j17 = y3Var.f106029f;
                        if (j17 <= 0) {
                            sb6.append(jqVar.f7064c + " unexpose,but expose time=" + y3Var.f106029f);
                            e(sb6);
                            return;
                        }
                        y3Var.f106030g = c17;
                        long j18 = c17 - j17;
                        long j19 = y3Var.f106031h + j18;
                        sb6.append(jqVar.f7064c + " unexpose, last expose time=" + y3Var.f106029f + ", currentExposureDuration=" + j18 + ", accumulate=" + j19);
                        y3Var.f106031h = j19;
                        f();
                    }
                }
            }
            e(sb6);
        }
    }

    public final void f() {
        java.lang.Object m521constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.String g17 = new com.google.gson.i().g(c());
            if (g17 == null) {
                g17 = "";
            }
            com.tencent.mm.plugin.finder.extension.reddot.y6 y6Var = (com.tencent.mm.plugin.finder.extension.reddot.y6) ((jz5.n) ((com.tencent.mm.plugin.finder.extension.reddot.x2) this.f105438a).f105981i).getValue();
            y6Var.getClass();
            y6Var.f106034a.D("KEY_FINDER_RED_DOT_EXPOSE_TIME_INFO_MAP", g17);
            com.tencent.mars.xlog.Log.i("Finder.RedDotExposeHandler", "[updateExposeTimeInfoMap] json= ".concat(g17));
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.RedDotExposeHandler", m524exceptionOrNullimpl, "[updateExposeTimeInfoMap] failed!", new java.lang.Object[0]);
        }
    }
}
