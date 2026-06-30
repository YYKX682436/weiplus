package tm;

/* loaded from: classes14.dex */
public class g extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {

    /* renamed from: d, reason: collision with root package name */
    public tm.f f501962d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f501963e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f501964f;

    public g() {
        super(0);
        this.f501963e = new java.util.HashMap();
        this.f501964f = new java.util.HashMap();
    }

    public final void b() {
        tm.f fVar = this.f501962d;
        if (fVar == null || ((java.util.HashMap) fVar.f501961d).get(0) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f501962d.f501960c)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BroadcastController", "summerdize checkShowDisasterContent showDisasterContent[%s]", this.f501962d.f501960c);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_disaster_content", this.f501962d.f501960c);
        intent.putExtra("key_disaster_url", ((com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6181x5d47099d) ((java.util.HashMap) this.f501962d.f501961d).get(0)).f136439g.f88812b);
        intent.setClass(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11402x33c6c555.class).addFlags(268435456);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/broadcast/BroadcastController", "checkShowDisasterContent", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/broadcast/BroadcastController", "checkShowDisasterContent", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        this.f501962d.f501960c = null;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6181x5d47099d c6181x5d47099d;
        java.lang.Integer num;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.Object valueOf;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        tm.f fVar;
        java.lang.String str12;
        java.lang.String str13;
        java.lang.String str14;
        am.d1 d1Var;
        java.util.Iterator it;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5206xdf10b679 c5206xdf10b679 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5206xdf10b679) abstractC20979x809547d1;
        am.c1 c1Var = c5206xdf10b679.f135545g;
        int i17 = c1Var.f87831a;
        java.util.Map map = this.f501964f;
        if (i17 != 1) {
            java.util.Map map2 = this.f501963e;
            am.d1 d1Var2 = c5206xdf10b679.f135546h;
            if (i17 != 2) {
                java.lang.String str15 = ".e.Item";
                java.lang.String str16 = "en";
                am.d1 d1Var3 = d1Var2;
                java.lang.String str17 = ".Tips";
                if (i17 == 4) {
                    java.lang.String str18 = c1Var.f87832b;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BroadcastController", "summerdiz handleEventOOB oldNoticeInfo[%s], event[%s]", this.f501962d, str18);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str18) && str18.indexOf("<") >= 0) {
                        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str18, "e", null);
                        if (d17 == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BroadcastController", "this is not errmsg");
                        } else {
                            if (this.f501962d == null) {
                                this.f501962d = new tm.f();
                                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6181x5d47099d c6181x5d47099d2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6181x5d47099d();
                                num = 0;
                                ((java.util.HashMap) this.f501962d.f501961d).put(null, c6181x5d47099d2);
                                am.lz lzVar = c6181x5d47099d2.f136439g;
                                lzVar.f88813c = "";
                                lzVar.f88812b = "";
                                lzVar.f88811a = false;
                                lzVar.f88814d = 0;
                                lzVar.f88815e = com.p314xaae8f345.mm.R.C30864xbddafb2a.c1s;
                                lzVar.f88816f = "";
                                lzVar.f88817g = 0;
                            } else {
                                num = 0;
                            }
                            if (x51.o1.f533582d0) {
                                str = ".Content";
                                str2 = ".Language";
                            } else {
                                str = ".Content";
                                str2 = ".Language";
                                long j17 = this.f501962d.f501959b;
                                if (j17 == 0 || android.os.SystemClock.elapsedRealtime() - j17 >= 1800000) {
                                    this.f501962d.f501959b = android.os.SystemClock.elapsedRealtime();
                                } else {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BroadcastController", "disasterTick within half an hour, drop it");
                                }
                            }
                            if (!x51.o1.f533584e0) {
                                try {
                                    long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) d17.get(".e.ExpiredTime"), 0L);
                                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(V) > 0) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BroadcastController", "expiredTime is too small, drop id:%d", java.lang.Long.valueOf(V));
                                    }
                                } catch (java.lang.Exception e17) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BroadcastController", "parseLong expiredTime error:%s", e17);
                                }
                            }
                            this.f501962d.f501958a = (java.lang.String) d17.get(".e.NoticeId");
                            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("disaster_pref", 4).getString("disaster_noticeid_list_key", "");
                            if (x51.o1.f533586f0 || !string.contains(this.f501962d.f501958a)) {
                                java.lang.String f17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                                java.lang.String str19 = null;
                                java.lang.String str20 = null;
                                java.lang.String str21 = null;
                                int i18 = 0;
                                while (true) {
                                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str15);
                                    sb6.append(i18 == 0 ? "" : java.lang.Integer.valueOf(i18));
                                    java.lang.String sb7 = sb6.toString();
                                    java.lang.String str22 = (java.lang.String) d17.get(sb7 + str2);
                                    if (str22 == null && i18 > 3) {
                                        str3 = null;
                                        str5 = null;
                                        str4 = null;
                                        break;
                                    }
                                    if (f17.equalsIgnoreCase(str22)) {
                                        java.lang.String str23 = (java.lang.String) d17.get(sb7 + str);
                                        java.lang.String str24 = (java.lang.String) d17.get(sb7 + ".Url");
                                        str3 = (java.lang.String) d17.get(sb7 + str17);
                                        str4 = str24;
                                        str5 = str23;
                                        break;
                                    }
                                    java.lang.String str25 = str21;
                                    java.lang.String str26 = str15;
                                    java.lang.String str27 = str16;
                                    java.lang.String str28 = str17;
                                    java.lang.String str29 = str;
                                    if (str27.equalsIgnoreCase(str22)) {
                                        java.lang.String str30 = (java.lang.String) d17.get(sb7 + str29);
                                        str20 = (java.lang.String) d17.get(sb7 + ".Url");
                                        str6 = str30;
                                        str19 = (java.lang.String) d17.get(sb7 + str28);
                                    } else {
                                        str6 = str25;
                                    }
                                    i18++;
                                    str = str29;
                                    str21 = str6;
                                    str17 = str28;
                                    str16 = str27;
                                    str15 = str26;
                                }
                                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BroadcastController", "handleEventOOB cann't hit curLang");
                                } else {
                                    str19 = str3;
                                    str21 = str5;
                                    str20 = str4;
                                }
                                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str20)) {
                                    str20 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572588bq5);
                                }
                                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str21)) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BroadcastController", "handleEventOOB defContent is also null use hardcode");
                                    str21 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bpz);
                                }
                                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str19)) {
                                    str19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str21) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572585bq2) : str21;
                                }
                                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6181x5d47099d c6181x5d47099d3 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6181x5d47099d) ((java.util.HashMap) this.f501962d.f501961d).get(num);
                                am.lz lzVar2 = c6181x5d47099d3.f136439g;
                                lzVar2.f88813c = str19;
                                lzVar2.f88812b = str20;
                                lzVar2.f88811a = true;
                                lzVar2.f88814d = 2;
                                lzVar2.f88816f = this.f501962d.f501958a;
                                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new tm.e(this, c6181x5d47099d3));
                                this.f501962d.f501960c = str21;
                                if (c01.d9.e().f152304n) {
                                    b();
                                }
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BroadcastController", "noticeIdList %s contain notifyID:%s, drop id", string, this.f501962d.f501958a);
                            }
                        }
                    }
                } else if (i17 == 5) {
                    java.lang.String str31 = c1Var.f87832b;
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    objArr[0] = java.lang.Integer.valueOf(str31 == null ? -1 : str31.length());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BroadcastController", "summerdiz handleNewDisaster xml len[%d]", objArr);
                    java.util.Map d18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str31, "e", null);
                    if (d18 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BroadcastController", "summerdiz handleNewDisaster this is not errmsg");
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BroadcastController", "summerdiz handleNewDisaster values[%s]", d18);
                        java.lang.String str32 = ".Content";
                        long V2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) d18.get(".e.NoticeId"), 0L);
                        if (V2 <= 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BroadcastController", "summerdiz handleNewDisaster noticeID null");
                        }
                        if (!x51.o1.f533584e0) {
                            try {
                                long V3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) d18.get(".e.ExpiredTime"), 0L);
                                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(V3) > 0) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BroadcastController", "summerdiz handleNewDisaster expiredTime is too small, drop id:%d", java.lang.Long.valueOf(V3));
                                }
                            } catch (java.lang.Exception e18) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BroadcastController", "parseLong expiredTime error:%s", e18);
                            }
                        }
                        tm.f fVar2 = new tm.f();
                        fVar2.f501958a = "" + V2;
                        java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("disaster_pref", 4).getString("disaster_noticeid_list_key", "");
                        if (x51.o1.f533586f0 || !string2.contains(fVar2.f501958a)) {
                            java.util.HashMap hashMap = (java.util.HashMap) map;
                            if (hashMap.size() > 0) {
                                tm.f fVar3 = (tm.f) hashMap.get(java.lang.Long.valueOf(V2));
                                if (fVar3 != null) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BroadcastController", "summerdiz  handleNewDisaster found info in map[%s]", fVar3);
                                    fVar2 = fVar3;
                                } else {
                                    hashMap.put(java.lang.Long.valueOf(V2), fVar2);
                                }
                            } else {
                                hashMap.put(java.lang.Long.valueOf(V2), fVar2);
                            }
                            java.lang.String str33 = (java.lang.String) d18.get(".e.Position");
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str33)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BroadcastController", "summerdiz handleNewDisaster positionStr is null!");
                            } else {
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                java.lang.String[] split = str33.split(",");
                                if (split == null || split.length < 1) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BroadcastController", "summerdiz handleNewDisaster positionStr id invaild!");
                                } else {
                                    boolean z17 = false;
                                    for (java.lang.String str34 : split) {
                                        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str34, 0);
                                        if (P > 0) {
                                            if (P == 1) {
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BroadcastController", "summerdiz handleNewDisaster found tonyTips[%d]", java.lang.Integer.valueOf(P));
                                                z17 = true;
                                            } else {
                                                arrayList.add(java.lang.Integer.valueOf(P));
                                            }
                                        }
                                    }
                                    if (z17 || arrayList.size() != 0) {
                                        java.lang.String f18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BroadcastController", "summerdiz handleNewDisaster curLang[%s]", f18);
                                        java.lang.String str35 = null;
                                        java.lang.String str36 = null;
                                        int i19 = 0;
                                        java.lang.String str37 = null;
                                        while (true) {
                                            java.lang.StringBuilder sb8 = new java.lang.StringBuilder(".e.Item");
                                            if (i19 == 0) {
                                                str7 = str35;
                                                valueOf = "";
                                            } else {
                                                str7 = str35;
                                                valueOf = java.lang.Integer.valueOf(i19);
                                            }
                                            sb8.append(valueOf);
                                            java.lang.String sb9 = sb8.toString();
                                            java.lang.String str38 = (java.lang.String) d18.get(sb9 + ".Language");
                                            str8 = str36;
                                            if (str38 == null && i19 > 3) {
                                                str9 = null;
                                                str11 = null;
                                                str10 = null;
                                                break;
                                            }
                                            if (f18.equalsIgnoreCase(str38)) {
                                                java.lang.String str39 = (java.lang.String) d18.get(sb9 + str32);
                                                java.lang.String str40 = (java.lang.String) d18.get(sb9 + ".Url");
                                                str9 = (java.lang.String) d18.get(sb9 + str17);
                                                str10 = str40;
                                                str11 = str39;
                                                break;
                                            }
                                            java.lang.String str41 = str32;
                                            java.util.ArrayList arrayList2 = arrayList;
                                            java.lang.String str42 = str17;
                                            java.lang.String str43 = f18;
                                            java.lang.String str44 = str16;
                                            long j18 = V2;
                                            am.d1 d1Var4 = d1Var3;
                                            if (str44.equalsIgnoreCase(str38)) {
                                                java.lang.String str45 = (java.lang.String) d18.get(sb9 + str41);
                                                fVar = fVar2;
                                                str37 = (java.lang.String) d18.get(sb9 + ".Url");
                                                str8 = str45;
                                                str35 = (java.lang.String) d18.get(sb9 + str42);
                                            } else {
                                                fVar = fVar2;
                                                str35 = str7;
                                            }
                                            i19++;
                                            f18 = str43;
                                            fVar2 = fVar;
                                            str16 = str44;
                                            d1Var3 = d1Var4;
                                            str17 = str42;
                                            V2 = j18;
                                            arrayList = arrayList2;
                                            str32 = str41;
                                            str36 = str8;
                                        }
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BroadcastController", "summerdiz handleNewDisaster content[%s] tips[%s]", str11, str9);
                                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str11)) {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BroadcastController", "summerdiz handleNewDisaster cann't hit curLang");
                                            str14 = str37;
                                            str13 = str8;
                                            str12 = str7;
                                        } else {
                                            str12 = str9;
                                            str13 = str11;
                                            str14 = str10;
                                        }
                                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str14)) {
                                            str14 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572588bq5);
                                        }
                                        if (z17) {
                                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str13)) {
                                                str13 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572583bq0);
                                            }
                                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str12)) {
                                                str12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572586bq3);
                                            }
                                            d1Var = d1Var3;
                                            d1Var.f87955c = str13;
                                            d1Var.f87954b = str14;
                                            d1Var.f87953a = true;
                                            d1Var.f87957e = 0;
                                            d1Var.f87956d = 6;
                                            d1Var.f87958f = "" + V2;
                                            d1Var.f87959g = 1;
                                        } else {
                                            d1Var = d1Var3;
                                        }
                                        if (arrayList.size() == 0) {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BroadcastController", "summerdiz handleNewDisaster no other position need to tip");
                                        } else {
                                            long j19 = fVar2.f501959b;
                                            if (j19 == 0 || android.os.SystemClock.elapsedRealtime() - j19 >= 1800000) {
                                                fVar2.f501959b = android.os.SystemClock.elapsedRealtime();
                                                for (java.util.Iterator it6 = arrayList.iterator(); it6.hasNext(); it6 = it) {
                                                    java.lang.Integer num2 = (java.lang.Integer) it6.next();
                                                    java.util.HashMap hashMap2 = (java.util.HashMap) map2;
                                                    java.lang.Long valueOf2 = java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) hashMap2.get(num2), 0L));
                                                    if (valueOf2.longValue() <= 0 || valueOf2.longValue() < V2) {
                                                        java.util.HashMap hashMap3 = (java.util.HashMap) fVar2.f501961d;
                                                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6181x5d47099d c6181x5d47099d4 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6181x5d47099d) hashMap3.get(num2);
                                                        if (c6181x5d47099d4 == null) {
                                                            c6181x5d47099d4 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6181x5d47099d();
                                                            am.lz lzVar3 = c6181x5d47099d4.f136439g;
                                                            lzVar3.getClass();
                                                            it = it6;
                                                            lzVar3.f88815e = com.p314xaae8f345.mm.R.C30864xbddafb2a.c1s;
                                                            lzVar3.f88817g = num2.intValue();
                                                            hashMap3.put(num2, c6181x5d47099d4);
                                                        } else {
                                                            it = it6;
                                                        }
                                                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str12)) {
                                                            str12 = str13;
                                                        }
                                                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str12)) {
                                                            int intValue = num2.intValue();
                                                            str12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(intValue != 2 ? (intValue == 3 || intValue == 4) ? com.p314xaae8f345.mm.R.C30867xcad56011.f572584bq1 : com.p314xaae8f345.mm.R.C30867xcad56011.f572585bq2 : com.p314xaae8f345.mm.R.C30867xcad56011.f572587bq4);
                                                        }
                                                        am.lz lzVar4 = c6181x5d47099d4.f136439g;
                                                        lzVar4.f88813c = str12;
                                                        lzVar4.f88812b = str14;
                                                        lzVar4.f88811a = true;
                                                        lzVar4.f88814d = 2;
                                                        lzVar4.f88816f = fVar2.f501958a;
                                                        hashMap2.put(num2, java.lang.Long.valueOf(V2));
                                                        if (!z17) {
                                                            d1Var.f87955c = str12;
                                                            d1Var.f87954b = str14;
                                                            d1Var.f87953a = true;
                                                            d1Var.f87957e = com.p314xaae8f345.mm.R.C30864xbddafb2a.c1s;
                                                            d1Var.f87956d = 2;
                                                            d1Var.f87958f = "" + V2;
                                                            d1Var.f87959g = num2.intValue();
                                                        }
                                                        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new tm.d(this, c6181x5d47099d4));
                                                    } else {
                                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BroadcastController", "summerdiz p[%d] has bigger oldPositionNoticeId[%d, %d]", num2, valueOf2, java.lang.Long.valueOf(V2));
                                                        it = it6;
                                                    }
                                                }
                                            } else {
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BroadcastController", "summerdiz handleNewDisaster disasterTick within half an hour, drop it");
                                            }
                                        }
                                    } else {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BroadcastController", "summerdiz handleNewDisaster positions size is 0!");
                                    }
                                }
                            }
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BroadcastController", "summerdiz handleNewDisaster noticeIdList %s contain notifyID:%s, drop id", string2, fVar2.f501958a);
                        }
                    }
                }
            } else {
                int i27 = c1Var.f87833c;
                java.util.HashMap hashMap4 = (java.util.HashMap) map2;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BroadcastController", "summerdiz handlePullNotify position[%d],oldNoticeInfo[%s], positionNoticeIdMap[%d]", java.lang.Integer.valueOf(i27), this.f501962d, java.lang.Integer.valueOf(hashMap4.size()));
                if (i27 <= 0 || hashMap4.size() <= 0) {
                    tm.f fVar4 = this.f501962d;
                    if (fVar4 != null && (c6181x5d47099d = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6181x5d47099d) ((java.util.HashMap) fVar4.f501961d).get(0)) != null) {
                        am.lz lzVar5 = c6181x5d47099d.f136439g;
                        d1Var2.f87955c = lzVar5.f88813c;
                        d1Var2.f87954b = lzVar5.f88812b;
                        boolean z18 = lzVar5.f88811a;
                        d1Var2.f87953a = z18;
                        d1Var2.f87957e = lzVar5.f88815e;
                        d1Var2.f87956d = lzVar5.f88814d;
                        d1Var2.f87958f = lzVar5.f88816f;
                        d1Var2.f87959g = lzVar5.f88817g;
                        if (z18) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13936, java.lang.Integer.valueOf(i27));
                        }
                        b();
                    }
                } else {
                    long k17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) hashMap4.get(java.lang.Integer.valueOf(i27)), 0L);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BroadcastController", "summerdiz handlePullNotify position[%d] found noticeId[%d]", java.lang.Integer.valueOf(i27), java.lang.Long.valueOf(k17));
                    if (k17 > 0) {
                        tm.f fVar5 = (tm.f) ((java.util.HashMap) map).get(java.lang.Long.valueOf(k17));
                        if (fVar5 == null) {
                            hashMap4.remove(java.lang.Integer.valueOf(i27));
                        } else {
                            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6181x5d47099d c6181x5d47099d5 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6181x5d47099d) ((java.util.HashMap) fVar5.f501961d).get(java.lang.Integer.valueOf(i27));
                            if (c6181x5d47099d5 != null) {
                                am.lz lzVar6 = c6181x5d47099d5.f136439g;
                                d1Var2.f87955c = lzVar6.f88813c;
                                d1Var2.f87954b = lzVar6.f88812b;
                                boolean z19 = lzVar6.f88811a;
                                d1Var2.f87953a = z19;
                                d1Var2.f87957e = lzVar6.f88815e;
                                d1Var2.f87956d = lzVar6.f88814d;
                                d1Var2.f87958f = lzVar6.f88816f;
                                d1Var2.f87959g = lzVar6.f88817g;
                                if (z19) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13936, java.lang.Integer.valueOf(i27));
                                }
                            }
                        }
                    }
                }
            }
        } else {
            java.lang.String str46 = c1Var.f87832b;
            long V4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(str46, 0L);
            int i28 = c1Var.f87833c;
            java.util.HashMap hashMap5 = (java.util.HashMap) map;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BroadcastController", "summerdiz cancelUIEvent cancelNoticeIDStr[%s] cancelPosition[%d], oldNoticeInfo[%s] newDisasterNoticeInfoMap[%d] ", str46, java.lang.Integer.valueOf(i28), this.f501962d, java.lang.Integer.valueOf(hashMap5.size()));
            if (hashMap5.size() > 0 && V4 > 0) {
                tm.f fVar6 = (tm.f) hashMap5.get(java.lang.Long.valueOf(V4));
                if (fVar6 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BroadcastController", "summerdiz cancelUIEvent found info[%s]", fVar6);
                    java.util.Map map3 = fVar6.f501961d;
                    if (i28 > 0) {
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6181x5d47099d c6181x5d47099d6 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6181x5d47099d) ((java.util.HashMap) map3).get(java.lang.Integer.valueOf(i28));
                        if (c6181x5d47099d6 != null) {
                            java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i28);
                            am.lz lzVar7 = c6181x5d47099d6.f136439g;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BroadcastController", "summerdiz cancelPosition[%d] found event[%b]", valueOf3, java.lang.Boolean.valueOf(lzVar7.f88811a));
                            if (lzVar7.f88811a) {
                                lzVar7.f88811a = false;
                                c6181x5d47099d6.e();
                                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13939, 2);
                            }
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BroadcastController", "summerdiz cancelPosition[%d] not found event", java.lang.Integer.valueOf(i28));
                        }
                    } else {
                        java.util.Collection<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6181x5d47099d> values = ((java.util.HashMap) map3).values();
                        if (values != null && (r0 = values.iterator()) != null) {
                            for (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6181x5d47099d c6181x5d47099d7 : values) {
                                if (c6181x5d47099d7 != null) {
                                    am.lz lzVar8 = c6181x5d47099d7.f136439g;
                                    if (lzVar8.f88811a) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BroadcastController", "summerdiz cancelPosition[%d] found event[%b]", java.lang.Long.valueOf(V4), java.lang.Boolean.valueOf(lzVar8.f88811a));
                                        lzVar8.f88811a = false;
                                        c6181x5d47099d7.e();
                                    }
                                }
                            }
                        }
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BroadcastController", "summerdiz cancelNoticeID not found info");
                }
            }
            if (this.f501962d != null) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str46) || str46.equals(this.f501962d.f501958a)) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6181x5d47099d c6181x5d47099d8 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6181x5d47099d) ((java.util.HashMap) this.f501962d.f501961d).get(0);
                    if (c6181x5d47099d8 != null) {
                        am.lz lzVar9 = c6181x5d47099d8.f136439g;
                        if (lzVar9.f88811a) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13939, 2);
                            lzVar9.f88811a = false;
                            c6181x5d47099d8.e();
                            return false;
                        }
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BroadcastController", "summerdiz cancelUIEvent old now:[%s], want to cancel:[%s], drop id", this.f501962d.f501958a, str46);
                }
            }
        }
        return false;
    }
}
