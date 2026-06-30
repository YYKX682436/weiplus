package zn0;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f555884a;

    /* renamed from: b, reason: collision with root package name */
    public final zn0.a0 f555885b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f555886c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f555887d;

    public i(int i17, zn0.a0 trtcManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(trtcManager, "trtcManager");
        this.f555884a = i17;
        this.f555885b = trtcManager;
    }

    public final void a(java.util.List list, java.util.List list2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            zn0.v vVar = (zn0.v) it.next();
            int i17 = vVar.f555946n;
            if (i17 <= 0 || i17 > 5 || i17 == 1 || i17 == 2) {
                arrayList.add(vVar);
            } else if (hashMap.containsKey(java.lang.Integer.valueOf(i17))) {
                arrayList.add(vVar);
            } else {
                hashMap.put(java.lang.Integer.valueOf(vVar.f555946n), vVar);
            }
        }
        java.util.Iterator it6 = list2.iterator();
        int i18 = 0;
        while (it6.hasNext()) {
            int intValue = ((java.lang.Number) it6.next()).intValue();
            if (!hashMap.containsKey(java.lang.Integer.valueOf(intValue))) {
                int i19 = i18 + 1;
                zn0.v vVar2 = (zn0.v) kz5.n0.a0(arrayList, i18);
                if (vVar2 != null) {
                    vVar2.f555946n = intValue;
                }
                i18 = i19;
            }
        }
        if (list.size() > 1) {
            kz5.g0.t(list, new zn0.b());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCloudMixture", "adjustCrossRoomPkUserListPos after: " + list);
    }

    public final void b() {
        zn0.y yVar = zn0.x.f555947a;
        java.util.ArrayList<zn0.v> arrayList = yVar.f555948a;
        if (arrayList == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCloudMixture", "micFocusGrabModeFillConfig remoteUserConfigList = null");
            return;
        }
        if (arrayList.size() > 1) {
            kz5.g0.t(arrayList, new zn0.c());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCloudMixture", "adjustRemoteUserListPosValid before: " + arrayList);
        int i17 = yVar.f555949b;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.HashMap hashMap = new java.util.HashMap();
        for (zn0.v vVar : arrayList) {
            int i18 = vVar.f555946n;
            if (i18 <= 0 || i18 > 9 || i18 == i17) {
                arrayList2.add(vVar);
            } else if (hashMap.containsKey(java.lang.Integer.valueOf(i18))) {
                arrayList2.add(vVar);
            } else {
                hashMap.put(java.lang.Integer.valueOf(vVar.f555946n), vVar);
            }
        }
        int i19 = 0;
        for (int i27 = 1; i27 < 10; i27++) {
            if (!hashMap.containsKey(java.lang.Integer.valueOf(i27)) && i27 != i17) {
                int i28 = i19 + 1;
                zn0.v vVar2 = (zn0.v) kz5.n0.a0(arrayList2, i19);
                if (vVar2 != null) {
                    vVar2.f555946n = i27;
                }
                i19 = i28;
            }
        }
        if (arrayList.size() > 1) {
            kz5.g0.t(arrayList, new zn0.d());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCloudMixture", "adjustRemoteUserListPosValid after: " + arrayList);
    }

    public final org.json.JSONObject c(java.lang.String selfRoomId, int i17, int i18, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCTranscodingConfig config, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser mixUser) {
        java.lang.String str;
        int i19;
        float f17;
        float f18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selfRoomId, "selfRoomId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mixUser, "mixUser");
        java.util.ArrayList arrayList = zn0.x.f555947a.f555948a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCloudMixture", "anchorPkFillConfig remoteUserConfigListSize: " + arrayList.size());
        if (arrayList.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCloudMixture", "anchorPkFillConfig: remoteUserConfigList is null or size = 0");
            return null;
        }
        mixUser.f57067xc8d8bf56 = selfRoomId;
        jz5.o h17 = h(arrayList, selfRoomId);
        java.util.List list = (java.util.List) h17.f384374d;
        java.util.List list2 = (java.util.List) h17.f384375e;
        java.util.List list3 = (java.util.List) h17.f384376f;
        int size = list.size();
        int size2 = list2.size();
        int size3 = list3.size();
        zn0.a0 a0Var = this.f555885b;
        a0Var.getClass();
        java.lang.String str2 = "410";
        if (size3 <= 1) {
            if (size == 0) {
                if (size2 != 0) {
                    if (size2 == 1) {
                        str = "409";
                    } else if (size2 == 2) {
                        str2 = "2072";
                        str = str2;
                    }
                }
                str = "408";
            } else if (size != 1) {
                if (size == 2) {
                    if (size2 == 0) {
                        str2 = "2075";
                    } else if (size2 == 1) {
                        str2 = "2076";
                    } else if (size2 == 2) {
                        str2 = "2077";
                    }
                    str = str2;
                }
                str = "408";
            } else {
                if (size2 == 0) {
                    str2 = "2073";
                } else if (size2 != 1) {
                    if (size2 == 2) {
                        str2 = "2074";
                    }
                    str = "408";
                }
                str = str2;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TRTCRemoteUserManager", "chooseLinkMicBackground: ".concat(str));
        } else {
            str = size3 != 1 ? size3 != 2 ? "410" : "409" : "408";
        }
        config.f57148x4d0b70cd = str;
        config.f57158x9f1bbe0b = i17;
        int size4 = arrayList.size();
        if (size4 != 0) {
            if (size4 != 1) {
                f17 = i17;
                f18 = 1.0843374f;
            } else {
                f17 = i17;
                f18 = 1.2244898f;
            }
            i19 = (int) (f17 / f18);
        } else {
            i19 = i18;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCloudMixture", "getMicAnchorPkLayoutHeight  size = " + size4 + " videoWidth = " + i17 + " oriVideoHeight = " + i18 + " newHeight = " + i19);
        int i27 = i19 * 2;
        config.f57156x2a8d0982 = i19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCloudMixture", "anchorPkFillConfig: selfRoomId: " + selfRoomId + " videoWidth: " + i17 + " videoHeight: " + i19 + " otherRoomAnchorSize: " + size3 + " otherRoomVisitorUserList: " + list2 + " otherRoomAnchorUserList: " + list3);
        if (size3 == 0) {
            return a0Var.u(i17, i18, config, mixUser);
        }
        int i28 = 0;
        if (size3 == 1) {
            this.f555885b.e(list, mixUser, config, selfRoomId, new android.graphics.Point(0, 0), i17, i27);
            zn0.v vVar = (zn0.v) list3.get(0);
            java.lang.String str3 = vVar.f555944i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "getRoomId(...)");
            com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser g17 = g(str3, vVar);
            config.f57150xbef7910c.add(g17);
            this.f555885b.e(list2, g17, config, vVar.f555944i, new android.graphics.Point(i17 / 2, 0), i17, i27);
        } else if (size3 == 2) {
            mixUser.f297232x = 0;
            mixUser.f297233y = 0;
            int i29 = (int) (i17 / 2.0f);
            mixUser.f57071x6be2dc6 = i29;
            mixUser.f57062xb7389127 = i19;
            mixUser.f57072xd4bdd2f4 = 0;
            for (java.lang.Object obj : list3) {
                int i37 = i28 + 1;
                if (i28 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                zn0.v vVar2 = (zn0.v) obj;
                java.lang.String str4 = vVar2.f555944i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "getRoomId(...)");
                com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser g18 = g(str4, vVar2);
                g18.f297232x = i29;
                int i38 = (int) (i19 / 2.0f);
                g18.f297233y = i28 * i38;
                g18.f57071x6be2dc6 = i29;
                g18.f57062xb7389127 = i38;
                config.f57150xbef7910c.add(g18);
                i28 = i37;
            }
        } else if (size3 == 3) {
            mixUser.f297232x = 0;
            mixUser.f297233y = 0;
            int i39 = (int) (i17 / 2.0f);
            mixUser.f57071x6be2dc6 = i39;
            int i47 = (int) (i19 / 2.0f);
            mixUser.f57062xb7389127 = i47;
            mixUser.f57072xd4bdd2f4 = 0;
            for (java.lang.Object obj2 : list3) {
                int i48 = i28 + 1;
                if (i28 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                zn0.v vVar3 = (zn0.v) obj2;
                java.lang.String str5 = vVar3.f555944i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str5, "getRoomId(...)");
                com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser g19 = g(str5, vVar3);
                g19.f297232x = (i48 % 2) * i39;
                g19.f297233y = (i48 / 2) * i47;
                g19.f57071x6be2dc6 = i39;
                g19.f57062xb7389127 = i47;
                config.f57150xbef7910c.add(g19);
                i28 = i48;
            }
        }
        java.util.List mixUsers = config.f57150xbef7910c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mixUsers, "mixUsers");
        org.json.JSONObject n17 = n(selfRoomId, config, mixUsers);
        e(config, list3);
        f(config, list3);
        return n17;
    }

    public final java.lang.String d(int i17, int i18) {
        return java.lang.String.valueOf(i17 / i18);
    }

    public final void e(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCTranscodingConfig config, java.util.List otherRoomAnchorUserList) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(otherRoomAnchorUserList, "otherRoomAnchorUserList");
        java.util.ArrayList<com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser> mixUsers = config.f57150xbef7910c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mixUsers, "mixUsers");
        for (com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser tRTCMixUser : mixUsers) {
            java.util.Iterator it = otherRoomAnchorUserList.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((zn0.v) obj).f555939d, tRTCMixUser.f57070xce2b2e46)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (obj != null) {
                fn0.g gVar = fn0.g.f345728a;
                java.lang.String userId = tRTCMixUser.f57070xce2b2e46;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(userId, "userId");
                if (gVar.d(userId)) {
                    tRTCMixUser.f297232x = 0;
                    tRTCMixUser.f297233y = 0;
                    tRTCMixUser.f57071x6be2dc6 = 0;
                    tRTCMixUser.f57062xb7389127 = 0;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ad, code lost:
    
        if (r2 != true) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCTranscodingConfig r9, java.util.List r10) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zn0.i.f(com.tencent.trtc.TRTCCloudDef$TRTCTranscodingConfig, java.util.List):void");
    }

    public final com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser g(java.lang.String selfRoomId, zn0.v userConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selfRoomId, "selfRoomId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userConfig, "userConfig");
        com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser tRTCMixUser = new com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser();
        userConfig.f555944i = selfRoomId;
        tRTCMixUser.f57067xc8d8bf56 = selfRoomId;
        java.lang.String str = userConfig.f555939d;
        tRTCMixUser.f57070xce2b2e46 = str;
        tRTCMixUser.f57069xb8c992da = userConfig.f555940e;
        tRTCMixUser.f57065x968497be = true;
        zn0.g0 i17 = this.f555885b.i(str, 0);
        if (i17 != null) {
            tRTCMixUser.f57065x968497be = i17.f555881c;
        }
        return tRTCMixUser;
    }

    public final jz5.o h(java.util.List remoteUserConfigList, java.lang.String selfRoomId) {
        java.util.List list;
        java.lang.Object obj;
        kn0.q qVar;
        java.util.List list2;
        java.lang.Object obj2;
        java.util.List list3;
        java.lang.Object obj3;
        java.util.List list4;
        java.lang.Object obj4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(remoteUserConfigList, "remoteUserConfigList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selfRoomId, "selfRoomId");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        java.util.Iterator it = remoteUserConfigList.iterator();
        while (it.hasNext()) {
            zn0.v vVar = (zn0.v) it.next();
            fn0.g gVar = fn0.g.f345728a;
            java.lang.String str = vVar.f555939d;
            kn0.q qVar2 = null;
            if (fn0.g.f345729b != null) {
                if (str == null) {
                    str = "";
                }
                mm2.o4 o4Var = (mm2.o4) dk2.ef.f314905a.i(mm2.o4.class);
                if (o4Var != null && (list4 = o4Var.f410857s) != null) {
                    synchronized (list4) {
                        java.util.Iterator it6 = list4.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                obj4 = null;
                                break;
                            }
                            obj4 = it6.next();
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((km2.q) obj4).f390703a, str)) {
                                break;
                            }
                        }
                    }
                    km2.q qVar3 = (km2.q) obj4;
                    if (qVar3 != null) {
                        qVar = new kn0.q(str, java.lang.String.valueOf(qVar3.f390711i), true);
                        qVar2 = qVar;
                    }
                }
                mm2.o4 o4Var2 = (mm2.o4) dk2.ef.f314905a.i(mm2.o4.class);
                if (o4Var2 != null && (list3 = o4Var2.f410858t) != null) {
                    synchronized (list3) {
                        java.util.Iterator it7 = list3.iterator();
                        while (true) {
                            if (!it7.hasNext()) {
                                obj3 = null;
                                break;
                            }
                            obj3 = it7.next();
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((km2.q) obj3).f390703a, str)) {
                                break;
                            }
                        }
                    }
                    km2.q qVar4 = (km2.q) obj3;
                    if (qVar4 != null) {
                        qVar = new kn0.q(str, java.lang.String.valueOf(qVar4.f390711i), true);
                        qVar2 = qVar;
                    }
                }
                mm2.o4 o4Var3 = (mm2.o4) dk2.ef.f314905a.i(mm2.o4.class);
                if (o4Var3 != null && (list2 = o4Var3.f410860v) != null) {
                    synchronized (list2) {
                        java.util.Iterator it8 = list2.iterator();
                        while (true) {
                            if (!it8.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it8.next();
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((km2.q) obj2).f390703a, str)) {
                                break;
                            }
                        }
                    }
                    km2.q qVar5 = (km2.q) obj2;
                    if (qVar5 != null) {
                        qVar = new kn0.q(str, java.lang.String.valueOf(qVar5.f390711i), false);
                        qVar2 = qVar;
                    }
                }
                mm2.o4 o4Var4 = (mm2.o4) dk2.ef.f314905a.i(mm2.o4.class);
                if (o4Var4 != null && (list = o4Var4.f410868z) != null) {
                    synchronized (list) {
                        java.util.Iterator it9 = list.iterator();
                        while (true) {
                            if (!it9.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it9.next();
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((km2.q) obj).f390703a, str)) {
                                break;
                            }
                        }
                    }
                    km2.q qVar6 = (km2.q) obj;
                    if (qVar6 != null) {
                        qVar = new kn0.q(str, java.lang.String.valueOf(qVar6.f390711i), qVar6.f390710h);
                        qVar2 = qVar;
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCloudMixture", "updateCloudMixtureParamsForFinder getLiveTRTCRoomInfo = " + qVar2 + ", sdkId: " + vVar.f555939d);
            if (qVar2 != null) {
                java.lang.String str2 = qVar2.f391127b;
                vVar.f555944i = str2;
                vVar.f555945m = qVar2.f391128c;
                if (android.text.TextUtils.equals(str2, selfRoomId)) {
                    linkedList.add(vVar);
                } else if (vVar.f555945m) {
                    linkedList3.add(vVar);
                } else {
                    linkedList2.add(vVar);
                }
            }
        }
        return new jz5.o(linkedList, linkedList2, linkedList3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public final int i() {
        int i17 = this.f555885b.f555849t;
        switch (i17) {
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
            case 10:
                if (i17 != 9 && i17 != 10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveMicCloudMixture", "getDualMicSeiMode,curMicMode: " + i17);
                    return 0;
                }
                java.util.ArrayList arrayList = zn0.x.f555947a.f555948a;
                if (arrayList == null) {
                    return 0;
                }
                if (arrayList.size() <= 0) {
                    return 8;
                }
                if (i17 != 10) {
                    return 0;
                }
                return 1;
            default:
                return 0;
        }
    }

    public final int j(java.lang.String selfRoomId, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser mixUser) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selfRoomId, "selfRoomId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mixUser, "mixUser");
        zn0.v d17 = zn0.x.f555947a.d(mixUser.f57070xce2b2e46);
        int i18 = 0;
        if (d17 != null) {
            if (d17.f555943h <= this.f555884a) {
                java.util.regex.Pattern pattern = pm0.v.f438335a;
                i18 = 1;
            } else {
                java.util.regex.Pattern pattern2 = pm0.v.f438335a;
            }
            i18 = d17.f555945m ? i18 | 4 : i18 & (-5);
        }
        int a17 = this.f555885b.a(d17.f555945m, mixUser, i18);
        java.lang.String str = mixUser.f57067xc8d8bf56;
        if (str == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, selfRoomId)) {
            java.util.regex.Pattern pattern3 = pm0.v.f438335a;
            i17 = a17 & (-9);
        } else {
            java.util.regex.Pattern pattern4 = pm0.v.f438335a;
            i17 = a17 | 8;
        }
        fn0.g gVar = fn0.g.f345728a;
        java.lang.String userId = mixUser.f57070xce2b2e46;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(userId, "userId");
        return gVar.o(userId) ? i17 | 16 : i17 & (-17);
    }

    public final org.json.JSONObject k(java.lang.String selfRoomId, int i17, int i18, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCTranscodingConfig config, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser mixUser, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selfRoomId, "selfRoomId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mixUser, "mixUser");
        zn0.y yVar = zn0.x.f555947a;
        java.util.ArrayList arrayList = yVar.f555948a;
        if (arrayList == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCloudMixture", "micDualModeFillConfig remoteUserConfigList is null");
            return null;
        }
        int size = arrayList.size();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCloudMixture", "micDualModeFillConfig remoteUserConfigListSize: " + size + ",isFocus: " + z17);
        zn0.a0 a0Var = this.f555885b;
        if (size > 0) {
            return z17 ? m(selfRoomId, i17, i18, config, mixUser) : a0Var.l(i17, i18, config, mixUser);
        }
        int h17 = a0Var.h(i17, i18, 1);
        config.f57158x9f1bbe0b = i17;
        int i19 = h17 / 2;
        config.f57156x2a8d0982 = i19;
        config.f57148x4d0b70cd = "320994";
        java.util.LinkedList linkedList = new java.util.LinkedList();
        mixUser.f297232x = 0;
        mixUser.f297233y = 0;
        int i27 = i17 / 2;
        mixUser.f57071x6be2dc6 = i27;
        mixUser.f57062xb7389127 = i19;
        com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser tRTCMixUser = new com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser();
        tRTCMixUser.f57072xd4bdd2f4 = 1;
        tRTCMixUser.f297232x = mixUser.f297232x;
        tRTCMixUser.f297233y = mixUser.f297233y;
        tRTCMixUser.f57071x6be2dc6 = mixUser.f57071x6be2dc6;
        tRTCMixUser.f57062xb7389127 = mixUser.f57062xb7389127;
        tRTCMixUser.f57070xce2b2e46 = this.f555887d;
        linkedList.add(tRTCMixUser);
        com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser tRTCMixUser2 = new com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser();
        tRTCMixUser2.f57072xd4bdd2f4 = 2;
        tRTCMixUser2.f297232x = i27;
        tRTCMixUser2.f297233y = 0;
        tRTCMixUser2.f57071x6be2dc6 = i27;
        tRTCMixUser2.f57062xb7389127 = i19;
        linkedList.add(tRTCMixUser2);
        yVar.f555949b = 1;
        yVar.f555950c = size;
        return n(selfRoomId, config, linkedList);
    }

    public final org.json.JSONObject l(java.lang.String selfRoomId, int i17, int i18, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCTranscodingConfig config, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser mixUser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selfRoomId, "selfRoomId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mixUser, "mixUser");
        java.util.ArrayList arrayList = zn0.x.f555947a.f555948a;
        if (arrayList == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCloudMixture", "micFocusGrabModeFillConfig remoteUserConfigList = null");
            return null;
        }
        int size = arrayList.size();
        b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCloudMixture", "micGrabModeFillConfig videoHeight: " + i18 + " videoWidth: " + i17 + " size: " + size + " remoteUserConfigList: " + arrayList);
        config.f57158x9f1bbe0b = i17;
        float f17 = (float) i17;
        int b17 = a06.d.b(f17 / 1.0866141f);
        config.f57156x2a8d0982 = b17;
        config.f57148x4d0b70cd = "111318";
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int i19 = 0;
        while (i19 < 9) {
            com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser tRTCMixUser = new com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser();
            int i27 = i19 + 1;
            tRTCMixUser.f57072xd4bdd2f4 = i27;
            tRTCMixUser.f297232x = a06.d.b((i19 % 3) * 0.33333334f * f17);
            float f18 = b17;
            tRTCMixUser.f297233y = a06.d.b((i19 / 3) * 0.33333334f * f18);
            tRTCMixUser.f57071x6be2dc6 = a06.d.b(f17 * 0.33333334f);
            tRTCMixUser.f57062xb7389127 = a06.d.b(f18 * 0.33333334f);
            linkedList.add(tRTCMixUser);
            i19 = i27;
        }
        mixUser.f297232x = ((com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser) linkedList.get(0)).f297232x;
        mixUser.f297233y = ((com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser) linkedList.get(0)).f297233y;
        mixUser.f57071x6be2dc6 = ((com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser) linkedList.get(0)).f57071x6be2dc6;
        mixUser.f57062xb7389127 = ((com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser) linkedList.get(0)).f57062xb7389127;
        ((com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser) linkedList.get(0)).f57070xce2b2e46 = this.f555887d;
        ((com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser) linkedList.get(0)).f57072xd4bdd2f4 = 1;
        int i28 = 0;
        for (java.lang.Object obj : arrayList) {
            int i29 = i28 + 1;
            if (i28 < 0) {
                kz5.c0.p();
                throw null;
            }
            zn0.v vVar = (zn0.v) obj;
            vVar.f555944i = selfRoomId;
            com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser tRTCMixUser2 = (com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser) kz5.n0.a0(linkedList, vVar.f555946n - 1);
            if (tRTCMixUser2 != null) {
                java.lang.String str = vVar.f555939d;
                tRTCMixUser2.f57070xce2b2e46 = str;
                tRTCMixUser2.f57069xb8c992da = vVar.f555940e;
                tRTCMixUser2.f57065x968497be = true;
                zn0.g0 i37 = this.f555885b.i(str, 0);
                if (i37 != null) {
                    tRTCMixUser2.f57065x968497be = i37.f555881c;
                }
                config.f57150xbef7910c.add(tRTCMixUser2);
            }
            i28 = i29;
        }
        zn0.y yVar = zn0.x.f555947a;
        yVar.f555949b = 1;
        yVar.f555950c = size;
        return n(selfRoomId, config, linkedList);
    }

    public final org.json.JSONObject m(java.lang.String selfRoomId, int i17, int i18, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCTranscodingConfig config, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser mixUser) {
        zn0.a aVar;
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selfRoomId, "selfRoomId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mixUser, "mixUser");
        java.util.ArrayList arrayList = zn0.x.f555947a.f555948a;
        if (arrayList == null || arrayList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCloudMixture", "micFocusGrabModeFillConfig remoteUserConfigList = null or size = 0");
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("micFocusGrabModeFillConfig videostreams: ");
        zn0.a0 a0Var = this.f555885b;
        sb6.append(a0Var.f555833d.size());
        sb6.append(" videoHeight: ");
        sb6.append(i18);
        sb6.append(" videoWidth: ");
        sb6.append(i17);
        sb6.append(" curForceUserId: ");
        sb6.append(this.f555886c);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCloudMixture", sb6.toString());
        config.f57158x9f1bbe0b = i17;
        config.f57156x2a8d0982 = i18;
        config.f57148x4d0b70cd = "37286";
        kn0.p pVar = a0Var.f555846q;
        if (pVar != null && pVar.f391122i) {
            float f17 = i17;
            int b17 = (int) ((i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 72) / com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x) * f17);
            aVar = new zn0.a(b17, (int) (b17 / 0.7346939f), 0, (int) (0.038647342f * f17), (int) (0.39130434f * f17), (int) (f17 * 0.019323671f));
        } else {
            float f18 = i18;
            int b18 = (int) ((i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 98) / com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y) * f18);
            aVar = new zn0.a((int) (b18 * 0.7346939f), b18, (i17 - ((int) (0.46153846f * f18))) / 2, (int) (i17 * 0.038647342f), (int) (0.20982143f * f18), (int) (f18 * 0.008928572f));
        }
        zn0.a aVar2 = aVar;
        int i19 = aVar2.f555825b;
        int i27 = aVar2.f555824a;
        int i28 = aVar2.f555826c;
        int i29 = aVar2.f555827d;
        int i37 = aVar2.f555828e;
        int i38 = aVar2.f555829f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCloudMixture", "micFocusGrabModeFillConfig offestMargin: " + i28 + " micHeight: " + i19 + " micWidth: " + i27 + " micRightMargin: " + i29 + " micTopMargin: " + i37 + " micMargin: " + i38 + " oriTop: 0.20982143");
        zn0.h hVar = new zn0.h(i17, i18);
        zn0.g gVar = new zn0.g(i17, i27, i29, i28, i37, i38, i19);
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((zn0.v) obj).f555946n == 1) {
                break;
            }
        }
        zn0.v vVar = (zn0.v) obj;
        zn0.y yVar = zn0.x.f555947a;
        int i39 = yVar.f555949b;
        int i47 = yVar.f555950c;
        int i48 = (i47 <= arrayList.size() || (i39 = i39 - (i47 - arrayList.size())) > 2) ? i39 : 2;
        if (vVar == null) {
            hVar.mo146xb9724478(mixUser);
            i48 = 1;
        } else {
            com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser g17 = g(selfRoomId, vVar);
            hVar.mo146xb9724478(g17);
            config.f57150xbef7910c.add(g17);
            gVar.mo149xb9724478(mixUser, java.lang.Integer.valueOf(i48 - 2));
        }
        java.util.Iterator it6 = arrayList.iterator();
        int i49 = 0;
        while (it6.hasNext()) {
            zn0.v vVar2 = (zn0.v) it6.next();
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(vVar != null ? vVar.f555939d : null, vVar2.f555939d)) {
                com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser g18 = g(selfRoomId, vVar2);
                if (i49 == i48 - 2) {
                    i49++;
                }
                gVar.mo149xb9724478(g18, java.lang.Integer.valueOf(i49));
                i49++;
                config.f57150xbef7910c.add(g18);
            }
        }
        zn0.y yVar2 = zn0.x.f555947a;
        int size = arrayList.size();
        yVar2.f555949b = i48;
        yVar2.f555950c = size;
        java.util.ArrayList<com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser> arrayList2 = config.f57150xbef7910c;
        if (arrayList2 != null) {
            java.util.Iterator<com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser> it7 = arrayList2.iterator();
            while (it7.hasNext()) {
                it7.next().f57067xc8d8bf56 = null;
            }
        }
        return a0Var.m(config, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0188 A[Catch: JSONException -> 0x01f3, TryCatch #0 {JSONException -> 0x01f3, blocks: (B:32:0x0128, B:34:0x0163, B:35:0x0178, B:37:0x017c, B:42:0x0188, B:43:0x01bf, B:45:0x01a2, B:47:0x01a8, B:49:0x01ae, B:50:0x01b5, B:51:0x01b2), top: B:31:0x0128 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a2 A[Catch: JSONException -> 0x01f3, TryCatch #0 {JSONException -> 0x01f3, blocks: (B:32:0x0128, B:34:0x0163, B:35:0x0178, B:37:0x017c, B:42:0x0188, B:43:0x01bf, B:45:0x01a2, B:47:0x01a8, B:49:0x01ae, B:50:0x01b5, B:51:0x01b2), top: B:31:0x0128 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject n(java.lang.String r19, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCTranscodingConfig r20, java.util.List r21) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zn0.i.n(java.lang.String, com.tencent.trtc.TRTCCloudDef$TRTCTranscodingConfig, java.util.List):org.json.JSONObject");
    }
}
