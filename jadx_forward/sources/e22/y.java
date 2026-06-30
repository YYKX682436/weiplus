package e22;

/* loaded from: classes14.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f328292d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f328293e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f328294f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e22.d1 f328295g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f328296h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(boolean z17, boolean z18, yz5.a aVar, e22.d1 d1Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725) {
        super(0);
        this.f328292d = z17;
        this.f328293e = z18;
        this.f328294f = aVar;
        this.f328295g = d1Var;
        this.f328296h = c19792x256d2725;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if (!this.f328292d || this.f328293e) {
            e22.d1 d1Var = this.f328295g;
            d1Var.getClass();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 finder = this.f328296h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finder, "finder");
            x0.i0 i0Var = d1Var.f328172m;
            if (i0Var.contains(finder)) {
                i0Var.remove(finder);
            } else {
                i0Var.add(finder);
            }
        } else {
            yz5.a aVar = this.f328294f;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
        }
        return jz5.f0.f384359a;
    }
}
