package z73;

/* loaded from: classes11.dex */
public class d extends z73.a {

    /* renamed from: p, reason: collision with root package name */
    public final oq1.p f552113p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f552114q;

    public d(java.util.List list, oq1.p pVar) {
        this.f552114q = list;
        this.f552113p = pVar;
        this.f552107n = 2;
        this.f552103g = "";
        this.f552102f = "";
        this.f552105i = "";
        this.f552108o = 0;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            oq1.r rVar = (oq1.r) it.next();
            r45.f35 f35Var = new r45.f35();
            f35Var.f455520d = rVar.f428902b;
            f35Var.f455521e = rVar.f428903c;
            f35Var.f455524h = "liteappconfig_" + rVar.f428901a;
            f35Var.f455526m = 2;
            f35Var.f455527n = rVar.f428904d;
            f35Var.f455525i = new java.util.LinkedList();
            java.util.LinkedList linkedList = new java.util.LinkedList();
            f35Var.f455522f = linkedList;
            linkedList.addAll(z73.h.c());
            java.util.LinkedList linkedList2 = f35Var.f455522f;
            r45.e35 e35Var = new r45.e35();
            e35Var.f454501d = "package_id";
            e35Var.f454502e = "wechat-android";
            linkedList2.add(e35Var);
            this.f552106m.add(f35Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1821, 2);
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Tinker.NetSceneCheckLiteAppUpdate", "errType:%d errCode:%d errMsg:%s ", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<oq1.r> list = this.f552114q;
        if (i18 == 0 && i19 == 0) {
            java.util.Iterator it = ((r45.g35) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a).f456390h.iterator();
            while (it.hasNext()) {
                r45.g35 g35Var = (r45.g35) it.next();
                r45.j35 j35Var = g35Var.f456386d;
                oq1.q qVar = new oq1.q();
                if (j35Var != null) {
                    r45.bs5 bs5Var = j35Var.f459071i;
                    if (bs5Var != null) {
                        qVar.f428883e = bs5Var.f452558d;
                        qVar.f428882d = bs5Var.f452560f;
                        qVar.f428886h = bs5Var.f452565n;
                    } else {
                        java.util.LinkedList linkedList = j35Var.f459075p;
                        if (linkedList != null && linkedList.size() > 0) {
                            r45.bs5 bs5Var2 = (r45.bs5) linkedList.getFirst();
                            qVar.f428883e = bs5Var2.f452558d;
                            qVar.f428882d = bs5Var2.f452560f;
                            qVar.f428886h = bs5Var2.f452565n;
                        }
                    }
                    qVar.f428880b = java.lang.Integer.valueOf(j35Var.f459067e);
                    qVar.f428881c = java.lang.Integer.valueOf(j35Var.f459069g);
                    qVar.f428884f = j35Var.f459066d;
                    java.util.LinkedList linkedList2 = j35Var.f459073n;
                    if (linkedList2 != null) {
                        java.util.Iterator it6 = linkedList2.iterator();
                        while (it6.hasNext()) {
                            r45.h35 h35Var = (r45.h35) it6.next();
                            if ("signature_key".equals(h35Var.f457339d)) {
                                qVar.f428885g = h35Var.f457340e;
                            }
                        }
                    }
                }
                qVar.f428879a = g35Var.f456387e;
                qVar.f428887i = g35Var.f456391i;
                arrayList.add(qVar);
            }
        } else {
            for (oq1.r rVar : list) {
                oq1.q qVar2 = new oq1.q();
                qVar2.f428879a = rVar.f428901a;
                qVar2.f428887i = -1;
                arrayList.add(qVar2);
            }
        }
        if (list.size() > arrayList.size()) {
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.Iterator it7 = arrayList.iterator();
            while (it7.hasNext()) {
                hashSet.add(((oq1.q) it7.next()).f428879a);
            }
            for (oq1.r rVar2 : list) {
                if (!hashSet.contains(rVar2.f428901a)) {
                    oq1.q qVar3 = new oq1.q();
                    qVar3.f428879a = rVar2.f428901a;
                    qVar3.f428887i = -1;
                    arrayList.add(qVar3);
                }
            }
        }
        this.f552113p.a(arrayList);
        this.f552101e.mo815x76e0bfae(i18, i19, str, this);
    }
}
