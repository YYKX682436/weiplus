package dk2;

/* loaded from: classes3.dex */
public final class s0 {
    public s0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final r45.na4 a(java.lang.String name, r45.ma4 liveSdkInfo, r45.nw1 liveInfo, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCParams trtcParams, kn0.g liveRoomInfo, int i17, gk2.e liveData) {
        int i18;
        com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCParams tRTCParams;
        java.lang.String str;
        boolean z17;
        int i19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveSdkInfo, "liveSdkInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveInfo, "liveInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(trtcParams, "trtcParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveRoomInfo, "liveRoomInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        trtcParams.f57078xc8d8bf56 = liveSdkInfo.f461829f;
        trtcParams.f57079xe756702 = liveSdkInfo.f461827d;
        trtcParams.f57076x19d1d6c6 = x51.j1.b(liveSdkInfo.f461832i);
        trtcParams.f57083xce2b2e46 = liveSdkInfo.f461828e;
        trtcParams.f57084xf73ac106 = x51.j1.b(liveSdkInfo.f461831h);
        trtcParams.f57077x358076 = (i17 == 1 || i17 != 2) ? 20 : 21;
        liveRoomInfo.f391067a = name;
        liveRoomInfo.f391068b = liveInfo.m75942xfb822ef2(0);
        java.util.HashMap hashMap = liveRoomInfo.f391077k;
        java.lang.String live_cdn_url = liveSdkInfo.f461838r;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(live_cdn_url, "live_cdn_url");
        java.lang.String str2 = "";
        hashMap.put(0, new kn0.r(live_cdn_url, 0, "", ""));
        liveRoomInfo.f391070d = liveSdkInfo.f461834n;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = new r45.na4().mo11468x92b714fd(liveSdkInfo.f461833m.f273689a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.LiveSdkParams");
        r45.na4 na4Var = (r45.na4) mo11468x92b714fd;
        zl2.r4 r4Var = zl2.r4.f555483a;
        if (r4Var.W1(liveData) || r4Var.z1(liveData)) {
            r45.q82 q82Var = (r45.q82) liveInfo.m75936x14adae67(9);
            liveRoomInfo.f391069c = q82Var != null ? q82Var.m75939xb282bd08(0) : 0;
        } else {
            liveRoomInfo.f391069c = na4Var.f462730f.f460068f;
        }
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.T1).mo141623x754a37bb()).r()).intValue();
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z65.c.a() && intValue != -1 && i17 != 1) {
            liveRoomInfo.f391069c = intValue;
        }
        r45.ka4 ka4Var = na4Var.f462730f;
        liveRoomInfo.f391071e = ka4Var.f460070h;
        liveRoomInfo.f391072f = ka4Var.f460071i;
        liveRoomInfo.f391080n = ka4Var.f460084v;
        r45.oa4 oa4Var = na4Var.f462728d;
        r45.ja4 ja4Var = na4Var.f462729e;
        vn0.c cVar = vn0.b.f519707a;
        if (oa4Var != null) {
            boolean z18 = (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_live_hevc_enc_enable_switch, 0) == 1) && oa4Var.f463620r > 0;
            zl2.q4 q4Var = zl2.q4.f555466a;
            boolean booleanValue = ((java.lang.Boolean) ((jz5.n) zl2.q4.f555468c).mo141623x754a37bb()).booleanValue();
            boolean z19 = z18 && booleanValue;
            boolean z27 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_live_force_hevc_mixing, 0) == 1;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[LiveSdkParams] processLiveSdkParams enableHEVCEncFromSvr:");
            sb6.append(z18);
            sb6.append(", sdkenable:");
            sb6.append(oa4Var.f463620r);
            sb6.append(", enableHEVCEncFromLocal:");
            sb6.append(booleanValue);
            sb6.append(", isHEVCEncEnable:");
            boolean z28 = z19;
            sb6.append(z28);
            sb6.append(", isForceHEVCMixing:");
            sb6.append(z27);
            sb6.append(", videoSdkParam.clip_20_21:");
            sb6.append(oa4Var.H);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveAssistant", sb6.toString());
            cVar.d().f536977t = z28;
            cVar.d().f536978u = z27;
            if (oa4Var.f463609d > 0) {
                cVar.d().f536964d = oa4Var.f463609d;
            }
            if (oa4Var.f463611f > 0) {
                cVar.d().f536965e = oa4Var.f463611f;
            }
            if (oa4Var.f463612g > 0) {
                cVar.d().f536966f = oa4Var.f463612g;
            }
            if (oa4Var.f463619q > 0) {
                cVar.d().f536967g = oa4Var.f463619q;
            }
            if (oa4Var.f463621s > 0) {
                cVar.d().f536968h = oa4Var.f463621s;
            }
            if (oa4Var.f463622t > 0) {
                cVar.d().f536969i = oa4Var.f463622t;
            }
            if (oa4Var.f463623u > 0) {
                cVar.d().f536970m = oa4Var.f463623u;
            }
            if (oa4Var.f463624v > 0) {
                cVar.d().f536971n = oa4Var.f463624v;
            }
            if (oa4Var.f463614i > 0) {
                cVar.d().f536973p = oa4Var.f463614i;
            }
            int i27 = oa4Var.f463615m;
            if (i27 >= 0 && i27 < 2) {
                cVar.d().f536972o = oa4Var.f463615m;
            }
            if (oa4Var.H == 1) {
                cVar.d().A = true;
            }
            dk2.ef.f314905a.Y(oa4Var);
        }
        if (ja4Var != null) {
            if (ja4Var.f459211d > 0) {
                cVar.a().f536942g = ja4Var.f459211d;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveAssistant", "processLiveSdkParams audioQuality:" + ja4Var.f459211d);
        }
        if (ka4Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveAssistant", "userDefineRecordId:" + ka4Var.f460066d + ',' + ka4Var.f460067e);
            java.lang.String str4 = ka4Var.f460067e;
            java.lang.String str5 = ka4Var.f460066d;
            int i28 = ka4Var.f460079q;
            java.lang.String str6 = ka4Var.Q;
            ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).getClass();
            boolean Di = d11.s.Di(5);
            dk2.kc.f315229a.c(true, Di);
            if (Di) {
                z17 = false;
            } else {
                i28 = ka4Var.f460080r;
                z17 = true;
            }
            liveRoomInfo.f391076j = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).Rj().z0(liveRoomInfo.f391068b);
            liveRoomInfo.f391075i = ka4Var.f460080r;
            if (i28 < 100) {
                liveRoomInfo.f391073g = kn0.a.f391026d;
                liveRoomInfo.f391074h = i28;
            } else {
                hn0.a[] aVarArr = hn0.a.f363915d;
                if (i28 == 101) {
                    liveRoomInfo.f391073g = kn0.a.f391027e;
                } else if (i28 == 102) {
                    liveRoomInfo.f391073g = kn0.a.f391028f;
                }
            }
            java.util.LinkedList cdn_trans_info = ka4Var.f460073m;
            if (cdn_trans_info == null || cdn_trans_info.isEmpty()) {
                i18 = intValue;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cdn_trans_info, "cdn_trans_info");
                java.util.Iterator it = cdn_trans_info.iterator();
                while (it.hasNext()) {
                    r45.gv gvVar = (r45.gv) it.next();
                    java.util.HashMap hashMap2 = liveRoomInfo.f391077k;
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(gvVar.f457071f);
                    java.util.Iterator it6 = it;
                    java.lang.String str7 = str2;
                    java.lang.String str8 = gvVar.f457070e;
                    int i29 = intValue;
                    if (str8 == null) {
                        str8 = str7;
                    }
                    int i37 = gvVar.f457075m;
                    java.lang.String str9 = gvVar.f457076n;
                    java.lang.String str10 = gvVar.f457078p;
                    if (str10 == null) {
                        str10 = str7;
                    }
                    hashMap2.put(valueOf, new kn0.r(str8, i37, str9, str10));
                    it = it6;
                    str2 = str7;
                    intValue = i29;
                }
                i18 = intValue;
                if (z17) {
                    kn0.r g17 = liveRoomInfo.g(i28);
                    java.lang.String str11 = g17 != null ? g17.f391131c : null;
                    if (str11 == null || str11.length() == 0) {
                        ae2.in inVar = ae2.in.f85221a;
                        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85461y4).mo141623x754a37bb()).r()).intValue() == 0) {
                            int i38 = ka4Var.f460079q;
                            kn0.r rVar = (kn0.r) liveRoomInfo.f391077k.get(java.lang.Integer.valueOf(i28));
                            kn0.r rVar2 = (kn0.r) liveRoomInfo.f391077k.get(java.lang.Integer.valueOf(i38));
                            if (rVar != null && rVar2 != null) {
                                java.lang.String str12 = "before exchangeCdnUrl:" + liveRoomInfo.f391077k;
                                java.lang.String str13 = liveRoomInfo.f391086t;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str13, str12);
                                int i39 = rVar.f391130b;
                                java.lang.String str14 = rVar.f391131c;
                                rVar.f391130b = rVar2.f391130b;
                                rVar.f391131c = rVar2.f391131c;
                                rVar2.f391130b = i39;
                                rVar2.f391131c = str14;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str13, "after exchangeCdnUrl:" + liveRoomInfo.f391077k);
                            }
                        }
                    }
                }
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6)) {
                tRTCParams = trtcParams;
            } else {
                cl0.g gVar = new cl0.g();
                java.lang.Boolean bool = ((mm2.c1) liveData.a(mm2.c1.class)).f410380n2;
                boolean booleanValue2 = bool != null ? bool.booleanValue() : false;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4) && !booleanValue2) {
                    gVar.h("userdefine_streamid_main", str4);
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
                    gVar.h("userdefine_record_id", str5);
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6)) {
                    gVar.h("userdefine_push_args", str6);
                }
                if (((om2.l) liveData.a(om2.l.class)).N6() == 1 && zl2.r4.f555483a.w1() && (i19 = na4Var.f462730f.E1) == 1) {
                    gVar.o("keepmix", i19);
                    gVar.o("keepmix_idle_time", na4Var.f462730f.F1);
                }
                cl0.g gVar2 = new cl0.g();
                gVar2.h("Str_uc_params", gVar);
                tRTCParams = trtcParams;
                tRTCParams.f57075xd7e1b88e = gVar2.toString();
            }
            liveRoomInfo.f391081o = ka4Var;
            str = "MicroMsg.FinderLiveAssistant";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "processLiveSdkParams cdnQualitySvrcfg" + liveRoomInfo.f391074h + " cdnSwitchMode:" + liveRoomInfo.f391073g + " cdn_quality_h265backcfg:" + liveRoomInfo.f391075i);
        } else {
            i18 = intValue;
            tRTCParams = trtcParams;
            str = "MicroMsg.FinderLiveAssistant";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "processLiveCgiSDKResponse trtcParams.roomId" + tRTCParams.f57078xc8d8bf56 + " trtcParams.userId:" + tRTCParams.f57083xce2b2e46 + " debugAudienceMode:" + i18 + " liveRoomInfo:" + liveRoomInfo);
        return na4Var;
    }
}
