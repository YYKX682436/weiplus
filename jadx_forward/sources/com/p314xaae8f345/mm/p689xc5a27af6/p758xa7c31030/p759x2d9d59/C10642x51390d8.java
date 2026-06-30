package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0004\u001a\u00020\u0003H\u0016J&\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016R\u0014\u0010\u000e\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/feature/performance/adpf/AdpfStateImpl;", "Lcom/tencent/matrix/lifecycle/StatefulOwner;", "Lcom/tencent/mm/feature/performance/adpf/IAdpfState$IMutableAdpfState;", "", "getName", "", "active", "Lkotlin/Function1;", "", "Ljz5/f0;", "onToggledCallback", "toggle", "turnOnSync", "turnOffSync", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "plugin-performance_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.performance.adpf.AdpfStateImpl */
/* loaded from: classes12.dex */
public final class C10642x51390d8 extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.C4666xb9b62ea7 implements com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.IMutableAdpfState {
    private final java.lang.String name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10642x51390d8(java.lang.String name) {
        super(true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.name = name;
    }

    @Override // com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f
    /* renamed from: getName, reason: from getter */
    public java.lang.String getF28911xddfceb18() {
        return this.name;
    }

    @Override // com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.IMutableAdpfState
    /* renamed from: toggle */
    public boolean mo45066xcc3ebb54(boolean z17, yz5.l lVar) {
        boolean mo45068xfec5eff7 = z17 ? mo45068xfec5eff7() : mo45067xcd4bed6d();
        if (mo45068xfec5eff7 && lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.valueOf(mo40960xab2f7f06()));
        }
        return mo45068xfec5eff7;
    }

    @Override // com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.IMutableAdpfState
    /* renamed from: turnOffSync */
    public boolean mo45067xcd4bed6d() {
        if (mo40960xab2f7f06()) {
            m40992xc67387b2();
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfState", "turnOffSync skip: reentrant");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.IMutableAdpfState
    /* renamed from: turnOnSync */
    public boolean mo45068xfec5eff7() {
        if (mo40960xab2f7f06()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfState", "turnOnSync skip: reentrant");
            return false;
        }
        m40993xcc985f3c();
        return true;
    }
}
