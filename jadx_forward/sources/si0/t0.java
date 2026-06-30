package si0;

/* loaded from: classes11.dex */
public final class t0 implements com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24851x62a095fb, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.ActivityResultListener {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f489703d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f489704e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f489705f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.l f489706g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f489707h;

    @Override // com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24851x62a095fb
    /* renamed from: getLabelList */
    public java.util.List mo92037xdb307afc(java.util.List labelIdList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(labelIdList, "labelIdList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList<java.lang.Number> arrayList2 = new java.util.ArrayList();
        arrayList2.addAll(labelIdList);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
        for (java.lang.Number number : arrayList2) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(number);
            arrayList3.add(java.lang.Long.valueOf(number.longValue()));
        }
        java.util.Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            long longValue = ((java.lang.Number) it.next()).longValue();
            java.lang.String g17 = ((b93.b) c93.a.a()).g(java.lang.String.valueOf(longValue));
            if (g17 == null) {
                g17 = "";
            }
            java.util.List j17 = ((b93.b) c93.a.a()).j(java.lang.String.valueOf(longValue));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PlatformSelectContactApiImpl", "getLabelList labelId: " + longValue + ", labelName:" + g17);
            if ((g17.length() > 0) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(j17)) {
                arrayList.add(new com.p314xaae8f345.p2845xc516c4b6.sns.C24894x9c0cde7e(longValue, g17, new java.util.ArrayList()));
            }
        }
        return arrayList;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24851x62a095fb
    /* renamed from: getLabelListWithUsers */
    public java.util.List mo92038xe04fb946(java.util.List labelIdList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(labelIdList, "labelIdList");
        java.util.ArrayList<java.lang.Number> arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList.addAll(labelIdList);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        for (java.lang.Number number : arrayList) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(number);
            arrayList3.add(java.lang.Long.valueOf(number.longValue()));
        }
        java.util.Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            long longValue = ((java.lang.Number) it.next()).longValue();
            java.lang.String g17 = ((b93.b) c93.a.a()).g(java.lang.String.valueOf(longValue));
            if (g17 == null) {
                g17 = "";
            }
            if (g17.length() > 0) {
                java.util.List<java.lang.String> j17 = ((b93.b) c93.a.a()).j(java.lang.String.valueOf(longValue));
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getLabelList labelId: ");
                sb6.append(longValue);
                sb6.append(", labelName:");
                sb6.append(g17);
                sb6.append(" userSize: ");
                sb6.append(j17 != null ? java.lang.Integer.valueOf(j17.size()) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PlatformSelectContactApiImpl", sb6.toString());
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                if (j17 != null) {
                    for (java.lang.String str : j17) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                        arrayList4.add(new com.p314xaae8f345.p2845xc516c4b6.sns.C24893xdc70ceaa(str, cj0.a.f123386a.m(str)));
                    }
                }
                if (!arrayList4.isEmpty()) {
                    arrayList2.add(new com.p314xaae8f345.p2845xc516c4b6.sns.C24894x9c0cde7e(longValue, g17, arrayList4));
                }
            }
        }
        return arrayList2;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24851x62a095fb
    /* renamed from: getValidToVisibilityUserNames */
    public java.util.List mo92039xee9e8e2a(java.util.List userNames) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userNames, "userNames");
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = userNames.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!android.text.TextUtils.isEmpty(str)) {
                if (Bi.n(str, true).r2()) {
                    arrayList.add(str);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PlatformSelectContactApiImpl", "[getValidToVisibilityUserNames] name:" + str + " skip, isContact:false");
                }
            }
        }
        return arrayList;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.ActivityResultListener
    /* renamed from: onActivityResult */
    public boolean mo63506x9d4787cb(int i17, int i18, android.content.Intent intent) {
        kz5.p0 p0Var = kz5.p0.f395529d;
        cj0.a aVar = cj0.a.f123386a;
        if (i17 == 4003) {
            if (i18 != -1) {
                yz5.l lVar = this.f489704e;
                if (lVar != null) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.p2845xc516c4b6.sns.C24896xf02403ef(false, p0Var))));
                }
            } else {
                if (intent == null) {
                    yz5.l lVar2 = this.f489704e;
                    if (lVar2 != null) {
                        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                        lVar2.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.p2845xc516c4b6.sns.C24896xf02403ef(false, p0Var))));
                    }
                    this.f489704e = null;
                    return true;
                }
                java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
                if (android.text.TextUtils.isEmpty(stringExtra)) {
                    com.p314xaae8f345.p2845xc516c4b6.sns.C24896xf02403ef c24896xf02403ef = new com.p314xaae8f345.p2845xc516c4b6.sns.C24896xf02403ef(true, p0Var);
                    yz5.l lVar3 = this.f489704e;
                    if (lVar3 != null) {
                        lVar3.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(c24896xf02403ef)));
                    }
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra);
                    java.util.List<java.lang.String> f07 = r26.n0.f0(stringExtra, new java.lang.String[]{","}, false, 0, 6, null);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.String str : f07) {
                        arrayList.add(new com.p314xaae8f345.p2845xc516c4b6.sns.C24893xdc70ceaa(str, aVar.m(str)));
                    }
                    com.p314xaae8f345.p2845xc516c4b6.sns.C24896xf02403ef c24896xf02403ef2 = new com.p314xaae8f345.p2845xc516c4b6.sns.C24896xf02403ef(true, arrayList);
                    yz5.l lVar4 = this.f489704e;
                    if (lVar4 != null) {
                        lVar4.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(c24896xf02403ef2)));
                    }
                }
            }
            this.f489704e = null;
            return true;
        }
        if (i17 == 4005) {
            if (i18 != -1) {
                yz5.l lVar5 = this.f489705f;
                if (lVar5 != null) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    lVar5.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.p2845xc516c4b6.sns.C24897x5672c09b(false, p0Var))));
                }
            } else {
                if (intent == null) {
                    yz5.l lVar6 = this.f489705f;
                    if (lVar6 != null) {
                        p3321xbce91901.C29043x91b2b43d.Companion companion4 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                        lVar6.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.p2845xc516c4b6.sns.C24897x5672c09b(false, p0Var))));
                    }
                    this.f489705f = null;
                    return true;
                }
                if (this.f489705f != null) {
                    java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("label_id");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2223xf2e0c00b.AbstractActivityC18396x51e3f06c.X6(stringArrayListExtra);
                    if (stringArrayListExtra != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        for (java.lang.String str2 : stringArrayListExtra) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                            long parseLong = java.lang.Long.parseLong(str2);
                            java.lang.String g17 = ((b93.b) c93.a.a()).g(str2);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getLabelStrById(...)");
                            arrayList2.add(new com.p314xaae8f345.p2845xc516c4b6.sns.C24894x9c0cde7e(parseLong, g17, new java.util.ArrayList()));
                        }
                        com.p314xaae8f345.p2845xc516c4b6.sns.C24897x5672c09b c24897x5672c09b = new com.p314xaae8f345.p2845xc516c4b6.sns.C24897x5672c09b(true, arrayList2);
                        yz5.l lVar7 = this.f489705f;
                        if (lVar7 != null) {
                            lVar7.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(c24897x5672c09b)));
                        }
                    }
                }
            }
            this.f489704e = null;
            return true;
        }
        if (i17 != 4010) {
            if (i17 != 4011) {
                return false;
            }
            if (i18 != -1 || intent == null) {
                yz5.l lVar8 = this.f489707h;
                if (lVar8 != null) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion5 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    lVar8.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.p2845xc516c4b6.sns.C24896xf02403ef(false, p0Var))));
                }
            } else {
                java.lang.String stringExtra2 = intent.getStringExtra("Select_Conv_User");
                if (android.text.TextUtils.isEmpty(stringExtra2)) {
                    com.p314xaae8f345.p2845xc516c4b6.sns.C24896xf02403ef c24896xf02403ef3 = new com.p314xaae8f345.p2845xc516c4b6.sns.C24896xf02403ef(true, p0Var);
                    yz5.l lVar9 = this.f489707h;
                    if (lVar9 != null) {
                        lVar9.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(c24896xf02403ef3)));
                    }
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra2);
                    java.util.List<java.lang.String> f08 = r26.n0.f0(stringExtra2, new java.lang.String[]{","}, false, 0, 6, null);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    for (java.lang.String str3 : f08) {
                        arrayList3.add(new com.p314xaae8f345.p2845xc516c4b6.sns.C24893xdc70ceaa(str3, aVar.m(str3)));
                    }
                    com.p314xaae8f345.p2845xc516c4b6.sns.C24896xf02403ef c24896xf02403ef4 = new com.p314xaae8f345.p2845xc516c4b6.sns.C24896xf02403ef(true, arrayList3);
                    yz5.l lVar10 = this.f489707h;
                    if (lVar10 != null) {
                        lVar10.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(c24896xf02403ef4)));
                    }
                }
            }
            this.f489707h = null;
            return true;
        }
        if (i18 != -1 || intent == null) {
            yz5.l lVar11 = this.f489706g;
            if (lVar11 != null) {
                p3321xbce91901.C29043x91b2b43d.Companion companion6 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                lVar11.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.p2845xc516c4b6.sns.C24895xb892af52(false, p0Var, p0Var, p0Var))));
            }
        } else {
            java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("visibility_result_select_label_list");
            if (stringArrayListExtra2 == null) {
                stringArrayListExtra2 = new java.util.ArrayList<>();
            }
            java.util.ArrayList<java.lang.String> stringArrayListExtra3 = intent.getStringArrayListExtra("visibility_result_select_contact_list");
            if (stringArrayListExtra3 == null) {
                stringArrayListExtra3 = new java.util.ArrayList<>();
            }
            java.util.ArrayList<java.lang.String> stringArrayListExtra4 = intent.getStringArrayListExtra("visibility_result_exclude_select_list");
            if (stringArrayListExtra4 == null) {
                stringArrayListExtra4 = new java.util.ArrayList<>();
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (java.lang.String str4 : stringArrayListExtra2) {
                java.lang.String g18 = ((b93.b) c93.a.a()).g(str4);
                if (g18 == null) {
                    g18 = "";
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str4);
                arrayList4.add(new com.p314xaae8f345.p2845xc516c4b6.sns.C24894x9c0cde7e(java.lang.Long.parseLong(str4), g18, new java.util.ArrayList()));
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            for (java.lang.String str5 : stringArrayListExtra3) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str5);
                arrayList5.add(new com.p314xaae8f345.p2845xc516c4b6.sns.C24893xdc70ceaa(str5, aVar.m(str5)));
            }
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            for (java.lang.String str6 : stringArrayListExtra4) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str6);
                arrayList6.add(new com.p314xaae8f345.p2845xc516c4b6.sns.C24893xdc70ceaa(str6, aVar.m(str6)));
            }
            com.p314xaae8f345.p2845xc516c4b6.sns.C24895xb892af52 c24895xb892af52 = new com.p314xaae8f345.p2845xc516c4b6.sns.C24895xb892af52(true, arrayList5, arrayList4, arrayList6);
            yz5.l lVar12 = this.f489706g;
            if (lVar12 != null) {
                lVar12.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(c24895xb892af52)));
            }
        }
        this.f489706g = null;
        return true;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        binding.mo137502xbf77c2e1(this);
        android.app.Activity mo137508x19263085 = binding.mo137508x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo137508x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        this.f489703d = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo137508x19263085;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24851x62a095fb.Companion companion = com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24851x62a095fb.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24851x62a095fb.Companion.m92045x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        this.f489703d = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        this.f489703d = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24851x62a095fb.Companion companion = com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24851x62a095fb.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24851x62a095fb.Companion.m92045x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        binding.mo137502xbf77c2e1(this);
        android.app.Activity mo137508x19263085 = binding.mo137508x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo137508x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        this.f489703d = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo137508x19263085;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24851x62a095fb
    /* renamed from: selectContact */
    public void mo92040x63d63384(java.util.List current, java.util.List excludeToSelect, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(current, "current");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(excludeToSelect, "excludeToSelect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (this.f489703d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PlatformSelectContactApiImpl", "selectContact >> activity is null");
            return;
        }
        this.f489704e = callback;
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f489703d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(abstractActivityC21394xb3d2c0cf);
        intent.putExtra("titile", abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jbt));
        intent.putExtra("snsPostWhoCanSee", true);
        intent.putExtra("snsUploadWhoCanSssToShowSaveLabel", false);
        com.p314xaae8f345.mm.ui.p2690x38b72420.i5.e();
        intent.putExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.g(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f288323k));
        if (!current.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = current.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.p314xaae8f345.p2845xc516c4b6.sns.C24893xdc70ceaa) it.next()).m92140x6bf53a6c());
            }
            intent.putExtra("already_select_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList, ","));
        }
        if (!excludeToSelect.isEmpty()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it6 = excludeToSelect.iterator();
            while (it6.hasNext()) {
                arrayList2.add(((com.p314xaae8f345.p2845xc516c4b6.sns.C24893xdc70ceaa) it6.next()).m92140x6bf53a6c());
            }
            intent.putExtra("exclude_select_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList2, ","));
        }
        intent.putExtra("KBlockOpenImFav", true);
        intent.putExtra("without_openim", true);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 81);
        intent.putExtra("max_limit_num", Integer.MAX_VALUE);
        intent.putExtra("menu_label", i65.a.r(this.f489703d, com.p314xaae8f345.mm.R.C30867xcad56011.f571885sk));
        j45.l.v(this.f489703d, ".ui.contact.SelectContactUI", intent, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2477xcdece81b.f7529x7d0fa359);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    @Override // com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24851x62a095fb
    /* renamed from: selectContactAndLabel */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo92041xd577701(byte[] r19, yz5.l r20) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: si0.t0.mo92041xd577701(byte[], yz5.l):void");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24851x62a095fb
    /* renamed from: selectContactWithVisibilityType */
    public void mo92042xd35ece76(long j17, java.util.List current, java.util.List excludeToSelect, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(current, "current");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(excludeToSelect, "excludeToSelect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (this.f489703d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PlatformSelectContactApiImpl", "selectContactWithVisibilityType >> activity is null");
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.p2845xc516c4b6.sns.C24896xf02403ef(false, kz5.p0.f395529d))));
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(current, 10));
        java.util.Iterator it = current.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.p314xaae8f345.p2845xc516c4b6.sns.C24893xdc70ceaa) it.next()).m92140x6bf53a6c());
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(excludeToSelect, 10));
        java.util.Iterator it6 = excludeToSelect.iterator();
        while (it6.hasNext()) {
            arrayList2.add(((com.p314xaae8f345.p2845xc516c4b6.sns.C24893xdc70ceaa) it6.next()).m92140x6bf53a6c());
        }
        this.f489707h = callback;
        int i17 = (int) j17;
        java.lang.String r17 = i17 == 3 ? i65.a.r(this.f489703d, com.p314xaae8f345.mm.R.C30867xcad56011.f575438ia) : i65.a.r(this.f489703d, com.p314xaae8f345.mm.R.C30867xcad56011.f575440pd);
        l.f fVar = (l.f) i95.n0.c(l.f.class);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f489703d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(abstractActivityC21394xb3d2c0cf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r17);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList);
        java.util.ArrayList arrayList4 = new java.util.ArrayList(arrayList2);
        i.b bVar = (i.b) fVar;
        bVar.getClass();
        android.content.Intent intent = new android.content.Intent(abstractActivityC21394xb3d2c0cf, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2724x335620.ActivityC22459x1ac69192.class);
        android.content.Intent a17 = bVar.a(abstractActivityC21394xb3d2c0cf, arrayList3, arrayList4);
        a17.putExtra("titile", r17);
        pf5.j0.a(a17, cj5.d1.class);
        if (i17 == 3) {
            a17.putExtra("key_confirm_menu_color", 1);
            a17.putExtra("key_check_box_color", 1);
        } else {
            a17.putExtra("key_confirm_menu_color", 0);
            a17.putExtra("key_check_box_color", 0);
        }
        if (!arrayList3.isEmpty()) {
            a17.putExtra("min_limit_num", -1);
        }
        pf5.j0.a(a17, cj5.n1.class);
        pf5.j0.a(a17, cj5.b3.class);
        android.os.Bundle extras = a17.getExtras();
        if (extras != null) {
            intent.putExtras(extras);
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList5.add(4011);
        arrayList5.add(intent);
        java.util.Collections.reverse(arrayList5);
        yj0.a.k(abstractActivityC21394xb3d2c0cf, arrayList5.toArray(), "com/tencent/mm/feature/combine/CombineEntranceService", "goToMvvmContactPage", "(Landroid/app/Activity;ILjava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24851x62a095fb
    /* renamed from: selectLabel */
    public void mo92043xbc31758(java.util.List current, java.util.List excludeToSelect, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(current, "current");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(excludeToSelect, "excludeToSelect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (this.f489703d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PlatformSelectContactApiImpl", "selectLabel >> activity is null");
            return;
        }
        this.f489705f = callback;
        android.content.Intent intent = new android.content.Intent();
        if (!current.isEmpty()) {
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
            java.util.Iterator it = current.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.String.valueOf(((com.p314xaae8f345.p2845xc516c4b6.sns.C24894x9c0cde7e) it.next()).m92153x3a08d6f9()));
            }
            intent.putStringArrayListExtra("label_id", arrayList);
        }
        if (!excludeToSelect.isEmpty()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(excludeToSelect, 10));
            java.util.Iterator it6 = excludeToSelect.iterator();
            while (it6.hasNext()) {
                arrayList2.add(java.lang.String.valueOf(((com.p314xaae8f345.p2845xc516c4b6.sns.C24894x9c0cde7e) it6.next()).m92153x3a08d6f9()));
            }
            intent.putStringArrayListExtra("contact_forbid_select_label_id_list", new java.util.ArrayList<>(arrayList2));
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f489703d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(abstractActivityC21394xb3d2c0cf);
        intent.setClassName(abstractActivityC21394xb3d2c0cf, "com.tencent.mm.plugin.label.ui.ContactLabelSelectUI");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = this.f489703d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(abstractActivityC21394xb3d2c0cf2);
        abstractActivityC21394xb3d2c0cf2.startActivityForResult(intent, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2477xcdece81b.f7528x16eb0541);
    }
}
