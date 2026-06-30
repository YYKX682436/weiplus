package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1094x32b0ec;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView */
/* loaded from: classes7.dex */
public class C12151x47b5a23e extends com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.h4 f163098d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Handler f163099e;

    /* renamed from: f, reason: collision with root package name */
    public int f163100f;

    /* renamed from: g, reason: collision with root package name */
    public final sc1.h f163101g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f163102h;

    /* renamed from: i, reason: collision with root package name */
    public sc1.l f163103i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.p2926x359365.InterfaceC25480xa8fcc7a7 f163104m;

    /* renamed from: n, reason: collision with root package name */
    public sc1.j f163105n;

    /* renamed from: o, reason: collision with root package name */
    public sc1.i f163106o;

    public C12151x47b5a23e(android.content.Context context) {
        super(context);
        this.f163099e = new android.os.Handler(getContext().getMainLooper());
        this.f163100f = 0;
        this.f163101g = new sc1.h(this);
        this.f163102h = "";
        b(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getRotationAngle */
    public int m51026xcae2343f() {
        return ((android.view.WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getRotation();
    }

    public final void b(android.content.Context context) {
        this.f163103i = new sc1.q1(context);
        setBackgroundColor(-16777216);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.h4 h4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.h4(getContext(), new sc1.g(this));
        this.f163098d = h4Var;
        h4Var.enable();
        c(m51026xcae2343f());
    }

    public final boolean c(int i17) {
        if (i17 == this.f163100f) {
            return false;
        }
        this.f163100f = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLivePusherView", "orientation changed senorAngle = " + i17);
        this.f163103i.m(i17);
        return true;
    }

    public void d(jc1.d dVar, int i17, java.lang.String str, java.util.HashMap hashMap) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandLivePusherView", "onError code:%d msg:%s", java.lang.Integer.valueOf(i17), str);
        sc1.i iVar = this.f163106o;
        if (iVar != null) {
            sc1.o0 o0Var = (sc1.o0) iVar;
            o0Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertLivePusher", "onError, error:%s", java.lang.Integer.valueOf(i17));
            sc1.u0 u0Var = new sc1.u0(null);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", dVar.f380436a);
                jSONObject.put("errCode", i17);
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str == null) {
                    str = "";
                }
                jSONObject.put("errMsg", str);
                jSONObject.put("livePusherId", o0Var.f487237a);
                if (hashMap != null && !hashMap.isEmpty()) {
                    jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, new org.json.JSONObject(hashMap));
                }
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiInsertLivePusher", "onError fail", e17);
            }
            u0Var.f163907f = jSONObject.toString();
            o0Var.f487238b.i(u0Var, null);
        }
    }

    public void e() {
        sc1.k1 k17 = ((sc1.q1) this.f163103i).k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLivePusherView", "onDestroy code:%d info:%s", java.lang.Integer.valueOf(k17.f487221a), k17.f487222b);
        sc1.j jVar = this.f163105n;
        if (jVar != null) {
            sc1.l0 l0Var = (sc1.l0) jVar;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.x xVar = l0Var.f487225b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar = l0Var.f487224a;
            tVar.I(xVar);
            tVar.O(l0Var.f487226c);
        }
    }

    public boolean f(java.lang.String str, org.json.JSONObject jSONObject) {
        sc1.k1 h17 = ((sc1.q1) this.f163103i).h(str, jSONObject);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLivePusherView", "onOperate code:%d info:%s", java.lang.Integer.valueOf(h17.f487221a), h17.f487222b);
        return h17.f487221a == 0;
    }

    public void g(android.os.Bundle bundle) {
        sc1.k1 g17 = ((sc1.q1) this.f163103i).g(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLivePusherView", "onUpdate code:%d info:%s", java.lang.Integer.valueOf(g17.f487221a), g17.f487222b);
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c(m51026xcae2343f());
    }

    /* renamed from: setAudioVolumeNotifyListener */
    public void m51027xcc5c238b(com.p314xaae8f345.p2926x359365.C25487x5a912af7.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        ((sc1.q1) this.f163103i).l(iTXAudioVolumeEvaluationListener);
    }

    /* renamed from: setBGMNotifyListener */
    public void m51028x2ea741c3(com.p314xaae8f345.p2926x359365.C25487x5a912af7.OnBGMNotify onBGMNotify) {
        ((sc1.q1) this.f163103i).j(onBGMNotify);
    }

    /* renamed from: setOnErrorListener */
    public void m51029x6954c27b(sc1.i iVar) {
        this.f163106o = iVar;
    }

    /* renamed from: setOnExitListener */
    public void m51030xb553a473(sc1.j jVar) {
        this.f163105n = jVar;
    }

    /* renamed from: setOnPushEventListener */
    public void m51031xc4842493(com.p314xaae8f345.p2926x359365.InterfaceC25480xa8fcc7a7 interfaceC25480xa8fcc7a7) {
        this.f163104m = interfaceC25480xa8fcc7a7;
        ((sc1.q1) this.f163103i).mo164243x4e5bab70(interfaceC25480xa8fcc7a7);
    }

    /* renamed from: setSnapshotListener */
    public void m51032x8ba6f71a(com.p314xaae8f345.p2926x359365.C25487x5a912af7.ITXSnapshotListener iTXSnapshotListener) {
        ((sc1.q1) this.f163103i).e(iTXSnapshotListener);
    }

    public C12151x47b5a23e(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f163099e = new android.os.Handler(getContext().getMainLooper());
        this.f163100f = 0;
        this.f163101g = new sc1.h(this);
        this.f163102h = "";
        b(context);
    }
}
