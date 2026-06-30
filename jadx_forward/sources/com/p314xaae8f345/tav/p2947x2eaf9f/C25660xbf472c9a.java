package com.p314xaae8f345.tav.p2947x2eaf9f;

/* renamed from: com.tencent.tav.core.AssetParallelReader */
/* loaded from: classes16.dex */
public class C25660xbf472c9a implements com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694.StatusListener {

    /* renamed from: asset */
    private com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0 f47310x58ceaf0;

    /* renamed from: audioTimeRange */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 f47311xed7233a;

    /* renamed from: contextCreate */
    private com.p314xaae8f345.tav.p2947x2eaf9f.InterfaceC25683x77c631c2 f47312xdfe8838b;

    /* renamed from: videoTimeRange */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 f47318x14519435;

    /* renamed from: status */
    private com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25654x6c9d95f0 f47316xcacdcff2 = com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25654x6c9d95f0.AssetReaderStatusUnknown;

    /* renamed from: errMsg */
    private java.lang.String f47313xb2d4efdc = "";

    /* renamed from: videoSegmentTimeRange */
    private java.util.ArrayList<com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26> f47317xdf0b9b18 = new java.util.ArrayList<>();

    /* renamed from: outputs */
    private java.util.List<com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694> f47315xbe120792 = new java.util.ArrayList();

    /* renamed from: outputStatusHashMap */
    private java.util.HashMap<com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694, com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25654x6c9d95f0> f47314x913ffd9b = new java.util.HashMap<>();

    public C25660xbf472c9a(com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0 abstractC25633x3c9fad0) {
        this.f47310x58ceaf0 = abstractC25633x3c9fad0;
    }

    /* renamed from: updateAssetStatus */
    private void m96512x6d0fa79() {
        java.util.Iterator<com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694> it = this.f47315xbe120792.iterator();
        boolean z17 = true;
        while (true) {
            boolean z18 = false;
            if (!it.hasNext()) {
                break;
            }
            if (this.f47314x913ffd9b.get(it.next()) == com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25654x6c9d95f0.AssetReaderStatusCompleted) {
                z18 = true;
            }
            z17 &= z18;
        }
        if (z17) {
            this.f47316xcacdcff2 = com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25654x6c9d95f0.AssetReaderStatusCompleted;
            return;
        }
        boolean z19 = true;
        for (com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694 abstractC25664x249c1694 : this.f47315xbe120792) {
            z19 &= this.f47314x913ffd9b.get(abstractC25664x249c1694) == com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25654x6c9d95f0.AssetReaderStatusReading || this.f47314x913ffd9b.get(abstractC25664x249c1694) == com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25654x6c9d95f0.AssetReaderStatusCompleted;
        }
        if (z19) {
            this.f47316xcacdcff2 = com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25654x6c9d95f0.AssetReaderStatusReading;
            return;
        }
        java.util.Iterator<com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694> it6 = this.f47315xbe120792.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25654x6c9d95f0 enumC25654x6c9d95f0 = this.f47314x913ffd9b.get(it6.next());
            com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25654x6c9d95f0 enumC25654x6c9d95f02 = com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25654x6c9d95f0.AssetReaderStatusFailed;
            if (enumC25654x6c9d95f0 == enumC25654x6c9d95f02) {
                this.f47316xcacdcff2 = enumC25654x6c9d95f02;
                return;
            }
        }
        java.util.Iterator<com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694> it7 = this.f47315xbe120792.iterator();
        while (it7.hasNext()) {
            com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25654x6c9d95f0 enumC25654x6c9d95f03 = this.f47314x913ffd9b.get(it7.next());
            com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25654x6c9d95f0 enumC25654x6c9d95f04 = com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25654x6c9d95f0.AssetReaderStatusCancelled;
            if (enumC25654x6c9d95f03 == enumC25654x6c9d95f04) {
                this.f47316xcacdcff2 = enumC25654x6c9d95f04;
                return;
            }
        }
    }

    /* renamed from: addOutput */
    public void m96513xf948c102(com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694 abstractC25664x249c1694) {
        if (m96514xcca42b12(abstractC25664x249c1694)) {
            this.f47315xbe120792.add(abstractC25664x249c1694);
        }
    }

    /* renamed from: canAddOutput */
    public boolean m96514xcca42b12(com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694 abstractC25664x249c1694) {
        return (abstractC25664x249c1694 == null || this.f47315xbe120792.contains(abstractC25664x249c1694)) ? false : true;
    }

    /* renamed from: cancelReading */
    public void m96515x8f43dab2() {
        for (com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694 abstractC25664x249c1694 : this.f47315xbe120792) {
            this.f47314x913ffd9b.put(abstractC25664x249c1694, com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25654x6c9d95f0.AssetReaderStatusCancelled);
            abstractC25664x249c1694.mo96546x41012807();
        }
        m96512x6d0fa79();
    }

    /* renamed from: getAsset */
    public com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0 m96516x742a913a() {
        return this.f47310x58ceaf0;
    }

    /* renamed from: getAudioTimeRange */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 m96517xfd6ef030() {
        return this.f47311xed7233a;
    }

    /* renamed from: getErrMsg */
    public java.lang.String m96518x17ec12d2() {
        return this.f47313xb2d4efdc;
    }

    /* renamed from: getOutputs */
    public java.util.List<com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694> m96519xfbdf435c() {
        return this.f47315xbe120792;
    }

    /* renamed from: getStatus */
    public com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25654x6c9d95f0 m96520x2fe4f2e8() {
        return this.f47316xcacdcff2;
    }

    /* renamed from: getVideoTimeRange */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 m96521x2e9612b() {
        return this.f47318x14519435;
    }

    /* renamed from: release */
    public void m96522x41012807() {
        java.util.Iterator<com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694> it = this.f47315xbe120792.iterator();
        while (it.hasNext()) {
            it.next().mo96546x41012807();
        }
    }

    /* renamed from: setAudioTimeRange */
    public void m96523xc565583c(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        this.f47311xed7233a = c25738xead39d26;
    }

    /* renamed from: setVideoTimeRange */
    public void m96524xcadfc937(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        this.f47318x14519435 = c25738xead39d26;
    }

    /* renamed from: startReading */
    public boolean m96525x38624fca(com.p314xaae8f345.tav.p2947x2eaf9f.InterfaceC25683x77c631c2 interfaceC25683x77c631c2) {
        this.f47312xdfe8838b = interfaceC25683x77c631c2;
        for (com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694 abstractC25664x249c1694 : this.f47315xbe120792) {
            this.f47314x913ffd9b.put(abstractC25664x249c1694, com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25654x6c9d95f0.AssetReaderStatusReading);
            if (abstractC25664x249c1694.f47343x7f94e13e == 1) {
                com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26 = this.f47317xdf0b9b18.get(0);
                this.f47317xdf0b9b18.remove(0);
                abstractC25664x249c1694.mo96550x68ac462(interfaceC25683x77c631c2, c25738xead39d26);
            } else {
                abstractC25664x249c1694.mo96550x68ac462(null, m96517xfd6ef030());
            }
            abstractC25664x249c1694.m96551xbaafdc7(this);
        }
        m96512x6d0fa79();
        return this.f47315xbe120792.size() > 0;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694.StatusListener
    /* renamed from: statusChanged */
    public void mo96526xb9fbb662(com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694 abstractC25664x249c1694, com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25654x6c9d95f0 enumC25654x6c9d95f0) {
        this.f47314x913ffd9b.put(abstractC25664x249c1694, enumC25654x6c9d95f0);
        m96512x6d0fa79();
    }
}
