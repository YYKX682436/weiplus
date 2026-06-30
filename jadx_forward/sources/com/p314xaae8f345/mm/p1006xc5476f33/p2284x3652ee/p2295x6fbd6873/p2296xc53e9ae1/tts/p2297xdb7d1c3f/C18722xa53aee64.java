package com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2295x6fbd6873.p2296xc53e9ae1.tts.p2297xdb7d1c3f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nR\u0016\u0010\r\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/plugin/ting/platform/player/tts/extension/TingTPAudioGainProcess;", "", "", "musicData", "", "bitdepth", "", "gain", "Ljz5/f0;", "processAudioGain", "Lcom/tencent/thumbplayer/api/TPPostProcessFrameBuffer;", "audioFrameBuffer", "processNotifyAudioFrameBuffer", "mGainFactor", "F", "", "gainFactor", "<init>", "(D)V", "Companion", "plugin-ting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.ting.platform.player.tts.extension.TingTPAudioGainProcess */
/* loaded from: classes14.dex */
public final class C18722xa53aee64 {
    private static final java.lang.String TAG = "MicroMsg.TingTPAudioGainProcess";
    private float mGainFactor;

    /* renamed from: fileCounter */
    private static final java.util.concurrent.atomic.AtomicInteger f38521xaa4414e0 = new java.util.concurrent.atomic.AtomicInteger(0);

    public C18722xa53aee64(double d17) {
        this.mGainFactor = (float) d17;
    }

    /* renamed from: processAudioGain */
    private final void m72129xad04ec6(byte[] bArr, int i17, float f17) {
        if ((bArr.length == 0) || i17 != 16) {
            return;
        }
        int length = bArr.length;
        if ((length & 1) != 0) {
            return;
        }
        e06.i l17 = e06.p.l(e06.p.m(0, length), 2);
        int i18 = l17.f327742d;
        int i19 = l17.f327743e;
        int i27 = l17.f327744f;
        if ((i27 <= 0 || i18 > i19) && (i27 >= 0 || i19 > i18)) {
            return;
        }
        while (true) {
            int f18 = e06.p.f((int) (e06.p.e((float) java.lang.Math.tanh((((short) ((bArr[i18] & 255) | ((bArr[r3] & 255) << 8))) / 32768.0f) * f17), -1.0f, 1.0f) * 32767.0f), -32768, 32767);
            bArr[i18] = (byte) (f18 & 255);
            bArr[i18 + 1] = (byte) ((f18 >> 8) & 255);
            if (i18 == i19) {
                return;
            } else {
                i18 += i27;
            }
        }
    }

    /* renamed from: processNotifyAudioFrameBuffer */
    public final com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a m72130xc0cff50f(com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a audioFrameBuffer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioFrameBuffer, "audioFrameBuffer");
        java.lang.System.nanoTime();
        byte[][] data = audioFrameBuffer.f50933x2eefaa;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(data, "data");
        if (!(data.length == 0)) {
            int[] size = audioFrameBuffer.f50945x35e001;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(size, "size");
            if (!(size.length == 0)) {
                byte[] bArr = audioFrameBuffer.f50933x2eefaa[0];
                int i17 = audioFrameBuffer.f50945x35e001[0];
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bArr);
                if (!(bArr.length == 0) && i17 > 0) {
                    m72129xad04ec6(bArr, 16, this.mGainFactor);
                    java.lang.System.nanoTime();
                }
            }
        }
        return audioFrameBuffer;
    }
}
