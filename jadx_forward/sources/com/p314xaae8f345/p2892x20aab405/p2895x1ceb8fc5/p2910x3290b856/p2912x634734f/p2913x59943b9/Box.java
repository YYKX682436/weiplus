package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9;

/* loaded from: classes16.dex */
public abstract class Box implements com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.InterfaceC25423x5d15a765 {

    /* renamed from: largeSize */
    private long f46022x2d30f9dc;

    /* renamed from: size */
    private int f46023x35e001;

    /* renamed from: type */
    private byte[] f46024x368f3a;

    /* renamed from: userType */
    private byte[] f46025xf01e11a5;

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.InterfaceC25423x5d15a765
    /* renamed from: getSize */
    public final long mo94213xfb854877() {
        long j17 = this.f46022x2d30f9dc;
        return j17 != 0 ? j17 : this.f46023x35e001;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.InterfaceC25423x5d15a765
    /* renamed from: getType */
    public final java.lang.String mo94214xfb85f7b0() {
        return new java.lang.String(this.f46024x368f3a, java.nio.charset.Charset.defaultCharset());
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.InterfaceC25423x5d15a765
    /* renamed from: parse */
    public void mo94215x6581ab3(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.InterfaceC25408x4aa5146c interfaceC25408x4aa5146c, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.Box box) {
        if (box != null) {
            this.f46023x35e001 = box.f46023x35e001;
            this.f46024x368f3a = box.f46024x368f3a;
            this.f46022x2d30f9dc = box.f46022x2d30f9dc;
            this.f46025xf01e11a5 = box.f46025xf01e11a5;
            return;
        }
        this.f46023x35e001 = interfaceC25408x4aa5146c.mo94151x40655679();
        byte[] bArr = new byte[4];
        this.f46024x368f3a = bArr;
        interfaceC25408x4aa5146c.mo94150xbc0c0475(bArr, 0, bArr.length);
        int i17 = this.f46023x35e001;
        if (i17 == 1) {
            long mo94154xcc46d932 = interfaceC25408x4aa5146c.mo94154xcc46d932();
            this.f46022x2d30f9dc = mo94154xcc46d932;
            if (mo94154xcc46d932 == 0) {
                throw new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.C25406x57b29a3b("invalid [" + mo94214xfb85f7b0() + "]: largeSize is 0!");
            }
        } else if (i17 == 0) {
            this.f46022x2d30f9dc = interfaceC25408x4aa5146c.mo94149xd4418ac9();
        } else if (i17 < 8) {
            throw new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.C25406x57b29a3b("invalid [" + mo94214xfb85f7b0() + "]: size is less than 8!");
        }
        if (java.util.Arrays.equals(this.f46024x368f3a, "uuid".getBytes())) {
            byte[] bArr2 = new byte[16];
            this.f46025xf01e11a5 = bArr2;
            interfaceC25408x4aa5146c.mo94150xbc0c0475(bArr2, 0, bArr2.length);
        }
    }
}
