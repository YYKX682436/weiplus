package c43;

/* loaded from: classes15.dex */
public class n implements c43.f1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 f119996a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c43.o f119997b;

    public n(c43.o oVar, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67) {
        this.f119997b = oVar;
        this.f119996a = c15731x94356d67;
    }

    @Override // c43.f1
    public void a(android.text.SpannableStringBuilder spannableStringBuilder) {
        u33.h hVar;
        if (spannableStringBuilder != null) {
            c43.o oVar = this.f119997b;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = oVar.Z;
            oVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67 = this.f119996a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15825xfe7745c4 c15825xfe7745c4 = c15731x94356d67.f36572xbfcc3e0.f36782x6e3ba777;
            if (c15825xfe7745c4 != null && c15825xfe7745c4.f36880xe791188b && (hVar = oVar.N) != null) {
                y33.e eVar = (y33.e) hVar;
                if (eVar.f66967xdde069b.equals(c15731x94356d67.f36570xfd4da1cb) || eVar.f66967xdde069b.equals(c15731x94356d67.f36572xbfcc3e0.f36782x6e3ba777.f36881x5907c61a)) {
                    spannableStringBuilder.setSpan(new android.text.style.StyleSpan(1), 0, spannableStringBuilder.length(), 18);
                }
            }
            c22624x85d69039.b(spannableStringBuilder);
        }
    }

    @Override // c43.f1
    public void b(long j17) {
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.f fVar = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149728a;
        c43.o oVar = this.f119997b;
        long j18 = oVar.f120027i;
        long j19 = oVar.f120026h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67 = this.f119996a;
        fVar.g(1L, j17, j18, j19, c15731x94356d67.seq, c15731x94356d67.f36570xfd4da1cb, 0L, oVar.X);
    }
}
