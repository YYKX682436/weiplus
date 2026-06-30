package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav;

/* loaded from: classes2.dex */
public final class g extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.a {

    /* renamed from: g, reason: collision with root package name */
    public final q40.h f210700g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f210701h;

    public g(q40.h hVar) {
        this.f210700g = hVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.a
    public boolean g() {
        return this.f210700g != null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.a
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        q40.h hVar = this.f210700g;
        if (hVar != null) {
            hVar.T(view, i17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.a
    public void m() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestInit stack=");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderGlobalFavPresenter", sb6.toString());
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.d3) ((o72.f4) i95.n0.c(o72.f4.class))).getClass();
        jz5.l c17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.h3.f182661c.a().c(-1, 10);
        v((java.util.List) c17.f384367e, true, ((java.lang.Boolean) c17.f384366d).booleanValue());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.a
    public void p() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestLoadMore stack=");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderGlobalFavPresenter", sb6.toString());
        o72.f4 f4Var = (o72.f4) i95.n0.c(o72.f4.class);
        int h17 = kz5.c0.h(this.f210681d);
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.d3) f4Var).getClass();
        jz5.l c17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.h3.f182661c.a().c(h17, 10);
        v((java.util.List) c17.f384367e, false, ((java.lang.Boolean) c17.f384366d).booleanValue());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.a
    public void q() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.a
    public void s() {
        this.f210681d.clear();
        this.f210701h = false;
    }

    public final void v(java.util.List data, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderGlobalFavPresenter", "updateData, data:" + data.size() + ", refresh:" + z17 + ", hasMore: " + z18);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(data, 10));
        java.util.Iterator it = data.iterator();
        while (it.hasNext()) {
            arrayList.add(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.f183939a.c((r45.kv2) it.next()));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            arrayList3.add(cu2.u.f303974a.p(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it6.next(), 256)));
        }
        arrayList2.addAll(arrayList3);
        java.util.ArrayList arrayList4 = this.f210681d;
        if (z17) {
            arrayList4.clear();
        }
        int size = arrayList4.size();
        arrayList4.addAll(arrayList2);
        if (z17) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = f().d().mo7946xf939df19();
            if (mo7946xf939df19 != null) {
                mo7946xf939df19.m8146xced61ae5();
            }
        } else {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192 = f().d().mo7946xf939df19();
            if (mo7946xf939df192 != null) {
                mo7946xf939df192.m8153xd399a4d9(size, arrayList2.size());
            }
        }
        f().f();
        this.f210701h = z18;
        if (z17) {
            f().e().i(true);
        } else {
            f().e().e(true);
        }
        f().e().E(true ^ z18);
        if (arrayList4.isEmpty()) {
            f().k();
        }
    }
}
