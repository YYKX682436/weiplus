package c01;

/* loaded from: classes12.dex */
public class f9 extends com.p314xaae8f345.mm.p944x882e457a.k1 implements o45.rg {

    /* renamed from: a, reason: collision with root package name */
    public final int f118715a;

    /* renamed from: b, reason: collision with root package name */
    public final o45.ug f118716b;

    /* renamed from: c, reason: collision with root package name */
    public final o45.vg f118717c;

    public f9(int i17) {
        iz5.a.g(null, i17 == 702 || i17 == 701 || i17 == 252 || i17 == 763);
        this.f118715a = i17;
        if (i17 == 702 || i17 == 763) {
            this.f118716b = new o45.mg();
            this.f118717c = new o45.ng();
        } else {
            this.f118716b = new o45.sg();
            this.f118717c = new o45.tg();
        }
    }

    public static int a(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        byte[] bArr;
        o45.ug ugVar = (o45.ug) v0Var.mo47979x2d63726f();
        o45.vg vgVar = (o45.vg) v0Var.mo13821x7f35c2d1();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(ugVar.mo13851x19c9adf5());
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(v0Var.hashCode());
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(vgVar.f424554g);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMReqRespAuth", "summerauth decodeAndRetriveAccInfo type:%d, hashcode:%d, ret:%d, stack[%s]", valueOf, valueOf2, valueOf3, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        if (vgVar.f424554g != 0) {
            return vgVar.f424554g;
        }
        r45.sr6 sr6Var = vgVar.f424548a;
        int i17 = sr6Var.f467484d;
        if ((i17 & 1) != 0) {
            r45.xb xbVar = sr6Var.f467485e;
            int i18 = xbVar.f471471x;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMReqRespAuth", "decodeAndRetriveAccInfo authResultFlag:%d UpdateFlag:%d ", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(xbVar.f471470w));
            byte[] d17 = x51.j1.d(xbVar.B);
            byte[] d18 = x51.j1.d(xbVar.C);
            r45.ig0 ig0Var = xbVar.f471455e;
            byte[] d19 = x51.j1.d(xbVar.f471456f);
            int i19 = ig0Var.f458545e.f453372d;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(d19));
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(d17));
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(d18));
            byte[] d27 = x51.j1.d(ig0Var.f458545e);
            byte[] bArr2 = ugVar.f424544a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(d27)) {
                jx3.f.INSTANCE.mo68477x336bdfd8(148L, 24L, 1L, false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMReqRespAuth", "summerauth svr ecdh key is null!");
                bArr = null;
            } else {
                int length = d27.length;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(d27));
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(bArr2));
                com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1 c19764x527bffc1 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1();
                int m75982x1ef9719a = com.p314xaae8f345.mm.p2496xc50a8ce6.C19776x5804ff1f.m75982x1ef9719a(ig0Var.f458544d, d27, bArr2, c19764x527bffc1, 0);
                bArr = c19764x527bffc1.f38861x6ac9171;
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = java.lang.Integer.valueOf(m75982x1ef9719a);
                objArr[1] = java.lang.Integer.valueOf(bArr == null ? -1 : bArr.length);
                objArr[2] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(bArr));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMReqRespAuth", "summerauth ComputerKeyWithAllStr ret:%d, agreedECDHKey len: %d, values:%s", objArr);
            }
            vgVar.f424550c = bArr != null ? bArr : new byte[0];
            if ((i18 & 4) == 0) {
                jx3.f.INSTANCE.mo68477x336bdfd8(148L, 27L, 1L, false);
                vgVar.a(d19, d17, d18);
                vgVar.f424554g = 1;
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr)) {
                jx3.f.INSTANCE.mo68477x336bdfd8(148L, 26L, 1L, false);
                vgVar.a(new byte[0], d17, d18);
                vgVar.f424554g = 2;
            } else {
                byte[] m75978x7824c1be = com.p314xaae8f345.mm.p2496xc50a8ce6.C19776x5804ff1f.m75978x7824c1be(d19, bArr);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(d19));
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(m75978x7824c1be));
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(m75978x7824c1be)) {
                    jx3.f.INSTANCE.mo68477x336bdfd8(148L, 25L, 1L, false);
                    vgVar.a(new byte[0], d17, d18);
                    vgVar.f424554g = 2;
                } else {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(m75978x7824c1be));
                    vgVar.a(m75978x7824c1be, d17, d18);
                    vgVar.f424554g = 1;
                }
            }
        } else {
            vgVar.a(new byte[0], new byte[0], new byte[0]);
            vgVar.f424554g = 2;
        }
        if ((i17 & 2) != 0) {
            java.lang.String str = sr6Var.f467486f.f458171d;
            if ((str == null || str.isEmpty()) && (ugVar instanceof o45.mg)) {
                java.lang.String str2 = ((o45.mg) ugVar).f424514c;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMReqRespAuth", "summerauth resp username is nil, replace with req username:%s", str2);
                sr6Var.f467486f.f458171d = str2;
                vgVar.f424549b = str2;
            } else {
                vgVar.f424549b = sr6Var.f467486f.f458171d;
            }
        }
        return vgVar.f424554g;
    }

    public static void c(r45.mx3 mx3Var) {
        gm0.j1.i();
        com.p314xaae8f345.mm.p971x6de15a2e.s sVar = gm0.j1.n().f354821b.f152297d;
        int i17 = 0;
        if (mx3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMReqRespAuth", "tlsControlList is empty.");
            sVar.Q(new java.lang.String[0], new int[0]);
            return;
        }
        java.util.LinkedList linkedList = mx3Var.f462425e;
        java.lang.String[] strArr = new java.lang.String[linkedList.size()];
        int[] iArr = new int[linkedList.size()];
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMReqRespAuth", "tlsControlList.Count=%d", java.lang.Integer.valueOf(mx3Var.f462424d));
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.lx3 lx3Var = (r45.lx3) it.next();
            java.lang.String str = lx3Var.f461465d;
            strArr[i17] = lx3Var.f461465d;
            iArr[i17] = lx3Var.f461466e;
            i17++;
        }
        if (sVar != null) {
            sVar.Q(strArr, iArr);
        }
    }

    public static void d(r45.jo joVar, r45.rt4 rt4Var, r45.kx3 kx3Var, boolean z17, int i17) {
        java.util.LinkedList linkedList;
        o45.gh ghVar;
        java.lang.Object[] objArr = new java.lang.Object[6];
        int i18 = 0;
        objArr[0] = java.lang.Integer.valueOf(joVar == null ? -1 : joVar.f459514d);
        objArr[1] = java.lang.Integer.valueOf(joVar == null ? -1 : joVar.f459515e);
        objArr[2] = java.lang.Integer.valueOf(kx3Var == null ? -1 : kx3Var.f460556d);
        objArr[3] = java.lang.Integer.valueOf(rt4Var != null ? rt4Var.f466738h : -1);
        objArr[4] = rt4Var == null ? "null" : rt4Var.f466734d;
        objArr[5] = rt4Var != null ? rt4Var.f466735e : "null";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMReqRespAuth", "dkidc updateMultiIDCInfo iplist[l:%d s:%d] hostList[%d] typing[%d] port[%s] timeout[%s]", objArr);
        if (kx3Var == null || (linkedList = kx3Var.f460557e) == null || linkedList.size() <= 0) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.MMReqRespAuth", "dkidc updateMultiIDCInfo give empty host request! stack:[%s]", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            return;
        }
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        linkedList2.clear();
        if (joVar != null) {
            java.util.Iterator it = joVar.f459518h.iterator();
            while (it.hasNext()) {
                r45.io ioVar = (r45.io) it.next();
                com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = ioVar.f458738g;
                linkedList2.add(new o45.hh(ioVar.f458735d, ioVar.f458737f.i(), ioVar.f458736e, gVar != null ? gVar.i() : ""));
                ioVar.f458737f.i();
            }
        }
        java.lang.String c17 = o45.hh.c(linkedList2);
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        if (joVar != null) {
            java.util.Iterator it6 = joVar.f459517g.iterator();
            while (it6.hasNext()) {
                r45.io ioVar2 = (r45.io) it6.next();
                com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = ioVar2.f458738g;
                linkedList3.add(new o45.hh(ioVar2.f458735d, ioVar2.f458737f.i(), ioVar2.f458736e, gVar2 != null ? gVar2.i() : ""));
                ioVar2.f458737f.i();
            }
        }
        java.lang.String c18 = o45.hh.c(linkedList3);
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("system_config_prefs", 0);
        sharedPreferences.edit().putString("builtin_short_ips", c17).commit();
        if (rt4Var != null) {
            if (rt4Var.f466738h != 0) {
                gm0.j1.i();
                com.p314xaae8f345.mm.p2621x8fb0427b.j3 j3Var = gm0.j1.u().f354681a;
                int i19 = rt4Var.f466738h;
                if (i19 > 60) {
                    i19 = 60;
                }
                j3Var.f(35, java.lang.Integer.valueOf(i19));
            }
            ghVar = o45.hh.b(rt4Var.f466734d);
        } else {
            ghVar = null;
        }
        int size = linkedList.size();
        java.lang.String[] strArr = new java.lang.String[size];
        java.lang.String[] strArr2 = new java.lang.String[linkedList.size()];
        int[] iArr = new int[linkedList.size()];
        java.util.Iterator it7 = linkedList.iterator();
        while (it7.hasNext()) {
            r45.hx3 hx3Var = (r45.hx3) it7.next();
            java.lang.String str = hx3Var.f458068d;
            java.lang.String str2 = hx3Var.f458069e;
            strArr[i18] = str;
            strArr2[i18] = str2;
            iArr[i18] = hx3Var.f458070f;
            i18++;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(hx3Var.f458069e) && hx3Var.f458068d.equals("support.weixin.qq.com") && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(hx3Var.f458069e)) {
                sharedPreferences.edit().putString("support.weixin.qq.com", hx3Var.f458069e).commit();
            }
        }
        gm0.j1.i();
        com.p314xaae8f345.mm.p971x6de15a2e.s sVar = gm0.j1.n().f354821b.f152297d;
        if (size > 0 && sVar != null) {
            sVar.j0(strArr, strArr2, iArr);
        }
        if (sVar != null && ghVar != null) {
            sVar.k1(c17, c18, null, ghVar.f424467a);
        }
        if (!z17 || sVar == null) {
            return;
        }
        int e07 = sVar.e0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMReqRespAuth", "new cert region %d, current region %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(e07));
        if (i17 == 0) {
            sVar.U();
            jx3.f.INSTANCE.mo68477x336bdfd8(148L, 60L, 1L, false);
        } else {
            if (i17 <= 0 || e07 == i17) {
                return;
            }
            sVar.U();
            sVar.d0(i17);
            jx3.f.INSTANCE.mo68477x336bdfd8(148L, 59L, 1L, false);
        }
    }

    public int b() {
        if (gm0.j1.a()) {
            gm0.j1.i();
            return gm0.j1.b().h();
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMReqRespAuth", "dkwt acc NOT Ready , the MMReqRespBase need the uin ???  if u find this log , kick dk. %s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.k1
    /* renamed from: getReqObjImp */
    public o45.zg mo13820xe7c2e2dd() {
        return this.f118716b;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v0
    /* renamed from: getRespObj */
    public o45.ah mo13821x7f35c2d1() {
        return this.f118717c;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v0
    /* renamed from: getType */
    public int mo13822xfb85f7b0() {
        return this.f118716b.mo13851x19c9adf5();
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v0
    /* renamed from: getUri */
    public java.lang.String mo13823xb5887636() {
        return this.f118716b.a();
    }
}
