package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd;

/* loaded from: classes5.dex */
public final class l1 implements ev3.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.m1 f237821d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.j0 f237822e;

    public l1(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.m1 m1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.j0 j0Var) {
        this.f237821d = m1Var;
        this.f237822e = j0Var;
    }

    @Override // ev3.d
    public void c(int i17, ev3.c cVar) {
        this.f237821d.f237754n.put(java.lang.Integer.valueOf(i17), cVar);
    }

    @Override // ev3.d
    public void k(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a, int i17, android.view.View view, boolean z17, boolean z18, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.m1 m1Var = this.f237821d;
        java.lang.String str = m1Var.f237828q;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a aVar = m1Var.f237755o;
        if (aVar != null) {
            aVar.k(c16997xb0aa383a, java.lang.String.valueOf(i17), view, z18, z17, bundle);
        }
    }

    @Override // ev3.d
    public void l(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a, boolean z17, boolean z18, boolean z19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.m1 m1Var = this.f237821d;
        if (z17) {
            if (c16997xb0aa383a != null) {
                m1Var.y(i17, c16997xb0aa383a, z18);
                wv3.b.f531581a.c(c16997xb0aa383a, z19, i17);
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m1Var.f237828q, "onSelectMusic: false, same=" + p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m1Var.f237753m.f494921b, c16997xb0aa383a));
        if (c16997xb0aa383a == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m1Var.f237753m.f494921b, c16997xb0aa383a)) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("key_boolean", true);
        this.f237822e.j(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.i0.f237786p, bundle);
    }
}
