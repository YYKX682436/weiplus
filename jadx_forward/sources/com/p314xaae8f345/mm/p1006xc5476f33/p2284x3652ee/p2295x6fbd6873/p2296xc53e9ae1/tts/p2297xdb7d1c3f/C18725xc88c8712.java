package com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2295x6fbd6873.p2296xc53e9ae1.tts.p2297xdb7d1c3f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tR\u0016\u0010\f\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/plugin/ting/platform/player/tts/extension/TingTPHearingAid;", "", "", "channels", "sampleRate", "", "setupMetaInfo", "Ljz5/f0;", "release", "Lcom/tencent/thumbplayer/api/TPPostProcessFrameBuffer;", "audioFrameBuffer", "processNotifyAudioFrameBuffer", "mIsTtsScene", "Z", "", "mHAidHandle", "J", "", "mProcessTimeDist", "[I", "mTotalProcessCount", "I", "", "mTotalProcessTime", "D", "isTtsScene", "<init>", "(Z)V", "Companion", "plugin-ting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.ting.platform.player.tts.extension.TingTPHearingAid */
/* loaded from: classes14.dex */
public final class C18725xc88c8712 {
    private static final java.lang.String TAG = "MicroMsg.TingTPHearingAid";
    private long mHAidHandle;
    private boolean mIsTtsScene;
    private final int[] mProcessTimeDist = new int[8];
    private int mTotalProcessCount;
    private double mTotalProcessTime;

    /* renamed from: fileCounter */
    private static final java.util.concurrent.atomic.AtomicInteger f38565xaa4414e0 = new java.util.concurrent.atomic.AtomicInteger(0);

    public C18725xc88c8712(boolean z17) {
        this.mIsTtsScene = z17;
    }

    /* renamed from: processNotifyAudioFrameBuffer */
    public final com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a m72203xc0cff50f(com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a audioFrameBuffer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioFrameBuffer, "audioFrameBuffer");
        java.lang.System.nanoTime();
        if (this.mHAidHandle == 0) {
            return audioFrameBuffer;
        }
        byte[][] data = audioFrameBuffer.f50933x2eefaa;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(data, "data");
        int i17 = 0;
        if (!(data.length == 0)) {
            int[] size = audioFrameBuffer.f50945x35e001;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(size, "size");
            if (!(size.length == 0)) {
                byte[] bArr = audioFrameBuffer.f50933x2eefaa[0];
                int i18 = audioFrameBuffer.f50945x35e001[0];
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bArr);
                if (!(bArr.length == 0) && i18 > 0) {
                    long nanoTime = java.lang.System.nanoTime();
                    byte[] bArr2 = new byte[i18];
                    wd0.l1 l1Var = (wd0.l1) i95.n0.c(wd0.l1.class);
                    long j17 = this.mHAidHandle;
                    ((u14.t) l1Var).getClass();
                    int m68993x50c5b64f = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17488x7dde8191.m68993x50c5b64f(j17, bArr, bArr2, i18 / 2);
                    long nanoTime2 = java.lang.System.nanoTime();
                    if (m68993x50c5b64f == 0) {
                        java.lang.System.arraycopy(bArr2, 0, audioFrameBuffer.f50933x2eefaa[0], 0, i18);
                    }
                    java.lang.System.nanoTime();
                    java.lang.Integer[] numArr = {100, 200, 300, 500, 800, 1000, 2000, 1000000};
                    int i19 = (int) ((nanoTime2 - nanoTime) / 1000);
                    while (i19 > numArr[i17].intValue() && i17 < 7) {
                        i17++;
                    }
                    int[] iArr = this.mProcessTimeDist;
                    iArr[i17] = iArr[i17] + 1;
                    this.mTotalProcessTime += i19;
                    this.mTotalProcessCount++;
                }
            }
        }
        return audioFrameBuffer;
    }

    /* renamed from: release */
    public final void m72204x41012807() {
        double d17;
        if (this.mHAidHandle != 0) {
            ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Bi(this.mHAidHandle);
            this.mHAidHandle = 0L;
            double[] dArr = new double[8];
            if (this.mTotalProcessCount > 0) {
                for (int i17 = 0; i17 < 8; i17++) {
                    dArr[i17] = (this.mProcessTimeDist[i17] * 100.0d) / this.mTotalProcessCount;
                }
                d17 = this.mTotalProcessTime / this.mTotalProcessCount;
            } else {
                d17 = 0.0d;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("TingTPHearingAid stop process count: ");
            sb6.append(this.mTotalProcessCount);
            sb6.append(", time avg: ");
            sb6.append(d17);
            sb6.append(", dist: ");
            java.lang.String arrays = java.util.Arrays.toString(dArr);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays, "toString(...)");
            sb6.append(arrays);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, sb6.toString());
        }
    }

    /* renamed from: setupMetaInfo */
    public final boolean m72205x121035f0(int channels, int sampleRate) {
        int Di = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Di();
        int Ni = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ni();
        int i17 = this.mIsTtsScene ? 2 : 3;
        ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).getClass();
        long wi6 = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).wi();
        this.mHAidHandle = wi6;
        int aj6 = wi6 > 0 ? ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).aj(this.mHAidHandle, Di, Ni, i17, sampleRate, channels) : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "TingTPHearingAid setupMetaInfo channel: " + channels + ", sampleRate: " + sampleRate + ", hearingAid Init ret: " + aj6 + ", type: " + Di + ", device: " + Ni + ", scene: " + i17);
        return aj6 == 0;
    }
}
