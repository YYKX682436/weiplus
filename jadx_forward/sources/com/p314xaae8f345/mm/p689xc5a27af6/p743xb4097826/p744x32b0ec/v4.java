package com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec;

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
    public final java.util.concurrent.ConcurrentHashMap f148519g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f148520h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f148521i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f148522m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f148523n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f148524o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.q1 f148525p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 f148526q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.Stack f148527r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f148528s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f148529t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f148530u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f148531v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f148532w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f148533x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f148534y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f148535z;

    public v4() {
        super("PluginFinderLive");
        this.f148519g = new java.util.concurrent.ConcurrentHashMap();
        this.f148520h = new java.util.concurrent.ConcurrentHashMap();
        this.f148521i = new java.util.concurrent.ConcurrentHashMap();
        this.f148522m = new java.util.concurrent.ConcurrentHashMap();
        this.f148523n = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("FinderLiveInfoHandler");
        this.f148526q = new com.p314xaae8f345.mm.sdk.p2603x2137b148.r2(500);
        this.f148527r = new java.util.Stack();
        this.f148528s = jz5.h.b(new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.d4(this));
        this.f148529t = jz5.h.b(new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.f4(this));
        this.f148530u = jz5.h.b(new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.e4(this));
        this.f148531v = jz5.h.b(new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.a4(this));
        this.f148532w = jz5.h.b(new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.g4(this));
        this.f148533x = jz5.h.b(new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.z3(this));
        this.f148534y = jz5.h.b(new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.o3(this));
        this.f148535z = jz5.h.b(new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.q3(this));
        this.A = jz5.h.b(new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.b4(this));
        this.B = jz5.h.b(new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.c4(this));
        this.C = jz5.h.b(new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.n3(this));
        this.D = jz5.h.b(new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.m3(this));
        this.E = jz5.h.b(new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.p3(this));
        this.F = jz5.h.b(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.h4.f148283d);
        this.G = new java.util.LinkedHashMap();
        this.H = new java.util.LinkedHashMap();
    }

    public static final void Ai(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4 v4Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, android.content.Context context, java.lang.String str, int i17, int i18, int i19, java.lang.String str2, zy2.i5 i5Var, zy2.i5 i5Var2) {
        r45.nw1 m76794xd0557130;
        v4Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", "getOpenFinderLiveReplay errCode:" + i19 + " errType:" + i18 + " errMsg:" + str2);
        if (i18 != 0 || i19 != 0) {
            if (i5Var2 != null) {
                i5Var2.a(java.lang.Integer.valueOf(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.ErrorCode.f15117xb77c61b3));
                return;
            }
            return;
        }
        java.lang.String str3 = null;
        boolean bj6 = ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).bj(c19792x256d2725 != null ? c19792x256d2725.m76836x6c03c64c() : null, c19792x256d2725 != null ? c19792x256d2725.m76794xd0557130() : null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("autoOpenFinderLiveReplay isReplayLive:");
        sb6.append(bj6);
        sb6.append(',');
        if (c19792x256d2725 != null && (m76794xd0557130 = c19792x256d2725.m76794xd0557130()) != null) {
            str3 = cm2.a.f124861a.y(m76794xd0557130);
        }
        sb6.append(str3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", sb6.toString());
        if (!bj6) {
            if (i5Var2 != null) {
                i5Var2.a(java.lang.Integer.valueOf(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.ErrorCode.f15116xa552212a));
            }
        } else {
            pm0.v.X(new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.x1(v4Var, c19792x256d2725, i17, str, context));
            if (i5Var != null) {
                i5Var.a(0);
            }
        }
    }

    public static final l75.k0 Bi(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4 v4Var) {
        v4Var.getClass();
        return ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Nj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.v80.f209711d);
    }

    public static final java.lang.String bj(android.hardware.camera2.CameraManager cameraManager, int i17) {
        java.lang.String str;
        java.lang.String[] cameraIdList = cameraManager.getCameraIdList();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cameraIdList, "getCameraIdList(...)");
        int length = cameraIdList.length;
        int i18 = 0;
        while (true) {
            if (i18 >= length) {
                str = null;
                break;
            }
            str = cameraIdList[i18];
            android.hardware.camera2.CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cameraCharacteristics, "getCameraCharacteristics(...)");
            java.lang.Integer num = (java.lang.Integer) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == i17) {
                break;
            }
            i18++;
        }
        if (str != null) {
            return str;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderLiveFeatureService", "can not find the id: %s in camera manage", java.lang.Integer.valueOf(i17));
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

    public static final void tj(java.lang.Integer num, java.util.List list, java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4 v4Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, java.lang.String str4, long j17) {
        r45.q82 q82Var;
        java.lang.String m75945x2fec8307;
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
            ml2.q1 q1Var = ml2.q1.f409345e;
            ((m30.m) qVar).getClass();
            a52.a.d("341");
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            ml2.y4 y4Var = ml2.j0.f409116i;
            y4Var.getClass();
            y4Var.f409819a = "341";
            intent.putExtra("key_enter_live_param_by_pass_type", 8);
        } else {
            n30.q qVar2 = (n30.q) i95.n0.c(n30.q.class);
            ml2.q1 q1Var2 = ml2.q1.f409345e;
            ((m30.m) qVar2).getClass();
            a52.a.d("temp_12");
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            ml2.y4 y4Var2 = ml2.j0.f409116i;
            y4Var2.getClass();
            y4Var2.f409819a = "temp_12";
        }
        cl0.g gVar = new cl0.g();
        try {
            gVar.s("bizusername", str2);
            gVar.s("exposeType", str5);
            gVar.s("finder_username", c19792x256d2725.m76836x6c03c64c());
            gVar.s("wx_username", str2);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FinderLiveFeatureService", "err:" + e17.getMessage());
        }
        intent.putExtra("key_chnl_extra", gVar.toString());
        java.lang.String m76829x97edf6c0 = str3 == null || str3.length() == 0 ? c19792x256d2725.m76829x97edf6c0() : str3;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        long m76784x5db1b11 = c19792x256d2725.m76784x5db1b11();
        r45.nw1 m76794xd0557130 = c19792x256d2725.m76794xd0557130();
        java.lang.Long valueOf = java.lang.Long.valueOf(m76794xd0557130 != null ? m76794xd0557130.m75942xfb822ef2(0) : 0L);
        java.lang.String m76803x6c285d75 = c19792x256d2725.m76803x6c285d75();
        java.lang.String str7 = m76803x6c285d75 == null ? "" : m76803x6c285d75;
        r45.nw1 m76794xd05571302 = c19792x256d2725.m76794xd0557130();
        java.lang.String str8 = (m76794xd05571302 == null || (m75945x2fec8307 = m76794xd05571302.m75945x2fec8307(3)) == null) ? "" : m75945x2fec8307;
        r45.nw1 m76794xd05571303 = c19792x256d2725.m76794xd0557130();
        if (m76794xd05571303 != null && (q82Var = (r45.q82) m76794xd05571303.m75936x14adae67(9)) != null) {
            i17 = q82Var.m75939xb282bd08(0);
        }
        v4Var.uj(intent, context, m76784x5db1b11, valueOf, "", str7, "", str4, m76829x97edf6c0, "", 0, str8, i17, true, j17, java.lang.Integer.valueOf(num != null ? num.intValue() : 0));
    }

    public static final void zj(android.widget.TextView textView, float f17, boolean z17) {
        if (textView != null) {
            textView.setPaddingRelative(0, 0, z17 ? i65.a.a(textView.getContext(), f17) : 0, 0);
        }
    }

    public void Aj(android.widget.ImageView imageView, java.lang.String str, float f17, yz5.l lVar) {
        if (imageView == null) {
            if (lVar != null) {
                lVar.mo146xb9724478(null);
                return;
            }
            return;
        }
        if (str == null || str.length() == 0) {
            if (lVar != null) {
                lVar.mo146xb9724478(null);
            }
            imageView.setVisibility(8);
        } else {
            mn2.g1 g1Var = mn2.g1.f411508a;
            wo0.c b17 = g1Var.e().b(new mn2.q3(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e), g1Var.h(mn2.f1.f411498s));
            com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.l3 l3Var = new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.l3(imageView, lVar);
            b17.getClass();
            b17.f529406d = l3Var;
            b17.f();
        }
    }

    public void Ak(long j17, java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        this.f148526q.put(java.lang.Long.valueOf(j17), url);
        java.util.Stack stack = this.f148527r;
        try {
            if (stack.size() > 10) {
                kz5.h0.C(stack);
            }
            stack.add(new jz5.l(java.lang.Long.valueOf(j17), url));
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.util.Iterator it = stack.iterator();
            while (it.hasNext()) {
                jz5.l lVar = (jz5.l) it.next();
                jSONObject.put(java.lang.String.valueOf(((java.lang.Number) lVar.f384366d).longValue()), lVar.f384367e);
            }
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_COVER_URL_CACHE_STRING_SYNC, jSONObject.toString());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", "putCoverUrl " + e17);
        }
    }

    public android.content.Intent Bj(android.content.Intent intent, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo, r45.md5 md5Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.z9 z9Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.aa.f198438h;
        c00.c3 c3Var = (c00.c3) i95.n0.c(c00.c3.class);
        java.lang.String wi6 = c3Var != null ? ((b00.u) c3Var).wi(msgInfo) : "";
        if (intent == null) {
            intent = new android.content.Intent();
        }
        z9Var.a(intent, wi6, md5Var);
        return intent;
    }

    public void Bk(long j17) {
        this.f148523n.mo50293x3498a0(new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.m4(j17, this));
    }

    public android.content.Intent Cj(android.content.Intent intent, java.lang.String str, r45.md5 md5Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.z9 z9Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.aa.f198438h;
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
            r0.mo11468x92b714fd(r2)     // Catch: java.lang.Exception -> L1b
            goto L26
        L1b:
            r0 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "safeParser"
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r2, r3, r0)
        L25:
            r0 = 0
        L26:
            r2 = 1
            if (r0 == 0) goto L42
            r4 = 2
            java.lang.String r4 = r0.m75945x2fec8307(r4)
            boolean r7 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r4, r7)
            if (r7 == 0) goto L42
            java.lang.Long r7 = java.lang.Long.valueOf(r8)
            r0.set(r2, r7)
            byte[] r7 = r0.mo14344x5f01b1f6()
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
            long r3 = r0.m75942xfb822ef2(r9)
            java.lang.String r9 = pm0.v.u(r3)
            r8.append(r9)
            java.lang.String r9 = ", liveId:"
            r8.append(r9)
            long r0 = r0.m75942xfb822ef2(r2)
            java.lang.String r9 = pm0.v.u(r0)
            r8.append(r9)
            java.lang.String r3 = r8.toString()
        L73:
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "Finder.FinderProductTraceUIC"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r8, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.Ck(android.content.Intent, java.lang.String, long):android.content.Intent");
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.Di(org.json.JSONObject, java.lang.String, android.content.Context, zy2.i5, zy2.i5):void");
    }

    public l81.b1 Dj(java.lang.String str, l81.b1 bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bundle, "bundle");
        l81.p0 p0Var = bundle.f398561i;
        dk2.ah ahVar = p0Var instanceof dk2.ah ? (dk2.ah) p0Var : null;
        if (ahVar == null) {
            ahVar = new dk2.ah();
        }
        ahVar.f314758u = str == null ? "" : str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProductTraceUIC", "fillTraceInfoToWeApp lastGMsgId:" + str + ", ");
        bundle.f398561i = ahVar;
        return bundle;
    }

    public void Dk(android.content.Context context, java.lang.String jsonStr, zy2.i5 didOpenCallback, zy2.i5 failCallback, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonStr, "jsonStr");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(didOpenCallback, "didOpenCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(failCallback, "failCallback");
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.nd ndVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.nd.f190103a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.nd.f190104b = new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.p4(didOpenCallback);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.nd.f190105c = new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.q4(failCallback);
        intent.addFlags(268435456);
        intent.putExtra("finder_jump_data", jsonStr);
        intent.putExtra("finder_jump_type", 1);
        intent.putExtra("is_from_app_brand", z17);
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13969x9d1c9ae0.class);
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.Ej(java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public void Ek() {
        r45.nw1 nw1Var;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3();
        am.ia iaVar = c5445x963cab3.f135785g;
        if (iaVar != null) {
            mm2.e1 e1Var = (mm2.e1) dk2.ef.f314905a.i(mm2.e1.class);
            iaVar.f88451a = ((e1Var == null || (nw1Var = e1Var.f410521r) == null) ? null : java.lang.Long.valueOf(nw1Var.m75942xfb822ef2(0))).longValue();
        }
        if (iaVar != null) {
            iaVar.f88452b = 14;
        }
        c5445x963cab3.e();
    }

    public java.lang.String Fj() {
        java.lang.String str;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
        dk2.ef efVar = dk2.ef.f314905a;
        gk2.e eVar = dk2.ef.I;
        if (eVar == null) {
            str = null;
        } else if (!((mm2.c1) eVar.a(mm2.c1.class)).a8() ? (str = (java.lang.String) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) eVar.a(mm2.g1.class)).f410609q).mo144003x754a37bb()) == null : !((c19792x256d2725 = ((mm2.c1) eVar.a(mm2.c1.class)).f410379n) != null && (m76802x2dd01666 = c19792x256d2725.m76802x2dd01666()) != null && (str = m76802x2dd01666.m76944x730bcac6()) != null)) {
            str = "";
        }
        return str == null ? "" : str;
    }

    public void Fk(r45.nw1 nw1Var, boolean z17) {
        long m75942xfb822ef2 = nw1Var != null ? nw1Var.m75942xfb822ef2(0) : 0L;
        if (nw1Var != null) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f148519g;
            if (concurrentHashMap.get(java.lang.Long.valueOf(m75942xfb822ef2)) == null || z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", "saveLiveInfo liveId:" + m75942xfb822ef2 + ",forceReplace:" + z17 + '!');
                java.lang.Long valueOf = java.lang.Long.valueOf(m75942xfb822ef2);
                java.lang.Integer valueOf2 = java.lang.Integer.valueOf(nw1Var.m75939xb282bd08(2));
                java.lang.Long valueOf3 = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
                r45.l71 l71Var = new r45.l71();
                l71Var.set(1, nw1Var);
                concurrentHashMap.put(valueOf, new jz5.o(valueOf2, valueOf3, l71Var));
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderLiveFeatureService", "saveLiveInfo fail,liveId:" + m75942xfb822ef2 + ",forceReplace:" + z17 + '!');
    }

    public r45.nw1 Gj(long j17) {
        r45.l71 l71Var;
        r45.l71 l71Var2;
        jz5.o oVar = (jz5.o) this.f148519g.get(java.lang.Long.valueOf(j17));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getCacheLiveInfo liveId:");
        sb6.append(j17);
        sb6.append(",liveInfo:");
        sb6.append((oVar == null || (l71Var2 = (r45.l71) oVar.f384376f) == null) ? null : (r45.nw1) l71Var2.m75936x14adae67(1));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", sb6.toString());
        if (oVar == null || (l71Var = (r45.l71) oVar.f384376f) == null) {
            return null;
        }
        return (r45.nw1) l71Var.m75936x14adae67(1);
    }

    public void Gk(android.view.View view, boolean z17, int i17, r45.g92 g92Var) {
        java.lang.String string;
        if (z17) {
            string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dcj);
        } else if (i17 == 2) {
            string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d9p);
        } else if (i17 == 4) {
            string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d_0);
        } else if (i17 != 6) {
            string = pm0.v.z(g92Var != null ? g92Var.m75939xb282bd08(38) : 0, 1048576) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.egz) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d_4);
        } else {
            string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d_1);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        if (view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1) view).m62166x765074af(string);
        } else if (view instanceof android.widget.TextView) {
            ((android.widget.TextView) view).setText(string);
        }
    }

    public r45.l71 Hj(long j17) {
        jz5.o oVar = (jz5.o) this.f148519g.get(java.lang.Long.valueOf(j17));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getCacheLiveInfoResp: liveId=");
        sb6.append(j17);
        sb6.append(", liveInfoResp:");
        sb6.append(oVar != null ? (r45.l71) oVar.f384376f : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", sb6.toString());
        if (oVar != null) {
            return (r45.l71) oVar.f384376f;
        }
        return null;
    }

    public void Hk(android.view.View view, qs5.n cardStatus, boolean z17, r45.g92 g92Var) {
        java.lang.String string;
        java.lang.String m75945x2fec8307;
        java.lang.Long j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cardStatus, "cardStatus");
        jz5.l Ij = Ij((g92Var == null || (m75945x2fec8307 = g92Var.m75945x2fec8307(0)) == null || (j17 = r26.h0.j(m75945x2fec8307)) == null) ? 0L : j17.longValue());
        java.lang.Integer num = Ij != null ? (java.lang.Integer) Ij.f384366d : null;
        int ordinal = cardStatus.ordinal();
        if (ordinal == 0) {
            string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d9p);
        } else if (ordinal == 1) {
            string = pm0.v.z(num != null ? num.intValue() : 0, 2) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mna) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d_1);
        } else if (ordinal == 2) {
            string = z17 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d9z) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d9y);
        } else if (ordinal == 3) {
            string = bk(view, g92Var);
        } else if (ordinal == 4) {
            string = pm0.v.z(num != null ? num.intValue() : 0, 4) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mio) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dcj);
        } else {
            if (ordinal != 5) {
                throw new jz5.j();
            }
            string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573241mm2);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        if (view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1) view).m62166x765074af(string);
        } else if (view instanceof android.widget.TextView) {
            ((android.widget.TextView) view).setText(string);
        }
    }

    public jz5.l Ij(long j17) {
        return (jz5.l) this.f148520h.get(java.lang.Long.valueOf(j17));
    }

    public void Ik(android.view.View view, boolean z17, int i17, r45.g92 g92Var) {
        java.lang.String string = z17 ? i17 == 3 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d9y) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dcj) : i17 != 2 ? (i17 == 4 || i17 == 6) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d_1) : bk(view, g92Var) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d9p);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        if (view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1) view).m62166x765074af(string);
        } else if (view instanceof android.widget.TextView) {
            ((android.widget.TextView) view).setText(string);
        }
    }

    public java.lang.String Jj(long j17) {
        java.lang.String str = (java.lang.String) this.f148526q.get(java.lang.Long.valueOf(j17));
        return str == null ? "" : str;
    }

    public boolean Jk(android.view.MotionEvent motionEvent, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = viewGroup != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f566387fq1) : null;
        if (k0Var == null) {
            return false;
        }
        dk2.ef efVar = dk2.ef.f314905a;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(k0Var, dk2.ef.f314913e)) {
            return false;
        }
        android.content.Context context = k0Var.getContext();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            boolean z17 = abstractActivityC21394xb3d2c0cf.getRequestedOrientation() == 0;
            if ((k0Var.m46546x9b8334b1() && k0Var.getWidth() > k0Var.getHeight()) && z17) {
                return true;
            }
        }
        android.graphics.Rect Kj = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Kj();
        if (Kj != null) {
            return Kj.contains(motionEvent != null ? (int) motionEvent.getX() : 0, motionEvent != null ? (int) motionEvent.getY() : 0);
        }
        return false;
    }

    public android.graphics.Rect Kj() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar;
        dk2.ef efVar = dk2.ef.f314905a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
        if (k0Var == null || (mgVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg) k0Var.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg.class)) == null || !mgVar.C1().isShown()) {
            return null;
        }
        android.graphics.Rect rect = mgVar.W;
        if (rect != null) {
            return rect;
        }
        int[] t17 = pm0.v.t(mgVar.C1());
        int i17 = t17[0];
        android.graphics.Rect rect2 = new android.graphics.Rect(i17, t17[1], mgVar.C1().getWidth() + i17, t17[1] + mgVar.C1().getHeight());
        android.graphics.Rect rect3 = new android.graphics.Rect(rect2.left, rect2.top - mgVar.D1(), rect2.right - ((java.lang.Number) ((jz5.n) mgVar.Z).mo141623x754a37bb()).intValue(), rect2.bottom + mgVar.D1());
        mgVar.W = rect3;
        return rect3;
    }

    public void Kk(java.lang.String str, java.lang.String str2, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w7 w7Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w7.f184189a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderThirdPartyGameLiveUtil", "dealShare, appid:" + str + ", extInfo:" + str2);
        if (str2 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || str == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            if (str == null) {
                str = "";
            }
            w7Var.b(10001, "appid or extInfo empty", str);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderThirdPartyGameLiveUtil", "checkAccount, isSameAccount:" + z17 + ", appid:" + str + ", extInfo:" + str2);
        boolean z18 = true;
        if (!z17) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                w7Var.b(10001, "appid or extInfo empty", str);
            } else {
                try {
                    if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w7.f184190b.contains(java.lang.Integer.valueOf(new org.json.JSONObject(str2).getInt("liveEntryScene"))) && !z17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderThirdPartyGameLiveUtil", "checkAccount false");
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                        u1Var.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dgk));
                        u1Var.a(true);
                        u1Var.n(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1));
                        u1Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t7(str));
                        u1Var.q(false);
                        z18 = false;
                    }
                } catch (java.lang.Throwable unused) {
                }
            }
        }
        if (z18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x2.f184206b = 19L;
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
        dk2.ef efVar = dk2.ef.f314905a;
        gk2.e eVar = dk2.ef.I;
        if (eVar != null) {
            return ((mm2.e1) eVar.a(mm2.e1.class)).f410518o;
        }
        return null;
    }

    public final java.lang.String Lk(java.lang.String str) {
        ml2.o2[] o2VarArr = ml2.o2.f409305d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "5")) {
            ml2.q1 q1Var = ml2.q1.f409345e;
            return "temp_12";
        }
        ml2.o2[] o2VarArr2 = ml2.o2.f409305d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "6")) {
            ml2.q1 q1Var2 = ml2.q1.f409345e;
            return "temp_11";
        }
        ml2.o2[] o2VarArr3 = ml2.o2.f409305d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "7")) {
            ml2.q1 q1Var3 = ml2.q1.f409345e;
            return "temp_14";
        }
        ml2.o2[] o2VarArr4 = ml2.o2.f409305d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "9")) {
            return str;
        }
        ml2.o2[] o2VarArr5 = ml2.o2.f409305d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "15")) {
            ml2.q1 q1Var4 = ml2.q1.f409345e;
            return "temp_13";
        }
        ml2.o2[] o2VarArr6 = ml2.o2.f409305d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27997xfdbbeb01.f62846x68d3fef)) {
            ml2.q1 q1Var5 = ml2.q1.f409345e;
            return "temp_20";
        }
        ml2.o2[] o2VarArr7 = ml2.o2.f409305d;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "341")) {
            return str;
        }
        ml2.q1 q1Var6 = ml2.q1.f409345e;
        return "341";
    }

    public com.p314xaae8f345.mm.p2495xc50a8b8b.g Mj() {
        r45.v74 v74Var;
        r45.u74 u74Var;
        mm2.e1 e1Var = (mm2.e1) dk2.ef.f314905a.i(mm2.e1.class);
        if (e1Var == null || (v74Var = e1Var.f410513g) == null || (u74Var = (r45.u74) v74Var.m75936x14adae67(2)) == null) {
            return null;
        }
        return u74Var.m75934xbce7f2f(0);
    }

    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 Mk(r45.sp1 feedForJoinLive) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedForJoinLive, "feedForJoinLive");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
        c19792x256d2725.m76877x684351d(feedForJoinLive.m75942xfb822ef2(0));
        c19792x256d2725.m76896xfefec3e9(feedForJoinLive.m75945x2fec8307(4));
        c19792x256d2725.m76894x7ac946f0(feedForJoinLive.m75945x2fec8307(3));
        c19792x256d2725.m76929x66bc2758(feedForJoinLive.m75945x2fec8307(2));
        c19792x256d2725.m76922x2ac45d34(feedForJoinLive.m75945x2fec8307(11));
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 c19793xceab7f56 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56();
        c19793xceab7f56.m76982x9713e3a(feedForJoinLive.m75945x2fec8307(8));
        c19792x256d2725.m76895x5bf46472(c19793xceab7f56);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa();
        c19782x23db1cfa.m76218xe0a5bcad(feedForJoinLive.m75945x2fec8307(5));
        c19782x23db1cfa.m76208x619ae8ba(feedForJoinLive.m75945x2fec8307(6));
        c19792x256d2725.m76853xe9f5ad5e(c19782x23db1cfa);
        r45.nw1 nw1Var = new r45.nw1();
        nw1Var.set(0, java.lang.Long.valueOf(feedForJoinLive.m75942xfb822ef2(1)));
        nw1Var.set(3, feedForJoinLive.m75945x2fec8307(7));
        nw1Var.set(21, java.lang.Integer.valueOf(feedForJoinLive.m75939xb282bd08(9)));
        nw1Var.set(28, (r45.o52) feedForJoinLive.m75936x14adae67(10));
        c19792x256d2725.m76887xcb0dd23c(nw1Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", "transferObjectForJoinLive object_id:" + pm0.v.u(c19792x256d2725.m76784x5db1b11()) + ",objectNonceId:" + c19792x256d2725.m76803x6c285d75() + ",nickname:" + c19792x256d2725.m76801x8010e5e4() + ",username:" + c19792x256d2725.m76836x6c03c64c() + ",sessionBuffer:" + c19792x256d2725.m76829x97edf6c0() + ",description:" + feedForJoinLive.m75945x2fec8307(8) + ",headUrl:" + feedForJoinLive.m75945x2fec8307(5) + ",coverUrl:" + feedForJoinLive.m75945x2fec8307(6) + ",liveId:" + pm0.v.u(feedForJoinLive.m75942xfb822ef2(1)) + ",streamUrl:" + feedForJoinLive.m75945x2fec8307(7) + ",secondary_device_flag:" + feedForJoinLive.m75939xb282bd08(9) + ",purchase_info:" + ((r45.o52) feedForJoinLive.m75936x14adae67(10)) + ',');
        return c19792x256d2725;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0084, code lost:
    
        if (r0 == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ni(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 r42, android.content.Context r43, org.json.JSONObject r44, java.lang.String r45) {
        /*
            Method dump skipped, instructions count: 1089
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.Ni(com.tencent.mm.protocal.protobuf.FinderObject, android.content.Context, org.json.JSONObject, java.lang.String):void");
    }

    public final be2.c Nj() {
        return (rl2.d) this.C.mo141623x754a37bb();
    }

    public final rl2.h Oj() {
        return (rl2.h) this.f148528s.mo141623x754a37bb();
    }

    public final rl2.l Pj() {
        return (rl2.l) ((jz5.n) this.f148532w).mo141623x754a37bb();
    }

    public void Qj(java.lang.String str, java.lang.String str2, int i17, yz5.q callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        java.lang.String str3 = str == null ? "" : str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ybVar);
        c61.yb.W3(ybVar, 0L, str2, i17, 2, "", true, null, null, 0L, null, false, false, str3, null, 0, null, 53184, null).l().K(new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.r3(callback));
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x031e, code lost:
    
        if (r1.m75939xb282bd08(2) == 1) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        if (r0 == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ri(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 r38, android.content.Context r39, org.json.JSONObject r40, java.lang.String r41) {
        /*
            Method dump skipped, instructions count: 1117
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.Ri(com.tencent.mm.protocal.protobuf.FinderObject, android.content.Context, org.json.JSONObject, java.lang.String):void");
    }

    public final be2.j Rj() {
        return (rl2.w) this.f148535z.mo141623x754a37bb();
    }

    public java.lang.Object Sj(android.content.Context context, java.lang.String str, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ke2.y yVar;
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        if (z17) {
            yVar = new ke2.y(str, 0, false, null, false, null, 60, null);
            yVar.t(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9y), 100L);
        } else {
            yVar = new ke2.y(str, 0, false, null, false, null, 60, null);
        }
        yVar.l().K(new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.s3(rVar, this, str));
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }

    public r45.va2 Tj(long j17) {
        r45.l71 l71Var;
        jz5.o oVar = (jz5.o) this.f148519g.get(java.lang.Long.valueOf(j17));
        if (oVar == null || (l71Var = (r45.l71) oVar.f384376f) == null) {
            return null;
        }
        return (r45.va2) l71Var.m75936x14adae67(35);
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.Ui(android.content.Context, boolean, boolean):void");
    }

    public java.lang.Integer Uj(long j17, int i17) {
        java.lang.Integer num = (java.lang.Integer) this.f148522m.get(new jz5.l(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17)));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", "getLiveAutoPlayFlag: flag=" + num + ", scene=" + i17 + ", liveId=" + j17);
        return num;
    }

    public void Vi(long j17, int i17, r45.t84 t84Var) {
        this.f148520h.put(java.lang.Long.valueOf(j17), new jz5.l(java.lang.Integer.valueOf(i17), t84Var));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cache style flag for live ");
        sb6.append(j17);
        sb6.append(", switch = ");
        sb6.append(i17);
        sb6.append(", anchorStatus = ");
        sb6.append(t84Var != null ? java.lang.Integer.valueOf(t84Var.m75939xb282bd08(0)) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", sb6.toString());
    }

    public qs5.n Vj(java.lang.String str, r45.nw1 liveInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveInfo, "liveInfo");
        boolean hk6 = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).hk(liveInfo);
        boolean bj6 = ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).bj(str, liveInfo);
        boolean Ri = ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Ri(liveInfo);
        int m75939xb282bd08 = liveInfo.m75939xb282bd08(2);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getLiveCardState(live:");
        sb6.append(liveInfo.m75942xfb822ef2(0));
        sb6.append("),liveStatus:");
        sb6.append(m75939xb282bd08);
        sb6.append('(');
        sb6.append(liveInfo.m75939xb282bd08(2));
        sb6.append("),isChargeLive:");
        sb6.append(hk6);
        sb6.append(",isLiveReplay:");
        sb6.append(bj6);
        sb6.append(", producingReplay:");
        sb6.append(Ri);
        sb6.append(",purchaseInfo null:");
        sb6.append(((r45.o52) liveInfo.m75936x14adae67(28)) == null);
        sb6.append(",anchorUserName:");
        sb6.append(str);
        sb6.append('!');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", sb6.toString());
        return hk6 ? qs5.n.f447977d : bj6 ? qs5.n.f447978e : Ri ? qs5.n.f447979f : m75939xb282bd08 == 1 ? qs5.n.f447980g : qs5.n.f447981h;
    }

    public qs5.n Wj(r45.g92 shareObject, boolean z17) {
        r45.nw1 nw1Var;
        boolean z18;
        r45.t84 t84Var;
        java.lang.Long j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareObject, "shareObject");
        boolean z19 = false;
        if (z17) {
            java.lang.String m75945x2fec8307 = shareObject.m75945x2fec8307(0);
            nw1Var = Gj((m75945x2fec8307 == null || (j17 = r26.h0.j(m75945x2fec8307)) == null) ? 0L : j17.longValue());
            if (nw1Var == null) {
                nw1Var = (r45.nw1) shareObject.m75936x14adae67(24);
            }
        } else {
            nw1Var = (r45.nw1) shareObject.m75936x14adae67(24);
        }
        if (nw1Var != null) {
            z18 = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).hk(nw1Var);
        } else {
            int i17 = qs5.g.f447965a;
            int m75939xb282bd08 = shareObject.m75939xb282bd08(22);
            z18 = m75939xb282bd08 == 2 || m75939xb282bd08 == 8 || m75939xb282bd08 == 16;
        }
        boolean bj6 = nw1Var != null ? ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).bj(shareObject.m75945x2fec8307(1), nw1Var) : ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).ok(shareObject);
        boolean Ri = nw1Var != null ? ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Ri(nw1Var) : false;
        int m75939xb282bd082 = nw1Var != null ? nw1Var.m75939xb282bd08(2) : shareObject.m75939xb282bd08(13);
        jz5.l Ij = Ij(nw1Var != null ? nw1Var.m75942xfb822ef2(0) : 0L);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateLiveTag desc:");
        sb6.append(shareObject.m75945x2fec8307(4));
        sb6.append("(live:");
        sb6.append(shareObject.m75945x2fec8307(0));
        sb6.append(' ');
        sb6.append(shareObject.m75945x2fec8307(3));
        sb6.append("),liveStatus:");
        sb6.append(m75939xb282bd082);
        sb6.append('(');
        sb6.append(nw1Var != null ? java.lang.Integer.valueOf(nw1Var.m75939xb282bd08(2)) : null);
        sb6.append("),chargFlag:");
        sb6.append(shareObject.m75939xb282bd08(22));
        sb6.append(",isChargeLive:");
        sb6.append(z18);
        sb6.append(",isLiveReplay:");
        sb6.append(bj6);
        sb6.append(", producingReplay:");
        sb6.append(Ri);
        sb6.append(", liveInfo null:");
        sb6.append(nw1Var == null);
        sb6.append(",purchaseInfo null:");
        sb6.append((nw1Var != null ? (r45.o52) nw1Var.m75936x14adae67(28) : null) == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", sb6.toString());
        if (z18) {
            return qs5.n.f447977d;
        }
        if (m75939xb282bd082 == 1) {
            return qs5.n.f447980g;
        }
        if (pm0.v.z(Ij != null ? ((java.lang.Number) Ij.f384366d).intValue() : 0, 1)) {
            if (Ij != null && (t84Var = (r45.t84) Ij.f384367e) != null && t84Var.m75939xb282bd08(0) == 1) {
                z19 = true;
            }
            if (z19) {
                return qs5.n.f447982i;
            }
        }
        return bj6 ? qs5.n.f447978e : Ri ? qs5.n.f447979f : qs5.n.f447981h;
    }

    public void Xj(long j17, boolean z17, im5.b bVar, s40.t0 t0Var, int i17, java.lang.String exportId, r45.s74 s74Var, r45.m71 m71Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exportId, "exportId");
        this.f148523n.mo50293x3498a0(new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v3(this, j17, z17, i17, exportId, s74Var, m71Var, bVar, t0Var));
    }

    public void Yj(long j17, int i17, long j18, im5.b bVar, s40.t0 t0Var, int i18) {
        jz5.o oVar = (jz5.o) this.f148519g.get(java.lang.Long.valueOf(j17));
        if (oVar == null || !(((java.lang.Number) oVar.f384374d).intValue() == i17 || jk(oVar, j18))) {
            s40.w0.u9(this, j17, true, bVar, t0Var, i18, null, null, null, 224, null);
        } else {
            pm0.v.X(new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.w3(t0Var, j17, oVar));
        }
    }

    public void Zi(android.content.Context context, yz5.l lVar) {
        if (context != null) {
            zl2.r4 r4Var = zl2.r4.f555483a;
            boolean z17 = pm0.v.z(r4Var.I0().getInt("live_status_flag", 0), 1);
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
            boolean m17 = iq.b.m(context, false, null);
            if (z17 && !m17) {
                r4Var.I0().putInt("live_status_flag", 0);
                new ek2.y0(xy2.c.e(context), new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.k2(java.lang.System.currentTimeMillis(), lVar, c0Var, context, this)).l();
            } else if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Boolean.FALSE);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", "checkUnfinishLive localUnfinishLive:" + z17 + " livingAsAnchor:" + m17);
        }
    }

    public final qo2.e Zj() {
        return (qo2.e) ((jz5.n) this.F).mo141623x754a37bb();
    }

    public boolean aj(int i17) {
        boolean z17 = pm0.v.z(i17, 524288);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", "feedSwitch type=" + z17);
        return z17;
    }

    public final java.lang.String ak(jz5.o oVar) {
        java.lang.String sb6;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(oVar != null ? (java.lang.Integer) oVar.f384374d : null);
        sb7.append(' ');
        sb7.append(oVar != null ? (java.lang.Long) oVar.f384375e : null);
        sb7.append(' ');
        cm2.a aVar = cm2.a.f124861a;
        r45.l71 l71Var = oVar != null ? (r45.l71) oVar.f384376f : null;
        if (l71Var == null) {
            sb6 = "";
        } else {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("liveId:");
            r45.nw1 nw1Var = (r45.nw1) l71Var.m75936x14adae67(1);
            sb8.append(pm0.v.u(nw1Var != null ? nw1Var.m75942xfb822ef2(0) : 0L));
            sb8.append(" refreshInterval:");
            sb8.append(l71Var.m75939xb282bd08(3));
            sb8.append(" replay_status:");
            r45.nw1 nw1Var2 = (r45.nw1) l71Var.m75936x14adae67(1);
            sb8.append(nw1Var2 != null ? java.lang.Integer.valueOf(nw1Var2.m75939xb282bd08(31)) : null);
            sb8.append(' ');
            r45.nw1 nw1Var3 = (r45.nw1) l71Var.m75936x14adae67(1);
            sb8.append(aVar.l(nw1Var3 != null ? (r45.o52) nw1Var3.m75936x14adae67(28) : null));
            sb6 = sb8.toString();
        }
        sb7.append(sb6);
        return sb7.toString();
    }

    public final java.lang.String bk(android.view.View view, r45.g92 g92Var) {
        java.lang.String str;
        java.lang.String str2 = null;
        if (g92Var != null) {
            str = pm0.v.z(g92Var.m75939xb282bd08(38), 1048576) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.egz) : pm0.v.z(g92Var.m75939xb282bd08(38), 2097152) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lvm) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d_4);
        } else {
            str = null;
        }
        if (str == null) {
            if (view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1) {
                str2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1) view).getF212749x();
            } else if (view instanceof android.widget.TextView) {
                str2 = ((android.widget.TextView) view).getText().toString();
            }
            str = str2 == null || str2.length() == 0 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d_4) : str2;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        }
        return str;
    }

    public java.lang.String ck() {
        cl0.g gVar = new cl0.g();
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        gVar.o("t2_switch", vd2.t3.f517454a.f() ? 1 : 0);
        gVar.o("new_square_switch", lk() ? 1 : 0);
        gVar.o("reddot_switch", mk() ? 1 : 0);
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        return r26.i0.t(gVar2, ",", ";", false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void dk(android.app.Activity context, yz5.a finishCallback, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finishCallback, "finishCallback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", "#goToAnchorLiveDirect");
        p3325xe03a0797.p3326xc267989b.l.d(new yg2.b((p012xc85e97e9.p093xedfae76a.y) context, "goToAnchorLiveDirect"), null, null, new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.x3(new yl2.g1((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context, 0, 0L, 6, null), context, z17, finishCallback, null), 3, null);
    }

    public void ek(android.widget.ImageView imageView, android.widget.TextView nickname, android.widget.ImageView author) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc2;
        r45.xk b17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickname, "nickname");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(author, "author");
        ya2.g gVar = ya2.h.f542017a;
        android.content.Context context = nickname.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        ya2.b2 b18 = gVar.b(xy2.c.e(context));
        if (imageView != null) {
            mn2.g1 g1Var = mn2.g1.f411508a;
            vo0.d a17 = g1Var.a();
            java.lang.String m176700xe5e0d2a0 = b18 != null ? b18.m176700xe5e0d2a0() : null;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (m176700xe5e0d2a0 == null) {
                m176700xe5e0d2a0 = "";
            }
            a17.c(new mn2.n(m176700xe5e0d2a0, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.X), imageView, g1Var.h(mn2.f1.f411490h));
        }
        d92.f fVar = d92.f.f309003a;
        android.content.Context context2 = nickname.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        d92.f.a(fVar, context2, nickname, 14.0f, 0.0f, 8, null);
        nickname.setText(b18 != null ? b18.w0() : null);
        com.p314xaae8f345.mm.ui.bk.r0(nickname.getPaint(), 0.8f);
        if (b18 == null || (b17 = ya2.d.b(b18, false)) == null || (c19780xceb4c4dc2 = ya2.d.e(b17)) == null) {
            if (b18 == null) {
                c19780xceb4c4dc = null;
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                zy2.tb.a(ya2.m1.f542044a, author, c19780xceb4c4dc, 0, 4, null);
            }
            c19780xceb4c4dc2 = b18.f69300x731cac1b;
        }
        c19780xceb4c4dc = c19780xceb4c4dc2;
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        zy2.tb.a(ya2.m1.f542044a, author, c19780xceb4c4dc, 0, 4, null);
    }

    public boolean fk() {
        return dk2.ef.f314905a.x();
    }

    public boolean gk(r45.nw1 nw1Var) {
        r45.o52 o52Var;
        int i17 = qs5.g.f447965a;
        int m75939xb282bd08 = (nw1Var == null || (o52Var = (r45.o52) nw1Var.m75936x14adae67(28)) == null) ? 0 : o52Var.m75939xb282bd08(0);
        return m75939xb282bd08 == 2 || m75939xb282bd08 == 8 || m75939xb282bd08 == 16;
    }

    public void hj(android.content.Context context, java.lang.String extInfo, int i17) {
        r45.fd2 fd2Var;
        ml2.y3 y3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfo, "extInfo");
        android.content.Intent intent = new android.content.Intent();
        zl2.r4 r4Var = zl2.r4.f555483a;
        if ((extInfo.length() > 0 ? extInfo : null) != null) {
            cl0.g gVar = new cl0.g(extInfo);
            fd2Var = new r45.fd2();
            cl0.g b17 = gVar.b("tag");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
            zl2.r4.H2(b17, fd2Var);
            cl0.g b18 = b17.b("sub_tag");
            fd2Var.set(3, new r45.fd2());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b18);
            zl2.r4.H2(b18, (r45.fd2) fd2Var.m75936x14adae67(3));
        } else {
            fd2Var = null;
        }
        if (fd2Var != null) {
            intent.putExtra("KEY_TAG_INFO", fd2Var.mo14344x5f01b1f6());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", "createFinderLive sourceScene:" + i17 + ", extInfo:" + extInfo);
        ml2.y3[] m147815xcee59d22 = ml2.y3.m147815xcee59d22();
        int length = m147815xcee59d22.length;
        int i18 = 0;
        while (true) {
            if (i18 >= length) {
                y3Var = null;
                break;
            }
            y3Var = m147815xcee59d22[i18];
            if (y3Var.f409817d == i17) {
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c61.yb.H7((c61.yb) c17, context, intent, 0L, null, 0, 0, false, 124, null);
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14021x37325479.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/finder/live/FinderLiveFeatureService", "createFinderLive", "(Landroid/content/Context;Ljava/lang/String;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/feature/finder/live/FinderLiveFeatureService", "createFinderLive", "(Landroid/content/Context;Ljava/lang/String;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public boolean hk(r45.nw1 nw1Var) {
        return (nw1Var != null && nw1Var.m75939xb282bd08(2) == 1) && gk(nw1Var);
    }

    public void ij(android.content.Context context, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_LUCKY_MONEY_GUIDE_INT_SYNC;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c17.m(u3Var, 0), 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", "createLuckyMoneyLiveImpl");
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
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            c61.yb.H7((c61.yb) c18, context, intent, 0L, null, 0, 0, false, 124, null);
            intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14021x37325479.class);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/feature/finder/live/FinderLiveFeatureService", "createLuckyMoneyLiveImpl", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context, "com/tencent/mm/feature/finder/live/FinderLiveFeatureService", "createLuckyMoneyLiveImpl", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(22385, 3, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        android.content.Intent intent3 = new android.content.Intent();
        java.lang.String obj = gm0.j1.u().c().l(274436, "").toString();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj)) {
            obj = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.e();
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.x0(obj)) {
            obj = "";
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.net.URLEncoder.encode(str != null ? str : "");
        objArr[1] = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        objArr[2] = obj;
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573335ea2, objArr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.nio.charset.Charset charset = r26.c.f450398a;
        byte[] bytes = string.getBytes(charset);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        byte[] encode = android.util.Base64.encode(bytes, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(encode, "encode(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", "WILCOME_URL:".concat(new java.lang.String(encode, charset)));
        intent3.putExtra("rawUrl", string);
        intent3.putExtra("showShare", false);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent3, null);
        gm0.j1.u().c().x(u3Var, 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", "createLuckyMoneyLive show guide");
    }

    public boolean ik() {
        ae2.in inVar = ae2.in.f85221a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85226a4).mo141623x754a37bb()).r()).intValue() == 1;
    }

    public final boolean jk(jz5.o oVar, long j17) {
        boolean z17 = java.lang.System.currentTimeMillis() - (oVar != null ? ((java.lang.Number) oVar.f384375e).longValue() : 0L) < j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", "isLiveInfoOnTime:" + z17 + " status:" + ak(oVar) + ",refreshDuration:" + j17 + ",thread:" + java.lang.Thread.currentThread());
        return z17;
    }

    public boolean kk(android.view.ViewGroup viewGroup) {
        android.view.ViewGroup viewGroup2 = viewGroup != null ? (android.view.ViewGroup) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f566387fq1) : null;
        if (viewGroup2 == null) {
            return false;
        }
        dk2.ef efVar = dk2.ef.f314905a;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(viewGroup2, dk2.ef.f314913e);
    }

    public boolean lk() {
        ae2.in inVar = ae2.in.f85221a;
        return ((java.lang.Number) ae2.in.U3.r()).intValue() == 1;
    }

    public com.p314xaae8f345.mm.p944x882e457a.i mj(java.lang.String userName, java.lang.String noticeId, int i17, r45.qt2 qt2Var, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noticeId, "noticeId");
        return ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).Ri(userName, noticeId, i17, qt2Var, i18);
    }

    public boolean mk() {
        ae2.in inVar = ae2.in.f85221a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.X3).mo141623x754a37bb()).r()).intValue() == 1;
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
    
        if (r6.f111611e <= r10) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x03c1, code lost:
    
        r0 = r6.f111610d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x03c3, code lost:
    
        if (r0 <= 0) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x03c5, code lost:
    
        r13.set(15, java.lang.Integer.valueOf(r0));
        r13.set(16, java.lang.Long.valueOf(r6.f111611e));
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x03d9, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MmecBatchGetProductCardResp.Product", r9.m12792x7531c8a2() + ",discount_price:" + r6.f111610d + ", serverTime:" + r10 + ",end_time_ms:" + r6.f111611e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x040f, code lost:
    
        r13.set(29, r9.d());
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x041e, code lost:
    
        if (r9.m12793x6e095e9(38) == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0420, code lost:
    
        r1 = r9.S;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0424, code lost:
    
        r13.set(19, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x042f, code lost:
    
        if (r9.m12793x6e095e9(56) == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0431, code lost:
    
        r1 = r9.f113485p0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x043e, code lost:
    
        if (r1.f112031q[1] == false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0440, code lost:
    
        r5 = r1.f112021d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0444, code lost:
    
        r13.set(36, r5);
        r5 = r1.f112031q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x044e, code lost:
    
        if (r5[2] == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0450, code lost:
    
        r6 = r1.f112022e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0454, code lost:
    
        r13.set(37, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x045c, code lost:
    
        if (r5[3] == false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x045e, code lost:
    
        r6 = r1.f112023f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0462, code lost:
    
        r13.set(38, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0468, code lost:
    
        if (r5[4] == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x046a, code lost:
    
        r0 = r1.f112024g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x046e, code lost:
    
        r13.set(39, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0476, code lost:
    
        if (r5[7] == false) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0478, code lost:
    
        r0 = r1.f112025h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x047c, code lost:
    
        r13.set(40, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0485, code lost:
    
        if (r5[8] == false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0487, code lost:
    
        r0 = r1.f112026i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x048b, code lost:
    
        r13.set(41, r0);
        r13.set(42, java.lang.Integer.valueOf(r1.f112027m));
        r13.set(43, java.lang.Integer.valueOf(r1.f112028n));
        r13.set(44, java.lang.Integer.valueOf(r1.f112029o));
        r13.set(45, java.lang.Integer.valueOf(r1.f112030p));
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x04c2, code lost:
    
        if (r9.m12793x6e095e9(69) == false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x04c4, code lost:
    
        r0 = r9.f113495x0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x04c8, code lost:
    
        r13.set(46, r0);
        r1 = (r45.br2) r13.f391656d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x04d3, code lost:
    
        if (r1 == null) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x04d5, code lost:
    
        r1 = r1.m75945x2fec8307(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x04d9, code lost:
    
        if (r1 != null) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x04dd, code lost:
    
        r13.set(2, r1);
        r1 = (r45.br2) r13.f391656d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x04e5, code lost:
    
        if (r1 == null) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x04e7, code lost:
    
        r1 = r1.m75945x2fec8307(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x04eb, code lost:
    
        if (r1 != null) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x04ee, code lost:
    
        r13.set(3, r1);
        r0 = (r45.br2) r13.f391656d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x04f6, code lost:
    
        if (r0 == null) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x04f8, code lost:
    
        r0 = r0.m75945x2fec8307(0);
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
        r13.set(7, pm0.v.u(r9.f113474d));
        r5 = r9.f113476f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r5, "getImgUrls(...)");
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
        r5 = r9.m12792x7531c8a2();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x022c, code lost:
    
        if (r5 != null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x022e, code lost:
    
        r5 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x022f, code lost:
    
        r13.set(9, r5);
        r13.set(11, java.lang.Integer.valueOf(r9.f113479i));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0241, code lost:
    
        if (r9.f113473J == 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0243, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0246, code lost:
    
        r13.set(27, java.lang.Boolean.valueOf(r5));
        r5 = ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Ai(r13.m75945x2fec8307(5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0262, code lost:
    
        if (r5 == null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0264, code lost:
    
        r6 = r5.f68907x6b8edeb4;
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
    
        r5 = r5.f68913x21f9b213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0272, code lost:
    
        if (r5 != null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0275, code lost:
    
        r13.set(13, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0280, code lost:
    
        if (r9.m12793x6e095e9(26) == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0282, code lost:
    
        r5 = r9.F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0290, code lost:
    
        if (r5.f113002g[3] == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0292, code lost:
    
        r5 = r5.f113001f;
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
    
        if (r9.m12793x6e095e9(39) == false) goto L113;
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
    
        r6 = r19.m12123x8010e5e4();
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
    
        r6 = r13.m75945x2fec8307(12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x030a, code lost:
    
        r13.set(12, r6);
        r6 = r19.m12123x8010e5e4();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0313, code lost:
    
        if (r6 != null) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0315, code lost:
    
        r6 = r13.m75945x2fec8307(13);
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
    
        r13.set(10, java.lang.Integer.valueOf(r9.f113478h));
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x032b, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MmecBatchGetProductCardResp.Product", "platformHeadImg:" + r13.m75945x2fec8307(12) + " platformName: " + r13.m75945x2fec8307(13) + ", page:" + r19.b() + r15 + r19.m12123x8010e5e4());
        r13.set(14, "");
        r6 = r9.A;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r6, "getShowBoxItems(...)");
        r6 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x037d, code lost:
    
        if (r6.hasNext() == false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x037f, code lost:
    
        r17 = r6.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x038a, code lost:
    
        if (((bw5.o5) r17).f112482d != 1) goto L146;
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
    public java.lang.Object nj(android.content.Context r22, r45.zc4 r23, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r24) {
        /*
            Method dump skipped, instructions count: 1431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.nj(android.content.Context, r45.zc4, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public boolean nk() {
        java.lang.String wi6 = ((p05.v2) ((rh0.x) i95.n0.c(rh0.x.class))).wi(rh0.z.f477146g, "AttackGift");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", "#isPkAttackGiftEnable cfgValue=" + wi6);
        if (!(wi6 == null || wi6.length() == 0)) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B1(wi6) == 1.0f) {
                return false;
            }
        }
        return true;
    }

    public void oj(android.content.Intent intent, android.content.Context context, long j17, java.lang.Long l17, java.lang.String nonceId, java.lang.String str, java.lang.String contextId, java.lang.String str2, java.lang.String str3) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextId, "contextId");
        if (context == null || l17 == null) {
            return;
        }
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).Bi(contextId);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ((c61.ub) i95.n0.c(c61.ub.class))).Fj(intent, context, j17, l17.longValue(), nonceId, str, contextId, str2, str3);
    }

    public boolean ok(r45.g92 shareObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareObject, "shareObject");
        return ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Ni(shareObject);
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo204xfac946a6(context);
        boolean z17 = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", "reportExperimentHit: enableLiveNotifyShowWhileLocking = " + (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_finder_live_lock_phone_notification_switch, 0) > 0));
        ((ku5.t0) ku5.t0.f394148d).h(dk2.hg.f315128d, "Finder.LiveExceptionMonitor");
        if (this.f148525p == null) {
            this.f148525p = new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.q1();
        }
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(this.f148525p, intentFilter);
        ((uh4.c0) i95.n0.c(uh4.c0.class)).Pc(9, new sl2.c());
        ((uh4.c0) i95.n0.c(uh4.c0.class)).q3(9, new sl2.d());
        pm0.v.K(null, com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.j4.f148321d);
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getString("FinderLiveHandOffUtil_current", null);
        if (string != null) {
            if (!(string.length() > 0)) {
                string = null;
            }
            if (string != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveHandOffUtil", "delete not deleted HandOffKey ".concat(string));
                ((d73.i) i95.n0.c(d73.i.class)).A8(string);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveHandOffUtil", "save currentHandOffKey null");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().remove("FinderLiveHandOffUtil_current");
            }
        }
        boolean z18 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LIVE_DEBUG_VIEW_INT_SYNC, 0) == 1;
        l30.h hVar = (l30.h) i95.n0.c(l30.h.class);
        com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.k4 k4Var = new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.k4(z18);
        ((k30.a) hVar).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.i0.c(k4Var);
        try {
            java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_COVER_URL_CACHE_STRING_SYNC, "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str = (java.lang.String) m17;
            if (str.length() <= 0) {
                z17 = false;
            }
            if (z17) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    long c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.b8.c(next);
                    java.lang.String optString = jSONObject.optString(next, "");
                    this.f148527r.add(new jz5.l(java.lang.Long.valueOf(c17), optString));
                    this.f148526q.put(java.lang.Long.valueOf(c17), optString);
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", "onAccountInitialized " + e17);
        }
        qo2.e Zj = Zj();
        Zj.getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c18 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_SHOP_MSG_DB_CHECK_LAST_TIME_INT_SYNC;
        int r17 = c18.r(u3Var, 0);
        int e18 = c01.id.e();
        int i17 = e18 - Zj.f447117f;
        int i18 = i17 >= 0 ? i17 : 0;
        java.lang.String str2 = Zj.f447113b;
        if (r17 < i18) {
            gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(e18));
            int i19 = e18 - Zj.f447116e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[deleteExpiredData] current = " + e18 + ", expiredTime = " + i19);
            try {
                com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae c26924x4cd4bae = Zj.f447115d;
                if (c26924x4cd4bae == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("msgTable");
                    throw null;
                }
                c26924x4cd4bae.m107088x90df30e9(so0.a.f491725k.lt(i19));
                com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae c26924x4cd4bae2 = Zj.f447114c;
                if (c26924x4cd4bae2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sessionTable");
                    throw null;
                }
                c26924x4cd4bae2.m107088x90df30e9(so0.b.f491735h.lt(i19));
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[deleteExpiredData] e:" + e19.getMessage());
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[deleteExpiredData] return, time=" + e18 + ", lastCleanTime=" + r17);
        }
        if (zl2.q4.f555466a.E()) {
            jz5.g gVar = am2.j3.f90237a;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1532x6a710b1.p1533x2fd755.C14291xa8bf98c8) ((jz5.n) am2.j3.f90237a).mo141623x754a37bb()).mo48813x58998cd();
        }
    }

    @Override // l85.m1, i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo836xb8969aab(context);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1.f189464b;
        synchronized (concurrentHashMap) {
            concurrentHashMap.clear();
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.q1 q1Var = this.f148525p;
        if (q1Var != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unregisterReceiver(q1Var);
        }
        this.f148525p = null;
        if (zl2.q4.f555466a.E()) {
            jz5.g gVar = am2.j3.f90237a;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1532x6a710b1.p1533x2fd755.C14291xa8bf98c8) ((jz5.n) am2.j3.f90237a).mo141623x754a37bb()).mo48814x2efc64();
        }
    }

    @Override // l85.m1, i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        wi();
    }

    public void pj(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ((c61.ub) i95.n0.c(c61.ub.class))).getClass();
        if (intent == null) {
            intent = new android.content.Intent();
        }
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, (java.lang.Class) ((jz5.n) jz2.x0.N).mo141623x754a37bb());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderLiveGiftPkgUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderLiveGiftPkgUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public boolean pk() {
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", "isShowFinderLiveEntrance return for isTeenMode！");
            return false;
        }
        if ((c01.z1.j() & 9007199254740992L) != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", "isShowFinderLiveEntrance settingClose!");
            return false;
        }
        if (((c92.h) ((yy2.e) i95.n0.c(yy2.e.class))).Ai()) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", "isShowFinderLiveEntrance find page test disable live!");
        return false;
    }

    public void qj(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
        if (str4 == null) {
            str4 = "";
        }
        long Z = pm0.v.Z(str4);
        if (str5 == null) {
            str5 = "";
        }
        long Z2 = pm0.v.Z(str5);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ubVar).getClass();
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
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Bk(Z2);
        intent.setClass(context, (java.lang.Class) ((jz5.n) jz2.x0.f384307u).mo141623x754a37bb());
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
        if ((nw1Var == null || (o52Var = (r45.o52) nw1Var.m75936x14adae67(28)) == null || !o52Var.m75933x41a8a7f2(1)) ? false : true) {
            return false;
        }
        return !Nj().y0(nw1Var != null ? nw1Var.m75942xfb822ef2(0) : 0L);
    }

    public void rj(android.content.Context context) {
        r45.c33 c33Var;
        r45.c33 c33Var2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ((c61.ub) i95.n0.c(c61.ub.class))).getClass();
        try {
            gk2.e eVar = gk2.e.f354004n;
            if (eVar == null) {
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            r45.i56 i56Var = new r45.i56();
            r45.dv1 dv1Var = ((mm2.f6) eVar.a(mm2.f6.class)).f410571n;
            java.lang.String str = null;
            i56Var.set(0, (dv1Var == null || (c33Var2 = (r45.c33) dv1Var.m75936x14adae67(2)) == null) ? null : c33Var2.m75945x2fec8307(0));
            r45.dv1 dv1Var2 = ((mm2.f6) eVar.a(mm2.f6.class)).f410571n;
            if (dv1Var2 != null && (c33Var = (r45.c33) dv1Var2.m75936x14adae67(2)) != null) {
                str = c33Var.m75945x2fec8307(1);
            }
            i56Var.set(1, str);
            i56Var.set(2, java.lang.Long.valueOf(((mm2.e1) eVar.a(mm2.e1.class)).f410516m));
            int i17 = 3;
            i56Var.set(3, java.lang.Long.valueOf(((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0)));
            i56Var.set(9, ((mm2.e1) eVar.a(mm2.e1.class)).f410517n);
            i56Var.set(4, ((mm2.c1) eVar.a(mm2.c1.class)).f410385o);
            i56Var.set(5, java.lang.String.valueOf(((mm2.c1) eVar.a(mm2.c1.class)).f410394p2));
            i56Var.set(6, ((mm2.c1) eVar.a(mm2.c1.class)).P3);
            i56Var.set(7, ((mm2.c1) eVar.a(mm2.c1.class)).f410324d3);
            if (!((mm2.c1) eVar.a(mm2.c1.class)).T) {
                i17 = ((mm2.n0) eVar.a(mm2.n0.class)).f410806r ? 16 : 1;
            }
            i56Var.set(8, java.lang.Integer.valueOf(i17));
            java.util.List b17 = ((mm2.f6) eVar.a(mm2.f6.class)).f410572o.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y.f184235d);
            intent.putExtra("KEY_PARAMS", i56Var.mo14344x5f01b1f6());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.q1 q1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.q1.f197186a;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(b17, 10));
            java.util.Iterator it = ((java.util.ArrayList) b17).iterator();
            while (it.hasNext()) {
                so2.j5 j5Var = (so2.j5) it.next();
                r45.rv2 rv2Var = new r45.rv2();
                if (j5Var instanceof cm2.i0) {
                    rv2Var.set(0, 1L);
                    rv2Var.set(1, ((cm2.i0) j5Var).f124887v);
                    ((cm2.i0) j5Var).f124887v.mo14344x5f01b1f6();
                } else if (j5Var instanceof cm2.m0) {
                    rv2Var.set(0, 0L);
                    rv2Var.set(2, ((cm2.m0) j5Var).f124901v);
                }
                arrayList.add(rv2Var.mo14344x5f01b1f6());
            }
            q1Var.b(intent, "KEY_PRODUCTLIST", arrayList);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ((c61.ub) i95.n0.c(c61.ub.class))).Lj((android.app.Activity) context, intent, 1013);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.ActivityRouter", "Error creating enhanced intent from ECS: " + e17.getMessage());
        }
    }

    public boolean rk() {
        return dk2.ef.f314905a.A();
    }

    public void sj(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.util.List list, java.util.List list2, r45.nw1 nw1Var, java.lang.String str3, byte[] bArr) {
        java.util.ArrayList arrayList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", "enterFinderLiveUIByBiz dataBuffer:" + bArr);
        r45.sp1 sp1Var2 = new r45.sp1();
        if (bArr != null) {
            try {
                sp1Var2.mo11468x92b714fd(bArr);
                sp1Var = sp1Var2;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            }
        }
        if (sp1Var != null) {
            tj(num, arrayList, str, str2, str3, this, Mk(sp1Var), Gj, elapsedRealtime);
            return;
        }
        az2.q qVar = new az2.q();
        qVar.f97685a = new java.lang.ref.WeakReference(context);
        if (context instanceof android.app.Activity) {
            qVar.b();
        }
        i95.m c17 = i95.n0.c(c61.yb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c61.yb.W3((c61.yb) c17, 0L, "", 65, 2, "", true, null, null, 0L, null, false, false, str == null ? "" : str, null, 0, null, 53184, null).l().K(new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.c3(qVar, str3, Gj, num, this, context, elapsedRealtime, arrayList, str, str2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void sk(java.lang.String encryptedId, java.lang.String nonceId, android.content.Context context, yz5.r callback, r45.qt2 qt2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(encryptedId, "encryptedId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.util.ArrayList<jz5.l> arrayList = new java.util.ArrayList();
        arrayList.add(new jz5.l(encryptedId, nonceId));
        int i17 = 3;
        int i18 = 0;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        for (jz5.l lVar : arrayList) {
            r45.in2 in2Var = new r45.in2();
            in2Var.set(4, (java.lang.String) lVar.f384366d);
            in2Var.set(1, (java.lang.String) lVar.f384367e);
            arrayList2.add(in2Var);
        }
        pq5.g l17 = new db2.u(arrayList2, i17, 0, i18, null, null, null, null, 0, null, null, null, null, qt2Var, null, null, null, 122864, null).l();
        l17.K(new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.i4(encryptedId, nonceId, callback));
        if (context == 0 || !(context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf)) {
            return;
        }
        l17.f((im5.b) context);
    }

    public void tk(android.widget.ImageView imageView, qs5.y resType, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "imageView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resType, "resType");
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorUserName, "anchorUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextId, "contextId");
        java.lang.String streamUrl = str4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(streamUrl, "streamUrl");
        if (context == null || l17 == null) {
            return;
        }
        boolean mo168058x74219ae7 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
        byte[] bArr2 = null;
        if (!mo168058x74219ae7) {
            int i27 = 0;
            if (!(anchorUserName.length() == 0)) {
                ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).Bi(contextId);
                jz5.o oVar = (jz5.o) this.f148519g.get(l17);
                int i28 = zy2.v.f559124b;
                if (i28 <= 0) {
                    i28 = ae2.in.f85295h3;
                }
                long j19 = i28 * 1000;
                if (oVar != null && java.lang.System.currentTimeMillis() - ((java.lang.Number) oVar.f384375e).longValue() < j19) {
                    streamUrl = "";
                }
                if (!(oVar != null && 1 == ((java.lang.Number) oVar.f384374d).intValue()) || java.lang.System.currentTimeMillis() - ((java.lang.Number) oVar.f384375e).longValue() >= j19) {
                    bArr = null;
                    str5 = streamUrl;
                    i19 = i18;
                } else {
                    r45.l71 l71Var3 = (r45.l71) oVar.f384376f;
                    r45.nw1 nw1Var3 = (r45.nw1) l71Var3.m75936x14adae67(1);
                    java.lang.String m75945x2fec8307 = nw1Var3 != null ? nw1Var3.m75945x2fec8307(3) : null;
                    if (m75945x2fec8307 == null) {
                        m75945x2fec8307 = "";
                    }
                    r45.nw1 nw1Var4 = (r45.nw1) l71Var3.m75936x14adae67(1);
                    int m75939xb282bd08 = (nw1Var4 == null || (q82Var = (r45.q82) nw1Var4.m75936x14adae67(9)) == null) ? 1 : q82Var.m75939xb282bd08(0);
                    r45.nw1 nw1Var5 = (r45.nw1) l71Var3.m75936x14adae67(1);
                    if (nw1Var5 != null && (ma4Var = (r45.ma4) nw1Var5.m75936x14adae67(23)) != null) {
                        bArr2 = ma4Var.mo14344x5f01b1f6();
                    }
                    i19 = m75939xb282bd08;
                    bArr = bArr2;
                    str5 = m75945x2fec8307;
                }
                android.content.Intent intent2 = intent == null ? new android.content.Intent() : intent;
                if (intent2.getIntExtra("KEY_ENTER_LIVE_PARAM_VR_LIVE_TYPE", 0) == 0) {
                    if (oVar != null && (l71Var2 = (r45.l71) oVar.f384376f) != null && (nw1Var2 = (r45.nw1) l71Var2.m75936x14adae67(1)) != null) {
                        i27 = nw1Var2.m75939xb282bd08(42);
                    }
                    intent2.putExtra("KEY_ENTER_LIVE_PARAM_VR_LIVE_TYPE", i27);
                }
                if (intent2.getByteArrayExtra("KEY_ENTER_LIVE_PARAM_LIVE_EVENT_INFO") == null && oVar != null && (l71Var = (r45.l71) oVar.f384376f) != null && (nw1Var = (r45.nw1) l71Var.m75936x14adae67(1)) != null && (rp1Var = (r45.rp1) nw1Var.m75936x14adae67(45)) != null) {
                    intent2.putExtra("KEY_ENTER_LIVE_PARAM_LIVE_EVENT_INFO", rp1Var.mo14344x5f01b1f6());
                }
                c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
                java.lang.String str6 = str == null ? "" : str;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ubVar);
                c61.ub.e4(ubVar, intent2, context, j17, l17.longValue(), anchorUserName, nonceId, str6, contextId, i17, str2, str3, str5, java.lang.Integer.valueOf(i19), 0, bArr, null, false, null, j18, null, 761856, null);
                return;
            }
        }
        pm0.v.K(null, new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.g3(nonceId, j17, contextId, mo168058x74219ae7, context, intent, this, l17, str, str2, str3, num, j18));
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
        ll2.e eVar = ll2.e.f400666a;
        java.util.List list = ll2.e.f400668c;
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
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "anchorlive.more") && r26.i0.A(str, "anchorlive.more", false, 2, obj6)) {
                        java.util.Iterator it6 = list.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                obj5 = obj6;
                                break;
                            }
                            obj5 = it6.next();
                            java.lang.String str2 = (java.lang.String) obj5;
                            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, str) && r26.i0.A(str2, str, false, 2, obj6)) {
                                break;
                            }
                        }
                        if (obj5 == null) {
                            java.util.List f07 = r26.n0.f0(str, new java.lang.String[]{"."}, false, 0, 6, null);
                            java.lang.String str3 = f07.size() == i29 ? "anchorlive.more." + ((java.lang.String) f07.get(2)) : "";
                            r45.vs2 vs2Var = new r45.vs2();
                            vs2Var.f470024i = i37;
                            vs2Var.f470019d = 400000;
                            vs2Var.C = -4758357817339078452L;
                            vs2Var.f470020e = i38 + 30000;
                            vs2Var.f470027o = true;
                            java.util.LinkedList linkedList = vs2Var.f470022g;
                            r45.f03 f03Var = new r45.f03();
                            f03Var.f455420d = 1;
                            f03Var.f455433t = z17 ? 1 : 0;
                            f03Var.f455424h = 1;
                            f03Var.f455426m = str3.length() == 0 ? "anchorlive.more" : str3;
                            f03Var.f455425i = str;
                            linkedList.add(f03Var);
                            if (str3.length() > 0) {
                                java.util.LinkedList linkedList2 = vs2Var.f470022g;
                                r45.f03 f03Var2 = new r45.f03();
                                i19 = 1;
                                f03Var2.f455420d = 1;
                                f03Var2.f455424h = 2;
                                f03Var2.f455426m = "anchorlive.more";
                                f03Var2.f455425i = str3;
                                linkedList2.add(f03Var2);
                            } else {
                                i19 = 1;
                            }
                            java.util.LinkedList linkedList3 = vs2Var.f470022g;
                            r45.f03 f03Var3 = new r45.f03();
                            f03Var3.f455420d = i19;
                            f03Var3.f455424h = 2;
                            f03Var3.f455425i = "anchorlive.more";
                            linkedList3.add(f03Var3);
                            vs2Var.f470023h = java.lang.String.valueOf(str.hashCode());
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
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str4, "anchorlive.bottom")) {
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
                                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str5, str4) && r26.i0.A(str5, str4, false, 2, obj9)) {
                                    break;
                                } else {
                                    obj9 = null;
                                }
                            }
                            if (obj4 == null) {
                                java.util.List f08 = r26.n0.f0(str4, new java.lang.String[]{"."}, false, 0, 6, null);
                                java.lang.String str6 = f08.size() == 4 ? "anchorlive.bottom." + ((java.lang.String) f08.get(2)) : null;
                                r45.vs2 vs2Var2 = new r45.vs2();
                                vs2Var2.f470024i = 3600;
                                vs2Var2.f470019d = 400000;
                                vs2Var2.C = -4758357817339078452L;
                                vs2Var2.f470020e = i47 + 30000;
                                vs2Var2.f470027o = true;
                                java.util.LinkedList linkedList4 = vs2Var2.f470022g;
                                r45.f03 f03Var4 = new r45.f03();
                                f03Var4.f455420d = 1;
                                f03Var4.f455433t = z17 ? 1 : 0;
                                f03Var4.f455424h = 1;
                                f03Var4.f455426m = str6;
                                f03Var4.f455425i = str4;
                                linkedList4.add(f03Var4);
                                if (!(str6 == null || str6.length() == 0)) {
                                    java.util.LinkedList linkedList5 = vs2Var2.f470022g;
                                    r45.f03 f03Var5 = new r45.f03();
                                    f03Var5.f455420d = 1;
                                    f03Var5.f455424h = 2;
                                    f03Var5.f455425i = str6;
                                    linkedList5.add(f03Var5);
                                }
                                vs2Var2.f470023h = java.lang.String.valueOf(str4.hashCode());
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
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str7, "startlive.more")) {
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
                                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str8, str7) && r26.i0.A(str8, str7, false, 2, obj11)) {
                                    break;
                                } else {
                                    obj11 = null;
                                }
                            }
                            if (obj3 == null) {
                                java.util.List f09 = r26.n0.f0(str7, new java.lang.String[]{"."}, false, 0, 6, null);
                                java.lang.String str9 = f09.size() == 4 ? "startlive.more." + ((java.lang.String) f09.get(2)) : "";
                                r45.vs2 vs2Var3 = new r45.vs2();
                                vs2Var3.f470024i = 3600;
                                vs2Var3.f470019d = 400000;
                                vs2Var3.C = -4758357817339078452L;
                                vs2Var3.f470020e = i49 + 30000;
                                vs2Var3.f470027o = true;
                                java.util.LinkedList linkedList6 = vs2Var3.f470022g;
                                r45.f03 f03Var6 = new r45.f03();
                                f03Var6.f455420d = 1;
                                f03Var6.f455433t = z17 ? 1 : 0;
                                f03Var6.f455424h = 1;
                                f03Var6.f455426m = str9.length() == 0 ? "startlive.more" : str9;
                                f03Var6.f455425i = str7;
                                linkedList6.add(f03Var6);
                                if (str9.length() > 0) {
                                    java.util.LinkedList linkedList7 = vs2Var3.f470022g;
                                    r45.f03 f03Var7 = new r45.f03();
                                    i18 = 1;
                                    f03Var7.f455420d = 1;
                                    f03Var7.f455424h = 2;
                                    f03Var7.f455426m = "startlive.more";
                                    f03Var7.f455425i = str9;
                                    linkedList7.add(f03Var7);
                                } else {
                                    i18 = 1;
                                }
                                java.util.LinkedList linkedList8 = vs2Var3.f470022g;
                                r45.f03 f03Var8 = new r45.f03();
                                f03Var8.f455420d = i18;
                                f03Var8.f455424h = 2;
                                f03Var8.f455425i = "startlive.more";
                                linkedList8.add(f03Var8);
                                vs2Var3.f470023h = java.lang.String.valueOf(str7.hashCode());
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
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str10, "startlive.bottom")) {
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
                                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str11, str10) && r26.i0.A(str11, str10, false, 2, obj13)) {
                                    break;
                                } else {
                                    obj13 = null;
                                }
                            }
                            if (obj2 == null) {
                                java.util.List f010 = r26.n0.f0(str10, new java.lang.String[]{"."}, false, 0, 6, null);
                                java.lang.String str12 = f010.size() == 4 ? "startlive.bottom." + ((java.lang.String) f010.get(2)) : null;
                                r45.vs2 vs2Var4 = new r45.vs2();
                                vs2Var4.f470024i = 3600;
                                vs2Var4.f470019d = 400000;
                                vs2Var4.C = -4758357817339078452L;
                                vs2Var4.f470020e = i58 + 30000;
                                vs2Var4.f470027o = true;
                                java.util.LinkedList linkedList9 = vs2Var4.f470022g;
                                r45.f03 f03Var9 = new r45.f03();
                                f03Var9.f455420d = 1;
                                f03Var9.f455433t = z17 ? 1 : 0;
                                f03Var9.f455424h = 1;
                                f03Var9.f455426m = str12;
                                f03Var9.f455425i = str10;
                                linkedList9.add(f03Var9);
                                if (!(str12 == null || str12.length() == 0)) {
                                    java.util.LinkedList linkedList10 = vs2Var4.f470022g;
                                    r45.f03 f03Var10 = new r45.f03();
                                    f03Var10.f455420d = 1;
                                    f03Var10.f455424h = 2;
                                    f03Var10.f455425i = str12;
                                    linkedList10.add(f03Var10);
                                }
                                vs2Var4.f470023h = java.lang.String.valueOf(str10.hashCode());
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
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str13, "assistant.more")) {
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
                                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str14, str13) && r26.i0.A(str14, str13, false, 2, obj15)) {
                                    break;
                                } else {
                                    obj15 = null;
                                }
                            }
                            if (obj == null) {
                                java.util.List f011 = r26.n0.f0(str13, new java.lang.String[]{"."}, false, 0, 6, null);
                                java.lang.String str15 = f011.size() == 4 ? "assistant.more." + ((java.lang.String) f011.get(2)) : "";
                                r45.vs2 vs2Var5 = new r45.vs2();
                                vs2Var5.f470024i = 3600;
                                vs2Var5.f470019d = 400000;
                                vs2Var5.C = -4758357817339078452L;
                                vs2Var5.f470020e = i66 + 30000;
                                vs2Var5.f470027o = true;
                                java.util.LinkedList linkedList11 = vs2Var5.f470022g;
                                r45.f03 f03Var11 = new r45.f03();
                                f03Var11.f455420d = 1;
                                f03Var11.f455433t = z17 ? 1 : 0;
                                f03Var11.f455424h = 1;
                                f03Var11.f455426m = str15.length() == 0 ? "assistant.more" : str15;
                                f03Var11.f455425i = str13;
                                linkedList11.add(f03Var11);
                                if (str15.length() > 0) {
                                    java.util.LinkedList linkedList12 = vs2Var5.f470022g;
                                    r45.f03 f03Var12 = new r45.f03();
                                    i17 = 1;
                                    f03Var12.f455420d = 1;
                                    f03Var12.f455424h = 2;
                                    f03Var12.f455426m = "assistant.more";
                                    f03Var12.f455425i = str15;
                                    linkedList12.add(f03Var12);
                                } else {
                                    i17 = 1;
                                }
                                java.util.LinkedList linkedList13 = vs2Var5.f470022g;
                                r45.f03 f03Var13 = new r45.f03();
                                f03Var13.f455420d = i17;
                                f03Var13.f455424h = 2;
                                f03Var13.f455425i = "assistant.more";
                                linkedList13.add(f03Var13);
                                vs2Var5.f470023h = java.lang.String.valueOf(str13.hashCode());
                                zy2.fa.D(((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk(), vs2Var5, "mockAssistantMore", null, true, null, 20, null);
                            }
                        }
                    }
                    i66 = i67;
                }
                r45.vs2 vs2Var6 = new r45.vs2();
                vs2Var6.f470024i = 3600;
                vs2Var6.f470019d = 400000;
                vs2Var6.C = -4758357817339078452L;
                vs2Var6.f470020e = 30001;
                vs2Var6.f470027o = true;
                java.util.LinkedList linkedList14 = vs2Var6.f470022g;
                r45.f03 f03Var14 = new r45.f03();
                f03Var14.f455420d = 1;
                f03Var14.f455433t = z17 ? 1000 : 0;
                f03Var14.f455424h = 1;
                f03Var14.f455426m = "startlive.mode.audio";
                f03Var14.f455425i = "startlive.mode.audio.ktv";
                linkedList14.add(f03Var14);
                java.util.LinkedList linkedList15 = vs2Var6.f470022g;
                r45.f03 f03Var15 = new r45.f03();
                f03Var15.f455420d = 1;
                f03Var15.f455424h = 2;
                f03Var15.f455425i = "startlive.mode.audio";
                linkedList15.add(f03Var15);
                vs2Var6.f470023h = java.lang.String.valueOf(1501439274);
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
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str16, "audience.more") && r26.i0.A(str16, "audience.more", false, 2, null)) {
                java.util.Iterator it11 = list.iterator();
                while (true) {
                    if (!it11.hasNext()) {
                        break;
                    }
                    java.lang.Object next2 = it11.next();
                    java.lang.String str17 = (java.lang.String) next2;
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str17, str16) && r26.i0.A(str17, str16, false, 2, null)) {
                        obj6 = next2;
                        break;
                    }
                }
                if (obj6 == null) {
                    java.util.List f012 = r26.n0.f0(str16, new java.lang.String[]{"."}, false, 0, 6, null);
                    java.lang.String str18 = f012.size() == 4 ? "audience.more." + ((java.lang.String) f012.get(2)) : "";
                    r45.vs2 vs2Var7 = new r45.vs2();
                    vs2Var7.f470024i = 3600;
                    vs2Var7.f470019d = 400000;
                    vs2Var7.C = -4758357817339078452L;
                    vs2Var7.f470020e = i28 + 30000;
                    vs2Var7.f470027o = true;
                    java.util.LinkedList linkedList16 = vs2Var7.f470022g;
                    r45.f03 f03Var16 = new r45.f03();
                    f03Var16.f455420d = 1;
                    f03Var16.f455424h = 1;
                    f03Var16.f455433t = z17 ? 1 : 0;
                    f03Var16.f455426m = str18.length() == 0 ? "audience.more" : str18;
                    f03Var16.f455425i = str16;
                    linkedList16.add(f03Var16);
                    if (str18.length() > 0) {
                        java.util.LinkedList linkedList17 = vs2Var7.f470022g;
                        r45.f03 f03Var17 = new r45.f03();
                        i27 = 1;
                        f03Var17.f455420d = 1;
                        f03Var17.f455424h = 2;
                        f03Var17.f455426m = "audience.more";
                        f03Var17.f455425i = str18;
                        linkedList17.add(f03Var17);
                    } else {
                        i27 = 1;
                    }
                    java.util.LinkedList linkedList18 = vs2Var7.f470022g;
                    r45.f03 f03Var18 = new r45.f03();
                    f03Var18.f455420d = i27;
                    f03Var18.f455424h = 2;
                    f03Var18.f455425i = "audience.more";
                    linkedList18.add(f03Var18);
                    vs2Var7.f470023h = java.lang.String.valueOf(str16.hashCode());
                    zy2.fa.D(((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk(), vs2Var7, "mockVisitor", null, true, null, 20, null);
                }
            }
            i28 = i68;
        }
    }

    public void vj(android.content.Context context, java.lang.String qrCodeUrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qrCodeUrl, "qrCodeUrl");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14024xae8cf4a6.class);
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
            activity.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
        }
    }

    public boolean vk(r45.nw1 nw1Var, java.lang.String sceneTag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sceneTag, "sceneTag");
        boolean z17 = pm0.v.z(nw1Var != null ? nw1Var.m75939xb282bd08(37) : 0, 524288);
        boolean gk6 = gk(nw1Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feedSwitch scene=");
        sb6.append(sceneTag);
        sb6.append(", flag=");
        sb6.append(nw1Var != null ? java.lang.Integer.valueOf(nw1Var.m75939xb282bd08(37)) : null);
        sb6.append(", pay=");
        sb6.append(gk6);
        sb6.append(", type=");
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", sb6.toString());
        return z17 && !gk6;
    }

    public java.lang.Object wj(android.content.Context context, long j17, java.lang.String str, android.widget.ImageView imageView, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        java.lang.Object g17 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.i3(this, i17, context, j17, str, imageView, null), interfaceC29045xdcb5ca57);
        return g17 == pz5.a.f440719d ? g17 : jz5.f0.f384359a;
    }

    public void wk(int i17) {
        df2.vh vhVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var;
        dk2.ef efVar = dk2.ef.f314905a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = dk2.ef.f314904J;
        if (c14197x319b1b9e == null || (vhVar = (df2.vh) c14197x319b1b9e.m56798x25fe639c(df2.vh.class)) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vhVar.f313135m, "notifyWebviewStatus cur status:" + i17 + ",last status:" + vhVar.f313141s);
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = vhVar.f372632e;
            k0Var = ubVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) ubVar : null;
            if (k0Var != null) {
                k0Var.m57642x773cf0f8();
            }
        } else if (i17 == 2 && vhVar.f313141s == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar2 = vhVar.f372632e;
            k0Var = ubVar2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) ubVar2 : null;
            if (k0Var != null) {
                k0Var.m57644x12186621();
            }
        }
        vhVar.f313141s = i17;
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
            java.lang.String r2 = r9.f497001a
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
            mn2.g1 r2 = mn2.g1.f411508a
            vo0.d r3 = r2.a()
            mn2.q3 r4 = new mn2.q3
            java.lang.String r9 = r9.f497001a
            com.tencent.mm.plugin.finder.storage.y90 r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f
            r4.<init>(r9, r5)
            mn2.f1 r9 = mn2.f1.f411486d
            yo0.i r9 = r2.h(r9)
            wo0.c r9 = r3.b(r4, r9)
            r9.c(r8)
            r8.setVisibility(r1)
            zj(r7, r10, r0)
            goto L8c
        L3d:
            if (r9 == 0) goto L46
            int r9 = r9.f497002b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.xj(android.widget.TextView, android.widget.ImageView, t40.a, float):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(45:1|(1:3)(1:161)|4|(1:6)(1:160)|7|(1:9)(1:159)|10|(5:125|126|(1:128)(1:155)|(1:130)(1:154)|(38:132|133|134|(1:136)(4:137|(1:139)(1:151)|(4:141|(1:143)(1:150)|(1:145)(1:149)|(1:147))|13)|(1:15)(1:124)|16|(7:18|(1:20)(1:122)|21|(1:23)|24|25|26)(1:123)|27|(1:29)(1:118)|(1:31)|32|(1:34)(1:117)|35|(1:37)|38|(1:40)|41|42|43|44|45|(1:47)(1:110)|48|49|(1:51)|52|(7:54|(1:105)|58|(1:104)|62|(1:103)|66)(1:106)|67|(1:69)|70|(1:72)(1:102)|73|(4:75|(3:80|81|(1:79))|77|(0))|85|(1:87)(1:101)|(4:89|(1:93)|94|(1:96))(1:100)|97|98))|12|13|(0)(0)|16|(0)(0)|27|(0)(0)|(0)|32|(0)(0)|35|(0)|38|(0)|41|42|43|44|45|(0)(0)|48|49|(0)|52|(0)(0)|67|(0)|70|(0)(0)|73|(0)|85|(0)(0)|(0)(0)|97|98|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x026b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0273, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FinderLiveFeatureService", "openFinderLive ex:" + r0.getMessage());
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.xk(org.json.JSONObject, boolean, vd2.g5, vd2.g5, java.lang.String):void");
    }

    public void yj(android.widget.TextView textView, android.widget.ImageView imageView, zy2.c cVar, float f17) {
        r45.g92 g92Var;
        r45.g92 g92Var2;
        xj(textView, imageView, new t40.a((cVar == null || (g92Var2 = cVar.f558892b) == null) ? null : g92Var2.m75945x2fec8307(17), (cVar == null || (g92Var = cVar.f558892b) == null) ? 0 : g92Var.m75939xb282bd08(18)), f17);
    }

    public java.util.List yk(android.view.View view, java.util.List info, int[] spanFilter, int i17, int i18) {
        gm2.e2 e2Var;
        gm2.c2 c2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(spanFilter, "spanFilter");
        gm2.c1 c1Var = gm2.c1.f354853a;
        gm2.c2.f354879e.getClass();
        gm2.c2[] c2VarArr = gm2.c2.f354880f;
        int length = c2VarArr.length;
        int i19 = 0;
        while (true) {
            e2Var = null;
            if (i19 >= length) {
                c2Var = null;
                break;
            }
            c2Var = c2VarArr[i19];
            if (c2Var.f354886d == i17) {
                break;
            }
            i19++;
        }
        gm2.c2 c2Var2 = c2Var == null ? gm2.c2.f354882h : c2Var;
        gm2.e2.f354892e.getClass();
        gm2.e2[] e2VarArr = gm2.e2.f354893f;
        int length2 = e2VarArr.length;
        int i27 = 0;
        while (true) {
            if (i27 >= length2) {
                break;
            }
            gm2.e2 e2Var2 = e2VarArr[i27];
            if (e2Var2.f354897d == i18) {
                e2Var = e2Var2;
                break;
            }
            i27++;
        }
        return gm2.c1.r(c1Var, info, spanFilter, c2Var2, e2Var == null ? gm2.e2.f354894g : e2Var, 0, view, null, 0, 0, null, null, 2000, null);
    }

    public void zk(android.widget.TextView text, java.util.List list, java.util.List list2, java.lang.String str, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "str");
        st2.g3 g3Var = st2.g3.f493859a;
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
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            arrayList.add(java.lang.Integer.valueOf(i27));
            java.lang.Object obj2 = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/ShoppingUtil", "preInsertImageSpanToText", "(Landroid/widget/TextView;Ljava/util/List;Ljava/util/List;Ljava/lang/String;IZ)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj2, createBitmap, "com/tencent/mm/plugin/finder/shopping/ShoppingUtil", "preInsertImageSpanToText", "(Landroid/widget/TextView;Ljava/util/List;Ljava/util/List;Ljava/lang/String;IZ)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
            createBitmap.eraseColor(text.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77626xb498cd1b));
            st2.g3 g3Var2 = st2.g3.f493859a;
            android.content.Context context = text.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            linkedList.add(g3Var2.j(context, createBitmap, i17));
            if (z17) {
                gm2.c1 c1Var = gm2.c1.f354853a;
                linkedList.addLast((android.text.style.ImageSpan) ((jz5.n) gm2.c1.f354876x).mo141623x754a37bb());
            }
            i18 = i19;
        }
        gm2.c1 c1Var2 = gm2.c1.f354853a;
        android.content.Context context2 = text.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        text.setText(c1Var2.q(context2, str, linkedList, true));
    }
}
