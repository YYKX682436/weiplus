package com.tencent.mm.plugin.choosemsgfile.logic.ui;

/* loaded from: classes12.dex */
public class f implements vv1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wv1.a f95532a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f95533b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.choosemsgfile.logic.ui.h f95534c;

    public f(com.tencent.mm.plugin.choosemsgfile.logic.ui.h hVar, wv1.a aVar, androidx.recyclerview.widget.k3 k3Var) {
        this.f95534c = hVar;
        this.f95532a = aVar;
        this.f95533b = k3Var;
    }

    @Override // vv1.a
    public void a(long j17, long j18) {
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(j18);
        wv1.a aVar = this.f95532a;
        com.tencent.mars.xlog.Log.e("MicroMsg.ChooseMsgFileListUIController", "item:%s onDownloadProgress offset:%d totalLen:%d", aVar, valueOf, valueOf2);
        synchronized (aVar) {
            aVar.f449933e = 2;
            aVar.f449931c = j17;
            aVar.f449932d = j18;
        }
        androidx.recyclerview.widget.k3 k3Var = this.f95533b;
        if (k3Var == null) {
            return;
        }
        wv1.a aVar2 = (wv1.a) ((wv1.r) k3Var).f449973d.getTag();
        if (aVar2.equals(aVar)) {
            aVar2.l(k3Var);
        }
    }

    @Override // vv1.a
    public void b() {
        wv1.a aVar = this.f95532a;
        com.tencent.mars.xlog.Log.e("MicroMsg.ChooseMsgFileListUIController", "item:%s onExpireFail", aVar);
        com.tencent.mm.plugin.choosemsgfile.logic.ui.l.a(this.f95534c.f95536a).f(aVar.f());
        synchronized (aVar) {
            aVar.f449933e = 4;
        }
        androidx.recyclerview.widget.k3 k3Var = this.f95533b;
        if (k3Var == null) {
            return;
        }
        wv1.a aVar2 = (wv1.a) ((wv1.r) k3Var).f449973d.getTag();
        if (aVar2.equals(aVar)) {
            aVar2.l(k3Var);
        }
    }

    @Override // vv1.a
    public void c() {
        wv1.a aVar = this.f95532a;
        com.tencent.mars.xlog.Log.e("MicroMsg.ChooseMsgFileListUIController", "item:%s onDownloadFails", aVar);
        com.tencent.mm.plugin.choosemsgfile.logic.ui.l.a(this.f95534c.f95536a).f(aVar.f());
        synchronized (aVar) {
            aVar.f449933e = 5;
        }
        androidx.recyclerview.widget.k3 k3Var = this.f95533b;
        if (k3Var == null) {
            return;
        }
        wv1.a aVar2 = (wv1.a) ((wv1.r) k3Var).f449973d.getTag();
        if (aVar2.equals(aVar)) {
            aVar2.l(k3Var);
        }
    }

    @Override // vv1.a
    public void d(com.tencent.mm.choosemsgfile.compat.MsgFile msgFile) {
        wv1.a aVar = this.f95532a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileListUIController", "item:%s onDownloadSuccess msgFile:%s", aVar, msgFile);
        com.tencent.mm.plugin.choosemsgfile.logic.ui.h hVar = this.f95534c;
        com.tencent.mm.plugin.choosemsgfile.logic.ui.l.a(hVar.f95536a).f(aVar.f());
        xv1.b a17 = com.tencent.mm.plugin.choosemsgfile.logic.ui.l.a(hVar.f95536a);
        long f17 = aVar.f();
        wv1.a aVar2 = this.f95532a;
        a17.d(f17, msgFile, aVar2, hVar.f95536a.f95544d.f95524e.indexOf(aVar2));
        if (com.tencent.mm.plugin.choosemsgfile.logic.ui.l.a(hVar.f95536a).c()) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.choosemsgfile.logic.ui.e(this));
        }
        hVar.f95536a.f95528b.v2();
        synchronized (aVar) {
            aVar.f449933e = 3;
        }
        androidx.recyclerview.widget.k3 k3Var = this.f95533b;
        if (k3Var == null) {
            return;
        }
        wv1.a aVar3 = (wv1.a) ((wv1.r) k3Var).f449973d.getTag();
        if (aVar3.equals(aVar)) {
            aVar3.l(k3Var);
        }
    }

    @Override // vv1.a
    public void e() {
        wv1.a aVar = this.f95532a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileListUIController", "item:%s onDownloadPause", aVar);
        com.tencent.mm.plugin.choosemsgfile.logic.ui.l.a(this.f95534c.f95536a).f(aVar.f());
        synchronized (aVar) {
            aVar.f449933e = 0;
        }
        androidx.recyclerview.widget.k3 k3Var = this.f95533b;
        if (k3Var == null) {
            return;
        }
        wv1.a aVar2 = (wv1.a) ((wv1.r) k3Var).f449973d.getTag();
        if (aVar2.equals(aVar)) {
            aVar2.l(k3Var);
        }
    }
}
