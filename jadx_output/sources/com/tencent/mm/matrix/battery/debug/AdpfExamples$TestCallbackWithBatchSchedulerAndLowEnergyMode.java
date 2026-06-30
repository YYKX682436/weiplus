package com.tencent.mm.matrix.battery.debug;

@com.tencent.mm.feature.performance.api.AdpfAnno$SchedulePolicy$Batch
@com.tencent.mm.feature.performance.api.AdpfAnno$Callbacks$RunThreadsWithLowEnergy(suspendWhenFailed = true)
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¨\u0006\u000b"}, d2 = {"com/tencent/mm/matrix/battery/debug/AdpfExamples$TestCallbackWithBatchSchedulerAndLowEnergyMode", "Lob0/d;", "Lob0/c;", "Ljz5/f0;", "onSuspend", "onResume", "", "", "runThreadWithLowEnergy", "<init>", "()V", "plugin-performance_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class AdpfExamples$TestCallbackWithBatchSchedulerAndLowEnergyMode extends ob0.d implements ob0.c {
    public static final com.tencent.mm.matrix.battery.debug.AdpfExamples$TestCallbackWithBatchSchedulerAndLowEnergyMode INSTANCE = new com.tencent.mm.matrix.battery.debug.AdpfExamples$TestCallbackWithBatchSchedulerAndLowEnergyMode();

    private AdpfExamples$TestCallbackWithBatchSchedulerAndLowEnergyMode() {
        super("TestCallbackWithBatchSchedulerAndLowEnergyMode");
    }

    @Override // ob0.d
    public void onResume() {
        com.tencent.mars.xlog.Log.w("AdpfExamples", "couldResume");
    }

    @Override // ob0.d
    public void onSuspend() {
        com.tencent.mars.xlog.Log.w("AdpfExamples", "shouldPause");
    }

    @Override // ob0.c
    public java.util.List<java.lang.Integer> runThreadWithLowEnergy() {
        return kz5.p0.f313996d;
    }
}
