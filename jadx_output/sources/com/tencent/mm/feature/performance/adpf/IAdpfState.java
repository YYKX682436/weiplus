package com.tencent.mm.feature.performance.adpf;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00062\u00020\u0001:\u0002\u0007\bJ\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/tencent/mm/feature/performance/adpf/IAdpfState;", "Lcom/tencent/matrix/lifecycle/IStatefulOwner;", "", "getName", "Lcom/tencent/mm/feature/performance/adpf/IAdpfState$IMutableAdpfState;", "asMutable", "Companion", "com/tencent/mm/feature/performance/adpf/k2", "IMutableAdpfState", "plugin-performance_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public interface IAdpfState extends com.tencent.matrix.lifecycle.IStatefulOwner {
    public static final com.tencent.mm.feature.performance.adpf.k2 Companion = com.tencent.mm.feature.performance.adpf.k2.f67439a;
    public static final java.lang.String STATE_BATTERY_LOW = "BattLevelLow";
    public static final java.lang.String STATE_BATTERY_TEMPERATURE_HIGH = "BattTempHigh";
    public static final java.lang.String STATE_BATTERY_TEMPERATURE_HIGH_CRITICAL = "BattTempHighCritical";
    public static final java.lang.String STATE_BG_SCHEDULE = "BgSchedule";
    public static final java.lang.String STATE_COMPOSITE_EMERGENCY = "CompositeEmergency";
    public static final java.lang.String STATE_COMPOSITE_FG = "CompositeFg";
    public static final java.lang.String STATE_COMPOSITE_IDLE_CHARGING = "CompositeIdleCharging";
    public static final java.lang.String STATE_COMPOSITE_ON_VIPS = "CompositeVipFg";
    public static final java.lang.String STATE_COMPOSITE_RESTRICTED = "CompositeRestricted";
    public static final java.lang.String STATE_CPU_LOAD_HIGH = "CpuLoadHigh";
    public static final java.lang.String STATE_CPU_LOAD_HIGH_CRITICAL = "CpuLoadHighCritical";
    public static final java.lang.String STATE_FG = "PidFg";
    public static final java.lang.String STATE_FG_MULTIPROCESS = "UidFg";
    public static final java.lang.String STATE_MEMORY_LOW = "MemoryLow";
    public static final java.lang.String STATE_ON_CHARGING = "OnCharging";
    public static final java.lang.String STATE_ON_FINDER = "FinderFg";
    public static final java.lang.String STATE_ON_LIVE = "LiveFg";
    public static final java.lang.String STATE_ON_LIVE_ANCHOR = "LiveAnchorFg";
    public static final java.lang.String STATE_ON_VOIP = "VoipFg";
    public static final java.lang.String STATE_POWER_SAVE_MODE_ON = "PowerSaveMode";
    public static final java.lang.String STATE_THERMAL_HIGH = "ThermalHigh";
    public static final java.lang.String STATE_THERMAL_HIGH_CRITICAL = "ThermalHighCritical";
    public static final java.lang.String STATE_UI_LAGGING = "UiLagging";

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J(\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H&J\b\u0010\t\u001a\u00020\u0002H&J\b\u0010\n\u001a\u00020\u0002H&¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/tencent/mm/feature/performance/adpf/IAdpfState$IMutableAdpfState;", "Lcom/tencent/mm/feature/performance/adpf/IAdpfState;", "", "active", "Lkotlin/Function1;", "", "Ljz5/f0;", "onToggledCallback", "toggle", "turnOnSync", "turnOffSync", "plugin-performance_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes12.dex */
    public interface IMutableAdpfState extends com.tencent.mm.feature.performance.adpf.IAdpfState {
        static /* synthetic */ boolean toggle$default(com.tencent.mm.feature.performance.adpf.IAdpfState.IMutableAdpfState iMutableAdpfState, boolean z17, yz5.l lVar, int i17, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toggle");
            }
            if ((i17 & 2) != 0) {
                lVar = null;
            }
            return iMutableAdpfState.toggle(z17, lVar);
        }

        @Override // com.tencent.mm.feature.performance.adpf.IAdpfState, com.tencent.matrix.lifecycle.IStatefulOwner, com.tencent.matrix.lifecycle.l
        /* synthetic */ boolean active();

        @Override // com.tencent.mm.feature.performance.adpf.IAdpfState, com.tencent.matrix.lifecycle.IStatefulOwner
        /* synthetic */ void observeForever(com.tencent.matrix.lifecycle.k kVar);

        @Override // com.tencent.mm.feature.performance.adpf.IAdpfState, com.tencent.matrix.lifecycle.IStatefulOwner
        /* synthetic */ void observeWithLifecycle(androidx.lifecycle.y yVar, com.tencent.matrix.lifecycle.k kVar);

        @Override // com.tencent.mm.feature.performance.adpf.IAdpfState, com.tencent.matrix.lifecycle.IStatefulOwner
        /* synthetic */ void removeObserver(com.tencent.matrix.lifecycle.k kVar);

        boolean toggle(boolean z17, yz5.l lVar);

        boolean turnOffSync();

        boolean turnOnSync();
    }

    @Override // com.tencent.matrix.lifecycle.IStatefulOwner, com.tencent.matrix.lifecycle.l
    /* synthetic */ boolean active();

    default com.tencent.mm.feature.performance.adpf.IAdpfState.IMutableAdpfState asMutable() {
        return (com.tencent.mm.feature.performance.adpf.IAdpfState.IMutableAdpfState) this;
    }

    java.lang.String getName();

    @Override // com.tencent.matrix.lifecycle.IStatefulOwner
    /* synthetic */ void observeForever(com.tencent.matrix.lifecycle.k kVar);

    @Override // com.tencent.matrix.lifecycle.IStatefulOwner
    /* synthetic */ void observeWithLifecycle(androidx.lifecycle.y yVar, com.tencent.matrix.lifecycle.k kVar);

    @Override // com.tencent.matrix.lifecycle.IStatefulOwner
    /* synthetic */ void removeObserver(com.tencent.matrix.lifecycle.k kVar);
}
