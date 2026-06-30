package l0;

/* loaded from: classes14.dex */
public final class d4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l0.m3 f395657d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f395658e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f395659f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c0.n f395660g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f395661h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f395662i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(l0.m3 m3Var, boolean z17, boolean z18, c0.n nVar, int i17, int i18) {
        super(3);
        this.f395657d = m3Var;
        this.f395658e = z17;
        this.f395659f = z18;
        this.f395660g = nVar;
        this.f395661h = i17;
        this.f395662i = i18;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        l0.l0 it = (l0.l0) obj;
        ((java.lang.Number) obj3).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        n0.y0 y0Var = (n0.y0) ((n0.o) obj2);
        y0Var.U(697243846);
        boolean z17 = it == l0.l0.UnfocusedEmpty ? false : this.f395659f;
        int i17 = (this.f395661h >> 27) & 14;
        int i18 = this.f395662i;
        int i19 = i17 | ((i18 << 3) & ce1.h.f4368x366c91de) | (i18 & 7168);
        l0.y yVar = (l0.y) this.f395657d;
        yVar.getClass();
        c0.n interactionSource = this.f395660g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(interactionSource, "interactionSource");
        y0Var.U(727091888);
        n0.e5 e17 = n0.s4.e(new e1.y(!this.f395658e ? yVar.f396177r : z17 ? yVar.f396178s : ((java.lang.Boolean) c0.h.a(interactionSource, y0Var, (i19 >> 6) & 14).mo128745x754a37bb()).booleanValue() ? yVar.f396175p : yVar.f396176q), y0Var, 0);
        y0Var.o(false);
        long j17 = ((e1.y) e17.mo128745x754a37bb()).f327855a;
        y0Var.o(false);
        return new e1.y(j17);
    }
}
