package com.p314xaae8f345.tav.p2947x2eaf9f;

/* renamed from: com.tencent.tav.core.AssetExportThread */
/* loaded from: classes16.dex */
public class HandlerThreadC25656x34da0dce extends android.os.HandlerThread implements android.os.Handler.Callback {
    private static final java.lang.String TAG = "AssetExportThread";

    /* renamed from: msg_done_a */
    private static final int f47183xbc006962 = 2;

    /* renamed from: msg_done_v */
    private static final int f47184xbc006977 = 1;

    /* renamed from: MEDIA_AUDIO_NOT_READ_TIMEOUT */
    private long f47185x305a9de8;

    /* renamed from: MEDIA_VIDEO_NOT_READ_TIMEOUT */
    private long f47186x6b7de3e3;

    /* renamed from: assetReader */
    private com.p314xaae8f345.tav.p2947x2eaf9f.C25662xaba0e3b3 f47187x48373bd3;

    /* renamed from: assetWriter */
    private com.p314xaae8f345.tav.p2947x2eaf9f.C25666xb4e42f63 f47188x517a8783;

    /* renamed from: audioExportThread */
    private android.os.HandlerThread f47189xa84655d4;

    /* renamed from: audioInfo */
    private com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984 f47190xb3299a4;

    /* renamed from: audioMix */
    private com.p314xaae8f345.tav.p2947x2eaf9f.C25671x3e055ec6 f47191x3a2afaa6;

    /* renamed from: audioProgress */
    private float f47192x51268c23;

    /* renamed from: audioReadFinish */
    private boolean f47193x6aeaee3f;

    /* renamed from: audioReader */
    private com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694 f47194x17cd2839;

    /* renamed from: audioTime */
    private long f47195xb3787c3;

    /* renamed from: audioTimeout */
    private volatile boolean f47196x53216cab;

    /* renamed from: audioTimeoutCallback */
    private com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.AudioFrameOperateTimeoutCallback f47197x84421610;

    /* renamed from: audioWriter */
    private com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27 f47198x211073e9;

    /* renamed from: audioWriterDone */
    private volatile boolean f47199x7a92ef0b;

    /* renamed from: callbackHandler */
    private com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52.ExportCallbackHandler f47200x1094e745;

    /* renamed from: cancel */
    private volatile boolean f47201xae7a2e7a;

    /* renamed from: count */
    private int f47202x5a7510f;

    /* renamed from: encodeOption */
    private final com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036 f47203xc5684a2b;

    /* renamed from: exportHandler */
    private android.os.Handler f47204x69e308f6;

    /* renamed from: exportSession */
    private com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52 f47205xb6e83442;

    /* renamed from: isFinishing */
    private volatile boolean f47206x697ca065;

    /* renamed from: isNeedCheckFrameProcessTimeout */
    private boolean f47207x5097cd97;

    /* renamed from: lastHandleAudioTimeStamp */
    private volatile long f47208xd41a1be;

    /* renamed from: lastHandleVideoTimeStamp */
    private volatile long f47209x12bc12b9;

    /* renamed from: logger */
    private final com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1 f47210xbe97f590;

    /* renamed from: maxTimeoutMs */
    private long f47211xae3bcde3;

    /* renamed from: mediaFactory */
    private com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25652xcd3d9f6f f47212xc0157086;

    /* renamed from: renderContextParams */
    private com.p314xaae8f345.tav.p2959x5befac44.C25780x613b55ff f47213x16878e1f;

    /* renamed from: reportSession */
    private com.p314xaae8f345.tav.p2968xc84c5534.C25855x7912cb4e f47214x416042c2;

    /* renamed from: timeLock */
    private final java.lang.Object f47215x842a5d98;

    /* renamed from: timeoutInterruptWork */
    private boolean f47216x734ee833;

    /* renamed from: videoExportThread */
    private android.os.HandlerThread f47217x2be7fef9;

    /* renamed from: videoProgress */
    private float f47218xb46c8fc8;

    /* renamed from: videoReadFinish */
    private boolean f47219x14be9ca4;

    /* renamed from: videoReader */
    private com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694 f47220x3b99d11e;

    /* renamed from: videoTime */
    private long f47221x4f7325e8;

    /* renamed from: videoTimeout */
    private volatile boolean f47222xa8e9e066;

    /* renamed from: videoTimeoutCallback */
    private com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.VideoFrameOperateTimeoutCallback f47223x9de49ecb;

    /* renamed from: videoWriter */
    private com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27 f47224x44dd1cce;

    /* renamed from: videoWriterDone */
    private volatile boolean f47225x24669d70;

    /* renamed from: com.tencent.tav.core.AssetExportThread$AudioFrameOperateTimeoutCallback */
    /* loaded from: classes16.dex */
    public class AudioFrameOperateTimeoutCallback implements java.lang.Runnable {
        private AudioFrameOperateTimeoutCallback() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long currentTimeMillis;
            long j17;
            synchronized (com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47215x842a5d98) {
                currentTimeMillis = java.lang.System.currentTimeMillis();
                j17 = com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47208xd41a1be;
            }
            long j18 = currentTimeMillis - j17;
            com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47210xbe97f590.i(com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.TAG, "check audio timeout , interval: " + j18 + " maxTimeoutMs: " + com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47211xae3bcde3 + " currentTime: " + currentTimeMillis + " lastHandleVideoTimeStamp: " + j17);
            if (j18 >= com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47211xae3bcde3) {
                if (!com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47216x734ee833) {
                    com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47205xb6e83442.f47166x4de8662b = new com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6(-204);
                    return;
                }
                try {
                    java.lang.String format = new java.text.SimpleDateFormat("yyyy-MM-dd-HH:mm:ss").format(java.lang.Long.valueOf(currentTimeMillis));
                    com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47210xbe97f590.e(com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.TAG, "audioTimeout, interval: " + j18 + " maxTimeoutMs: " + com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47211xae3bcde3 + " currentTime: " + currentTimeMillis + "(" + format + ") lastHandleAudioTimeStamp: " + j17);
                } catch (java.lang.Exception e17) {
                    e17.getStackTrace();
                }
                com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47196x53216cab = true;
                com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.m96406x81b4feb4(new com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97203xf8c200aa(-3L, -207, "audio handle frame timeout", null)));
                com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.m96409xb4098c93();
            }
        }
    }

    /* renamed from: com.tencent.tav.core.AssetExportThread$AudioRequestMediaDataCallback */
    /* loaded from: classes16.dex */
    public class AudioRequestMediaDataCallback implements java.lang.Runnable {

        /* renamed from: isReady */
        private boolean f47230x7b5e8699;

        /* renamed from: logPrintTime */
        private long f47231x23fe4436;

        /* renamed from: notReadyReason */
        private java.lang.String f47232x5b365cf4;

        /* renamed from: notReadyStart */
        private long f47233xe1fde3b2;

        private AudioRequestMediaDataCallback() {
            this.f47233xe1fde3b2 = 0L;
            this.f47231x23fe4436 = 0L;
            this.f47230x7b5e8699 = true;
            this.f47232x5b365cf4 = "";
        }

        /* renamed from: onAudioRequestMediaData */
        private void m96420xf5fb4736() {
            while (true) {
                if (com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47199x7a92ef0b || com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47201xae7a2e7a || com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47198x211073e9 == null) {
                    break;
                }
                long j17 = com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47208xd41a1be;
                synchronized (com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47215x842a5d98) {
                    com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47208xd41a1be = java.lang.System.currentTimeMillis();
                }
                long j18 = com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47208xd41a1be;
                if (com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47207x5097cd97) {
                    com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47204x69e308f6.removeCallbacks(com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47197x84421610);
                    com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47204x69e308f6.postDelayed(com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47197x84421610, com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47211xae3bcde3);
                    if (this.f47230x7b5e8699) {
                        com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47210xbe97f590.m97814x5d2a96d(com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.TAG, "post audio timeout callback, lastTime: " + j17 + " currentTime: " + j18);
                    }
                }
                if (com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47194x17cd2839 == null || !com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47198x211073e9.m96623x11220049()) {
                    java.lang.String m96619x73c34da0 = com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47198x211073e9.m96619x73c34da0();
                    if (!this.f47232x5b365cf4.equals(m96619x73c34da0) || java.lang.System.currentTimeMillis() - this.f47231x23fe4436 > 1000) {
                        this.f47231x23fe4436 = java.lang.System.currentTimeMillis();
                        this.f47232x5b365cf4 = m96619x73c34da0;
                        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1 c25799x4a77fd1 = com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47210xbe97f590;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("not ReadyForMoreAudioMediaData, ");
                        sb6.append(com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47198x211073e9.m96619x73c34da0());
                        sb6.append(" audioReader: ");
                        sb6.append(com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47198x211073e9 != null);
                        c25799x4a77fd1.m97814x5d2a96d(com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.TAG, sb6.toString());
                    }
                    if (this.f47230x7b5e8699) {
                        this.f47230x7b5e8699 = false;
                        this.f47233xe1fde3b2 = java.lang.System.currentTimeMillis();
                    } else if (java.lang.System.currentTimeMillis() - this.f47233xe1fde3b2 > com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47185x305a9de8) {
                        com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.m96406x81b4feb4(new com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97203xf8c200aa(-3L, -131, "audio ready timeout", null)));
                        com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47210xbe97f590.e(com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.TAG, "onAudioRequestMediaData wait for ready timeout");
                        break;
                    }
                } else {
                    this.f47230x7b5e8699 = true;
                    com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47194x17cd2839.m96553x89444d94();
                    com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m96552xf57602b2 = com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47194x17cd2839.m96552xf57602b2(true);
                    com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d m97193x75286adb = m96552xf57602b2.m97193x75286adb();
                    long m97206x8311a768 = m97193x75286adb.m97206x8311a768();
                    com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47210xbe97f590.m97814x5d2a96d(com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.TAG, "onAudioRequestMediaData stateCode:" + m97206x8311a768 + " lastTime: " + j17 + " currentTime: " + j18);
                    if (m97206x8311a768 >= 0) {
                        com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6 m96616x14ffdac4 = com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47198x211073e9.m96616x14ffdac4(m96552xf57602b2);
                        if (m96616x14ffdac4 != null) {
                            com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.m96406x81b4feb4(m96616x14ffdac4);
                        }
                        if (m96552xf57602b2.m97195xfb85bb43().m97232x31040141() >= com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47205xb6e83442.f47172x16fae70.m97256x51e8b0a().m97232x31040141()) {
                            com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47198x211073e9.m96624xb0dd6571();
                            break;
                        }
                    } else if (m97193x75286adb.m97206x8311a768() == -1) {
                        com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47198x211073e9.m96624xb0dd6571();
                        break;
                    } else if (m97193x75286adb.m97206x8311a768() != -4) {
                        com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.m96406x81b4feb4(new com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6(m97193x75286adb));
                        break;
                    }
                }
            }
            com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce handlerThreadC25656x34da0dce = com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this;
            handlerThreadC25656x34da0dce.f47193x6aeaee3f = true ^ handlerThreadC25656x34da0dce.f47201xae7a2e7a;
            com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47204x69e308f6.removeCallbacks(com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47197x84421610);
            com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47204x69e308f6.sendEmptyMessage(2);
            com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47210xbe97f590.d(com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.TAG, "onAudioRequestMediaData finish");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                m96420xf5fb4736();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47210xbe97f590.e(com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.TAG, "AudioRequestMediaDateCallback run: ", th6);
                com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.m96405x81b4feb4(-15, th6);
            }
        }
    }

    /* renamed from: com.tencent.tav.core.AssetExportThread$AudioWriterProgressListener */
    /* loaded from: classes16.dex */
    public class AudioWriterProgressListener implements com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.WriterProgressListener {
        private AudioWriterProgressListener() {
        }

        @Override // com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.WriterProgressListener
        /* renamed from: onError */
        public void mo96421xaf8aa769(com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6 c25680x8a5723a6) {
            com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47210xbe97f590.e(com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.TAG, "AudioWriterProgressListener onError: ", c25680x8a5723a6.f47512xb5275940);
            com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.m96406x81b4feb4(c25680x8a5723a6);
        }

        @Override // com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.WriterProgressListener
        /* renamed from: onProgressChanged */
        public void mo96422x95ed2be8(com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27 c25667x9a895e27, long j17) {
            com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47210xbe97f590.m97814x5d2a96d("AssetExportSession", "onProgressChanged: audioWriter " + j17 + "  / " + com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.m96411x51e8b0a());
            if (j17 == -1) {
                com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce handlerThreadC25656x34da0dce = com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this;
                handlerThreadC25656x34da0dce.f47195xb3787c3 = handlerThreadC25656x34da0dce.f47205xb6e83442.f47172x16fae70.m97256x51e8b0a().m97232x31040141();
                com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47192x51268c23 = 1.0f;
                com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47199x7a92ef0b = true;
                com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47204x69e308f6.sendEmptyMessage(2);
                return;
            }
            com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47195xb3787c3 = j17;
            long m97232x31040141 = com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47205xb6e83442.f47172x16fae70 != null ? com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47205xb6e83442.f47172x16fae70.m97256x51e8b0a().m97232x31040141() : com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47194x17cd2839 != null ? com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47194x17cd2839.m96553x89444d94() : 0L;
            if (m97232x31040141 != 0) {
                com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce handlerThreadC25656x34da0dce2 = com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this;
                handlerThreadC25656x34da0dce2.f47192x51268c23 = (((float) handlerThreadC25656x34da0dce2.f47221x4f7325e8) * 1.0f) / ((float) m97232x31040141);
            } else {
                com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47192x51268c23 = 1.0f;
            }
            com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47205xb6e83442.f47167xc454c22d = java.lang.Math.min(com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47218xb46c8fc8, com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47192x51268c23);
            if (com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47200x1094e745 != null) {
                com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47200x1094e745.mo96356xc562f1af(com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47205xb6e83442);
            }
            if ((com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47195xb3787c3 <= com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47221x4f7325e8 || !com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47225x24669d70) && com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47195xb3787c3 < com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47205xb6e83442.f47172x16fae70.m97256x51e8b0a().m97232x31040141()) {
                return;
            }
            com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce handlerThreadC25656x34da0dce3 = com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this;
            handlerThreadC25656x34da0dce3.f47195xb3787c3 = handlerThreadC25656x34da0dce3.f47205xb6e83442.f47172x16fae70.m97256x51e8b0a().m97232x31040141();
            com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47199x7a92ef0b = true;
            com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47204x69e308f6.sendEmptyMessage(2);
        }
    }

    /* renamed from: com.tencent.tav.core.AssetExportThread$VideoFrameOperateTimeoutCallback */
    /* loaded from: classes16.dex */
    public class VideoFrameOperateTimeoutCallback implements java.lang.Runnable {
        private VideoFrameOperateTimeoutCallback() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long currentTimeMillis;
            long j17;
            synchronized (com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47215x842a5d98) {
                currentTimeMillis = java.lang.System.currentTimeMillis();
                j17 = com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47209x12bc12b9;
            }
            long j18 = currentTimeMillis - j17;
            com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47210xbe97f590.i(com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.TAG, "check video timeout , interval: " + j18 + " maxTimeoutMs: " + com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47211xae3bcde3 + " currentTime: " + currentTimeMillis + " lastHandleVideoTimeStamp: " + j17);
            if (j18 >= com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47211xae3bcde3) {
                if (!com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47216x734ee833) {
                    com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47205xb6e83442.f47166x4de8662b = new com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6(-203);
                    return;
                }
                com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47222xa8e9e066 = true;
                try {
                    java.lang.String format = new java.text.SimpleDateFormat("yyyy-MM-dd-HH:mm:ss").format(java.lang.Long.valueOf(currentTimeMillis));
                    com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47210xbe97f590.e(com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.TAG, "videoTimeout, interval: " + j18 + " maxTimeoutMs: " + com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47211xae3bcde3 + " currentTime: " + currentTimeMillis + "(" + format + ") lastHandleVideoTimeStamp: " + j17);
                } catch (java.lang.Exception e17) {
                    e17.getStackTrace();
                }
                com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.m96406x81b4feb4(new com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97203xf8c200aa(-3L, -206, "video handle frame timeout", null)));
                com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.m96409xb4098c93();
            }
        }
    }

    /* renamed from: com.tencent.tav.core.AssetExportThread$VideoRequestMediaDataCallback */
    /* loaded from: classes16.dex */
    public class VideoRequestMediaDataCallback implements java.lang.Runnable {

        /* renamed from: cost */
        private long f47237x2eafcd;

        /* renamed from: frame */
        private long f47238x5d2a96d;

        /* renamed from: isReady */
        private boolean f47239x7b5e8699;

        /* renamed from: logPrintTime */
        private long f47240x23fe4436;

        /* renamed from: notReadyReason */
        private java.lang.String f47241x5b365cf4;

        /* renamed from: notReadyStart */
        private long f47242xe1fde3b2;

        private VideoRequestMediaDataCallback() {
            this.f47239x7b5e8699 = true;
            this.f47242xe1fde3b2 = 0L;
            this.f47240x23fe4436 = 0L;
            this.f47238x5d2a96d = 1L;
            this.f47237x2eafcd = 0L;
            this.f47241x5b365cf4 = "";
        }

        /* renamed from: onRequestMediaData */
        private void m96423xe16993de() {
            while (true) {
                if (com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47225x24669d70 || com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47201xae7a2e7a) {
                    break;
                }
                long j17 = com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47209x12bc12b9;
                synchronized (com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47215x842a5d98) {
                    com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47209x12bc12b9 = java.lang.System.currentTimeMillis();
                }
                long j18 = com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47209x12bc12b9;
                if (com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47207x5097cd97) {
                    com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47204x69e308f6.removeCallbacks(com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47223x9de49ecb);
                    com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47204x69e308f6.postDelayed(com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47223x9de49ecb, com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47211xae3bcde3);
                    if (this.f47239x7b5e8699) {
                        com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47210xbe97f590.m97814x5d2a96d(com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.TAG, "post video timeout callback, lastTime: " + j17 + " currentTime: " + j18);
                    }
                }
                if (com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47220x3b99d11e == null || !com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47224x44dd1cce.m96623x11220049()) {
                    java.lang.String m96619x73c34da0 = com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47224x44dd1cce.m96619x73c34da0();
                    if (!this.f47241x5b365cf4.equals(m96619x73c34da0) || java.lang.System.currentTimeMillis() - this.f47240x23fe4436 > 1000) {
                        this.f47240x23fe4436 = java.lang.System.currentTimeMillis();
                        this.f47241x5b365cf4 = m96619x73c34da0;
                        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1 c25799x4a77fd1 = com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47210xbe97f590;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("not ReadyForMoreMediaData, ");
                        sb6.append(com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47198x211073e9.m96619x73c34da0());
                        sb6.append(" audioReader: ");
                        sb6.append(com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47198x211073e9 != null);
                        c25799x4a77fd1.m97814x5d2a96d(com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.TAG, sb6.toString());
                    }
                    if (this.f47239x7b5e8699) {
                        this.f47239x7b5e8699 = false;
                        this.f47242xe1fde3b2 = java.lang.System.currentTimeMillis();
                    } else if (java.lang.System.currentTimeMillis() - this.f47242xe1fde3b2 > com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47186x6b7de3e3) {
                        com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.m96406x81b4feb4(new com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97203xf8c200aa(-3L, -130, "video ready timeout", null)));
                        com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47210xbe97f590.e(com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.TAG, "onVideoRequestMediaData wait for ready timeout");
                        break;
                    }
                } else {
                    this.f47239x7b5e8699 = true;
                    long nanoTime = java.lang.System.nanoTime();
                    com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m96552xf57602b2 = com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47220x3b99d11e.m96552xf57602b2(true);
                    if (com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47214x416042c2 != null) {
                        com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47214x416042c2.m98324x436f65eb(java.lang.System.nanoTime() - nanoTime);
                    }
                    com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d m97193x75286adb = m96552xf57602b2.m97193x75286adb();
                    com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47210xbe97f590.m97814x5d2a96d(com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.TAG, "onRequestMediaData stateCode: " + m97193x75286adb.m97206x8311a768() + " lastTime: " + j17 + " currentTime: " + j18);
                    if (m97193x75286adb.m97206x8311a768() >= 0) {
                        com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6 m96616x14ffdac4 = com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47224x44dd1cce.m96616x14ffdac4(m96552xf57602b2);
                        if (m96616x14ffdac4 != null) {
                            com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.m96406x81b4feb4(m96616x14ffdac4);
                        }
                        if (com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47214x416042c2 != null) {
                            com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47214x416042c2.m98325x4635e7b1(java.lang.System.nanoTime() - nanoTime);
                        }
                    } else if (m97193x75286adb.m97214x36f88ac9(-1)) {
                        com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47224x44dd1cce.m96624xb0dd6571();
                        break;
                    } else if (m97193x75286adb.m97206x8311a768() != -4) {
                        com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.m96406x81b4feb4(new com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6(m97193x75286adb));
                        break;
                    }
                }
            }
            if (com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47224x44dd1cce.f47387x4dc0ba99 != null) {
                com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47224x44dd1cce.f47387x4dc0ba99.mo97539x41012807();
            }
            if (com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47205xb6e83442.f47174xaffe9209 != null) {
                com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47205xb6e83442.f47174xaffe9209.mo96822x41012807();
            }
            com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47219x14be9ca4 = !r0.f47201xae7a2e7a;
            com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47204x69e308f6.removeCallbacks(com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47223x9de49ecb);
            com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47204x69e308f6.sendEmptyMessage(1);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                m96423xe16993de();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47210xbe97f590.e(com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.TAG, "VideoRequestMediaDateCallback run: ", th6);
                com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.m96405x81b4feb4(-14, th6);
            }
        }
    }

    /* renamed from: com.tencent.tav.core.AssetExportThread$VideoWriterProgressListener */
    /* loaded from: classes16.dex */
    public class VideoWriterProgressListener implements com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.WriterProgressListener {
        private VideoWriterProgressListener() {
        }

        @Override // com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.WriterProgressListener
        /* renamed from: onError */
        public void mo96421xaf8aa769(com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6 c25680x8a5723a6) {
            com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47210xbe97f590.e(com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.TAG, "VideoWriterProgressListener onError: ", c25680x8a5723a6.f47512xb5275940);
            com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.m96406x81b4feb4(c25680x8a5723a6);
        }

        @Override // com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.WriterProgressListener
        /* renamed from: onProgressChanged */
        public void mo96422x95ed2be8(com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27 c25667x9a895e27, long j17) {
            com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47210xbe97f590.m97814x5d2a96d("AssetExportSession", "onProgressChanged: videoWriter " + j17 + "  / " + com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.m96411x51e8b0a());
            if (j17 == -1) {
                com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce handlerThreadC25656x34da0dce = com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this;
                handlerThreadC25656x34da0dce.f47221x4f7325e8 = handlerThreadC25656x34da0dce.f47205xb6e83442.f47172x16fae70.m97256x51e8b0a().m97232x31040141();
                com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47218xb46c8fc8 = 1.0f;
                com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47225x24669d70 = true;
                com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47204x69e308f6.sendEmptyMessage(1);
                return;
            }
            com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47221x4f7325e8 = j17;
            long m97232x31040141 = com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47205xb6e83442.f47172x16fae70 != null ? com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47205xb6e83442.f47172x16fae70.m97256x51e8b0a().m97232x31040141() : com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47220x3b99d11e != null ? com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47220x3b99d11e.m96553x89444d94() : 0L;
            if (m97232x31040141 != 0) {
                com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce handlerThreadC25656x34da0dce2 = com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this;
                handlerThreadC25656x34da0dce2.f47218xb46c8fc8 = (((float) handlerThreadC25656x34da0dce2.f47221x4f7325e8) * 1.0f) / ((float) m97232x31040141);
            } else {
                com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47218xb46c8fc8 = 1.0f;
            }
            com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47205xb6e83442.f47167xc454c22d = java.lang.Math.min(com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47218xb46c8fc8, com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47192x51268c23);
            if (com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47200x1094e745 != null) {
                com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47200x1094e745.mo96356xc562f1af(com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.f47205xb6e83442);
            }
        }
    }

    public HandlerThreadC25656x34da0dce(com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52 c25655x2c777b52, com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52.ExportCallbackHandler exportCallbackHandler, com.p314xaae8f345.tav.p2947x2eaf9f.C25671x3e055ec6 c25671x3e055ec6, com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036 c25679xbb204036) {
        super("ExportThread");
        this.f47225x24669d70 = false;
        this.f47199x7a92ef0b = false;
        this.f47219x14be9ca4 = false;
        this.f47193x6aeaee3f = false;
        this.f47221x4f7325e8 = 0L;
        this.f47195xb3787c3 = 0L;
        this.f47201xae7a2e7a = false;
        this.f47222xa8e9e066 = false;
        this.f47196x53216cab = false;
        this.f47214x416042c2 = new com.p314xaae8f345.tav.p2968xc84c5534.C25855x7912cb4e();
        this.f47223x9de49ecb = new com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.VideoFrameOperateTimeoutCallback();
        this.f47197x84421610 = new com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.AudioFrameOperateTimeoutCallback();
        this.f47209x12bc12b9 = 0L;
        this.f47208xd41a1be = 0L;
        this.f47207x5097cd97 = true;
        this.f47216x734ee833 = false;
        this.f47186x6b7de3e3 = 3000L;
        this.f47185x305a9de8 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.f1183xe66aab0d;
        this.f47211xae3bcde3 = com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d;
        this.f47215x842a5d98 = new java.lang.Object();
        this.f47210xbe97f590 = new com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1();
        this.f47202x5a7510f = 0;
        this.f47205xb6e83442 = c25655x2c777b52;
        this.f47200x1094e745 = exportCallbackHandler;
        this.f47191x3a2afaa6 = c25671x3e055ec6;
        this.f47190xb3299a4 = new com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984(c25679xbb204036.m96735x317dfe9c(), c25679xbb204036.m96733x2721f40c(), 2);
        this.f47203xc5684a2b = c25679xbb204036;
    }

    /* renamed from: createAudioTrackOutput */
    private com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694 m96401x3a866992() {
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f47205xb6e83442.f47149x58ceaf0.mo96143x6e29e370(2);
        if (arrayList == null || arrayList.size() <= 0) {
            return new com.p314xaae8f345.tav.p2947x2eaf9f.C25678xf4d40d71();
        }
        com.p314xaae8f345.tav.p2947x2eaf9f.C25663x1ed1a5da c25663x1ed1a5da = new com.p314xaae8f345.tav.p2947x2eaf9f.C25663x1ed1a5da(arrayList, null, this.f47212xc0157086);
        c25663x1ed1a5da.m96549xb0bd9928(this.f47191x3a2afaa6);
        c25663x1ed1a5da.m96548x66f3cb62(this.f47190xb3299a4);
        return c25663x1ed1a5da;
    }

    /* renamed from: createAudioWriterInput */
    private com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27 m96402x7d316a7d() {
        com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27 c25667x9a895e27 = new com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27(2, this.f47205xb6e83442.m96332x3527020b());
        c25667x9a895e27.m96629x596d8674(this.f47210xbe97f590.getConfig());
        return c25667x9a895e27;
    }

    /* renamed from: createVideoTrackOutput */
    private com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694 m96403xcb2887cd() {
        java.util.List<com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b> mo96143x6e29e370 = this.f47205xb6e83442.f47149x58ceaf0.mo96143x6e29e370(1);
        if (mo96143x6e29e370 == null || mo96143x6e29e370.size() <= 0) {
            return new com.p314xaae8f345.tav.p2947x2eaf9f.C25678xf4d40d71();
        }
        java.util.HashMap hashMap = new java.util.HashMap(4);
        hashMap.put("frame-rate", java.lang.Integer.valueOf(this.f47203xc5684a2b.m96747x21f69ea8()));
        com.p314xaae8f345.tav.p2947x2eaf9f.C25665x97f6fa3 c25665x97f6fa3 = new com.p314xaae8f345.tav.p2947x2eaf9f.C25665x97f6fa3(mo96143x6e29e370, hashMap, this.f47205xb6e83442.f47150xf1239f2f, this.f47212xc0157086);
        c25665x97f6fa3.m96569xfbd38eb1(this.f47205xb6e83442.f47175xaffe922f);
        c25665x97f6fa3.m96568xfbd38e8b(this.f47205xb6e83442.f47174xaffe9209);
        c25665x97f6fa3.m96570x35f743c0(this.f47205xb6e83442.m96334x52cf0271());
        c25665x97f6fa3.m96567x7668c57b(this.f47205xb6e83442.m96333x9c45adb3());
        return c25665x97f6fa3;
    }

    /* renamed from: createVideoWriterInput */
    private com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27 m96404xdd388b8() {
        com.p314xaae8f345.tav.p2968xc84c5534.C25855x7912cb4e c25855x7912cb4e = this.f47214x416042c2;
        if (c25855x7912cb4e != null) {
            c25855x7912cb4e.m98320xf0ece06(this.f47203xc5684a2b.m96747x21f69ea8());
        }
        com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27 c25667x9a895e27 = new com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27(1, this.f47205xb6e83442.m96332x3527020b());
        c25667x9a895e27.m96629x596d8674(this.f47210xbe97f590.getConfig());
        return c25667x9a895e27;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: exportError */
    public synchronized void m96405x81b4feb4(int i17, java.lang.Throwable th6) {
        m96406x81b4feb4(new com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6(i17, th6));
    }

    /* renamed from: exportSuccess */
    private synchronized void m96407xd14cf1af() {
        synchronized (this) {
            com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52 c25655x2c777b52 = this.f47205xb6e83442;
            com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52.AssetExportSessionStatus assetExportSessionStatus = c25655x2c777b52.f47170xcacdcff2;
            com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52.AssetExportSessionStatus assetExportSessionStatus2 = com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52.AssetExportSessionStatus.AssetExportSessionStatusCompleted;
            if (assetExportSessionStatus == assetExportSessionStatus2) {
                return;
            }
            c25655x2c777b52.f47167xc454c22d = 1.0f;
            c25655x2c777b52.f47170xcacdcff2 = assetExportSessionStatus2;
            com.p314xaae8f345.tav.p2968xc84c5534.C25855x7912cb4e c25855x7912cb4e = this.f47214x416042c2;
            if (c25855x7912cb4e != null) {
                c25855x7912cb4e.m98317x45bd610();
            }
            com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52.ExportCallbackHandler exportCallbackHandler = this.f47200x1094e745;
            if (exportCallbackHandler != null) {
                exportCallbackHandler.mo96356xc562f1af(this.f47205xb6e83442);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: exporting */
    public void m96408x192d77ae() {
        m96412x77159077();
        this.f47205xb6e83442.f47170xcacdcff2 = com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52.AssetExportSessionStatus.AssetExportSessionStatusExporting;
        this.f47217x2be7fef9 = new android.os.HandlerThread("VideoWriter");
        this.f47224x44dd1cce.m96632xaa772396(new com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.VideoWriterProgressListener());
        this.f47224x44dd1cce.m96626x7ed09da8(this.f47217x2be7fef9, new com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.VideoRequestMediaDataCallback());
        if (this.f47198x211073e9 == null) {
            this.f47193x6aeaee3f = true;
            this.f47199x7a92ef0b = true;
        } else {
            this.f47189xa84655d4 = new android.os.HandlerThread("AudioWriter");
            this.f47198x211073e9.m96632xaa772396(new com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.AudioWriterProgressListener());
            this.f47198x211073e9.m96626x7ed09da8(this.f47189xa84655d4, new com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.AudioRequestMediaDataCallback());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: finish */
    public void m96409xb4098c93() {
        this.f47210xbe97f590.i(TAG, "finish");
        if (this.f47217x2be7fef9 == null) {
            this.f47210xbe97f590.w(TAG, "videoExportThread is null");
            return;
        }
        if (this.f47206x697ca065) {
            this.f47210xbe97f590.w(TAG, "already finished");
            return;
        }
        this.f47206x697ca065 = true;
        this.f47210xbe97f590.i(TAG, "post finish, timeoutInterruptWork: " + this.f47216x734ee833 + " audioTimeout: " + this.f47196x53216cab + " videoTimeout: " + this.f47222xa8e9e066);
        android.os.Handler handler = this.f47204x69e308f6;
        if (handler != null) {
            handler.removeCallbacks(this.f47223x9de49ecb);
            this.f47204x69e308f6.removeCallbacks(this.f47197x84421610);
            this.f47210xbe97f590.i(TAG, "post finish, remove timeout callback");
        }
        android.os.Handler handler2 = new android.os.Handler(this.f47217x2be7fef9.getLooper());
        this.f47210xbe97f590.i(TAG, "finish, with videoExportThread");
        handler2.post(new java.lang.Runnable() { // from class: com.tencent.tav.core.AssetExportThread.1
            @Override // java.lang.Runnable
            public void run() {
                com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.m96410x449de153();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: finishImpl */
    public void m96410x449de153() {
        this.f47210xbe97f590.i(TAG, "quit thread start: " + java.lang.Thread.currentThread().getId());
        android.os.HandlerThread handlerThread = this.f47217x2be7fef9;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.f47217x2be7fef9 = null;
        }
        android.os.HandlerThread handlerThread2 = this.f47189xa84655d4;
        if (handlerThread2 != null) {
            handlerThread2.quitSafely();
            this.f47189xa84655d4 = null;
        }
        com.p314xaae8f345.tav.p2947x2eaf9f.C25662xaba0e3b3 c25662xaba0e3b3 = this.f47187x48373bd3;
        if (c25662xaba0e3b3 != null) {
            c25662xaba0e3b3.m96534x8f43dab2();
            this.f47187x48373bd3 = null;
        }
        com.p314xaae8f345.tav.p2968xc84c5534.C25855x7912cb4e c25855x7912cb4e = this.f47214x416042c2;
        if (c25855x7912cb4e != null) {
            com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694 abstractC25664x249c1694 = this.f47220x3b99d11e;
            long j17 = 0;
            c25855x7912cb4e.m98322xed73160c((abstractC25664x249c1694 == null || abstractC25664x249c1694.mo96554xc291ccac() == null) ? 0L : this.f47220x3b99d11e.mo96554xc291ccac().m98301x7534818e() * 1000);
            com.p314xaae8f345.tav.p2968xc84c5534.C25855x7912cb4e c25855x7912cb4e2 = this.f47214x416042c2;
            com.p314xaae8f345.tav.p2947x2eaf9f.C25666xb4e42f63 c25666xb4e42f63 = this.f47188x517a8783;
            if (c25666xb4e42f63 != null && c25666xb4e42f63.m96583x15c7784() != null) {
                j17 = this.f47188x517a8783.m96583x15c7784().m98301x7534818e() * 1000;
            }
            c25855x7912cb4e2.m98321xb7c8f976(j17);
        }
        com.p314xaae8f345.tav.p2947x2eaf9f.C25666xb4e42f63 c25666xb4e42f632 = this.f47188x517a8783;
        boolean z17 = false;
        if (c25666xb4e42f632 != null) {
            try {
                c25666xb4e42f632.m96580xed7248c9(this.f47201xae7a2e7a);
                z17 = true;
            } catch (java.lang.Exception e17) {
                this.f47210xbe97f590.e("AssetExportSession", "code = -10 run: finishWriting error", e17);
                m96405x81b4feb4(-10, e17);
            }
            this.f47188x517a8783 = null;
        }
        com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27 c25667x9a895e27 = this.f47224x44dd1cce;
        if (c25667x9a895e27 != null) {
            c25667x9a895e27.m96618x5a5ddf8();
            this.f47224x44dd1cce = null;
        }
        com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27 c25667x9a895e272 = this.f47198x211073e9;
        if (c25667x9a895e272 != null) {
            c25667x9a895e272.m96618x5a5ddf8();
            this.f47198x211073e9 = null;
        }
        if (this.f47196x53216cab) {
            com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52 c25655x2c777b52 = this.f47205xb6e83442;
            c25655x2c777b52.f47170xcacdcff2 = com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52.AssetExportSessionStatus.AssetExportSessionStatusTimeout;
            c25655x2c777b52.f47154x9f92e3c6 = new com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6(-204, null, "handle audio timeout");
            this.f47210xbe97f590.e(TAG, "exportError modified when finish, audioTimeout, internal exportErrorStatus: " + this.f47205xb6e83442.f47154x9f92e3c6);
            com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52.ExportCallbackHandler exportCallbackHandler = this.f47200x1094e745;
            if (exportCallbackHandler != null) {
                exportCallbackHandler.mo96356xc562f1af(this.f47205xb6e83442);
            }
        } else if (this.f47222xa8e9e066) {
            com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52 c25655x2c777b522 = this.f47205xb6e83442;
            c25655x2c777b522.f47170xcacdcff2 = com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52.AssetExportSessionStatus.AssetExportSessionStatusTimeout;
            c25655x2c777b522.f47154x9f92e3c6 = new com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6(-203, null, "handle video timeout");
            this.f47210xbe97f590.e(TAG, "exportError modified when finish, videoTimeout, internal exportErrorStatus: " + this.f47205xb6e83442.f47154x9f92e3c6);
            com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52.ExportCallbackHandler exportCallbackHandler2 = this.f47200x1094e745;
            if (exportCallbackHandler2 != null) {
                exportCallbackHandler2.mo96356xc562f1af(this.f47205xb6e83442);
            }
        } else {
            if (this.f47201xae7a2e7a) {
                com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52 c25655x2c777b523 = this.f47205xb6e83442;
                if (c25655x2c777b523.f47170xcacdcff2 != com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52.AssetExportSessionStatus.AssetExportSessionStatusFailed) {
                    c25655x2c777b523.f47170xcacdcff2 = com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52.AssetExportSessionStatus.AssetExportSessionStatusCancelled;
                    com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52.ExportCallbackHandler exportCallbackHandler3 = this.f47200x1094e745;
                    if (exportCallbackHandler3 != null) {
                        exportCallbackHandler3.mo96356xc562f1af(c25655x2c777b523);
                    }
                }
            }
            if (this.f47225x24669d70 && this.f47199x7a92ef0b && z17 && !this.f47201xae7a2e7a) {
                m96407xd14cf1af();
            }
        }
        quitSafely();
        com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52 c25655x2c777b524 = this.f47205xb6e83442;
        if (c25655x2c777b524 != null) {
            c25655x2c777b524.m96335x41012807();
        }
        this.f47210xbe97f590.i(TAG, "quit thread finish");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getDuration */
    public long m96411x51e8b0a() {
        com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26;
        com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52 c25655x2c777b52 = this.f47205xb6e83442;
        if (c25655x2c777b52 != null && (c25738xead39d26 = c25655x2c777b52.f47172x16fae70) != null) {
            return c25738xead39d26.m97256x51e8b0a().m97232x31040141() * 2;
        }
        com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694 abstractC25664x249c1694 = this.f47194x17cd2839;
        long m96553x89444d94 = abstractC25664x249c1694 != null ? abstractC25664x249c1694.m96553x89444d94() : 0L;
        com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694 abstractC25664x249c16942 = this.f47220x3b99d11e;
        return m96553x89444d94 + (abstractC25664x249c16942 != null ? abstractC25664x249c16942.m96553x89444d94() : 0L);
    }

    /* renamed from: initReaderAndWriter */
    private void m96412x77159077() {
        android.graphics.Matrix m97468x940ffc67;
        com.p314xaae8f345.tav.p2947x2eaf9f.C25662xaba0e3b3 c25662xaba0e3b3 = new com.p314xaae8f345.tav.p2947x2eaf9f.C25662xaba0e3b3(this.f47205xb6e83442.f47149x58ceaf0);
        this.f47187x48373bd3 = c25662xaba0e3b3;
        c25662xaba0e3b3.m96540x5d30e02e(this.f47205xb6e83442.f47172x16fae70);
        this.f47220x3b99d11e = m96403xcb2887cd();
        com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694 m96401x3a866992 = m96401x3a866992();
        this.f47194x17cd2839 = m96401x3a866992;
        m96401x3a866992.m96560x596d8674(this.f47210xbe97f590.getConfig());
        this.f47220x3b99d11e.m96560x596d8674(this.f47210xbe97f590.getConfig());
        if (this.f47187x48373bd3.m96533xcca42b12(this.f47220x3b99d11e)) {
            this.f47187x48373bd3.m96532xf948c102(this.f47220x3b99d11e);
        }
        com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694 abstractC25664x249c1694 = this.f47194x17cd2839;
        if (!(abstractC25664x249c1694 instanceof com.p314xaae8f345.tav.p2947x2eaf9f.C25678xf4d40d71) && this.f47187x48373bd3.m96533xcca42b12(abstractC25664x249c1694)) {
            this.f47187x48373bd3.m96532xf948c102(this.f47194x17cd2839);
        }
        com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52 c25655x2c777b52 = this.f47205xb6e83442;
        com.p314xaae8f345.tav.p2947x2eaf9f.C25666xb4e42f63 c25666xb4e42f63 = new com.p314xaae8f345.tav.p2947x2eaf9f.C25666xb4e42f63(c25655x2c777b52.f47163x3e2d9be2, c25655x2c777b52.f47164x3e2fc6f7);
        this.f47188x517a8783 = c25666xb4e42f63;
        c25666xb4e42f63.m96598xbcfc2a5d(this.f47213x16878e1f);
        this.f47188x517a8783.f47370xc231f8f2 = this.f47210xbe97f590.getConfig();
        com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26 = this.f47205xb6e83442.f47172x16fae70;
        if (c25738xead39d26 != null) {
            this.f47188x517a8783.m96600x10b0680f(c25738xead39d26.m97260x75286aac());
            this.f47188x517a8783.m96578xab1976f6(this.f47205xb6e83442.f47172x16fae70.m97258xb58839a5());
            com.p314xaae8f345.tav.p2968xc84c5534.C25855x7912cb4e c25855x7912cb4e = this.f47214x416042c2;
            if (c25855x7912cb4e != null) {
                c25855x7912cb4e.m98319x460f9ef0(this.f47205xb6e83442.f47172x16fae70.m97257x37a7fb48());
            }
        }
        this.f47188x517a8783.m96596x5ca3d7ad(this.f47203xc5684a2b);
        com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27 m96404xdd388b8 = m96404xdd388b8();
        this.f47224x44dd1cce = m96404xdd388b8;
        com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f c25706x7dc2d64f = this.f47205xb6e83442.f47175xaffe922f;
        if (c25706x7dc2d64f != null) {
            m96404xdd388b8.m96628x361aa546(c25706x7dc2d64f.m96960x75267e64());
        }
        if (!(this.f47194x17cd2839 instanceof com.p314xaae8f345.tav.p2947x2eaf9f.C25678xf4d40d71)) {
            this.f47198x211073e9 = m96402x7d316a7d();
        }
        if (this.f47188x517a8783.m96573x92a53f99(this.f47224x44dd1cce)) {
            com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52 c25655x2c777b522 = this.f47205xb6e83442;
            if (c25655x2c777b522.f47152xb35f5203) {
                android.graphics.Matrix matrix = new android.graphics.Matrix();
                com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 mo96120x47007694 = this.f47205xb6e83442.f47149x58ceaf0.mo96120x47007694();
                if (this.f47205xb6e83442.f47148xa9a60b16) {
                    m97468x940ffc67 = new android.graphics.Matrix();
                    com.p314xaae8f345.tav.p2959x5befac44.C25762xc5b4d2ed.m97466x118bbc54(this.f47205xb6e83442.f47149x58ceaf0.mo96120x47007694(), this.f47205xb6e83442.f47149x58ceaf0.mo96122xbb14e2a4(), 1.0f, 0.0f, new android.graphics.Point(0, 0), m97468x940ffc67);
                    if (this.f47205xb6e83442.f47149x58ceaf0.mo96122xbb14e2a4() == 1 || this.f47205xb6e83442.f47149x58ceaf0.mo96122xbb14e2a4() == 3) {
                        matrix.setScale(this.f47203xc5684a2b.m96743x785dd09a() / mo96120x47007694.f47832xb7389127, this.f47203xc5684a2b.m96742x798d48d3() / mo96120x47007694.f47833x6be2dc6);
                    } else {
                        matrix.setScale(this.f47203xc5684a2b.m96743x785dd09a() / mo96120x47007694.f47833x6be2dc6, this.f47203xc5684a2b.m96742x798d48d3() / mo96120x47007694.f47832xb7389127);
                    }
                } else {
                    m97468x940ffc67 = new android.graphics.Matrix();
                    matrix.setScale((this.f47203xc5684a2b.m96743x785dd09a() * 1.0f) / this.f47203xc5684a2b.m96741xa83ce40f(), (this.f47203xc5684a2b.m96742x798d48d3() * 1.0f) / this.f47203xc5684a2b.m96739x4590a3fe());
                }
                m97468x940ffc67.postConcat(matrix);
            } else {
                m97468x940ffc67 = c25655x2c777b522.f47148xa9a60b16 ? com.p314xaae8f345.tav.p2959x5befac44.C25762xc5b4d2ed.m97468x940ffc67(new com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85(this.f47203xc5684a2b.m96743x785dd09a(), this.f47203xc5684a2b.m96742x798d48d3()), this.f47205xb6e83442.f47149x58ceaf0.mo96120x47007694(), this.f47205xb6e83442.f47149x58ceaf0.mo96122xbb14e2a4()) : null;
            }
            this.f47224x44dd1cce.m96631x9a7f9d2a(m97468x940ffc67);
            this.f47188x517a8783.m96572xb51e2ba9(this.f47224x44dd1cce);
        }
        com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27 c25667x9a895e27 = this.f47198x211073e9;
        if (c25667x9a895e27 != null && this.f47188x517a8783.m96573x92a53f99(c25667x9a895e27)) {
            this.f47188x517a8783.m96572xb51e2ba9(this.f47198x211073e9);
        }
        this.f47188x517a8783.m96602x57887a1a(this.f47212xc0157086);
        this.f47187x48373bd3.m96541x38624fca(this.f47188x517a8783);
    }

    /* renamed from: cancel */
    public synchronized void m96413xae7a2e7a() {
        this.f47201xae7a2e7a = true;
        com.p314xaae8f345.tav.p2968xc84c5534.C25855x7912cb4e c25855x7912cb4e = this.f47214x416042c2;
        if (c25855x7912cb4e != null) {
            c25855x7912cb4e.m98318x6761d4f();
            this.f47214x416042c2 = null;
        }
        android.os.Handler handler = this.f47204x69e308f6;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.tencent.tav.core.AssetExportThread.2
                @Override // java.lang.Runnable
                public void run() {
                    com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.m96409xb4098c93();
                }
            });
        }
    }

    /* renamed from: getReportSession */
    public com.p314xaae8f345.tav.p2968xc84c5534.C25855x7912cb4e m96414xfebfff0c() {
        return this.f47214x416042c2;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        int i17 = message.what;
        if ((i17 == 1 || i17 == 2) && !this.f47206x697ca065) {
            if (this.f47201xae7a2e7a) {
                m96409xb4098c93();
            }
            if (this.f47225x24669d70 && this.f47199x7a92ef0b && this.f47193x6aeaee3f && this.f47219x14be9ca4) {
                m96409xb4098c93();
            }
        }
        return true;
    }

    /* renamed from: setLoggerConfig */
    public void m96415x596d8674(com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25800x8b670e73 c25800x8b670e73) {
        this.f47210xbe97f590.m97816x78bda44(c25800x8b670e73);
    }

    /* renamed from: setMediaFactory */
    public void m96416x5750fe08(com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25652xcd3d9f6f interfaceC25652xcd3d9f6f) {
        this.f47212xc0157086 = interfaceC25652xcd3d9f6f;
    }

    /* renamed from: setRenderContextParams */
    public void m96417xbcfc2a5d(com.p314xaae8f345.tav.p2959x5befac44.C25780x613b55ff c25780x613b55ff) {
        this.f47213x16878e1f = c25780x613b55ff;
        com.p314xaae8f345.tav.p2947x2eaf9f.C25666xb4e42f63 c25666xb4e42f63 = this.f47188x517a8783;
        if (c25666xb4e42f63 != null) {
            c25666xb4e42f63.m96598xbcfc2a5d(c25780x613b55ff);
        }
    }

    /* renamed from: setTimeoutParameter */
    public void m96418xa1d0ffca(boolean z17, boolean z18, long j17) {
        this.f47207x5097cd97 = z17;
        this.f47216x734ee833 = z18;
        this.f47211xae3bcde3 = j17;
        this.f47210xbe97f590.i(TAG, "setNeedCheckFrameProcessTimeout:%b timeoutInterruptWork:%b maxTimeoutMs: %d", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Long.valueOf(this.f47211xae3bcde3));
    }

    /* renamed from: startExport */
    public void m96419x791872b6() {
        start();
        this.f47201xae7a2e7a = false;
        com.p314xaae8f345.tav.p2968xc84c5534.C25855x7912cb4e c25855x7912cb4e = this.f47214x416042c2;
        if (c25855x7912cb4e != null) {
            c25855x7912cb4e.m98316x9f0979af(java.lang.System.nanoTime());
        }
        android.os.Handler handler = new android.os.Handler(getLooper(), this);
        this.f47204x69e308f6 = handler;
        handler.post(new java.lang.Runnable() { // from class: com.tencent.tav.core.AssetExportThread.3
            @Override // java.lang.Runnable
            public void run() {
                com.p314xaae8f345.tav.p2947x2eaf9f.HandlerThreadC25656x34da0dce.this.m96408x192d77ae();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: exportError */
    public void m96406x81b4feb4(com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6 c25680x8a5723a6) {
        int i17;
        com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52.AssetExportSessionStatus assetExportSessionStatus = this.f47205xb6e83442.f47170xcacdcff2;
        com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52.AssetExportSessionStatus assetExportSessionStatus2 = com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52.AssetExportSessionStatus.AssetExportSessionStatusFailed;
        if (assetExportSessionStatus != assetExportSessionStatus2) {
            this.f47201xae7a2e7a = true;
            this.f47205xb6e83442.f47170xcacdcff2 = assetExportSessionStatus2;
            this.f47210xbe97f590.e(TAG, "exportError message: " + c25680x8a5723a6.msg);
            com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52 c25655x2c777b52 = this.f47205xb6e83442;
            c25655x2c777b52.f47154x9f92e3c6 = c25680x8a5723a6;
            com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6 c25680x8a5723a62 = c25655x2c777b52.f47166x4de8662b;
            if (c25680x8a5723a62 != null && ((i17 = c25680x8a5723a62.f47510x2eaded) == -206 || i17 == -207)) {
                c25655x2c777b52.f47154x9f92e3c6 = c25680x8a5723a62;
                this.f47210xbe97f590.e(TAG, "exportError modified, internal exportErrorStatus: " + c25680x8a5723a6 + " change to timeout: " + this.f47205xb6e83442.f47154x9f92e3c6);
            }
            com.p314xaae8f345.tav.p2968xc84c5534.C25855x7912cb4e c25855x7912cb4e = this.f47214x416042c2;
            if (c25855x7912cb4e != null) {
                c25855x7912cb4e.m98315x9e438755();
            }
            com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52.ExportCallbackHandler exportCallbackHandler = this.f47200x1094e745;
            if (exportCallbackHandler != null) {
                exportCallbackHandler.mo96356xc562f1af(this.f47205xb6e83442);
                return;
            }
            return;
        }
        this.f47210xbe97f590.e(TAG, "export message: " + c25680x8a5723a6.msg);
    }
}
