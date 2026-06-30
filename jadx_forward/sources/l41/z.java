package l41;

/* loaded from: classes4.dex */
public class z extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0, ab0.u {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f397504d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f397505e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f397506f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f397507g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f397508h;

    /* renamed from: i, reason: collision with root package name */
    public final int f397509i;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00a4, code lost:
    
        r3 = r2.getString(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00ac, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r3) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ae, code lost:
    
        r5.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b5, code lost:
    
        if (r2.moveToNext() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b7, code lost:
    
        r5.size();
        r2.close();
        r0.addAll(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00a2, code lost:
    
        if (r2.moveToFirst() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z(java.lang.String r9, java.lang.String r10, java.util.LinkedList r11, int r12) {
        /*
            r8 = this;
            r8.<init>()
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r8.f397508h = r0
            r1 = 0
            r8.f397509i = r1
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r9)
            r3 = 1
            java.lang.String r4 = "MicroMsg.Openim.NetSceneGetOpenIMResource"
            if (r2 != 0) goto L2d
            java.lang.String r2 = "wework"
            boolean r2 = r9.equals(r2)
            if (r2 == 0) goto L2d
            java.lang.String r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(r3)
            java.lang.Object[] r2 = new java.lang.Object[]{r9, r2}
            java.lang.String r3 = "NetSceneGetOpenIMResource error %s stack %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r4, r3, r2)
            goto L3a
        L2d:
            java.lang.String r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(r3)
            java.lang.Object[] r2 = new java.lang.Object[]{r9, r2}
            java.lang.String r3 = "NetSceneGetOpenIMResource normal %s stack %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r4, r3, r2)
        L3a:
            com.tencent.mm.modelbase.l r2 = new com.tencent.mm.modelbase.l
            r2.<init>()
            r45.hk3 r3 = new r45.hk3
            r3.<init>()
            r2.f152197a = r3
            r45.ik3 r3 = new r45.ik3
            r3.<init>()
            r2.f152198b = r3
            java.lang.String r3 = "/cgi-bin/micromsg-bin/getopenimresource"
            r2.f152199c = r3
            r3 = 453(0x1c5, float:6.35E-43)
            r2.f152200d = r3
            com.tencent.mm.modelbase.o r2 = r2.a()
            r8.f397505e = r2
            r8.f397506f = r9
            r8.f397507g = r10
            r8.f397509i = r12
            r0.addAll(r11)
            int r2 = r0.size()
            int r2 = 10 - r2
            if (r2 <= 0) goto Lc0
            java.lang.Class<i41.l> r3 = i41.l.class
            i95.m r3 = i95.n0.c(r3)
            i41.l r3 = (i41.l) r3
            u41.l r3 = r3.Ui()
            r3.getClass()
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = " select wordingId from OpenIMWordingInfo where language='"
            r6.<init>(r7)
            r6.append(r10)
            java.lang.String r7 = "' order by updateTime limit "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            r6 = 2
            l75.k0 r3 = r3.f506170d
            r7 = 0
            android.database.Cursor r2 = r3.f(r2, r7, r6)
            boolean r3 = r2.moveToFirst()
            if (r3 == 0) goto Lb7
        La4:
            java.lang.String r3 = r2.getString(r1)
            boolean r6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r3)
            if (r6 != 0) goto Lb1
            r5.add(r3)
        Lb1:
            boolean r3 = r2.moveToNext()
            if (r3 != 0) goto La4
        Lb7:
            r5.size()
            r2.close()
            r0.addAll(r5)
        Lc0:
            com.tencent.mm.modelbase.o r0 = r8.f397505e
            com.tencent.mm.modelbase.m r0 = r0.f152243a
            com.tencent.mm.protobuf.f r0 = r0.f152217a
            r45.hk3 r0 = (r45.hk3) r0
            r0.f457775e = r9
            r0.f457774d = r10
            java.util.LinkedList r1 = r8.f397508h
            r0.f457776f = r1
            r0.f457777g = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.String r11 = r8.H(r11)
            java.util.LinkedList r0 = r8.f397508h
            java.lang.String r0 = r8.H(r0)
            java.lang.Object[] r9 = new java.lang.Object[]{r9, r10, r12, r11, r0}
            java.lang.String r10 = "init NetSceneGetOpenIMResource appid:%s, lang:%s, subType: %s, initWordingIDs:%s, wordidList:%s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r10, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l41.z.<init>(java.lang.String, java.lang.String, java.util.LinkedList, int):void");
    }

    public final java.lang.String H(java.util.LinkedList linkedList) {
        java.lang.String str = "size:" + linkedList.size() + "[";
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            str = str + ((java.lang.String) it.next()) + ",";
        }
        return str + "]";
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f397504d = u0Var;
        return mo9409x10f9447a(sVar, this.f397505e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 453;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i19);
        java.lang.String str2 = this.f397506f;
        java.lang.String str3 = this.f397507g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Openim.NetSceneGetOpenIMResource", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, appid:%s, lang:%s", valueOf, valueOf2, str, str2, str3);
        if (i18 != 0 || i19 != 0) {
            this.f397504d.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        r45.ik3 ik3Var = (r45.ik3) this.f397505e.f152244b.f152233a;
        r45.j1 j1Var = ik3Var.f458641e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Openim.NetSceneGetOpenIMResource", "onGYNetEnd acct_type_resource  url:%d, word:%d", java.lang.Integer.valueOf(j1Var.f459022f.size()), java.lang.Integer.valueOf(j1Var.f459021e.size()));
        u41.a aVar = new u41.a();
        aVar.f68055x5a0dd04d = j1Var.f459020d;
        aVar.f68056xbd959cfd = str3;
        ((i41.l) i95.n0.c(i41.l.class)).wi().get(aVar, "acctTypeId", com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68);
        aVar.f68054xfbe59f9a = j1Var;
        ((i41.l) i95.n0.c(i41.l.class)).wi().mo11260x413cb2b4(aVar);
        r45.x8 x8Var = ik3Var.f458640d;
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(x8Var.f471383d);
        java.util.LinkedList linkedList = x8Var.f471385f;
        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(linkedList.size());
        java.lang.Integer valueOf5 = java.lang.Integer.valueOf(x8Var.f471384e.size());
        int i27 = this.f397509i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Openim.NetSceneGetOpenIMResource", "onGYNetEnd appid_resource funcFlag:%d, url:%d, word:%d, subType: %s", valueOf3, valueOf4, valueOf5, java.lang.Integer.valueOf(i27));
        u41.c cVar = new u41.c();
        cVar.f68188x28d46377 = str2;
        cVar.f68189xbd959cfd = str3;
        cVar.f68190x5334f55 = i27;
        ((i41.l) i95.n0.c(i41.l.class)).Ai().get(cVar, "appid", com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68, "subType");
        cVar.f68187xf1b7b594 = x8Var;
        cVar.f68186x5a0dd04d = j1Var.f459020d;
        ((i41.l) i95.n0.c(i41.l.class)).Ai().mo11260x413cb2b4(cVar);
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.j15 j15Var = (r45.j15) it.next();
            if ("openim_desc_icon".equals(j15Var.f459027d)) {
                ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).cj(j15Var.f459028e);
            }
        }
        java.util.LinkedList linkedList2 = ik3Var.f458642f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Openim.NetSceneGetOpenIMResource", "onGYNetEnd wording_id_resource   word:%d", java.lang.Integer.valueOf(linkedList2.size()));
        java.util.Iterator it6 = linkedList2.iterator();
        while (it6.hasNext()) {
            r45.mb7 mb7Var = (r45.mb7) it6.next();
            u41.k kVar = new u41.k();
            kVar.f69018x28d46377 = str2;
            kVar.f69024xd0366ace = mb7Var.f461872d;
            kVar.f69019xbd959cfd = str3;
            ((i41.l) i95.n0.c(i41.l.class)).Ui().get(kVar, "appid", "wordingId", com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68);
            java.lang.String str4 = mb7Var.f461873e;
            kVar.f69023xcf77aa53 = str4;
            kVar.f69020xaed6c8e = mb7Var.f461874f;
            kVar.f69021x9b64705f = mb7Var.f461875g;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Openim.NetSceneGetOpenIMResource", "onGYNetEnd update wordingId: %s, lang: %s, wording: %s, appId: %s", kVar.f69024xd0366ace, kVar.f69019xbd959cfd, str4, kVar.f69018x28d46377);
            ((i41.l) i95.n0.c(i41.l.class)).Ui().mo11260x413cb2b4(kVar);
        }
        this.f397504d.mo815x76e0bfae(i18, i19, str, this);
    }
}
