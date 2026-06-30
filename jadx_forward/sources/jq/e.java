package jq;

/* loaded from: classes8.dex */
public class e implements qk.n7 {
    public void a(java.lang.String str, qk.h6 h6Var, r45.j4 j4Var, java.util.List list) {
        com.p314xaae8f345.mm.p944x882e457a.n0 a17;
        try {
            b(j4Var);
            r45.tp tpVar = h6Var.f66761xe40d67b3;
            if (tpVar != null && (a17 = com.p314xaae8f345.mm.p944x882e457a.l0.a(tpVar.f468169d)) != null) {
                a17.b(h6Var.f66761xe40d67b3);
            }
            com.p314xaae8f345.mm.p944x882e457a.m0 m0Var = new com.p314xaae8f345.mm.p944x882e457a.m0();
            m0Var.f152220a = h6Var.f66761xe40d67b3;
            m0Var.f152221b = h6Var.f66769xf47740ff;
            long j17 = h6Var.f66758x27886e88;
            if (j17 == 0) {
                j17 = c01.id.a() / 1000;
            }
            j4Var.f459098o = (int) j17;
            h6Var.f66777x10a0fed7 = 100;
            h6Var.f66759xf1091605 = j4Var;
            com.p314xaae8f345.mm.p2621x8fb0427b.x7.f277864d.z0(str, h6Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.FunctionMsgDispatcher", "[onFunctionMsgAdd] item:%s CreateTime:%s", h6Var, java.lang.Integer.valueOf(j4Var.f459098o));
            if (list == null || list.size() <= 0) {
                com.p314xaae8f345.mm.p944x882e457a.t0 a18 = com.p314xaae8f345.mm.p944x882e457a.s0.a(java.lang.Integer.valueOf(j4Var.f459093g));
                if (a18 != null) {
                    a18.b1(new com.p314xaae8f345.mm.p944x882e457a.p0(j4Var, true, (java.lang.Object) m0Var));
                    return;
                }
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.FunctionMsgDispatcher", "[onFunctionMsgAdd] addMsgList.size:%s ", java.lang.Integer.valueOf(list.size()));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                r45.j4 j4Var2 = (r45.j4) it.next();
                if (j4Var2.f459098o <= 0) {
                    long j18 = h6Var.f66758x27886e88;
                    if (j18 == 0) {
                        j18 = c01.id.a() / 1000;
                    }
                    j4Var2.f459098o = (int) j18;
                }
                com.p314xaae8f345.mm.p944x882e457a.s0.a(java.lang.Integer.valueOf(j4Var2.f459093g)).b1(new com.p314xaae8f345.mm.p944x882e457a.p0(j4Var2, true, (java.lang.Object) m0Var));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FunctionMsg.FunctionMsgDispatcher", e17, "", new java.lang.Object[0]);
        }
    }

    public r45.j4 b(r45.j4 j4Var) {
        if (j4Var == null) {
            return null;
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = j4Var.f459091e;
        objArr[1] = java.lang.Integer.valueOf(j4Var.f459093g);
        objArr[2] = java.lang.Boolean.valueOf(j4Var.f459094h == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.FunctionMsgDispatcher", "processAddMsg, fromUser: %s, msgType: %s, content==null: %s", objArr);
        java.lang.String g17 = x51.j1.g(j4Var.f459091e);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (g17 == null) {
            g17 = "";
        }
        if ("readerapp".equals(g17)) {
            j4Var.f459091e = x51.j1.i("newsapp");
            j4Var.f459093g = 12399999;
        }
        if (!"blogapp".equals(g17) && !"newsapp".equals(g17)) {
            return j4Var;
        }
        j4Var.f459093g = 12399999;
        return j4Var;
    }
}
