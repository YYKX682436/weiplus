package yf4;

/* loaded from: classes4.dex */
public class e extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f543364d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f543365e;

    /* renamed from: h, reason: collision with root package name */
    public int f543368h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f543369i = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f543366f = null;

    /* renamed from: g, reason: collision with root package name */
    public java.io.RandomAccessFile f543367g = null;

    public e(java.lang.String str) {
        this.f543365e = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f543364d = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.pk3();
        lVar.f152198b = new r45.qk3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getpsmimg";
        lVar.f152200d = 141;
        lVar.f152201e = 29;
        lVar.f152202f = 1000000029;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        r45.pk3 pk3Var = (r45.pk3) a17.f152243a.f152217a;
        pk3Var.f464659d = this.f543365e;
        pk3Var.f464660e = this.f543368h;
        return mo9409x10f9447a(sVar, a17, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 141;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:4|(1:6)|7|(4:9|(1:35)(2:13|(1:15)(2:30|31))|16|(2:18|19)(2:21|(2:23|24)(2:25|(2:27|28)(1:29))))|36|37|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008d, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008e, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetPSMImg", "writeFile write file error [" + r6.f543366f + "]  e:" + r12.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b9  */
    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo804x5f9cdc6f(int r7, int r8, int r9, java.lang.String r10, com.p314xaae8f345.mm.p971x6de15a2e.v0 r11, byte[] r12) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yf4.e.mo804x5f9cdc6f(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return 10;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        int i17;
        java.lang.String str = ((r45.pk3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152243a.f152217a).f464659d;
        boolean z17 = false;
        if (str != null && str.indexOf("weixin://") == 0) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p944x882e457a.o1 o1Var = com.p314xaae8f345.mm.p944x882e457a.o1.EFailed;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetPSMImg", "security checked failed : url invalid:" + this.f543365e);
            return o1Var;
        }
        int i18 = this.f543368h;
        if (i18 < 0 || (i17 = this.f543369i) < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetPSMImg", "security checked failed : offset:" + this.f543368h + " total:" + this.f543369i);
            return o1Var;
        }
        if (i18 == 0) {
            if (i17 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetPSMImg", "security checked failed : offset:" + this.f543368h + " total:" + this.f543369i);
                return o1Var;
            }
        } else if (i18 >= i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetPSMImg", "security checked failed : offset:" + this.f543368h + " total:" + this.f543369i);
            return o1Var;
        }
        return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
    }
}
