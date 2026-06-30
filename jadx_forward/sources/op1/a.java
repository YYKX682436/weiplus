package op1;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public long f428768a = -1;

    /* renamed from: b, reason: collision with root package name */
    public java.util.List f428769b;

    public void a(int i17) {
        int i18;
        java.util.List list = this.f428769b;
        int i19 = 0;
        java.lang.String str = (list == null || list.isEmpty()) ? null : ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) this.f428769b.get(0)).M.f174626p;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.List list2 = this.f428769b;
        if (list2 != null) {
            int size = list2.size();
            i18 = 0;
            while (i19 < size) {
                int i27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) this.f428769b.get(i19)).H;
                if (i27 == 8 || i27 == 4) {
                    i27 = 4;
                }
                i18 |= i27;
                if (i19 != 0) {
                    sb6.append(";");
                }
                sb6.append(((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) this.f428769b.get(i19)).M.f174625o);
                i19++;
            }
            i19 = size;
        } else {
            i18 = 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(17603, java.lang.String.format("%s,%d,%d,%d,%d,%d,%s", str, java.lang.Long.valueOf(this.f428768a), java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i18), sb6.toString()));
        this.f428768a = -1L;
    }
}
