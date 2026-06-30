package h33;

/* loaded from: classes5.dex */
public final class d extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dyo;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        h33.c item = (h33.c) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) holder.p(com.p314xaae8f345.mm.R.id.bju);
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = item.f359989e;
        if (c22624x85d69039 != null) {
            c22624x85d69039.b(j33.d0.f(abstractC15633xee433078.f219963e));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332 c22632xdab56332 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332) holder.p(com.p314xaae8f345.mm.R.id.f565170bj2);
        if (c22632xdab56332 != null) {
            c22632xdab56332.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(com.p314xaae8f345.mm.vfs.w6.k(abstractC15633xee433078.f219963e)));
        }
        com.p314xaae8f345.mm.ui.C21405x85fc1ce0 c21405x85fc1ce0 = (com.p314xaae8f345.mm.ui.C21405x85fc1ce0) holder.p(com.p314xaae8f345.mm.R.id.bjs);
        if (c21405x85fc1ce0 != null) {
            i95.m c17 = i95.n0.c(pt.m0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            c21405x85fc1ce0.setImageResource(pt.m0.oa((pt.m0) c17, false, com.p314xaae8f345.mm.vfs.w6.n(abstractC15633xee433078.f219963e), false, false, 12, null));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d) holder.p(com.p314xaae8f345.mm.R.id.sps);
        if (c22628xfde5d61d != null && (str = abstractC15633xee433078.f219963e) != null && com.p314xaae8f345.mm.vfs.w6.j(str)) {
            e33.m6.d(c22628xfde5d61d, abstractC15633xee433078.mo63659xfb85f7b0(), abstractC15633xee433078.o(), abstractC15633xee433078.f219963e, abstractC15633xee433078.f219967i, null, abstractC15633xee433078.f219968m);
        }
        com.p314xaae8f345.mm.ui.C21405x85fc1ce0 c21405x85fc1ce02 = (com.p314xaae8f345.mm.ui.C21405x85fc1ce0) holder.p(com.p314xaae8f345.mm.R.id.spu);
        if (c21405x85fc1ce02 != null) {
            c21405x85fc1ce02.setVisibility(abstractC15633xee433078 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b ? 0 : 8);
        }
    }
}
