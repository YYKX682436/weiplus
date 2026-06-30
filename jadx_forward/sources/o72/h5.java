package o72;

/* loaded from: classes12.dex */
public class h5 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f424877d;

    /* renamed from: f, reason: collision with root package name */
    public final o72.r2 f424879f;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f424878e = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f424880g = true;

    public h5(o72.r2 r2Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.NetSceneAddFav", "NetSceneAddFavItem %s", java.lang.Long.valueOf(r2Var.f67645x88be67a1));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.e4();
        lVar.f152198b = new r45.f4();
        lVar.f152199c = "/cgi-bin/micromsg-bin/addfavitem";
        lVar.f152200d = 401;
        lVar.f152201e = 193;
        lVar.f152202f = 1000000193;
        this.f424877d = lVar.a();
        this.f424879f = r2Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        java.lang.String str;
        o72.r2 r2Var = this.f424879f;
        java.lang.String f17 = o72.s2.f(r2Var.f67645x88be67a1);
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f424877d;
        r45.e4 e4Var = (r45.e4) oVar.f152243a.f152217a;
        e4Var.f454526d = c01.y1.a(r2Var.f67660x4b6e9352, java.lang.System.currentTimeMillis());
        e4Var.f454527e = r2Var.f67657x2262335f;
        e4Var.f454528f = r2Var.f67651x76e81a5a;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r2Var.f67656xf4031e77)) {
            e4Var.f454531i = r2Var.f67656xf4031e77;
        }
        r2Var.f67660x4b6e9352 = o72.r2.G0(r2Var);
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().mo9952xce0038c9(r2Var, dm.i4.f66867x2a5c95c7);
        e4Var.f454530h = r2Var.f67660x4b6e9352;
        e4Var.f454529g = r2Var.f67650x85d9e03b;
        r2Var.w0("MicroMsg.Fav.NetSceneAddFav", o72.r2.G1);
        this.f424878e = u0Var;
        e4Var.f454532m = r2Var.f67652x5334f55;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.NetSceneAddFav", "ADD FavItem, sourceId:%s localId:%d favId:%d transferCtx:%s ext:%s xml:%s targetID:%d type = %d subType = %d", r2Var.f67650x85d9e03b, java.lang.Long.valueOf(r2Var.f67645x88be67a1), java.lang.Integer.valueOf(r2Var.f67643xc8a07680), r2Var.f67656xf4031e77, r2Var.f67639x4b6e4d5c, r2Var.f67660x4b6e9352, java.lang.Integer.valueOf(r2Var.f67654x36b6411), java.lang.Integer.valueOf(r2Var.f67657x2262335f), java.lang.Integer.valueOf(r2Var.f67652x5334f55));
        java.lang.String str2 = "RecordInfo update, add cgi, sendingInfo.field_xml:" + r2Var.f67660x4b6e9352;
        if (str2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.NetSceneAddFav", "null");
        } else if (str2.length() <= 2000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.NetSceneAddFav", str2);
        } else {
            int i17 = 0;
            int i18 = 1;
            while (i17 < str2.length()) {
                int min = java.lang.Math.min(i17 + 2000, str2.length());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.NetSceneAddFav", "[LogLong Part " + i18 + "] " + str2.substring(i17, min));
                i18++;
                i17 = min;
            }
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(e4Var.f454527e);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(e4Var.f454528f);
        java.lang.String str3 = e4Var.f454529g;
        java.lang.String str4 = e4Var.f454530h;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            str = "xmlLen=0";
        } else {
            str = "xmlLen=" + str4.length();
        }
        o72.s2.g("MicroMsg.Fav.NetSceneAddFav", f17, "AddFavItem Request params: type=%d, sourceType=%d, sourceId=%s, %s, subType=%d, localId=%d", valueOf, valueOf2, str3, str, java.lang.Integer.valueOf(e4Var.f454532m), java.lang.Long.valueOf(r2Var.f67645x88be67a1));
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 401;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x047a  */
    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo804x5f9cdc6f(int r26, int r27, int r28, java.lang.String r29, com.p314xaae8f345.mm.p971x6de15a2e.v0 r30, byte[] r31) {
        /*
            Method dump skipped, instructions count: 1175
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o72.h5.mo804x5f9cdc6f(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }
}
