package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9;

/* renamed from: com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Mdhd */
/* loaded from: classes16.dex */
public class C25424x2484f3 extends com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.AbstractC25421x44bf3c9c {

    /* renamed from: creationTime */
    long f46033x5e88ae4c;

    /* renamed from: duration */
    long f46034x89444d94;

    /* renamed from: modificationTime */
    long f46035x609f6a89;

    /* renamed from: remaining */
    byte[] f46036x33d8adf6;

    /* renamed from: timeScale */
    int f46037x17e7e7d;

    /* renamed from: getCreationTime */
    public long m94220xbf7b40c2() {
        return this.f46033x5e88ae4c;
    }

    /* renamed from: getDuration */
    public long m94221x51e8b0a() {
        return this.f46034x89444d94;
    }

    /* renamed from: getModificationTime */
    public long m94222x877d1ff() {
        return this.f46035x609f6a89;
    }

    /* renamed from: getTimeScale */
    public int m94223xebefc7() {
        return this.f46037x17e7e7d;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.AbstractC25421x44bf3c9c, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.Box, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.InterfaceC25423x5d15a765
    /* renamed from: parse */
    public void mo94215x6581ab3(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.InterfaceC25408x4aa5146c interfaceC25408x4aa5146c, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.Box box) {
        super.mo94215x6581ab3(interfaceC25408x4aa5146c, box);
        if (this.f46032x14f51cd8 == 1) {
            this.f46033x5e88ae4c = interfaceC25408x4aa5146c.mo94154xcc46d932();
            this.f46035x609f6a89 = interfaceC25408x4aa5146c.mo94154xcc46d932();
            this.f46037x17e7e7d = interfaceC25408x4aa5146c.mo94151x40655679();
            this.f46034x89444d94 = interfaceC25408x4aa5146c.mo94154xcc46d932();
        } else {
            this.f46033x5e88ae4c = interfaceC25408x4aa5146c.mo94151x40655679();
            this.f46035x609f6a89 = interfaceC25408x4aa5146c.mo94151x40655679();
            this.f46037x17e7e7d = interfaceC25408x4aa5146c.mo94151x40655679();
            this.f46034x89444d94 = interfaceC25408x4aa5146c.mo94151x40655679();
        }
        byte[] bArr = new byte[4];
        this.f46036x33d8adf6 = bArr;
        interfaceC25408x4aa5146c.mo94150xbc0c0475(bArr, 0, bArr.length);
    }
}
