package ke2;

/* loaded from: classes2.dex */
public final class x0 extends az2.v {

    /* renamed from: g, reason: collision with root package name */
    public int f388530g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f388531h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f388532i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(java.lang.String targetUsername, java.lang.String myUsername, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.qt2 qt2Var) {
        super(qt2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetUsername, "targetUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(myUsername, "myUsername");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 5870;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderliveuserpage";
        r45.wd2 wd2Var = new r45.wd2();
        wd2Var.set(3, myUsername);
        wd2Var.set(2, targetUsername);
        wd2Var.set(4, gVar);
        db2.t4 t4Var = db2.t4.f309704a;
        wd2Var.set(5, t4Var.n());
        wd2Var.set(1, t4Var.b(5870, qt2Var));
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.s0().r()).booleanValue()) {
            wd2Var.set(6, java.lang.Long.valueOf(wd2Var.m75942xfb822ef2(6) | 8));
        }
        lVar.f152197a = wd2Var;
        lVar.f152198b = new r45.xd2();
        this.f388531h = lVar.a();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(wd2Var.m75945x2fec8307(2));
        sb6.append(',');
        sb6.append(wd2Var.m75945x2fec8307(3));
        sb6.append(',');
        sb6.append(wd2Var.m75934xbce7f2f(4) == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetSceneFinderLiveUserPage", sb6.toString());
    }

    @Override // az2.v, az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        super.J(i17, i18, i19, str, v0Var, bArr);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetSceneFinderLiveUserPage", "onCgiEnd: errType=" + i18 + ", errCode=" + i19 + ", errMsg=" + str + ",resp list:" + cm2.a.f124861a.e(M()));
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f388532i;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // az2.v
    public java.util.List K(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        java.util.List M = M();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(M, 10));
        java.util.Iterator it = M.iterator();
        while (it.hasNext()) {
            arrayList.add(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.h90.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec, (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it.next(), 0, 2, null));
        }
        return arrayList;
    }

    @Override // az2.v
    public long L() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f388531h.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveUserPageRequest");
        r45.kv0 kv0Var = (r45.kv0) ((r45.wd2) fVar).m75936x14adae67(1);
        if (kv0Var != null) {
            return kv0Var.m75942xfb822ef2(5);
        }
        return 0L;
    }

    public final java.util.List M() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f388531h.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveUserPageResponse");
        java.util.LinkedList m75941xfb821914 = ((r45.xd2) fVar).m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObject(...)");
        return m75941xfb821914;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f388532i = u0Var;
        return mo9409x10f9447a(sVar, this.f388531h, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 5870;
    }
}
