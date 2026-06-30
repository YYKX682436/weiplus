package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e;

/* loaded from: classes9.dex */
public final class f implements m31.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f163858a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.q f163859b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.C12183x2c92285e f163860c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f163861d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f163862e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 f163863f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f163864g;

    public f(boolean z17, yz5.q qVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.C12183x2c92285e c12183x2c92285e, java.util.Map map, java.util.List list, com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5, android.content.Context context) {
        this.f163858a = z17;
        this.f163859b = qVar;
        this.f163860c = c12183x2c92285e;
        this.f163861d = map;
        this.f163862e = list;
        this.f163863f = c11158xe7d16ed5;
        this.f163864g = context;
    }

    @Override // m31.c1
    public void a(int i17, java.util.List resultData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resultData, "resultData");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(resultData);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.C12183x2c92285e c12183x2c92285e = this.f163860c;
        int i18 = 3;
        if (i17 == 1 || i17 == 2 || i17 == 3) {
            boolean z17 = this.f163858a;
            yz5.q qVar = this.f163859b;
            if (z17) {
                qVar.mo147xb9724478(java.lang.Integer.valueOf(i17 == 2 ? 3 : i17), arrayList, java.lang.Boolean.valueOf(c12183x2c92285e.c().A.isChecked()));
            } else {
                qVar.mo147xb9724478(java.lang.Integer.valueOf(i17), arrayList, java.lang.Boolean.valueOf(c12183x2c92285e.c().A.isChecked()));
            }
        }
        java.util.Map map = this.f163861d;
        java.util.List S0 = kz5.n0.S0(map.keySet());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = S0.iterator();
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) map.get(java.lang.Integer.valueOf(((java.lang.Number) it.next()).intValue()));
            if (num != null) {
                arrayList2.add(java.lang.Integer.valueOf(num.intValue()));
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.addAll(this.f163863f.f153318h);
        c12183x2c92285e.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.k kVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.k(this.f163862e);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d3 = (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3) it6.next();
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("templateType", java.lang.String.valueOf(c11159x8f55e6d3.f153337g));
            linkedHashMap.put("selected", java.lang.String.valueOf(((java.lang.Boolean) kVar.mo146xb9724478(c11159x8f55e6d3)).booleanValue()));
            linkedHashMap.put("templateID", c11159x8f55e6d3.f153336f);
            arrayList4.add(linkedHashMap);
        }
        boolean isChecked = c12183x2c92285e.c().A.isChecked();
        if (i17 == 1) {
            i18 = 1;
        } else if (i17 == 2) {
            i18 = 2;
        } else if (i17 != 3) {
            i18 = 0;
        }
        java.lang.String g07 = kz5.n0.g0(S0, "#", null, null, 0, null, null, 62, null);
        java.lang.String g08 = kz5.n0.g0(arrayList2, "#", null, null, 0, null, null, 62, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.c cVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.c) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.c.class, true);
        if (cVar != null) {
            ((ch1.d) cVar).c(17524, -1, android.net.Uri.encode(new org.json.JSONArray((java.util.Collection) arrayList4).toString()), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(isChecked ? 1 : 0), -1, -1, c12183x2c92285e.f163828d, "", g07, g08, 1, "", c12183x2c92285e.f163830f, java.lang.Integer.valueOf(c12183x2c92285e.f163831g + 1000));
        }
    }

    @Override // m31.c1
    public void b(m31.b1 b1Var, boolean z17, m31.q0 item, boolean z18) {
        ze.n t37;
        fl1.g2 m48800x14ed3266;
        ze.n t38;
        fl1.g2 m48800x14ed32662;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(b1Var, "switch");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        if (b1Var == m31.b1.f404655d && z17 && z18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.C12183x2c92285e c12183x2c92285e = this.f163860c;
            m31.p1 c17 = c12183x2c92285e.c();
            c12183x2c92285e.getClass();
            android.content.Context context = this.f163864g;
            if (context == null) {
                return;
            }
            m31.c0 c0Var = new m31.c0(context);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getBoolean("appbrand_subscribe_msg_force_notify_template_show_guide", false)) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.e eVar = c12183x2c92285e.f163833i;
            if (eVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.l lVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.l(c12183x2c92285e, c0Var);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.C12185x86bd78c5 c12185x86bd78c5 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.q) eVar).f163885a;
                com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar = c12185x86bd78c5.f163839h;
                if (yVar != null && (t38 = yVar.t3()) != null && (m48800x14ed32662 = t38.m48800x14ed3266()) != null) {
                    ((fl1.c0) m48800x14ed32662).d(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.p(c12185x86bd78c5, lVar));
                }
                com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar2 = c12185x86bd78c5.f163839h;
                if (yVar2 != null && (t37 = yVar2.t3()) != null && (m48800x14ed3266 = t37.m48800x14ed3266()) != null) {
                    ((fl1.c0) m48800x14ed3266).a(c17);
                }
            }
            c0Var.f404661g = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.m(c12183x2c92285e, c17);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putBoolean("appbrand_subscribe_msg_force_notify_template_show_guide", true);
        }
    }
}
