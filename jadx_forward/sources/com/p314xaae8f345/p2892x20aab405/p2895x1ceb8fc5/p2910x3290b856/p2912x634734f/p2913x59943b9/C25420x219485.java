package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9;

/* renamed from: com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Ftyp */
/* loaded from: classes16.dex */
public class C25420x219485 extends com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.Box {

    /* renamed from: compatibleBrands */
    int[] f46028x35787dc0;

    /* renamed from: majorBrand */
    int f46029xeaa3514e;

    /* renamed from: minorVersion */
    int f46030x541f2763;

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.Box, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.InterfaceC25423x5d15a765
    /* renamed from: parse */
    public void mo94215x6581ab3(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.InterfaceC25408x4aa5146c interfaceC25408x4aa5146c, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.Box box) {
        super.mo94215x6581ab3(interfaceC25408x4aa5146c, box);
        this.f46029xeaa3514e = interfaceC25408x4aa5146c.mo94151x40655679();
        this.f46030x541f2763 = interfaceC25408x4aa5146c.mo94151x40655679();
        int mo94149xd4418ac9 = ((int) interfaceC25408x4aa5146c.mo94149xd4418ac9()) / 4;
        if (mo94149xd4418ac9 > 0) {
            this.f46028x35787dc0 = interfaceC25408x4aa5146c.mo94152xc9c44f60(mo94149xd4418ac9);
        }
    }
}
