package rx4;

/* loaded from: classes8.dex */
public final class h2 extends wm3.a implements qx4.a, com.p314xaae8f345.mm.p944x882e457a.u0 {
    public boolean A;
    public final jz5.g B;
    public final jz5.g C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public org.json.JSONObject H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final jz5.g f482697J;
    public java.lang.String K;
    public long L;
    public long M;
    public long N;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f482698d;

    /* renamed from: e, reason: collision with root package name */
    public final int f482699e;

    /* renamed from: f, reason: collision with root package name */
    public int f482700f;

    /* renamed from: g, reason: collision with root package name */
    public int f482701g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f482702h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f482703i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f482704m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f482705n;

    /* renamed from: o, reason: collision with root package name */
    public int f482706o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ScrollView f482707p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f482708q;

    /* renamed from: r, reason: collision with root package name */
    public org.json.JSONArray f482709r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f482710s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f482711t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f482712u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.Map f482713v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f482714w;

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f482715x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f482716y;

    /* renamed from: z, reason: collision with root package name */
    public int f482717z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f482698d = "FTSTeachViewUIC";
        this.f482699e = 800;
        this.f482702h = "";
        this.f482703i = "";
        this.f482704m = "";
        this.f482705n = "";
        this.f482708q = "";
        this.f482709r = new org.json.JSONArray();
        this.f482710s = "";
        this.f482711t = "";
        this.f482712u = true;
        this.f482713v = new java.util.LinkedHashMap();
        this.f482715x = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new rx4.k1(this), true);
        this.f482716y = "";
        this.B = jz5.h.b(new rx4.l1(this));
        this.C = jz5.h.b(new rx4.n1(this));
        this.f482697J = jz5.h.b(new rx4.m1(this));
        this.K = "";
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0076 A[Catch: Exception -> 0x00f2, TryCatch #0 {Exception -> 0x00f2, blocks: (B:3:0x0004, B:5:0x0026, B:7:0x0030, B:11:0x0039, B:12:0x005d, B:14:0x0076, B:15:0x007a, B:17:0x007e, B:22:0x0086, B:25:0x00df, B:31:0x003e, B:33:0x0044, B:35:0x004e, B:39:0x0057), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e A[Catch: Exception -> 0x00f2, TryCatch #0 {Exception -> 0x00f2, blocks: (B:3:0x0004, B:5:0x0026, B:7:0x0030, B:11:0x0039, B:12:0x005d, B:14:0x0076, B:15:0x007a, B:17:0x007e, B:22:0x0086, B:25:0x00df, B:31:0x003e, B:33:0x0044, B:35:0x004e, B:39:0x0057), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void T6(rx4.h2 r8, android.widget.ScrollView r9, float r10) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rx4.h2.T6(rx4.h2, android.widget.ScrollView, float):void");
    }

    public static final void U6(rx4.h2 h2Var, android.view.View view) {
        if (h2Var.A) {
            return;
        }
        h2Var.A = true;
        view.post(new rx4.s1(h2Var));
    }

    public static void o7(rx4.h2 h2Var, int i17, java.lang.String reqId, java.lang.String str, java.lang.String str2, int i18, java.lang.Object obj) {
        java.lang.String query = (i18 & 4) != 0 ? "" : str;
        java.lang.String searchId = (i18 & 8) != 0 ? h2Var.f482703i : str2;
        h2Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqId, "reqId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(searchId, "searchId");
        int i19 = h2Var.f482700f;
        java.lang.String str3 = h2Var.f482702h;
        su4.k2.h(i17, i19, str3, str3, searchId, 0, false, reqId, true, query, "", h2Var.f482701g);
    }

    public static /* synthetic */ void r7(rx4.h2 h2Var, vu4.a aVar, java.lang.String str, java.lang.String str2, boolean z17, java.util.Map map, int i17, java.lang.Object obj) {
        if ((i17 & 16) != 0) {
            map = kz5.q0.f395534d;
        }
        h2Var.q7(aVar, str, str2, z17, map);
    }

    public static /* synthetic */ void u7(rx4.h2 h2Var, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map map, int i18, java.lang.Object obj) {
        java.lang.String str4 = (i18 & 4) != 0 ? "" : str2;
        java.lang.String str5 = (i18 & 8) != 0 ? "" : str3;
        if ((i18 & 16) != 0) {
            map = kz5.q0.f395534d;
        }
        h2Var.s7(i17, str, str4, str5, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    @Override // qx4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A5(int r11, java.lang.String r12, int r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rx4.h2.A5(int, java.lang.String, int, java.lang.String):void");
    }

    public final jz5.o V6() {
        android.view.View mo144222x4ff8c0f0;
        int i17;
        int i18;
        android.view.View mo144222x4ff8c0f02;
        android.view.View mo144222x4ff8c0f03 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.rr7);
        int i19 = (mo144222x4ff8c0f03 == null || mo144222x4ff8c0f03.getVisibility() != 0) ? 0 : 1;
        android.view.View mo144222x4ff8c0f04 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f568087s23);
        boolean z17 = mo144222x4ff8c0f04 != null && mo144222x4ff8c0f04.getVisibility() == 0;
        boolean z18 = !this.F ? (mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.rrc)) == null || mo144222x4ff8c0f0.getVisibility() != 0 : (mo144222x4ff8c0f02 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.vbs)) == null || mo144222x4ff8c0f02.getVisibility() != 0;
        if (z17) {
            i18 = i19 + 1;
            i17 = i18;
        } else {
            i17 = i19;
            i18 = 0;
        }
        return new jz5.o(java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(z18 ? i17 + 1 : 0));
    }

    public final void W6() {
        ((java.util.LinkedHashMap) this.f482713v).clear();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("recommendSearchQuery", "");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI");
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.e4((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19396xdd9ccea5) m158354x19263085, bundle));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X6(rx4.u2 r5) {
        /*
            r4 = this;
            boolean r0 = r4.D
            if (r0 == 0) goto L5
            return
        L5:
            boolean r0 = r4.l7()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L1c
            org.json.JSONArray r0 = r5.f482825b
            if (r0 != 0) goto L13
            r0 = r2
            goto L17
        L13:
            boolean r0 = r4.b(r0)
        L17:
            if (r0 == 0) goto L1a
            goto L1c
        L1a:
            r0 = r2
            goto L1d
        L1c:
            r0 = r1
        L1d:
            r4.D = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "hitest confirmTeachPageNewStyle: isTeachPageNewStyle="
            r0.<init>(r3)
            boolean r3 = r4.D
            r0.append(r3)
            java.lang.String r3 = " (expt="
            r0.append(r3)
            boolean r3 = r4.l7()
            r0.append(r3)
            java.lang.String r3 = ", newData="
            r0.append(r3)
            org.json.JSONArray r5 = r5.f482825b
            if (r5 != 0) goto L42
            r5 = r2
            goto L46
        L42:
            boolean r5 = r4.b(r5)
        L46:
            r0.append(r5)
            java.lang.String r5 = ", isUsingNewLayout="
            r0.append(r5)
            boolean r5 = r4.E
            r0.append(r5)
            r5 = 41
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = r4.f482698d
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r5)
            boolean r5 = r4.D
            if (r5 == 0) goto L76
            boolean r0 = r4.E
            if (r0 != 0) goto L76
            r4.E = r1
            r4.f482717z = r2
            rx4.g2 r5 = new rx4.g2
            r5.<init>(r4)
            pm0.v.X(r5)
            goto L84
        L76:
            if (r5 == 0) goto L84
            boolean r5 = r4.E
            if (r5 == 0) goto L84
            rx4.b1 r5 = new rx4.b1
            r5.<init>(r4)
            pm0.v.X(r5)
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rx4.h2.X6(rx4.u2):void");
    }

    public final void Z6(org.json.JSONArray jSONArray, boolean z17) {
        org.json.JSONObject jSONObject;
        rx4.d dVar;
        rx4.l lVar;
        rx4.d dVar2;
        int length = jSONArray.length();
        int i17 = 0;
        while (true) {
            dVar2 = null;
            lVar = null;
            if (i17 >= length) {
                jSONObject = null;
                break;
            }
            jSONObject = jSONArray.optJSONObject(i17);
            if (jSONObject != null && jSONObject.optInt("type") == 42) {
                break;
            } else {
                i17++;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hitest fillHotspotAndDrama isCache=");
        sb6.append(z17);
        sb6.append(", found type=42: ");
        sb6.append(jSONObject != null);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f482698d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        if (jSONObject == null) {
            this.F = false;
            this.H = null;
            android.app.Activity context = m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((rx4.k0) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(rx4.k0.class)).W6(null, z17);
            android.app.Activity context2 = m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
            if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            rx4.s sVar = (rx4.s) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(rx4.s.class);
            sVar.getClass();
            pm0.v.X(new rx4.o(sVar));
            pm0.v.X(new rx4.c1(this));
            return;
        }
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("items");
        boolean z18 = jSONObject.optJSONArray("items") != null;
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("hitest fillHotspotAndDrama itemsObj=");
        sb8.append(optJSONObject != null);
        sb8.append(", itemsIsArray=");
        sb8.append(z18);
        sb8.append(", hasTabs=");
        sb8.append(optJSONObject != null ? java.lang.Boolean.valueOf(optJSONObject.has("tabs")) : null);
        sb8.append(", isTeachPageNewStyle=");
        sb8.append(this.D);
        sb8.append(", isUsingNewLayout=");
        sb8.append(this.E);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb8.toString());
        rx4.k kVar = rx4.l.f482751g;
        if (optJSONObject != null && optJSONObject.has("tabs") && this.D && this.E) {
            this.F = true;
            this.H = optJSONObject;
            org.json.JSONArray optJSONArray = optJSONObject.optJSONArray("tabs");
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                dVar = null;
            } else {
                rx4.l a17 = kVar.a(jSONObject, optJSONArray.optJSONObject(0));
                if (optJSONArray.length() > 1) {
                    org.json.JSONObject optJSONObject2 = optJSONArray.optJSONObject(1);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optJSONObject2);
                    dVar2 = new rx4.d(optJSONObject2);
                }
                dVar = dVar2;
                lVar = a17;
            }
            android.app.Activity context3 = m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context3, "context");
            pf5.z zVar2 = pf5.z.f435481a;
            if (!(context3 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            p012xc85e97e9.p093xedfae76a.c1 a18 = zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context3).a(rx4.k0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "get(...)");
            ((rx4.k0) a18).V6(lVar, z17, true);
            android.app.Activity context4 = m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context4, "context");
            if (!(context4 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((rx4.s) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context4).a(rx4.s.class)).a(dVar, z17);
            pm0.v.X(new rx4.b2(this, lVar, dVar));
        } else {
            this.F = false;
            this.H = null;
            if (optJSONObject == null || !optJSONObject.has("tabs")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "hitest fillHotspotAndDrama -> non-tab mode: old data structure, use fillHotspotBox");
                android.app.Activity context5 = m80379x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context5, "context");
                pf5.z zVar3 = pf5.z.f435481a;
                if (!(context5 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((rx4.k0) zVar3.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context5).a(rx4.k0.class)).W6(jSONArray, z17);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "hitest fillHotspotAndDrama -> non-tab mode: new data structure, extract from tabs");
                org.json.JSONArray optJSONArray2 = optJSONObject.optJSONArray("tabs");
                rx4.l a19 = kVar.a(jSONObject, optJSONArray2 != null ? optJSONArray2.optJSONObject(0) : null);
                android.app.Activity context6 = m80379x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context6, "context");
                pf5.z zVar4 = pf5.z.f435481a;
                if (!(context6 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((rx4.k0) zVar4.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context6).a(rx4.k0.class)).V6(a19, z17, false);
            }
            android.app.Activity context7 = m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context7, "context");
            pf5.z zVar5 = pf5.z.f435481a;
            if (!(context7 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            rx4.s sVar2 = (rx4.s) zVar5.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context7).a(rx4.s.class);
            sVar2.getClass();
            pm0.v.X(new rx4.o(sVar2));
            pm0.v.X(new rx4.d1(this));
        }
        pm0.v.X(new rx4.e1(this));
    }

    public final void a(org.json.JSONArray jSONArray) {
        if (this.D) {
            return;
        }
        boolean b17 = b(jSONArray);
        this.D = l7() || b17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f482698d, "hitest confirmTeachPageNewStyleByCache: isTeachPageNewStyle=" + this.D + " (expt=" + l7() + ", newData=" + b17 + ", isUsingNewLayout=" + this.E + ')');
        boolean z17 = this.D;
        if (z17 && !this.E) {
            this.E = true;
            this.f482717z = 0;
            pm0.v.X(new rx4.g2(this));
        } else if (z17 && this.E) {
            pm0.v.X(new rx4.b1(this));
        }
    }

    public final java.lang.String a7() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f482703i);
        sb6.append('-');
        sb6.append(java.lang.System.currentTimeMillis());
        sb6.append('-');
        java.lang.String substring = java.lang.String.valueOf(java.lang.Math.random()).substring(2, 12);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        sb6.append(substring);
        java.lang.String sb7 = sb6.toString();
        this.f482716y = sb7;
        return sb7;
    }

    public final boolean b(org.json.JSONArray jSONArray) {
        org.json.JSONObject optJSONObject;
        int length = jSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            org.json.JSONObject optJSONObject2 = jSONArray.optJSONObject(i17);
            if (optJSONObject2 != null && optJSONObject2.optInt("type") == 42 && (optJSONObject = optJSONObject2.optJSONObject("items")) != null && optJSONObject.has("tabs")) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032 A[Catch: Exception -> 0x012c, TryCatch #0 {Exception -> 0x012c, blocks: (B:3:0x0004, B:7:0x000b, B:9:0x0025, B:15:0x0032, B:16:0x0077, B:18:0x007d, B:20:0x009a, B:22:0x0106, B:24:0x0120, B:25:0x012b), top: B:2:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b7() {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rx4.h2.b7():void");
    }

    public final void c7(java.lang.String reqId, boolean z17) {
        org.json.JSONObject jSONObject;
        boolean z18;
        org.json.JSONArray n76;
        org.json.JSONArray n77;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqId, "reqId");
        boolean k76 = k7();
        pf5.u uVar = pf5.u.f435469a;
        java.lang.String str = this.f482698d;
        java.lang.String str2 = "";
        if (!k76) {
            java.lang.String u17 = ((sg0.a3) ((su4.e1) i95.n0.c(su4.e1.class))).wi().u("websearch:FINDER_INNER_SEARCH_PERMANENT_KEY", "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u17);
            if (u17.length() > 0) {
                try {
                    jSONObject = new org.json.JSONObject(u17);
                } catch (org.json.JSONException unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "cache data is not jsonobject:%s", u17);
                    try {
                        org.json.JSONArray jSONArray = new org.json.JSONArray(u17);
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        jSONObject2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONArray);
                        jSONObject2.put("searchID", "finderInnerSearch");
                        jSONObject = jSONObject2;
                    } catch (org.json.JSONException unused2) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "cache data is not jsonarray:%s", u17);
                        jSONObject = null;
                    }
                }
                org.json.JSONArray optJSONArray = jSONObject != null ? jSONObject.optJSONArray(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306) : null;
                if (optJSONArray != null) {
                    java.lang.String optString = jSONObject.optString("searchID");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
                    this.f482703i = optString;
                    a(optJSONArray);
                    ((rx4.e0) uVar.b(m80379x76847179()).a(rx4.e0.class)).V6(optJSONArray, true);
                    if (z17 || this.f482701g != 14) {
                        ((rx4.u0) uVar.b(m80379x76847179()).a(rx4.u0.class)).U6(null, true);
                    } else {
                        ((rx4.u0) uVar.b(m80379x76847179()).a(rx4.u0.class)).U6(optJSONArray, true);
                    }
                    if (this.f482701g == 14) {
                        Z6(optJSONArray, true);
                    }
                    pm0.v.X(new rx4.g1(this));
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "hitest req step_" + reqId + '_' + hashCode());
            this.f482704m = reqId;
            v7(reqId, 0);
            o7(this, 203, this.f482704m, null, "", 4, null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "hitest parallel req step_" + reqId + '_' + hashCode());
        this.f482704m = reqId;
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 wi6 = ((sg0.a3) ((su4.e1) i95.n0.c(su4.e1.class))).wi();
            java.lang.String u18 = wi6.u("websearch:FINDER_INNER_SEARCH_RT1_KEY", "");
            if (u18 == null) {
                u18 = "";
            }
            if (!(u18.length() > 0) || (n77 = n7(u18)) == null) {
                z18 = false;
            } else {
                a(n77);
                ((rx4.e0) uVar.b(m80379x76847179()).a(rx4.e0.class)).V6(n77, true);
                if (z17 || this.f482701g != 14) {
                    ((rx4.u0) uVar.b(m80379x76847179()).a(rx4.u0.class)).U6(null, true);
                } else {
                    ((rx4.u0) uVar.b(m80379x76847179()).a(rx4.u0.class)).U6(n77, true);
                }
                z18 = true;
            }
            if (!z18) {
                java.lang.String u19 = wi6.u("websearch:FINDER_INNER_SEARCH_PERMANENT_KEY", "");
                if (u19 != null) {
                    str2 = u19;
                }
                if ((str2.length() > 0) && (n76 = n7(str2)) != null) {
                    a(n76);
                    ((rx4.e0) uVar.b(m80379x76847179()).a(rx4.e0.class)).V6(n76, true);
                    if (z17 || this.f482701g != 14) {
                        ((rx4.u0) uVar.b(m80379x76847179()).a(rx4.u0.class)).U6(null, true);
                    } else {
                        ((rx4.u0) uVar.b(m80379x76847179()).a(rx4.u0.class)).U6(n76, true);
                    }
                    if (this.f482701g == 14) {
                        Z6(n76, true);
                    }
                    z18 = true;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "hitest parallel cache fill, filledAny=" + z18 + ", rt1Len=" + u18.length());
            if (z18) {
                pm0.v.X(new rx4.f1(this));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "hitest parallel cache fill error: " + e17);
        }
        try {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w1) ((su4.x0) i95.n0.c(su4.x0.class))).aj().t();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "hitest stopBizSearchGuide before rt1");
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "hitest stopBizSearchGuide error: " + e18);
        }
        java.lang.String concat = reqId.concat("_rt1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "hitest send rt1 request, reqId=" + concat);
        v7(concat, 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "hitest send rt1 request done, reqId=" + concat);
        o7(this, 203, this.f482704m, null, "", 4, null);
    }

    public final void d7(rx4.u2 u2Var, java.lang.String str, java.lang.String str2, boolean z17) {
        java.lang.String str3 = this.f482698d;
        try {
            ((sg0.a3) ((su4.e1) i95.n0.c(su4.e1.class))).wi().D("websearch:FINDER_INNER_SEARCH_RT1_KEY", "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "hitest parallel fallback: clear RT1 cache");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, "hitest parallel fallback clear cache error: " + e17);
        }
        h7(u2Var, str, str2);
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "hitest parallel fallback: skip rt2 request, baseReqId=" + str2);
        }
    }

    public final void e7(rx4.u2 u2Var) {
        if (u2Var.f482826c.length() > 0) {
            android.os.Bundle bundle = new android.os.Bundle();
            java.lang.String str = u2Var.f482826c;
            bundle.putString("recommendSearchQuery", str);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI");
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.e4((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19396xdd9ccea5) m158354x19263085, bundle));
            java.lang.String b17 = fp.s0.b(str, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
            vu4.a aVar = vu4.a.f521772f;
            java.lang.String str2 = "0|50|" + fp.s0.b("底纹词", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("1|1|");
            sb6.append(b17);
            sb6.append('|');
            sb6.append(b17);
            sb6.append("|1||0||placeholder|");
            int i17 = u2Var.f482827d;
            sb6.append(i17);
            q7(aVar, str2, sb6.toString(), false, kz5.b1.e(new jz5.l("items", this.f482709r)));
            this.f482712u = false;
            java.util.Map map = this.f482713v;
            map.put("placeholder", str);
            map.put(ya.b.f77502x92235c1b, java.lang.String.valueOf(i17));
            java.lang.String str3 = u2Var.f482828e;
            map.put("mixerCommonContext", str3);
            su4.z0 z0Var = (su4.z0) i95.n0.c(su4.z0.class);
            int i18 = this.f482700f;
            jz5.l[] lVarArr = new jz5.l[2];
            lVarArr[0] = new jz5.l("teachData", kz5.c1.k(new jz5.l("type", 50), new jz5.l("item", kz5.c1.k(new jz5.l("placeholder", str), new jz5.l(ya.b.f77502x92235c1b, java.lang.Integer.valueOf(i17)), new jz5.l("mixerCommonContext", str3)))));
            java.lang.String stringExtra = m158354x19263085().getIntent().getStringExtra("ftsrealurl");
            if (stringExtra == null && (stringExtra = m158354x19263085().getIntent().getStringExtra("rawUrl")) == null) {
                stringExtra = "";
            }
            lVarArr[1] = new jz5.l("url", stringExtra);
            ((sg0.a2) z0Var).fj(i18, 14, new org.json.JSONObject(kz5.c1.k(lVarArr)));
        }
    }

    public final void f7(rx4.u2 u2Var, java.lang.String str, java.lang.String str2) {
        this.f482705n = r26.n0.Z(str2, "_rt1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hitest handleReqType1Response reqId=");
        sb6.append(str2);
        sb6.append(", data.len=");
        org.json.JSONArray jSONArray = u2Var.f482825b;
        sb6.append(jSONArray != null ? jSONArray.length() : -1);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str3 = this.f482698d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, sb7);
        ((sg0.a3) ((su4.e1) i95.n0.c(su4.e1.class))).wi().D("websearch:FINDER_INNER_SEARCH_RT1_KEY", x7(str));
        org.json.JSONArray jSONArray2 = u2Var.f482825b;
        if (jSONArray2 != null) {
            X6(u2Var);
            this.f482703i = u2Var.f482829f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jSONArray2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "hitest rt1 fill history+recommend, data.len=" + jSONArray2.length());
            android.app.Activity context = m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((rx4.e0) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(rx4.e0.class)).V6(jSONArray2, false);
            android.app.Activity context2 = m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
            pf5.z zVar2 = pf5.z.f435481a;
            if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((rx4.u0) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(rx4.u0.class)).U6(jSONArray2, false);
            e7(u2Var);
            pm0.v.X(new rx4.h1(this));
        }
        if (k7()) {
            try {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w1) ((su4.x0) i95.n0.c(su4.x0.class))).aj().t();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "hitest stopBizSearchGuide before rt2");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, "hitest stopBizSearchGuide error: " + e17);
            }
            java.lang.String str4 = this.f482704m + "_rt2";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "hitest send rt2 request (after rt1), reqId=" + str4);
            v7(str4, 2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "hitest send rt2 request done, reqId=" + str4);
        }
    }

    public final void g7(rx4.u2 u2Var, java.lang.String str, java.lang.String str2) {
        this.f482705n = r26.n0.Z(str2, "_rt2");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hitest handleReqType2Response reqId=");
        sb6.append(str2);
        sb6.append(", data.len=");
        org.json.JSONArray jSONArray = u2Var.f482825b;
        sb6.append(jSONArray != null ? jSONArray.length() : -1);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str3 = this.f482698d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, sb7);
        org.json.JSONArray jSONArray2 = u2Var.f482825b;
        if (jSONArray2 != null) {
            X6(u2Var);
            java.lang.String str4 = u2Var.f482829f;
            if (str4.length() > 0) {
                this.f482703i = str4;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jSONArray2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "hitest rt2 fillHotspotAndDrama, data.len=" + jSONArray2.length());
            Z6(jSONArray2, false);
            pm0.v.X(new rx4.i1(this));
        }
    }

    public final void h7(rx4.u2 u2Var, java.lang.String str, java.lang.String str2) {
        this.f482705n = str2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hitest handleSingleResponse reqId=");
        sb6.append(str2);
        sb6.append(", data.len=");
        org.json.JSONArray jSONArray = u2Var.f482825b;
        sb6.append(jSONArray != null ? jSONArray.length() : -1);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str3 = this.f482698d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, sb7);
        ((sg0.a3) ((su4.e1) i95.n0.c(su4.e1.class))).wi().D("websearch:FINDER_INNER_SEARCH_PERMANENT_KEY", x7(str));
        org.json.JSONArray jSONArray2 = u2Var.f482825b;
        if (jSONArray2 != null) {
            X6(u2Var);
            this.f482703i = u2Var.f482829f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jSONArray2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "hitest single fill all, data.len=" + jSONArray2.length());
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            int length = jSONArray2.length();
            for (int i17 = 0; i17 < length; i17++) {
                org.json.JSONObject optJSONObject = jSONArray2.optJSONObject(i17);
                if (optJSONObject != null) {
                    int optInt = optJSONObject.optInt("type");
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(optInt);
                    java.lang.Integer num = (java.lang.Integer) linkedHashMap.get(java.lang.Integer.valueOf(optInt));
                    linkedHashMap.put(valueOf, java.lang.Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "hitest single types=" + linkedHashMap);
            android.app.Activity context = m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((rx4.e0) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(rx4.e0.class)).V6(jSONArray2, false);
            android.app.Activity context2 = m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
            pf5.z zVar2 = pf5.z.f435481a;
            if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((rx4.u0) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(rx4.u0.class)).U6(jSONArray2, false);
            Z6(jSONArray2, false);
            e7(u2Var);
            pm0.v.X(new rx4.j1(this));
        }
    }

    public final boolean i7() {
        return ((java.lang.Boolean) ((jz5.n) this.B).mo141623x754a37bb()).booleanValue();
    }

    public final boolean k7() {
        return ((java.lang.Boolean) ((jz5.n) this.f482697J).mo141623x754a37bb()).booleanValue();
    }

    public final boolean l7() {
        return ((java.lang.Boolean) ((jz5.n) this.C).mo141623x754a37bb()).booleanValue();
    }

    public final void m7(int i17, java.lang.String query, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f482698d, "openSearchWebview:" + query + '|' + i17 + '|' + str);
        java.util.Map[] mapArr = new java.util.Map[2];
        jz5.l[] lVarArr = new jz5.l[2];
        lVarArr[0] = new jz5.l("key", "parentSearchID");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i17);
        sb6.append(':');
        sb6.append(this.f482703i);
        sb6.append(':');
        sb6.append(query);
        sb6.append(':');
        sb6.append(this.f482705n);
        sb6.append(':');
        java.util.Map l17 = kz5.c1.l(new jz5.l("clickId", this.f482716y));
        if (this.f482708q.length() > 0) {
            l17.put("referrerFeedId", this.f482708q);
        }
        sb6.append(fp.s0.b(new org.json.JSONObject(l17).toString(), com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
        lVarArr[1] = new jz5.l("textValue", sb6.toString());
        mapArr[0] = kz5.c1.k(lVarArr);
        mapArr[1] = kz5.c1.k(new jz5.l("key", "mixerCommonContext"), new jz5.l("textValue", str));
        jz5.l lVar = new jz5.l("crossExtReqParams", kz5.c0.i(mapArr));
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.lang.String b17 = fp.s0.b(new org.json.JSONObject(kz5.c1.k(lVar, new jz5.l("isFromS1S", bool), new jz5.l("subType", 0), new jz5.l("forbidHistoryUtilChangeQuery", query), new jz5.l("isSecondarySearch", bool), new jz5.l("webCanCloseWhenClearInput", bool))).toString(), com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        android.content.Intent a17 = su4.r2.a();
        a17.putExtra("key_load_js_without_delay", true);
        a17.putExtra("ftsQuery", query);
        a17.putExtra("ftsType", this.f482701g);
        a17.putExtra("ftsbizscene", this.f482700f);
        a17.putExtra("ftsismorebutton", false);
        a17.putExtra("ftsisshowcancel", true);
        java.util.Map c17 = su4.r2.c(this.f482700f, false, this.f482701g, b17);
        java.util.HashMap hashMap = (java.util.HashMap) c17;
        hashMap.put("query", fp.s0.b(query, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
        hashMap.put("searchId", this.f482703i);
        hashMap.put("isHomePage", java.lang.String.valueOf(0));
        hashMap.put("isSug", "1");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (this.f482708q.length() > 0) {
            jSONObject.put("referrer_feed_id", this.f482708q);
        }
        if (this.f482709r.length() > 0) {
            jSONObject.put("finderInfo", this.f482709r);
        }
        if (this.f482710s.length() > 0) {
            jSONObject.put("contextID", this.f482710s);
        }
        if (jSONObject.length() > 0) {
            boolean a18 = tg0.r2.a(this.f482700f);
            java.lang.String jSONObject2 = jSONObject.toString();
            if (!a18) {
                jSONObject2 = fp.s0.b(jSONObject2, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
            }
            hashMap.put("thirdExtParam", jSONObject2);
        }
        if (this.f482702h.length() > 0) {
            hashMap.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, this.f482702h);
            a17.putExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, this.f482702h);
        }
        java.lang.String f17 = su4.r2.f(this.f482700f);
        hashMap.put("subSessionId", f17);
        a17.putExtra("subSessionId", f17);
        a17.putExtra("rawUrl", su4.r2.e(c17, 0));
        a17.putExtra("key_change_search_icon", true);
        a17.putExtra("key_search_icon_and_hint_fix_default", true);
        ((yg0.c4) ((zg0.f3) i95.n0.c(zg0.f3.class))).Di(m80379x76847179(), a17, this.f482699e, false);
        W6();
        p7(rx4.z0.f482879e, 0L);
    }

    public final org.json.JSONArray n7(java.lang.String str) {
        org.json.JSONObject jSONObject;
        org.json.JSONArray optJSONArray;
        try {
            try {
                jSONObject = new org.json.JSONObject(str);
            } catch (org.json.JSONException unused) {
                org.json.JSONArray jSONArray = new org.json.JSONArray(str);
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONArray);
                jSONObject2.put("searchID", "finderInnerSearch");
                jSONObject = jSONObject2;
            }
        } catch (org.json.JSONException unused2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f482698d, "hitest parseCacheDataArray fail: " + str);
            jSONObject = null;
        }
        if (jSONObject == null || (optJSONArray = jSONObject.optJSONArray(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306)) == null) {
            return null;
        }
        java.lang.String optString = jSONObject.optString("searchID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        if (optString.length() > 0) {
            this.f482703i = optString;
        }
        return optJSONArray;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        org.json.JSONObject jSONObject;
        this.f482700f = m158354x19263085().getIntent().getIntExtra("ftsbizscene", 0);
        this.f482701g = m158354x19263085().getIntent().getIntExtra("ftsType", 0);
        java.lang.String stringExtra = m158354x19263085().getIntent().getStringExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f482702h = stringExtra;
        java.lang.String stringExtra2 = m158354x19263085().getIntent().getStringExtra("ftsrealurl");
        if (stringExtra2 == null && (stringExtra2 = m158354x19263085().getIntent().getStringExtra("rawUrl")) == null) {
            stringExtra2 = "";
        }
        java.lang.String a17 = rx4.i2.a(stringExtra2, "pRequestId");
        java.lang.String a18 = rx4.i2.a(stringExtra2, "thirdExtParam");
        if (a18 != null) {
            if (r26.i0.y(a18, "%", false)) {
                a18 = java.net.URLDecoder.decode(a18, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "decode(...)");
            }
            jSONObject = new org.json.JSONObject(a18);
        } else {
            jSONObject = null;
        }
        java.lang.String optString = jSONObject != null ? jSONObject.optString("referrer_feed_id") : null;
        if (optString == null) {
            optString = "";
        }
        this.f482708q = optString;
        org.json.JSONArray optJSONArray = jSONObject != null ? jSONObject.optJSONArray("finderInfo") : null;
        if (optJSONArray == null) {
            optJSONArray = new org.json.JSONArray();
        }
        this.f482709r = optJSONArray;
        java.lang.String optString2 = jSONObject != null ? jSONObject.optString("contextID") : null;
        if (optString2 == null) {
            optString2 = "";
        }
        this.f482710s = optString2;
        java.lang.String optString3 = jSONObject != null ? jSONObject.optString("referer") : null;
        this.f482711t = optString3 != null ? optString3 : "";
        qx4.f0 f0Var = qx4.g0.f448939a;
        int hashCode = hashCode();
        f0Var.a().put(java.lang.Integer.valueOf(hashCode), new java.lang.ref.WeakReference(this));
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(hashCode);
        objArr[1] = this;
        java.util.Collection values = f0Var.a().values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : values) {
            if (((java.lang.ref.WeakReference) obj).get() != null) {
                arrayList.add(obj);
            }
        }
        objArr[2] = java.lang.Integer.valueOf(arrayList.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.NativeHandler", "yptest setNativeHandler %d %s, size:%d", objArr);
        gm0.j1.d().a(2975, this);
        java.lang.String str = "onCreate, hitest, scene: " + this.f482700f + ", bizType: " + this.f482701g + ", sessionId: " + this.f482702h + ", pRequestId: " + a17 + ", referFeedId: " + this.f482708q + ", referFinderInfo: " + this.f482709r + ", url: " + stringExtra2 + ", isParallelReqTypeEnabled: " + k7();
        java.lang.String str2 = this.f482698d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.cg7);
        if (frameLayout != null) {
            float f17 = m158354x19263085().getResources().getDisplayMetrics().density;
            android.view.View inflate = android.view.LayoutInflater.from(m158354x19263085()).inflate(l7() ? com.p314xaae8f345.mm.R.C30864xbddafb2a.dun : com.p314xaae8f345.mm.R.C30864xbddafb2a.egm, (android.view.ViewGroup) null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.widget.ScrollView");
            android.widget.ScrollView scrollView = (android.widget.ScrollView) inflate;
            frameLayout.addView(scrollView);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "hitest teachView inflated & added, visibility=" + scrollView.getVisibility() + " (VISIBLE=0 GONE=8), containerChildCount=" + frameLayout.getChildCount());
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.jlt);
            if (viewGroup != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                int childCount = viewGroup.getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    android.view.View childAt = viewGroup.getChildAt(i17);
                    sb6.append("[" + i17 + ']' + childAt.getClass().getSimpleName() + "(id=" + childAt.getId() + ",vis=" + childAt.getVisibility() + ") ");
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "hitest onCreate: mm_content_fl childCount=" + viewGroup.getChildCount() + ", children=" + ((java.lang.Object) sb6));
            }
            scrollView.getViewTreeObserver().addOnScrollChangedListener(new rx4.o1(this, scrollView));
            scrollView.getViewTreeObserver().addOnGlobalLayoutListener(new rx4.p1(this, scrollView, f17));
            scrollView.setOnTouchListener(new rx4.q1(this));
            this.f482707p = scrollView;
            if (l7()) {
                this.D = true;
                this.E = true;
                pm0.v.X(new rx4.b1(this));
            } else {
                this.E = false;
                pm0.v.X(new rx4.a1(this));
            }
            if (k7()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "hitest parallel mode, ignore pRequestId=" + a17 + ", use native reqId (delayed 500ms)");
                scrollView.postDelayed(new rx4.r1(this), 500L);
                return;
            }
            if (this.f482700f == 123) {
                c7(java.lang.System.currentTimeMillis() + "_native", true);
                b7();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        gm0.j1.d().q(2975, this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f482698d, "onDestroy");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        this.N = java.lang.System.currentTimeMillis();
        this.f482715x.d();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onResume, teachViewVisible=");
        android.widget.ScrollView scrollView = this.f482707p;
        boolean z17 = false;
        if (scrollView != null && scrollView.getVisibility() == 0) {
            z17 = true;
        }
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f482698d, sb6.toString());
        if (this.N > 0) {
            p7(rx4.z0.f482880f, java.lang.System.currentTimeMillis() - this.N);
            this.N = 0L;
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        org.json.JSONArray optJSONArray;
        if (i7()) {
            boolean z17 = false;
            if (m1Var != null && m1Var.mo808xfb85f7b0() == 2975) {
                z17 = true;
            }
            if (z17) {
                com.p314xaae8f345.mm.p971x6de15a2e.v0 mo47948x7f0c4558 = m1Var.mo47948x7f0c4558();
                com.p314xaae8f345.mm.p944x882e457a.o oVar = mo47948x7f0c4558 instanceof com.p314xaae8f345.mm.p944x882e457a.o ? (com.p314xaae8f345.mm.p944x882e457a.o) mo47948x7f0c4558 : null;
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar != null ? oVar.f152244b.f152233a : null;
                r45.e97 e97Var = fVar instanceof r45.e97 ? (r45.e97) fVar : null;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(e97Var != null ? e97Var.f454715e : null, this.K)) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("querySearchWeb end:");
                    sb6.append(i17);
                    sb6.append(", ");
                    sb6.append(i18);
                    sb6.append(", ");
                    sb6.append(str);
                    sb6.append(", requestId: ");
                    java.lang.String str2 = e97Var.f454715e;
                    if (str2 == null) {
                        str2 = "";
                    }
                    sb6.append(str2);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f482698d, sb6.toString());
                    if (i17 == 0 && i18 == 0) {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(e97Var.mo12245xcc313de3().optString("commResp"));
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jSONObject.optString("cgiName"), "QxFinderHisSearch")) {
                            android.app.Activity context = m80379x76847179();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                            pf5.z zVar = pf5.z.f435481a;
                            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                                throw new java.lang.IllegalStateException("Check failed.".toString());
                            }
                            rx4.e0 e0Var = (rx4.e0) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(rx4.e0.class);
                            e0Var.getClass();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSNativeTeachHistoryBoxUIC", "fillLiveItems, " + jSONObject);
                            java.lang.String optString = jSONObject.optString("searchID", "");
                            org.json.JSONObject optJSONObject = jSONObject.optJSONObject(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
                            if (optJSONObject == null || (optJSONArray = optJSONObject.optJSONArray("items")) == null) {
                                return;
                            }
                            pm0.v.X(new rx4.z(e0Var, optJSONArray, optString));
                        }
                    }
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        super.mo2287xc39f8281();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f482698d, "onResume");
        this.f482715x.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x032a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p7(rx4.z0 r22, long r23) {
        /*
            Method dump skipped, instructions count: 908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rx4.h2.p7(rx4.z0, long):void");
    }

    public final void q7(vu4.a actionId, java.lang.String itemInfo, java.lang.String docInfo, boolean z17, java.util.Map extInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionId, "actionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemInfo, "itemInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(docInfo, "docInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfo, "extInfo");
        int i17 = actionId.f521790d;
        if (i17 <= 0) {
            return;
        }
        java.util.Map l17 = kz5.c1.l(new jz5.l("frontExposeId", java.lang.Integer.valueOf(this.f482706o)));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kz5.b1.d(extInfo.size()));
        for (java.util.Map.Entry entry : extInfo.entrySet()) {
            l17.put((java.lang.String) entry.getKey(), entry.getValue());
            linkedHashMap.put(jz5.f0.f384359a, entry.getValue());
        }
        java.lang.Object[] objArr = new java.lang.Object[17];
        objArr[0] = "";
        objArr[1] = this.f482702h;
        objArr[2] = this.f482703i;
        objArr[3] = "";
        objArr[4] = this.f482705n;
        objArr[5] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        objArr[6] = java.lang.Integer.valueOf(i17);
        objArr[7] = itemInfo;
        objArr[8] = docInfo;
        objArr[9] = java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(0));
        objArr[10] = java.lang.Integer.valueOf(this.f482700f);
        objArr[11] = java.lang.Integer.valueOf(this.f482701g);
        objArr[12] = 4;
        objArr[13] = fp.s0.b(new org.json.JSONObject(l17).toString(), com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
        objArr[14] = "";
        objArr[15] = z17 ? "1" : "0";
        objArr[16] = "";
        java.util.List c17 = kz5.b0.c(new rx4.a(26897, kz5.n0.g0(kz5.c0.i(objArr), ",", null, null, 0, null, null, 62, null)));
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        linkedHashMap2.put("requestId", java.util.UUID.randomUUID().toString());
        linkedHashMap2.put("commReq", new org.json.JSONObject(kz5.c1.k(new jz5.l("cgiName", "MMDataReport"), new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, kz5.c1.k(new jz5.l("clientversion", java.lang.Integer.valueOf(o45.wf.f424562g)), new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54472x96df1280, java.lang.Integer.valueOf(o45.wf.f424556a)), new jz5.l(ya.b.f77483x2837e24a, c17.toString())))).toString()));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w1) ((su4.x0) i95.n0.c(su4.x0.class))).aj().a(linkedHashMap2);
    }

    public final void s7(int i17, java.lang.String query, java.lang.String searchID, java.lang.String str, java.util.Map extInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(searchID, "searchID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfo, "extInfo");
        if (m158354x19263085() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19396xdd9ccea5) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI");
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19396xdd9ccea5 activityC19396xdd9ccea5 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19396xdd9ccea5) m158354x19263085;
            java.lang.String str2 = this.f482705n;
            java.util.Map t17 = kz5.c1.t(extInfo);
            t17.put("clickId", this.f482716y);
            if (this.f482708q.length() > 0) {
                t17.put("referrerFeedId", this.f482708q);
            }
            activityC19396xdd9ccea5.oa(i17, query, searchID, query, str2, str, t17);
            p7(rx4.z0.f482879e, 0L);
        }
    }

    public final void t7(int i17, java.lang.String query, java.lang.String str, java.util.Map extInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfo, "extInfo");
        java.lang.String str2 = this.f482703i;
        java.util.Map t17 = kz5.c1.t(extInfo);
        t17.put("clickId", this.f482716y);
        if (this.f482708q.length() > 0) {
            t17.put("referrerFeedId", this.f482708q);
        }
        s7(i17, query, str2, str, t17);
    }

    public final void v7(java.lang.String str, int i17) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.String u17 = ((sg0.a3) ((su4.e1) i95.n0.c(su4.e1.class))).wi().u("websearch:history14", "");
        if (u17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            try {
                c75.c.d(new org.json.JSONArray(u17), new rx4.t1(arrayList));
            } catch (org.json.JSONException unused) {
            }
            linkedHashMap.put("search_history", arrayList);
        }
        java.lang.String u18 = ((sg0.a3) ((su4.e1) i95.n0.c(su4.e1.class))).wi().u("websearch:FINDER_REC_QUERY_PERMANENT_KEY", "");
        if (u18 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            try {
                c75.c.d(new org.json.JSONArray(u18), new rx4.u1(arrayList2));
            } catch (org.json.JSONException unused2) {
            }
            linkedHashMap.put("last_exposure_history", arrayList2);
        }
        linkedHashMap.put("dark_mode", java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.bk.C() ? 1 : 0));
        linkedHashMap.put("need_placeholder", java.lang.Boolean.valueOf(this.f482712u));
        linkedHashMap.put("req_type", java.lang.Integer.valueOf(i17));
        linkedHashMap.put("referrer_feed_id", this.f482708q);
        linkedHashMap.put("video_play_history", this.f482709r);
        if (this.f482711t.length() > 0) {
            linkedHashMap.put("comment_referrer", this.f482711t);
        }
        java.util.Map l17 = kz5.c1.l(new jz5.l(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, this.f482702h), new jz5.l("guideInfo", new org.json.JSONObject(linkedHashMap).toString()), new jz5.l("ignoreCache", java.lang.Boolean.TRUE), new jz5.l("isHomePage", 0), new jz5.l("requestId", str), new jz5.l("requestType", 0), new jz5.l("nativeReqType", java.lang.Integer.valueOf(i17)), new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(this.f482700f)), new jz5.l("type", java.lang.Integer.valueOf(this.f482701g)), new jz5.l("subType", 0), new jz5.l("webview_instance_id", java.lang.Integer.valueOf(hashCode())));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f482698d, "hitest sendTeachSearchRequest reqId=" + str + ", reqType=" + i17 + ", params=" + l17);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.a0) ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w1) ((su4.x0) i95.n0.c(su4.x0.class))).Zi()).getClass();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w1) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w1.class)).aj().f(l17);
    }

    public final void w7(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f482698d, "hitest setTeachViewVisibility visibility=" + i17 + " (VISIBLE=0 GONE=8)");
        android.widget.ScrollView scrollView = this.f482707p;
        if (scrollView != null) {
            scrollView.setVisibility(i17);
        }
        if (i17 != 8) {
            this.f482706o++;
            this.f482717z = 0;
            android.widget.ScrollView scrollView2 = this.f482707p;
            if (scrollView2 != null) {
                scrollView2.post(new rx4.w1(this, scrollView2, m158354x19263085().getResources().getDisplayMetrics().density));
                return;
            }
            return;
        }
        android.widget.ScrollView scrollView3 = this.f482707p;
        if (scrollView3 != null) {
            scrollView3.scrollTo(0, 0);
        }
        W6();
        this.f482715x.d();
        pf5.u uVar = pf5.u.f435469a;
        rx4.e0 e0Var = (rx4.e0) uVar.b(m80379x76847179()).a(rx4.e0.class);
        e0Var.getClass();
        pm0.v.X(new rx4.a0(e0Var));
        rx4.u0 u0Var = (rx4.u0) uVar.b(m80379x76847179()).a(rx4.u0.class);
        u0Var.getClass();
        pm0.v.X(new rx4.m0(u0Var));
        rx4.k0 k0Var = (rx4.k0) uVar.b(m80379x76847179()).a(rx4.k0.class);
        k0Var.getClass();
        pm0.v.X(new rx4.h0(k0Var));
        rx4.s sVar = (rx4.s) uVar.b(m80379x76847179()).a(rx4.s.class);
        sVar.getClass();
        pm0.v.X(new rx4.o(sVar));
        this.F = false;
        this.H = null;
        this.I = false;
        pm0.v.X(new rx4.v1(this));
    }

    public final java.lang.String x7(java.lang.String str) {
        java.lang.String str2 = this.f482698d;
        if (str.length() == 0) {
            return str;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
            if (optJSONArray == null) {
                return str;
            }
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            int length = optJSONArray.length();
            int i17 = 0;
            for (int i18 = 0; i18 < length; i18++) {
                org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i18);
                if (optJSONObject != null) {
                    boolean optBoolean = optJSONObject.optBoolean("noCache", false);
                    boolean z17 = optJSONObject.optInt("type") == 42;
                    if (!optBoolean && !z17) {
                        jSONArray.put(optJSONObject);
                    }
                    i17++;
                }
            }
            if (i17 == 0) {
                return str;
            }
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONArray);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "hitest stripNoCacheForStorage stripped=" + i17);
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jSONObject2);
            return jSONObject2;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "hitest stripNoCacheForStorage error: " + e17);
            return str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0312, code lost:
    
        if (r0 != null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02ff, code lost:
    
        if (r0 != null) goto L132;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y7(int r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 893
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rx4.h2.y7(int, boolean):void");
    }

    public final void z7() {
        pm0.v.X(new rx4.y1(this));
    }
}
