package com.p314xaae8f345.tav.p2947x2eaf9f;

/* renamed from: com.tencent.tav.core.AssetReader */
/* loaded from: classes16.dex */
public class C25662xaba0e3b3 implements com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694.StatusListener {

    /* renamed from: asset */
    private com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0 f47330x58ceaf0;

    /* renamed from: contextCreate */
    private com.p314xaae8f345.tav.p2947x2eaf9f.InterfaceC25683x77c631c2 f47331xdfe8838b;

    /* renamed from: timeRange */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 f47336x16fae70;

    /* renamed from: status */
    private com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25654x6c9d95f0 f47335xcacdcff2 = com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25654x6c9d95f0.AssetReaderStatusUnknown;

    /* renamed from: errMsg */
    private java.lang.String f47332xb2d4efdc = "";

    /* renamed from: outputs */
    private java.util.List<com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694> f47334xbe120792 = new java.util.ArrayList();

    /* renamed from: outputStatusHashMap */
    private java.util.HashMap<com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694, com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25654x6c9d95f0> f47333x913ffd9b = new java.util.HashMap<>();

    public C25662xaba0e3b3(com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0 abstractC25633x3c9fad0) {
        this.f47330x58ceaf0 = abstractC25633x3c9fad0;
    }

    /* renamed from: updateAssetStatus */
    private void m96531x6d0fa79() {
        java.util.Iterator<com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694> it = this.f47334xbe120792.iterator();
        boolean z17 = true;
        while (true) {
            boolean z18 = false;
            if (!it.hasNext()) {
                break;
            }
            if (this.f47333x913ffd9b.get(it.next()) == com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25654x6c9d95f0.AssetReaderStatusCompleted) {
                z18 = true;
            }
            z17 &= z18;
        }
        if (z17) {
            this.f47335xcacdcff2 = com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25654x6c9d95f0.AssetReaderStatusCompleted;
            return;
        }
        boolean z19 = true;
        for (com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694 abstractC25664x249c1694 : this.f47334xbe120792) {
            z19 &= this.f47333x913ffd9b.get(abstractC25664x249c1694) == com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25654x6c9d95f0.AssetReaderStatusReading || this.f47333x913ffd9b.get(abstractC25664x249c1694) == com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25654x6c9d95f0.AssetReaderStatusCompleted;
        }
        if (z19) {
            this.f47335xcacdcff2 = com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25654x6c9d95f0.AssetReaderStatusReading;
            return;
        }
        java.util.Iterator<com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694> it6 = this.f47334xbe120792.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25654x6c9d95f0 enumC25654x6c9d95f0 = this.f47333x913ffd9b.get(it6.next());
            com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25654x6c9d95f0 enumC25654x6c9d95f02 = com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25654x6c9d95f0.AssetReaderStatusFailed;
            if (enumC25654x6c9d95f0 == enumC25654x6c9d95f02) {
                this.f47335xcacdcff2 = enumC25654x6c9d95f02;
                return;
            }
        }
        java.util.Iterator<com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694> it7 = this.f47334xbe120792.iterator();
        while (it7.hasNext()) {
            com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25654x6c9d95f0 enumC25654x6c9d95f03 = this.f47333x913ffd9b.get(it7.next());
            com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25654x6c9d95f0 enumC25654x6c9d95f04 = com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25654x6c9d95f0.AssetReaderStatusCancelled;
            if (enumC25654x6c9d95f03 == enumC25654x6c9d95f04) {
                this.f47335xcacdcff2 = enumC25654x6c9d95f04;
                return;
            }
        }
    }

    /* renamed from: addOutput */
    public void m96532xf948c102(com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694 abstractC25664x249c1694) {
        if (m96533xcca42b12(abstractC25664x249c1694)) {
            this.f47334xbe120792.add(abstractC25664x249c1694);
        }
    }

    /* renamed from: canAddOutput */
    public boolean m96533xcca42b12(com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694 abstractC25664x249c1694) {
        return (abstractC25664x249c1694 == null || this.f47334xbe120792.contains(abstractC25664x249c1694)) ? false : true;
    }

    /* renamed from: cancelReading */
    public void m96534x8f43dab2() {
        for (com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694 abstractC25664x249c1694 : this.f47334xbe120792) {
            this.f47333x913ffd9b.put(abstractC25664x249c1694, com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25654x6c9d95f0.AssetReaderStatusCancelled);
            abstractC25664x249c1694.mo96546x41012807();
        }
        m96531x6d0fa79();
    }

    /* renamed from: getAsset */
    public com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0 m96535x742a913a() {
        return this.f47330x58ceaf0;
    }

    /* renamed from: getErrMsg */
    public java.lang.String m96536x17ec12d2() {
        return this.f47332xb2d4efdc;
    }

    /* renamed from: getOutputs */
    public java.util.List<com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694> m96537xfbdf435c() {
        return this.f47334xbe120792;
    }

    /* renamed from: getStatus */
    public com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25654x6c9d95f0 m96538x2fe4f2e8() {
        return this.f47335xcacdcff2;
    }

    /* renamed from: getTimeRange */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 m96539xdd1fba() {
        return this.f47336x16fae70;
    }

    /* renamed from: setTimeRange */
    public void m96540x5d30e02e(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        this.f47336x16fae70 = c25738xead39d26;
    }

    /* renamed from: startReading */
    public boolean m96541x38624fca(com.p314xaae8f345.tav.p2947x2eaf9f.InterfaceC25683x77c631c2 interfaceC25683x77c631c2) {
        this.f47331xdfe8838b = interfaceC25683x77c631c2;
        for (com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694 abstractC25664x249c1694 : this.f47334xbe120792) {
            this.f47333x913ffd9b.put(abstractC25664x249c1694, com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25654x6c9d95f0.AssetReaderStatusReading);
            if (abstractC25664x249c1694.f47343x7f94e13e == 1) {
                abstractC25664x249c1694.mo96550x68ac462(interfaceC25683x77c631c2, m96539xdd1fba());
            } else {
                abstractC25664x249c1694.mo96550x68ac462(null, m96539xdd1fba());
            }
            abstractC25664x249c1694.m96551xbaafdc7(this);
        }
        m96531x6d0fa79();
        return this.f47334xbe120792.size() > 0;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694.StatusListener
    /* renamed from: statusChanged */
    public void mo96526xb9fbb662(com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694 abstractC25664x249c1694, com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25654x6c9d95f0 enumC25654x6c9d95f0) {
        this.f47333x913ffd9b.put(abstractC25664x249c1694, enumC25654x6c9d95f0);
        m96531x6d0fa79();
    }
}
