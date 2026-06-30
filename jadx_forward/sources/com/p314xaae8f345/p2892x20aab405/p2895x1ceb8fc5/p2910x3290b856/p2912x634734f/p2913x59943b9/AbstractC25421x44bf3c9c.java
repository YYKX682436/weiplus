package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9;

/* renamed from: com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.FullBox */
/* loaded from: classes16.dex */
public abstract class AbstractC25421x44bf3c9c extends com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.Box {

    /* renamed from: flags */
    int f46031x5cfee87;

    /* renamed from: version */
    int f46032x14f51cd8;

    /* renamed from: getFlags */
    public int m94218x746d94d1() {
        return this.f46031x5cfee87;
    }

    /* renamed from: getVersion */
    public int m94219x52c258a2() {
        return this.f46032x14f51cd8;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.Box, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.InterfaceC25423x5d15a765
    /* renamed from: parse */
    public void mo94215x6581ab3(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.InterfaceC25408x4aa5146c interfaceC25408x4aa5146c, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.Box box) {
        super.mo94215x6581ab3(interfaceC25408x4aa5146c, box);
        byte[] bArr = new byte[4];
        interfaceC25408x4aa5146c.mo94150xbc0c0475(bArr, 0, 4);
        this.f46032x14f51cd8 = bArr[0] & 255;
        this.f46031x5cfee87 = ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
    }
}
