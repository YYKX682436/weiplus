package ph1;

/* loaded from: classes7.dex */
public class x implements ph1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ph1.d f435890a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a f435891b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ph1.e0 f435892c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f435893d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f435894e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ph1.g0 f435895f;

    public x(ph1.g0 g0Var, ph1.d dVar, com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a, ph1.e0 e0Var, ik1.b0 b0Var, ik1.b0 b0Var2) {
        this.f435895f = g0Var;
        this.f435890a = dVar;
        this.f435891b = c19762x487075a;
        this.f435892c = e0Var;
        this.f435893d = b0Var;
        this.f435894e = b0Var2;
    }

    @Override // ph1.d
    public void a(ph1.g gVar) {
        ph1.e0 e0Var;
        this.f435891b.f38859x6ac9171 = true;
        if (ph1.g.OK == gVar && (e0Var = this.f435892c) != null && e0Var.f435851c) {
            if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e) this.f435893d.f373357a).f33453xc73e777a) {
                this.f435895f.l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33446xd388c2f8, "options.injectModuleJS");
            }
            this.f435895f.l(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e) this.f435893d.f373357a).f33454x337a8b, "options.injectModuleJS");
        }
        this.f435895f.f435862f.m(new ph1.w(this));
        ph1.d dVar = this.f435890a;
        if (dVar != null) {
            dVar.a(gVar);
        }
    }

    @Override // ph1.d
    public void b(java.util.List list) {
        ph1.d dVar = this.f435890a;
        if (dVar != null) {
            dVar.b(list);
        }
    }
}
