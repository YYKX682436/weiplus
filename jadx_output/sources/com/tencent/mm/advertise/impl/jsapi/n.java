package com.tencent.mm.advertise.impl.jsapi;

/* loaded from: classes4.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lc3.a0 f53175d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.advertise.impl.jsapi.o f53176e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(lc3.a0 a0Var, com.tencent.mm.advertise.impl.jsapi.o oVar) {
        super(0);
        this.f53175d = a0Var;
        this.f53176e = oVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.HashMap hashMap = new java.util.HashMap();
        ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).Bi();
        hashMap.put("imei", "");
        ((ee0.e) ((fe0.l3) i95.n0.c(fe0.l3.class))).getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isReportOAID", "com.tencent.mm.feature.sns.AdDeviceIdSwitchHelperService");
        boolean b17 = w34.a.b();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isReportOAID", "com.tencent.mm.feature.sns.AdDeviceIdSwitchHelperService");
        if (b17) {
            java.lang.String k96 = ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).k9();
            kotlin.jvm.internal.o.d(k96);
            hashMap.put("oaid", k96);
        }
        lc3.a0 a0Var = this.f53175d;
        if (a0Var.has("waidPkg")) {
            java.lang.String optString = a0Var.optString("waidPkg");
            com.tencent.mars.xlog.Log.i("MicroMsg.MBJsApiGetAdIdInfo", "waidPkg=" + optString);
            ((ee0.z4) ((fe0.r4) i95.n0.c(fe0.r4.class))).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAppWaid", "com.tencent.mm.feature.sns.WaidHelperService");
            java.lang.String d17 = me4.c.d(optString);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAppWaid", "com.tencent.mm.feature.sns.WaidHelperService");
            kotlin.jvm.internal.o.f(d17, "getAppWaid(...)");
            hashMap.put("waid", d17);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.MBJsApiGetAdIdInfo", "no waidPkg param");
        }
        hashMap.put("devIdInfo", ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).Ai());
        com.tencent.mm.advertise.impl.jsapi.o oVar = this.f53176e;
        yz5.l s17 = oVar.s();
        lc3.a0 a0Var2 = new lc3.a0(hashMap);
        oVar.m(a0Var2);
        s17.invoke(a0Var2);
        return jz5.f0.f302826a;
    }
}
