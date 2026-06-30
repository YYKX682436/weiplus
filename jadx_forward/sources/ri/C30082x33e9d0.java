package ri;

/* renamed from: ri.q$$a */
/* loaded from: classes.dex */
public final /* synthetic */ class C30082x33e9d0 implements r.a {
    @Override // r.a
    /* renamed from: apply */
    public final java.lang.Object mo1850x58b836e(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        double d17 = 0.0d;
        if (list.isEmpty()) {
            return java.lang.Double.valueOf(0.0d);
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            d17 += ((java.lang.Double) it.next()).doubleValue();
        }
        return java.lang.Double.valueOf(d17 / list.size());
    }
}
