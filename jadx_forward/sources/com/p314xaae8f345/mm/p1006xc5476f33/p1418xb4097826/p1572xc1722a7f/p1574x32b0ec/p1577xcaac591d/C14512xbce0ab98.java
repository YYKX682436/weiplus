package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/nearby/live/square/NearbyLiveSquareFragment;", "Lcom/tencent/mm/plugin/finder/nearby/base/AbsNearByFragment;", "<init>", "()V", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareFragment */
/* loaded from: classes2.dex */
public class C14512xbce0ab98 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301 {
    public C14512xbce0ab98() {
        super(com.p314xaae8f345.mm.R.C30867xcad56011.h7d, 1001);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301
    public void A0() {
        boolean z17;
        boolean z18;
        yl2.g gVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14513x218d4a07) j0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14513x218d4a07.class)).f203029g;
        if (gVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("livePostHelper");
            throw null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostForNearby", "prepare()");
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        yl2.g1 g1Var = gVar.f544536f;
        zy2.zb.qd(zbVar, 2, g1Var.f544542b, g1Var.f544543c, null, 8, null);
        android.app.Activity activity = gVar.f544534d;
        java.lang.String e17 = xy2.c.e(activity);
        boolean z19 = false;
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(activity)) {
            z17 = true;
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activity);
            u1Var.g(activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dls));
            u1Var.n(activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
            u1Var.l(yl2.a.f544500a);
            u1Var.q(false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderLivePostForNearby", "checkNetworkAvailable() network problem");
            z17 = false;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostForNearby", "checkAccountValid()");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostForNearby", "checkAccountValid() need create finder contact.");
                ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                ml2.y4 y4Var = ml2.j0.f409116i;
                ml2.m3 m3Var = ml2.m3.f409247f;
                y4Var.getClass();
                y4Var.f409822b0 = m3Var;
                i95.m c18 = i95.n0.c(c61.yb.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15230x4b89f918.INSTANCE.m61670x24665632(activity, 3, null);
                z18 = false;
            } else {
                z18 = true;
            }
            if (z18) {
                m92.b I1 = g92.a.I1(g92.b.f351302e, false, 1, null);
                if (I1 != null && I1.v0()) {
                    z19 = true;
                }
                if (z19) {
                    zl2.q4.f555466a.Q();
                } else {
                    ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                    ml2.y4 y4Var2 = ml2.j0.f409116i;
                    ml2.m3 m3Var2 = ml2.m3.f409246e;
                    y4Var2.getClass();
                    y4Var2.f409822b0 = m3Var2;
                    if (c92.g.f121271a.b()) {
                        i95.m c19 = i95.n0.c(c61.yb.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                        c61.yb.l3((c61.yb) c19, gVar.f544534d, e17, new yl2.c(gVar), yl2.d.f544516d, null, false, 48, null);
                    } else {
                        i95.m c27 = i95.n0.c(c61.yb.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c27, "getService(...)");
                        c61.yb.l3((c61.yb) c27, gVar.f544534d, e17, new yl2.e(gVar), yl2.f.f544529d, null, false, 48, null);
                    }
                    i95.m c28 = i95.n0.c(zy2.zb.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c28, "getService(...)");
                    zy2.zb.qd((zy2.zb) c28, 3, g1Var.f544542b, g1Var.f544543c, null, 8, null);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderLivePostForNearby", "prepare() checkAccountValid failed");
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderLivePostForNearby", "prepare() checkNetworkAvailable failed");
        }
        ((ml2.j0) i95.n0.c(ml2.j0.class)).Kj(ml2.l3.f409227e);
    }

    public final void B0(android.app.Activity activity) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.Class cls;
        boolean z17;
        android.os.Bundle bundle;
        boolean z18;
        long j17;
        int i17;
        int i18;
        java.lang.String str7;
        java.lang.Integer num;
        java.lang.String str8;
        int i19;
        int i27;
        long j18;
        java.lang.String m75945x2fec8307;
        java.lang.String m75945x2fec83072;
        java.lang.String m75945x2fec83073;
        java.lang.String str9;
        java.lang.Class cls2;
        java.lang.String str10;
        java.lang.String str11;
        java.lang.String str12;
        java.lang.String str13;
        java.lang.String str14;
        android.os.Bundle bundle2;
        long j19;
        int i28;
        int i29;
        boolean z19;
        java.lang.String str15;
        int i37;
        int i38;
        int i39;
        int i47;
        java.lang.String str16;
        long j27;
        int i48;
        java.lang.String m75945x2fec83074;
        java.lang.String m75945x2fec83075;
        java.lang.String m75945x2fec83076;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        long j28 = 0;
        if (!c92.g.f121271a.b()) {
            zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
            android.os.Bundle bundle3 = new android.os.Bundle();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = nk6.L0("NearbyEntrance");
            if (L0 == null || L0.I0("NearbyEntrance") == null || L0.m55856xfb85f7b0() != 16) {
                str = " activity:";
                str2 = "NearbyLiveSquareFragment";
                str3 = "nearby_live_target_square_page_params_key";
                str4 = " targetObjectId:";
                str5 = " commentScene=";
                str6 = " enterLiveAction:";
                cls = zy2.rb.class;
                z17 = true;
                bundle = bundle3;
                z18 = true;
                j17 = 0;
                i17 = 0;
                i18 = 0;
            } else {
                nk6.a0(L0);
                r45.xs2 Q = nk6.Q("NearbyLiveTab");
                int m75939xb282bd08 = Q != null ? Q.m75939xb282bd08(12) : 0;
                r45.xs2 Q2 = nk6.Q("NearbyLiveTab");
                int m75939xb282bd082 = Q2 != null ? Q2.m75939xb282bd08(13) : 0;
                r45.xs2 Q3 = nk6.Q("NearbyLiveTab");
                long m75942xfb822ef2 = Q3 != null ? Q3.m75942xfb822ef2(3) : 0L;
                r45.xs2 Q4 = nk6.Q("NearbyLiveTab");
                java.lang.String str17 = (Q4 == null || (m75945x2fec83073 = Q4.m75945x2fec8307(8)) == null) ? "" : m75945x2fec83073;
                r45.xs2 Q5 = nk6.Q("NearbyLiveTab");
                java.lang.String str18 = (Q5 == null || (m75945x2fec83072 = Q5.m75945x2fec8307(14)) == null) ? "" : m75945x2fec83072;
                r45.xs2 Q6 = nk6.Q("NearbyLiveTab");
                java.lang.String str19 = (Q6 == null || (m75945x2fec8307 = Q6.m75945x2fec8307(15)) == null) ? "" : m75945x2fec8307;
                r45.xs2 Q7 = nk6.Q("NearbyLiveTab");
                if (Q7 == null || (str8 = Q7.m75945x2fec8307(16)) == null) {
                    str8 = "";
                }
                java.lang.Integer valueOf = java.lang.Integer.valueOf(m75939xb282bd082);
                valueOf.intValue();
                if (!(m75939xb282bd082 == 1)) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    valueOf.intValue();
                    if (m75942xfb822ef2 != 0) {
                        bundle3.putLong("nearby_live_target_object_id_params_key", m75942xfb822ef2);
                        bundle3.putInt("nearby_live_target_tab_id_params_key", m75939xb282bd08);
                        bundle3.putString("nearby_live_target_nonce_id_params_key", str17);
                        bundle3.putString("nearby_live_target_user_name_params_key", str18);
                        bundle3.putString("nearby_live_target_nick_name_params_key", str19);
                        bundle3.putString("nearby_live_target_cover_url_params_key", str8);
                        dp2.e eVar = dp2.e.f323725a;
                        eVar.c(activity instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activity : null, m75942xfb822ef2, str17, false, getF203048s(), null);
                        str = " activity:";
                        z17 = true;
                        str2 = "NearbyLiveSquareFragment";
                        j18 = m75942xfb822ef2;
                        i19 = m75939xb282bd082;
                        i27 = m75939xb282bd08;
                        str3 = "nearby_live_target_square_page_params_key";
                        str4 = " targetObjectId:";
                        str5 = " commentScene=";
                        str6 = " enterLiveAction:";
                        cls = zy2.rb.class;
                        bundle = bundle3;
                        dp2.e.d(eVar, activity, m75939xb282bd08, m75942xfb822ef2, str17, str18, str19, 0L, null, 192, null);
                        z18 = false;
                        i17 = i19;
                        j17 = j18;
                        i18 = i27;
                    }
                }
                i19 = m75939xb282bd082;
                i27 = m75939xb282bd08;
                str4 = " targetObjectId:";
                str5 = " commentScene=";
                str6 = " enterLiveAction:";
                str = " activity:";
                str2 = "NearbyLiveSquareFragment";
                cls = zy2.rb.class;
                str3 = "nearby_live_target_square_page_params_key";
                z17 = true;
                j18 = m75942xfb822ef2;
                bundle = bundle3;
                z18 = true;
                i17 = i19;
                j17 = j18;
                i18 = i27;
            }
            if (z18) {
                pf5.z zVar = pf5.z.f435481a;
                if (!(activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h80) ((zy2.rb) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).c(cls))).O6();
            }
            if (i18 == 0 && ((java.lang.Number) ae2.in.U3.r()).intValue() == 0) {
                i18 = wo2.n0.f529638a.c(getF203048s());
                str7 = str2;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str7, "prepareNearbyLive use last cache targetTabId=" + i18 + str5 + getF203048s());
            } else {
                str7 = str2;
            }
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
            valueOf2.intValue();
            num = i18 != 0 ? z17 : false ? valueOf2 : null;
            if (num != null) {
                num.intValue();
                r45.dd2 dd2Var = new r45.dd2();
                dd2Var.set(0, java.lang.Integer.valueOf(i18));
                bundle.putByteArray(str3, dd2Var.mo14344x5f01b1f6());
            }
            if (m7436x8619eaa0() == null) {
                mo7562xe26dab14(bundle);
            } else {
                android.os.Bundle m7436x8619eaa0 = m7436x8619eaa0();
                if (m7436x8619eaa0 != null) {
                    m7436x8619eaa0.putAll(bundle);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str7, "prepareNearbyLive targetTabId=" + i18 + str6 + i17 + str4 + j17 + str + activity);
            return;
        }
        if (((java.lang.Number) ae2.in.U3.r()).intValue() == 1) {
            android.os.Bundle bundle4 = new android.os.Bundle();
            android.content.Intent intent = activity.getIntent();
            int intExtra = intent != null ? intent.getIntExtra("key_request_scene", 0) : 0;
            bundle4.putInt("key_request_scene", intExtra);
            if (m7436x8619eaa0() == null) {
                mo7562xe26dab14(bundle4);
            } else {
                android.os.Bundle m7436x8619eaa02 = m7436x8619eaa0();
                if (m7436x8619eaa02 != null) {
                    m7436x8619eaa02.putAll(bundle4);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveSquareFragment", "prepareNearbySquare newSquareEnable:true scene:" + intExtra);
            return;
        }
        zy2.fa nk7 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
        android.os.Bundle bundle5 = new android.os.Bundle();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L02 = nk7.L0("FinderLiveEntrance");
        if (L02 != null) {
            if (L02.I0("FinderLiveEntrance") == null || L02.m55856xfb85f7b0() != 16) {
                str9 = " commentScene=";
                cls2 = zy2.rb.class;
                str10 = " targetObjectId:";
                str11 = " enterLiveAction:";
                str12 = "nearby_live_target_square_page_params_key";
                str13 = "NearbyLiveSquareFragment";
                str14 = " activity:";
                bundle2 = bundle5;
                i37 = 0;
                i38 = 0;
            } else {
                nk7.a0(L02);
                r45.xs2 Q8 = nk7.Q("NearbyLiveTab");
                int m75939xb282bd083 = Q8 != null ? Q8.m75939xb282bd08(12) : 0;
                r45.xs2 Q9 = nk7.Q("NearbyLiveTab");
                int m75939xb282bd084 = Q9 != null ? Q9.m75939xb282bd08(13) : 0;
                r45.xs2 Q10 = nk7.Q("NearbyLiveTab");
                long m75942xfb822ef22 = Q10 != null ? Q10.m75942xfb822ef2(3) : 0L;
                r45.xs2 Q11 = nk7.Q("NearbyLiveTab");
                java.lang.String str20 = (Q11 == null || (m75945x2fec83076 = Q11.m75945x2fec8307(8)) == null) ? "" : m75945x2fec83076;
                r45.xs2 Q12 = nk7.Q("NearbyLiveTab");
                java.lang.String str21 = (Q12 == null || (m75945x2fec83075 = Q12.m75945x2fec8307(14)) == null) ? "" : m75945x2fec83075;
                r45.xs2 Q13 = nk7.Q("NearbyLiveTab");
                java.lang.String str22 = (Q13 == null || (m75945x2fec83074 = Q13.m75945x2fec8307(15)) == null) ? "" : m75945x2fec83074;
                r45.xs2 Q14 = nk7.Q("NearbyLiveTab");
                if (Q14 == null || (str16 = Q14.m75945x2fec8307(16)) == null) {
                    str16 = "";
                }
                java.lang.Integer valueOf3 = java.lang.Integer.valueOf(m75939xb282bd084);
                valueOf3.intValue();
                if (!(m75939xb282bd084 == 1)) {
                    valueOf3 = null;
                }
                if (valueOf3 != null) {
                    valueOf3.intValue();
                    if (m75942xfb822ef22 != 0) {
                        bundle5.putLong("nearby_live_target_object_id_params_key", m75942xfb822ef22);
                        bundle5.putInt("nearby_live_target_tab_id_params_key", m75939xb282bd083);
                        bundle5.putString("nearby_live_target_nonce_id_params_key", str20);
                        bundle5.putString("nearby_live_target_user_name_params_key", str21);
                        bundle5.putString("nearby_live_target_nick_name_params_key", str22);
                        bundle5.putString("nearby_live_target_cover_url_params_key", str16);
                        dp2.e eVar2 = dp2.e.f323725a;
                        j27 = m75942xfb822ef22;
                        eVar2.c(activity instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activity : null, j27, str20, false, getF203048s(), null);
                        str9 = " commentScene=";
                        cls2 = zy2.rb.class;
                        i48 = m75939xb282bd084;
                        str12 = "nearby_live_target_square_page_params_key";
                        i39 = m75939xb282bd083;
                        str11 = " enterLiveAction:";
                        str14 = " activity:";
                        str10 = " targetObjectId:";
                        str13 = "NearbyLiveSquareFragment";
                        bundle2 = bundle5;
                        dp2.e.d(eVar2, activity, m75939xb282bd083, m75942xfb822ef22, str20, str21, str22, 0L, null, 192, null);
                        z19 = false;
                    } else {
                        j27 = m75942xfb822ef22;
                        str9 = " commentScene=";
                        cls2 = zy2.rb.class;
                        i48 = m75939xb282bd084;
                        i39 = m75939xb282bd083;
                        str10 = " targetObjectId:";
                        str11 = " enterLiveAction:";
                        str12 = "nearby_live_target_square_page_params_key";
                        str13 = "NearbyLiveSquareFragment";
                        str14 = " activity:";
                        bundle2 = bundle5;
                        z19 = true;
                    }
                    i47 = i48;
                    j28 = j27;
                    i28 = i47;
                    i29 = i39;
                    j19 = j28;
                } else {
                    str9 = " commentScene=";
                    cls2 = zy2.rb.class;
                    i38 = m75939xb282bd084;
                    str10 = " targetObjectId:";
                    str11 = " enterLiveAction:";
                    str12 = "nearby_live_target_square_page_params_key";
                    str13 = "NearbyLiveSquareFragment";
                    str14 = " activity:";
                    bundle2 = bundle5;
                    i37 = m75939xb282bd083;
                    j28 = m75942xfb822ef22;
                }
            }
            i39 = i37;
            i47 = i38;
            z19 = true;
            i28 = i47;
            i29 = i39;
            j19 = j28;
        } else {
            str9 = " commentScene=";
            cls2 = zy2.rb.class;
            str10 = " targetObjectId:";
            str11 = " enterLiveAction:";
            str12 = "nearby_live_target_square_page_params_key";
            str13 = "NearbyLiveSquareFragment";
            str14 = " activity:";
            bundle2 = bundle5;
            j19 = 0;
            i28 = 0;
            i29 = 0;
            z19 = true;
        }
        if (z19) {
            pf5.z zVar2 = pf5.z.f435481a;
            if (!(activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h80) ((zy2.rb) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).c(cls2))).O6();
        }
        if (i29 == 0) {
            i29 = wo2.n0.f529638a.c(getF203048s());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str13, "prepareNewSquare use last cache targetTabId=" + i29 + str9 + getF203048s());
        }
        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(i29);
        valueOf4.intValue();
        num = i29 != 0 ? valueOf4 : null;
        if (num != null) {
            num.intValue();
            r45.dd2 dd2Var2 = new r45.dd2();
            dd2Var2.set(0, java.lang.Integer.valueOf(i29));
            bundle2.putByteArray(str12, dd2Var2.mo14344x5f01b1f6());
        }
        if (m7436x8619eaa0() == null) {
            str15 = str13;
            mo7562xe26dab14(bundle2);
        } else {
            str15 = str13;
            android.os.Bundle m7436x8619eaa03 = m7436x8619eaa0();
            if (m7436x8619eaa03 != null) {
                m7436x8619eaa03.putAll(bundle2);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str15, "prepareNearbySquare newSquareEnable:false, targetTabId=" + i29 + str11 + i28 + str10 + j19 + str14 + activity);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    public java.util.Set l0() {
        return kz5.z.D0(new java.lang.Class[]{com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class, op2.a.class, qp2.y.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14513x218d4a07.class});
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    public void o0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd P6;
        super.o0();
        if (mo7430x19263085() == null || (P6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14513x218d4a07) j0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14513x218d4a07.class)).P6()) == null) {
            return;
        }
        P6.o0();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        super.mo7504xac79a11b();
        ig2.m.f372926a.g();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onPause */
    public void mo7512xb01dfb57() {
        super.mo7512xb01dfb57();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveSquareFragment", "onPause()");
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = mo7430x19263085();
        if (mo7430x19263085 != null) {
            pf5.z zVar = pf5.z.f435481a;
            if (!(mo7430x19263085 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.C14496x6858d351) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) mo7430x19263085).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.C14496x6858d351.class)).O6() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14512xbce0ab98) {
                rq2.x.f480447a.d(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14513x218d4a07) j0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14513x218d4a07.class)).P6());
            }
        }
        ip2.a.f375153i = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        super.mo7517x57429eec();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveSquareFragment", "onResume()");
        rq2.x xVar = rq2.x.f480447a;
        rq2.x.f480450d = c01.id.c();
        ip2.a.f375153i = false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    public void p0() {
        super.p0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd P6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14513x218d4a07) j0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14513x218d4a07.class)).P6();
        if (P6 != null) {
            P6.p0();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656
    /* renamed from: r0 */
    public int getF203048s() {
        return 94;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301
    /* renamed from: u0 */
    public java.lang.String getF203049t() {
        return "1001";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301
    public java.lang.String w0() {
        return "";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301
    public int x0() {
        return 3;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301
    public void z0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd P6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14513x218d4a07) j0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14513x218d4a07.class)).P6();
        if (P6 != null) {
            P6.z0();
        }
    }
}
