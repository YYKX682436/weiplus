package mq4;

/* loaded from: classes14.dex */
public class a0 extends mq4.e0 {
    public a0(int i17, long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String[] strArr, java.lang.String[] strArr2, java.lang.String[] strArr3, java.lang.String[] strArr4) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.t37();
        lVar.f152198b = new r45.u37();
        lVar.f152199c = "/cgi-bin/micromsg-bin/voipstatreport";
        lVar.f152200d = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f412326d = a17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a17.f152243a.f152217a;
        r45.t37 t37Var = (r45.t37) fVar;
        r45.s37 s37Var = new r45.s37();
        r45.du5 du5Var = new r45.du5();
        du5Var.c(str2);
        s37Var.f467018d = du5Var;
        r45.s37 s37Var2 = new r45.s37();
        r45.du5 du5Var2 = new r45.du5();
        du5Var2.c(str3);
        s37Var2.f467018d = du5Var2;
        r45.s37 s37Var3 = new r45.s37();
        r45.du5 du5Var3 = new r45.du5();
        du5Var3.c(str4);
        s37Var3.f467018d = du5Var3;
        r45.s37 s37Var4 = new r45.s37();
        r45.du5 du5Var4 = new r45.du5();
        du5Var4.c(str5);
        s37Var4.f467018d = du5Var4;
        r45.s37 s37Var5 = new r45.s37();
        r45.du5 du5Var5 = new r45.du5();
        du5Var5.c(str6);
        s37Var5.f467018d = du5Var5;
        t37Var.f467645d = s37Var;
        t37Var.f467647f = s37Var2;
        t37Var.f467646e = s37Var3;
        t37Var.f467648g = s37Var4;
        t37Var.f467650i = s37Var5;
        vq4.d0.a("MicroMsg.NetSceneVoipStatReport", "natReportList length:" + strArr.length);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i18 = 0; i18 < strArr.length; i18++) {
            r45.du5 du5Var6 = new r45.du5();
            du5Var6.f454289d = strArr[i18];
            du5Var6.f454290e = true;
            linkedList.add(du5Var6);
        }
        t37Var.f467651m = linkedList.size();
        t37Var.f467652n = linkedList;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        for (java.lang.String str7 : strArr2) {
            r45.du5 du5Var7 = new r45.du5();
            du5Var7.f454289d = str7;
            du5Var7.f454290e = true;
            linkedList2.add(du5Var7);
        }
        t37Var.f467653o = linkedList2.size();
        t37Var.f467654p = linkedList2;
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        for (java.lang.String str8 : strArr3) {
            r45.du5 du5Var8 = new r45.du5();
            du5Var8.f454289d = str8;
            du5Var8.f454290e = true;
            linkedList3.add(du5Var8);
        }
        t37Var.f467655q = linkedList3.size();
        t37Var.f467656r = linkedList3;
        java.util.LinkedList linkedList4 = new java.util.LinkedList();
        for (java.lang.String str9 : strArr4) {
            r45.du5 du5Var9 = new r45.du5();
            du5Var9.f454289d = str9;
            du5Var9.f454290e = true;
            linkedList4.add(du5Var9);
        }
        t37Var.f467657s = linkedList4.size();
        t37Var.f467658t = linkedList4;
    }

    @Override // mq4.e0
    public com.p314xaae8f345.mm.p944x882e457a.u0 J() {
        return new mq4.z(this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e;
    }
}
