package ti;

/* loaded from: classes12.dex */
public final class y0 implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f501057d;

    public y0(java.util.List list) {
        this.f501057d = java.util.Collections.unmodifiableList(new java.util.ArrayList(list));
    }

    /* renamed from: toString */
    public java.lang.String m166623x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = 0;
        while (true) {
            java.util.List list = this.f501057d;
            if (i17 >= list.size()) {
                return sb6.toString();
            }
            ti.c1 c1Var = (ti.c1) list.get(i17);
            sb6.append("* ");
            if (i17 == 0) {
                sb6.append("GC ROOT ");
            } else if (i17 == list.size() - 1) {
                sb6.append("leaks ");
            } else {
                sb6.append("references ");
            }
            sb6.append(c1Var);
            sb6.append('\n');
            i17++;
        }
    }
}
