package com.tencent.mm.modelsimple;

/* loaded from: classes12.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f71414d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsimple.v0 f71415e;

    public t0(com.tencent.mm.modelsimple.v0 v0Var, int i17) {
        this.f71415e = v0Var;
        this.f71414d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        new com.tencent.mm.modelsimple.l0(this.f71414d).doScene(this.f71415e.dispatcher(), new com.tencent.mm.modelsimple.s0(this));
    }

    public java.lang.String toString() {
        return super.toString() + "|onGYNetEnd1";
    }
}
