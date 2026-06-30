package com.tencent.mm.plugin.choosemsgfile.logic.ui;

/* loaded from: classes12.dex */
public class n implements vv1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wv1.a f95548a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f95549b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.choosemsgfile.logic.ui.p f95550c;

    public n(com.tencent.mm.plugin.choosemsgfile.logic.ui.p pVar, wv1.a aVar, androidx.recyclerview.widget.k3 k3Var) {
        this.f95550c = pVar;
        this.f95548a = aVar;
        this.f95549b = k3Var;
    }

    @Override // vv1.a
    public void a(long j17, long j18) {
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(j18);
        wv1.a aVar = this.f95548a;
        com.tencent.mars.xlog.Log.e("MicroMsg.ChooseMsgFileUIController", "item:%s onDownloadProgress offset:%d totalLen:%d", aVar, valueOf, valueOf2);
        synchronized (aVar) {
            aVar.f449933e = 2;
            aVar.f449931c = j17;
            aVar.f449932d = j18;
        }
        androidx.recyclerview.widget.k3 k3Var = this.f95549b;
        if (k3Var == null) {
            return;
        }
        wv1.a aVar2 = (wv1.a) ((wv1.o) k3Var).f449960e.getTag();
        if (aVar2.equals(aVar)) {
            aVar2.l(k3Var);
        }
    }

    @Override // vv1.a
    public void b() {
        wv1.a aVar = this.f95548a;
        com.tencent.mars.xlog.Log.e("MicroMsg.ChooseMsgFileUIController", "item:%s onExpireFail", aVar);
        com.tencent.mm.plugin.choosemsgfile.logic.ui.u.a(this.f95550c.f95552a).f(aVar.f());
        synchronized (aVar) {
            aVar.f449933e = 4;
        }
        androidx.recyclerview.widget.k3 k3Var = this.f95549b;
        if (k3Var == null) {
            return;
        }
        wv1.a aVar2 = (wv1.a) ((wv1.o) k3Var).f449960e.getTag();
        if (aVar2.equals(aVar)) {
            aVar2.l(k3Var);
        }
    }

    @Override // vv1.a
    public void c() {
        wv1.a aVar = this.f95548a;
        com.tencent.mars.xlog.Log.e("MicroMsg.ChooseMsgFileUIController", "item:%s onDownloadFails", aVar);
        com.tencent.mm.plugin.choosemsgfile.logic.ui.u.a(this.f95550c.f95552a).f(aVar.f());
        synchronized (aVar) {
            aVar.f449933e = 5;
        }
        androidx.recyclerview.widget.k3 k3Var = this.f95549b;
        if (k3Var == null) {
            return;
        }
        wv1.a aVar2 = (wv1.a) ((wv1.o) k3Var).f449960e.getTag();
        if (aVar2.equals(aVar)) {
            aVar2.l(k3Var);
        }
    }

    @Override // vv1.a
    public void d(com.tencent.mm.choosemsgfile.compat.MsgFile msgFile) {
        wv1.a aVar = this.f95548a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileUIController", "item:%s onDownloadSuccess msgFile:%s", aVar, msgFile);
        com.tencent.mm.plugin.choosemsgfile.logic.ui.p pVar = this.f95550c;
        com.tencent.mm.plugin.choosemsgfile.logic.ui.u.a(pVar.f95552a).f(aVar.f());
        xv1.b a17 = com.tencent.mm.plugin.choosemsgfile.logic.ui.u.a(pVar.f95552a);
        long f17 = aVar.f();
        wv1.a aVar2 = this.f95548a;
        a17.d(f17, msgFile, aVar2, pVar.f95552a.f95561d.f95524e.indexOf(aVar2));
        if (com.tencent.mm.plugin.choosemsgfile.logic.ui.u.a(pVar.f95552a).c()) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.choosemsgfile.logic.ui.m(this));
        }
        pVar.f95552a.f95528b.v2();
        synchronized (aVar) {
            aVar.f449933e = 3;
        }
        androidx.recyclerview.widget.k3 k3Var = this.f95549b;
        if (k3Var == null) {
            return;
        }
        wv1.a aVar3 = (wv1.a) ((wv1.o) k3Var).f449960e.getTag();
        if (aVar3.equals(aVar)) {
            aVar3.l(k3Var);
        }
    }

    @Override // vv1.a
    public void e() {
        wv1.a aVar = this.f95548a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileUIController", "item:%s onDownloadPause", aVar);
        com.tencent.mm.plugin.choosemsgfile.logic.ui.u.a(this.f95550c.f95552a).f(aVar.f());
        synchronized (aVar) {
            aVar.f449933e = 0;
        }
        androidx.recyclerview.widget.k3 k3Var = this.f95549b;
        if (k3Var == null) {
            return;
        }
        wv1.a aVar2 = (wv1.a) ((wv1.o) k3Var).f449960e.getTag();
        if (aVar2.equals(aVar)) {
            aVar2.l(k3Var);
        }
    }
}
