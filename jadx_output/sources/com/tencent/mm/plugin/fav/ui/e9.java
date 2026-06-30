package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public final class e9 implements w82.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.da f100836a;

    public e9(com.tencent.mm.plugin.fav.ui.da daVar) {
        this.f100836a = daVar;
    }

    @Override // w82.j
    public void a() {
        com.tencent.mm.plugin.fav.ui.da daVar = this.f100836a;
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = daVar.f100583n;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("mResultAdapter");
            throw null;
        }
        if (com.tencent.mm.plugin.fav.ui.FavoriteIndexUI.r7(cVar.k(false), daVar.getContext(), new com.tencent.mm.plugin.fav.ui.d9(daVar), true, true)) {
            android.app.Activity context = daVar.getContext();
            com.tencent.mm.plugin.fav.ui.adapter.c cVar2 = daVar.f100583n;
            if (cVar2 != null) {
                com.tencent.mm.plugin.fav.ui.ec.g(context, 4105, cVar2, daVar.f100587r);
            } else {
                kotlin.jvm.internal.o.o("mResultAdapter");
                throw null;
            }
        }
    }

    @Override // w82.j
    public void b() {
    }

    @Override // w82.j
    public void c() {
        com.tencent.mm.plugin.fav.ui.da daVar = this.f100836a;
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = daVar.f100583n;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("mResultAdapter");
            throw null;
        }
        boolean z17 = true;
        java.util.List<o72.r2> k17 = cVar.k(true);
        java.util.LinkedList linkedList = (java.util.LinkedList) k17;
        if (linkedList.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavSearchManager", "FavEditFooter onDelRequest list == null");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashMap hashMap = new java.util.HashMap();
        boolean z18 = false;
        for (o72.r2 r2Var : k17) {
            if (r2Var.B1) {
                hashSet.add(java.lang.Long.valueOf(r2Var.field_localId));
                z18 = z17;
            } else {
                arrayList.add(r2Var);
            }
            o72.t2 t2Var = new o72.t2(r2Var);
            t2Var.f343466d = 2;
            com.tencent.mm.plugin.fav.ui.adapter.c cVar2 = daVar.f100583n;
            if (cVar2 == null) {
                kotlin.jvm.internal.o.o("mResultAdapter");
                throw null;
            }
            t2Var.f343469g = cVar2.o() ? 1 : 0;
            com.tencent.mm.plugin.fav.ui.adapter.c cVar3 = daVar.f100583n;
            if (cVar3 == null) {
                kotlin.jvm.internal.o.o("mResultAdapter");
                throw null;
            }
            int i17 = -1;
            if (cVar3.o()) {
                com.tencent.mm.plugin.fav.ui.adapter.c cVar4 = daVar.f100583n;
                if (cVar4 == null) {
                    kotlin.jvm.internal.o.o("mResultAdapter");
                    throw null;
                }
                int i18 = r2Var.field_id;
                int i19 = 0;
                while (true) {
                    if (i19 >= cVar4.f100480m.size()) {
                        break;
                    }
                    if (((o72.r2) cVar4.f100480m.get(i19)).field_id == i18) {
                        i17 = i19;
                        break;
                    }
                    i19++;
                }
            }
            t2Var.f343470h = i17;
            boolean z19 = z18;
            t2Var.f343471i = o72.x1.u().indexOf(java.lang.Long.valueOf(r2Var.field_localId)) + 1;
            int i27 = r2Var.field_type;
            r45.bq0 bq0Var = r2Var.field_favProto;
            t2Var.f343467e = i27 != 5 ? i27 != 8 ? 0 : 1 : (bq0Var == null || bq0Var.K == null) ? 3 : 2;
            hashMap.put(java.lang.Long.valueOf(r2Var.field_localId), t2Var);
            z17 = true;
            z18 = z19;
        }
        if (arrayList.size() != 0) {
            db5.e1.u(daVar.getContext(), i65.a.r(daVar.getContext(), com.tencent.mm.R.string.c_i), "", new com.tencent.mm.plugin.fav.ui.c9(daVar, arrayList, hashMap, z18), null);
            return;
        }
        if (hashSet.size() < 2) {
            java.lang.Object obj = linkedList.get(0);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            com.tencent.mm.plugin.fav.ui.da.O6(daVar, null, 0, (o72.r2) obj);
        } else {
            android.app.Activity context = daVar.getContext();
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
            u1Var.g(context.getString(com.tencent.mm.R.string.c_k));
            u1Var.n(context.getString(com.tencent.mm.R.string.c_g));
            u1Var.l(com.tencent.mm.plugin.fav.ui.v9.f101498a);
            u1Var.q(false);
        }
    }

    @Override // w82.j
    public void d() {
        com.tencent.mm.plugin.fav.ui.da daVar = this.f100836a;
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = daVar.f100583n;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("mResultAdapter");
            throw null;
        }
        if (cVar.l() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavSearchManager", "[onAddTagRequest] select items count <= 0, maybe error!");
            return;
        }
        com.tencent.mm.plugin.fav.ui.adapter.c cVar2 = daVar.f100583n;
        if (cVar2 == null) {
            kotlin.jvm.internal.o.o("mResultAdapter");
            throw null;
        }
        if (cVar2.l() <= 1) {
            com.tencent.mm.plugin.fav.ui.adapter.c cVar3 = daVar.f100583n;
            if (cVar3 == null) {
                kotlin.jvm.internal.o.o("mResultAdapter");
                throw null;
            }
            java.lang.Object obj = ((java.util.LinkedList) cVar3.k(false)).get(0);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_fav_scene", 3);
            intent.putExtra("key_fav_item_id", ((o72.r2) obj).field_localId);
            o72.x1.L0(daVar.getContext(), ".ui.FavTagEditUI", intent, null);
            o72.z2.a("FavTagEditUI");
            com.tencent.mm.plugin.fav.ui.adapter.c cVar4 = daVar.f100583n;
            if (cVar4 == null) {
                kotlin.jvm.internal.o.o("mResultAdapter");
                throw null;
            }
            if (cVar4.f100484q) {
                daVar.P6();
                return;
            }
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("key_fav_scene", 3);
        intent2.putExtra("key_fav_is_add_tag", true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.plugin.fav.ui.adapter.c cVar5 = daVar.f100583n;
        if (cVar5 == null) {
            kotlin.jvm.internal.o.o("mResultAdapter");
            throw null;
        }
        java.util.LinkedList linkedList = (java.util.LinkedList) cVar5.k(false);
        int size = linkedList.size();
        for (int i17 = 0; i17 < size; i17++) {
            arrayList.add(java.lang.Integer.valueOf(((o72.r2) linkedList.get(i17)).field_id));
        }
        intent2.putExtra("key_fav_item_ids", arrayList);
        o72.x1.M0(daVar.getContext(), ".ui.FavTagEditUI", intent2, 4104, null);
        o72.z2.a("FavTagEditUI");
        com.tencent.mm.plugin.fav.ui.adapter.c cVar6 = daVar.f100583n;
        if (cVar6 == null) {
            kotlin.jvm.internal.o.o("mResultAdapter");
            throw null;
        }
        if (cVar6.f100484q) {
            daVar.P6();
        }
    }
}
