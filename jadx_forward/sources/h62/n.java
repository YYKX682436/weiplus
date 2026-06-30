package h62;

/* loaded from: classes9.dex */
public class n extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f360735d;

    /* renamed from: e, reason: collision with root package name */
    public final int f360736e;

    /* renamed from: f, reason: collision with root package name */
    public int f360737f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f360738g;

    public n(int i17) {
        this.f360736e = 0;
        this.f360737f = 1;
        this.f360736e = i17;
        this.f360737f = i17 == 3 ? 0 : 1;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.List a17 = j62.b.f().a();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(4096);
        java.util.ArrayList arrayList = (java.util.ArrayList) a17;
        if (arrayList.size() > 0) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6426x3c8b73d3 c6426x3c8b73d3 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6426x3c8b73d3();
            java.util.Iterator it = arrayList.iterator();
            int i18 = 0;
            while (it.hasNext()) {
                j62.a aVar = (j62.a) it.next();
                if (aVar != null) {
                    r45.hm0 hm0Var = new r45.hm0();
                    int i19 = aVar.f379412d;
                    hm0Var.f457816d = i19;
                    hm0Var.f457817e = aVar.f379413e;
                    int i27 = aVar.f379414f;
                    hm0Var.f457818f = i27;
                    hm0Var.f457821i = aVar.f379421p;
                    c6426x3c8b73d3.f137660d = i19;
                    c6426x3c8b73d3.f137661e = i27;
                    c6426x3c8b73d3.f137663g = aVar.f379415g;
                    c6426x3c8b73d3.f137662f = 1;
                    c6426x3c8b73d3.l();
                    linkedList.add(hm0Var);
                    if (i18 >= 100) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetExptApp", "req local expt app List [%s]", sb6);
                        sb6.setLength(0);
                        i18 = 0;
                    }
                    sb6.append("{Id: " + aVar.f379412d + " group: " + aVar.f379413e + " seq: " + aVar.f379414f + "}");
                    sb6.append(";");
                    i18++;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetExptApp", "req local expt app List [%s] cost[%d]", sb6, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        this.f360738g = linkedList;
    }

    public final r45.je0 H() {
        r45.je0 je0Var = new r45.je0();
        je0Var.f459272d = android.os.Build.MANUFACTURER;
        je0Var.f459273e = wo.w0.m();
        java.lang.String str = android.os.Build.VERSION.SDK_INT + "";
        je0Var.f459274f = str;
        java.lang.String str2 = android.os.Build.CPU_ABI;
        je0Var.f459275g = str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetExptApp", "create Device type manufacturer[%s] model[%s] os_api[%s] cpu[%s]", je0Var.f459272d, je0Var.f459273e, str, str2);
        return je0Var;
    }

    public final void I(int i17) {
        int i18 = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        if (i18 > i17) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GET_EXPT_APP_LAST_TIME_SEC_INT, java.lang.Integer.valueOf(i18));
        } else {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GET_EXPT_APP_LAST_TIME_SEC_INT, java.lang.Integer.valueOf(i17));
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f360735d = u0Var;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        try {
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152197a = new r45.bf3();
            lVar.f152198b = new r45.cf3();
            lVar.f152199c = "/cgi-bin/mmfddataappsvr/getexptappconfig";
            lVar.f152200d = 1110;
            lVar.f152201e = 0;
            lVar.f152202f = 0;
            com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
            r45.bf3 bf3Var = (r45.bf3) a17.f152243a.f152217a;
            bf3Var.f452255e = this.f360736e;
            bf3Var.f452254d = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GET_EXPT_APP_LAST_TIME_SEC_INT, 0)).intValue();
            bf3Var.f452256f = H();
            bf3Var.f452259i = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GET_EXPT_APP_GLOBAL_SEQ_STRING, "");
            if (!gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_NEXT_GET_EXPT_APP_IS_INCREMENT_BOOLEAN, true)) {
                this.f360737f = 0;
            }
            bf3Var.f452258h = this.f360737f;
            int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GET_EXPT_APP_NEED_LOCAL_LIST_INT, 1)).intValue();
            java.util.LinkedList linkedList = this.f360738g;
            if (intValue == 1 || bf3Var.f452258h == 0) {
                bf3Var.f452257g = linkedList;
            }
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.mo68477x336bdfd8(863L, 155L, 1L, false);
            if (this.f360737f == 0) {
                fVar.mo68477x336bdfd8(863L, 166L, 1L, false);
            } else {
                fVar.mo68477x336bdfd8(863L, 167L, 1L, false);
            }
            java.lang.Object[] objArr = new java.lang.Object[8];
            objArr[0] = java.lang.Integer.valueOf(bf3Var.f452255e);
            objArr[1] = java.lang.Integer.valueOf(bf3Var.f452254d);
            objArr[2] = java.lang.Integer.valueOf(bf3Var.f452258h);
            objArr[3] = bf3Var.f452259i;
            objArr[4] = java.lang.Integer.valueOf(intValue);
            objArr[5] = java.lang.Integer.valueOf(linkedList != null ? linkedList.size() : 0);
            java.util.LinkedList linkedList2 = bf3Var.f452257g;
            objArr[6] = java.lang.Integer.valueOf(linkedList2 != null ? linkedList2.size() : 0);
            objArr[7] = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetExptApp", "get expt app scene[%d] lastGetSvrSec[%d] IsIncrement[%d] GlobalSequence[%s] nextReqNeedLocalList[%d] localExptList[%d %d] cost[%d]", objArr);
            return mo9409x10f9447a(sVar, a17, this);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneGetExptApp", e17, "", new java.lang.Object[0]);
            return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1110;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            r45.cf3 cf3Var = (r45.cf3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
            ((ku5.t0) ku5.t0.f394148d).h(new h62.m(this, cf3Var), "netscene_getexpt");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneGetExptApp", "get expt error");
            I((int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
            jx3.f.INSTANCE.mo68477x336bdfd8(863L, 157L, 1L, false);
        }
        this.f360735d.mo815x76e0bfae(i18, i19, str, this);
    }
}
