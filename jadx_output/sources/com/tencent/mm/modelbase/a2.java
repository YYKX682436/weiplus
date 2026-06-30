package com.tencent.mm.modelbase;

/* loaded from: classes12.dex */
public class a2 extends com.tencent.matrix.lifecycle.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.r1 f70588a;

    public a2(com.tencent.mm.modelbase.r1 r1Var) {
        this.f70588a = r1Var;
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onEnterForeground() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQueue", "onAppForeground");
        com.tencent.mm.modelbase.r1 r1Var = this.f70588a;
        r1Var.u(true);
        r1Var.v(false);
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onExitForeground() {
    }
}
