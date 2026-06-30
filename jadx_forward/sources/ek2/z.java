package ek2;

/* loaded from: classes3.dex */
public final class z extends ek2.g0 {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f335110z = 0;

    /* renamed from: u, reason: collision with root package name */
    public final yz5.p f335111u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f335112v;

    /* renamed from: w, reason: collision with root package name */
    public final org.json.JSONObject f335113w;

    /* renamed from: x, reason: collision with root package name */
    public final org.json.JSONObject f335114x;

    /* renamed from: y, reason: collision with root package name */
    public final r45.c81 f335115y;

    public /* synthetic */ z(long j17, long j18, java.lang.String str, java.lang.String str2, int i17, byte[] bArr, int i18, int i19, java.lang.Integer num, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, yz5.p pVar, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(j17, j18, str, str2, i17, bArr, i18, i19, (i27 & 256) != 0 ? null : num, (i27 & 512) != 0 ? null : gVar, (i27 & 1024) != 0 ? null : pVar);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.d81 resp = (r45.d81) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onCgiBack] scene:");
        r45.c81 c81Var = this.f335115y;
        sb6.append(c81Var.m75939xb282bd08(7));
        sb6.append(",errType=");
        sb6.append(i17);
        sb6.append(" errCode=");
        sb6.append(i18);
        sb6.append(" errMsg=");
        sb6.append(str);
        sb6.append(" thread=");
        sb6.append(java.lang.Thread.currentThread());
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = this.f335112v;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb7);
        if (i17 != 0 || i18 != 0) {
            yz5.p pVar = this.f335111u;
            if (pVar != null) {
                pVar.mo149xb9724478(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "resp = " + pm0.b0.g(resp));
        ek2.k3 k3Var = ek2.k3.f335025a;
        int m75939xb282bd08 = c81Var.m75939xb282bd08(12);
        int m75939xb282bd082 = c81Var.m75939xb282bd08(11);
        int m75939xb282bd083 = c81Var.m75939xb282bd08(7);
        yz5.p pVar2 = this.f335111u;
        je2.t tVar = (je2.t) dk2.ef.f314905a.i(je2.t.class);
        if (tVar != null) {
            tVar.f380798h = true;
        }
        dk2.u7 u7Var = dk2.u7.f315714a;
        dk2.u7.f315727n = (r45.aw1) resp.m75936x14adae67(5);
        dk2.u7.f315728o = (r45.zo0) resp.m75936x14adae67(8);
        dk2.u7.f315729p = (r45.wi6) resp.m75936x14adae67(9);
        ((ku5.f) ek2.k3.f335026b).execute(new ek2.i3(resp, m75939xb282bd08, m75939xb282bd082, m75939xb282bd083, pVar2, i17, i18));
    }

    @Override // az2.j
    public java.util.List s() {
        r45.c81 c81Var = this.f335115y;
        return kz5.c0.i(new jz5.l("pull_scene", java.lang.String.valueOf(c81Var.m75939xb282bd08(11))), new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.String.valueOf(c81Var.m75939xb282bd08(7))));
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return cz2.f.f306536e;
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject w() {
        return this.f335114x;
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject z() {
        return this.f335113w;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(long j17, long j18, java.lang.String objectNonceId, java.lang.String str, int i17, byte[] bArr, int i18, int i19, java.lang.Integer num, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, yz5.p pVar) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectNonceId, "objectNonceId");
        this.f335111u = pVar;
        this.f335112v = "Finder.CgiFinderGetLiveGiftList";
        this.f335113w = new org.json.JSONObject();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        this.f335114x = jSONObject;
        r45.c81 c81Var = new r45.c81();
        this.f335115y = c81Var;
        c81Var.set(1, db2.t4.f309704a.a(4053));
        c81Var.set(2, java.lang.Long.valueOf(j17));
        c81Var.set(3, java.lang.Long.valueOf(j18));
        c81Var.set(4, objectNonceId);
        c81Var.set(5, str);
        dk2.ef efVar = dk2.ef.f314905a;
        c81Var.set(6, dk2.ef.N);
        c81Var.set(7, java.lang.Integer.valueOf(i17));
        c81Var.set(8, bArr != null ? com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr) : null);
        c81Var.set(9, xy2.c.f(this.f97668n));
        c81Var.set(10, java.lang.Integer.valueOf(i18));
        c81Var.set(11, java.lang.Integer.valueOf(i19));
        if (num != null && num.intValue() > 0) {
            c81Var.set(12, java.lang.Integer.valueOf(num.intValue()));
            c81Var.set(6, gVar);
        }
        jSONObject.put("liveId", j17);
        jSONObject.put("objectId", j18);
        jSONObject.put(dm.i4.f66875xa013b0d5, str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderGetLiveGiftList", "liveId:" + j17 + " pull_scene:" + i19 + " objectId:" + j18 + " objectNonceId:" + objectNonceId + " username:" + str + ",scene:" + c81Var.m75939xb282bd08(7));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = c81Var;
        r45.d81 d81Var = new r45.d81();
        d81Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) d81Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = d81Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetliverewardgiftlist";
        lVar.f152200d = 4053;
        p(lVar.a());
    }
}
