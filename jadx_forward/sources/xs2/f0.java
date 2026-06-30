package xs2;

/* loaded from: classes10.dex */
public final class f0 {

    /* renamed from: d, reason: collision with root package name */
    public static final xs2.e0 f537855d = new xs2.e0(null);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f537856e = jz5.h.b(xs2.b0.f537841d);

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f537857f = jz5.h.b(xs2.c0.f537844d);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f537858g = jz5.h.b(xs2.d0.f537846d);

    /* renamed from: a, reason: collision with root package name */
    public final xp.e f537859a;

    /* renamed from: b, reason: collision with root package name */
    public final xs2.n f537860b;

    /* renamed from: c, reason: collision with root package name */
    public final xp.a f537861c;

    public f0(xp.e danmakuCreator, xs2.n renderCreator, xp.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(danmakuCreator, "danmakuCreator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderCreator, "renderCreator");
        this.f537859a = danmakuCreator;
        this.f537860b = renderCreator;
        this.f537861c = aVar;
    }

    public final int a(boolean z17, float f17) {
        int i17 = 0;
        xp.a aVar = this.f537861c;
        int i18 = (aVar != null ? aVar.f537338c : 0) != 0 ? aVar != null ? aVar.f537338c : 0 : 6500;
        if ((aVar != null ? aVar.f537339d : 0) == 0) {
            i17 = 12000;
        } else if (aVar != null) {
            i17 = aVar.f537339d;
        }
        float f18 = z17 ? i18 : i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        return (int) ((f18 * ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209265h8).mo141623x754a37bb()).r()).floatValue()) / f17);
    }

    /* renamed from: equals */
    public boolean m175871xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof xs2.f0)) {
            return false;
        }
        xs2.f0 f0Var = (xs2.f0) obj;
        return this.f537860b.hashCode() == f0Var.f537860b.hashCode() && this.f537859a.hashCode() == f0Var.f537859a.hashCode() && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f537861c, f0Var.f537861c);
    }

    /* renamed from: hashCode */
    public int m175872x8cdac1b() {
        int hashCode = ((this.f537859a.hashCode() * 31) + this.f537860b.hashCode()) * 31;
        xp.a aVar = this.f537861c;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m175873x9616526c() {
        return "LiveDanmakuConfig(danmakuCreator=" + this.f537859a + ", renderCreator=" + this.f537860b + ", customConfig=" + this.f537861c + ')';
    }
}
