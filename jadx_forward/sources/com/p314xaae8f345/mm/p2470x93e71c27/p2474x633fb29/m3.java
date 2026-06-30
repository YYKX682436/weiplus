package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29;

/* loaded from: classes11.dex */
public class m3 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0, ns.l {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f270910d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f270911e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f270912f;

    /* renamed from: g, reason: collision with root package name */
    public final int f270913g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f270914h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f270915i;

    public m3(int i17, java.lang.String str, java.lang.String str2, int i18, java.lang.String str3, int i19, java.util.List list, r45.c85 c85Var) {
        this.f270912f = null;
        this.f270913g = 0;
        this.f270915i = new java.util.HashMap();
        iz5.a.g("This NetSceneVerifyUser init MUST use opcode == MM_VERIFYUSER_VERIFYOK", i17 == 3);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f270912f = linkedList;
        linkedList.add(str);
        this.f270913g = i17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ly6();
        lVar.f152198b = new r45.my6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/verifyuser";
        lVar.f152200d = 137;
        lVar.f152201e = 44;
        lVar.f152202f = 1000000044;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f270911e = a17;
        r45.ly6 ly6Var = (r45.ly6) a17.f152243a.f152217a;
        ly6Var.f461513d = i17;
        ly6Var.f461516g = "";
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        r45.gy6 gy6Var = new r45.gy6();
        gy6Var.f457183d = str;
        gy6Var.f457184e = str2;
        gy6Var.f457185f = g81.e.Ai().wi().z0(str, i18);
        gy6Var.f457187h = str3;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list) && N()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) it.next())));
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneVerifyUser.dkverify", "getLabelIdList, %s", e17.getMessage());
                }
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList)) {
                gy6Var.f457199w = O(arrayList);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneVerifyUser.dkverify", "NetSceneVerifyUser:LabelIdList:%s ", gy6Var.f457199w);
        gy6Var.f457200x = c85Var;
        if (i19 > 0) {
            gy6Var.f457186g = i19;
        }
        linkedList2.add(gy6Var);
        ly6Var.f461515f = linkedList2;
        ly6Var.f461514e = linkedList2.size();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        linkedList3.add(java.lang.Integer.valueOf(i18));
        ly6Var.f461518i = linkedList3;
        ly6Var.f461517h = linkedList3.size();
        fo3.s sVar = fo3.s.INSTANCE;
        if (sVar.wf("ie_ver_usr")) {
            sVar.E7("ie_ver_usr");
        }
        r45.k57 k57Var = new r45.k57();
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(sVar.Ph("ie_ver_usr"));
        k57Var.f459927d = cu5Var;
        r45.cu5 cu5Var2 = new r45.cu5();
        cu5Var2.d(sVar.Ci("ce_ver_usr"));
        k57Var.f459928e = cu5Var2;
        r45.cu5 cu5Var3 = new r45.cu5();
        cu5Var3.d(sVar.Ec(1, null));
        k57Var.f459929f = cu5Var3;
        java.lang.String Sf = sVar.Sf("ce_ver_usr");
        if (Sf != null) {
            r45.cu5 cu5Var4 = new r45.cu5();
            cu5Var4.d(Sf.getBytes());
            k57Var.f459934n = cu5Var4;
        }
        try {
            r45.cu5 cu5Var5 = new r45.cu5();
            cu5Var5.d(k57Var.mo14344x5f01b1f6());
            ly6Var.f461522p = cu5Var5;
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneVerifyUser.dkverify", "dkverify1 opCode:%s user:%d scene:%s ticket:%s anti:%s, friendFlag:%d %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(ly6Var.f461515f.size()), ly6Var.f461518i, str2, gy6Var.f457185f, java.lang.Integer.valueOf(i19), new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
    }

    public r45.v60 H() {
        java.util.Iterator it = ((r45.ly6) this.f270911e.f152243a.f152217a).f461515f.iterator();
        while (it.hasNext()) {
            r45.dz3 dz3Var = ((r45.gy6) it.next()).f457201y;
            if (dz3Var != null && dz3Var.f454401d > 0) {
                return (r45.v60) dz3Var.f454402e.get(0);
            }
        }
        return null;
    }

    public java.lang.String I() {
        com.p314xaae8f345.mm.p944x882e457a.n nVar;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f270911e;
        if (oVar == null || (nVar = oVar.f152244b) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneVerifyUser.dkverify", "getRespEncryptUsername failed, rr or resp is null");
            return "";
        }
        java.lang.String str = ((r45.my6) nVar.f152233a).f462464e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneVerifyUser.dkverify", "getRespEncryptUsername: %s", str);
        return str;
    }

    public java.lang.String J() {
        com.p314xaae8f345.mm.p944x882e457a.n nVar;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f270911e;
        return (oVar == null || (nVar = oVar.f152244b) == null) ? "" : ((r45.my6) nVar.f152233a).f462463d;
    }

    public long K() {
        com.p314xaae8f345.mm.p944x882e457a.n nVar;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f270911e;
        if (oVar == null || (nVar = oVar.f152244b) == null) {
            return 0L;
        }
        return ((r45.my6) nVar.f152233a).f462468i;
    }

    public java.util.List L() {
        return this.f270912f;
    }

    public int M() {
        return this.f270913g;
    }

    public final boolean N() {
        boolean z17 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20328xf77e7da7()) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneVerifyUser.dkverify", "isVerifyUserWithLabelIdList:%s ", java.lang.Boolean.valueOf(z17));
        return z17;
    }

    public final java.lang.String O(java.util.List list) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i17 = 0; i17 < list.size(); i17++) {
            sb6.append(list.get(i17));
            if (i17 < list.size() - 1) {
                sb6.append(",");
            }
        }
        return sb6.toString();
    }

    public void P(r45.hy6 hy6Var) {
        if (hy6Var == null) {
            return;
        }
        java.util.Iterator it = ((r45.ly6) this.f270911e.f152243a.f152217a).f461515f.iterator();
        while (it.hasNext()) {
            r45.gy6 gy6Var = (r45.gy6) it.next();
            try {
                r45.cu5 cu5Var = new r45.cu5();
                cu5Var.d(hy6Var.mo14344x5f01b1f6());
                gy6Var.f457196t = cu5Var;
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneVerifyUser.dkverify", "setBizReportInfo %s", e17.getMessage());
            }
        }
    }

    public void Q(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneVerifyUser.dkverify", "setClientMsgId : %s", java.lang.Long.valueOf(j17));
        ((r45.ly6) this.f270911e.f152243a.f152217a).f461525s = java.lang.String.valueOf(j17);
    }

    public void R(r45.dz3 dz3Var) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = dz3Var != null ? java.lang.Integer.valueOf(dz3Var.f454401d) : "null";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneVerifyUser.dkverify", "setImgInfoList imgInfoList:%s", objArr);
        r45.ly6 ly6Var = (r45.ly6) this.f270911e.f152243a.f152217a;
        java.util.Iterator it = ly6Var.f461515f.iterator();
        while (it.hasNext()) {
            ((r45.gy6) it.next()).f457201y = dz3Var;
        }
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneVerifyUser.dkverify", "doNetSceneVerifyUser() called request:%s", ly6Var.mo12245xcc313de3());
        }
    }

    public void S(boolean z17) {
        r45.ly6 ly6Var = (r45.ly6) this.f270911e.f152243a.f152217a;
        if (z17) {
            ly6Var.f461523q = 1;
        } else {
            ly6Var.f461523q = 0;
        }
    }

    public void T(java.lang.String str) {
        java.util.Iterator it = ((r45.ly6) this.f270911e.f152243a.f152217a).f461515f.iterator();
        while (it.hasNext()) {
            ((r45.gy6) it.next()).f457194r = str;
        }
    }

    public void U(java.lang.String str, java.lang.String str2) {
        java.util.Iterator it = ((r45.ly6) this.f270911e.f152243a.f152217a).f461515f.iterator();
        while (it.hasNext()) {
            r45.gy6 gy6Var = (r45.gy6) it.next();
            gy6Var.f457188i = str;
            gy6Var.f457189m = str2;
        }
    }

    public void V(int i17) {
        java.util.Iterator it = ((r45.ly6) this.f270911e.f152243a.f152217a).f461515f.iterator();
        while (it.hasNext()) {
            ((r45.gy6) it.next()).f457195s = i17;
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f270911e;
        r45.ly6 ly6Var = (r45.ly6) oVar.f152243a.f152217a;
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = java.lang.Integer.valueOf(this.f270913g);
        objArr[1] = ly6Var.f461525s;
        objArr[2] = java.lang.Integer.valueOf(ly6Var.f461523q);
        objArr[3] = this.f270914h;
        java.util.LinkedList linkedList = ly6Var.f461515f;
        objArr[4] = java.lang.Integer.valueOf(linkedList != null ? linkedList.size() : -1);
        java.util.LinkedList linkedList2 = ly6Var.f461518i;
        objArr[5] = java.lang.Integer.valueOf(linkedList2 != null ? linkedList2.size() : -1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneVerifyUser.dkverify", "doScene opcode:%d clientMsgId:%s needConfirm:%d verifyContent:%s userSize:%d sceneSize:%d", objArr);
        if (ly6Var.f461515f != null) {
            int i17 = 0;
            while (i17 < ly6Var.f461515f.size()) {
                r45.gy6 gy6Var = (r45.gy6) ly6Var.f461515f.get(i17);
                java.lang.Object[] objArr2 = new java.lang.Object[7];
                objArr2[0] = java.lang.Integer.valueOf(i17);
                objArr2[1] = gy6Var.f457183d;
                objArr2[2] = gy6Var.f457184e;
                objArr2[3] = gy6Var.f457185f;
                objArr2[4] = gy6Var.f457187h;
                objArr2[5] = java.lang.Integer.valueOf(gy6Var.f457186g);
                java.util.LinkedList linkedList3 = ly6Var.f461518i;
                objArr2[6] = java.lang.Integer.valueOf((linkedList3 == null || linkedList3.size() <= i17) ? -1 : ((java.lang.Integer) ly6Var.f461518i.get(i17)).intValue());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneVerifyUser.dkverify", "doScene [%d] user:%s verifyTicket:%s antispamTicket:%s chatroom:%s friendFlag:%d scene:%s", objArr2);
                i17++;
            }
        }
        this.f270910d = u0Var;
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 30;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        m48024x6b3684de(i17);
        if (i18 != 0 || i19 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneVerifyUser.dkverify", "onGYNetEnd errType:%d, errCode:%d errMsg:%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        }
        r45.my6 my6Var = (r45.my6) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneVerifyUser.dkverify", "resp MsgId: %d, UserName: %s, EncryptUserName: %s", java.lang.Long.valueOf(my6Var.f462468i), my6Var.f462463d, my6Var.f462464e);
        this.f270910d.mo815x76e0bfae(i18, i19, str, this);
    }

    public m3(int i17, java.util.List list, java.util.List list2, java.util.List list3, java.lang.String str, java.lang.String str2, java.util.Map map, java.lang.String str3, java.lang.String str4) {
        this(i17, list, list2, list3, str, str2, map, str3, str4, null, null);
    }

    public m3(int i17, java.util.List list, java.util.List list2, java.util.List list3, java.lang.String str, java.lang.String str2, java.util.Map map, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.List list4) {
        boolean z17;
        java.util.List list5 = list;
        java.util.Map map2 = map;
        this.f270912f = null;
        this.f270913g = 0;
        this.f270915i = new java.util.HashMap();
        iz5.a.g("This NetSceneVerifyUser init NEVER use opcode == MM_VERIFYUSER_VERIFYOK", i17 != 3);
        this.f270913g = i17;
        this.f270912f = list5;
        java.util.List linkedList = (list3 == null || list3.isEmpty()) ? new java.util.LinkedList() : list3;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ly6();
        lVar.f152198b = new r45.my6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/verifyuser";
        lVar.f152200d = 137;
        lVar.f152201e = 44;
        lVar.f152202f = 1000000044;
        this.f270911e = lVar.a();
        if (!linkedList.isEmpty()) {
            if (linkedList.size() != list.size()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneVerifyUser.dkverify", "dkverify Error lstAntispamTicket:%d lstVerifyUser:%d", java.lang.Integer.valueOf(linkedList.size()), java.lang.Integer.valueOf(list.size()));
            } else {
                for (int i18 = 0; i18 < linkedList.size(); i18++) {
                    g81.e.Ai().wi().y0((java.lang.String) list5.get(i18), 2147483633, (java.lang.String) linkedList.get(i18));
                }
            }
        }
        if (i17 == 2) {
            for (int i19 = 0; i19 < list.size(); i19++) {
                java.lang.String z07 = g81.e.Ai().wi().z0((java.lang.String) list5.get(i19), 2147483633);
                if (z07 == null) {
                    z07 = "";
                }
                linkedList.add(z07);
            }
        }
        r45.ly6 ly6Var = (r45.ly6) this.f270911e.f152243a.f152217a;
        ly6Var.f461513d = i17;
        ly6Var.f461516g = str;
        this.f270914h = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneVerifyUser.dkverify", "opCode %d verifyContent:%s", java.lang.Integer.valueOf(i17), str);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
            ly6Var.f461524r = str5;
        }
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        int i27 = 0;
        while (i27 < list.size()) {
            r45.gy6 gy6Var = new r45.gy6();
            gy6Var.f457183d = (java.lang.String) list5.get(i27);
            gy6Var.f457184e = str2 == null ? "" : str2;
            java.lang.String z08 = g81.e.Ai().wi().z0(gy6Var.f457183d, ((java.lang.Integer) list2.get(i27)).intValue());
            z08 = z08 == null ? "" : z08;
            gy6Var.f457185f = z08;
            if (android.text.TextUtils.isEmpty(z08) && linkedList.size() > i27) {
                gy6Var.f457185f = (java.lang.String) linkedList.get(i27);
            }
            gy6Var.f457187h = str3;
            if (map2 != null && map2.containsKey(gy6Var.f457183d)) {
                gy6Var.f457186g = ((java.lang.Integer) map2.get(gy6Var.f457183d)).intValue();
            }
            gy6Var.f457191o = str4;
            try {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list4) && list4.get(i27) != null && N()) {
                    gy6Var.f457199w = O(new java.util.LinkedList((java.util.Collection) list4.get(i27)));
                }
                z17 = false;
            } catch (java.lang.Throwable th6) {
                z17 = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneVerifyUser.dkverify", th6, "VerifyUser LabelIdList", new java.lang.Object[0]);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneVerifyUser.dkverify", "dkverify travesing lstVerifyUser idx:%s op:%s user:%s anti:%s chatroom:%s, reportInfo:%s, friendflag:%d LabelIdList:%s", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(this.f270913g), gy6Var.f457183d, gy6Var.f457185f, str3, str4, java.lang.Integer.valueOf(gy6Var.f457186g), gy6Var.f457199w);
            linkedList2.add(gy6Var);
            i27++;
            map2 = map;
            list5 = list;
        }
        ly6Var.f461515f = linkedList2;
        ly6Var.f461514e = linkedList2.size();
        java.util.LinkedList linkedList3 = new java.util.LinkedList(list2);
        ly6Var.f461518i = linkedList3;
        ly6Var.f461517h = linkedList3.size();
        fo3.s sVar = fo3.s.INSTANCE;
        if (sVar.wf("ie_ver_usr")) {
            sVar.E7("ie_ver_usr");
        }
        r45.k57 k57Var = new r45.k57();
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(sVar.Ph("ie_ver_usr"));
        k57Var.f459927d = cu5Var;
        r45.cu5 cu5Var2 = new r45.cu5();
        cu5Var2.d(sVar.Ci("ce_ver_usr"));
        k57Var.f459928e = cu5Var2;
        r45.cu5 cu5Var3 = new r45.cu5();
        cu5Var3.d(sVar.Ec(1, null));
        k57Var.f459929f = cu5Var3;
        java.lang.String Sf = sVar.Sf("ce_ver_usr");
        if (Sf != null) {
            r45.cu5 cu5Var4 = new r45.cu5();
            cu5Var4.d(Sf.getBytes());
            k57Var.f459934n = cu5Var4;
        }
        try {
            r45.cu5 cu5Var5 = new r45.cu5();
            cu5Var5.d(k57Var.mo14344x5f01b1f6());
            ly6Var.f461522p = cu5Var5;
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneVerifyUser.dkverify", "dkverify construct end op:%s usersize:%s scene:%s inputAnti:%s chatroom:%s stack:%s", java.lang.Integer.valueOf(this.f270913g), java.lang.Integer.valueOf(ly6Var.f461515f.size()), ly6Var.f461518i, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(linkedList, ","), str3, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
    }

    public m3(int i17, java.util.List list, java.util.List list2, java.lang.String str, java.lang.String str2, java.util.Map map, java.lang.String str3, java.util.List list3) {
        this(i17, list, list2, null, str, str2, map, str3, "", null, list3);
    }

    public m3(int i17, java.lang.String str, java.lang.String str2, int i18) {
        this(i17, str, str2, i18, (java.lang.String) null, 0, (java.util.List) null, (r45.c85) null);
    }

    public m3(int i17, java.util.List list, java.util.List list2, java.lang.String str, java.lang.String str2) {
        this(i17, list, list2, null, str, str2, null, null, "");
    }
}
