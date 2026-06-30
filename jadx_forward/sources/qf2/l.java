package qf2;

/* loaded from: classes3.dex */
public final class l extends if2.b implements mf2.v, mf2.c {

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Integer f443988m;

    /* renamed from: n, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f443989n;

    /* renamed from: o, reason: collision with root package name */
    public long f443990o;

    /* renamed from: p, reason: collision with root package name */
    public ml2.p3 f443991p;

    /* renamed from: q, reason: collision with root package name */
    public long f443992q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f443991p = ml2.p3.f409321d;
    }

    @Override // mf2.c
    public void M2(xh2.b micInfoData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micInfoData, "micInfoData");
        e7(false);
    }

    public final void Z6(java.util.LinkedList linkedList) {
        java.lang.Object obj;
        java.lang.String str = ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410520q.f461834n;
        if (str == null) {
            str = "";
        }
        int i17 = 0;
        for (java.lang.Object obj2 : linkedList) {
            int i18 = i17 + 1;
            java.lang.Object obj3 = null;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            xh2.a aVar = (xh2.a) obj2;
            java.util.ArrayList arrayList = zn0.x.f555947a.f555948a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrayList, "getRemoteUserConfigList(...)");
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((zn0.v) obj).f555939d, aVar.b())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            zn0.v vVar = (zn0.v) obj;
            if (vVar != null) {
                vVar.f555946n = aVar.f536054b.f536086e;
            }
            java.util.List list = ((mm2.o4) m56788xbba4bfc0(mm2.o4.class)).f410860v;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-audienceLinkMicUserList>(...)");
            synchronized (list) {
                java.util.Iterator it6 = list.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it6.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((km2.q) next).f390703a, aVar.b())) {
                        obj3 = next;
                        break;
                    }
                }
            }
            km2.q qVar = (km2.q) obj3;
            if (qVar != null) {
                qVar.f390725w = aVar.f536054b.f536086e;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar.b(), str)) {
                zn0.y yVar = zn0.x.f555947a;
                int i19 = aVar.f536054b.f536086e;
                int size = yVar.f555948a.size();
                yVar.f555949b = i19;
                yVar.f555950c = size;
            }
            i17 = i18;
        }
    }

    public final void a7(java.lang.String micId) {
        km2.q qVar;
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micId, "micId");
        java.util.List list = ((mm2.o4) m56788xbba4bfc0(mm2.o4.class)).f410868z;
        if (list != null) {
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((km2.q) obj).f390708f, micId)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
            }
            qVar = (km2.q) obj;
        } else {
            qVar = null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorMicCloudController", "anchor start accept link mic micId: " + micId + " curLinkUser: " + qVar + " size: " + ((mm2.o4) m56788xbba4bfc0(mm2.o4.class)).f410868z.size());
        if (qVar != null) {
            r45.xn1 xn1Var = new r45.xn1();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa();
            c19782x23db1cfa.m76240x66bc2758(qVar.f390705c);
            c19782x23db1cfa.m76227x7ac946f0(qVar.f390706d);
            c19782x23db1cfa.m76218xe0a5bcad(qVar.f390704b);
            xn1Var.set(0, c19782x23db1cfa);
            mk2.h hVar = mk2.h.f408666a;
            java.lang.String str = qVar.f390708f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LinkMicTimeoutTimer", "startAcceptMicTimer micId:" + str + " delay:10000");
            if (str != null) {
                mk2.e eVar = new mk2.e();
                eVar.f408663d = str;
                mk2.h.f408670e.put(str, eVar);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(eVar, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
            }
            dk2.u4 u4Var = ((mm2.o4) m56788xbba4bfc0(mm2.o4.class)).Z;
            if (u4Var != null && u4Var.g()) {
                int i17 = zn0.x.f555947a.f555949b;
                java.util.List list2 = ((mm2.o4) m56788xbba4bfc0(mm2.o4.class)).f410868z;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list2, "<get-linkMicUserInfoList>(...)");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : list2) {
                    km2.q qVar2 = (km2.q) obj2;
                    if ((p3321xbce91901.jvm.p3324x21ffc6bd.o.b(qVar2.f390722t, java.lang.Boolean.TRUE) || qVar2.f390710h) ? false : true) {
                        arrayList.add(obj2);
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorMicCloudController", "adjustCrossRoomUserPosValid curList = " + arrayList);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.HashMap hashMap = new java.util.HashMap();
                java.util.Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    km2.q qVar3 = (km2.q) it6.next();
                    int i18 = qVar3.f390725w;
                    if (i18 <= 0 || i18 > 5 || i18 == i17) {
                        arrayList2.add(qVar3);
                    } else if (hashMap.containsKey(java.lang.Integer.valueOf(i18))) {
                        arrayList2.add(qVar3);
                    } else {
                        hashMap.put(java.lang.Integer.valueOf(qVar3.f390725w), qVar3);
                    }
                }
                int i19 = 0;
                for (int i27 = 1; i27 < 6; i27++) {
                    if (!hashMap.containsKey(java.lang.Integer.valueOf(i27)) && i27 != i17) {
                        int i28 = i19 + 1;
                        km2.q qVar4 = (km2.q) kz5.n0.a0(arrayList2, i19);
                        if (qVar4 != null) {
                            qVar4.f390725w = i27;
                        }
                        i19 = i28;
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorMicCloudController", "adjustCrossRoomUserPosValid result curList = " + arrayList);
            } else {
                int i29 = zn0.x.f555947a.f555949b;
                java.util.List<km2.q> list3 = ((mm2.o4) m56788xbba4bfc0(mm2.o4.class)).f410868z;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorMicCloudController", "adjustUserPosValid curList = " + list3);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.HashMap hashMap2 = new java.util.HashMap();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list3);
                for (km2.q qVar5 : list3) {
                    int i37 = qVar5.f390725w;
                    if (i37 <= 0 || i37 > 9 || i37 == i29) {
                        arrayList3.add(qVar5);
                    } else if (hashMap2.containsKey(java.lang.Integer.valueOf(i37))) {
                        arrayList3.add(qVar5);
                    } else {
                        hashMap2.put(java.lang.Integer.valueOf(qVar5.f390725w), qVar5);
                    }
                }
                int i38 = 0;
                for (int i39 = 1; i39 < 10; i39++) {
                    if (!hashMap2.containsKey(java.lang.Integer.valueOf(i39)) && i39 != i29) {
                        int i47 = i38 + 1;
                        km2.q qVar6 = (km2.q) kz5.n0.a0(arrayList3, i38);
                        if (qVar6 != null) {
                            qVar6.f390725w = i39;
                        }
                        i38 = i47;
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorMicCloudController", "adjustUserPosValid result curList = " + list3);
            }
            dk2.xf k17 = dk2.ef.f314905a.k(getStore().getLiveRoomData());
            if (k17 != null) {
                long m75942xfb822ef2 = ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
                long j17 = ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410516m;
                java.lang.String str2 = ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410525v;
                byte[] bArr = ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410518o;
                int i48 = qVar.f390707e;
                java.lang.String str3 = qVar.f390703a;
                java.lang.String str4 = qVar.f390708f;
                if (str4 == null) {
                    str4 = "";
                }
                int i49 = qVar.f390725w;
                qf2.e eVar2 = new qf2.e(qVar, this, xn1Var, micId);
                dk2.r4 r4Var = (dk2.r4) k17;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("acceptAudienceLinkMic nickName: ");
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0);
                sb6.append(c19782x23db1cfa2 != null ? c19782x23db1cfa2.m76184x8010e5e4() : null);
                sb6.append(" liveId:");
                sb6.append(m75942xfb822ef2);
                sb6.append(", objectId:");
                sb6.append(j17);
                sb6.append(", nonceId:");
                sb6.append(str2);
                sb6.append(", scene:1, micType:");
                sb6.append(i48);
                sb6.append(", userId:");
                sb6.append(str3);
                sb6.append(", sessionId:");
                sb6.append(str4);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4Var.f315542d, sb6.toString());
                r45.ch1 ch1Var = new r45.ch1();
                ch1Var.set(7, str4);
                ch1Var.set(0, xn1Var);
                r45.eh1 eh1Var = new r45.eh1();
                eh1Var.set(1, java.lang.Integer.valueOf(i48));
                eh1Var.set(0, str3);
                eh1Var.set(2, java.lang.Integer.valueOf(i49));
                ch1Var.set(4, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(eh1Var.mo14344x5f01b1f6()));
                ch1Var.set(1, 20004);
                ch1Var.set(2, zl2.q4.f555466a.m());
                new ek2.b(m75942xfb822ef2, j17, str2, bArr, 1, ch1Var, eVar2).l();
            }
        }
    }

    public final void b7(int i17, java.lang.String str) {
        java.util.LinkedList linkedList;
        java.lang.Object obj;
        java.lang.Object obj2;
        if (str == null) {
            str = ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410520q.f461834n;
        }
        if (str == null) {
            str = "";
        }
        xh2.c cVar = (xh2.c) ((mm2.o4) m56788xbba4bfc0(mm2.o4.class)).A.mo3195x754a37bb();
        if (cVar != null && (linkedList = cVar.f536064a) != null) {
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                linkedList2.add(((xh2.a) it.next()).a());
            }
            java.util.Iterator it6 = linkedList2.iterator();
            while (true) {
                obj = null;
                if (!it6.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it6.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((xh2.a) obj2).b(), str)) {
                        break;
                    }
                }
            }
            xh2.a aVar = (xh2.a) obj2;
            java.util.Iterator it7 = linkedList2.iterator();
            while (true) {
                if (!it7.hasNext()) {
                    break;
                }
                java.lang.Object next = it7.next();
                boolean z17 = true;
                if (((xh2.a) next).f536054b.f536086e != 1) {
                    z17 = false;
                }
                if (z17) {
                    obj = next;
                    break;
                }
            }
            xh2.a aVar2 = (xh2.a) obj;
            if (aVar2 != null && aVar != null) {
                xh2.i a17 = aVar.f536054b.a();
                xh2.i iVar = aVar2.f536054b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iVar, "<set-?>");
                aVar.f536054b = iVar;
                aVar2.f536054b = a17;
            }
            Z6(linkedList2);
        }
        in0.q e17 = dk2.ef.f314905a.e();
        if (e17 != null) {
            e17.i0(i17, str);
        }
    }

    public final void c7(long j17, int i17, int i18, int i19) {
        if (j17 == this.f443990o) {
            r45.il4 il4Var = ((mm2.o4) m56788xbba4bfc0(mm2.o4.class)).U;
            il4Var.f458668m = i18;
            dk2.xf k17 = dk2.ef.f314905a.k(getStore().getLiveRoomData());
            if (k17 != null) {
                ((dk2.r4) k17).q0(((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410516m, il4Var.f458662d, il4Var.f458664f, il4Var.f458665g, il4Var.f458666h, il4Var.f458667i, i18, new qf2.h(j17, this, i17, i18, i19));
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorMicCloudController", "doSetMicSettingWithRetry seq outdated, skip. seq:" + j17 + " latest:" + this.f443990o + " newMode:" + i17 + " micLayoutBaseMode:" + i18 + " retryCount:" + i19);
    }

    public final void d7(android.os.Bundle bundle, in0.q qVar) {
        java.lang.String str;
        if (bundle == null || (str = bundle.getString("PARAM_FINDER_LIVE_FORCE_USER_ID")) == null) {
            str = "";
        }
        int i17 = bundle != null ? bundle.getInt("PARAM_FINDER_LIVE_MIC_MODE") : 0;
        if (bundle != null) {
            bundle.getInt("PARAM_FINDER_LIVE_MIC_ANCHOR_POSITION");
        }
        Z6(((mm2.y2) m56788xbba4bfc0(mm2.y2.class)).f411092i);
        if (qVar != null) {
            qVar.i0(i17, str);
        }
    }

    public final void e7(boolean z17) {
        ml2.p3 p3Var;
        int i17;
        zn0.a0 U;
        in0.q e17 = dk2.ef.f314905a.e();
        java.lang.Integer valueOf = (e17 == null || (U = e17.U()) == null) ? null : java.lang.Integer.valueOf(U.f555849t);
        if (!((mm2.o4) m56788xbba4bfc0(mm2.o4.class)).k7() || ((mm2.y2) m56788xbba4bfc0(mm2.y2.class)).Y6() || z17) {
            p3Var = ml2.p3.f409321d;
        } else {
            if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 2)) {
                p3Var = ml2.p3.f409322e;
            } else {
                if ((valueOf != null && valueOf.intValue() == 3) || (valueOf != null && valueOf.intValue() == 4)) {
                    p3Var = ml2.p3.f409324g;
                } else {
                    if ((((valueOf != null && valueOf.intValue() == 5) || (valueOf != null && valueOf.intValue() == 6)) || (valueOf != null && valueOf.intValue() == 7)) || (valueOf != null && valueOf.intValue() == 8)) {
                        p3Var = ml2.p3.f409325h;
                    } else {
                        p3Var = (valueOf != null && valueOf.intValue() == 9) || (valueOf != null && valueOf.intValue() == 10) ? ml2.p3.f409323f : ml2.p3.f409321d;
                    }
                }
            }
        }
        if (p3Var == this.f443991p) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ml2.p3 p3Var2 = this.f443991p;
        long j17 = this.f443992q;
        ml2.p3 p3Var3 = ml2.p3.f409321d;
        if (p3Var2 != p3Var3 && j17 > 0) {
            long j18 = (currentTimeMillis - j17) / 1000;
            if (j18 > 0) {
                boolean z18 = p3Var2 == ml2.p3.f409325h;
                int i18 = z18 ? 2 : 1;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("duration", j18);
                jSONObject.put("mic_mode", i18);
                if (!z18) {
                    int ordinal = p3Var2.ordinal();
                    if (ordinal != 1) {
                        int i19 = 2;
                        if (ordinal == 2) {
                            ml2.f3[] f3VarArr = ml2.f3.f408962d;
                        } else if (ordinal != 3) {
                            ml2.f3[] f3VarArr2 = ml2.f3.f408962d;
                        } else {
                            ml2.f3[] f3VarArr3 = ml2.f3.f408962d;
                            i19 = 3;
                        }
                        i17 = i19;
                        jSONObject.put("mic_pos_style", i17);
                    } else {
                        ml2.f3[] f3VarArr4 = ml2.f3.f408962d;
                    }
                    i17 = 1;
                    jSONObject.put("mic_pos_style", i17);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorMicCloudController", "doReportMicModeUsageDuration type:" + p3Var2 + " durationSec:" + j18 + " json:" + jSONObject);
                i95.m c17 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                zy2.zb.y6((zy2.zb) c17, ml2.z4.Q2, jSONObject.toString(), null, 4, null);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorMicCloudController", "reportMicModeUsageDuration skip, durationSec<=0. lastType:" + p3Var2 + " durationSec:" + j18);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorMicCloudController", "reportMicModeUsageDuration switch from " + this.f443991p + " to " + p3Var + ", curMicMode:" + valueOf + " isLiveEnd:" + z17);
        this.f443991p = p3Var;
        if (p3Var == p3Var3) {
            currentTimeMillis = 0;
        }
        this.f443992q = currentTimeMillis;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveEnd */
    public void mo56792x5aa1a970() {
        super.mo56792x5aa1a970();
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f443989n;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f443989n = null;
        e7(true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveMsg */
    public void mo14867x5aa1c816(r45.r71 r71Var) {
        r45.il4 il4Var;
        super.mo14867x5aa1c816(r71Var);
        if (this.f443988m != null || (il4Var = ((mm2.o4) m56788xbba4bfc0(mm2.o4.class)).U) == null) {
            return;
        }
        int i17 = (int) il4Var.f458662d;
        int i18 = pm0.v.z(i17, 32) ? 3 : pm0.v.z(i17, 64) ? 4 : 1;
        this.f443988m = java.lang.Integer.valueOf(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorMicCloudController", "onLiveMsg first onMicModeChange currentMicMode: " + i18);
        in0.q e17 = dk2.ef.f314905a.e();
        java.lang.String str = ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410520q.f461834n;
        if (str == null) {
            str = "";
        }
        if (e17 != null) {
            e17.i0(i18, str);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        super.mo14863x39a513b7(hc1Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(this, null, null, new qf2.j(this, null), 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        if (r4 != 3) goto L22;
     */
    @Override // mf2.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s6(int r8, android.os.Bundle r9) {
        /*
            r7 = this;
            r0 = 38
            if (r8 != r0) goto L62
            r8 = 0
            if (r9 == 0) goto Le
            java.lang.String r0 = "live_base_mic_mode_old"
            int r0 = r9.getInt(r0, r8)
            goto Lf
        Le:
            r0 = r8
        Lf:
            if (r9 == 0) goto L19
            java.lang.String r1 = "live_base_mic_mode_new"
            int r9 = r9.getInt(r1, r8)
            r4 = r9
            goto L1a
        L19:
            r4 = r8
        L1a:
            long r1 = r7.f443990o
            r5 = 1
            long r2 = r1 + r5
            r7.f443990o = r2
            kotlinx.coroutines.r2 r9 = r7.f443989n
            r1 = 1
            r5 = 0
            if (r9 == 0) goto L2b
            p3325xe03a0797.p3326xc267989b.p2.a(r9, r5, r1, r5)
        L2b:
            r7.f443989n = r5
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r5 = "onBaseMicModeChange oldMode:"
            r9.<init>(r5)
            r9.append(r0)
            java.lang.String r0 = " newMode:"
            r9.append(r0)
            r9.append(r4)
            java.lang.String r0 = " seq:"
            r9.append(r0)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = "AnchorMicCloudController"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r9)
            if (r4 == r1) goto L5c
            r9 = 2
            if (r4 == r9) goto L59
            r9 = 3
            if (r4 == r9) goto L59
            goto L5a
        L59:
            r8 = r9
        L5a:
            r5 = r8
            goto L5d
        L5c:
            r5 = r1
        L5d:
            r6 = 0
            r1 = r7
            r1.c7(r2, r4, r5, r6)
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qf2.l.s6(int, android.os.Bundle):void");
    }
}
