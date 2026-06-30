package com.tencent.mm.modelbase;

/* loaded from: classes12.dex */
public class r2 extends o45.gg {

    /* renamed from: q, reason: collision with root package name */
    public static a25.s f70789q;

    /* renamed from: g, reason: collision with root package name */
    public final o45.zg f70792g;

    /* renamed from: h, reason: collision with root package name */
    public final int f70793h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f70794i;

    /* renamed from: n, reason: collision with root package name */
    public int f70796n = 0;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f70797o = null;

    /* renamed from: p, reason: collision with root package name */
    public int f70798p = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f70790e = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f70795m = 0;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f70791f = null;

    public r2(o45.zg zgVar, int i17) {
        this.f70792g = zgVar;
        this.f70793h = i17;
    }

    public static byte[][] e(long j17, com.tencent.mm.protobuf.f fVar, com.tencent.mm.protobuf.f fVar2) {
        byte[] bArr;
        byte[] bArr2;
        if (j17 == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RemoteReq", "summerauth toRsaAesByteArray autoauth uin is invalid!");
        }
        try {
            bArr = fVar.toByteArray();
        } catch (java.io.IOException e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RemoteReq", "summerauth toRsaAesByteArray reqToBuf rsaReqData toProtoBuf exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            bArr = null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.M0(bArr)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RemoteReq", "summerauth toRsaAesByteArray reqToBuf rsaReqDataBuf is null and ret false");
            return null;
        }
        try {
            bArr2 = fVar2.toByteArray();
        } catch (java.io.IOException e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RemoteReq", "summerauth toRsaAesByteArray reqToBuf aesReqData toProtoBuf exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e18));
            bArr2 = null;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.M0(bArr2)) {
            return new byte[][]{bArr, bArr2};
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.RemoteReq", "summerauth toRsaAesByteArray reqToBuf aesReqDataBuf is null and ret false");
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.modelbase.r2.D2(int, byte[], int, byte[], byte[], int, boolean):boolean");
    }

    @Override // o45.hg
    public void J6(byte[] bArr) {
        this.f70791f = bArr;
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.modelbase.r2.K6():byte[]");
    }

    @Override // o45.hg
    public void L8(byte[] bArr) {
        this.f70792g.setPassKey(bArr);
    }

    @Override // o45.hg
    public void U2(int i17) {
        if (i17 == 1 || i17 == 2) {
            this.f70790e = i17;
        } else {
            this.f70790e = 0;
        }
    }

    @Override // o45.hg
    public boolean V7() {
        return this.f70792g.useAxSession();
    }

    @Override // o45.hg
    public void a(int i17) {
        this.f70792g.setUin(i17);
    }

    @Override // o45.hg
    public boolean b3() {
        return this.f70792g.useECDH();
    }

    public void d(int i17) {
        if (!kx3.a.f313280a) {
            this.f70796n = i17;
            return;
        }
        int i18 = this.f70793h;
        if (i18 != 996 && i18 != 997) {
            switch (i18) {
            }
            this.f70796n = i17;
        }
        this.f70796n = 0;
        this.f70796n = i17;
    }

    @Override // o45.hg
    public long getECDHEngine() {
        return this.f70792g.getECDHEngine();
    }

    @Override // o45.hg
    public int getRouteInfo() {
        return this.f70798p;
    }

    @Override // o45.hg
    public int getUin() {
        return this.f70792g.getUin();
    }

    @Override // o45.hg
    public java.lang.String getUserName() {
        o45.zg zgVar = this.f70792g;
        int i17 = this.f70793h;
        if (i17 != 126) {
            if (i17 != 252) {
                if (i17 != 763) {
                    if (i17 != 877) {
                        if (i17 == 3941) {
                            return ((o45.og) zgVar).f342989b;
                        }
                        if (i17 != 701) {
                            if (i17 != 702) {
                                return "";
                            }
                        }
                    }
                }
                return ((o45.mg) zgVar).f342981c;
            }
            return ((o45.sg) zgVar).f343006b.f377838d.f378718f;
        }
        return ((o45.bi) zgVar).f342909a.f391405d;
    }

    @Override // o45.hg
    public boolean isAxAuth() {
        return this.f70792g.isAxAuth();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o45.hg
    public boolean isRawData() {
        o45.zg zgVar = this.f70792g;
        return zgVar instanceof o45.xg ? ((o45.xg) zgVar).isRawData() : zgVar.isRawData();
    }

    @Override // o45.hg
    public void li(boolean z17) {
        this.f70792g.setUseAxsession(z17);
    }

    @Override // o45.hg
    public byte[] p9() {
        return this.f70797o;
    }

    @Override // o45.hg
    public byte[] sa() {
        return this.f70794i;
    }

    @Override // o45.hg
    public byte[] y4() {
        try {
            java.lang.Object obj = this.f70792g;
            return obj instanceof o45.xg ? ((o45.xg) obj).toProtoBuf() : new byte[0];
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RemoteReq", "getProtoBuf exception: " + e17.getMessage());
            return new byte[0];
        }
    }

    @Override // o45.hg
    public void zb(byte[] bArr) {
        this.f70792g.setSessionKey(bArr);
    }
}
