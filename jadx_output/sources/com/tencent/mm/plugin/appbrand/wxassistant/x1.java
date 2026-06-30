package com.tencent.mm.plugin.appbrand.wxassistant;

/* loaded from: classes7.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.wxassistant.u0 f92340a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f92341b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f92342c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f92343d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f92344e;

    public x1() {
        oz5.i a17 = kotlinx.coroutines.t3.a(null, 1, null);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        this.f92341b = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) a17).plus(((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h));
        this.f92342c = new java.util.concurrent.atomic.AtomicInteger(0);
        this.f92343d = jz5.h.b(com.tencent.mm.plugin.appbrand.wxassistant.l1.f92231d);
        this.f92344e = new java.util.HashMap();
        new java.util.HashMap();
        new java.util.HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.tencent.mm.plugin.appbrand.wxassistant.x1 r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, r45.w3 r25, kotlin.coroutines.Continuation r26) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.wxassistant.x1.a(com.tencent.mm.plugin.appbrand.wxassistant.x1, java.lang.String, java.lang.String, java.lang.String, r45.w3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public boolean b(com.tencent.mm.plugin.appbrand.service.CdpCommandParams params, com.tencent.mm.plugin.appbrand.service.t5 callback) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.appbrand.wxassistant.u0 u0Var = this.f92340a;
        kotlin.jvm.internal.o.d(u0Var);
        java.lang.String Ni = u0Var.Ni(params.f88604d);
        if (Ni == null || Ni.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandWxAssistantService", "sendToAppBrandProcess: appId is null");
            return false;
        }
        int andIncrement = this.f92342c.getAndIncrement();
        ((java.util.HashMap) ((jz5.n) this.f92343d).getValue()).put(java.lang.Integer.valueOf(andIncrement), callback);
        com.tencent.mm.plugin.appbrand.task.k kVar = (com.tencent.mm.plugin.appbrand.task.k) com.tencent.mm.plugin.appbrand.task.u0.f89199h.a().g(Ni);
        if (kVar == null || (str = kVar.i()) == null) {
            com.tencent.mm.plugin.appbrand.wxassistant.n.f92236a.getClass();
            str = (java.lang.String) ((jz5.n) com.tencent.mm.plugin.appbrand.wxassistant.n.f92238c).getValue();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWxAssistantService", "sendToAppBrandProcess: appId:" + Ni + " callbackId:" + andIncrement + " processName:" + str);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("callbackId", andIncrement);
        bundle.putParcelable("params", params);
        com.tencent.mm.ipcinvoker.d0.d(str, bundle, com.tencent.mm.plugin.appbrand.wxassistant.q1.f92297d.getClass(), com.tencent.mm.plugin.appbrand.wxassistant.r1.f92301d);
        return true;
    }
}
