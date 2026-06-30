package qj1;

/* loaded from: classes7.dex */
public abstract class e extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f445400d;

    public e(l75.k0 k0Var, l75.e0 e0Var, java.lang.String str, java.lang.String[] strArr) {
        super(k0Var, e0Var, str, strArr);
        this.f445400d = k0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l75.n0, l75.g0
    /* renamed from: delete */
    public boolean mo49766xb06685ab(l75.f0 f0Var, boolean z17, java.lang.String... strArr) {
        if (strArr == null || strArr.length == 0) {
            strArr = ((qj1.d) f0Var).mo49271xfb81966a();
        }
        return super.mo49766xb06685ab(f0Var, z17, strArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l75.n0, l75.g0
    public boolean get(l75.f0 f0Var, java.lang.String... strArr) {
        if (strArr == null || strArr.length == 0) {
            strArr = ((qj1.d) f0Var).mo49271xfb81966a();
        }
        return super.get(f0Var, strArr);
    }

    @Override // l75.n0
    /* renamed from: insertNotify */
    public boolean mo51731x24249762(l75.f0 f0Var, boolean z17) {
        super.mo51731x24249762(f0Var, z17);
        return get(f0Var, new java.lang.String[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l75.n0
    /* renamed from: updateNotify */
    public boolean mo51732xbf274172(l75.f0 f0Var, boolean z17, java.lang.String... strArr) {
        if (strArr == null || strArr.length == 0) {
            strArr = ((qj1.d) f0Var).mo49271xfb81966a();
        }
        return super.mo51732xbf274172(f0Var, z17, strArr);
    }
}
