package com.tencent.mm.matrix.battery.debug;

@com.tencent.mm.feature.performance.api.AdpfAnno$SchedulePolicy$Batch
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/tencent/mm/matrix/battery/debug/AdpfExamples$TestCallbackWithBatchScheduler", "Lob0/d;", "Ljz5/f0;", "onSuspend", "onResume", "<init>", "()V", "plugin-performance_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class AdpfExamples$TestCallbackWithBatchScheduler extends ob0.d {
    public static final com.tencent.mm.matrix.battery.debug.AdpfExamples$TestCallbackWithBatchScheduler INSTANCE = new com.tencent.mm.matrix.battery.debug.AdpfExamples$TestCallbackWithBatchScheduler();

    private AdpfExamples$TestCallbackWithBatchScheduler() {
        super("TestCallbackWithBatchScheduler");
    }

    @Override // ob0.d
    public void onResume() {
        com.tencent.mars.xlog.Log.w("AdpfExamples", "couldResume");
    }

    @Override // ob0.d
    public void onSuspend() {
        com.tencent.mars.xlog.Log.w("AdpfExamples", "shouldPause");
    }
}
