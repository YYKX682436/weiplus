package com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44;

/* loaded from: classes14.dex */
public final class p5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f151699d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f151700e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i0.g f151701f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f151702g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f151703h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f151704i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(yz5.p pVar, float f17, i0.g gVar, long j17, boolean z17, java.lang.String str, d0.z zVar) {
        super(2);
        this.f151699d = pVar;
        this.f151700e = f17;
        this.f151701f = gVar;
        this.f151702g = j17;
        this.f151703h = z17;
        this.f151704i = str;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f384359a;
            }
        }
        java.lang.Object obj3 = n0.e1.f415025a;
        this.f151699d.mo149xb9724478(oVar, 0);
        float f17 = this.f151700e;
        if (f17 < 0.0f || f17 >= 100.0f) {
            if (this.f151703h) {
                java.lang.String str = this.f151704i;
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "")) {
                    n0.y0 y0Var2 = (n0.y0) oVar;
                    y0Var2.U(631822475);
                    int i17 = z0.t.f550455q1;
                    int i18 = z0.d.f550436a;
                    z0.d dVar = z0.a.f550429h;
                    boolean z17 = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.f3.f92095a;
                    com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.a7.j(new d0.q(dVar, false, p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.e3.f92086d), str, y0Var2, 0, 0);
                    y0Var2.o(false);
                }
            }
            n0.y0 y0Var3 = (n0.y0) oVar;
            y0Var3.U(631822725);
            y0Var3.o(false);
        } else {
            n0.y0 y0Var4 = (n0.y0) oVar;
            y0Var4.U(631822220);
            com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.a7.i(this.f151700e, this.f151701f, this.f151702g, null, y0Var4, 0, 8);
            y0Var4.o(false);
        }
        return jz5.f0.f384359a;
    }
}
