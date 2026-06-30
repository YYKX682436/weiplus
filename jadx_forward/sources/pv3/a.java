package pv3;

/* loaded from: classes2.dex */
public final class a extends in5.p {
    @Override // in5.p
    public float a(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        return 0.1f;
    }

    @Override // in5.p
    public void c(java.util.Set recordsSet) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordsSet, "recordsSet");
        java.util.Iterator it = recordsSet.iterator();
        while (it.hasNext()) {
            in5.j jVar = (in5.j) it.next();
            pv3.f fVar = pv3.f.f440122a;
            in5.c cVar = jVar.f374603a;
            rv3.h hVar = cVar instanceof rv3.h ? (rv3.h) cVar : null;
            if (hVar != null && (c16997xb0aa383a = hVar.f481928d) != null && (c19792x256d2725 = c16997xb0aa383a.f237261y) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MusicCacheManager", "[onVideoExposeEnd]");
                c50.x0 x0Var = pv3.f.f440127f;
                if (x0Var != null) {
                    long m76784x5db1b11 = c19792x256d2725.m76784x5db1b11();
                    pm0.v.u(m76784x5db1b11);
                    es2.h0 h0Var = ((cs2.i) x0Var).f303606c;
                    h0Var.getClass();
                    h0Var.j("cancel", new es2.s(h0Var, m76784x5db1b11, "itemExposeEnd"));
                }
            }
        }
    }

    @Override // in5.p
    public void d(in5.j item) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        pv3.f fVar = pv3.f.f440122a;
        in5.c cVar = item.f374603a;
        rv3.h hVar = cVar instanceof rv3.h ? (rv3.h) cVar : null;
        if (hVar == null || (c16997xb0aa383a = hVar.f481928d) == null || (c19792x256d2725 = c16997xb0aa383a.f237261y) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MusicCacheManager", "[onVideoExposeStart]");
        c50.x0 x0Var = pv3.f.f440127f;
        if (x0Var != null) {
            ((cs2.i) x0Var).e(cu2.u.f303974a.p(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, 0)));
        }
    }
}
