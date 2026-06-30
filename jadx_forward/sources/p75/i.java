package p75;

/* loaded from: classes4.dex */
public final class i extends p75.e1 {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f434185c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f434186d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(java.lang.String table, java.lang.String str, java.lang.String[] strArr) {
        super("", strArr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(table, "table");
        this.f434185c = table;
        this.f434186d = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r0 == null) goto L11;
     */
    @Override // p75.e1, p75.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String b() {
        /*
            r3 = this;
            java.lang.String r0 = r3.f434186d
            if (r0 == 0) goto L21
            boolean r1 = r26.n0.N(r0)
            r1 = r1 ^ 1
            if (r1 == 0) goto Le
            r1 = r0
            goto Lf
        Le:
            r1 = 0
        Lf:
            if (r1 == 0) goto L21
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = " WHERE "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            if (r0 != 0) goto L23
        L21:
            java.lang.String r0 = ""
        L23:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "DELETE FROM "
            r1.<init>(r2)
            java.lang.String r2 = r3.f434185c
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p75.i.b():java.lang.String");
    }

    public final int f(l75.k0 k0Var) {
        if (k0Var != null) {
            return k0Var.mo70514xb06685ab(this.f434185c, this.f434186d, this.f434170b);
        }
        return -1;
    }
}
