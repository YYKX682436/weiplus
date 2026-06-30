package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class y2 implements com.p314xaae8f345.mm.ui.g3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.k3 f294105a;

    public y2(com.p314xaae8f345.mm.ui.k3 k3Var) {
        this.f294105a = k3Var;
    }

    @Override // com.p314xaae8f345.mm.ui.g3
    public void a() {
        boolean z17;
        android.util.SparseArray[] sparseArrayArr;
        android.database.Cursor B;
        android.util.SparseArray[] n17;
        com.p314xaae8f345.mm.ui.k3 k3Var = this.f294105a;
        java.util.HashMap hashMap = k3Var.f290553g;
        if (hashMap == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(k3Var.f290550d, "events is null");
            return;
        }
        for (com.p314xaae8f345.mm.ui.e3 e3Var : hashMap.values()) {
            if (e3Var == null || e3Var.f289895b == 5) {
                if (e3Var == null) {
                }
            }
            z17 = false;
        }
        z17 = true;
        if (z17) {
            java.util.HashSet hashSet = new java.util.HashSet(k3Var.f290553g.size());
            java.util.Iterator it = k3Var.f290553g.values().iterator();
            while (it.hasNext()) {
                hashSet.add(((com.p314xaae8f345.mm.ui.e3) it.next()).f289894a);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k3Var.f290550d, "newcursor all event is delete, event:%s", java.lang.Integer.valueOf(k3Var.f290553g.size()));
            k3Var.f290552f.f331971a.t(hashSet.toArray(), null);
        } else if (k3Var.f290553g.containsKey(null)) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            k3Var.m(k3Var.h(k3Var.f()), true, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k3Var.f290550d, "cache unuseful,reset cursor,last : %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        } else {
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.ui.f3 f3Var = k3Var.f290552f;
            if (f3Var == null || (n17 = f3Var.f331971a.n1()) == null) {
                sparseArrayArr = null;
            } else {
                int length = n17.length;
                sparseArrayArr = new android.util.SparseArray[length];
                for (int i17 = 0; i17 < length; i17++) {
                    sparseArrayArr[i17] = new android.util.SparseArray();
                    for (int i18 = 0; i18 < n17[i17].size(); i18++) {
                        sparseArrayArr[i17].put(i18, n17[i17].get(i18));
                    }
                }
            }
            new java.util.HashSet(k3Var.f290553g.values());
            com.p314xaae8f345.mm.ui.p2690x38b72420.e eVar = (com.p314xaae8f345.mm.ui.p2690x38b72420.e) k3Var;
            android.util.SparseArray[] sparseArrayArr2 = new android.util.SparseArray[sparseArrayArr.length];
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add("weixin");
            java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p2621x8fb0427b.e8 q17 = c01.d9.b().q();
            java.util.List list = eVar.f288207x;
            boolean u17 = eVar.u();
            com.p314xaae8f345.mm.p2621x8fb0427b.k4 k4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.k4) q17;
            java.lang.String str = "select username from rcontact " + k4Var.I(eVar.f288205v, eVar.f288206w, list) + k4Var.N(linkedList) + " order by showHead asc,  case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull)  else upper(quanPin) end asc,  case when length(conRemark) > 0 then upper(conRemark)  else upper(quanPin) end asc,  upper(quanPin) asc,  upper(nickname) asc,  upper(username) asc ";
            l75.k0 k0Var = k4Var.f276604d;
            if (u17) {
                e95.h[] hVarArr = new e95.h[2];
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select username from rcontact ");
                sb6.append(k4Var.F(list, eVar.f288204J));
                com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = com.p314xaae8f345.mm.p2621x8fb0427b.z3.M2;
                sb6.append(" order by case when verifyFlag & 8 != 0 then 0 else 1 end , showHead asc,  case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull)  else upper(quanPin) end asc,  case when length(conRemark) > 0 then upper(conRemark)  else upper(quanPin) end asc,  upper(quanPin) asc,  upper(nickname) asc,  upper(username) asc ");
                android.database.Cursor f17 = k0Var.f(sb6.toString(), null, 4);
                android.database.Cursor f18 = k0Var.f(str, null, 4);
                if ((f17 instanceof e95.h) && (f18 instanceof e95.h)) {
                    hVarArr[0] = (e95.h) f17;
                    hVarArr[1] = (e95.h) f18;
                    B = new e95.j(hVarArr);
                } else {
                    B = d95.d.a();
                }
            } else {
                B = k0Var.B(str, null);
            }
            if (B instanceof e95.j) {
                e95.h[] hVarArr2 = ((e95.j) B).f331956f;
                int length2 = hVarArr2.length;
                for (int i19 = 0; i19 < length2; i19++) {
                    hVarArr2[i19].u1(5000);
                    sparseArrayArr2[i19] = new android.util.SparseArray();
                    int i27 = 0;
                    while (hVarArr2[i19].moveToNext()) {
                        sparseArrayArr2[i19].put(i27, hVarArr2[i19].getString(0));
                        i27++;
                    }
                }
                eVar.H = hVarArr2[0].getCount();
            } else {
                int i28 = 0;
                sparseArrayArr2[0] = new android.util.SparseArray();
                int i29 = 0;
                while (B.moveToNext()) {
                    sparseArrayArr2[i28].put(i29, B.getString(i28));
                    i29++;
                    i28 = 0;
                }
            }
            B.close();
            java.lang.System.currentTimeMillis();
            int length3 = sparseArrayArr.length;
            if (length3 > 1) {
                for (int i37 = 0; i37 < length3; i37++) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k3Var.f290550d, "newcursor %d  refreshPosistion last :%d, oldpos size is %d ,newpos size is %d  ", java.lang.Integer.valueOf(i37), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis2), java.lang.Integer.valueOf(sparseArrayArr[i37].size()), java.lang.Integer.valueOf(sparseArrayArr2[i37].size()));
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k3Var.f290550d, "newcursor refreshPosistion last :%d, oldpos size is %d ,newpos size is %d  ", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis2), java.lang.Integer.valueOf(sparseArrayArr[0].size()), java.lang.Integer.valueOf(sparseArrayArr2[0].size()));
            }
            for (com.p314xaae8f345.mm.ui.e3 e3Var2 : k3Var.f290553g.values()) {
                if (e3Var2 != null) {
                    java.lang.Object obj = e3Var2.f289894a;
                    java.lang.Object obj2 = e3Var2.f289896c;
                    if (obj2 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k3Var.f290550d, "newcursor notify cache update : key : %s ", obj);
                    }
                    k3Var.f290552f.f331971a.t(obj, (e95.a) obj2);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(k3Var.f290550d, "newcursor event is null ! ");
                }
            }
            android.util.SparseArray[] n18 = k3Var.f290552f.f331971a.n1();
            for (int i38 = 0; i38 < n18.length; i38++) {
                n18[i38].clear();
                for (int i39 = 0; i39 < sparseArrayArr2[i38].size(); i39++) {
                    n18[i38].put(i39, sparseArrayArr2[i38].get(i39));
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k3Var.f290550d, "newcursor after resort new pos size:%d, event:%s", java.lang.Integer.valueOf(k3Var.f290552f.f331971a.n1()[0].size()), java.lang.Integer.valueOf(k3Var.f290553g.size()));
        }
        k3Var.f290553g.clear();
    }
}
