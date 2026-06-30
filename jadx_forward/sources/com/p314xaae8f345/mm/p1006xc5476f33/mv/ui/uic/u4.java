package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class u4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c3 f233008d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.v4 f233009e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c3 c3Var, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.v4 v4Var) {
        super(1);
        this.f233008d = c3Var;
        this.f233009e = v4Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.List liveList = (java.util.List) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveList, "liveList");
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = liveList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            gm3.c cVar = (gm3.c) it.next();
            hashMap.put(cVar.f355076d, cVar);
            r45.kj2 kj2Var = new r45.kj2();
            kj2Var.set(0, cVar.f355076d);
            kj2Var.set(1, 0);
            kj2Var.set(2, 0);
            linkedList.add(kj2Var);
        }
        r45.ss4 ss4Var = (r45.ss4) this.f233008d.f232610g.mo3195x754a37bb();
        if (ss4Var != null) {
            boolean z17 = liveList.size() > 1;
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.v4 v4Var = this.f233009e;
            v4Var.f233032s = z17;
            r45.ss4 O6 = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.v4.O6(v4Var, ss4Var, linkedList, hashMap);
            fm3.u.A.c(O6, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s4.f232971d);
            d75.b.g(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.t4(v4Var, O6));
        }
        return jz5.f0.f384359a;
    }
}
