package rb2;

/* loaded from: classes2.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f475122d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f475123e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f475124f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f475125g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(in5.s0 s0Var, java.lang.String str, so2.y0 y0Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862) {
        super(1);
        this.f475122d = s0Var;
        this.f475123e = str;
        this.f475124f = y0Var;
        this.f475125g = c19786x6a1e2862;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        qs2.e eVar = new qs2.e(((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.E8).mo141623x754a37bb()).r()).intValue() == 1 ? 2 : 1, 48, 25);
        eVar.f447798g = this.f475123e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var = this.f475124f.f492236d;
        eVar.f447795d = yj0Var.f68959xf9a02e3e;
        eVar.f447796e = yj0Var.f68957xec748fc6;
        eVar.f447808q = true;
        xc2.y2.f534876a.y(this.f475125g);
        i95.m c17 = i95.n0.c(w40.e.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        android.content.Context context = this.f475122d.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        w40.e.Df((w40.e) c17, context, eVar, null, 4, null);
        return jz5.f0.f384359a;
    }
}
