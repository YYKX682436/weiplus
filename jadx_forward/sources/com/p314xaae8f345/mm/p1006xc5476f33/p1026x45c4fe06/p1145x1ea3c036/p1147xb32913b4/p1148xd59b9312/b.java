package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312;

/* loaded from: classes2.dex */
public final class b extends com.p314xaae8f345.mm.p944x882e457a.i {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f167105m;

    /* renamed from: n, reason: collision with root package name */
    public final int f167106n;

    public b(java.lang.String str, int i17, java.lang.String str2, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f167105m = str;
        this.f167106n = i17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.xe7 xe7Var = new r45.xe7();
        xe7Var.f471574d = i17;
        xe7Var.f471575e = str2 == null ? null : com.p314xaae8f345.mm.p2495xc50a8b8b.g.c(str2);
        xe7Var.f471576f = str;
        lVar.f152197a = xe7Var;
        lVar.f152198b = new r45.ye7();
        lVar.f152200d = 2889;
        lVar.f152199c = "/cgi-bin/mmbiz-bin/wxaruntime/updatedeeplinkinfo";
        p(lVar.a());
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiRuntimeUpdateDeepLinkInfo", "onCgiBack errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + ", cgiHash[" + hashCode() + ']');
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    public pq5.g l() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiRuntimeUpdateDeepLinkInfo", "run() ticket:" + this.f167105m + " status:" + this.f167106n + ", cgiHash[" + hashCode() + ']');
        pq5.g l17 = super.l();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "run(...)");
        return l17;
    }
}
