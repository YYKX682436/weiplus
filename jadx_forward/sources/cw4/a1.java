package cw4;

/* loaded from: classes8.dex */
public final class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.C19231x33dc2abd f305727d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f305728e;

    public a1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.C19231x33dc2abd c19231x33dc2abd, java.lang.String str) {
        this.f305727d = c19231x33dc2abd;
        this.f305728e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.C19231x33dc2abd c19231x33dc2abd = this.f305727d;
        if (c19231x33dc2abd.f263275e != null) {
            cw4.m0 c17 = c19231x33dc2abd.c();
            java.lang.String str = c17.f305772e;
            java.lang.String content = this.f305728e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            try {
                cl0.g gVar = new cl0.g(content);
                java.lang.String mo15082x48bce8a4 = gVar.mo15082x48bce8a4("randomID");
                cw4.o oVar = c17.f305778n;
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(oVar != null ? ((cw4.f1) oVar).f305751a.f263282o : null, mo15082x48bce8a4)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "localRandomID != randomID");
                    return;
                }
                cl0.e eVar = new cl0.e(gVar.mo15082x48bce8a4(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306));
                if (eVar.mo15056xbe0e3ae6() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "get nothing from webpage!");
                    return;
                }
                int mo15056xbe0e3ae6 = eVar.mo15056xbe0e3ae6();
                for (int i17 = 0; i17 < mo15056xbe0e3ae6; i17++) {
                    java.lang.String mo15082x48bce8a42 = eVar.getJSONObject(i17).mo15082x48bce8a4(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24);
                    java.lang.String str2 = "";
                    if (mo15082x48bce8a42 == null) {
                        mo15082x48bce8a42 = "";
                    }
                    java.lang.String mo15082x48bce8a43 = eVar.getJSONObject(i17).mo15082x48bce8a4("hashID");
                    if (mo15082x48bce8a43 == null) {
                        mo15082x48bce8a43 = "";
                    }
                    java.lang.String mo15082x48bce8a44 = eVar.getJSONObject(i17).mo15082x48bce8a4("isFirstScreen");
                    if (mo15082x48bce8a44 == null) {
                        mo15082x48bce8a44 = "";
                    }
                    java.lang.String mo15082x48bce8a45 = eVar.getJSONObject(i17).mo15082x48bce8a4("isTitle");
                    if (mo15082x48bce8a45 != null) {
                        str2 = mo15082x48bce8a45;
                    }
                    arrayList.add(kz5.c1.k(new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, mo15082x48bce8a42), new jz5.l("hashID", mo15082x48bce8a43), new jz5.l("isFirstScreen", mo15082x48bce8a44), new jz5.l(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, str2)));
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                cw4.o oVar2 = c17.f305778n;
                java.util.Map map = oVar2 != null ? ((cw4.f1) oVar2).f305751a.f263277g : null;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    java.util.Map map2 = (java.util.Map) it.next();
                    cw4.z zVar = new cw4.z();
                    zVar.f305839a = java.lang.String.valueOf(map2.get("hashID"));
                    java.lang.String valueOf = java.lang.String.valueOf(map2.get(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24));
                    zVar.f305840b = valueOf;
                    if (map == null || !map.containsKey(valueOf)) {
                        arrayList2.add(zVar);
                    } else {
                        java.lang.String str3 = zVar.f305840b;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
                        arrayList3.add(kz5.c1.k(new jz5.l("transText", map.get(str3)), new jz5.l("hashCode", zVar.f305839a)));
                    }
                }
                if (arrayList3.size() > 0) {
                    java.lang.String mo15068x9616526c = new cl0.e(arrayList3).mo15068x9616526c();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo15068x9616526c, "toString(...)");
                    c17.e(mo15068x9616526c);
                }
                if (arrayList2.size() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "all nodes are in cache");
                    return;
                }
                c17.f305779o.mo523x53d8522f(cw4.q0.f305803e);
                cw4.x xVar = c17.f305774g;
                xVar.getClass();
                java.util.LinkedList linkedList = new java.util.LinkedList();
                if (arrayList2.size() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebTransCgiLogic", "slicePack parameters are wrong!");
                } else {
                    int size = arrayList2.size() / 20;
                    if (arrayList2.size() % 20 > 0) {
                        size++;
                    }
                    for (int i18 = 0; i18 < size; i18++) {
                        int i19 = i18 * 20;
                        int min = java.lang.Math.min(20, arrayList2.size() - i19);
                        cw4.a0 a0Var = new cw4.a0();
                        java.util.List subList = arrayList2.subList(i19, min + i19);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(subList, "subList(...)");
                        java.util.Iterator it6 = subList.iterator();
                        while (it6.hasNext()) {
                            a0Var.f305726a.add((cw4.z) it6.next());
                        }
                        linkedList.add(a0Var);
                    }
                }
                xVar.f305826g.addAll(linkedList);
                xVar.a();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, xm5.d.a(e17));
            }
        }
    }
}
