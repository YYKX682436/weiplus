package com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e;

/* loaded from: classes8.dex */
public final class d1 implements kk3.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1 f231959a;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1 i1Var) {
        this.f231959a = i1Var;
    }

    @Override // kk3.b
    public final void a(java.util.List list) {
        if (list != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1 i1Var = this.f231959a;
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            try {
                java.util.Iterator it = list.iterator();
                int i17 = 0;
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c) it.next();
                    org.json.JSONObject u07 = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c.u0(c16601x7ed0e40c.f66791xc8a07680, c16601x7ed0e40c.f66793x2262335f);
                    if (u07 != null) {
                        int i18 = i17 + 1;
                        jSONArray.put(i17, u07);
                        java.lang.String field_id = c16601x7ed0e40c.f66791xc8a07680;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_id, "field_id");
                        if (!i1Var.Bi(field_id, c16601x7ed0e40c.f66793x2262335f)) {
                            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = i1Var.f231981g;
                            java.lang.String field_id2 = c16601x7ed0e40c.f66791xc8a07680;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_id2, "field_id");
                            copyOnWriteArrayList.add(new ik3.r(field_id2, c16601x7ed0e40c.f66793x2262335f));
                        }
                        i17 = i18;
                    }
                }
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(i1Var.f231978d, e17, "restoreDataFromStorageToMMKV fail, exception:%s", e17);
            }
            java.lang.String jSONArray2 = jSONArray.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray2, "toString(...)");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(i1Var.f231985n).D(i1Var.f231982h, jSONArray2);
            i1Var.f231980f = true;
            java.lang.String str = i1Var.f231978d;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("restore data done! multiTaskInfoList: ");
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = i1Var.f231981g;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(copyOnWriteArrayList2, 10));
            java.util.Iterator it6 = copyOnWriteArrayList2.iterator();
            while (it6.hasNext()) {
                ik3.r rVar = (ik3.r) it6.next();
                arrayList.add(rVar.f373445b + '_' + rVar.f373444a);
            }
            sb6.append(arrayList);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            d73.i iVar = (d73.i) i95.n0.c(d73.i.class);
            if (iVar != null) {
                iVar.wd(list);
            }
            java.lang.String b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.u0.f232039a.b("Home");
            if (com.p314xaae8f345.mm.vfs.w6.j(b17)) {
                com.p314xaae8f345.mm.vfs.w6.h(b17);
            }
        }
    }
}
