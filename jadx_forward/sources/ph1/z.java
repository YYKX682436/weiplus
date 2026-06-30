package ph1;

/* loaded from: classes7.dex */
public class z implements ph1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f435900a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e f435901b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ph1.d f435902c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ph1.g0 f435903d;

    public z(ph1.g0 g0Var, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e c11656xaf63146e, ph1.d dVar) {
        this.f435903d = g0Var;
        this.f435900a = z17;
        this.f435901b = c11656xaf63146e;
        this.f435902c = dVar;
    }

    @Override // ph1.d
    public void a(ph1.g gVar) {
        if (ph1.g.OK == gVar && this.f435900a) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e c11656xaf63146e = this.f435901b;
            boolean z17 = c11656xaf63146e.f33453xc73e777a;
            ph1.g0 g0Var = this.f435903d;
            if (!z17) {
                g0Var.l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33446xd388c2f8, "options.injectModuleJS");
            }
            g0Var.l(c11656xaf63146e.f33454x337a8b, "options.injectModuleJS");
        }
        ph1.d dVar = this.f435902c;
        if (dVar != null) {
            dVar.a(gVar);
        }
    }
}
