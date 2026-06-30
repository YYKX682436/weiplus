package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9;

/* renamed from: com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Stsc */
/* loaded from: classes16.dex */
public class C25426x277c91 extends com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.AbstractC25421x44bf3c9c {

    /* renamed from: entryCount */
    int f46040x894ecfbd;

    /* renamed from: firstChunk */
    int[] f46041xf4da8d9d;

    /* renamed from: sampleDescIndex */
    int[] f46042xde2a1637;

    /* renamed from: samplesPerChunk */
    int[] f46043xc5ec3679;

    /* renamed from: getEntryCount */
    public int m94226x778f87b3() {
        return this.f46040x894ecfbd;
    }

    /* renamed from: getFirstChunk */
    public int[] m94227xe31b4593() {
        return this.f46041xf4da8d9d;
    }

    /* renamed from: getSampleDescIndex */
    public int[] m94228xc28be801() {
        return this.f46042xde2a1637;
    }

    /* renamed from: getSamplesPerChunk */
    public int[] m94229xaa4e0843() {
        return this.f46043xc5ec3679;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.AbstractC25421x44bf3c9c, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.Box, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.InterfaceC25423x5d15a765
    /* renamed from: parse */
    public void mo94215x6581ab3(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.InterfaceC25408x4aa5146c interfaceC25408x4aa5146c, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.Box box) {
        super.mo94215x6581ab3(interfaceC25408x4aa5146c, box);
        int mo94151x40655679 = interfaceC25408x4aa5146c.mo94151x40655679();
        this.f46040x894ecfbd = mo94151x40655679;
        int[] iArr = new int[mo94151x40655679];
        this.f46041xf4da8d9d = iArr;
        int[] iArr2 = new int[mo94151x40655679];
        this.f46043xc5ec3679 = iArr2;
        int[] iArr3 = new int[mo94151x40655679];
        this.f46042xde2a1637 = iArr3;
        interfaceC25408x4aa5146c.mo94153xcc8fd4e9(mo94151x40655679, iArr, iArr2, iArr3);
    }
}
