package com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui;

/* loaded from: classes12.dex */
public class n implements vv1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wv1.a f177081a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f177082b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.p f177083c;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.p pVar, wv1.a aVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        this.f177083c = pVar;
        this.f177081a = aVar;
        this.f177082b = k3Var;
    }

    @Override // vv1.a
    public void a(long j17, long j18) {
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(j18);
        wv1.a aVar = this.f177081a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChooseMsgFileUIController", "item:%s onDownloadProgress offset:%d totalLen:%d", aVar, valueOf, valueOf2);
        synchronized (aVar) {
            aVar.f531466e = 2;
            aVar.f531464c = j17;
            aVar.f531465d = j18;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f177082b;
        if (k3Var == null) {
            return;
        }
        wv1.a aVar2 = (wv1.a) ((wv1.o) k3Var).f531493e.getTag();
        if (aVar2.m174531xb2c87fbf(aVar)) {
            aVar2.l(k3Var);
        }
    }

    @Override // vv1.a
    public void b() {
        wv1.a aVar = this.f177081a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChooseMsgFileUIController", "item:%s onExpireFail", aVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.u.a(this.f177083c.f177085a).f(aVar.f());
        synchronized (aVar) {
            aVar.f531466e = 4;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f177082b;
        if (k3Var == null) {
            return;
        }
        wv1.a aVar2 = (wv1.a) ((wv1.o) k3Var).f531493e.getTag();
        if (aVar2.m174531xb2c87fbf(aVar)) {
            aVar2.l(k3Var);
        }
    }

    @Override // vv1.a
    public void c() {
        wv1.a aVar = this.f177081a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChooseMsgFileUIController", "item:%s onDownloadFails", aVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.u.a(this.f177083c.f177085a).f(aVar.f());
        synchronized (aVar) {
            aVar.f531466e = 5;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f177082b;
        if (k3Var == null) {
            return;
        }
        wv1.a aVar2 = (wv1.a) ((wv1.o) k3Var).f531493e.getTag();
        if (aVar2.m174531xb2c87fbf(aVar)) {
            aVar2.l(k3Var);
        }
    }

    @Override // vv1.a
    public void d(com.p314xaae8f345.mm.p659xbe8cc686.p660xaf3f3382.C10396xb34a007d c10396xb34a007d) {
        wv1.a aVar = this.f177081a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileUIController", "item:%s onDownloadSuccess msgFile:%s", aVar, c10396xb34a007d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.p pVar = this.f177083c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.u.a(pVar.f177085a).f(aVar.f());
        xv1.b a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.u.a(pVar.f177085a);
        long f17 = aVar.f();
        wv1.a aVar2 = this.f177081a;
        a17.d(f17, c10396xb34a007d, aVar2, pVar.f177085a.f177094d.f177057e.indexOf(aVar2));
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.u.a(pVar.f177085a).c()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.m(this));
        }
        pVar.f177085a.f177061b.v2();
        synchronized (aVar) {
            aVar.f531466e = 3;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f177082b;
        if (k3Var == null) {
            return;
        }
        wv1.a aVar3 = (wv1.a) ((wv1.o) k3Var).f531493e.getTag();
        if (aVar3.m174531xb2c87fbf(aVar)) {
            aVar3.l(k3Var);
        }
    }

    @Override // vv1.a
    public void e() {
        wv1.a aVar = this.f177081a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileUIController", "item:%s onDownloadPause", aVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.u.a(this.f177083c.f177085a).f(aVar.f());
        synchronized (aVar) {
            aVar.f531466e = 0;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f177082b;
        if (k3Var == null) {
            return;
        }
        wv1.a aVar2 = (wv1.a) ((wv1.o) k3Var).f531493e.getTag();
        if (aVar2.m174531xb2c87fbf(aVar)) {
            aVar2.l(k3Var);
        }
    }
}
