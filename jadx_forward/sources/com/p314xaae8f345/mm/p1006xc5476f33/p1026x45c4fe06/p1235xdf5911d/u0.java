package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d;

@j95.b
/* loaded from: classes7.dex */
public final class u0 extends i95.w implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.u5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.x1 f173850d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.j1 f173851e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f173852f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f173853g;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f173854m;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap.KeySetView f173855o;

    public u0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.x1 x1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.x1();
        this.f173850d = x1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.j1 j1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.j1();
        this.f173851e = j1Var;
        this.f173852f = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.t0.f173842d);
        this.f173853g = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.s0.f173839d);
        new java.util.HashMap();
        new java.util.HashMap();
        x1Var.f173873a = this;
        j1Var.f173748a = this;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWxAssistantService", "init: NetworkRequestCollector NOT registered (disabled by compile flag)");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWxAssistantService", "init: main process, clear all");
            Di().getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.v2.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.w2.f173861a).d();
            Ri().d();
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.n.f173084d = false;
        }
        this.f173854m = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.r0.f173833d);
        jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.y.f173879d);
        this.f173855o = java.util.concurrent.ConcurrentHashMap.newKeySet();
    }

    public java.util.List Ai(java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.w2 Di = Di();
        Di.getClass();
        java.lang.String b17 = Di.b(sessionId);
        java.lang.String a17 = Di.a(sessionId);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.v2 v2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.w2.f173861a;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.v2.a(v2Var).getInt(b17, -1);
        if (i17 == -1) {
            return kz5.p0.f395529d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (i17 >= 0) {
            int i18 = 0;
            while (true) {
                java.lang.String string = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.v2.a(v2Var).getString(a17 + i18, null);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                arrayList.add(string);
                if (i18 == i17) {
                    break;
                }
                i18++;
            }
        }
        return arrayList;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.cdp.e Bi(java.lang.String method) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(method, "method");
        yz5.a aVar = (yz5.a) ((java.util.Map) ((jz5.n) this.f173854m).mo141623x754a37bb()).get(method);
        if (aVar != null) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.cdp.e) aVar.mo152xb9724478();
        }
        return null;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.w2 Di() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.w2) this.f173852f.mo141623x754a37bb();
    }

    public java.lang.String Ni(java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.w2 Di = Di();
        Di.getClass();
        java.lang.String b17 = Di.b(sessionId);
        java.lang.String a17 = Di.a(sessionId);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.v2 v2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.w2.f173861a;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.v2.a(v2Var).getInt(b17, -1);
        if (i17 == -1) {
            return null;
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.v2.a(v2Var).getString(a17 + i17, null);
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Ri() {
        java.lang.Object mo141623x754a37bb = this.f173853g.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) mo141623x754a37bb;
    }

    public void Ui(java.lang.String sessionId, java.lang.String appId, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o0 status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f173851e.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWxAssistantService", "notifyLaunchClient: sessionId:" + sessionId + " appId:" + appId + " status:" + status);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, sessionId);
        bundle.putString("appId", appId);
        bundle.putSerializable("status", status);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(str, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.f1.f173735d.getClass(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.g1.f173738d);
    }
}
