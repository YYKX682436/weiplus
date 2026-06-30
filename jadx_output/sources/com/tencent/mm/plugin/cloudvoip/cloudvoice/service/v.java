package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class v extends com.tencent.mm.plugin.voip.video.camera.prev.CaptureView implements com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d, xq4.d {

    /* renamed from: h, reason: collision with root package name */
    public int f96109h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f96110i;

    /* renamed from: m, reason: collision with root package name */
    public int f96111m;

    /* renamed from: n, reason: collision with root package name */
    public int f96112n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.cloudvoip.cloudvoice.service.r f96113o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c f96114p;

    public v(android.content.Context context, fw1.d dVar, int i17, int i18) {
        super(context);
        this.f96109h = 0;
        this.f96110i = "";
        this.f96111m = -1;
        this.f96112n = 0;
        this.f96113o = null;
        this.f96114p = null;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceCameraView", "anlin OpenVoiceCameraView: mWidth: " + i17 + ", height: " + i18);
        this.f96113o = new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.r(i17, i18);
        this.f96111m = dVar.f267069a;
        this.f96110i = dVar.f267070b;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public void d(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceCameraView", "enter full screen to direction %s", java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c cVar = this.f96114p;
        if (cVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.OpenVoiceCameraView", "enter full screen: full screen delegate is null");
        } else {
            cVar.d(i17);
        }
    }

    @Override // xq4.d
    public void e(int i17) {
        if (android.provider.Settings.System.getInt(getContext().getContentResolver(), "accelerometer_rotation", 0) != 0) {
            fw1.i.a(i17, this.f96113o.f464560d);
        }
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public void exitFullScreen() {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceCameraView", "exit full screen");
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c cVar = this.f96114p;
        if (cVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.OpenVoiceCameraView", "exit full screen: full screen delegate is null");
        } else {
            cVar.exitFullScreen();
        }
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public void f(int i17) {
        if (i17 == this.f96111m) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceCameraView", "updateMemberId, viewId:" + this.f96109h + ", openId:" + this.f96110i + ", memberId:[" + this.f96111m + "->" + i17 + "]");
        this.f96111m = i17;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public int getLogicHeight() {
        return getHeight();
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public int getLogicWidth() {
        return getWidth();
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public int getMemberId() {
        return this.f96111m;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public java.lang.String getOpenId() {
        return this.f96110i;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public int getViewId() {
        return this.f96109h;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public void h() {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceCameraView", "uint, viewId:" + this.f96109h + ", openId:" + this.f96110i + ", memberId:" + this.f96111m);
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.r rVar = this.f96113o;
        rVar.i();
        rVar.getClass();
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public void i(org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceCameraView", "update, viewId:" + this.f96109h + ", openId:" + this.f96110i + ", memberId:" + this.f96111m + ", data:" + jSONObject.toString());
        h();
        k(jSONObject);
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public void k(org.json.JSONObject jSONObject) {
        boolean z17;
        this.f96109h = jSONObject.optInt("viewId");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("config");
        if (optJSONObject != null) {
            java.lang.String optString = optJSONObject.optString("camera", "back");
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceCameraView", "camera:" + optString);
            if (optString.equals("back")) {
                z17 = false;
                com.tencent.mm.plugin.cloudvoip.cloudvoice.service.r rVar = this.f96113o;
                rVar.d(this, z17);
                rVar.f464569p = this;
                setSurfaceChangeCallback(rVar);
                rVar.f464568o = true;
                rVar.h();
                com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceCameraView", "init, viewId:" + this.f96109h + ", openId:" + this.f96110i + ", memberId:" + this.f96111m + ", data:" + jSONObject.toString());
            }
        }
        z17 = true;
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.r rVar2 = this.f96113o;
        rVar2.d(this, z17);
        rVar2.f464569p = this;
        setSurfaceChangeCallback(rVar2);
        rVar2.f464568o = true;
        rVar2.h();
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceCameraView", "init, viewId:" + this.f96109h + ", openId:" + this.f96110i + ", memberId:" + this.f96111m + ", data:" + jSONObject.toString());
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public boolean n(int i17, int i18) {
        return this.f96113o.n(i17, i18);
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public void setFullScreenDelegate(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c cVar) {
        this.f96114p = cVar;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public boolean t() {
        return false;
    }

    @Override // xq4.d
    public void v(byte[] bArr, long j17, int i17, int i18, int i19, int i27, double d17) {
        boolean z17;
        int i28 = this.f96112n;
        this.f96112n = i28 + 1;
        if (i28 % 50 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceCameraView", "onFrameDataReady, w:" + i17 + ",h:" + i18 + ",format:" + i19 + ",len:" + bArr.length + ",size:" + j17 + ",rotate:" + i27 + ",time:" + d17);
        }
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE;
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.y2 y2Var = p0Var.f96019h;
        synchronized (y2Var) {
            z17 = y2Var.f96142c;
        }
        if (z17) {
            p0Var.n(new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.y1(p0Var, i19 + i27, i17, i18, bArr));
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
