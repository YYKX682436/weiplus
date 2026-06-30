package ek2;

/* loaded from: classes3.dex */
public final class k extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f335015u;

    /* renamed from: v, reason: collision with root package name */
    public final ek2.j f335016v;

    /* renamed from: w, reason: collision with root package name */
    public final r45.ex0 f335017w;

    /* renamed from: x, reason: collision with root package name */
    public final org.json.JSONObject f335018x;

    /* renamed from: y, reason: collision with root package name */
    public final org.json.JSONObject f335019y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(long j17, java.lang.String finderUsername, long j18, java.lang.String nonceId, int i17, ek2.j callback) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f335015u = "Finder.CgiFinderCloseLive";
        this.f335016v = callback;
        r45.ex0 ex0Var = new r45.ex0();
        this.f335017w = ex0Var;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        this.f335018x = jSONObject;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        this.f335019y = jSONObject2;
        ex0Var.set(1, java.lang.Long.valueOf(j17));
        ex0Var.set(2, finderUsername);
        ex0Var.set(3, java.lang.Long.valueOf(j18));
        ex0Var.set(4, nonceId);
        ex0Var.set(5, java.lang.Integer.valueOf(i17));
        jSONObject2.put("liveId", j17);
        jSONObject2.put("objectId", j18);
        jSONObject.put(dm.i4.f66875xa013b0d5, ex0Var.m75945x2fec8307(2));
        jSONObject2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, i17);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = ex0Var;
        r45.fx0 fx0Var = new r45.fx0();
        fx0Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) fx0Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = fx0Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findercloselive";
        lVar.f152200d = uc1.g0.f76874x366c91de;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderCloseLive", "CgiFinderCloseLive init liveId:" + ex0Var.m75942xfb822ef2(1) + ", username:" + ex0Var.m75945x2fec8307(2) + ",objectId:" + ex0Var.m75942xfb822ef2(3) + ",nonceId:" + ex0Var.m75945x2fec8307(4) + ",scene:" + ex0Var.m75939xb282bd08(5));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.fx0 resp = (r45.fx0) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.lang.String str2 = "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread();
        java.lang.String str3 = this.f335015u;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, str2);
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "close live result:" + pm0.b0.g(resp));
        }
        fo3.s.INSTANCE.y1(this.f335017w.m75942xfb822ef2(1));
        dk2.a1 a1Var = (dk2.a1) this.f335016v;
        a1Var.getClass();
        yz5.s sVar = a1Var.f314700b;
        if (i17 == 0 && i18 == 0) {
            if (sVar != null) {
                sVar.v(java.lang.Boolean.TRUE, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), str == null ? "" : str, resp);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a1Var.f314699a.f315542d, "close live room failed");
            if (sVar != null) {
                sVar.v(java.lang.Boolean.FALSE, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), str == null ? "" : str, resp);
            }
        }
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return cz2.f.f306536e;
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject w() {
        return this.f335019y;
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject z() {
        return this.f335018x;
    }
}
