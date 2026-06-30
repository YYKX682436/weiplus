package cw2;

/* loaded from: classes15.dex */
public final class s5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f305525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f305526e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f305527f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cw2.z5 f305528g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f305529h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ cw2.d6 f305530i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.a f305531m;

    public s5(int i17, java.lang.String str, java.lang.String str2, cw2.z5 z5Var, yz5.l lVar, cw2.d6 d6Var, yz5.a aVar) {
        this.f305525d = i17;
        this.f305526e = str;
        this.f305527f = str2;
        this.f305528g = z5Var;
        this.f305529h = lVar;
        this.f305530i = d6Var;
        this.f305531m = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cw2.c6 c6Var;
        cw2.z5 z5Var = this.f305528g;
        java.util.Objects.toString(z5Var);
        boolean z17 = z5Var.f305666a;
        yz5.l lVar = this.f305529h;
        if (z17) {
            lVar.mo146xb9724478(java.lang.Boolean.TRUE);
            return;
        }
        z5Var.f305666a = true;
        cw2.d6 d6Var = this.f305530i;
        java.util.HashMap hashMap = d6Var.f305183d;
        int i17 = this.f305525d;
        java.util.Stack stack = (java.util.Stack) hashMap.get(java.lang.Integer.valueOf(i17));
        cw2.b6 b6Var = null;
        if (stack == null || stack.empty()) {
            lz5.m mVar = new lz5.m();
            java.lang.String str = this.f305526e;
            if (str != null) {
                mVar.put("modelPath", str);
            }
            java.lang.String str2 = this.f305527f;
            if (str2 != null) {
                mVar.put("modelCachePath", str2);
            }
            long m47842xda3e9036 = d6Var.f305182c.m47842xda3e9036(i17, kz5.b1.b(mVar));
            if (m47842xda3e9036 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderThumbPlayerPostProcessor", "Failed to create strategy post processor");
                c6Var = null;
            } else {
                c6Var = new cw2.c6(i17, m47842xda3e9036);
            }
        } else {
            java.lang.Object pop = stack.pop();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(pop, "pop(...)");
            c6Var = new cw2.c6(i17, ((java.lang.Number) pop).longValue());
        }
        z5Var.f305667b = c6Var;
        if (z5Var.f305667b == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderThumbPlayerPostProcessor", "Failed to create strategy post processor. strategy=" + i17);
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
            return;
        }
        java.util.Stack stack2 = d6Var.f305184e;
        if (stack2.empty()) {
            com.p314xaae8f345.mm.p937x8ef83553.C11100x5c67d993 c11100x5c67d993 = d6Var.f305182c;
            long m47841x5d03f90d = c11100x5c67d993.m47841x5d03f90d();
            if (m47841x5d03f90d == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderThumbPlayerPostProcessor", "Failed to create input texture");
            } else {
                b6Var = new cw2.b6(m47841x5d03f90d, c11100x5c67d993.m47844x6530bbe2(m47841x5d03f90d), d6Var.f305181b);
            }
        } else {
            b6Var = (cw2.b6) stack2.pop();
        }
        if (b6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderThumbPlayerPostProcessor", "Failed to create input texture");
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
            return;
        }
        b6Var.f305131d = z5Var.f305675j;
        z5Var.f305670e.set(b6Var.f305130c);
        z5Var.f305668c = b6Var;
        z5Var.f305673h = this.f305531m;
        java.util.Objects.toString(z5Var);
        lVar.mo146xb9724478(java.lang.Boolean.TRUE);
    }
}
