package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9;

/* renamed from: com.tencent.qqmusic.mediaplayer.perf.UploadVisitor */
/* loaded from: classes13.dex */
public class C25405x8c7b5b0d implements com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.C25401x58f18ffd.Visitor, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.InterfaceC25398xd1e5f964 {

    /* renamed from: prefInfos */
    private java.util.HashMap<java.lang.String, java.lang.Long> f45973xb1527d22 = new java.util.HashMap<>();

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.InterfaceC25398xd1e5f964
    /* renamed from: accept */
    public void mo94098xab27b508(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.InterfaceC25399x554ed884 interfaceC25399x554ed884) {
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.C25401x58f18ffd.Visitor
    /* renamed from: visitSpeedCheck */
    public void mo94127x6e6650ac(java.util.List<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.C25401x58f18ffd.SpeedCheck> list, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.C25401x58f18ffd.OverallInfo overallInfo) {
        for (com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.C25401x58f18ffd.SpeedCheck speedCheck : list) {
            this.f45973xb1527d22.put(speedCheck.m94122xfb82e301() + ".ms", java.lang.Long.valueOf(speedCheck.m94124xaf166881()));
            this.f45973xb1527d22.put(speedCheck.m94122xfb82e301() + ".bytes", java.lang.Long.valueOf(speedCheck.m94123x1cd27bf4()));
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.InterfaceC25398xd1e5f964
    /* renamed from: accept */
    public void mo94099xab27b508(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.InterfaceC25402xe1ccbdfe interfaceC25402xe1ccbdfe) {
        if (this.f45973xb1527d22.entrySet().isEmpty()) {
            return;
        }
        for (java.util.Map.Entry<java.lang.String, java.lang.Long> entry : this.f45973xb1527d22.entrySet()) {
            interfaceC25402xe1ccbdfe.mo94130xf2e7ce2b(entry.getKey(), entry.getValue().longValue());
        }
    }
}
