package d83;

/* loaded from: classes15.dex */
public final class t implements com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf.ReceiveAppMessageEvent {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d83.u f308553a;

    public t(d83.u uVar) {
        this.f308553a = uVar;
    }

    @Override // com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf.ReceiveAppMessageEvent
    /* renamed from: event */
    public final void mo22172x5c6729a(com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3033x6ae4bab4 c3033x6ae4bab4) {
        java.util.LinkedList<com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3032x6ae38529> m23410x2fe80655;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkFeatureService", "onReceiveAppMessageEvent!");
        if (c3033x6ae4bab4 != null && (m23410x2fe80655 = c3033x6ae4bab4.m23410x2fe80655()) != null) {
            java.util.Iterator<T> it = m23410x2fe80655.iterator();
            while (it.hasNext()) {
                e83.s sVar = (e83.s) e83.s.f331764i.mo20642x92b714fd(((com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3032x6ae38529) it.next()).m23376x76847043().g());
                byte[] decode = android.util.Base64.decode(sVar.m127175x76847043(), 2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkFeatureService", "onReceiveAppMessageEvent cmd:" + sVar.g());
                boolean equals = sVar.g().equals("ILINK_SDK_LITEAPP_RESOURCE_UPDATE");
                d83.u uVar = this.f308553a;
                if (equals) {
                    e83.y yVar = (e83.y) e83.y.f331784i.mo20642x92b714fd(decode);
                    java.util.ArrayList<e70.x> arrayList = new java.util.ArrayList();
                    java.util.List<e83.h0> list = yVar.f331787f;
                    if (list != null) {
                        for (e83.h0 h0Var : list) {
                            java.lang.String g17 = h0Var.g();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getResourceName(...)");
                            arrayList.add(new e70.x(g17, h0Var.f331679f));
                        }
                    }
                    java.util.Iterator it6 = uVar.f308570o.entrySet().iterator();
                    while (it6.hasNext()) {
                        e70.y yVar2 = (e70.y) ((java.util.Map.Entry) it6.next()).getValue();
                        java.lang.String i17 = yVar.i();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(i17, "getProjectId(...)");
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.c0) yVar2).getClass();
                        boolean equals2 = i17.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37141xc474b466);
                        java.lang.String str = "onReceiveCheckResource projectId: %s, ilinkVersion: %d, resourceVersion: %d";
                        java.lang.String str2 = com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29;
                        java.lang.String str3 = "MicroMsg.AppLite.LiteAppCheckerListener";
                        if (equals2) {
                            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef u17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().u(null);
                            int i18 = u17 != null ? u17.f14326x26947355 : 0;
                            if (arrayList.isEmpty()) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppLite.LiteAppCheckerListener", "onReceiveCheckResource resources.count = 0, projectId: ".concat(i17));
                                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().h(null);
                            } else {
                                for (e70.x xVar : arrayList) {
                                    if (xVar.f331399a.equals(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29)) {
                                        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
                                        int i19 = xVar.f331400b;
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppLite.LiteAppCheckerListener", "onReceiveCheckResource projectId: %s, ilinkVersion: %d, resourceVersion: %d", i17, valueOf, java.lang.Integer.valueOf(i19));
                                        if (i18 < i19) {
                                            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().h(null);
                                        }
                                    }
                                }
                            }
                        } else {
                            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 y17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().y(i17, null);
                            int i27 = y17 != null ? y17.f14362x26947355 : 0;
                            if (arrayList.isEmpty()) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppLite.LiteAppCheckerListener", "onReceiveCheckResource resources.count = 0, projectId: ".concat(i17));
                                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().l(i17, false, 3, 0L, null, null);
                            } else {
                                for (e70.x xVar2 : arrayList) {
                                    if (xVar2.f331399a.equals(str2)) {
                                        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i27);
                                        int i28 = xVar2.f331400b;
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, str, i17, valueOf2, java.lang.Integer.valueOf(i28));
                                        if (i27 < i28) {
                                            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().l(i17, false, 3, 0L, null, null);
                                            i17 = i17;
                                            str3 = str3;
                                            str = str;
                                            str2 = str2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (sVar.g().equals("ILINK_SDK_RESOURCE_BUGFIX_CDN")) {
                    r45.mq6 mq6Var = new r45.mq6();
                    mq6Var.mo11468x92b714fd(decode);
                    f83.b bVar = new f83.b();
                    bVar.f69720xb554b1ee = 0;
                    bVar.f69717x65481d0f = mq6Var.f462283d;
                    bVar.f69719xf53faade = mq6Var.f462284e;
                    bVar.f69724x8a60a7a5 = mq6Var.f462286g;
                    bVar.f69721xf5421054 = mq6Var.f462287h;
                    bVar.f69725x4b6e88aa = mq6Var.f462289m;
                    bVar.f69716x4b6e68b9 = mq6Var.f462288i;
                    bVar.f69695xac3be4e = java.lang.System.currentTimeMillis();
                    bVar.f69722x2d8daf48 = mq6Var.f462295s;
                    r45.qk0 qk0Var = mq6Var.f462297u;
                    if (qk0Var != null) {
                        bVar.f69709x80b7fe93 = qk0Var.f465602d;
                        bVar.f69710xc1764fdd = qk0Var.f465603e;
                        java.lang.String str4 = qk0Var.f465604f;
                        if (str4 == null) {
                            str4 = "";
                        }
                        bVar.f69713x5efdd93e = str4;
                        java.lang.String str5 = qk0Var.f465605g;
                        if (str5 == null) {
                            str5 = "";
                        }
                        bVar.f69715x5efdf92f = str5;
                        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = qk0Var.f465606h;
                        bVar.f69712x5efdd21f = gVar != null ? gVar.g() : null;
                        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = qk0Var.f465607i;
                        bVar.f69711xface616d = gVar2 != null ? gVar2.g() : null;
                        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = qk0Var.f465608m;
                        bVar.f69714x5efdf35a = gVar3 != null ? gVar3.g() : null;
                        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = qk0Var.f465609n;
                        bVar.f69708x5efdac04 = gVar4 != null ? gVar4.g() : null;
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    int size = mq6Var.f462294r.f463989d.size();
                    for (int i29 = 0; i29 < size; i29++) {
                        arrayList2.add(kz5.b1.e(new jz5.l(((r45.yq6) mq6Var.f462294r.f463989d.get(i29)).f472841d, ((r45.yq6) mq6Var.f462294r.f463989d.get(i29)).f472842e)));
                    }
                    bVar.v0(arrayList2);
                    bVar.f69694x9e1e902 = mq6Var.f462285f;
                    bVar.f69696x17f1b99d = mq6Var.f462290n;
                    bVar.f69706x17f9df4b = mq6Var.f462291o;
                    java.lang.String str6 = mq6Var.f462292p;
                    if (str6 == null) {
                        str6 = "";
                    }
                    bVar.f69705xd77b94f4 = str6;
                    java.lang.String str7 = mq6Var.f462293q;
                    if (str7 == null) {
                        str7 = "";
                    }
                    bVar.f69707xd77bb4e5 = str7;
                    r45.qk0 qk0Var2 = mq6Var.f462296t;
                    if (qk0Var2 != null) {
                        bVar.f69698x9e9ebfce = qk0Var2.f465602d;
                        bVar.f69699x1f53fb98 = qk0Var2.f465603e;
                        java.lang.String str8 = qk0Var2.f465604f;
                        if (str8 == null) {
                            str8 = "";
                        }
                        bVar.f69702x3eec84a3 = str8;
                        java.lang.String str9 = qk0Var2.f465605g;
                        bVar.f69704x3eeca494 = str9 != null ? str9 : "";
                        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = qk0Var2.f465606h;
                        bVar.f69701x3eec7d84 = gVar5 != null ? gVar5.g() : null;
                        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar6 = qk0Var2.f465607i;
                        bVar.f69700x4c5a3568 = gVar6 != null ? gVar6.g() : null;
                        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar7 = qk0Var2.f465608m;
                        bVar.f69703x3eec9ebf = gVar7 != null ? gVar7.g() : null;
                        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar8 = qk0Var2.f465609n;
                        bVar.f69697x3eec5769 = gVar8 != null ? gVar8.g() : null;
                    }
                    java.util.Iterator it7 = uVar.f308570o.entrySet().iterator();
                    while (it7.hasNext()) {
                        ((e70.y) ((java.util.Map.Entry) it7.next()).getValue()).getClass();
                    }
                } else if (!sVar.g().equals("ILINK_SDK_RESOURCE_RULE_MATCH_CDN")) {
                    if (sVar.g().equals("ILINK_SDK_RESOURCE_CHECK_UPDATE_BACKEND")) {
                        r45.nq6 nq6Var = new r45.nq6();
                        nq6Var.mo11468x92b714fd(decode);
                        java.util.Iterator it8 = uVar.f308570o.entrySet().iterator();
                        while (it8.hasNext()) {
                            e70.y yVar3 = (e70.y) ((java.util.Map.Entry) it8.next()).getValue();
                            java.lang.String project_id = nq6Var.f463141d;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(project_id, "project_id");
                            java.util.LinkedList resource_name = nq6Var.f463142e;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resource_name, "resource_name");
                            yVar3.getClass();
                        }
                    } else if (sVar.g().equals("ILINK_SDK_RESOURCE_GET_SPECIFIED_VERSION")) {
                        r45.sq6 sq6Var = new r45.sq6();
                        sq6Var.mo11468x92b714fd(decode);
                        java.util.Iterator it9 = uVar.f308570o.entrySet().iterator();
                        while (it9.hasNext()) {
                            e70.y yVar4 = (e70.y) ((java.util.Map.Entry) it9.next()).getValue();
                            java.lang.String project_id2 = sq6Var.f467460d;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(project_id2, "project_id");
                            java.lang.String resource_name2 = sq6Var.f467461e;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resource_name2, "resource_name");
                            yVar4.getClass();
                        }
                    }
                }
            }
        }
    }
}
