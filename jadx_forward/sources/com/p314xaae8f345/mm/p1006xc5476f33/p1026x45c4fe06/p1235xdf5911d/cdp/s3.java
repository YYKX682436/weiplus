package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.cdp;

/* loaded from: classes7.dex */
public final class s3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.l1 {

    /* renamed from: v, reason: collision with root package name */
    public double f173717v = 0.1d;

    /* renamed from: w, reason: collision with root package name */
    public double f173718w = 0.1d;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f173719x = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: y, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f173720y = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f173721z = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.cdp.r3(this));

    @Override // lf.e, lk1.c
    public void Pg(java.lang.String str, lk1.b bVar, android.os.Bundle bundle) {
        if (bVar != null) {
            bVar.j(0, "ok", f(str));
        }
    }

    public final lk1.a f(java.lang.String str) {
        lk1.a aVar = new lk1.a();
        aVar.f400540l = str;
        aVar.f400529a = this.f173717v;
        aVar.f400530b = this.f173718w;
        aVar.f400533e = 10.0d;
        aVar.f400531c = "network";
        return aVar;
    }

    @Override // lf.e, lk1.c
    public boolean ia(java.lang.String str, lk1.b bVar, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxAssistantLocationManager", "unregisterLocation type:" + str + " locationListener:" + bVar);
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = this.f173720y;
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet2 = this.f173719x;
        if (bVar != null) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("wgs84", str)) {
                copyOnWriteArraySet2.remove(bVar);
            } else {
                copyOnWriteArraySet.remove(bVar);
            }
        }
        if (!copyOnWriteArraySet2.isEmpty() || !copyOnWriteArraySet.isEmpty()) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxAssistantLocationManager", "unregisterLocation stopTimer");
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.b4) ((jz5.n) this.f173721z).mo141623x754a37bb()).d();
        return true;
    }

    @Override // lf.e, lk1.c
    public boolean w9(java.lang.String str, lk1.b bVar, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxAssistantLocationManager", "registerLocation type:" + str + " locationListener:" + bVar);
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = this.f173720y;
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet2 = this.f173719x;
        if (bVar != null) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("wgs84", str)) {
                copyOnWriteArraySet2.add(bVar);
            } else {
                copyOnWriteArraySet.add(bVar);
            }
        }
        if ((!copyOnWriteArraySet2.isEmpty()) || (!copyOnWriteArraySet.isEmpty())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxAssistantLocationManager", "registerLocation startTimer");
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.b4) ((jz5.n) this.f173721z).mo141623x754a37bb()).c(2000L, 2000L);
        }
        return true;
    }
}
