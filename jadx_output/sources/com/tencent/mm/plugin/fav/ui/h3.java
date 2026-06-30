package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes11.dex */
public final class h3 {

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mm.plugin.fav.ui.g3 f101128c = new com.tencent.mm.plugin.fav.ui.g3(null);

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f101129d = jz5.h.a(jz5.i.f302829d, com.tencent.mm.plugin.fav.ui.f3.f100844d);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f101130a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f101131b = new java.util.ArrayList();

    public h3(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a(int i17) {
        if (i17 < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavFinderStorage", "[checkPosition] position error < 0 , position = " + i17);
            return false;
        }
        if (i17 >= this.f101130a.size()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavFinderStorage", "[checkPosition] position error >= favItemInfos size, position = " + i17);
            return false;
        }
        if (i17 < this.f101131b.size()) {
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.FavFinderStorage", "[checkPosition] position error >= favIdList size, position = " + i17);
        return false;
    }

    public final o72.r2 b(int i17) {
        if (a(i17)) {
            return (o72.r2) this.f101130a.get(i17);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.FavFinderStorage", "[get] position invalid return");
        return null;
    }

    public final jz5.l c(int i17, int i18) {
        boolean z17;
        java.util.ArrayList arrayList = this.f101131b;
        int size = arrayList.size() - 1;
        if (i17 >= size) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavFinderStorage", "[loadData] lastPosition maybe error, lastPosition = " + i17 + ", favIdList size = " + arrayList.size());
            return new jz5.l(java.lang.Boolean.FALSE, new java.util.ArrayList(1));
        }
        int i19 = i17 + 1;
        int i27 = i19 + i18;
        if (i27 >= size) {
            i27 = size + 1;
            z17 = false;
        } else {
            z17 = true;
        }
        java.util.List subList = arrayList.subList(i19, i27);
        kotlin.jvm.internal.o.f(subList, "subList(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderStorage", "[loadData] subIdList start = " + i19 + ", end = " + i27 + ", size = " + subList.size());
        java.util.ArrayList S = o72.x1.S(subList, 20);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = S.iterator();
        while (it.hasNext()) {
            arrayList2.add((o72.r2) ((dm.n3) it.next()));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderStorage", "[loadData] favItemInfos size = " + arrayList2.size());
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            o72.r2 r2Var = (o72.r2) it6.next();
            com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderStorage", "[loadData] favItemInfo.id = " + r2Var.field_localId + ", favItemInfo.type = " + r2Var.field_type + ", favItemInfo.xml = " + r2Var.field_xml);
        }
        if (arrayList2.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavFinderStorage", "[loadData] getSearchListByIds maybe error, idList size = " + arrayList.size());
            return new jz5.l(java.lang.Boolean.FALSE, new java.util.ArrayList(1));
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList2.size());
        java.util.ArrayList arrayList4 = new java.util.ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        for (int i28 = 0; i28 < size2; i28++) {
            o72.r2 r2Var2 = (o72.r2) arrayList2.get(i28);
            r45.kv2 kv2Var = r2Var2.field_favProto.M;
            if (kv2Var != null) {
                arrayList3.add(kv2Var);
                arrayList4.add(r2Var2);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.FavFinderStorage", "[loadData] finderItem = null, localId = " + r2Var2.field_localId + ", remove idList content in " + java.lang.Thread.currentThread().getName());
                arrayList.remove(i28);
            }
        }
        java.util.ArrayList arrayList5 = this.f101130a;
        arrayList5.addAll(arrayList4);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderStorage", "[loadData] success favItemInfos size = " + arrayList5.size() + ", finderObjList = " + arrayList3.size() + ", pageSize = " + i18);
        return new jz5.l(java.lang.Boolean.valueOf(z17), arrayList3);
    }
}
