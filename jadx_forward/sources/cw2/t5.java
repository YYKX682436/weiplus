package cw2;

/* loaded from: classes15.dex */
public final class t5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.z5 f305555d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(cw2.z5 z5Var) {
        super(0);
        this.f305555d = z5Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p937x8ef83553.C11100x5c67d993 c11100x5c67d993;
        com.p314xaae8f345.mm.p937x8ef83553.C11100x5c67d993 c11100x5c67d9932;
        cw2.z5 z5Var = this.f305555d;
        cw2.b6 b6Var = z5Var.f305668c;
        cw2.c6 c6Var = z5Var.f305667b;
        if (z5Var.f305669d != 0 && b6Var != null && c6Var != null) {
            synchronized (cw2.d6.f305177f) {
                cw2.z5.a(z5Var);
                cw2.d6 d6Var = cw2.d6.f305178g;
                if (d6Var != null && (c11100x5c67d9932 = d6Var.f305182c) != null) {
                    c11100x5c67d9932.m47855x94496884(c6Var.f305151b, "strength", java.lang.Integer.valueOf(b6Var.f305134g));
                }
                cw2.d6 d6Var2 = cw2.d6.f305178g;
                if (d6Var2 != null && (c11100x5c67d993 = d6Var2.f305182c) != null) {
                    c11100x5c67d993.m47848x5fe1f39b(c6Var.f305151b, z5Var.f305669d, b6Var.f305128a, b6Var.f305132e, b6Var.f305133f, 2, true);
                }
                if (!z5Var.f305672g) {
                    z5Var.f305672g = true;
                    yz5.a aVar = z5Var.f305673h;
                    if (aVar != null) {
                        aVar.mo152xb9724478();
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
