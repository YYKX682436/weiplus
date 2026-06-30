package o72;

/* loaded from: classes4.dex */
public class n5 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f424957d;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f424959f;

    /* renamed from: g, reason: collision with root package name */
    public final int f424960g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f424961h;

    /* renamed from: i, reason: collision with root package name */
    public final int f424962i;

    /* renamed from: m, reason: collision with root package name */
    public final o72.m5 f424963m;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f424958e = null;

    /* renamed from: n, reason: collision with root package name */
    public final android.util.SparseArray f424964n = new android.util.SparseArray();

    public n5(java.lang.String str, int i17, java.util.List list, o72.m5 m5Var, int i18) {
        this.f424963m = null;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.g46();
        lVar.f152198b = new r45.h46();
        lVar.f152199c = "/cgi-bin/micromsg-bin/sharefav";
        lVar.f152200d = com.p290xb772556d.p291xca4f91d6.C2828xd7507fe8.ErrCode.f9505x29ffff96;
        lVar.f152201e = 246;
        lVar.f152202f = 1000000246;
        this.f424957d = lVar.a();
        this.f424959f = str;
        this.f424960g = i17;
        this.f424961h = list;
        this.f424963m = m5Var;
        this.f424962i = i18;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f424957d;
        r45.g46 g46Var = (r45.g46) oVar.f152243a.f152217a;
        g46Var.f456412d = this.f424959f;
        g46Var.f456413e = this.f424960g;
        java.util.LinkedList linkedList = new java.util.LinkedList(this.f424961h);
        g46Var.f456415g = linkedList;
        g46Var.f456414f = linkedList.size();
        this.f424958e = u0Var;
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p290xb772556d.p291xca4f91d6.C2828xd7507fe8.ErrCode.f9505x29ffff96;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        android.util.SparseArray sparseArray = this.f424964n;
        sparseArray.clear();
        if (i18 == 4 && i19 != 0) {
            o72.d2.f(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6, i19, str);
        }
        boolean z17 = i18 == 0 && i19 == 0;
        java.util.HashSet hashSet = o72.d2.f424852a;
        o72.w2 w2Var = o72.w2.f425042a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.FavReportManager", "[createReportSession] create report session = " + currentTimeMillis);
        w2Var.f(3, currentTimeMillis);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavApiUtil", "[startFavForwardReportEnv] session = " + currentTimeMillis);
        long d17 = w2Var.d(3);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6442x3ed73e8a c17 = w2Var.c();
        if (c17 == null || d17 == -4369) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavApiUtil", "[reportFavForwardQualityForSns] struct == null, session = " + d17 + ", return");
        } else {
            c17.f137827d = this.f424962i;
            c17.f137828e = 2;
            if (z17) {
                c17.f137829f = 0;
            } else {
                c17.f137829f = -1;
                c17.f137830g = i18;
                c17.f137831h = i19;
            }
        }
        w2Var.c().k();
        w2Var.g(3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavApiUtil", "[endFavForwardReportEnv] session");
        if (i18 == 0 && i19 == 0) {
            r45.h46 h46Var = (r45.h46) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
            int i27 = h46Var.f457365d;
            java.util.List list = this.f424961h;
            if (i27 != list.size()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneShareFavItem", "get url error, request count %d, response count %d", java.lang.Integer.valueOf(list.size()), java.lang.Integer.valueOf(h46Var.f457365d));
            }
            int i28 = 0;
            while (true) {
                java.util.LinkedList linkedList = h46Var.f457366e;
                if (i28 >= linkedList.size() || i28 >= list.size()) {
                    break;
                }
                list.get(i28);
                linkedList.get(i28);
                sparseArray.put(((java.lang.Integer) list.get(i28)).intValue(), ((r45.du5) linkedList.get(i28)).f454289d);
                i28++;
            }
        }
        this.f424958e.mo815x76e0bfae(i18, i19, str, this);
        o72.m5 m5Var = this.f424963m;
        if (m5Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z5 z5Var = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z5) m5Var;
            o72.r2 r2Var = z5Var.f183181a;
            java.lang.String str2 = (java.lang.String) sparseArray.get(r2Var.f67643xc8a07680);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                int i29 = r2Var.f67657x2262335f;
                if (4 == i29) {
                    r45.gp0 J2 = o72.x1.J(r2Var);
                    java.lang.String str3 = J2.f456937d;
                    android.content.Context context = z5Var.f183182b;
                    java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cdy);
                    if (str3 == null) {
                        str3 = string;
                    }
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("Ksnsupload_link", str2);
                    intent.putExtra("Ksnsupload_title", str3);
                    intent.putExtra("Ksnsupload_imgbuf", com.p314xaae8f345.mm.vfs.w6.N(o72.x1.X(J2), 0, -1));
                    intent.putExtra("Ksnsupload_type", 1);
                    j45.l.j(context, "sns", ".ui.SnsUploadUI", intent, null);
                    java.lang.String str4 = "fav_" + c01.z1.r() + "_" + r2Var.f67643xc8a07680;
                    java.lang.String a17 = c01.n2.a(str4);
                    c01.n2.d().c(a17, true).i("prePublishId", str4);
                    intent.putExtra("reportSessionId", a17);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavSendLogic", "unknown type %d, fav id %d", java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(r2Var.f67643xc8a07680));
                }
            }
            java.lang.Runnable runnable = z5Var.f183183c;
            if (runnable != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(runnable);
            }
        }
    }
}
