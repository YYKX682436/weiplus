package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes8.dex */
public class h5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.b5 f280677d;

    public h5(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.b5 b5Var) {
        this.f280677d = b5Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/ChattingMoreComponent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.b5 b5Var = this.f280677d;
        sb5.z zVar = (sb5.z) b5Var.f280113d.f542241c.a(sb5.z.class);
        if (zVar == null || ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar).L0() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingMoreBtnBarHelper", "ignore click del btn, selected items count is 0");
            yj0.a.h(this, "com/tencent/mm/ui/chatting/component/ChattingMoreComponent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.util.List p07 = b5Var.p0();
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.u(p07)) {
            db5.e1.y(b5Var.f280113d.g(), b5Var.f280113d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bkp), "", b5Var.f280113d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571241h), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.i5(this));
            yj0.a.h(this, "com/tencent/mm/ui/chatting/component/ChattingMoreComponent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.v(p07)) {
            db5.e1.y(b5Var.f280113d.g(), b5Var.f280113d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bkq), "", b5Var.f280113d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571241h), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.j5(this));
            yj0.a.h(this, "com/tencent/mm/ui/chatting/component/ChattingMoreComponent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.t(p07)) {
            db5.e1.y(b5Var.f280113d.g(), b5Var.f280113d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bko), "", b5Var.f280113d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571241h), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.k5(this));
            yj0.a.h(this, "com/tencent/mm/ui/chatting/component/ChattingMoreComponent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        ac5.f fVar = ac5.f.f84623a;
        yb5.d dVar = b5Var.f280113d;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = b5Var.f280230h;
        yz5.a aVar = new yz5.a() { // from class: com.tencent.mm.ui.chatting.component.h5$$a
            @Override // yz5.a
            /* renamed from: invoke */
            public final java.lang.Object mo152xb9724478() {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.h5.this.f280677d.o0();
                return null;
            }
        };
        boolean w17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.w(p07);
        if (dVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingEditModeSendToOtherApp", "do send to mail fail, context is null");
        } else {
            if (!(p07.isEmpty())) {
                if (z3Var == null || ((int) z3Var.E2) <= 0) {
                    str = "(Landroid/view/View;)V";
                    str2 = "onClick";
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingEditModeSendToOtherApp", "do send to mail fail, contact error");
                } else {
                    android.app.Activity g17 = dVar.g();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g17);
                    java.lang.String b17 = fVar.b(g17, z3Var);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingEditModeSendToOtherApp", "gen subject fail");
                    } else {
                        bc5.e eVar = new bc5.e(g17, p07, z3Var);
                        eVar.f100728k = b17;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.util.HashSet hashSet = new java.util.HashSet();
                        str = "(Landroid/view/View;)V";
                        hashSet.add(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
                        android.content.Intent a17 = fVar.a(eVar);
                        str2 = "onClick";
                        java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = g17.getPackageManager().queryIntentActivities(a17, 131072);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(queryIntentActivities);
                        java.util.Iterator it = queryIntentActivities.iterator();
                        while (it.hasNext()) {
                            android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo) it.next();
                            java.util.Iterator it6 = it;
                            if (!hashSet.contains(resolveInfo.activityInfo.packageName)) {
                                hashSet.add(resolveInfo.activityInfo.packageName);
                                arrayList2.add(new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b(resolveInfo, a17));
                            }
                            it = it6;
                        }
                        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g2 g2Var = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g2("wechat/multi_send", null);
                        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.f2 f2Var = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.f2();
                        f2Var.f270830a = arrayList2;
                        f2Var.f270831b = new ac5.b(eVar);
                        f2Var.f270833d = a17;
                        if (w17) {
                            f2Var.f270832c = new ac5.d(dVar, g17);
                        }
                        java.util.Map map = f2Var.f270834e;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        for (java.lang.Object obj : p07) {
                            if (((com.p314xaae8f345.mm.p2621x8fb0427b.f9) obj) != null) {
                                arrayList3.add(obj);
                            }
                        }
                        java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(arrayList3, 10));
                        java.util.Iterator it7 = arrayList3.iterator();
                        while (it7.hasNext()) {
                            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it7.next();
                            java.util.Iterator it8 = it7;
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{\"msgid\":");
                            sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.I0()) : null);
                            sb6.append(";\"msg_type\":");
                            sb6.append(f9Var != null ? java.lang.Integer.valueOf(g95.e0.e(f9Var)) : null);
                            sb6.append(";\"inner_msg_type\":");
                            sb6.append(f9Var != null ? java.lang.Integer.valueOf(g95.e0.b(f9Var)) : null);
                            sb6.append(";\"send_time\":");
                            sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.mo78012x3fdd41df()) : null);
                            sb6.append('}');
                            arrayList4.add(sb6.toString());
                            it7 = it8;
                        }
                        map.put("selected_msg_list", kz5.n0.g0(arrayList4, "#", null, null, 0, null, null, 62, null));
                        java.util.LinkedList linkedList = (java.util.LinkedList) p07;
                        map.put("selected_how_many_msgs_to_forward", java.lang.Integer.valueOf(linkedList.size()));
                        g2Var.f270851k = f2Var;
                        g2Var.f270850j = aVar;
                        g2Var.f270848h = 7;
                        g2Var.f270846f = z3Var.d1();
                        ((jb0.g) ((jt.x) i95.n0.c(jt.x.class))).Ri(g17, g2Var.f270848h, new ac5.a(g17, g2Var, eVar));
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10811, 9, java.lang.Integer.valueOf(linkedList.size()));
                    }
                }
                tb5.i0.f498588a.c(p07, ya.a.f77453x4b357bf, b5Var.f280113d.x(), b5Var.f280236q);
                yj0.a.h(this, "com/tencent/mm/ui/chatting/component/ChattingMoreComponent$3", "android/view/View$OnClickListener", str2, str);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingEditModeSendToOtherApp", "do send to mail fail, select item empty");
        }
        str = "(Landroid/view/View;)V";
        str2 = "onClick";
        tb5.i0.f498588a.c(p07, ya.a.f77453x4b357bf, b5Var.f280113d.x(), b5Var.f280236q);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/ChattingMoreComponent$3", "android/view/View$OnClickListener", str2, str);
    }
}
