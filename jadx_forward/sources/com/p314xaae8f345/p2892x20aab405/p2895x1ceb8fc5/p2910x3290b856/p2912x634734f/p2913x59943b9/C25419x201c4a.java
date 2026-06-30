package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9;

/* renamed from: com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Co64 */
/* loaded from: classes16.dex */
public class C25419x201c4a extends com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.AbstractC25421x44bf3c9c {

    /* renamed from: chunkOffset */
    private long[] f46026xe1262d60;

    /* renamed from: entryCount */
    private int f46027x894ecfbd;

    /* renamed from: getChunkOffset */
    public long[] m94216xbafc742a() {
        return this.f46026xe1262d60;
    }

    /* renamed from: getEntryCount */
    public int m94217x778f87b3() {
        return this.f46027x894ecfbd;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.AbstractC25421x44bf3c9c, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.Box, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.InterfaceC25423x5d15a765
    /* renamed from: parse */
    public void mo94215x6581ab3(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.InterfaceC25408x4aa5146c interfaceC25408x4aa5146c, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.Box box) {
        super.mo94215x6581ab3(interfaceC25408x4aa5146c, box);
        int mo94151x40655679 = interfaceC25408x4aa5146c.mo94151x40655679();
        this.f46027x894ecfbd = mo94151x40655679;
        this.f46026xe1262d60 = interfaceC25408x4aa5146c.mo94155x94349847(mo94151x40655679);
    }
}
