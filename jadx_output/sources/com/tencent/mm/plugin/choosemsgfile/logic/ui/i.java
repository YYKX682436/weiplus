package com.tencent.mm.plugin.choosemsgfile.logic.ui;

/* loaded from: classes12.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.choosemsgfile.logic.ui.j f95537d;

    public i(com.tencent.mm.plugin.choosemsgfile.logic.ui.j jVar) {
        this.f95537d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.choosemsgfile.logic.ui.j jVar = this.f95537d;
        com.tencent.mm.plugin.choosemsgfile.logic.ui.l lVar = jVar.f95540f;
        com.tencent.mm.plugin.choosemsgfile.ui.f0 f0Var = lVar.f95528b;
        if (f0Var != null) {
            f0Var.A(jVar.f95539e, ((java.util.ArrayList) lVar.f95545e).size());
        }
    }
}
