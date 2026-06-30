package com.p314xaae8f345.mm.p2615x3a3fddcb.p2616x34628f;

/* loaded from: classes14.dex */
public final class h0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f275015d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q85.g f275016e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f275017f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(yz5.a aVar, q85.g gVar, n0.e5 e5Var) {
        super(3);
        this.f275015d = aVar;
        this.f275016e = gVar;
        this.f275017f = e5Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        d0.z MediaContent = (d0.z) obj;
        n0.o oVar = (n0.o) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(MediaContent, "$this$MediaContent");
        if ((intValue & 14) == 0) {
            intValue |= ((n0.y0) oVar).e(MediaContent) ? 4 : 2;
        }
        if ((intValue & 91) == 18) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f384359a;
            }
        }
        java.lang.Object obj4 = n0.e1.f415025a;
        z0.p pVar = z0.p.f550454d;
        q85.k.a(a0.d0.d(d0.a3.g(pVar, i65.a.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, i65.a.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.aa9))), false, null, null, this.f275015d, 7, null), this.f275016e, oVar, 64, 0);
        if (!((java.lang.Boolean) this.f275017f.mo128745x754a37bb()).booleanValue()) {
            a0.q1.a(rz0.a.d(com.p314xaae8f345.mm.R.raw.f81043x73ab7191, oVar, 0), "play video", MediaContent.a(pVar, z0.a.f550426e), null, null, 0.0f, null, oVar, 56, 120);
        }
        return jz5.f0.f384359a;
    }
}
