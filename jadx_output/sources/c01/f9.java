package c01;

/* loaded from: classes12.dex */
public class f9 extends com.tencent.mm.modelbase.k1 implements o45.rg {

    /* renamed from: a, reason: collision with root package name */
    public final int f37182a;

    /* renamed from: b, reason: collision with root package name */
    public final o45.ug f37183b;

    /* renamed from: c, reason: collision with root package name */
    public final o45.vg f37184c;

    public f9(int i17) {
        iz5.a.g(null, i17 == 702 || i17 == 701 || i17 == 252 || i17 == 763);
        this.f37182a = i17;
        if (i17 == 702 || i17 == 763) {
            this.f37183b = new o45.mg();
            this.f37184c = new o45.ng();
        } else {
            this.f37183b = new o45.sg();
            this.f37184c = new o45.tg();
        }
    }

    public static int a(com.tencent.mm.network.v0 v0Var) {
        byte[] bArr;
        o45.ug ugVar = (o45.ug) v0Var.getReqObj();
        o45.vg vgVar = (o45.vg) v0Var.getRespObj();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(ugVar.getFuncId());
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(v0Var.hashCode());
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(vgVar.f343021g);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMReqRespAuth", "summerauth decodeAndRetriveAccInfo type:%d, hashcode:%d, ret:%d, stack[%s]", valueOf, valueOf2, valueOf3, new com.tencent.mm.sdk.platformtools.z3());
        if (vgVar.f343021g != 0) {
            return vgVar.f343021g;
        }
        r45.sr6 sr6Var = vgVar.f343015a;
        int i17 = sr6Var.f385951d;
        if ((i17 & 1) != 0) {
            r45.xb xbVar = sr6Var.f385952e;
            int i18 = xbVar.f389938x;
            com.tencent.mars.xlog.Log.i("MicroMsg.MMReqRespAuth", "decodeAndRetriveAccInfo authResultFlag:%d UpdateFlag:%d ", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(xbVar.f389937w));
            byte[] d17 = x51.j1.d(xbVar.B);
            byte[] d18 = x51.j1.d(xbVar.C);
            r45.ig0 ig0Var = xbVar.f389922e;
            byte[] d19 = x51.j1.d(xbVar.f389923f);
            int i19 = ig0Var.f377012e.f371839d;
            com.tencent.mm.sdk.platformtools.t8.G1(com.tencent.mm.sdk.platformtools.t8.j(d19));
            com.tencent.mm.sdk.platformtools.t8.G1(com.tencent.mm.sdk.platformtools.t8.j(d17));
            com.tencent.mm.sdk.platformtools.t8.G1(com.tencent.mm.sdk.platformtools.t8.j(d18));
            byte[] d27 = x51.j1.d(ig0Var.f377012e);
            byte[] bArr2 = ugVar.f343011a;
            if (com.tencent.mm.sdk.platformtools.t8.M0(d27)) {
                jx3.f.INSTANCE.idkeyStat(148L, 24L, 1L, false);
                com.tencent.mars.xlog.Log.w("MicroMsg.MMReqRespAuth", "summerauth svr ecdh key is null!");
                bArr = null;
            } else {
                int length = d27.length;
                com.tencent.mm.sdk.platformtools.t8.G1(com.tencent.mm.sdk.platformtools.t8.j(d27));
                com.tencent.mm.sdk.platformtools.t8.G1(com.tencent.mm.sdk.platformtools.t8.j(bArr2));
                com.tencent.mm.pointers.PByteArray pByteArray = new com.tencent.mm.pointers.PByteArray();
                int computerKeyWithAllStr = com.tencent.mm.protocal.MMProtocalJni.computerKeyWithAllStr(ig0Var.f377011d, d27, bArr2, pByteArray, 0);
                bArr = pByteArray.value;
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = java.lang.Integer.valueOf(computerKeyWithAllStr);
                objArr[1] = java.lang.Integer.valueOf(bArr == null ? -1 : bArr.length);
                objArr[2] = com.tencent.mm.sdk.platformtools.t8.G1(com.tencent.mm.sdk.platformtools.t8.j(bArr));
                com.tencent.mars.xlog.Log.i("MicroMsg.MMReqRespAuth", "summerauth ComputerKeyWithAllStr ret:%d, agreedECDHKey len: %d, values:%s", objArr);
            }
            vgVar.f343017c = bArr != null ? bArr : new byte[0];
            if ((i18 & 4) == 0) {
                jx3.f.INSTANCE.idkeyStat(148L, 27L, 1L, false);
                vgVar.a(d19, d17, d18);
                vgVar.f343021g = 1;
            } else if (com.tencent.mm.sdk.platformtools.t8.M0(bArr)) {
                jx3.f.INSTANCE.idkeyStat(148L, 26L, 1L, false);
                vgVar.a(new byte[0], d17, d18);
                vgVar.f343021g = 2;
            } else {
                byte[] aesDecrypt = com.tencent.mm.protocal.MMProtocalJni.aesDecrypt(d19, bArr);
                com.tencent.mm.sdk.platformtools.t8.G1(com.tencent.mm.sdk.platformtools.t8.j(d19));
                com.tencent.mm.sdk.platformtools.t8.G1(com.tencent.mm.sdk.platformtools.t8.j(aesDecrypt));
                if (com.tencent.mm.sdk.platformtools.t8.M0(aesDecrypt)) {
                    jx3.f.INSTANCE.idkeyStat(148L, 25L, 1L, false);
                    vgVar.a(new byte[0], d17, d18);
                    vgVar.f343021g = 2;
                } else {
                    com.tencent.mm.sdk.platformtools.t8.G1(com.tencent.mm.sdk.platformtools.t8.j(aesDecrypt));
                    vgVar.a(aesDecrypt, d17, d18);
                    vgVar.f343021g = 1;
                }
            }
        } else {
            vgVar.a(new byte[0], new byte[0], new byte[0]);
            vgVar.f343021g = 2;
        }
        if ((i17 & 2) != 0) {
            java.lang.String str = sr6Var.f385953f.f376638d;
            if ((str == null || str.isEmpty()) && (ugVar instanceof o45.mg)) {
                java.lang.String str2 = ((o45.mg) ugVar).f342981c;
                com.tencent.mars.xlog.Log.w("MicroMsg.MMReqRespAuth", "summerauth resp username is nil, replace with req username:%s", str2);
                sr6Var.f385953f.f376638d = str2;
                vgVar.f343016b = str2;
            } else {
                vgVar.f343016b = sr6Var.f385953f.f376638d;
            }
        }
        return vgVar.f343021g;
    }

    public static void c(r45.mx3 mx3Var) {
        gm0.j1.i();
        com.tencent.mm.network.s sVar = gm0.j1.n().f273288b.f70764d;
        int i17 = 0;
        if (mx3Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMReqRespAuth", "tlsControlList is empty.");
            sVar.Q(new java.lang.String[0], new int[0]);
            return;
        }
        java.util.LinkedList linkedList = mx3Var.f380892e;
        java.lang.String[] strArr = new java.lang.String[linkedList.size()];
        int[] iArr = new int[linkedList.size()];
        com.tencent.mars.xlog.Log.i("MicroMsg.MMReqRespAuth", "tlsControlList.Count=%d", java.lang.Integer.valueOf(mx3Var.f380891d));
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.lx3 lx3Var = (r45.lx3) it.next();
            java.lang.String str = lx3Var.f379932d;
            strArr[i17] = lx3Var.f379932d;
            iArr[i17] = lx3Var.f379933e;
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
        objArr[0] = java.lang.Integer.valueOf(joVar == null ? -1 : joVar.f377981d);
        objArr[1] = java.lang.Integer.valueOf(joVar == null ? -1 : joVar.f377982e);
        objArr[2] = java.lang.Integer.valueOf(kx3Var == null ? -1 : kx3Var.f379023d);
        objArr[3] = java.lang.Integer.valueOf(rt4Var != null ? rt4Var.f385205h : -1);
        objArr[4] = rt4Var == null ? "null" : rt4Var.f385201d;
        objArr[5] = rt4Var != null ? rt4Var.f385202e : "null";
        com.tencent.mars.xlog.Log.i("MicroMsg.MMReqRespAuth", "dkidc updateMultiIDCInfo iplist[l:%d s:%d] hostList[%d] typing[%d] port[%s] timeout[%s]", objArr);
        if (kx3Var == null || (linkedList = kx3Var.f379024e) == null || linkedList.size() <= 0) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.f("MicroMsg.MMReqRespAuth", "dkidc updateMultiIDCInfo give empty host request! stack:[%s]", new com.tencent.mm.sdk.platformtools.z3());
            return;
        }
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        linkedList2.clear();
        if (joVar != null) {
            java.util.Iterator it = joVar.f377985h.iterator();
            while (it.hasNext()) {
                r45.io ioVar = (r45.io) it.next();
                com.tencent.mm.protobuf.g gVar = ioVar.f377205g;
                linkedList2.add(new o45.hh(ioVar.f377202d, ioVar.f377204f.i(), ioVar.f377203e, gVar != null ? gVar.i() : ""));
                ioVar.f377204f.i();
            }
        }
        java.lang.String c17 = o45.hh.c(linkedList2);
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        if (joVar != null) {
            java.util.Iterator it6 = joVar.f377984g.iterator();
            while (it6.hasNext()) {
                r45.io ioVar2 = (r45.io) it6.next();
                com.tencent.mm.protobuf.g gVar2 = ioVar2.f377205g;
                linkedList3.add(new o45.hh(ioVar2.f377202d, ioVar2.f377204f.i(), ioVar2.f377203e, gVar2 != null ? gVar2.i() : ""));
                ioVar2.f377204f.i();
            }
        }
        java.lang.String c18 = o45.hh.c(linkedList3);
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("system_config_prefs", 0);
        sharedPreferences.edit().putString("builtin_short_ips", c17).commit();
        if (rt4Var != null) {
            if (rt4Var.f385205h != 0) {
                gm0.j1.i();
                com.tencent.mm.storage.j3 j3Var = gm0.j1.u().f273148a;
                int i19 = rt4Var.f385205h;
                if (i19 > 60) {
                    i19 = 60;
                }
                j3Var.f(35, java.lang.Integer.valueOf(i19));
            }
            ghVar = o45.hh.b(rt4Var.f385201d);
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
            java.lang.String str = hx3Var.f376535d;
            java.lang.String str2 = hx3Var.f376536e;
            strArr[i18] = str;
            strArr2[i18] = str2;
            iArr[i18] = hx3Var.f376537f;
            i18++;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !com.tencent.mm.sdk.platformtools.t8.K0(hx3Var.f376536e) && hx3Var.f376535d.equals("support.weixin.qq.com") && !com.tencent.mm.sdk.platformtools.t8.K0(hx3Var.f376536e)) {
                sharedPreferences.edit().putString("support.weixin.qq.com", hx3Var.f376536e).commit();
            }
        }
        gm0.j1.i();
        com.tencent.mm.network.s sVar = gm0.j1.n().f273288b.f70764d;
        if (size > 0 && sVar != null) {
            sVar.j0(strArr, strArr2, iArr);
        }
        if (sVar != null && ghVar != null) {
            sVar.k1(c17, c18, null, ghVar.f342934a);
        }
        if (!z17 || sVar == null) {
            return;
        }
        int e07 = sVar.e0();
        com.tencent.mars.xlog.Log.i("MicroMsg.MMReqRespAuth", "new cert region %d, current region %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(e07));
        if (i17 == 0) {
            sVar.U();
            jx3.f.INSTANCE.idkeyStat(148L, 60L, 1L, false);
        } else {
            if (i17 <= 0 || e07 == i17) {
                return;
            }
            sVar.U();
            sVar.d0(i17);
            jx3.f.INSTANCE.idkeyStat(148L, 59L, 1L, false);
        }
    }

    public int b() {
        if (gm0.j1.a()) {
            gm0.j1.i();
            return gm0.j1.b().h();
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.e("MicroMsg.MMReqRespAuth", "dkwt acc NOT Ready , the MMReqRespBase need the uin ???  if u find this log , kick dk. %s", new com.tencent.mm.sdk.platformtools.z3());
        return 0;
    }

    @Override // com.tencent.mm.modelbase.k1
    public o45.zg getReqObjImp() {
        return this.f37183b;
    }

    @Override // com.tencent.mm.network.v0
    public o45.ah getRespObj() {
        return this.f37184c;
    }

    @Override // com.tencent.mm.network.v0
    public int getType() {
        return this.f37183b.getFuncId();
    }

    @Override // com.tencent.mm.network.v0
    public java.lang.String getUri() {
        return this.f37183b.a();
    }
}
