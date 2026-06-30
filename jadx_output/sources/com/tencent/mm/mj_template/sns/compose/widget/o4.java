package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes14.dex */
public final class o4 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f70134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f70135e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f70136f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f70137g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(yz5.p pVar, float f17, float f18, long j17) {
        super(2);
        this.f70134d = pVar;
        this.f70135e = f17;
        this.f70136f = f18;
        this.f70137g = j17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        java.lang.Object obj3 = n0.e1.f333492a;
        this.f70134d.invoke(oVar, 0);
        float f17 = this.f70135e;
        if (f17 >= 0.0f && f17 < 100.0f) {
            com.tencent.mm.mj_template.sns.compose.widget.a7.i(f17, i0.h.a(this.f70136f), this.f70137g, null, oVar, 0, 8);
        }
        return jz5.f0.f302826a;
    }
}
