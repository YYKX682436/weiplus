package com.tencent.mm.plugin.choosemsgfile.ui;

/* loaded from: classes8.dex */
public class j implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.choosemsgfile.ui.m f95623d;

    public j(com.tencent.mm.plugin.choosemsgfile.ui.m mVar) {
        this.f95623d = mVar;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.choosemsgfile.ui.m mVar = this.f95623d;
        g4Var.f(0, mVar.f95626a.getString(com.tencent.mm.R.string.f492836i24));
        g4Var.f(3, mVar.f95626a.getString(com.tencent.mm.R.string.cfd));
        g4Var.f(1, mVar.f95626a.getString(com.tencent.mm.R.string.f490899b74));
        g4Var.f(4, mVar.f95626a.getString(com.tencent.mm.R.string.f491158c60));
    }
}
