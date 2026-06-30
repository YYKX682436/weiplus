package ek2;

/* loaded from: classes.dex */
public final class m extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final ek2.l f335031u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f335032v;

    /* renamed from: w, reason: collision with root package name */
    public final org.json.JSONObject f335033w;

    /* renamed from: x, reason: collision with root package name */
    public final org.json.JSONObject f335034x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(long j17, long j18, java.lang.String str, byte[] bArr, int i17, r45.ch1 msg, ek2.l lVar) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        this.f335031u = lVar;
        this.f335032v = "Finder.CgiFinderCloseLiveMic";
        this.f335033w = new org.json.JSONObject();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        this.f335034x = jSONObject;
        r45.sn1 sn1Var = new r45.sn1();
        sn1Var.set(4, java.lang.Long.valueOf(j17));
        sn1Var.set(1, db2.t4.f309704a.a(4142));
        sn1Var.set(5, java.lang.Long.valueOf(j18));
        sn1Var.set(6, str);
        sn1Var.set(8, xy2.c.f(this.f97668n));
        sn1Var.set(7, java.lang.Integer.valueOf(i17));
        sn1Var.set(2, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr));
        sn1Var.set(3, msg);
        jSONObject.put("liveId", j17);
        jSONObject.put("objectId", j18);
        jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, sn1Var.m75939xb282bd08(7));
        jSONObject.put(dm.i4.f66875xa013b0d5, sn1Var.m75945x2fec8307(8));
        com.p314xaae8f345.mm.p944x882e457a.l lVar2 = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar2.f152197a = sn1Var;
        r45.tn1 tn1Var = new r45.tn1();
        tn1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) tn1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar2.f152198b = tn1Var;
        lVar2.f152199c = "/cgi-bin/micromsg-bin/finderliveclosemicwithaudience";
        lVar2.f152200d = 4142;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar2.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderCloseLiveMic", "liveId:" + sn1Var.m75942xfb822ef2(4) + " objectId:" + sn1Var.m75942xfb822ef2(5) + " objectNonceId:" + sn1Var.m75945x2fec8307(6) + " scene:" + sn1Var.m75939xb282bd08(7));
        p(a17);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.tn1 resp = (r45.tn1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f335032v, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        ek2.l lVar = this.f335031u;
        if (lVar != null) {
            lVar.a(i17, i18, str, resp);
        }
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return cz2.f.f306536e;
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject w() {
        return this.f335034x;
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject z() {
        return this.f335033w;
    }
}
