package com.tencent.mm.plugin.choosemsgfile.logic.ui;

/* loaded from: classes12.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f95555d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.choosemsgfile.logic.ui.t f95556e;

    public s(com.tencent.mm.plugin.choosemsgfile.logic.ui.t tVar, int i17) {
        this.f95556e = tVar;
        this.f95555d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.choosemsgfile.logic.ui.t tVar = this.f95556e;
        com.tencent.mm.plugin.choosemsgfile.logic.ui.u uVar = tVar.f95560g;
        uVar.f95561d.f95530h = false;
        uVar.f95528b.A(tVar.f95559f, this.f95555d);
    }
}
