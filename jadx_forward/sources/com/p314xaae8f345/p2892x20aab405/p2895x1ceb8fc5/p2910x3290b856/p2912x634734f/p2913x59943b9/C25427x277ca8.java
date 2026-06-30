package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9;

/* renamed from: com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Stsz */
/* loaded from: classes16.dex */
public class C25427x277ca8 extends com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.AbstractC25421x44bf3c9c {

    /* renamed from: entrySize */
    int[] f46044xe36cd393;

    /* renamed from: sampleCount */
    int f46045x795e585;

    /* renamed from: sampleSize */
    int f46046x887e4cb;

    /* renamed from: getEntrySize */
    public int[] m94230xe2da44dd() {
        return this.f46044xe36cd393;
    }

    /* renamed from: getSampleCount */
    public int m94231xe16c2c4f() {
        return this.f46045x795e585;
    }

    /* renamed from: getSampleSize */
    public int m94232xf6c89cc1() {
        return this.f46046x887e4cb;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.AbstractC25421x44bf3c9c, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.Box, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.InterfaceC25423x5d15a765
    /* renamed from: parse */
    public void mo94215x6581ab3(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.InterfaceC25408x4aa5146c interfaceC25408x4aa5146c, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.Box box) {
        super.mo94215x6581ab3(interfaceC25408x4aa5146c, box);
        this.f46046x887e4cb = interfaceC25408x4aa5146c.mo94151x40655679();
        int mo94151x40655679 = interfaceC25408x4aa5146c.mo94151x40655679();
        this.f46045x795e585 = mo94151x40655679;
        if (this.f46046x887e4cb == 0) {
            this.f46044xe36cd393 = interfaceC25408x4aa5146c.mo94152xc9c44f60(mo94151x40655679);
        }
        if (this.f46046x887e4cb == 0 && this.f46045x795e585 == 0) {
            throw new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.C25406x57b29a3b("invalide stsz: both [sample_count] and [sample_size] is 0!");
        }
    }
}
