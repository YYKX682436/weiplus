package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class n0 extends android.widget.RelativeLayout implements com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d, xq4.d {

    /* renamed from: d, reason: collision with root package name */
    public int f95951d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f95952e;

    /* renamed from: f, reason: collision with root package name */
    public int f95953f;

    /* renamed from: g, reason: collision with root package name */
    public int f95954g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.cloudvoip.cloudvoice.service.r f95955h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.voip.video.camera.prev.CaptureView f95956i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.voip.video.OpenGlRender f95957m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.voip.video.OpenGlView f95958n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f95959o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f95960p;

    /* renamed from: q, reason: collision with root package name */
    public int f95961q;

    /* renamed from: r, reason: collision with root package name */
    public int f95962r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c f95963s;

    public n0(android.content.Context context, fw1.d dVar, int i17, int i18) {
        super(context);
        this.f95951d = 0;
        this.f95952e = "";
        this.f95953f = -1;
        this.f95954g = 0;
        this.f95955h = null;
        this.f95960p = false;
        this.f95961q = 0;
        this.f95962r = 0;
        this.f95963s = null;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceOpenGlView", "anlin OpenVoiceOpenGlView: mWidth: " + i17 + ", height: " + i18);
        this.f95955h = new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.r(i17, i18);
        this.f95953f = dVar.f267069a;
        this.f95952e = dVar.f267070b;
        com.tencent.mm.plugin.voip.video.OpenGlView openGlView = new com.tencent.mm.plugin.voip.video.OpenGlView(context);
        this.f95958n = openGlView;
        com.tencent.mm.plugin.voip.video.OpenGlRender openGlRender = new com.tencent.mm.plugin.voip.video.OpenGlRender(openGlView, null, 0);
        this.f95957m = openGlRender;
        this.f95959o = true;
        openGlView.setRenderer(openGlRender);
        openGlView.setRenderMode(0);
        addView(openGlView);
        com.tencent.mm.plugin.voip.video.camera.prev.CaptureView captureView = new com.tencent.mm.plugin.voip.video.camera.prev.CaptureView(context);
        this.f95956i = captureView;
        addView(captureView, new android.widget.RelativeLayout.LayoutParams(1, 1));
        captureView.setVisibility(0);
        captureView.setAlpha(0.0f);
    }

    public float[] a(org.json.JSONObject jSONObject) {
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(jSONObject.optString("position"));
            float h17 = ik1.w.h(jSONObject2, "left", 0.0f);
            float h18 = ik1.w.h(jSONObject2, "top", 0.0f);
            float h19 = ik1.w.h(jSONObject2, "width", 0.0f);
            float h27 = ik1.w.h(jSONObject2, "height", 0.0f);
            int optInt = jSONObject.optInt("zIndex", 0);
            try {
                this.f95961q = (int) jSONObject2.optDouble("width", 0.0d);
                this.f95962r = (int) jSONObject2.optDouble("height", 0.0d);
            } catch (java.lang.Exception unused) {
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceOpenGlView", "w:%f, h:%f, logicWidth:%d, logicHeight:%d", java.lang.Float.valueOf(h19), java.lang.Float.valueOf(h27), java.lang.Integer.valueOf(this.f95961q), java.lang.Integer.valueOf(this.f95962r));
            return new float[]{h17, h18, h19, h27, optInt};
        } catch (java.lang.Exception unused2) {
            return null;
        }
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public void d(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceOpenGlView", "enter full screen to direction %s", java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c cVar = this.f95963s;
        if (cVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.OpenVoiceOpenGlView", "enter full screen: full screen delegate is null");
        } else {
            cVar.d(i17);
        }
    }

    @Override // xq4.d
    public void e(int i17) {
        if (android.provider.Settings.System.getInt(getContext().getContentResolver(), "accelerometer_rotation", 0) != 0) {
            fw1.i.a(i17, this.f95955h.f464560d);
        }
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public void exitFullScreen() {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceOpenGlView", "exit full screen");
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c cVar = this.f95963s;
        if (cVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.OpenVoiceOpenGlView", "exit full screen: full screen delegate is null");
        } else {
            cVar.exitFullScreen();
        }
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public void f(int i17) {
        if (i17 == this.f95953f) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceOpenGlView", "updateMemberId, viewId:" + this.f95951d + ", openId:" + this.f95952e + ", memberId:[" + this.f95953f + "->" + i17 + "]");
        this.f95953f = i17;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public int getLogicHeight() {
        int i17 = this.f95962r;
        return i17 > 0 ? i17 : ik1.w.d(getHeight());
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public int getLogicWidth() {
        int i17 = this.f95961q;
        return i17 > 0 ? i17 : ik1.w.d(getWidth());
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public int getMemberId() {
        return this.f95953f;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public java.lang.String getOpenId() {
        return this.f95952e;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public int getViewId() {
        return this.f95951d;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public void h() {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceOpenGlView", "uint, viewId:" + this.f95951d + ", openId:" + this.f95952e + ", memberId:" + this.f95953f);
        this.f95955h.i();
        this.f95955h.getClass();
        com.tencent.mm.plugin.voip.video.OpenGlRender openGlRender = this.f95957m;
        java.lang.ref.WeakReference weakReference = openGlRender.f177057e;
        if (weakReference != null && weakReference.get() != null) {
            com.tencent.mm.plugin.voip.video.OpenGlView openGlView = (com.tencent.mm.plugin.voip.video.OpenGlView) openGlRender.f177057e.get();
            com.tencent.mm.sdk.platformtools.Log.c("OpenGlRender", "releaseSurfaceTexture:%s", openGlView);
            openGlView.b(new wq4.s(openGlRender));
            java.lang.Object obj = com.tencent.mm.plugin.voip.video.OpenGlRender.D;
            synchronized (obj) {
                try {
                    obj.wait(100L);
                    com.tencent.mars.xlog.Log.i("OpenGlRender", "releaseSurfaceTexture wait finish");
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("OpenGlRender", e17, "", new java.lang.Object[0]);
                }
            }
        }
        com.tencent.mm.plugin.voip.video.OpenGlRender openGlRender2 = this.f95957m;
        com.tencent.mars.xlog.Log.i("OpenGlRender", "%s onStop, renderMode: %s", java.lang.Integer.valueOf(openGlRender2.hashCode()), java.lang.Integer.valueOf(openGlRender2.f177058f));
        openGlRender2.f177054b = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007a A[Catch: JSONException -> 0x00b6, TryCatch #1 {JSONException -> 0x00b6, blocks: (B:3:0x003a, B:5:0x0040, B:6:0x004f, B:8:0x0058, B:11:0x0076, B:13:0x007a, B:15:0x0087, B:20:0x008c, B:22:0x0090, B:26:0x0095, B:28:0x009e, B:30:0x00a6, B:32:0x00ae), top: B:2:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(org.json.JSONObject r9) {
        /*
            r8 = this;
            java.lang.String r0 = "back"
            java.lang.String r1 = "camera:"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "update, viewId:"
            r2.<init>(r3)
            int r3 = r8.f95951d
            r2.append(r3)
            java.lang.String r3 = ", openId:"
            r2.append(r3)
            java.lang.String r3 = r8.f95952e
            r2.append(r3)
            java.lang.String r3 = ", memberId:"
            r2.append(r3)
            int r3 = r8.f95953f
            r2.append(r3)
            java.lang.String r3 = ", data:"
            r2.append(r3)
            java.lang.String r3 = r9.toString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MicroMsg.OpenVoice.OpenVoiceOpenGlView"
            com.tencent.mars.xlog.Log.i(r3, r2)
            float[] r2 = r8.a(r9)     // Catch: org.json.JSONException -> Lb6
            if (r2 == 0) goto L4f
            com.tencent.mm.plugin.voip.video.OpenGlView r4 = r8.f95958n     // Catch: org.json.JSONException -> Lb6
            android.graphics.SurfaceTexture r5 = com.tencent.mm.plugin.voip.model.v2protocal.f176827n2     // Catch: org.json.JSONException -> Lb6
            r6 = 2
            r6 = r2[r6]     // Catch: org.json.JSONException -> Lb6
            int r6 = (int) r6     // Catch: org.json.JSONException -> Lb6
            r7 = 3
            r2 = r2[r7]     // Catch: org.json.JSONException -> Lb6
            int r2 = (int) r2     // Catch: org.json.JSONException -> Lb6
            r4.onSurfaceTextureSizeChanged(r5, r6, r2)     // Catch: org.json.JSONException -> Lb6
        L4f:
            java.lang.String r2 = "config"
            org.json.JSONObject r9 = r9.optJSONObject(r2)     // Catch: org.json.JSONException -> Lb6
            r2 = 1
            if (r9 == 0) goto L75
            java.lang.String r4 = "camera"
            java.lang.String r9 = r9.optString(r4, r0)     // Catch: org.json.JSONException -> Lb6
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> Lb6
            r4.<init>(r1)     // Catch: org.json.JSONException -> Lb6
            r4.append(r9)     // Catch: org.json.JSONException -> Lb6
            java.lang.String r1 = r4.toString()     // Catch: org.json.JSONException -> Lb6
            com.tencent.mars.xlog.Log.i(r3, r1)     // Catch: org.json.JSONException -> Lb6
            boolean r9 = r9.equals(r0)     // Catch: org.json.JSONException -> Lb6
            if (r9 == 0) goto L75
            r9 = 0
            goto L76
        L75:
            r9 = r2
        L76:
            boolean r0 = r8.f95960p     // Catch: org.json.JSONException -> Lb6
            if (r9 == r0) goto Lc1
            r8.f95960p = r9     // Catch: org.json.JSONException -> Lb6
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.r r9 = r8.f95955h     // Catch: org.json.JSONException -> Lb6
            r9.a()     // Catch: org.json.JSONException -> Lb6
            com.tencent.mm.plugin.voip.video.OpenGlRender r9 = r8.f95957m     // Catch: org.json.JSONException -> Lb6
            boolean r0 = r9.f177069q     // Catch: org.json.JSONException -> Lb6
            if (r0 == 0) goto Lc1
            p05.l4 r0 = r9.f177065m     // Catch: org.json.JSONException -> Lb6
            if (r0 != 0) goto L8c
            goto Lc1
        L8c:
            int r0 = r9.f177067o     // Catch: org.json.JSONException -> Lb6
            if (r0 == 0) goto Lc1
            int r0 = r9.f177068p     // Catch: org.json.JSONException -> Lb6
            if (r0 != 0) goto L95
            goto Lc1
        L95:
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch     // Catch: org.json.JSONException -> Lb6
            r0.<init>(r2)     // Catch: org.json.JSONException -> Lb6
            java.lang.ref.WeakReference r1 = r9.f177057e     // Catch: org.json.JSONException -> Lb6
            if (r1 == 0) goto Lae
            java.lang.Object r1 = r1.get()     // Catch: org.json.JSONException -> Lb6
            com.tencent.mm.plugin.voip.video.OpenGlView r1 = (com.tencent.mm.plugin.voip.video.OpenGlView) r1     // Catch: org.json.JSONException -> Lb6
            if (r1 == 0) goto Lae
            wq4.t r2 = new wq4.t     // Catch: org.json.JSONException -> Lb6
            r2.<init>(r9, r0)     // Catch: org.json.JSONException -> Lb6
            r1.b(r2)     // Catch: org.json.JSONException -> Lb6
        Lae:
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS     // Catch: org.json.JSONException -> Lb6 java.lang.InterruptedException -> Lc1
            r1 = 2
            r0.await(r1, r9)     // Catch: org.json.JSONException -> Lb6 java.lang.InterruptedException -> Lc1
            goto Lc1
        Lb6:
            r9 = move-exception
            java.lang.String r0 = "parse position error. Exception :%s"
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            com.tencent.mars.xlog.Log.e(r3, r0, r9)
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.n0.i(org.json.JSONObject):void");
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public void k(org.json.JSONObject jSONObject) {
        android.widget.RelativeLayout.LayoutParams layoutParams;
        this.f95951d = jSONObject.optInt("viewId");
        this.f95960p = true;
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("config");
        if (optJSONObject != null) {
            java.lang.String optString = optJSONObject.optString("camera", "back");
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceOpenGlView", "camera:" + optString);
            if (optString.equals("back")) {
                this.f95960p = false;
            }
        }
        boolean z17 = this.f95960p;
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.r rVar = this.f95955h;
        rVar.d(this, z17);
        com.tencent.mm.plugin.voip.video.camera.prev.CaptureView captureView = this.f95956i;
        if (captureView != null) {
            rVar.f464569p = captureView;
            captureView.setSurfaceChangeCallback(rVar);
            rVar.f464568o = true;
        }
        rVar.h();
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceOpenGlView", "init, viewId:" + this.f95951d + ", openId:" + this.f95952e + ", memberId:" + this.f95953f + ", data:" + jSONObject.toString());
        br4.e.b().f23721d = new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.m0(this);
        try {
            float[] a17 = a(jSONObject);
            if (a17 != null) {
                com.tencent.mm.plugin.voip.video.OpenGlView openGlView = this.f95958n;
                float f17 = a17[2];
                int i17 = (int) a17[3];
                openGlView.getClass();
                if (com.tencent.mm.ui.bk.w()) {
                    layoutParams = new android.widget.RelativeLayout.LayoutParams((i17 * 9) / 16, i17);
                    layoutParams.addRule(13);
                } else {
                    layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
                }
                openGlView.setLayoutParams(layoutParams);
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.OpenVoiceOpenGlView", "parse position error. Exception :%s", e17);
        }
        com.tencent.mm.plugin.voip.video.OpenGlRender openGlRender = this.f95957m;
        openGlRender.f177054b = true;
        openGlRender.g();
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public boolean n(int i17, int i18) {
        return this.f95955h.n(i17, i18);
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public void setFullScreenDelegate(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c cVar) {
        this.f95963s = cVar;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public boolean t() {
        return false;
    }

    @Override // xq4.d
    public void v(byte[] bArr, long j17, int i17, int i18, int i19, int i27, double d17) {
        boolean z17;
        int i28;
        int i29;
        com.tencent.mm.plugin.voip.video.OpenGlView openGlView;
        int i37 = this.f95954g;
        this.f95954g = i37 + 1;
        if (i37 % 50 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceOpenGlView", "onFrameDataReady, w:" + i17 + ",h:" + i18 + ",format:" + i19 + ",len:" + bArr.length + ",size:" + j17 + ",rotate:" + i27 + ",time:" + d17);
        }
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.y2 y2Var = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE.f96019h;
        synchronized (y2Var) {
            z17 = y2Var.f96142c;
        }
        if (z17) {
            int i38 = com.tencent.mm.plugin.voip.video.OpenGlRender.A;
            com.tencent.mm.plugin.voip.video.OpenGlRender openGlRender = this.f95957m;
            if (openGlRender.f177069q && openGlRender.f177065m != null && bArr.length >= i17 * i18) {
                java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
                openGlRender.f177066n = bArr;
                java.lang.ref.WeakReference weakReference = openGlRender.f177057e;
                if (weakReference != null && (openGlView = (com.tencent.mm.plugin.voip.video.OpenGlView) weakReference.get()) != null) {
                    openGlView.b(new wq4.u(openGlRender, i17, i18, 0, countDownLatch));
                }
                try {
                    countDownLatch.await(2L, java.util.concurrent.TimeUnit.SECONDS);
                } catch (java.lang.InterruptedException unused) {
                }
            }
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE;
            p0Var.getClass();
            p0Var.n(new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.y1(p0Var, i19 + i27, i17, i18, bArr));
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.r rVar = this.f95955h;
            if (rVar.f464560d) {
                int i39 = com.tencent.mm.plugin.voip.video.OpenGlRender.A;
                i28 = 16;
            } else {
                i28 = 0;
            }
            if (rVar.f464561e) {
                int i47 = com.tencent.mm.plugin.voip.video.OpenGlRender.A;
                i29 = 12;
            } else {
                int i48 = com.tencent.mm.plugin.voip.video.OpenGlRender.A;
                i29 = 4;
            }
            int i49 = i28 + 3 + i29;
            if (openGlRender.f177053a && openGlRender.f177059g == null) {
                openGlRender.f177060h = i17;
                openGlRender.f177061i = i18;
                openGlRender.f177062j = i49;
                openGlRender.f177059g = bArr;
                openGlRender.f177072t = true;
                openGlRender.f177073u = 3;
                openGlRender.g();
            }
        }
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public boolean x() {
        return true;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public boolean z() {
        return false;
    }
}
