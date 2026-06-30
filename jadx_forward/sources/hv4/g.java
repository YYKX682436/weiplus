package hv4;

/* loaded from: classes8.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hv4.l f366825d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.sn3 f366826e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f366827f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f366828g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(hv4.l lVar, r45.sn3 sn3Var, android.graphics.Bitmap bitmap, java.lang.String str) {
        super(0);
        this.f366825d = lVar;
        this.f366826e = sn3Var;
        this.f366827f = bitmap;
        this.f366828g = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        java.lang.String str2 = this.f366828g;
        hv4.l lVar = this.f366825d;
        lVar.getClass();
        r45.sn3 shareContent = this.f366826e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareContent, "shareContent");
        r45.pw5 pw5Var = shareContent.f467395m;
        int i17 = 1;
        r45.ck6 ck6Var = lVar.f366841f;
        if (pw5Var != null) {
            ot0.q qVar = new ot0.q();
            zy2.i iVar = new zy2.i();
            r45.pw5 pw5Var2 = shareContent.f467395m;
            r45.kv2 kv2Var = new r45.kv2();
            kv2Var.set(0, pw5Var2.f464966e);
            kv2Var.set(8, pw5Var2.f464970i);
            kv2Var.set(5, java.lang.Integer.valueOf(pw5Var2.f464967f));
            kv2Var.set(3, pw5Var2.f464969h);
            kv2Var.set(2, pw5Var2.f464968g);
            kv2Var.set(4, pw5Var2.f464965d);
            java.util.LinkedList<r45.qw5> linkedList = pw5Var2.f464972n;
            kv2Var.set(6, java.lang.Integer.valueOf(linkedList.size()));
            java.util.LinkedList m75941xfb821914 = kv2Var.m75941xfb821914(7);
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (r45.qw5 qw5Var : linkedList) {
                r45.iv2 iv2Var = new r45.iv2();
                iv2Var.set(0, java.lang.Integer.valueOf(qw5Var.f465850d));
                iv2Var.set(i17, java.lang.String.valueOf(qw5Var.f465851e));
                iv2Var.set(2, qw5Var.f465854h);
                iv2Var.set(3, java.lang.Float.valueOf(qw5Var.f465852f));
                iv2Var.set(4, java.lang.Float.valueOf(qw5Var.f465853g));
                iv2Var.set(5, java.lang.Integer.valueOf(qw5Var.f465855i));
                arrayList.add(iv2Var);
                i17 = 1;
            }
            m75941xfb821914.addAll(arrayList);
            iVar.f558944b = kv2Var;
            qVar.f(iVar);
            qVar.f430199i = 51;
            qVar.f430187f = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.giz);
            qVar.f430207k = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573942gj0);
            ot0.k1 a17 = ot0.j1.a();
            java.lang.String str3 = ck6Var.f453163o;
            ((ez.w0) a17).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.I(qVar, "", "", str3, "", null);
            lVar.E(shareContent, str2);
        } else {
            str = "";
            if (shareContent.f467394i != null) {
                ot0.q qVar2 = new ot0.q();
                zy2.h hVar = new zy2.h();
                java.lang.String str4 = shareContent.f467394i.f464115e;
                if (str4 == null) {
                    str4 = "";
                }
                hVar.m(str4);
                java.lang.String str5 = shareContent.f467394i.f464114d;
                if (str5 == null) {
                    str5 = "";
                }
                hVar.l(str5);
                r45.ow5 ow5Var = shareContent.f467394i;
                java.lang.String str6 = ow5Var.f464119i;
                if (str6 == null) {
                    str6 = "";
                }
                hVar.f558930h = str6;
                java.lang.String str7 = ow5Var.f464118h;
                if (str7 == null) {
                    str7 = "";
                }
                hVar.i(str7);
                java.lang.String str8 = shareContent.f467394i.f464116f;
                hVar.j(str8 != null ? str8 : "");
                qVar2.f(hVar);
                qVar2.f430199i = 50;
                qVar2.f430187f = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.giz);
                qVar2.f430207k = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573942gj0);
                ot0.k1 a18 = ot0.j1.a();
                java.lang.String str9 = ck6Var.f453163o;
                ((ez.w0) a18).getClass();
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.I(qVar2, "", "", str9, "", null);
                lVar.E(shareContent, str2);
            } else if (shareContent.f467390e != null) {
                ot0.q qVar3 = new ot0.q();
                r45.bw5 bw5Var = shareContent.f467390e;
                qVar3.f430187f = bw5Var.f452632d;
                qVar3.f430267z = bw5Var.f452634f;
                qVar3.f430207k = bw5Var.f452635g;
                qVar3.f430191g = bw5Var.f452633e;
                qVar3.f430195h = "view";
                qVar3.f430239s = 3;
                qVar3.f430255w = bw5Var.f452637i;
                qVar3.f430259x = bw5Var.f452638m;
                qVar3.f430199i = 5;
                ot0.f fVar = new ot0.f();
                fVar.f429988b = 0;
                qVar3.f(fVar);
                ot0.k1 a19 = ot0.j1.a();
                java.lang.String str10 = ck6Var.f453163o;
                ((ez.w0) a19).getClass();
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.I(qVar3, "", "", str10, "", null);
                lVar.E(shareContent, str2);
            } else {
                r45.aw5 aw5Var = shareContent.f467391f;
                if (aw5Var != null) {
                    java.lang.String format = java.lang.String.format("<msg username=\"%s\" nickname=\"%s\" alias=\"%s\" fullpy=\"%s\" shortpy=\"%s\" imagestatus=\"%d\" scene=\"17\" province=\"%s\" city=\"%s\" sign=\"%s\" percard=\"%d\" sex=\"%d\" certflag=\"%d\" certinfo=\"%s\" certinfoext=\"\" brandIconUrl=\"%s\" brandHomeUrl=\"\" brandSubscriptConfigUrl=\"\" brandFlags=\"\" regionCode=\"%s\"/>", java.util.Arrays.copyOf(new java.lang.Object[]{com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(aw5Var.f451833d), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(aw5Var.f451834e), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(aw5Var.f451836g), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(aw5Var.f451835f), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(""), 0, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(aw5Var.f451838i), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(aw5Var.f451839m), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(aw5Var.f451840n), 0, java.lang.Integer.valueOf(aw5Var.f451841o), java.lang.Integer.valueOf(aw5Var.f451842p), "", aw5Var.f451848v, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(aw5Var.f451837h)}, 15));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                    tg3.a1 a27 = tg3.t1.a();
                    java.lang.String str11 = shareContent.f467391f.f451833d;
                    java.lang.String str12 = ck6Var.f453163o;
                    boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str12);
                    dk5.s5 s5Var = (dk5.s5) a27;
                    s5Var.getClass();
                    ((kt.g) ((lt.n0) i95.n0.c(lt.n0.class))).getClass();
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p0.a();
                    if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20529x1dde7b04()) != 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendMsgMgr", "Send ContactCard with custom xml through new method");
                        try {
                            iz.e eVar = (iz.e) i95.n0.c(iz.e.class);
                            if (eVar == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SendMsgMgr", "IContactCardMsgFeatureService is NULL! Service not registered, fallback to legacy");
                                s5Var.Ri(str11, str12, format, R4);
                            } else if (R4) {
                                if (str12 != null) {
                                    str = str12;
                                }
                                hz.m mVar = new hz.m(str, str11);
                                mVar.f367770e = format;
                                hz.d dVar = (hz.d) eVar;
                                dVar.aj(dVar.Zi(mVar));
                            } else {
                                if (str12 != null) {
                                    str = str12;
                                }
                                java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(str.split(","));
                                for (int i18 = 0; i18 < P1.size(); i18++) {
                                    hz.m mVar2 = new hz.m((java.lang.String) P1.get(i18), str11);
                                    mVar2.f367770e = format;
                                    hz.d dVar2 = (hz.d) eVar;
                                    dVar2.aj(dVar2.Zi(mVar2));
                                }
                            }
                        } catch (java.lang.Exception e17) {
                            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SendMsgMgr", "New method Contactcard with custom xml Exception: %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendMsgMgr", "Send ContactCard (custom xml) through legacy method");
                        s5Var.Ri(str11, str12, format, R4);
                    }
                    lVar.E(shareContent, str2);
                } else {
                    r45.qx5 qx5Var = shareContent.f467392g;
                    if (qx5Var != null) {
                        ot0.q qVar4 = new ot0.q();
                        qVar4.f430187f = qx5Var.f465872e;
                        qVar4.f430206j2 = qx5Var.f465875h;
                        qVar4.f430202i2 = qx5Var.f465876i;
                        qVar4.f430210k2 = qx5Var.f465874g;
                        qVar4.f430270z2 = 0;
                        qVar4.A2 = qx5Var.f465878n;
                        qVar4.f430214l2 = 2;
                        qVar4.f430207k = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class)).l2(qx5Var.f465874g);
                        qVar4.B2 = qx5Var.f465877m;
                        qVar4.L1 = "wxapp_" + qx5Var.f465874g + qx5Var.f465876i;
                        qVar4.f430255w = qx5Var.f465875h;
                        qVar4.f430259x = qx5Var.f465871d;
                        qVar4.f(new ot0.a());
                        qVar4.f430199i = 33;
                        if (android.text.TextUtils.isEmpty(qx5Var.f465873f)) {
                            byte[] a28 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.a(this.f366827f);
                            ot0.k1 a29 = ot0.j1.a();
                            java.lang.String str13 = qx5Var.f465874g;
                            java.lang.String str14 = ck6Var.f453163o;
                            ((ez.w0) a29).getClass();
                            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.I(qVar4, str13, "", str14, "", a28);
                            lVar.E(shareContent, str2);
                        } else {
                            ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(qx5Var.f465873f, new hv4.i(qVar4, qx5Var, lVar, shareContent, str2));
                        }
                    } else if (shareContent.f467393h != null) {
                        ot0.q qVar5 = new ot0.q();
                        r45.rx5 rx5Var = shareContent.f467393h;
                        qVar5.f430187f = rx5Var.f466808e;
                        qVar5.f430199i = 33;
                        qVar5.f430206j2 = rx5Var.f466807d;
                        qVar5.f430210k2 = rx5Var.f466810g;
                        qVar5.f430214l2 = 1;
                        qVar5.L1 = "wxapp_" + shareContent.f467393h.f466810g;
                        r45.rx5 rx5Var2 = shareContent.f467393h;
                        qVar5.f430267z = rx5Var2.f466809f;
                        java.lang.String format2 = java.lang.String.format(java.util.Locale.US, "https://mp.weixin.qq.com/mp/waerrpage?appid=%s&type=upgrade&upgradetype=%d#wechat_redirect", java.util.Arrays.copyOf(new java.lang.Object[]{rx5Var2.f466810g, 3}, 2));
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
                        qVar5.f430207k = format2;
                        r45.rx5 rx5Var3 = shareContent.f467393h;
                        qVar5.f430255w = rx5Var3.f466807d;
                        qVar5.f430259x = rx5Var3.f466808e;
                        ot0.a aVar = new ot0.a();
                        aVar.f429893p = 0;
                        qVar5.f(aVar);
                        ot0.k1 a37 = ot0.j1.a();
                        r45.rx5 rx5Var4 = shareContent.f467393h;
                        java.lang.String str15 = rx5Var4.f466810g;
                        java.lang.String str16 = rx5Var4.f466808e;
                        java.lang.String str17 = ck6Var.f453163o;
                        ((ez.w0) a37).getClass();
                        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.I(qVar5, str15, str16, str17, null, null);
                        lVar.E(shareContent, str2);
                    } else if (shareContent.f467396n != null) {
                        ((r35.k1) ((o25.q1) i95.n0.c(o25.q1.class))).Bi(lVar.getContext(), ck6Var.f453163o, shareContent.f467396n.mo14344x5f01b1f6(), null, 0, 0L, null, null);
                        lVar.E(shareContent, str2);
                    } else if (shareContent.f467397o != null) {
                        ot0.q qVar6 = new ot0.q();
                        qVar6.f430199i = 68;
                        qVar6.I = c01.z1.r();
                        r45.zw5 zw5Var = shareContent.f467397o;
                        qVar6.f430187f = zw5Var.f473973i;
                        qVar6.f430191g = zw5Var.f473974m;
                        qVar6.f430179d = zw5Var.f473976o;
                        java.lang.String str18 = zw5Var.f473977p;
                        qVar6.f430207k = str18;
                        qVar6.I1 = str18;
                        qVar6.J1 = str18;
                        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h0 h0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h0();
                        h0Var.f273198b = zw5Var.f473968d;
                        h0Var.f273199c = zw5Var.f473969e;
                        h0Var.f273200d = zw5Var.f473970f;
                        h0Var.f273201e = zw5Var.f473971g;
                        h0Var.f273202f = zw5Var.f473972h;
                        qVar6.f(h0Var);
                        if (android.text.TextUtils.isEmpty(shareContent.f467397o.f473975n)) {
                            ot0.k1 a38 = ot0.j1.a();
                            java.lang.String str19 = ck6Var.f453163o;
                            ((ez.w0) a38).getClass();
                            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.I(qVar6, "", "", str19, "", null);
                            lVar.E(shareContent, str2);
                        } else {
                            ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(shareContent.f467397o.f473975n, new hv4.j(qVar6, lVar, shareContent, str2));
                        }
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
