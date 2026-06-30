package hq2;

/* loaded from: classes2.dex */
public final class c implements so2.j5, wp2.a {

    /* renamed from: d, reason: collision with root package name */
    public final r45.fa2 f364742d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f364743e;

    /* renamed from: f, reason: collision with root package name */
    public int f364744f;

    /* renamed from: g, reason: collision with root package name */
    public final eq2.b f364745g;

    public c(r45.fa2 container) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        this.f364742d = container;
        this.f364743e = new java.util.ArrayList();
        this.f364744f = -1;
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.u.f435469a.e(c61.l7.class).a(eq2.b.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        this.f364745g = (eq2.b) a17;
    }

    @Override // wp2.a
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g a() {
        return this.f364742d.f455665n;
    }

    @Override // wp2.a
    public void b(int i17) {
        this.f364742d.f455663i = i17;
    }

    @Override // wp2.a
    public int c() {
        return this.f364743e.size();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        return ((obj instanceof hq2.c) && ((hq2.c) obj).f364742d.f455658d == this.f364742d.f455658d) ? 0 : -1;
    }

    public final void e(int i17, hq2.b convertData, r45.dk2 dk2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(convertData, "convertData");
        this.f364745g.O6(i17, 0, 0, 0, 0, convertData.f364741e, dk2Var != null ? dk2Var.m75934xbce7f2f(6) : null, dk2Var);
    }

    @Override // wp2.a
    public void f(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f364742d.f455665n = gVar;
    }

    @Override // wp2.a
    public java.util.List g() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList card_list = this.f364742d.f455662h;
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
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return -4998;
    }

    @Override // wp2.a
    public int i() {
        return this.f364742d.f455658d;
    }
}
