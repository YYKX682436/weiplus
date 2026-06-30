package com.p314xaae8f345.tav.p2959x5befac44;

/* renamed from: com.tencent.tav.decoder.TexturePool */
/* loaded from: classes14.dex */
public class C25781xc39783b7 implements com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25769xf53fabce {
    private static final java.lang.String TAG = "TexturePool";

    /* renamed from: textureInfoList */
    private java.util.List<com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049> f48209x808270a7 = new java.util.ArrayList();

    /* renamed from: MaxCacheSize */
    private long f48208x93f611bf = 207360000;

    /* renamed from: MaxCacheLength */
    private int f48207x6288f524 = 60;

    public C25781xc39783b7() {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "TexturePool: create " + java.lang.Thread.currentThread().getId());
    }

    /* renamed from: adaptCacheSize */
    private synchronized void m97648xd64fa1a1() {
        while (this.f48209x808270a7.size() > 0 && this.f48209x808270a7.size() - this.f48207x6288f524 > 0) {
            this.f48209x808270a7.get(0).m97285x41012807();
            this.f48209x808270a7.remove(0);
        }
    }

    /* renamed from: adapterCacheMemorySize */
    private synchronized void m97649x1d076675() {
        long j17 = 0;
        int i17 = 0;
        while (i17 < this.f48209x808270a7.size()) {
            com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049 = this.f48209x808270a7.get(i17);
            j17 += c25745xc3945049.f47894x6be2dc6 * c25745xc3945049.f47883xb7389127;
            if (j17 > this.f48208x93f611bf) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(TAG, "texture: release " + c25745xc3945049 + " - " + java.lang.Thread.currentThread());
                c25745xc3945049.m97285x41012807();
                this.f48209x808270a7.remove(i17);
                i17--;
            }
            i17++;
        }
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25769xf53fabce
    /* renamed from: popTexture */
    public synchronized com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 mo97553xab07ad8a(int i17, int i18, int i19) {
        for (int i27 = 0; i27 < this.f48209x808270a7.size(); i27++) {
            com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049 = this.f48209x808270a7.get(i27);
            if (c25745xc3945049.f47893x602fd2f5 == i17 && c25745xc3945049.f47894x6be2dc6 == i18 && c25745xc3945049.f47883xb7389127 == i19) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(TAG, "popTexture: hint pool " + c25745xc3945049.f47890xc35d0376);
                return this.f48209x808270a7.remove(i27);
            }
        }
        int m97623x3164f87f = com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97623x3164f87f(i17);
        m97648xd64fa1a1();
        m97649x1d076675();
        return new com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049(m97623x3164f87f, 3553, i18, i19, null, 0);
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25769xf53fabce
    /* renamed from: pushTexture */
    public synchronized void mo97554xa68d6ca1(com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049) {
        for (int i17 = 0; i17 < this.f48209x808270a7.size(); i17++) {
            com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc39450492 = this.f48209x808270a7.get(i17);
            if (c25745xc39450492.f47893x602fd2f5 == c25745xc3945049.f47893x602fd2f5 && c25745xc39450492.f47890xc35d0376 == c25745xc3945049.f47890xc35d0376) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(TAG, "pushTexture: hint pool  " + c25745xc39450492.f47890xc35d0376);
                c25745xc3945049.m97285x41012807();
                return;
            }
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(TAG, "pushTexture: push in " + c25745xc3945049.f47890xc35d0376 + " - " + java.lang.Thread.currentThread());
        this.f48209x808270a7.add(c25745xc3945049);
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25769xf53fabce
    /* renamed from: release */
    public synchronized void mo97555x41012807() {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, " release all " + java.lang.Thread.currentThread().getId());
        for (int i17 = 0; i17 < this.f48209x808270a7.size(); i17++) {
            this.f48209x808270a7.get(i17).m97285x41012807();
        }
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25769xf53fabce
    /* renamed from: setMaxCacheLength */
    public void mo97556x54d05e06(int i17) {
        this.f48207x6288f524 = i17;
        m97649x1d076675();
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25769xf53fabce
    /* renamed from: setMaxCacheSize */
    public void mo97557x21664b21(long j17) {
        this.f48208x93f611bf = j17;
        m97648xd64fa1a1();
    }
}
