package n74;

/* loaded from: classes4.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final n74.h0 f416896a = new n74.h0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f416897b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f416898c = new java.util.LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Set f416899d = new java.util.LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Set f416900e = new java.util.LinkedHashSet();

    public static final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 b(java.lang.String cacheName) {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getThumbDownloadChannelById", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cacheName, "cacheName");
        java.util.Map map = f416897b;
        synchronized (map) {
            try {
                if (!map.containsKey(cacheName) || ((java.util.LinkedHashMap) map).get(cacheName) == null) {
                    map.put(cacheName, p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(null));
                    java.lang.Object obj = ((java.util.LinkedHashMap) map).get(cacheName);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
                    j2Var = (p3325xe03a0797.p3326xc267989b.p3328x30012e.j2) obj;
                } else {
                    java.lang.Object obj2 = ((java.util.LinkedHashMap) map).get(cacheName);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
                    j2Var = (p3325xe03a0797.p3326xc267989b.p3328x30012e.j2) obj2;
                }
            } finally {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getThumbDownloadChannelById", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
            }
        }
        return j2Var;
    }

    public static final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 c(java.lang.String mediaId) {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVideoDownloadChannelById", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        java.util.Map map = f416898c;
        synchronized (map) {
            try {
                if (!map.containsKey(mediaId) || ((java.util.LinkedHashMap) map).get(mediaId) == null) {
                    map.put(mediaId, p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(null));
                    java.lang.Object obj = ((java.util.LinkedHashMap) map).get(mediaId);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
                    j2Var = (p3325xe03a0797.p3326xc267989b.p3328x30012e.j2) obj;
                } else {
                    java.lang.Object obj2 = ((java.util.LinkedHashMap) map).get(mediaId);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
                    j2Var = (p3325xe03a0797.p3326xc267989b.p3328x30012e.j2) obj2;
                }
            } finally {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoDownloadChannelById", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
            }
        }
        return j2Var;
    }

    public static final void d(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeThumbDownloadChannelById", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
        if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeThumbDownloadChannelById", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
            return;
        }
        java.util.Map map = f416897b;
        synchronized (map) {
            try {
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeThumbDownloadChannelById", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeThumbDownloadChannelById", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
    }

    public static final void e(java.lang.String str, n74.z zVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setThumbDownloadValue", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
        if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setThumbDownloadValue", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
            return;
        }
        if (zVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setThumbDownloadValue", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
            return;
        }
        java.util.Set set = f416899d;
        synchronized (set) {
            try {
                if (set.contains(str)) {
                    ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) b(str)).k(zVar);
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setThumbDownloadValue", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setThumbDownloadValue", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
    }

    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j a(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 i1Var, r45.jj4 jj4Var, com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSightDownloadFlow", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
        if (i1Var == null) {
            p3325xe03a0797.p3326xc267989b.p3328x30012e.p pVar = new p3325xe03a0797.p3326xc267989b.p3328x30012e.p(new n74.a0[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSightDownloadFlow", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
            return pVar;
        }
        if (jj4Var == null) {
            p3325xe03a0797.p3326xc267989b.p3328x30012e.p pVar2 = new p3325xe03a0797.p3326xc267989b.p3328x30012e.p(new n74.a0[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSightDownloadFlow", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
            return pVar2;
        }
        jj4Var.N = true;
        l44.c0.b(c17933xe8d1b226, jj4Var);
        java.util.Set set = f416900e;
        synchronized (set) {
            try {
                java.lang.String str = jj4Var.f459388d;
                if (str == null) {
                    str = "";
                }
                set.add(str);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSightDownloadFlow", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
                throw th6;
            }
        }
        java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), jj4Var.f459388d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getMediaFilePath(...)");
        java.lang.String R = ca4.z0.R(jj4Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(R, "getSnsSightName(...)");
        java.lang.String concat = com.p314xaae8f345.mm.vfs.w6.j(d17.concat(R)) ? d17.concat(R) : null;
        if (!(concat == null || r26.n0.N(concat))) {
            java.lang.String Id = jj4Var.f459388d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Id, "Id");
            p3325xe03a0797.p3326xc267989b.p3328x30012e.q qVar = new p3325xe03a0797.p3326xc267989b.p3328x30012e.q(new n74.a0(Id, concat, n74.y.f416980f));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSightDownloadFlow", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
            return qVar;
        }
        java.lang.String Id2 = jj4Var.f459388d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Id2, "Id");
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) c(Id2)).k(null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdMediaDownloadHelper", "down load sight is " + jj4Var.f459388d + " url: " + jj4Var.f459391g);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Tj().mo50297x7c4d7ca2(new n74.b0(jj4Var, s7Var), 0L);
        java.lang.String Id3 = jj4Var.f459388d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Id3, "Id");
        p3325xe03a0797.p3326xc267989b.p3328x30012e.g0 g0Var = new p3325xe03a0797.p3326xc267989b.p3328x30012e.g0(new p3325xe03a0797.p3326xc267989b.p3328x30012e.q(new n74.a0(Id3, null, n74.y.f416978d)), new n74.e0(jj4Var, null));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSightDownloadFlow", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
        return g0Var;
    }

    public final void f(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, r45.jj4 jj4Var, com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("triggerDownloadMediaSight", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
        if (jj4Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("triggerDownloadMediaSight", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
            return;
        }
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("triggerDownloadMediaSight", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
            return;
        }
        boolean z17 = true;
        jj4Var.N = true;
        java.util.Set set = f416900e;
        synchronized (set) {
            try {
                java.lang.String str = jj4Var.f459388d;
                if (str == null) {
                    str = "";
                }
                set.add(str);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("triggerDownloadMediaSight", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
                throw th6;
            }
        }
        l44.c0.b(c17933xe8d1b226, jj4Var);
        java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), jj4Var.f459388d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getMediaFilePath(...)");
        java.lang.String R = ca4.z0.R(jj4Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(R, "getSnsSightName(...)");
        java.lang.String concat = com.p314xaae8f345.mm.vfs.w6.j(d17.concat(R)) ? d17.concat(R) : null;
        if (concat != null && !r26.n0.N(concat)) {
            z17 = false;
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Tj().mo50297x7c4d7ca2(new n74.g0(jj4Var, s7Var), 0L);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("triggerDownloadMediaSight", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
    }
}
