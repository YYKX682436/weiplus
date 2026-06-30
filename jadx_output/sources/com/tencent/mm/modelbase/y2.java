package com.tencent.mm.modelbase;

/* loaded from: classes12.dex */
public class y2 extends o45.ig {

    /* renamed from: h, reason: collision with root package name */
    public static com.tencent.mm.modelbase.x2 f70840h;

    /* renamed from: i, reason: collision with root package name */
    public static final char[] f70841i = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: e, reason: collision with root package name */
    public final o45.ah f70842e;

    /* renamed from: f, reason: collision with root package name */
    public final int f70843f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f70844g;

    public y2(o45.ah ahVar, int i17) {
        this.f70842e = ahVar;
        this.f70843f = i17;
    }

    public static byte[] d(int i17, byte[] bArr, byte[] bArr2, com.tencent.mm.pointers.PInt pInt, r45.js5 js5Var) {
        com.tencent.mm.pointers.PByteArray pByteArray = new com.tencent.mm.pointers.PByteArray();
        pInt.value = -1;
        com.tencent.mm.pointers.PByteArray pByteArray2 = new com.tencent.mm.pointers.PByteArray();
        com.tencent.mm.pointers.PInt pInt2 = new com.tencent.mm.pointers.PInt(0);
        com.tencent.mm.pointers.PInt pInt3 = new com.tencent.mm.pointers.PInt(0);
        com.tencent.mm.pointers.PInt pInt4 = new com.tencent.mm.pointers.PInt(255);
        try {
            boolean unpack = com.tencent.mm.protocal.MMProtocalJni.unpack(pByteArray2, bArr, bArr2, pByteArray, pInt, pInt2, pInt3, pInt4, new com.tencent.mm.pointers.PInt(0), new com.tencent.mm.pointers.PInt(0), new com.tencent.mm.pointers.PInt(0));
            com.tencent.mars.xlog.Log.i("MicroMsg.RemoteResp", "bufToRespNoRSA unpack ret[%b], noticeid[%d], headExtFlags[%d]", java.lang.Boolean.valueOf(unpack), java.lang.Integer.valueOf(pInt3.value), java.lang.Integer.valueOf(pInt4.value));
            if (pInt3.value != 0) {
                com.tencent.mm.autogen.events.GetDisasterInfoEvent getDisasterInfoEvent = new com.tencent.mm.autogen.events.GetDisasterInfoEvent();
                getDisasterInfoEvent.f54390g.f7808a = pInt3.value;
                com.tencent.mars.xlog.Log.i("MicroMsg.RemoteResp", "summerdiz bufToRespNoRSA publish GetDisasterInfoEvent noticeid[%d] publish[%b]", java.lang.Integer.valueOf(pInt3.value), java.lang.Boolean.valueOf(getDisasterInfoEvent.e()));
            }
            if (unpack) {
                int i18 = pInt.value;
                if (i18 == -13 || i18 == -102 || i18 == -3001) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.RemoteResp", "unpack failed. error:%d", java.lang.Integer.valueOf(i18));
                    return null;
                }
                if (i18 != -3002) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.RemoteResp", "wifi bufToRespNoRSA using protobuf ok jtype:%d enType:%d ", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(pInt2.value));
                    js5Var.parseFrom(pByteArray2.value);
                    return pByteArray2.value;
                }
                try {
                    java.lang.String str = new java.lang.String(pByteArray2.value);
                    com.tencent.mars.xlog.Log.i("MicroMsg.RemoteResp", "bufToRespNoRSA -3002 ERR_IDCDISASTER, errStr:%s", str);
                    new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new com.tencent.mm.modelbase.w2(str));
                    return null;
                } catch (java.lang.Exception unused) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.RemoteResp", "parse string err while MM_ERR_IDCDISASTER");
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.RemoteResp", "unpack failed.");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RemoteResp", e17, "parseFrom unbuild exception, check now!", new java.lang.Object[0]);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RemoteResp", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
        return null;
    }

    public static java.lang.String e(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(bArr.length * 2);
        for (int i17 = 0; i17 < bArr.length; i17++) {
            char[] cArr = f70841i;
            sb6.append(cArr[(bArr[i17] & 240) >>> 4]);
            sb6.append(cArr[bArr[i17] & 15]);
        }
        return sb6.toString();
    }

    @Override // o45.kg
    public int Fd() {
        r45.sr6 sr6Var;
        r45.xb xbVar;
        int i17 = this.f70843f;
        if (i17 != 252 && i17 != 763 && i17 != 701 && i17 != 702) {
            return 0;
        }
        o45.ah ahVar = this.f70842e;
        if (!(ahVar instanceof o45.vg) || (sr6Var = ((o45.vg) ahVar).f343015a) == null || (xbVar = sr6Var.f385952e) == null) {
            return 0;
        }
        return xbVar.f389938x;
    }

    @Override // o45.kg
    public java.lang.String Mf() {
        r45.ji5 ji5Var;
        if (this.f70843f != 381 || (ji5Var = ((o45.uh) this.f70842e).f343012a.f383834d) == null) {
            return "";
        }
        java.lang.String str = ji5Var.f377841e;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return str == null ? "" : str;
    }

    @Override // o45.kg
    public java.lang.String Pa() {
        r45.ji5 ji5Var;
        if (this.f70843f != 381 || (ji5Var = ((o45.uh) this.f70842e).f343012a.f383834d) == null) {
            return "";
        }
        java.lang.String str = ji5Var.f377840d;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return str == null ? "" : str;
    }

    @Override // o45.kg
    public byte[] Q5() {
        return this.f70842e.getAuthResponse();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o45.kg
    public void Y7(byte[] bArr, byte[] bArr2, int i17) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(bArr == null ? -1 : bArr.length);
        objArr[1] = java.lang.Integer.valueOf(bArr2 == null ? -1 : bArr2.length);
        objArr[2] = java.lang.Integer.valueOf(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.RemoteResp", "mmpack setRespBuffer respBuffer[%s] serverId[%s] noticeId[%d]", objArr);
        o45.ah ahVar = this.f70842e;
        o45.yg ygVar = (o45.yg) ahVar;
        if (ygVar != null) {
            try {
                int fromProtoBuf = ygVar.fromProtoBuf(bArr);
                ahVar.setRetCode(fromProtoBuf);
                if (fromProtoBuf == -305) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.RemoteResp", "summerauths  MM_ERR_CERT_SWITCH  old ver:%d", java.lang.Integer.valueOf(o45.ag.a()));
                    o45.ag.l();
                }
            } catch (java.lang.Exception | java.lang.OutOfMemoryError e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RemoteResp", e17, "mmpack setRespBuffer fail.", new java.lang.Object[0]);
                ahVar.setRetCode(-1);
                return;
            }
        }
        this.f70844g = bArr2;
        if (i17 != 0) {
            com.tencent.mm.autogen.events.GetDisasterInfoEvent getDisasterInfoEvent = new com.tencent.mm.autogen.events.GetDisasterInfoEvent();
            getDisasterInfoEvent.f54390g.f7808a = i17;
            com.tencent.mars.xlog.Log.i("MicroMsg.RemoteResp", "mmpack summerdiz publish GetDisasterInfoEvent noticeid[%d] publish[%b]", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(getDisasterInfoEvent.e()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0415 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0460 A[Catch: Exception -> 0x04b6, TryCatch #5 {Exception -> 0x04b6, blocks: (B:83:0x0456, B:85:0x0460, B:86:0x0465, B:88:0x0469, B:92:0x049a, B:96:0x047c, B:98:0x0482), top: B:82:0x0456 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0469 A[Catch: Exception -> 0x04b6, TryCatch #5 {Exception -> 0x04b6, blocks: (B:83:0x0456, B:85:0x0460, B:86:0x0465, B:88:0x0469, B:92:0x049a, B:96:0x047c, B:98:0x0482), top: B:82:0x0456 }] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r7v0, types: [o45.ah] */
    @Override // o45.kg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Zd(int r48, byte[] r49, byte[] r50, long r51) {
        /*
            Method dump skipped, instructions count: 1316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.modelbase.y2.Zd(int, byte[], byte[], long):boolean");
    }

    @Override // o45.kg
    public int c6() {
        if (this.f70843f == 381) {
            return ((o45.uh) this.f70842e).f343012a.f383835e;
        }
        return 0;
    }

    @Override // o45.kg
    public int dc() {
        return this.f70842e.getHeadExtFlags();
    }

    @Override // o45.kg
    public java.lang.String getErrMsg() {
        return this.f70842e.getErrMsg();
    }

    @Override // o45.kg
    public int getUin() {
        o45.ah ahVar = this.f70842e;
        int i17 = this.f70843f;
        if (i17 != 126) {
            if (i17 != 252 && i17 != 763) {
                if (i17 != 877) {
                    if (i17 != 701 && i17 != 702) {
                        return 0;
                    }
                }
            }
            return ((o45.vg) ahVar).f343015a.f385952e.f389921d;
        }
        return ((o45.ci) ahVar).f342914a.f392390d;
    }

    @Override // o45.kg
    public byte[] ij() {
        return this.f70842e.getNewRegResponse();
    }

    @Override // o45.kg
    public int n8() {
        return this.f70842e.getRetCode();
    }

    @Override // o45.kg
    public byte[] o() {
        return this.f70844g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        if (r4 != 702) goto L23;
     */
    @Override // o45.kg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] oi() {
        /*
            r5 = this;
            r0 = 0
            byte[] r1 = new byte[r0]
            r2 = 126(0x7e, float:1.77E-43)
            o45.ah r3 = r5.f70842e
            int r4 = r5.f70843f
            if (r4 == r2) goto L3a
            r2 = 252(0xfc, float:3.53E-43)
            if (r4 == r2) goto L20
            r2 = 763(0x2fb, float:1.069E-42)
            if (r4 == r2) goto L20
            r2 = 877(0x36d, float:1.229E-42)
            if (r4 == r2) goto L3a
            r2 = 701(0x2bd, float:9.82E-43)
            if (r4 == r2) goto L20
            r2 = 702(0x2be, float:9.84E-43)
            if (r4 == r2) goto L20
            goto L4c
        L20:
            r2 = r3
            o45.vg r2 = (o45.vg) r2
            r45.sr6 r2 = r2.f343015a
            r45.xb r2 = r2.f385952e
            r45.cu5 r2 = r2.f389924g
            if (r2 == 0) goto L4c
            o45.vg r3 = (o45.vg) r3
            r45.sr6 r1 = r3.f343015a
            r45.xb r1 = r1.f385952e
            r45.cu5 r1 = r1.f389924g
            com.tencent.mm.protobuf.g r1 = r1.f371841f
            byte[] r1 = r1.g()
            goto L4c
        L3a:
            o45.ci r3 = (o45.ci) r3
            r45.zv4 r2 = r3.f342914a
            r45.xx5 r2 = r2.f392389J
            if (r2 == 0) goto L4c
            r45.cu5 r2 = r2.f390580d
            if (r2 == 0) goto L4c
            com.tencent.mm.protobuf.g r1 = r2.f371841f
            byte[] r1 = r1.g()
        L4c:
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r2[r0] = r3
            int r0 = r1.length
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = 1
            r2[r3] = r0
            java.lang.String r0 = "MicroMsg.RemoteResp"
            java.lang.String r3 = "summerauths getAutoAuthKey type[%s] key[%s]"
            com.tencent.mars.xlog.Log.i(r0, r3, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.modelbase.y2.oi():byte[]");
    }

    @Override // o45.kg
    public java.lang.String q() {
        o45.ah ahVar = this.f70842e;
        int i17 = this.f70843f;
        if (i17 != 126) {
            if (i17 != 252 && i17 != 763) {
                if (i17 != 877) {
                    if (i17 != 701 && i17 != 702) {
                        return "";
                    }
                }
            }
            return ((o45.vg) ahVar).f343016b;
        }
        return ((o45.ci) ahVar).f342914a.f392401r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        if (r8 != 702) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
    @Override // o45.kg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] r(int r10) {
        /*
            r9 = this;
            r0 = 0
            byte[] r1 = new byte[r0]
            r2 = 126(0x7e, float:1.77E-43)
            r3 = -1
            o45.ah r4 = r9.f70842e
            r5 = 2
            r6 = 1
            r7 = 3
            int r8 = r9.f70843f
            if (r8 == r2) goto L56
            r2 = 252(0xfc, float:3.53E-43)
            if (r8 == r2) goto L24
            r2 = 763(0x2fb, float:1.069E-42)
            if (r8 == r2) goto L24
            r2 = 877(0x36d, float:1.229E-42)
            if (r8 == r2) goto L56
            r2 = 701(0x2bd, float:9.82E-43)
            if (r8 == r2) goto L24
            r2 = 702(0x2be, float:9.84E-43)
            if (r8 == r2) goto L24
            goto L6c
        L24:
            o45.vg r4 = (o45.vg) r4
            byte[] r1 = new byte[r0]
            if (r10 == r6) goto L38
            if (r10 == r5) goto L35
            if (r10 == r7) goto L32
            r4.getClass()
            goto L3a
        L32:
            byte[] r1 = r4.f343020f
            goto L3a
        L35:
            byte[] r1 = r4.f343019e
            goto L3a
        L38:
            byte[] r1 = r4.f343018d
        L3a:
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r2[r0] = r4
            if (r1 != 0) goto L46
            r4 = r3
            goto L47
        L46:
            int r4 = r1.length
        L47:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r6] = r4
            java.lang.String r4 = "MicroMsg.MMAuth"
            java.lang.String r8 = "summerauths getSession seesionKeyType[%s] [%s]"
            com.tencent.mars.xlog.Log.i(r4, r8, r2)
            goto L6c
        L56:
            o45.ci r4 = (o45.ci) r4
            byte[] r1 = new byte[r0]
            if (r10 == r6) goto L6a
            if (r10 == r5) goto L67
            if (r10 == r7) goto L64
            r4.getClass()
            goto L6c
        L64:
            byte[] r1 = r4.f342918e
            goto L6c
        L67:
            byte[] r1 = r4.f342917d
            goto L6c
        L6a:
            byte[] r1 = r4.f342916c
        L6c:
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r2[r0] = r10
            if (r1 != 0) goto L77
            goto L78
        L77:
            int r3 = r1.length
        L78:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
            r2[r6] = r10
            boolean r10 = com.tencent.mm.sdk.platformtools.t8.f192989a
            com.tencent.mm.sdk.platformtools.z3 r10 = new com.tencent.mm.sdk.platformtools.z3
            r10.<init>()
            r2[r5] = r10
            java.lang.String r10 = "MicroMsg.RemoteResp"
            java.lang.String r0 = "summerauths getSessionKey seesionKeyType[%s] [%s] [%s]"
            com.tencent.mars.xlog.Log.i(r10, r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.modelbase.y2.r(int):byte[]");
    }

    @Override // o45.kg
    public byte[] s() {
        byte[] bArr = new byte[0];
        o45.ah ahVar = this.f70842e;
        int i17 = this.f70843f;
        if (i17 != 126) {
            if (i17 != 252 && i17 != 763) {
                if (i17 != 877) {
                    if (i17 != 701 && i17 != 702) {
                        return bArr;
                    }
                }
            }
            return ((o45.vg) ahVar).f343017c;
        }
        return ((o45.ci) ahVar).f342915b;
    }

    @Override // o45.kg
    public void s9(byte[] bArr) {
        this.f70842e.setProfile(bArr);
    }
}
