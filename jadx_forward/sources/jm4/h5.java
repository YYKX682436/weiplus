package jm4;

/* loaded from: classes11.dex */
public abstract class h5 {

    /* renamed from: a, reason: collision with root package name */
    public static cv.y0 f381924a;

    public static final void a(byte[] tingBypassBuffer, boolean z17, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tingBypassBuffer, "tingBypassBuffer");
        com.p314xaae8f345.mm.p2495xc50a8b8b.g h17 = pm0.b0.h(tingBypassBuffer);
        if (h17 != null) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            hb2.y.f361647e.s(h17, z17, new jm4.d5(lVar));
        }
    }

    public static final void b(java.lang.String[] listenId, boolean z17, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listenId, "listenId");
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0 l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : listenId) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c();
            c16601x7ed0e40c.f66791xc8a07680 = str;
            c16601x7ed0e40c.f66793x2262335f = z17 ? 23 : 24;
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) l0Var).Ri(c16601x7ed0e40c)) {
                arrayList.add(str);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterTingInteractPlugin", "containsInStar check " + arrayList.size());
        if (lVar != null) {
            lVar.mo146xb9724478(arrayList.toArray(new java.lang.String[0]));
        }
    }

    public static final void c(yz5.l lVar) {
        ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).getClass();
        int u27 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.u2();
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Long.valueOf(u27 == 2 ? 2L : 3L));
        }
    }

    public static final void d(java.lang.String sourceId, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceId, "sourceId");
        if (lVar != null) {
            ((y30.q) ((z30.u) i95.n0.c(z30.u.class))).getClass();
            lVar.mo146xb9724478(java.lang.Boolean.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().rc(sourceId) != null));
        }
    }

    public static final void e(byte[] itemData, long j17, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemData, "itemData");
        bw5.lp0 mo11468x92b714fd = new bw5.lp0().mo11468x92b714fd(itemData);
        jm4.s3[] s3VarArr = jm4.s3.f381961d;
        long j18 = 0;
        kl4.a aVar2 = kl4.b.f390415a;
        if (j17 == j18) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo11468x92b714fd);
            aVar2.a(mo11468x92b714fd, 13);
            return;
        }
        jm4.s3[] s3VarArr2 = jm4.s3.f381961d;
        if (j17 == 1) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo11468x92b714fd);
            aVar2.a(mo11468x92b714fd, 14);
        }
    }

    public static final void f(long j17, java.lang.String paramsJson, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paramsJson, "paramsJson");
        java.util.Map e17 = paramsJson.length() > 0 ? d75.b.e(new org.json.JSONObject(paramsJson), jm4.f5.f381916d) : null;
        jz5.g gVar = rk4.u4.f478543a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingEventHelper", "onTingCommonEvent event: " + j17);
        jz5.g gVar2 = rk4.u4.f478543a;
        int i17 = (int) j17;
        if (((java.util.Map) ((jz5.n) gVar2).mo141623x754a37bb()).containsKey(java.lang.Integer.valueOf(i17))) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6166xea7b16fe c6166xea7b16fe = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6166xea7b16fe();
            java.lang.Integer num = (java.lang.Integer) ((java.util.Map) ((jz5.n) gVar2).mo141623x754a37bb()).get(java.lang.Integer.valueOf(i17));
            int intValue = num != null ? num.intValue() : 0;
            am.yy yyVar = c6166xea7b16fe.f136426g;
            yyVar.f90024a = intValue;
            if (e17 != null) {
                try {
                    java.lang.Object obj = e17.get("categoryItem");
                    if (obj instanceof byte[]) {
                        yyVar.f90027d = new bw5.o50().mo11468x92b714fd((byte[]) obj);
                    }
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingEventHelper", "onCategoryEvent exp=" + e18);
                }
                java.lang.Object obj2 = e17.get("isLike");
                if (obj2 instanceof java.lang.Boolean) {
                    yyVar.f90025b = ((java.lang.Boolean) obj2).booleanValue();
                }
                java.lang.Object obj3 = e17.get("isPublic");
                if (obj3 instanceof java.lang.Boolean) {
                    yyVar.f90026c = ((java.lang.Boolean) obj3).booleanValue();
                }
            }
            c6166xea7b16fe.b(android.os.Looper.getMainLooper());
        }
    }

    public static final void g(long j17, long j18, yz5.a aVar) {
        km4.l lVar = km4.l.f390829a;
        int i17 = (int) j17;
        if (com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.EnumC25173x99c0626c.f45113x10d9e9a4.ordinal() == i17) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class)).Yf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6.R);
        } else if (com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.EnumC25173x99c0626c.f45112x2074267c.ordinal() == i17) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class)).Rh(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6.R);
        } else if (com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.EnumC25173x99c0626c.f45111xd7defeda.ordinal() == i17) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class)).c8(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6.R);
        }
    }

    public static final void h(java.lang.String localFilePath, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localFilePath, "localFilePath");
        if (localFilePath.length() == 0) {
            if (lVar != null) {
                bw5.xo0 xo0Var = new bw5.xo0();
                xo0Var.f116745d = 99991;
                xo0Var.f116748g[1] = true;
                byte[] mo14344x5f01b1f6 = xo0Var.mo14344x5f01b1f6();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
                lVar.mo146xb9724478(mo14344x5f01b1f6);
                return;
            }
            return;
        }
        jm4.g5 g5Var = new jm4.g5(lVar);
        if (localFilePath.length() == 0) {
            g5Var.a(-1, false, "", null);
            return;
        }
        hf0.b bVar = new hf0.b(g5Var);
        dn.m mVar = new dn.m();
        mVar.f323318d = "task_TingAudioUploader";
        mVar.f323320f = bVar;
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        mVar.f69601xaca5bdda = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(localFilePath.getBytes());
        mVar.f69595x6d25b0d9 = localFilePath;
        mVar.f69618x114ef53e = "";
        mVar.f69606xccdbf540 = true;
        mVar.f69592xf1ebe47b = 20305;
        mVar.f69580x454032b6 = 252;
        mVar.Z = 8;
        mVar.f69584x89a4c0cf = 2;
        mVar.A = 600;
        mVar.B = 180;
        mVar.f69609xd84b8349 = 2;
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar);
    }
}
