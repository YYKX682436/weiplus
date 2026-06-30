package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d;

/* loaded from: classes7.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.u0 f173873a;

    /* renamed from: b, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f173874b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f173875c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f173876d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f173877e;

    public x1() {
        oz5.i a17 = p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        this.f173874b = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) a17).mo7096x348d9a(((t26.a) p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a).f496880h));
        this.f173875c = new java.util.concurrent.atomic.AtomicInteger(0);
        this.f173876d = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.l1.f173764d);
        this.f173877e = new java.util.HashMap();
        new java.util.HashMap();
        new java.util.HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.x1 r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, r45.w3 r25, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r26) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.x1.a(com.tencent.mm.plugin.appbrand.wxassistant.x1, java.lang.String, java.lang.String, java.lang.String, r45.w3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public boolean b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12575x278fd8e2 params, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.t5 callback) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.u0 u0Var = this.f173873a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u0Var);
        java.lang.String Ni = u0Var.Ni(params.f170137d);
        if (Ni == null || Ni.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandWxAssistantService", "sendToAppBrandProcess: appId is null");
            return false;
        }
        int andIncrement = this.f173875c.getAndIncrement();
        ((java.util.HashMap) ((jz5.n) this.f173876d).mo141623x754a37bb()).put(java.lang.Integer.valueOf(andIncrement), callback);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k kVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.f170732h.a().g(Ni);
        if (kVar == null || (str = kVar.i()) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.n.f173769a.getClass();
            str = (java.lang.String) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.n.f173771c).mo141623x754a37bb();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWxAssistantService", "sendToAppBrandProcess: appId:" + Ni + " callbackId:" + andIncrement + " processName:" + str);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("callbackId", andIncrement);
        bundle.putParcelable("params", params);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(str, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q1.f173830d.getClass(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.r1.f173834d);
        return true;
    }
}
