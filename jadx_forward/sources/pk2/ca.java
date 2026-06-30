package pk2;

/* loaded from: classes3.dex */
public final class ca implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.d3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f437169a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pk2.da f437170b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437171c;

    public ca(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, pk2.da daVar, pk2.o9 o9Var) {
        this.f437169a = c0Var;
        this.f437170b = daVar;
        this.f437171c = o9Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.d3
    /* renamed from: onDismiss */
    public final void mo55682xb349b3ab() {
        pk2.d9 d9Var;
        pk2.g8 g8Var;
        il2.r rVar;
        boolean z17 = this.f437169a.f391645d;
        pk2.da daVar = this.f437170b;
        if (z17 && daVar.f437215j && (d9Var = this.f437171c.f437615f) != null && (g8Var = d9Var.f437191a) != null && (rVar = (il2.r) ((pk2.k9) g8Var).f437457a.R6(il2.r.class)) != null) {
            if (rVar.f373616q == null) {
                android.content.Context context = rVar.f446856d.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                rVar.f373616q = new kl2.n(context, rVar);
            }
            kl2.n nVar = rVar.f373616q;
            if (nVar != null) {
                nVar.w();
            }
        }
        daVar.d();
    }
}
