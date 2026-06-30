package l0;

/* loaded from: classes14.dex */
public final class l4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f395907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0.k f395908e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(float f17, a0.k kVar) {
        super(1);
        this.f395907d = f17;
        this.f395908e = kVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        g1.f drawWithContent = (g1.f) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawWithContent, "$this$drawWithContent");
        u1.o0 o0Var = (u1.o0) drawWithContent;
        o0Var.b();
        float f17 = this.f395907d;
        if (!p2.h.a(f17, 0.0f)) {
            float mo7005x9a59d0b2 = f17 * o0Var.mo7005x9a59d0b2();
            float b17 = d1.k.b(o0Var.a()) - (mo7005x9a59d0b2 / 2);
            g1.h.e(drawWithContent, this.f395908e.f81726b, d1.f.a(0.0f, b17), d1.f.a(d1.k.d(o0Var.a()), b17), mo7005x9a59d0b2, 0, null, 0.0f, null, 0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.e0.f34847x366c91de, null);
        }
        return jz5.f0.f384359a;
    }
}
