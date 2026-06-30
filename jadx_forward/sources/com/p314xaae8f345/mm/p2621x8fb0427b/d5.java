package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes4.dex */
public final class d5 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2621x8fb0427b.d5 f275369a = new com.p314xaae8f345.mm.p2621x8fb0427b.d5();

    /* renamed from: b, reason: collision with root package name */
    public static final jt0.j f275370b = new jt0.j(500);

    public final com.p314xaae8f345.mm.p2621x8fb0427b.e5 a(int i17) {
        z85.b bVar;
        jt0.j jVar = f275370b;
        com.p314xaae8f345.mm.p2621x8fb0427b.e5 e5Var = (com.p314xaae8f345.mm.p2621x8fb0427b.e5) jVar.get(java.lang.Integer.valueOf(i17));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.e5 e5Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.e5();
            e5Var2.f275390a = i17;
            return e5Var2;
        }
        if (e5Var != null) {
            return e5Var;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.n5 f17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f();
        synchronized (f17.f276696a) {
            bVar = f17.f276710o;
        }
        bVar.getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.e5 e5Var3 = new com.p314xaae8f345.mm.p2621x8fb0427b.e5();
        e5Var3.f275390a = i17;
        try {
            android.database.Cursor E = bVar.f552316d.E("EmojiDesignerProduct", z85.a.f552314r.f398487c, "designerUin=? ", new java.lang.String[]{i17 + ""}, null, null, null);
            if (E != null) {
                while (E.moveToNext()) {
                    try {
                        z85.a aVar = new z85.a();
                        aVar.mo9015xbf5d97fd(E);
                        e5Var3.f275391b.add(aVar);
                    } finally {
                    }
                }
            }
            if (E != null) {
                E.close();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.EmojiDesignerProductStorage", e17, "", new java.lang.Object[0]);
        }
        jVar.put(java.lang.Integer.valueOf(i17), e5Var3);
        return e5Var3;
    }
}
