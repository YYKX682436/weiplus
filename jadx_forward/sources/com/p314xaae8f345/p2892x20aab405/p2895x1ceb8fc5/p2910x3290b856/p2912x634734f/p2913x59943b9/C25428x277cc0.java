package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9;

/* renamed from: com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Stts */
/* loaded from: classes16.dex */
public class C25428x277cc0 extends com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.AbstractC25421x44bf3c9c {

    /* renamed from: entryCount */
    int f46047x894ecfbd;

    /* renamed from: sampleCount */
    int[] f46048x795e585;

    /* renamed from: sampleDelta */
    int[] f46049x79f502e;

    /* renamed from: getEntryCount */
    public int m94233x778f87b3() {
        return this.f46047x894ecfbd;
    }

    /* renamed from: getSampleCount */
    public int[] m94234xe16c2c4f() {
        return this.f46048x795e585;
    }

    /* renamed from: getSampleDelta */
    public int[] m94235xe17596f8() {
        return this.f46049x79f502e;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.AbstractC25421x44bf3c9c, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.Box, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.InterfaceC25423x5d15a765
    /* renamed from: parse */
    public void mo94215x6581ab3(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.InterfaceC25408x4aa5146c interfaceC25408x4aa5146c, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.Box box) {
        super.mo94215x6581ab3(interfaceC25408x4aa5146c, box);
        int mo94151x40655679 = interfaceC25408x4aa5146c.mo94151x40655679();
        this.f46047x894ecfbd = mo94151x40655679;
        int[] iArr = new int[mo94151x40655679];
        this.f46048x795e585 = iArr;
        int[] iArr2 = new int[mo94151x40655679];
        this.f46049x79f502e = iArr2;
        interfaceC25408x4aa5146c.mo94153xcc8fd4e9(mo94151x40655679, iArr, iArr2);
    }
}
