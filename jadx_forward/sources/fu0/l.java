package fu0;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public yz5.l f348320a;

    /* renamed from: b, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f348321b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f348322c;

    /* renamed from: d, reason: collision with root package name */
    public fu0.q f348323d;

    /* renamed from: e, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f348324e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a f348325f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f348326g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f348327h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f348328i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f348329j;

    /* renamed from: k, reason: collision with root package name */
    public com.p314xaae8f345.mm.app.s2 f348330k;

    public l(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        oz5.i a17 = p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        this.f348324e = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) a17).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a));
    }

    public static final void a(fu0.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a, boolean z17, fu0.m mVar) {
        java.util.Collection collection;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a2;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = lVar.f348321b;
        if (activityC0065xcd7aa112 == null) {
            return;
        }
        fu0.q qVar = new fu0.q(null, activityC0065xcd7aa112, fu0.k.f348319d);
        lVar.f348323d = qVar;
        lVar.f348325f = c16997xb0aa383a;
        if (c16997xb0aa383a != null) {
            java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a> c17 = kz5.b0.c(c16997xb0aa383a);
            qVar.g().mo68195x60eb836b(c17);
            if (z17 && (c16997xb0aa383a2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a) kz5.n0.Z(c17)) != null) {
                qVar.f303888e = c16997xb0aa383a2;
                qVar.f303890g = ((com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p880x4ac6c74f.p881x636ee25.C10925xc183e4a4) qVar.g().e()).mo46997x9d8ed979();
                cu0.y g17 = qVar.g();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(g17, "null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.composing_creation.music.CreationComposingMusicPickerDrawerImpl");
                ((fu0.u) g17).mo68301x28690f2a(c16997xb0aa383a2);
            }
        }
        boolean z18 = c16997xb0aa383a != null && z17;
        cu0.y g18 = qVar.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(g18, "null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.composing_creation.music.CreationComposingMusicPickerDrawerImpl");
        fu0.u uVar = (fu0.u) g18;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setupConfig: autoPlayAudio=");
        sb6.append(z18);
        sb6.append(", hasRecommendContext=");
        sb6.append(mVar != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreationComposingMusicPickerDrawerImpl", sb6.toString());
        st3.k kVar = new st3.k();
        kVar.f494084f = st3.v.f494142h;
        kVar.f494080b = false;
        kVar.f494082d = false;
        if (mVar == null || (collection = mVar.f348331a) == null) {
            collection = kz5.p0.f395529d;
        }
        ((com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p880x4ac6c74f.p881x636ee25.C10925xc183e4a4) uVar.e()).m47003x8a00181f(new yu3.b(new yu3.a(10, true, "", new java.util.ArrayList(collection), 0L, 0L, z18, 2, mVar != null ? mVar.f348332b : null, mVar != null ? mVar.f348333c : null), false, kVar, false));
        qVar.f303894k = new fu0.j(lVar);
        lVar.f348328i = true;
        com.p314xaae8f345.mm.app.s2 s2Var = lVar.f348330k;
        if (s2Var != null) {
            s2Var.m43072x2efc64();
        }
        fu0.i iVar = new fu0.i(lVar);
        iVar.m43071x58998cd();
        lVar.f348330k = iVar;
        yz5.a aVar = lVar.f348326g;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        if (qVar.f303887d) {
            return;
        }
        qVar.g().mo68201x76500a7f(true);
    }

    public final org.json.JSONObject b(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a) {
        if (c16997xb0aa383a == null) {
            return null;
        }
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(c16997xb0aa383a.f237248i, false);
        if (i17 == null) {
            i17 = "";
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("musicID", c16997xb0aa383a.C);
        jSONObject.put("musicName", c16997xb0aa383a.f237256t);
        java.lang.String str = (java.lang.String) kz5.n0.Z(c16997xb0aa383a.f237247h);
        jSONObject.put("authorName", str != null ? str : "");
        jSONObject.put("coverUrl", c16997xb0aa383a.f237258v);
        jSONObject.put("musicFilePath", i17);
        jSONObject.put("durationInMs", c16997xb0aa383a.f237253q);
        jSONObject.put("isMusicOn", true);
        return jSONObject;
    }

    public final void c(org.json.JSONObject jSONObject, boolean z17) {
        if (this.f348322c) {
            return;
        }
        this.f348322c = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.MusicPicking", "finish: musicResult=" + jSONObject + ", musicChanged=" + z17);
        if (this.f348328i) {
            yz5.l lVar = this.f348327h;
            if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Boolean.valueOf(z17));
            }
            this.f348328i = false;
        }
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.MusicPicking", "finish: musicResult is null");
            jSONObject.put("errCode", -1);
        }
        yz5.l lVar2 = this.f348320a;
        if (lVar2 != null) {
            lVar2.mo146xb9724478(jSONObject);
        }
        p3325xe03a0797.p3326xc267989b.z0.e(this.f348324e, null, 1, null);
        com.p314xaae8f345.mm.app.s2 s2Var = this.f348330k;
        if (s2Var != null) {
            s2Var.m43072x2efc64();
        }
        this.f348330k = null;
        this.f348329j = false;
        fu0.q qVar = this.f348323d;
        if (qVar != null) {
            qVar.e();
        }
        this.f348323d = null;
        this.f348320a = null;
        this.f348326g = null;
        this.f348327h = null;
        this.f348325f = null;
        this.f348321b = null;
    }
}
