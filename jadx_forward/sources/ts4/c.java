package ts4;

/* loaded from: classes9.dex */
public class c extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f503252d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f503253e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 f503254f;

    /* renamed from: g, reason: collision with root package name */
    public int f503255g = 0;

    public c(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.l65();
        lVar.f152198b = new r45.m65();
        lVar.f152199c = "/cgi-bin/mmpay-bin/payibgjsgettransaction";
        lVar.f152200d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.i9.f34360x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f503253e = a17;
        r45.l65 l65Var = (r45.l65) a17.f152243a.f152217a;
        l65Var.f460712d = str;
        l65Var.f460715g = str4;
        l65Var.f460713e = str2;
        l65Var.f460716h = str5;
        l65Var.f460717i = str6;
        l65Var.f460714f = str3;
        l65Var.f460718m = str7;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f503252d = u0Var;
        return mo9409x10f9447a(sVar, this.f503253e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.i9.f34360x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneIbgGetTransaction", "hy: get h5 transaction: errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.m65 m65Var = (r45.m65) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        if (i19 == 0 && i18 == 0) {
            i19 = m65Var.f461696d;
            str = m65Var.f461697e;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneIbgGetTransaction", "resp.IsUseNewPage: %s", java.lang.Integer.valueOf(m65Var.f461701i));
        this.f503255g = m65Var.f461701i;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05();
        this.f503254f = c19099x8d444f05;
        c19099x8d444f05.f261212i = 1;
        if (m65Var.f461698f == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneIbgGetTransaction", "hy: info not valid");
        } else {
            c19099x8d444f05.X = m65Var.f461703n;
            c19099x8d444f05.Z = new java.util.ArrayList();
            java.util.Iterator it = m65Var.f461702m.iterator();
            while (it.hasNext()) {
                r45.t56 t56Var = (r45.t56) it.next();
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.ShowInfo showInfo = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.ShowInfo();
                showInfo.f261338d = t56Var.f467693d;
                showInfo.f261339e = t56Var.f467694e;
                showInfo.f261340f = t56Var.f467696g;
                showInfo.f261341g = t56Var.f467697h;
                r45.bx6 bx6Var = t56Var.f467695f;
                if (bx6Var != null) {
                    showInfo.f261342h = bx6Var.f452671d;
                    showInfo.f261343i = bx6Var.f452672e;
                    showInfo.f261344m = bx6Var.f452673f;
                    showInfo.f261345n = bx6Var.f452674g;
                    showInfo.f261346o = bx6Var.f452675h;
                }
                this.f503254f.Z.add(showInfo);
            }
            this.f503254f.f261211h = m65Var.f461698f.f464333g;
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity commodity = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity();
            r45.p65 p65Var = m65Var.f461698f;
            commodity.f261247r = p65Var.f464336m;
            commodity.f261240h = p65Var.f464338o;
            commodity.f261242m = p65Var.f464333g / 100.0d;
            commodity.f261244o = java.lang.String.valueOf(p65Var.f464337n);
            r45.p65 p65Var2 = m65Var.f461698f;
            commodity.f261245p = p65Var2.f464339p;
            commodity.f261248s = p65Var2.f464331e;
            commodity.f261246q = p65Var2.f464330d;
            commodity.f261249t = p65Var2.f464334h;
            commodity.f261239g = p65Var2.f464335i;
            commodity.f261243n = p65Var2.f464340q / 100.0d;
            r45.b65 b65Var = m65Var.f461699g;
            if (b65Var != null) {
                java.lang.String str2 = b65Var.f452107h;
                commodity.f261250u = str2;
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Promotions promotions = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Promotions();
                java.lang.String str3 = b65Var.f452106g;
                promotions.f261306f = str3;
                promotions.f261309i = str2;
                commodity.f261251v = str2;
                promotions.f261305e = b65Var.f452108i;
                commodity.f261255z = b65Var.f452104e;
                promotions.f261304d = 0;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                    ((java.util.ArrayList) commodity.H).add(promotions);
                    commodity.I = true;
                }
                this.f503254f.A = m65Var.f461699g.f452104e;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneIbgGetTransaction", "hy: no biz info");
                this.f503254f.A = 0;
            }
            java.util.LinkedList linkedList = m65Var.f461698f.f464341r;
            if (linkedList != null && linkedList.size() > 0) {
                commodity.A = new java.util.ArrayList();
                java.util.Iterator it6 = m65Var.f461698f.f464341r.iterator();
                while (it6.hasNext()) {
                    r45.e65 e65Var = (r45.e65) it6.next();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.DiscountInfo discountInfo = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.DiscountInfo();
                    discountInfo.f261274e = e65Var.f454587d;
                    ((java.util.ArrayList) commodity.A).add(discountInfo);
                }
            }
            java.util.LinkedList linkedList2 = m65Var.f461700h;
            if (linkedList2 != null && linkedList2.size() > 0) {
                java.util.Iterator it7 = linkedList2.iterator();
                while (it7.hasNext()) {
                    r45.a65 a65Var = (r45.a65) it7.next();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Promotions promotions2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Promotions();
                    promotions2.f261304d = 1;
                    promotions2.f261308h = a65Var.f451311d;
                    promotions2.f261306f = a65Var.f451312e;
                    promotions2.f261305e = a65Var.f451313f;
                    promotions2.f261307g = a65Var.f451314g;
                    promotions2.f261311n = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(a65Var.f451317m, 0);
                    promotions2.f261310m = a65Var.f451318n;
                    promotions2.f261312o = a65Var.f451319o;
                    promotions2.f261313p = (int) a65Var.f451320p;
                    promotions2.f261317t = a65Var.f451321q;
                    promotions2.f261314q = (int) a65Var.f451322r;
                    promotions2.f261315r = a65Var.f451323s;
                    promotions2.f261316s = a65Var.f451324t;
                    promotions2.f261318u = a65Var.f451325u;
                    promotions2.f261319v = a65Var.f451326v;
                    promotions2.f261320w = a65Var.f451327w;
                    promotions2.f261321x = a65Var.f451328x;
                    ((java.util.ArrayList) commodity.H).add(promotions2);
                }
            }
            this.f503254f.M = new java.util.ArrayList();
            ((java.util.ArrayList) this.f503254f.M).add(commodity);
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f052 = this.f503254f;
            c19099x8d444f052.C = m65Var.f461698f.f464339p;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneIbgGetTransaction", "formatOrders finish, mOrder.commoditys.size: %s, mOrder: %s", java.lang.Integer.valueOf(((java.util.ArrayList) c19099x8d444f052.M).size()), this.f503254f);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kkk);
        }
        this.f503252d.mo815x76e0bfae(i18, i19, str, this);
    }
}
