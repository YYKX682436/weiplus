package of1;

/* loaded from: classes7.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ of1.v0 f426592d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426593e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ of1.a0 f426594f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(of1.v0 v0Var, java.lang.String str, of1.a0 a0Var) {
        super(0);
        this.f426592d = v0Var;
        this.f426593e = str;
        this.f426594f = a0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        of1.a0 a0Var = this.f426594f;
        java.lang.String str = this.f426593e;
        of1.v0 v0Var = this.f426592d;
        try {
            java.lang.String Z = v0Var.Z();
            java.lang.String str2 = v0Var.E;
            java.lang.String D1 = v0Var.D1();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestLoadUrl(url:");
            sb6.append(str);
            sb6.append("), viewHash:");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o oVar = v0Var.W1;
            if (oVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mView");
                throw null;
            }
            sb6.append(oVar.hashCode());
            sb6.append(", currentUrl:");
            sb6.append(Z);
            sb6.append(", commitUrl:");
            sb6.append(str2);
            sb6.append(", hasStartCalled:");
            sb6.append(v0Var.f263448J);
            sb6.append(", isFirstGetA8KeyResponded:");
            sb6.append(a0Var.f426417a);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(D1, sb6.toString());
            if (v0Var.f263448J) {
                of1.y yVar = new of1.y(str, Z, v0Var);
                if (a0Var.f426417a) {
                    yVar.mo152xb9724478();
                } else {
                    a0Var.f426418b.addLast(yVar);
                }
            } else {
                of1.v0.C1(v0Var, str);
            }
            v0Var.f426560f2 = str;
            return jz5.f0.f384359a;
        } catch (java.lang.Throwable th6) {
            v0Var.f426560f2 = str;
            throw th6;
        }
    }
}
