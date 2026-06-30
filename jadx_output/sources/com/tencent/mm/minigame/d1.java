package com.tencent.mm.minigame;

/* loaded from: classes7.dex */
public final class d1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f69007d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.minigame.WVAModulePkgPathHelper$GetWVAModulePkgPathTask f69008e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f69009f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(long j17, com.tencent.mm.minigame.WVAModulePkgPathHelper$GetWVAModulePkgPathTask wVAModulePkgPathHelper$GetWVAModulePkgPathTask, int i17) {
        super(2);
        this.f69007d = j17;
        this.f69008e = wVAModulePkgPathHelper$GetWVAModulePkgPathTask;
        this.f69009f = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mars.xlog.Log.e("WVAModulePkgPathHelper", "fetchPatchSizeAsync: failed, errCode=" + ((java.lang.Number) obj).intValue() + ", errMsg=" + ((java.lang.String) obj2) + ", using fallbackSize=" + this.f69007d);
        com.tencent.mm.minigame.e1 e1Var = new com.tencent.mm.minigame.e1(false, null, this.f69009f, this.f69007d, true, 2, null);
        com.tencent.mm.minigame.WVAModulePkgPathHelper$GetWVAModulePkgPathTask wVAModulePkgPathHelper$GetWVAModulePkgPathTask = this.f69008e;
        wVAModulePkgPathHelper$GetWVAModulePkgPathTask.f68995q = e1Var;
        wVAModulePkgPathHelper$GetWVAModulePkgPathTask.c();
        return jz5.f0.f302826a;
    }
}
