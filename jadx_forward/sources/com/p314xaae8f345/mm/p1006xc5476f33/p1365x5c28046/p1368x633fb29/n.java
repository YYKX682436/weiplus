package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29;

/* loaded from: classes12.dex */
public final class n implements com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f179114a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f179115b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f179116c = new java.util.LinkedList();

    public n(boolean z17) {
        this.f179114a = z17;
        mo54784x6761d4f();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.e0
    public java.util.List c() {
        return this.f179115b;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.e0
    public void d() {
        java.util.LinkedList linkedList = this.f179116c;
        int i17 = 0;
        for (java.lang.Object obj : linkedList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247 c21051xbc71d247 = (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247) obj;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiMineListDataSource", "updateSort: " + c21051xbc71d247.f68391x4a7ba5e9 + ' ' + i17);
            c21051xbc71d247.f68379x4b6e59f8 = i17;
            i17 = i18;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().b().P1(linkedList);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.e0
    public java.util.LinkedList e() {
        return this.f179116c;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.e0
    /* renamed from: onMove */
    public void mo54783xc39cb650(int i17, int i18) {
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247 c21051xbc71d247;
        java.util.LinkedList linkedList = this.f179115b;
        java.lang.Object obj = linkedList.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        m22.i iVar = (m22.i) obj;
        java.util.LinkedList<com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247> linkedList2 = new java.util.LinkedList();
        if (iVar instanceof m22.k) {
            c21051xbc71d247 = ((m22.k) iVar).f404587a;
        } else {
            if (!(iVar instanceof m22.l)) {
                return;
            }
            java.util.LinkedList linkedList3 = ((m22.l) iVar).f404589b;
            linkedList2.addAll(linkedList3);
            linkedList2.removeFirst();
            java.lang.Object obj2 = linkedList3.get(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
            c21051xbc71d247 = (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247) obj2;
        }
        m22.i iVar2 = (m22.i) kz5.n0.a0(linkedList, i18);
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247 c21051xbc71d2472 = iVar2 instanceof m22.k ? ((m22.k) iVar2).f404587a : iVar2 instanceof m22.l ? (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247) ((m22.l) iVar2).f404589b.get(0) : null;
        java.util.LinkedList linkedList4 = this.f179116c;
        int indexOf = c21051xbc71d2472 != null ? linkedList4.indexOf(c21051xbc71d2472) : 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onMove: index:");
        sb6.append(i17);
        sb6.append(" -> ");
        sb6.append(i18);
        sb6.append(" (toOriginIndex:");
        sb6.append(indexOf);
        sb6.append("), from:");
        sb6.append(c21051xbc71d247.f68391x4a7ba5e9);
        sb6.append(" toAfter:");
        sb6.append(c21051xbc71d2472 != null ? c21051xbc71d2472.f68391x4a7ba5e9 : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiMineListDataSource", sb6.toString());
        linkedList4.remove(c21051xbc71d247);
        linkedList4.add(indexOf, c21051xbc71d247);
        for (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247 c21051xbc71d2473 : linkedList2) {
            int indexOf2 = linkedList4.indexOf(c21051xbc71d2473);
            if (indexOf2 <= indexOf) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiMineListDataSource", "onMove: other group: " + indexOf2 + " -> " + indexOf + ", " + c21051xbc71d2473.f68391x4a7ba5e9);
                linkedList4.remove(c21051xbc71d2473);
                linkedList4.add(indexOf, c21051xbc71d2473);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.e0
    /* renamed from: reset */
    public void mo54784x6761d4f() {
        java.util.LinkedList linkedList = this.f179115b;
        linkedList.clear();
        java.util.LinkedList linkedList2 = this.f179116c;
        linkedList2.clear();
        linkedList2.addAll(gr.t.g().d());
        java.util.Iterator it = linkedList2.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiMineListDataSource", "beforeSort: " + ((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247) it.next()).f68391x4a7ba5e9);
        }
        if (!this.f179114a) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList2, 10));
            java.util.Iterator it6 = linkedList2.iterator();
            while (it6.hasNext()) {
                arrayList.add(new m22.k((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247) it6.next()));
            }
            linkedList.addAll(arrayList);
            return;
        }
        for (gr.p pVar : gr.p.f356206c.a(linkedList2)) {
            if (!pVar.f356208b.isEmpty()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21052x34cf13a3 c21052x34cf13a3 = pVar.f356207a;
                java.util.LinkedList linkedList3 = pVar.f356208b;
                if (c21052x34cf13a3 == null) {
                    java.lang.Object obj = linkedList3.get(0);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                    linkedList.add(new m22.k((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247) obj));
                } else {
                    m22.l lVar = new m22.l(c21052x34cf13a3);
                    lVar.f404589b.addAll(linkedList3);
                    linkedList.add(lVar);
                }
            }
        }
    }
}
