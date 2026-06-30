package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf;

/* loaded from: classes.dex */
public final class o {
    public o(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.util.List a(java.util.List arrMenuItem) {
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.p pVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arrMenuItem, "arrMenuItem");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = arrMenuItem.iterator();
        while (it.hasNext()) {
            org.json.JSONObject jsonObject = (org.json.JSONObject) it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonObject, "jsonObject");
            int optInt = jsonObject.optInt(dm.i4.f66865x76d1ec5a, -1);
            boolean z17 = jsonObject.optInt("disable") > 0;
            com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.b bVar = com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.b.f147504f;
            if (optInt == 1) {
                pVar = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.p(bVar, null, z17, 2, null);
            } else {
                com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.b bVar2 = com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.b.f147505g;
                if (optInt == 2) {
                    pVar = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.p(bVar2, null, z17, 2, null);
                } else {
                    com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.b bVar3 = com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.b.f147506h;
                    if (optInt == 3) {
                        pVar = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.p(bVar3, null, z17, 2, null);
                    } else {
                        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.b bVar4 = com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.b.f147507i;
                        if (optInt == 4) {
                            pVar = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.p(bVar4, null, z17, 2, null);
                        } else {
                            pVar = optInt == 5 ? new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.p(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.b.f147508m, null, false, 6, null) : null;
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
