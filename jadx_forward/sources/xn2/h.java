package xn2;

/* loaded from: classes2.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f537036d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xn2.p0 f537037e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f537038f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f537039g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f537040h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(boolean z17, xn2.p0 p0Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, so2.j5 j5Var, p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var) {
        super(0);
        this.f537036d = z17;
        this.f537037e = p0Var;
        this.f537038f = f0Var;
        this.f537039g = j5Var;
        this.f537040h = g0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        xn2.b bVar;
        boolean z17 = this.f537036d;
        xn2.p0 p0Var = this.f537037e;
        if (z17) {
            pm0.v.I(p0Var.j().m56388xcaeb60d0(), new xn2.g(this.f537040h));
            p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f537038f;
            if (f0Var.f391649d >= 0 && (bVar = p0Var.f537080e) != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mj) ((xn2.f1) bVar).a()).mo56053xb9568715(f0Var.f391649d, 1);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) this.f537039g;
            if (abstractC14490x69736cb5 != null) {
                vn2.u0 u0Var = vn2.u0.f519920a;
                java.lang.String str = p0Var.f537078c;
                android.app.Activity activity = p0Var.f537076a;
                r45.qt2 l17 = p0Var.l();
                xn2.b bVar2 = p0Var.f537080e;
                u0Var.d(str, activity, l17, bVar2 != null ? ((xn2.f1) bVar2).a() : null, p0Var.j(), 0, abstractC14490x69736cb5, true, false);
            }
        }
        return jz5.f0.f384359a;
    }
}
