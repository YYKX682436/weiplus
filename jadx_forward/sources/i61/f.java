package i61;

/* loaded from: classes9.dex */
public class f extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f370441d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.i f370442e;

    /* renamed from: f, reason: collision with root package name */
    public r45.j f370443f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f370444g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f370445h;

    public f(long j17, java.lang.String str, java.util.List list, int i17, long j18, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, boolean z17, java.util.LinkedList linkedList) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.i();
        lVar.f152198b = new r45.j();
        lVar.f152200d = 1624;
        lVar.f152199c = "/cgi-bin/mmpay-bin/newaalaunchbymoney";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f370445h = str2;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f370441d = a17;
        r45.i iVar = (r45.i) a17.f152243a.f152217a;
        this.f370442e = iVar;
        a17.m47986x306cfea3(true);
        if (list != null) {
            try {
                if (list.size() > 0) {
                    iVar.f458115d = list.size();
                    iVar.f458116e = j17;
                    iVar.f458117f = java.net.URLEncoder.encode(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                    java.util.LinkedList linkedList2 = new java.util.LinkedList();
                    iVar.f458118g = linkedList2;
                    linkedList2.addAll(list);
                    iVar.f458119h = i17;
                    iVar.f458120i = str2;
                    iVar.f458121m = at4.g0.c();
                    iVar.f458122n = j18;
                    iVar.f458123o = str3;
                    iVar.f458124p = str4;
                    iVar.f458125q = str5;
                    iVar.f458126r = str6;
                    iVar.f458127s = z17;
                    iVar.f458128t = linkedList;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneAALaunchByMoney", "build NetSceneAALaunchByMoney request error: %s", e17.getMessage());
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[11];
        objArr[0] = java.lang.Integer.valueOf(this.f370442e.f458115d);
        objArr[1] = java.lang.Long.valueOf(this.f370442e.f458116e);
        r45.i iVar2 = this.f370442e;
        objArr[2] = iVar2.f458117f;
        objArr[3] = iVar2.f458118g;
        objArr[4] = java.lang.Integer.valueOf(iVar2.f458119h);
        r45.i iVar3 = this.f370442e;
        objArr[5] = iVar3.f458120i;
        objArr[6] = java.lang.Long.valueOf(iVar3.f458122n);
        r45.i iVar4 = this.f370442e;
        java.lang.String str7 = iVar4.f458123o;
        objArr[7] = str7 == null ? "" : str7;
        java.lang.String str8 = iVar4.f458124p;
        objArr[8] = str8 == null ? "" : str8;
        java.lang.String str9 = iVar4.f458125q;
        objArr[9] = str9 == null ? "" : str9;
        java.lang.String str10 = iVar4.f458126r;
        objArr[10] = str10 != null ? str10 : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneAALaunchByMoney", "NetSceneAALaunchByMoney, total_num: %s, per_amount: %s, title: %s, payer_list: %s, scene: %s, groupid: %s, timestamp: %s, pic_cdn_url: %s, pic_cdn_thumb_url: %s, pf_order_no: %s,pic_cdn_md5:%s", objArr);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneAALaunchByMoney", "doScene");
        this.f370444g = u0Var;
        return mo9409x10f9447a(sVar, this.f370441d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1624;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneAALaunchByMoney", "onGYNetEnd, errType: %s, errCode: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        r45.j jVar = (r45.j) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f370443f = jVar;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(jVar.f458959d);
        r45.j jVar2 = this.f370443f;
        objArr[1] = jVar2.f458960e;
        objArr[2] = java.lang.Boolean.valueOf(jVar2.f458962g == null);
        objArr[3] = this.f370443f.f458961f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneAALaunchByMoney", "retcode: %s, retmsg: %s, msgxml==null: %s, billNo: %s", objArr);
        java.lang.String str2 = this.f370443f.f458962g;
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f370444g;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    public f(long j17, java.lang.String str, int i17, int i18, long j18, java.lang.String str2) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.i();
        lVar.f152198b = new r45.j();
        lVar.f152200d = 1624;
        lVar.f152199c = "/cgi-bin/mmpay-bin/newaalaunchbymoney";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f370441d = a17;
        r45.i iVar = (r45.i) a17.f152243a.f152217a;
        this.f370442e = iVar;
        this.f370445h = str2;
        try {
            iVar.f458115d = i17;
            iVar.f458116e = j17;
            iVar.f458117f = java.net.URLEncoder.encode(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            iVar.f458118g = new java.util.LinkedList();
            iVar.f458119h = i18;
            iVar.f458120i = str2;
            iVar.f458121m = at4.g0.c();
            iVar.f458122n = j18;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneAALaunchByMoney", "build NetSceneAALaunchByMoney request error: %s", e17.getMessage());
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f370442e.f458115d);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(this.f370442e.f458116e);
        r45.i iVar2 = this.f370442e;
        java.lang.String str3 = iVar2.f458117f;
        java.util.LinkedList linkedList = iVar2.f458118g;
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(iVar2.f458119h);
        r45.i iVar3 = this.f370442e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneAALaunchByMoney", "NetSceneAALaunchByMoney, total_num: %s, per_amount: %s, title: %s, payer_list: %s, scene: %s, groupid: %s, timestamp", valueOf, valueOf2, str3, linkedList, valueOf3, iVar3.f458120i, java.lang.Long.valueOf(iVar3.f458122n));
    }
}
