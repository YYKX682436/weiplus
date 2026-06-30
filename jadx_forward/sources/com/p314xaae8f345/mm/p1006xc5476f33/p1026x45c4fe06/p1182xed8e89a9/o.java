package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9;

/* loaded from: classes7.dex */
public abstract class o implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.d {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f169228d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f169229e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5128x72a3f151 f169230f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f169231g;

    /* renamed from: h, reason: collision with root package name */
    public double f169232h;

    /* renamed from: i, reason: collision with root package name */
    public double f169233i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f169234m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f169235n;

    public o() {
        int i17 = sj1.l.f489904a;
        int i18 = sj1.l.f489904a;
        this.f169228d = i18 == 0 || i18 == 3;
    }

    public static final void c(org.json.JSONArray jSONArray, org.json.JSONArray jSONArray2, org.json.JSONArray jSONArray3, org.json.JSONArray jSONArray4, com.p302x1ea3c036.p304x697f145.C2847x6dfc0dd7 c2847x6dfc0dd7) {
        if (c2847x6dfc0dd7 != null) {
            java.util.Iterator<com.p302x1ea3c036.p304x697f145.C2844x40fb94d> it = c2847x6dfc0dd7.m21144x1fe7c0f5().iterator();
            while (it.hasNext()) {
                com.p302x1ea3c036.p304x697f145.C2844x40fb94d next = it.next();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, next.m21111xfb82e301());
                jSONObject.put("category", next.m21109x7edcfa74());
                jSONObject.put("startTime", next.m21112x8082fb99());
                jSONObject.put("endTime", next.m21110xde00a612());
                jSONObject.put("thread", next.m21113x30f83100());
                jSONArray.put(jSONObject);
            }
            java.util.Iterator<com.p302x1ea3c036.p304x697f145.C2843x403827a> it6 = c2847x6dfc0dd7.m21143x1492ba2().iterator();
            while (it6.hasNext()) {
                com.p302x1ea3c036.p304x697f145.C2843x403827a next2 = it6.next();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, next2.m21092xfb82e301());
                jSONObject2.put("category", next2.m21091x7edcfa74());
                jSONObject2.put("startTime", next2.m21093x8082fb99());
                jSONObject2.put("thread", next2.m21094x30f83100());
                jSONArray2.put(jSONObject2);
            }
            java.util.Iterator<com.p302x1ea3c036.p304x697f145.C2848xa8c46b74> it7 = c2847x6dfc0dd7.m21146x36b65c08().iterator();
            while (it7.hasNext()) {
                com.p302x1ea3c036.p304x697f145.C2848xa8c46b74 next3 = it7.next();
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("startTime", next3.m21156x8082fb99());
                jSONObject3.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, next3.m21155xfb7e5820());
                jSONArray3.put(jSONObject3);
            }
            java.util.Iterator<com.p302x1ea3c036.p304x697f145.C2845x3640af73> it8 = c2847x6dfc0dd7.m21145x98de0607().iterator();
            while (it8.hasNext()) {
                com.p302x1ea3c036.p304x697f145.C2845x3640af73 next4 = it8.next();
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                jSONObject4.put("startTime", next4.m21129x8082fb99());
                jSONObject4.put("allUsed", next4.m21127x76f5cc8());
                jSONObject4.put("jsHeapSizeUsed", next4.m21128x25956649());
                jSONArray4.put(jSONObject4);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.d
    public void I() {
        sj1.b c17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.LuggageProfileManager", "profileStart");
        this.f169231g = true;
        this.f169232h = com.p302x1ea3c036.p304x697f145.C2849xa2aadc78.INSTANCE.m21186x444c05bd();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f169229e;
        if (e9Var != null) {
            if (!this.f169234m) {
                this.f169234m = true;
                return;
            }
            sj1.b c18 = sj1.l.c(java.lang.String.valueOf(e9Var.mo50260x9f1221c2()));
            if (c18 != null) {
                c18.i();
            }
            java.lang.String mo48798x74292566 = e9Var.mo48798x74292566();
            if (mo48798x74292566 == null || (c17 = sj1.l.c(mo48798x74292566)) == null) {
                return;
            }
            c17.i();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.d
    public java.lang.String L1() {
        java.lang.String mo48798x74292566;
        com.p302x1ea3c036.p304x697f145.C2847x6dfc0dd7 c2847x6dfc0dd7;
        com.p302x1ea3c036.p304x697f145.C2847x6dfc0dd7 c2847x6dfc0dd72;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.LuggageProfileManager", "profileStop start");
        this.f169231g = false;
        this.f169233i = com.p302x1ea3c036.p304x697f145.C2849xa2aadc78.INSTANCE.m21186x444c05bd();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
        org.json.JSONArray jSONArray3 = new org.json.JSONArray();
        org.json.JSONArray jSONArray4 = new org.json.JSONArray();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f169229e;
        java.lang.String str = "";
        if (e9Var != null) {
            sj1.b c17 = sj1.l.c(java.lang.String.valueOf(e9Var != null ? java.lang.Integer.valueOf(e9Var.mo50260x9f1221c2()) : null));
            if (c17 != null) {
                c17.e("");
                c2847x6dfc0dd72 = c17.h();
            } else {
                c2847x6dfc0dd72 = null;
            }
            c(jSONArray, jSONArray2, jSONArray3, jSONArray4, c2847x6dfc0dd72);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("profileStop profileInfo:");
            sb6.append(c2847x6dfc0dd72 != null ? c2847x6dfc0dd72.m21148x9d6b37f4() : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.LuggageProfileManager", sb6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var2 = this.f169229e;
        if (e9Var2 != null && (mo48798x74292566 = e9Var2.mo48798x74292566()) != null) {
            sj1.b c18 = sj1.l.c(mo48798x74292566);
            if (c18 != null) {
                c18.e("");
                c2847x6dfc0dd7 = c18.h();
            } else {
                c2847x6dfc0dd7 = null;
            }
            c(jSONArray, jSONArray2, jSONArray3, jSONArray4, c2847x6dfc0dd7);
        }
        try {
            pb.d dVar = com.p302x1ea3c036.p304x697f145.C2847x6dfc0dd7.f9705x233c02ec;
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var3 = this.f169229e;
            java.lang.String mo48798x742925662 = e9Var3 != null ? e9Var3.mo48798x74292566() : null;
            if (mo48798x742925662 != null) {
                str = mo48798x742925662;
            }
            java.lang.String str3 = ((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(str2, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(str), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.n.f169227a.getClass())).f149939d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.LuggageProfileManager", "mainProcessProfileInfo value:" + str3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "apply(...)");
            c(jSONArray, jSONArray2, jSONArray3, jSONArray4, dVar.a(str3));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.LuggageProfileManager", "mainProcessProfileInfo obtain fail e:" + e17);
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("frames", jSONArray);
        jSONObject.put("events", jSONArray2);
        jSONObject.put("startTime", this.f169232h);
        jSONObject.put("endTime", this.f169233i);
        jSONObject.put("screenshots", jSONArray3);
        jSONObject.put("memoryUsages", jSONArray4);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.LuggageProfileManager", "profileStop result:".concat(jSONObject2));
        return jSONObject2;
    }

    public abstract void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var);

    public abstract void b(java.lang.String str);

    public void d() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("unInit componentId:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f169229e;
        sb6.append(e9Var != null ? java.lang.Integer.valueOf(e9Var.mo50260x9f1221c2()) : null);
        sb6.append(" appId:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var2 = this.f169229e;
        sb6.append(e9Var2 != null ? e9Var2.mo48798x74292566() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.LuggageProfileManager", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var3 = this.f169229e;
        sj1.b j17 = sj1.l.j(java.lang.String.valueOf(e9Var3 != null ? java.lang.Integer.valueOf(e9Var3.mo50260x9f1221c2()) : null));
        if (j17 != null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("this:");
            sb7.append(this);
            sb7.append(" unInit componentId:");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var4 = this.f169229e;
            sb7.append(e9Var4 != null ? java.lang.Integer.valueOf(e9Var4.mo50260x9f1221c2()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.LuggageProfileManager", sb7.toString());
            j17.mo21140x41012807();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var5 = this.f169229e;
        sj1.b j18 = sj1.l.j(java.lang.String.valueOf(e9Var5 != null ? e9Var5.mo48798x74292566() : null));
        if (j18 != null) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("this:");
            sb8.append(this);
            sb8.append(" unInit appId:");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var6 = this.f169229e;
            sb8.append(e9Var6 != null ? e9Var6.mo48798x74292566() : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.LuggageProfileManager", sb8.toString());
            j18.mo21140x41012807();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.LuggageProfileManager", "unInit done");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.b
    public void m(java.lang.String data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (this.f169228d) {
            if (!this.f169235n) {
                com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5128x72a3f151 c5128x72a3f151 = this.f169230f;
                if (c5128x72a3f151 != null) {
                    c5128x72a3f151.m43178x2ac791bd(0);
                }
                this.f169235n = true;
            }
            com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5128x72a3f151 c5128x72a3f1512 = this.f169230f;
            if (c5128x72a3f1512 != null) {
                c5128x72a3f1512.m43176x49114b2(0, data);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.LuggageProfileManager", "sendInspectMessage msg:".concat(data));
        }
    }
}
