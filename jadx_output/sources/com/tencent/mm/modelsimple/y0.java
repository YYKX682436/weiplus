package com.tencent.mm.modelsimple;

/* loaded from: classes12.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f71451d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsimple.z0 f71452e;

    public y0(com.tencent.mm.modelsimple.z0 z0Var, int i17) {
        this.f71452e = z0Var;
        this.f71451d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        new com.tencent.mm.modelsimple.l0(this.f71451d).doScene(this.f71452e.dispatcher(), new com.tencent.mm.modelsimple.x0(this));
    }
}
