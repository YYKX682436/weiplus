package com.p314xaae8f345.tav.p2967xc53e9ae1;

/* renamed from: com.tencent.tav.player.PlayerThread */
/* loaded from: classes16.dex */
public class C25849xfbce7c6b implements android.os.Handler.Callback {

    /* renamed from: ACTION_FINISH */
    static final int f48691x9b8542bc = -1;

    /* renamed from: ACTION_GET_TAV_EXTRA_INFO */
    static final int f48692x6e2bb6e5 = 25;

    /* renamed from: ACTION_PAUSE */
    static final int f48693x2ed8028d = 3;

    /* renamed from: ACTION_PLAY */
    static final int f48694xe07abb9d = 2;

    /* renamed from: ACTION_PREPARE */
    static final int f48695xf5011bde = 1;

    /* renamed from: ACTION_QUIT */
    static final int f48696xe07b52b8 = 850;

    /* renamed from: ACTION_READ_SAMPLE */
    static final int f48697xdc3e6fea = 12;

    /* renamed from: ACTION_READ_SNAP_SHOOT_BITMAP */
    static final int f48698x4de03584 = 24;

    /* renamed from: ACTION_REFRESH_SURFACE */
    static final int f48699xb5f6ef00 = 26;

    /* renamed from: ACTION_RELEASE */
    static final int f48700x48fc36de = 6;

    /* renamed from: ACTION_SEEK */
    static final int f48701xe07bfee1 = 5;

    /* renamed from: ACTION_SEEK_PRE_SAMPLE */
    static final int f48702xe2145704 = 9;

    /* renamed from: ACTION_SET_VOLUME */
    static final int f48703x14cbaf60 = 7;

    /* renamed from: ACTION_STOP */
    static final int f48704xe07c386b = 4;

    /* renamed from: ACTION_UPDATE_ALLPROPERTIES */
    static final int f48705xb359fae7 = 20;

    /* renamed from: ACTION_UPDATE_AUDIOCLIP_PROPERTIES */
    static final int f48706x50ab1239 = 22;

    /* renamed from: ACTION_UPDATE_AUDIOVOLUME_PROPERTIES */
    static final int f48707x8ea9e6f = 23;

    /* renamed from: ACTION_UPDATE_COMPOSITION */
    static final int f48708xc6220fbd = 11;

    /* renamed from: ACTION_UPDATE_PROPERTIES */
    static final int f48709x33e774a0 = 10;

    /* renamed from: ACTION_UPDATE_SIZE */
    static final int f48710x431f292e = 21;

    /* renamed from: STATUS_FINISH */
    static final int f48711xd6b6c580 = 3;

    /* renamed from: STATUS_INIT_CODEC */
    static final int f48712x7fe1d274 = 2;

    /* renamed from: STATUS_NONE */
    static final int f48713x4cf54365 = 1;
    public static final java.lang.String TAG = "PlayerThreadMain";

    /* renamed from: UNIT_TIME */
    private static final long f48714x8bb484a8 = 1000;
    public static x.o map;

    /* renamed from: _hellAccFlag_ */
    private byte f48715x7f11beae;

    /* renamed from: aDecoderTrack */
    private com.p314xaae8f345.tav.p2947x2eaf9f.C25669xd1aeed9b f48716x254b2a68;

    /* renamed from: enableLut */
    private boolean f48718xda597388;

    /* renamed from: filter */
    private com.p314xaae8f345.tav.p2959x5befac44.C25765x7d6db798 f48719xb408cb78;

    /* renamed from: frameDuration */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f48720xef5b9e21;

    /* renamed from: glViewportRect */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 f48721x9f30352f;

    /* renamed from: layoutMode */
    private com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f.RenderLayoutMode f48723x145a03ed;

    /* renamed from: lutBitmap */
    private android.graphics.Bitmap f48724x75b90d1a;

    /* renamed from: mAudioThread */
    private com.p314xaae8f345.tav.p2967xc53e9ae1.C25850x88403a2b f48725xc575eed3;

    /* renamed from: mDisplayTarget */
    private android.view.Surface f48726xefdd6586;

    /* renamed from: mLooper */
    private boolean f48728xe07e11e;

    /* renamed from: mMainHandler */
    private android.os.Handler f48729x9e97c8a4;

    /* renamed from: mPause */
    private boolean f48730xbe957189;

    /* renamed from: mPlayHandler */
    private android.os.Handler f48731xb0f732c9;

    /* renamed from: mPlayRange */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 f48732xa0ee87c;

    /* renamed from: mPlayer */
    private com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 f48733x14aac1ae;

    /* renamed from: mPlayerItem */
    private com.p314xaae8f345.tav.p2967xc53e9ae1.C25841xf3b90db4 f48734x591929e1;

    /* renamed from: mStartTime */
    private long f48736xfbccd462;

    /* renamed from: mThread */
    private android.os.HandlerThread f48738x1b4d34d7;

    /* renamed from: onGetTavExtraListener */
    private com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25836x62b1a6b2 f48739xf5d056d2;

    /* renamed from: onReadSnapShootListener */
    private com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25837x38d52694 f48740x7f084eb4;

    /* renamed from: renderContext */
    private com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 f48742x399b739;

    /* renamed from: renderContextParams */
    private com.p314xaae8f345.tav.p2959x5befac44.C25780x613b55ff f48743x16878e1f;

    /* renamed from: renderSize */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 f48744x472bdab7;

    /* renamed from: reportSession */
    private com.p314xaae8f345.tav.p2968xc84c5534.C25856x1bca27fa f48745x416042c2;

    /* renamed from: surfaceSize */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 f48747xac61224e;

    /* renamed from: vDecoderTrack */
    private com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50 f48748xb60ab2fd;

    /* renamed from: lastSyncMessageId */
    private volatile long f48722xc1b9e831 = 0;

    /* renamed from: decoderConsumerTimeUs */
    private long f48717x36aaaf45 = 0;

    /* renamed from: mPosition */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f48735x519040b6 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;

    /* renamed from: mStatus */
    private int f48737x1a39f6bf = 1;

    /* renamed from: rate */
    private float f48741x354ce0 = 1.0f;

    /* renamed from: mEnableScheduleNext */
    private volatile boolean f48727xc66f169a = false;

    /* renamed from: startTimeUsMark */
    private long f48746xa3d749ba = m98190x4663fdae();

    /* renamed from: com.tencent.tav.player.PlayerThread$2, reason: invalid class name */
    /* loaded from: classes16.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: $SwitchMap$com$tencent$tav$core$composition$VideoComposition$RenderLayoutMode */
        static final /* synthetic */ int[] f48750x9b0bbeb6;

        static {
            int[] iArr = new int[com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f.RenderLayoutMode.m96966xcee59d22().length];
            f48750x9b0bbeb6 = iArr;
            try {
                iArr[com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f.RenderLayoutMode.aspectFit.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f48750x9b0bbeb6[com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f.RenderLayoutMode.aspectFill.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    static {
        x.o oVar = new x.o(10);
        map = oVar;
        oVar.g(1, "初始化");
        map.g(2, "播放");
        map.g(3, "暂停");
        map.g(4, "停止");
        map.g(5, "拖动");
        map.g(12, "读取下一帧");
        map.g(6, "结束线程");
        map.g(26, "刷新渲染");
    }

    public C25849xfbce7c6b(com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50 interfaceC25767xc9028e50, com.p314xaae8f345.tav.p2947x2eaf9f.C25669xd1aeed9b c25669xd1aeed9b, com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85, android.view.Surface surface, android.os.Handler handler, com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 c25839x8ea38701) {
        this.f48720xef5b9e21 = new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(1L, 30);
        this.f48748xb60ab2fd = interfaceC25767xc9028e50;
        this.f48716x254b2a68 = c25669xd1aeed9b;
        this.f48726xefdd6586 = surface;
        this.f48729x9e97c8a4 = handler;
        this.f48744x472bdab7 = c25732x76648a85;
        if (interfaceC25767xc9028e50 != null) {
            this.f48720xef5b9e21 = interfaceC25767xc9028e50.mo96654xacbb5a6b();
        }
        this.f48733x14aac1ae = c25839x8ea38701;
        this.f48734x591929e1 = c25839x8ea38701.m98067xfda78ef6();
        m98194x107b533a();
    }

    /* renamed from: applyViewport */
    private void m98187x4fee9234() {
        com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 c25731x76640468;
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 c25779x3338e719 = this.f48742x399b739;
        if (c25779x3338e719 == null || (c25731x76640468 = this.f48721x9f30352f) == null || c25731x76640468.f47829xc3e1af26 == null || c25731x76640468.f47830x35e001 == null) {
            return;
        }
        c25779x3338e719.m97644x7b31bc8f(c25731x76640468);
    }

    /* renamed from: catLog */
    private java.lang.String m98188xae7c938e(int i17) {
        java.lang.String str = (java.lang.String) map.e(i17, null);
        return android.text.TextUtils.isEmpty(str) ? java.lang.String.valueOf(i17) : str;
    }

    /* renamed from: checkCopyPixelBuffer */
    private void m98189x95c92589(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        if (this.f48740x7f084eb4 != null) {
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(this.f48742x399b739.m97645x6be2dc6() * this.f48742x399b739.m97632xb7389127() * 4);
            allocateDirect.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            allocateDirect.rewind();
            android.opengl.GLES20.glReadPixels(0, 0, this.f48742x399b739.m97645x6be2dc6(), this.f48742x399b739.m97632xb7389127(), com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, allocateDirect);
            int m97645x6be2dc6 = this.f48742x399b739.m97645x6be2dc6();
            int m97632xb7389127 = this.f48742x399b739.m97632xb7389127();
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_4444;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(m97632xb7389127));
            arrayList.add(java.lang.Integer.valueOf(m97645x6be2dc6));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/tav/player/PlayerThread", "checkCopyPixelBuffer", "(Lcom/tencent/tav/coremedia/CMTime;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/tav/player/PlayerThread", "checkCopyPixelBuffer", "(Lcom/tencent/tav/coremedia/CMTime;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            allocateDirect.rewind();
            createBitmap.copyPixelsFromBuffer(allocateDirect);
            this.f48740x7f084eb4.m98059xe05b4124(com.p314xaae8f345.tav.C25632x4e42091.m96107x7f5891db(createBitmap), c25736x76b98a57);
            this.f48740x7f084eb4 = null;
        }
    }

    /* renamed from: getCurrentUsTime */
    private long m98190x4663fdae() {
        return java.lang.System.nanoTime() / 1000;
    }

    /* renamed from: getLastSeekPosAndRemoveOther */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m98191xa9f0bac5() {
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47861xbee5ffa0;
        android.os.MessageQueue queue = this.f48731xb0f732c9.getLooper().getQueue();
        java.lang.reflect.Field declaredField = android.os.MessageQueue.class.getDeclaredField("mMessages");
        declaredField.setAccessible(true);
        android.os.Message message = (android.os.Message) declaredField.get(queue);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (message != null) {
            if (message.what == 5) {
                java.lang.Object obj = message.obj;
                if (obj instanceof com.p314xaae8f345.tav.p2967xc53e9ae1.C25846x6ab5dc6) {
                    c25736x76b98a57 = (com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57) ((com.p314xaae8f345.tav.p2967xc53e9ae1.C25846x6ab5dc6) obj).f48685xfa2b7883;
                    arrayList.add(message);
                    java.lang.reflect.Field declaredField2 = android.os.Message.class.getDeclaredField("next");
                    declaredField2.setAccessible(true);
                    message = (android.os.Message) declaredField2.get(message);
                }
            }
            if (message.getTarget() == this.f48731xb0f732c9) {
                break;
            }
            java.lang.reflect.Field declaredField22 = android.os.Message.class.getDeclaredField("next");
            declaredField22.setAccessible(true);
            message = (android.os.Message) declaredField22.get(message);
        }
        if (c25736x76b98a57 != com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47861xbee5ffa0) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                android.os.Message message2 = (android.os.Message) it.next();
                this.f48731xb0f732c9.removeMessages(message2.what, message2.obj);
            }
        }
        return c25736x76b98a57;
    }

    /* renamed from: getWaitTime */
    private long m98192x8a79d358(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, boolean z17, boolean z18) {
        long m97232x31040141 = this.f48720xef5b9e21.m97232x31040141();
        long m97232x310401412 = c25736x76b98a57.m97232x31040141();
        if (z17 || z18) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d("PlayerThreadMain", "getWaitTime - 0 " + z17 + "  |  " + z18);
            return 0L;
        }
        long abs = ((float) m97232x31040141) / java.lang.Math.abs(this.f48741x354ce0);
        long j17 = abs - this.f48717x36aaaf45;
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v("PlayerThreadMain", "getWaitTime--position-->" + m97232x310401412 + " rate = " + this.f48741x354ce0 + "--decoderConsumerTimeUs-->" + this.f48717x36aaaf45 + "--frameDurationMs-->" + m97232x31040141 + "--realTime-->" + abs + "--nextFrameTime-->" + (m97232x310401412 + abs) + "--sleepTime-->" + j17 + "  mStartTime = " + this.f48736xfbccd462);
        return j17;
    }

    /* renamed from: initDecoderTrack */
    private void m98193x9e180097(java.lang.Object obj) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85;
        if (this.f48742x399b739 == null && this.f48726xefdd6586 != null) {
            com.p314xaae8f345.tav.p2959x5befac44.C25780x613b55ff c25780x613b55ff = this.f48743x16878e1f;
            android.opengl.EGLContext eGLContext = (c25780x613b55ff == null || !(c25780x613b55ff.m97646x74f5bed7("share_context") instanceof android.opengl.EGLContext)) ? null : (android.opengl.EGLContext) this.f48743x16878e1f.m97646x74f5bed7("share_context");
            if (eGLContext != null) {
                com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a852 = this.f48747xac61224e;
                this.f48742x399b739 = new com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719((int) c25732x76648a852.f47833x6be2dc6, (int) c25732x76648a852.f47832xb7389127, this.f48726xefdd6586, eGLContext);
            } else {
                com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a853 = this.f48747xac61224e;
                this.f48742x399b739 = new com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719((int) c25732x76648a853.f47833x6be2dc6, (int) c25732x76648a853.f47832xb7389127, this.f48726xefdd6586);
            }
            this.f48742x399b739.m97637x1cf75088(this.f48743x16878e1f);
        }
        com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f m98129x57d6f9a5 = this.f48734x591929e1.m98129x57d6f9a5();
        if (m98129x57d6f9a5 != null) {
            this.f48744x472bdab7 = m98129x57d6f9a5.mo96930x356c92ad();
            this.f48723x145a03ed = m98129x57d6f9a5.mo96928xa8f30599();
        }
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 c25779x3338e719 = this.f48742x399b739;
        if (c25779x3338e719 != null && (c25732x76648a85 = this.f48744x472bdab7) != null) {
            c25779x3338e719.m97636xf84e829((int) c25732x76648a85.f47832xb7389127);
            this.f48742x399b739.m97640x53e9ee84((int) this.f48744x472bdab7.f47833x6be2dc6);
        }
        m98195xce71b1d6();
        m98226xa9c34f96(this.f48735x519040b6);
        com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50 interfaceC25767xc9028e50 = this.f48748xb60ab2fd;
        if (interfaceC25767xc9028e50 != null) {
            try {
                interfaceC25767xc9028e50.mo96667x7c3e1dab((int) (r5.f47868x17e7e7d / this.f48720xef5b9e21.m97233x754a37bb()));
                this.f48748xb60ab2fd.mo96673x68ac462(this.f48742x399b739);
                if (!this.f48728xe07e11e) {
                    if (this.f48735x519040b6 == com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47861xbee5ffa0) {
                        this.f48735x519040b6 = this.f48748xb60ab2fd.mo96653x51e8b0a();
                    }
                    this.f48748xb60ab2fd.mo96663xc9fc1b13(this.f48735x519040b6, false, true);
                    m98206xe121b2e0(-1);
                }
                m98201x717092f4(obj, true);
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v("PlayerThreadMain", "prepare: init codec-->" + java.lang.Thread.currentThread().getName() + "--vDecoderTrack-->" + this.f48748xb60ab2fd);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v("PlayerThreadMain", "init composition cause exception: " + e17);
                this.f48748xb60ab2fd.mo96661x41012807();
                this.f48748xb60ab2fd = null;
                m98201x717092f4(obj, false);
            }
        } else {
            m98201x717092f4(obj, false);
        }
        com.p314xaae8f345.tav.p2947x2eaf9f.C25669xd1aeed9b c25669xd1aeed9b = this.f48716x254b2a68;
        if (c25669xd1aeed9b != null) {
            c25669xd1aeed9b.mo96672x68ac462();
            this.f48716x254b2a68.mo96663xc9fc1b13(this.f48735x519040b6, false, false);
        }
        m98228xc7ed7a1b(2);
        m98219xe29be6dc();
        m98199x6c3b1be6();
    }

    /* renamed from: initThread */
    private void m98194x107b533a() {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("PlayerVideoThread");
        this.f48738x1b4d34d7 = handlerThread;
        handlerThread.start();
        this.f48731xb0f732c9 = new android.os.Handler(this.f48738x1b4d34d7.getLooper(), this);
        this.f48725xc575eed3 = new com.p314xaae8f345.tav.p2967xc53e9ae1.C25850x88403a2b(this.f48716x254b2a68, this.f48729x9e97c8a4, m98233xe0c06840());
    }

    /* renamed from: initViewport */
    private void m98195xce71b1d6() {
        com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85 = this.f48744x472bdab7;
        if (c25732x76648a85 == null) {
            c25732x76648a85 = this.f48747xac61224e;
        }
        if (this.f48723x145a03ed == null) {
            this.f48721x9f30352f = com.p314xaae8f345.tav.p2947x2eaf9f.C25675xf530736f.m96702xde551406(this.f48747xac61224e, c25732x76648a85);
        } else {
            m98196x8d08a09a(c25732x76648a85);
        }
        m98187x4fee9234();
        this.f48729x9e97c8a4.obtainMessage(3, this.f48721x9f30352f).sendToTarget();
    }

    /* renamed from: initViewportByLayoutMode */
    private void m98196x8d08a09a(com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85) {
        int i17 = com.p314xaae8f345.tav.p2967xc53e9ae1.C25849xfbce7c6b.AnonymousClass2.f48750x9b0bbeb6[this.f48723x145a03ed.ordinal()];
        if (i17 == 1) {
            this.f48721x9f30352f = com.p314xaae8f345.tav.p2947x2eaf9f.C25675xf530736f.m96704x8d2a7456(this.f48747xac61224e, c25732x76648a85);
        } else if (i17 != 2) {
            this.f48721x9f30352f = com.p314xaae8f345.tav.p2947x2eaf9f.C25675xf530736f.m96702xde551406(this.f48747xac61224e, c25732x76648a85);
        } else {
            this.f48721x9f30352f = com.p314xaae8f345.tav.p2947x2eaf9f.C25675xf530736f.m96703x182415de(this.f48747xac61224e, c25732x76648a85);
        }
    }

    /* renamed from: isNeedEnsureLooper */
    private void m98197x885d052f(int i17) {
        if (i17 == 2) {
            this.f48728xe07e11e = true;
        }
    }

    /* renamed from: needNotifyProgressChange */
    private boolean m98198x4bfb19c() {
        try {
            android.os.MessageQueue queue = this.f48731xb0f732c9.getLooper().getQueue();
            java.lang.reflect.Field declaredField = android.os.MessageQueue.class.getDeclaredField("mMessages");
            declaredField.setAccessible(true);
            android.os.Message message = (android.os.Message) declaredField.get(queue);
            if (message != null) {
                int i17 = message.what;
                if (i17 == 3 || i17 == 4 || i17 == 1 || i17 == f48696xe07b52b8 || i17 == 6) {
                    return false;
                }
            }
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e("PlayerThreadMain", "needNotifyProgressChange", e17);
            return false;
        }
    }

    /* renamed from: notifyProgressChange */
    private void m98199x6c3b1be6() {
        if (m98198x4bfb19c()) {
            this.f48729x9e97c8a4.obtainMessage(2, this.f48735x519040b6).sendToTarget();
        }
    }

    /* renamed from: notifyStatus */
    private void m98200x5793f89b(com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerStatus playerStatus, java.lang.String str) {
        this.f48729x9e97c8a4.obtainMessage(1, new com.p314xaae8f345.tav.p2967xc53e9ae1.C25848xe3baec2e(playerStatus, str)).sendToTarget();
    }

    /* renamed from: onCompositionUpdate */
    private void m98201x717092f4(java.lang.Object obj, boolean z17) {
        if (obj instanceof com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25835x83ed6fa8) {
            ((com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25835x83ed6fa8) obj).mo98057x41ace1dc(this.f48733x14aac1ae, z17);
        }
    }

    /* renamed from: pause */
    private void m98202x65825f6() {
        this.f48728xe07e11e = false;
        this.f48730xbe957189 = true;
        m98231xc71fbb4d(false);
        m98213xd8caf414(12);
        m98200x5793f89b(com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerStatus.PAUSED, "");
    }

    /* renamed from: play */
    private void m98203x348b34() {
        int i17 = this.f48737x1a39f6bf;
        if (i17 == 1) {
            if (this.f48748xb60ab2fd == null && this.f48716x254b2a68 == null) {
                return;
            }
            m98241x2936bf5f(1, "not can play");
            m98241x2936bf5f(2, "not can play");
            return;
        }
        if (i17 == 3) {
            com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50 interfaceC25767xc9028e50 = this.f48748xb60ab2fd;
            if (interfaceC25767xc9028e50 != null) {
                if (this.f48735x519040b6.m97238x9f3f7b48(interfaceC25767xc9028e50.mo96653x51e8b0a())) {
                    this.f48748xb60ab2fd.mo96663xc9fc1b13(this.f48735x519040b6, false, true);
                } else {
                    this.f48748xb60ab2fd.mo96663xc9fc1b13(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f, false, true);
                }
            }
            m98228xc7ed7a1b(2);
        }
        m98213xd8caf414(12);
        this.f48728xe07e11e = true;
        m98231xc71fbb4d(true);
        m98239x2936bf5f(12, 2, com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27);
        m98200x5793f89b(com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerStatus.PLAYING, "");
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v("PlayerThreadMain", "playm() called start play-->" + this.f48737x1a39f6bf);
    }

    /* renamed from: playerFinish */
    private void m98204xda2ba6d4() {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d("PlayerThreadMain", "playFinish");
        com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50 interfaceC25767xc9028e50 = this.f48748xb60ab2fd;
        m98226xa9c34f96(interfaceC25767xc9028e50 != null ? interfaceC25767xc9028e50.mo96653x51e8b0a() : this.f48733x14aac1ae.mo98031x89444d94());
        m98199x6c3b1be6();
        m98228xc7ed7a1b(3);
        m98220x45efc96c(-1, null);
        com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50 interfaceC25767xc9028e502 = this.f48748xb60ab2fd;
        if (interfaceC25767xc9028e502 != null) {
            interfaceC25767xc9028e502.mo96663xc9fc1b13(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f, false, true);
        }
        this.f48736xfbccd462 = 0L;
        this.f48728xe07e11e = false;
        m98200x5793f89b(com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerStatus.FINISHED, "");
    }

    /* renamed from: prepare */
    private void m98205xed060d07(java.lang.Object obj) {
        if (this.f48737x1a39f6bf == 1) {
            m98193x9e180097(obj);
            m98231xc71fbb4d(true);
        } else {
            m98239x2936bf5f(4, java.lang.Boolean.FALSE, "prepare");
            m98239x2936bf5f(1, obj, "prepare");
        }
    }

    /* renamed from: readSample */
    private void m98206xe121b2e0(int i17) {
        m98207xe121b2e0(i17, (this.f48725xc575eed3.f48753xd4b61a02 > this.f48722xc1b9e831 ? 1 : (this.f48725xc575eed3.f48753xd4b61a02 == this.f48722xc1b9e831 ? 0 : -1)) == 0 ? this.f48725xc575eed3.m98266x919571e6() : com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47861xbee5ffa0);
    }

    /* renamed from: readSampleBuffer */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m98208x9a488b40(int i17, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a572) {
        if (i17 == 5) {
            return this.f48748xb60ab2fd.mo96663xc9fc1b13(c25736x76b98a57, true, true);
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97236x636d539 = this.f48720xef5b9e21.m97236x636d539(this.f48741x354ce0);
        if (c25736x76b98a572.m97238x9f3f7b48(c25736x76b98a57.sub(m97236x636d539.m97236x636d539(3.0f)))) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v("PlayerThreadMain", "readSampleBuffer: sampleTime = // " + c25736x76b98a572.add(this.f48720xef5b9e21));
            return this.f48748xb60ab2fd.mo96660xe121b2e0(c25736x76b98a57.m97227xb0a37c79(m97236x636d539).m97237x636d539(m97236x636d539));
        }
        if (!c25736x76b98a572.m97222xf922bec1(c25736x76b98a57.add(m97236x636d539)) || !c25736x76b98a57.m97222xf922bec1(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f) || !this.f48725xc575eed3.m98267xa89067bc()) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v("PlayerThreadMain", "readSampleBuffer: sampleTime = " + c25736x76b98a572.add(m97236x636d539));
            return this.f48748xb60ab2fd.mo96660xe121b2e0(c25736x76b98a572.add(m97236x636d539));
        }
        m98220x45efc96c(2, c25736x76b98a572);
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v("PlayerThreadMain", "readSampleBuffer: sampleTime = /// " + c25736x76b98a572.add(m97236x636d539));
        return this.f48748xb60ab2fd.mo96660xe121b2e0(m97236x636d539);
    }

    /* renamed from: refreshSurface */
    private void m98209x31091552(com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25832xf9968465 interfaceC25832xf9968465) {
        if (this.f48737x1a39f6bf == 1) {
            return;
        }
        if (this.f48748xb60ab2fd != null) {
            m98213xd8caf414(12, 26);
            com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50 interfaceC25767xc9028e50 = this.f48748xb60ab2fd;
            m98214xa8c27340(interfaceC25767xc9028e50.mo96660xe121b2e0(interfaceC25767xc9028e50.mo96651x940ab53a()));
        }
        if (interfaceC25832xf9968465 != null) {
            interfaceC25832xf9968465.mo98027x2e7a5e();
        }
    }

    /* renamed from: release */
    private void m98210x41012807(android.os.Message message) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d("PlayerThreadMain", "release player - " + this);
        this.f48742x399b739.m97634x900967ab();
        java.lang.Object obj = message.obj;
        if (obj instanceof com.p314xaae8f345.tav.p2967xc53e9ae1.C25846x6ab5dc6) {
            java.lang.Object obj2 = ((com.p314xaae8f345.tav.p2967xc53e9ae1.C25846x6ab5dc6) obj).f48685xfa2b7883;
            if (obj2 instanceof java.lang.Runnable) {
                ((java.lang.Runnable) obj2).run();
            }
        }
        m98213xd8caf414(new int[0]);
        m98211x3ae3e2f9(message.what, message.obj);
        m98228xc7ed7a1b(1);
        com.p314xaae8f345.tav.p2968xc84c5534.C25856x1bca27fa c25856x1bca27fa = this.f48745x416042c2;
        if (c25856x1bca27fa != null) {
            c25856x1bca27fa.m98329x5d03b04();
            this.f48745x416042c2 = null;
        }
    }

    /* renamed from: releaseAudioThread */
    private void m98211x3ae3e2f9(int i17, java.lang.Object obj) {
        if (i17 == 6) {
            this.f48722xc1b9e831 = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d("PlayerThreadMain", "releaseAudioThread SyncMessageId = " + this.f48722xc1b9e831 + "  action = " + i17 + "  obj =  " + obj);
            this.f48725xc575eed3.m98268x2936bf5f(i17, obj, "syncAudioStatus", this.f48722xc1b9e831);
        }
    }

    /* renamed from: releaseComposition */
    private void m98212xed7a0f23() {
        if (this.f48748xb60ab2fd == null) {
            return;
        }
        if (this.f48734x591929e1.m98112x35bb4175() != null) {
            this.f48734x591929e1.m98112x35bb4175().mo96822x41012807();
        }
        this.f48748xb60ab2fd.mo96661x41012807();
        this.f48716x254b2a68.mo96661x41012807();
    }

    /* renamed from: removePendingMessage */
    private void m98213xd8caf414(int... iArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleMessage() called with: removeInt = [");
        sb6.append(iArr.length == 0 ? "null" : java.lang.Integer.valueOf(iArr[0]));
        sb6.append("]");
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v("PlayerThreadMain", sb6.toString());
        if (iArr.length != 0) {
            for (int i17 : iArr) {
                this.f48731xb0f732c9.removeMessages(i17);
            }
            return;
        }
        synchronized (this.f48731xb0f732c9) {
            if (this.f48731xb0f732c9.hasMessages(f48696xe07b52b8)) {
                this.f48731xb0f732c9.removeCallbacksAndMessages(null);
                this.f48731xb0f732c9.sendEmptyMessage(f48696xe07b52b8);
            } else {
                this.f48731xb0f732c9.removeCallbacksAndMessages(null);
            }
        }
    }

    /* renamed from: renderSampleBuffer */
    private void m98214xa8c27340(com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c14) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v("PlayerThreadMain", "renderSampleBuffer() called with: sampleBuffer = [" + c25734xcdff9c14 + "]");
        if (c25734xcdff9c14.m97194x3a00ef33() != null) {
            if (this.f48719xb408cb78 == null) {
                if (this.f48718xda597388) {
                    this.f48719xb408cb78 = new com.p314xaae8f345.tav.p2959x5befac44.C25772xdc4495d2(this.f48724x75b90d1a);
                } else {
                    this.f48719xb408cb78 = new com.p314xaae8f345.tav.p2959x5befac44.C25765x7d6db798();
                }
                this.f48719xb408cb78.mo97543x5e392181(this.f48742x399b739.m97645x6be2dc6());
                this.f48719xb408cb78.mo97542x4f1c14cc(this.f48742x399b739.m97632xb7389127());
            }
            this.f48742x399b739.m97634x900967ab();
            com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 m97194x3a00ef33 = c25734xcdff9c14.m97194x3a00ef33();
            com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25836x62b1a6b2 interfaceC25836x62b1a6b2 = this.f48739xf5d056d2;
            if (interfaceC25836x62b1a6b2 != null) {
                interfaceC25836x62b1a6b2.m98058x3a00ef33(m97194x3a00ef33);
                return;
            }
            m98187x4fee9234();
            this.f48719xb408cb78.mo97540xa5089f5c(this.f48733x14aac1ae.m98066x319751e8());
            this.f48719xb408cb78.mo97526x79f87086(m97194x3a00ef33, null, m97194x3a00ef33.m97280xc3a49506());
            m98189x95c92589(c25734xcdff9c14.m97195xfb85bb43());
            this.f48742x399b739.m97638xab5ea589(c25734xcdff9c14.m97195xfb85bb43().m97232x31040141());
            this.f48742x399b739.m97641x82211f20();
        }
    }

    /* renamed from: scheduleNextWork */
    private void m98215xe4d4845b(long j17) {
        if (!this.f48727xc66f169a) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i("PlayerThreadMain", "disable scheduleNextWork ignore");
            return;
        }
        long j18 = j17 / 1000;
        if (j18 <= 0) {
            m98241x2936bf5f(12, "schedule next");
            return;
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v("scheduleNextWork", "waitTime" + j18);
        m98242xbc32cd64(12, j18, "schedule next");
    }

    /* renamed from: seek */
    private void m98216x35ce78(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        if (this.f48737x1a39f6bf == 1) {
            return;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a572 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47861xbee5ffa0;
        try {
            c25736x76b98a572 = m98191xa9f0bac5();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e("PlayerThreadMain", "getLastSeekPosAndRemoveOther", e17);
        }
        if (c25736x76b98a572.m97233x754a37bb() > -1) {
            c25736x76b98a57 = c25736x76b98a572;
        }
        if (this.f48748xb60ab2fd == null) {
            m98220x45efc96c(5, c25736x76b98a57);
            return;
        }
        m98213xd8caf414(12);
        this.f48735x519040b6 = c25736x76b98a57;
        m98199x6c3b1be6();
        m98220x45efc96c(3, c25736x76b98a57);
        m98220x45efc96c(5, c25736x76b98a57);
        m98207xe121b2e0(5, c25736x76b98a57);
        this.f48731xb0f732c9.postDelayed(new java.lang.Runnable() { // from class: com.tencent.tav.player.PlayerThread.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.p314xaae8f345.tav.p2967xc53e9ae1.C25849xfbce7c6b.this.f48728xe07e11e) {
                    com.p314xaae8f345.tav.p2967xc53e9ae1.C25849xfbce7c6b.this.m98220x45efc96c(2, null);
                }
            }
        }, 10L);
    }

    /* renamed from: seekPreSample */
    private void m98217x10896695() {
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo96651x940ab53a = this.f48748xb60ab2fd.mo96651x940ab53a();
        if (mo96651x940ab53a != com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47861xbee5ffa0) {
            m98216x35ce78(mo96651x940ab53a);
        }
    }

    /* renamed from: stop */
    private void m98218x360802(boolean z17) {
        m98212xed7a0f23();
        com.p314xaae8f345.tav.p2959x5befac44.C25765x7d6db798 c25765x7d6db798 = this.f48719xb408cb78;
        if (c25765x7d6db798 != null) {
            c25765x7d6db798.mo97539x41012807();
            this.f48719xb408cb78 = null;
        }
        this.f48736xfbccd462 = 0L;
        m98231xc71fbb4d(false);
        m98228xc7ed7a1b(1);
        if (z17) {
            m98200x5793f89b(com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerStatus.STOPPED, "");
            m98213xd8caf414(new int[0]);
            this.f48728xe07e11e = false;
        }
    }

    /* renamed from: synAudioComposition */
    private void m98219xe29be6dc() {
        if (this.f48716x254b2a68 != null) {
            this.f48722xc1b9e831 = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d("PlayerThreadMain", "synAudioComposition SyncMessageId = " + this.f48722xc1b9e831);
            this.f48725xc575eed3.m98268x2936bf5f(1, null, "syncAudioStatus composition", this.f48722xc1b9e831);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: syncAudioOtherMsg */
    public void m98220x45efc96c(int i17, java.lang.Object obj) {
        if (i17 == 3 || i17 == 2 || i17 == 4 || i17 == 6 || i17 == 7 || i17 == -1 || i17 == 5) {
            this.f48722xc1b9e831 = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d("PlayerThreadMain", "syncAudioOtherMsg SyncMessageId = " + this.f48722xc1b9e831 + "  action = " + i17 + "  obj = " + obj);
            this.f48725xc575eed3.m98268x2936bf5f(i17, obj, "syncAudioStatus", this.f48722xc1b9e831);
        }
    }

    /* renamed from: syncAudioProgress */
    private void m98221x5012f548() {
        com.p314xaae8f345.tav.p2947x2eaf9f.C25669xd1aeed9b c25669xd1aeed9b = this.f48716x254b2a68;
        if (c25669xd1aeed9b != null) {
            if (!this.f48735x519040b6.m97229x22a7969a(c25669xd1aeed9b.mo96651x940ab53a())) {
                this.f48735x519040b6 = this.f48716x254b2a68.mo96651x940ab53a();
                m98199x6c3b1be6();
            }
            if (this.f48725xc575eed3.m98267xa89067bc()) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v("PlayerThreadMain", "processFrame() called with: finish");
                m98204xda2ba6d4();
            } else if (this.f48728xe07e11e) {
                m98215xe4d4845b(30L);
                this.f48730xbe957189 = false;
            }
        }
    }

    /* renamed from: udpateAudioVolumeProperties */
    private void m98222x3ad28132() {
    }

    /* renamed from: updateAllProperties */
    private void m98223xab8f536b() {
    }

    /* renamed from: updateAudioClipsProperties */
    private void m98224xc57a4469() {
        com.p314xaae8f345.tav.p2947x2eaf9f.C25669xd1aeed9b c25669xd1aeed9b = this.f48716x254b2a68;
        if (c25669xd1aeed9b != null) {
            c25669xd1aeed9b.mo96661x41012807();
        }
        com.p314xaae8f345.tav.p2947x2eaf9f.C25669xd1aeed9b m98130xa8851aab = this.f48734x591929e1.m98130xa8851aab();
        this.f48716x254b2a68 = m98130xa8851aab;
        m98130xa8851aab.mo96672x68ac462();
        this.f48725xc575eed3.m98272xce0038c9(this.f48716x254b2a68);
        if (this.f48728xe07e11e) {
            m98220x45efc96c(2, this.f48735x519040b6);
        }
    }

    /* renamed from: updateComposition */
    private void m98225x8a105121(java.lang.Object obj) {
        if (obj instanceof com.p314xaae8f345.tav.p2967xc53e9ae1.C25841xf3b90db4) {
            com.p314xaae8f345.tav.p2967xc53e9ae1.C25841xf3b90db4 c25841xf3b90db4 = (com.p314xaae8f345.tav.p2967xc53e9ae1.C25841xf3b90db4) obj;
            this.f48748xb60ab2fd = c25841xf3b90db4.m98122x8853f79b();
            this.f48716x254b2a68 = c25841xf3b90db4.m98109x37aabff1();
            this.f48734x591929e1 = c25841xf3b90db4;
        }
        com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50 interfaceC25767xc9028e50 = this.f48748xb60ab2fd;
        if (interfaceC25767xc9028e50 != null) {
            this.f48720xef5b9e21 = interfaceC25767xc9028e50.mo96654xacbb5a6b();
        }
        this.f48725xc575eed3.m98272xce0038c9(this.f48716x254b2a68);
    }

    /* renamed from: updateProgressPreNextAction */
    private void m98226xa9c34f96(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        this.f48735x519040b6 = c25736x76b98a57;
    }

    /* renamed from: updateProperties */
    private void m98227x7c49fadc() {
    }

    /* renamed from: updateStatus */
    private void m98228xc7ed7a1b(int i17) {
        this.f48737x1a39f6bf = i17;
    }

    /* renamed from: bindSurface */
    public void m98229x6fcb91b0(com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50 interfaceC25767xc9028e50, com.p314xaae8f345.tav.p2967xc53e9ae1.C25845x838a96d0 c25845x838a96d0) {
        this.f48726xefdd6586 = c25845x838a96d0.f48680x9189ecad;
        this.f48748xb60ab2fd = interfaceC25767xc9028e50;
        this.f48747xac61224e = new com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85(c25845x838a96d0.f48682xdffb3519, c25845x838a96d0.f48681x59c7434);
        m98241x2936bf5f(1, "bind surface");
    }

    /* renamed from: cancelAllPendingSeeks */
    public void m98230xd00ad80b() {
        m98213xd8caf414(5);
    }

    /* renamed from: enableScheduleNext */
    public void m98231xc71fbb4d(boolean z17) {
        this.f48727xc66f169a = z17;
    }

    /* renamed from: getGlViewportRect */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 m98232x8dc80225() {
        return this.f48721x9f30352f;
    }

    /* renamed from: getPlayHandler */
    public android.os.Handler m98233xe0c06840() {
        return this.f48731xb0f732c9;
    }

    /* renamed from: getPosition */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m98234xa86cd69f() {
        return this.f48735x519040b6;
    }

    /* renamed from: getRenderContextParams */
    public com.p314xaae8f345.tav.p2959x5befac44.C25780x613b55ff m98235x6eb76ae9() {
        return this.f48743x16878e1f;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        java.lang.Object obj;
        com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25832xf9968465 interfaceC25832xf9968465;
        java.lang.Object obj2 = message.obj;
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25846x6ab5dc6 c25846x6ab5dc6 = obj2 == null ? null : (com.p314xaae8f345.tav.p2967xc53e9ae1.C25846x6ab5dc6) obj2;
        if (c25846x6ab5dc6 != null) {
            obj = c25846x6ab5dc6.f48685xfa2b7883;
            interfaceC25832xf9968465 = c25846x6ab5dc6.f48686xf5bc2045;
        } else {
            obj = null;
            interfaceC25832xf9968465 = null;
        }
        int i17 = message.what;
        if (i17 != 2) {
            m98220x45efc96c(i17, obj2);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleMessage() called with: msg = [");
        sb6.append(m98188xae7c938e(message.what));
        sb6.append("]--obj-->");
        sb6.append(obj);
        sb6.append("--from-->");
        sb6.append(c25846x6ab5dc6 == null ? null : c25846x6ab5dc6.f48687x300cc4);
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v("PlayerThreadMain", sb6.toString());
        if (this.f48738x1b4d34d7 == null) {
            return false;
        }
        try {
            int i18 = message.what;
            if (i18 != f48696xe07b52b8) {
                switch (i18) {
                    case 1:
                        m98205xed060d07(obj);
                        break;
                    case 2:
                        m98203x348b34();
                        break;
                    case 3:
                        m98202x65825f6();
                        break;
                    case 4:
                        m98218x360802(obj == null ? false : ((java.lang.Boolean) obj).booleanValue());
                        break;
                    case 5:
                        m98216x35ce78((com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57) obj);
                        break;
                    case 6:
                        m98210x41012807(message);
                        break;
                    default:
                        switch (i18) {
                            case 9:
                                m98217x10896695();
                                break;
                            case 10:
                                m98227x7c49fadc();
                                break;
                            case 11:
                                com.p314xaae8f345.tav.p2967xc53e9ae1.C25852xc31b13c6 c25852xc31b13c6 = (com.p314xaae8f345.tav.p2967xc53e9ae1.C25852xc31b13c6) obj;
                                m98218x360802(true);
                                m98212xed7a0f23();
                                if (c25852xc31b13c6 != null) {
                                    m98225x8a105121(c25852xc31b13c6.f48764x7ce73194);
                                    m98205xed060d07(c25852xc31b13c6.f48765x841a889d);
                                    break;
                                }
                                break;
                            case 12:
                                if (this.f48732xa0ee87c != null && !this.f48735x519040b6.add(this.f48720xef5b9e21).m97238x9f3f7b48(this.f48732xa0ee87c.m97258xb58839a5())) {
                                    m98216x35ce78(this.f48732xa0ee87c.m97260x75286aac());
                                    break;
                                } else if (this.f48727xc66f169a) {
                                    m98206xe121b2e0(obj == null ? 0 : ((java.lang.Integer) obj).intValue());
                                    break;
                                }
                                break;
                            default:
                                switch (i18) {
                                    case 20:
                                        m98223xab8f536b();
                                        break;
                                    case 21:
                                        if (obj instanceof com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85) {
                                            this.f48747xac61224e = (com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85) obj;
                                            m98195xce71b1d6();
                                            break;
                                        }
                                        break;
                                    case 22:
                                        m98224xc57a4469();
                                        break;
                                    case 23:
                                        m98222x3ad28132();
                                        break;
                                    case 24:
                                        if (obj instanceof com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25837x38d52694) {
                                            this.f48740x7f084eb4 = (com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25837x38d52694) obj;
                                            break;
                                        }
                                        break;
                                    case 25:
                                        if (obj instanceof com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25836x62b1a6b2) {
                                            this.f48739xf5d056d2 = (com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25836x62b1a6b2) obj;
                                            break;
                                        }
                                        break;
                                    case 26:
                                        m98209x31091552((com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25832xf9968465) obj);
                                        break;
                                }
                        }
                }
            } else {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i("PlayerThreadMain", "quit: PlayerThreadMain " + this);
                m98213xd8caf414(new int[0]);
                this.f48738x1b4d34d7.quit();
                this.f48738x1b4d34d7 = null;
                this.f48748xb60ab2fd.mo96661x41012807();
                this.f48716x254b2a68.mo96661x41012807();
                this.f48742x399b739.mo97551x41012807();
                this.f48742x399b739 = null;
                this.f48748xb60ab2fd = null;
                this.f48716x254b2a68 = null;
                this.f48731xb0f732c9.removeCallbacksAndMessages(null);
            }
            if (interfaceC25832xf9968465 != null) {
                interfaceC25832xf9968465.mo98027x2e7a5e();
            }
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v("PlayerThreadMain", "player error:" + android.util.Log.getStackTraceString(e17));
            return false;
        }
    }

    /* renamed from: hasMessage */
    public boolean m98236xb20ec40d(int i17) {
        android.os.Handler handler = this.f48731xb0f732c9;
        if (handler == null || this.f48738x1b4d34d7 == null) {
            return false;
        }
        return handler.hasMessages(i17);
    }

    /* renamed from: removePendingUpdateCompositionMessage */
    public void m98237x843bf739() {
        m98213xd8caf414(11);
    }

    /* renamed from: removeReadSampleMessage */
    public void m98238x81dc8e3() {
        if (this.f48737x1a39f6bf == 1 || this.f48748xb60ab2fd == null) {
            return;
        }
        m98213xd8caf414(12, 26);
    }

    /* renamed from: sendMessage */
    public void m98240x2936bf5f(int i17, java.lang.Object obj, java.lang.String str, com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25832xf9968465 interfaceC25832xf9968465) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d("PlayerThreadMain", "sendMessage() called with: what = [" + m98188xae7c938e(i17) + "], obj = [" + obj + "], from = [" + str + "]");
        android.os.Handler handler = this.f48731xb0f732c9;
        if (handler == null || this.f48738x1b4d34d7 == null) {
            return;
        }
        handler.obtainMessage(i17, new com.p314xaae8f345.tav.p2967xc53e9ae1.C25846x6ab5dc6(obj, str, java.lang.System.currentTimeMillis(), interfaceC25832xf9968465)).sendToTarget();
    }

    /* renamed from: sendMessageDelay */
    public void m98242xbc32cd64(int i17, long j17, java.lang.String str) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v("PlayerThreadMain", "sendMessageDelay() called with: what = [" + m98188xae7c938e(i17) + "], delay = [" + j17 + "], from = [" + str + "]");
        if (this.f48731xb0f732c9 != null) {
            android.os.Message message = new android.os.Message();
            message.what = i17;
            message.obj = new com.p314xaae8f345.tav.p2967xc53e9ae1.C25846x6ab5dc6(null, str, java.lang.System.currentTimeMillis());
            this.f48731xb0f732c9.sendMessageDelayed(message, j17);
        }
    }

    /* renamed from: setEnableLut */
    public void m98243x361aa546(boolean z17, android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            this.f48718xda597388 = false;
            return;
        }
        this.f48718xda597388 = z17;
        this.f48724x75b90d1a = bitmap;
        com.p314xaae8f345.tav.p2959x5befac44.C25765x7d6db798 c25765x7d6db798 = this.f48719xb408cb78;
        if (c25765x7d6db798 == null || !(c25765x7d6db798 instanceof com.p314xaae8f345.tav.p2959x5befac44.C25772xdc4495d2)) {
            return;
        }
        ((com.p314xaae8f345.tav.p2959x5befac44.C25772xdc4495d2) c25765x7d6db798).m97578x2676fc06(z17, bitmap);
    }

    /* renamed from: setFrameDuration */
    public void m98244x3f91c0df(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        this.f48720xef5b9e21 = c25736x76b98a57;
    }

    /* renamed from: setPlayRange */
    public void m98245xeb18d027(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        this.f48732xa0ee87c = c25738xead39d26;
    }

    /* renamed from: setRate */
    public void m98246x764f7c62(float f17) {
        this.f48741x354ce0 = f17;
        this.f48725xc575eed3.m98271x764f7c62(f17);
    }

    /* renamed from: setRenderContextParams */
    public void m98247xbcfc2a5d(com.p314xaae8f345.tav.p2959x5befac44.C25780x613b55ff c25780x613b55ff) {
        this.f48743x16878e1f = c25780x613b55ff;
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 c25779x3338e719 = this.f48742x399b739;
        if (c25779x3338e719 != null) {
            c25779x3338e719.m97637x1cf75088(c25780x613b55ff);
        }
    }

    /* renamed from: updatePositionRightAway */
    public void m98248x12b50238(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        this.f48735x519040b6 = c25736x76b98a57;
    }

    /* renamed from: readSample */
    private void m98207xe121b2e0(int i17, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m98208x9a488b40;
        long nanoTime;
        if (this.f48748xb60ab2fd == null) {
            m98221x5012f548();
            return;
        }
        if (this.f48745x416042c2 == null) {
            this.f48745x416042c2 = new com.p314xaae8f345.tav.p2968xc84c5534.C25856x1bca27fa();
        }
        try {
            long m97232x31040141 = this.f48720xef5b9e21.m97226xb0a37c79(this.f48741x354ce0).m97232x31040141() - (m98190x4663fdae() - this.f48746xa3d749ba);
            if (m97232x31040141 > 0) {
                java.lang.Thread.sleep(m97232x31040141 / 1000);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e("PlayerThreadMain", "readSample", th6);
        }
        this.f48746xa3d749ba = m98190x4663fdae();
        m98197x885d052f(i17);
        com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d c25735x289c723d = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d();
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo96651x940ab53a = this.f48748xb60ab2fd.mo96651x940ab53a();
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v("PlayerThreadMain", "readSample[" + i17 + "] lastPosition = " + mo96651x940ab53a + " syncPlayingTime = " + c25736x76b98a57);
        if (i17 == 2) {
            m98220x45efc96c(2, mo96651x940ab53a);
        }
        if (i17 != 5 && !this.f48727xc66f169a) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i("PlayerThreadMain", "disable schedule next, ignore this readSample");
            return;
        }
        try {
            this.f48742x399b739.m97634x900967ab();
            long nanoTime2 = java.lang.System.nanoTime();
            m98208x9a488b40 = m98208x9a488b40(i17, c25736x76b98a57, mo96651x940ab53a);
            nanoTime = java.lang.System.nanoTime() - nanoTime2;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e("PlayerThreadMain", "readSample", e17);
            if (e17 instanceof java.lang.IllegalStateException) {
                m98200x5793f89b(com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerStatus.ERROR, "解码异常");
                return;
            }
        }
        if (i17 != 5 && !this.f48727xc66f169a) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i("PlayerThreadMain", "disable schedule next, ignore this render");
            return;
        }
        long nanoTime3 = java.lang.System.nanoTime();
        m98214xa8c27340(m98208x9a488b40);
        this.f48745x416042c2.m98330xbb968f6b(nanoTime, java.lang.System.nanoTime() - nanoTime3);
        c25735x289c723d = m98208x9a488b40.m97193x75286adb();
        this.f48748xb60ab2fd.mo96649xb8b7224f(c25735x289c723d.m97208xfb85bb43().add(new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(1L, c25735x289c723d.m97208xfb85bb43().f47868x17e7e7d)));
        this.f48717x36aaaf45 = m98190x4663fdae() - this.f48746xa3d749ba;
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v("PlayerThreadMain", "readSample() called with: messageId = [" + i17 + "]--currentSampleState-->" + c25735x289c723d + "--looper-->" + this.f48728xe07e11e + " consumer = " + (java.lang.System.currentTimeMillis() - this.f48746xa3d749ba));
        if (c25735x289c723d.m97214x36f88ac9(-1, -3)) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v("PlayerThreadMain", "readSample() called with: finish");
            m98204xda2ba6d4();
            return;
        }
        boolean z17 = 5 == i17;
        if (c25735x289c723d.m97206x8311a768() >= 0) {
            this.f48735x519040b6 = c25735x289c723d.m97208xfb85bb43();
            if (!z17 && !this.f48731xb0f732c9.hasMessages(5)) {
                m98199x6c3b1be6();
            }
        } else {
            if (c25735x289c723d.m97214x36f88ac9(-100)) {
                this.f48748xb60ab2fd.mo96663xc9fc1b13(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f, false, true);
            }
            c25735x289c723d = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(mo96651x940ab53a);
        }
        if (this.f48728xe07e11e) {
            boolean z18 = this.f48730xbe957189;
            this.f48717x36aaaf45 = (m98190x4663fdae() - this.f48746xa3d749ba) + 5000;
            m98215xe4d4845b(m98192x8a79d358(c25735x289c723d.m97208xfb85bb43(), z17, z18));
            this.f48730xbe957189 = false;
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v("PlayerThreadMain", "readSample end [" + i17 + "]--looper-->" + this.f48728xe07e11e + " consumer = " + (m98190x4663fdae() - this.f48746xa3d749ba));
    }

    /* renamed from: sendMessage */
    public void m98239x2936bf5f(int i17, java.lang.Object obj, java.lang.String str) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v("PlayerThreadMain", "sendMessage() called with: what = [" + m98188xae7c938e(i17) + "], obj = [" + obj + "], from = [" + str + "]");
        android.os.Handler handler = this.f48731xb0f732c9;
        if (handler == null || this.f48738x1b4d34d7 == null) {
            return;
        }
        handler.obtainMessage(i17, new com.p314xaae8f345.tav.p2967xc53e9ae1.C25846x6ab5dc6(obj, str, java.lang.System.currentTimeMillis())).sendToTarget();
    }

    /* renamed from: sendMessage */
    public void m98241x2936bf5f(int i17, java.lang.String str) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v("PlayerThreadMain", "sendMessage() called with: what = [" + m98188xae7c938e(i17) + "], from = [" + str + "]");
        android.os.Handler handler = this.f48731xb0f732c9;
        if (handler == null || this.f48738x1b4d34d7 == null) {
            return;
        }
        handler.obtainMessage(i17, new com.p314xaae8f345.tav.p2967xc53e9ae1.C25846x6ab5dc6(null, str, java.lang.System.currentTimeMillis())).sendToTarget();
    }
}
