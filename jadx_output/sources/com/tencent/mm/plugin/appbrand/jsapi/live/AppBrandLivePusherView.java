package com.tencent.mm.plugin.appbrand.jsapi.live;

/* loaded from: classes7.dex */
public class AppBrandLivePusherView extends com.tencent.rtmp.ui.TXCloudVideoView {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.utils.h4 f81565d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Handler f81566e;

    /* renamed from: f, reason: collision with root package name */
    public int f81567f;

    /* renamed from: g, reason: collision with root package name */
    public final sc1.h f81568g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f81569h;

    /* renamed from: i, reason: collision with root package name */
    public sc1.l f81570i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.rtmp.ITXLivePushListener f81571m;

    /* renamed from: n, reason: collision with root package name */
    public sc1.j f81572n;

    /* renamed from: o, reason: collision with root package name */
    public sc1.i f81573o;

    public AppBrandLivePusherView(android.content.Context context) {
        super(context);
        this.f81566e = new android.os.Handler(getContext().getMainLooper());
        this.f81567f = 0;
        this.f81568g = new sc1.h(this);
        this.f81569h = "";
        b(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRotationAngle() {
        return ((android.view.WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getRotation();
    }

    public final void b(android.content.Context context) {
        this.f81570i = new sc1.q1(context);
        setBackgroundColor(-16777216);
        com.tencent.mm.plugin.appbrand.utils.h4 h4Var = new com.tencent.mm.plugin.appbrand.utils.h4(getContext(), new sc1.g(this));
        this.f81565d = h4Var;
        h4Var.enable();
        c(getRotationAngle());
    }

    public final boolean c(int i17) {
        if (i17 == this.f81567f) {
            return false;
        }
        this.f81567f = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLivePusherView", "orientation changed senorAngle = " + i17);
        this.f81570i.m(i17);
        return true;
    }

    public void d(jc1.d dVar, int i17, java.lang.String str, java.util.HashMap hashMap) {
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandLivePusherView", "onError code:%d msg:%s", java.lang.Integer.valueOf(i17), str);
        sc1.i iVar = this.f81573o;
        if (iVar != null) {
            sc1.o0 o0Var = (sc1.o0) iVar;
            o0Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertLivePusher", "onError, error:%s", java.lang.Integer.valueOf(i17));
            sc1.u0 u0Var = new sc1.u0(null);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", dVar.f298903a);
                jSONObject.put("errCode", i17);
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str == null) {
                    str = "";
                }
                jSONObject.put("errMsg", str);
                jSONObject.put("livePusherId", o0Var.f405704a);
                if (hashMap != null && !hashMap.isEmpty()) {
                    jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, new org.json.JSONObject(hashMap));
                }
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInsertLivePusher", "onError fail", e17);
            }
            u0Var.f82374f = jSONObject.toString();
            o0Var.f405705b.i(u0Var, null);
        }
    }

    public void e() {
        sc1.k1 k17 = ((sc1.q1) this.f81570i).k();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLivePusherView", "onDestroy code:%d info:%s", java.lang.Integer.valueOf(k17.f405688a), k17.f405689b);
        sc1.j jVar = this.f81572n;
        if (jVar != null) {
            sc1.l0 l0Var = (sc1.l0) jVar;
            com.tencent.mm.plugin.appbrand.jsapi.x xVar = l0Var.f405692b;
            com.tencent.mm.plugin.appbrand.jsapi.t tVar = l0Var.f405691a;
            tVar.I(xVar);
            tVar.O(l0Var.f405693c);
        }
    }

    public boolean f(java.lang.String str, org.json.JSONObject jSONObject) {
        sc1.k1 h17 = ((sc1.q1) this.f81570i).h(str, jSONObject);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLivePusherView", "onOperate code:%d info:%s", java.lang.Integer.valueOf(h17.f405688a), h17.f405689b);
        return h17.f405688a == 0;
    }

    public void g(android.os.Bundle bundle) {
        sc1.k1 g17 = ((sc1.q1) this.f81570i).g(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLivePusherView", "onUpdate code:%d info:%s", java.lang.Integer.valueOf(g17.f405688a), g17.f405689b);
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c(getRotationAngle());
    }

    public void setAudioVolumeNotifyListener(com.tencent.rtmp.TXLivePusher.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        ((sc1.q1) this.f81570i).l(iTXAudioVolumeEvaluationListener);
    }

    public void setBGMNotifyListener(com.tencent.rtmp.TXLivePusher.OnBGMNotify onBGMNotify) {
        ((sc1.q1) this.f81570i).j(onBGMNotify);
    }

    public void setOnErrorListener(sc1.i iVar) {
        this.f81573o = iVar;
    }

    public void setOnExitListener(sc1.j jVar) {
        this.f81572n = jVar;
    }

    public void setOnPushEventListener(com.tencent.rtmp.ITXLivePushListener iTXLivePushListener) {
        this.f81571m = iTXLivePushListener;
        ((sc1.q1) this.f81570i).setPushListener(iTXLivePushListener);
    }

    public void setSnapshotListener(com.tencent.rtmp.TXLivePusher.ITXSnapshotListener iTXSnapshotListener) {
        ((sc1.q1) this.f81570i).e(iTXSnapshotListener);
    }

    public AppBrandLivePusherView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f81566e = new android.os.Handler(getContext().getMainLooper());
        this.f81567f = 0;
        this.f81568g = new sc1.h(this);
        this.f81569h = "";
        b(context);
    }
}
