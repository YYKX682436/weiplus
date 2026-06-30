package yc1;

/* loaded from: classes7.dex */
public class o implements mf1.h {

    /* renamed from: a, reason: collision with root package name */
    public boolean f542329a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f542330b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f542331c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f542332d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yc1.q f542333e;

    public o(yc1.q qVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str, boolean z17) {
        this.f542333e = qVar;
        this.f542330b = lVar;
        this.f542331c = str;
        this.f542332d = z17;
    }

    public void a(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37;
        uh1.n0 n0Var = yc1.q.f542334p;
        if (n0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f542330b;
            java.lang.String str2 = this.f542331c;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.eg) n0Var).getClass();
            u81.f fVar = (u81.f) ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.fg.f162550a).get(str2);
            if (fVar != null && (t37 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) lVar).t3()) != null) {
                t37.N.c(fVar);
            }
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        int ordinal = this.f542330b.mo48799xc0ccc466().ordinal();
        if (ordinal == 2 || ordinal == 3) {
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562, "interrupted");
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562, str);
        }
        hashMap.put("code", java.lang.Integer.valueOf(i17));
        hashMap.put("socketTaskId", this.f542331c);
        hashMap.put("state", "close");
        java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
        yc1.p pVar = new yc1.p();
        pVar.p(this.f542330b);
        pVar.r(jSONObject);
        pVar.n(this.f542333e.f542294g.a(this.f542331c));
        this.f542333e.f542294g.b(this.f542331c);
    }

    public void b(java.lang.String str) {
        this.f542333e.D(this.f542330b, this.f542331c, str);
    }

    public void c(java.lang.String str) {
        if (this.f542329a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCreateSocketTask", "onSocketError is true");
            return;
        }
        this.f542329a = true;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str2 = this.f542331c;
        hashMap.put("socketTaskId", str2);
        hashMap.put("state", "error");
        hashMap.put("errMsg", str);
        java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
        yc1.p pVar = new yc1.p();
        pVar.p(this.f542330b);
        pVar.r(jSONObject);
        yc1.q qVar = this.f542333e;
        pVar.n(qVar.f542294g.a(str2));
        qVar.f542294g.b(str2);
        if (qVar.f542337m || qVar.f542338n) {
            ((ch1.c) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a.class, true))).c(972L, 2L, 1L, false);
        } else {
            ((ch1.c) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a.class, true))).c(972L, 1L, 1L, false);
        }
    }

    public void d(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.w3.a(str));
        hashMap.put("isBuffer", java.lang.Boolean.FALSE);
        java.lang.String str2 = this.f542331c;
        hashMap.put("socketTaskId", str2);
        hashMap.put("state", com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);
        java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
        yc1.p pVar = new yc1.p();
        pVar.p(this.f542330b);
        pVar.r(jSONObject);
        pVar.n(this.f542333e.f542294g.a(str2));
    }

    public void e(java.nio.ByteBuffer byteBuffer) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str = this.f542331c;
        hashMap.put("socketTaskId", str);
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, byteBuffer);
        hashMap.put("isBuffer", java.lang.Boolean.TRUE);
        hashMap.put("state", com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f542330b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.u3 d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.d(lVar.mo50357xcd94f799(), hashMap, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3) lVar.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3.class));
        if (d17 != com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.u3.OK) {
            if (d17 == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.u3.FAIL_SIZE_EXCEED_LIMIT) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.b(lVar, yc1.p.f77526x24728b);
            }
        } else {
            java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
            yc1.p pVar = new yc1.p();
            pVar.p(lVar);
            pVar.r(jSONObject);
            pVar.n(this.f542333e.f542294g.a(str));
        }
    }

    public void f(xk1.g gVar, java.util.Map map) {
        uh1.n0 n0Var = yc1.q.f542334p;
        if (n0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f542330b;
            java.lang.String str = this.f542331c;
            yc1.q qVar = this.f542333e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.eg egVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.eg) n0Var;
            egVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.dg dgVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.dg(egVar, lVar, str, qVar);
            ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.fg.f162550a).put(str, dgVar);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) lVar).t3().N.a(dgVar);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("socketTaskId", this.f542331c);
        hashMap.put("state", "open");
        hashMap.put("header", yc1.q.C(this.f542333e, gVar));
        if (map != null && map.size() > 0 && this.f542332d) {
            hashMap.put(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, map);
        }
        java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
        yc1.p pVar = new yc1.p();
        pVar.p(this.f542330b);
        pVar.r(jSONObject);
        pVar.n(this.f542333e.f542294g.a(this.f542331c));
    }

    public void g(xk1.a aVar) {
        if (aVar == null || !((uh1.a) this.f542330b.b(uh1.a.class)).F) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5164x497885b6 c5164x497885b6 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5164x497885b6();
        am.u uVar = c5164x497885b6.f135514g;
        uVar.f89578a = "socket";
        uVar.f89580c = yc1.q.C(this.f542333e, aVar);
        uVar.f89579b = this.f542331c;
        c5164x497885b6.e();
    }
}
