package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class l6 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.extension.reddot.ua f105675a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f105676b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f105677c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f105678d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f105679e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.WindowManager f105680f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f105681g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f105682h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f105683i;

    /* renamed from: j, reason: collision with root package name */
    public java.util.List f105684j;

    /* renamed from: k, reason: collision with root package name */
    public java.util.List f105685k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.ref.WeakReference f105686l;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f105687m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f105688n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f105689o;

    public l6(com.tencent.mm.plugin.finder.extension.reddot.ua controller) {
        kotlin.jvm.internal.o.g(controller, "controller");
        this.f105675a = controller;
        this.f105676b = "Finder.RedDotFreqCtrlWindow";
        this.f105677c = jz5.h.b(com.tencent.mm.plugin.finder.extension.reddot.c6.f105442d);
        this.f105678d = jz5.h.b(com.tencent.mm.plugin.finder.extension.reddot.b6.f105419d);
        jz5.h.b(com.tencent.mm.plugin.finder.extension.reddot.f6.f105517d);
        this.f105682h = jz5.h.b(com.tencent.mm.plugin.finder.extension.reddot.g6.f105538d);
        this.f105683i = jz5.h.b(com.tencent.mm.plugin.finder.extension.reddot.k6.f105628d);
        this.f105687m = jz5.h.b(new com.tencent.mm.plugin.finder.extension.reddot.e6(this));
        this.f105688n = jz5.h.b(com.tencent.mm.plugin.finder.extension.reddot.a6.f105341d);
        this.f105689o = jz5.h.b(com.tencent.mm.plugin.finder.extension.reddot.i6.f105594d);
    }

    public final java.util.Map a() {
        return (java.util.Map) ((jz5.n) this.f105677c).getValue();
    }

    public final java.lang.String b() {
        return (java.lang.String) ((jz5.n) this.f105689o).getValue();
    }

    public final com.tencent.mm.sdk.platformtools.c0 c() {
        return (com.tencent.mm.sdk.platformtools.c0) ((jz5.n) this.f105683i).getValue();
    }

    public final void d() {
        boolean z17;
        boolean z18 = false;
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f306225a;
        }
        if (z18) {
            pm0.v.X(new com.tencent.mm.plugin.finder.extension.reddot.d6(this));
        }
    }

    public final void e(boolean z17) {
        if (z17 != this.f105679e) {
            com.tencent.mars.xlog.Log.i(this.f105676b, "showing from:" + this.f105679e + " to " + z17);
        }
        this.f105679e = z17;
    }

    public final boolean f() {
        boolean z17;
        boolean z18;
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f306225a;
            z18 = false;
        }
        if (!z18) {
            return false;
        }
        if (this.f105679e) {
            return true;
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(context)) {
            pm0.v.X(new com.tencent.mm.plugin.finder.extension.reddot.h6(this, context));
            e(true);
            return true;
        }
        kotlin.jvm.internal.o.d(context);
        android.content.Intent intent = new android.content.Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", android.net.Uri.parse("package:" + context.getPackageName()));
        intent.setFlags(268435456);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/extension/reddot/FinderRedDotFreqCtrlWindow", "requestPermission", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/extension/reddot/FinderRedDotFreqCtrlWindow", "requestPermission", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v32, types: [java.lang.StringBuilder] */
    public final void g(com.tencent.mm.plugin.finder.extension.reddot.l5 freqController, r45.at2 freqConfig, java.util.Map nmMap, java.util.Map penalizedMap, java.util.Map businessTypePenalizedMap, java.util.List list, java.util.List list2, java.util.List list3) {
        boolean z17;
        boolean z18;
        boolean z19;
        java.util.ArrayList arrayList;
        ?? r76;
        java.util.ArrayList arrayList2;
        ?? r112;
        java.lang.String str;
        kotlin.jvm.internal.o.g(freqController, "freqController");
        kotlin.jvm.internal.o.g(freqConfig, "freqConfig");
        kotlin.jvm.internal.o.g(nmMap, "nmMap");
        kotlin.jvm.internal.o.g(penalizedMap, "penalizedMap");
        kotlin.jvm.internal.o.g(businessTypePenalizedMap, "businessTypePenalizedMap");
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f306225a;
            z18 = false;
        }
        if (z18) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("总开关:" + freqController.f105665q + '\n');
            sb6.append("nm配置:\n");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            java.util.LinkedList<r45.f90> d17 = com.tencent.mm.plugin.finder.extension.reddot.qa.d(freqConfig, 0, null, 3, null);
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(d17, 10));
            for (r45.f90 f90Var : d17) {
                arrayList3.add("(n:" + f90Var.getInteger(0) + " m:" + f90Var.getInteger(1) + ')');
            }
            sb7.append(arrayList3);
            sb7.append('\n');
            sb6.append(sb7.toString());
            java.util.LinkedList list4 = freqConfig.getList(4);
            boolean z27 = list4 == null || list4.isEmpty();
            jz5.g gVar = this.f105678d;
            if (!z27) {
                sb6.append("自定义nm配置:\n");
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                java.util.LinkedList list5 = freqConfig.getList(4);
                kotlin.jvm.internal.o.f(list5, "getBiz_control_items(...)");
                java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(list5, 10));
                java.util.Iterator it = list5.iterator();
                while (it.hasNext()) {
                    r45.gk gkVar = (r45.gk) it.next();
                    java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                    java.util.Iterator it6 = it;
                    java.lang.Object obj = (java.lang.String) ((java.util.Map) ((jz5.n) gVar).getValue()).get(java.lang.Integer.valueOf(gkVar.getInteger(2)));
                    if (obj == null) {
                        obj = java.lang.Integer.valueOf(gkVar.getInteger(2));
                    }
                    sb9.append(obj);
                    sb9.append(':');
                    java.util.LinkedList list6 = gkVar.getList(1);
                    kotlin.jvm.internal.o.f(list6, "getControl_items(...)");
                    java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(list6, 10));
                    for (java.util.Iterator it7 = list6.iterator(); it7.hasNext(); it7 = it7) {
                        r45.f90 f90Var2 = (r45.f90) it7.next();
                        arrayList5.add("n:" + f90Var2.getInteger(0) + " m:" + f90Var2.getInteger(1));
                    }
                    sb9.append(arrayList5);
                    sb9.append('\n');
                    arrayList4.add(sb9.toString());
                    it = it6;
                }
                sb8.append(arrayList4);
                sb8.append('\n');
                sb6.append(sb8.toString());
            }
            sb6.append("点击间隔:" + freqConfig.getInteger(1) + "s\n");
            sb6.append("最大可曝光红点:" + freqConfig.getInteger(2) + '\n');
            sb6.append(b());
            com.tencent.mm.plugin.finder.extension.reddot.l5 l5Var = (com.tencent.mm.plugin.finder.extension.reddot.l5) this.f105675a;
            if (l5Var.h()) {
                sb6.append("红点AI模型:\n");
                sb6.append(l5Var.s(a()));
            } else if (com.tencent.mm.plugin.finder.storage.aj0.f126440a.A()) {
                sb6.append("红点AI模型:\n");
                sb6.append(l5Var.s(a()));
                sb6.append("同屏限制策略:\n");
                sb6.append(l5Var.r((java.util.Map) ((jz5.n) gVar).getValue()));
            } else {
                sb6.append("同屏限制策略:\n");
                sb6.append(l5Var.r((java.util.Map) ((jz5.n) gVar).getValue()));
            }
            r45.sl0 sl0Var = (r45.sl0) freqConfig.getCustom(5);
            if (sl0Var != null) {
                sb6.append(b());
                sb6.append("豁免策略:\n");
                java.util.LinkedList list7 = sl0Var.getList(2);
                kotlin.jvm.internal.o.f(list7, "getBusiness_type_priorities(...)");
                java.util.ArrayList arrayList6 = new java.util.ArrayList(kz5.d0.q(list7, 10));
                java.util.Iterator it8 = list7.iterator();
                while (it8.hasNext()) {
                    arrayList6.add((java.lang.String) ((java.util.Map) ((jz5.n) gVar).getValue()).get((java.lang.Integer) it8.next()));
                }
                sb6.append(arrayList6);
                sb6.append("\t是否参与同屏计数:");
                sb6.append(sl0Var.getBoolean(1));
                sb6.append("\n");
            }
            sb6.append(b());
            sb6.append("参与频控的业务:\n");
            for (java.lang.String str3 : com.tencent.mm.plugin.finder.extension.reddot.l5.H.e()) {
                com.tencent.mm.plugin.finder.extension.reddot.g4 g4Var = com.tencent.mm.plugin.finder.extension.reddot.l5.H;
                if (com.tencent.mm.plugin.finder.extension.reddot.l5.L.contains(str3)) {
                    java.util.List list8 = (java.util.List) g4Var.d().get(str3);
                    if (list8 != null) {
                        java.util.Iterator it9 = list8.iterator();
                        while (it9.hasNext()) {
                            java.lang.String str4 = (java.lang.String) a().get(com.tencent.mm.plugin.finder.extension.reddot.l5.H.b(str3, ((java.lang.Number) it9.next()).intValue()));
                            if (str4 == null) {
                                str4 = str3;
                            }
                            sb6.append(str4.concat(";"));
                        }
                    }
                } else {
                    java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
                    java.lang.String str5 = (java.lang.String) a().get(str3);
                    if (str5 != null) {
                        str3 = str5;
                    }
                    sb10.append(str3);
                    sb10.append(';');
                    sb6.append(sb10.toString());
                }
            }
            sb6.append("\n");
            if (list != null) {
                sb6.append(b());
                sb6.append("【红点曝光】\n");
                java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
                java.util.ArrayList arrayList7 = new java.util.ArrayList(kz5.d0.q(list, 10));
                java.util.Iterator it10 = list.iterator();
                while (it10.hasNext()) {
                    arrayList7.add((java.lang.String) a().get(((r45.rc4) it10.next()).getString(2)));
                }
                sb11.append(arrayList7);
                sb11.append('\n');
                sb6.append(sb11.toString());
            }
            if (!(list2 == null || list2.isEmpty())) {
                sb6.append(b());
                sb6.append("【s级红点曝光】\n");
                java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
                java.util.ArrayList arrayList8 = new java.util.ArrayList(kz5.d0.q(list2, 10));
                java.util.Iterator it11 = list2.iterator();
                while (it11.hasNext()) {
                    arrayList8.add((java.lang.String) a().get(((r45.rc4) it11.next()).getString(2)));
                }
                sb12.append(arrayList8);
                sb12.append('\n');
                sb6.append(sb12.toString());
            }
            if (!(list3 == null || list3.isEmpty())) {
                sb6.append(b());
                sb6.append("【豁免红点曝光】\n");
                java.lang.StringBuilder sb13 = new java.lang.StringBuilder();
                java.util.ArrayList arrayList9 = new java.util.ArrayList(kz5.d0.q(list3, 10));
                java.util.Iterator it12 = list3.iterator();
                while (it12.hasNext()) {
                    arrayList9.add((java.lang.String) a().get(((r45.rc4) it12.next()).getString(2)));
                }
                sb13.append(arrayList9);
                sb13.append('\n');
                sb6.append(sb13.toString());
            }
            sb6.append(b());
            sb6.append("【当前业务曝光次数和惩罚次数】\n");
            for (java.lang.String str6 : com.tencent.mm.plugin.finder.extension.reddot.l5.H.e()) {
                java.util.Collection values = nmMap.values();
                java.util.ArrayList arrayList10 = new java.util.ArrayList();
                for (java.lang.Object obj2 : values) {
                    if (kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.finder.extension.reddot.pb) obj2).field_findTabRedDotPath, str6)) {
                        arrayList10.add(obj2);
                    }
                }
                if (!arrayList10.isEmpty()) {
                    int size = arrayList10.size();
                    sb6.append("[");
                    java.util.Iterator it13 = arrayList10.iterator();
                    int i17 = 0;
                    while (it13.hasNext()) {
                        java.lang.Object next = it13.next();
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        com.tencent.mm.plugin.finder.extension.reddot.pb pbVar = (com.tencent.mm.plugin.finder.extension.reddot.pb) next;
                        java.lang.StringBuilder sb14 = new java.lang.StringBuilder();
                        sb14.append((java.lang.String) a().get(pbVar.field_dicPath));
                        sb14.append(" n=");
                        sb14.append(pbVar.field_exposeCnt.getInteger(0));
                        sb14.append(" m=");
                        sb14.append(pbVar.field_banCnt.getInteger(0));
                        int i19 = pbVar.field_exposeCntLimit;
                        int i27 = pbVar.field_exposeCntStrategy;
                        if (i19 > 0) {
                            java.lang.StringBuilder sb15 = new java.lang.StringBuilder(" 展示");
                            sb15.append(i19);
                            sb15.append("次后");
                            sb15.append(i27 != 1 ? i27 != 2 ? "do nothing" : "删除" : "刷新");
                            str = sb15.toString();
                        } else {
                            str = "";
                        }
                        sb14.append(str);
                        sb6.append(sb14.toString());
                        if (i17 < size - 1) {
                            sb6.append("\n");
                        }
                        i17 = i18;
                    }
                    sb6.append("]\n");
                }
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry entry : penalizedMap.entrySet()) {
                if (((r45.oc4) entry.getValue()).getBoolean(0)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if ((!businessTypePenalizedMap.isEmpty()) || (!linkedHashMap.isEmpty())) {
                sb6.append(b());
                sb6.append("【子业务当前被惩罚的队列】\n");
                java.lang.StringBuilder sb16 = new java.lang.StringBuilder();
                java.util.ArrayList arrayList11 = new java.util.ArrayList(businessTypePenalizedMap.size());
                for (java.util.Map.Entry entry2 : businessTypePenalizedMap.entrySet()) {
                    java.lang.StringBuilder sb17 = new java.lang.StringBuilder();
                    sb17.append((java.lang.String) a().get(entry2.getKey()));
                    sb17.append(" 队列=");
                    java.util.LinkedList list9 = ((com.tencent.mm.plugin.finder.extension.reddot.pb) entry2.getValue()).field_businessTypeBanModel.getList(1);
                    kotlin.jvm.internal.o.f(list9, "getBanPathList(...)");
                    java.util.ArrayList arrayList12 = new java.util.ArrayList(kz5.d0.q(list9, 10));
                    java.util.Iterator it14 = list9.iterator();
                    while (it14.hasNext()) {
                        arrayList12.add((java.lang.String) a().get((java.lang.String) it14.next()));
                    }
                    sb17.append(arrayList12);
                    sb17.append(" 指针=");
                    sb17.append(((com.tencent.mm.plugin.finder.extension.reddot.pb) entry2.getValue()).field_businessTypeBanModel.getInteger(0));
                    sb17.append('\n');
                    arrayList11.add(sb17.toString());
                }
                z19 = false;
                sb16.append(arrayList11);
                sb16.append('\n');
                sb6.append(sb16.toString());
            } else {
                z19 = false;
            }
            if (!linkedHashMap.isEmpty()) {
                sb6.append(b());
                sb6.append("【发现页期间被惩罚业务】\n");
                java.lang.StringBuilder sb18 = new java.lang.StringBuilder();
                java.util.ArrayList arrayList13 = new java.util.ArrayList(linkedHashMap.size());
                java.util.Iterator it15 = linkedHashMap.entrySet().iterator();
                while (it15.hasNext()) {
                    arrayList13.add((java.lang.String) a().get(((java.util.Map.Entry) it15.next()).getKey()));
                }
                sb18.append(arrayList13);
                sb18.append('\n');
                sb6.append(sb18.toString());
            }
            java.util.List list10 = this.f105685k;
            if (!((list10 == null || list10.isEmpty()) ? true : z19)) {
                sb6.append(b());
                sb6.append("【超过最大曝光数被丢弃】\n");
                java.lang.StringBuilder sb19 = new java.lang.StringBuilder();
                java.util.List<jz5.l> list11 = this.f105685k;
                if (list11 != null) {
                    arrayList2 = new java.util.ArrayList(kz5.d0.q(list11, 10));
                    for (jz5.l lVar : list11) {
                        boolean containsKey = c().f192491b.containsKey(lVar.f302834e);
                        java.lang.Object obj3 = lVar.f302833d;
                        if (containsKey) {
                            java.lang.String str7 = (java.lang.String) a().get(obj3);
                            if (str7 == null) {
                                str7 = "";
                            }
                            r112 = new java.lang.StringBuilder(str7);
                            r112.append(" [高优(");
                            java.util.List<jz5.l> list12 = (java.util.List) c().b(lVar.f302834e);
                            if (list12 != null) {
                                for (jz5.l lVar2 : list12) {
                                    r112.append((java.lang.String) a().get(lVar2.f302833d));
                                    r112.append("_");
                                    r112.append(lVar2.f302834e);
                                }
                            }
                            r112.append(" )]");
                        } else {
                            r112 = a().get(obj3);
                        }
                        arrayList2.add(r112);
                    }
                } else {
                    arrayList2 = null;
                }
                sb19.append(arrayList2);
                sb19.append("}\n");
                sb6.append(sb19.toString());
            }
            java.util.List list13 = this.f105684j;
            if (list13 == null || ((java.util.ArrayList) list13).isEmpty()) {
                z19 = true;
            }
            if (!z19) {
                sb6.append(b());
                sb6.append("【最近一次接收时超过最大曝光数被丢弃】\n");
                java.lang.StringBuilder sb20 = new java.lang.StringBuilder();
                java.util.List list14 = this.f105684j;
                if (list14 != null) {
                    arrayList = new java.util.ArrayList(kz5.d0.q(list14, 10));
                    java.util.Iterator it16 = ((java.util.ArrayList) list14).iterator();
                    while (it16.hasNext()) {
                        jz5.l lVar3 = (jz5.l) it16.next();
                        boolean containsKey2 = c().f192491b.containsKey(lVar3.f302834e);
                        java.lang.Object obj4 = lVar3.f302833d;
                        if (containsKey2) {
                            java.lang.String str8 = (java.lang.String) a().get(obj4);
                            if (str8 == null) {
                                str8 = "";
                            }
                            r76 = new java.lang.StringBuilder(str8);
                            r76.append(" 高优(");
                            java.util.List<jz5.l> list15 = (java.util.List) c().b(lVar3.f302834e);
                            if (list15 != null) {
                                for (jz5.l lVar4 : list15) {
                                    r76.append((java.lang.String) a().get(lVar4.f302833d));
                                    r76.append(lVar4.f302834e);
                                }
                            }
                            r76.append(" )");
                        } else {
                            r76 = a().get(obj4);
                        }
                        arrayList.add(r76);
                    }
                } else {
                    arrayList = null;
                }
                sb20.append(arrayList);
                sb20.append("}\n");
                sb6.append(sb20.toString());
            }
            pm0.v.X(new com.tencent.mm.plugin.finder.extension.reddot.j6(this, sb6));
        }
    }
}
