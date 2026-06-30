package com.tencent.mm.matrix.battery.debug;

@com.tencent.mm.feature.performance.api.AdpfAnno$Callbacks$BindingUI(activityNames = {"com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI"})
@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J \u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\"\u0010\u0011\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"com/tencent/mm/matrix/battery/debug/AdpfExamples$TestCallbackWithAdvancedConf", "Lob0/d;", "Lob0/c;", "Lob0/b;", "Ljz5/f0;", "onSuspend", "onResume", "", "", "runThreadWithLowEnergy", "Lob0/g;", "allStates", "", "currState", "", "onOrOff", "onStateChanged", "tid", "I", "getTid", "()I", "setTid", "(I)V", "<init>", "()V", "plugin-performance_release"}, k = 1, mv = {1, 9, 0})
@com.tencent.mm.feature.performance.api.AdpfAnno$SchedulePolicy$Batch
@com.tencent.mm.feature.performance.api.AdpfAnno$Callbacks$RunThreadsWithLowEnergy
@com.tencent.mm.feature.performance.api.AdpfAnno$Callbacks$OnStatesChanged(filter = {})
/* loaded from: classes12.dex */
public final class AdpfExamples$TestCallbackWithAdvancedConf extends ob0.d implements ob0.c, ob0.b {
    public static final com.tencent.mm.matrix.battery.debug.AdpfExamples$TestCallbackWithAdvancedConf INSTANCE = new com.tencent.mm.matrix.battery.debug.AdpfExamples$TestCallbackWithAdvancedConf();
    private static int tid;

    private AdpfExamples$TestCallbackWithAdvancedConf() {
        super("TestCallbackWithLowEnergyMode");
    }

    public final int getTid() {
        return tid;
    }

    @Override // ob0.d
    public void onResume() {
        com.tencent.mars.xlog.Log.w("AdpfExamples", "couldResume");
    }

    @Override // ob0.b
    public void onStateChanged(ob0.g allStates, java.lang.String currState, boolean z17) {
        kotlin.jvm.internal.o.g(allStates, "allStates");
        kotlin.jvm.internal.o.g(currState, "currState");
        com.tencent.mars.xlog.Log.w("AdpfExamples", currState + ">>" + z17);
        boolean active = com.tencent.mm.feature.performance.adpf.k2.f67439a.e(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_BATTERY_TEMPERATURE_HIGH_CRITICAL).active();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isBattTempVeryHigh=");
        sb6.append(active);
        com.tencent.mars.xlog.Log.w("AdpfExamples", sb6.toString());
    }

    @Override // ob0.d
    public void onSuspend() {
        com.tencent.mars.xlog.Log.w("AdpfExamples", "shouldPause");
    }

    @Override // ob0.c
    public java.util.List<java.lang.Integer> runThreadWithLowEnergy() {
        com.tencent.mars.xlog.Log.w("AdpfExamples", "runWithLowEnergy");
        return kz5.b0.c(java.lang.Integer.valueOf(tid));
    }

    public final void setTid(int i17) {
        tid = i17;
    }
}
