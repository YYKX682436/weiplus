package cw2;

/* loaded from: classes15.dex */
public final class w5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.z5 f305618d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw2.d6 f305619e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f305620f;

    public w5(cw2.z5 z5Var, cw2.d6 d6Var, boolean z17) {
        this.f305618d = z5Var;
        this.f305619e = d6Var;
        this.f305620f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cw2.z5 z5Var = this.f305618d;
        java.util.Objects.toString(z5Var);
        cw2.d6 d6Var = this.f305619e;
        java.util.Objects.toString(d6Var);
        if (this.f305620f) {
            d6Var.f305180a.quit();
            for (cw2.b6 b6Var : d6Var.f305184e) {
                b6Var.f305131d = null;
                b6Var.f305130c.a();
                b6Var.f305129b.release();
            }
            d6Var.f305182c.m47850x41012807();
        } else {
            long j17 = z5Var.f305669d;
            if (j17 != 0) {
                d6Var.f305182c.m47853xa1e5e8a7(j17);
                z5Var.f305669d = 0L;
            }
            cw2.b6 b6Var2 = z5Var.f305668c;
            if (b6Var2 != null) {
                d6Var.getClass();
                b6Var2.f305131d = null;
                d6Var.f305184e.push(b6Var2);
            }
            z5Var.f305668c = null;
            cw2.c6 c6Var = z5Var.f305667b;
            if (c6Var != null) {
                java.util.HashMap hashMap = d6Var.f305183d;
                int i17 = c6Var.f305150a;
                java.util.Stack stack = (java.util.Stack) hashMap.get(java.lang.Integer.valueOf(i17));
                if (stack == null) {
                    stack = new java.util.Stack();
                    hashMap.put(java.lang.Integer.valueOf(i17), stack);
                }
                stack.push(java.lang.Long.valueOf(c6Var.f305151b));
            }
            z5Var.f305667b = null;
        }
        java.util.Objects.toString(z5Var);
        java.util.Objects.toString(d6Var);
    }
}
