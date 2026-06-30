package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.mp3;

/* renamed from: com.tencent.qqmusic.mediaplayer.codec.mp3.MP3Header */
/* loaded from: classes13.dex */
class C25382x196b059d {

    /* renamed from: MPEG1 */
    public static final int f45879x4627b4c = 3;

    /* renamed from: MPEG2 */
    public static final int f45880x4627b4d = 2;

    /* renamed from: MPEG25 */
    public static final int f45881x87ecee88 = 0;

    /* renamed from: bitrate_index */
    private int f45883x7d3e0180;

    /* renamed from: framesize */
    private int f45884x208c0aee;

    /* renamed from: layer */
    private int f45885x61fd551;
    private int lsf;

    /* renamed from: mode */
    private int f45886x3339a3;

    /* renamed from: mode_extension */
    private int f45887xd89be0a3;

    /* renamed from: padding */
    private int f45888xcff03c11;

    /* renamed from: protection_bit */
    private int f45889x1494b2a7;

    /* renamed from: sampling_frequency */
    private int f45891x2fbbdb04;

    /* renamed from: sideinfosize */
    private int f45892x7cf3d406;

    /* renamed from: verID */
    private int f45893x6ae73fe;

    /* renamed from: bitrate */
    private int[][][] f45882xf9e77b6d = {new int[][]{new int[]{0, 32, 64, 96, 128, 160, 192, 224, 256, 288, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.r.f34562x366c91de, 384, com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60852x9b1ed3e8, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df}, new int[]{0, 32, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e, 384}, new int[]{0, 32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e}}, new int[][]{new int[]{0, 32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, 192, 224, 256}, new int[]{0, 8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160}, new int[]{0, 8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160}}};

    /* renamed from: samplingRate */
    private int[][] f45890x79f4567 = {new int[]{11025, 12000, 8000, 0}, new int[]{0, 0, 0, 0}, new int[]{22050, 24000, 16000, 0}, new int[]{44100, 48000, 32000, 0}};

    /* renamed from: decode */
    public void m94049xb06291ee(int i17) {
        int i18 = (i17 >> 19) & 3;
        this.f45893x6ae73fe = i18;
        int i19 = 4 - ((i17 >> 17) & 3);
        this.f45885x61fd551 = i19;
        this.f45889x1494b2a7 = (i17 >> 16) & 1;
        int i27 = (i17 >> 12) & 15;
        this.f45883x7d3e0180 = i27;
        int i28 = (i17 >> 10) & 3;
        this.f45891x2fbbdb04 = i28;
        int i29 = (i17 >> 9) & 1;
        this.f45888xcff03c11 = i29;
        int i37 = (i17 >> 6) & 3;
        this.f45886x3339a3 = i37;
        this.f45887xd89be0a3 = (i17 >> 4) & 3;
        int i38 = i18 == 3 ? 0 : 1;
        this.lsf = i38;
        if (i19 == 1) {
            int i39 = this.f45882xf9e77b6d[i38][0][i27] * 12000;
            this.f45884x208c0aee = i39;
            this.f45884x208c0aee = ((i39 / this.f45890x79f4567[i18][i28]) + i29) << 2;
        } else if (i19 == 2) {
            int i47 = this.f45882xf9e77b6d[i38][1][i27] * 144000;
            this.f45884x208c0aee = i47;
            this.f45884x208c0aee = (i47 / this.f45890x79f4567[i18][i28]) + i29;
        } else {
            if (i19 != 3) {
                return;
            }
            int i48 = this.f45882xf9e77b6d[i38][2][i27] * 144000;
            this.f45884x208c0aee = i48;
            this.f45884x208c0aee = (i48 / (this.f45890x79f4567[i18][i28] << i38)) + i29;
            if (i18 == 3) {
                this.f45892x7cf3d406 = i37 != 3 ? 32 : 17;
            } else {
                this.f45892x7cf3d406 = i37 == 3 ? 9 : 17;
            }
        }
    }

    /* renamed from: getFrameSize */
    public int m94050x1feaf058() {
        return this.f45884x208c0aee;
    }

    /* renamed from: initialize */
    public void m94051x33ebcb90() {
        this.f45884x208c0aee = 0;
        this.f45892x7cf3d406 = 0;
        this.f45885x61fd551 = 0;
        this.f45893x6ae73fe = 1;
    }

    /* renamed from: isProtected */
    public boolean m94052x21f7ada4() {
        return this.f45889x1494b2a7 == 0;
    }
}
