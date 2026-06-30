package com.p314xaae8f345.p519xbf8bc95e.p530xb297fa42.jni;

/* renamed from: com.tencent.mapsdk.engine.jni.JNICallback */
/* loaded from: classes13.dex */
public class C4386xb9964eea implements com.p314xaae8f345.map.lib.InterfaceC4230x101b2399 {

    /* renamed from: CB_TYPE_CAL_TEXT_SIZE */
    private static final int f17318xd7d3c1d = 2;

    /* renamed from: CB_TYPE_CANCEL_DOWNLOAD */
    private static final int f17319xe5ce6d88 = 10;

    /* renamed from: CB_TYPE_DECODE_IMG */
    private static final int f17320xa6d7d017 = 11;

    /* renamed from: CB_TYPE_DOWNLOAD */
    private static final int f17321xdd362c0d = 3;

    /* renamed from: CB_TYPE_DRAW_TEXT */
    private static final int f17322x85d37863 = 1;

    /* renamed from: CB_TYPE_INDOOR_BUILDING_CHANGED */
    private static final int f17323x20eefe50 = 8;

    /* renamed from: CB_TYPE_LOAD_RES */
    private static final int f17324xf630b92c = 4;

    /* renamed from: CB_TYPE_NOTIFY_SET_CENTER_AND_SCALE_ANIM_FINISHED */
    private static final int f17325x7c348587 = 9;

    /* renamed from: CB_TYPE_REPORT_ENGINE_CRASH_INFO */
    private static final int f17326x8b5ca7bd = 7;

    /* renamed from: CB_TYPE_UPDATE_MAP_PARAM */
    private static final int f17327xd8946e39 = 6;

    /* renamed from: CB_TYPE_WRITE_FILE */
    private static final int f17328xcaa2ec41 = 5;

    /* renamed from: IMG_TYPE_SAT */
    private static final int f17329xc69f465d = 1;

    /* renamed from: mCancelDownloadCallback */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.os f17330xd5417054;

    /* renamed from: mCbkGetGLContext */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oy f17331xdabdbc53;

    /* renamed from: mDownloadCallback */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ot f17332xf5dc0f7a;

    /* renamed from: mEngineCrashInfoRecorder */
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bq f17333xafaad784;

    /* renamed from: mIndoorBuildingChangeCallback */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ox f17334xd4d4d29;

    /* renamed from: mMapAnimCallback */
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pa f17335x3bafa4c5;

    /* renamed from: mMapCameraChangeCallback */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oz f17336x534dd2e9;

    /* renamed from: mMapLayerClickResultCallback */
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pe f17337xbc4e4ae8;

    /* renamed from: mMapLoadFinishedCallback */
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pb f17338xa8a6702c;

    /* renamed from: mMapParamChangeCallback */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pd f17339x39f34bd3;

    /* renamed from: mRender */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oo f17340x17b76863;

    /* renamed from: mResources */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.w f17341x4840838;

    /* renamed from: mTextPaints */
    private java.util.Hashtable<java.lang.Long, android.graphics.Paint> f17342x4464e7af = new java.util.Hashtable<>();

    /* renamed from: mTextSizeBuffers */
    private java.util.Hashtable<java.lang.Long, android.graphics.PointF> f17343x7b0d5d58 = new java.util.Hashtable<>();

    /* renamed from: textCanvas */
    private android.graphics.Bitmap f17344x520650e5;

    /* renamed from: thisMapMarkerCollisionChangedCallback */
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pc f17345x4318695f;

    /* renamed from: com.tencent.mapsdk.engine.jni.JNICallback$a */
    /* loaded from: classes13.dex */
    public static final class a extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Void> {

        /* renamed from: a, reason: collision with root package name */
        private java.lang.String f130280a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f130281b;

        public a(java.lang.String str, byte[] bArr) {
            this.f130280a = str;
            this.f130281b = bArr;
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
                java.lang.String r2 = r4.f130280a
                r1.append(r2)
                java.lang.String r2 = ".tmp"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                r1 = 0
                boolean r2 = r0.exists()     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L3b java.io.FileNotFoundException -> L42
                if (r2 != 0) goto L22
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(r0)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L3b java.io.FileNotFoundException -> L42
            L22:
                java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L3b java.io.FileNotFoundException -> L42
                r2.<init>(r0)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L3b java.io.FileNotFoundException -> L42
                byte[] r3 = r4.f130281b     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L3c java.io.FileNotFoundException -> L43
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
                java.lang.String r3 = r4.f130280a
                r2.<init>(r3)
                r0.renameTo(r2)
            L53:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p519xbf8bc95e.p530xb297fa42.jni.C4386xb9964eea.a.a():java.lang.Void");
        }

        @Override // android.os.AsyncTask
        public final /* synthetic */ java.lang.Void doInBackground(java.lang.Void[] voidArr) {
            return a();
        }
    }

    public C4386xb9964eea(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oo ooVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.w wVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ot otVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.os osVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pb pbVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ox oxVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pa paVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bq bqVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pd pdVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oz ozVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pe peVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pc pcVar) {
        this.f17340x17b76863 = ooVar;
        this.f17341x4840838 = wVar;
        this.f17332xf5dc0f7a = otVar;
        this.f17330xd5417054 = osVar;
        this.f17338xa8a6702c = pbVar;
        this.f17339x39f34bd3 = pdVar;
        this.f17334xd4d4d29 = oxVar;
        this.f17336x534dd2e9 = ozVar;
        this.f17335x3bafa4c5 = paVar;
        this.f17333xafaad784 = bqVar;
        this.f17337xbc4e4ae8 = peVar;
        this.f17345x4318695f = pcVar;
    }

    /* renamed from: cacheTextPaint */
    private void m36362xc8bdb9cf(android.graphics.Paint paint) {
        java.util.Hashtable<java.lang.Long, android.graphics.Paint> hashtable = this.f17342x4464e7af;
        if (hashtable != null) {
            hashtable.put(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), paint);
        }
    }

    /* renamed from: cacheTextSize */
    private void m36363x4049ac70(android.graphics.PointF pointF) {
        java.util.Hashtable<java.lang.Long, android.graphics.PointF> hashtable = this.f17343x7b0d5d58;
        if (hashtable != null) {
            hashtable.put(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), pointF);
        }
    }

    /* renamed from: calTextSize */
    private android.graphics.PointF m36364x792b70bc(java.lang.String str, int i17, byte[] bArr) {
        float measureText = m36371x1de56401(i17, (bArr == null || bArr.length < 4) ? 400 : com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mt.a(bArr)).measureText(str) + 1.0f;
        int i18 = i17 + 8;
        android.graphics.PointF m36370x40077844 = m36370x40077844();
        if (m36370x40077844 == null) {
            m36370x40077844 = new android.graphics.PointF();
            m36363x4049ac70(m36370x40077844);
        }
        m36370x40077844.x = measureText;
        m36370x40077844.y = i18;
        return m36370x40077844;
    }

    /* renamed from: cancelDownload */
    private void m36365xe1fe4122(java.lang.String str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lt ltVar) {
        if (this.f17330xd5417054 != null) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b("Engine callback cancel download:".concat(java.lang.String.valueOf(str)));
            this.f17330xd5417054.a(str, ltVar);
        }
    }

    /* renamed from: decodeImage */
    private com.p314xaae8f345.p519xbf8bc95e.p530xb297fa42.jni.p531xc04b6a6a.C4388xc6dd6810 m36366x45e92c0d(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        com.p314xaae8f345.p519xbf8bc95e.p530xb297fa42.jni.p531xc04b6a6a.C4388xc6dd6810 c4388xc6dd6810 = new com.p314xaae8f345.p519xbf8bc95e.p530xb297fa42.jni.p531xc04b6a6a.C4388xc6dd6810();
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
        try {
            try {
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                options.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
                c4388xc6dd6810.f17351xad38f12f = android.graphics.BitmapFactory.decodeStream(byteArrayInputStream, null, options);
                c4388xc6dd6810.f17352x683094a = 1.0f;
            } catch (java.lang.OutOfMemoryError unused) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c("Engine callback decodeImg: failed to decode stream.");
            }
            return c4388xc6dd6810;
        } finally {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a((java.io.Closeable) byteArrayInputStream);
        }
    }

    /* renamed from: download */
    private void m36367x551ac888(java.lang.String str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lt ltVar) {
        if (this.f17332xf5dc0f7a != null) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b("Engine callback download:" + str + ":" + ltVar);
            this.f17332xf5dc0f7a.b(str, ltVar);
        }
    }

    /* renamed from: drawText */
    private android.graphics.Bitmap m36368xceb6a491(int i17, java.lang.String str, byte[] bArr) {
        com.p314xaae8f345.p519xbf8bc95e.p530xb297fa42.jni.p531xc04b6a6a.C4390x5841b3aa c4390x5841b3aa = new com.p314xaae8f345.p519xbf8bc95e.p530xb297fa42.jni.p531xc04b6a6a.C4390x5841b3aa();
        c4390x5841b3aa.m36380x2ff583(bArr);
        int i18 = c4390x5841b3aa.f17382x6be2dc6;
        if (i18 == 0 || c4390x5841b3aa.f17378xb7389127 == 0) {
            return null;
        }
        int max = java.lang.Math.max(400, i18);
        int max2 = java.lang.Math.max(400, c4390x5841b3aa.f17378xb7389127);
        android.graphics.Bitmap bitmap = this.f17344x520650e5;
        if (bitmap == null || bitmap.isRecycled() || this.f17344x520650e5.getWidth() < max || this.f17344x520650e5.getHeight() < max2) {
            android.graphics.Bitmap bitmap2 = this.f17344x520650e5;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                this.f17344x520650e5.recycle();
            }
            this.f17344x520650e5 = android.graphics.Bitmap.createBitmap(max, max2, android.graphics.Bitmap.Config.ALPHA_8);
        }
        if (this.f17344x520650e5 == null) {
            return null;
        }
        android.graphics.Paint m36371x1de56401 = m36371x1de56401(i17, c4390x5841b3aa.f17381xd0d14278);
        this.f17344x520650e5.eraseColor(0);
        new android.graphics.Canvas(this.f17344x520650e5).drawText(str, this.f17344x520650e5.getWidth() / 2.0f, (this.f17344x520650e5.getHeight() / 2.0f) - ((m36371x1de56401.descent() + m36371x1de56401.ascent()) / 2.0f), m36371x1de56401);
        return this.f17344x520650e5;
    }

    /* renamed from: getTextPaint */
    private android.graphics.Paint m36369xc0b9687b() {
        java.util.Hashtable<java.lang.Long, android.graphics.Paint> hashtable = this.f17342x4464e7af;
        if (hashtable == null) {
            return null;
        }
        return hashtable.get(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
    }

    /* renamed from: getTextSize */
    private android.graphics.PointF m36370x40077844() {
        java.util.Hashtable<java.lang.Long, android.graphics.PointF> hashtable = this.f17343x7b0d5d58;
        if (hashtable == null) {
            return null;
        }
        return hashtable.get(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
    }

    /* renamed from: initTextPaint */
    private android.graphics.Paint m36371x1de56401(int i17, int i18) {
        int max = java.lang.Math.max(100, java.lang.Math.min(900, (int) (java.lang.Math.round(i18 / 100.0d) * 100)));
        android.graphics.Paint m36369xc0b9687b = m36369xc0b9687b();
        if (m36369xc0b9687b == null) {
            m36369xc0b9687b = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.na(this.f17341x4840838.f133987a);
            m36369xc0b9687b.setAntiAlias(true);
            m36369xc0b9687b.setStyle(android.graphics.Paint.Style.FILL);
            m36369xc0b9687b.setTextAlign(android.graphics.Paint.Align.CENTER);
            m36369xc0b9687b.setLinearText(true);
            m36362xc8bdb9cf(m36369xc0b9687b);
        }
        m36369xc0b9687b.setTextAlign(android.graphics.Paint.Align.CENTER);
        m36369xc0b9687b.setTextSize(i17);
        ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.na) m36369xc0b9687b).a(max);
        return m36369xc0b9687b;
    }

    /* renamed from: loadImage */
    private com.p314xaae8f345.p519xbf8bc95e.p530xb297fa42.jni.p531xc04b6a6a.C4388xc6dd6810 m36372x519a1415(int i17, byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            try {
                java.lang.String str = new java.lang.String(bArr);
                if (i17 != 1) {
                    return this.f17341x4840838.a(str);
                }
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.w wVar = this.f17341x4840838;
                com.p314xaae8f345.p519xbf8bc95e.p530xb297fa42.jni.p531xc04b6a6a.C4388xc6dd6810 c4388xc6dd6810 = new com.p314xaae8f345.p519xbf8bc95e.p530xb297fa42.jni.p531xc04b6a6a.C4388xc6dd6810();
                c4388xc6dd6810.f17352x683094a = wVar.f133989c;
                c4388xc6dd6810.f17349x578b8bf4 = 0.5f;
                c4388xc6dd6810.f17350x578b8c13 = 0.5f;
                c4388xc6dd6810.f17351xad38f12f = wVar.a(str, android.graphics.Bitmap.Config.RGB_565);
                return c4388xc6dd6810;
            } catch (java.lang.Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: writeFile */
    private void m36373xac26b9fb(java.lang.String str, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        new com.p314xaae8f345.p519xbf8bc95e.p530xb297fa42.jni.C4386xb9964eea.a(str, bArr).execute(new java.lang.Void[0]);
    }

    @Override // com.p314xaae8f345.map.lib.InterfaceC4230x101b2399
    /* renamed from: callback */
    public java.lang.Object mo35011xf5bc2045(int i17, int i18, java.lang.String str, byte[] bArr, java.lang.Object obj) {
        com.p314xaae8f345.p519xbf8bc95e.p530xb297fa42.jni.C4387xa5d24e15 c4387xa5d24e15 = new com.p314xaae8f345.p519xbf8bc95e.p530xb297fa42.jni.C4387xa5d24e15();
        c4387xa5d24e15.f130282id = i18;
        c4387xa5d24e15.f17348x337a8b = str;
        c4387xa5d24e15.f17346x2eefaa = bArr;
        c4387xa5d24e15.f17347x5c79410 = obj;
        return m36374xf5bc2045(i17, c4387xa5d24e15);
    }

    @Override // com.p314xaae8f345.map.lib.InterfaceC4230x101b2399
    /* renamed from: callbackGetGLContext */
    public int mo35012x9676f59() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oy oyVar = this.f17331xdabdbc53;
        if (oyVar != null) {
            return oyVar.mo36527xd76ee1e9();
        }
        return 0;
    }

    /* renamed from: destory */
    public void m36375x5cd39514() {
        java.util.Hashtable<java.lang.Long, android.graphics.Paint> hashtable = this.f17342x4464e7af;
        if (hashtable != null) {
            hashtable.clear();
            this.f17342x4464e7af = null;
        }
        java.util.Hashtable<java.lang.Long, android.graphics.PointF> hashtable2 = this.f17343x7b0d5d58;
        if (hashtable2 != null) {
            hashtable2.clear();
            this.f17343x7b0d5d58 = null;
        }
        this.f17341x4840838 = null;
        this.f17332xf5dc0f7a = null;
        this.f17330xd5417054 = null;
        this.f17339x39f34bd3 = null;
        this.f17334xd4d4d29 = null;
        this.f17336x534dd2e9 = null;
        this.f17340x17b76863 = null;
    }

    @Override // com.p314xaae8f345.map.lib.InterfaceC4230x101b2399
    /* renamed from: onJniCallbackRenderMapFrame */
    public boolean mo35223x2f175b2(int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oo ooVar = this.f17340x17b76863;
        if (ooVar != null) {
            return ooVar.a(i17);
        }
        return false;
    }

    @Override // com.p314xaae8f345.map.lib.InterfaceC4230x101b2399
    /* renamed from: onMapCameraChangeStopped */
    public void mo35224x7c69869b() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oz ozVar = this.f17336x534dd2e9;
        if (ozVar != null) {
            ozVar.k();
        }
    }

    @Override // com.p314xaae8f345.map.lib.InterfaceC4230x101b2399
    /* renamed from: onMapCameraChanged */
    public void mo35225xa94d27d2() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oz ozVar = this.f17336x534dd2e9;
        if (ozVar != null) {
            ozVar.j();
        }
    }

    @Override // com.p314xaae8f345.map.lib.InterfaceC4230x101b2399
    /* renamed from: onMapLoaded */
    public void mo35226x28538962() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pb pbVar = this.f17338xa8a6702c;
        if (pbVar != null) {
            pbVar.p_();
        }
    }

    @Override // com.p314xaae8f345.map.lib.InterfaceC4230x101b2399
    /* renamed from: onMarkerCollisionCallback */
    public void mo35227xf297f9e(int[] iArr, int[] iArr2) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pc pcVar = this.f17345x4318695f;
        if (pcVar != null) {
            pcVar.a(iArr, iArr2);
        }
    }

    @Override // com.p314xaae8f345.map.lib.InterfaceC4230x101b2399
    /* renamed from: onVisualLayerClickResult */
    public void mo35228xe24fdd3(float f17, float f18, long j17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pe peVar = this.f17337xbc4e4ae8;
        if (peVar != null) {
            peVar.a(f17, f18, j17, str, str2);
        }
    }

    /* renamed from: setMapCallbackGetGLContext */
    public void m36376xe125013(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oy oyVar) {
        this.f17331xdabdbc53 = oyVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: callback */
    public java.lang.Object m36374xf5bc2045(int i17, com.p314xaae8f345.p519xbf8bc95e.p530xb297fa42.jni.C4387xa5d24e15 c4387xa5d24e15) {
        switch (i17) {
            case 1:
                return m36368xceb6a491(c4387xa5d24e15.f130282id, c4387xa5d24e15.f17348x337a8b, c4387xa5d24e15.f17346x2eefaa);
            case 2:
                return m36364x792b70bc(c4387xa5d24e15.f17348x337a8b, c4387xa5d24e15.f130282id, c4387xa5d24e15.f17346x2eefaa);
            case 3:
                if (!com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(c4387xa5d24e15.f17348x337a8b)) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lt ltVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lt();
                    ltVar.f131907a = c4387xa5d24e15.f130282id;
                    java.lang.Object obj = c4387xa5d24e15.f17347x5c79410;
                    if (obj instanceof com.p314xaae8f345.map.lib.p496xc04b6a6a.C4253xaef2a4a5) {
                        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4253xaef2a4a5 c4253xaef2a4a5 = (com.p314xaae8f345.map.lib.p496xc04b6a6a.C4253xaef2a4a5) obj;
                        ltVar.f131908b = c4253xaef2a4a5.m35383x3a19145b().m35284x754a37bb();
                        ltVar.f131909c = c4253xaef2a4a5.m35384x3662b71a().m35289x754a37bb();
                    }
                    ltVar.f131910d = c4387xa5d24e15.f17347x5c79410;
                    m36367x551ac888(c4387xa5d24e15.f17348x337a8b, ltVar);
                }
                return null;
            case 4:
                com.p314xaae8f345.p519xbf8bc95e.p530xb297fa42.jni.p531xc04b6a6a.C4388xc6dd6810 m36372x519a1415 = m36372x519a1415(c4387xa5d24e15.f130282id, c4387xa5d24e15.f17346x2eefaa);
                byte[] bArr = c4387xa5d24e15.f17346x2eefaa;
                if (bArr == null) {
                    return m36372x519a1415;
                }
                new java.lang.String(bArr);
                return m36372x519a1415;
            case 5:
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131739g, "CB_TYPE_WRITE_FILE:" + c4387xa5d24e15.f17348x337a8b);
                m36373xac26b9fb(c4387xa5d24e15.f17348x337a8b, c4387xa5d24e15.f17346x2eefaa);
                return null;
            case 6:
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pd pdVar = this.f17339x39f34bd3;
                if (pdVar != null) {
                    pdVar.g();
                }
                return null;
            case 7:
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bq bqVar = this.f17333xafaad784;
                if (bqVar != null) {
                    bqVar.a(c4387xa5d24e15.f17348x337a8b);
                }
                return null;
            case 8:
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ox oxVar = this.f17334xd4d4d29;
                if (oxVar != null) {
                    oxVar.e();
                }
                return null;
            case 9:
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pa paVar = this.f17335x3bafa4c5;
                if (paVar != null) {
                    paVar.b(c4387xa5d24e15.f130282id > 0);
                }
                return null;
            case 10:
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a("CB_TYPE_CANCEL_DOWNLOAD", c4387xa5d24e15);
                if (!com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(c4387xa5d24e15.f17348x337a8b)) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lt ltVar2 = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lt();
                    ltVar2.f131907a = c4387xa5d24e15.f130282id;
                    java.lang.Object obj2 = c4387xa5d24e15.f17347x5c79410;
                    if (obj2 instanceof com.p314xaae8f345.map.lib.p496xc04b6a6a.C4253xaef2a4a5) {
                        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4253xaef2a4a5 c4253xaef2a4a52 = (com.p314xaae8f345.map.lib.p496xc04b6a6a.C4253xaef2a4a5) obj2;
                        ltVar2.f131908b = c4253xaef2a4a52.m35383x3a19145b().m35284x754a37bb();
                        ltVar2.f131909c = c4253xaef2a4a52.m35384x3662b71a().m35289x754a37bb();
                    }
                    ltVar2.f131910d = c4387xa5d24e15.f17347x5c79410;
                    m36365xe1fe4122(c4387xa5d24e15.f17348x337a8b, ltVar2);
                }
                return null;
            case 11:
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a("CB_TYPE_DECODE_IMG", c4387xa5d24e15);
                return m36366x45e92c0d(c4387xa5d24e15.f17346x2eefaa);
            default:
                return null;
        }
    }
}
