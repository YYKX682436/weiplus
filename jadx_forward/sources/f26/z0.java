package f26;

/* loaded from: classes16.dex */
public abstract class z0 extends f26.c3 implements i26.j, i26.k {
    public z0() {
        super(null);
    }

    @Override // f26.c3
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public abstract f26.z0 A0(boolean z17);

    @Override // f26.c3
    /* renamed from: E0, reason: merged with bridge method [inline-methods] */
    public abstract f26.z0 C0(f26.r1 r1Var);

    /* renamed from: toString */
    public java.lang.String mo128943x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = mo9601xa083c1ee().iterator();
        while (it.hasNext()) {
            java.lang.String[] strArr = {"[", q16.s.r(q16.s.f441315c, (p06.c) it.next(), null, 2, null), "] "};
            for (int i17 = 0; i17 < 3; i17++) {
                sb6.append(strArr[i17]);
            }
        }
        sb6.append(w0());
        if (!u0().isEmpty()) {
            kz5.n0.f0(u0(), sb6, ", ", "<", ">", 0, null, null, 112, null);
        }
        if (x0()) {
            sb6.append("?");
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }
}
