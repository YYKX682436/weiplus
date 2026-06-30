package com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5;

/* loaded from: classes14.dex */
public class v extends com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2350xae79c325.p2351x34a233.C18926x6d210aeb implements com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d, xq4.d {

    /* renamed from: h, reason: collision with root package name */
    public int f177642h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f177643i;

    /* renamed from: m, reason: collision with root package name */
    public int f177644m;

    /* renamed from: n, reason: collision with root package name */
    public int f177645n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.r f177646o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.c f177647p;

    public v(android.content.Context context, fw1.d dVar, int i17, int i18) {
        super(context);
        this.f177642h = 0;
        this.f177643i = "";
        this.f177644m = -1;
        this.f177645n = 0;
        this.f177646o = null;
        this.f177647p = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceCameraView", "anlin OpenVoiceCameraView: mWidth: " + i17 + ", height: " + i18);
        this.f177646o = new com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.r(i17, i18);
        this.f177644m = dVar.f348602a;
        this.f177643i = dVar.f348603b;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    public void d(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceCameraView", "enter full screen to direction %s", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.c cVar = this.f177647p;
        if (cVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoice.OpenVoiceCameraView", "enter full screen: full screen delegate is null");
        } else {
            cVar.d(i17);
        }
    }

    @Override // xq4.d
    public void e(int i17) {
        if (android.provider.Settings.System.getInt(getContext().getContentResolver(), "accelerometer_rotation", 0) != 0) {
            fw1.i.a(i17, this.f177646o.f546093d);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    /* renamed from: exitFullScreen */
    public void mo54515xd02faf99() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceCameraView", "exit full screen");
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.c cVar = this.f177647p;
        if (cVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoice.OpenVoiceCameraView", "exit full screen: full screen delegate is null");
        } else {
            cVar.mo54529xd02faf99();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    public void f(int i17) {
        if (i17 == this.f177644m) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceCameraView", "updateMemberId, viewId:" + this.f177642h + ", openId:" + this.f177643i + ", memberId:[" + this.f177644m + "->" + i17 + "]");
        this.f177644m = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    /* renamed from: getLogicHeight */
    public int mo54516xceb434ef() {
        return getHeight();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    /* renamed from: getLogicWidth */
    public int mo54517x72daf0fe() {
        return getWidth();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    /* renamed from: getMemberId */
    public int mo54518x552492cb() {
        return this.f177644m;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    /* renamed from: getOpenId */
    public java.lang.String mo54519x28dae7fb() {
        return this.f177643i;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    /* renamed from: getViewId */
    public int mo54526x346a5196() {
        return this.f177642h;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    public void h() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceCameraView", "uint, viewId:" + this.f177642h + ", openId:" + this.f177643i + ", memberId:" + this.f177644m);
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.r rVar = this.f177646o;
        rVar.i();
        rVar.getClass();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    public void i(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceCameraView", "update, viewId:" + this.f177642h + ", openId:" + this.f177643i + ", memberId:" + this.f177644m + ", data:" + jSONObject.toString());
        h();
        k(jSONObject);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    public void k(org.json.JSONObject jSONObject) {
        boolean z17;
        this.f177642h = jSONObject.optInt("viewId");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("config");
        if (optJSONObject != null) {
            java.lang.String optString = optJSONObject.optString("camera", "back");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceCameraView", "camera:" + optString);
            if (optString.equals("back")) {
                z17 = false;
                com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.r rVar = this.f177646o;
                rVar.d(this, z17);
                rVar.f546102p = this;
                m72363x31bff2e0(rVar);
                rVar.f546101o = true;
                rVar.h();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceCameraView", "init, viewId:" + this.f177642h + ", openId:" + this.f177643i + ", memberId:" + this.f177644m + ", data:" + jSONObject.toString());
            }
        }
        z17 = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.r rVar2 = this.f177646o;
        rVar2.d(this, z17);
        rVar2.f546102p = this;
        m72363x31bff2e0(rVar2);
        rVar2.f546101o = true;
        rVar2.h();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceCameraView", "init, viewId:" + this.f177642h + ", openId:" + this.f177643i + ", memberId:" + this.f177644m + ", data:" + jSONObject.toString());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    public boolean n(int i17, int i18) {
        return this.f177646o.n(i17, i18);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    /* renamed from: setFullScreenDelegate */
    public void mo54527xda608282(com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.c cVar) {
        this.f177647p = cVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    public boolean t() {
        return false;
    }

    @Override // xq4.d
    public void v(byte[] bArr, long j17, int i17, int i18, int i19, int i27, double d17) {
        boolean z17;
        int i28 = this.f177645n;
        this.f177645n = i28 + 1;
        if (i28 % 50 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceCameraView", "onFrameDataReady, w:" + i17 + ",h:" + i18 + ",format:" + i19 + ",len:" + bArr.length + ",size:" + j17 + ",rotate:" + i27 + ",time:" + d17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0 p0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0.INSTANCE;
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.y2 y2Var = p0Var.f177552h;
        synchronized (y2Var) {
            z17 = y2Var.f177675c;
        }
        if (z17) {
            p0Var.n(new com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.y1(p0Var, i19 + i27, i17, i18, bArr));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    public boolean x() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    public boolean z() {
        return false;
    }
}
