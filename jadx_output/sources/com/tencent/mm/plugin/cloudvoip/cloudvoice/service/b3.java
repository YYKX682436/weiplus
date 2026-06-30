package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class b3 extends com.tencent.mm.ui.base.MMTextureView implements com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.h, android.view.TextureView.SurfaceTextureListener, mw1.c {

    /* renamed from: h, reason: collision with root package name */
    public int f95840h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f95841i;

    /* renamed from: m, reason: collision with root package name */
    public int f95842m;

    /* renamed from: n, reason: collision with root package name */
    public int f95843n;

    /* renamed from: o, reason: collision with root package name */
    public int f95844o;

    /* renamed from: p, reason: collision with root package name */
    public int f95845p;

    /* renamed from: q, reason: collision with root package name */
    public int f95846q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f95847r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.Timer f95848s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f95849t;

    /* renamed from: u, reason: collision with root package name */
    public int f95850u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f95851v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f95852w;

    /* renamed from: x, reason: collision with root package name */
    public int f95853x;

    /* renamed from: y, reason: collision with root package name */
    public android.util.Size f95854y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c f95855z;

    public b3(android.content.Context context, fw1.d dVar, org.json.JSONObject jSONObject) {
        super(context);
        this.f95840h = 0;
        this.f95841i = "";
        this.f95842m = -1;
        this.f95845p = 0;
        this.f95846q = 0;
        this.f95849t = false;
        this.f95850u = 0;
        this.f95851v = false;
        this.f95852w = false;
        this.f95853x = 0;
        this.f95854y = new android.util.Size(0, 0);
        this.f95855z = null;
        this.f95842m = dVar.f267069a;
        this.f95841i = dVar.f267070b;
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(-16777216);
        paint.setFilterBitmap(false);
        setSurfaceTextureListener(this);
        i(jSONObject);
        if (jSONObject.optBoolean("debug", false)) {
            android.text.TextPaint textPaint = new android.text.TextPaint();
            textPaint.setColor(-65536);
            textPaint.setTextSize(25.0f);
            textPaint.setAntiAlias(true);
            this.f95849t = false;
            this.f95848s = new java.util.Timer("CloudVoIP_video_info");
            this.f95847r = new com.tencent.mm.sdk.platformtools.n3();
            if (this.f95848s == null || this.f95849t) {
                return;
            }
            this.f95849t = true;
            this.f95848s.schedule(new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.a3(this), 1000L, 1000L);
        }
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public void d(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceVideoView", "enter full screen to direction %s", java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c cVar = this.f95855z;
        if (cVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.OpenVoiceVideoView", "enter full screen: full screen delegate is null");
        } else {
            cVar.d(i17);
        }
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public void exitFullScreen() {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceVideoView", "exit full screen");
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c cVar = this.f95855z;
        if (cVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.OpenVoiceVideoView", "exit full screen: full screen delegate is null");
        } else {
            cVar.exitFullScreen();
        }
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public void f(int i17) {
        if (i17 == this.f95842m) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceVideoView", "updateMemberId, viewId:" + this.f95840h + ", openId:" + this.f95841i + ", memberId:[" + this.f95842m + "->" + i17 + "]");
        this.f95842m = i17;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public int getLogicHeight() {
        int i17 = this.f95846q;
        return i17 > 0 ? i17 : ik1.w.d(getHeight());
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public int getLogicWidth() {
        int i17 = this.f95845p;
        return i17 > 0 ? i17 : ik1.w.d(getWidth());
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public int getMemberId() {
        return this.f95842m;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public java.lang.String getOpenId() {
        return this.f95841i;
    }

    public int getRenderRotation() {
        return this.f95853x;
    }

    public android.util.Size getRenderSize() {
        return this.f95854y;
    }

    public java.lang.Object getRenderTarget() {
        return getSurfaceTexture();
    }

    public int getSameLayerSurfaceHeight() {
        return this.f95844o;
    }

    public int getSameLayerSurfaceWidth() {
        return this.f95843n;
    }

    public int getScaleType() {
        return this.f95850u;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public int getViewId() {
        return this.f95840h;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public void h() {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceVideoView", "uint, viewId:" + this.f95840h + ", openId:" + this.f95841i + ", memberId:" + this.f95842m);
        synchronized (this) {
        }
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public void i(org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceVideoView", "update, viewId:" + this.f95840h + ", openId:" + this.f95841i + ", memberId:" + this.f95842m + ", data:" + jSONObject.toString());
        h();
        k(jSONObject);
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public void k(org.json.JSONObject jSONObject) {
        this.f95840h = jSONObject.optInt("viewId");
        java.lang.String optString = jSONObject.optString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_OBJECTFIT, "fill");
        if (optString.equals("fill")) {
            this.f95850u = 0;
        } else if (optString.equals("contain")) {
            this.f95850u = 1;
        } else if (optString.equals("cover")) {
            this.f95850u = 2;
        }
        java.lang.String optString2 = jSONObject.optString("type", "camera");
        if (optString2.equals("video")) {
            this.f95851v = true;
        } else if (optString2.equals("screen")) {
            this.f95852w = true;
        }
        int optInt = jSONObject.optInt("rotation", 0);
        if (optInt == 0 || optInt == 90 || optInt == 180 || optInt == 270) {
            this.f95853x = optInt;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceVideoView", "init, viewId:" + this.f95840h + ", openId:" + this.f95841i + ", memberId:" + this.f95842m + ", data:" + jSONObject.toString());
        synchronized (this) {
        }
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public boolean n(int i17, int i18) {
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSurfaceTextureAvailable, surface:");
        sb6.append(surfaceTexture == null ? "isNull" : "nonNull");
        sb6.append(", viewId:");
        sb6.append(this.f95840h);
        sb6.append(", openId:");
        sb6.append(this.f95841i);
        sb6.append(", mId:");
        sb6.append(this.f95842m);
        sb6.append(", width:");
        sb6.append(i17);
        sb6.append(", height:");
        sb6.append(i18);
        sb6.append(", size: [");
        sb6.append(getWidth());
        sb6.append(",");
        sb6.append(getHeight());
        sb6.append("]");
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceVideoView", sb6.toString());
        C();
        this.f95854y = new android.util.Size(i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceVideoView", "onSurfaceTextureDestroyed, viewId:" + this.f95840h + ", openId:" + this.f95841i + ", mId:" + this.f95842m);
        java.util.Timer timer = this.f95848s;
        if (timer != null) {
            timer.cancel();
            this.f95848s = null;
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f95847r;
        if (n3Var == null) {
            return false;
        }
        n3Var.removeCallbacksAndMessages(null);
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceVideoView", "onSurfaceTextureSizeChanged, viewId:" + this.f95840h + ", openId:" + this.f95841i + ", mId:" + this.f95842m + ", width:" + i17 + ", height:" + i18 + ", size: [" + getWidth() + "," + getHeight() + "]");
        this.f95854y = new android.util.Size(i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public void setFullScreenDelegate(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c cVar) {
        this.f95855z = cVar;
    }

    public void setScreenOri(int i17) {
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public boolean t() {
        return this.f95851v;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public boolean x() {
        return this instanceof com.tencent.mm.plugin.cloudvoip.cloudvoice.service.u;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public boolean z() {
        return this.f95852w;
    }
}
