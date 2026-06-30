package gv4;

/* loaded from: classes.dex */
public final class a extends aw4.b0 {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f357646h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(hv4.b uiComponent) {
        super(uiComponent);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiComponent, "uiComponent");
        this.f357646h = "MicroMsg.WebSearch.TagSearchJSApi";
    }

    @android.webkit.JavascriptInterface
    /* renamed from: appendSearchTag */
    public java.lang.String m132391x87f8ced8(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f357646h, "appendSearchTag " + str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString("query", "");
            java.lang.String optString2 = jSONObject.optString("searchId", "");
            java.lang.String optString3 = jSONObject.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, "");
            java.lang.String optString4 = jSONObject.optString("requestId", "");
            av4.j jVar = this.f95859a;
            hv4.b bVar = jVar instanceof hv4.b ? (hv4.b) jVar : null;
            if (bVar != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString3);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString4);
                bVar.a5(optString, optString3, optString2, optString4);
            }
            return g().toString();
        } catch (java.lang.Exception unused) {
            return f().toString();
        }
    }

    @Override // aw4.l
    public int k() {
        return 1;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: openSearchWebView */
    public java.lang.String m132392xf159c727(java.lang.String str) {
        r45.ck6 ck6Var;
        java.lang.String str2;
        java.lang.String str3 = "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f357646h, "openSearchWebView " + str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString("query");
            int optInt = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
            int optInt2 = jSONObject.optInt("type", 0);
            int optInt3 = jSONObject.optInt("subType", 0);
            java.lang.String optString2 = jSONObject.optString("searchId", "");
            java.lang.String optString3 = jSONObject.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, "");
            int optInt4 = jSONObject.optInt("actionType", 0);
            java.lang.String optString4 = jSONObject.optString("extParams", "");
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("nativeConfig");
            java.lang.String optString5 = optJSONObject != null ? optJSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28) : null;
            if (optString5 == null) {
                optString5 = "";
            }
            if (optInt4 == 3) {
                java.util.Map c17 = su4.r2.c(optInt, false, optInt2, optString4);
                java.util.HashMap hashMap = (java.util.HashMap) c17;
                hashMap.put("query", optString);
                hashMap.put("searchId", optString2);
                hashMap.put("subType", java.lang.String.valueOf(optInt3));
                hashMap.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, optString3);
                hashMap.put("subSessionId", su4.r2.f(optInt));
                r45.ck6 ck6Var2 = new r45.ck6();
                av4.j jVar = this.f95859a;
                hv4.b bVar = jVar instanceof hv4.b ? (hv4.b) jVar : null;
                if (bVar != null && (ck6Var = (r45.ck6) bVar.m4()) != null && (str2 = ck6Var.f453163o) != null) {
                    str3 = str2;
                }
                ck6Var2.f453163o = str3;
                ck6Var2.f453158g = gv4.d.f357652a.a(c17);
                ck6Var2.f453160i = optString;
                ck6Var2.f453157f = optInt;
                ck6Var2.f453155d = optString2;
                ck6Var2.f453156e = optString3;
                ck6Var2.f453159h = su4.r2.f(optInt);
                ck6Var2.f453162n = optString5;
                av4.j jVar2 = this.f95859a;
                hv4.b bVar2 = jVar2 instanceof hv4.b ? (hv4.b) jVar2 : null;
                if (bVar2 != null) {
                    bVar2.r1(ck6Var2);
                }
            }
            return g().toString();
        } catch (java.lang.Exception unused) {
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: setSearchTagResult */
    public java.lang.String m132393x116cdacd(java.lang.String str) {
        gv4.e c17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f357646h, "setSearchTagResult " + str);
        if (str == null) {
            return f().toString();
        }
        av4.j jVar = this.f95859a;
        hv4.b bVar = jVar instanceof hv4.b ? (hv4.b) jVar : null;
        if (bVar != null && (c17 = bVar.c()) != null) {
            try {
                su4.m1 m1Var = c17.f357654m;
                if (m1Var != null) {
                    gm0.j1.d().d(m1Var);
                    c17.f357654m = null;
                }
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                r45.rn3 rn3Var = new r45.rn3();
                rn3Var.f466555d = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
                rn3Var.f466556e = jSONObject.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, "");
                rn3Var.f466557f = jSONObject.optString("requestId", "");
                rn3Var.f466558g = jSONObject.optString("searchId", "");
                rn3Var.f466560i = jSONObject.optString("query", "");
                rn3Var.f466561m = jSONObject.optString("content", "");
                rn3Var.f466559h = jSONObject.optInt("h5Version", 0);
                su4.m1 m1Var2 = new su4.m1(rn3Var, c17.a());
                gm0.j1.d().g(m1Var2);
                c17.f357654m = m1Var2;
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("screenshot");
                hv4.b k17 = c17.k();
                com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e mo9090x86b9ebe3 = k17 != null ? k17.mo9090x86b9ebe3() : null;
                if (optJSONObject != null && mo9090x86b9ebe3 != null) {
                    hv4.b k18 = c17.k();
                    int b17 = i65.a.b(k18 != null ? k18.H() : null, optJSONObject.optInt("x", 0));
                    hv4.b k19 = c17.k();
                    int b18 = i65.a.b(k19 != null ? k19.H() : null, optJSONObject.optInt("y", 0));
                    hv4.b k27 = c17.k();
                    int b19 = i65.a.b(k27 != null ? k27.H() : null, optJSONObject.optInt("w", 0));
                    hv4.b k28 = c17.k();
                    android.graphics.Bitmap E = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.E(mo9090x86b9ebe3.m120139x12501425(), b17, b18, b19, i65.a.b(k28 != null ? k28.H() : null, optJSONObject.optInt("h", 0)), true);
                    su4.m1 m1Var3 = c17.f357654m;
                    if (m1Var3 != null) {
                        m1Var3.f494544i = E;
                    }
                }
                hv4.b k29 = c17.k();
                if (k29 != null) {
                    java.lang.String RequestId = rn3Var.f466557f;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(RequestId, "RequestId");
                    k29.D(RequestId);
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return g().toString();
    }
}
