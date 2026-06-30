package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public abstract class nb extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.hb {

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 f166347h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f166348i;

    /* renamed from: m, reason: collision with root package name */
    public final int f166349m;

    /* renamed from: n, reason: collision with root package name */
    public final int f166350n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7 f166351o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.List f166352p = new java.util.LinkedList();

    public nb(java.lang.String str, int i17, int i18, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 c11829x68027553, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7 c12566x87f2d8b7) {
        this.f166348i = str;
        this.f166349m = i17;
        this.f166350n = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.b(i17) ? i18 : 0;
        this.f166347h = c11829x68027553;
        this.f166351o = c12566x87f2d8b7;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PrepareStepCheckAppidABTestPermissionInfo", "<init> hash:%d, appId:%s,versionType:%d", java.lang.Integer.valueOf(hashCode()), str, java.lang.Integer.valueOf(i17));
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        java.util.HashMap hashMap = new java.util.HashMap();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 c11829x68027553 = this.f166347h;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        qg1.o oVar = new qg1.o();
        oVar.f444318a = this.f166348i;
        oVar.f444319b = 1;
        oVar.f444320c = this.f166349m;
        linkedList.add(oVar);
        java.util.List list = c11829x68027553.f158990t;
        if (list != null && list.size() > 0) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11827xceb9d1c1> list2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11831x52cc1bc5) it.next()).f159010g;
                if (list2 != null && list2.size() > 0) {
                    for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11827xceb9d1c1 c11827xceb9d1c1 : list2) {
                        qg1.o oVar2 = new qg1.o();
                        oVar2.f444318a = c11827xceb9d1c1.f158966d;
                        oVar2.f444319b = 2;
                        oVar2.f444320c = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11827xceb9d1c1.f158973n) ? 1 : 0;
                        if (!linkedList.contains(oVar2)) {
                            linkedList.add(oVar2);
                        }
                    }
                }
            }
        }
        this.f166352p = linkedList;
        if (linkedList.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PrepareStepCheckAppidABTestPermissionInfo", "call() todoChecAppidInfoList null, return, hash:%d", java.lang.Integer.valueOf(hashCode()));
            return null;
        }
        wg1.d.a(150, this.f166348i, this.f166349m, this.f166350n);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PrepareStepCheckAppidABTestPermissionInfo", "call() todoChecAppidInfoList size:%d", java.lang.Integer.valueOf(((java.util.LinkedList) this.f166352p).size()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.i9 Zi = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Zi();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o9 o9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o9) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o9.class);
        int i17 = this.f166350n;
        int i18 = this.f166349m;
        java.lang.String str = this.f166348i;
        boolean z17 = false;
        if (Zi == null || o9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PrepareStepCheckAppidABTestPermissionInfo", "needSyncCheckAppidPermission storage null!");
            wg1.d.a(151, str, i18, i17);
        } else {
            java.util.List list3 = this.f166352p;
            if (list3 != null && ((java.util.LinkedList) list3).size() > 0) {
                for (qg1.o oVar3 : this.f166352p) {
                    java.lang.String str2 = oVar3.f444318a;
                    int i19 = oVar3.f444319b;
                    int i27 = oVar3.f444320c;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LaunchWxaAppidABTestInfoStorage", "get, appId:%s , appType :%d, versionType: %d", str2, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.n9 n9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.n9();
                    n9Var.f68522x28d45f97 = str2;
                    n9Var.f68523x454032b6 = i19;
                    n9Var.f68526x94d24c6d = i27;
                    if (!o9Var.get(n9Var, new java.lang.String[0])) {
                        n9Var = null;
                    }
                    if (n9Var == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PrepareStepCheckAppidABTestPermissionInfo", "needSyncCheckAppidPermission appidABTestInfoStorage not include appId:%s ,appType:%d!", str2, java.lang.Integer.valueOf(i19));
                        z17 = true;
                        break;
                    }
                    hashMap.put(qg1.k.s(str2, i19, i27), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1174xe125c5cf.p1175xe0b91e4f.C12541xa79a9e89(n9Var.f68525xed561697, n9Var.f68524x3cc05c57));
                }
            }
            wg1.d.a(162, str, i18, i17);
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PrepareStepCheckAppidABTestPermissionInfo", "zbql:CgiWxaAppidABTestInfo async");
            lm5.d.f401134b.a(new qg1.j(new qg1.k(this.f166348i, this.f166349m, this.f166352p, false, this.f166351o, this)));
            return android.util.Pair.create(hashMap, java.lang.Boolean.FALSE);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PrepareStepCheckAppidABTestPermissionInfo", "zbql:CgiWxaAppidABTestInfo sync");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x2 x2Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.c3) this).f166068q;
        if (x2Var.f166898h != null) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.j1) x2Var.f166898h).f166214d;
            if (rVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12334xbda92906 c12334xbda92906 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12334xbda92906();
                c12334xbda92906.f165918d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o1.EVENT_ON_SYNC_APPID_ABTEST_INFO_START;
                rVar.a(c12334xbda92906);
            }
        } else {
            x2Var.f166921z1 = true;
        }
        qg1.k kVar = new qg1.k(this.f166348i, this.f166349m, this.f166352p, true, this.f166351o, this);
        kVar.f444307p = true;
        com.p314xaae8f345.mm.p944x882e457a.f a17 = com.p314xaae8f345.mm.p944x882e457a.l3.a(kVar);
        if (!th1.a.b(a17) || kVar.f444308q == null) {
            wg1.d.a(152, this.f166348i, this.f166349m, this.f166350n);
            if (a17 == null || a17.f152148a != 4) {
                wg1.d.a(154, this.f166348i, this.f166349m, this.f166350n);
            } else {
                wg1.d.a(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.f53180x5a1baf5, this.f166348i, this.f166349m, this.f166350n);
            }
        } else {
            wg1.d.a(161, this.f166348i, this.f166349m, this.f166350n);
        }
        return android.util.Pair.create(kVar.f444308q, java.lang.Boolean.TRUE);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.hb
    public java.lang.String f() {
        return "MicroMsg.AppBrand.PrepareStepCheckAppidABTestPermissionInfo";
    }
}
