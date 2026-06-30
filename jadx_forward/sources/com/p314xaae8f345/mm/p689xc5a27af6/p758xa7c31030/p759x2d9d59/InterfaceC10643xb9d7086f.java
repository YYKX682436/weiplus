package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00062\u00020\u0001:\u0002\u0007\bJ\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/tencent/mm/feature/performance/adpf/IAdpfState;", "Lcom/tencent/matrix/lifecycle/IStatefulOwner;", "", "getName", "Lcom/tencent/mm/feature/performance/adpf/IAdpfState$IMutableAdpfState;", "asMutable", "Companion", "com/tencent/mm/feature/performance/adpf/k2", "IMutableAdpfState", "plugin-performance_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.performance.adpf.IAdpfState */
/* loaded from: classes12.dex */
public interface InterfaceC10643xb9d7086f extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4662x21f4acfe {

    /* renamed from: Companion */
    public static final com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.k2 f28887x233c02ec = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.k2.f148972a;

    /* renamed from: STATE_BATTERY_LOW */
    public static final java.lang.String f28888x35a9db14 = "BattLevelLow";

    /* renamed from: STATE_BATTERY_TEMPERATURE_HIGH */
    public static final java.lang.String f28889x1e581cd = "BattTempHigh";

    /* renamed from: STATE_BATTERY_TEMPERATURE_HIGH_CRITICAL */
    public static final java.lang.String f28890x98f1cdd1 = "BattTempHighCritical";

    /* renamed from: STATE_BG_SCHEDULE */
    public static final java.lang.String f28891x6a6f3283 = "BgSchedule";

    /* renamed from: STATE_COMPOSITE_EMERGENCY */
    public static final java.lang.String f28892x6d9274cb = "CompositeEmergency";

    /* renamed from: STATE_COMPOSITE_FG */
    public static final java.lang.String f28893xd4779aa7 = "CompositeFg";

    /* renamed from: STATE_COMPOSITE_IDLE_CHARGING */
    public static final java.lang.String f28894xb7503cd6 = "CompositeIdleCharging";

    /* renamed from: STATE_COMPOSITE_ON_VIPS */
    public static final java.lang.String f28895x329ee430 = "CompositeVipFg";

    /* renamed from: STATE_COMPOSITE_RESTRICTED */
    public static final java.lang.String f28896x35694041 = "CompositeRestricted";

    /* renamed from: STATE_CPU_LOAD_HIGH */
    public static final java.lang.String f28897x9c332c16 = "CpuLoadHigh";

    /* renamed from: STATE_CPU_LOAD_HIGH_CRITICAL */
    public static final java.lang.String f28898xb354a5a8 = "CpuLoadHighCritical";

    /* renamed from: STATE_FG */
    public static final java.lang.String f28899x7d387f4f = "PidFg";

    /* renamed from: STATE_FG_MULTIPROCESS */
    public static final java.lang.String f28900x9f0d1206 = "UidFg";

    /* renamed from: STATE_MEMORY_LOW */
    public static final java.lang.String f28901x21a7a784 = "MemoryLow";

    /* renamed from: STATE_ON_CHARGING */
    public static final java.lang.String f28902x27412e03 = "OnCharging";

    /* renamed from: STATE_ON_FINDER */
    public static final java.lang.String f28903xa2240438 = "FinderFg";

    /* renamed from: STATE_ON_LIVE */
    public static final java.lang.String f28904x31761d7e = "LiveFg";

    /* renamed from: STATE_ON_LIVE_ANCHOR */
    public static final java.lang.String f28905x15790c96 = "LiveAnchorFg";

    /* renamed from: STATE_ON_VOIP */
    public static final java.lang.String f28906x317abe32 = "VoipFg";

    /* renamed from: STATE_POWER_SAVE_MODE_ON */
    public static final java.lang.String f28907x7a6d18e1 = "PowerSaveMode";

    /* renamed from: STATE_THERMAL_HIGH */
    public static final java.lang.String f28908x49081a78 = "ThermalHigh";

    /* renamed from: STATE_THERMAL_HIGH_CRITICAL */
    public static final java.lang.String f28909x48c586 = "ThermalHighCritical";

    /* renamed from: STATE_UI_LAGGING */
    public static final java.lang.String f28910xa61c6470 = "UiLagging";

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J(\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H&J\b\u0010\t\u001a\u00020\u0002H&J\b\u0010\n\u001a\u00020\u0002H&¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/tencent/mm/feature/performance/adpf/IAdpfState$IMutableAdpfState;", "Lcom/tencent/mm/feature/performance/adpf/IAdpfState;", "", "active", "Lkotlin/Function1;", "", "Ljz5/f0;", "onToggledCallback", "toggle", "turnOnSync", "turnOffSync", "plugin-performance_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.feature.performance.adpf.IAdpfState$IMutableAdpfState */
    /* loaded from: classes12.dex */
    public interface IMutableAdpfState extends com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f {
        /* renamed from: toggle$default */
        static /* synthetic */ boolean m45073x49864cf1(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.IMutableAdpfState iMutableAdpfState, boolean z17, yz5.l lVar, int i17, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toggle");
            }
            if ((i17 & 2) != 0) {
                lVar = null;
            }
            return iMutableAdpfState.mo45066xcc3ebb54(z17, lVar);
        }

        @Override // com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4662x21f4acfe, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.l
        /* renamed from: active */
        /* synthetic */ boolean mo40960xab2f7f06();

        @Override // com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4662x21f4acfe
        /* renamed from: observeForever */
        /* synthetic */ void mo40966xc74540ab(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k kVar);

        @Override // com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4662x21f4acfe
        /* renamed from: observeWithLifecycle */
        /* synthetic */ void mo40967x96d2e188(p012xc85e97e9.p093xedfae76a.y yVar, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k kVar);

        @Override // com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4662x21f4acfe
        /* renamed from: removeObserver */
        /* synthetic */ void mo40970xb5bdeb7a(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k kVar);

        /* renamed from: toggle */
        boolean mo45066xcc3ebb54(boolean z17, yz5.l lVar);

        /* renamed from: turnOffSync */
        boolean mo45067xcd4bed6d();

        /* renamed from: turnOnSync */
        boolean mo45068xfec5eff7();
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4662x21f4acfe, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.l
    /* renamed from: active */
    /* synthetic */ boolean mo40960xab2f7f06();

    /* renamed from: asMutable */
    default com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.IMutableAdpfState m45071x8f8c4694() {
        return (com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.IMutableAdpfState) this;
    }

    /* renamed from: getName */
    java.lang.String mo45065xfb82e301();

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4662x21f4acfe
    /* renamed from: observeForever */
    /* synthetic */ void mo40966xc74540ab(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k kVar);

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4662x21f4acfe
    /* renamed from: observeWithLifecycle */
    /* synthetic */ void mo40967x96d2e188(p012xc85e97e9.p093xedfae76a.y yVar, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k kVar);

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4662x21f4acfe
    /* renamed from: removeObserver */
    /* synthetic */ void mo40970xb5bdeb7a(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k kVar);
}
