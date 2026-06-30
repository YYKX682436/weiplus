package com.tencent.mapsdk.engine.jni;

/* loaded from: classes13.dex */
public class JNICallback implements com.tencent.map.lib.JNIInterfaceCallback {
    private static final int CB_TYPE_CAL_TEXT_SIZE = 2;
    private static final int CB_TYPE_CANCEL_DOWNLOAD = 10;
    private static final int CB_TYPE_DECODE_IMG = 11;
    private static final int CB_TYPE_DOWNLOAD = 3;
    private static final int CB_TYPE_DRAW_TEXT = 1;
    private static final int CB_TYPE_INDOOR_BUILDING_CHANGED = 8;
    private static final int CB_TYPE_LOAD_RES = 4;
    private static final int CB_TYPE_NOTIFY_SET_CENTER_AND_SCALE_ANIM_FINISHED = 9;
    private static final int CB_TYPE_REPORT_ENGINE_CRASH_INFO = 7;
    private static final int CB_TYPE_UPDATE_MAP_PARAM = 6;
    private static final int CB_TYPE_WRITE_FILE = 5;
    private static final int IMG_TYPE_SAT = 1;
    private com.tencent.mapsdk.internal.os mCancelDownloadCallback;
    private com.tencent.mapsdk.internal.oy mCbkGetGLContext;
    private com.tencent.mapsdk.internal.ot mDownloadCallback;
    private final com.tencent.mapsdk.internal.bq mEngineCrashInfoRecorder;
    private com.tencent.mapsdk.internal.ox mIndoorBuildingChangeCallback;
    private final com.tencent.mapsdk.internal.pa mMapAnimCallback;
    private com.tencent.mapsdk.internal.oz mMapCameraChangeCallback;
    private final com.tencent.mapsdk.internal.pe mMapLayerClickResultCallback;
    private final com.tencent.mapsdk.internal.pb mMapLoadFinishedCallback;
    private com.tencent.mapsdk.internal.pd mMapParamChangeCallback;
    private com.tencent.mapsdk.internal.oo mRender;
    private com.tencent.mapsdk.internal.w mResources;
    private java.util.Hashtable<java.lang.Long, android.graphics.Paint> mTextPaints = new java.util.Hashtable<>();
    private java.util.Hashtable<java.lang.Long, android.graphics.PointF> mTextSizeBuffers = new java.util.Hashtable<>();
    private android.graphics.Bitmap textCanvas;
    private final com.tencent.mapsdk.internal.pc thisMapMarkerCollisionChangedCallback;

    /* loaded from: classes13.dex */
    public static final class a extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Void> {

        /* renamed from: a, reason: collision with root package name */
        private java.lang.String f48747a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f48748b;

        public a(java.lang.String str, byte[] bArr) {
            this.f48747a = str;
            this.f48748b = bArr;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
        
            if (r2 == null) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
        
            r2 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x003e, code lost:
        
            r2.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x003c, code lost:
        
            if (r2 == null) goto L23;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private java.lang.Void a() {
            /*
                r4 = this;
                java.io.File r0 = new java.io.File
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = r4.f48747a
                r1.append(r2)
                java.lang.String r2 = ".tmp"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                r1 = 0
                boolean r2 = r0.exists()     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L3b java.io.FileNotFoundException -> L42
                if (r2 != 0) goto L22
                com.tencent.mapsdk.internal.ks.a(r0)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L3b java.io.FileNotFoundException -> L42
            L22:
                java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L3b java.io.FileNotFoundException -> L42
                r2.<init>(r0)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L3b java.io.FileNotFoundException -> L42
                byte[] r3 = r4.f48748b     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L3c java.io.FileNotFoundException -> L43
                r2.write(r3)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L3c java.io.FileNotFoundException -> L43
                r2.close()     // Catch: java.io.IOException -> L2f
            L2f:
                r2 = 1
                goto L47
            L31:
                r0 = move-exception
                r1 = r2
                goto L35
            L34:
                r0 = move-exception
            L35:
                if (r1 == 0) goto L3a
                r1.close()     // Catch: java.io.IOException -> L3a
            L3a:
                throw r0
            L3b:
                r2 = r1
            L3c:
                if (r2 == 0) goto L46
            L3e:
                r2.close()     // Catch: java.io.IOException -> L46
                goto L46
            L42:
                r2 = r1
            L43:
                if (r2 == 0) goto L46
                goto L3e
            L46:
                r2 = 0
            L47:
                if (r2 == 0) goto L53
                java.io.File r2 = new java.io.File
                java.lang.String r3 = r4.f48747a
                r2.<init>(r3)
                r0.renameTo(r2)
            L53:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.engine.jni.JNICallback.a.a():java.lang.Void");
        }

        @Override // android.os.AsyncTask
        public final /* synthetic */ java.lang.Void doInBackground(java.lang.Void[] voidArr) {
            return a();
        }
    }

    public JNICallback(com.tencent.mapsdk.internal.oo ooVar, com.tencent.mapsdk.internal.w wVar, com.tencent.mapsdk.internal.ot otVar, com.tencent.mapsdk.internal.os osVar, com.tencent.mapsdk.internal.pb pbVar, com.tencent.mapsdk.internal.ox oxVar, com.tencent.mapsdk.internal.pa paVar, com.tencent.mapsdk.internal.bq bqVar, com.tencent.mapsdk.internal.pd pdVar, com.tencent.mapsdk.internal.oz ozVar, com.tencent.mapsdk.internal.pe peVar, com.tencent.mapsdk.internal.pc pcVar) {
        this.mRender = ooVar;
        this.mResources = wVar;
        this.mDownloadCallback = otVar;
        this.mCancelDownloadCallback = osVar;
        this.mMapLoadFinishedCallback = pbVar;
        this.mMapParamChangeCallback = pdVar;
        this.mIndoorBuildingChangeCallback = oxVar;
        this.mMapCameraChangeCallback = ozVar;
        this.mMapAnimCallback = paVar;
        this.mEngineCrashInfoRecorder = bqVar;
        this.mMapLayerClickResultCallback = peVar;
        this.thisMapMarkerCollisionChangedCallback = pcVar;
    }

    private void cacheTextPaint(android.graphics.Paint paint) {
        java.util.Hashtable<java.lang.Long, android.graphics.Paint> hashtable = this.mTextPaints;
        if (hashtable != null) {
            hashtable.put(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), paint);
        }
    }

    private void cacheTextSize(android.graphics.PointF pointF) {
        java.util.Hashtable<java.lang.Long, android.graphics.PointF> hashtable = this.mTextSizeBuffers;
        if (hashtable != null) {
            hashtable.put(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), pointF);
        }
    }

    private android.graphics.PointF calTextSize(java.lang.String str, int i17, byte[] bArr) {
        float measureText = initTextPaint(i17, (bArr == null || bArr.length < 4) ? 400 : com.tencent.mapsdk.internal.mt.a(bArr)).measureText(str) + 1.0f;
        int i18 = i17 + 8;
        android.graphics.PointF textSize = getTextSize();
        if (textSize == null) {
            textSize = new android.graphics.PointF();
            cacheTextSize(textSize);
        }
        textSize.x = measureText;
        textSize.y = i18;
        return textSize;
    }

    private void cancelDownload(java.lang.String str, com.tencent.mapsdk.internal.lt ltVar) {
        if (this.mCancelDownloadCallback != null) {
            com.tencent.mapsdk.core.utils.log.LogUtil.b("Engine callback cancel download:".concat(java.lang.String.valueOf(str)));
            this.mCancelDownloadCallback.a(str, ltVar);
        }
    }

    private com.tencent.mapsdk.engine.jni.models.IconImageInfo decodeImage(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        com.tencent.mapsdk.engine.jni.models.IconImageInfo iconImageInfo = new com.tencent.mapsdk.engine.jni.models.IconImageInfo();
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
        try {
            try {
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                options.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
                iconImageInfo.bitmap = android.graphics.BitmapFactory.decodeStream(byteArrayInputStream, null, options);
                iconImageInfo.scale = 1.0f;
            } catch (java.lang.OutOfMemoryError unused) {
                com.tencent.mapsdk.core.utils.log.LogUtil.c("Engine callback decodeImg: failed to decode stream.");
            }
            return iconImageInfo;
        } finally {
            com.tencent.mapsdk.internal.kt.a((java.io.Closeable) byteArrayInputStream);
        }
    }

    private void download(java.lang.String str, com.tencent.mapsdk.internal.lt ltVar) {
        if (this.mDownloadCallback != null) {
            com.tencent.mapsdk.core.utils.log.LogUtil.b("Engine callback download:" + str + ":" + ltVar);
            this.mDownloadCallback.b(str, ltVar);
        }
    }

    private android.graphics.Bitmap drawText(int i17, java.lang.String str, byte[] bArr) {
        com.tencent.mapsdk.engine.jni.models.TextBitmapInfo textBitmapInfo = new com.tencent.mapsdk.engine.jni.models.TextBitmapInfo();
        textBitmapInfo.fill(bArr);
        int i18 = textBitmapInfo.width;
        if (i18 == 0 || textBitmapInfo.height == 0) {
            return null;
        }
        int max = java.lang.Math.max(400, i18);
        int max2 = java.lang.Math.max(400, textBitmapInfo.height);
        android.graphics.Bitmap bitmap = this.textCanvas;
        if (bitmap == null || bitmap.isRecycled() || this.textCanvas.getWidth() < max || this.textCanvas.getHeight() < max2) {
            android.graphics.Bitmap bitmap2 = this.textCanvas;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                this.textCanvas.recycle();
            }
            this.textCanvas = android.graphics.Bitmap.createBitmap(max, max2, android.graphics.Bitmap.Config.ALPHA_8);
        }
        if (this.textCanvas == null) {
            return null;
        }
        android.graphics.Paint initTextPaint = initTextPaint(i17, textBitmapInfo.weight);
        this.textCanvas.eraseColor(0);
        new android.graphics.Canvas(this.textCanvas).drawText(str, this.textCanvas.getWidth() / 2.0f, (this.textCanvas.getHeight() / 2.0f) - ((initTextPaint.descent() + initTextPaint.ascent()) / 2.0f), initTextPaint);
        return this.textCanvas;
    }

    private android.graphics.Paint getTextPaint() {
        java.util.Hashtable<java.lang.Long, android.graphics.Paint> hashtable = this.mTextPaints;
        if (hashtable == null) {
            return null;
        }
        return hashtable.get(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
    }

    private android.graphics.PointF getTextSize() {
        java.util.Hashtable<java.lang.Long, android.graphics.PointF> hashtable = this.mTextSizeBuffers;
        if (hashtable == null) {
            return null;
        }
        return hashtable.get(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
    }

    private android.graphics.Paint initTextPaint(int i17, int i18) {
        int max = java.lang.Math.max(100, java.lang.Math.min(900, (int) (java.lang.Math.round(i18 / 100.0d) * 100)));
        android.graphics.Paint textPaint = getTextPaint();
        if (textPaint == null) {
            textPaint = new com.tencent.mapsdk.internal.na(this.mResources.f52454a);
            textPaint.setAntiAlias(true);
            textPaint.setStyle(android.graphics.Paint.Style.FILL);
            textPaint.setTextAlign(android.graphics.Paint.Align.CENTER);
            textPaint.setLinearText(true);
            cacheTextPaint(textPaint);
        }
        textPaint.setTextAlign(android.graphics.Paint.Align.CENTER);
        textPaint.setTextSize(i17);
        ((com.tencent.mapsdk.internal.na) textPaint).a(max);
        return textPaint;
    }

    private com.tencent.mapsdk.engine.jni.models.IconImageInfo loadImage(int i17, byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            try {
                java.lang.String str = new java.lang.String(bArr);
                if (i17 != 1) {
                    return this.mResources.a(str);
                }
                com.tencent.mapsdk.internal.w wVar = this.mResources;
                com.tencent.mapsdk.engine.jni.models.IconImageInfo iconImageInfo = new com.tencent.mapsdk.engine.jni.models.IconImageInfo();
                iconImageInfo.scale = wVar.f52456c;
                iconImageInfo.anchorPointX1 = 0.5f;
                iconImageInfo.anchorPointY1 = 0.5f;
                iconImageInfo.bitmap = wVar.a(str, android.graphics.Bitmap.Config.RGB_565);
                return iconImageInfo;
            } catch (java.lang.Exception unused) {
            }
        }
        return null;
    }

    private void writeFile(java.lang.String str, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        new com.tencent.mapsdk.engine.jni.JNICallback.a(str, bArr).execute(new java.lang.Void[0]);
    }

    @Override // com.tencent.map.lib.JNIInterfaceCallback
    public java.lang.Object callback(int i17, int i18, java.lang.String str, byte[] bArr, java.lang.Object obj) {
        com.tencent.mapsdk.engine.jni.JNIEvent jNIEvent = new com.tencent.mapsdk.engine.jni.JNIEvent();
        jNIEvent.f48749id = i18;
        jNIEvent.name = str;
        jNIEvent.data = bArr;
        jNIEvent.extra = obj;
        return callback(i17, jNIEvent);
    }

    @Override // com.tencent.map.lib.JNIInterfaceCallback
    public int callbackGetGLContext() {
        com.tencent.mapsdk.internal.oy oyVar = this.mCbkGetGLContext;
        if (oyVar != null) {
            return oyVar.getEGLContextHash();
        }
        return 0;
    }

    public void destory() {
        java.util.Hashtable<java.lang.Long, android.graphics.Paint> hashtable = this.mTextPaints;
        if (hashtable != null) {
            hashtable.clear();
            this.mTextPaints = null;
        }
        java.util.Hashtable<java.lang.Long, android.graphics.PointF> hashtable2 = this.mTextSizeBuffers;
        if (hashtable2 != null) {
            hashtable2.clear();
            this.mTextSizeBuffers = null;
        }
        this.mResources = null;
        this.mDownloadCallback = null;
        this.mCancelDownloadCallback = null;
        this.mMapParamChangeCallback = null;
        this.mIndoorBuildingChangeCallback = null;
        this.mMapCameraChangeCallback = null;
        this.mRender = null;
    }

    @Override // com.tencent.map.lib.JNIInterfaceCallback
    public boolean onJniCallbackRenderMapFrame(int i17) {
        com.tencent.mapsdk.internal.oo ooVar = this.mRender;
        if (ooVar != null) {
            return ooVar.a(i17);
        }
        return false;
    }

    @Override // com.tencent.map.lib.JNIInterfaceCallback
    public void onMapCameraChangeStopped() {
        com.tencent.mapsdk.internal.oz ozVar = this.mMapCameraChangeCallback;
        if (ozVar != null) {
            ozVar.k();
        }
    }

    @Override // com.tencent.map.lib.JNIInterfaceCallback
    public void onMapCameraChanged() {
        com.tencent.mapsdk.internal.oz ozVar = this.mMapCameraChangeCallback;
        if (ozVar != null) {
            ozVar.j();
        }
    }

    @Override // com.tencent.map.lib.JNIInterfaceCallback
    public void onMapLoaded() {
        com.tencent.mapsdk.internal.pb pbVar = this.mMapLoadFinishedCallback;
        if (pbVar != null) {
            pbVar.p_();
        }
    }

    @Override // com.tencent.map.lib.JNIInterfaceCallback
    public void onMarkerCollisionCallback(int[] iArr, int[] iArr2) {
        com.tencent.mapsdk.internal.pc pcVar = this.thisMapMarkerCollisionChangedCallback;
        if (pcVar != null) {
            pcVar.a(iArr, iArr2);
        }
    }

    @Override // com.tencent.map.lib.JNIInterfaceCallback
    public void onVisualLayerClickResult(float f17, float f18, long j17, java.lang.String str, java.lang.String str2) {
        com.tencent.mapsdk.internal.pe peVar = this.mMapLayerClickResultCallback;
        if (peVar != null) {
            peVar.a(f17, f18, j17, str, str2);
        }
    }

    public void setMapCallbackGetGLContext(com.tencent.mapsdk.internal.oy oyVar) {
        this.mCbkGetGLContext = oyVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public java.lang.Object callback(int i17, com.tencent.mapsdk.engine.jni.JNIEvent jNIEvent) {
        switch (i17) {
            case 1:
                return drawText(jNIEvent.f48749id, jNIEvent.name, jNIEvent.data);
            case 2:
                return calTextSize(jNIEvent.name, jNIEvent.f48749id, jNIEvent.data);
            case 3:
                if (!com.tencent.mapsdk.internal.hr.a(jNIEvent.name)) {
                    com.tencent.mapsdk.internal.lt ltVar = new com.tencent.mapsdk.internal.lt();
                    ltVar.f50374a = jNIEvent.f48749id;
                    java.lang.Object obj = jNIEvent.extra;
                    if (obj instanceof com.tencent.map.lib.models.MapTileID) {
                        com.tencent.map.lib.models.MapTileID mapTileID = (com.tencent.map.lib.models.MapTileID) obj;
                        ltVar.f50375b = mapTileID.getDataSource().getValue();
                        ltVar.f50376c = mapTileID.getPriority().getValue();
                    }
                    ltVar.f50377d = jNIEvent.extra;
                    download(jNIEvent.name, ltVar);
                }
                return null;
            case 4:
                com.tencent.mapsdk.engine.jni.models.IconImageInfo loadImage = loadImage(jNIEvent.f48749id, jNIEvent.data);
                byte[] bArr = jNIEvent.data;
                if (bArr == null) {
                    return loadImage;
                }
                new java.lang.String(bArr);
                return loadImage;
            case 5:
                com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50206g, "CB_TYPE_WRITE_FILE:" + jNIEvent.name);
                writeFile(jNIEvent.name, jNIEvent.data);
                return null;
            case 6:
                com.tencent.mapsdk.internal.pd pdVar = this.mMapParamChangeCallback;
                if (pdVar != null) {
                    pdVar.g();
                }
                return null;
            case 7:
                com.tencent.mapsdk.internal.bq bqVar = this.mEngineCrashInfoRecorder;
                if (bqVar != null) {
                    bqVar.a(jNIEvent.name);
                }
                return null;
            case 8:
                com.tencent.mapsdk.internal.ox oxVar = this.mIndoorBuildingChangeCallback;
                if (oxVar != null) {
                    oxVar.e();
                }
                return null;
            case 9:
                com.tencent.mapsdk.internal.pa paVar = this.mMapAnimCallback;
                if (paVar != null) {
                    paVar.b(jNIEvent.f48749id > 0);
                }
                return null;
            case 10:
                com.tencent.mapsdk.internal.lb.a("CB_TYPE_CANCEL_DOWNLOAD", jNIEvent);
                if (!com.tencent.mapsdk.internal.hr.a(jNIEvent.name)) {
                    com.tencent.mapsdk.internal.lt ltVar2 = new com.tencent.mapsdk.internal.lt();
                    ltVar2.f50374a = jNIEvent.f48749id;
                    java.lang.Object obj2 = jNIEvent.extra;
                    if (obj2 instanceof com.tencent.map.lib.models.MapTileID) {
                        com.tencent.map.lib.models.MapTileID mapTileID2 = (com.tencent.map.lib.models.MapTileID) obj2;
                        ltVar2.f50375b = mapTileID2.getDataSource().getValue();
                        ltVar2.f50376c = mapTileID2.getPriority().getValue();
                    }
                    ltVar2.f50377d = jNIEvent.extra;
                    cancelDownload(jNIEvent.name, ltVar2);
                }
                return null;
            case 11:
                com.tencent.mapsdk.internal.lb.a("CB_TYPE_DECODE_IMG", jNIEvent);
                return decodeImage(jNIEvent.data);
            default:
                return null;
        }
    }
}
