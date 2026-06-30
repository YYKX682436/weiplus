package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class f4 extends sp2.a4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vp2.q f203203a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.p4 f203204b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ up2.n f203205c;

    public f4(vp2.q qVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.p4 p4Var, up2.n nVar) {
        this.f203203a = qVar;
        this.f203204b = p4Var;
        this.f203205c = nVar;
    }

    @Override // sp2.a4, sp2.b4
    public void e(int i17, java.util.List cards) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cards, "cards");
        vp2.q qVar = this.f203203a;
        if (i17 != qVar.f520483d.f455658d || cards.isEmpty()) {
            return;
        }
        qVar.f520483d.f455662h.addAll(0, cards);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(cards, 10));
        java.util.Iterator it = cards.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.ea2) it.next()).m75936x14adae67(2);
            arrayList.add(c19792x256d2725 != null ? new vp2.p((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) kz5.n0.X(cu2.u.f303974a.j(kz5.b0.c(c19792x256d2725), hc2.d0.d(0), this.f203204b.f203419i)), qVar.f520483d) : null);
        }
        if (!arrayList.isEmpty()) {
            qVar.f520484e.addAll(0, arrayList);
            this.f203205c.m8153xd399a4d9(0, arrayList.size());
        }
    }
}
