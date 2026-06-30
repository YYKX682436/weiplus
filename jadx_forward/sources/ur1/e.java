package ur1;

/* loaded from: classes11.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final ur1.e f511879d = new ur1.e();

    /* renamed from: a, reason: collision with root package name */
    public long f511880a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.LinkedList f511881b;

    /* renamed from: c, reason: collision with root package name */
    public final int f511882c = hashCode();

    public final void a(boolean z17, int i17) {
        ((ox.r) ((rm.d0) i95.n0.c(rm.d0.class))).Bi(i17).a(z17, ur1.a.f511873a);
    }

    public final com.p314xaae8f345.p2845xc516c4b6.biz.C23312x5ae3794e b(android.content.Context context) {
        java.lang.String h5_url;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.util.LinkedList linkedList = ur1.n.f511894a.b().f467355f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linkedList);
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            r45.jv jvVar = (r45.jv) it.next();
            java.util.LinkedList cell_list = jvVar.f459655d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cell_list, "cell_list");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : cell_list) {
                int i17 = ((r45.kv) obj).f460503d;
                ur1.l[] lVarArr = ur1.l.f511892d;
                if (i17 == 1 || i17 == 2 || i17 == 3) {
                    arrayList.add(obj);
                }
            }
            jvVar.f459655d = new java.util.LinkedList(arrayList);
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        java.util.Iterator it6 = linkedList.iterator();
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        while (it6.hasNext()) {
            java.util.LinkedList cell_list2 = ((r45.jv) it6.next()).f459655d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cell_list2, "cell_list");
            java.util.Iterator it7 = cell_list2.iterator();
            while (it7.hasNext()) {
                int i18 = ((r45.kv) it7.next()).f460504e;
                ur1.k[] kVarArr = ur1.k.f511891d;
                if (i18 == 1) {
                    z17 = true;
                } else if (i18 == 6) {
                    z18 = true;
                } else if (i18 == 7) {
                    z19 = true;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterPersonalCenterMgr", "myMessageOk = " + z17 + ", notificationOk = " + z18 + ", settingOk = " + z19);
        if ((z17 && z18 && z19) ? false : true) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6343xb4b9b8d1 c6343xb4b9b8d1 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6343xb4b9b8d1();
            c6343xb4b9b8d1.f136934d = 102L;
            c6343xb4b9b8d1.k();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizFlutterPersonalCenterMgr", "triggerRedLine!");
            r45.jv jvVar2 = new r45.jv();
            java.util.LinkedList linkedList2 = jvVar2.f459655d;
            r45.kv kvVar = new r45.kv();
            ur1.k[] kVarArr2 = ur1.k.f511891d;
            kvVar.f460504e = 1;
            kvVar.f460508i = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.alp);
            ur1.l[] lVarArr2 = ur1.l.f511892d;
            kvVar.f460503d = 1;
            linkedList2.add(kvVar);
            r45.jv jvVar3 = new r45.jv();
            java.util.LinkedList linkedList3 = jvVar3.f459655d;
            r45.kv kvVar2 = new r45.kv();
            kvVar2.f460504e = 6;
            kvVar2.f460508i = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.alr);
            kvVar2.f460503d = 1;
            linkedList3.add(kvVar2);
            java.util.LinkedList linkedList4 = jvVar3.f459655d;
            r45.kv kvVar3 = new r45.kv();
            kvVar3.f460504e = 7;
            kvVar3.f460508i = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.alt);
            kvVar3.f460503d = 1;
            linkedList4.add(kvVar3);
            java.util.LinkedList linkedList5 = new java.util.LinkedList();
            linkedList5.add(jvVar2);
            linkedList5.add(jvVar3);
            linkedList = linkedList5;
        } else {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6343xb4b9b8d1 c6343xb4b9b8d12 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6343xb4b9b8d1();
            c6343xb4b9b8d12.f136934d = 101L;
            c6343xb4b9b8d12.k();
        }
        this.f511881b = linkedList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.LinkedList linkedList6 = this.f511881b;
        if (linkedList6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cellGroupList");
            throw null;
        }
        java.util.Iterator it8 = linkedList6.iterator();
        while (it8.hasNext()) {
            r45.jv jvVar4 = (r45.jv) it8.next();
            java.util.LinkedList cell_list3 = jvVar4.f459655d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cell_list3, "cell_list");
            if (!cell_list3.isEmpty()) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.LinkedList<r45.kv> cell_list4 = jvVar4.f459655d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cell_list4, "cell_list");
                for (r45.kv kvVar4 : cell_list4) {
                    int i19 = kvVar4.f460503d;
                    ur1.l[] lVarArr3 = ur1.l.f511892d;
                    if (i19 == 2) {
                        h5_url = kvVar4.f460505f;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h5_url, "h5_url");
                    } else {
                        h5_url = "";
                    }
                    com.p314xaae8f345.p2845xc516c4b6.biz.C23311xc5842fa6.Companion companion = com.p314xaae8f345.p2845xc516c4b6.biz.C23311xc5842fa6.INSTANCE;
                    java.lang.Object[] objArr = new java.lang.Object[4];
                    objArr[0] = kvVar4.f460508i;
                    int i27 = kvVar4.f460504e;
                    ur1.k[] kVarArr3 = ur1.k.f511891d;
                    objArr[1] = java.lang.Boolean.valueOf(i27 == 7);
                    objArr[2] = java.lang.Integer.valueOf(kvVar4.f460504e);
                    objArr[3] = h5_url;
                    arrayList3.add(companion.m86020xb5cc5768(kz5.c0.k(objArr)));
                }
                arrayList2.add(com.p314xaae8f345.p2845xc516c4b6.biz.C23310x8939fc78.INSTANCE.m86004xb5cc5768(kz5.b0.c(arrayList3)));
            }
        }
        com.p314xaae8f345.p2845xc516c4b6.biz.C23312x5ae3794e.Companion companion2 = com.p314xaae8f345.p2845xc516c4b6.biz.C23312x5ae3794e.INSTANCE;
        java.lang.Object[] objArr2 = new java.lang.Object[2];
        objArr2[0] = arrayList2;
        objArr2[1] = java.lang.Boolean.valueOf(ur1.n.f511894a.b().f467359m == 1);
        return companion2.m86032xb5cc5768(kz5.c0.i(objArr2));
    }

    public final void c(long j17, long j18, long j19, java.lang.String biz, boolean z17, java.lang.String wording, long j27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(biz, "biz");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wording, "wording");
        byte[] decode = android.util.Base64.decode(biz, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decode, "decode(...)");
        long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(new java.lang.String(decode, r26.c.f450398a), 0L);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        boolean l17 = su4.r2.l();
        long j28 = this.f511880a;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6343xb4b9b8d1 c6343xb4b9b8d1 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6343xb4b9b8d1();
        c6343xb4b9b8d1.f136934d = j17;
        c6343xb4b9b8d1.f136935e = j18;
        c6343xb4b9b8d1.f136936f = j28;
        c6343xb4b9b8d1.f136937g = j19;
        c6343xb4b9b8d1.f136938h = V;
        c6343xb4b9b8d1.f136939i = l17 ? 1L : 0L;
        c6343xb4b9b8d1.f136940j = z17 ? 1L : 0L;
        c6343xb4b9b8d1.f136941k = com.p314xaae8f345.mm.p2621x8fb0427b.c2.f275336a;
        c6343xb4b9b8d1.f136942l = j27;
        c6343xb4b9b8d1.f136943m = c6343xb4b9b8d1.b("wording", wording, true);
        c6343xb4b9b8d1.k();
    }

    public final void d(android.content.Context context, int i17, int i18, com.p314xaae8f345.p2845xc516c4b6.biz.C23089x8c6e5ca2 c23089x8c6e5ca2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.util.LinkedList linkedList = this.f511881b;
        if (linkedList == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cellGroupList");
            throw null;
        }
        java.lang.Object element = ((r45.jv) linkedList.get(i17)).f459655d.get(i18);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6343xb4b9b8d1 c6343xb4b9b8d1 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6343xb4b9b8d1();
        c6343xb4b9b8d1.f136934d = 1L;
        r45.kv kvVar = (r45.kv) element;
        c6343xb4b9b8d1.f136935e = kvVar.f460504e;
        c6343xb4b9b8d1.f136936f = c6343xb4b9b8d1.f136941k;
        c6343xb4b9b8d1.k();
        int i19 = kvVar.f460503d;
        ur1.l[] lVarArr = ur1.l.f511892d;
        if (i19 == 2) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(element, "element");
            r45.kv kvVar2 = (r45.kv) element;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterPersonalCenterMgr", "jump2Web");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kvVar2.f460505f)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizFlutterPersonalCenterMgr", "gotoWebView url is null!");
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", kvVar2.f460505f);
            intent.putExtra("KRightBtn", !kvVar2.f460509m);
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
            return;
        }
        ur1.l[] lVarArr2 = ur1.l.f511892d;
        if (i19 != 3) {
            ur1.l[] lVarArr3 = ur1.l.f511892d;
            if (i19 == 1) {
                int i27 = kvVar.f460504e;
                ur1.k[] kVarArr = ur1.k.f511891d;
                if (i27 == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterPersonalCenterMgr", "jump2MyBiz");
                    ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).bj(context, 1);
                    return;
                }
                ur1.k[] kVarArr2 = ur1.k.f511891d;
                if (i27 == 2) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(element, "element");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterPersonalCenterMgr", "jump2RecentRead");
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.addFlags(67108864);
                    intent2.putExtra("biz_time_line_line_session_id", this.f511880a);
                    j45.l.j(context, "brandservice", ".ui.personalcenter.recentread.BizPCRecentReadUI", intent2, null);
                    return;
                }
                ur1.k[] kVarArr3 = ur1.k.f511891d;
                if (i27 == 6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterPersonalCenterMgr", "jump2Notification");
                    ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).fj(context, 1, 0);
                    return;
                }
                ur1.k[] kVarArr4 = ur1.k.f511891d;
                if (i27 == 7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterPersonalCenterMgr", "jump2Setting");
                    if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                        j45.l.w((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context, "com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI", new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.ActivityC13008x3fe6d8d0.class), this.f511882c, new ur1.c(this, c23089x8c6e5ca2));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(element, "element");
        r45.kv kvVar3 = (r45.kv) element;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterPersonalCenterMgr", "jump2Wxa");
        if (kvVar3.f460510n == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterPersonalCenterMgr", "cellInfo.weapp_info == null");
            return;
        }
        l81.b1 b1Var = new l81.b1();
        r45.bn bnVar = kvVar3.f460510n;
        java.lang.String str = bnVar.f452410d;
        b1Var.f398547b = str;
        b1Var.f398545a = bnVar.f452411e;
        b1Var.f398555f = bnVar.f452412f;
        b1Var.f398551d = bnVar.f452417n;
        b1Var.f398549c = bnVar.f452414h;
        b1Var.f398567l = bnVar.f452415i;
        int i28 = bnVar.f452413g;
        if (i28 == 0) {
            i28 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.e.f33379x366c91de;
        }
        b1Var.f398565k = i28;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98();
        b1Var.f398574s = c11812xa040dc98;
        c11812xa040dc98.f158856e = str;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = bnVar.f452416m;
        c11812xa040dc98.f158857f = gVar != null ? gVar.toString() : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterPersonalCenterMgr", "WeAppOpenBundle init, appid = " + b1Var.f398547b + ", username = " + b1Var.f398545a + ", enterPath = " + b1Var.f398555f + ", versionType = " + b1Var.f398549c);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(context, b1Var);
    }
}
