package com.tencent.mm.feature.performance.adpf;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0004\u001a\u00020\u0003H\u0016J&\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016R\u0014\u0010\u000e\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/feature/performance/adpf/AdpfStateImpl;", "Lcom/tencent/matrix/lifecycle/StatefulOwner;", "Lcom/tencent/mm/feature/performance/adpf/IAdpfState$IMutableAdpfState;", "", "getName", "", "active", "Lkotlin/Function1;", "", "Ljz5/f0;", "onToggledCallback", "toggle", "turnOnSync", "turnOffSync", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "plugin-performance_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class AdpfStateImpl extends com.tencent.matrix.lifecycle.StatefulOwner implements com.tencent.mm.feature.performance.adpf.IAdpfState.IMutableAdpfState {
    private final java.lang.String name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdpfStateImpl(java.lang.String name) {
        super(true);
        kotlin.jvm.internal.o.g(name, "name");
        this.name = name;
    }

    @Override // com.tencent.mm.feature.performance.adpf.IAdpfState
    /* renamed from: getName, reason: from getter */
    public java.lang.String get$stateName() {
        return this.name;
    }

    @Override // com.tencent.mm.feature.performance.adpf.IAdpfState.IMutableAdpfState
    public boolean toggle(boolean z17, yz5.l lVar) {
        boolean turnOnSync = z17 ? turnOnSync() : turnOffSync();
        if (turnOnSync && lVar != null) {
            lVar.invoke(java.lang.Boolean.valueOf(active()));
        }
        return turnOnSync;
    }

    @Override // com.tencent.mm.feature.performance.adpf.IAdpfState.IMutableAdpfState
    public boolean turnOffSync() {
        if (active()) {
            turnOff();
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AdpfState", "turnOffSync skip: reentrant");
        return false;
    }

    @Override // com.tencent.mm.feature.performance.adpf.IAdpfState.IMutableAdpfState
    public boolean turnOnSync() {
        if (active()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdpfState", "turnOnSync skip: reentrant");
            return false;
        }
        turnOn();
        return true;
    }
}
