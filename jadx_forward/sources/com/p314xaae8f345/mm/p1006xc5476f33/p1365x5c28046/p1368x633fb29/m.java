package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29;

/* loaded from: classes12.dex */
public final class m implements com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f179110a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f179111b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f179112c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f179113d;

    public m(java.lang.String ipSetKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ipSetKey, "ipSetKey");
        this.f179110a = ipSetKey;
        this.f179111b = "MicroMsg.EmojiMineIPListDataSource";
        this.f179112c = new java.util.LinkedList();
        this.f179113d = new java.util.LinkedList();
        mo54784x6761d4f();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.e0
    public java.util.List c() {
        return this.f179112c;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.e0
    public void d() {
        java.util.LinkedList linkedList = this.f179113d;
        int i17 = 0;
        for (java.lang.Object obj : linkedList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247 c21051xbc71d247 = (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247) obj;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f179111b, "updateSort: " + c21051xbc71d247.f68391x4a7ba5e9 + ' ' + i17);
            c21051xbc71d247.f68379x4b6e59f8 = i17;
            i17 = i18;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().b().P1(linkedList);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.e0
    public java.util.LinkedList e() {
        return this.f179113d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.e0
    /* renamed from: onMove */
    public void mo54783xc39cb650(int i17, int i18) {
        java.util.LinkedList linkedList = this.f179112c;
        java.lang.Object obj = linkedList.get(i17);
        m22.k kVar = obj instanceof m22.k ? (m22.k) obj : null;
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247 c21051xbc71d247 = kVar != null ? kVar.f404587a : null;
        java.lang.Object obj2 = linkedList.get(i18);
        m22.k kVar2 = obj2 instanceof m22.k ? (m22.k) obj2 : null;
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247 c21051xbc71d2472 = kVar2 != null ? kVar2.f404587a : null;
        java.util.LinkedList linkedList2 = this.f179113d;
        int c07 = kz5.n0.c0(linkedList2, c21051xbc71d247);
        int c08 = kz5.n0.c0(linkedList2, c21051xbc71d2472);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onMove: ");
        sb6.append(c21051xbc71d247 != null ? c21051xbc71d247.f68391x4a7ba5e9 : null);
        sb6.append(" -> ");
        sb6.append(c21051xbc71d2472 != null ? c21051xbc71d2472.f68391x4a7ba5e9 : null);
        sb6.append("; originList:");
        sb6.append(c07);
        sb6.append(" -> ");
        sb6.append(c08);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f179111b, sb6.toString());
        if (c07 >= 0 && c07 < linkedList2.size()) {
            if (c08 >= 0 && c08 < linkedList2.size()) {
                java.lang.Object remove = linkedList2.remove(c07);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(remove, "removeAt(...)");
                linkedList2.add(c08, (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247) remove);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.e0
    /* renamed from: reset */
    public void mo54784x6761d4f() {
        java.util.LinkedList linkedList = this.f179112c;
        linkedList.clear();
        java.util.LinkedList<com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247> linkedList2 = this.f179113d;
        linkedList2.clear();
        linkedList2.addAll(gr.t.g().d());
        for (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247 c21051xbc71d247 : linkedList2) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c21051xbc71d247.f68380x29449433, this.f179110a)) {
                linkedList.add(new m22.k(c21051xbc71d247));
            }
        }
    }
}
