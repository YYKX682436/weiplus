package ms4;

/* loaded from: classes8.dex */
public final class f0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ js4.o f412549a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ms4.j0 f412550b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f412551c;

    public f0(js4.o oVar, ms4.j0 j0Var, android.content.Context context) {
        this.f412549a = oVar;
        this.f412550b = j0Var;
        this.f412551c = context;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinMidasInitializer", "CgiGetMidasSdkInfoRequest errorType: " + fVar.f152148a + ", errorCode: " + fVar.f152149b + ", errorMsg: " + fVar.f152150c);
        boolean h17 = os4.h.h(fVar);
        js4.o oVar = this.f412549a;
        if (!h17) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = fVar.f152151d;
            if (fVar2 != null) {
                r45.nl4 nl4Var = ((r45.pi3) fVar2).f464605d;
                if (nl4Var != null) {
                    os4.h.k("MicroMsg.WeCoinMidasInitializer", fVar2);
                    ms4.j0 j0Var = this.f412550b;
                    j0Var.f412580a = nl4Var;
                    j0Var.a(this.f412551c, nl4Var);
                    if (oVar != null) {
                        oVar.mo14245xe05b4124(java.lang.Boolean.TRUE);
                    }
                }
            } else if (oVar != null) {
                oVar.a(3, -2, "");
            }
        } else if (oVar != null) {
            int i17 = fVar.f152148a;
            int i18 = fVar.f152149b;
            java.lang.String str = fVar.f152150c;
            oVar.a(i17, i18, str != null ? str : "");
        }
        return jz5.f0.f384359a;
    }
}
