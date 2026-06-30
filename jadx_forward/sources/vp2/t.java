package vp2;

/* loaded from: classes2.dex */
public final class t implements so2.j5, wp2.a, yp2.a {

    /* renamed from: d, reason: collision with root package name */
    public final r45.fa2 f520488d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f520489e;

    public t(r45.fa2 container) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        this.f520488d = container;
        this.f520489e = new java.util.ArrayList();
    }

    @Override // wp2.a
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g a() {
        return this.f520488d.f455665n;
    }

    @Override // wp2.a
    public void b(int i17) {
        this.f520488d.f455663i = i17;
    }

    @Override // wp2.a
    public int c() {
        return this.f520489e.size();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        return ((obj instanceof vp2.t) && ((vp2.t) obj).f520488d.f455658d == this.f520488d.f455658d) ? 0 : -1;
    }

    @Override // yp2.a
    public r45.fa2 e() {
        return this.f520488d;
    }

    @Override // wp2.a
    public void f(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f520488d.f455665n = gVar;
    }

    @Override // wp2.a
    public java.util.List g() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList card_list = this.f520488d.f455662h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(card_list, "card_list");
        java.util.Iterator it = card_list.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.ea2) it.next()).m75936x14adae67(2);
            if (c19792x256d2725 != null) {
                arrayList.add(java.lang.Long.valueOf(c19792x256d2725.m76784x5db1b11()));
            }
        }
        return arrayList;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f520488d.f455658d;
    }

    @Override // in5.c
    public int h() {
        return 19;
    }

    @Override // wp2.a
    public int i() {
        return this.f520488d.f455658d;
    }

    public final java.util.ArrayList j() {
        return this.f520489e;
    }
}
