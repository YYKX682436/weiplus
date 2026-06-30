package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd;

/* loaded from: classes5.dex */
public final class m1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.f {

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f237828q;

    /* renamed from: r, reason: collision with root package name */
    public final sv3.b f237829r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.k1 f237830s;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.l1 f237831t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(android.view.ViewGroup parent, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.j0 status, int i17) {
        super(parent, status, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f237828q = "MicroMsg.TemplateClipMusicCallbackComponent";
        this.f237829r = new sv3.b(0, null, 3, null);
        this.f237830s = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.k1(this);
        this.f237831t = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.l1(this, status);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.f
    public void t(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a2;
        sv3.a aVar = this.f237753m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a3 = aVar.f494921b;
        java.lang.String a17 = c16997xb0aa383a != null ? c16997xb0aa383a.a() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a4 = aVar.f494921b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17, c16997xb0aa383a4 != null ? c16997xb0aa383a4.a() : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a aVar2 = this.f237755o;
        ev3.a aVar3 = aVar2 instanceof ev3.a ? (ev3.a) aVar2 : null;
        if (aVar3 != null) {
            ((zy0.c) aVar3).t(c16997xb0aa383a, this.f237830s);
        }
        int i17 = aVar.f494920a;
        if (c16997xb0aa383a == null && (c16997xb0aa383a2 = aVar.f494921b) != null) {
            r(c16997xb0aa383a2, i17);
        }
        if (c16997xb0aa383a != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a5 = aVar.f494921b;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c16997xb0aa383a5 != null ? c16997xb0aa383a5.a() : null, c16997xb0aa383a.a())) {
                s(aVar.f494921b, i17);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.f
    public ev3.d w() {
        return this.f237831t;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.f
    public void y(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a, boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setCurrentSelectedAudio: loading ");
        sv3.b bVar = this.f237829r;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a2 = bVar.f494923b;
        sb6.append(c16997xb0aa383a2 != null ? c16997xb0aa383a2.a() : null);
        sb6.append(", new ");
        sb6.append(c16997xb0aa383a != null ? c16997xb0aa383a.a() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f237828q, sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a3 = bVar.f494923b;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c16997xb0aa383a3 != null ? c16997xb0aa383a3.a() : null, c16997xb0aa383a != null ? c16997xb0aa383a.a() : null)) {
            r(bVar.f494923b, bVar.f494922a);
            bVar.f494923b = c16997xb0aa383a;
            bVar.f494922a = i17;
        }
        if (i17 == 16) {
            if ((c16997xb0aa383a != null ? c16997xb0aa383a.C : null) != null) {
                wv3.b.f531582b.add(c16997xb0aa383a.C);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a aVar = this.f237755o;
        ev3.a aVar2 = aVar instanceof ev3.a ? (ev3.a) aVar : null;
        if (aVar2 != null) {
            ((zy0.c) aVar2).t(c16997xb0aa383a, this.f237830s);
        }
    }
}
