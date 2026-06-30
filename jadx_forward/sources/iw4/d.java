package iw4;

/* loaded from: classes.dex */
public final class d implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f376777d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2608xc9fa65a8.p2609x2eefaa.C21007x2f4a06dc f376778e;

    /* renamed from: f, reason: collision with root package name */
    public int f376779f;

    /* renamed from: g, reason: collision with root package name */
    public int f376780g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f376781h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f376782i = "Similar" + java.lang.System.currentTimeMillis();

    /* renamed from: m, reason: collision with root package name */
    public boolean f376783m = true;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f376784n = new java.util.LinkedList();

    public final com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb a() {
        com.p314xaae8f345.mm.p2608xc9fa65a8.p2609x2eefaa.C21007x2f4a06dc c21007x2f4a06dc = this.f376778e;
        if (c21007x2f4a06dc == null) {
            return null;
        }
        boolean c17 = c();
        java.util.LinkedList linkedList = this.f376784n;
        if (!c17) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.k0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v5.class))).getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
            if (linkedList.isEmpty()) {
                linkedList.add(new ir.g(c21053xdbf1e5f4, 107, null, 0, 12, null));
            }
            return c21053xdbf1e5f4;
        }
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb Ni = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5.class))).Ni(c21007x2f4a06dc.f274683e);
        if (Ni == null) {
            return null;
        }
        ((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) Ni).f68653x95b20dd4 = 65;
        if (linkedList.isEmpty()) {
            linkedList.add(new ir.g(Ni, 100, null, 0, 12, null));
        }
        return Ni;
    }

    public final void b(com.p314xaae8f345.mm.p944x882e457a.u0 callback) {
        com.p314xaae8f345.mm.p2608xc9fa65a8.p2609x2eefaa.C21007x2f4a06dc c21007x2f4a06dc;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SimilarEmoji", "do net request:[" + this.f376778e + ']');
        this.f376777d = callback;
        if (this.f376783m && (c21007x2f4a06dc = this.f376778e) != null) {
            if (c()) {
                com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb Ni = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5.class))).Ni(c21007x2f4a06dc.f274683e);
                tg0.w1 w1Var = (tg0.w1) i95.n0.c(tg0.w1.class);
                java.lang.String str2 = c21007x2f4a06dc.f274683e;
                int i17 = this.f376779f;
                java.lang.String str3 = this.f376782i;
                com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) Ni;
                java.lang.String str4 = c21053xdbf1e5f4.f68654xf47770e7;
                java.lang.String str5 = c21053xdbf1e5f4.f68642xf11e6e15;
                ((sg0.u3) w1Var).getClass();
                gm0.j1.d().g(new su4.q1(str2, i17, str3, str3, 0, str3, 59, str4, str5));
                return;
            }
            su4.r1 r1Var = new su4.r1();
            r1Var.f494599f = 78;
            com.p314xaae8f345.mm.p2608xc9fa65a8.p2609x2eefaa.C21007x2f4a06dc c21007x2f4a06dc2 = this.f376778e;
            if (c21007x2f4a06dc2 == null || (str = c21007x2f4a06dc2.f274682d) == null) {
                str = "";
            }
            r1Var.f494595b = str;
            r1Var.f494597d = 256;
            r1Var.f494601h = 1;
            r1Var.f494596c = this.f376779f;
            r1Var.f494615v = this.f376781h;
            java.lang.String str6 = this.f376782i;
            r1Var.f494600g = str6;
            r1Var.f494618y = str6;
            ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).getClass();
            gm0.j1.d().g(new su4.n1(r1Var));
        }
    }

    public final boolean c() {
        com.p314xaae8f345.mm.p2608xc9fa65a8.p2609x2eefaa.C21007x2f4a06dc c21007x2f4a06dc = this.f376778e;
        if (c21007x2f4a06dc != null) {
            return c21007x2f4a06dc.a();
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).getClass();
            boolean z17 = m1Var instanceof su4.q1;
            java.util.LinkedList linkedList = this.f376784n;
            if (z17) {
                ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).getClass();
                java.lang.String str2 = ((su4.q1) m1Var).f494582o.f456462d;
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str2 == null) {
                    str2 = "";
                }
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
                    this.f376779f = jSONObject.optInt("offset", 0);
                    jSONObject.optInt("totalCount", 0);
                    this.f376783m = jSONObject.optBoolean("continueFlag", false);
                    java.lang.String optString = jSONObject.optString("searchID");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
                    this.f376782i = optString;
                    org.json.JSONArray optJSONArray = jSONObject.optJSONArray("items");
                    if ((!linkedList.isEmpty()) && ((ir.g) kz5.n0.i0(linkedList)).f375370c == 104) {
                        linkedList.remove(kz5.n0.i0(linkedList));
                    }
                    if (optJSONArray == null) {
                        optJSONArray = new org.json.JSONArray();
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SimilarEmoji", "similar get more emoji size:" + optJSONArray.length());
                    int length = optJSONArray.length();
                    for (int i19 = 0; i19 < length; i19++) {
                        org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i19);
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.k0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v5.class))).getClass();
                        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h2) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6.class))).wi("MicroMsg.SimilarEmoji", jSONObject2, c21053xdbf1e5f4);
                        linkedList.add(new ir.g(c21053xdbf1e5f4, 103, null, 0, 12, null));
                    }
                    if (this.f376783m) {
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.k0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v5.class))).getClass();
                        linkedList.add(new ir.g(new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4(), 104, null, 0, 12, null));
                    }
                } catch (java.lang.Exception unused) {
                }
            } else {
                ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).getClass();
                if (m1Var instanceof su4.n1) {
                    this.f376780g++;
                    ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).getClass();
                    try {
                        java.lang.String str3 = ((su4.n1) m1Var).f494547f.f451410f;
                        if (str3 == null) {
                            str3 = "{}";
                        }
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject(str3);
                        this.f376779f = jSONObject3.optInt("offset", 0);
                        this.f376783m = jSONObject3.optInt("continueFlag", 0) == 1;
                        java.lang.String optString2 = jSONObject3.optString("searchID", "");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString2, "optString(...)");
                        this.f376782i = optString2;
                        org.json.JSONObject optJSONObject = jSONObject3.optJSONArray(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306).optJSONObject(0);
                        optJSONObject.optInt("totalCount", 0);
                        org.json.JSONArray optJSONArray2 = optJSONObject.optJSONArray("items");
                        if ((!linkedList.isEmpty()) && ((ir.g) kz5.n0.i0(linkedList)).f375370c == 104) {
                            linkedList.removeLast();
                        }
                        if (optJSONArray2 == null) {
                            optJSONArray2 = new org.json.JSONArray();
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SimilarEmoji", "websearch get more emoji size:" + optJSONArray2.length());
                        int length2 = optJSONArray2.length();
                        for (int i27 = 0; i27 < length2; i27++) {
                            org.json.JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i27);
                            if (optJSONObject2 != null) {
                                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.k0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v5.class))).getClass();
                                com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f42 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
                                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h2) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6.class))).wi("MicroMsg.SimilarEmoji", optJSONObject2, c21053xdbf1e5f42);
                                java.lang.String optString3 = optJSONObject2.optString("docID", "");
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString3, "optString(...)");
                                linkedList.add(new ir.g(c21053xdbf1e5f42, 103, optString3, this.f376780g));
                            }
                        }
                        if (this.f376783m) {
                            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.k0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v5.class))).getClass();
                            linkedList.add(new ir.g(new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4(), 104, null, 0, 12, null));
                        }
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SimilarEmoji", e17, "resultObj", new java.lang.Object[0]);
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f376777d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i17, i18, str, m1Var);
        }
    }
}
