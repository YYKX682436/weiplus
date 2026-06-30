package hu0;

/* loaded from: classes5.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu0.a0 f366596d;

    public x(hu0.a0 a0Var) {
        this.f366596d = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/composing_creation/preview/uic/ComposingCreationRenderUIC$onViewCreated$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hu0.a0 a0Var = this.f366596d;
        a0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.RenderUIC", "onEffectAdjustClicked");
        gu0.k2 S6 = a0Var.S6();
        if (S6 != null) {
            hu0.v vVar = hu0.v.f366594d;
            hu0.w wVar = hu0.w.f366595d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.Session", "openEditPage: current params=" + S6.f357258a + ", halfScreenHeightPercent=0.65");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            eu0.n nVar = S6.f357258a.f338235h;
            if (nVar != null) {
                jSONObject.put("musicInfo", nVar.a());
            }
            java.lang.String str = S6.f357258a.f338229b;
            if (str != null) {
                jSONObject.put("transitionID", str);
            }
            java.lang.String str2 = S6.f357258a.f338238k;
            if (str2 != null) {
                jSONObject.put("aigcServiceID", str2);
            }
            java.lang.String str3 = S6.f357258a.f338230c;
            if (str3 != null) {
                jSONObject.put("prompt", str3);
            }
            eu0.o oVar = S6.f357258a.f338241n;
            if (oVar != null) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("finder_tab_context_id", oVar.f338260a);
                jSONObject2.put("finder_context_id", oVar.f338261b);
                jSONObject.put("rawInfos", jSONObject2);
            }
            java.util.List<java.lang.String> list = S6.A;
            if (list != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
                for (java.lang.String str4 : list) {
                    java.lang.String b17 = ((eu0.e) S6.f357259b).b("wxalite94c410838e79a4cecb3dcd66bc6054a3", str4);
                    if (b17 != null) {
                        str4 = b17;
                    }
                    arrayList2.add(str4);
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("openEditPage: resolved asset localIds: ");
                sb6.append(!arrayList2.isEmpty());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.Session", sb6.toString());
                jSONObject.put("assetInfos", new org.json.JSONArray((java.util.Collection) arrayList2));
            }
            java.util.List<java.lang.String> list2 = S6.B;
            if (list2 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list2, 10));
                for (java.lang.String str5 : list2) {
                    java.lang.String b18 = ((eu0.e) S6.f357259b).b("wxalite94c410838e79a4cecb3dcd66bc6054a3", str5);
                    if (b18 != null) {
                        str5 = b18;
                    }
                    arrayList3.add(str5);
                }
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("openEditPage: resolved effect localIds: ");
                sb7.append(!arrayList3.isEmpty());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.Session", sb7.toString());
                jSONObject.put("effectsInfos", new org.json.JSONArray((java.util.Collection) arrayList3));
            }
            java.lang.String jSONObject3 = jSONObject.length() > 0 ? jSONObject.toString() : null;
            S6.f357265h = true;
            gu0.n2 n2Var = S6.f357259b;
            final gu0.a1 a1Var = new gu0.a1(S6);
            gu0.b1 b1Var = new gu0.b1(S6);
            gu0.y0 y0Var = new gu0.y0(S6, vVar);
            gu0.z0 z0Var = new gu0.z0(S6, wVar);
            ((eu0.e) n2Var).getClass();
            android.content.Context ll6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).ll();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.LiteAppStore", "openLiteAppPageWithDispatch: heightPercent=0.65, appId=wxalite94c410838e79a4cecb3dcd66bc6054a3, path=pages/setting/entry");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("appId", "wxalite94c410838e79a4cecb3dcd66bc6054a3");
            bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, "pages/setting/entry");
            bundle.putString("query", jSONObject3);
            bundle.putBoolean("isHalfScreen", true);
            bundle.putBoolean(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13307xd51ecb63, true);
            bundle.putInt("KHalfScreenBackGroundColor", 0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16190x27388f34 c16190x27388f34 = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16190x27388f34();
            c16190x27388f34.f224944e = 0.65d;
            c16190x27388f34.f224947h = true;
            c16190x27388f34.f224950n = true;
            c16190x27388f34.f224949m = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16191xaf149588() { // from class: com.tencent.mm.mj_publisher.finder.composing_creation.ComposingCreationLiteAppStore$handleCamPreviewOpen$liteAppBridge$1$openLiteAppPage$bundle$1$1$1
                {
                    super(java.lang.Boolean.TRUE);
                }

                @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16191xaf149588
                public void b() {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.LiteAppStore", "onCloseAnimEnd");
                    gu0.m2 m2Var = gu0.m2.this;
                    if (m2Var != null) {
                        gu0.a1 a1Var2 = (gu0.a1) m2Var;
                        a1Var2.f357156a.f357265h = false;
                        gu0.a0 a0Var2 = a1Var2.f357156a.f357263f;
                        if (a0Var2 != null) {
                            gu0.h hVar = (gu0.h) a0Var2;
                            hu0.a0 a0Var3 = hVar.f357218b;
                            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p880x4ac6c74f.p882xed08e3c8.ActivityC10926xa2f37a4e activityC10926xa2f37a4e = hVar.f357217a;
                            activityC10926xa2f37a4e.runOnUiThread(new gu0.b(a0Var3, activityC10926xa2f37a4e));
                        }
                    }
                }

                @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16191xaf149588
                public void c() {
                    gu0.a0 a0Var2;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.LiteAppStore", "onCloseAnimStart");
                    gu0.m2 m2Var = gu0.m2.this;
                    if (m2Var == null || (a0Var2 = ((gu0.a1) m2Var).f357156a.f357263f) == null) {
                        return;
                    }
                    gu0.h hVar = (gu0.h) a0Var2;
                    hVar.f357217a.runOnUiThread(new gu0.c(hVar.f357218b));
                }

                @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16191xaf149588
                public void d() {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.LiteAppStore", "LiteApp onDestroy");
                    gu0.m2 m2Var = gu0.m2.this;
                    if (m2Var != null) {
                        gu0.a1 a1Var2 = (gu0.a1) m2Var;
                        a1Var2.f357156a.f357265h = false;
                        gu0.a0 a0Var2 = a1Var2.f357156a.f357263f;
                        if (a0Var2 != null) {
                            gu0.h hVar = (gu0.h) a0Var2;
                            hu0.a0 a0Var3 = hVar.f357218b;
                            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p880x4ac6c74f.p882xed08e3c8.ActivityC10926xa2f37a4e activityC10926xa2f37a4e = hVar.f357217a;
                            activityC10926xa2f37a4e.runOnUiThread(new gu0.d(a0Var3, activityC10926xa2f37a4e));
                        }
                    }
                }

                @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16191xaf149588
                public void f(int i17, int i18) {
                    gu0.a0 a0Var2;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.LiteAppStore", "onHeightChanged: currentHeight=" + i17 + ", baseHeight=" + i18 + ", progress=" + (i18 > 0 ? i17 / i18 : -1.0f));
                    gu0.m2 m2Var = gu0.m2.this;
                    if (m2Var == null || (a0Var2 = ((gu0.a1) m2Var).f357156a.f357263f) == null) {
                        return;
                    }
                    gu0.h hVar = (gu0.h) a0Var2;
                    hVar.f357217a.runOnUiThread(new gu0.e(hVar.f357218b, i17, i18));
                }

                @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16191xaf149588
                public void g() {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.LiteAppStore", "onOpenAnimEnd");
                    gu0.m2 m2Var = gu0.m2.this;
                    if (m2Var != null) {
                        gu0.a1 a1Var2 = (gu0.a1) m2Var;
                        a1Var2.f357156a.f357265h = true;
                        gu0.a0 a0Var2 = a1Var2.f357156a.f357263f;
                        if (a0Var2 != null) {
                            gu0.h hVar = (gu0.h) a0Var2;
                            hVar.f357217a.runOnUiThread(new gu0.f(hVar.f357218b));
                        }
                    }
                }

                @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16191xaf149588
                public void h() {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.LiteAppStore", "onOpenAnimStart");
                    gu0.m2 m2Var = gu0.m2.this;
                    if (m2Var != null) {
                        gu0.a1 a1Var2 = (gu0.a1) m2Var;
                        a1Var2.f357156a.f357265h = true;
                        gu0.a0 a0Var2 = a1Var2.f357156a.f357263f;
                        if (a0Var2 != null) {
                            gu0.h hVar = (gu0.h) a0Var2;
                            hVar.f357217a.runOnUiThread(new gu0.g(hVar.f357218b));
                        }
                    }
                }
            };
            bundle.putParcelable("halfScreenConfig", c16190x27388f34);
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s();
            sVar.f225700d = new eu0.c(b1Var);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).jk(ll6, bundle, true, false, sVar, new eu0.d(y0Var, z0Var));
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/composing_creation/preview/uic/ComposingCreationRenderUIC$onViewCreated$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
