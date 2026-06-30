package r01;

@j95.b
/* loaded from: classes7.dex */
public final class l1 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final int f449675d = 213;

    /* renamed from: e, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f449676e = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));

    /* renamed from: f, reason: collision with root package name */
    public uh4.i0 f449677f = r01.k1.f449663d;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f449678g = jz5.h.b(r01.n0.f449695d);

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f449679h = jz5.h.b(r01.d1.f449576d);

    /* renamed from: i, reason: collision with root package name */
    public final r01.m0 f449680i = new r01.m0(null, null, 3, null);

    /* renamed from: m, reason: collision with root package name */
    public final r01.m0 f449681m = new r01.m0(null, null, 3, null);

    public l1() {
        Ni().i("BizPersonalCenterPluginAppHelper_LoginEventKey", new r01.i0(this));
        Ni().g("BizPersonalCenterPluginAppHelper_LogoutEventKey", new r01.j0(this));
        Ri().i("BizPersonalCenterPluginAppHelper_LoginEventKey", new r01.k0(this));
        Ri().g("BizPersonalCenterPluginAppHelper_LogoutEventKey", new r01.l0(this));
    }

    public static void Zi(r01.l1 l1Var, android.content.Context context, java.lang.String str, int i17, boolean z17, int i18, java.lang.Object obj) {
        r01.m0 m0Var;
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b bVar;
        r01.m0 m0Var2;
        java.lang.String str2 = null;
        if ((i18 & 2) != 0) {
            str = null;
        }
        if ((i18 & 8) != 0) {
            z17 = true;
        }
        if (!z17 ? !((m0Var = l1Var.f449681m) == null || (bVar = m0Var.f449687b) == null) : !((m0Var2 = l1Var.f449680i) == null || (bVar = m0Var2.f449687b) == null)) {
            str2 = bVar.f299423f;
        }
        if (str == null) {
            str = str2;
        }
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizPersonalCenterPluginAppHelper", "#openBusinessProfilePage userName null");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", str);
        intent.putExtra("force_get_contact", true);
        intent.putExtra("key_use_new_contact_profile", true);
        intent.putExtra("Contact_IsBizAuthor", true);
        intent.putExtra("Contact_Scene", i17);
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        j45.l.n(context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, l1Var.f449675d);
    }

    public static final void wi(r01.l1 l1Var, java.lang.String str, r01.m0 m0Var) {
        l1Var.getClass();
        ((ku5.t0) ku5.t0.f394148d).B(new r01.y0(m0Var, str));
        (m0Var == l1Var.f449680i ? l1Var.Ni() : l1Var.Ri()).d(new r01.a1(m0Var));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x005b, code lost:
    
        if ((r6.length() > 0) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject Ai(int r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "bizUin"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONArray r1 = r4.Di()
            java.lang.String r2 = "bizList"
            r0.put(r2, r1)
            java.lang.Class<tk.o> r1 = tk.o.class
            i95.m r2 = i95.n0.c(r1)
            tk.o r2 = (tk.o) r2
            ox.g r2 = (ox.g) r2
            java.lang.String r2 = r2.Vi()
            java.lang.String r3 = "picTextNameVersion"
            r0.put(r3, r2)
            i95.m r2 = i95.n0.c(r1)
            tk.o r2 = (tk.o) r2
            ox.g r2 = (ox.g) r2
            boolean r2 = r2.Di()
            if (r2 == 0) goto L37
            java.lang.String r2 = "1"
            goto L39
        L37:
            java.lang.String r2 = "0"
        L39:
            java.lang.String r3 = "photoAccountOpen"
            r0.put(r3, r2)
            i95.m r1 = i95.n0.c(r1)
            tk.o r1 = (tk.o) r1
            ox.g r1 = (ox.g) r1
            java.lang.String r1 = r1.Vi()
            java.lang.String r2 = "supportViewPhotoAcct"
            r0.put(r2, r1)
            if (r5 != 0) goto L5d
            int r1 = r6.length()
            if (r1 <= 0) goto L5a
            r1 = 1
            goto L5b
        L5a:
            r1 = 0
        L5b:
            if (r1 == 0) goto L67
        L5d:
            java.lang.String r1 = "bizType"
            r0.put(r1, r5)
            java.lang.String r5 = "biz"
            r0.put(r5, r6)
        L67:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r01.l1.Ai(int, java.lang.String):org.json.JSONObject");
    }

    public final l81.p0 Bi(int i17, java.lang.String bizUin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUin, "bizUin");
        return new r01.v0(this, i17, bizUin);
    }

    public final org.json.JSONArray Di() {
        r01.m0 m0Var = this.f449680i;
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b bVar = m0Var.f449687b;
        r01.m0 m0Var2 = this.f449681m;
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b bVar2 = m0Var2.f449687b;
        if (bVar == null || bVar2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizPersonalCenterPluginAppHelper", "getAllBiz: bizAcct or photoAcct is null");
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b bVar3 = m0Var.f449687b;
        int i17 = (bVar3 == null || !bVar3.f299430p) ? 0 : 1;
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b bVar4 = m0Var2.f449687b;
        int i18 = (bVar4 == null || !bVar4.f299430p) ? 0 : 1;
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        tk.s[] sVarArr = tk.s.f501403d;
        jSONObject.put("bizType", 1);
        java.lang.String str = bVar != null ? bVar.f299422e : null;
        if (str == null) {
            str = "";
        }
        jSONObject.put("biz", str);
        jSONObject.put("interactiveIdentityType", i17);
        jSONObject.put("initFlag", bVar != null ? bVar.f299427m : false);
        java.lang.Object obj = bVar;
        if (bVar == null) {
            obj = "";
        }
        jSONObject.put("fullInfo", pm0.b0.g(obj));
        jSONArray.put(jSONObject);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        tk.s[] sVarArr2 = tk.s.f501403d;
        jSONObject2.put("bizType", 2);
        java.lang.String str2 = bVar2 != null ? bVar2.f299422e : null;
        if (str2 == null) {
            str2 = "";
        }
        jSONObject2.put("biz", str2);
        jSONObject2.put("interactiveIdentityType", i18);
        jSONObject2.put("initFlag", bVar2 != null ? bVar2.f299427m : false);
        java.lang.Object obj2 = bVar2;
        if (bVar2 == null) {
            obj2 = "";
        }
        jSONObject2.put("fullInfo", pm0.b0.g(obj2));
        jSONArray.put(jSONObject2);
        return jSONArray;
    }

    public final com.p314xaae8f345.p3133xd0ce8b26.iam.biz.z0 Ni() {
        return (com.p314xaae8f345.p3133xd0ce8b26.iam.biz.z0) this.f449678g.mo141623x754a37bb();
    }

    public final com.p314xaae8f345.p3133xd0ce8b26.iam.biz.z0 Ri() {
        return (com.p314xaae8f345.p3133xd0ce8b26.iam.biz.z0) this.f449679h.mo141623x754a37bb();
    }

    public final void Ui(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        Ni().b(new r01.x0(callback));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if ((!r31.isEmpty()) == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l81.p0 Vi(java.util.List r31, int r32, org.json.JSONObject r33) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r01.l1.Vi(java.util.List, int, org.json.JSONObject):l81.p0");
    }

    public final void aj(android.content.Context context, com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23530x2996bff1 jumpInfo, l81.e1 e1Var, rv.e3 e3Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfo, "jumpInfo");
        l81.b1 b1Var = new l81.b1();
        java.lang.String m87061x74292566 = jumpInfo.m87061x74292566();
        if (m87061x74292566 == null) {
            m87061x74292566 = "";
        }
        b1Var.f398547b = m87061x74292566;
        java.lang.String m87063xcc472467 = jumpInfo.m87063xcc472467();
        if (m87063xcc472467 == null) {
            m87063xcc472467 = "";
        }
        b1Var.f398555f = m87063xcc472467;
        java.lang.Long m87067x7520bed6 = jumpInfo.m87067x7520bed6();
        b1Var.f398565k = m87067x7520bed6 != null ? (int) m87067x7520bed6.longValue() : 0;
        java.lang.String m87068x667e87e8 = jumpInfo.m87068x667e87e8();
        if (m87068x667e87e8 == null) {
            m87068x667e87e8 = "";
        }
        b1Var.f398567l = m87068x667e87e8;
        java.util.List<com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23531x767fe49d> m87064xa4e35219 = jumpInfo.m87064xa4e35219();
        java.lang.Long m87065xc46f670e = jumpInfo.m87065xc46f670e();
        int longValue = m87065xc46f670e != null ? (int) m87065xc46f670e.longValue() : 0;
        java.lang.Long m87069x66e5ae59 = jumpInfo.m87069x66e5ae59();
        int longValue2 = m87069x66e5ae59 != null ? (int) m87069x66e5ae59.longValue() : 0;
        java.lang.String m87062xb5882ddd = jumpInfo.m87062xb5882ddd();
        if (m87062xb5882ddd == null) {
            m87062xb5882ddd = "";
        }
        java.lang.String m87070xa70f9d34 = jumpInfo.m87070xa70f9d34();
        java.lang.String str = m87070xa70f9d34 != null ? m87070xa70f9d34 : "";
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("personalCenterWxaDataKey", str);
        if ((m87062xb5882ddd.length() > 0) || longValue2 != 0) {
            jSONObject.put("bizType", longValue2);
            jSONObject.put("biz", m87062xb5882ddd);
        }
        b1Var.f398561i = Vi(m87064xa4e35219, longValue, jSONObject);
        if (((ox.z) ((tk.r) i95.n0.c(tk.r.class))).Ai(context, b1Var, e3Var)) {
            return;
        }
        Ui(new r01.c1(b1Var, e1Var, context));
    }

    public final void bj() {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class)).Yf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6.S);
    }

    public final void cj() {
        Ni().d(new r01.f1(this));
        Ri().d(new r01.h1(this));
        ((uh4.c0) i95.n0.c(uh4.c0.class)).Kb(this.f449677f);
    }

    public final void fj(java.lang.String appId, java.lang.String path, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.s6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.s6.class)).P4("", appId, path, i17);
    }
}
