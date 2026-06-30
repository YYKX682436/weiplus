package c43;

/* loaded from: classes8.dex */
public class u implements c43.f1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 f120013a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c43.v f120014b;

    public u(c43.v vVar, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67) {
        this.f120014b = vVar;
        this.f120013a = c15731x94356d67;
    }

    @Override // c43.f1
    public void a(android.text.SpannableStringBuilder spannableStringBuilder) {
        if (spannableStringBuilder != null) {
            this.f120014b.Z.b(spannableStringBuilder);
        }
    }

    @Override // c43.f1
    public void b(long j17) {
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.f fVar = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149728a;
        c43.v vVar = this.f120014b;
        long j18 = vVar.f120027i;
        long j19 = vVar.f120026h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67 = this.f120013a;
        fVar.g(1L, j17, j18, j19, c15731x94356d67.seq, c15731x94356d67.f36570xfd4da1cb, 0L, vVar.X);
    }
}
