package vu2;

/* loaded from: classes2.dex */
public final class a extends vu2.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.ui.C15114xedf903f6 f521739e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.ui.C15114xedf903f6 c15114xedf903f6) {
        super(c15114xedf903f6);
        this.f521739e = c15114xedf903f6;
    }

    @Override // vu2.c
    public com.p314xaae8f345.mm.p944x882e457a.i b() {
        o72.f4 f4Var = (o72.f4) i95.n0.c(o72.f4.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.ui.C15114xedf903f6 c15114xedf903f6 = this.f521739e;
        int h17 = kz5.c0.h(c15114xedf903f6.f210739d);
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.d3) f4Var).getClass();
        jz5.l c17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.h3.f182661c.a().c(h17, c15114xedf903f6.f210741f);
        boolean booleanValue = ((java.lang.Boolean) c17.f384366d).booleanValue();
        java.util.List list = (java.util.List) c17.f384367e;
        if (list.isEmpty() && !booleanValue) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q0(((r45.kv2) it.next()).m75945x2fec8307(0), 0L)));
        }
        c15114xedf903f6.f210739d.addAll(arrayList);
        c15114xedf903f6.f210746n = booleanValue;
        return mo984xd7029bba();
    }
}
