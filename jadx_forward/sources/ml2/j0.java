package ml2;

@j95.b
/* loaded from: classes3.dex */
public final class j0 extends i95.w implements zy2.zb {

    /* renamed from: i */
    public static final ml2.y4 f409116i = new ml2.y4();

    /* renamed from: m */
    public static final ml2.d f409117m = new ml2.d();

    /* renamed from: n */
    public static final ml2.x f409118n = new ml2.x();

    /* renamed from: o */
    public static final ml2.h f409119o = new ml2.h();

    /* renamed from: d */
    public org.json.JSONObject f409120d;

    /* renamed from: f */
    public boolean f409122f;

    /* renamed from: g */
    public boolean f409123g;

    /* renamed from: e */
    public final int f409121e = -100;

    /* renamed from: h */
    public final java.util.List f409124h = kz5.c0.i(1001, 1002, 1003);

    public static /* synthetic */ void Dj(ml2.j0 j0Var, ml2.b5 b5Var, dk2.zf zfVar, java.util.Map map, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            zfVar = null;
        }
        if ((i17 & 4) != 0) {
            map = null;
        }
        j0Var.Cj(b5Var, zfVar, map);
    }

    public static void Oj(ml2.j0 j0Var, ml2.i3 type, int i17, ml2.i0 i0Var, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            i17 = -1;
        }
        if ((i18 & 4) != 0) {
            i0Var = null;
        }
        j0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", type.f409092d);
        if (i17 > 0) {
            jSONObject.put("money", i17);
        }
        if (i0Var != null) {
            jSONObject.put("errortype", i0Var.f409077a);
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54517x3e9e1be0, i0Var.f409078b);
            jSONObject.put("errormsg", i0Var.f409079c);
        }
        zy2.zb.y6(j0Var, ml2.z4.V, jSONObject.toString(), null, 4, null);
    }

    public static /* synthetic */ void Qj(ml2.j0 j0Var, int i17, int i18, long j17, int i19, int i27, java.lang.Object obj) {
        if ((i27 & 4) != 0) {
            j17 = 0;
        }
        long j18 = j17;
        if ((i27 & 8) != 0) {
            i19 = 0;
        }
        j0Var.Pj(i17, i18, j18, i19);
    }

    public final void Ai(ml2.w0 enterData) {
        java.lang.String str;
        boolean z17;
        java.lang.String str2;
        ml2.y4 y4Var = f409116i;
        y4Var.f409823c = false;
        y4Var.f409819a = "";
        ml2.d dVar = f409117m;
        dVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterData, "enterData");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6515x778551f1 c6515x778551f1 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6515x778551f1();
        ((ml2.j0) i95.n0.c(ml2.j0.class)).Vi(c6515x778551f1, enterData.f409691c);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        c6515x778551f1.t(b52.b.q(enterData.f409689a));
        long j17 = enterData.f409690b;
        c6515x778551f1.f138655e = j17;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        c6515x778551f1.u(b52.b.q(j17));
        ml2.x1 x1Var = enterData.f409694f;
        c6515x778551f1.f138659i = x1Var.f409753d;
        java.lang.String str3 = enterData.f409695g;
        c6515x778551f1.r(str3);
        c6515x778551f1.f138661k = enterData.f409692d;
        c6515x778551f1.f138662l = enterData.f409696h;
        c6515x778551f1.f138663m = enterData.f409697i;
        c6515x778551f1.w(enterData.f409698j);
        c6515x778551f1.f138671u = c6515x778551f1.b("SnsFeedId", enterData.f409699k, true);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        c6515x778551f1.s(b52.b.b());
        c6515x778551f1.f138666p = enterData.f409693e;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        c6515x778551f1.q(b52.b.c());
        c6515x778551f1.f138676z = c6515x778551f1.b("ClickSubTabContextId", enterData.f409704p, true);
        boolean A = r26.i0.A(str3, "temp_", false, 2, null);
        java.lang.String str4 = enterData.f409702n;
        if (A) {
            c6515x778551f1.v(str4);
            if (android.text.TextUtils.isEmpty(c6515x778551f1.f138669s) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c6515x778551f1.f138660j, "temp_2")) {
                ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                c6515x778551f1.v(y4Var.f409851z);
            }
            str = str4;
            z17 = true;
        } else {
            str = str4;
            z17 = true;
            c6515x778551f1.v(ml2.d.d(dVar, enterData.f409689a, com.p314xaae8f345.mm.sdk.p2603x2137b148.b8.c(c6515x778551f1.f138660j), null, 4, null));
        }
        if (android.text.TextUtils.isEmpty(c6515x778551f1.f138669s)) {
            c6515x778551f1.v(str);
        }
        c6515x778551f1.f138672v = enterData.f409700l;
        c6515x778551f1.p(r26.i0.v(dVar.e(x1Var, enterData.f409705q), ",", ";", false, 4, null));
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        c6515x778551f1.f138673w = y4Var.e(c6515x778551f1.f138660j, enterData.f409701m.f409102d);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c6515x778551f1.f138660j, com.p314xaae8f345.p457x3304c6.C3964x9fa34f55.f15753xdc29ea5a) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((m30.o) ((n30.s) i95.n0.c(n30.s.class))).wi(), "123")) {
            if (android.text.TextUtils.isEmpty(p52.h.f433560l)) {
                ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                str2 = v52.c.g().d();
            } else {
                str2 = p52.h.f433560l;
            }
            c6515x778551f1.f138674x = c6515x778551f1.b("SnsSessionID", str2, z17);
        }
        c6515x778551f1.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.Audience21053Report", "report21053OnEnter, struct=\nfeedId=" + c6515x778551f1.f138656f + "\nliveId=" + c6515x778551f1.f138670t + "\nuserName=" + c6515x778551f1.f138654d + "\nisPrivate=" + c6515x778551f1.f138668r + "\nsessionID=" + c6515x778551f1.f138657g + "\nactionTS=" + c6515x778551f1.f138658h + "\naction=" + c6515x778551f1.f138659i + "\ncommentScene=" + c6515x778551f1.f138660j + "\nindex=" + c6515x778551f1.f138661k + "\nenterStatus=" + c6515x778551f1.f138662l + "\ncontextId=" + c6515x778551f1.f138665o + "\nonlineNum=" + c6515x778551f1.f138666p + "\nclickTabContextId=" + c6515x778551f1.f138667q + "\nclickSubTabContextId=" + c6515x778551f1.f138676z + "\nsessionBuffer=" + c6515x778551f1.f138669s + "\nshareType=" + c6515x778551f1.f138663m + "\nshareUserName=" + c6515x778551f1.f138664n + "\nenterSessionId=" + c6515x778551f1.f138672v + "\nenterIconType=" + c6515x778551f1.f138673w + "\nsnsSessionID=" + c6515x778551f1.f138674x + "\nsnsFeedId=" + c6515x778551f1.f138671u);
    }

    public final void Aj(int i17, int i18) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        if (i17 == 2) {
            jSONObject.put("times", i18);
        }
        zy2.zb.y6(this, ml2.z4.F, jSONObject.toString(), null, 4, null);
    }

    public final java.lang.String Bi(java.util.Map map, boolean z17) {
        if (z17) {
            java.lang.CharSequence charSequence = (java.lang.CharSequence) map.get("liveId");
            boolean z18 = charSequence == null || charSequence.length() == 0;
            ml2.y4 y4Var = f409116i;
            if (z18) {
                map.put("liveId", y4Var.D);
            }
            java.lang.CharSequence charSequence2 = (java.lang.CharSequence) map.get("feedId");
            if (charSequence2 == null || charSequence2.length() == 0) {
                map.put("feedId", y4Var.E);
            }
            java.lang.CharSequence charSequence3 = (java.lang.CharSequence) map.get("share_id");
            if (charSequence3 == null || charSequence3.length() == 0) {
                map.put("share_id", y4Var.F);
            }
            mm2.d dVar = (mm2.d) dk2.ef.f314905a.i(mm2.d.class);
            map.put("is_mmbiz_live", dVar != null && dVar.f410475f ? "1" : "0");
        }
        java.lang.String jSONObject = new org.json.JSONObject(kz5.c1.s(map)).toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        return r26.i0.t(jSONObject, ",", ";", false);
    }

    public final void Bj(int i17, java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        jSONObject.putOpt("result", str);
        zy2.zb.y6(this, ml2.z4.G, jSONObject.toString(), null, 4, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        if (r0.put("source_type", 1) == null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Cj(ml2.b5 r8, dk2.zf r9, java.util.Map r10) {
        /*
            r7 = this;
            java.lang.String r0 = "action"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "type"
            int r8 = r8.f408838d
            r0.put(r1, r8)
            boolean r8 = r9 instanceof dk2.fg
            if (r8 == 0) goto L19
            dk2.fg r9 = (dk2.fg) r9
            goto L1a
        L19:
            r9 = 0
        L1a:
            java.lang.String r8 = "source_type"
            if (r9 == 0) goto L38
            jz5.l r9 = r9.q()
            if (r9 == 0) goto L38
            zl2.r4 r1 = zl2.r4.f555483a
            java.lang.Object r2 = r9.f384366d
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r9 = r9.f384367e
            com.tencent.mm.protobuf.g r9 = (com.p314xaae8f345.mm.p2495xc50a8b8b.g) r9
            r1.O(r0, r2, r9)
            r9 = 1
            org.json.JSONObject r9 = r0.put(r8, r9)
            if (r9 != 0) goto L3c
        L38:
            r9 = 2
            r0.put(r8, r9)
        L3c:
            if (r10 == 0) goto L62
            java.util.Set r8 = r10.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L46:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L62
            java.lang.Object r9 = r8.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r10 = r9.getKey()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r9.getValue()
            java.lang.String r9 = (java.lang.String) r9
            r0.put(r10, r9)
            goto L46
        L62:
            ml2.z4 r2 = ml2.z4.L
            java.lang.String r3 = r0.toString()
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r7
            zy2.zb.y6(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ml2.j0.Cj(ml2.b5, dk2.zf, java.util.Map):void");
    }

    public ml2.y4 Di() {
        return f409116i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Ej(ml2.z4 z4Var, java.lang.String str, java.lang.String str2) {
        org.json.JSONObject jSONObject;
        java.lang.String jSONObject2;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int ordinal = z4Var.ordinal();
        ml2.y4 y4Var = f409116i;
        if (ordinal == 0) {
            y4Var.f409844s = currentTimeMillis;
            y4Var.T.f409190d = currentTimeMillis;
        } else if (ordinal == 2) {
            ml2.z1 z1Var = ml2.z1.f409864e;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, java.lang.String.valueOf(1))) {
                y4Var.f409829f = false;
                y4Var.f409831g = false;
            }
        } else if (ordinal != 8) {
            if (ordinal == 18) {
                ml2.g2[] g2VarArr = ml2.g2.f409010d;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, java.lang.String.valueOf(2))) {
                    ml2.n2 n2Var = ml2.n2.f409265e;
                    y4Var.getClass();
                    y4Var.f409843r = n2Var;
                }
            } else if (ordinal == 19) {
                ml2.r3 r3Var = ml2.r3.f409433e;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, java.lang.String.valueOf(1))) {
                    this.f409123g = true;
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, java.lang.String.valueOf(3))) {
                    this.f409123g = false;
                }
            }
        } else if (y4Var.S <= 0) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6510xb681551d c6510xb681551d = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6510xb681551d();
        c6510xb681551d.f138556d = c6510xb681551d.b("FinderUsrname", y4Var.f(), true);
        c6510xb681551d.f138557e = c6510xb681551d.b("FinderWxAppInfo", y4Var.i(), true);
        c6510xb681551d.f138558f = y4Var.k();
        c6510xb681551d.f138559g = c6510xb681551d.b("FinderSessionId", y4Var.h(), true);
        c6510xb681551d.f138560h = currentTimeMillis;
        gk2.e eVar = gk2.e.f354004n;
        c6510xb681551d.f138571s = eVar != null ? ((mm2.c1) eVar.a(mm2.c1.class)).O7() : 0;
        c6510xb681551d.f138561i = c6510xb681551d.b("LiveId", y4Var.c(), true);
        c6510xb681551d.f138562j = c6510xb681551d.b("FeedId", y4Var.b(), true);
        ml2.k5 k5Var = y4Var.T;
        c6510xb681551d.f138563k = c6510xb681551d.b("Description", android.text.TextUtils.isEmpty(k5Var.f409189c) ? y4Var.d() : k5Var.f409189c, true);
        c6510xb681551d.f138564l = y4Var.S;
        c6510xb681551d.f138565m = y4Var.Q;
        c6510xb681551d.f138566n = y4Var.R;
        c6510xb681551d.f138567o = z4Var.f409930d;
        int ordinal2 = z4Var.ordinal();
        java.lang.String str3 = "";
        if (ordinal2 == 13) {
            y4Var.getClass();
            c6510xb681551d.f138568p = c6510xb681551d.b("ActionResult", "0;0;0;0;0", true);
        } else if (ordinal2 != 14) {
            c6510xb681551d.f138568p = c6510xb681551d.b("ActionResult", str != null ? r26.i0.t(str, ",", ";", false) : "", true);
        } else {
            c6510xb681551d.f138568p = c6510xb681551d.b("ActionResult", Zi(), true);
        }
        c6510xb681551d.f138569q = y4Var.f409824c0.f409817d;
        try {
            jSONObject = new org.json.JSONObject(str2 != null ? r26.i0.t(str2, ";", ",", false) : "");
        } catch (java.lang.Throwable unused) {
            jSONObject = new org.json.JSONObject();
        }
        org.json.JSONObject cj6 = cj(this.f409120d, jSONObject);
        if (cj6 != null && (jSONObject2 = cj6.toString()) != null) {
            str3 = r26.i0.t(jSONObject2, ",", ";", false);
        }
        c6510xb681551d.f138570r = c6510xb681551d.b("ChnlExtra", str3, true);
        c6510xb681551d.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellLiveReport", "report21054: finderUsrname=" + c6510xb681551d.f138556d + ", finderWxAppInfo=" + c6510xb681551d.f138557e + ", isPrivate=" + c6510xb681551d.f138558f + ", finderSessionId=" + c6510xb681551d.f138559g + ", actionTimeMs=" + c6510xb681551d.f138560h + ", liveId=" + c6510xb681551d.f138561i + ", feedId=" + c6510xb681551d.f138562j + ", description=" + c6510xb681551d.f138563k + ", sourceScene=" + c6510xb681551d.f138569q + ", liveTime=" + c6510xb681551d.f138564l + ", likeCount=" + c6510xb681551d.f138565m + ", onlineCount=" + c6510xb681551d.f138566n + ", actionType=" + c6510xb681551d.f138567o + ", actionResult=" + c6510xb681551d.f138568p + ", chnlExtra=" + c6510xb681551d.f138570r + ",ScreenType=" + c6510xb681551d.f138571s);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Fj(ml2.j1 r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ml2.j0.Fj(ml2.j1, java.lang.String):void");
    }

    public void Gj(int i17) {
        ml2.z4 z4Var = ml2.z4.R1;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        zy2.zb.y6(this, z4Var, jSONObject.toString(), null, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.tencent.mm.autogen.mmdata.rpt.FinderLiveResultStruct, jx3.a] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void Hj() {
        java.lang.String str;
        ml2.y4 y4Var = f409116i;
        long j17 = y4Var.T.f409190d;
        long j18 = 0;
        if (j17 <= 0) {
            return;
        }
        ?? c6533x67c455c4 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6533x67c455c4();
        ?? r86 = 1;
        c6533x67c455c4.f138862d = c6533x67c455c4.b("FinderUsrname", y4Var.f(), true);
        c6533x67c455c4.f138863e = c6533x67c455c4.b("FinderWxAppInfo", y4Var.i(), true);
        c6533x67c455c4.f138864f = y4Var.k();
        c6533x67c455c4.f138865g = c6533x67c455c4.b("FinderSessionId", y4Var.h(), true);
        c6533x67c455c4.f138866h = java.lang.System.currentTimeMillis();
        ml2.k5 k5Var = y4Var.T;
        c6533x67c455c4.f138874p = k5Var.f409194h;
        c6533x67c455c4.f138875q = k5Var.f409195i;
        c6533x67c455c4.f138876r = k5Var.f409196j;
        c6533x67c455c4.f138872n = k5Var.f409193g;
        java.lang.String str2 = k5Var.f409187a;
        if (android.text.TextUtils.isEmpty(str2) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "0") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "-1")) {
            str2 = y4Var.c();
        }
        c6533x67c455c4.f138867i = c6533x67c455c4.b("LiveId", str2, true);
        java.lang.String str3 = k5Var.f409188b;
        if (android.text.TextUtils.isEmpty(str3) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, "0") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, "-1")) {
            str3 = y4Var.b();
        }
        c6533x67c455c4.f138868j = c6533x67c455c4.b("FeedId", str3, true);
        c6533x67c455c4.f138869k = c6533x67c455c4.b("Description", android.text.TextUtils.isEmpty(k5Var.f409189c) ? y4Var.d() : k5Var.f409189c, true);
        c6533x67c455c4.f138870l = j17;
        c6533x67c455c4.f138871m = k5Var.f409191e;
        c6533x67c455c4.f138873o = k5Var.f409192f;
        c6533x67c455c4.f138877s = k5Var.f409197k;
        c6533x67c455c4.f138878t = k5Var.f409198l;
        c6533x67c455c4.f138879u = k5Var.f409199m;
        c6533x67c455c4.f138880v = k5Var.f409200n;
        c6533x67c455c4.f138881w = k5Var.f409201o;
        c6533x67c455c4.f138882x = k5Var.f409202p;
        c6533x67c455c4.f138883y = k5Var.f409203q;
        c6533x67c455c4.f138884z = k5Var.f409204r;
        c6533x67c455c4.A = k5Var.f409205s;
        c6533x67c455c4.B = k5Var.f409206t;
        c6533x67c455c4.C = k5Var.f409207u;
        java.util.HashMap hashMap = k5Var.f409208v;
        if (hashMap.isEmpty()) {
            str = "";
        } else {
            str = "";
            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                java.util.Iterator it = ((java.util.LinkedList) entry.getValue()).iterator();
                long j19 = j18;
                while (it.hasNext()) {
                    ml2.u0 u0Var = (ml2.u0) it.next();
                    if (u0Var.f409563b) {
                        j19 += u0Var.f409562a;
                    }
                }
                str = str + ((java.lang.Number) entry.getKey()).longValue() + ':' + j19 + '#';
                j18 = 0;
            }
            if (r26.i0.o(str, "#", false, 2, null)) {
                str = str.substring(0, str.length() - 1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "substring(...)");
            }
        }
        c6533x67c455c4.D = c6533x67c455c4.b("PromoteGoodsJson", str, true);
        c6533x67c455c4.E = k5Var.f409208v.size();
        c6533x67c455c4.F = c6533x67c455c4.b("ShopWindowId", k5Var.f409211y, true);
        c6533x67c455c4.G = k5Var.f409209w;
        c6533x67c455c4.f138861J = k5Var.f409210x;
        c6533x67c455c4.I = y4Var.f409827e;
        c6533x67c455c4.H = y4Var.f409824c0.f409817d;
        c6533x67c455c4.K = y4Var.f409835j;
        c6533x67c455c4.M = c6533x67c455c4.b("Tag", fp.s0.b(y4Var.f409848w, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c), true);
        c6533x67c455c4.N = c6533x67c455c4.b("SubTag", fp.s0.b(y4Var.f409849x, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c), true);
        java.util.ArrayList arrayList = y4Var.f409836k;
        if (arrayList.isEmpty()) {
            c6533x67c455c4.L = c6533x67c455c4.b("ConnectDuration", "", true);
        } else {
            java.util.Iterator it6 = arrayList.iterator();
            java.lang.String str4 = "";
            while (it6.hasNext()) {
                nm5.c cVar = (nm5.c) it6.next();
                java.lang.Object a17 = cVar.a(2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "$3(...)");
                if (((java.lang.Boolean) a17).booleanValue()) {
                    str4 = str4 + ((ml2.s2) cVar.a(0)).f409456d + '|' + cVar.a(1) + ';';
                }
            }
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str4, "")) {
                str4 = str4.substring(0, str4.length() - 1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "substring(...)");
            }
            c6533x67c455c4.L = c6533x67c455c4.b("ConnectDuration", str4, true);
        }
        java.util.ArrayList arrayList2 = y4Var.f409838m;
        if (arrayList2.isEmpty()) {
            c6533x67c455c4.P = c6533x67c455c4.b("MicWithAnchor", "", true);
        } else {
            java.util.Iterator it7 = arrayList2.iterator();
            java.lang.String str5 = "";
            while (it7.hasNext()) {
                nm5.c cVar2 = (nm5.c) it7.next();
                java.lang.Object a18 = cVar2.a(2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "$3(...)");
                if (((java.lang.Boolean) a18).booleanValue()) {
                    str5 = str5 + ((java.lang.String) cVar2.a(0)) + '|' + cVar2.a(1) + ';';
                    r86 = 1;
                } else {
                    r86 = 1;
                }
            }
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str5, "")) {
                str5 = str5.substring(0, str5.length() - r86);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str5, "substring(...)");
            }
            c6533x67c455c4.P = c6533x67c455c4.b("MicWithAnchor", str5, r86);
        }
        c6533x67c455c4.O = y4Var.f409843r.f409268d;
        ml2.a4 a4Var = y4Var.A;
        c6533x67c455c4.Q = a4Var.f408740d;
        c6533x67c455c4.S = a4Var == ml2.a4.f408738f ? y4Var.B : 0L;
        c6533x67c455c4.R = p52.h.f433553e;
        java.lang.String mo15068x9616526c = y4Var.f409832g0.mo15068x9616526c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo15068x9616526c, "toString(...)");
        c6533x67c455c4.T = c6533x67c455c4.b("PresentationJson", r26.i0.t(mo15068x9616526c, ",", ";", false), true);
        c6533x67c455c4.k();
        k5Var.f409187a = "";
        k5Var.f409188b = "";
        k5Var.f409189c = "";
        k5Var.f409190d = 0L;
        k5Var.f409191e = 0L;
        k5Var.f409193g = 0L;
        k5Var.f409192f = 0L;
        k5Var.f409194h = 0L;
        k5Var.f409195i = 0L;
        k5Var.f409196j = 0L;
        k5Var.f409197k = 0;
        k5Var.f409198l = 0L;
        k5Var.f409199m = 0L;
        k5Var.f409200n = 0L;
        k5Var.f409201o = 0L;
        k5Var.f409202p = 0L;
        k5Var.f409203q = 0L;
        k5Var.f409204r = 0L;
        k5Var.f409205s = 0L;
        k5Var.f409206t = 0L;
        k5Var.f409207u = 0L;
        k5Var.f409211y = "";
        k5Var.f409209w = 0L;
        k5Var.f409210x = 0L;
        k5Var.f409208v.clear();
        y4Var.Q = 0L;
        y4Var.R = 0L;
        y4Var.S = 0L;
        y4Var.U = false;
        y4Var.V = false;
        y4Var.W = false;
        y4Var.X = false;
        y4Var.Y = false;
        y4Var.f409835j = 0;
        arrayList.clear();
        y4Var.f409837l = false;
        arrayList2.clear();
        y4Var.Z.clear();
        y4Var.f409827e = 0L;
        y4Var.f409829f = false;
        y4Var.f409831g = false;
        y4Var.f409848w = "";
        y4Var.f409849x = "";
        y4Var.A = ml2.a4.f408737e;
        y4Var.B = 0L;
        y4Var.f409843r = ml2.n2.f409266f;
        p52.h.f433553e = 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellLiveReport", "report21056: finderUsrname=" + c6533x67c455c4.f138862d + ", finderWxAppInfo=" + c6533x67c455c4.f138863e + ", isPrivate=" + c6533x67c455c4.f138864f + ", finderSessionId=" + c6533x67c455c4.f138865g + ", actionTimeMs=" + c6533x67c455c4.f138866h + ", audienceCount=" + c6533x67c455c4.f138874p + ", likeCount=" + c6533x67c455c4.f138875q + ", newFansNum=" + c6533x67c455c4.f138876r + ", liveDurationSeconds=" + c6533x67c455c4.f138872n + ", liveId=" + c6533x67c455c4.f138867i + ", feedId=" + c6533x67c455c4.f138868j + ", description=" + c6533x67c455c4.f138869k + ", liveStartTimeMs=" + c6533x67c455c4.f138870l + ", liveEndTimeMs=" + c6533x67c455c4.f138871m + ", oriFansCount=" + c6533x67c455c4.f138873o + ", errorCode=" + c6533x67c455c4.f138877s + ", floatingCount=" + c6533x67c455c4.f138878t + ", shareSnsCount=" + c6533x67c455c4.f138879u + ", shareSessionCount=" + c6533x67c455c4.f138880v + ", exchangeCameraCount=" + c6533x67c455c4.f138881w + ", complainCount=" + c6533x67c455c4.f138882x + ", allCommentCloseCount=" + c6533x67c455c4.f138883y + ", allCommentOpenCount=" + c6533x67c455c4.f138884z + ", personalCommentCloseCount=" + c6533x67c455c4.A + ", personalCommentOpenCount=" + c6533x67c455c4.B + ", kickOutCount=" + c6533x67c455c4.C + ", promoteGoodsJson=" + c6533x67c455c4.D + ", promoteGoodsCount=" + c6533x67c455c4.E + ", shopWindowId=" + c6533x67c455c4.F + ", nudgeCount=" + c6533x67c455c4.f138861J + ", lotteryCount=" + c6533x67c455c4.I + ", connectCount=" + c6533x67c455c4.K + ", connectDuration=" + c6533x67c455c4.L + ", micWithAnchor=" + c6533x67c455c4.P + ", sourceScene=" + c6533x67c455c4.H + ", isGift=" + c6533x67c455c4.O + ", tag=" + y4Var.f409848w + ", subTag=" + y4Var.f409849x + ", visibleRange=" + c6533x67c455c4.Q + ", topComment=" + c6533x67c455c4.G + ", presentationJson=" + c6533x67c455c4.T);
    }

    public void Ij(ml2.y2 actionType, java.lang.String str, java.lang.String description, java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionType, "actionType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(description, "description");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        if (actionType == ml2.y2.f409789i) {
            ((q30.i) ((r30.q) i95.n0.c(r30.q.class))).Ai(0);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6547x97cd4d5f c6547x97cd4d5f = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6547x97cd4d5f();
        ml2.y4 y4Var = f409116i;
        c6547x97cd4d5f.f138980d = c6547x97cd4d5f.b("FinderUsrname", y4Var.f(), true);
        c6547x97cd4d5f.f138981e = c6547x97cd4d5f.b("FinderWxAppInfo", y4Var.i(), true);
        c6547x97cd4d5f.f138982f = y4Var.k();
        c6547x97cd4d5f.f138983g = c6547x97cd4d5f.b("FinderSessionId", y4Var.h(), true);
        c6547x97cd4d5f.f138984h = java.lang.System.currentTimeMillis();
        c6547x97cd4d5f.f138985i = actionType.f409802d;
        c6547x97cd4d5f.f138986j = c6547x97cd4d5f.b("ActionJson", str != null ? r26.i0.t(str, ",", ";", false) : "", true);
        c6547x97cd4d5f.f138987k = y4Var.f409828e0.f409225d;
        c6547x97cd4d5f.f138989m = 1L;
        byte[] bytes = description.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        c6547x97cd4d5f.f138988l = c6547x97cd4d5f.b("Description", android.util.Base64.encodeToString(bytes, 0), true);
        c6547x97cd4d5f.f138983g = c6547x97cd4d5f.b("FinderSessionId", sessionId, true);
        c6547x97cd4d5f.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellLiveReport", "report21106: finderUsrname=" + c6547x97cd4d5f.f138980d + ", finderWxAppInfo=" + c6547x97cd4d5f.f138981e + ", isPrivate=" + c6547x97cd4d5f.f138982f + ", finderSessionId=" + c6547x97cd4d5f.f138983g + ", actionTimeMs=" + c6547x97cd4d5f.f138984h + ", actionType=" + c6547x97cd4d5f.f138985i + ", sourceScene=" + c6547x97cd4d5f.f138987k + ", actionJson=" + c6547x97cd4d5f.f138986j + ", finderSessionId=" + c6547x97cd4d5f.f138983g);
    }

    public final void Jj(ml2.d3 actionType, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionType, "actionType");
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a))) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6488x1f77a3b1 c6488x1f77a3b1 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6488x1f77a3b1();
            c6488x1f77a3b1.f138289d = c6488x1f77a3b1.b("FinderUsrname", str == null ? "" : str, true);
            ml2.y4 y4Var = f409116i;
            c6488x1f77a3b1.f138290e = c6488x1f77a3b1.b("FinderWxAppInfo", y4Var.i(), true);
            c6488x1f77a3b1.f138291f = y4Var.l(str);
            c6488x1f77a3b1.f138292g = c6488x1f77a3b1.b("FinderSessionId", y4Var.h(), true);
            c6488x1f77a3b1.f138293h = java.lang.System.currentTimeMillis();
            c6488x1f77a3b1.f138294i = actionType.f408893d;
            c6488x1f77a3b1.k();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellLiveReport", "report21113: finderUsrname=" + c6488x1f77a3b1.f138289d + ", finderWxAppInfo=" + c6488x1f77a3b1.f138290e + ", isPrivate=" + c6488x1f77a3b1.f138291f + ", finderSessionId=" + c6488x1f77a3b1.f138292g + ", actionTimeMs=" + c6488x1f77a3b1.f138293h + ", actionJson=" + c6488x1f77a3b1.f138294i);
        }
    }

    public void Kj(ml2.l3 action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        int ordinal = action.ordinal();
        ml2.y4 y4Var = f409116i;
        if (ordinal == 0) {
            this.f409122f = false;
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                this.f409122f = true;
                ml2.y3 y3Var = ml2.y3.f409804f;
                y4Var.getClass();
                y4Var.f409824c0 = y3Var;
            }
        } else if (this.f409122f) {
            this.f409122f = false;
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6520x351714bc c6520x351714bc = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6520x351714bc();
        c6520x351714bc.f138714e = java.lang.System.currentTimeMillis();
        c6520x351714bc.f138715f = action.f409231d;
        c6520x351714bc.f138713d = y4Var.f409822b0.f409249d;
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        c6520x351714bc.f138718i = c6520x351714bc.b("Session_Id", Ri, true);
        ((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).getClass();
        rq2.x xVar = rq2.x.f480447a;
        c6520x351714bc.f138716g = c6520x351714bc.b("ContextID", rq2.x.f480448b, true);
        ((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).getClass();
        c6520x351714bc.f138717h = c6520x351714bc.b("ClickTabContextId", rq2.x.f480452f, true);
        c6520x351714bc.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellLiveReport", "report21631: actionTS=" + c6520x351714bc.f138714e + ", pageType=" + c6520x351714bc.f138713d + ", action=" + c6520x351714bc.f138715f + ", clickid=0, session_Id=" + c6520x351714bc.f138718i + ", contextID=" + c6520x351714bc.f138716g + ", clickTabContextId=" + c6520x351714bc.f138717h);
    }

    public final void Lj(ml2.i1 action, java.lang.String actionResult) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionResult, "actionResult");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int ordinal = action.ordinal();
        ml2.y4 y4Var = f409116i;
        if (ordinal == 1) {
            ml2.p1 p1Var = ml2.p1.f409312e;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(actionResult, java.lang.String.valueOf(2))) {
                p52.h.f433558j = java.lang.String.valueOf(y4Var.f409844s);
                p52.h.f433559k = currentTimeMillis;
            } else {
                ml2.p1 p1Var2 = ml2.p1.f409312e;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(actionResult, java.lang.String.valueOf(1))) {
                    y4Var.f409845t = true;
                } else {
                    ml2.p1 p1Var3 = ml2.p1.f409312e;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(actionResult, java.lang.String.valueOf(3)) && !y4Var.f409845t) {
                        return;
                    }
                }
            }
        } else if (ordinal == 2) {
            y4Var.f409845t = false;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6524x419894be c6524x419894be = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6524x419894be();
        c6524x419894be.f138756d = action.f409085d;
        c6524x419894be.f138757e = c6524x419894be.b("ActionResult", r26.i0.t(actionResult, ",", ";", false), true);
        c6524x419894be.f138758f = currentTimeMillis;
        c6524x419894be.f138759g = c6524x419894be.b("SessionId", java.lang.String.valueOf(y4Var.f409844s), true);
        c6524x419894be.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellLiveReport", "report21919: actionType=" + c6524x419894be.f138756d + ", actionResult=" + c6524x419894be.f138757e + ", actionTimeMs=" + c6524x419894be.f138758f + ", sessionId=" + c6524x419894be.f138759g);
    }

    public final void Mj(ml2.p1 action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("HABBYGE-MALI.HellLiveReport", "report21919OnVest, action: " + action.name());
        if (action == ml2.p1.f409312e) {
            return;
        }
        Lj(ml2.i1.f409081f, java.lang.String.valueOf(action.f409319d));
    }

    public final void Ni() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ml2.y4 y4Var = f409116i;
        for (int size = y4Var.f409838m.size() - 1; -1 < size; size--) {
            java.lang.Object obj = y4Var.f409838m.get(size);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            nm5.c cVar = (nm5.c) obj;
            java.lang.Object a17 = cVar.a(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "$2(...)");
            if (((java.lang.Number) a17).longValue() > 0 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cVar.a(2), java.lang.Boolean.FALSE)) {
                java.lang.Object a18 = cVar.a(1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "$2(...)");
                long longValue = (currentTimeMillis - ((java.lang.Number) a18).longValue()) / 1000;
                if (longValue >= 0) {
                    y4Var.f409838m.set(size, nm5.j.d(cVar.a(0), java.lang.Long.valueOf(longValue), java.lang.Boolean.TRUE));
                    return;
                }
            }
        }
    }

    public final void Nj(java.lang.String viewId, java.lang.String eventId, java.util.Map map) {
        java.util.Map l17;
        kn0.p pVar;
        kn0.p pVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewId, "viewId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventId, "eventId");
        dk2.ef efVar = dk2.ef.f314905a;
        in0.q e17 = efVar.e();
        boolean z17 = false;
        boolean h17 = (e17 == null || (pVar2 = e17.D) == null) ? false : pVar2.h();
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        if (h17) {
            l17 = r0Var.f409413s;
        } else {
            jz5.l[] lVarArr = new jz5.l[4];
            java.lang.String str = r0Var.f409400f;
            if (str == null) {
                str = "";
            }
            lVarArr[0] = new jz5.l("finder_usnername", str);
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            java.lang.String b17 = b52.b.b();
            if (b17 == null) {
                b17 = "";
            }
            lVarArr[1] = new jz5.l("finder_context_id", b17);
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            java.lang.String c17 = b52.b.c();
            if (c17 == null) {
                c17 = "";
            }
            lVarArr[2] = new jz5.l("finder_tab_context_id", c17);
            java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
            lVarArr[3] = new jz5.l("behaviour_session_id", Ri != null ? Ri : "");
            l17 = kz5.c1.l(lVarArr);
        }
        l17.put("view_id", viewId);
        in0.q e18 = efVar.e();
        if (e18 != null && (pVar = e18.D) != null && pVar.h()) {
            z17 = true;
        }
        l17.put("set_stage", java.lang.Integer.valueOf(z17 ? 2 : 1));
        if (map != null) {
            l17.putAll(map);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej(eventId, l17, 25561);
    }

    public final void Pj(int i17, int i18, long j17, int i19) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        if (i18 == 0) {
            jSONObject.put("result", 1);
        } else if (i18 == 1) {
            jSONObject.put("result", 2);
        } else if (i18 > 0) {
            jSONObject.put("result", i18);
        }
        if (j17 > 0) {
            jSONObject.put("product", j17);
        }
        if (i19 > 0) {
            jSONObject.put("total_during", i19);
        }
        zy2.zb.y6(this, ml2.z4.Z, jSONObject.toString(), null, 4, null);
    }

    public final void Ri(ml2.s2 s2Var) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ml2.y4 y4Var = f409116i;
        for (int size = y4Var.f409836k.size() - 1; -1 < size; size--) {
            java.lang.Object obj = y4Var.f409836k.get(size);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            nm5.c cVar = (nm5.c) obj;
            if (cVar.a(0) == s2Var) {
                java.lang.Object a17 = cVar.a(1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "$2(...)");
                if (((java.lang.Number) a17).longValue() > 0 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cVar.a(2), java.lang.Boolean.FALSE)) {
                    java.lang.Object a18 = cVar.a(1);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "$2(...)");
                    long longValue = (currentTimeMillis - ((java.lang.Number) a18).longValue()) / 1000;
                    if (longValue >= 0) {
                        y4Var.f409836k.set(size, nm5.j.d(s2Var, java.lang.Long.valueOf(longValue), java.lang.Boolean.TRUE));
                        return;
                    }
                }
            }
        }
    }

    public final void Rj(java.lang.String str, long j17, java.lang.String str2, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellLiveReport", "reportDeviceStatus liveId:" + str + " liveScene:" + j17 + " finderNickname:" + str2 + " isAnchor:" + z17);
        ml2.h hVar = f409119o;
        hVar.a();
        hVar.f409034a = str;
        hVar.f409035b = j17;
        hVar.f409036c = str2;
        hVar.f409045l = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.f84997b0).mo141623x754a37bb()).r()).intValue() == 1;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = hVar.f409037d;
        if (z17) {
            b4Var.c(0L, 5000L);
        } else {
            b4Var.c(0L, u04.d.f505010c);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DeviceStatusReporter", "startReportDeviceStatus switch:" + hVar.f409045l);
    }

    public void Sj(java.lang.String elementId, java.util.Map eidUdfKVMap, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elementId, "elementId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eidUdfKVMap, "eidUdfKVMap");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6463x6ead4318 c6463x6ead4318 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6463x6ead4318();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        c6463x6ead4318.f138055d = java.lang.System.currentTimeMillis();
        if (str4 == null || str4.length() == 0) {
            str4 = f409116i.C;
        }
        c6463x6ead4318.u(str4);
        c6463x6ead4318.p("");
        c6463x6ead4318.B("");
        c6463x6ead4318.y("");
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        c6463x6ead4318.w(Ri);
        if (str == null) {
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            str = b52.b.b();
            if (str == null) {
                str = "";
            }
        }
        c6463x6ead4318.r(str);
        if (str2 == null) {
            ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
            str2 = a52.a.f83117l;
        }
        c6463x6ead4318.q(str2);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String c17 = b52.b.c();
        if (c17 == null) {
            c17 = "";
        }
        c6463x6ead4318.A(c17);
        c6463x6ead4318.x("");
        c6463x6ead4318.v("");
        c6463x6ead4318.s(elementId);
        c6463x6ead4318.t(Bi(eidUdfKVMap, true));
        c6463x6ead4318.f138069r = c6463x6ead4318.b("session_buffer", str3, true);
        c6463x6ead4318.z(((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).ck());
        c6463x6ead4318.k();
    }

    public void Tj(java.lang.String elementId, java.util.Map eidUdfKVMap, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elementId, "elementId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eidUdfKVMap, "eidUdfKVMap");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6464xd152d07e c6464xd152d07e = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6464xd152d07e();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        c6464xd152d07e.f138070d = java.lang.System.currentTimeMillis();
        if (str4 == null || str4.length() == 0) {
            str4 = f409116i.C;
        }
        c6464xd152d07e.u(str4);
        c6464xd152d07e.p("");
        c6464xd152d07e.A("");
        c6464xd152d07e.y("");
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        c6464xd152d07e.w(Ri);
        if (str == null) {
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            str = b52.b.b();
            if (str == null) {
                str = "";
            }
        }
        c6464xd152d07e.r(str);
        if (str2 == null) {
            ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
            str2 = a52.a.f83117l;
        }
        c6464xd152d07e.q(str2);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String c17 = b52.b.c();
        if (c17 == null) {
            c17 = "";
        }
        c6464xd152d07e.f138078l = c6464xd152d07e.b("TabContextID", c17, true);
        c6464xd152d07e.x("");
        c6464xd152d07e.v("");
        c6464xd152d07e.f138081o = c6464xd152d07e.b("ref_commentscene", "", true);
        c6464xd152d07e.s(elementId);
        c6464xd152d07e.t(Bi(eidUdfKVMap, true));
        if (str3 == null) {
            str3 = "";
        }
        c6464xd152d07e.f138085s = c6464xd152d07e.b("session_buffer", str3, true);
        c6464xd152d07e.z(((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).ck());
        c6464xd152d07e.k();
    }

    public final void Ui(long j17, java.lang.String commentscene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentscene, "commentscene");
        ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
        a52.a.d(commentscene);
        ml2.y4 y4Var = f409116i;
        y4Var.getClass();
        y4Var.f409819a = commentscene;
        y4Var.f409821b = j17;
    }

    public void Uj(int i17, int i18, int i19, java.lang.String audienceFinderUsername) {
        int i27;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audienceFinderUsername, "audienceFinderUsername");
        cl0.g gVar = new cl0.g();
        int i28 = 3;
        if (i18 == 1) {
            ml2.j2[] j2VarArr = ml2.j2.f409143d;
            i27 = 1;
        } else if (i18 == 2) {
            ml2.j2[] j2VarArr2 = ml2.j2.f409143d;
            i27 = 2;
        } else if (i18 != 3) {
            i27 = 0;
        } else {
            ml2.j2[] j2VarArr3 = ml2.j2.f409143d;
            i27 = 3;
        }
        if (i19 == 0 || i19 == 1) {
            ml2.k2[] k2VarArr = ml2.k2.f409180d;
        } else if (i19 == 2) {
            ml2.k2[] k2VarArr2 = ml2.k2.f409180d;
            i28 = 2;
        } else if (i19 != 3) {
            i28 = 0;
        } else {
            ml2.k2[] k2VarArr3 = ml2.k2.f409180d;
            i28 = 1;
        }
        gVar.s("result", java.lang.Integer.valueOf(i17));
        gVar.s(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(i27));
        gVar.s("type", java.lang.Integer.valueOf(i28));
        if (!(audienceFinderUsername.length() == 0)) {
            gVar.s("audience_finder_username", audienceFinderUsername);
        }
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        zy2.zb.y6(this, ml2.z4.P, gVar2, null, 4, null);
    }

    public final void Vi(com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6515x778551f1 struct, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(struct, "struct");
        struct.f138654d = struct.b("UserName", str == null ? "" : str, true);
        ml2.y4 y4Var = f409116i;
        struct.f138668r = y4Var.l(str);
        struct.f138657g = struct.b("SessionID", y4Var.h(), true);
        struct.f138658h = java.lang.System.currentTimeMillis();
        struct.A = struct.b("switch_extra", ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).ck(), true);
    }

    public final void Vj(ml2.q2 linkOp, java.lang.String str, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(linkOp, "linkOp");
        int ordinal = linkOp.ordinal();
        ml2.y4 y4Var = f409116i;
        if (ordinal == 1) {
            y4Var.f409835j++;
            y4Var.f409836k.add(nm5.j.d(ml2.s2.f409453f, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Boolean.FALSE));
        } else if (ordinal == 2) {
            y4Var.f409835j++;
            y4Var.f409836k.add(nm5.j.d(ml2.s2.f409454g, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Boolean.FALSE));
        } else if (ordinal != 3) {
            if (ordinal != 4) {
                switch (ordinal) {
                    case 10:
                        if (str != null) {
                            y4Var.f409837l = true;
                            y4Var.f409838m.add(nm5.j.d(str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Boolean.FALSE));
                            break;
                        } else {
                            return;
                        }
                    case 11:
                        if (y4Var.f409837l) {
                            Ni();
                            return;
                        }
                        break;
                    case 12:
                        Ni();
                        return;
                }
            } else {
                if (y4Var.f409842q) {
                    Ri(ml2.s2.f409454g);
                    y4Var.f409842q = false;
                    return;
                }
                Ri(ml2.s2.f409454g);
            }
        } else if (!y4Var.f409840o) {
            Ri(ml2.s2.f409453f);
            return;
        } else {
            y4Var.f409840o = false;
            Ri(ml2.s2.f409453f);
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", linkOp.f409378d);
        if (str == null) {
            str = "";
        }
        jSONObject.put("result", str);
        jSONObject.put("MicType", i17);
        jSONObject.put("InviteType", i18);
        zy2.zb.y6(this, ml2.z4.f409923y, jSONObject.toString(), null, 4, null);
    }

    public void Wj(java.lang.String event, java.lang.String paramsJson) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paramsJson, "paramsJson");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6679x49b7a663 c6679x49b7a663 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6679x49b7a663();
        c6679x49b7a663.f140182d = c6679x49b7a663.b("Event", event, true);
        c6679x49b7a663.f140183e = c6679x49b7a663.b("Params", r26.i0.t(paramsJson, ",", ";", false), true);
        c6679x49b7a663.k();
    }

    public final void Xj(ml2.r3 action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("HABBYGE-MALI.HellLiveReport", "reportVest, action: " + action.name());
        int ordinal = action.ordinal();
        ml2.y4 y4Var = f409116i;
        if ((ordinal != 7 && ordinal != 8 && ordinal != 9) || this.f409123g || y4Var.f409845t) {
            if (!y4Var.f409845t) {
                zy2.zb.y6(this, ml2.z4.A, java.lang.String.valueOf(action.f409442d), null, 4, null);
                return;
            }
            y4Var.getClass();
            int ordinal2 = action.ordinal();
            Mj(ordinal2 != 3 ? ordinal2 != 4 ? ordinal2 != 5 ? ordinal2 != 6 ? ordinal2 != 10 ? ml2.p1.f409312e : ml2.p1.f409317m : ml2.p1.f409316i : ml2.p1.f409315h : ml2.p1.f409314g : ml2.p1.f409313f);
        }
    }

    public final void Yj(ml2.w1 exitType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exitType, "exitType");
        ml2.y4 y4Var = f409116i;
        y4Var.getClass();
        y4Var.f409818J = exitType;
    }

    public final java.lang.String Zi() {
        lo0.b0 b0Var = ko0.c0.f391358a.b().f401529e;
        java.lang.String str = b0Var.f401500a;
        ml2.y4 y4Var = f409116i;
        y4Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        y4Var.f409833h = str;
        y4Var.f409834i = b0Var.f401507h;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", y4Var.f409833h);
        jSONObject.put("result", y4Var.f409834i);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        return r26.i0.t(jSONObject2, ",", ";", false);
    }

    public final void Zj(java.lang.String enterJsonstr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterJsonstr, "enterJsonstr");
        try {
            int optInt = new org.json.JSONObject(enterJsonstr).optInt("entericontype");
            ml2.i4 i4Var = ml2.i4.f409100o;
            if (optInt == 1001) {
                ml2.y4 y4Var = f409116i;
                y4Var.getClass();
                y4Var.I = i4Var;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HABBYGE-MALI.HellLiveReport", "setEnterType error:" + e17.getMessage());
        }
    }

    public final void aj(java.lang.String str, long j17, long j18) {
        ml2.y4 y4Var = f409116i;
        y4Var.getClass();
        if (str == null) {
            str = "";
        }
        y4Var.C = str;
        y4Var.D = pm0.v.u(j17);
        y4Var.E = pm0.v.u(j18);
    }

    public final void ak(int i17) {
        f409116i.N = i17;
    }

    public final java.util.Map bj(ml2.s1 status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        return kz5.c1.l(new jz5.l("anchor_status", java.lang.String.valueOf(status.f409451d)));
    }

    public final void bk(ml2.x3 coverType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coverType, "coverType");
        int ordinal = coverType.ordinal();
        if (ordinal != 0) {
            switch (ordinal) {
                case 6:
                case 7:
                case 8:
                case 9:
                    break;
                default:
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellLiveReport", "invalid setStartLiveCoverSourceType! " + coverType);
                    return;
            }
        }
        ml2.y4 y4Var = f409116i;
        y4Var.getClass();
        y4Var.P = coverType;
    }

    public final org.json.JSONObject cj(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        java.util.Objects.toString(jSONObject);
        java.util.Objects.toString(jSONObject2);
        if (jSONObject == null && jSONObject2 != null) {
            return jSONObject2;
        }
        if (jSONObject != null && jSONObject2 == null) {
            return jSONObject;
        }
        if (jSONObject != null && jSONObject2 != null) {
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                jSONObject2.put(next, jSONObject.get(next));
            }
        }
        java.util.Objects.toString(jSONObject);
        java.util.Objects.toString(jSONObject2);
        return jSONObject2;
    }

    public final void ck(ml2.y3 source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        ml2.y4 y4Var = f409116i;
        y4Var.getClass();
        y4Var.f409824c0 = source;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        if (r1.equals("999") == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        if (r1.equals("102") == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
    
        if (r1.equals("101") == false) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String dk(java.lang.String r4, android.content.Intent r5) {
        /*
            r3 = this;
            java.lang.String r0 = "commentscene"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r0)
            r0 = 0
            if (r5 == 0) goto L13
            java.lang.String r1 = "tab_type"
            int r5 = r5.getIntExtra(r1, r0)
            r1 = 9
            if (r5 != r1) goto L13
            r0 = 1
        L13:
            java.lang.String r5 = "25"
            boolean r1 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r4, r5)
            if (r1 == 0) goto L81
            java.lang.Class<n30.r> r1 = n30.r.class
            i95.m r1 = i95.n0.c(r1)
            n30.r r1 = (n30.r) r1
            m30.m r1 = (m30.m) r1
            r1.getClass()
            v52.c r1 = v52.c.g()
            java.lang.String r1 = r1.e()
            if (r1 == 0) goto L81
            java.lang.Class<r30.n> r2 = r30.n.class
            i95.m r2 = i95.n0.c(r2)
            r30.n r2 = (r30.n) r2
            q30.i r2 = (q30.i) r2
            boolean r2 = r2.wi(r1)
            if (r2 != 0) goto L81
            int r4 = r1.hashCode()
            switch(r4) {
                case 48626: goto L73;
                case 48627: goto L6a;
                case 48690: goto L5e;
                case 48780: goto L53;
                case 56601: goto L4a;
                default: goto L49;
            }
        L49:
            goto L7b
        L4a:
            java.lang.String r4 = "999"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L80
            goto L7b
        L53:
            java.lang.String r4 = "150"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L7b
            java.lang.String r4 = "15"
            goto L81
        L5e:
            java.lang.String r4 = "123"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L67
            goto L7b
        L67:
            java.lang.String r4 = "38"
            goto L81
        L6a:
            java.lang.String r4 = "102"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L80
            goto L7b
        L73:
            java.lang.String r4 = "101"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L80
        L7b:
            if (r0 == 0) goto L80
            java.lang.String r4 = "39"
            goto L81
        L80:
            r4 = r5
        L81:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ml2.j0.dk(java.lang.String, android.content.Intent):java.lang.String");
    }

    public final void ek(org.json.JSONObject chnlExtra) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chnlExtra, "chnlExtra");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellLiveReport", "updateAnchorBaseChnlExtra chnlExtra: " + chnlExtra + " anchorBaseChnlExtra: " + this.f409120d);
        org.json.JSONObject jSONObject = this.f409120d;
        if (jSONObject == null) {
            this.f409120d = chnlExtra;
        } else {
            this.f409120d = cj(chnlExtra, jSONObject);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void fj(km2.m r17, dk2.x4 r18, int r19, long r20) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ml2.j0.fj(km2.m, dk2.x4, int, long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void hj(long j17, java.lang.String str, java.lang.String str2) {
        ml2.c1 c1Var = ml2.c1.f408858e;
        ml2.y4 y4Var = f409116i;
        if (j17 == 2) {
            ml2.y3 y3Var = y4Var.f409850y;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(y3Var, "<set-?>");
            y4Var.f409824c0 = y3Var;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6536x75386e7 c6536x75386e7 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6536x75386e7();
        c6536x75386e7.f138915d = c6536x75386e7.b("FinderUsrname", y4Var.f(), true);
        c6536x75386e7.f138916e = c6536x75386e7.b("FinderWxAppInfo", y4Var.i(), true);
        c6536x75386e7.f138917f = y4Var.k();
        c6536x75386e7.f138918g = c6536x75386e7.b("FinderSessionId", y4Var.h(), true);
        c6536x75386e7.f138919h = java.lang.System.currentTimeMillis();
        gk2.e eVar = gk2.e.f354004n;
        c6536x75386e7.f138925n = eVar != null ? ((mm2.c1) eVar.a(mm2.c1.class)).O7() : 0;
        if (j17 == 15) {
            ml2.r2 r2Var = ml2.r2.f409429e;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, java.lang.String.valueOf(1))) {
                y4Var.f409841p = r2Var;
            } else {
                ml2.r2 r2Var2 = ml2.r2.f409430f;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, java.lang.String.valueOf(2))) {
                    y4Var.f409841p = r2Var2;
                }
            }
        }
        c6536x75386e7.f138920i = j17;
        c6536x75386e7.p(str != null ? r26.i0.t(str, ",", ";", false) : "");
        c6536x75386e7.f138922k = y4Var.f409824c0.f409817d;
        c6536x75386e7.f138924m = c6536x75386e7.b("Params", str2, true);
        c6536x75386e7.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellLiveReport", "report21017: finderUsrname=" + c6536x75386e7.f138915d + ", finderWxAppInfo=" + c6536x75386e7.f138916e + ", isPrivate=" + c6536x75386e7.f138917f + ", finderSessionId=" + c6536x75386e7.f138918g + ", actionTimeMs=" + c6536x75386e7.f138919h + ", actionType=" + c6536x75386e7.f138920i + ", sourceScene=" + c6536x75386e7.f138922k + ", actionJson=" + c6536x75386e7.f138921j + ", params=" + c6536x75386e7.f138924m + ",ScreenType=" + c6536x75386e7.f138925n);
        java.lang.String n17 = c6536x75386e7.n();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "toShowString(...)");
        java.lang.String t17 = r26.i0.t(n17, ",", ";", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePostReporter", "[reportActionBeforeLive] data = ".concat(t17));
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6300x6832e2ea c6300x6832e2ea = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6300x6832e2ea();
        c6300x6832e2ea.p("21017");
        c6300x6832e2ea.q(t17);
        c6300x6832e2ea.k();
    }

    public void ij(int i17, int i18, long j17, java.util.Map map) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        jSONObject.put("entrance_type", i18);
        jSONObject.put("entrance_id", j17);
        mm2.g1 g1Var = (mm2.g1) dk2.ef.f314905a.i(mm2.g1.class);
        if (g1Var != null) {
            java.lang.Integer num = g1Var.f410615w;
            java.lang.Long l17 = g1Var.f410616x;
            java.lang.String str = g1Var.f410617y;
            if (num != null && l17 != null && str != null) {
                long longValue = l17.longValue();
                jSONObject.put("strategy_id", num.intValue());
                jSONObject.put("guide_live_id", longValue);
                jSONObject.put("guide_finderusername", str);
            }
        }
        if (map != null) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                jSONObject.put((java.lang.String) entry.getKey(), entry.getValue());
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellLiveReport", "#report21017ForAnchorLivePath " + jSONObject);
        ml2.c1 c1Var = ml2.c1.f408858e;
        zy2.zb.j5(this, 36L, jSONObject.toString(), null, 4, null);
    }

    public void mj(int i17) {
        ml2.c1 c1Var = ml2.c1.f408858e;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        zy2.zb.j5(this, 52L, jSONObject.toString(), null, 4, null);
    }

    public final void nj(ml2.w1 type) {
        java.lang.String str;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var;
        r45.aa0 aa0Var;
        java.lang.String jSONObject;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6588x45f713a c6588x45f713a = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6588x45f713a();
        ml2.y4 y4Var = f409116i;
        c6588x45f713a.f139382d = c6588x45f713a.b("FinderUsrname", y4Var.f(), true);
        c6588x45f713a.f139383e = c6588x45f713a.b("FinderWxAppInfo", y4Var.i(), true);
        c6588x45f713a.f139384f = y4Var.k();
        c6588x45f713a.f139385g = c6588x45f713a.b("FinderSessionId", y4Var.h(), true);
        c6588x45f713a.f139386h = java.lang.System.currentTimeMillis();
        c6588x45f713a.f139397s = type.f409713d;
        c6588x45f713a.f139387i = g92.a.I1(g92.b.f351302e, false, 1, null) != null ? r2.u0().m75939xb282bd08(20) : 0;
        c6588x45f713a.f139388j = vn0.b.f519707a.b().f536943a == 0 ? 2 : 1;
        c6588x45f713a.f139389k = y4Var.K;
        c6588x45f713a.f139390l = java.lang.System.currentTimeMillis() - c6588x45f713a.f139389k;
        c6588x45f713a.f139392n = y4Var.L;
        org.json.JSONObject jSONObject2 = y4Var.M;
        java.lang.String t17 = (jSONObject2 == null || (jSONObject = jSONObject2.toString()) == null) ? "" : r26.i0.t(jSONObject, ",", ";", false);
        y4Var.M = null;
        c6588x45f713a.f139393o = c6588x45f713a.b("PoiJson", t17, true);
        java.lang.String str2 = y4Var.O;
        java.lang.String t18 = str2 != null ? r26.i0.t(str2, ",", ";", false) : "";
        y4Var.O = null;
        c6588x45f713a.f139394p = c6588x45f713a.b("Description", t18, true);
        c6588x45f713a.f139391m = y4Var.P.f409766d;
        c6588x45f713a.f139400v = c6588x45f713a.b("ShopWindowId", "", true);
        c6588x45f713a.f139399u = c6588x45f713a.b("GoodsListJson", "", true);
        java.util.Iterator it = y4Var.Z.iterator();
        while (it.hasNext()) {
            c6588x45f713a.f139399u = c6588x45f713a.b("GoodsListJson", c6588x45f713a.f139399u + ((java.lang.Long) it.next()).longValue() + '#', true);
        }
        java.lang.String str3 = c6588x45f713a.f139399u;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "getGoodsListJson(...)");
        if (r26.i0.n(str3, "#", false)) {
            java.lang.String str4 = c6588x45f713a.f139399u;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "getGoodsListJson(...)");
            java.lang.String substring = str4.substring(0, c6588x45f713a.f139399u.length() - 1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
            c6588x45f713a.f139399u = c6588x45f713a.b("GoodsListJson", substring, true);
        }
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            ml2.y4 y4Var2 = f409116i;
            synchronized (y4Var2.f409826d0) {
                for (java.util.Map.Entry entry : y4Var2.f409826d0.entrySet()) {
                    jSONObject3.put((java.lang.String) entry.getKey(), entry.getValue());
                }
            }
            jSONObject3.put("detail_set_list", dk2.ug.f315751a.a());
            mm2.e1 e1Var = (mm2.e1) dk2.ef.f314905a.i(mm2.e1.class);
            jSONObject3.put("display_mode", (e1Var == null || (j2Var = e1Var.E) == null || (aa0Var = (r45.aa0) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).mo144003x754a37bb()) == null) ? 0 : aa0Var.f451401d);
        } catch (java.lang.Throwable unused) {
        }
        java.lang.String jSONObject4 = jSONObject3.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
        c6588x45f713a.I = c6588x45f713a.b("ChnlExtra", r26.i0.t(jSONObject4, ",", ";", false), true);
        int ordinal = type.ordinal();
        if (ordinal == 0) {
            ml2.y4 y4Var3 = f409116i;
            c6588x45f713a.f139395q = c6588x45f713a.b("LiveId", y4Var3.c(), true);
            c6588x45f713a.f139396r = c6588x45f713a.b("FeedId", y4Var3.b(), true);
            c6588x45f713a.f139398t = c6588x45f713a.b("ErrorCode", "0", true);
        } else if (ordinal == 1) {
            ml2.y4 y4Var4 = f409116i;
            c6588x45f713a.f139395q = c6588x45f713a.b("LiveId", y4Var4.c(), true);
            c6588x45f713a.f139396r = c6588x45f713a.b("FeedId", y4Var4.b(), true);
            c6588x45f713a.f139398t = c6588x45f713a.b("ErrorCode", java.lang.String.valueOf(y4Var4.N), true);
        } else if (ordinal == 2) {
            c6588x45f713a.f139395q = c6588x45f713a.b("LiveId", "0", true);
            c6588x45f713a.f139396r = c6588x45f713a.b("FeedId", "0", true);
            c6588x45f713a.f139398t = c6588x45f713a.b("ErrorCode", java.lang.String.valueOf(f409116i.N), true);
        } else if (ordinal == 3) {
            c6588x45f713a.f139395q = c6588x45f713a.b("LiveId", "0", true);
            c6588x45f713a.f139396r = c6588x45f713a.b("FeedId", "0", true);
            c6588x45f713a.f139398t = c6588x45f713a.b("ErrorCode", "0", true);
            ml2.y4 y4Var5 = f409116i;
            y4Var5.getClass();
            y4Var5.f409848w = "";
            y4Var5.f409849x = "";
            y4Var5.A = ml2.a4.f408737e;
            y4Var5.B = 0L;
        }
        ml2.y4 y4Var6 = f409116i;
        y4Var6.getClass();
        c6588x45f713a.f139402x = c6588x45f713a.b("RetouchResult", "0;0;0;0;0", true);
        c6588x45f713a.f139403y = c6588x45f713a.b("FiltersResult", Zi(), true);
        c6588x45f713a.B = c6588x45f713a.b("ConnectSwitch", java.lang.String.valueOf(y4Var6.f409841p.f409432d), true);
        c6588x45f713a.f139401w = y4Var6.f409824c0.f409817d;
        c6588x45f713a.f139404z = c6588x45f713a.b("Tag", fp.s0.b(y4Var6.f409848w, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c), true);
        c6588x45f713a.A = c6588x45f713a.b("SubTag", fp.s0.b(y4Var6.f409849x, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c), true);
        ml2.a4 a4Var = y4Var6.A;
        c6588x45f713a.C = a4Var.f408740d;
        c6588x45f713a.D = a4Var == ml2.a4.f408738f ? y4Var6.B : 0L;
        c6588x45f713a.E = c6588x45f713a.b("BeautyResult", dk2.b.f314761a.a(), true);
        lo0.k0 k0Var = ko0.l0.f391411a.b().f401596d;
        lo0.b0 b0Var = ko0.c0.f391358a.b().f401529e;
        try {
            org.json.JSONObject jSONObject5 = new org.json.JSONObject();
            jSONObject5.put("Beautytype", k0Var.f401568a);
            jSONObject5.put("Filtertype", b0Var.f401500a);
            jSONObject5.put("Filtervalue", a06.d.a(b0Var.f401507h * 100.0d));
            java.lang.String jSONObject6 = jSONObject5.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject6, "toString(...)");
            str = r26.i0.t(jSONObject6, ",", ";", false);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MakeupSuitDataManager", e17.toString());
            str = "";
        }
        c6588x45f713a.H = c6588x45f713a.b("MeizhuangResult", str, true);
        c6588x45f713a.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellLiveReport", "report21024: chnl_extra:" + c6588x45f713a.I);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("report21024: finderUsrname=");
        sb6.append(c6588x45f713a.f139382d);
        sb6.append(", finderWxAppInfo=");
        sb6.append(c6588x45f713a.f139383e);
        sb6.append(", isPrivate=");
        sb6.append(c6588x45f713a.f139384f);
        sb6.append(", finderSessionId=");
        sb6.append(c6588x45f713a.f139385g);
        sb6.append(", actionTimeMs=");
        sb6.append(c6588x45f713a.f139386h);
        sb6.append(", exitType=");
        sb6.append(c6588x45f713a.f139397s);
        sb6.append(", fansCount=");
        sb6.append(c6588x45f713a.f139387i);
        sb6.append(", cameraStatus=");
        sb6.append(c6588x45f713a.f139388j);
        sb6.append(", enterUITimeMs=");
        sb6.append(c6588x45f713a.f139389k);
        sb6.append(", stayTimeMs=");
        sb6.append(c6588x45f713a.f139390l);
        sb6.append(", coverType=");
        sb6.append(c6588x45f713a.f139391m);
        sb6.append(", ruleType=");
        sb6.append(c6588x45f713a.f139392n);
        sb6.append(", poiJson=");
        sb6.append(c6588x45f713a.f139393o);
        sb6.append(", description=");
        sb6.append(c6588x45f713a.f139394p);
        sb6.append(", liveId=");
        sb6.append(c6588x45f713a.f139395q);
        sb6.append(", feedId=");
        sb6.append(c6588x45f713a.f139396r);
        sb6.append(", errorCode=");
        sb6.append(c6588x45f713a.f139398t);
        sb6.append(", goodsListJson=");
        sb6.append(c6588x45f713a.f139399u);
        sb6.append(", retouchResult=");
        sb6.append(c6588x45f713a.f139402x);
        sb6.append(", filtersResult=");
        sb6.append(c6588x45f713a.f139403y);
        sb6.append(", connectSwitch=");
        sb6.append(c6588x45f713a.B);
        sb6.append(", sourceScene=");
        sb6.append(c6588x45f713a.f139401w);
        sb6.append(", tag=");
        ml2.y4 y4Var7 = f409116i;
        sb6.append(y4Var7.f409848w);
        sb6.append(", subTag=");
        sb6.append(y4Var7.f409849x);
        sb6.append(", visibleRange=");
        sb6.append(c6588x45f713a.C);
        sb6.append(", beautyResult=");
        sb6.append(c6588x45f713a.E);
        sb6.append(", shopWindowId=");
        sb6.append(c6588x45f713a.f139400v);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellLiveReport", sb6.toString());
    }

    public void oj(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, ml2.x1 actionType, java.lang.String commentscene, ml2.y event, int i17, long j17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionType, "actionType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentscene, "commentscene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        android.content.Context context = c1163xf1deaba4 != null ? c1163xf1deaba4.getContext() : null;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        java.lang.String dk6 = dk(commentscene, activity != null ? activity.getIntent() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Audience21053ReportKarl", "before commentScene: " + commentscene + ", new commentScene: " + dk6);
        f409117m.g(c1163xf1deaba4, actionType, dk6, event, i17, j17, i18);
    }

    public void pj(long j17, long j18, java.lang.String str, java.lang.String str2, long j19, long j27, ml2.x1 actionType, java.lang.String commentscene, java.lang.String chnlExtra, int i17, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionType, "actionType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentscene, "commentscene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chnlExtra, "chnlExtra");
        wi(new ml2.v0(j17, j18, str, str2 == null ? "" : str2, j19, j27, actionType, commentscene, 0L, 0L, null, null, i17, "", "", chnlExtra, null, c19792x256d2725, 69376, null), null);
    }

    public void qj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, long j17, ml2.x1 actionType, java.lang.String commentscene, java.lang.String chnlExtra, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionType, "actionType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentscene, "commentscene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chnlExtra, "chnlExtra");
        long mo2128x1ed62e84 = feed.mo2128x1ed62e84();
        r45.nw1 m59258xd0557130 = feed.getFeedObject().m59258xd0557130();
        wi(new ml2.v0(mo2128x1ed62e84, m59258xd0557130 != null ? m59258xd0557130.m75942xfb822ef2(0) : 0L, feed.w(), feed.getFeedObject().m59299x6bf53a6c(), j17, feed.getFeedObject().m59258xd0557130() != null ? r2.m75939xb282bd08(1) : -1L, actionType, commentscene, 0L, 0L, null, null, 0, null, null, chnlExtra, null, feed.getFeedObject().getFeedObject(), 98048, null), str);
    }

    public void rj(so2.j1 j1Var, java.lang.String str, long j17, ml2.x1 actionType, java.lang.String commentscene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionType, "actionType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentscene, "commentscene");
        if (j1Var == null) {
            wi(new ml2.v0(0L, 0L, null, str == null ? "" : str, j17, -1L, actionType, commentscene, 0L, 0L, null, null, 0, null, null, null, null, null, 261888, null), null);
            return;
        }
        long mo2128x1ed62e84 = j1Var.mo2128x1ed62e84();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = j1Var.f491972d;
        r45.nw1 m76794xd0557130 = c19792x256d2725.m76794xd0557130();
        long m75942xfb822ef2 = m76794xd0557130 != null ? m76794xd0557130.m75942xfb822ef2(0) : 0L;
        r45.dm2 m76806xdef68064 = c19792x256d2725.m76806xdef68064();
        java.lang.String m75945x2fec8307 = m76806xdef68064 != null ? m76806xdef68064.m75945x2fec8307(62) : null;
        java.lang.String m76836x6c03c64c = c19792x256d2725.m76836x6c03c64c();
        if (m76836x6c03c64c == null) {
            m76836x6c03c64c = "";
        }
        wi(new ml2.v0(mo2128x1ed62e84, m75942xfb822ef2, m75945x2fec8307, m76836x6c03c64c, j17, c19792x256d2725.m76794xd0557130() != null ? r2.m75939xb282bd08(1) : -1L, actionType, commentscene, 0L, 0L, null, null, 0, null, null, null, null, j1Var.f491972d, 130816, null), null);
    }

    public void sj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, long j17, ml2.x1 actionType, java.lang.String commentscene, java.lang.String clickTabContextId, java.lang.String clickSubTabContextId, java.lang.String chnlExtra) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject2;
        r45.nw1 m59258xd0557130;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject4;
        r45.nw1 m59258xd05571302;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionType, "actionType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentscene, "commentscene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickTabContextId, "clickTabContextId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickSubTabContextId, "clickSubTabContextId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chnlExtra, "chnlExtra");
        ae2.in inVar = ae2.in.f85221a;
        java.lang.String m76829x97edf6c0 = (abstractC14490x69736cb5 == null || !(((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.V0).mo141623x754a37bb()).r()).intValue() == 1)) ? "" : abstractC14490x69736cb5.getFeedObject().getFeedObject().m76829x97edf6c0();
        long j18 = 0;
        long mo2128x1ed62e84 = abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.mo2128x1ed62e84() : 0L;
        if (abstractC14490x69736cb5 != null && (feedObject4 = abstractC14490x69736cb5.getFeedObject()) != null && (m59258xd05571302 = feedObject4.m59258xd0557130()) != null) {
            j18 = m59258xd05571302.m75942xfb822ef2(0);
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = null;
        java.lang.String w17 = abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.w() : null;
        if (abstractC14490x69736cb5 == null || (feedObject3 = abstractC14490x69736cb5.getFeedObject()) == null || (str = feedObject3.m59299x6bf53a6c()) == null) {
            str = "";
        }
        long m75939xb282bd08 = (abstractC14490x69736cb5 == null || (feedObject2 = abstractC14490x69736cb5.getFeedObject()) == null || (m59258xd0557130 = feedObject2.m59258xd0557130()) == null) ? -1L : m59258xd0557130.m75939xb282bd08(1);
        if (abstractC14490x69736cb5 != null && (feedObject = abstractC14490x69736cb5.getFeedObject()) != null) {
            c19792x256d2725 = feedObject.getFeedObject();
        }
        wi(new ml2.v0(mo2128x1ed62e84, j18, w17, str, j17, m75939xb282bd08, actionType, commentscene, 0L, 0L, null, null, 0, clickTabContextId, clickSubTabContextId, chnlExtra, null, c19792x256d2725, 73472, null), m76829x97edf6c0);
    }

    public void tj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, long j17, java.lang.String commentscene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentscene, "commentscene");
        ml2.x1 x1Var = feed.h() == 9 ? ml2.x1.f409738i : ml2.x1.f409739m;
        long mo2128x1ed62e84 = feed.mo2128x1ed62e84();
        r45.nw1 m59258xd0557130 = feed.getFeedObject().m59258xd0557130();
        wi(new ml2.v0(mo2128x1ed62e84, m59258xd0557130 != null ? m59258xd0557130.m75942xfb822ef2(0) : 0L, feed.w(), feed.getFeedObject().m59299x6bf53a6c(), j17, feed.getFeedObject().m59258xd0557130() != null ? r2.m75939xb282bd08(1) : -1L, x1Var, commentscene, 0L, 0L, null, null, 0, null, null, null, null, feed.getFeedObject().getFeedObject(), 130816, null), null);
    }

    public void uj(ml2.w0 enterData) {
        java.lang.String Gj;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterData, "enterData");
        long j17 = enterData.f409692d;
        java.lang.String str2 = enterData.f409695g;
        Ui(j17, str2);
        ml2.y4 y4Var = f409116i;
        ml2.y4.o(y4Var, enterData.f409694f, enterData.f409701m.f409102d, null, 4, null);
        ml2.d dVar = f409117m;
        dVar.getClass();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6515x778551f1 c6515x778551f1 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6515x778551f1();
        ((ml2.j0) i95.n0.c(ml2.j0.class)).Vi(c6515x778551f1, enterData.f409691c);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        c6515x778551f1.t(b52.b.q(enterData.f409689a));
        long j18 = enterData.f409690b;
        c6515x778551f1.f138655e = j18;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        c6515x778551f1.u(b52.b.q(j18));
        ml2.x1 x1Var = enterData.f409694f;
        c6515x778551f1.f138659i = x1Var.f409753d;
        c6515x778551f1.r(str2);
        c6515x778551f1.f138661k = j17;
        c6515x778551f1.f138662l = enterData.f409696h;
        c6515x778551f1.f138663m = enterData.f409697i;
        c6515x778551f1.w(enterData.f409698j);
        c6515x778551f1.f138671u = c6515x778551f1.b("SnsFeedId", enterData.f409699k, true);
        c6515x778551f1.f138666p = enterData.f409693e;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        c6515x778551f1.q(b52.b.c());
        java.lang.String str3 = enterData.f409706r;
        if (str3.length() == 0) {
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            Gj = b52.b.b();
        } else {
            Gj = c01.e2.S(str3) ? ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(31, 2, 65) : com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str3) ? ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(3, 2, 65) : com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(str3) ? ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(58, 2, 65) : ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(2, 2, 65);
        }
        c6515x778551f1.s(Gj);
        c6515x778551f1.p(dVar.e(x1Var, dVar.a(r26.i0.v(dVar.f(enterData.f409705q, str3), ",", ";", false, 4, null), "entrance_gmsg_id", enterData.f409707s)));
        if (!r26.i0.y(str2, "temp_", false)) {
            c6515x778551f1.v(ml2.d.d(dVar, enterData.f409689a, com.p314xaae8f345.mm.sdk.p2603x2137b148.b8.c(c6515x778551f1.f138660j), null, 4, null));
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c6515x778551f1.f138660j, "temp_2")) {
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            c6515x778551f1.v(y4Var.f409851z);
        } else {
            c6515x778551f1.v(enterData.f409702n);
        }
        c6515x778551f1.f138672v = enterData.f409700l;
        c6515x778551f1.f138673w = r12.f409102d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c6515x778551f1.f138660j, com.p314xaae8f345.p457x3304c6.C3964x9fa34f55.f15753xdc29ea5a) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((m30.o) ((n30.s) i95.n0.c(n30.s.class))).wi(), "123")) {
            if (android.text.TextUtils.isEmpty(p52.h.f433560l)) {
                ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                str = v52.c.g().d();
            } else {
                str = p52.h.f433560l;
            }
            c6515x778551f1.f138674x = c6515x778551f1.b("SnsSessionID", str, true);
        }
        c6515x778551f1.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.Audience21053Report", "report21053OnClickOnShare, struct=\nfeedId=" + c6515x778551f1.f138656f + "\nliveId=" + c6515x778551f1.f138670t + "\nuserName=" + c6515x778551f1.f138654d + "\nisPrivate=" + c6515x778551f1.f138668r + "\nsessionID=" + c6515x778551f1.f138657g + "\nactionTS=" + c6515x778551f1.f138658h + "\naction=" + c6515x778551f1.f138659i + "\ncommentScene=" + c6515x778551f1.f138660j + "\nindex=" + c6515x778551f1.f138661k + "\nenterStatus=" + c6515x778551f1.f138662l + "\ncontextId=" + c6515x778551f1.f138665o + "\nonlineNum=" + c6515x778551f1.f138666p + "\nclickTabContextId=" + c6515x778551f1.f138667q + "\nsessionBuffer=" + c6515x778551f1.f138669s + "\nshareType=" + c6515x778551f1.f138663m + "\nshareUserName=" + c6515x778551f1.f138664n + "\nenterSessionId=" + c6515x778551f1.f138672v + "\nenterIconType=" + c6515x778551f1.f138673w + "\nsnsSessionID=" + c6515x778551f1.f138674x + "\nchnl_extra=" + c6515x778551f1.f138675y + "\nsnsFeedId=" + c6515x778551f1.f138671u);
    }

    public final void vj(long j17, long j18, java.lang.String str, long j19, long j27, ml2.x1 actionType, java.lang.String commentscene, long j28, long j29, ml2.i4 enterType, java.lang.String str2, java.lang.String clickSubTabContextId, java.lang.String chnlExtra) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionType, "actionType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentscene, "commentscene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterType, "enterType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickSubTabContextId, "clickSubTabContextId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chnlExtra, "chnlExtra");
        if (!android.text.TextUtils.isEmpty(commentscene)) {
            Ai(new ml2.w0(j17, j18, str == null ? "" : str, j19, j27, actionType, commentscene, j28, -1L, "", "", j29, enterType, str2 == null ? "" : str2, null, clickSubTabContextId, chnlExtra, null, null, com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26672xc5b068cb.f56205xe103064f, null));
            return;
        }
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String e17 = v52.c.g().e();
        if (((q30.i) ((r30.n) i95.n0.c(r30.n.class))).wi(e17)) {
            java.lang.String str3 = str == null ? "" : str;
            ml2.q1 q1Var = ml2.q1.f409345e;
            ((q30.i) ((r30.n) i95.n0.c(r30.n.class))).getClass();
            long a17 = p52.j.f433575a.a(e17);
            java.lang.String str4 = p52.h.f433554f;
            java.lang.String str5 = str4 == null ? "" : str4;
            java.lang.String str6 = p52.h.f433555g;
            Ai(new ml2.w0(j17, j18, str3, 0L, j27, actionType, "temp_6", j28, a17, str5, str6 == null ? "" : str6, j29, enterType, null, null, clickSubTabContextId, chnlExtra, null, null, 417792, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x023c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wi(ml2.v0 r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 815
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ml2.j0.wi(ml2.v0, java.lang.String):void");
    }

    public void wj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, ml2.x1 actionType, java.lang.String commentscene, java.lang.String chnlExtra, java.lang.String str, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionType, "actionType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentscene, "commentscene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chnlExtra, "chnlExtra");
        long mo2128x1ed62e84 = feed.mo2128x1ed62e84();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String q17 = b52.b.q(mo2128x1ed62e84);
        ml2.d0 d0Var = ml2.f0.A;
        nm5.c a17 = d0Var.a(feed);
        java.lang.String m59299x6bf53a6c = feed.getFeedObject().m59299x6bf53a6c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(q17);
        java.lang.Object a18 = a17.a(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "$1(...)");
        long longValue = ((java.lang.Number) a18).longValue();
        java.lang.Object a19 = a17.a(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a19, "$2(...)");
        int intValue = ((java.lang.Number) a19).intValue();
        java.lang.String b17 = d0Var.b(feed);
        ml2.e0 e0Var = ml2.e0.f408903e;
        java.lang.Object a27 = a17.a(2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a27, "$3(...)");
        f409117m.i(new ml2.f0(feed, m59299x6bf53a6c, i17, q17, mo2128x1ed62e84, longValue, actionType, commentscene, intValue, b17, e0Var, true, ((java.lang.Boolean) a27).booleanValue(), 0, null, null, chnlExtra, null, 0L, null, 0, 0L, 0, null, null, null, 67035136, null), str);
    }

    public final void xj(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, ml2.x1 actionType, java.lang.String commentscene, ml2.y event, int i17, int i18) {
        java.lang.String str;
        ml2.y yVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionType, "actionType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentscene, "commentscene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(commentscene, "80") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(commentscene, "94")) {
            p52.c cVar = p52.h.f433549a;
            str = p52.h.f433550b ? "80" : "94";
        } else {
            str = commentscene;
        }
        ml2.y yVar2 = ml2.y.f409773e;
        if (event == yVar2) {
            f409116i.getClass();
        }
        n30.r rVar = (n30.r) i95.n0.c(n30.r.class);
        ((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).getClass();
        rq2.x xVar = rq2.x.f480447a;
        ((m30.m) rVar).Bi(rq2.x.f480448b);
        n30.r rVar2 = (n30.r) i95.n0.c(n30.r.class);
        ((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).getClass();
        ((m30.m) rVar2).Di(rq2.x.f480452f);
        if (i17 == -1 && this.f409124h.contains(java.lang.Integer.valueOf(i18))) {
            p52.h.f433561m = i18;
            return;
        }
        int i19 = this.f409121e;
        if (i17 != i19 && i18 != i19) {
            p52.h.f433561m = i18;
            if (i17 == 1001) {
                yVar2 = ml2.y.f409774f;
            } else if (i18 != 1001) {
                return;
            }
            yVar = yVar2;
        } else if ((event == yVar2 || event == ml2.y.f409774f) && p52.h.f433561m != 1001) {
            return;
        } else {
            yVar = event;
        }
        f409117m.g(c1163xf1deaba4, actionType, str, yVar, 0, -1L, 0);
    }

    public void yj(ml2.z4 actionType, java.lang.String str, java.lang.String str2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionType, "actionType");
        if (zl2.r4.f555483a.w1()) {
            Ej(actionType, str, str2);
        }
    }

    public final void zj(ml2.c5 action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", action.f408880d);
        zy2.zb.y6(this, ml2.z4.D2, jSONObject.toString(), null, 4, null);
    }
}
