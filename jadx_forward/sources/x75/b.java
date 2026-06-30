package x75;

/* loaded from: classes.dex */
public final class b implements com.p314xaae8f345.mm.p944x882e457a.u0, x75.a {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f533991d;

    /* renamed from: e, reason: collision with root package name */
    public long f533992e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f533993f;

    /* renamed from: g, reason: collision with root package name */
    public int f533994g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f533995h = "Similar" + java.lang.System.currentTimeMillis();

    /* renamed from: i, reason: collision with root package name */
    public boolean f533996i = true;

    public void a(com.p314xaae8f345.mm.p2608xc9fa65a8.p2609x2eefaa.C21007x2f4a06dc model, com.p314xaae8f345.mm.p944x882e457a.u0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(model, "model");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SimilarEmoji", "do net request:[" + model + ']');
        this.f533991d = callback;
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb Ni = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5.class))).Ni(model.f274683e);
        tg0.w1 w1Var = (tg0.w1) i95.n0.c(tg0.w1.class);
        java.lang.String str = model.f274683e;
        int i17 = this.f533994g;
        java.lang.String str2 = this.f533995h;
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) Ni;
        java.lang.String str3 = c21053xdbf1e5f4.f68654xf47770e7;
        java.lang.String str4 = c21053xdbf1e5f4.f68642xf11e6e15;
        ((sg0.u3) w1Var).getClass();
        gm0.j1.d().g(new su4.q1(str, i17, str2, str2, 0, str2, 59, str3, str4));
        this.f533992e = java.lang.System.currentTimeMillis();
        this.f533993f = true;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (java.lang.System.currentTimeMillis() - this.f533992e <= com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d) {
            int m40062x608a19a0 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40062x608a19a0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            if (m40062x608a19a0 == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1257L, 109L);
            } else if (m40062x608a19a0 == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1257L, 100L);
            } else if (m40062x608a19a0 == 3) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1257L, 103L);
            } else if (m40062x608a19a0 == 4) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1257L, 106L);
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f533992e;
            int m40062x608a19a02 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40062x608a19a0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            if (m40062x608a19a02 == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1257L, 110L, currentTimeMillis);
            } else if (m40062x608a19a02 == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1257L, 101L, currentTimeMillis);
            } else if (m40062x608a19a02 == 3) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1257L, 104L, currentTimeMillis);
            } else if (m40062x608a19a02 == 4) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1257L, 107L, currentTimeMillis);
            }
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f533991d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i17, i18, str, m1Var);
        }
        if (i17 == 0 && i18 == 0) {
            ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).getClass();
            if (m1Var instanceof su4.q1) {
                ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).getClass();
                java.lang.String str2 = ((su4.q1) m1Var).f494582o.f456462d;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str2 == null) {
                    str2 = "";
                }
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
                    this.f533994g = jSONObject.optInt("offset", 0);
                    this.f533996i = jSONObject.optBoolean("continueFlag", false);
                    java.lang.String optString = jSONObject.optString("searchID");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
                    this.f533995h = optString;
                } catch (java.lang.Exception unused) {
                }
            }
        }
        this.f533993f = false;
    }
}
