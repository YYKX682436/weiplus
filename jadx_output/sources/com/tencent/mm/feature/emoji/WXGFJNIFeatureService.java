package com.tencent.mm.feature.emoji;

@j95.b
/* loaded from: classes10.dex */
public class WXGFJNIFeatureService extends i95.w implements com.tencent.mm.feature.emoji.api.IWXGFJNIService {
    @Override // com.tencent.mm.feature.emoji.api.IWXGFJNIService
    public int getErrorCode() {
        return com.tencent.mm.plugin.gif.MMWXGFJNI.getErrorCode();
    }

    @Override // com.tencent.mm.feature.emoji.api.IWXGFJNIService
    public int nativeDecodeBufferFrame(long j17, byte[] bArr, int i17, android.graphics.Bitmap bitmap, int[] iArr) {
        return com.tencent.mm.plugin.gif.MMWXGFJNI.nativeDecodeBufferFrame(j17, bArr, i17, bitmap, iArr);
    }

    @Override // com.tencent.mm.feature.emoji.api.IWXGFJNIService
    public int nativeDecodeBufferHeader(long j17, byte[] bArr, int i17) {
        return com.tencent.mm.plugin.gif.MMWXGFJNI.nativeDecodeBufferHeader(j17, bArr, i17);
    }

    @Override // com.tencent.mm.feature.emoji.api.IWXGFJNIService
    public int nativeGetOption(long j17, byte[] bArr, int i17, int[] iArr) {
        return com.tencent.mm.plugin.gif.MMWXGFJNI.nativeGetOption(j17, bArr, i17, iArr);
    }

    @Override // com.tencent.mm.feature.emoji.api.IWXGFJNIService
    public long nativeInitWxAMDecoder() {
        return com.tencent.mm.plugin.gif.MMWXGFJNI.nativeInitWxAMDecoder();
    }

    @Override // com.tencent.mm.feature.emoji.api.IWXGFJNIService
    public int nativeRewindBuffer(long j17) {
        return com.tencent.mm.plugin.gif.MMWXGFJNI.nativeRewindBuffer(j17);
    }

    @Override // com.tencent.mm.feature.emoji.api.IWXGFJNIService
    public int nativeUninit(long j17) {
        return com.tencent.mm.plugin.gif.MMWXGFJNI.nativeUninit(j17);
    }

    @Override // com.tencent.mm.feature.emoji.api.IWXGFJNIService
    public int pic2WxamWithWH(java.lang.String str, byte[] bArr, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47) {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_wxam_fasthb_a, 0);
        int Ni2 = i47 == 1 ? ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_wxam_c2c_roi_a, 0) : ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_wxam_other_roi_a, 0);
        int i48 = Ni != 0 ? 1 : 0;
        int i49 = Ni2 != 0 ? 1 : 0;
        ((p05.l2) ((lg0.o) i95.n0.c(lg0.o.class))).Ai(((p05.l2) ((lg0.o) i95.n0.c(lg0.o.class))).wi("roi_saliencymap"), i49);
        return com.tencent.mm.plugin.gif.MMWXGFJNI.pic2WxamWithWH(str, bArr, i17, i18, i19, i27, i28, i29, i37, i38, i39, i47, (i48 << 8) + i49, 0, 0, 0);
    }
}
