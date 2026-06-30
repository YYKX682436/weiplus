package com.tencent.mm.modelbase;

/* loaded from: classes12.dex */
public class z1 extends com.tencent.matrix.lifecycle.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.r1 f70845b;

    public z1(com.tencent.mm.modelbase.r1 r1Var) {
        this.f70845b = r1Var;
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQueue", "onAppBackground");
        this.f70845b.u(false);
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void b() {
    }
}
