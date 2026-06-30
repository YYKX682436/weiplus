package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public final class e9 implements w82.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da f182369a;

    public e9(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da daVar) {
        this.f182369a = daVar;
    }

    @Override // w82.j
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da daVar = this.f182369a;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar = daVar.f182116n;
        if (cVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mResultAdapter");
            throw null;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a.r7(cVar.k(false), daVar.m80379x76847179(), new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.d9(daVar), true, true)) {
            android.app.Activity m80379x76847179 = daVar.m80379x76847179();
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar2 = daVar.f182116n;
            if (cVar2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ec.g(m80379x76847179, 4105, cVar2, daVar.f182120r);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mResultAdapter");
                throw null;
            }
        }
    }

    @Override // w82.j
    public void b() {
    }

    @Override // w82.j
    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da daVar = this.f182369a;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar = daVar.f182116n;
        if (cVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mResultAdapter");
            throw null;
        }
        boolean z17 = true;
        java.util.List<o72.r2> k17 = cVar.k(true);
        java.util.LinkedList linkedList = (java.util.LinkedList) k17;
        if (linkedList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavSearchManager", "FavEditFooter onDelRequest list == null");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashMap hashMap = new java.util.HashMap();
        boolean z18 = false;
        for (o72.r2 r2Var : k17) {
            if (r2Var.B1) {
                hashSet.add(java.lang.Long.valueOf(r2Var.f67645x88be67a1));
                z18 = z17;
            } else {
                arrayList.add(r2Var);
            }
            o72.t2 t2Var = new o72.t2(r2Var);
            t2Var.f424999d = 2;
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar2 = daVar.f182116n;
            if (cVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mResultAdapter");
                throw null;
            }
            t2Var.f425002g = cVar2.o() ? 1 : 0;
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar3 = daVar.f182116n;
            if (cVar3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mResultAdapter");
                throw null;
            }
            int i17 = -1;
            if (cVar3.o()) {
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar4 = daVar.f182116n;
                if (cVar4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mResultAdapter");
                    throw null;
                }
                int i18 = r2Var.f67643xc8a07680;
                int i19 = 0;
                while (true) {
                    if (i19 >= cVar4.f182013m.size()) {
                        break;
                    }
                    if (((o72.r2) cVar4.f182013m.get(i19)).f67643xc8a07680 == i18) {
                        i17 = i19;
                        break;
                    }
                    i19++;
                }
            }
            t2Var.f425003h = i17;
            boolean z19 = z18;
            t2Var.f425004i = o72.x1.u().indexOf(java.lang.Long.valueOf(r2Var.f67645x88be67a1)) + 1;
            int i27 = r2Var.f67657x2262335f;
            r45.bq0 bq0Var = r2Var.f67640x5ab01132;
            t2Var.f425000e = i27 != 5 ? i27 != 8 ? 0 : 1 : (bq0Var == null || bq0Var.K == null) ? 3 : 2;
            hashMap.put(java.lang.Long.valueOf(r2Var.f67645x88be67a1), t2Var);
            z17 = true;
            z18 = z19;
        }
        if (arrayList.size() != 0) {
            db5.e1.u(daVar.m80379x76847179(), i65.a.r(daVar.m80379x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.c_i), "", new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.c9(daVar, arrayList, hashMap, z18), null);
            return;
        }
        if (hashSet.size() < 2) {
            java.lang.Object obj = linkedList.get(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da.O6(daVar, null, 0, (o72.r2) obj);
        } else {
            android.app.Activity m80379x76847179 = daVar.m80379x76847179();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(m80379x76847179);
            u1Var.g(m80379x76847179.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_k));
            u1Var.n(m80379x76847179.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_g));
            u1Var.l(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.v9.f183031a);
            u1Var.q(false);
        }
    }

    @Override // w82.j
    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da daVar = this.f182369a;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar = daVar.f182116n;
        if (cVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mResultAdapter");
            throw null;
        }
        if (cVar.l() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavSearchManager", "[onAddTagRequest] select items count <= 0, maybe error!");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar2 = daVar.f182116n;
        if (cVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mResultAdapter");
            throw null;
        }
        if (cVar2.l() <= 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar3 = daVar.f182116n;
            if (cVar3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mResultAdapter");
                throw null;
            }
            java.lang.Object obj = ((java.util.LinkedList) cVar3.k(false)).get(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_fav_scene", 3);
            intent.putExtra("key_fav_item_id", ((o72.r2) obj).f67645x88be67a1);
            o72.x1.L0(daVar.m80379x76847179(), ".ui.FavTagEditUI", intent, null);
            o72.z2.a("FavTagEditUI");
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar4 = daVar.f182116n;
            if (cVar4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mResultAdapter");
                throw null;
            }
            if (cVar4.f182017q) {
                daVar.P6();
                return;
            }
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("key_fav_scene", 3);
        intent2.putExtra("key_fav_is_add_tag", true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar5 = daVar.f182116n;
        if (cVar5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mResultAdapter");
            throw null;
        }
        java.util.LinkedList linkedList = (java.util.LinkedList) cVar5.k(false);
        int size = linkedList.size();
        for (int i17 = 0; i17 < size; i17++) {
            arrayList.add(java.lang.Integer.valueOf(((o72.r2) linkedList.get(i17)).f67643xc8a07680));
        }
        intent2.putExtra("key_fav_item_ids", arrayList);
        o72.x1.M0(daVar.m80379x76847179(), ".ui.FavTagEditUI", intent2, 4104, null);
        o72.z2.a("FavTagEditUI");
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar6 = daVar.f182116n;
        if (cVar6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mResultAdapter");
            throw null;
        }
        if (cVar6.f182017q) {
            daVar.P6();
        }
    }
}
