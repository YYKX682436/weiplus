package com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.tav.decoder.decodecache.SegmentDecoderThread */
/* loaded from: classes16.dex */
public class C25793x8e95b31b implements android.os.Handler.Callback {

    /* renamed from: MSG_DECODER_FRAME */
    private static final int f48354xe479a114 = 3;

    /* renamed from: MSG_DECODER_SEGMENT */
    private static final int f48355x466c451a = 2;

    /* renamed from: MSG_QUIT */
    private static final int f48356xe3e89c6d = 1000;

    /* renamed from: MSG_START */
    private static final int f48357x99468de4 = 1;
    private static final java.lang.String TAG = "SegmentDecoderThread";

    /* renamed from: cachedVideoDecoderTrack */
    private com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25788x4e51e660 f48358x94850e80;

    /* renamed from: context */
    com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 f48360x38b735af;

    /* renamed from: decoderHandler */
    private android.os.Handler f48361x97aaae66;

    /* renamed from: decoderThread */
    private android.os.HandlerThread f48362xbeec636e;

    /* renamed from: decoderTrack */
    com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50 f48363xbbda5f67;

    /* renamed from: filter */
    private com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25789x29a8176d f48364xb408cb78;

    /* renamed from: seekSampleBuffer */
    com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 f48365x88e6bd22;

    /* renamed from: cancel */
    boolean f48359xae7a2e7a = false;

    /* renamed from: started */
    private volatile boolean f48366x8eeb4081 = false;

    /* renamed from: texturePool */
    com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25769xf53fabce f48367x602ddbd7 = new com.p314xaae8f345.tav.p2959x5befac44.C25781xc39783b7();

    public C25793x8e95b31b(com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25788x4e51e660 c25788x4e51e660, com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50 interfaceC25767xc9028e50) {
        this.f48358x94850e80 = c25788x4e51e660;
        this.f48363xbbda5f67 = interfaceC25767xc9028e50;
    }

    /* renamed from: decoder */
    private void m97797x5befac44(com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25791x53d9a292 c25791x53d9a292) {
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 c25779x3338e719;
        synchronized (this.f48358x94850e80.f48321xe62474f5) {
            this.f48359xae7a2e7a = false;
            com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25787xf70dc571 c25787xf70dc571 = c25791x53d9a292.f48352x75a49f33;
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "decoder:------------------- " + c25791x53d9a292.f48352x75a49f33.f48318x63a1987d.m97260x75286aac() + "  -  " + c25791x53d9a292.f48352x75a49f33.f48318x63a1987d.m97258xb58839a5());
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97260x75286aac = c25787xf70dc571.f48318x63a1987d.m97260x75286aac();
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97258xb58839a5 = c25787xf70dc571.f48318x63a1987d.m97258xb58839a5();
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97256x51e8b0a = c25787xf70dc571.f48318x63a1987d.m97256x51e8b0a();
            if (m97258xb58839a5.m97222xf922bec1(this.f48363xbbda5f67.mo96653x51e8b0a())) {
                m97258xb58839a5 = this.f48363xbbda5f67.mo96653x51e8b0a();
                m97256x51e8b0a = m97258xb58839a5.sub(m97260x75286aac);
            }
            com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(m97260x75286aac, c25787xf70dc571.f48318x63a1987d.m97256x51e8b0a());
            if (this.f48358x94850e80.f48324xc84ee9e4) {
                com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 sub = this.f48363xbbda5f67.mo96653x51e8b0a().sub(m97258xb58839a5);
                com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
                if (sub.m97238x9f3f7b48(c25736x76b98a57)) {
                    sub = c25736x76b98a57;
                }
                c25738xead39d26 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(sub, m97256x51e8b0a);
            }
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "decoder2:------------------- " + c25738xead39d26.m97260x75286aac() + "  -  " + c25738xead39d26.m97258xb58839a5());
            if (c25738xead39d26.m97260x75286aac() != com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47861xbee5ffa0 && this.f48358x94850e80 != null && (c25779x3338e719 = this.f48360x38b735af) != null) {
                c25779x3338e719.m97634x900967ab();
                this.f48363xbbda5f67.mo96663xc9fc1b13(c25738xead39d26.m97260x75286aac(), false, false);
                com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 mo96660xe121b2e0 = this.f48363xbbda5f67.mo96660xe121b2e0(c25738xead39d26.m97260x75286aac());
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "decoder: readFirst " + mo96660xe121b2e0.m97195xfb85bb43() + " cancel = " + this.f48359xae7a2e7a + "  - " + c25738xead39d26.m97258xb58839a5());
                while (!mo96660xe121b2e0.m97195xfb85bb43().m97238x9f3f7b48(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f) && !this.f48359xae7a2e7a && mo96660xe121b2e0.m97195xfb85bb43().m97238x9f3f7b48(c25738xead39d26.m97258xb58839a5())) {
                    com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25786x772c472b c25786x772c472b = new com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25786x772c472b();
                    c25786x772c472b.f48316x602ddbd7 = this.f48367x602ddbd7;
                    c25786x772c472b.f48313x207df1da = mo96660xe121b2e0.m97195xfb85bb43();
                    com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "decoder:==================== frame.frameTime = " + c25786x772c472b.f48313x207df1da + "  " + mo96660xe121b2e0.m97194x3a00ef33());
                    if (this.f48358x94850e80.f48324xc84ee9e4) {
                        c25786x772c472b.f48313x207df1da = this.f48363xbbda5f67.mo96653x51e8b0a().sub(mo96660xe121b2e0.m97195xfb85bb43());
                    }
                    c25786x772c472b.f48314x5102a9dc = mo96660xe121b2e0.m97195xfb85bb43();
                    if (mo96660xe121b2e0.m97194x3a00ef33() != null) {
                        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 c25779x3338e7192 = this.f48360x38b735af;
                        this.f48364xb408cb78.m97790xf73870dd(false);
                        this.f48364xb408cb78.m97792x5e392181(c25779x3338e7192.m97645x6be2dc6());
                        this.f48364xb408cb78.m97791x4f1c14cc(c25779x3338e7192.m97632xb7389127());
                        c25779x3338e7192.m97634x900967ab();
                        com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 mo97553xab07ad8a = this.f48367x602ddbd7.mo97553xab07ad8a(3553, c25779x3338e7192.m97645x6be2dc6(), c25779x3338e7192.m97632xb7389127());
                        this.f48364xb408cb78.m97789x434421f9(mo97553xab07ad8a);
                        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "decoder:==================== " + mo96660xe121b2e0.m97195xfb85bb43() + "  " + mo96660xe121b2e0.m97196x216ebaf7() + "  " + c25786x772c472b.f48313x207df1da);
                        this.f48364xb408cb78.m97779xca4e38d(-16777216);
                        this.f48364xb408cb78.m97778x79f87086(mo96660xe121b2e0.m97194x3a00ef33(), mo96660xe121b2e0.m97194x3a00ef33().m97280xc3a49506());
                        c25786x772c472b.f48315xe9bf8e8a = new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(c25786x772c472b.f48313x207df1da, mo97553xab07ad8a, mo96660xe121b2e0.m97196x216ebaf7());
                        c25787xf70dc571.m97770xd0ce6a73(c25786x772c472b);
                    }
                    if (!c25786x772c472b.f48314x5102a9dc.add(this.f48358x94850e80.mo96654xacbb5a6b()).m97238x9f3f7b48(c25738xead39d26.m97258xb58839a5())) {
                        break;
                    } else {
                        mo96660xe121b2e0 = this.f48363xbbda5f67.mo96659xe121b2e0();
                    }
                }
            }
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25792x833e7741 c25792x833e7741 = c25791x53d9a292.f48351x4e97a7e4;
        if (c25792x833e7741 != null) {
            synchronized (c25792x833e7741) {
                c25791x53d9a292.f48351x4e97a7e4.m97795xc55e395(true);
                c25791x53d9a292.f48351x4e97a7e4.notifyAll();
            }
        }
    }

    /* renamed from: quit */
    private void m97798x35224f() {
        com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c14 = this.f48365x88e6bd22;
        if (c25734xcdff9c14 != null && c25734xcdff9c14.m97194x3a00ef33() != null) {
            this.f48365x88e6bd22.m97194x3a00ef33().m97285x41012807();
        }
        this.f48364xb408cb78.m97786x41012807();
        this.f48363xbbda5f67.mo96661x41012807();
        this.f48367x602ddbd7.mo97555x41012807();
        this.f48360x38b735af.mo97551x41012807();
        this.f48361x97aaae66.removeCallbacksAndMessages(null);
        this.f48362xbeec636e.quit();
    }

    /* renamed from: start */
    private void m97799x68ac462() {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("SegmentDecoder");
        this.f48362xbeec636e = handlerThread;
        handlerThread.start();
        this.f48361x97aaae66 = new android.os.Handler(this.f48362xbeec636e.getLooper(), this);
    }

    /* renamed from: startDecoder */
    private void m97800x53ec2d82() {
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 c25779x3338e719 = new com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719(this.f48358x94850e80.f48323x399b739.m97645x6be2dc6(), this.f48358x94850e80.f48323x399b739.m97632xb7389127(), null, this.f48358x94850e80.f48323x399b739.m97628x77710645());
        this.f48360x38b735af = c25779x3338e719;
        this.f48363xbbda5f67.mo96674x68ac462(c25779x3338e719, this.f48358x94850e80.f48327xb23179d4);
        this.f48366x8eeb4081 = true;
        this.f48360x38b735af.m97634x900967ab();
        this.f48364xb408cb78 = new com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25789x29a8176d();
    }

    /* renamed from: decoderSegment */
    public void m97802xe403f64f(com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25787xf70dc571 c25787xf70dc571, com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25792x833e7741 c25792x833e7741) {
        this.f48359xae7a2e7a = true;
        this.f48361x97aaae66.removeCallbacksAndMessages(null);
        this.f48361x97aaae66.obtainMessage(2, new com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25791x53d9a292(c25787xf70dc571, c25792x833e7741)).sendToTarget();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        int i17 = message.what;
        if (i17 == 1) {
            m97800x53ec2d82();
            return false;
        }
        if (i17 == 2) {
            m97797x5befac44((com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25791x53d9a292) message.obj);
            return false;
        }
        if (i17 == 3) {
            m97796x5befac44((com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25790xc011b718) message.obj);
            return false;
        }
        if (i17 != 1000) {
            return false;
        }
        m97798x35224f();
        return false;
    }

    /* renamed from: release */
    public void m97803x41012807() {
        this.f48359xae7a2e7a = true;
        if (this.f48362xbeec636e != null) {
            this.f48361x97aaae66.removeCallbacksAndMessages(null);
            this.f48361x97aaae66.sendEmptyMessage(1000);
        }
    }

    /* renamed from: startForReady */
    public void m97804x225a98dc() {
        m97799x68ac462();
        this.f48361x97aaae66.sendEmptyMessage(1);
        while (!this.f48366x8eeb4081) {
            try {
                java.lang.Thread.sleep(1L);
            } catch (java.lang.InterruptedException unused) {
            }
        }
    }

    /* renamed from: decoderSegment */
    public void m97801xe403f64f(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f48359xae7a2e7a = true;
        this.f48361x97aaae66.removeCallbacksAndMessages(null);
        this.f48361x97aaae66.obtainMessage(3, new com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25790xc011b718(c25736x76b98a57, countDownLatch)).sendToTarget();
    }

    /* renamed from: decoder */
    private void m97796x5befac44(com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25790xc011b718 c25790xc011b718) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 mo97553xab07ad8a;
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57 = c25790xc011b718.f48350x3652cd;
        if (this.f48358x94850e80.f48324xc84ee9e4) {
            c25736x76b98a57 = this.f48363xbbda5f67.mo96653x51e8b0a().sub(c25790xc011b718.f48350x3652cd);
        }
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 c25779x3338e719 = this.f48360x38b735af;
        if (c25779x3338e719 != null) {
            c25779x3338e719.m97634x900967ab();
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 mo96663xc9fc1b13 = this.f48363xbbda5f67.mo96663xc9fc1b13(c25736x76b98a57, true, false);
        if (mo96663xc9fc1b13.m97194x3a00ef33() != null) {
            com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 c25779x3338e7192 = this.f48360x38b735af;
            this.f48364xb408cb78.m97790xf73870dd(false);
            this.f48364xb408cb78.m97792x5e392181(c25779x3338e7192.m97645x6be2dc6());
            this.f48364xb408cb78.m97791x4f1c14cc(c25779x3338e7192.m97632xb7389127());
            com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c14 = this.f48365x88e6bd22;
            if (c25734xcdff9c14 != null) {
                mo97553xab07ad8a = c25734xcdff9c14.m97194x3a00ef33();
            } else {
                mo97553xab07ad8a = this.f48367x602ddbd7.mo97553xab07ad8a(3553, c25779x3338e7192.m97645x6be2dc6(), c25779x3338e7192.m97632xb7389127());
            }
            this.f48364xb408cb78.m97789x434421f9(mo97553xab07ad8a);
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "decoder:==========|=|========= " + mo96663xc9fc1b13.m97195xfb85bb43() + "  " + mo96663xc9fc1b13.m97196x216ebaf7() + "  ");
            this.f48364xb408cb78.m97779xca4e38d(-16777216);
            this.f48364xb408cb78.m97778x79f87086(mo96663xc9fc1b13.m97194x3a00ef33(), mo96663xc9fc1b13.m97194x3a00ef33().m97280xc3a49506());
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97195xfb85bb43 = mo96663xc9fc1b13.m97195xfb85bb43();
            if (this.f48358x94850e80.f48324xc84ee9e4) {
                m97195xfb85bb43 = this.f48363xbbda5f67.mo96653x51e8b0a().sub(m97195xfb85bb43);
            }
            this.f48365x88e6bd22 = new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(m97195xfb85bb43, mo97553xab07ad8a, mo96663xc9fc1b13.m97196x216ebaf7());
        }
        java.util.concurrent.CountDownLatch countDownLatch = c25790xc011b718.f48349x44a410a8;
        if (countDownLatch != null) {
            synchronized (countDownLatch) {
                c25790xc011b718.f48349x44a410a8.countDown();
            }
        }
    }
}
