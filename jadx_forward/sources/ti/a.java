package ti;

/* loaded from: classes12.dex */
public final class a extends ti.b {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f501018d;

    /* renamed from: e, reason: collision with root package name */
    public final ti.y0 f501019e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Throwable f501020f;

    /* renamed from: g, reason: collision with root package name */
    public final long f501021g;

    public a(boolean z17, boolean z18, java.lang.String str, ti.y0 y0Var, java.lang.Throwable th6, long j17) {
        this.f501018d = z17;
        this.f501019e = y0Var;
        this.f501020f = th6;
        this.f501021g = j17;
    }

    public static ti.a a(java.lang.Throwable th6, long j17) {
        return new ti.a(false, false, null, null, th6, j17);
    }

    public static ti.a b(long j17) {
        return new ti.a(false, false, null, null, null, j17);
    }

    /* renamed from: toString */
    public java.lang.String m166611x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Leak Reference:");
        ti.y0 y0Var = this.f501019e;
        if (y0Var != null) {
            java.util.Iterator it = y0Var.f501057d.iterator();
            while (it.hasNext()) {
                sb6.append(((ti.c1) it.next()).a(true));
                sb6.append(";");
            }
        }
        return sb6.toString();
    }
}
