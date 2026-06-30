package com.tencent.mm.feature.finder.live;

@j95.b
/* loaded from: classes3.dex */
public final class v4 extends l85.m1 implements s40.w0 {
    public final jz5.g A;
    public final jz5.g B;
    public final jz5.g C;
    public final jz5.g D;
    public final jz5.g E;
    public final jz5.g F;
    public final java.util.LinkedHashMap G;
    public final java.util.Map H;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f66986g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f66987h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f66988i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f66989m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f66990n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f66991o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.feature.finder.live.q1 f66992p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.r2 f66993q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.Stack f66994r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f66995s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f66996t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f66997u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f66998v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f66999w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f67000x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f67001y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f67002z;

    public v4() {
        super("PluginFinderLive");
        this.f66986g = new java.util.concurrent.ConcurrentHashMap();
        this.f66987h = new java.util.concurrent.ConcurrentHashMap();
        this.f66988i = new java.util.concurrent.ConcurrentHashMap();
        this.f66989m = new java.util.concurrent.ConcurrentHashMap();
        this.f66990n = new com.tencent.mm.sdk.platformtools.n3("FinderLiveInfoHandler");
        this.f66993q = new com.tencent.mm.sdk.platformtools.r2(500);
        this.f66994r = new java.util.Stack();
        this.f66995s = jz5.h.b(new com.tencent.mm.feature.finder.live.d4(this));
        this.f66996t = jz5.h.b(new com.tencent.mm.feature.finder.live.f4(this));
        this.f66997u = jz5.h.b(new com.tencent.mm.feature.finder.live.e4(this));
        this.f66998v = jz5.h.b(new com.tencent.mm.feature.finder.live.a4(this));
        this.f66999w = jz5.h.b(new com.tencent.mm.feature.finder.live.g4(this));
        this.f67000x = jz5.h.b(new com.tencent.mm.feature.finder.live.z3(this));
        this.f67001y = jz5.h.b(new com.tencent.mm.feature.finder.live.o3(this));
        this.f67002z = jz5.h.b(new com.tencent.mm.feature.finder.live.q3(this));
        this.A = jz5.h.b(new com.tencent.mm.feature.finder.live.b4(this));
        this.B = jz5.h.b(new com.tencent.mm.feature.finder.live.c4(this));
        this.C = jz5.h.b(new com.tencent.mm.feature.finder.live.n3(this));
        this.D = jz5.h.b(new com.tencent.mm.feature.finder.live.m3(this));
        this.E = jz5.h.b(new com.tencent.mm.feature.finder.live.p3(this));
        this.F = jz5.h.b(com.tencent.mm.feature.finder.live.h4.f66750d);
        this.G = new java.util.LinkedHashMap();
        this.H = new java.util.LinkedHashMap();
    }

    public static final void Ai(com.tencent.mm.feature.finder.live.v4 v4Var, com.tencent.mm.protocal.protobuf.FinderObject finderObject, android.content.Context context, java.lang.String str, int i17, int i18, int i19, java.lang.String str2, zy2.i5 i5Var, zy2.i5 i5Var2) {
        r45.nw1 liveInfo;
        v4Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", "getOpenFinderLiveReplay errCode:" + i19 + " errType:" + i18 + " errMsg:" + str2);
        if (i18 != 0 || i19 != 0) {
            if (i5Var2 != null) {
                i5Var2.a(java.lang.Integer.valueOf(com.tencent.live.TXLivePluginDef.ErrorCode.CODE_PARAMTYPEERROR));
                return;
            }
            return;
        }
        java.lang.String str3 = null;
        boolean bj6 = ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).bj(finderObject != null ? finderObject.getUsername() : null, finderObject != null ? finderObject.getLiveInfo() : null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("autoOpenFinderLiveReplay isReplayLive:");
        sb6.append(bj6);
        sb6.append(',');
        if (finderObject != null && (liveInfo = finderObject.getLiveInfo()) != null) {
            str3 = cm2.a.f43328a.y(liveInfo);
        }
        sb6.append(str3);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", sb6.toString());
        if (!bj6) {
            if (i5Var2 != null) {
                i5Var2.a(java.lang.Integer.valueOf(com.tencent.live.TXLivePluginDef.ErrorCode.CODE_PARAMNOTFOUND));
            }
        } else {
            pm0.v.X(new com.tencent.mm.feature.finder.live.x1(v4Var, finderObject, i17, str, context));
            if (i5Var != null) {
                i5Var.a(0);
            }
        }
    }

    public static final l75.k0 Bi(com.tencent.mm.feature.finder.live.v4 v4Var) {
        v4Var.getClass();
        return ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Nj(com.tencent.mm.plugin.finder.storage.v80.f128178d);
    }

    public static final java.lang.String bj(android.hardware.camera2.CameraManager cameraManager, int i17) {
        java.lang.String str;
        java.lang.String[] cameraIdList = cameraManager.getCameraIdList();
        kotlin.jvm.internal.o.f(cameraIdList, "getCameraIdList(...)");
        int length = cameraIdList.length;
        int i18 = 0;
        while (true) {
            if (i18 >= length) {
                str = null;
                break;
            }
            str = cameraIdList[i18];
            android.hardware.camera2.CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            kotlin.jvm.internal.o.f(cameraCharacteristics, "getCameraCharacteristics(...)");
            java.lang.Integer num = (java.lang.Integer) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == i17) {
                break;
            }
            i18++;
        }
        if (str != null) {
            return str;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.FinderLiveFeatureService", "can not find the id: %s in camera manage", java.lang.Integer.valueOf(i17));
        return java.lang.String.valueOf(i17);
    }

    public static final int cj(android.hardware.camera2.CameraCharacteristics cameraCharacteristics) {
        int[] iArr = (int[]) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            if ((!(iArr.length == 0)) && kz5.z.F(iArr, 1)) {
                return 1;
            }
        }
        return 0;
    }

    public static final int fj(android.hardware.camera2.CameraCharacteristics cameraCharacteristics) {
        int[] iArr = (int[]) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
        if (iArr != null) {
            if ((!(iArr.length == 0)) && kz5.z.F(iArr, 1)) {
                return 1;
            }
        }
        return 0;
    }

    public static final void tj(java.lang.Integer num, java.util.List list, java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.mm.feature.finder.live.v4 v4Var, com.tencent.mm.protocal.protobuf.FinderObject finderObject, java.lang.String str4, long j17) {
        r45.q82 q82Var;
        java.lang.String string;
        int i17 = 1;
        java.lang.String str5 = (num != null && num.intValue() == 1) ? "mmbiz_oftenread_bar" : (num != null && num.intValue() == 2) ? "mmbiz_live_bar" : (num != null && num.intValue() == 3) ? "mmbiz_tl" : (num != null && num.intValue() == 4) ? "mmbiz_message" : (num != null && num.intValue() == 8) ? "mmbiz_profile" : (num != null && num.intValue() == 9) ? "mmbiz_article" : (num != null && num.intValue() == 11) ? "mmbiz_big_card" : (num != null && num.intValue() == 12) ? "mmbiz_first_card" : (num != null && num.intValue() == 13) ? "mmbiz_second_card" : (num != null && num.intValue() == 14) ? "mmbiz_his_card" : (num != null && num.intValue() == 15) ? "mmbiz_sideways" : (num != null && num.intValue() == 17) ? "mmbiz_subscribe" : (num != null && num.intValue() == 20) ? "mmbiz_oftenread_bar_list" : (num != null && num.intValue() == 18) ? "fouce" : (num != null && num.intValue() == 19) ? "recmd" : (num != null && num.intValue() == 21) ? "fouce_hori" : "";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.lang.String str6 = (java.lang.String) it.next();
                sb6.append(str6);
                sb6.append(",");
                arrayList.add(str6);
            }
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_enter_live_export_id", str == null ? "" : str);
        intent.putExtra("key_enter_live_param_visitor_enter_scene", 4);
        intent.putExtra("key_enter_live_param_pull_more_type", 1);
        intent.putStringArrayListExtra("key_enter_live_export_id_list", arrayList);
        if (!(sb6.length() == 0)) {
            intent.putExtra("key_enter_live_param_by_pass_type", 3);
            intent.putExtra("key_enter_live_param_by_pass_info", sb6.toString());
        }
        if ((num != null && num.intValue() == 18) || ((num != null && num.intValue() == 19) || (num != null && num.intValue() == 21))) {
            n30.q qVar = (n30.q) i95.n0.c(n30.q.class);
            ml2.q1 q1Var = ml2.q1.f327812e;
            ((m30.m) qVar).getClass();
            a52.a.d("341");
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            ml2.y4 y4Var = ml2.j0.f327583i;
            y4Var.getClass();
            y4Var.f328286a = "341";
            intent.putExtra("key_enter_live_param_by_pass_type", 8);
        } else {
            n30.q qVar2 = (n30.q) i95.n0.c(n30.q.class);
            ml2.q1 q1Var2 = ml2.q1.f327812e;
            ((m30.m) qVar2).getClass();
            a52.a.d("temp_12");
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            ml2.y4 y4Var2 = ml2.j0.f327583i;
            y4Var2.getClass();
            y4Var2.f328286a = "temp_12";
        }
        cl0.g gVar = new cl0.g();
        try {
            gVar.s("bizusername", str2);
            gVar.s("exposeType", str5);
            gVar.s("finder_username", finderObject.getUsername());
            gVar.s("wx_username", str2);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FinderLiveFeatureService", "err:" + e17.getMessage());
        }
        intent.putExtra("key_chnl_extra", gVar.toString());
        java.lang.String sessionBuffer = str3 == null || str3.length() == 0 ? finderObject.getSessionBuffer() : str3;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        long id6 = finderObject.getId();
        r45.nw1 liveInfo = finderObject.getLiveInfo();
        java.lang.Long valueOf = java.lang.Long.valueOf(liveInfo != null ? liveInfo.getLong(0) : 0L);
        java.lang.String objectNonceId = finderObject.getObjectNonceId();
        java.lang.String str7 = objectNonceId == null ? "" : objectNonceId;
        r45.nw1 liveInfo2 = finderObject.getLiveInfo();
        java.lang.String str8 = (liveInfo2 == null || (string = liveInfo2.getString(3)) == null) ? "" : string;
        r45.nw1 liveInfo3 = finderObject.getLiveInfo();
        if (liveInfo3 != null && (q82Var = (r45.q82) liveInfo3.getCustom(9)) != null) {
            i17 = q82Var.getInteger(0);
        }
        v4Var.uj(intent, context, id6, valueOf, "", str7, "", str4, sessionBuffer, "", 0, str8, i17, true, j17, java.lang.Integer.valueOf(num != null ? num.intValue() : 0));
    }

    public static final void zj(android.widget.TextView textView, float f17, boolean z17) {
        if (textView != null) {
            textView.setPaddingRelative(0, 0, z17 ? i65.a.a(textView.getContext(), f17) : 0, 0);
        }
    }

    public void Aj(android.widget.ImageView imageView, java.lang.String str, float f17, yz5.l lVar) {
        if (imageView == null) {
            if (lVar != null) {
                lVar.invoke(null);
                return;
            }
            return;
        }
        if (str == null || str.length() == 0) {
            if (lVar != null) {
                lVar.invoke(null);
            }
            imageView.setVisibility(8);
        } else {
            mn2.g1 g1Var = mn2.g1.f329975a;
            wo0.c b17 = g1Var.e().b(new mn2.q3(str, com.tencent.mm.plugin.finder.storage.y90.f128355e), g1Var.h(mn2.f1.f329965s));
            com.tencent.mm.feature.finder.live.l3 l3Var = new com.tencent.mm.feature.finder.live.l3(imageView, lVar);
            b17.getClass();
            b17.f447873d = l3Var;
            b17.f();
        }
    }

    public void Ak(long j17, java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        this.f66993q.put(java.lang.Long.valueOf(j17), url);
        java.util.Stack stack = this.f66994r;
        try {
            if (stack.size() > 10) {
                kz5.h0.C(stack);
            }
            stack.add(new jz5.l(java.lang.Long.valueOf(j17), url));
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.util.Iterator it = stack.iterator();
            while (it.hasNext()) {
                jz5.l lVar = (jz5.l) it.next();
                jSONObject.put(java.lang.String.valueOf(((java.lang.Number) lVar.f302833d).longValue()), lVar.f302834e);
            }
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_COVER_URL_CACHE_STRING_SYNC, jSONObject.toString());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", "putCoverUrl " + e17);
        }
    }

    public android.content.Intent Bj(android.content.Intent intent, com.tencent.mm.storage.f9 msgInfo, r45.md5 md5Var) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        com.tencent.mm.plugin.finder.live.viewmodel.z9 z9Var = com.tencent.mm.plugin.finder.live.viewmodel.aa.f116905h;
        c00.c3 c3Var = (c00.c3) i95.n0.c(c00.c3.class);
        java.lang.String wi6 = c3Var != null ? ((b00.u) c3Var).wi(msgInfo) : "";
        if (intent == null) {
            intent = new android.content.Intent();
        }
        z9Var.a(intent, wi6, md5Var);
        return intent;
    }

    public void Bk(long j17) {
        this.f66990n.post(new com.tencent.mm.feature.finder.live.m4(j17, this));
    }

    public android.content.Intent Cj(android.content.Intent intent, java.lang.String str, r45.md5 md5Var) {
        com.tencent.mm.plugin.finder.live.viewmodel.z9 z9Var = com.tencent.mm.plugin.finder.live.viewmodel.aa.f116905h;
        if (intent == null) {
            intent = new android.content.Intent();
        }
        z9Var.a(intent, str, md5Var);
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.content.Intent Ck(android.content.Intent r6, java.lang.String r7, long r8) {
        /*
            r5 = this;
            if (r6 != 0) goto L7
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
        L7:
            r45.md5 r0 = new r45.md5
            r0.<init>()
            java.lang.String r1 = "FINDER_PRODUCT_TRACE_EXTRA_INFO"
            byte[] r2 = r6.getByteArrayExtra(r1)
            java.lang.String r3 = ""
            if (r2 != 0) goto L17
            goto L25
        L17:
            r0.parseFrom(r2)     // Catch: java.lang.Exception -> L1b
            goto L26
        L1b:
            r0 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "safeParser"
            com.tencent.mm.sdk.platformtools.Log.a(r2, r3, r0)
        L25:
            r0 = 0
        L26:
            r2 = 1
            if (r0 == 0) goto L42
            r4 = 2
            java.lang.String r4 = r0.getString(r4)
            boolean r7 = kotlin.jvm.internal.o.b(r4, r7)
            if (r7 == 0) goto L42
            java.lang.Long r7 = java.lang.Long.valueOf(r8)
            r0.set(r2, r7)
            byte[] r7 = r0.toByteArray()
            r6.putExtra(r1, r7)
        L42:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "replaceTraceInfoToIntent traceExtraInfo:"
            r7.<init>(r8)
            if (r0 != 0) goto L4c
            goto L73
        L4c:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "feedId:"
            r8.<init>(r9)
            r9 = 0
            long r3 = r0.getLong(r9)
            java.lang.String r9 = pm0.v.u(r3)
            r8.append(r9)
            java.lang.String r9 = ", liveId:"
            r8.append(r9)
            long r0 = r0.getLong(r2)
            java.lang.String r9 = pm0.v.u(r0)
            r8.append(r9)
            java.lang.String r3 = r8.toString()
        L73:
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "Finder.FinderProductTraceUIC"
            com.tencent.mars.xlog.Log.i(r8, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.finder.live.v4.Ck(android.content.Intent, java.lang.String, long):android.content.Intent");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Di(org.json.JSONObject r37, java.lang.String r38, android.content.Context r39, zy2.i5 r40, zy2.i5 r41) {
        /*
            Method dump skipped, instructions count: 679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.finder.live.v4.Di(org.json.JSONObject, java.lang.String, android.content.Context, zy2.i5, zy2.i5):void");
    }

    public l81.b1 Dj(java.lang.String str, l81.b1 bundle) {
        kotlin.jvm.internal.o.g(bundle, "bundle");
        l81.p0 p0Var = bundle.f317028i;
        dk2.ah ahVar = p0Var instanceof dk2.ah ? (dk2.ah) p0Var : null;
        if (ahVar == null) {
            ahVar = new dk2.ah();
        }
        ahVar.f233225u = str == null ? "" : str;
        com.tencent.mars.xlog.Log.i("Finder.FinderProductTraceUIC", "fillTraceInfoToWeApp lastGMsgId:" + str + ", ");
        bundle.f317028i = ahVar;
        return bundle;
    }

    public void Dk(android.content.Context context, java.lang.String jsonStr, zy2.i5 didOpenCallback, zy2.i5 failCallback, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jsonStr, "jsonStr");
        kotlin.jvm.internal.o.g(didOpenCallback, "didOpenCallback");
        kotlin.jvm.internal.o.g(failCallback, "failCallback");
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.finder.feed.nd ndVar = com.tencent.mm.plugin.finder.feed.nd.f108570a;
        com.tencent.mm.plugin.finder.feed.nd.f108571b = new com.tencent.mm.feature.finder.live.p4(didOpenCallback);
        com.tencent.mm.plugin.finder.feed.nd.f108572c = new com.tencent.mm.feature.finder.live.q4(failCallback);
        intent.addFlags(268435456);
        intent.putExtra("finder_jump_data", jsonStr);
        intent.putExtra("finder_jump_type", 1);
        intent.putExtra("is_from_app_brand", z17);
        intent.setClass(context, com.tencent.mm.plugin.finder.feed.ui.FinderH5JumpEmptyUI.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/finder/live/FinderLiveFeatureService", "reserveChannelsConcert", "(Landroid/content/Context;Ljava/lang/String;Lcom/tencent/mm/plugin/findersdk/api/ICallback;Lcom/tencent/mm/plugin/findersdk/api/ICallback;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/feature/finder/live/FinderLiveFeatureService", "reserveChannelsConcert", "(Landroid/content/Context;Ljava/lang/String;Lcom/tencent/mm/plugin/findersdk/api/ICallback;Lcom/tencent/mm/plugin/findersdk/api/ICallback;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Ej(java.lang.String r9, java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.finder.live.v4.Ej(java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public void Ek() {
        r45.nw1 nw1Var;
        com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = new com.tencent.mm.autogen.events.FeedUpdateEvent();
        am.ia iaVar = feedUpdateEvent.f54252g;
        if (iaVar != null) {
            mm2.e1 e1Var = (mm2.e1) dk2.ef.f233372a.i(mm2.e1.class);
            iaVar.f6918a = ((e1Var == null || (nw1Var = e1Var.f328988r) == null) ? null : java.lang.Long.valueOf(nw1Var.getLong(0))).longValue();
        }
        if (iaVar != null) {
            iaVar.f6919b = 14;
        }
        feedUpdateEvent.e();
    }

    public java.lang.String Fj() {
        java.lang.String str;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = dk2.ef.I;
        if (eVar == null) {
            str = null;
        } else if (!((mm2.c1) eVar.a(mm2.c1.class)).a8() ? (str = (java.lang.String) ((kotlinx.coroutines.flow.h3) ((mm2.g1) eVar.a(mm2.g1.class)).f329076q).getValue()) == null : !((finderObject = ((mm2.c1) eVar.a(mm2.c1.class)).f328846n) != null && (objectDesc = finderObject.getObjectDesc()) != null && (str = objectDesc.getDescription()) != null)) {
            str = "";
        }
        return str == null ? "" : str;
    }

    public void Fk(r45.nw1 nw1Var, boolean z17) {
        long j17 = nw1Var != null ? nw1Var.getLong(0) : 0L;
        if (nw1Var != null) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f66986g;
            if (concurrentHashMap.get(java.lang.Long.valueOf(j17)) == null || z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", "saveLiveInfo liveId:" + j17 + ",forceReplace:" + z17 + '!');
                java.lang.Long valueOf = java.lang.Long.valueOf(j17);
                java.lang.Integer valueOf2 = java.lang.Integer.valueOf(nw1Var.getInteger(2));
                java.lang.Long valueOf3 = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
                r45.l71 l71Var = new r45.l71();
                l71Var.set(1, nw1Var);
                concurrentHashMap.put(valueOf, new jz5.o(valueOf2, valueOf3, l71Var));
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.FinderLiveFeatureService", "saveLiveInfo fail,liveId:" + j17 + ",forceReplace:" + z17 + '!');
    }

    public r45.nw1 Gj(long j17) {
        r45.l71 l71Var;
        r45.l71 l71Var2;
        jz5.o oVar = (jz5.o) this.f66986g.get(java.lang.Long.valueOf(j17));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getCacheLiveInfo liveId:");
        sb6.append(j17);
        sb6.append(",liveInfo:");
        sb6.append((oVar == null || (l71Var2 = (r45.l71) oVar.f302843f) == null) ? null : (r45.nw1) l71Var2.getCustom(1));
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", sb6.toString());
        if (oVar == null || (l71Var = (r45.l71) oVar.f302843f) == null) {
            return null;
        }
        return (r45.nw1) l71Var.getCustom(1);
    }

    public void Gk(android.view.View view, boolean z17, int i17, r45.g92 g92Var) {
        java.lang.String string;
        if (z17) {
            string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dcj);
        } else if (i17 == 2) {
            string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.d9p);
        } else if (i17 == 4) {
            string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.d_0);
        } else if (i17 != 6) {
            string = pm0.v.z(g92Var != null ? g92Var.getInteger(38) : 0, 1048576) ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.egz) : com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.d_4);
        } else {
            string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.d_1);
        }
        kotlin.jvm.internal.o.d(string);
        if (view instanceof com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget) {
            ((com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget) view).setText(string);
        } else if (view instanceof android.widget.TextView) {
            ((android.widget.TextView) view).setText(string);
        }
    }

    public r45.l71 Hj(long j17) {
        jz5.o oVar = (jz5.o) this.f66986g.get(java.lang.Long.valueOf(j17));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getCacheLiveInfoResp: liveId=");
        sb6.append(j17);
        sb6.append(", liveInfoResp:");
        sb6.append(oVar != null ? (r45.l71) oVar.f302843f : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", sb6.toString());
        if (oVar != null) {
            return (r45.l71) oVar.f302843f;
        }
        return null;
    }

    public void Hk(android.view.View view, qs5.n cardStatus, boolean z17, r45.g92 g92Var) {
        java.lang.String string;
        java.lang.String string2;
        java.lang.Long j17;
        kotlin.jvm.internal.o.g(cardStatus, "cardStatus");
        jz5.l Ij = Ij((g92Var == null || (string2 = g92Var.getString(0)) == null || (j17 = r26.h0.j(string2)) == null) ? 0L : j17.longValue());
        java.lang.Integer num = Ij != null ? (java.lang.Integer) Ij.f302833d : null;
        int ordinal = cardStatus.ordinal();
        if (ordinal == 0) {
            string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.d9p);
        } else if (ordinal == 1) {
            string = pm0.v.z(num != null ? num.intValue() : 0, 2) ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.mna) : com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.d_1);
        } else if (ordinal == 2) {
            string = z17 ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.d9z) : com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.d9y);
        } else if (ordinal == 3) {
            string = bk(view, g92Var);
        } else if (ordinal == 4) {
            string = pm0.v.z(num != null ? num.intValue() : 0, 4) ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.mio) : com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dcj);
        } else {
            if (ordinal != 5) {
                throw new jz5.j();
            }
            string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f491708mm2);
        }
        kotlin.jvm.internal.o.d(string);
        if (view instanceof com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget) {
            ((com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget) view).setText(string);
        } else if (view instanceof android.widget.TextView) {
            ((android.widget.TextView) view).setText(string);
        }
    }

    public jz5.l Ij(long j17) {
        return (jz5.l) this.f66987h.get(java.lang.Long.valueOf(j17));
    }

    public void Ik(android.view.View view, boolean z17, int i17, r45.g92 g92Var) {
        java.lang.String string = z17 ? i17 == 3 ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.d9y) : com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dcj) : i17 != 2 ? (i17 == 4 || i17 == 6) ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.d_1) : bk(view, g92Var) : com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.d9p);
        kotlin.jvm.internal.o.d(string);
        if (view instanceof com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget) {
            ((com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget) view).setText(string);
        } else if (view instanceof android.widget.TextView) {
            ((android.widget.TextView) view).setText(string);
        }
    }

    public java.lang.String Jj(long j17) {
        java.lang.String str = (java.lang.String) this.f66993q.get(java.lang.Long.valueOf(j17));
        return str == null ? "" : str;
    }

    public boolean Jk(android.view.MotionEvent motionEvent, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = viewGroup != null ? (com.tencent.mm.plugin.finder.live.view.k0) viewGroup.findViewById(com.tencent.mm.R.id.f484854fq1) : null;
        if (k0Var == null) {
            return false;
        }
        dk2.ef efVar = dk2.ef.f233372a;
        if (!kotlin.jvm.internal.o.b(k0Var, dk2.ef.f233380e)) {
            return false;
        }
        android.content.Context context = k0Var.getContext();
        com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        if (mMActivity != null) {
            boolean z17 = mMActivity.getRequestedOrientation() == 0;
            if ((k0Var.isLandscape() && k0Var.getWidth() > k0Var.getHeight()) && z17) {
                return true;
            }
        }
        android.graphics.Rect Kj = ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Kj();
        if (Kj != null) {
            return Kj.contains(motionEvent != null ? (int) motionEvent.getX() : 0, motionEvent != null ? (int) motionEvent.getY() : 0);
        }
        return false;
    }

    public android.graphics.Rect Kj() {
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar;
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var == null || (mgVar = (com.tencent.mm.plugin.finder.live.plugin.mg) k0Var.getPlugin(com.tencent.mm.plugin.finder.live.plugin.mg.class)) == null || !mgVar.C1().isShown()) {
            return null;
        }
        android.graphics.Rect rect = mgVar.W;
        if (rect != null) {
            return rect;
        }
        int[] t17 = pm0.v.t(mgVar.C1());
        int i17 = t17[0];
        android.graphics.Rect rect2 = new android.graphics.Rect(i17, t17[1], mgVar.C1().getWidth() + i17, t17[1] + mgVar.C1().getHeight());
        android.graphics.Rect rect3 = new android.graphics.Rect(rect2.left, rect2.top - mgVar.D1(), rect2.right - ((java.lang.Number) ((jz5.n) mgVar.Z).getValue()).intValue(), rect2.bottom + mgVar.D1());
        mgVar.W = rect3;
        return rect3;
    }

    public void Kk(java.lang.String str, java.lang.String str2, boolean z17) {
        com.tencent.mm.plugin.finder.assist.w7 w7Var = com.tencent.mm.plugin.finder.assist.w7.f102656a;
        com.tencent.mars.xlog.Log.i("Finder.FinderThirdPartyGameLiveUtil", "dealShare, appid:" + str + ", extInfo:" + str2);
        if (str2 == null || com.tencent.mm.sdk.platformtools.t8.K0(str2) || str == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            if (str == null) {
                str = "";
            }
            w7Var.b(10001, "appid or extInfo empty", str);
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderThirdPartyGameLiveUtil", "checkAccount, isSameAccount:" + z17 + ", appid:" + str + ", extInfo:" + str2);
        boolean z18 = true;
        if (!z17) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                w7Var.b(10001, "appid or extInfo empty", str);
            } else {
                try {
                    if (com.tencent.mm.plugin.finder.assist.w7.f102657b.contains(java.lang.Integer.valueOf(new org.json.JSONObject(str2).getInt("liveEntryScene"))) && !z17) {
                        com.tencent.mars.xlog.Log.i("Finder.FinderThirdPartyGameLiveUtil", "checkAccount false");
                        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
                        u1Var.g(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.dgk));
                        u1Var.a(true);
                        u1Var.n(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490507x1));
                        u1Var.l(new com.tencent.mm.plugin.finder.assist.t7(str));
                        u1Var.q(false);
                        z18 = false;
                    }
                } catch (java.lang.Throwable unused) {
                }
            }
        }
        if (z18) {
            com.tencent.mm.plugin.finder.assist.x2.f102673b = 19L;
            android.content.Intent intent = new android.content.Intent();
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
                int i17 = jSONObject.getInt("routeScene");
                if (i17 == 3) {
                    w7Var.a(jSONObject, str, intent);
                } else {
                    w7Var.b(10001, "error routeScene " + i17, str);
                }
            } catch (java.lang.Throwable unused2) {
                w7Var.b(10001, "error json exception", str);
            }
        }
    }

    public byte[] Lj() {
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = dk2.ef.I;
        if (eVar != null) {
            return ((mm2.e1) eVar.a(mm2.e1.class)).f328985o;
        }
        return null;
    }

    public final java.lang.String Lk(java.lang.String str) {
        ml2.o2[] o2VarArr = ml2.o2.f327772d;
        if (kotlin.jvm.internal.o.b(str, "5")) {
            ml2.q1 q1Var = ml2.q1.f327812e;
            return "temp_12";
        }
        ml2.o2[] o2VarArr2 = ml2.o2.f327772d;
        if (kotlin.jvm.internal.o.b(str, "6")) {
            ml2.q1 q1Var2 = ml2.q1.f327812e;
            return "temp_11";
        }
        ml2.o2[] o2VarArr3 = ml2.o2.f327772d;
        if (kotlin.jvm.internal.o.b(str, "7")) {
            ml2.q1 q1Var3 = ml2.q1.f327812e;
            return "temp_14";
        }
        ml2.o2[] o2VarArr4 = ml2.o2.f327772d;
        if (kotlin.jvm.internal.o.b(str, "9")) {
            return str;
        }
        ml2.o2[] o2VarArr5 = ml2.o2.f327772d;
        if (kotlin.jvm.internal.o.b(str, "15")) {
            ml2.q1 q1Var4 = ml2.q1.f327812e;
            return "temp_13";
        }
        ml2.o2[] o2VarArr6 = ml2.o2.f327772d;
        if (kotlin.jvm.internal.o.b(str, com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_HASH)) {
            ml2.q1 q1Var5 = ml2.q1.f327812e;
            return "temp_20";
        }
        ml2.o2[] o2VarArr7 = ml2.o2.f327772d;
        if (!kotlin.jvm.internal.o.b(str, "341")) {
            return str;
        }
        ml2.q1 q1Var6 = ml2.q1.f327812e;
        return "341";
    }

    public com.tencent.mm.protobuf.g Mj() {
        r45.v74 v74Var;
        r45.u74 u74Var;
        mm2.e1 e1Var = (mm2.e1) dk2.ef.f233372a.i(mm2.e1.class);
        if (e1Var == null || (v74Var = e1Var.f328980g) == null || (u74Var = (r45.u74) v74Var.getCustom(2)) == null) {
            return null;
        }
        return u74Var.getByteString(0);
    }

    public com.tencent.mm.protocal.protobuf.FinderObject Mk(r45.sp1 feedForJoinLive) {
        kotlin.jvm.internal.o.g(feedForJoinLive, "feedForJoinLive");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
        finderObject.setId(feedForJoinLive.getLong(0));
        finderObject.setObjectNonceId(feedForJoinLive.getString(4));
        finderObject.setNickname(feedForJoinLive.getString(3));
        finderObject.setUsername(feedForJoinLive.getString(2));
        finderObject.setSessionBuffer(feedForJoinLive.getString(11));
        com.tencent.mm.protocal.protobuf.FinderObjectDesc finderObjectDesc = new com.tencent.mm.protocal.protobuf.FinderObjectDesc();
        finderObjectDesc.setDescription(feedForJoinLive.getString(8));
        finderObject.setObjectDesc(finderObjectDesc);
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = new com.tencent.mm.protocal.protobuf.FinderContact();
        finderContact.setHeadUrl(feedForJoinLive.getString(5));
        finderContact.setCoverUrl(feedForJoinLive.getString(6));
        finderObject.setContact(finderContact);
        r45.nw1 nw1Var = new r45.nw1();
        nw1Var.set(0, java.lang.Long.valueOf(feedForJoinLive.getLong(1)));
        nw1Var.set(3, feedForJoinLive.getString(7));
        nw1Var.set(21, java.lang.Integer.valueOf(feedForJoinLive.getInteger(9)));
        nw1Var.set(28, (r45.o52) feedForJoinLive.getCustom(10));
        finderObject.setLiveInfo(nw1Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", "transferObjectForJoinLive object_id:" + pm0.v.u(finderObject.getId()) + ",objectNonceId:" + finderObject.getObjectNonceId() + ",nickname:" + finderObject.getNickname() + ",username:" + finderObject.getUsername() + ",sessionBuffer:" + finderObject.getSessionBuffer() + ",description:" + feedForJoinLive.getString(8) + ",headUrl:" + feedForJoinLive.getString(5) + ",coverUrl:" + feedForJoinLive.getString(6) + ",liveId:" + pm0.v.u(feedForJoinLive.getLong(1)) + ",streamUrl:" + feedForJoinLive.getString(7) + ",secondary_device_flag:" + feedForJoinLive.getInteger(9) + ",purchase_info:" + ((r45.o52) feedForJoinLive.getCustom(10)) + ',');
        return finderObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0084, code lost:
    
        if (r0 == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ni(com.tencent.mm.protocal.protobuf.FinderObject r42, android.content.Context r43, org.json.JSONObject r44, java.lang.String r45) {
        /*
            Method dump skipped, instructions count: 1089
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.finder.live.v4.Ni(com.tencent.mm.protocal.protobuf.FinderObject, android.content.Context, org.json.JSONObject, java.lang.String):void");
    }

    public final be2.c Nj() {
        return (rl2.d) this.C.getValue();
    }

    public final rl2.h Oj() {
        return (rl2.h) this.f66995s.getValue();
    }

    public final rl2.l Pj() {
        return (rl2.l) ((jz5.n) this.f66999w).getValue();
    }

    public void Qj(java.lang.String str, java.lang.String str2, int i17, yz5.q callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        java.lang.String str3 = str == null ? "" : str;
        kotlin.jvm.internal.o.d(ybVar);
        c61.yb.W3(ybVar, 0L, str2, i17, 2, "", true, null, null, 0L, null, false, false, str3, null, 0, null, 53184, null).l().K(new com.tencent.mm.feature.finder.live.r3(callback));
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x031e, code lost:
    
        if (r1.getInteger(2) == 1) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        if (r0 == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ri(com.tencent.mm.protocal.protobuf.FinderObject r38, android.content.Context r39, org.json.JSONObject r40, java.lang.String r41) {
        /*
            Method dump skipped, instructions count: 1117
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.finder.live.v4.Ri(com.tencent.mm.protocal.protobuf.FinderObject, android.content.Context, org.json.JSONObject, java.lang.String):void");
    }

    public final be2.j Rj() {
        return (rl2.w) this.f67002z.getValue();
    }

    public java.lang.Object Sj(android.content.Context context, java.lang.String str, boolean z17, kotlin.coroutines.Continuation continuation) {
        ke2.y yVar;
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        if (z17) {
            yVar = new ke2.y(str, 0, false, null, false, null, 60, null);
            yVar.t(context, context.getResources().getString(com.tencent.mm.R.string.f9y), 100L);
        } else {
            yVar = new ke2.y(str, 0, false, null, false, null, 60, null);
        }
        yVar.l().K(new com.tencent.mm.feature.finder.live.s3(rVar, this, str));
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }

    public r45.va2 Tj(long j17) {
        r45.l71 l71Var;
        jz5.o oVar = (jz5.o) this.f66986g.get(java.lang.Long.valueOf(j17));
        if (oVar == null || (l71Var = (r45.l71) oVar.f302843f) == null) {
            return null;
        }
        return (r45.va2) l71Var.getCustom(35);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if (r1 == null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Ui(android.content.Context r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.finder.live.v4.Ui(android.content.Context, boolean, boolean):void");
    }

    public java.lang.Integer Uj(long j17, int i17) {
        java.lang.Integer num = (java.lang.Integer) this.f66989m.get(new jz5.l(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17)));
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", "getLiveAutoPlayFlag: flag=" + num + ", scene=" + i17 + ", liveId=" + j17);
        return num;
    }

    public void Vi(long j17, int i17, r45.t84 t84Var) {
        this.f66987h.put(java.lang.Long.valueOf(j17), new jz5.l(java.lang.Integer.valueOf(i17), t84Var));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cache style flag for live ");
        sb6.append(j17);
        sb6.append(", switch = ");
        sb6.append(i17);
        sb6.append(", anchorStatus = ");
        sb6.append(t84Var != null ? java.lang.Integer.valueOf(t84Var.getInteger(0)) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", sb6.toString());
    }

    public qs5.n Vj(java.lang.String str, r45.nw1 liveInfo) {
        kotlin.jvm.internal.o.g(liveInfo, "liveInfo");
        boolean hk6 = ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).hk(liveInfo);
        boolean bj6 = ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).bj(str, liveInfo);
        boolean Ri = ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Ri(liveInfo);
        int integer = liveInfo.getInteger(2);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getLiveCardState(live:");
        sb6.append(liveInfo.getLong(0));
        sb6.append("),liveStatus:");
        sb6.append(integer);
        sb6.append('(');
        sb6.append(liveInfo.getInteger(2));
        sb6.append("),isChargeLive:");
        sb6.append(hk6);
        sb6.append(",isLiveReplay:");
        sb6.append(bj6);
        sb6.append(", producingReplay:");
        sb6.append(Ri);
        sb6.append(",purchaseInfo null:");
        sb6.append(((r45.o52) liveInfo.getCustom(28)) == null);
        sb6.append(",anchorUserName:");
        sb6.append(str);
        sb6.append('!');
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", sb6.toString());
        return hk6 ? qs5.n.f366444d : bj6 ? qs5.n.f366445e : Ri ? qs5.n.f366446f : integer == 1 ? qs5.n.f366447g : qs5.n.f366448h;
    }

    public qs5.n Wj(r45.g92 shareObject, boolean z17) {
        r45.nw1 nw1Var;
        boolean z18;
        r45.t84 t84Var;
        java.lang.Long j17;
        kotlin.jvm.internal.o.g(shareObject, "shareObject");
        boolean z19 = false;
        if (z17) {
            java.lang.String string = shareObject.getString(0);
            nw1Var = Gj((string == null || (j17 = r26.h0.j(string)) == null) ? 0L : j17.longValue());
            if (nw1Var == null) {
                nw1Var = (r45.nw1) shareObject.getCustom(24);
            }
        } else {
            nw1Var = (r45.nw1) shareObject.getCustom(24);
        }
        if (nw1Var != null) {
            z18 = ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).hk(nw1Var);
        } else {
            int i17 = qs5.g.f366432a;
            int integer = shareObject.getInteger(22);
            z18 = integer == 2 || integer == 8 || integer == 16;
        }
        boolean bj6 = nw1Var != null ? ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).bj(shareObject.getString(1), nw1Var) : ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).ok(shareObject);
        boolean Ri = nw1Var != null ? ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Ri(nw1Var) : false;
        int integer2 = nw1Var != null ? nw1Var.getInteger(2) : shareObject.getInteger(13);
        jz5.l Ij = Ij(nw1Var != null ? nw1Var.getLong(0) : 0L);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateLiveTag desc:");
        sb6.append(shareObject.getString(4));
        sb6.append("(live:");
        sb6.append(shareObject.getString(0));
        sb6.append(' ');
        sb6.append(shareObject.getString(3));
        sb6.append("),liveStatus:");
        sb6.append(integer2);
        sb6.append('(');
        sb6.append(nw1Var != null ? java.lang.Integer.valueOf(nw1Var.getInteger(2)) : null);
        sb6.append("),chargFlag:");
        sb6.append(shareObject.getInteger(22));
        sb6.append(",isChargeLive:");
        sb6.append(z18);
        sb6.append(",isLiveReplay:");
        sb6.append(bj6);
        sb6.append(", producingReplay:");
        sb6.append(Ri);
        sb6.append(", liveInfo null:");
        sb6.append(nw1Var == null);
        sb6.append(",purchaseInfo null:");
        sb6.append((nw1Var != null ? (r45.o52) nw1Var.getCustom(28) : null) == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", sb6.toString());
        if (z18) {
            return qs5.n.f366444d;
        }
        if (integer2 == 1) {
            return qs5.n.f366447g;
        }
        if (pm0.v.z(Ij != null ? ((java.lang.Number) Ij.f302833d).intValue() : 0, 1)) {
            if (Ij != null && (t84Var = (r45.t84) Ij.f302834e) != null && t84Var.getInteger(0) == 1) {
                z19 = true;
            }
            if (z19) {
                return qs5.n.f366449i;
            }
        }
        return bj6 ? qs5.n.f366445e : Ri ? qs5.n.f366446f : qs5.n.f366448h;
    }

    public void Xj(long j17, boolean z17, im5.b bVar, s40.t0 t0Var, int i17, java.lang.String exportId, r45.s74 s74Var, r45.m71 m71Var) {
        kotlin.jvm.internal.o.g(exportId, "exportId");
        this.f66990n.post(new com.tencent.mm.feature.finder.live.v3(this, j17, z17, i17, exportId, s74Var, m71Var, bVar, t0Var));
    }

    public void Yj(long j17, int i17, long j18, im5.b bVar, s40.t0 t0Var, int i18) {
        jz5.o oVar = (jz5.o) this.f66986g.get(java.lang.Long.valueOf(j17));
        if (oVar == null || !(((java.lang.Number) oVar.f302841d).intValue() == i17 || jk(oVar, j18))) {
            s40.w0.u9(this, j17, true, bVar, t0Var, i18, null, null, null, 224, null);
        } else {
            pm0.v.X(new com.tencent.mm.feature.finder.live.w3(t0Var, j17, oVar));
        }
    }

    public void Zi(android.content.Context context, yz5.l lVar) {
        if (context != null) {
            zl2.r4 r4Var = zl2.r4.f473950a;
            boolean z17 = pm0.v.z(r4Var.I0().getInt("live_status_flag", 0), 1);
            kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
            boolean m17 = iq.b.m(context, false, null);
            if (z17 && !m17) {
                r4Var.I0().putInt("live_status_flag", 0);
                new ek2.y0(xy2.c.e(context), new com.tencent.mm.feature.finder.live.k2(java.lang.System.currentTimeMillis(), lVar, c0Var, context, this)).l();
            } else if (lVar != null) {
                lVar.invoke(java.lang.Boolean.FALSE);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", "checkUnfinishLive localUnfinishLive:" + z17 + " livingAsAnchor:" + m17);
        }
    }

    public final qo2.e Zj() {
        return (qo2.e) ((jz5.n) this.F).getValue();
    }

    public boolean aj(int i17) {
        boolean z17 = pm0.v.z(i17, 524288);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", "feedSwitch type=" + z17);
        return z17;
    }

    public final java.lang.String ak(jz5.o oVar) {
        java.lang.String sb6;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(oVar != null ? (java.lang.Integer) oVar.f302841d : null);
        sb7.append(' ');
        sb7.append(oVar != null ? (java.lang.Long) oVar.f302842e : null);
        sb7.append(' ');
        cm2.a aVar = cm2.a.f43328a;
        r45.l71 l71Var = oVar != null ? (r45.l71) oVar.f302843f : null;
        if (l71Var == null) {
            sb6 = "";
        } else {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("liveId:");
            r45.nw1 nw1Var = (r45.nw1) l71Var.getCustom(1);
            sb8.append(pm0.v.u(nw1Var != null ? nw1Var.getLong(0) : 0L));
            sb8.append(" refreshInterval:");
            sb8.append(l71Var.getInteger(3));
            sb8.append(" replay_status:");
            r45.nw1 nw1Var2 = (r45.nw1) l71Var.getCustom(1);
            sb8.append(nw1Var2 != null ? java.lang.Integer.valueOf(nw1Var2.getInteger(31)) : null);
            sb8.append(' ');
            r45.nw1 nw1Var3 = (r45.nw1) l71Var.getCustom(1);
            sb8.append(aVar.l(nw1Var3 != null ? (r45.o52) nw1Var3.getCustom(28) : null));
            sb6 = sb8.toString();
        }
        sb7.append(sb6);
        return sb7.toString();
    }

    public final java.lang.String bk(android.view.View view, r45.g92 g92Var) {
        java.lang.String str;
        java.lang.String str2 = null;
        if (g92Var != null) {
            str = pm0.v.z(g92Var.getInteger(38), 1048576) ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.egz) : pm0.v.z(g92Var.getInteger(38), 2097152) ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.lvm) : com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.d_4);
        } else {
            str = null;
        }
        if (str == null) {
            if (view instanceof com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget) {
                str2 = ((com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget) view).getF131216x();
            } else if (view instanceof android.widget.TextView) {
                str2 = ((android.widget.TextView) view).getText().toString();
            }
            str = str2 == null || str2.length() == 0 ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.d_4) : str2;
            kotlin.jvm.internal.o.d(str);
        }
        return str;
    }

    public java.lang.String ck() {
        cl0.g gVar = new cl0.g();
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        gVar.o("t2_switch", vd2.t3.f435921a.f() ? 1 : 0);
        gVar.o("new_square_switch", lk() ? 1 : 0);
        gVar.o("reddot_switch", mk() ? 1 : 0);
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        return r26.i0.t(gVar2, ",", ";", false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void dk(android.app.Activity context, yz5.a finishCallback, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(finishCallback, "finishCallback");
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", "#goToAnchorLiveDirect");
        kotlinx.coroutines.l.d(new yg2.b((androidx.lifecycle.y) context, "goToAnchorLiveDirect"), null, null, new com.tencent.mm.feature.finder.live.x3(new yl2.g1((com.tencent.mm.ui.MMFragmentActivity) context, 0, 0L, 6, null), context, z17, finishCallback, null), 3, null);
    }

    public void ek(android.widget.ImageView imageView, android.widget.TextView nickname, android.widget.ImageView author) {
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo;
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo2;
        r45.xk b17;
        kotlin.jvm.internal.o.g(nickname, "nickname");
        kotlin.jvm.internal.o.g(author, "author");
        ya2.g gVar = ya2.h.f460484a;
        android.content.Context context = nickname.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ya2.b2 b18 = gVar.b(xy2.c.e(context));
        if (imageView != null) {
            mn2.g1 g1Var = mn2.g1.f329975a;
            vo0.d a17 = g1Var.a();
            java.lang.String avatarUrl = b18 != null ? b18.getAvatarUrl() : null;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (avatarUrl == null) {
                avatarUrl = "";
            }
            a17.c(new mn2.n(avatarUrl, com.tencent.mm.plugin.finder.storage.y90.X), imageView, g1Var.h(mn2.f1.f329957h));
        }
        d92.f fVar = d92.f.f227470a;
        android.content.Context context2 = nickname.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        d92.f.a(fVar, context2, nickname, 14.0f, 0.0f, 8, null);
        nickname.setText(b18 != null ? b18.w0() : null);
        com.tencent.mm.ui.bk.r0(nickname.getPaint(), 0.8f);
        if (b18 == null || (b17 = ya2.d.b(b18, false)) == null || (finderAuthInfo2 = ya2.d.e(b17)) == null) {
            if (b18 == null) {
                finderAuthInfo = null;
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                zy2.tb.a(ya2.m1.f460511a, author, finderAuthInfo, 0, 4, null);
            }
            finderAuthInfo2 = b18.field_authInfo;
        }
        finderAuthInfo = finderAuthInfo2;
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        zy2.tb.a(ya2.m1.f460511a, author, finderAuthInfo, 0, 4, null);
    }

    public boolean fk() {
        return dk2.ef.f233372a.x();
    }

    public boolean gk(r45.nw1 nw1Var) {
        r45.o52 o52Var;
        int i17 = qs5.g.f366432a;
        int integer = (nw1Var == null || (o52Var = (r45.o52) nw1Var.getCustom(28)) == null) ? 0 : o52Var.getInteger(0);
        return integer == 2 || integer == 8 || integer == 16;
    }

    public void hj(android.content.Context context, java.lang.String extInfo, int i17) {
        r45.fd2 fd2Var;
        ml2.y3 y3Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(extInfo, "extInfo");
        android.content.Intent intent = new android.content.Intent();
        zl2.r4 r4Var = zl2.r4.f473950a;
        if ((extInfo.length() > 0 ? extInfo : null) != null) {
            cl0.g gVar = new cl0.g(extInfo);
            fd2Var = new r45.fd2();
            cl0.g b17 = gVar.b("tag");
            kotlin.jvm.internal.o.d(b17);
            zl2.r4.H2(b17, fd2Var);
            cl0.g b18 = b17.b("sub_tag");
            fd2Var.set(3, new r45.fd2());
            kotlin.jvm.internal.o.d(b18);
            zl2.r4.H2(b18, (r45.fd2) fd2Var.getCustom(3));
        } else {
            fd2Var = null;
        }
        if (fd2Var != null) {
            intent.putExtra("KEY_TAG_INFO", fd2Var.toByteArray());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", "createFinderLive sourceScene:" + i17 + ", extInfo:" + extInfo);
        ml2.y3[] values = ml2.y3.values();
        int length = values.length;
        int i18 = 0;
        while (true) {
            if (i18 >= length) {
                y3Var = null;
                break;
            }
            y3Var = values[i18];
            if (y3Var.f328284d == i17) {
                break;
            } else {
                i18++;
            }
        }
        if (y3Var != null) {
            ((ml2.j0) i95.n0.c(ml2.j0.class)).ck(y3Var);
        }
        android.content.Intent intent2 = context instanceof android.app.Activity ? null : intent;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        i95.m c17 = i95.n0.c(c61.yb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c61.yb.H7((c61.yb) c17, context, intent, 0L, null, 0, 0, false, 124, null);
        intent.setClass(context, com.tencent.mm.plugin.finder.feed.ui.FinderLivePostPendingUI.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/finder/live/FinderLiveFeatureService", "createFinderLive", "(Landroid/content/Context;Ljava/lang/String;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/feature/finder/live/FinderLiveFeatureService", "createFinderLive", "(Landroid/content/Context;Ljava/lang/String;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public boolean hk(r45.nw1 nw1Var) {
        return (nw1Var != null && nw1Var.getInteger(2) == 1) && gk(nw1Var);
    }

    public void ij(android.content.Context context, java.lang.String str) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_LUCKY_MONEY_GUIDE_INT_SYNC;
        if (!kotlin.jvm.internal.o.b(c17.m(u3Var, 0), 0)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", "createLuckyMoneyLiveImpl");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_LUCKY_MONEY_CHAT_ROOM_USERNAME", str == null ? "" : str);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(str != null ? str : "");
            intent.putExtra("KEY_WHITE_ROOM_LIST", arrayList);
            intent.putExtra("KEY_WHITE_LIST_MODE", 2);
            intent.putExtra("ENTER_SCENE", 1);
            android.content.Intent intent2 = context instanceof android.app.Activity ? null : intent;
            if (intent2 != null) {
                intent2.addFlags(268435456);
            }
            i95.m c18 = i95.n0.c(c61.yb.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            c61.yb.H7((c61.yb) c18, context, intent, 0L, null, 0, 0, false, 124, null);
            intent.setClass(context, com.tencent.mm.plugin.finder.feed.ui.FinderLivePostPendingUI.class);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/feature/finder/live/FinderLiveFeatureService", "createLuckyMoneyLiveImpl", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context, "com/tencent/mm/feature/finder/live/FinderLiveFeatureService", "createLuckyMoneyLiveImpl", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22385, 3, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        android.content.Intent intent3 = new android.content.Intent();
        java.lang.String obj = gm0.j1.u().c().l(274436, "").toString();
        if (com.tencent.mm.sdk.platformtools.t8.K0(obj)) {
            obj = com.tencent.mm.sdk.platformtools.m2.e();
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(obj) && !com.tencent.mm.sdk.platformtools.t8.x0(obj)) {
            obj = "";
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.net.URLEncoder.encode(str != null ? str : "");
        objArr[1] = com.tencent.mm.sdk.platformtools.m2.d();
        objArr[2] = obj;
        java.lang.String string = context.getString(com.tencent.mm.R.string.f491802ea2, objArr);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.nio.charset.Charset charset = r26.c.f368865a;
        byte[] bytes = string.getBytes(charset);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        byte[] encode = android.util.Base64.encode(bytes, 0);
        kotlin.jvm.internal.o.f(encode, "encode(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", "WILCOME_URL:".concat(new java.lang.String(encode, charset)));
        intent3.putExtra("rawUrl", string);
        intent3.putExtra("showShare", false);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent3, null);
        gm0.j1.u().c().x(u3Var, 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", "createLuckyMoneyLive show guide");
    }

    public boolean ik() {
        ae2.in inVar = ae2.in.f3688a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3693a4).getValue()).r()).intValue() == 1;
    }

    public final boolean jk(jz5.o oVar, long j17) {
        boolean z17 = java.lang.System.currentTimeMillis() - (oVar != null ? ((java.lang.Number) oVar.f302842e).longValue() : 0L) < j17;
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", "isLiveInfoOnTime:" + z17 + " status:" + ak(oVar) + ",refreshDuration:" + j17 + ",thread:" + java.lang.Thread.currentThread());
        return z17;
    }

    public boolean kk(android.view.ViewGroup viewGroup) {
        android.view.ViewGroup viewGroup2 = viewGroup != null ? (android.view.ViewGroup) viewGroup.findViewById(com.tencent.mm.R.id.f484854fq1) : null;
        if (viewGroup2 == null) {
            return false;
        }
        dk2.ef efVar = dk2.ef.f233372a;
        return kotlin.jvm.internal.o.b(viewGroup2, dk2.ef.f233380e);
    }

    public boolean lk() {
        ae2.in inVar = ae2.in.f3688a;
        return ((java.lang.Number) ae2.in.U3.r()).intValue() == 1;
    }

    public com.tencent.mm.modelbase.i mj(java.lang.String userName, java.lang.String noticeId, int i17, r45.qt2 qt2Var, int i18) {
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(noticeId, "noticeId");
        return ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).Ri(userName, noticeId, i17, qt2Var, i18);
    }

    public boolean mk() {
        ae2.in inVar = ae2.in.f3688a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.X3).getValue()).r()).intValue() == 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0397, code lost:
    
        r17 = (bw5.o5) r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0399, code lost:
    
        if (r17 == null) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x039b, code lost:
    
        r5 = r17.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x039f, code lost:
    
        if (r5 == null) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x03a1, code lost:
    
        r6 = new bw5.m5();
        r6.b(r5.g());
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x03af, code lost:
    
        if (r6 == null) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x03b1, code lost:
    
        r17 = r11;
        r10 = c01.id.c();
        r19 = r0;
        r23 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x03bf, code lost:
    
        if (r6.f30078e <= r10) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x03c1, code lost:
    
        r0 = r6.f30077d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x03c3, code lost:
    
        if (r0 <= 0) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x03c5, code lost:
    
        r13.set(15, java.lang.Integer.valueOf(r0));
        r13.set(16, java.lang.Long.valueOf(r6.f30078e));
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x03d9, code lost:
    
        com.tencent.mars.xlog.Log.i("MmecBatchGetProductCardResp.Product", r9.getTitle() + ",discount_price:" + r6.f30077d + ", serverTime:" + r10 + ",end_time_ms:" + r6.f30078e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x040f, code lost:
    
        r13.set(29, r9.d());
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x041e, code lost:
    
        if (r9.hasFieldNumber(38) == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0420, code lost:
    
        r1 = r9.S;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0424, code lost:
    
        r13.set(19, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x042f, code lost:
    
        if (r9.hasFieldNumber(56) == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0431, code lost:
    
        r1 = r9.f31952p0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x043e, code lost:
    
        if (r1.f30498q[1] == false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0440, code lost:
    
        r5 = r1.f30488d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0444, code lost:
    
        r13.set(36, r5);
        r5 = r1.f30498q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x044e, code lost:
    
        if (r5[2] == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0450, code lost:
    
        r6 = r1.f30489e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0454, code lost:
    
        r13.set(37, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x045c, code lost:
    
        if (r5[3] == false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x045e, code lost:
    
        r6 = r1.f30490f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0462, code lost:
    
        r13.set(38, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0468, code lost:
    
        if (r5[4] == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x046a, code lost:
    
        r0 = r1.f30491g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x046e, code lost:
    
        r13.set(39, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0476, code lost:
    
        if (r5[7] == false) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0478, code lost:
    
        r0 = r1.f30492h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x047c, code lost:
    
        r13.set(40, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0485, code lost:
    
        if (r5[8] == false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0487, code lost:
    
        r0 = r1.f30493i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x048b, code lost:
    
        r13.set(41, r0);
        r13.set(42, java.lang.Integer.valueOf(r1.f30494m));
        r13.set(43, java.lang.Integer.valueOf(r1.f30495n));
        r13.set(44, java.lang.Integer.valueOf(r1.f30496o));
        r13.set(45, java.lang.Integer.valueOf(r1.f30497p));
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x04c2, code lost:
    
        if (r9.hasFieldNumber(69) == false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x04c4, code lost:
    
        r0 = r9.f31962x0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x04c8, code lost:
    
        r13.set(46, r0);
        r1 = (r45.br2) r13.f310123d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x04d3, code lost:
    
        if (r1 == null) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x04d5, code lost:
    
        r1 = r1.getString(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x04d9, code lost:
    
        if (r1 != null) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x04dd, code lost:
    
        r13.set(2, r1);
        r1 = (r45.br2) r13.f310123d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x04e5, code lost:
    
        if (r1 == null) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x04e7, code lost:
    
        r1 = r1.getString(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x04eb, code lost:
    
        if (r1 != null) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x04ee, code lost:
    
        r13.set(3, r1);
        r0 = (r45.br2) r13.f310123d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x04f6, code lost:
    
        if (r0 == null) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x04f8, code lost:
    
        r0 = r0.getString(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x04fc, code lost:
    
        if (r0 != null) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x04ff, code lost:
    
        r13.set(0, r0);
        r0 = r4;
        r13 = r13;
        r5 = r8;
        r1 = r19;
        r6 = 4;
        r4 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x04fe, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x04ed, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x04db, code lost:
    
        r1 = "0L";
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x04c7, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x048a, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x047b, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x046d, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0461, code lost:
    
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0453, code lost:
    
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0443, code lost:
    
        r5 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0434, code lost:
    
        r1 = new bw5.n5();
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0423, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0409, code lost:
    
        r19 = r0;
        r23 = r1;
        r17 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x03ae, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x038e, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0395, code lost:
    
        r17 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x02e9, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x02d4, code lost:
    
        r10 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x02c3, code lost:
    
        r5 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x02b6, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x02a6, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0295, code lost:
    
        r5 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0285, code lost:
    
        r5 = new bw5.p5();
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0274, code lost:
    
        r5 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0268, code lost:
    
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0245, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0202, code lost:
    
        r10 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0200, code lost:
    
        if (r10 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01f1, code lost:
    
        if (r10 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0203, code lost:
    
        r13.set(6, r10);
        r13 = r6;
        r13.set(7, pm0.v.u(r9.f31941d));
        r5 = r9.f31943f;
        kotlin.jvm.internal.o.f(r5, "getImgUrls(...)");
        r5 = (java.lang.String) kz5.n0.a0(r5, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0220, code lost:
    
        if (r5 != null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0222, code lost:
    
        r5 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0223, code lost:
    
        r13.set(8, r5);
        r5 = r9.getTitle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x022c, code lost:
    
        if (r5 != null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x022e, code lost:
    
        r5 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x022f, code lost:
    
        r13.set(9, r5);
        r13.set(11, java.lang.Integer.valueOf(r9.f31946i));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0241, code lost:
    
        if (r9.f31940J == 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0243, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0246, code lost:
    
        r13.set(27, java.lang.Boolean.valueOf(r5));
        r5 = ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Ai(r13.getString(5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0262, code lost:
    
        if (r5 == null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0264, code lost:
    
        r6 = r5.field_bigHeadURL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0266, code lost:
    
        if (r6 != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0269, code lost:
    
        r13.set(12, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x026e, code lost:
    
        if (r5 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0270, code lost:
    
        r5 = r5.field_nickname;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0272, code lost:
    
        if (r5 != null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0275, code lost:
    
        r13.set(13, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0280, code lost:
    
        if (r9.hasFieldNumber(26) == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0282, code lost:
    
        r5 = r9.F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0290, code lost:
    
        if (r5.f31469g[3] == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0292, code lost:
    
        r5 = r5.f31468f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0296, code lost:
    
        r13.set(18, r5);
        r5 = r9.H;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x029d, code lost:
    
        if (r5 == null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x029f, code lost:
    
        r6 = (java.lang.String) kz5.n0.Z(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x02a7, code lost:
    
        r13.set(20, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x02ac, code lost:
    
        if (r5 == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02ae, code lost:
    
        r5 = (java.lang.String) kz5.n0.a0(r5, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02b7, code lost:
    
        r13.set(22, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02be, code lost:
    
        if (r9.R == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02c0, code lost:
    
        r5 = "1";
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x02c4, code lost:
    
        r13.set(34, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x02cf, code lost:
    
        if (r9.hasFieldNumber(39) == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02d1, code lost:
    
        r10 = r9.T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x02d5, code lost:
    
        r13.set(35, r10);
        r6 = r19.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x02de, code lost:
    
        if (r6 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x02e4, code lost:
    
        if (r6.length() != 0) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x02e7, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02ea, code lost:
    
        if (r10 != false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02ec, code lost:
    
        r6 = r19.getNickname();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02f0, code lost:
    
        if (r6 == null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02f6, code lost:
    
        if (r6.length() != 0) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02f9, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02fc, code lost:
    
        if (r10 != false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02fe, code lost:
    
        r6 = r19.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0304, code lost:
    
        if (r6 != null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0306, code lost:
    
        r6 = r13.getString(12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x030a, code lost:
    
        r13.set(12, r6);
        r6 = r19.getNickname();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0313, code lost:
    
        if (r6 != null) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0315, code lost:
    
        r6 = r13.getString(13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0319, code lost:
    
        r13.set(13, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02fb, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x031e, code lost:
    
        if (r9.E == 0) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0320, code lost:
    
        r13.set(10, java.lang.Integer.valueOf(r9.f31945h));
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x032b, code lost:
    
        com.tencent.mars.xlog.Log.i("MmecBatchGetProductCardResp.Product", "platformHeadImg:" + r13.getString(12) + " platformName: " + r13.getString(13) + ", page:" + r19.b() + r15 + r19.getNickname());
        r13.set(14, "");
        r6 = r9.A;
        kotlin.jvm.internal.o.f(r6, "getShowBoxItems(...)");
        r6 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x037d, code lost:
    
        if (r6.hasNext() == false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x037f, code lost:
    
        r17 = r6.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x038a, code lost:
    
        if (((bw5.o5) r17).f30949d != 1) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x038c, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x038f, code lost:
    
        if (r5 == false) goto L149;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0185 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object nj(android.content.Context r22, r45.zc4 r23, kotlin.coroutines.Continuation r24) {
        /*
            Method dump skipped, instructions count: 1431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.finder.live.v4.nj(android.content.Context, r45.zc4, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public boolean nk() {
        java.lang.String wi6 = ((p05.v2) ((rh0.x) i95.n0.c(rh0.x.class))).wi(rh0.z.f395613g, "AttackGift");
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", "#isPkAttackGiftEnable cfgValue=" + wi6);
        if (!(wi6 == null || wi6.length() == 0)) {
            if (com.tencent.mm.sdk.platformtools.t8.B1(wi6) == 1.0f) {
                return false;
            }
        }
        return true;
    }

    public void oj(android.content.Intent intent, android.content.Context context, long j17, java.lang.Long l17, java.lang.String nonceId, java.lang.String str, java.lang.String contextId, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        kotlin.jvm.internal.o.g(contextId, "contextId");
        if (context == null || l17 == null) {
            return;
        }
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).Bi(contextId);
        ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).Fj(intent, context, j17, l17.longValue(), nonceId, str, contextId, str2, str3);
    }

    public boolean ok(r45.g92 shareObject) {
        kotlin.jvm.internal.o.g(shareObject, "shareObject");
        return ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Ni(shareObject);
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        boolean z17 = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", "reportExperimentHit: enableLiveNotifyShowWhileLocking = " + (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_finder_live_lock_phone_notification_switch, 0) > 0));
        ((ku5.t0) ku5.t0.f312615d).h(dk2.hg.f233595d, "Finder.LiveExceptionMonitor");
        if (this.f66992p == null) {
            this.f66992p = new com.tencent.mm.feature.finder.live.q1();
        }
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(this.f66992p, intentFilter);
        ((uh4.c0) i95.n0.c(uh4.c0.class)).Pc(9, new sl2.c());
        ((uh4.c0) i95.n0.c(uh4.c0.class)).q3(9, new sl2.d());
        pm0.v.K(null, com.tencent.mm.feature.finder.live.j4.f66788d);
        java.lang.String string = com.tencent.mm.sdk.platformtools.o4.L().getString("FinderLiveHandOffUtil_current", null);
        if (string != null) {
            if (!(string.length() > 0)) {
                string = null;
            }
            if (string != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveHandOffUtil", "delete not deleted HandOffKey ".concat(string));
                ((d73.i) i95.n0.c(d73.i.class)).A8(string);
                com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveHandOffUtil", "save currentHandOffKey null");
                com.tencent.mm.sdk.platformtools.o4.L().remove("FinderLiveHandOffUtil_current");
            }
        }
        boolean z18 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_LIVE_DEBUG_VIEW_INT_SYNC, 0) == 1;
        l30.h hVar = (l30.h) i95.n0.c(l30.h.class);
        com.tencent.mm.feature.finder.live.k4 k4Var = new com.tencent.mm.feature.finder.live.k4(z18);
        ((k30.a) hVar).getClass();
        com.tencent.mm.plugin.expansions.i0.c(k4Var);
        try {
            java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_COVER_URL_CACHE_STRING_SYNC, "");
            kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str = (java.lang.String) m17;
            if (str.length() <= 0) {
                z17 = false;
            }
            if (z17) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                kotlin.jvm.internal.o.f(keys, "keys(...)");
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    long c17 = com.tencent.mm.sdk.platformtools.b8.c(next);
                    java.lang.String optString = jSONObject.optString(next, "");
                    this.f66994r.add(new jz5.l(java.lang.Long.valueOf(c17), optString));
                    this.f66993q.put(java.lang.Long.valueOf(c17), optString);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", "onAccountInitialized " + e17);
        }
        qo2.e Zj = Zj();
        Zj.getClass();
        com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_SHOP_MSG_DB_CHECK_LAST_TIME_INT_SYNC;
        int r17 = c18.r(u3Var, 0);
        int e18 = c01.id.e();
        int i17 = e18 - Zj.f365584f;
        int i18 = i17 >= 0 ? i17 : 0;
        java.lang.String str2 = Zj.f365580b;
        if (r17 < i18) {
            gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(e18));
            int i19 = e18 - Zj.f365583e;
            com.tencent.mars.xlog.Log.i(str2, "[deleteExpiredData] current = " + e18 + ", expiredTime = " + i19);
            try {
                com.tencent.wcdb.core.Table table = Zj.f365582d;
                if (table == null) {
                    kotlin.jvm.internal.o.o("msgTable");
                    throw null;
                }
                table.deleteObjects(so0.a.f410192k.lt(i19));
                com.tencent.wcdb.core.Table table2 = Zj.f365581c;
                if (table2 == null) {
                    kotlin.jvm.internal.o.o("sessionTable");
                    throw null;
                }
                table2.deleteObjects(so0.b.f410202h.lt(i19));
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.i(str2, "[deleteExpiredData] e:" + e19.getMessage());
            }
        } else {
            com.tencent.mars.xlog.Log.i(str2, "[deleteExpiredData] return, time=" + e18 + ", lastCleanTime=" + r17);
        }
        if (zl2.q4.f473933a.E()) {
            jz5.g gVar = am2.j3.f8704a;
            ((com.tencent.mm.plugin.finder.live.utils.fake.LiveConfigDebug$configEventListener$2$1) ((jz5.n) am2.j3.f8704a).getValue()).alive();
        }
    }

    @Override // l85.m1, i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountReleased(context);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.plugin.finder.feed.model.i1.f107931b;
        synchronized (concurrentHashMap) {
            concurrentHashMap.clear();
        }
        com.tencent.mm.feature.finder.live.q1 q1Var = this.f66992p;
        if (q1Var != null) {
            com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver(q1Var);
        }
        this.f66992p = null;
        if (zl2.q4.f473933a.E()) {
            jz5.g gVar = am2.j3.f8704a;
            ((com.tencent.mm.plugin.finder.live.utils.fake.LiveConfigDebug$configEventListener$2$1) ((jz5.n) am2.j3.f8704a).getValue()).dead();
        }
    }

    @Override // l85.m1, i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        wi();
    }

    public void pj(android.content.Context context, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(context, "context");
        ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).getClass();
        if (intent == null) {
            intent = new android.content.Intent();
        }
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, (java.lang.Class) ((jz5.n) jz2.x0.N).getValue());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderLiveGiftPkgUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderLiveGiftPkgUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public boolean pk() {
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", "isShowFinderLiveEntrance return for isTeenMode！");
            return false;
        }
        if ((c01.z1.j() & 9007199254740992L) != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", "isShowFinderLiveEntrance settingClose!");
            return false;
        }
        if (((c92.h) ((yy2.e) i95.n0.c(yy2.e.class))).Ai()) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", "isShowFinderLiveEntrance find page test disable live!");
        return false;
    }

    public void qj(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        kotlin.jvm.internal.o.g(context, "context");
        c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
        if (str4 == null) {
            str4 = "";
        }
        long Z = pm0.v.Z(str4);
        if (str5 == null) {
            str5 = "";
        }
        long Z2 = pm0.v.Z(str5);
        ((com.tencent.mm.plugin.finder.assist.i0) ubVar).getClass();
        android.content.Intent intent = new android.content.Intent();
        boolean z17 = context instanceof android.app.Activity;
        intent.addFlags(268435456);
        if (str == null) {
            str = "";
        }
        intent.putExtra("key_anchor_finder_username", str);
        if (str2 == null) {
            str2 = "";
        }
        intent.putExtra("key_anchor_finder_nickname", str2);
        if (str3 == null) {
            str3 = "";
        }
        intent.putExtra("key_anchor_finder_avatar", str3);
        intent.putExtra("key_anchor_finder_object_id", Z);
        intent.putExtra("key_anchor_finder_live_id", Z2);
        ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Bk(Z2);
        intent.setClass(context, (java.lang.Class) ((jz5.n) jz2.x0.f302774u).getValue());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderLiveInvitedUI", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderLiveInvitedUI", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public boolean qk(r45.nw1 nw1Var) {
        r45.o52 o52Var;
        if (!gk(nw1Var)) {
            return false;
        }
        if ((nw1Var == null || (o52Var = (r45.o52) nw1Var.getCustom(28)) == null || !o52Var.getBoolean(1)) ? false : true) {
            return false;
        }
        return !Nj().y0(nw1Var != null ? nw1Var.getLong(0) : 0L);
    }

    public void rj(android.content.Context context) {
        r45.c33 c33Var;
        r45.c33 c33Var2;
        kotlin.jvm.internal.o.g(context, "context");
        ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).getClass();
        try {
            gk2.e eVar = gk2.e.f272471n;
            if (eVar == null) {
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            r45.i56 i56Var = new r45.i56();
            r45.dv1 dv1Var = ((mm2.f6) eVar.a(mm2.f6.class)).f329038n;
            java.lang.String str = null;
            i56Var.set(0, (dv1Var == null || (c33Var2 = (r45.c33) dv1Var.getCustom(2)) == null) ? null : c33Var2.getString(0));
            r45.dv1 dv1Var2 = ((mm2.f6) eVar.a(mm2.f6.class)).f329038n;
            if (dv1Var2 != null && (c33Var = (r45.c33) dv1Var2.getCustom(2)) != null) {
                str = c33Var.getString(1);
            }
            i56Var.set(1, str);
            i56Var.set(2, java.lang.Long.valueOf(((mm2.e1) eVar.a(mm2.e1.class)).f328983m));
            int i17 = 3;
            i56Var.set(3, java.lang.Long.valueOf(((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0)));
            i56Var.set(9, ((mm2.e1) eVar.a(mm2.e1.class)).f328984n);
            i56Var.set(4, ((mm2.c1) eVar.a(mm2.c1.class)).f328852o);
            i56Var.set(5, java.lang.String.valueOf(((mm2.c1) eVar.a(mm2.c1.class)).f328861p2));
            i56Var.set(6, ((mm2.c1) eVar.a(mm2.c1.class)).P3);
            i56Var.set(7, ((mm2.c1) eVar.a(mm2.c1.class)).f328791d3);
            if (!((mm2.c1) eVar.a(mm2.c1.class)).T) {
                i17 = ((mm2.n0) eVar.a(mm2.n0.class)).f329273r ? 16 : 1;
            }
            i56Var.set(8, java.lang.Integer.valueOf(i17));
            java.util.List b17 = ((mm2.f6) eVar.a(mm2.f6.class)).f329039o.b(com.tencent.mm.plugin.finder.assist.y.f102702d);
            intent.putExtra("KEY_PARAMS", i56Var.toByteArray());
            com.tencent.mm.plugin.finder.live.util.q1 q1Var = com.tencent.mm.plugin.finder.live.util.q1.f115653a;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(b17, 10));
            java.util.Iterator it = ((java.util.ArrayList) b17).iterator();
            while (it.hasNext()) {
                so2.j5 j5Var = (so2.j5) it.next();
                r45.rv2 rv2Var = new r45.rv2();
                if (j5Var instanceof cm2.i0) {
                    rv2Var.set(0, 1L);
                    rv2Var.set(1, ((cm2.i0) j5Var).f43354v);
                    ((cm2.i0) j5Var).f43354v.toByteArray();
                } else if (j5Var instanceof cm2.m0) {
                    rv2Var.set(0, 0L);
                    rv2Var.set(2, ((cm2.m0) j5Var).f43368v);
                }
                arrayList.add(rv2Var.toByteArray());
            }
            q1Var.b(intent, "KEY_PRODUCTLIST", arrayList);
            ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).Lj((android.app.Activity) context, intent, 1013);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("Finder.ActivityRouter", "Error creating enhanced intent from ECS: " + e17.getMessage());
        }
    }

    public boolean rk() {
        return dk2.ef.f233372a.A();
    }

    public void sj(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.util.List list, java.util.List list2, r45.nw1 nw1Var, java.lang.String str3, byte[] bArr) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.o.g(context, "context");
        r45.sp1 sp1Var = null;
        if (list != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                java.lang.String str4 = (java.lang.String) obj;
                if (!(str4 == null || str4.length() == 0)) {
                    arrayList2.add(obj);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.String Gj = ((num != null && num.intValue() == 4) || (num != null && num.intValue() == 12) || ((num != null && num.intValue() == 13) || (num != null && num.intValue() == 14))) ? ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(27, 2, 65) : ((num != null && num.intValue() == 18) || (num != null && num.intValue() == 19) || (num != null && num.intValue() == 21)) ? ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(52, 2, 65) : ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(26, 2, 65);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", "enterFinderLiveUIByBiz dataBuffer:" + bArr);
        r45.sp1 sp1Var2 = new r45.sp1();
        if (bArr != null) {
            try {
                sp1Var2.parseFrom(bArr);
                sp1Var = sp1Var2;
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
        }
        if (sp1Var != null) {
            tj(num, arrayList, str, str2, str3, this, Mk(sp1Var), Gj, elapsedRealtime);
            return;
        }
        az2.q qVar = new az2.q();
        qVar.f16152a = new java.lang.ref.WeakReference(context);
        if (context instanceof android.app.Activity) {
            qVar.b();
        }
        i95.m c17 = i95.n0.c(c61.yb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c61.yb.W3((c61.yb) c17, 0L, "", 65, 2, "", true, null, null, 0L, null, false, false, str == null ? "" : str, null, 0, null, 53184, null).l().K(new com.tencent.mm.feature.finder.live.c3(qVar, str3, Gj, num, this, context, elapsedRealtime, arrayList, str, str2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void sk(java.lang.String encryptedId, java.lang.String nonceId, android.content.Context context, yz5.r callback, r45.qt2 qt2Var) {
        kotlin.jvm.internal.o.g(encryptedId, "encryptedId");
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        kotlin.jvm.internal.o.g(callback, "callback");
        java.util.ArrayList<jz5.l> arrayList = new java.util.ArrayList();
        arrayList.add(new jz5.l(encryptedId, nonceId));
        int i17 = 3;
        int i18 = 0;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        for (jz5.l lVar : arrayList) {
            r45.in2 in2Var = new r45.in2();
            in2Var.set(4, (java.lang.String) lVar.f302833d);
            in2Var.set(1, (java.lang.String) lVar.f302834e);
            arrayList2.add(in2Var);
        }
        pq5.g l17 = new db2.u(arrayList2, i17, 0, i18, null, null, null, null, 0, null, null, null, null, qt2Var, null, null, null, 122864, null).l();
        l17.K(new com.tencent.mm.feature.finder.live.i4(encryptedId, nonceId, callback));
        if (context == 0 || !(context instanceof com.tencent.mm.ui.MMActivity)) {
            return;
        }
        l17.f((im5.b) context);
    }

    public void tk(android.widget.ImageView imageView, qs5.y resType, int i17) {
        kotlin.jvm.internal.o.g(imageView, "imageView");
        kotlin.jvm.internal.o.g(resType, "resType");
        imageView.setImageResource(i17);
    }

    public void uj(android.content.Intent intent, android.content.Context context, long j17, java.lang.Long l17, java.lang.String anchorUserName, java.lang.String nonceId, java.lang.String str, java.lang.String contextId, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, int i18, boolean z17, long j18, java.lang.Integer num) {
        byte[] bArr;
        java.lang.String str5;
        int i19;
        r45.l71 l71Var;
        r45.nw1 nw1Var;
        r45.rp1 rp1Var;
        r45.l71 l71Var2;
        r45.nw1 nw1Var2;
        r45.ma4 ma4Var;
        r45.q82 q82Var;
        kotlin.jvm.internal.o.g(anchorUserName, "anchorUserName");
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        kotlin.jvm.internal.o.g(contextId, "contextId");
        java.lang.String streamUrl = str4;
        kotlin.jvm.internal.o.g(streamUrl, "streamUrl");
        if (context == null || l17 == null) {
            return;
        }
        boolean isTeenMode = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
        byte[] bArr2 = null;
        if (!isTeenMode) {
            int i27 = 0;
            if (!(anchorUserName.length() == 0)) {
                ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).Bi(contextId);
                jz5.o oVar = (jz5.o) this.f66986g.get(l17);
                int i28 = zy2.v.f477591b;
                if (i28 <= 0) {
                    i28 = ae2.in.f3762h3;
                }
                long j19 = i28 * 1000;
                if (oVar != null && java.lang.System.currentTimeMillis() - ((java.lang.Number) oVar.f302842e).longValue() < j19) {
                    streamUrl = "";
                }
                if (!(oVar != null && 1 == ((java.lang.Number) oVar.f302841d).intValue()) || java.lang.System.currentTimeMillis() - ((java.lang.Number) oVar.f302842e).longValue() >= j19) {
                    bArr = null;
                    str5 = streamUrl;
                    i19 = i18;
                } else {
                    r45.l71 l71Var3 = (r45.l71) oVar.f302843f;
                    r45.nw1 nw1Var3 = (r45.nw1) l71Var3.getCustom(1);
                    java.lang.String string = nw1Var3 != null ? nw1Var3.getString(3) : null;
                    if (string == null) {
                        string = "";
                    }
                    r45.nw1 nw1Var4 = (r45.nw1) l71Var3.getCustom(1);
                    int integer = (nw1Var4 == null || (q82Var = (r45.q82) nw1Var4.getCustom(9)) == null) ? 1 : q82Var.getInteger(0);
                    r45.nw1 nw1Var5 = (r45.nw1) l71Var3.getCustom(1);
                    if (nw1Var5 != null && (ma4Var = (r45.ma4) nw1Var5.getCustom(23)) != null) {
                        bArr2 = ma4Var.toByteArray();
                    }
                    i19 = integer;
                    bArr = bArr2;
                    str5 = string;
                }
                android.content.Intent intent2 = intent == null ? new android.content.Intent() : intent;
                if (intent2.getIntExtra("KEY_ENTER_LIVE_PARAM_VR_LIVE_TYPE", 0) == 0) {
                    if (oVar != null && (l71Var2 = (r45.l71) oVar.f302843f) != null && (nw1Var2 = (r45.nw1) l71Var2.getCustom(1)) != null) {
                        i27 = nw1Var2.getInteger(42);
                    }
                    intent2.putExtra("KEY_ENTER_LIVE_PARAM_VR_LIVE_TYPE", i27);
                }
                if (intent2.getByteArrayExtra("KEY_ENTER_LIVE_PARAM_LIVE_EVENT_INFO") == null && oVar != null && (l71Var = (r45.l71) oVar.f302843f) != null && (nw1Var = (r45.nw1) l71Var.getCustom(1)) != null && (rp1Var = (r45.rp1) nw1Var.getCustom(45)) != null) {
                    intent2.putExtra("KEY_ENTER_LIVE_PARAM_LIVE_EVENT_INFO", rp1Var.toByteArray());
                }
                c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
                java.lang.String str6 = str == null ? "" : str;
                kotlin.jvm.internal.o.d(ubVar);
                c61.ub.e4(ubVar, intent2, context, j17, l17.longValue(), anchorUserName, nonceId, str6, contextId, i17, str2, str3, str5, java.lang.Integer.valueOf(i19), 0, bArr, null, false, null, j18, null, 761856, null);
                return;
            }
        }
        pm0.v.K(null, new com.tencent.mm.feature.finder.live.g3(nonceId, j17, contextId, isTeenMode, context, intent, this, l17, str, str2, str3, num, j18));
    }

    public void uk(boolean z17) {
        java.lang.Object obj;
        int i17;
        java.lang.Object obj2;
        java.lang.Object obj3;
        int i18;
        java.lang.Object obj4;
        java.lang.Object obj5;
        int i19;
        int i27;
        ll2.e eVar = ll2.e.f319133a;
        java.util.List list = ll2.e.f319135c;
        java.util.Iterator it = list.iterator();
        int i28 = 0;
        while (true) {
            int i29 = 4;
            int i37 = 3600;
            java.lang.Object obj6 = null;
            if (!it.hasNext()) {
                int i38 = 0;
                for (java.lang.Object obj7 : list) {
                    int i39 = i38 + 1;
                    if (i38 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    java.lang.String str = (java.lang.String) obj7;
                    if (!kotlin.jvm.internal.o.b(str, "anchorlive.more") && r26.i0.A(str, "anchorlive.more", false, 2, obj6)) {
                        java.util.Iterator it6 = list.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                obj5 = obj6;
                                break;
                            }
                            obj5 = it6.next();
                            java.lang.String str2 = (java.lang.String) obj5;
                            if (!kotlin.jvm.internal.o.b(str2, str) && r26.i0.A(str2, str, false, 2, obj6)) {
                                break;
                            }
                        }
                        if (obj5 == null) {
                            java.util.List f07 = r26.n0.f0(str, new java.lang.String[]{"."}, false, 0, 6, null);
                            java.lang.String str3 = f07.size() == i29 ? "anchorlive.more." + ((java.lang.String) f07.get(2)) : "";
                            r45.vs2 vs2Var = new r45.vs2();
                            vs2Var.f388491i = i37;
                            vs2Var.f388486d = 400000;
                            vs2Var.C = -4758357817339078452L;
                            vs2Var.f388487e = i38 + 30000;
                            vs2Var.f388494o = true;
                            java.util.LinkedList linkedList = vs2Var.f388489g;
                            r45.f03 f03Var = new r45.f03();
                            f03Var.f373887d = 1;
                            f03Var.f373900t = z17 ? 1 : 0;
                            f03Var.f373891h = 1;
                            f03Var.f373893m = str3.length() == 0 ? "anchorlive.more" : str3;
                            f03Var.f373892i = str;
                            linkedList.add(f03Var);
                            if (str3.length() > 0) {
                                java.util.LinkedList linkedList2 = vs2Var.f388489g;
                                r45.f03 f03Var2 = new r45.f03();
                                i19 = 1;
                                f03Var2.f373887d = 1;
                                f03Var2.f373891h = 2;
                                f03Var2.f373893m = "anchorlive.more";
                                f03Var2.f373892i = str3;
                                linkedList2.add(f03Var2);
                            } else {
                                i19 = 1;
                            }
                            java.util.LinkedList linkedList3 = vs2Var.f388489g;
                            r45.f03 f03Var3 = new r45.f03();
                            f03Var3.f373887d = i19;
                            f03Var3.f373891h = 2;
                            f03Var3.f373892i = "anchorlive.more";
                            linkedList3.add(f03Var3);
                            vs2Var.f388490h = java.lang.String.valueOf(str.hashCode());
                            zy2.fa.D(((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk(), vs2Var, "mockAnchorMore", null, true, null, 20, null);
                        }
                    }
                    i38 = i39;
                    i29 = 4;
                    i37 = 3600;
                    obj6 = null;
                }
                int i47 = 0;
                for (java.lang.Object obj8 : list) {
                    int i48 = i47 + 1;
                    if (i47 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    java.lang.String str4 = (java.lang.String) obj8;
                    if (!kotlin.jvm.internal.o.b(str4, "anchorlive.bottom")) {
                        java.lang.Object obj9 = null;
                        if (r26.i0.A(str4, "anchorlive.bottom", false, 2, null)) {
                            java.util.Iterator it7 = list.iterator();
                            while (true) {
                                if (!it7.hasNext()) {
                                    obj4 = null;
                                    break;
                                }
                                obj4 = it7.next();
                                java.lang.String str5 = (java.lang.String) obj4;
                                if (!kotlin.jvm.internal.o.b(str5, str4) && r26.i0.A(str5, str4, false, 2, obj9)) {
                                    break;
                                } else {
                                    obj9 = null;
                                }
                            }
                            if (obj4 == null) {
                                java.util.List f08 = r26.n0.f0(str4, new java.lang.String[]{"."}, false, 0, 6, null);
                                java.lang.String str6 = f08.size() == 4 ? "anchorlive.bottom." + ((java.lang.String) f08.get(2)) : null;
                                r45.vs2 vs2Var2 = new r45.vs2();
                                vs2Var2.f388491i = 3600;
                                vs2Var2.f388486d = 400000;
                                vs2Var2.C = -4758357817339078452L;
                                vs2Var2.f388487e = i47 + 30000;
                                vs2Var2.f388494o = true;
                                java.util.LinkedList linkedList4 = vs2Var2.f388489g;
                                r45.f03 f03Var4 = new r45.f03();
                                f03Var4.f373887d = 1;
                                f03Var4.f373900t = z17 ? 1 : 0;
                                f03Var4.f373891h = 1;
                                f03Var4.f373893m = str6;
                                f03Var4.f373892i = str4;
                                linkedList4.add(f03Var4);
                                if (!(str6 == null || str6.length() == 0)) {
                                    java.util.LinkedList linkedList5 = vs2Var2.f388489g;
                                    r45.f03 f03Var5 = new r45.f03();
                                    f03Var5.f373887d = 1;
                                    f03Var5.f373891h = 2;
                                    f03Var5.f373892i = str6;
                                    linkedList5.add(f03Var5);
                                }
                                vs2Var2.f388490h = java.lang.String.valueOf(str4.hashCode());
                                zy2.fa.D(((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk(), vs2Var2, "mockAnchorBottom", null, true, null, 20, null);
                            }
                        }
                    }
                    i47 = i48;
                }
                int i49 = 0;
                for (java.lang.Object obj10 : list) {
                    int i57 = i49 + 1;
                    if (i49 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    java.lang.String str7 = (java.lang.String) obj10;
                    if (!kotlin.jvm.internal.o.b(str7, "startlive.more")) {
                        java.lang.Object obj11 = null;
                        if (r26.i0.A(str7, "startlive.more", false, 2, null)) {
                            java.util.Iterator it8 = list.iterator();
                            while (true) {
                                if (!it8.hasNext()) {
                                    obj3 = null;
                                    break;
                                }
                                obj3 = it8.next();
                                java.lang.String str8 = (java.lang.String) obj3;
                                if (!kotlin.jvm.internal.o.b(str8, str7) && r26.i0.A(str8, str7, false, 2, obj11)) {
                                    break;
                                } else {
                                    obj11 = null;
                                }
                            }
                            if (obj3 == null) {
                                java.util.List f09 = r26.n0.f0(str7, new java.lang.String[]{"."}, false, 0, 6, null);
                                java.lang.String str9 = f09.size() == 4 ? "startlive.more." + ((java.lang.String) f09.get(2)) : "";
                                r45.vs2 vs2Var3 = new r45.vs2();
                                vs2Var3.f388491i = 3600;
                                vs2Var3.f388486d = 400000;
                                vs2Var3.C = -4758357817339078452L;
                                vs2Var3.f388487e = i49 + 30000;
                                vs2Var3.f388494o = true;
                                java.util.LinkedList linkedList6 = vs2Var3.f388489g;
                                r45.f03 f03Var6 = new r45.f03();
                                f03Var6.f373887d = 1;
                                f03Var6.f373900t = z17 ? 1 : 0;
                                f03Var6.f373891h = 1;
                                f03Var6.f373893m = str9.length() == 0 ? "startlive.more" : str9;
                                f03Var6.f373892i = str7;
                                linkedList6.add(f03Var6);
                                if (str9.length() > 0) {
                                    java.util.LinkedList linkedList7 = vs2Var3.f388489g;
                                    r45.f03 f03Var7 = new r45.f03();
                                    i18 = 1;
                                    f03Var7.f373887d = 1;
                                    f03Var7.f373891h = 2;
                                    f03Var7.f373893m = "startlive.more";
                                    f03Var7.f373892i = str9;
                                    linkedList7.add(f03Var7);
                                } else {
                                    i18 = 1;
                                }
                                java.util.LinkedList linkedList8 = vs2Var3.f388489g;
                                r45.f03 f03Var8 = new r45.f03();
                                f03Var8.f373887d = i18;
                                f03Var8.f373891h = 2;
                                f03Var8.f373892i = "startlive.more";
                                linkedList8.add(f03Var8);
                                vs2Var3.f388490h = java.lang.String.valueOf(str7.hashCode());
                                zy2.fa.D(((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk(), vs2Var3, "mockStartLiveMore", null, true, null, 20, null);
                            }
                        }
                    }
                    i49 = i57;
                }
                int i58 = 0;
                for (java.lang.Object obj12 : list) {
                    int i59 = i58 + 1;
                    if (i58 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    java.lang.String str10 = (java.lang.String) obj12;
                    if (!kotlin.jvm.internal.o.b(str10, "startlive.bottom")) {
                        java.lang.Object obj13 = null;
                        if (r26.i0.A(str10, "startlive.bottom", false, 2, null)) {
                            java.util.Iterator it9 = list.iterator();
                            while (true) {
                                if (!it9.hasNext()) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = it9.next();
                                java.lang.String str11 = (java.lang.String) obj2;
                                if (!kotlin.jvm.internal.o.b(str11, str10) && r26.i0.A(str11, str10, false, 2, obj13)) {
                                    break;
                                } else {
                                    obj13 = null;
                                }
                            }
                            if (obj2 == null) {
                                java.util.List f010 = r26.n0.f0(str10, new java.lang.String[]{"."}, false, 0, 6, null);
                                java.lang.String str12 = f010.size() == 4 ? "startlive.bottom." + ((java.lang.String) f010.get(2)) : null;
                                r45.vs2 vs2Var4 = new r45.vs2();
                                vs2Var4.f388491i = 3600;
                                vs2Var4.f388486d = 400000;
                                vs2Var4.C = -4758357817339078452L;
                                vs2Var4.f388487e = i58 + 30000;
                                vs2Var4.f388494o = true;
                                java.util.LinkedList linkedList9 = vs2Var4.f388489g;
                                r45.f03 f03Var9 = new r45.f03();
                                f03Var9.f373887d = 1;
                                f03Var9.f373900t = z17 ? 1 : 0;
                                f03Var9.f373891h = 1;
                                f03Var9.f373893m = str12;
                                f03Var9.f373892i = str10;
                                linkedList9.add(f03Var9);
                                if (!(str12 == null || str12.length() == 0)) {
                                    java.util.LinkedList linkedList10 = vs2Var4.f388489g;
                                    r45.f03 f03Var10 = new r45.f03();
                                    f03Var10.f373887d = 1;
                                    f03Var10.f373891h = 2;
                                    f03Var10.f373892i = str12;
                                    linkedList10.add(f03Var10);
                                }
                                vs2Var4.f388490h = java.lang.String.valueOf(str10.hashCode());
                                zy2.fa.D(((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk(), vs2Var4, "mockStartLiveBottom", null, true, null, 20, null);
                            }
                        }
                    }
                    i58 = i59;
                }
                int i66 = 0;
                for (java.lang.Object obj14 : list) {
                    int i67 = i66 + 1;
                    if (i66 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    java.lang.String str13 = (java.lang.String) obj14;
                    if (!kotlin.jvm.internal.o.b(str13, "assistant.more")) {
                        java.lang.Object obj15 = null;
                        if (r26.i0.A(str13, "assistant.more", false, 2, null)) {
                            java.util.Iterator it10 = list.iterator();
                            while (true) {
                                if (!it10.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it10.next();
                                java.lang.String str14 = (java.lang.String) obj;
                                if (!kotlin.jvm.internal.o.b(str14, str13) && r26.i0.A(str14, str13, false, 2, obj15)) {
                                    break;
                                } else {
                                    obj15 = null;
                                }
                            }
                            if (obj == null) {
                                java.util.List f011 = r26.n0.f0(str13, new java.lang.String[]{"."}, false, 0, 6, null);
                                java.lang.String str15 = f011.size() == 4 ? "assistant.more." + ((java.lang.String) f011.get(2)) : "";
                                r45.vs2 vs2Var5 = new r45.vs2();
                                vs2Var5.f388491i = 3600;
                                vs2Var5.f388486d = 400000;
                                vs2Var5.C = -4758357817339078452L;
                                vs2Var5.f388487e = i66 + 30000;
                                vs2Var5.f388494o = true;
                                java.util.LinkedList linkedList11 = vs2Var5.f388489g;
                                r45.f03 f03Var11 = new r45.f03();
                                f03Var11.f373887d = 1;
                                f03Var11.f373900t = z17 ? 1 : 0;
                                f03Var11.f373891h = 1;
                                f03Var11.f373893m = str15.length() == 0 ? "assistant.more" : str15;
                                f03Var11.f373892i = str13;
                                linkedList11.add(f03Var11);
                                if (str15.length() > 0) {
                                    java.util.LinkedList linkedList12 = vs2Var5.f388489g;
                                    r45.f03 f03Var12 = new r45.f03();
                                    i17 = 1;
                                    f03Var12.f373887d = 1;
                                    f03Var12.f373891h = 2;
                                    f03Var12.f373893m = "assistant.more";
                                    f03Var12.f373892i = str15;
                                    linkedList12.add(f03Var12);
                                } else {
                                    i17 = 1;
                                }
                                java.util.LinkedList linkedList13 = vs2Var5.f388489g;
                                r45.f03 f03Var13 = new r45.f03();
                                f03Var13.f373887d = i17;
                                f03Var13.f373891h = 2;
                                f03Var13.f373892i = "assistant.more";
                                linkedList13.add(f03Var13);
                                vs2Var5.f388490h = java.lang.String.valueOf(str13.hashCode());
                                zy2.fa.D(((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk(), vs2Var5, "mockAssistantMore", null, true, null, 20, null);
                            }
                        }
                    }
                    i66 = i67;
                }
                r45.vs2 vs2Var6 = new r45.vs2();
                vs2Var6.f388491i = 3600;
                vs2Var6.f388486d = 400000;
                vs2Var6.C = -4758357817339078452L;
                vs2Var6.f388487e = 30001;
                vs2Var6.f388494o = true;
                java.util.LinkedList linkedList14 = vs2Var6.f388489g;
                r45.f03 f03Var14 = new r45.f03();
                f03Var14.f373887d = 1;
                f03Var14.f373900t = z17 ? 1000 : 0;
                f03Var14.f373891h = 1;
                f03Var14.f373893m = "startlive.mode.audio";
                f03Var14.f373892i = "startlive.mode.audio.ktv";
                linkedList14.add(f03Var14);
                java.util.LinkedList linkedList15 = vs2Var6.f388489g;
                r45.f03 f03Var15 = new r45.f03();
                f03Var15.f373887d = 1;
                f03Var15.f373891h = 2;
                f03Var15.f373892i = "startlive.mode.audio";
                linkedList15.add(f03Var15);
                vs2Var6.f388490h = java.lang.String.valueOf(1501439274);
                zy2.fa.D(((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk(), vs2Var6, "appendRed", null, true, null, 20, null);
                return;
            }
            java.lang.Object next = it.next();
            int i68 = i28 + 1;
            if (i28 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.lang.String str16 = (java.lang.String) next;
            if (!kotlin.jvm.internal.o.b(str16, "audience.more") && r26.i0.A(str16, "audience.more", false, 2, null)) {
                java.util.Iterator it11 = list.iterator();
                while (true) {
                    if (!it11.hasNext()) {
                        break;
                    }
                    java.lang.Object next2 = it11.next();
                    java.lang.String str17 = (java.lang.String) next2;
                    if (!kotlin.jvm.internal.o.b(str17, str16) && r26.i0.A(str17, str16, false, 2, null)) {
                        obj6 = next2;
                        break;
                    }
                }
                if (obj6 == null) {
                    java.util.List f012 = r26.n0.f0(str16, new java.lang.String[]{"."}, false, 0, 6, null);
                    java.lang.String str18 = f012.size() == 4 ? "audience.more." + ((java.lang.String) f012.get(2)) : "";
                    r45.vs2 vs2Var7 = new r45.vs2();
                    vs2Var7.f388491i = 3600;
                    vs2Var7.f388486d = 400000;
                    vs2Var7.C = -4758357817339078452L;
                    vs2Var7.f388487e = i28 + 30000;
                    vs2Var7.f388494o = true;
                    java.util.LinkedList linkedList16 = vs2Var7.f388489g;
                    r45.f03 f03Var16 = new r45.f03();
                    f03Var16.f373887d = 1;
                    f03Var16.f373891h = 1;
                    f03Var16.f373900t = z17 ? 1 : 0;
                    f03Var16.f373893m = str18.length() == 0 ? "audience.more" : str18;
                    f03Var16.f373892i = str16;
                    linkedList16.add(f03Var16);
                    if (str18.length() > 0) {
                        java.util.LinkedList linkedList17 = vs2Var7.f388489g;
                        r45.f03 f03Var17 = new r45.f03();
                        i27 = 1;
                        f03Var17.f373887d = 1;
                        f03Var17.f373891h = 2;
                        f03Var17.f373893m = "audience.more";
                        f03Var17.f373892i = str18;
                        linkedList17.add(f03Var17);
                    } else {
                        i27 = 1;
                    }
                    java.util.LinkedList linkedList18 = vs2Var7.f388489g;
                    r45.f03 f03Var18 = new r45.f03();
                    f03Var18.f373887d = i27;
                    f03Var18.f373891h = 2;
                    f03Var18.f373892i = "audience.more";
                    linkedList18.add(f03Var18);
                    vs2Var7.f388490h = java.lang.String.valueOf(str16.hashCode());
                    zy2.fa.D(((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk(), vs2Var7, "mockVisitor", null, true, null, 20, null);
                }
            }
            i28 = i68;
        }
    }

    public void vj(android.content.Context context, java.lang.String qrCodeUrl) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(qrCodeUrl, "qrCodeUrl");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSelectContactUI.class);
        intent.putExtra("KEY_PARAMS_IS_FROM_QR_CODE", true);
        intent.putExtra("KEY_PARAMS_QR_CODE_URL", qrCodeUrl);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/finder/live/FinderLiveFeatureService", "enterLiveSelectRoom", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/feature/finder/live/FinderLiveFeatureService", "enterLiveSelectRoom", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            activity.overridePendingTransition(com.tencent.mm.R.anim.f477876e0, com.tencent.mm.R.anim.f477728p);
        }
    }

    public boolean vk(r45.nw1 nw1Var, java.lang.String sceneTag) {
        kotlin.jvm.internal.o.g(sceneTag, "sceneTag");
        boolean z17 = pm0.v.z(nw1Var != null ? nw1Var.getInteger(37) : 0, 524288);
        boolean gk6 = gk(nw1Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feedSwitch scene=");
        sb6.append(sceneTag);
        sb6.append(", flag=");
        sb6.append(nw1Var != null ? java.lang.Integer.valueOf(nw1Var.getInteger(37)) : null);
        sb6.append(", pay=");
        sb6.append(gk6);
        sb6.append(", type=");
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", sb6.toString());
        return z17 && !gk6;
    }

    public java.lang.Object wj(android.content.Context context, long j17, java.lang.String str, android.widget.ImageView imageView, int i17, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new com.tencent.mm.feature.finder.live.i3(this, i17, context, j17, str, imageView, null), continuation);
        return g17 == pz5.a.f359186d ? g17 : jz5.f0.f302826a;
    }

    public void wk(int i17) {
        df2.vh vhVar;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var;
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
        if (liveRoomControllerStore == null || (vhVar = (df2.vh) liveRoomControllerStore.controller(df2.vh.class)) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i(vhVar.f231602m, "notifyWebviewStatus cur status:" + i17 + ",last status:" + vhVar.f231608s);
        if (i17 == 1) {
            com.tencent.mm.plugin.finder.live.view.ub ubVar = vhVar.f291099e;
            k0Var = ubVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) ubVar : null;
            if (k0Var != null) {
                k0Var.disableRatation();
            }
        } else if (i17 == 2 && vhVar.f231608s == 1) {
            com.tencent.mm.plugin.finder.live.view.ub ubVar2 = vhVar.f291099e;
            k0Var = ubVar2 instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) ubVar2 : null;
            if (k0Var != null) {
                k0Var.enableRotation();
            }
        }
        vhVar.f231608s = i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void xj(android.widget.TextView r7, android.widget.ImageView r8, t40.a r9, float r10) {
        /*
            r6 = this;
            if (r8 == 0) goto L8c
            r0 = 1
            r1 = 0
            if (r9 == 0) goto L17
            java.lang.String r2 = r9.f415468a
            if (r2 == 0) goto L17
            int r2 = r2.length()
            if (r2 <= 0) goto L12
            r2 = r0
            goto L13
        L12:
            r2 = r1
        L13:
            if (r2 != r0) goto L17
            r2 = r0
            goto L18
        L17:
            r2 = r1
        L18:
            if (r2 == 0) goto L3d
            mn2.g1 r2 = mn2.g1.f329975a
            vo0.d r3 = r2.a()
            mn2.q3 r4 = new mn2.q3
            java.lang.String r9 = r9.f415468a
            com.tencent.mm.plugin.finder.storage.y90 r5 = com.tencent.mm.plugin.finder.storage.y90.f128356f
            r4.<init>(r9, r5)
            mn2.f1 r9 = mn2.f1.f329953d
            yo0.i r9 = r2.h(r9)
            wo0.c r9 = r3.b(r4, r9)
            r9.c(r8)
            r8.setVisibility(r1)
            zj(r7, r10, r0)
            goto L8c
        L3d:
            if (r9 == 0) goto L46
            int r9 = r9.f415469b
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            goto L47
        L46:
            r9 = 0
        L47:
            if (r9 != 0) goto L4a
            goto L65
        L4a:
            int r2 = r9.intValue()
            if (r2 != r0) goto L65
            android.content.Context r9 = r8.getContext()
            r2 = 2131691052(0x7f0f062c, float:1.9011165E38)
            android.graphics.drawable.Drawable r9 = i65.a.i(r9, r2)
            r8.setImageDrawable(r9)
            r8.setVisibility(r1)
            zj(r7, r10, r0)
            goto L8c
        L65:
            if (r9 != 0) goto L68
            goto L84
        L68:
            int r9 = r9.intValue()
            r2 = 2
            if (r9 != r2) goto L84
            android.content.Context r9 = r8.getContext()
            r2 = 2131691051(0x7f0f062b, float:1.9011163E38)
            android.graphics.drawable.Drawable r9 = i65.a.i(r9, r2)
            r8.setImageDrawable(r9)
            r8.setVisibility(r1)
            zj(r7, r10, r0)
            goto L8c
        L84:
            r9 = 8
            r8.setVisibility(r9)
            zj(r7, r10, r1)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.finder.live.v4.xj(android.widget.TextView, android.widget.ImageView, t40.a, float):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(45:1|(1:3)(1:161)|4|(1:6)(1:160)|7|(1:9)(1:159)|10|(5:125|126|(1:128)(1:155)|(1:130)(1:154)|(38:132|133|134|(1:136)(4:137|(1:139)(1:151)|(4:141|(1:143)(1:150)|(1:145)(1:149)|(1:147))|13)|(1:15)(1:124)|16|(7:18|(1:20)(1:122)|21|(1:23)|24|25|26)(1:123)|27|(1:29)(1:118)|(1:31)|32|(1:34)(1:117)|35|(1:37)|38|(1:40)|41|42|43|44|45|(1:47)(1:110)|48|49|(1:51)|52|(7:54|(1:105)|58|(1:104)|62|(1:103)|66)(1:106)|67|(1:69)|70|(1:72)(1:102)|73|(4:75|(3:80|81|(1:79))|77|(0))|85|(1:87)(1:101)|(4:89|(1:93)|94|(1:96))(1:100)|97|98))|12|13|(0)(0)|16|(0)(0)|27|(0)(0)|(0)|32|(0)(0)|35|(0)|38|(0)|41|42|43|44|45|(0)(0)|48|49|(0)|52|(0)(0)|67|(0)|70|(0)(0)|73|(0)|85|(0)(0)|(0)(0)|97|98|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x026b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0273, code lost:
    
        com.tencent.mars.xlog.Log.w("MicroMsg.FinderLiveFeatureService", "openFinderLive ex:" + r0.getMessage());
        r0 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x026d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x026e, code lost:
    
        r9 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0270, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0271, code lost:
    
        r9 = "";
        r7 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0447  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void xk(org.json.JSONObject r31, boolean r32, vd2.g5 r33, vd2.g5 r34, java.lang.String r35) {
        /*
            Method dump skipped, instructions count: 1241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.finder.live.v4.xk(org.json.JSONObject, boolean, vd2.g5, vd2.g5, java.lang.String):void");
    }

    public void yj(android.widget.TextView textView, android.widget.ImageView imageView, zy2.c cVar, float f17) {
        r45.g92 g92Var;
        r45.g92 g92Var2;
        xj(textView, imageView, new t40.a((cVar == null || (g92Var2 = cVar.f477359b) == null) ? null : g92Var2.getString(17), (cVar == null || (g92Var = cVar.f477359b) == null) ? 0 : g92Var.getInteger(18)), f17);
    }

    public java.util.List yk(android.view.View view, java.util.List info, int[] spanFilter, int i17, int i18) {
        gm2.e2 e2Var;
        gm2.c2 c2Var;
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(spanFilter, "spanFilter");
        gm2.c1 c1Var = gm2.c1.f273320a;
        gm2.c2.f273346e.getClass();
        gm2.c2[] c2VarArr = gm2.c2.f273347f;
        int length = c2VarArr.length;
        int i19 = 0;
        while (true) {
            e2Var = null;
            if (i19 >= length) {
                c2Var = null;
                break;
            }
            c2Var = c2VarArr[i19];
            if (c2Var.f273353d == i17) {
                break;
            }
            i19++;
        }
        gm2.c2 c2Var2 = c2Var == null ? gm2.c2.f273349h : c2Var;
        gm2.e2.f273359e.getClass();
        gm2.e2[] e2VarArr = gm2.e2.f273360f;
        int length2 = e2VarArr.length;
        int i27 = 0;
        while (true) {
            if (i27 >= length2) {
                break;
            }
            gm2.e2 e2Var2 = e2VarArr[i27];
            if (e2Var2.f273364d == i18) {
                e2Var = e2Var2;
                break;
            }
            i27++;
        }
        return gm2.c1.r(c1Var, info, spanFilter, c2Var2, e2Var == null ? gm2.e2.f273361g : e2Var, 0, view, null, 0, 0, null, null, 2000, null);
    }

    public void zk(android.widget.TextView text, java.util.List list, java.util.List list2, java.lang.String str, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(text, "text");
        kotlin.jvm.internal.o.g(str, "str");
        st2.g3 g3Var = st2.g3.f412326a;
        if (list == null || list.isEmpty()) {
            text.setText(str);
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if ((list2 != null ? list2.size() : 0) == 0) {
            return;
        }
        int i18 = 0;
        for (java.lang.Object obj : list) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            float floatValue = list2 != null ? ((java.lang.Number) list2.get(i18)).floatValue() : 1.0f;
            int i27 = (int) (i17 * ((floatValue > 0.0f ? 1 : (floatValue == 0.0f ? 0 : -1)) == 0 ? 1.0f : floatValue));
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            arrayList.add(java.lang.Integer.valueOf(i27));
            java.lang.Object obj2 = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/ShoppingUtil", "preInsertImageSpanToText", "(Landroid/widget/TextView;Ljava/util/List;Ljava/util/List;Ljava/lang/String;IZ)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj2, createBitmap, "com/tencent/mm/plugin/finder/shopping/ShoppingUtil", "preInsertImageSpanToText", "(Landroid/widget/TextView;Ljava/util/List;Ljava/util/List;Ljava/lang/String;IZ)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
            createBitmap.eraseColor(text.getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_0_3));
            st2.g3 g3Var2 = st2.g3.f412326a;
            android.content.Context context = text.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            linkedList.add(g3Var2.j(context, createBitmap, i17));
            if (z17) {
                gm2.c1 c1Var = gm2.c1.f273320a;
                linkedList.addLast((android.text.style.ImageSpan) ((jz5.n) gm2.c1.f273343x).getValue());
            }
            i18 = i19;
        }
        gm2.c1 c1Var2 = gm2.c1.f273320a;
        android.content.Context context2 = text.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        text.setText(c1Var2.q(context2, str, linkedList, true));
    }
}
