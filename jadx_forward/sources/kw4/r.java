package kw4;

/* loaded from: classes8.dex */
public class r implements com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.fts.ui.C19252xb5f78ab1 f394721d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.fts.ui.C19252xb5f78ab1 c19252xb5f78ab1) {
        this.f394721d = c19252xb5f78ab1;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FtsWebVideoView", "onVideoEnded");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.fts.ui.C19252xb5f78ab1 c19252xb5f78ab1 = this.f394721d;
        lw4.j jVar = c19252xb5f78ab1.H;
        if (jVar != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = jVar.f403192b;
            if (b4Var != null) {
                b4Var.d();
            }
            try {
                jVar.j(jVar.g(3, null));
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiVideoCallback", e17, null, new java.lang.Object[0]);
            }
        }
        if (c19252xb5f78ab1.E) {
            c19252xb5f78ab1.j(0, true);
            return;
        }
        c19252xb5f78ab1.j(0, false);
        c19252xb5f78ab1.i();
        android.view.View view = c19252xb5f78ab1.f263604h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showReplayCover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showReplayCover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = c19252xb5f78ab1.f263605i;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showReplayCover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showReplayCover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = c19252xb5f78ab1.f263612s;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showReplayCover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showReplayCover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c19252xb5f78ab1.l();
        c19252xb5f78ab1.f263611r.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c6e);
        c19252xb5f78ab1.f263603g.setVisibility(8);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FtsWebVideoView", "onGetVideoSize width=%d height=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.fts.ui.C19252xb5f78ab1 c19252xb5f78ab1 = this.f394721d;
        if (c19252xb5f78ab1.f263600d == kw4.u.AUTO) {
            kw4.u uVar = i17 < i18 ? kw4.u.PORTRAIT : kw4.u.LANDSCAPE;
            c19252xb5f78ab1.f263600d = uVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FtsWebVideoView", "onGetVideoSize adjust direction from AUTO to %s", uVar);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FtsWebVideoView", "onError errorMsg=%s what=%d extra=%d", str3, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.fts.ui.C19252xb5f78ab1 c19252xb5f78ab1 = this.f394721d;
        g0Var.d(14911, valueOf, valueOf2, c19252xb5f78ab1.P, com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40061x1de3608b(c19252xb5f78ab1.getContext()));
        lw4.j jVar = c19252xb5f78ab1.H;
        if (jVar != null) {
            jVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiVideoCallback", "onError what %d, extra %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            jVar.f();
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("errCode", i17);
                jSONObject.put("errMsg", i18 + "");
                jVar.j(jVar.g(7, jSONObject));
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiVideoCallback", e17, null, new java.lang.Object[0]);
            }
        }
        c19252xb5f78ab1.i();
        c19252xb5f78ab1.o(c19252xb5f78ab1.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574976k73, i17 + ":" + i18), c19252xb5f78ab1.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574979k80), null);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void N5(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FtsWebVideoView", "onVideoWaiting");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.fts.ui.C19252xb5f78ab1 c19252xb5f78ab1 = this.f394721d;
        c19252xb5f78ab1.f263603g.f244009i.setVisibility(8);
        c19252xb5f78ab1.M = true;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FtsWebVideoView", "onVideoPause");
        lw4.j jVar = this.f394721d.H;
        if (jVar != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = jVar.f403192b;
            if (b4Var != null) {
                b4Var.d();
            }
            try {
                jVar.j(jVar.g(2, null));
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiVideoCallback", e17, null, new java.lang.Object[0]);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void l(java.lang.String str, java.lang.String str2) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.fts.ui.C19252xb5f78ab1.V;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.fts.ui.C19252xb5f78ab1 c19252xb5f78ab1 = this.f394721d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FtsWebVideoView", "onVideoPlay, isLive:%b", java.lang.Boolean.valueOf(c19252xb5f78ab1.e()));
        lw4.j jVar = c19252xb5f78ab1.H;
        if (jVar != null) {
            jVar.f403193c = 0;
            if (jVar.f403192b == null) {
                jVar.f403192b = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new lw4.i(jVar), true);
            }
            jVar.f403192b.c(250L, 250L);
            try {
                jVar.j(jVar.g(1, null));
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiVideoCallback", e17, null, new java.lang.Object[0]);
            }
        }
        long j17 = c19252xb5f78ab1.Q;
        if (j17 <= 0 || j17 == com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - c19252xb5f78ab1.Q;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14909, java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Long.valueOf(currentTimeMillis), com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40061x1de3608b(c19252xb5f78ab1.getContext()), c19252xb5f78ab1.P);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void m2(java.lang.String str, java.lang.String str2, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FtsWebVideoView", "onVideoWaitingEnd");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.fts.ui.C19252xb5f78ab1 c19252xb5f78ab1 = this.f394721d;
        c19252xb5f78ab1.M = false;
        c19252xb5f78ab1.f263603g.f244009i.setVisibility(0);
        c19252xb5f78ab1.f263603g.x();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void o(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FtsWebVideoView", "onPrepared");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.fts.ui.C19252xb5f78ab1 c19252xb5f78ab1 = this.f394721d;
        kw4.e eVar = c19252xb5f78ab1.B;
        eVar.f394705i = -1;
        eVar.f394706j = 0;
        eVar.f394704h = 0.0f;
        c19252xb5f78ab1.f263603g.z(c19252xb5f78ab1.M);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    /* renamed from: onSeekComplete */
    public void mo55683xe1fdf750(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void p2(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void v3(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
    }
}
