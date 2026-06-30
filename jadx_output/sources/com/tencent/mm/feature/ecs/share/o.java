package com.tencent.mm.feature.ecs.share;

/* loaded from: classes.dex */
public final class o {
    public o(kotlin.jvm.internal.i iVar) {
    }

    public final java.util.List a(java.util.List arrMenuItem) {
        com.tencent.mm.feature.ecs.share.p pVar;
        kotlin.jvm.internal.o.g(arrMenuItem, "arrMenuItem");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = arrMenuItem.iterator();
        while (it.hasNext()) {
            org.json.JSONObject jsonObject = (org.json.JSONObject) it.next();
            kotlin.jvm.internal.o.g(jsonObject, "jsonObject");
            int optInt = jsonObject.optInt(dm.i4.COL_ID, -1);
            boolean z17 = jsonObject.optInt("disable") > 0;
            com.tencent.mm.feature.ecs.share.b bVar = com.tencent.mm.feature.ecs.share.b.f65971f;
            if (optInt == 1) {
                pVar = new com.tencent.mm.feature.ecs.share.p(bVar, null, z17, 2, null);
            } else {
                com.tencent.mm.feature.ecs.share.b bVar2 = com.tencent.mm.feature.ecs.share.b.f65972g;
                if (optInt == 2) {
                    pVar = new com.tencent.mm.feature.ecs.share.p(bVar2, null, z17, 2, null);
                } else {
                    com.tencent.mm.feature.ecs.share.b bVar3 = com.tencent.mm.feature.ecs.share.b.f65973h;
                    if (optInt == 3) {
                        pVar = new com.tencent.mm.feature.ecs.share.p(bVar3, null, z17, 2, null);
                    } else {
                        com.tencent.mm.feature.ecs.share.b bVar4 = com.tencent.mm.feature.ecs.share.b.f65974i;
                        if (optInt == 4) {
                            pVar = new com.tencent.mm.feature.ecs.share.p(bVar4, null, z17, 2, null);
                        } else {
                            pVar = optInt == 5 ? new com.tencent.mm.feature.ecs.share.p(com.tencent.mm.feature.ecs.share.b.f65975m, null, false, 6, null) : null;
                        }
                    }
                }
            }
            if (pVar != null) {
                arrayList.add(pVar);
            }
        }
        return arrayList;
    }
}
