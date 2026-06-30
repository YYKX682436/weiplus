package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes12.dex */
public class r2 extends o45.gg {

    /* renamed from: q, reason: collision with root package name */
    public static a25.s f152322q;

    /* renamed from: g, reason: collision with root package name */
    public final o45.zg f152325g;

    /* renamed from: h, reason: collision with root package name */
    public final int f152326h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f152327i;

    /* renamed from: n, reason: collision with root package name */
    public int f152329n = 0;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f152330o = null;

    /* renamed from: p, reason: collision with root package name */
    public int f152331p = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f152323e = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f152328m = 0;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f152324f = null;

    public r2(o45.zg zgVar, int i17) {
        this.f152325g = zgVar;
        this.f152326h = i17;
    }

    public static byte[][] e(long j17, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2) {
        byte[] bArr;
        byte[] bArr2;
        if (j17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RemoteReq", "summerauth toRsaAesByteArray autoauth uin is invalid!");
        }
        try {
            bArr = fVar.mo14344x5f01b1f6();
        } catch (java.io.IOException e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemoteReq", "summerauth toRsaAesByteArray reqToBuf rsaReqData toProtoBuf exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            bArr = null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemoteReq", "summerauth toRsaAesByteArray reqToBuf rsaReqDataBuf is null and ret false");
            return null;
        }
        try {
            bArr2 = fVar2.mo14344x5f01b1f6();
        } catch (java.io.IOException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemoteReq", "summerauth toRsaAesByteArray reqToBuf aesReqData toProtoBuf exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e18));
            bArr2 = null;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr2)) {
            return new byte[][]{bArr, bArr2};
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemoteReq", "summerauth toRsaAesByteArray reqToBuf aesReqDataBuf is null and ret false");
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:26|27|(3:316|317|(2:321|(6:323|324|325|326|327|328)))|29|(8:30|31|(1:33)(1:313)|34|35|(3:170|171|(18:173|174|176|(3:203|204|(1:206)(2:207|(3:(1:210)(1:216)|211|(2:213|214)(1:215))(21:217|(1:303)(1:221)|222|223|(6:291|292|293|294|295|296)(1:225)|226|227|(1:229)(1:288)|230|231|(3:233|(2:235|(1:237)(1:266))(1:267)|238)(2:268|(9:270|271|272|273|(1:275)(1:283)|276|(1:278)(1:282)|279|280)(1:287))|239|240|241|242|243|244|245|(4:247|248|249|(1:251)(1:254))(1:256)|252|253)))|178|179|180|181|182|183|184|(1:186)(1:197)|187|(1:189)(1:196)|190|(1:192)|193|194))|37|38)|(5:(3:41|(5:43|(1:45)(1:51)|46|(1:48)|(1:50))|52)|54|(5:132|133|(3:157|158|(1:160))|135|(1:137)(3:138|(7:140|141|142|143|144|145|(1:147))(2:154|(1:156))|148))(5:56|(7:(1:59)(1:77)|60|61|62|63|64|(2:66|67)(1:69))(16:78|79|(3:117|118|(1:127)(4:122|123|124|125))(1:81)|(1:83)|84|(1:116)(1:88)|89|(1:91)(1:115)|92|(5:94|(1:96)(1:113)|97|(1:99)(1:112)|100)(1:114)|101|102|103|104|(1:106)|107)|71|72|73)|108|109)(1:168)|53|54|(0)(0)|108|109) */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x06e9, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x058e A[Catch: Exception -> 0x06e9, TRY_LEAVE, TryCatch #6 {Exception -> 0x06e9, blocks: (B:145:0x0531, B:147:0x0537, B:148:0x057b, B:154:0x0542, B:156:0x0576, B:56:0x058e), top: B:54:0x04e0 }] */
    /* JADX WARN: Type inference failed for: r10v0, types: [o45.zg] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    @Override // o45.hg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean D2(int r50, byte[] r51, int r52, byte[] r53, byte[] r54, int r55, boolean r56) {
        /*
            Method dump skipped, instructions count: 1827
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p944x882e457a.r2.D2(int, byte[], int, byte[], byte[], int, boolean):boolean");
    }

    @Override // o45.hg
    public void J6(byte[] bArr) {
        this.f152324f = bArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0019. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad A[RETURN] */
    @Override // o45.hg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] K6() {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p944x882e457a.r2.K6():byte[]");
    }

    @Override // o45.hg
    public void L8(byte[] bArr) {
        this.f152325g.m150625x820885cc(bArr);
    }

    @Override // o45.hg
    public void U2(int i17) {
        if (i17 == 1 || i17 == 2) {
            this.f152323e = i17;
        } else {
            this.f152323e = 0;
        }
    }

    @Override // o45.hg
    public boolean V7() {
        return this.f152325g.m150634xf85cd498();
    }

    @Override // o45.hg
    public void a(int i17) {
        this.f152325g.mo150593xca029c98(i17);
    }

    @Override // o45.hg
    public boolean b3() {
        return this.f152325g.m150635xf7260ba9();
    }

    public void d(int i17) {
        if (!kx3.a.f394813a) {
            this.f152329n = i17;
            return;
        }
        int i18 = this.f152326h;
        if (i18 != 996 && i18 != 997) {
            switch (i18) {
            }
            this.f152329n = i17;
        }
        this.f152329n = 0;
        this.f152329n = i17;
    }

    @Override // o45.hg
    /* renamed from: getECDHEngine */
    public long mo48038x11b0e25a() {
        return this.f152325g.m150610x11b0e25a();
    }

    @Override // o45.hg
    /* renamed from: getRouteInfo */
    public int mo48039x966afe1() {
        return this.f152331p;
    }

    @Override // o45.hg
    /* renamed from: getUin */
    public int mo48040xb5887524() {
        return this.f152325g.m150617xb5887524();
    }

    @Override // o45.hg
    /* renamed from: getUserName */
    public java.lang.String mo48041x6bf53a6c() {
        o45.zg zgVar = this.f152325g;
        int i17 = this.f152326h;
        if (i17 != 126) {
            if (i17 != 252) {
                if (i17 != 763) {
                    if (i17 != 877) {
                        if (i17 == 3941) {
                            return ((o45.og) zgVar).f424522b;
                        }
                        if (i17 != 701) {
                            if (i17 != 702) {
                                return "";
                            }
                        }
                    }
                }
                return ((o45.mg) zgVar).f424514c;
            }
            return ((o45.sg) zgVar).f424539b.f459371d.f460251f;
        }
        return ((o45.bi) zgVar).f424442a.f472938d;
    }

    @Override // o45.hg
    /* renamed from: isAxAuth */
    public boolean mo48042xd46d5c49() {
        return this.f152325g.mo150600xd46d5c49();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o45.hg
    /* renamed from: isRawData */
    public boolean mo48043x182b0f68() {
        o45.zg zgVar = this.f152325g;
        return zgVar instanceof o45.xg ? ((o45.xg) zgVar).mo150591x182b0f68() : zgVar.mo150591x182b0f68();
    }

    @Override // o45.hg
    public void li(boolean z17) {
        this.f152325g.m150632x2c5fca3a(z17);
    }

    @Override // o45.hg
    public byte[] p9() {
        return this.f152330o;
    }

    @Override // o45.hg
    public byte[] sa() {
        return this.f152327i;
    }

    @Override // o45.hg
    public byte[] y4() {
        try {
            java.lang.Object obj = this.f152325g;
            return obj instanceof o45.xg ? ((o45.xg) obj).mo13852xc3d7db06() : new byte[0];
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemoteReq", "getProtoBuf exception: " + e17.getMessage());
            return new byte[0];
        }
    }

    @Override // o45.hg
    public void zb(byte[] bArr) {
        this.f152325g.m150630x7f7299eb(bArr);
    }
}
