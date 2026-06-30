package i23;

/* loaded from: classes12.dex */
public final class a implements su4.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f369607a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i23.e f369608b;

    public a(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, i23.e eVar) {
        this.f369607a = activityC0065xcd7aa112;
        this.f369608b = eVar;
    }

    @Override // su4.p0
    public void a() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f369607a;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2 activityC15607x502bbbb2 = activityC0065xcd7aa112 instanceof com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2 ? (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2) activityC0065xcd7aa112 : null;
        if (activityC15607x502bbbb2 == null) {
            return;
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activityC15607x502bbbb2).a(z13.f.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        z13.f fVar = (z13.f) a17;
        g23.a aVar = fVar.f550931d.f497226e;
        if (aVar.f349422f) {
            java.lang.String str = aVar.f349420d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getExtParams(...)");
            java.lang.String str2 = aVar.f349421e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getNavBarParms(...)");
            org.json.JSONObject X6 = fVar.X6(str, str2);
            z50.b bVar = z50.c.f551695a;
            android.app.Activity m80379x76847179 = this.f369608b.m80379x76847179();
            java.lang.String str3 = aVar.f349417a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "getHotword(...)");
            bVar.d(m80379x76847179, str3, aVar.f349418b, aVar.f349419c, X6);
        }
    }

    @Override // su4.p0
    public su4.e2 b() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f369607a;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2 activityC15607x502bbbb2 = activityC0065xcd7aa112 instanceof com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2 ? (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2) activityC0065xcd7aa112 : null;
        boolean z17 = false;
        if (activityC15607x502bbbb2 == null) {
            return new su4.e2(false, "");
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activityC15607x502bbbb2).a(z13.f.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        z13.f fVar = (z13.f) a17;
        g23.d dVar = fVar.f550931d.f497229h;
        if (fVar.e7() && dVar.f349431b) {
            xj.m mVar = (xj.m) ((jz5.n) fVar.f550942r).mo141623x754a37bb();
            java.lang.String str = mVar != null ? mVar.f536286a : null;
            if (!(str == null || str.length() == 0)) {
                z17 = true;
            }
        }
        java.lang.String str2 = dVar.f349430a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getAdTitle(...)");
        return new su4.e2(z17, str2);
    }

    @Override // su4.p0
    public su4.e2 c() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f369607a;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2 activityC15607x502bbbb2 = activityC0065xcd7aa112 instanceof com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2 ? (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2) activityC0065xcd7aa112 : null;
        boolean z17 = false;
        if (activityC15607x502bbbb2 == null) {
            return new su4.e2(false, "");
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activityC15607x502bbbb2).a(z13.f.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        z13.f fVar = (z13.f) a17;
        g23.c cVar = fVar.f550931d.f497230i;
        if (fVar.e7() && cVar.f349429f) {
            z17 = true;
        }
        java.lang.String str = cVar.f349424a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getHotword(...)");
        return new su4.e2(z17, str);
    }

    @Override // su4.p0
    public org.json.JSONObject d() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f369607a;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2 activityC15607x502bbbb2 = activityC0065xcd7aa112 instanceof com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2 ? (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2) activityC0065xcd7aa112 : null;
        if (activityC15607x502bbbb2 == null) {
            return jSONObject;
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activityC15607x502bbbb2).a(z13.f.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        ((z13.f) a17).U6(jSONObject);
        return jSONObject;
    }

    @Override // su4.p0
    public void e(java.lang.String key, java.lang.String value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f369607a;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2 activityC15607x502bbbb2 = activityC0065xcd7aa112 instanceof com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2 ? (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2) activityC0065xcd7aa112 : null;
        if (activityC15607x502bbbb2 == null) {
            return;
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activityC15607x502bbbb2).a(z13.f.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v vVar = ((z13.f) a17).f550932e;
        if (vVar == null || !vVar.u()) {
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(key, "isAISearchVisible")) {
            vVar.I = java.lang.Boolean.parseBoolean(value);
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(key, "isYuanbaoVisible")) {
            boolean parseBoolean = java.lang.Boolean.parseBoolean(value);
            vVar.f219862J = parseBoolean;
            vVar.f219866y.getClass();
            if (!parseBoolean) {
                ((wj.j0) ((xj.i) i95.n0.c(xj.i.class))).oj(wj.t0.f528042r, null);
            }
        }
        vVar.w();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    @Override // su4.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int f() {
        /*
            r6 = this;
            androidx.appcompat.app.AppCompatActivity r0 = r6.f369607a
            boolean r1 = r0 instanceof com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2
            if (r1 == 0) goto L9
            com.tencent.mm.plugin.fts.ui.FTSMainUI r0 = (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2) r0
            goto La
        L9:
            r0 = 0
        La:
            r1 = 0
            if (r0 != 0) goto L10
            t50.f r0 = t50.f.f497231e
            return r1
        L10:
            pf5.z r2 = pf5.z.f435481a
            pf5.v r0 = r2.a(r0)
            java.lang.Class<z13.f> r2 = z13.f.class
            androidx.lifecycle.c1 r0 = r0.a(r2)
            java.lang.String r2 = "get(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r2)
            z13.f r0 = (z13.f) r0
            t50.e r0 = r0.f550931d
            g23.a r2 = r0.f497226e
            boolean r2 = r2.f349422f
            jz5.g r3 = r0.f497224c
            r4 = 1
            if (r2 == 0) goto L47
            boolean r2 = r0.b()
            if (r2 == 0) goto L47
            r2 = r3
            jz5.n r2 = (jz5.n) r2
            java.lang.Object r2 = r2.mo141623x754a37bb()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            t50.g[] r5 = t50.g.f497238d
            if (r2 != r4) goto L47
            r2 = r4
            goto L48
        L47:
            r2 = r1
        L48:
            if (r2 == 0) goto L4e
            t50.f r0 = t50.f.f497233g
            goto Lac
        L4e:
            int r2 = r0.a()
            if (r2 <= 0) goto L68
            boolean r2 = r0.b()
            if (r2 == 0) goto L68
            g23.c r2 = r0.f497230i
            boolean r2 = r2.f349429f
            if (r2 != 0) goto L66
            g23.d r2 = r0.f497229h
            boolean r2 = r2.f349431b
            if (r2 == 0) goto L68
        L66:
            r2 = r4
            goto L69
        L68:
            r2 = r1
        L69:
            if (r2 == 0) goto L6e
            t50.f r0 = t50.f.f497235i
            goto Lac
        L6e:
            g23.b r2 = r0.f497227f
            boolean r2 = r2.f349423a
            if (r2 == 0) goto L82
            int r2 = r0.a()
            if (r2 <= 0) goto L82
            boolean r2 = r0.b()
            if (r2 == 0) goto L82
            r2 = r4
            goto L83
        L82:
            r2 = r1
        L83:
            if (r2 == 0) goto L88
            t50.f r0 = t50.f.f497234h
            goto Lac
        L88:
            g23.a r2 = r0.f497226e
            boolean r2 = r2.f349422f
            if (r2 == 0) goto La5
            boolean r0 = r0.b()
            if (r0 == 0) goto La5
            jz5.n r3 = (jz5.n) r3
            java.lang.Object r0 = r3.mo141623x754a37bb()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            t50.g[] r2 = t50.g.f497238d
            if (r0 != 0) goto La5
            r1 = r4
        La5:
            if (r1 == 0) goto Laa
            t50.f r0 = t50.f.f497232f
            goto Lac
        Laa:
            t50.f r0 = t50.f.f497231e
        Lac:
            int r0 = r0.f497237d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i23.a.f():int");
    }

    @Override // su4.p0
    public void g() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f369607a;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2 activityC15607x502bbbb2 = activityC0065xcd7aa112 instanceof com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2 ? (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2) activityC0065xcd7aa112 : null;
        if (activityC15607x502bbbb2 == null) {
            return;
        }
        z50.d dVar = z50.e.f551696a;
        vu4.a aVar = vu4.a.f521772f;
        vu4.b bVar = vu4.b.E;
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activityC15607x502bbbb2).a(z13.f.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        dVar.b(aVar, bVar, ((z13.f) a17).a7(), "");
    }

    @Override // su4.p0
    /* renamed from: getActivity */
    public p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo134669x19263085() {
        return this.f369608b.m158354x19263085();
    }

    @Override // su4.p0
    public org.json.JSONArray h() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f369607a;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2 activityC15607x502bbbb2 = activityC0065xcd7aa112 instanceof com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2 ? (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2) activityC0065xcd7aa112 : null;
        if (activityC15607x502bbbb2 == null) {
            return new org.json.JSONArray();
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activityC15607x502bbbb2).a(z13.f.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return ((z13.f) a17).Z6();
    }

    @Override // su4.p0
    public void i(android.content.Context context, java.lang.String query, int i17, java.lang.String parentSearchId, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentSearchId, "parentSearchId");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f369607a;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2 activityC15607x502bbbb2 = activityC0065xcd7aa112 instanceof com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2 ? (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2) activityC0065xcd7aa112 : null;
        if (activityC15607x502bbbb2 == null) {
            return;
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activityC15607x502bbbb2).a(z13.f.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        z13.f fVar = (z13.f) a17;
        org.json.JSONObject a76 = fVar.a7();
        org.json.JSONObject c76 = fVar.c7();
        c76.put("parentSearchID", parentSearchId);
        if (str != null) {
            c76.put("mixerCommonContext", str);
        }
        z50.b bVar = z50.c.f551695a;
        r45.jo0 jo0Var = new r45.jo0();
        jo0Var.f459521f = query.hashCode();
        jo0Var.f459520e = 0;
        r45.di6 di6Var = new r45.di6();
        di6Var.f454046e = query;
        di6Var.f454045d = query;
        jo0Var.f459519d = di6Var;
        int optInt = a76.optInt("isFromVoice", 0);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("parentSearchID", parentSearchId);
        hashMap.put("isFromVoice", java.lang.String.valueOf(optInt));
        hashMap.put("clickType", "7");
        bVar.a(context, query, jo0Var, i17, hashMap, c76);
    }

    @Override // su4.p0
    /* renamed from: isTeenMode */
    public boolean mo134670x74219ae7() {
        return !com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.h();
    }

    @Override // su4.p0
    public void j() {
        k23.c1 a17 = k23.c1.f385069h.a(this.f369607a);
        k23.t2 t2Var = a17.f385073f;
        t2Var.f385230b.set(jz5.h.b(t2Var.f385229a));
        boolean U6 = a17.U6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSFloatingVoiceV3UIC", "refreshVoiceV3Btn: enable=" + U6);
        if (!U6) {
            k23.v0 v0Var = a17.f385074g;
            if (v0Var != null) {
                v0Var.B(false);
                return;
            }
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = a17.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI");
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78) m158354x19263085).f7();
        k23.v0 v0Var2 = a17.f385074g;
        if (v0Var2 != null) {
            v0Var2.B(true);
            v0Var2.G(true);
        }
    }

    @Override // su4.p0
    public void k() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f369607a;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2 activityC15607x502bbbb2 = activityC0065xcd7aa112 instanceof com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2 ? (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2) activityC0065xcd7aa112 : null;
        if (activityC15607x502bbbb2 == null) {
            return;
        }
        activityC15607x502bbbb2.f219470y0.a();
        this.f369608b.m174141x36654fab();
    }

    @Override // su4.p0
    public void l() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f369607a;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2 activityC15607x502bbbb2 = activityC0065xcd7aa112 instanceof com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2 ? (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2) activityC0065xcd7aa112 : null;
        if (activityC15607x502bbbb2 == null) {
            return;
        }
        z50.d dVar = z50.e.f551696a;
        vu4.a aVar = vu4.a.f521774h;
        vu4.b bVar = vu4.b.E;
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activityC15607x502bbbb2).a(z13.f.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        dVar.b(aVar, bVar, ((z13.f) a17).a7(), "");
    }

    @Override // su4.p0
    public boolean m() {
        return k23.c1.f385069h.a(this.f369607a).W6();
    }

    @Override // su4.p0
    public int n() {
        return com.p314xaae8f345.mm.R.id.f569232pi0;
    }

    @Override // su4.p0
    public boolean o() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f369607a;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2 activityC15607x502bbbb2 = activityC0065xcd7aa112 instanceof com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2 ? (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2) activityC0065xcd7aa112 : null;
        if (activityC15607x502bbbb2 == null) {
            return false;
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activityC15607x502bbbb2).a(z13.f.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return ((z13.f) a17).e7();
    }

    @Override // su4.p0
    public org.json.JSONObject p() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f369607a;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2 activityC15607x502bbbb2 = activityC0065xcd7aa112 instanceof com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2 ? (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2) activityC0065xcd7aa112 : null;
        if (activityC15607x502bbbb2 == null) {
            return jSONObject;
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activityC15607x502bbbb2).a(z13.f.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        ((z13.f) a17).V6(jSONObject);
        return jSONObject;
    }
}
