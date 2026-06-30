package db2;

/* loaded from: classes.dex */
public final class i1 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public static final db2.h1 f309548t = new db2.h1(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(java.lang.String username, r45.cd1 cd1Var, r45.cd1 cd1Var2, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        r45.a91 a91Var = new r45.a91();
        a91Var.set(1, db2.t4.f309704a.b(7566, qt2Var));
        a91Var.set(3, username);
        if (cd1Var != null) {
            a91Var.m75941xfb821914(2).add(cd1Var);
        }
        if (cd1Var2 != null) {
            a91Var.m75941xfb821914(2).add(cd1Var2);
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = a91Var;
        lVar.f152198b = new r45.b91();
        lVar.f152200d = 7566;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetnewlbslist";
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderGetNewLbsList", "init GetLbsList");
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.util.ArrayList arrayList;
        r45.b91 resp = (r45.b91) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("errType ");
        sb6.append(i17);
        sb6.append(", errCode ");
        sb6.append(i18);
        sb6.append(", errMsg ");
        sb6.append(str);
        sb6.append(' ');
        java.util.LinkedList<r45.dd1> m75941xfb821914 = resp.m75941xfb821914(1);
        if (m75941xfb821914 != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
            for (r45.dd1 dd1Var : m75941xfb821914) {
                arrayList.add("lbs_type:" + dd1Var.m75939xb282bd08(0) + " city:" + dd1Var.m75945x2fec8307(3) + ' ' + dd1Var.m75941xfb821914(4) + '\n');
            }
        } else {
            arrayList = null;
        }
        sb6.append(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderGetNewLbsList", sb6.toString());
    }
}
