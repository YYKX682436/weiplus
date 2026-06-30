package c43;

/* loaded from: classes8.dex */
public class q implements c43.f1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 f120005a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c43.r f120006b;

    public q(c43.r rVar, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67) {
        this.f120006b = rVar;
        this.f120005a = c15731x94356d67;
    }

    @Override // c43.f1
    public void a(android.text.SpannableStringBuilder spannableStringBuilder) {
        android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder();
        if (spannableStringBuilder != null) {
            java.lang.String str = this.f120005a.f36571x8f2d71bb.f36770x2b2244c1.f36589x6942258;
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
            c43.r rVar = this.f120006b;
            if (K0) {
                spannableStringBuilder2.append((java.lang.CharSequence) spannableStringBuilder);
            } else {
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context = rVar.f120025g;
                ((ke0.e) xVar).getClass();
                android.text.SpannableString spannableString = new android.text.SpannableString(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str));
                spannableString.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.k0(str, rVar.f120025g.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b), rVar.f120025g.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230), (int) (ym5.x.a(rVar.f120025g, 10.0f) * i65.a.q(rVar.f120025g)), ym5.x.a(rVar.f120025g, 13.0f), ym5.x.a(rVar.f120025g, 6.0f), ym5.x.a(rVar.f120025g, 6.0f), ym5.x.a(rVar.f120025g, 3.0f), ym5.x.a(rVar.f120025g, 3.0f)), 0, str.length(), 33);
                spannableStringBuilder2.append((java.lang.CharSequence) spannableString).append((java.lang.CharSequence) "  ").append((java.lang.CharSequence) spannableStringBuilder);
            }
            rVar.Z.b(spannableStringBuilder2);
        }
    }

    @Override // c43.f1
    public void b(long j17) {
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.f fVar = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149728a;
        c43.r rVar = this.f120006b;
        long j18 = rVar.f120027i;
        long j19 = rVar.f120026h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67 = this.f120005a;
        fVar.g(1L, j17, j18, j19, c15731x94356d67.seq, c15731x94356d67.f36570xfd4da1cb, 0L, rVar.X);
    }
}
