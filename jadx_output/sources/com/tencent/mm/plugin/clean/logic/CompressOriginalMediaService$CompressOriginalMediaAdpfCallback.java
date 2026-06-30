package com.tencent.mm.plugin.clean.logic;

@com.tencent.mm.feature.performance.api.AdpfAnno$Callbacks$BindingUI(activities = {com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheProgressUI.class})
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0004\u001a\u00020\u0003H\u0017J\b\u0010\u0005\u001a\u00020\u0003H\u0017J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0017¨\u0006\u000b"}, d2 = {"com/tencent/mm/plugin/clean/logic/CompressOriginalMediaService$CompressOriginalMediaAdpfCallback", "Lob0/d;", "Lob0/c;", "Ljz5/f0;", "onSuspend", "onResume", "", "", "runThreadWithLowEnergy", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@com.tencent.mm.feature.performance.api.AdpfAnno$SchedulePolicy$Batch
@com.tencent.mm.feature.performance.api.AdpfAnno$Callbacks$RunThreadsWithLowEnergy
/* loaded from: classes10.dex */
public final class CompressOriginalMediaService$CompressOriginalMediaAdpfCallback extends ob0.d implements ob0.c {
    public static final int $stable = 0;
    public static final com.tencent.mm.plugin.clean.logic.CompressOriginalMediaService$CompressOriginalMediaAdpfCallback INSTANCE = new com.tencent.mm.plugin.clean.logic.CompressOriginalMediaService$CompressOriginalMediaAdpfCallback();

    private CompressOriginalMediaService$CompressOriginalMediaAdpfCallback() {
        super("CompressOriginalMedia");
    }

    @Override // ob0.d
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CompressOriginalMediaService", "onResume");
        ((ku5.t0) ku5.t0.f312615d).h(aw1.d0.f14509d, "MicroMsg.CompressOriginalMediaService");
    }

    @Override // ob0.d
    public void onSuspend() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CompressOriginalMediaService", "onSuspend");
        ((ku5.t0) ku5.t0.f312615d).h(aw1.e0.f14515d, "MicroMsg.CompressOriginalMediaService");
    }

    @Override // ob0.c
    public java.util.List<java.lang.Integer> runThreadWithLowEnergy() {
        java.util.List<java.lang.Integer> S0;
        aw1.l0 l0Var = aw1.l0.f14568a;
        synchronized (l0Var.i()) {
            S0 = kz5.n0.S0(l0Var.i());
        }
        return S0;
    }
}
