package com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38;

/* renamed from: com.tencent.tav.core.parallel.newversion.AssetSingleExportThread */
/* loaded from: classes16.dex */
public class HandlerThreadC25726xa160c636 extends android.os.HandlerThread implements android.os.Handler.Callback {

    /* renamed from: msg_done_a */
    private static final int f47764xbc006962 = 2;

    /* renamed from: msg_done_v */
    private static final int f47765xbc006977 = 1;
    private final java.lang.String TAG;

    /* renamed from: assetReader */
    private com.p314xaae8f345.tav.p2947x2eaf9f.C25662xaba0e3b3 f47766x48373bd3;

    /* renamed from: assetWriter */
    private com.p314xaae8f345.tav.p2947x2eaf9f.C25666xb4e42f63 f47767x517a8783;

    /* renamed from: audioExportThread */
    private android.os.HandlerThread f47768xa84655d4;

    /* renamed from: audioInfo */
    private com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984 f47769xb3299a4;

    /* renamed from: audioMix */
    private com.p314xaae8f345.tav.p2947x2eaf9f.C25671x3e055ec6 f47770x3a2afaa6;

    /* renamed from: audioProgress */
    private float f47771x51268c23;

    /* renamed from: audioReadFinish */
    private boolean f47772x6aeaee3f;

    /* renamed from: audioReader */
    private com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694 f47773x17cd2839;

    /* renamed from: audioTime */
    private long f47774xb3787c3;

    /* renamed from: audioTimeout */
    private volatile boolean f47775x53216cab;

    /* renamed from: audioTimeoutCallback */
    private com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.AudioFrameOperateTimeoutCallback f47776x84421610;

    /* renamed from: audioWriter */
    private com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27 f47777x211073e9;

    /* renamed from: audioWriterDone */
    private volatile boolean f47778x7a92ef0b;

    /* renamed from: cancel */
    private volatile boolean f47779xae7a2e7a;

    /* renamed from: encodeOption */
    private final com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036 f47780xc5684a2b;

    /* renamed from: exportHandler */
    private android.os.Handler f47781x69e308f6;

    /* renamed from: exportSession */
    private com.p314xaae8f345.tav.p2947x2eaf9f.C25659xe2dfb08b f47782xb6e83442;

    /* renamed from: hasError */
    private volatile boolean f47783x6f5df8e;

    /* renamed from: indicatorInfo */
    public com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2953x3164ae.C25719xdaa2a3bb f47784xec76f75d;

    /* renamed from: isFinishing */
    private volatile boolean f47785x697ca065;

    /* renamed from: isNeedCheckFrameProcessTimeout */
    private boolean f47786x5097cd97;

    /* renamed from: isReleased */
    private volatile boolean f47787xafdb8087;

    /* renamed from: lastHandleAudioTimeStamp */
    private long f47788xd41a1be;

    /* renamed from: lastHandleVideoTimeStamp */
    private long f47789x12bc12b9;

    /* renamed from: maxTimeoutMs */
    private long f47790xae3bcde3;

    /* renamed from: mediaFactory */
    private com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25652xcd3d9f6f f47791xc0157086;

    /* renamed from: observer */
    private p012xc85e97e9.p093xedfae76a.k0 f47792x14c752d6;

    /* renamed from: renderContextParams */
    private com.p314xaae8f345.tav.p2959x5befac44.C25780x613b55ff f47793x16878e1f;

    /* renamed from: reportSession */
    private com.p314xaae8f345.tav.p2968xc84c5534.C25855x7912cb4e f47794x416042c2;

    /* renamed from: timeoutInterruptWork */
    private boolean f47795x734ee833;

    /* renamed from: videoExportThread */
    private android.os.HandlerThread f47796x2be7fef9;

    /* renamed from: videoProgress */
    private float f47797xb46c8fc8;

    /* renamed from: videoReadFinish */
    private boolean f47798x14be9ca4;

    /* renamed from: videoReader */
    private com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694 f47799x3b99d11e;

    /* renamed from: videoTime */
    private long f47800x4f7325e8;

    /* renamed from: videoTimeout */
    private volatile boolean f47801xa8e9e066;

    /* renamed from: videoTimeoutCallback */
    private com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.VideoFrameOperateTimeoutCallback f47802x9de49ecb;

    /* renamed from: videoWriter */
    private com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27 f47803x44dd1cce;

    /* renamed from: videoWriterDone */
    private volatile boolean f47804x24669d70;

    /* renamed from: com.tencent.tav.core.parallel.newversion.AssetSingleExportThread$AudioFrameOperateTimeoutCallback */
    /* loaded from: classes16.dex */
    public class AudioFrameOperateTimeoutCallback implements java.lang.Runnable {
        private AudioFrameOperateTimeoutCallback() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (android.os.SystemClock.uptimeMillis() - com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47788xd41a1be < com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47790xae3bcde3) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.TAG, "Maybe app into background audio");
                return;
            }
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.TAG, "audioTimeout");
            com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47775x53216cab = true;
            com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47784xec76f75d.m97034x17b80bc3(com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25661xf379654e.AssetParallelStatusTimeout);
            com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47784xec76f75d.f47709xbac3e81a = new com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6(-204, null, "handle audio timeout");
            if (com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47792x14c752d6 != null) {
                com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47792x14c752d6.mo525x7bb163d5(com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47784xec76f75d);
            }
        }
    }

    /* renamed from: com.tencent.tav.core.parallel.newversion.AssetSingleExportThread$AudioRequestMediaDataCallback */
    /* loaded from: classes16.dex */
    public class AudioRequestMediaDataCallback implements java.lang.Runnable {
        private AudioRequestMediaDataCallback() {
        }

        /* renamed from: onAudioRequestMediaData */
        private void m97147xf5fb4736() {
            while (true) {
                if (com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47778x7a92ef0b || com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47779xae7a2e7a || com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47777x211073e9 == null || com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47783x6f5df8e) {
                    break;
                }
                com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47788xd41a1be = android.os.SystemClock.uptimeMillis();
                if (com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47786x5097cd97) {
                    com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47781x69e308f6.removeCallbacks(com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47776x84421610);
                    com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47781x69e308f6.postDelayed(com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47776x84421610, com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47790xae3bcde3);
                }
                if (com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47773x17cd2839 != null && com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47777x211073e9.m96623x11220049()) {
                    com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47773x17cd2839.m96553x89444d94();
                    com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m96552xf57602b2 = com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47773x17cd2839.m96552xf57602b2(false);
                    com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d m97193x75286adb = m96552xf57602b2.m97193x75286adb();
                    if (m97193x75286adb.m97206x8311a768() >= 0) {
                        com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6 m96617x14ffdac4 = com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47777x211073e9.m96617x14ffdac4(m96552xf57602b2, false);
                        if (m96617x14ffdac4 != null) {
                            com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.m97130x81b4feb4(m96617x14ffdac4);
                        }
                        if (m96552xf57602b2.m97195xfb85bb43().m97232x31040141() >= com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47784xec76f75d.f47717x16fae70.m97256x51e8b0a().m97232x31040141()) {
                            com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47777x211073e9.m96624xb0dd6571();
                            break;
                        }
                    } else if (m97193x75286adb.m97206x8311a768() == -1) {
                        com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47777x211073e9.m96624xb0dd6571();
                        break;
                    } else if (m97193x75286adb.m97206x8311a768() != -4) {
                        com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.m97130x81b4feb4(new com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6(m97193x75286adb));
                        break;
                    }
                }
            }
            com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47772x6aeaee3f = !r0.f47779xae7a2e7a;
            com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47781x69e308f6.removeCallbacks(com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47776x84421610);
            com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47781x69e308f6.sendEmptyMessage(2);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                m97147xf5fb4736();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.TAG, "AudioRequestMediaDateCallback run: ", th6);
                com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.m97129x81b4feb4(-15, th6);
            }
        }
    }

    /* renamed from: com.tencent.tav.core.parallel.newversion.AssetSingleExportThread$AudioWriterProgressListener */
    /* loaded from: classes16.dex */
    public class AudioWriterProgressListener implements com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.WriterProgressListener {
        private AudioWriterProgressListener() {
        }

        @Override // com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.WriterProgressListener
        /* renamed from: onError */
        public void mo96421xaf8aa769(com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6 c25680x8a5723a6) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.TAG, "AudioWriterProgressListener onError: ", c25680x8a5723a6.f47512xb5275940);
            com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.m97130x81b4feb4(c25680x8a5723a6);
        }

        @Override // com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.WriterProgressListener
        /* renamed from: onProgressChanged */
        public void mo96422x95ed2be8(com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27 c25667x9a895e27, long j17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d("AssetExportSession", "onProgressChanged: audioWriter " + j17 + "  / " + com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.m97133x51e8b0a());
            if (j17 == -1) {
                com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636 handlerThreadC25726xa160c636 = com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this;
                handlerThreadC25726xa160c636.f47774xb3787c3 = handlerThreadC25726xa160c636.f47784xec76f75d.f47717x16fae70.m97256x51e8b0a().m97232x31040141();
                com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47771x51268c23 = 1.0f;
                com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47778x7a92ef0b = true;
                com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47781x69e308f6.sendEmptyMessage(2);
                return;
            }
            com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47774xb3787c3 = j17;
            com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636 handlerThreadC25726xa160c6362 = com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this;
            com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26 = handlerThreadC25726xa160c6362.f47784xec76f75d.f47717x16fae70;
            long m97232x31040141 = c25738xead39d26 != null ? c25738xead39d26.m97256x51e8b0a().m97232x31040141() : handlerThreadC25726xa160c6362.f47773x17cd2839 != null ? com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47773x17cd2839.m96553x89444d94() : 0L;
            if (m97232x31040141 != 0) {
                com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636 handlerThreadC25726xa160c6363 = com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this;
                handlerThreadC25726xa160c6363.f47771x51268c23 = (((float) handlerThreadC25726xa160c6363.f47800x4f7325e8) * 1.0f) / ((float) m97232x31040141);
            } else {
                com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47771x51268c23 = 1.0f;
            }
            com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636 handlerThreadC25726xa160c6364 = com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this;
            handlerThreadC25726xa160c6364.f47784xec76f75d.m97033x3ae760af(handlerThreadC25726xa160c6364.f47771x51268c23);
            if (com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47792x14c752d6 != null) {
                com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47792x14c752d6.mo525x7bb163d5(com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47784xec76f75d);
            }
            if (com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47774xb3787c3 >= com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47784xec76f75d.f47717x16fae70.m97256x51e8b0a().m97232x31040141()) {
                com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636 handlerThreadC25726xa160c6365 = com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this;
                handlerThreadC25726xa160c6365.f47774xb3787c3 = handlerThreadC25726xa160c6365.f47784xec76f75d.f47717x16fae70.m97256x51e8b0a().m97232x31040141();
                com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47778x7a92ef0b = true;
                com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47781x69e308f6.sendEmptyMessage(2);
            }
        }
    }

    /* renamed from: com.tencent.tav.core.parallel.newversion.AssetSingleExportThread$VideoFrameOperateTimeoutCallback */
    /* loaded from: classes16.dex */
    public class VideoFrameOperateTimeoutCallback implements java.lang.Runnable {
        private VideoFrameOperateTimeoutCallback() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (android.os.SystemClock.uptimeMillis() - com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47789x12bc12b9 >= com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47790xae3bcde3) {
                if (!com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47795x734ee833) {
                    com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47782xb6e83442.f47300x4de8662b = new com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6(-203);
                    return;
                }
                com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47801xa8e9e066 = true;
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.TAG, "videoTimeout");
                com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47784xec76f75d.m97034x17b80bc3(com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25661xf379654e.AssetParallelStatusTimeout);
                com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47784xec76f75d.f47709xbac3e81a = new com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6(-203, null, "handle video timeout");
                if (com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47792x14c752d6 != null) {
                    com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47792x14c752d6.mo525x7bb163d5(com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47784xec76f75d);
                }
            }
        }
    }

    /* renamed from: com.tencent.tav.core.parallel.newversion.AssetSingleExportThread$VideoRequestMediaDataCallback */
    /* loaded from: classes16.dex */
    public class VideoRequestMediaDataCallback implements java.lang.Runnable {

        /* renamed from: cost */
        private long f47815x2eafcd;

        /* renamed from: frame */
        private long f47816x5d2a96d;

        private VideoRequestMediaDataCallback() {
            this.f47816x5d2a96d = 1L;
            this.f47815x2eafcd = 0L;
        }

        /* renamed from: onRequestMediaData */
        private void m97148xe16993de() {
            while (true) {
                if (com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47804x24669d70 || com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47779xae7a2e7a || com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47783x6f5df8e) {
                    break;
                }
                com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47789x12bc12b9 = android.os.SystemClock.uptimeMillis();
                if (com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47786x5097cd97) {
                    com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47781x69e308f6.removeCallbacks(com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47802x9de49ecb);
                    com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47781x69e308f6.postDelayed(com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47802x9de49ecb, com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47790xae3bcde3);
                }
                java.lang.System.currentTimeMillis();
                if (com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47799x3b99d11e == null || !com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47803x44dd1cce.m96623x11220049()) {
                    com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.TAG, "leex not ReadyForMoreMediaData");
                } else {
                    long nanoTime = java.lang.System.nanoTime();
                    com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m96552xf57602b2 = com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47799x3b99d11e.m96552xf57602b2(false);
                    if (com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47794x416042c2 != null) {
                        com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47794x416042c2.m98324x436f65eb(java.lang.System.nanoTime() - nanoTime);
                    }
                    com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d m97193x75286adb = m96552xf57602b2.m97193x75286adb();
                    if (m97193x75286adb.m97206x8311a768() < 0) {
                        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.TAG, "onRequestMediaData stateCode: " + m97193x75286adb.m97206x8311a768());
                    }
                    if (m97193x75286adb.m97206x8311a768() >= 0) {
                        com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6 m96617x14ffdac4 = com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47803x44dd1cce.m96617x14ffdac4(m96552xf57602b2, true);
                        if (m96617x14ffdac4 != null) {
                            com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.m97130x81b4feb4(m96617x14ffdac4);
                        }
                        if (com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47794x416042c2 != null) {
                            com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47794x416042c2.m98325x4635e7b1(java.lang.System.nanoTime() - nanoTime);
                        }
                    } else if (m97193x75286adb.m97214x36f88ac9(-1)) {
                        com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47803x44dd1cce.m96624xb0dd6571();
                        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.TAG, "markAsFinished");
                        break;
                    } else if (m97193x75286adb.m97206x8311a768() != -4) {
                        com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.m97130x81b4feb4(new com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6(m97193x75286adb));
                        break;
                    }
                }
            }
            if (com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47803x44dd1cce.f47387x4dc0ba99 != null) {
                com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47803x44dd1cce.f47387x4dc0ba99.mo97539x41012807();
            }
            if (com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47782xb6e83442.f47308xaffe9209 != null) {
                com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47782xb6e83442.f47308xaffe9209.mo96822x41012807();
            }
            com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47798x14be9ca4 = !r0.f47779xae7a2e7a;
            com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47781x69e308f6.removeCallbacks(com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47802x9de49ecb);
            com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47781x69e308f6.sendEmptyMessage(1);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                m97148xe16993de();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.TAG, "VideoRequestMediaDateCallback run: ", th6);
                com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.m97129x81b4feb4(-14, th6);
            }
        }
    }

    /* renamed from: com.tencent.tav.core.parallel.newversion.AssetSingleExportThread$VideoWriterProgressListener */
    /* loaded from: classes16.dex */
    public class VideoWriterProgressListener implements com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.WriterProgressListener {
        private VideoWriterProgressListener() {
        }

        @Override // com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.WriterProgressListener
        /* renamed from: onError */
        public void mo96421xaf8aa769(com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6 c25680x8a5723a6) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.TAG, "VideoWriterProgressListener onError: ", c25680x8a5723a6.f47512xb5275940);
            com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.m97130x81b4feb4(c25680x8a5723a6);
        }

        @Override // com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.WriterProgressListener
        /* renamed from: onProgressChanged */
        public void mo96422x95ed2be8(com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27 c25667x9a895e27, long j17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.TAG, "onProgressChanged: videoWriter " + j17 + "  / " + com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.m97133x51e8b0a());
            if (j17 == -1) {
                com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636 handlerThreadC25726xa160c636 = com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this;
                handlerThreadC25726xa160c636.f47800x4f7325e8 = handlerThreadC25726xa160c636.f47784xec76f75d.f47717x16fae70.m97256x51e8b0a().m97232x31040141();
                com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47797xb46c8fc8 = 1.0f;
                com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47804x24669d70 = true;
                com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47781x69e308f6.sendEmptyMessage(1);
                return;
            }
            com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47800x4f7325e8 = j17;
            com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636 handlerThreadC25726xa160c6362 = com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this;
            com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26 = handlerThreadC25726xa160c6362.f47784xec76f75d.f47717x16fae70;
            long m97232x31040141 = c25738xead39d26 != null ? c25738xead39d26.m97256x51e8b0a().m97232x31040141() : handlerThreadC25726xa160c6362.f47799x3b99d11e != null ? com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47799x3b99d11e.m96553x89444d94() : 0L;
            if (m97232x31040141 != 0) {
                com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636 handlerThreadC25726xa160c6363 = com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this;
                handlerThreadC25726xa160c6363.f47797xb46c8fc8 = (((float) handlerThreadC25726xa160c6363.f47800x4f7325e8) * 1.0f) / ((float) m97232x31040141);
            } else {
                com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47797xb46c8fc8 = 1.0f;
            }
            com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636 handlerThreadC25726xa160c6364 = com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this;
            handlerThreadC25726xa160c6364.f47784xec76f75d.m97033x3ae760af(handlerThreadC25726xa160c6364.f47797xb46c8fc8);
            if (com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47792x14c752d6 != null) {
                com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47792x14c752d6.mo525x7bb163d5(com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47784xec76f75d);
            }
        }
    }

    public HandlerThreadC25726xa160c636(com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2953x3164ae.C25719xdaa2a3bb c25719xdaa2a3bb, com.p314xaae8f345.tav.p2947x2eaf9f.C25659xe2dfb08b c25659xe2dfb08b, com.p314xaae8f345.tav.p2947x2eaf9f.C25671x3e055ec6 c25671x3e055ec6, com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036 c25679xbb204036) {
        super("ExportThread");
        this.TAG = "AssetExportThread-" + hashCode();
        this.f47804x24669d70 = false;
        this.f47778x7a92ef0b = false;
        this.f47798x14be9ca4 = false;
        this.f47772x6aeaee3f = false;
        this.f47800x4f7325e8 = 0L;
        this.f47774xb3787c3 = 0L;
        this.f47779xae7a2e7a = false;
        this.f47783x6f5df8e = false;
        this.f47801xa8e9e066 = false;
        this.f47775x53216cab = false;
        this.f47787xafdb8087 = false;
        this.f47794x416042c2 = new com.p314xaae8f345.tav.p2968xc84c5534.C25855x7912cb4e();
        this.f47802x9de49ecb = new com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.VideoFrameOperateTimeoutCallback();
        this.f47776x84421610 = new com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.AudioFrameOperateTimeoutCallback();
        this.f47789x12bc12b9 = android.os.SystemClock.uptimeMillis();
        this.f47788xd41a1be = android.os.SystemClock.uptimeMillis();
        this.f47786x5097cd97 = true;
        this.f47795x734ee833 = false;
        this.f47790xae3bcde3 = com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d;
        this.f47784xec76f75d = c25719xdaa2a3bb;
        this.f47770x3a2afaa6 = c25671x3e055ec6;
        this.f47782xb6e83442 = c25659xe2dfb08b;
        this.f47769xb3299a4 = new com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984(c25679xbb204036.m96735x317dfe9c(), c25679xbb204036.m96733x2721f40c(), 2);
        this.f47780xc5684a2b = c25679xbb204036;
    }

    /* renamed from: createAudioTrackOutput */
    private com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694 m97125x3a866992() {
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f47782xb6e83442.f47284x58ceaf0.mo96143x6e29e370(2);
        if (arrayList == null || arrayList.size() <= 0) {
            return new com.p314xaae8f345.tav.p2947x2eaf9f.C25678xf4d40d71();
        }
        com.p314xaae8f345.tav.p2947x2eaf9f.C25663x1ed1a5da c25663x1ed1a5da = new com.p314xaae8f345.tav.p2947x2eaf9f.C25663x1ed1a5da(arrayList, null, this.f47791xc0157086);
        c25663x1ed1a5da.m96549xb0bd9928(this.f47770x3a2afaa6);
        c25663x1ed1a5da.m96548x66f3cb62(this.f47769xb3299a4);
        return c25663x1ed1a5da;
    }

    /* renamed from: createAudioWriterInput */
    private com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27 m97126x7d316a7d() {
        return new com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27(2, this.f47782xb6e83442.m96491x3527020b());
    }

    /* renamed from: createVideoTrackOutput */
    private com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694 m97127xcb2887cd() {
        java.util.List<com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b> mo96143x6e29e370 = this.f47782xb6e83442.f47284x58ceaf0.mo96143x6e29e370(1);
        if (mo96143x6e29e370 == null || mo96143x6e29e370.size() <= 0) {
            return new com.p314xaae8f345.tav.p2947x2eaf9f.C25678xf4d40d71();
        }
        java.util.HashMap hashMap = new java.util.HashMap(4);
        hashMap.put("frame-rate", java.lang.Integer.valueOf(this.f47780xc5684a2b.m96747x21f69ea8()));
        com.p314xaae8f345.tav.p2947x2eaf9f.C25665x97f6fa3 c25665x97f6fa3 = new com.p314xaae8f345.tav.p2947x2eaf9f.C25665x97f6fa3(mo96143x6e29e370, hashMap, this.f47782xb6e83442.f47285xf1239f2f, this.f47791xc0157086);
        c25665x97f6fa3.m96569xfbd38eb1(this.f47782xb6e83442.f47309xaffe922f);
        c25665x97f6fa3.m96568xfbd38e8b(this.f47782xb6e83442.m96494xe97d3fc9());
        c25665x97f6fa3.m96570x35f743c0(this.f47782xb6e83442.m96493x52cf0271());
        c25665x97f6fa3.m96567x7668c57b(this.f47782xb6e83442.m96492x9c45adb3());
        return c25665x97f6fa3;
    }

    /* renamed from: createVideoWriterInput */
    private com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27 m97128xdd388b8() {
        com.p314xaae8f345.tav.p2968xc84c5534.C25855x7912cb4e c25855x7912cb4e = this.f47794x416042c2;
        if (c25855x7912cb4e != null) {
            c25855x7912cb4e.m98320xf0ece06(this.f47780xc5684a2b.m96747x21f69ea8());
        }
        return new com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27(1, this.f47782xb6e83442.m96491x3527020b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: exportError */
    public synchronized void m97129x81b4feb4(int i17, java.lang.Throwable th6) {
        m97130x81b4feb4(new com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6(i17, th6));
    }

    /* renamed from: exportSuccess */
    private synchronized void m97131xd14cf1af() {
        synchronized (this) {
            com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25661xf379654e m97030x84e1a54f = this.f47784xec76f75d.m97030x84e1a54f();
            com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25661xf379654e enumC25661xf379654e = com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25661xf379654e.AssetExportStatusCompleted;
            if (m97030x84e1a54f == enumC25661xf379654e) {
                return;
            }
            this.f47784xec76f75d.m97033x3ae760af(1.0f);
            this.f47784xec76f75d.m97034x17b80bc3(enumC25661xf379654e);
            com.p314xaae8f345.tav.p2968xc84c5534.C25855x7912cb4e c25855x7912cb4e = this.f47794x416042c2;
            if (c25855x7912cb4e != null) {
                c25855x7912cb4e.m98317x45bd610();
            }
            p012xc85e97e9.p093xedfae76a.k0 k0Var = this.f47792x14c752d6;
            if (k0Var != null) {
                k0Var.mo525x7bb163d5(this.f47784xec76f75d);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: exporting */
    public void m97132x192d77ae() {
        m97134x77159077();
        this.f47784xec76f75d.m97034x17b80bc3(com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25661xf379654e.AssetParallelStatusStarted);
        if (this.f47803x44dd1cce != null) {
            this.f47796x2be7fef9 = new android.os.HandlerThread("VideoWriter");
            this.f47803x44dd1cce.m96632xaa772396(new com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.VideoWriterProgressListener());
            this.f47803x44dd1cce.m96626x7ed09da8(this.f47796x2be7fef9, new com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.VideoRequestMediaDataCallback());
        } else {
            this.f47798x14be9ca4 = true;
            this.f47804x24669d70 = true;
        }
        if (this.f47777x211073e9 != null) {
            this.f47768xa84655d4 = new android.os.HandlerThread("AudioWriter");
            this.f47777x211073e9.m96632xaa772396(new com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.AudioWriterProgressListener());
            this.f47777x211073e9.m96626x7ed09da8(this.f47768xa84655d4, new com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.AudioRequestMediaDataCallback());
        } else {
            this.f47772x6aeaee3f = true;
            this.f47778x7a92ef0b = true;
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(this.TAG, "[%d]exporting", java.lang.Integer.valueOf(hashCode()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getDuration */
    public long m97133x51e8b0a() {
        com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26;
        com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2953x3164ae.C25719xdaa2a3bb c25719xdaa2a3bb = this.f47784xec76f75d;
        if (c25719xdaa2a3bb != null && (c25738xead39d26 = c25719xdaa2a3bb.f47717x16fae70) != null) {
            return c25738xead39d26.m97256x51e8b0a().m97232x31040141() * 2;
        }
        com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694 abstractC25664x249c1694 = this.f47773x17cd2839;
        long m96553x89444d94 = abstractC25664x249c1694 != null ? abstractC25664x249c1694.m96553x89444d94() : 0L;
        com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694 abstractC25664x249c16942 = this.f47799x3b99d11e;
        return m96553x89444d94 + (abstractC25664x249c16942 != null ? abstractC25664x249c16942.m96553x89444d94() : 0L);
    }

    /* renamed from: initReaderAndWriter */
    private void m97134x77159077() {
        com.p314xaae8f345.tav.p2947x2eaf9f.C25662xaba0e3b3 c25662xaba0e3b3 = new com.p314xaae8f345.tav.p2947x2eaf9f.C25662xaba0e3b3(this.f47782xb6e83442.f47284x58ceaf0);
        this.f47766x48373bd3 = c25662xaba0e3b3;
        c25662xaba0e3b3.m96540x5d30e02e(this.f47784xec76f75d.f47717x16fae70);
        com.p314xaae8f345.tav.p2947x2eaf9f.C25659xe2dfb08b c25659xe2dfb08b = this.f47782xb6e83442;
        com.p314xaae8f345.tav.p2947x2eaf9f.C25666xb4e42f63 c25666xb4e42f63 = new com.p314xaae8f345.tav.p2947x2eaf9f.C25666xb4e42f63(c25659xe2dfb08b.f47297x3e2d9be2, c25659xe2dfb08b.f47298x3e2fc6f7);
        this.f47767x517a8783 = c25666xb4e42f63;
        c25666xb4e42f63.m96598xbcfc2a5d(this.f47793x16878e1f);
        com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26 = this.f47784xec76f75d.f47717x16fae70;
        if (c25738xead39d26 != null) {
            this.f47767x517a8783.m96600x10b0680f(c25738xead39d26.m97260x75286aac());
            this.f47767x517a8783.m96578xab1976f6(this.f47784xec76f75d.f47717x16fae70.m97258xb58839a5());
            com.p314xaae8f345.tav.p2968xc84c5534.C25855x7912cb4e c25855x7912cb4e = this.f47794x416042c2;
            if (c25855x7912cb4e != null) {
                c25855x7912cb4e.m98319x460f9ef0(this.f47784xec76f75d.f47717x16fae70.m97257x37a7fb48());
            }
        }
        this.f47767x517a8783.m96596x5ca3d7ad(this.f47780xc5684a2b);
        int i17 = this.f47784xec76f75d.f47718x368f3a;
        if (i17 == 1) {
            com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694 m97127xcb2887cd = m97127xcb2887cd();
            this.f47799x3b99d11e = m97127xcb2887cd;
            if (this.f47766x48373bd3.m96533xcca42b12(m97127xcb2887cd)) {
                this.f47766x48373bd3.m96532xf948c102(this.f47799x3b99d11e);
            }
            com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27 m97128xdd388b8 = m97128xdd388b8();
            this.f47803x44dd1cce = m97128xdd388b8;
            com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f c25706x7dc2d64f = this.f47782xb6e83442.f47309xaffe922f;
            if (c25706x7dc2d64f != null) {
                m97128xdd388b8.m96628x361aa546(c25706x7dc2d64f.m96960x75267e64());
            }
            if (this.f47767x517a8783.m96573x92a53f99(this.f47803x44dd1cce)) {
                this.f47803x44dd1cce.m96631x9a7f9d2a(this.f47782xb6e83442.f47283xa9a60b16 ? com.p314xaae8f345.tav.p2959x5befac44.C25762xc5b4d2ed.m97468x940ffc67(new com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85(this.f47780xc5684a2b.m96741xa83ce40f(), this.f47780xc5684a2b.m96739x4590a3fe()), this.f47782xb6e83442.f47284x58ceaf0.mo96120x47007694(), this.f47782xb6e83442.f47284x58ceaf0.mo96122xbb14e2a4()) : null);
                this.f47767x517a8783.m96572xb51e2ba9(this.f47803x44dd1cce);
            }
        } else if (i17 == 2) {
            com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694 m97125x3a866992 = m97125x3a866992();
            this.f47773x17cd2839 = m97125x3a866992;
            if (!(m97125x3a866992 instanceof com.p314xaae8f345.tav.p2947x2eaf9f.C25678xf4d40d71) && this.f47766x48373bd3.m96533xcca42b12(m97125x3a866992)) {
                this.f47766x48373bd3.m96532xf948c102(this.f47773x17cd2839);
            }
            if (!(this.f47773x17cd2839 instanceof com.p314xaae8f345.tav.p2947x2eaf9f.C25678xf4d40d71)) {
                this.f47777x211073e9 = m97126x7d316a7d();
            }
            com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27 c25667x9a895e27 = this.f47777x211073e9;
            if (c25667x9a895e27 != null && this.f47767x517a8783.m96573x92a53f99(c25667x9a895e27)) {
                this.f47767x517a8783.m96572xb51e2ba9(this.f47777x211073e9);
            }
        }
        this.f47767x517a8783.m96602x57887a1a(this.f47791xc0157086);
        this.f47767x517a8783.m96592x60565d73(this.f47784xec76f75d);
        this.f47767x517a8783.m96592x60565d73(this.f47784xec76f75d);
        this.f47766x48373bd3.m96541x38624fca(this.f47767x517a8783);
    }

    /* renamed from: releaseAudio */
    private void m97135x8934700f(final java.lang.Runnable runnable) {
        if (this.f47768xa84655d4 == null) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.w(this.TAG, "releaseAudio is null");
        } else {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(this.TAG, "releaseAudio");
            new android.os.Handler(this.f47768xa84655d4.getLooper()).post(new java.lang.Runnable() { // from class: com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.2
                @Override // java.lang.Runnable
                public void run() {
                    if (com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47766x48373bd3 != null) {
                        com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47766x48373bd3.m96534x8f43dab2();
                        com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47766x48373bd3 = null;
                    }
                    if (com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47794x416042c2 != null) {
                        long j17 = 0;
                        com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47794x416042c2.m98322xed73160c((com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47799x3b99d11e == null || com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47799x3b99d11e.mo96554xc291ccac() == null) ? 0L : com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47799x3b99d11e.mo96554xc291ccac().m98301x7534818e() * 1000);
                        com.p314xaae8f345.tav.p2968xc84c5534.C25855x7912cb4e c25855x7912cb4e = com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47794x416042c2;
                        if (com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47767x517a8783 != null && com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47767x517a8783.m96583x15c7784() != null) {
                            j17 = com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47767x517a8783.m96583x15c7784().m98301x7534818e() * 1000;
                        }
                        c25855x7912cb4e.m98321xb7c8f976(j17);
                    }
                    if (com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47767x517a8783 != null) {
                        try {
                            com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47767x517a8783.m96579xed7248c9();
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e("AssetExportSession", "code = -10 run: finishWriting error", e17);
                            com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.m97129x81b4feb4(-10, e17);
                        }
                    }
                    if (com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47777x211073e9 != null) {
                        com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47777x211073e9.m96618x5a5ddf8();
                    }
                    java.lang.Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    if (com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47768xa84655d4 != null) {
                        com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47768xa84655d4.quitSafely();
                        com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47768xa84655d4 = null;
                    }
                }
            });
        }
    }

    /* renamed from: releaseVideo */
    private void m97136x8a56e8b4(final java.lang.Runnable runnable) {
        if (this.f47796x2be7fef9 == null) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.w(this.TAG, "videoExportThread is null");
        } else {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(this.TAG, "releaseVideo");
            new android.os.Handler(this.f47796x2be7fef9.getLooper()).post(new java.lang.Runnable() { // from class: com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.1
                @Override // java.lang.Runnable
                public void run() {
                    if (com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47766x48373bd3 != null) {
                        com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47766x48373bd3.m96534x8f43dab2();
                        com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47766x48373bd3 = null;
                    }
                    if (com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47794x416042c2 != null) {
                        long j17 = 0;
                        com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47794x416042c2.m98322xed73160c((com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47799x3b99d11e == null || com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47799x3b99d11e.mo96554xc291ccac() == null) ? 0L : com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47799x3b99d11e.mo96554xc291ccac().m98301x7534818e() * 1000);
                        com.p314xaae8f345.tav.p2968xc84c5534.C25855x7912cb4e c25855x7912cb4e = com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47794x416042c2;
                        if (com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47767x517a8783 != null && com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47767x517a8783.m96583x15c7784() != null) {
                            j17 = com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47767x517a8783.m96583x15c7784().m98301x7534818e() * 1000;
                        }
                        c25855x7912cb4e.m98321xb7c8f976(j17);
                    }
                    if (com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47767x517a8783 != null) {
                        try {
                            com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47767x517a8783.m96579xed7248c9();
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e("AssetExportSession", "code = -10 run: finishWriting error", e17);
                            com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.m97129x81b4feb4(-10, e17);
                        }
                    }
                    if (com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47803x44dd1cce != null) {
                        com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47803x44dd1cce.m96618x5a5ddf8();
                    }
                    if ((com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47799x3b99d11e instanceof com.p314xaae8f345.tav.p2947x2eaf9f.C25665x97f6fa3) && ((com.p314xaae8f345.tav.p2947x2eaf9f.C25665x97f6fa3) com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47799x3b99d11e).m96563x57d6f97f() != null) {
                        ((com.p314xaae8f345.tav.p2947x2eaf9f.C25665x97f6fa3) com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47799x3b99d11e).m96563x57d6f97f().mo96822x41012807();
                    }
                    java.lang.Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    if (com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47796x2be7fef9 != null) {
                        com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47796x2be7fef9.quitSafely();
                        com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.f47796x2be7fef9 = null;
                    }
                }
            });
        }
    }

    /* renamed from: cancel */
    public synchronized void m97137xae7a2e7a() {
        this.f47779xae7a2e7a = true;
        com.p314xaae8f345.tav.p2968xc84c5534.C25855x7912cb4e c25855x7912cb4e = this.f47794x416042c2;
        if (c25855x7912cb4e != null) {
            c25855x7912cb4e.m98318x6761d4f();
            this.f47794x416042c2 = null;
        }
        android.os.Handler handler = this.f47781x69e308f6;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.3
                @Override // java.lang.Runnable
                public void run() {
                    com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.m97142x41012807(null);
                }
            });
        }
    }

    /* renamed from: clearResource */
    public void m97138xbfab417b() {
        if (m97139x74d4a6c7() != null) {
            m97139x74d4a6c7().mo72372xbfab417b();
        }
    }

    /* renamed from: getMuxer */
    public com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422 m97139x74d4a6c7() {
        com.p314xaae8f345.tav.p2947x2eaf9f.C25666xb4e42f63 c25666xb4e42f63 = this.f47767x517a8783;
        if (c25666xb4e42f63 == null || c25666xb4e42f63.mo96577xf855d0af() == null) {
            return null;
        }
        return this.f47767x517a8783.mo96577xf855d0af().m97503x74d4a6c7();
    }

    /* renamed from: getReportSession */
    public com.p314xaae8f345.tav.p2968xc84c5534.C25855x7912cb4e m97140xfebfff0c() {
        return this.f47794x416042c2;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        int i17 = message.what;
        if (i17 == 1 || i17 == 2) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(this.TAG, "handleMessage:%d", java.lang.Integer.valueOf(i17));
            if (!this.f47785x697ca065) {
                if (this.f47779xae7a2e7a) {
                    com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(this.TAG, "setSegmentStatus AssetParallelStatusCancelled");
                    this.f47785x697ca065 = true;
                    this.f47784xec76f75d.m97034x17b80bc3(com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25661xf379654e.AssetParallelStatusCancelled);
                    p012xc85e97e9.p093xedfae76a.k0 k0Var = this.f47792x14c752d6;
                    if (k0Var != null) {
                        k0Var.mo525x7bb163d5(this.f47784xec76f75d);
                    }
                    return true;
                }
                if (this.f47804x24669d70 && this.f47778x7a92ef0b && this.f47772x6aeaee3f && this.f47798x14be9ca4) {
                    com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(this.TAG, "setSegmentStatus AssetExportStatusCompleted");
                    this.f47785x697ca065 = true;
                    this.f47784xec76f75d.m97034x17b80bc3(com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25661xf379654e.AssetExportStatusCompleted);
                    p012xc85e97e9.p093xedfae76a.k0 k0Var2 = this.f47792x14c752d6;
                    if (k0Var2 != null) {
                        k0Var2.mo525x7bb163d5(this.f47784xec76f75d);
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: observe */
    public void m97141x9d92d11c(p012xc85e97e9.p093xedfae76a.k0 k0Var) {
        this.f47792x14c752d6 = k0Var;
    }

    /* renamed from: release */
    public void m97142x41012807(java.lang.Runnable runnable) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(this.TAG, "finish");
        if (this.f47787xafdb8087) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.w(this.TAG, "already release");
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        this.f47787xafdb8087 = true;
        m97136x8a56e8b4(runnable);
        m97135x8934700f(runnable);
        quitSafely();
    }

    /* renamed from: setMediaFactory */
    public void m97143x5750fe08(com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25652xcd3d9f6f interfaceC25652xcd3d9f6f) {
        this.f47791xc0157086 = interfaceC25652xcd3d9f6f;
    }

    /* renamed from: setRenderContextParams */
    public void m97144xbcfc2a5d(com.p314xaae8f345.tav.p2959x5befac44.C25780x613b55ff c25780x613b55ff) {
        this.f47793x16878e1f = c25780x613b55ff;
        com.p314xaae8f345.tav.p2947x2eaf9f.C25666xb4e42f63 c25666xb4e42f63 = this.f47767x517a8783;
        if (c25666xb4e42f63 != null) {
            c25666xb4e42f63.m96598xbcfc2a5d(c25780x613b55ff);
        }
    }

    /* renamed from: setTimeoutParameter */
    public void m97145xa1d0ffca(boolean z17, boolean z18, long j17) {
        this.f47786x5097cd97 = z17;
        this.f47795x734ee833 = z18;
        this.f47790xae3bcde3 = j17;
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(this.TAG, "setNeedCheckFrameProcessTimeout:%b timeoutInterruptWork:%b, maxTimeoutMs: %d", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Long.valueOf(this.f47790xae3bcde3));
    }

    /* renamed from: startExport */
    public void m97146x791872b6() {
        start();
        this.f47779xae7a2e7a = false;
        com.p314xaae8f345.tav.p2968xc84c5534.C25855x7912cb4e c25855x7912cb4e = this.f47794x416042c2;
        if (c25855x7912cb4e != null) {
            c25855x7912cb4e.m98316x9f0979af(java.lang.System.nanoTime());
        }
        android.os.Handler handler = new android.os.Handler(getLooper(), this);
        this.f47781x69e308f6 = handler;
        handler.post(new java.lang.Runnable() { // from class: com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.4
            @Override // java.lang.Runnable
            public void run() {
                com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2954xd52f5f38.HandlerThreadC25726xa160c636.this.m97132x192d77ae();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: exportError */
    public void m97130x81b4feb4(com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6 c25680x8a5723a6) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(this.TAG, "exportError:%s", c25680x8a5723a6.m96769x9616526c());
        com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25661xf379654e m97030x84e1a54f = this.f47784xec76f75d.m97030x84e1a54f();
        com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25661xf379654e enumC25661xf379654e = com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25661xf379654e.AssetParallelStatusFailed;
        if (m97030x84e1a54f != enumC25661xf379654e) {
            this.f47783x6f5df8e = true;
            this.f47784xec76f75d.m97034x17b80bc3(enumC25661xf379654e);
            this.f47784xec76f75d.f47709xbac3e81a = c25680x8a5723a6;
            com.p314xaae8f345.tav.p2968xc84c5534.C25855x7912cb4e c25855x7912cb4e = this.f47794x416042c2;
            if (c25855x7912cb4e != null) {
                c25855x7912cb4e.m98315x9e438755();
            }
            p012xc85e97e9.p093xedfae76a.k0 k0Var = this.f47792x14c752d6;
            if (k0Var != null) {
                k0Var.mo525x7bb163d5(this.f47784xec76f75d);
            }
        }
    }
}
