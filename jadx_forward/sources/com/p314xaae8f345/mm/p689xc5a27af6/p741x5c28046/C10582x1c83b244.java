package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

@j95.b
/* renamed from: com.tencent.mm.feature.emoji.WXGFJNIFeatureService */
/* loaded from: classes10.dex */
public class C10582x1c83b244 extends i95.w implements com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10589x7a8f7b79 {
    @Override // com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10589x7a8f7b79
    /* renamed from: getErrorCode */
    public int mo44487x130a215f() {
        return com.p314xaae8f345.mm.p1006xc5476f33.gif.C16080x6bc1f265.m64962x130a215f();
    }

    @Override // com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10589x7a8f7b79
    /* renamed from: nativeDecodeBufferFrame */
    public int mo44488x5ea842e8(long j17, byte[] bArr, int i17, android.graphics.Bitmap bitmap, int[] iArr) {
        return com.p314xaae8f345.mm.p1006xc5476f33.gif.C16080x6bc1f265.m64968x5ea842e8(j17, bArr, i17, bitmap, iArr);
    }

    @Override // com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10589x7a8f7b79
    /* renamed from: nativeDecodeBufferHeader */
    public int mo44489x79127872(long j17, byte[] bArr, int i17) {
        return com.p314xaae8f345.mm.p1006xc5476f33.gif.C16080x6bc1f265.m64969x79127872(j17, bArr, i17);
    }

    @Override // com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10589x7a8f7b79
    /* renamed from: nativeGetOption */
    public int mo44490xf44a514(long j17, byte[] bArr, int i17, int[] iArr) {
        return com.p314xaae8f345.mm.p1006xc5476f33.gif.C16080x6bc1f265.m64975xf44a514(j17, bArr, i17, iArr);
    }

    @Override // com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10589x7a8f7b79
    /* renamed from: nativeInitWxAMDecoder */
    public long mo44491xe871e070() {
        return com.p314xaae8f345.mm.p1006xc5476f33.gif.C16080x6bc1f265.m64978xe871e070();
    }

    @Override // com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10589x7a8f7b79
    /* renamed from: nativeRewindBuffer */
    public int mo44492xa5576e92(long j17) {
        return com.p314xaae8f345.mm.p1006xc5476f33.gif.C16080x6bc1f265.m64989xa5576e92(j17);
    }

    @Override // com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10589x7a8f7b79
    /* renamed from: nativeUninit */
    public int mo44493x92410e20(long j17) {
        return com.p314xaae8f345.mm.p1006xc5476f33.gif.C16080x6bc1f265.m64990x92410e20(j17);
    }

    @Override // com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10589x7a8f7b79
    /* renamed from: pic2WxamWithWH */
    public int mo44494xb4fa014c(java.lang.String str, byte[] bArr, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47) {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_wxam_fasthb_a, 0);
        int Ni2 = i47 == 1 ? ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_wxam_c2c_roi_a, 0) : ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_wxam_other_roi_a, 0);
        int i48 = Ni != 0 ? 1 : 0;
        int i49 = Ni2 != 0 ? 1 : 0;
        ((p05.l2) ((lg0.o) i95.n0.c(lg0.o.class))).Ai(((p05.l2) ((lg0.o) i95.n0.c(lg0.o.class))).wi("roi_saliencymap"), i49);
        return com.p314xaae8f345.mm.p1006xc5476f33.gif.C16080x6bc1f265.m64998xb4fa014c(str, bArr, i17, i18, i19, i27, i28, i29, i37, i38, i39, i47, (i48 << 8) + i49, 0, 0, 0);
    }
}
