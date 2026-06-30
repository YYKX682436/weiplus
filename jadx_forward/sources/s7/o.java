package s7;

/* loaded from: classes16.dex */
public class o implements s7.i {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f485281a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f485282b;

    public o(boolean z17, java.lang.String str) {
        this.f485281a = z17;
        this.f485282b = str;
    }

    @Override // s7.i
    public boolean a(s7.s sVar, s7.y1 y1Var) {
        int i17;
        boolean z17 = this.f485281a;
        java.lang.String str = this.f485282b;
        if (z17 && str == null) {
            str = y1Var.n();
        }
        s7.w1 w1Var = y1Var.f485119b;
        if (w1Var != null) {
            java.util.Iterator it = w1Var.c().iterator();
            i17 = 0;
            while (it.hasNext()) {
                s7.y1 y1Var2 = (s7.y1) ((s7.a2) it.next());
                if (str == null || y1Var2.n().equals(str)) {
                    i17++;
                }
            }
        } else {
            i17 = 1;
        }
        return i17 == 1;
    }

    /* renamed from: toString */
    public java.lang.String m164002x9616526c() {
        return this.f485281a ? java.lang.String.format("only-of-type <%s>", this.f485282b) : java.lang.String.format("only-child", new java.lang.Object[0]);
    }
}
