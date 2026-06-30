package com.p314xaae8f345.tav.p2947x2eaf9f;

/* renamed from: com.tencent.tav.core.AssetImageGenerator */
/* loaded from: classes14.dex */
public class C25658x29f502a8 {
    private final java.lang.String TAG;

    /* renamed from: _hellAccFlag_ */
    private byte f47250x7f11beae;

    /* renamed from: apertureMode */
    private com.p314xaae8f345.tav.p2947x2eaf9f.C25658x29f502a8.ApertureMode f47251x7d4ec153;

    /* renamed from: appliesPreferredTrackTransform */
    private boolean f47252xa9a60b16;

    /* renamed from: asset */
    protected com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0 f47253x58ceaf0;

    /* renamed from: assetExtension */
    protected com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f f47254xf1239f2f;

    /* renamed from: generatorThread */
    private final com.p314xaae8f345.tav.p2947x2eaf9f.C25658x29f502a8.ImageGeneratorThread f47255x447eabd;

    /* renamed from: generatorThreadId */
    private long f47256x11f838b8;

    /* renamed from: maximumSize */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 f47257x6478fa41;

    /* renamed from: outBitmapReaderBuffer */
    private java.nio.ByteBuffer f47258x5ff565a0;

    /* renamed from: outSavePath */
    private java.lang.String f47259xec0b78b0;

    /* renamed from: outputBitmapFactory */
    private com.p314xaae8f345.tav.p2947x2eaf9f.C25658x29f502a8.OutputBitmapFactory f47260x8d3d755a;

    /* renamed from: renderContext */
    private com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 f47261x399b739;

    /* renamed from: renderContextParams */
    private com.p314xaae8f345.tav.p2959x5befac44.C25780x613b55ff f47262x16878e1f;

    /* renamed from: videoCompositing */
    private com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25701x7dc2d629 f47263xaffe9209;

    /* renamed from: videoComposition */
    private com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f f47264xaffe922f;

    /* renamed from: videoCompositionDecoderTrack */
    private com.p314xaae8f345.tav.p2947x2eaf9f.C25688xd2468b56 f47265xec677736;

    /* renamed from: com.tencent.tav.core.AssetImageGenerator$1, reason: invalid class name */
    /* loaded from: classes10.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$com$tencent$tav$core$AssetImageGenerator$ApertureMode */
        static final /* synthetic */ int[] f47266xecc5f3b7;

        static {
            int[] iArr = new int[com.p314xaae8f345.tav.p2947x2eaf9f.C25658x29f502a8.ApertureMode.m96456xcee59d22().length];
            f47266xecc5f3b7 = iArr;
            try {
                iArr[com.p314xaae8f345.tav.p2947x2eaf9f.C25658x29f502a8.ApertureMode.aspectFit.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f47266xecc5f3b7[com.p314xaae8f345.tav.p2947x2eaf9f.C25658x29f502a8.ApertureMode.aspectFill.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f47266xecc5f3b7[com.p314xaae8f345.tav.p2947x2eaf9f.C25658x29f502a8.ApertureMode.scaleToFit.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: com.tencent.tav.core.AssetImageGenerator$ApertureMode */
    /* loaded from: classes10.dex */
    public enum ApertureMode {
        aspectFit,
        aspectFill,
        scaleToFit
    }

    /* renamed from: com.tencent.tav.core.AssetImageGenerator$AssetImageGeneratorResult */
    /* loaded from: classes6.dex */
    public enum AssetImageGeneratorResult {
        AssetImageGeneratorSucceeded,
        AssetImageGeneratorFailed,
        AssetImageGeneratorCancelled
    }

    /* renamed from: com.tencent.tav.core.AssetImageGenerator$DefaultBitmapFactory */
    /* loaded from: classes7.dex */
    public static class DefaultBitmapFactory implements com.p314xaae8f345.tav.p2947x2eaf9f.C25658x29f502a8.OutputBitmapFactory {

        /* renamed from: _hellAccFlag_ */
        private byte f47275x7f11beae;

        private DefaultBitmapFactory() {
        }

        public /* synthetic */ DefaultBitmapFactory(com.p314xaae8f345.tav.p2947x2eaf9f.C25658x29f502a8.AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.p314xaae8f345.tav.p2947x2eaf9f.C25658x29f502a8.OutputBitmapFactory
        /* renamed from: getOutputBitmap */
        public android.graphics.Bitmap mo96461x3b910406(int i17, int i18) {
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/tav/core/AssetImageGenerator$DefaultBitmapFactory", "getOutputBitmap", "(II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/tav/core/AssetImageGenerator$DefaultBitmapFactory", "getOutputBitmap", "(II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            return createBitmap;
        }
    }

    /* renamed from: com.tencent.tav.core.AssetImageGenerator$ImageGeneratorListener */
    /* loaded from: classes10.dex */
    public interface ImageGeneratorListener {
        /* renamed from: onCompletion */
        void mo96462xa6db431b(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, android.graphics.Bitmap bitmap, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a572, com.p314xaae8f345.tav.p2947x2eaf9f.C25658x29f502a8.AssetImageGeneratorResult assetImageGeneratorResult);
    }

    /* renamed from: com.tencent.tav.core.AssetImageGenerator$ImageGeneratorThread */
    /* loaded from: classes14.dex */
    public class ImageGeneratorThread extends android.os.HandlerThread implements android.os.Handler.Callback {

        /* renamed from: MSG_CREATE_RENDERCONTEXT */
        private static final int f47276x3435bb54 = 3;

        /* renamed from: MSG_GENERATOR_COVER */
        private static final int f47277x3bc1f62d = 1;

        /* renamed from: MSG_RELEASE */
        private static final int f47278x13f09509 = 2;

        /* renamed from: generatorListener */
        private com.p314xaae8f345.tav.p2947x2eaf9f.C25658x29f502a8.ImageGeneratorListener f47279xa5f40a7;

        /* renamed from: handler */
        private android.os.Handler f47280x294b574a;

        /* renamed from: requestedTimes */
        private java.util.List<com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57> f47281xbc6ff478;

        public ImageGeneratorThread(java.lang.String str) {
            super(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: generatorCover */
        public void m96466xc56894a4() {
            for (com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57 : this.f47281xbc6ff478) {
                android.os.Message obtain = android.os.Message.obtain();
                obtain.what = 1;
                obtain.obj = c25736x76b98a57;
                this.f47280x294b574a.sendMessage(obtain);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: initHandler */
        public void m96467x77f9b81a() {
            this.f47280x294b574a = new android.os.Handler(getLooper(), this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: release */
        public void m96468x41012807() {
            android.os.Message obtain = android.os.Message.obtain();
            obtain.what = 2;
            this.f47280x294b574a.sendMessage(obtain);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message message) {
            android.graphics.Bitmap bitmap;
            int i17 = message.what;
            if (i17 != 1) {
                if (i17 != 2) {
                    return false;
                }
                this.f47280x294b574a.removeCallbacksAndMessages(null);
                com.p314xaae8f345.tav.p2947x2eaf9f.C25658x29f502a8.this.m96433x999790fc();
                quit();
                return false;
            }
            try {
                bitmap = com.p314xaae8f345.tav.p2947x2eaf9f.C25658x29f502a8.this.m96440x99dd0b50((com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57) message.obj, null);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(com.p314xaae8f345.tav.p2947x2eaf9f.C25658x29f502a8.this.TAG, "copyCGImage", e17);
                bitmap = null;
            }
            com.p314xaae8f345.tav.p2947x2eaf9f.C25658x29f502a8.ImageGeneratorListener imageGeneratorListener = this.f47279xa5f40a7;
            if (imageGeneratorListener == null) {
                return false;
            }
            imageGeneratorListener.mo96462xa6db431b((com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57) message.obj, bitmap, null, bitmap != null ? com.p314xaae8f345.tav.p2947x2eaf9f.C25658x29f502a8.AssetImageGeneratorResult.AssetImageGeneratorSucceeded : com.p314xaae8f345.tav.p2947x2eaf9f.C25658x29f502a8.AssetImageGeneratorResult.AssetImageGeneratorFailed);
            return false;
        }

        @Override // android.os.HandlerThread
        public void onLooperPrepared() {
            super.onLooperPrepared();
        }

        /* renamed from: setGeneratorListener */
        public void m96469x3929d465(com.p314xaae8f345.tav.p2947x2eaf9f.C25658x29f502a8.ImageGeneratorListener imageGeneratorListener) {
            this.f47279xa5f40a7 = imageGeneratorListener;
        }

        /* renamed from: setRequestedTimes */
        public void m96470x72fe297a(java.util.List<com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57> list) {
            this.f47281xbc6ff478 = list;
        }
    }

    /* renamed from: com.tencent.tav.core.AssetImageGenerator$OutputBitmapFactory */
    /* loaded from: classes7.dex */
    public interface OutputBitmapFactory {
        /* renamed from: getOutputBitmap */
        android.graphics.Bitmap mo96461x3b910406(int i17, int i18);
    }

    public C25658x29f502a8(com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0 abstractC25633x3c9fad0) {
        this(abstractC25633x3c9fad0, new com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47247x9eebe4b9));
    }

    /* renamed from: bitmapFromFBO */
    private android.graphics.Bitmap m96431xd128a2fa(com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 c25779x3338e719, com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c14) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 m97194x3a00ef33 = c25734xcdff9c14.m97194x3a00ef33();
        if (m97194x3a00ef33 == null) {
            return null;
        }
        android.graphics.Bitmap m96438xb8da3a6c = m96438xb8da3a6c(c25779x3338e719, m97194x3a00ef33);
        android.graphics.Matrix m96435x24a4bab7 = m96435x24a4bab7(this.f47257x6478fa41, new com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85(m97194x3a00ef33.f47894x6be2dc6, m97194x3a00ef33.f47883xb7389127));
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postScale(1.0f, -1.0f);
        matrix.postTranslate(0.0f, m96438xb8da3a6c.getHeight());
        if (m96435x24a4bab7 != null) {
            m96435x24a4bab7.postConcat(matrix);
        } else {
            m96435x24a4bab7 = matrix;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85 = this.f47257x6478fa41;
        if (c25732x76648a85 == null) {
            c25732x76648a85 = new com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85(m97194x3a00ef33.f47894x6be2dc6, m97194x3a00ef33.f47883xb7389127);
        }
        int i17 = (int) c25732x76648a85.f47833x6be2dc6;
        int i18 = (int) c25732x76648a85.f47832xb7389127;
        zj0.a aVar = new zj0.a();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        aVar.c(java.lang.Boolean.TRUE);
        aVar.c(m96435x24a4bab7);
        aVar.c(java.lang.Integer.valueOf(i18));
        aVar.c(java.lang.Integer.valueOf(i17));
        aVar.c(0);
        aVar.c(0);
        aVar.c(m96438xb8da3a6c);
        java.lang.Object obj = new java.lang.Object();
        yj0.a.d(obj, aVar.b(), "com/tencent/tav/core/AssetImageGenerator", "bitmapFromFBO", "(Lcom/tencent/tav/decoder/RenderContext;Lcom/tencent/tav/coremedia/CMSampleBuffer;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
        yj0.a.e(obj, createBitmap, "com/tencent/tav/core/AssetImageGenerator", "bitmapFromFBO", "(Lcom/tencent/tav/decoder/RenderContext;Lcom/tencent/tav/coremedia/CMSampleBuffer;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        return createBitmap;
    }

    /* renamed from: doGenerator */
    private android.graphics.Bitmap m96432x9dba9a88(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 m96436x69103c09 = m96436x69103c09();
        com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m96434xc8b16d0a = m96434xc8b16d0a(c25736x76b98a57, m96436x69103c09);
        return !m96436x69103c09.m97633x51c2f969() ? m96431xd128a2fa(m96436x69103c09, m96434xc8b16d0a) : m96437xc4932e65(m96439xfc358db(m96436x69103c09, m96434xc8b16d0a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: doRelease */
    public void m96433x999790fc() {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(this.TAG, "doRelease: start, thread = " + java.lang.Thread.currentThread().getName());
        com.p314xaae8f345.tav.p2947x2eaf9f.C25688xd2468b56 c25688xd2468b56 = this.f47265xec677736;
        if (c25688xd2468b56 != null) {
            c25688xd2468b56.mo96661x41012807();
            this.f47265xec677736 = null;
        }
        com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25701x7dc2d629 interfaceC25701x7dc2d629 = this.f47263xaffe9209;
        if (interfaceC25701x7dc2d629 != null) {
            interfaceC25701x7dc2d629.mo96822x41012807();
            this.f47263xaffe9209 = null;
        }
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 c25779x3338e719 = this.f47261x399b739;
        if (c25779x3338e719 != null) {
            c25779x3338e719.mo97551x41012807();
            this.f47261x399b739 = null;
        }
        this.f47264xaffe922f = null;
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(this.TAG, "doRelease: end, thread = " + java.lang.Thread.currentThread().getName());
    }

    /* renamed from: getCmSampleBuffer */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m96434xc8b16d0a(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 c25779x3338e719) {
        if (this.f47265xec677736 == null) {
            this.f47265xec677736 = new com.p314xaae8f345.tav.p2947x2eaf9f.C25688xd2468b56(this.f47254xf1239f2f, 1);
            for (com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b c25634xf527485b : this.f47253x58ceaf0.mo96129x317d5b7e()) {
                if (c25634xf527485b.m96152x7f025288() == 1) {
                    this.f47265xec677736.m96803xb5bac52a(c25634xf527485b);
                }
            }
            this.f47265xec677736.m96811xfbd38eb1(this.f47264xaffe922f);
            com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f c25706x7dc2d64f = this.f47264xaffe922f;
            com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25701x7dc2d629 mo96924x35bb4175 = c25706x7dc2d64f == null ? null : c25706x7dc2d64f.mo96924x35bb4175();
            this.f47263xaffe9209 = mo96924x35bb4175;
            this.f47265xec677736.m96810xfbd38e8b(mo96924x35bb4175);
            this.f47265xec677736.mo96673x68ac462(c25779x3338e719);
        }
        this.f47265xec677736.mo96663xc9fc1b13(c25736x76b98a57, false, true);
        return this.f47265xec677736.mo96660xe121b2e0(c25736x76b98a57);
    }

    /* renamed from: getMatrix */
    private android.graphics.Matrix m96435x24a4bab7(com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85, com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a852) {
        if (c25732x76648a85 == null || c25732x76648a852 == null || this.f47251x7d4ec153 == null) {
            return null;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 c25731x76640468 = new com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468(new android.graphics.PointF(), c25732x76648a852);
        com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 c25731x766404682 = new com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468(new android.graphics.PointF(), c25732x76648a85);
        int i17 = com.p314xaae8f345.tav.p2947x2eaf9f.C25658x29f502a8.AnonymousClass1.f47266xecc5f3b7[this.f47251x7d4ec153.ordinal()];
        if (i17 == 1) {
            return com.p314xaae8f345.tav.p2947x2eaf9f.C25675xf530736f.m96711x30f85acf(c25731x76640468, c25731x766404682);
        }
        if (i17 == 2) {
            return com.p314xaae8f345.tav.p2947x2eaf9f.C25675xf530736f.m96710xee12fe85(c25731x76640468, c25731x766404682);
        }
        if (i17 != 3) {
            return null;
        }
        return com.p314xaae8f345.tav.p2947x2eaf9f.C25675xf530736f.m96709x8b91b16e(c25731x76640468, c25731x766404682);
    }

    /* renamed from: initRenderContext */
    private com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 m96436x69103c09() {
        this.f47256x11f838b8 = java.lang.Thread.currentThread().getId();
        if (this.f47261x399b739 == null) {
            com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85 = this.f47257x6478fa41;
            if (c25732x76648a85 == null) {
                c25732x76648a85 = this.f47253x58ceaf0.mo96120x47007694();
            }
            com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 c25779x3338e719 = new com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719((int) c25732x76648a85.f47833x6be2dc6, (int) c25732x76648a85.f47832xb7389127);
            this.f47261x399b739 = c25779x3338e719;
            c25779x3338e719.m97637x1cf75088(this.f47262x16878e1f);
        }
        this.f47261x399b739.m97634x900967ab();
        return this.f47261x399b739;
    }

    /* renamed from: readBitmap */
    private android.graphics.Bitmap m96437xc4932e65(com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85) {
        if (this.f47260x8d3d755a == null) {
            this.f47260x8d3d755a = new com.p314xaae8f345.tav.p2947x2eaf9f.C25658x29f502a8.DefaultBitmapFactory(null);
        }
        android.graphics.Bitmap mo96461x3b910406 = this.f47260x8d3d755a.mo96461x3b910406((int) c25732x76648a85.f47833x6be2dc6, (int) c25732x76648a85.f47832xb7389127);
        if (mo96461x3b910406.getConfig() != android.graphics.Bitmap.Config.ARGB_8888 && mo96461x3b910406.getConfig() != android.graphics.Bitmap.Config.ARGB_4444) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "readBitmap: bitmap 格式错误：暂时只支持ARGB_8888、ARGB_4444格式");
            return mo96461x3b910406;
        }
        int width = mo96461x3b910406.getWidth() * mo96461x3b910406.getHeight() * 4;
        java.nio.ByteBuffer byteBuffer = this.f47258x5ff565a0;
        if (byteBuffer == null || byteBuffer.capacity() < width) {
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(width);
            this.f47258x5ff565a0 = allocateDirect;
            allocateDirect.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            this.f47258x5ff565a0.rewind();
            this.f47258x5ff565a0.clear();
        }
        android.opengl.GLES20.glReadPixels(0, 0, mo96461x3b910406.getWidth(), mo96461x3b910406.getHeight(), com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, this.f47258x5ff565a0);
        this.f47258x5ff565a0.rewind();
        mo96461x3b910406.copyPixelsFromBuffer(this.f47258x5ff565a0);
        this.f47258x5ff565a0.clear();
        return mo96461x3b910406;
    }

    /* renamed from: readBitmapFromTexture */
    private android.graphics.Bitmap m96438xb8da3a6c(com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 c25779x3338e719, com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049) {
        c25779x3338e719.m97634x900967ab();
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenFramebuffers(1, iArr, 0);
        android.opengl.GLES20.glBindFramebuffer(36160, iArr[0]);
        android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, c25745xc3945049.f47890xc35d0376, 0);
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(c25745xc3945049.f47894x6be2dc6 * c25745xc3945049.f47883xb7389127 * 4);
        allocateDirect.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        allocateDirect.rewind();
        android.opengl.GLES20.glReadPixels(0, 0, c25745xc3945049.f47894x6be2dc6, c25745xc3945049.f47883xb7389127, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, allocateDirect);
        int i17 = c25745xc3945049.f47894x6be2dc6;
        int i18 = c25745xc3945049.f47883xb7389127;
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/tav/core/AssetImageGenerator", "readBitmapFromTexture", "(Lcom/tencent/tav/decoder/RenderContext;Lcom/tencent/tav/coremedia/TextureInfo;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/tav/core/AssetImageGenerator", "readBitmapFromTexture", "(Lcom/tencent/tav/decoder/RenderContext;Lcom/tencent/tav/coremedia/TextureInfo;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        allocateDirect.rewind();
        createBitmap.copyPixelsFromBuffer(allocateDirect);
        android.opengl.GLES20.glBindFramebuffer(36160, 0);
        android.opengl.GLES20.glDeleteFramebuffers(1, iArr, 0);
        return createBitmap;
    }

    /* renamed from: renderToMaximumSizeBox */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 m96439xfc358db(com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 c25779x3338e719, com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c14) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 m97194x3a00ef33 = c25734xcdff9c14.m97194x3a00ef33();
        com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85 = this.f47257x6478fa41;
        if (c25732x76648a85 == null) {
            c25732x76648a85 = new com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85(m97194x3a00ef33.f47894x6be2dc6, m97194x3a00ef33.f47883xb7389127);
        }
        if (m97194x3a00ef33 != null) {
            com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f c25706x7dc2d64f = this.f47264xaffe922f;
            com.p314xaae8f345.tav.p2959x5befac44.C25765x7d6db798 c25772xdc4495d2 = c25706x7dc2d64f != null && c25706x7dc2d64f.m96960x75267e64() != null && !this.f47264xaffe922f.m96960x75267e64().isRecycled() ? new com.p314xaae8f345.tav.p2959x5befac44.C25772xdc4495d2(this.f47264xaffe922f.m96960x75267e64()) : new com.p314xaae8f345.tav.p2959x5befac44.C25765x7d6db798();
            c25772xdc4495d2.mo97543x5e392181((int) c25732x76648a85.f47833x6be2dc6);
            c25772xdc4495d2.mo97542x4f1c14cc((int) c25732x76648a85.f47832xb7389127);
            android.graphics.Matrix m96435x24a4bab7 = m96435x24a4bab7(this.f47257x6478fa41, new com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85(m97194x3a00ef33.f47894x6be2dc6, m97194x3a00ef33.f47883xb7389127));
            c25779x3338e719.m97634x900967ab();
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f});
            int[] iArr = new int[4];
            android.opengl.GLES20.glGetIntegerv(2978, iArr, 0);
            android.opengl.GLES20.glViewport(0, 0, (int) c25732x76648a85.f47833x6be2dc6, (int) c25732x76648a85.f47832xb7389127);
            c25772xdc4495d2.mo97526x79f87086(m97194x3a00ef33, m96435x24a4bab7, matrix);
            c25772xdc4495d2.mo97539x41012807();
            c25779x3338e719.m97638xab5ea589(c25734xcdff9c14.m97195xfb85bb43().m97232x31040141());
            c25779x3338e719.m97641x82211f20();
            android.opengl.GLES20.glViewport(iArr[0], iArr[1], iArr[2], iArr[3]);
        }
        return c25732x76648a85;
    }

    /* renamed from: copyCGImageAtTimeAndActualTime */
    public android.graphics.Bitmap m96440x99dd0b50(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a572) {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            return m96432x9dba9a88(c25736x76b98a57);
        }
        throw new java.lang.Exception("cannot process in the main thread");
    }

    /* renamed from: generateCGImagesAsynchronouslyForTimes */
    public void m96441xa4de9cc3(java.util.List<com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57> list, com.p314xaae8f345.tav.p2947x2eaf9f.C25658x29f502a8.ImageGeneratorListener imageGeneratorListener) {
        this.f47255x447eabd.m96470x72fe297a(list);
        this.f47255x447eabd.m96469x3929d465(imageGeneratorListener);
        this.f47255x447eabd.m96466xc56894a4();
    }

    /* renamed from: getAssetExtension */
    public com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f m96442xdfbb6c25() {
        return this.f47254xf1239f2f;
    }

    /* renamed from: getRenderContextParams */
    public com.p314xaae8f345.tav.p2959x5befac44.C25780x613b55ff m96443x6eb76ae9() {
        return this.f47262x16878e1f;
    }

    /* renamed from: release */
    public void m96444x41012807() {
        if (java.lang.Thread.currentThread().getId() != this.f47256x11f838b8) {
            this.f47255x447eabd.m96468x41012807();
            this.f47264xaffe922f = null;
        } else {
            m96433x999790fc();
            this.f47255x447eabd.quit();
        }
    }

    /* renamed from: setApertureMode */
    public void m96445x148a4ed5(com.p314xaae8f345.tav.p2947x2eaf9f.C25658x29f502a8.ApertureMode apertureMode) {
        this.f47251x7d4ec153 = apertureMode;
    }

    /* renamed from: setAppliesPreferredTrackTransform */
    public void m96446x507dfc18(boolean z17) {
        this.f47252xa9a60b16 = z17;
    }

    /* renamed from: setMaximumSize */
    public void m96447xd4b4b47f(com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85) {
        this.f47257x6478fa41 = c25732x76648a85;
    }

    /* renamed from: setOutSavePath */
    public void m96448x5c4732ee(java.lang.String str) {
        this.f47259xec0b78b0 = str;
    }

    /* renamed from: setOutputBitmapFactory */
    public void m96449x33b21198(com.p314xaae8f345.tav.p2947x2eaf9f.C25658x29f502a8.OutputBitmapFactory outputBitmapFactory) {
        this.f47260x8d3d755a = outputBitmapFactory;
    }

    /* renamed from: setRenderContextParams */
    public void m96450xbcfc2a5d(com.p314xaae8f345.tav.p2959x5befac44.C25780x613b55ff c25780x613b55ff) {
        this.f47262x16878e1f = c25780x613b55ff;
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 c25779x3338e719 = this.f47261x399b739;
        if (c25779x3338e719 != null) {
            c25779x3338e719.m97637x1cf75088(c25780x613b55ff);
        }
    }

    /* renamed from: setVideoComposition */
    public void m96451xfbd38eb1(com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f c25706x7dc2d64f) {
        this.f47264xaffe922f = c25706x7dc2d64f;
    }

    public C25658x29f502a8(com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0 abstractC25633x3c9fad0, com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f c25657xb56a6b4f) {
        this.TAG = "AssetImageGenerator@" + java.lang.Integer.toHexString(hashCode());
        this.f47256x11f838b8 = -1L;
        this.f47253x58ceaf0 = abstractC25633x3c9fad0;
        this.f47254xf1239f2f = c25657xb56a6b4f;
        this.f47251x7d4ec153 = com.p314xaae8f345.tav.p2947x2eaf9f.C25658x29f502a8.ApertureMode.aspectFit;
        com.p314xaae8f345.tav.p2947x2eaf9f.C25658x29f502a8.ImageGeneratorThread imageGeneratorThread = new com.p314xaae8f345.tav.p2947x2eaf9f.C25658x29f502a8.ImageGeneratorThread("image_generator");
        this.f47255x447eabd = imageGeneratorThread;
        imageGeneratorThread.start();
        imageGeneratorThread.m96467x77f9b81a();
    }
}
