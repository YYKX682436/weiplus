package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public final class a2 implements pm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f294310a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.SortedMap f294311b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.SortedMap f294312c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.g6 f294313d;

    public a2(java.util.Map map, java.util.SortedMap sortedMap, java.util.SortedMap sortedMap2, com.p314xaae8f345.mm.vfs.g6 g6Var) {
        this.f294310a = map;
        this.f294311b = sortedMap;
        this.f294312c = sortedMap2;
        this.f294313d = g6Var;
    }

    @Override // pm5.a
    public java.lang.Iterable a(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.p314xaae8f345.mm.vfs.f1 f1Var = new com.p314xaae8f345.mm.vfs.f1(str);
        java.util.Map map = this.f294310a;
        java.lang.String a17 = f1Var.a(map);
        kz5.p0 p0Var = kz5.p0.f395529d;
        if (a17 == null) {
            return p0Var;
        }
        com.p314xaae8f345.mm.vfs.q2 b17 = new com.p314xaae8f345.mm.vfs.C22758x1f6ac662(str).b(map);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "configure(...)");
        java.lang.Integer num = (java.lang.Integer) this.f294311b.get(a17);
        int intValue = num != null ? num.intValue() : 0;
        java.lang.Iterable mo82286x32b09e = b17.mo82286x32b09e("");
        return mo82286x32b09e == null ? p0Var : new pm5.b(mo82286x32b09e, new com.p314xaae8f345.mm.vfs.i6(intValue, a17, (yz5.p) this.f294312c.get(a17), this.f294313d));
    }
}
