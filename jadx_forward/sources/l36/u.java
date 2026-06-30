package l36;

/* loaded from: classes16.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f397180a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String[] f397181b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String[] f397182c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f397183d;

    public u(boolean z17) {
        this.f397180a = z17;
    }

    public l36.u a(java.lang.String... strArr) {
        if (!this.f397180a) {
            throw new java.lang.IllegalStateException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new java.lang.IllegalArgumentException("At least one cipher suite is required");
        }
        this.f397181b = (java.lang.String[]) strArr.clone();
        return this;
    }

    public l36.u b(l36.r... rVarArr) {
        if (!this.f397180a) {
            throw new java.lang.IllegalStateException("no cipher suites for cleartext connections");
        }
        java.lang.String[] strArr = new java.lang.String[rVarArr.length];
        for (int i17 = 0; i17 < rVarArr.length; i17++) {
            strArr[i17] = rVarArr[i17].f397160a;
        }
        a(strArr);
        return this;
    }

    public l36.u c(java.lang.String... strArr) {
        if (!this.f397180a) {
            throw new java.lang.IllegalStateException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new java.lang.IllegalArgumentException("At least one TLS version is required");
        }
        this.f397182c = (java.lang.String[]) strArr.clone();
        return this;
    }

    public l36.u d(l36.e1... e1VarArr) {
        if (!this.f397180a) {
            throw new java.lang.IllegalStateException("no TLS versions for cleartext connections");
        }
        java.lang.String[] strArr = new java.lang.String[e1VarArr.length];
        for (int i17 = 0; i17 < e1VarArr.length; i17++) {
            strArr[i17] = e1VarArr[i17].f397019d;
        }
        c(strArr);
        return this;
    }

    public u(l36.v vVar) {
        this.f397180a = vVar.f397193a;
        this.f397181b = vVar.f397195c;
        this.f397182c = vVar.f397196d;
        this.f397183d = vVar.f397194b;
    }
}
