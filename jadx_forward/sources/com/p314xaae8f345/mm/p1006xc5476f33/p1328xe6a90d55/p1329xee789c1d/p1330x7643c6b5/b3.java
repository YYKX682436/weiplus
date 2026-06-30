package com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5;

/* loaded from: classes14.dex */
public class b3 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.C21518xd171d8a0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d, com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.h, android.view.TextureView.SurfaceTextureListener, mw1.c {

    /* renamed from: h, reason: collision with root package name */
    public int f177373h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f177374i;

    /* renamed from: m, reason: collision with root package name */
    public int f177375m;

    /* renamed from: n, reason: collision with root package name */
    public int f177376n;

    /* renamed from: o, reason: collision with root package name */
    public int f177377o;

    /* renamed from: p, reason: collision with root package name */
    public int f177378p;

    /* renamed from: q, reason: collision with root package name */
    public int f177379q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f177380r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.Timer f177381s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f177382t;

    /* renamed from: u, reason: collision with root package name */
    public int f177383u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f177384v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f177385w;

    /* renamed from: x, reason: collision with root package name */
    public int f177386x;

    /* renamed from: y, reason: collision with root package name */
    public android.util.Size f177387y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.c f177388z;

    public b3(android.content.Context context, fw1.d dVar, org.json.JSONObject jSONObject) {
        super(context);
        this.f177373h = 0;
        this.f177374i = "";
        this.f177375m = -1;
        this.f177378p = 0;
        this.f177379q = 0;
        this.f177382t = false;
        this.f177383u = 0;
        this.f177384v = false;
        this.f177385w = false;
        this.f177386x = 0;
        this.f177387y = new android.util.Size(0, 0);
        this.f177388z = null;
        this.f177375m = dVar.f348602a;
        this.f177374i = dVar.f348603b;
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
            this.f177382t = false;
            this.f177381s = new java.util.Timer("CloudVoIP_video_info");
            this.f177380r = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
            if (this.f177381s == null || this.f177382t) {
                return;
            }
            this.f177382t = true;
            this.f177381s.schedule(new com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.a3(this), 1000L, 1000L);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    public void d(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceVideoView", "enter full screen to direction %s", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.c cVar = this.f177388z;
        if (cVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoice.OpenVoiceVideoView", "enter full screen: full screen delegate is null");
        } else {
            cVar.d(i17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    /* renamed from: exitFullScreen */
    public void mo54515xd02faf99() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceVideoView", "exit full screen");
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.c cVar = this.f177388z;
        if (cVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoice.OpenVoiceVideoView", "exit full screen: full screen delegate is null");
        } else {
            cVar.mo54529xd02faf99();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    public void f(int i17) {
        if (i17 == this.f177375m) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceVideoView", "updateMemberId, viewId:" + this.f177373h + ", openId:" + this.f177374i + ", memberId:[" + this.f177375m + "->" + i17 + "]");
        this.f177375m = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    /* renamed from: getLogicHeight */
    public int mo54516xceb434ef() {
        int i17 = this.f177379q;
        return i17 > 0 ? i17 : ik1.w.d(getHeight());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    /* renamed from: getLogicWidth */
    public int mo54517x72daf0fe() {
        int i17 = this.f177378p;
        return i17 > 0 ? i17 : ik1.w.d(getWidth());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    /* renamed from: getMemberId */
    public int mo54518x552492cb() {
        return this.f177375m;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    /* renamed from: getOpenId */
    public java.lang.String mo54519x28dae7fb() {
        return this.f177374i;
    }

    /* renamed from: getRenderRotation */
    public int m54520x7d9e8c2a() {
        return this.f177386x;
    }

    /* renamed from: getRenderSize */
    public android.util.Size m54521x356c92ad() {
        return this.f177387y;
    }

    /* renamed from: getRenderTarget */
    public java.lang.Object m54522x8dd3293d() {
        return getSurfaceTexture();
    }

    /* renamed from: getSameLayerSurfaceHeight */
    public int m54523x2925a05f() {
        return this.f177377o;
    }

    /* renamed from: getSameLayerSurfaceWidth */
    public int m54524xb7d6578e() {
        return this.f177376n;
    }

    /* renamed from: getScaleType */
    public int m54525x8f7ec8ee() {
        return this.f177383u;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    /* renamed from: getViewId */
    public int mo54526x346a5196() {
        return this.f177373h;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    public void h() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceVideoView", "uint, viewId:" + this.f177373h + ", openId:" + this.f177374i + ", memberId:" + this.f177375m);
        synchronized (this) {
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    public void i(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceVideoView", "update, viewId:" + this.f177373h + ", openId:" + this.f177374i + ", memberId:" + this.f177375m + ", data:" + jSONObject.toString());
        h();
        k(jSONObject);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    public void k(org.json.JSONObject jSONObject) {
        this.f177373h = jSONObject.optInt("viewId");
        java.lang.String optString = jSONObject.optString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15495x767d9974, "fill");
        if (optString.equals("fill")) {
            this.f177383u = 0;
        } else if (optString.equals("contain")) {
            this.f177383u = 1;
        } else if (optString.equals("cover")) {
            this.f177383u = 2;
        }
        java.lang.String optString2 = jSONObject.optString("type", "camera");
        if (optString2.equals("video")) {
            this.f177384v = true;
        } else if (optString2.equals("screen")) {
            this.f177385w = true;
        }
        int optInt = jSONObject.optInt("rotation", 0);
        if (optInt == 0 || optInt == 90 || optInt == 180 || optInt == 270) {
            this.f177386x = optInt;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceVideoView", "init, viewId:" + this.f177373h + ", openId:" + this.f177374i + ", memberId:" + this.f177375m + ", data:" + jSONObject.toString());
        synchronized (this) {
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    public boolean n(int i17, int i18) {
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSurfaceTextureAvailable, surface:");
        sb6.append(surfaceTexture == null ? "isNull" : "nonNull");
        sb6.append(", viewId:");
        sb6.append(this.f177373h);
        sb6.append(", openId:");
        sb6.append(this.f177374i);
        sb6.append(", mId:");
        sb6.append(this.f177375m);
        sb6.append(", width:");
        sb6.append(i17);
        sb6.append(", height:");
        sb6.append(i18);
        sb6.append(", size: [");
        sb6.append(getWidth());
        sb6.append(",");
        sb6.append(getHeight());
        sb6.append("]");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceVideoView", sb6.toString());
        C();
        this.f177387y = new android.util.Size(i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceVideoView", "onSurfaceTextureDestroyed, viewId:" + this.f177373h + ", openId:" + this.f177374i + ", mId:" + this.f177375m);
        java.util.Timer timer = this.f177381s;
        if (timer != null) {
            timer.cancel();
            this.f177381s = null;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f177380r;
        if (n3Var == null) {
            return false;
        }
        n3Var.mo50302x6b17ad39(null);
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceVideoView", "onSurfaceTextureSizeChanged, viewId:" + this.f177373h + ", openId:" + this.f177374i + ", mId:" + this.f177375m + ", width:" + i17 + ", height:" + i18 + ", size: [" + getWidth() + "," + getHeight() + "]");
        this.f177387y = new android.util.Size(i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    /* renamed from: setFullScreenDelegate */
    public void mo54527xda608282(com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.c cVar) {
        this.f177388z = cVar;
    }

    /* renamed from: setScreenOri */
    public void m54528x6335c098(int i17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    public boolean t() {
        return this.f177384v;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    public boolean x() {
        return this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.u;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    public boolean z() {
        return this.f177385w;
    }
}
