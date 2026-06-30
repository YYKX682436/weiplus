package x03;

/* loaded from: classes11.dex */
public final class t1 {

    /* renamed from: a, reason: collision with root package name */
    public int f532660a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.StringBuilder f532661b = new java.lang.StringBuilder();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f532662c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f532663d = new java.util.LinkedHashMap();

    public final void a(java.lang.String str) {
        if (str.length() == 0) {
            return;
        }
        java.lang.StringBuilder sb6 = this.f532661b;
        sb6.append(str);
        sb6.append("\n");
    }

    public final x03.u1 b(int i17) {
        if (i17 < 0) {
            return null;
        }
        java.util.List list = this.f532662c;
        if (i17 >= ((java.util.ArrayList) list).size()) {
            return null;
        }
        java.lang.String str = ((x03.u1) ((java.util.ArrayList) list).get(i17)).f532681c;
        if (str == null) {
            str = "";
        }
        return (x03.u1) ((java.util.LinkedHashMap) this.f532663d).get(str);
    }
}
