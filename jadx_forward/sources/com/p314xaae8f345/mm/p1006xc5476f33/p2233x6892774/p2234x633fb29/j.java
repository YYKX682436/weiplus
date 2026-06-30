package com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29;

/* loaded from: classes2.dex */
public class j extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f253326d = null;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f253327e;

    public j(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, java.lang.String str3, int i27) {
        this.f253327e = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.NetSceneUploadDeviceStep", "NetSceneUploadDeviceStep %s, %s, %s, %s, %s", str, str2, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.tt6();
        lVar.f152198b = new r45.ut6();
        lVar.f152199c = "/cgi-bin/mmoc-bin/hardware/uploaddevicestep";
        lVar.f152200d = 1261;
        int i28 = 0;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f253327e = a17;
        r45.tt6 tt6Var = (r45.tt6) a17.f152243a.f152217a;
        tt6Var.f468324d = str;
        tt6Var.f468325e = str2;
        tt6Var.f468326f = i17;
        tt6Var.f468327g = i18;
        tt6Var.f468328h = i19;
        db5.d5 d5Var = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.f253306a;
        java.util.TimeZone timeZone = java.util.TimeZone.getDefault();
        int rawOffset = timeZone.getRawOffset() / 1000;
        if (timeZone.useDaylightTime() && timeZone.inDaylightTime(new java.util.Date(java.lang.System.currentTimeMillis()))) {
            i28 = 1;
        }
        tt6Var.f468329i = java.lang.String.valueOf((rawOffset / 3600) + i28);
        tt6Var.f468333p = str3;
        tt6Var.f468336s = i27;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6190xfd5dd5c7 c6190xfd5dd5c7 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6190xfd5dd5c7();
        int i29 = tt6Var.f468328h;
        am.uz uzVar = c6190xfd5dd5c7.f136448g;
        uzVar.f89680a = i29;
        uzVar.f89681b = tt6Var.f468336s;
        c6190xfd5dd5c7.e();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f253326d = u0Var;
        return mo9409x10f9447a(sVar, this.f253327e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1261;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.ut6 ut6Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.NetSceneUploadDeviceStep", "NetSceneUploadDeviceStep end: errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1.f(10, 12);
        if (i18 == 0 && i19 == 0 && (ut6Var = (r45.ut6) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.NetSceneUploadDeviceStep", "upload device step success, old_log_msg:%s, new_log_msg:%s", ut6Var.f469176e, ut6Var.f469177f);
        }
        this.f253326d.mo815x76e0bfae(i18, i19, str, this);
    }
}
