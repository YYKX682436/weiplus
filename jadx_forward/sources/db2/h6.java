package db2;

/* loaded from: classes2.dex */
public final class h6 extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f309544g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f309545h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f309546i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f309547m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(java.util.LinkedList sendMarkReadList) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sendMarkReadList, "sendMarkReadList");
        this.f309544g = sendMarkReadList;
        this.f309545h = "Finder.NetSceneMarkRead";
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 3520;
        r45.qf2 qf2Var = new r45.qf2();
        qf2Var.set(2, sendMarkReadList);
        r45.kv0 a17 = db2.t4.f309704a.a(3520);
        java.util.Iterator it = sendMarkReadList.iterator();
        while (it.hasNext()) {
            r45.ni4 ni4Var = (r45.ni4) it.next();
            java.util.LinkedList m75941xfb821914 = a17.m75941xfb821914(7);
            if (m75941xfb821914 != null) {
                r45.fl2 fl2Var = new r45.fl2();
                fl2Var.set(1, ni4Var.m75945x2fec8307(4));
                fl2Var.set(0, java.lang.Long.valueOf(ni4Var.m75942xfb822ef2(0)));
                m75941xfb821914.add(fl2Var);
            }
        }
        qf2Var.set(1, a17);
        lVar.f152197a = qf2Var;
        r45.rf2 rf2Var = new r45.rf2();
        rf2Var.set(0, new r45.ie());
        lVar.f152198b = rf2Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findermarkread";
        this.f309546i = lVar.a();
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309545h, "onGYNetEnd " + i17 + ' ' + i18 + ' ' + i19 + ' ' + str + ' ' + this.f309544g.size());
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f309547m;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f309547m = u0Var;
        return mo9409x10f9447a(sVar, this.f309546i, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 3520;
    }
}
