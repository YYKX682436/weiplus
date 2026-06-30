package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c;

/* loaded from: classes7.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f162609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 f162610e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f162611f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f162612g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l f162613h;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 c0Var, org.json.JSONObject jSONObject, int i17) {
        this.f162613h = lVar;
        this.f162609d = lVar2;
        this.f162610e = c0Var;
        this.f162611f = jSONObject;
        this.f162612g = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 c0Var = this.f162610e;
        int i17 = this.f162612g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l lVar = this.f162613h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar2 = this.f162609d;
        if (lVar2.mo50262x39e05d35()) {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0 a17 = lVar.f162623g.a(lVar2, c0Var, this.f162611f);
                if (c0Var.p()) {
                    lVar2.a(i17, lVar.v(lVar2, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t) c0Var, a17.f162853b, a17.f162852a));
                } else {
                    lVar2.a(i17, lVar.w(lVar2, a17.f162853b, a17.f162852a));
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Luggage.BaseNFSApiAsync", th6, "%s.invoke, appId=%s, callbackId=%d", lVar.f162623g.getClass().getName(), lVar2.mo48798x74292566(), java.lang.Integer.valueOf(i17));
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.j(this, th6));
                lVar2.a(i17, lVar.o("fail:internal error"));
            }
        }
    }
}
