package oe1;

/* loaded from: classes15.dex */
public class t implements oe1.h1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a f426273d;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a) {
        this.f426273d = c12262x4a2a25a;
    }

    @Override // oe1.h1
    public void E(java.lang.String str, java.lang.String str2) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a.E1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a = this.f426273d;
        c12262x4a2a25a.o("onVideoEnded", new java.lang.Object[0]);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = c12262x4a2a25a.f165085y1;
        if (b4Var != null) {
            b4Var.d();
        }
        c12262x4a2a25a.f165063g.setVisibility(8);
        c12262x4a2a25a.f165065i.mo51416x11f3be80(false);
        if (c12262x4a2a25a.f165065i.mo51421xb9a8b747() && c12262x4a2a25a.f165065i.m()) {
            c12262x4a2a25a.f165065i.mo51420x30dd42();
        }
        if (c12262x4a2a25a.f165079w.getVisibility() == 0) {
            c12262x4a2a25a.f165079w.setVisibility(8);
        }
        if (c12262x4a2a25a.n() || !c12262x4a2a25a.R) {
            android.view.View view = c12262x4a2a25a.f165068n;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView$5", "onVideoEnded", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView$5", "onVideoEnded", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = c12262x4a2a25a.f165067m;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView$5", "onVideoEnded", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView$5", "onVideoEnded", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            if (c12262x4a2a25a.K <= 0) {
                c12262x4a2a25a.f165069o.setText(c12262x4a2a25a.h(c12262x4a2a25a.f165062f.mo51380x6d590e18()));
            }
            android.view.View view3 = c12262x4a2a25a.f165068n;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView$5", "onVideoEnded", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView$5", "onVideoEnded", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = c12262x4a2a25a.f165067m;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView$5", "onVideoEnded", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView$5", "onVideoEnded", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        xe1.p pVar = c12262x4a2a25a.C;
        if (pVar != null) {
            try {
                pVar.a(new xe1.d(null), pVar.b());
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Video.JsApiVideoCallback", "OnVideoEnded e=%s", e17);
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = pVar.f535363f;
            if (b4Var2 != null) {
                b4Var2.d();
            }
        }
        if (c12262x4a2a25a.I) {
            c12262x4a2a25a.u(0.0d, true);
        }
        oe1.h1 h1Var = c12262x4a2a25a.B1;
        if (h1Var != null) {
            h1Var.E(str, str2);
        }
    }

    @Override // oe1.h1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)};
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a.E1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a = this.f426273d;
        c12262x4a2a25a.o("onGetVideoSize width=%d height=%d", objArr);
        if (c12262x4a2a25a.f165060d == -1) {
            int i27 = i17 < i18 ? 0 : 90;
            c12262x4a2a25a.f165060d = i27;
            c12262x4a2a25a.o("onGetVideoSize adjust direction from AUTO to %s", java.lang.Integer.valueOf(i27));
        }
        xe1.p pVar = c12262x4a2a25a.C;
        if (pVar != null) {
            int m51335x51e8b0a = c12262x4a2a25a.m51335x51e8b0a();
            pVar.getClass();
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Video.JsApiVideoCallback", "onVideoLoadedMetaData, width:%d, height:%d, duration:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(m51335x51e8b0a));
                org.json.JSONObject b17 = pVar.b();
                b17.put("width", i17);
                b17.put("height", i18);
                b17.put("duration", (m51335x51e8b0a * 1.0d) / 1000.0d);
                pVar.a(new xe1.g(null), b17);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Video.JsApiVideoCallback", "onVideoLoadedMetaData e=%s", e17);
            }
        }
        oe1.h1 h1Var = c12262x4a2a25a.B1;
        if (h1Var != null) {
            h1Var.I(str, str2, i17, i18);
        }
    }

    @Override // oe1.h1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        java.lang.Object[] objArr = {str3, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)};
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a.E1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a = this.f426273d;
        c12262x4a2a25a.o("onError errorMsg=%s what=%d extra=%d", objArr);
        xe1.p pVar = c12262x4a2a25a.C;
        if (pVar != null) {
            pVar.f535362e.K(pVar);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = pVar.f535363f;
            if (b4Var != null) {
                b4Var.d();
            }
            try {
                org.json.JSONObject b17 = pVar.b();
                b17.put("errMsg", str3);
                b17.put("what", i17);
                b17.put("extra", i18);
                pVar.a(new xe1.e(null), b17);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Video.JsApiVideoCallback", "onError e=%s", e17);
            }
        }
        oe1.h1 h1Var = c12262x4a2a25a.B1;
        if (h1Var != null) {
            h1Var.N(str, str2, str3, i17, i18);
        }
    }

    @Override // oe1.h1
    public void f(java.lang.String str, java.lang.String str2) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a.E1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a = this.f426273d;
        c12262x4a2a25a.o("onVideoWaiting", new java.lang.Object[0]);
        xe1.p pVar = c12262x4a2a25a.C;
        if (pVar != null) {
            pVar.getClass();
            try {
                org.json.JSONObject b17 = pVar.b();
                b17.put("timeStamp", java.lang.System.currentTimeMillis());
                pVar.a(new xe1.o(null), b17);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Video.JsApiVideoCallback", "onVideoWaiting e=%s", e17);
            }
        }
        c12262x4a2a25a.V = true;
        c12262x4a2a25a.i();
        oe1.h1 h1Var = c12262x4a2a25a.B1;
        if (h1Var != null) {
            h1Var.f(str, str2);
        }
    }

    @Override // oe1.h1
    public void i(java.lang.String str, java.lang.String str2) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a.E1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a = this.f426273d;
        c12262x4a2a25a.o("onVideoPause", new java.lang.Object[0]);
        xe1.p pVar = c12262x4a2a25a.C;
        if (pVar != null) {
            try {
                pVar.a(new xe1.h(null), pVar.b());
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Video.JsApiVideoCallback", "OnVideoPause e=%s", e17);
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = pVar.f535363f;
            if (b4Var != null) {
                b4Var.d();
            }
        }
        oe1.h1 h1Var = c12262x4a2a25a.B1;
        if (h1Var != null) {
            h1Var.i(str, str2);
        }
    }

    @Override // oe1.h1
    public void k(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a = this.f426273d;
        c12262x4a2a25a.V = false;
        c12262x4a2a25a.f165065i.f();
        oe1.h1 h1Var = c12262x4a2a25a.B1;
        if (h1Var != null) {
            h1Var.k(str, str2);
        }
    }

    @Override // oe1.h1
    public void l(java.lang.String str, java.lang.String str2) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a.E1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a = this.f426273d;
        c12262x4a2a25a.o("onVideoPlay, isLive:%b", java.lang.Boolean.valueOf(c12262x4a2a25a.n()));
        if (c12262x4a2a25a.K <= 0 && !c12262x4a2a25a.n()) {
            c12262x4a2a25a.f165069o.setText(c12262x4a2a25a.h(c12262x4a2a25a.f165062f.mo51380x6d590e18()));
        }
        boolean n17 = c12262x4a2a25a.n();
        c12262x4a2a25a.o("updateLiveUI isLive:%b", java.lang.Boolean.valueOf(n17));
        c12262x4a2a25a.f165065i.mo51437x28c841cc((c12262x4a2a25a.P || c12262x4a2a25a.Q) && !n17);
        if (c12262x4a2a25a.B) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a.a(c12262x4a2a25a);
        }
        xe1.p pVar = c12262x4a2a25a.C;
        if (pVar != null) {
            try {
                pVar.f535364g = 0;
                org.json.JSONObject b17 = pVar.b();
                b17.put("timeStamp", java.lang.System.currentTimeMillis());
                pVar.a(new xe1.i(null), b17);
                if (pVar.f535363f == null) {
                    pVar.f535363f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new xe1.a(pVar), true);
                }
                pVar.f535363f.c(250L, 250L);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Video.JsApiVideoCallback", "OnVideoPlay e=%s", e17);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = c12262x4a2a25a.f165086z;
        if (lVar != null) {
            oe1.b2.a(lVar.mo48798x74292566());
        }
        oe1.h1 h1Var = c12262x4a2a25a.B1;
        if (h1Var != null) {
            h1Var.l(str, str2);
        }
        android.view.View view = c12262x4a2a25a.f165067m;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView$5", "onVideoPlay", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView$5", "onVideoPlay", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // oe1.h1
    public void n(java.lang.String str, long j17) {
        java.lang.Object[] objArr = {java.lang.Long.valueOf(j17)};
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a.E1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a = this.f426273d;
        c12262x4a2a25a.o("onPreloadedMetaData preloadSize:%d", objArr);
        xe1.p pVar = c12262x4a2a25a.C;
        if (pVar != null) {
            pVar.getClass();
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Video.JsApiVideoCallback", "onVideoPreloadedMetaData, preloadSize:%d", java.lang.Long.valueOf(j17));
                org.json.JSONObject b17 = pVar.b();
                b17.put("preloadSize", j17);
                pVar.a(new xe1.j(null), b17);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Video.JsApiVideoCallback", "onVideoPreloadedMetaData e=%s", e17);
            }
        }
        oe1.h1 h1Var = c12262x4a2a25a.B1;
        if (h1Var != null) {
            h1Var.n(str, j17);
        }
    }

    @Override // oe1.h1
    public void o(java.lang.String str, java.lang.String str2) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a.E1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a = this.f426273d;
        c12262x4a2a25a.o("onPrepared", new java.lang.Object[0]);
        c12262x4a2a25a.f165087z1 = 0;
        if (c12262x4a2a25a.f165085y1 == null) {
            c12262x4a2a25a.f165085y1 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new oe1.n(c12262x4a2a25a), true);
        }
        c12262x4a2a25a.f165085y1.c(500L, 500L);
        c12262x4a2a25a.f165072p1 = true;
        if (c12262x4a2a25a.f165082x1) {
            c12262x4a2a25a.x();
        }
        ef1.e eVar = c12262x4a2a25a.F;
        eVar.f333930i = -1;
        eVar.f333931j = 0;
        eVar.f333929h = 0.0f;
        xe1.p pVar = c12262x4a2a25a.C;
        if (pVar != null) {
            pVar.getClass();
        }
        oe1.h1 h1Var = c12262x4a2a25a.B1;
        if (h1Var != null) {
            h1Var.o(str, str2);
        }
    }
}
