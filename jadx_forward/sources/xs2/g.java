package xs2;

/* loaded from: classes3.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xs2.m f537862d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(xs2.m mVar) {
        super(0);
        this.f537862d = mVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        xs2.o oVar = this.f537862d.f537884f;
        if (oVar != null) {
            xs2.e eVar = (xs2.e) oVar;
            if (eVar.f537852f) {
                java.lang.String j17 = eVar.j();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resume: ");
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((mm2.c1) eVar.f537848b.a(mm2.c1.class)).f410379n;
                sb6.append(c19792x256d2725 != null ? cm2.a.f124861a.x(c19792x256d2725, -1) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j17, sb6.toString());
                if (!eVar.i().m172424xc00617a4()) {
                    eVar.i().f520385d.mo172413xc84dc82d();
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
