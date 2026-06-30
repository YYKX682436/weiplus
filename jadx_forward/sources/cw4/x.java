package cw4;

/* loaded from: classes4.dex */
public final class x implements p012xc85e97e9.p093xedfae76a.y {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.b0 f305823d = new p012xc85e97e9.p093xedfae76a.b0(this, true);

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f305824e = new p012xc85e97e9.p093xedfae76a.j0();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f305825f = new java.util.HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f305826g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f305827h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public int f305828i;

    public final void a() {
        while (true) {
            java.util.LinkedList linkedList = this.f305827h;
            if (linkedList.size() >= 8) {
                return;
            }
            java.util.LinkedList linkedList2 = this.f305826g;
            if (linkedList2.isEmpty()) {
                return;
            }
            cw4.a0 a0Var = (cw4.a0) kz5.n0.X(linkedList2);
            if (linkedList2.size() > 0) {
                linkedList2.remove(0);
            }
            linkedList.add(a0Var);
            int i17 = this.f305828i + 1;
            this.f305828i = i17;
            if (i17 > 2000) {
                linkedList2.clear();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebTransCgiLogic", "cgi num over limit! %d", 2000);
                return;
            }
            try {
                java.util.LinkedList linkedList3 = new java.util.LinkedList();
                java.util.Iterator it = a0Var.f305726a.iterator();
                while (it.hasNext()) {
                    cw4.z zVar = (cw4.z) it.next();
                    r45.cq6 cq6Var = new r45.cq6();
                    cq6Var.f453324d = 1;
                    cq6Var.f453325e = zVar.f305840b;
                    cq6Var.f453327g = 17;
                    linkedList3.add(cq6Var);
                }
                r45.jp3 jp3Var = new r45.jp3();
                jp3Var.f459540e = linkedList3;
                jp3Var.f459539d = linkedList3.size();
                jp3Var.f459541f = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebTransCgiLogic", "request.msgCount = " + jp3Var.f459539d + ", request.TargetLang = " + jp3Var.f459541f);
                com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
                lVar.f152197a = jp3Var;
                lVar.f152198b = new r45.kp3();
                lVar.f152199c = "/cgi-bin/micromsg-bin/gettranstext";
                lVar.f152200d = 631;
                lVar.f152201e = 0;
                lVar.f152202f = 0;
                com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
                int hashCode = jp3Var.hashCode();
                this.f305825f.add(java.lang.Integer.valueOf(hashCode));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebTransCgiLogic", "translate: reqStringList size = " + linkedList3.size() + " hashcode = " + hashCode);
                ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(a17, new cw4.v(this, a0Var, hashCode));
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebTransCgiLogic", "translate: do cgi failed！！！");
                linkedList.remove(a0Var);
            }
        }
    }

    @Override // p012xc85e97e9.p093xedfae76a.y
    /* renamed from: getLifecycle */
    public p012xc85e97e9.p093xedfae76a.o mo273xed6858b4() {
        return this.f305823d;
    }
}
