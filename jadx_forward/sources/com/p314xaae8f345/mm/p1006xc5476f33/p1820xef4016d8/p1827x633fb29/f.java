package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes2.dex */
public final class f extends com.p314xaae8f345.mm.p944x882e457a.i {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f226798m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f226799n;

    public f(java.lang.String str, java.lang.String str2) {
        this.f226798m = "";
        this.f226799n = "";
        r45.dg3 dg3Var = new r45.dg3();
        r45.eg3 eg3Var = new r45.eg3();
        this.f226799n = str;
        dg3Var.f453948d = str;
        this.f226798m = str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.cgiGetLuckymoneyFullCoverInfo", "[param] packet_id： " + str + " , mSendId: " + str2);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = dg3Var;
        lVar.f152198b = eg3Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/getfullcoverinfo";
        lVar.f152200d = 13952;
        p(lVar.a());
    }
}
