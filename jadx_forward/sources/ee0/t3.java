package ee0;

@j95.b
/* loaded from: classes8.dex */
public final class t3 extends i95.w implements fe0.v3 {
    public void Ai(android.view.View view, fe0.a aVar, java.lang.String str, java.util.Map map, fe0.p3 p3Var) {
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("processFrontEvent", "com.tencent.mm.feature.sns.LiteAppAdGeneralViewService");
        if (view == null || aVar == null || str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.GeneralViewService", "the view or view type is null!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processFrontEvent", "com.tencent.mm.feature.sns.LiteAppAdGeneralViewService");
            return;
        }
        if (aVar == fe0.a.f342897d) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeMethod", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaViewFactory");
            java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.kov);
            if (tag instanceof j54.f) {
                j54.f fVar = (j54.f) tag;
                fVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeMethod", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaViewController");
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("startMonitoring", str)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("register", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaViewController");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.p2107x3fc6a675.C17739x2ed29231 c17739x2ed29231 = fVar.f379362c;
                    if (c17739x2ed29231 == null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("register", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaViewController");
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("registerSensor", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
                        android.hardware.SensorManager sensorManager = c17739x2ed29231.f244572i;
                        if (sensorManager == null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("registerSensor", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
                        } else {
                            if (!c17739x2ed29231.f244573m) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.PanoramaView", "it is going to register sensor");
                                android.hardware.Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                                android.hardware.Sensor defaultSensor2 = sensorManager.getDefaultSensor(2);
                                if (defaultSensor != null) {
                                    sensorManager.registerListener(c17739x2ed29231, defaultSensor, 1);
                                }
                                if (defaultSensor2 != null) {
                                    sensorManager.registerListener(c17739x2ed29231, defaultSensor2, 1);
                                }
                                c17739x2ed29231.f244573m = true;
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("registerSensor", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("register", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaViewController");
                    }
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("stopMonitoring", str)) {
                    fVar.b();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeMethod", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaViewController");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeMethod", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaViewFactory");
        } else if (aVar == fe0.a.f342898e) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeMethod", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewFactory");
            if (str.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.FormView", "the view or method is null!!");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeMethod", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewFactory");
            } else {
                java.lang.Object tag2 = view.getTag(com.p314xaae8f345.mm.R.id.r8r);
                if (tag2 instanceof h54.f) {
                    h54.f fVar2 = (h54.f) tag2;
                    fVar2.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeMethod", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
                    java.util.Map a17 = h54.i.f360629a.a(map);
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("performActionResult", str)) {
                        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) a17;
                        java.lang.Object obj = linkedHashMap.get("callbackId");
                        java.lang.String str3 = "";
                        if (obj != null) {
                            str2 = obj instanceof java.lang.String ? (java.lang.String) obj : "";
                        } else {
                            str2 = "";
                        }
                        java.lang.Object obj2 = linkedHashMap.get("resultData");
                        if (obj2 != null && (obj2 instanceof java.lang.String)) {
                            str3 = (java.lang.String) obj2;
                        }
                        zg0.v2 v2Var = fVar2.f360627d;
                        if (v2Var == null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeMethod", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
                        } else {
                            if (str2.length() > 0) {
                                m54.l lVar = new m54.l();
                                h54.a aVar2 = h54.b.f360612a;
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getEMPTY_FORM_DATA", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormDataConvertor");
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEMPTY_FORM_DATA", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormDataConvertor");
                                new h54.d(v2Var, str2, lVar, "", null, h54.b.f360612a).a("ok", kz5.c1.l(new jz5.l("ret", 0), new jz5.l("err_msg", "ok"), new jz5.l("result_data", str3)));
                            }
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeMethod", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeMethod", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewFactory");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processFrontEvent", "com.tencent.mm.feature.sns.LiteAppAdGeneralViewService");
    }

    public void Bi(android.view.View view, fe0.a aVar) {
        java.lang.Object m143895xf1229813;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("releaseView", "com.tencent.mm.feature.sns.LiteAppAdGeneralViewService");
        if (view == null || aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.GeneralViewService", "the view or view type is null!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("releaseView", "com.tencent.mm.feature.sns.LiteAppAdGeneralViewService");
            return;
        }
        if (aVar == fe0.a.f342897d) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("releasePanoramaView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaViewFactory");
            java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.kov);
            if (tag instanceof j54.f) {
                j54.f fVar = (j54.f) tag;
                fVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("release", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaViewController");
                fVar.b();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("release", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaViewController");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("releasePanoramaView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaViewFactory");
        } else if (aVar == fe0.a.f342898e) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("releaseFormView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewFactory");
            if ((view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59) && !((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59) view).f292909y) {
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.FormView", "it is going to release form view");
                    ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59) view).E0();
                    ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59) view).mo52095x5cd39ffa();
                } catch (java.lang.Throwable th6) {
                    ca4.q.c("releaseFormView", th6);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("releaseFormView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewFactory");
        } else if (aVar == fe0.a.f342899f) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("releaseWebView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewFactory");
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            } catch (java.lang.Throwable th7) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th7));
            }
            if (!(view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59) || ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59) view).f292909y) {
                ym5.a1.f(new k54.q(view));
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
                if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
                    ca4.q.c("SnsAd.WebView", p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813));
                }
                p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("releaseWebView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewFactory");
            } else {
                java.lang.Object mo120164x90fc158e = ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59) view).mo120164x90fc158e();
                if (mo120164x90fc158e instanceof zg0.q2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.WebView", "controller destroy");
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3) ((zg0.q2) mo120164x90fc158e)).D0();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.WebView", "common web view destroy");
                ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59) view).mo52095x5cd39ffa();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("releaseWebView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewFactory");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("releaseView", "com.tencent.mm.feature.sns.LiteAppAdGeneralViewService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0108  */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View wi(android.content.Context r37, fe0.a r38, int r39, java.util.Map r40, fe0.z3 r41) {
        /*
            Method dump skipped, instructions count: 1839
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ee0.t3.wi(android.content.Context, fe0.a, int, java.util.Map, fe0.z3):android.view.View");
    }
}
