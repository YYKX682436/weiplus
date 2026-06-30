package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class td implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14895xe517e819 f205766d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f205767e;

    public td(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14895xe517e819 c14895xe517e819, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf) {
        this.f205766d = c14895xe517e819;
        this.f205767e = c22848x6ddd90cf;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        java.lang.String str;
        boolean z17;
        boolean z18;
        jz5.f0 f0Var;
        java.lang.String m75945x2fec8307;
        java.lang.String str2;
        boolean z19;
        boolean z27;
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = holder.f374658i;
        so2.q2 feed = obj instanceof so2.q2 ? (so2.q2) obj : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14895xe517e819 c14895xe517e819 = this.f205766d;
        android.app.Activity context = c14895xe517e819.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f205767e;
        if (nyVar != null) {
            r45.qt2 V6 = nyVar.V6();
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17;
            long m27 = feed != null ? feed.m2() : 0L;
            java.lang.String w17 = feed != null ? feed.w() : null;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 b07 = c22848x6ddd90cf.b0();
            java.lang.String jSONObject = new org.json.JSONObject().put("page_type", "profile_live_replay").toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.wj(o3Var, V6, m27, w17, b07, 0, jSONObject, 0L, null, 208, null);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 b08 = c22848x6ddd90cf.b0();
        java.util.ArrayList dataList = c14895xe517e819.O6().m56388xcaeb60d0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        if ((feed == null || feed.s2()) ? false : true) {
            android.content.Intent intent = new android.content.Intent();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1506xbe953013.C14232xa386119c O6 = c14895xe517e819.O6();
            O6.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.RandomAccess m56387xe6796cde = O6.m56387xe6796cde();
            if (!(m56387xe6796cde instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa)) {
                m56387xe6796cde = null;
            }
            if (m56387xe6796cde != null) {
                java.util.Iterator it6 = O6.m56387xe6796cde().iterator();
                int i18 = 0;
                while (it6.hasNext()) {
                    java.lang.Object next = it6.next();
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    so2.j5 j5Var = (so2.j5) next;
                    if (j5Var instanceof so2.q2) {
                        so2.q2 q2Var = (so2.q2) j5Var;
                        it = it6;
                        arrayList = dataList;
                        q2Var.getFeedObject().m59358xc5f6eaef(0);
                        if (q2Var.o2() == 4) {
                            arrayList2.add(j5Var);
                        }
                        arrayList3.add(j5Var);
                    } else {
                        arrayList = dataList;
                        it = it6;
                    }
                    it6 = it;
                    i18 = i19;
                    dataList = arrayList;
                }
            }
            java.util.ArrayList arrayList4 = dataList;
            int indexOf = arrayList2.indexOf(feed);
            O6.getStore().b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9(arrayList3, O6.m56357x44e5026c(), indexOf == -1 ? 0 : indexOf, null, null, 16, null), intent);
            intent.putExtra("finder_username", c14895xe517e819.m58717x6c03c64c());
            intent.putExtra("KEY_FINDER_SELF_FLAG", c14895xe517e819.m58720x17be6422());
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = c14895xe517e819.m158358x197d1fc6();
            if (m158358x197d1fc6 == null || (mo7430x19263085 = m158358x197d1fc6.mo7430x19263085()) == null) {
                str2 = null;
            } else {
                pf5.z zVar = pf5.z.f435481a;
                if (!(mo7430x19263085 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                str2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) mo7430x19263085).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216919r;
            }
            if (android.text.TextUtils.isEmpty(str2)) {
                ((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).getClass();
                intent.putExtra("key_click_tab_context_id", rq2.x.f480452f);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1, c14895xe517e819.m158354x19263085(), intent, 0L, null, 0, 0, false, 0, null, 508, null);
            if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
                z19 = true;
            } else {
                java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                z19 = false;
            }
            if (z19 || z65.c.a()) {
                z27 = true;
            } else {
                kb2.b bVar = kb2.b.f387758a;
                z27 = false;
            }
            if (z27) {
                db5.t7.m(c14895xe517e819.m80379x76847179(), "Debug,error id" + feed.m2());
            }
            intent.putExtra("KEY_FINDER_FEEDID", feed.m2());
            intent.putExtra("KEY_FINDER_FEED_DUP_FLAG", feed.w());
            java.lang.String stringExtra = intent.getStringExtra("key_extra_info");
            java.lang.String str4 = stringExtra != null ? stringExtra : "";
            if (!(str4.length() > 0)) {
                str4 = "{}";
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(str4);
            jSONObject2.put("enter_page_type", "profile_live_replay");
            java.lang.String jSONObject3 = jSONObject2.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
            intent.putExtra("key_extra_info", r26.i0.t(jSONObject3, ",", ";", false));
            android.view.View itemView = holder.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
            intent.putExtra("KEY_REQUEST_BACK_DATA", wa2.x.e(intent, itemView, 0L, false, false, wa2.u.f525714d.Ri(b08, feed.m2(), arrayList4, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.rd(c14895xe517e819)), 14, null));
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).jk(c14895xe517e819.m158354x19263085(), intent);
            return;
        }
        java.lang.String str5 = c14895xe517e819.f204981i;
        if (feed == null || !feed.t2()) {
            str = "toString(...)";
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click pos:");
            sb6.append(i17);
            sb6.append(" feed is null:");
            sb6.append(feed == null);
            sb6.append(",replay status:");
            sb6.append(feed != null ? java.lang.Integer.valueOf(feed.p2()) : null);
            sb6.append('!');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str5, sb6.toString());
            if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
                z17 = true;
            } else {
                java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                z17 = false;
            }
            if (z17 || z65.c.a()) {
                z18 = true;
            } else {
                kb2.b bVar2 = kb2.b.f387758a;
                z18 = false;
            }
            if (z18) {
                android.app.Activity m80379x76847179 = c14895xe517e819.m80379x76847179();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("Debug,error replay_status:");
                sb7.append(feed != null ? java.lang.Integer.valueOf(feed.p2()) : null);
                db5.t7.m(m80379x76847179, sb7.toString());
            }
        } else {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.util.Iterator it7 = dataList.iterator();
            while (it7.hasNext()) {
                java.lang.Object next2 = it7.next();
                if (next2 instanceof so2.q2) {
                    arrayList5.add(next2);
                }
            }
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.util.Iterator it8 = arrayList5.iterator();
            while (it8.hasNext()) {
                java.lang.Object next3 = it8.next();
                if (((so2.q2) next3).t2()) {
                    arrayList6.add(next3);
                }
            }
            android.view.View itemView2 = holder.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView2, "itemView");
            int indexOf2 = arrayList6.indexOf(feed);
            cm2.a aVar = cm2.a.f124861a;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = feed.f492082n;
            if (indexOf2 != i17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str5, "replay_step1:jumpToReplayLive feed:" + aVar.x(c19792x256d2725, i17) + ", pos from:" + i17 + " to " + indexOf2);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str5, "replay_step1:jumpToReplayLive feed:" + aVar.x(c19792x256d2725, i17));
            }
            if (indexOf2 == -1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str5, "replay_step1-1:change newPos to 0!");
                indexOf2 = 0;
            }
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("KEY_PARAMS_KEY_VALUE", so2.q2.f492079p.a(arrayList6, c14895xe517e819.O6().m56357x44e5026c(), c14895xe517e819.f204988s, indexOf2).mo14344x5f01b1f6());
            intent2.putExtra("KEY_PARAMS_SOURCE_TYPE", 2);
            java.lang.String m58717x6c03c64c = c14895xe517e819.m58717x6c03c64c();
            if (m58717x6c03c64c == null) {
                m58717x6c03c64c = "";
            }
            intent2.putExtra("finder_username", m58717x6c03c64c);
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            vd2.t3.f517454a.b(intent2, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, 0);
            long m28 = feed.m2();
            android.widget.ImageView imageView = (android.widget.ImageView) itemView2.findViewById(com.p314xaae8f345.mm.R.id.lyh);
            boolean Ni = ((c61.d8) ((zy2.c8) i95.n0.c(zy2.c8.class))).Ni();
            if (imageView == null || !Ni) {
                str = "toString(...)";
                i95.m c18 = i95.n0.c(c61.zb.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                c61.zb.U7((c61.zb) c18, c14895xe517e819.m158354x19263085(), intent2, false, 4, null);
            } else {
                pg2.j0 j0Var = (pg2.j0) ((c50.s0) i95.n0.c(c50.s0.class));
                if (j0Var.wh()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject = feed.getFeedObject();
                    android.content.Context context2 = itemView2.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2;
                    android.graphics.Rect rect = new android.graphics.Rect();
                    jz5.l[] lVarArr = new jz5.l[4];
                    str = "toString(...)";
                    lVarArr[0] = new jz5.l("key_enter_type", 1);
                    r45.nw1 m59258xd0557130 = feedObject.m59258xd0557130();
                    lVarArr[1] = new jz5.l("liveUrl", m59258xd0557130 != null ? m59258xd0557130.m75945x2fec8307(3) : null);
                    lVarArr[2] = new jz5.l("liveSdkChannelParams", j0Var.Bi(feedObject.m59258xd0557130()));
                    r45.nw1 m59258xd05571302 = feedObject.m59258xd0557130();
                    java.lang.String str7 = (m59258xd05571302 == null || (m75945x2fec8307 = m59258xd05571302.m75945x2fec8307(3)) == null) ? "" : m75945x2fec8307;
                    java.lang.String m59273x80025a04 = feedObject.m59273x80025a04();
                    r45.nw1 m59258xd05571303 = feedObject.m59258xd0557130();
                    lVarArr[3] = new jz5.l("playerInfoData", j0Var.Di(str7, m59273x80025a04, m59258xd05571303 != null ? m59258xd05571303.m75942xfb822ef2(0) : 0L, m28, feedObject.m59258xd0557130()));
                    j0Var.Ni(activityC0065xcd7aa112, m28, imageView, rect, kz5.c1.i(lVarArr), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.od(intent2, m28, c14895xe517e819));
                } else {
                    str = "toString(...)";
                    i95.m c19 = i95.n0.c(zy2.c8.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                    zy2.c8 c8Var = (zy2.c8) c19;
                    ez2.a aVar2 = ez2.a.f339391g;
                    android.view.ViewParent parent = imageView.getParent();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    ez2.c s17 = zy2.c8.s1(c8Var, aVar2, m28, (android.view.ViewGroup) parent, imageView, "", !((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).hk(c19792x256d2725.m76794xd0557130()), c19792x256d2725.m76794xd0557130(), null, 128, null);
                    zy2.c8 c8Var2 = (zy2.c8) i95.n0.c(zy2.c8.class);
                    android.content.Context context3 = itemView2.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
                    ez2.b Ri = ((c61.d8) c8Var2).Ri(context3, s17);
                    if (Ri != null) {
                        ((ig2.f) Ri).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.pd(intent2, m28, c14895xe517e819));
                        f0Var = jz5.f0.f384359a;
                    } else {
                        f0Var = null;
                    }
                    if (f0Var == null) {
                        i95.m c27 = i95.n0.c(c61.zb.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c27, "getService(...)");
                        c61.zb.U7((c61.zb) c27, c14895xe517e819.m158354x19263085(), intent2, false, 4, null);
                    }
                }
            }
        }
        if (feed != null) {
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            jSONObject4.put("object_id", pm0.v.u(feed.m2()));
            jSONObject4.put("page_type", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589);
            if (feed.q2()) {
                jSONObject4.put("object_type", 1);
            } else {
                jSONObject4.put("object_type", 2);
            }
            zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
            ml2.o3[] o3VarArr = ml2.o3.f409306d;
            java.lang.String jSONObject5 = jSONObject4.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject5, str);
            ((ml2.j0) zbVar).Wj("watch_live_record", jSONObject5);
        }
    }
}
