package w8;

/* loaded from: classes15.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f525328a;

    /* renamed from: b, reason: collision with root package name */
    public final q8.o[] f525329b;

    public y(java.util.List list) {
        this.f525328a = list;
        this.f525329b = new q8.o[list.size()];
    }

    public void a(q8.g gVar, w8.g0 g0Var) {
        int i17 = 0;
        while (true) {
            q8.o[] oVarArr = this.f525329b;
            if (i17 >= oVarArr.length) {
                return;
            }
            g0Var.a();
            g0Var.b();
            q8.o l17 = gVar.l(g0Var.f525177d, 3);
            com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417 = (com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417) this.f525328a.get(i17);
            java.lang.String str = c1601x7dc4e417.f125613i;
            t9.a.b(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54222x14e2122e.equals(str) || com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54223x14e215ef.equals(str), "Invalid closed caption mime type provided: " + str);
            java.lang.String str2 = c1601x7dc4e417.f125608d;
            if (str2 == null) {
                g0Var.b();
                str2 = g0Var.f525178e;
            }
            l17.c(com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417.i(str2, str, null, -1, c1601x7dc4e417.D, c1601x7dc4e417.E, c1601x7dc4e417.F, null, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697, java.util.Collections.emptyList()));
            oVarArr[i17] = l17;
            i17++;
        }
    }
}
