package com.p314xaae8f345.tav.p2967xc53e9ae1;

/* renamed from: com.tencent.tav.player.PlayerThreadAudio */
/* loaded from: classes16.dex */
public class C25850x88403a2b implements android.os.Handler.Callback {
    private static final java.lang.String TAG = "PlayerThreadAudio";

    /* renamed from: audioDecoderTrack */
    private com.p314xaae8f345.tav.p2947x2eaf9f.C25669xd1aeed9b f48751x962a3e5d;

    /* renamed from: mAudioTrack */
    private com.p314xaae8f345.tav.p2967xc53e9ae1.C25831xa3254f9e f48754x37ef5362;

    /* renamed from: mLooper */
    private boolean f48755xe07e11e;

    /* renamed from: mMainHandler */
    private android.os.Handler f48756x9e97c8a4;

    /* renamed from: mPlayHandler */
    private android.os.Handler f48757xb0f732c9;

    /* renamed from: mThread */
    private android.os.HandlerThread f48759x1b4d34d7;

    /* renamed from: mVideoHandler */
    private android.os.Handler f48760xb81b035c;

    /* renamed from: currentPlayingState */
    public volatile com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d f48752x3965951c = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d();

    /* renamed from: lastSyncMessgeId */
    public volatile long f48753xd4b61a02 = -1;

    /* renamed from: mStatus */
    private int f48758x1a39f6bf = 1;

    /* renamed from: rate */
    private float f48761x354ce0 = 1.0f;

    /* renamed from: volume */
    private float f48762xcfaae71a = 1.0f;

    public C25850x88403a2b(com.p314xaae8f345.tav.p2947x2eaf9f.C25669xd1aeed9b c25669xd1aeed9b, android.os.Handler handler, android.os.Handler handler2) {
        this.f48751x962a3e5d = c25669xd1aeed9b;
        this.f48756x9e97c8a4 = handler;
        this.f48760xb81b035c = handler2;
        m98252x107b533a();
    }

    /* renamed from: actionPrepare */
    private void m98250x3fc4ddf1() {
        if (this.f48751x962a3e5d != null) {
            m98265xc7ed7a1b(2);
            m98258x547f427c();
        }
    }

    /* renamed from: catLog */
    private java.lang.String m98251xae7c938e(int i17) {
        return (java.lang.String) com.p314xaae8f345.tav.p2967xc53e9ae1.C25849xfbce7c6b.map.e(i17, null);
    }

    /* renamed from: initThread */
    private void m98252x107b533a() {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("PlayerAudioThread");
        this.f48759x1b4d34d7 = handlerThread;
        handlerThread.start();
        this.f48757xb0f732c9 = new android.os.Handler(this.f48759x1b4d34d7.getLooper(), this);
    }

    /* renamed from: pause */
    private void m98253x65825f6() {
        if (this.f48758x1a39f6bf == 2) {
            this.f48755xe07e11e = false;
            this.f48752x3965951c = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d();
            m98259xd8caf414(12);
        }
    }

    /* renamed from: play */
    private void m98254x348b34(java.lang.Object obj) {
        if (this.f48758x1a39f6bf == 1) {
            return;
        }
        this.f48755xe07e11e = true;
        if ((obj instanceof com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57) && java.lang.Math.abs(((com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57) obj).m97232x31040141() - this.f48752x3965951c.m97208xfb85bb43().m97232x31040141()) > 100000) {
            m98261xc9fc1b13(obj);
        }
        if (this.f48758x1a39f6bf == 3) {
            m98265xc7ed7a1b(2);
        }
        m98269x2936bf5f(12, com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, java.lang.System.currentTimeMillis());
    }

    /* renamed from: playerFinish */
    private void m98255xda2ba6d4() {
        this.f48752x3965951c = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d();
        this.f48751x962a3e5d.mo96663xc9fc1b13(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f, false, true);
        this.f48755xe07e11e = false;
        m98265xc7ed7a1b(3);
        m98259xd8caf414(12);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* renamed from: readSample */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m98256xe121b2e0() {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.tav.p2967xc53e9ae1.C25850x88403a2b.m98256xe121b2e0():void");
    }

    /* renamed from: release */
    private void m98257x41012807() {
        m98258x547f427c();
        m98259xd8caf414(new int[0]);
        m98265xc7ed7a1b(1);
        try {
            try {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "quit: PlayerThreadAudio " + this);
                this.f48759x1b4d34d7.quit();
                this.f48759x1b4d34d7 = null;
                synchronized (this.f48760xb81b035c) {
                    this.f48760xb81b035c.sendEmptyMessage(850);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "release error-->", e17);
                synchronized (this.f48760xb81b035c) {
                    this.f48760xb81b035c.sendEmptyMessage(850);
                }
            }
            this.f48757xb0f732c9 = null;
            this.f48760xb81b035c = null;
        } catch (java.lang.Throwable th6) {
            synchronized (this.f48760xb81b035c) {
                this.f48760xb81b035c.sendEmptyMessage(850);
                this.f48757xb0f732c9 = null;
                this.f48760xb81b035c = null;
                throw th6;
            }
        }
    }

    /* renamed from: releaseAudioTrack */
    private void m98258x547f427c() {
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25831xa3254f9e c25831xa3254f9e = this.f48754x37ef5362;
        if (c25831xa3254f9e != null) {
            c25831xa3254f9e.m98023x360802();
            this.f48754x37ef5362.m98021x41012807();
            this.f48754x37ef5362 = null;
        }
    }

    /* renamed from: removePendingMessage */
    private void m98259xd8caf414(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.f48757xb0f732c9.removeCallbacksAndMessages(null);
            return;
        }
        for (int i17 : iArr) {
            this.f48757xb0f732c9.removeMessages(i17);
        }
    }

    /* renamed from: scheduleNextWork */
    private void m98260xe4d4845b() {
        m98269x2936bf5f(12, "schedule next", java.lang.System.currentTimeMillis());
    }

    /* renamed from: seekTo */
    private void m98261xc9fc1b13(java.lang.Object obj) {
        if (obj instanceof com.p314xaae8f345.tav.p2967xc53e9ae1.C25846x6ab5dc6) {
            obj = ((com.p314xaae8f345.tav.p2967xc53e9ae1.C25846x6ab5dc6) obj).f48685xfa2b7883;
        }
        if (obj instanceof com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57) {
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57 = (com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57) obj;
            this.f48752x3965951c = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(c25736x76b98a57);
            this.f48751x962a3e5d.mo96663xc9fc1b13(c25736x76b98a57, false, true);
        }
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25831xa3254f9e c25831xa3254f9e = this.f48754x37ef5362;
        if (c25831xa3254f9e != null) {
            c25831xa3254f9e.m98019x5d03b04();
        }
    }

    /* renamed from: setVolume */
    private void m98262x27f73e1c(java.lang.Object obj) {
        float floatValue = obj instanceof com.p314xaae8f345.tav.p2967xc53e9ae1.C25846x6ab5dc6 ? ((java.lang.Float) ((com.p314xaae8f345.tav.p2967xc53e9ae1.C25846x6ab5dc6) obj).f48685xfa2b7883).floatValue() : obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : 1.0f;
        if (floatValue < 0.0f || floatValue > 1.0f) {
            return;
        }
        m98263xa761f02c(floatValue);
    }

    /* renamed from: setVolumeToAudioTrack */
    private void m98263xa761f02c(float f17) {
        this.f48762xcfaae71a = f17;
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25831xa3254f9e c25831xa3254f9e = this.f48754x37ef5362;
        if (c25831xa3254f9e != null) {
            c25831xa3254f9e.m98022x27f73e1c(f17);
        }
    }

    /* renamed from: stop */
    private void m98264x360802(boolean z17) {
        if (z17) {
            m98259xd8caf414(12);
            this.f48755xe07e11e = false;
            this.f48752x3965951c = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d();
        }
        m98265xc7ed7a1b(1);
        m98258x547f427c();
    }

    /* renamed from: updateStatus */
    private void m98265xc7ed7a1b(int i17) {
        this.f48758x1a39f6bf = i17;
    }

    private void v(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(str, str2);
    }

    /* renamed from: getCurrentPlayingState */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m98266x919571e6() {
        return this.f48752x3965951c.m97208xfb85bb43();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        java.lang.Object obj = message.obj;
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25846x6ab5dc6 c25846x6ab5dc6 = obj == null ? null : (com.p314xaae8f345.tav.p2967xc53e9ae1.C25846x6ab5dc6) obj;
        java.lang.Object obj2 = c25846x6ab5dc6 != null ? c25846x6ab5dc6.f48685xfa2b7883 : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleMessage() called with: msg = [");
        sb6.append(m98251xae7c938e(message.what));
        sb6.append(message.what);
        sb6.append("]--status-->");
        sb6.append(this.f48758x1a39f6bf);
        sb6.append("--from-->");
        sb6.append(c25846x6ab5dc6 != null ? c25846x6ab5dc6 : null);
        sb6.append(" targetObj = ");
        sb6.append(obj2);
        v(TAG, sb6.toString());
        try {
            try {
                int i17 = message.what;
                if (i17 == -1) {
                    m98255xda2ba6d4();
                } else if (i17 != 12) {
                    switch (i17) {
                        case 1:
                            m98250x3fc4ddf1();
                            break;
                        case 2:
                            m98254x348b34(obj2);
                            break;
                        case 3:
                            m98253x65825f6();
                            break;
                        case 4:
                            m98264x360802(false);
                            break;
                        case 5:
                            m98261xc9fc1b13(obj2);
                            break;
                        case 6:
                            m98257x41012807();
                            break;
                        case 7:
                            m98262x27f73e1c(obj2);
                            break;
                    }
                } else {
                    m98256xe121b2e0();
                }
                if (c25846x6ab5dc6 == null || android.text.TextUtils.isEmpty(c25846x6ab5dc6.f48687x300cc4) || !c25846x6ab5dc6.f48687x300cc4.startsWith("syncAudioStatus")) {
                    return true;
                }
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "handleMessage:  SyncMessageId = " + c25846x6ab5dc6.f48688x635d47c + ", what = " + message.what);
                this.f48753xd4b61a02 = c25846x6ab5dc6.f48688x635d47c;
                return true;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "handleMessage: error", e17);
                if (c25846x6ab5dc6 != null && !android.text.TextUtils.isEmpty(c25846x6ab5dc6.f48687x300cc4) && c25846x6ab5dc6.f48687x300cc4.startsWith("syncAudioStatus")) {
                    com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "handleMessage:  SyncMessageId = " + c25846x6ab5dc6.f48688x635d47c + ", what = " + message.what);
                    this.f48753xd4b61a02 = c25846x6ab5dc6.f48688x635d47c;
                }
                return false;
            }
        } catch (java.lang.Throwable th6) {
            if (c25846x6ab5dc6 != null && !android.text.TextUtils.isEmpty(c25846x6ab5dc6.f48687x300cc4) && c25846x6ab5dc6.f48687x300cc4.startsWith("syncAudioStatus")) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "handleMessage:  SyncMessageId = " + c25846x6ab5dc6.f48688x635d47c + ", what = " + message.what);
                this.f48753xd4b61a02 = c25846x6ab5dc6.f48688x635d47c;
            }
            throw th6;
        }
    }

    /* renamed from: isFinished */
    public boolean m98267xa89067bc() {
        return 3 == this.f48758x1a39f6bf && this.f48752x3965951c.m97210x5241396d();
    }

    /* renamed from: sendMessage */
    public void m98268x2936bf5f(int i17, java.lang.Object obj, java.lang.String str, long j17) {
        v(TAG, "sendMessage() called with: what = [" + m98251xae7c938e(i17) + "], obj = [" + obj + "], from = [" + str + "]");
        android.os.Handler handler = this.f48757xb0f732c9;
        if (handler == null || this.f48759x1b4d34d7 == null) {
            return;
        }
        if ((i17 == 3 || i17 == -1 || i17 == 5 || i17 == 6) && handler.hasMessages(12)) {
            this.f48757xb0f732c9.removeMessages(12);
            m98269x2936bf5f(12, "schedule next", java.lang.System.currentTimeMillis());
        }
        this.f48757xb0f732c9.obtainMessage(i17, new com.p314xaae8f345.tav.p2967xc53e9ae1.C25846x6ab5dc6(obj, str, j17)).sendToTarget();
    }

    /* renamed from: sendMessageDelay */
    public void m98270xbc32cd64(int i17, long j17, java.lang.String str, long j18) {
        v(TAG, "sendMessageDelay() called with: what = [" + m98251xae7c938e(i17) + "], delay = [" + j17 + "], from = [" + str + "]");
        if (this.f48757xb0f732c9 != null) {
            android.os.Message message = new android.os.Message();
            message.what = i17;
            message.obj = new com.p314xaae8f345.tav.p2967xc53e9ae1.C25846x6ab5dc6(null, str, j18);
            this.f48757xb0f732c9.sendMessageDelayed(message, j17);
        }
    }

    /* renamed from: setRate */
    public void m98271x764f7c62(float f17) {
        this.f48761x354ce0 = java.lang.Math.abs(f17);
    }

    /* renamed from: update */
    public void m98272xce0038c9(com.p314xaae8f345.tav.p2947x2eaf9f.C25669xd1aeed9b c25669xd1aeed9b) {
        this.f48751x962a3e5d = c25669xd1aeed9b;
    }

    @java.lang.Deprecated
    /* renamed from: updateComposition */
    public void m98273x8a105121(com.p314xaae8f345.tav.p2947x2eaf9f.C25669xd1aeed9b c25669xd1aeed9b) {
        m98269x2936bf5f(4, "updateComposition", java.lang.System.currentTimeMillis());
        m98268x2936bf5f(1, c25669xd1aeed9b, "updateComposition", java.lang.System.currentTimeMillis());
    }

    /* renamed from: sendMessage */
    public void m98269x2936bf5f(int i17, java.lang.String str, long j17) {
        v(TAG, "sendMessage() called with: what = [" + m98251xae7c938e(i17) + "], from = [" + str + "]");
        android.os.Handler handler = this.f48757xb0f732c9;
        if (handler == null || this.f48759x1b4d34d7 == null) {
            return;
        }
        handler.obtainMessage(i17, new com.p314xaae8f345.tav.p2967xc53e9ae1.C25846x6ab5dc6(null, str, j17)).sendToTarget();
    }
}
