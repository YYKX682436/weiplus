package com.p314xaae8f345.tav.p2947x2eaf9f;

/* renamed from: com.tencent.tav.core.AssetReaderOutput */
/* loaded from: classes16.dex */
public abstract class AbstractC25664x249c1694 {

    /* renamed from: mediaType */
    protected int f47343x7f94e13e;

    /* renamed from: statusListener */
    private com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694.StatusListener f47344x8056e6c6;

    /* renamed from: timeRange */
    protected com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 f47346x16fae70;

    /* renamed from: alwaysCopiesSampleData */
    protected boolean f47341x177af3d6 = false;

    /* renamed from: supportsRandomAccess */
    protected boolean f47345x6f14d0ab = false;

    /* renamed from: logger */
    protected com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1 f47342xbe97f590 = new com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1();

    /* renamed from: com.tencent.tav.core.AssetReaderOutput$StatusListener */
    /* loaded from: classes16.dex */
    public interface StatusListener {
        /* renamed from: statusChanged */
        void mo96526xb9fbb662(com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694 abstractC25664x249c1694, com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25654x6c9d95f0 enumC25654x6c9d95f0);
    }

    /* renamed from: addStatusListener */
    public void m96551xbaafdc7(com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694.StatusListener statusListener) {
        this.f47344x8056e6c6 = statusListener;
    }

    /* renamed from: copyNextSampleBuffer */
    public final com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m96552xf57602b2(boolean z17) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 mo96545x471e991d = mo96545x471e991d(z17);
        if (mo96545x471e991d.m97195xfb85bb43().m97232x31040141() > 0) {
            return mo96545x471e991d;
        }
        if (mo96545x471e991d.m97193x75286adb().m97206x8311a768() == -1) {
            com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694.StatusListener statusListener = this.f47344x8056e6c6;
            if (statusListener != null) {
                statusListener.mo96526xb9fbb662(this, com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25654x6c9d95f0.AssetReaderStatusCompleted);
            }
            return mo96545x471e991d;
        }
        com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694.StatusListener statusListener2 = this.f47344x8056e6c6;
        if (statusListener2 != null) {
            statusListener2.mo96526xb9fbb662(this, com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25654x6c9d95f0.AssetReaderStatusFailed);
        }
        return mo96545x471e991d;
    }

    /* renamed from: duration */
    public long m96553x89444d94() {
        return 0L;
    }

    /* renamed from: getDecodePerformance */
    public com.p314xaae8f345.tav.p2968xc84c5534.C25854x244e356b mo96554xc291ccac() {
        return null;
    }

    /* renamed from: getMediaType */
    public int m96555x7f025288() {
        return this.f47343x7f94e13e;
    }

    /* renamed from: isAlwaysCopiesSampleData */
    public boolean m96556xf7af11a0() {
        return this.f47341x177af3d6;
    }

    /* renamed from: isSupportsRandomAccess */
    public boolean m96557x5069d8f5() {
        return this.f47345x6f14d0ab;
    }

    /* renamed from: markConfigurationAsFinal */
    public abstract void mo96544xcf9728fb();

    /* renamed from: nextSampleBuffer */
    public abstract com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 mo96545x471e991d(boolean z17);

    /* renamed from: release */
    public abstract void mo96546x41012807();

    /* renamed from: reset */
    public void mo96558x6761d4f(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
    }

    /* renamed from: resetForReadingTimeRanges */
    public abstract void mo96547x3bbb5dd5(java.util.List<com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26> list);

    /* renamed from: setAlwaysCopiesSampleData */
    public void m96559xb38d06d8(boolean z17) {
        this.f47341x177af3d6 = z17;
    }

    /* renamed from: setLoggerConfig */
    public void m96560x596d8674(com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25800x8b670e73 c25800x8b670e73) {
        this.f47342xbe97f590.m97816x78bda44(c25800x8b670e73);
    }

    /* renamed from: setSupportsRandomAccess */
    public void m96561x9733bc2d(boolean z17) {
        this.f47345x6f14d0ab = z17;
    }

    /* renamed from: start */
    public void mo96550x68ac462(com.p314xaae8f345.tav.p2947x2eaf9f.InterfaceC25683x77c631c2 interfaceC25683x77c631c2, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        this.f47346x16fae70 = c25738xead39d26;
    }
}
