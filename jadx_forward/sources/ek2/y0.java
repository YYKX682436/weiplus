package ek2;

/* loaded from: classes2.dex */
public final class y0 extends ek2.x {

    /* renamed from: t, reason: collision with root package name */
    public final zy2.k5 f335104t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f335105u;

    /* renamed from: v, reason: collision with root package name */
    public final org.json.JSONObject f335106v;

    /* renamed from: w, reason: collision with root package name */
    public final org.json.JSONObject f335107w;

    /* renamed from: x, reason: collision with root package name */
    public final r45.y61 f335108x;

    public /* synthetic */ y0(java.lang.String str, zy2.k5 k5Var, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? "" : str, (i17 & 2) != 0 ? null : k5Var);
    }

    @Override // az2.o, az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.nw1 m76794xd0557130;
        r45.z61 resp = (r45.z61) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        super.A(i17, i18, str, resp, m1Var);
        java.lang.String str2 = "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread();
        java.lang.String str3 = this.f335105u;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, str2);
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "GetLastObject result:" + pm0.b0.g(resp));
        }
        org.json.JSONObject jSONObject = this.f335106v;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) resp.m75936x14adae67(1);
        jSONObject.put("liveId", (c19792x256d2725 == null || (m76794xd0557130 = c19792x256d2725.m76794xd0557130()) == null) ? null : java.lang.Long.valueOf(m76794xd0557130.m75942xfb822ef2(0)));
        zy2.k5 k5Var = this.f335104t;
        if (k5Var != null) {
            k5Var.a(i17, i18, str, resp);
        }
    }

    @Override // az2.o
    public java.util.List C(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        r45.z61 resp = (r45.z61) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) resp.m75936x14adae67(1);
        return c19792x256d2725 != null ? kz5.b0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, 0)) : kz5.p0.f395529d;
    }

    @Override // az2.o
    public long D() {
        r45.kv0 kv0Var = (r45.kv0) this.f335108x.m75936x14adae67(1);
        if (kv0Var != null) {
            return kv0Var.m75942xfb822ef2(5);
        }
        return 0L;
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject w() {
        return this.f335107w;
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject z() {
        return this.f335106v;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(java.lang.String username, zy2.k5 k5Var) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        this.f335104t = k5Var;
        this.f335105u = "Finder.CgiFinderLiveGetLastObject";
        this.f335106v = new org.json.JSONObject();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        this.f335107w = jSONObject;
        r45.y61 y61Var = new r45.y61();
        this.f335108x = y61Var;
        y61Var.set(2, username);
        y61Var.set(1, db2.t4.f309704a.a(6482));
        y61Var.set(5, zl2.q4.d(zl2.q4.f555466a, null, null, 3, null));
        jSONObject.put(dm.i4.f66875xa013b0d5, username);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = y61Var;
        r45.z61 z61Var = new r45.z61();
        z61Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) z61Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = z61Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetlatestliveobject";
        lVar.f152200d = 6482;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveGetLastObject", "CgiFinderLiveGetLastObject init username:" + y61Var.m75945x2fec8307(2));
    }
}
