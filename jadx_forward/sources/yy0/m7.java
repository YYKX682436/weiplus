package yy0;

@j95.b
/* loaded from: classes5.dex */
public final class m7 extends i95.w implements pp0.l0 {
    public volatile int A;
    public volatile boolean C;
    public volatile boolean D;
    public volatile java.lang.String E;

    /* renamed from: g, reason: collision with root package name */
    public volatile com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4082xa6fd740c f549761g;

    /* renamed from: h, reason: collision with root package name */
    public volatile java.lang.String f549762h;

    /* renamed from: i, reason: collision with root package name */
    public volatile java.lang.String f549763i;

    /* renamed from: m, reason: collision with root package name */
    public volatile int f549764m;

    /* renamed from: n, reason: collision with root package name */
    public volatile int f549765n;

    /* renamed from: o, reason: collision with root package name */
    public volatile java.lang.String f549766o;

    /* renamed from: p, reason: collision with root package name */
    public volatile java.lang.String f549767p;

    /* renamed from: q, reason: collision with root package name */
    public volatile java.lang.String f549768q;

    /* renamed from: r, reason: collision with root package name */
    public volatile java.lang.String f549769r;

    /* renamed from: s, reason: collision with root package name */
    public volatile java.lang.String f549770s;

    /* renamed from: t, reason: collision with root package name */
    public volatile int f549771t;

    /* renamed from: u, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p2495xc50a8b8b.g f549772u;

    /* renamed from: v, reason: collision with root package name */
    public volatile int f549773v;

    /* renamed from: w, reason: collision with root package name */
    public volatile boolean f549774w;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f549775x;

    /* renamed from: y, reason: collision with root package name */
    public volatile boolean f549776y;

    /* renamed from: z, reason: collision with root package name */
    public volatile int f549777z;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f549758d = "MicroMsg.MJPublisherSessionMetricsFeatureService";

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f549759e = jz5.h.b(yy0.l7.f549736d);

    /* renamed from: f, reason: collision with root package name */
    public yy0.q0 f549760f = yy0.q0.f549820d;
    public volatile boolean B = true;

    public java.util.Map Ai() {
        java.util.Map c17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f549758d, "generateReportingParams");
        synchronized (yy0.m7.class) {
            java.lang.String str = "";
            try {
                if (this.f549772u != null) {
                    com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f549772u;
                    str = android.util.Base64.encodeToString(gVar != null ? gVar.f273689a : null, 2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "encodeToString(...)");
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f549758d, "encodeToString mjPublisherSelectedTemplateSessionBuffer exception: " + e17);
                str = "";
            }
            c17 = p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(kz5.c1.k(new jz5.l("enter_scene", java.lang.Integer.valueOf(this.f549764m)), new jz5.l("mj_publisher_session_id", this.f549762h), new jz5.l("source_feed_id", this.f549766o), new jz5.l("source_song_id", this.f549767p), new jz5.l("follow_feed_template_id", this.f549768q), new jz5.l("template_id", this.f549769r), new jz5.l("template_tab_id", this.f549770s), new jz5.l("template_position", java.lang.Integer.valueOf(this.f549771t)), new jz5.l("template_session_buffer", str), new jz5.l("template_type", java.lang.Integer.valueOf(this.f549773v)), new jz5.l("template_is_favorite", java.lang.Boolean.valueOf(this.f549774w)), new jz5.l("template_is_aigc", java.lang.Boolean.valueOf(this.f549775x)), new jz5.l("export_scene", java.lang.Integer.valueOf(this.f549765n)), new jz5.l("is_sc_asset_generate", java.lang.Boolean.valueOf(this.f549776y)), new jz5.l("video_source", java.lang.Integer.valueOf(this.f549777z)), new jz5.l("creation_page_id", java.lang.Integer.valueOf(this.A)), new jz5.l("post_id", this.E)));
        }
        return c17;
    }

    public void Aj(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f549758d, "setSelectedTemplateType: " + i17);
        synchronized (yy0.m7.class) {
            this.f549773v = i17;
        }
    }

    public int Bi() {
        int i17;
        synchronized (yy0.m7.class) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f549758d, "getEnterScene: " + this.f549764m);
            i17 = this.f549764m;
        }
        return i17;
    }

    public void Bj(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f549758d, "setVideoSource: " + i17);
        synchronized (yy0.m7.class) {
            this.f549777z = i17;
        }
    }

    public final p3325xe03a0797.p3326xc267989b.y0 Di() {
        return (p3325xe03a0797.p3326xc267989b.y0) ((jz5.n) this.f549759e).mo141623x754a37bb();
    }

    public java.lang.String Ni() {
        java.lang.String str;
        synchronized (yy0.m7.class) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f549758d, "getSelectedTemplateID: " + this.f549769r);
            str = this.f549769r;
            if (str == null) {
                str = "";
            }
        }
        return str;
    }

    public java.lang.String Ri() {
        java.lang.String str;
        synchronized (yy0.m7.class) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f549758d, "getSessionID: " + this.f549762h);
            str = this.f549762h;
            if (str == null) {
                str = "";
            }
        }
        return str;
    }

    public void Ui(java.lang.String entryType, int i17, int i18, java.lang.String postId, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entryType, "entryType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(postId, "postId");
        Vi(entryType, i17, i18, postId, z17, "", "", "");
    }

    public void Vi(java.lang.String entryType, int i17, int i18, java.lang.String postId, boolean z17, java.lang.String sourceFeedID, java.lang.String sourceSongID, java.lang.String followFeedTemplateID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entryType, "entryType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(postId, "postId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceFeedID, "sourceFeedID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceSongID, "sourceSongID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(followFeedTemplateID, "followFeedTemplateID");
        i95.m c17 = i95.n0.c(pp0.h0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        if (pp0.h0.Q2((pp0.h0) c17, false, 1, null)) {
            if (((yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class))).aj() || z17) {
                p3325xe03a0797.p3326xc267989b.l.d(Di(), null, null, new yy0.v0(this, entryType, i17, i18, z17, sourceFeedID, sourceSongID, followFeedTemplateID, postId, null), 3, null);
            }
        }
    }

    public boolean Zi() {
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f549758d, "isInFinderPostPage=" + this.C);
        synchronized (yy0.m7.class) {
            z17 = this.C;
        }
        return z17;
    }

    public boolean aj() {
        boolean z17;
        synchronized (yy0.m7.class) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f549758d, "isShootComposingFirstInit: " + this.D);
            z17 = this.D;
        }
        return z17;
    }

    public void bj(java.lang.String endReason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(endReason, "endReason");
        p3325xe03a0797.p3326xc267989b.l.d(Di(), null, null, new yy0.w0(this, endReason, null), 3, null);
    }

    public void cj(java.lang.String endReason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(endReason, "endReason");
        p3325xe03a0797.p3326xc267989b.l.d(Di(), null, null, new yy0.x0(this, endReason, null), 3, null);
    }

    public void fj(java.lang.String endReason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(endReason, "endReason");
        p3325xe03a0797.p3326xc267989b.l.d(Di(), null, null, new yy0.y0(this, endReason, null), 3, null);
    }

    public void hj(java.lang.String endReason, java.lang.String resultMediaFilePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(endReason, "endReason");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resultMediaFilePath, "resultMediaFilePath");
        p3325xe03a0797.p3326xc267989b.l.d(Di(), null, null, new yy0.a2(this, endReason, resultMediaFilePath, null), 3, null);
    }

    public void ij() {
        p3325xe03a0797.p3326xc267989b.l.d(Di(), null, null, new yy0.p2(this, null), 3, null);
    }

    public void mj() {
        i95.m c17 = i95.n0.c(pp0.h0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        if (pp0.h0.Q2((pp0.h0) c17, false, 1, null)) {
            p3325xe03a0797.p3326xc267989b.l.d(Di(), null, null, new yy0.k7(this, null), 3, null);
        }
    }

    public void nj(java.lang.String endReason, boolean z17, boolean z18, long j17, java.lang.String filePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(endReason, "endReason");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        qc0.d1 wi6 = ((pc0.g2) ((qc0.e1) i95.n0.c(qc0.e1.class))).wi(filePath);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("endReason", endReason);
        jSONObject.put("isLongVideo", z17);
        jSONObject.put("isSkipped", z18);
        jSONObject.put("timeCost", j17);
        if (wi6 != null) {
            jSONObject.put("width", wi6.f442896a);
            jSONObject.put("height", wi6.f442897b);
            jSONObject.put(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15517x245ebd1, java.lang.Float.valueOf(wi6.f442898c));
            jSONObject.put("duration", wi6.f442899d);
            jSONObject.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63, wi6.f442900e);
            jSONObject.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37665xf880c7f2, wi6.f442901f);
            jSONObject.put("isH265", wi6.f442902g);
            jSONObject.put("audioBitrate", wi6.f442903h);
            jSONObject.put("audioChannelCount", wi6.f442904i);
            jSONObject.put("audioSampleRate", wi6.f442905j);
            jSONObject.put("pixelFormat", wi6.f442906k);
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        oj("PSMC_ExportEndEvent", r26.i0.t(jSONObject2, ",", ";", false));
    }

    public void oj(java.lang.String reportingEventName, java.lang.String reportingEventDetails) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportingEventName, "reportingEventName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportingEventDetails, "reportingEventDetails");
        java.lang.String valueOf = java.lang.String.valueOf(this.f549762h);
        java.lang.String valueOf2 = java.lang.String.valueOf(this.f549763i);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6689x587c8cb0 c6689x587c8cb0 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6689x587c8cb0();
        c6689x587c8cb0.f140248d = c6689x587c8cb0.b("PublisherSessionID", valueOf, true);
        c6689x587c8cb0.f140249e = c6689x587c8cb0.b("EntryType", valueOf2, true);
        c6689x587c8cb0.f140250f = c6689x587c8cb0.b("MaasSDKVersion", "", true);
        c6689x587c8cb0.f140251g = c6689x587c8cb0.b("EventName", reportingEventName, true);
        c6689x587c8cb0.f140252h = c6689x587c8cb0.b("Details", reportingEventDetails, true);
        c6689x587c8cb0.f140254j = c6689x587c8cb0.b("PostId", ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).hj(), true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PublisherSessionMetricsReport", "29694 MJPublisherEventStruct values:\npublisherSessionID = " + c6689x587c8cb0.f140248d + "\nentryType = " + c6689x587c8cb0.f140249e + "\nmaasSDKVersion = " + c6689x587c8cb0.f140250f + "\neventName = " + c6689x587c8cb0.f140251g + "\ndetails = " + c6689x587c8cb0.f140252h + "\npostId = " + c6689x587c8cb0.f140254j);
        c6689x587c8cb0.k();
    }

    public void pj(java.lang.String mjPublisherSessionID, java.lang.String mjPublisherEntryType, java.util.Map reportingParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mjPublisherSessionID, "mjPublisherSessionID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mjPublisherEntryType, "mjPublisherEntryType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportingParams, "reportingParams");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6689x587c8cb0 c6689x587c8cb0 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6689x587c8cb0();
        c6689x587c8cb0.f140248d = c6689x587c8cb0.b("PublisherSessionID", mjPublisherSessionID, true);
        c6689x587c8cb0.f140249e = c6689x587c8cb0.b("EntryType", mjPublisherEntryType, true);
        c6689x587c8cb0.f140250f = c6689x587c8cb0.b("MaasSDKVersion", "", true);
        c6689x587c8cb0.f140251g = c6689x587c8cb0.b("EventName", "PS_PostCompleted", true);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (java.util.Map.Entry entry : reportingParams.entrySet()) {
            jSONObject.put((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        c6689x587c8cb0.f140252h = c6689x587c8cb0.b("Details", r26.i0.t(jSONObject2, ",", ";", false), true);
        c6689x587c8cb0.f140254j = c6689x587c8cb0.b("PostId", ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).hj(), true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PublisherSessionMetricsReport", "29694 MJPublisherEventStruct values:\npublisherSessionID = " + c6689x587c8cb0.f140248d + "\nentryType = " + c6689x587c8cb0.f140249e + "\nmaasSDKVersion = " + c6689x587c8cb0.f140250f + "\neventName = " + c6689x587c8cb0.f140251g + "\ndetails = " + c6689x587c8cb0.f140252h + "\npostId = " + c6689x587c8cb0.f140254j);
        c6689x587c8cb0.k();
    }

    public void qj(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f549758d, "setCreationPageID: " + i17);
        synchronized (yy0.m7.class) {
            this.A = i17;
        }
    }

    public void rj(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f549758d, "setExportScene: " + i17);
        synchronized (yy0.m7.class) {
            this.f549765n = i17;
        }
    }

    public void sj(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f549758d, "setIsAssetGenerate: " + z17);
        synchronized (yy0.m7.class) {
            this.f549776y = z17;
        }
    }

    public void tj(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f549758d, "setIsShootComposingFirstInit: " + z17);
        synchronized (yy0.m7.class) {
            this.D = z17;
        }
    }

    public void uj(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f549758d, "setSelectedTemplateID: " + str);
        synchronized (yy0.m7.class) {
            this.f549769r = str;
        }
    }

    public void vj(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f549758d, "setSelectedTemplateIsAIGC: " + z17);
        synchronized (yy0.m7.class) {
            this.f549775x = z17;
        }
    }

    public r45.df2 wi() {
        r45.df2 df2Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f549758d, "generatePublisherInfo");
        synchronized (yy0.m7.class) {
            df2Var = new r45.df2();
            df2Var.set(0, this.f549762h);
            df2Var.set(1, this.f549772u);
            df2Var.set(2, this.f549763i);
            df2Var.set(3, java.lang.Boolean.FALSE);
            df2Var.set(4, java.lang.Integer.valueOf(this.f549765n));
            df2Var.set(5, this.f549770s);
            df2Var.set(6, this.f549766o);
            df2Var.set(7, this.f549767p);
            df2Var.set(8, this.f549768q);
            df2Var.set(9, this.f549769r);
            df2Var.set(10, java.lang.Integer.valueOf(this.f549771t));
            df2Var.set(11, java.lang.Boolean.valueOf(this.f549776y));
            df2Var.set(12, java.lang.Integer.valueOf(this.A));
            df2Var.set(15, java.lang.Integer.valueOf(this.f549773v));
            df2Var.set(16, java.lang.Boolean.valueOf(this.f549775x));
        }
        return df2Var;
    }

    public void wj(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f549758d, "setSelectedTemplateIsFavorite: " + z17);
        synchronized (yy0.m7.class) {
            this.f549774w = z17;
        }
    }

    public void xj(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f549758d, "setSelectedTemplatePosition: " + i17);
        synchronized (yy0.m7.class) {
            this.f549771t = i17;
        }
    }

    public void yj(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f549758d, "setSelectedTemplateSessionBuffer: " + gVar);
        synchronized (yy0.m7.class) {
            this.f549772u = gVar;
        }
    }

    public void zj(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f549758d, "setSelectedTemplateTabID: " + str);
        synchronized (yy0.m7.class) {
            this.f549770s = str;
        }
    }
}
