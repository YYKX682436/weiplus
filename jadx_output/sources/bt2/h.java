package bt2;

/* loaded from: classes3.dex */
public final class h extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public r45.bw2 f24190d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.replay.shopping.FinderLiveShoppingReplayPluginLayout f24191e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }

    public static final void O6(km2.m mVar, java.lang.String str, r45.bw2 bw2Var) {
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        ml2.f4 f4Var = ml2.f4.f327448v;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 1008);
        jSONObject.put("sessionid", bw2Var.getString(7));
        jSONObject.put("productid", str);
        r45.y23 y23Var = (r45.y23) bw2Var.getCustom(4);
        if (y23Var != null) {
            r45.gt3 gt3Var = (r45.gt3) y23Var.getCustom(61);
            java.lang.String string = gt3Var != null ? gt3Var.getString(1) : null;
            int i17 = (string == null || string.length() == 0) ? 1 : 0;
            jSONObject.put("seckill", st2.g3.f412326a.v(y23Var) ? 1 : 0);
            jSONObject.put("is_gift_show", i17 ^ 1);
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("entrance", bw2Var.getString(6));
        r45.y23 y23Var2 = (r45.y23) bw2Var.getCustom(4);
        r0Var.Gj(f4Var, jSONObject, jSONObject2, y23Var2 != null ? y23Var2.getString(17) : null);
        ((ct2.j) mVar.f309130e.a(ct2.j.class)).f222266g = android.os.SystemClock.elapsedRealtime();
        ct2.g R6 = ((ct2.j) mVar.f309130e.a(ct2.j.class)).R6();
        java.lang.String string2 = bw2Var.getString(7);
        if (string2 == null) {
            string2 = "";
        }
        R6.getClass();
        R6.f222255a = string2;
        java.lang.String string3 = bw2Var.getString(6);
        R6.f222257c = string3 != null ? string3 : "";
        kotlin.jvm.internal.o.g(str, "<set-?>");
        R6.f222256b = str;
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "shoppingReport:" + R6);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.azl;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        ws2.k1.f449066r.c();
        return super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        r45.bw2 bw2Var;
        km2.m mVar;
        cm2.t tVar;
        gk2.e buContext;
        java.lang.String str;
        r45.nw1 liveInfo;
        r45.hd5 hd5Var;
        r45.nw1 liveInfo2;
        r45.i72 i72Var;
        if (getActivity() instanceof com.tencent.mm.ui.MMActivity) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.tencent.mm.ui.MMActivity) activity).setSelfNavigationBarVisible(8);
        }
        getActivity().getWindow().addFlags(2097280);
        getActivity().getWindow().addFlags(67108864);
        getActivity().getWindow().clearFlags(1024);
        getActivity().getWindow().clearFlags(512);
        getActivity().getWindow().clearFlags(67108864);
        if (getContext().getResources().getConfiguration().orientation == 2) {
            getActivity().getWindow().getDecorView().setSystemUiVisibility(7942);
            getActivity().getWindow().addFlags(1024);
        } else {
            getActivity().getWindow().getDecorView().setSystemUiVisibility(1792);
        }
        getActivity().getWindow().addFlags(Integer.MIN_VALUE);
        getActivity().getWindow().setStatusBarColor(0);
        getActivity().getWindow().setNavigationBarColor(0);
        getActivity().getWindow().setFormat(-3);
        getActivity().getWindow().setSoftInputMode(51);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("KEY_PARAMS_KEY_VALUE");
        if (byteArrayExtra != null) {
            bw2Var = new r45.bw2();
            bw2Var.parseFrom(byteArrayExtra);
        } else {
            bw2Var = null;
        }
        this.f24190d = bw2Var;
        if (!(bw2Var != null && bw2Var.getInteger(1) == 1)) {
            zl2.r4 r4Var = zl2.r4.f473950a;
            androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("(Debug)回放状态(");
            r45.bw2 bw2Var2 = this.f24190d;
            sb6.append(bw2Var2 != null ? java.lang.Integer.valueOf(bw2Var2.getInteger(1)) : null);
            sb6.append(")错误！");
            r4Var.f3(activity2, sb6.toString());
            getActivity().finish();
            return;
        }
        r45.bw2 bw2Var3 = this.f24190d;
        java.lang.String string = bw2Var3 != null ? bw2Var3.getString(2) : null;
        if (string == null || string.length() == 0) {
            zl2.r4 r4Var2 = zl2.r4.f473950a;
            androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("(Debug)回放url: ");
            r45.bw2 bw2Var4 = this.f24190d;
            sb7.append(bw2Var4 != null ? bw2Var4.getString(2) : null);
            r4Var2.f3(activity3, sb7.toString());
        }
        this.f24191e = new com.tencent.mm.plugin.finder.replay.shopping.FinderLiveShoppingReplayPluginLayout(getActivity(), null);
        ((android.view.ViewGroup) findViewById(com.tencent.mm.R.id.f486910mv1)).addView(this.f24191e);
        r45.bw2 bw2Var5 = this.f24190d;
        if (bw2Var5 != null) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) bw2Var5.getCustom(0);
            if (finderObject == null) {
                mVar = null;
            } else {
                mVar = new km2.m(finderObject);
                cm2.a.f43328a.v(mVar, finderObject, 2);
            }
            if (mVar != null) {
                ct2.j jVar = (ct2.j) mVar.f309130e.a(ct2.j.class);
                com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) bw2Var5.getCustom(0);
                jVar.a7((finderObject2 == null || (liveInfo2 = finderObject2.getLiveInfo()) == null || (i72Var = (r45.i72) liveInfo2.getCustom(44)) == null) ? 0 : i72Var.getInteger(2), java.lang.Boolean.TRUE);
                kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
                h0Var.f310123d = "";
                gk2.e eVar = mVar.f309130e;
                ((mm2.f6) eVar.a(mm2.f6.class)).f329037m = true;
                mm2.f6 f6Var = (mm2.f6) eVar.a(mm2.f6.class);
                if (((r45.y23) bw2Var5.getCustom(4)) != null) {
                    mm2.e1 e1Var = (mm2.e1) eVar.a(mm2.e1.class);
                    r45.av1 av1Var = new r45.av1();
                    av1Var.set(1, db2.t4.f228171a.a(6211));
                    av1Var.set(2, java.lang.Long.valueOf(e1Var.f328983m));
                    av1Var.set(3, java.lang.Long.valueOf(e1Var.f328988r.getLong(0)));
                    av1Var.set(4, e1Var.f328992v);
                    r45.y23 y23Var = (r45.y23) bw2Var5.getCustom(4);
                    av1Var.set(5, java.lang.Long.valueOf(y23Var != null ? y23Var.getLong(0) : 0L));
                    av1Var.set(10, 1177);
                    av1Var.set(7, ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Mj());
                    av1Var.d().l().K(new bt2.g(bw2Var5, mVar, h0Var));
                    r45.y23 y23Var2 = (r45.y23) bw2Var5.getCustom(4);
                    int integer = (y23Var2 == null || (hd5Var = (r45.hd5) y23Var2.getCustom(24)) == null) ? 0 : hd5Var.getInteger(2);
                    com.tencent.mm.protocal.protobuf.FinderObject finderObject3 = (com.tencent.mm.protocal.protobuf.FinderObject) bw2Var5.getCustom(0);
                    int integer2 = (finderObject3 == null || (liveInfo = finderObject3.getLiveInfo()) == null) ? 0 : liveInfo.getInteger(4);
                    if (integer > integer2) {
                        ((ct2.j) mVar.f309130e.a(ct2.j.class)).c7(integer - integer2);
                    }
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder("initReplayStartOffset replayBeginTime:");
                    sb8.append(integer);
                    sb8.append(",liveStartTime:");
                    sb8.append(integer2);
                    sb8.append(",replayStartOffset");
                    sb8.append(((ct2.j) mVar.f309130e.a(ct2.j.class)).f222268i);
                    sb8.append(",replayId:");
                    sb8.append(pm0.v.u(bw2Var5.getLong(3)));
                    sb8.append(",product_id:");
                    r45.y23 y23Var3 = (r45.y23) bw2Var5.getCustom(4);
                    sb8.append(y23Var3 != null ? java.lang.Long.valueOf(y23Var3.getLong(0)) : null);
                    com.tencent.mars.xlog.Log.i(pf5.o.TAG, sb8.toString());
                    r45.y23 y23Var4 = (r45.y23) bw2Var5.getCustom(4);
                    if (y23Var4 == null || (str = java.lang.Long.valueOf(y23Var4.getLong(0)).toString()) == null) {
                        str = "";
                    }
                    h0Var.f310123d = str;
                    r45.y23 y23Var5 = (r45.y23) bw2Var5.getCustom(4);
                    kotlin.jvm.internal.o.d(y23Var5);
                    tVar = new cm2.m0(y23Var5);
                    java.lang.String string2 = bw2Var5.getString(8);
                    if (string2 == null) {
                        string2 = "";
                    }
                    tVar.f43387f = string2;
                } else if (((r45.ov2) bw2Var5.getCustom(5)) != null) {
                    r45.ov2 ov2Var = (r45.ov2) bw2Var5.getCustom(5);
                    java.lang.String string3 = ov2Var != null ? ov2Var.getString(0) : null;
                    if (string3 == null) {
                        string3 = "";
                    }
                    h0Var.f310123d = string3;
                    r45.ov2 ov2Var2 = (r45.ov2) bw2Var5.getCustom(5);
                    kotlin.jvm.internal.o.d(ov2Var2);
                    tVar = new cm2.k0(ov2Var2);
                } else {
                    tVar = null;
                }
                f6Var.c7(tVar);
                r45.nw1 nw1Var = ((mm2.e1) mVar.f309130e.a(mm2.e1.class)).f328988r;
                java.lang.String string4 = bw2Var5.getString(2);
                nw1Var.set(29, string4 != null ? string4 : "");
                com.tencent.mm.plugin.finder.replay.shopping.FinderLiveShoppingReplayPluginLayout finderLiveShoppingReplayPluginLayout = this.f24191e;
                if (finderLiveShoppingReplayPluginLayout != null) {
                    finderLiveShoppingReplayPluginLayout.bindData(mVar);
                }
                com.tencent.mm.plugin.finder.replay.shopping.FinderLiveShoppingReplayPluginLayout finderLiveShoppingReplayPluginLayout2 = this.f24191e;
                if (finderLiveShoppingReplayPluginLayout2 != null && (buContext = finderLiveShoppingReplayPluginLayout2.getBuContext()) != null) {
                    ws2.k1 a17 = ws2.k1.f449066r.a();
                    zs2.a aVar = new zs2.a();
                    aVar.f475244a = false;
                    aVar.f475245b = false;
                    a17.o(buContext, aVar);
                }
                com.tencent.mm.plugin.finder.replay.shopping.FinderLiveShoppingReplayPluginLayout finderLiveShoppingReplayPluginLayout3 = this.f24191e;
                if (finderLiveShoppingReplayPluginLayout3 != null) {
                    finderLiveShoppingReplayPluginLayout3.r(false);
                }
                com.tencent.mm.plugin.finder.replay.shopping.FinderLiveShoppingReplayPluginLayout finderLiveShoppingReplayPluginLayout4 = this.f24191e;
                if (finderLiveShoppingReplayPluginLayout4 != null) {
                    finderLiveShoppingReplayPluginLayout4.mount();
                }
                ws2.k1.f449066r.a().p(this.f24191e, qs5.o.f366456i);
                if (((r45.y23) bw2Var5.getCustom(4)) == null) {
                    O6(mVar, (java.lang.String) h0Var.f310123d, bw2Var5);
                }
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        km2.m data;
        gk2.e eVar;
        r45.y23 y23Var;
        r45.y23 y23Var2;
        com.tencent.mm.plugin.finder.replay.shopping.FinderLiveShoppingReplayPluginLayout finderLiveShoppingReplayPluginLayout = this.f24191e;
        if (finderLiveShoppingReplayPluginLayout != null && (data = finderLiveShoppingReplayPluginLayout.getData()) != null && (eVar = data.f309130e) != null) {
            ct2.j jVar = (ct2.j) eVar.a(ct2.j.class);
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            ml2.f4 f4Var = ml2.f4.f327449w;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", 1009);
            jSONObject.put("sessionid", jVar.R6().f222255a);
            jSONObject.put("productid", jVar.R6().f222256b);
            r45.bw2 bw2Var = this.f24190d;
            if (bw2Var != null && (y23Var2 = (r45.y23) bw2Var.getCustom(4)) != null) {
                jSONObject.put("seckill", st2.g3.f412326a.v(y23Var2) ? 1 : 0);
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("during", android.os.SystemClock.elapsedRealtime() - jVar.f222266g);
            r45.bw2 bw2Var2 = this.f24190d;
            r0Var.Gj(f4Var, jSONObject, jSONObject2, (bw2Var2 == null || (y23Var = (r45.y23) bw2Var2.getCustom(4)) == null) ? null : y23Var.getString(17));
        }
        com.tencent.mm.plugin.finder.replay.shopping.FinderLiveShoppingReplayPluginLayout finderLiveShoppingReplayPluginLayout2 = this.f24191e;
        if (finderLiveShoppingReplayPluginLayout2 != null) {
            finderLiveShoppingReplayPluginLayout2.s();
        }
        com.tencent.mm.plugin.finder.replay.shopping.FinderLiveShoppingReplayPluginLayout finderLiveShoppingReplayPluginLayout3 = this.f24191e;
        if (finderLiveShoppingReplayPluginLayout3 != null) {
            finderLiveShoppingReplayPluginLayout3.unMount();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView;
        com.tencent.mm.plugin.finder.replay.shopping.FinderLiveShoppingReplayPluginLayout finderLiveShoppingReplayPluginLayout = this.f24191e;
        if (finderLiveShoppingReplayPluginLayout != null) {
            ws2.o shoppingReplayBaseUIC = finderLiveShoppingReplayPluginLayout.getShoppingReplayBaseUIC();
            if (shoppingReplayBaseUIC.f449112h) {
                com.tencent.mars.xlog.Log.i("FinderLiveReplayBaseUIC", "resume");
                at2.u1 u1Var = shoppingReplayBaseUIC.f449109e;
                if (u1Var != null) {
                    u1Var.v1(null, false);
                }
                at2.y1 y1Var = shoppingReplayBaseUIC.f449111g;
                androidx.appcompat.app.AppCompatActivity appCompatActivity = shoppingReplayBaseUIC.f449092b;
                if (y1Var != null && (weImageView = y1Var.f13782r) != null) {
                    android.graphics.drawable.Drawable drawable = appCompatActivity.getDrawable(com.tencent.mm.R.raw.icons_filled_pause);
                    com.tencent.mm.ui.uk.f(drawable, -1);
                    weImageView.setImageDrawable(drawable);
                }
                at2.y1 y1Var2 = shoppingReplayBaseUIC.f449111g;
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = y1Var2 != null ? y1Var2.f13782r : null;
                if (weImageView2 == null) {
                    return;
                }
                weImageView2.setContentDescription(appCompatActivity.getString(com.tencent.mm.R.string.eaz));
            }
        }
    }
}
