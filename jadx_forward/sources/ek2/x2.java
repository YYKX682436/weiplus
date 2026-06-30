package ek2;

/* loaded from: classes3.dex */
public final class x2 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f335096u;

    /* renamed from: v, reason: collision with root package name */
    public final ek2.w2 f335097v;

    /* renamed from: w, reason: collision with root package name */
    public final r45.of2 f335098w;

    /* renamed from: x, reason: collision with root package name */
    public final org.json.JSONObject f335099x;

    /* renamed from: y, reason: collision with root package name */
    public final org.json.JSONObject f335100y;

    public x2(long j17, long j18, java.lang.String str, ek2.w2 w2Var) {
        super(null, 1, null);
        this.f335096u = "Finder.CgiFinderManualCloseLive";
        this.f335097v = w2Var;
        r45.of2 of2Var = new r45.of2();
        this.f335098w = of2Var;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        this.f335099x = jSONObject;
        this.f335100y = new org.json.JSONObject();
        of2Var.set(1, java.lang.Long.valueOf(j17));
        of2Var.set(2, xy2.c.f(this.f97668n));
        of2Var.set(3, java.lang.Long.valueOf(j18));
        of2Var.set(4, str);
        jSONObject.put("liveId", j17);
        jSONObject.put(dm.i4.f66875xa013b0d5, of2Var.m75945x2fec8307(2));
        jSONObject.put("object_id", j18);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = of2Var;
        r45.pf2 pf2Var = new r45.pf2();
        pf2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) pf2Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = pf2Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findermanualcloselive";
        lVar.f152200d = 5857;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderManualCloseLive", "CgiFinderManualCloseLive init liveId:" + of2Var.m75942xfb822ef2(1) + ", objectId:" + of2Var.m75942xfb822ef2(3) + ", nonceId:" + of2Var.m75945x2fec8307(4) + ", finderUsername:" + of2Var.m75945x2fec8307(2));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.pf2 resp = (r45.pf2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.lang.String str2 = "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread();
        java.lang.String str3 = this.f335096u;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, str2);
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "close live result:" + pm0.b0.g(resp));
        }
        fo3.s.INSTANCE.y1(this.f335098w.m75942xfb822ef2(1));
        ek2.w2 w2Var = this.f335097v;
        if (w2Var != null) {
            dk2.z1 z1Var = (dk2.z1) w2Var;
            yz5.s sVar = z1Var.f315943b;
            if (i17 == 0 && i18 == 0) {
                if (sVar != null) {
                    sVar.v(java.lang.Boolean.TRUE, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), str == null ? "" : str, resp);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(z1Var.f315942a.f315542d, "manual close live room failed");
                if (sVar != null) {
                    sVar.v(java.lang.Boolean.FALSE, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), str == null ? "" : str, resp);
                }
            }
        }
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return cz2.f.f306536e;
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject w() {
        return this.f335100y;
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject z() {
        return this.f335099x;
    }
}
