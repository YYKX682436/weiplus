package com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29;

/* loaded from: classes8.dex */
public abstract class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.p0 f178843a;

    /* renamed from: b, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.n0 f178844b;

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.n0 a() {
        if (f178844b == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.l lVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.l) ((h43.e) i95.n0.c(h43.e.class));
            byte[] z07 = lVar.wi() == null ? null : lVar.wi().z0("pb_appinfo");
            if (z07 != null) {
                f178844b = new com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.n0(z07);
            }
            f178844b = f178844b;
        }
        return f178844b;
    }

    public static void b(java.util.LinkedList linkedList, com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.p0 p0Var) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        c02.a aVar = new c02.a();
        aVar.f119115d = linkedList;
        aVar.f119117f = true;
        lVar.f152197a = aVar;
        lVar.f152198b = new c02.b();
        lVar.f152199c = "/cgi-bin/mmgame-bin/batchgetappdownloadinfo";
        lVar.f152200d = 2560;
        f178843a = p0Var;
        com.p314xaae8f345.mm.p944x882e457a.z2.d(lVar.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.o0(), false);
    }
}
