package com.p314xaae8f345.mm.p2615x3a3fddcb.p2616x34628f;

/* loaded from: classes14.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f275053d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f275054e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f275055f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(java.lang.String str, yz5.a aVar, boolean z17) {
        super(3);
        this.f275053d = str;
        this.f275054e = aVar;
        this.f275055f = z17;
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
        u5.s a17 = q85.d.a(this.f275053d, oVar, 0);
        int i17 = s1.p.f483587a;
        s1.p pVar = s1.o.f483577a;
        int i18 = z0.t.f550455q1;
        z0.p pVar2 = z0.p.f550454d;
        a0.q1.a(a17, "image", a0.d0.d(d0.a3.e(pVar2, 0.0f, 1, null), false, null, null, this.f275054e, 7, null), null, pVar, 0.0f, null, oVar, 24624, 104);
        if (this.f275055f) {
            h1.c d17 = rz0.a.d(com.p314xaae8f345.mm.R.raw.f81043x73ab7191, oVar, 0);
            int i19 = z0.d.f550436a;
            a0.q1.a(d17, "play button", MediaContent.a(pVar2, z0.a.f550426e), null, null, 0.0f, null, oVar, 56, 120);
        }
        return jz5.f0.f384359a;
    }
}
