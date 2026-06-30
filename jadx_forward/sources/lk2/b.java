package lk2;

/* loaded from: classes3.dex */
public final class b {
    public b(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(gk2.e eVar, int i17, lk2.c cVar) {
        int i18;
        java.lang.String str;
        int i19;
        java.lang.String str2;
        int i27;
        java.lang.Object obj;
        km2.q qVar;
        java.lang.String str3;
        int i28;
        java.lang.Object obj2;
        java.lang.String str4;
        java.lang.Object obj3;
        java.lang.String str5;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eVar, "<this>");
        ae2.in inVar = ae2.in.f85221a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.Y0).mo141623x754a37bb()).r()).intValue() != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveMicHeartBeat", "doRefresh heart switch != 1");
            return;
        }
        if (((mm2.c1) eVar.a(mm2.c1.class)).T) {
            i18 = 3;
        } else if (((mm2.c1) eVar.a(mm2.c1.class)).N7()) {
            i18 = 1;
        } else {
            i18 = ((mm2.n0) eVar.a(mm2.n0.class)).f410806r ? 16 : 2;
        }
        if (((mm2.o4) eVar.a(mm2.o4.class)).k7()) {
            java.util.List list = ((mm2.o4) eVar.a(mm2.o4.class)).f410868z;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-linkMicUserInfoList>(...)");
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj3 = null;
                    break;
                } else {
                    obj3 = it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((km2.q) obj3).f390703a, ((mm2.c1) eVar.a(mm2.c1.class)).m8())) {
                        break;
                    }
                }
            }
            km2.q qVar2 = (km2.q) obj3;
            if (qVar2 == null || (str5 = qVar2.f390708f) == null) {
                str5 = "";
            }
            str = str5;
            i19 = 0;
        } else {
            str = "";
            i19 = 2;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderLiveMicHeartBeatTask doRefresh isNeedClose: ");
        sb6.append(cVar != null ? java.lang.Boolean.FALSE : null);
        sb6.append(" scene: ");
        sb6.append(i18);
        sb6.append(" micType: ");
        sb6.append(i19);
        sb6.append(" sessionId: ");
        sb6.append(str);
        sb6.append(" reportScene: ");
        sb6.append(i17);
        sb6.append(" lastCloseReportFail: ");
        sb6.append(lk2.c.f400544f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicHeartBeat", sb6.toString());
        r45.fl4 fl4Var = new r45.fl4();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        java.util.LinkedList linkedList4 = new java.util.LinkedList();
        mm2.c1 c1Var = (mm2.c1) dk2.ef.f314905a.i(mm2.c1.class);
        if (c1Var != null) {
            km2.q a76 = ((mm2.o4) eVar.a(mm2.o4.class)).a7();
            fl4Var.set(0, a76.f390703a);
            fl4Var.set(1, a76.f390708f);
            fl4Var.set(4, java.lang.Integer.valueOf(a76.f390725w));
            if (c1Var.N7() && ((mm2.o4) eVar.a(mm2.o4.class)).k7()) {
                java.util.HashMap hashMap = new java.util.HashMap();
                java.util.ArrayList arrayList = zn0.x.f555947a.f555948a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrayList, "getRemoteUserConfigList(...)");
                synchronized (arrayList) {
                    java.util.Iterator it6 = arrayList.iterator();
                    while (it6.hasNext()) {
                        zn0.v vVar = (zn0.v) it6.next();
                        java.lang.String str6 = vVar.f555939d;
                        java.util.Iterator it7 = it6;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str6, "getUserName(...)");
                        hashMap.put(str6, vVar);
                        java.util.List Z6 = ((mm2.o4) eVar.a(mm2.o4.class)).Z6();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Z6, "<get-allLinkMicUserList>(...)");
                        synchronized (Z6) {
                            java.util.Iterator it8 = Z6.iterator();
                            while (true) {
                                if (!it8.hasNext()) {
                                    i28 = i19;
                                    obj2 = null;
                                    break;
                                }
                                obj2 = it8.next();
                                java.util.Iterator it9 = it8;
                                i28 = i19;
                                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((km2.q) obj2).f390703a, vVar.f555939d)) {
                                    break;
                                }
                                it8 = it9;
                                i19 = i28;
                            }
                        }
                        if (obj2 == null) {
                            r45.fl4 fl4Var2 = new r45.fl4();
                            fl4Var2.set(0, vVar.f555939d);
                            fl4Var2.set(1, "");
                            fl4Var2.set(2, java.lang.Boolean.valueOf(vVar.f555941f));
                            fl4Var2.set(3, java.lang.Boolean.valueOf(vVar.f555942g));
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                            str4 = str;
                            sb7.append("add to unrecognizedAudienceMicInfoList, sdk_user_id: ");
                            sb7.append(vVar.f555939d);
                            sb7.append(" roomId: ");
                            sb7.append(vVar.f555944i);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicHeartBeat", sb7.toString());
                            linkedList4.add(fl4Var2);
                        } else {
                            str4 = str;
                        }
                        it6 = it7;
                        str = str4;
                        i19 = i28;
                    }
                    str2 = str;
                    i27 = i19;
                }
                java.util.List list2 = ((mm2.o4) eVar.a(mm2.o4.class)).f410857s;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list2, "<get-anchorPkMicUserList>(...)");
                synchronized (list2) {
                    java.util.Iterator it10 = list2.iterator();
                    while (it10.hasNext()) {
                        km2.q qVar3 = (km2.q) it10.next();
                        r45.fl4 fl4Var3 = new r45.fl4();
                        fl4Var3.set(0, qVar3.f390703a);
                        fl4Var3.set(1, qVar3.f390708f);
                        zn0.v vVar2 = (zn0.v) hashMap.get(qVar3.f390703a);
                        fl4Var3.set(2, java.lang.Boolean.valueOf(vVar2 != null ? vVar2.f555941f : false));
                        zn0.v vVar3 = (zn0.v) hashMap.get(qVar3.f390703a);
                        fl4Var3.set(3, java.lang.Boolean.valueOf(vVar3 != null ? vVar3.f555942g : false));
                        linkedList.add(fl4Var3);
                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                        java.util.Iterator it11 = it10;
                        sb8.append("add from anchorPkMicUserList , sdk_user_id: ");
                        sb8.append(qVar3.f390703a);
                        sb8.append(" nick: ");
                        sb8.append(qVar3.f390706d);
                        sb8.append("  roomId: ");
                        zn0.v vVar4 = (zn0.v) hashMap.get(qVar3.f390703a);
                        sb8.append(vVar4 != null ? vVar4.f555944i : null);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicHeartBeat", sb8.toString());
                        r45.ea4 ea4Var = new r45.ea4();
                        ea4Var.set(0, fl4Var3);
                        linkedList3.add(ea4Var);
                        it10 = it11;
                    }
                }
                java.util.List list3 = ((mm2.o4) eVar.a(mm2.o4.class)).f410860v;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list3, "<get-audienceLinkMicUserList>(...)");
                synchronized (list3) {
                    java.util.Iterator it12 = list3.iterator();
                    while (it12.hasNext()) {
                        km2.q qVar4 = (km2.q) it12.next();
                        r45.fl4 fl4Var4 = new r45.fl4();
                        fl4Var4.set(0, qVar4.f390703a);
                        fl4Var4.set(1, qVar4.f390708f);
                        zn0.v vVar5 = (zn0.v) hashMap.get(qVar4.f390703a);
                        fl4Var4.set(2, java.lang.Boolean.valueOf(vVar5 != null ? vVar5.f555941f : false));
                        zn0.v vVar6 = (zn0.v) hashMap.get(qVar4.f390703a);
                        fl4Var4.set(3, java.lang.Boolean.valueOf(vVar6 != null ? vVar6.f555942g : false));
                        fl4Var4.set(4, java.lang.Integer.valueOf(qVar4.f390725w));
                        linkedList.add(fl4Var4);
                        java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                        java.util.Iterator it13 = it12;
                        sb9.append("add from audienceLinkMicUserList , sdk_user_id: ");
                        sb9.append(qVar4.f390703a);
                        sb9.append(" seat_id: ");
                        sb9.append(qVar4.f390725w);
                        sb9.append(" nick: ");
                        sb9.append(qVar4.f390706d);
                        sb9.append(" isOtherRoomUser: ");
                        sb9.append(qVar4.f390722t);
                        sb9.append(" roomId: ");
                        zn0.v vVar7 = (zn0.v) hashMap.get(qVar4.f390703a);
                        sb9.append(vVar7 != null ? vVar7.f555944i : null);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicHeartBeat", sb9.toString());
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(qVar4.f390722t, java.lang.Boolean.FALSE)) {
                            linkedList2.add(fl4Var4);
                        } else {
                            java.util.Iterator it14 = linkedList3.iterator();
                            while (true) {
                                if (!it14.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it14.next();
                                r45.ea4 ea4Var2 = (r45.ea4) obj;
                                java.util.Iterator it15 = it14;
                                zn0.v vVar8 = (zn0.v) hashMap.get(qVar4.f390703a);
                                if (vVar8 != null) {
                                    str3 = vVar8.f555944i;
                                    qVar = qVar4;
                                } else {
                                    qVar = qVar4;
                                    str3 = null;
                                }
                                r45.fl4 fl4Var5 = (r45.fl4) ea4Var2.m75936x14adae67(0);
                                zn0.v vVar9 = (zn0.v) hashMap.get(fl4Var5 != null ? fl4Var5.m75945x2fec8307(0) : null);
                                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, vVar9 != null ? vVar9.f555944i : null)) {
                                    break;
                                }
                                it14 = it15;
                                qVar4 = qVar;
                            }
                            r45.ea4 ea4Var3 = (r45.ea4) obj;
                            if (ea4Var3 != null) {
                                ea4Var3.m75941xfb821914(1).add(fl4Var4);
                            }
                        }
                        it12 = it13;
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicHeartBeat", "getActivateMicData micInfoList: " + linkedList.size() + " selfLiveMicInfoList: " + linkedList2.size() + " otherLiveMicInfoList: " + linkedList3.size() + " unrecognizedAudienceMicInfoList: " + linkedList4.size());
                new ek2.e(((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.e1) eVar.a(mm2.e1.class)).f410516m, ((mm2.e1) eVar.a(mm2.e1.class)).f410525v, ((mm2.e1) eVar.a(mm2.e1.class)).f410518o, i18, str2, i27, new ek2.c(fl4Var, linkedList, linkedList2, linkedList3, linkedList4), i17, new lk2.a(i17, cVar)).l();
            }
        }
        str2 = str;
        i27 = i19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicHeartBeat", "getActivateMicData micInfoList: " + linkedList.size() + " selfLiveMicInfoList: " + linkedList2.size() + " otherLiveMicInfoList: " + linkedList3.size() + " unrecognizedAudienceMicInfoList: " + linkedList4.size());
        new ek2.e(((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.e1) eVar.a(mm2.e1.class)).f410516m, ((mm2.e1) eVar.a(mm2.e1.class)).f410525v, ((mm2.e1) eVar.a(mm2.e1.class)).f410518o, i18, str2, i27, new ek2.c(fl4Var, linkedList, linkedList2, linkedList3, linkedList4), i17, new lk2.a(i17, cVar)).l();
    }
}
