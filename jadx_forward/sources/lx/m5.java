package lx;

/* loaded from: classes11.dex */
public final class m5 implements com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23205x83e1a3de, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f403401d;

    /* renamed from: e, reason: collision with root package name */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 f403402e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f403403f;

    /* renamed from: g, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.ActivityResultListener f403404g = new lx.c5(this);

    public static final /* synthetic */ java.lang.String a(lx.m5 m5Var) {
        m5Var.getClass();
        return "MicroMsg.FlutterBizPublishPlugin";
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23205x83e1a3de
    /* renamed from: bindPhone */
    public void mo85310xc7b84731(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        android.app.Activity activity = this.f403401d;
        if (activity == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterBizPublishPlugin", "bindPhone: activity is null");
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE)));
        } else if (((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.c()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizPublishPlugin", "bindPhone: already bound");
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE)));
        } else {
            this.f403403f = callback;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("back_to_status", false);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.h(activity, intent, 2001);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizPublishPlugin", "bindPhone: startBindMcontactWizard");
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23205x83e1a3de
    /* renamed from: checkWCPayIsReg */
    public void mo85311xf81cd136(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizPublishPlugin", "checkWCPayIsReg");
        gm0.j1.d().a(385, new lx.d5(this, callback));
        ((li3.g) ((h45.s) i95.n0.c(h45.s.class))).Ui(0);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23205x83e1a3de
    /* renamed from: compressPublishImage */
    public void mo85312xd8652a0e(java.lang.String dstPath, java.lang.String origPath, long j17, long j18, long j19, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dstPath, "dstPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(origPath, "origPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        ((ku5.t0) ku5.t0.f394148d).h(new lx.e5(this, dstPath, origPath, j17, j18, j19, callback), "compressPublishImage");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23205x83e1a3de
    /* renamed from: getBizPublishCacheDirectory */
    public java.lang.String mo85313x25ef221d() {
        return "";
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23205x83e1a3de
    /* renamed from: isUserBindOpMobile */
    public boolean mo85314x1ec77df5() {
        boolean c17 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizPublishPlugin", "isUserBindOpMobile: " + c17);
        return c17;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23205x83e1a3de
    /* renamed from: launchMapMiniProgramWithCallback */
    public void mo85315xedb77b0f(com.p314xaae8f345.p2845xc516c4b6.biz.C23286x663f54ee launchInfo, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(launchInfo, "launchInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.lang.String m85896x74292946 = launchInfo.m85896x74292946();
        java.lang.String str = m85896x74292946 == null ? "" : m85896x74292946;
        java.lang.String m85902x6c03c64c = launchInfo.m85902x6c03c64c();
        if (m85902x6c03c64c == null) {
            m85902x6c03c64c = "";
        }
        java.lang.String m85898xfb83cc9b = launchInfo.m85898xfb83cc9b();
        if (m85898xfb83cc9b == null) {
            m85898xfb83cc9b = "";
        }
        java.lang.Long m85900x7520bed6 = launchInfo.m85900x7520bed6();
        int longValue = m85900x7520bed6 != null ? (int) m85900x7520bed6.longValue() : 0;
        java.lang.String m85901x6a417fbb = launchInfo.m85901x6a417fbb();
        if (m85901x6a417fbb == null) {
            m85901x6a417fbb = "";
        }
        java.lang.String m85897x1accd66f = launchInfo.m85897x1accd66f();
        if (m85897x1accd66f == null) {
            m85897x1accd66f = "";
        }
        java.lang.String m85899xde273c00 = launchInfo.m85899xde273c00();
        java.lang.String str2 = m85899xde273c00 != null ? m85899xde273c00 : "";
        java.lang.Long m85895xa414d384 = launchInfo.m85895xa414d384();
        int longValue2 = m85895xa414d384 != null ? (int) m85895xa414d384.longValue() : 0;
        java.lang.Long m85903x2e93afc = launchInfo.m85903x2e93afc();
        int longValue3 = m85903x2e93afc != null ? (int) m85903x2e93afc.longValue() : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizPublishPlugin", "launchMapMiniProgramWithCallback: appid=" + str + ", username=" + m85902x6c03c64c + ", path=" + m85898xfb83cc9b + ", scene=" + longValue + ", appVersion=" + longValue2 + ", versionType=" + longValue3);
        android.app.Activity activity = this.f403401d;
        if (activity == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterBizPublishPlugin", "launchMapMiniProgramWithCallback: activity is null");
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.Exception("activity is null")))));
            return;
        }
        l81.b1 b1Var = new l81.b1();
        b1Var.f398547b = str;
        b1Var.f398545a = m85902x6c03c64c;
        b1Var.f398555f = m85898xfb83cc9b;
        b1Var.f398565k = longValue;
        b1Var.f398567l = m85901x6a417fbb;
        b1Var.f398561i = new lx.f5(m85897x1accd66f);
        b1Var.f398549c = longValue3;
        b1Var.H = k91.z3.TRANSPARENT;
        k91.y3 y3Var = k91.y3.DISABLED;
        b1Var.S = y3Var;
        b1Var.T = y3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98();
        b1Var.f398574s = c11812xa040dc98;
        c11812xa040dc98.f158856e = str;
        c11812xa040dc98.f158857f = str2;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(activity, b1Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        lx.h5 h5Var = new lx.h5(c0Var, callback);
        lx.i5 i5Var = new lx.i5(this, str, h5Var);
        ((xc1.t) ((ft.q4) i95.n0.c(ft.q4.class))).wi(str, i5Var);
        new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new lx.g5(c0Var, this, str, i5Var, h5Var), 300000L);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23205x83e1a3de
    /* renamed from: notifyBizPublishResult */
    public void mo85316x51d3fd22(com.p314xaae8f345.p2845xc516c4b6.biz.C23225x7fed2801 result, yz5.l callback) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizPublishPlugin", "notifyBizPublishResult, " + result);
        rv.e3 e3Var = yw.x1.f548040a;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (e3Var != null) {
            ox.z zVar = (ox.z) ((tk.r) i95.n0.c(tk.r.class));
            zVar.getClass();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.lang.Boolean m85461xce827bcd = result.m85461xce827bcd();
            if (m85461xce827bcd != null) {
                boolean booleanValue = m85461xce827bcd.booleanValue();
                java.lang.Object obj = ya.b.f77504xbb80cbe3;
                jSONObject.put(ya.b.f77504xbb80cbe3, booleanValue);
                if (!booleanValue) {
                    obj = "fail";
                }
                jSONObject.put("status", obj);
            }
            java.lang.Object m85460x2d5cb53a = result.m85460x2d5cb53a();
            if (m85460x2d5cb53a != null) {
                jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562, m85460x2d5cb53a);
            }
            java.lang.Boolean m85462x8e38a67d = result.m85462x8e38a67d();
            if (m85462x8e38a67d != null) {
                jSONObject.put("initSuccess", m85462x8e38a67d.booleanValue());
            }
            java.lang.Object m85463x7531c8a2 = result.m85463x7531c8a2();
            if (m85463x7531c8a2 != null) {
                jSONObject.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, m85463x7531c8a2);
            }
            java.lang.Object m85458x8010e5e4 = result.m85458x8010e5e4();
            if (m85458x8010e5e4 != null) {
                jSONObject.put("nickname", m85458x8010e5e4);
            }
            java.lang.Object m85455x1149e44f = result.m85455x1149e44f();
            if (m85455x1149e44f != null) {
                jSONObject.put("avatar", m85455x1149e44f);
            }
            java.lang.Object m85464xb5887639 = result.m85464xb5887639();
            if (m85464xb5887639 != null) {
                jSONObject.put("url", m85464xb5887639);
            }
            java.util.List<com.p314xaae8f345.p2845xc516c4b6.biz.C23224xb35c11ea> m85457x9948173c = result.m85457x9948173c();
            if (m85457x9948173c != null) {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                for (com.p314xaae8f345.p2845xc516c4b6.biz.C23224xb35c11ea c23224xb35c11ea : m85457x9948173c) {
                    if (c23224xb35c11ea != null) {
                        jSONArray.put(zVar.aj(c23224xb35c11ea, "cdnUrl"));
                    }
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put("imagesInfo", jSONArray);
                }
            }
            com.p314xaae8f345.p2845xc516c4b6.biz.C23224xb35c11ea m85456x7568ea4f = result.m85456x7568ea4f();
            if (m85456x7568ea4f != null) {
                org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                jSONArray2.put(zVar.aj(m85456x7568ea4f, "cdn_url"));
                jSONObject.put("coverInfo", jSONArray2);
            }
            com.p314xaae8f345.p2845xc516c4b6.biz.C23222x65c63203 m85459x25db91e2 = result.m85459x25db91e2();
            if (m85459x25db91e2 != null) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                java.lang.String m85415xfb82e301 = m85459x25db91e2.m85415xfb82e301();
                if (m85415xfb82e301 != null) {
                    jSONObject2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, m85415xfb82e301);
                }
                java.lang.String m85411xf964d7be = m85459x25db91e2.m85411xf964d7be();
                if (m85411xf964d7be != null) {
                    jSONObject2.put("address", m85411xf964d7be);
                }
                java.lang.String m85412x95fb493f = m85459x25db91e2.m85412x95fb493f();
                if (m85412x95fb493f != null) {
                    jSONObject2.put("districtid", m85412x95fb493f);
                }
                java.lang.Double m85413x2605e9e2 = m85459x25db91e2.m85413x2605e9e2();
                if (m85413x2605e9e2 != null) {
                    jSONObject2.put("latitude", m85413x2605e9e2.doubleValue());
                }
                java.lang.Double m85414x79d7af9 = m85459x25db91e2.m85414x79d7af9();
                if (m85414x79d7af9 != null) {
                    jSONObject2.put("longitude", m85414x79d7af9.doubleValue());
                }
                java.lang.String m85416x74fbf74f = m85459x25db91e2.m85416x74fbf74f();
                if (m85416x74fbf74f != null) {
                    jSONObject2.put("poiid", m85416x74fbf74f);
                }
                jSONObject.put("poiInfo", jSONObject2);
            }
            com.p314xaae8f345.p2845xc516c4b6.biz.C23220x7a5689c7 m85454x81d1c160 = result.m85454x81d1c160();
            if (m85454x81d1c160 != null) {
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                java.lang.String m85364x7531c8a2 = m85454x81d1c160.m85364x7531c8a2();
                if (m85364x7531c8a2 != null) {
                    jSONObject3.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, m85364x7531c8a2);
                }
                java.lang.String m85362xf2fcfe2b = m85454x81d1c160.m85362xf2fcfe2b();
                if (m85362xf2fcfe2b != null) {
                    jSONObject3.put("jump_url", m85362xf2fcfe2b);
                }
                com.p314xaae8f345.p2845xc516c4b6.biz.C23224xb35c11ea m85363x8df6cd96 = m85454x81d1c160.m85363x8df6cd96();
                if (m85363x8df6cd96 != null) {
                    jSONObject3.put("picture_info", zVar.aj(m85363x8df6cd96, "cdn_url"));
                }
                com.p314xaae8f345.p2845xc516c4b6.biz.C23219x22c1aca8 m85361x37f6d02b = m85454x81d1c160.m85361x37f6d02b();
                if (m85361x37f6d02b != null) {
                    org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                    java.lang.String m85347x8010e5e4 = m85361x37f6d02b.m85347x8010e5e4();
                    if (m85347x8010e5e4 != null) {
                        jSONObject4.put("nick_name", m85347x8010e5e4);
                    }
                    java.lang.String m85345x341984a2 = m85361x37f6d02b.m85345x341984a2();
                    if (m85345x341984a2 != null) {
                        jSONObject4.put("headimgurl", m85345x341984a2);
                    }
                    java.lang.String m85348x6c03c64c = m85361x37f6d02b.m85348x6c03c64c();
                    if (m85348x6c03c64c != null) {
                        jSONObject4.put("user_name", m85348x6c03c64c);
                    }
                    java.lang.String m85344x1252753d = m85361x37f6d02b.m85344x1252753d();
                    if (m85344x1252753d != null) {
                        jSONObject4.put("bizuin", m85344x1252753d);
                    }
                    java.lang.String m85343xc077d451 = m85361x37f6d02b.m85343xc077d451();
                    if (m85343xc077d451 != null) {
                        jSONObject4.put("appmsgid", m85343xc077d451);
                    }
                    java.lang.Long m85346xb5884787 = m85361x37f6d02b.m85346xb5884787();
                    if (m85346xb5884787 != null) {
                        jSONObject4.put("idx", m85346xb5884787.longValue());
                    }
                    jSONObject3.put("biz_info", jSONObject4);
                }
                jSONObject.put("appMsgData", jSONObject3);
            }
            e3Var.a(result, jSONObject);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterPublishHelper", "mCallback is null, ignore notifyBizPublishResult");
        }
        yw.x1.f548040a = null;
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var2)));
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f403401d = binding.mo137508x19263085();
        this.f403402e = binding;
        binding.mo137502xbf77c2e1(this.f403404g);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23205x83e1a3de.Companion companion = com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23205x83e1a3de.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23205x83e1a3de.Companion.m85322x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 interfaceC28627xb16524e3 = this.f403402e;
        if (interfaceC28627xb16524e3 != null) {
            interfaceC28627xb16524e3.mo137517xa002e684(this.f403404g);
        }
        this.f403402e = null;
        this.f403401d = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 interfaceC28627xb16524e3 = this.f403402e;
        if (interfaceC28627xb16524e3 != null) {
            interfaceC28627xb16524e3.mo137517xa002e684(this.f403404g);
        }
        this.f403402e = null;
        this.f403401d = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23205x83e1a3de.Companion companion = com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23205x83e1a3de.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23205x83e1a3de.Companion.m85322x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f403401d = binding.mo137508x19263085();
        this.f403402e = binding;
        binding.mo137502xbf77c2e1(this.f403404g);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23205x83e1a3de
    /* renamed from: openRedPacketCoverLiteApp */
    public void mo85317xbadf25cb(java.lang.String appId, java.lang.String page, java.util.Map query, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(page, "page");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizPublishPlugin", "openRedPacketCoverLiteApp: appId=" + appId + ", page=" + page + ", query=" + query);
        android.app.Activity activity = this.f403401d;
        if (activity == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterBizPublishPlugin", "openRedPacketCoverLiteApp: activity is null");
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.Exception("activity is null")))));
            return;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = query.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (((java.lang.String) entry.getKey()) != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kz5.b1.d(linkedHashMap.size()));
        for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
            java.lang.Object key = entry2.getKey();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(key);
            linkedHashMap2.put((java.lang.String) key, entry2.getValue());
        }
        java.lang.String jSONObject = new org.json.JSONObject(linkedHashMap2).toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        final lx.k5 k5Var = new lx.k5(new p3321xbce91901.jvm.p3324x21ffc6bd.c0(), callback);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16190x27388f34 c16190x27388f34 = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16190x27388f34();
        c16190x27388f34.f224944e = 0.75d;
        c16190x27388f34.f224947h = true;
        c16190x27388f34.f224949m = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16191xaf149588() { // from class: com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPublishPlugin$openRedPacketCoverLiteApp$halfScreenConfig$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(java.lang.Boolean.FALSE);
            }

            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16191xaf149588
            public void d() {
                lx.m5.a(lx.m5.this);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizPublishPlugin", "openRedPacketCoverLiteApp: halfScreen onDestroy");
                k5Var.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813("")));
            }
        };
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", appId);
        bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, page);
        bundle.putString("query", jSONObject);
        bundle.putBoolean("isHalfScreen", true);
        bundle.putParcelable("halfScreenConfig", c16190x27388f34);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s();
        sVar.f225700d = new lx.l5(this, k5Var);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).jk(activity, bundle, true, false, sVar, new lx.j5(this, k5Var));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23205x83e1a3de
    /* renamed from: openUrl */
    public void mo85318xb4b50ac5(com.p314xaae8f345.p2845xc516c4b6.biz.C23221x4ecc6088 articleInfo, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(articleInfo, "articleInfo");
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23335x4dbe57d1 c23335x4dbe57d1 = new com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23335x4dbe57d1(articleInfo.m85390x74d37ac6(), null, null, null, articleInfo.m85392x5ae7d1ac(), articleInfo.m85393xff358fa2(), articleInfo.m85395xb5887639(), articleInfo.m85388x7235c680(), articleInfo.m85396x6bf53a6c(), articleInfo.m85391x80025a04(), articleInfo.m85394x7531c8a2(), articleInfo.m85386x66e287ae(), null, null, null, articleInfo.m85385x6b6d78f4(), articleInfo.m85389x27681aaa(), articleInfo.m85387x6de99b06(), 28686, null);
        yw.h1 h1Var = yw.h1.f547865a;
        android.content.Context context = this.f403401d;
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        h1Var.s(c23335x4dbe57d1, context);
        if (z17) {
            android.app.Activity activity = this.f403401d;
            if (activity != null) {
                activity.finish();
            }
            android.app.Activity activity2 = this.f403401d;
            if (activity2 != null) {
                activity2.overridePendingTransition(0, 0);
            }
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23205x83e1a3de
    /* renamed from: requestPublishPicLocationPermission */
    public boolean mo85319x29352eee() {
        return false;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23205x83e1a3de
    /* renamed from: setNativeEditorDebugMode */
    public void mo85320x8e2c0750(long j17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var;
        int i17 = (int) j17;
        ((ox.z) ((tk.r) i95.n0.c(tk.r.class))).getClass();
        ox.z.f431074h = i17;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) {
            try {
                java.util.Set set = ox.z.f431071e;
                try {
                    o4Var = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("biz_publish_debug");
                } catch (java.lang.Throwable unused) {
                    o4Var = null;
                }
                if (o4Var != null) {
                    o4Var.putInt("k_native_editor_debug_mode", i17);
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizPublishRichEditorService", "setDebugNativeEditorMode persist error: " + th6);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPublishRichEditorService", "setDebugNativeEditorMode: " + i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizPublishPlugin", "setNativeEditorDebugMode via pigeon: " + i17);
    }
}
