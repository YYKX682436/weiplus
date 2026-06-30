package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.if, reason: invalid class name */
/* loaded from: classes7.dex */
public final class Cif {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f162849a = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.hf.f162827d);

    /* renamed from: b, reason: collision with root package name */
    public boolean f162850b = true;

    /* renamed from: c, reason: collision with root package name */
    public final android.util.SparseLongArray f162851c = new android.util.SparseLongArray();

    public final synchronized void a(int i17, java.lang.String apiName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiName, "apiName");
        if (this.f162850b) {
            return;
        }
        long j17 = this.f162851c.get(i17, -1L);
        if (j17 >= 0) {
            b(apiName, java.lang.System.currentTimeMillis() - j17);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.JsInvokeCostManager", "get startTime fail, id:" + i17);
    }

    public final synchronized void b(java.lang.String apiName, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiName, "apiName");
        if (this.f162850b) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.gf gfVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.gf) ((java.util.Map) ((jz5.n) this.f162849a).mo141623x754a37bb()).get(apiName);
        if (gfVar == null) {
            ((java.util.Map) ((jz5.n) this.f162849a).mo141623x754a37bb()).put(apiName, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.gf(1, j17));
        } else {
            gfVar.f162795a++;
            gfVar.f162796b += j17;
        }
    }
}
